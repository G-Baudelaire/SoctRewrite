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
        public ArrayList<PrintStatement> printStatements;

        ComputeRecord() {
            sends = new ArrayList<>();
            receives = new ArrayList<>();
            printStatements = new ArrayList<>();
        }

    }

    public void execute() {
        // TODO: Optimise this method and utilise parallelism.
        ComputeRecord computeRecord = new ComputeRecord();
        sortStatementValues(computeRecord);


        for (PrintStatement printStatement : computeRecord.printStatements) {
            System.out.println(printStatement.getString());
        }

        for (int sendIndex = 0; sendIndex < computeRecord.sends.size(); sendIndex++) {
            Send send = computeRecord.sends.get(sendIndex);
            if (!send.isMatching()) continue;
            for (int receiveIndex = 0; receiveIndex < computeRecord.receives.size(); receiveIndex++) {
                Receive receive = computeRecord.receives.get(receiveIndex);
                if (!receive.isMatching()) continue;
                if (receive.isSameChannelAndObjectSize(send)) {
                    boolean attemptSuccess = attemptCommunication(computeRecord,receive,send);

                    if (attemptSuccess){
                        computeRecord.sends.remove(send);
                        computeRecord.receives.remove(receive);
                        sendIndex = -1;
                        break;
                    }
                }
            }
        }
        statementValues = new ArrayList<>();
        statementValues.addAll(computeRecord.sends);
        statementValues.addAll(computeRecord.receives);
    }
    private boolean attemptCommunication(ComputeRecord computeRecord, Receive receive, Send send){
        EquivalenceClasses equivalenceClasses = new EquivalenceClasses();
        EquivalenceClasses.CommunicationRecord communicationRecord =
                equivalenceClasses.checkCommunicationForScope(receive.getSoloObjects(), send.getSoloObjects());
        if (!communicationRecord.isCommunicationPossible){
            return  false;
        }
        performSubstitutions(communicationRecord, computeRecord);
        return true;
    }

    private void performSubstitutions(EquivalenceClasses.CommunicationRecord communicationRecord, ComputeRecord computeRecord){
        for (int i = 0; i < communicationRecord.rangeChannels.size(); i++) {

            for (int j = 0; j < computeRecord.sends.size(); j++) {
                Send send = computeRecord.sends.get(j);
                send.substitution(communicationRecord.rangeChannels.get(i), communicationRecord.equivalenceSets.get(i));
            }

            for (int j = 0; j < computeRecord.receives.size(); j++) {
                Receive receive = computeRecord.receives.get(j);
                receive.substitution(communicationRecord.rangeChannels.get(i), communicationRecord.equivalenceSets.get(i));
            }
        }
    }

    private void sortStatementValues(ComputeRecord computeRecord) {
        for (StatementValue value : statementValues) {
            if (value.getClass() == Send.class) {
                computeRecord.sends.add((Send) value);
            } else if (value.getClass() == Receive.class) {
                computeRecord.receives.add((Receive) value);
            } else {
                computeRecord.printStatements.add((PrintStatement) value);
            }
        }
    }
}