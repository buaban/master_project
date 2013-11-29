// $ANTLR 3.x C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g 2013-11-24 00:11:03

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class TestNestingFunctionExpressionLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public TestNestingFunctionExpressionLexer() {} 
	public TestNestingFunctionExpressionLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public TestNestingFunctionExpressionLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g"; }

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:2:7: ( 'end' )
			// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:2:9: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:3:7: ( 'test' )
			// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:3:9: 'test'
			{
			match("test"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:4:7: ( 'xxx' )
			// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:4:9: 'xxx'
			{
			match("xxx"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "LF"
	public final void mLF() throws RecognitionException {
		try {
			// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:5:2: ( '\\n' )
			// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:5:4: '\\n'
			{
			match('\n'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LF"

	// $ANTLR start "CR"
	public final void mCR() throws RecognitionException {
		try {
			// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:9:2: ( '\\r' )
			// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:9:4: '\\r'
			{
			match('\r'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CR"

	// $ANTLR start "LS"
	public final void mLS() throws RecognitionException {
		try {
			// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:13:2: ( '\\u2028' )
			// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:13:4: '\\u2028'
			{
			match('\u2028'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LS"

	// $ANTLR start "PS"
	public final void mPS() throws RecognitionException {
		try {
			// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:17:2: ( '\\u2029' )
			// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:17:4: '\\u2029'
			{
			match('\u2029'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PS"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:20:5: ( 'a' .. 'z' | 'A' .. 'Z' )
			// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "EOL"
	public final void mEOL() throws RecognitionException {
		try {
			int _type = EOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:23:2: ( ( ( CR ( LF )? ) | LF | LS | PS ) )
			// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:23:4: ( ( CR ( LF )? ) | LF | LS | PS )
			{
			// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:23:4: ( ( CR ( LF )? ) | LF | LS | PS )
			int alt2=4;
			switch ( input.LA(1) ) {
			case '\r':
				{
				alt2=1;
				}
				break;
			case '\n':
				{
				alt2=2;
				}
				break;
			case '\u2028':
				{
				alt2=3;
				}
				break;
			case '\u2029':
				{
				alt2=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:23:6: ( CR ( LF )? )
					{
					// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:23:6: ( CR ( LF )? )
					// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:23:8: CR ( LF )?
					{
					mCR(); 

					// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:23:11: ( LF )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0=='\n') ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:
							{
							if ( input.LA(1)=='\n' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}

					}
					break;
				case 2 :
					// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:23:19: LF
					{
					mLF(); 

					}
					break;
				case 3 :
					// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:23:24: LS
					{
					mLS(); 

					}
					break;
				case 4 :
					// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:23:29: PS
					{
					mPS(); 

					}
					break;

			}

			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EOL"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:1:8: ( T__10 | T__11 | T__12 | ID | EOL )
		int alt3=5;
		switch ( input.LA(1) ) {
		case 'e':
			{
			int LA3_1 = input.LA(2);
			if ( (LA3_1=='n') ) {
				alt3=1;
			}
			else {
				alt3=4;
			}
			}
			break;
		case 't':
			{
			int LA3_2 = input.LA(2);
			if ( (LA3_2=='e') ) {
				alt3=2;
			}
			else {
				alt3=4;
			}
			}
			break;
		case 'x':
			{
			int LA3_3 = input.LA(2);
			if ( (LA3_3=='x') ) {
				alt3=3;
			}
			else {
				alt3=4;
			}
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 'u':
		case 'v':
		case 'w':
		case 'y':
		case 'z':
			{
			alt3=4;
			}
			break;
		case '\n':
		case '\r':
		case '\u2028':
		case '\u2029':
			{
			alt3=5;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 3, 0, input);
			throw nvae;
		}
		switch (alt3) {
			case 1 :
				// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:1:10: T__10
				{
				mT__10(); 

				}
				break;
			case 2 :
				// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:1:16: T__11
				{
				mT__11(); 

				}
				break;
			case 3 :
				// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:1:22: T__12
				{
				mT__12(); 

				}
				break;
			case 4 :
				// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:1:28: ID
				{
				mID(); 

				}
				break;
			case 5 :
				// C:\\Users\\pannawat.janthong\\Desktop\\testGrammar\\TestNestingFunctionExpression.g:1:31: EOL
				{
				mEOL(); 

				}
				break;

		}
	}



}
