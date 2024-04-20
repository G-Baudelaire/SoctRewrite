// Generated from D:/Users/Germain Jones/IdeaProjects/Soct/src/Soct.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SoctParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, RUN=2, BIND=3, COMPOSITION=4, SEND=5, REPLICATED_RECEIVE=6, RECEIVE=7, 
		COMMA=8, LPAREN=9, RPAREN=10, LBRACKET=11, RBRACKET=12, CHANNEL=13;
	public static final int
		RULE_program = 0, RULE_expressions = 1, RULE_statement = 2, RULE_expression = 3, 
		RULE_inaction = 4, RULE_soloObjects = 5, RULE_solo = 6, RULE_agent = 7, 
		RULE_innerList = 8, RULE_channelList = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expressions", "statement", "expression", "inaction", "soloObjects", 
			"solo", "agent", "innerList", "channelList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'run'", "'bind'", "'|'", "'!'", "'?*'", "'?'", "','", "'('", 
			"')'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "RUN", "BIND", "COMPOSITION", "SEND", "REPLICATED_RECEIVE", 
			"RECEIVE", "COMMA", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "CHANNEL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Soct.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SoctParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SoctParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoctListener ) ((SoctListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoctListener ) ((SoctListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoctVisitor ) return ((SoctVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			expressions(0);
			setState(21);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoctListener ) ((SoctListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoctListener ) ((SoctListener)listener).exitExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoctVisitor ) return ((SoctVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		return expressions(0);
	}

	private ExpressionsContext expressions(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, _parentState);
		ExpressionsContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expressions, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(24);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(30);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressions);
					setState(26);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(27);
					statement();
					}
					} 
				}
				setState(32);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode RUN() { return getToken(SoctParser.RUN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoctListener ) ((SoctListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoctListener ) ((SoctListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoctVisitor ) return ((SoctVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(RUN);
			setState(34);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SoctParser.LPAREN, 0); }
		public AgentContext agent() {
			return getRuleContext(AgentContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SoctParser.RPAREN, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoctListener ) ((SoctListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoctListener ) ((SoctListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoctVisitor ) return ((SoctVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(LPAREN);
			setState(37);
			agent(0);
			setState(38);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InactionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SoctParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SoctParser.RPAREN, 0); }
		public InactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inaction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoctListener ) ((SoctListener)listener).enterInaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoctListener ) ((SoctListener)listener).exitInaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoctVisitor ) return ((SoctVisitor<? extends T>)visitor).visitInaction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InactionContext inaction() throws RecognitionException {
		InactionContext _localctx = new InactionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_inaction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(LPAREN);
			setState(41);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SoloObjectsContext extends ParserRuleContext {
		public ChannelListContext channelList() {
			return getRuleContext(ChannelListContext.class,0);
		}
		public TerminalNode CHANNEL() { return getToken(SoctParser.CHANNEL, 0); }
		public SoloObjectsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soloObjects; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoctListener ) ((SoctListener)listener).enterSoloObjects(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoctListener ) ((SoctListener)listener).exitSoloObjects(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoctVisitor ) return ((SoctVisitor<? extends T>)visitor).visitSoloObjects(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoloObjectsContext soloObjects() throws RecognitionException {
		SoloObjectsContext _localctx = new SoloObjectsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_soloObjects);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				channelList();
				}
				break;
			case CHANNEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(CHANNEL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SoloContext extends ParserRuleContext {
		public TerminalNode CHANNEL() { return getToken(SoctParser.CHANNEL, 0); }
		public SoloObjectsContext soloObjects() {
			return getRuleContext(SoloObjectsContext.class,0);
		}
		public TerminalNode SEND() { return getToken(SoctParser.SEND, 0); }
		public TerminalNode RECEIVE() { return getToken(SoctParser.RECEIVE, 0); }
		public TerminalNode REPLICATED_RECEIVE() { return getToken(SoctParser.REPLICATED_RECEIVE, 0); }
		public SoloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_solo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoctListener ) ((SoctListener)listener).enterSolo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoctListener ) ((SoctListener)listener).exitSolo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoctVisitor ) return ((SoctVisitor<? extends T>)visitor).visitSolo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoloContext solo() throws RecognitionException {
		SoloContext _localctx = new SoloContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_solo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(CHANNEL);
			setState(48);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(49);
			soloObjects();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AgentContext extends ParserRuleContext {
		public InactionContext inaction() {
			return getRuleContext(InactionContext.class,0);
		}
		public SoloContext solo() {
			return getRuleContext(SoloContext.class,0);
		}
		public TerminalNode BIND() { return getToken(SoctParser.BIND, 0); }
		public ChannelListContext channelList() {
			return getRuleContext(ChannelListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<AgentContext> agent() {
			return getRuleContexts(AgentContext.class);
		}
		public AgentContext agent(int i) {
			return getRuleContext(AgentContext.class,i);
		}
		public TerminalNode COMPOSITION() { return getToken(SoctParser.COMPOSITION, 0); }
		public AgentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoctListener ) ((SoctListener)listener).enterAgent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoctListener ) ((SoctListener)listener).exitAgent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoctVisitor ) return ((SoctVisitor<? extends T>)visitor).visitAgent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AgentContext agent() throws RecognitionException {
		return agent(0);
	}

	private AgentContext agent(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AgentContext _localctx = new AgentContext(_ctx, _parentState);
		AgentContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_agent, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(52);
				inaction();
				}
				break;
			case CHANNEL:
				{
				setState(53);
				solo();
				}
				break;
			case BIND:
				{
				setState(54);
				match(BIND);
				setState(55);
				channelList();
				setState(56);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AgentContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_agent);
					setState(60);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(61);
					match(COMPOSITION);
					setState(62);
					agent(3);
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InnerListContext extends ParserRuleContext {
		public TerminalNode CHANNEL() { return getToken(SoctParser.CHANNEL, 0); }
		public InnerListContext innerList() {
			return getRuleContext(InnerListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SoctParser.COMMA, 0); }
		public InnerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoctListener ) ((SoctListener)listener).enterInnerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoctListener ) ((SoctListener)listener).exitInnerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoctVisitor ) return ((SoctVisitor<? extends T>)visitor).visitInnerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerListContext innerList() throws RecognitionException {
		return innerList(0);
	}

	private InnerListContext innerList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InnerListContext _localctx = new InnerListContext(_ctx, _parentState);
		InnerListContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_innerList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(69);
			match(CHANNEL);
			}
			_ctx.stop = _input.LT(-1);
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InnerListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_innerList);
					setState(71);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(72);
					match(COMMA);
					setState(73);
					match(CHANNEL);
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChannelListContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(SoctParser.LBRACKET, 0); }
		public InnerListContext innerList() {
			return getRuleContext(InnerListContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(SoctParser.RBRACKET, 0); }
		public ChannelListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_channelList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoctListener ) ((SoctListener)listener).enterChannelList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoctListener ) ((SoctListener)listener).exitChannelList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoctVisitor ) return ((SoctVisitor<? extends T>)visitor).visitChannelList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChannelListContext channelList() throws RecognitionException {
		ChannelListContext _localctx = new ChannelListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_channelList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(LBRACKET);
			setState(80);
			innerList(0);
			setState(81);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expressions_sempred((ExpressionsContext)_localctx, predIndex);
		case 7:
			return agent_sempred((AgentContext)_localctx, predIndex);
		case 8:
			return innerList_sempred((InnerListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressions_sempred(ExpressionsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean agent_sempred(AgentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean innerList_sempred(InnerListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\rT\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001d\b\u0001"+
		"\n\u0001\f\u0001 \t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0003\u0005.\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007;\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007@\b\u0007\n\u0007\f\u0007C\t\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bK\b\b\n\b\f\b"+
		"N\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0000\u0003\u0002\u000e"+
		"\u0010\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0001\u0001"+
		"\u0000\u0005\u0007O\u0000\u0014\u0001\u0000\u0000\u0000\u0002\u0017\u0001"+
		"\u0000\u0000\u0000\u0004!\u0001\u0000\u0000\u0000\u0006$\u0001\u0000\u0000"+
		"\u0000\b(\u0001\u0000\u0000\u0000\n-\u0001\u0000\u0000\u0000\f/\u0001"+
		"\u0000\u0000\u0000\u000e:\u0001\u0000\u0000\u0000\u0010D\u0001\u0000\u0000"+
		"\u0000\u0012O\u0001\u0000\u0000\u0000\u0014\u0015\u0003\u0002\u0001\u0000"+
		"\u0015\u0016\u0005\u0000\u0000\u0001\u0016\u0001\u0001\u0000\u0000\u0000"+
		"\u0017\u0018\u0006\u0001\uffff\uffff\u0000\u0018\u0019\u0003\u0004\u0002"+
		"\u0000\u0019\u001e\u0001\u0000\u0000\u0000\u001a\u001b\n\u0001\u0000\u0000"+
		"\u001b\u001d\u0003\u0004\u0002\u0000\u001c\u001a\u0001\u0000\u0000\u0000"+
		"\u001d \u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e"+
		"\u001f\u0001\u0000\u0000\u0000\u001f\u0003\u0001\u0000\u0000\u0000 \u001e"+
		"\u0001\u0000\u0000\u0000!\"\u0005\u0002\u0000\u0000\"#\u0003\u0006\u0003"+
		"\u0000#\u0005\u0001\u0000\u0000\u0000$%\u0005\t\u0000\u0000%&\u0003\u000e"+
		"\u0007\u0000&\'\u0005\n\u0000\u0000\'\u0007\u0001\u0000\u0000\u0000()"+
		"\u0005\t\u0000\u0000)*\u0005\n\u0000\u0000*\t\u0001\u0000\u0000\u0000"+
		"+.\u0003\u0012\t\u0000,.\u0005\r\u0000\u0000-+\u0001\u0000\u0000\u0000"+
		"-,\u0001\u0000\u0000\u0000.\u000b\u0001\u0000\u0000\u0000/0\u0005\r\u0000"+
		"\u000001\u0007\u0000\u0000\u000012\u0003\n\u0005\u00002\r\u0001\u0000"+
		"\u0000\u000034\u0006\u0007\uffff\uffff\u00004;\u0003\b\u0004\u00005;\u0003"+
		"\f\u0006\u000067\u0005\u0003\u0000\u000078\u0003\u0012\t\u000089\u0003"+
		"\u0006\u0003\u00009;\u0001\u0000\u0000\u0000:3\u0001\u0000\u0000\u0000"+
		":5\u0001\u0000\u0000\u0000:6\u0001\u0000\u0000\u0000;A\u0001\u0000\u0000"+
		"\u0000<=\n\u0002\u0000\u0000=>\u0005\u0004\u0000\u0000>@\u0003\u000e\u0007"+
		"\u0003?<\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000"+
		"\u0000\u0000AB\u0001\u0000\u0000\u0000B\u000f\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000DE\u0006\b\uffff\uffff\u0000EF\u0005\r\u0000"+
		"\u0000FL\u0001\u0000\u0000\u0000GH\n\u0001\u0000\u0000HI\u0005\b\u0000"+
		"\u0000IK\u0005\r\u0000\u0000JG\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\u0011\u0001"+
		"\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OP\u0005\u000b\u0000\u0000"+
		"PQ\u0003\u0010\b\u0000QR\u0005\f\u0000\u0000R\u0013\u0001\u0000\u0000"+
		"\u0000\u0005\u001e-:AL";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}