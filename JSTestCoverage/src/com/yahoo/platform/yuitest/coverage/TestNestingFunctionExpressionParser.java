// $ANTLR 3.x C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g 2013-11-24 00:11:03

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class TestNestingFunctionExpressionParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CR", "EOL", "ID", "LF", "LS", "PS", "'end'", "'test'", "'xxx'"
	};

	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int CR=4;
	public static final int EOL=5;
	public static final int ID=6;
	public static final int LF=7;
	public static final int LS=8;
	public static final int PS=9;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


public static final String[] ruleNames = new String[] {
	"invalidRule", "functionExpression", "functionExPart"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
	false, // invalid decision
	false, false, false
};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public TestNestingFunctionExpressionParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public TestNestingFunctionExpressionParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

public TestNestingFunctionExpressionParser(TokenStream input, DebugEventListener dbg) {
	super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
	dbg.semanticPredicate(result, predicate);
	return result;
}

	@Override public String[] getTokenNames() { return TestNestingFunctionExpressionParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g"; }



	// $ANTLR start "functionExpression"
	// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:26:1: functionExpression : ( 'test' ( ID )* 'end' EOF | 'test' ( ID )* functionExPart 'end' EOF | 'test' functionExpression 'end' EOL );
	public final void functionExpression() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "functionExpression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(26, 0);

		try {
			// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:27:2: ( 'test' ( ID )* 'end' EOF | 'test' ( ID )* functionExPart 'end' EOF | 'test' functionExpression 'end' EOL )
			int alt3=3;
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			try {
				isCyclicDecision = true;
				alt3 = dfa3.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:27:4: 'test' ( ID )* 'end' EOF
					{
					dbg.location(27,4);
					match(input,11,FOLLOW_11_in_functionExpression121); dbg.location(27,11);
					// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:27:11: ( ID )*
					try { dbg.enterSubRule(1);

					loop1:
					do {
						int alt1=2;
						try { dbg.enterDecision(1, decisionCanBacktrack[1]);

						int LA1_0 = input.LA(1);
						if ( (LA1_0==ID) ) {
							alt1=1;
						}

						} finally {dbg.exitDecision(1);}

						switch (alt1) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:27:11: ID
							{
							dbg.location(27,11);
							match(input,ID,FOLLOW_ID_in_functionExpression123); 
							}
							break;

						default :
							break loop1;
						}
					} while (true);
					} finally {dbg.exitSubRule(1);}
					dbg.location(27,15);
					match(input,10,FOLLOW_10_in_functionExpression126); dbg.location(27,21);
					match(input,EOF,FOLLOW_EOF_in_functionExpression128); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:28:4: 'test' ( ID )* functionExPart 'end' EOF
					{
					dbg.location(28,4);
					match(input,11,FOLLOW_11_in_functionExpression133); dbg.location(28,11);
					// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:28:11: ( ID )*
					try { dbg.enterSubRule(2);

					loop2:
					do {
						int alt2=2;
						try { dbg.enterDecision(2, decisionCanBacktrack[2]);

						int LA2_0 = input.LA(1);
						if ( (LA2_0==ID) ) {
							alt2=1;
						}

						} finally {dbg.exitDecision(2);}

						switch (alt2) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:28:11: ID
							{
							dbg.location(28,11);
							match(input,ID,FOLLOW_ID_in_functionExpression135); 
							}
							break;

						default :
							break loop2;
						}
					} while (true);
					} finally {dbg.exitSubRule(2);}
					dbg.location(28,15);
					pushFollow(FOLLOW_functionExPart_in_functionExpression138);
					functionExPart();
					state._fsp--;
					dbg.location(28,30);
					match(input,10,FOLLOW_10_in_functionExpression140); dbg.location(28,36);
					match(input,EOF,FOLLOW_EOF_in_functionExpression142); 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:29:4: 'test' functionExpression 'end' EOL
					{
					dbg.location(29,4);
					match(input,11,FOLLOW_11_in_functionExpression147); dbg.location(29,11);
					pushFollow(FOLLOW_functionExpression_in_functionExpression149);
					functionExpression();
					state._fsp--;
					dbg.location(29,30);
					match(input,10,FOLLOW_10_in_functionExpression151); dbg.location(29,36);
					match(input,EOL,FOLLOW_EOL_in_functionExpression153); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(30, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "functionExpression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return ;
	}
	// $ANTLR end "functionExpression"



	// $ANTLR start "functionExPart"
	// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:32:1: functionExPart : 'xxx' ;
	public final void functionExPart() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "functionExPart");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(32, 0);

		try {
			// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:33:2: ( 'xxx' )
			dbg.enterAlt(1);

			// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:33:4: 'xxx'
			{
			dbg.location(33,4);
			match(input,12,FOLLOW_12_in_functionExPart165); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(34, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "functionExPart");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return ;
	}
	// $ANTLR end "functionExPart"

	// Delegated rules


	protected DFA3 dfa3 = new DFA3(this);
	static final String DFA3_eotS =
		"\6\uffff";
	static final String DFA3_eofS =
		"\6\uffff";
	static final String DFA3_minS =
		"\1\13\2\6\3\uffff";
	static final String DFA3_maxS =
		"\1\13\2\14\3\uffff";
	static final String DFA3_acceptS =
		"\3\uffff\1\1\1\2\1\3";
	static final String DFA3_specialS =
		"\6\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\1",
			"\1\2\3\uffff\1\3\1\5\1\4",
			"\1\2\3\uffff\1\3\1\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	class DFA3 extends DFA {

		public DFA3(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}
		@Override
		public String getDescription() {
			return "26:1: functionExpression : ( 'test' ( ID )* 'end' EOF | 'test' ( ID )* functionExPart 'end' EOF | 'test' functionExpression 'end' EOL );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	public static final BitSet FOLLOW_11_in_functionExpression121 = new BitSet(new long[]{0x0000000000000440L});
	public static final BitSet FOLLOW_ID_in_functionExpression123 = new BitSet(new long[]{0x0000000000000440L});
	public static final BitSet FOLLOW_10_in_functionExpression126 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_functionExpression128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_functionExpression133 = new BitSet(new long[]{0x0000000000001040L});
	public static final BitSet FOLLOW_ID_in_functionExpression135 = new BitSet(new long[]{0x0000000000001040L});
	public static final BitSet FOLLOW_functionExPart_in_functionExpression138 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_functionExpression140 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_functionExpression142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_functionExpression147 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_functionExpression_in_functionExpression149 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_functionExpression151 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOL_in_functionExpression153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_functionExPart165 = new BitSet(new long[]{0x0000000000000002L});
}
