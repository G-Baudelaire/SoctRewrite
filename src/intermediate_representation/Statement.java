package intermediate_representation;

import java.util.ArrayList;

public class Statement {
    private ArrayList<StatementValue> statementValues;

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "statementValues=" + statementValues +
                "}";
    }

    public Statement() {
        statementValues = new ArrayList<>();
    }

    public void addStatementValue(StatementValue statementValue) {
        statementValues.add(statementValue);
    }

    private class ComputeRecord {
        public ArrayList<Send> sends;
        public ArrayList<Receive> receives;
        public ArrayList<SoloObjects> soloObjects;

        ComputeRecord() {
            sends = new ArrayList<>();
            receives = new ArrayList<>();
            soloObjects = new ArrayList<>();
        }

    }

    public void execute() {
        // TODO: Optimise this method and utilise parallelism.
        ComputeRecord computeRecord = new ComputeRecord();
        sortStatementValues(computeRecord);

        for (int sendIndex = 0; sendIndex < computeRecord.sends.size(); sendIndex++) {
            Send send = computeRecord.sends.get(sendIndex);
            for (int receiveIndex = 0; receiveIndex < computeRecord.receives.size(); receiveIndex++) {
                Receive receive = computeRecord.receives.get(receiveIndex);
                if (receive.isCommunicable(send)){
                    computeRecord.soloObjects.add(send.getSoloObjects());
                    computeRecord.sends.remove(send);
                    sendIndex--;
                    // Don't remove it if it's a ReplicatedReceive
                    if (receive.getClass() == Receive.class){
                        computeRecord.receives.remove(receiveIndex);
                    }
                    break;
                }
            }
        }
        statementValues = new ArrayList<>();
        statementValues.addAll(computeRecord.sends);
        statementValues.addAll(computeRecord.receives);
        statementValues.addAll(computeRecord.soloObjects);
    }

    private void sortStatementValues(ComputeRecord computeRecord) {
        for (StatementValue value : statementValues) {
            if (value.getClass() == Send.class) {
                computeRecord.sends.add((Send) value);
            } else if (value.getClass() == Receive.class) {
                computeRecord.receives.add((Receive) value);
            } else if (value.getClass() == ReplicatedReceive.class) {
                computeRecord.receives.add((ReplicatedReceive) value);
            } else {
                computeRecord.soloObjects.add((SoloObjects) value);
            }
        }
    }
}