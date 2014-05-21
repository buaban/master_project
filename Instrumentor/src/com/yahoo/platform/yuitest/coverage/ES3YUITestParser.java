// $ANTLR 3.x D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g 2014-03-19 00:04:18

/*
 * YUI Test Coverage
 * Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 * Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 * Code licensed under the BSD License:
 *     http://developer.yahoo.net/yui/license.txt
 */
package com.yahoo.platform.yuitest.coverage;
import org.antlr.runtime.tree.Tree;
import java.util.Set;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.jscoverage.instrumentor.determineparam.DetermineParamType;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings("all")
public class ES3YUITestParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "ADD", "ADDASS", "AND", "ANDASS", "ARGS", "ARRAY", "ASSIGN", "BLOCK", "BOOLEAN", "BREAK", "BSLASH", "BYFIELD", "BYINDEX", "BYTE", "BackslashSequence", "CALL", "CASE", "CATCH", "CEXPR", "CHAR", "CLASS", "COLON", "COMMA", "CONST", "CONTINUE", "CR", "CharacterEscapeSequence", "DEBUGGER", "DEC", "DEFAULT", "DELETE", "DIV", "DIVASS", "DO", "DOT", "DOUBLE", "DQUOTE", "DecimalDigit", "DecimalIntegerLiteral", "DecimalLiteral", "ELSE", "ENUM", "EOL", "EQ", "EXPORT", "EXPR", "EXTENDS", "EscapeSequence", "ExponentPart", "FALSE", "FF", "FINAL", "FINALLY", "FLOAT", "FOR", "FORITER", "FORSTEP", "FUNCTION", "GOTO", "GT", "GTE", "HexDigit", "HexEscapeSequence", "HexIntegerLiteral", "IF", "IMPLEMENTS", "IMPORT", "IN", "INC", "INSTANCEOF", "INT", "INTERFACE", "INV", "ITEM", "Identifier", "IdentifierNameASCIIStart", "IdentifierPart", "IdentifierStartASCII", "LABELLED", "LAND", "LBRACE", "LBRACK", "LF", "LONG", "LOR", "LPAREN", "LS", "LT", "LTE", "LineTerminator", "MOD", "MODASS", "MUL", "MULASS", "MultiLineComment", "NAMEDVALUE", "NATIVE", "NBSP", "NEG", "NEQ", "NEW", "NOT", "NSAME", "NULL", "OBJECT", "OR", "ORASS", "OctalDigit", "OctalEscapeSequence", "OctalIntegerLiteral", "PACKAGE", "PAREXPR", "PDEC", "PINC", "POS", "PRIVATE", "PROTECTED", "PS", "PUBLIC", "QUE", "RBRACE", "RBRACK", "RETURN", "RPAREN", "RegularExpressionChar", "RegularExpressionFirstChar", "RegularExpressionLiteral", "SAME", "SEMIC", "SHL", "SHLASS", "SHORT", "SHR", "SHRASS", "SHU", "SHUASS", "SP", "SQUOTE", "STATIC", "SUB", "SUBASS", "SUPER", "SWITCH", "SYNCHRONIZED", "SingleLineComment", "StringLiteral", "TAB", "THIS", "THROW", "THROWS", "TRANSIENT", "TRUE", "TRY", "TYPEOF", "USP", "UnicodeEscapeSequence", "VAR", "VOID", "VOLATILE", "VT", "WHILE", "WITH", "WhiteSpace", "XOR", "XORASS", "ZeroToThree"
	};

	public static final int EOF=-1;
	public static final int ABSTRACT=4;
	public static final int ADD=5;
	public static final int ADDASS=6;
	public static final int AND=7;
	public static final int ANDASS=8;
	public static final int ARGS=9;
	public static final int ARRAY=10;
	public static final int ASSIGN=11;
	public static final int BLOCK=12;
	public static final int BOOLEAN=13;
	public static final int BREAK=14;
	public static final int BSLASH=15;
	public static final int BYFIELD=16;
	public static final int BYINDEX=17;
	public static final int BYTE=18;
	public static final int BackslashSequence=19;
	public static final int CALL=20;
	public static final int CASE=21;
	public static final int CATCH=22;
	public static final int CEXPR=23;
	public static final int CHAR=24;
	public static final int CLASS=25;
	public static final int COLON=26;
	public static final int COMMA=27;
	public static final int CONST=28;
	public static final int CONTINUE=29;
	public static final int CR=30;
	public static final int CharacterEscapeSequence=31;
	public static final int DEBUGGER=32;
	public static final int DEC=33;
	public static final int DEFAULT=34;
	public static final int DELETE=35;
	public static final int DIV=36;
	public static final int DIVASS=37;
	public static final int DO=38;
	public static final int DOT=39;
	public static final int DOUBLE=40;
	public static final int DQUOTE=41;
	public static final int DecimalDigit=42;
	public static final int DecimalIntegerLiteral=43;
	public static final int DecimalLiteral=44;
	public static final int ELSE=45;
	public static final int ENUM=46;
	public static final int EOL=47;
	public static final int EQ=48;
	public static final int EXPORT=49;
	public static final int EXPR=50;
	public static final int EXTENDS=51;
	public static final int EscapeSequence=52;
	public static final int ExponentPart=53;
	public static final int FALSE=54;
	public static final int FF=55;
	public static final int FINAL=56;
	public static final int FINALLY=57;
	public static final int FLOAT=58;
	public static final int FOR=59;
	public static final int FORITER=60;
	public static final int FORSTEP=61;
	public static final int FUNCTION=62;
	public static final int GOTO=63;
	public static final int GT=64;
	public static final int GTE=65;
	public static final int HexDigit=66;
	public static final int HexEscapeSequence=67;
	public static final int HexIntegerLiteral=68;
	public static final int IF=69;
	public static final int IMPLEMENTS=70;
	public static final int IMPORT=71;
	public static final int IN=72;
	public static final int INC=73;
	public static final int INSTANCEOF=74;
	public static final int INT=75;
	public static final int INTERFACE=76;
	public static final int INV=77;
	public static final int ITEM=78;
	public static final int Identifier=79;
	public static final int IdentifierNameASCIIStart=80;
	public static final int IdentifierPart=81;
	public static final int IdentifierStartASCII=82;
	public static final int LABELLED=83;
	public static final int LAND=84;
	public static final int LBRACE=85;
	public static final int LBRACK=86;
	public static final int LF=87;
	public static final int LONG=88;
	public static final int LOR=89;
	public static final int LPAREN=90;
	public static final int LS=91;
	public static final int LT=92;
	public static final int LTE=93;
	public static final int LineTerminator=94;
	public static final int MOD=95;
	public static final int MODASS=96;
	public static final int MUL=97;
	public static final int MULASS=98;
	public static final int MultiLineComment=99;
	public static final int NAMEDVALUE=100;
	public static final int NATIVE=101;
	public static final int NBSP=102;
	public static final int NEG=103;
	public static final int NEQ=104;
	public static final int NEW=105;
	public static final int NOT=106;
	public static final int NSAME=107;
	public static final int NULL=108;
	public static final int OBJECT=109;
	public static final int OR=110;
	public static final int ORASS=111;
	public static final int OctalDigit=112;
	public static final int OctalEscapeSequence=113;
	public static final int OctalIntegerLiteral=114;
	public static final int PACKAGE=115;
	public static final int PAREXPR=116;
	public static final int PDEC=117;
	public static final int PINC=118;
	public static final int POS=119;
	public static final int PRIVATE=120;
	public static final int PROTECTED=121;
	public static final int PS=122;
	public static final int PUBLIC=123;
	public static final int QUE=124;
	public static final int RBRACE=125;
	public static final int RBRACK=126;
	public static final int RETURN=127;
	public static final int RPAREN=128;
	public static final int RegularExpressionChar=129;
	public static final int RegularExpressionFirstChar=130;
	public static final int RegularExpressionLiteral=131;
	public static final int SAME=132;
	public static final int SEMIC=133;
	public static final int SHL=134;
	public static final int SHLASS=135;
	public static final int SHORT=136;
	public static final int SHR=137;
	public static final int SHRASS=138;
	public static final int SHU=139;
	public static final int SHUASS=140;
	public static final int SP=141;
	public static final int SQUOTE=142;
	public static final int STATIC=143;
	public static final int SUB=144;
	public static final int SUBASS=145;
	public static final int SUPER=146;
	public static final int SWITCH=147;
	public static final int SYNCHRONIZED=148;
	public static final int SingleLineComment=149;
	public static final int StringLiteral=150;
	public static final int TAB=151;
	public static final int THIS=152;
	public static final int THROW=153;
	public static final int THROWS=154;
	public static final int TRANSIENT=155;
	public static final int TRUE=156;
	public static final int TRY=157;
	public static final int TYPEOF=158;
	public static final int USP=159;
	public static final int UnicodeEscapeSequence=160;
	public static final int VAR=161;
	public static final int VOID=162;
	public static final int VOLATILE=163;
	public static final int VT=164;
	public static final int WHILE=165;
	public static final int WITH=166;
	public static final int WhiteSpace=167;
	public static final int XOR=168;
	public static final int XORASS=169;
	public static final int ZeroToThree=170;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ES3YUITestParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ES3YUITestParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[350+1];
		 

	}

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("ES3YUITestParserTemplates", AngleBracketTemplateLexer.class);

public void setTemplateLib(StringTemplateGroup templateLib) {
  this.templateLib = templateLib;
}
public StringTemplateGroup getTemplateLib() {
  return templateLib;
}
/** allows convenient multi-value initialization:
 *  "new STAttrMap().put(...).put(...)"
 */
@SuppressWarnings("serial")
public static class STAttrMap extends HashMap<String, Object> {
	public STAttrMap put(String attrName, Object value) {
		super.put(attrName, value);
		return this;
	}
}
	@Override public String[] getTokenNames() { return ES3YUITestParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g"; }



	private boolean verbose = false;

	public void setVerbose(boolean newVerbose){
	    verbose = newVerbose;
	}

	private final boolean isLeftHandSideAssign(RuleReturnScope lhs, Object[] cached)
	{
		if (cached[0] != null)
		{
			return ((Boolean)cached[0]).booleanValue();
		}
		
		boolean result;
		if (isLeftHandSideExpression(lhs))
		{
			switch (input.LA(1))
			{
				case ASSIGN:
				case MULASS:
				case DIVASS:
				case MODASS:
				case ADDASS:
				case SUBASS:
				case SHLASS:
				case SHRASS:
				case SHUASS:
				case ANDASS:
				case XORASS:
				case ORASS:
					result = true;
					break;
				default:
					result = false;
					break;
			}
		}
		else
		{
			result = false;
		}
		
		cached[0] = new Boolean(result);
		return result;
	}

	@SuppressWarnings("unused")

	private final String wrapInBraces(Token start, Token stop, TokenStream tokens) {
	  if (start == null || stop == null) {    
	    return null;
	  }
	  if ("{".equals(start.getText())) {
	    return tokens.toString(start, stop);
	  }
	  
	  if (verbose){
	    System.err.println("\n[INFO] Adding braces around statement at line " + start.getLine());
	  }
	  return "{" + tokens.toString(start, stop) + "}";
	}

	private final static String toObjectLiteral(List list, boolean numbers){
	    StringBuilder builder = new StringBuilder();
	    builder.append("{");
	    for (int i=0; i < list.size(); i++){

	        if (i > 0){
	            builder.append(",");
	        }

	        if (numbers){
	            builder.append('"');
	            builder.append(list.get(i));
	            builder.append("\":0");
	        } else {
	            builder.append(list.get(i));
	            builder.append(":0");
	        }
	    }
	    builder.append("}");
	    return builder.toString();
	}

	private final static boolean isLeftHandSideExpression(RuleReturnScope lhs)
	{
		if (lhs.getTree() == null) // e.g. during backtracking
		{
			return true;
		}
		else
		{
			switch (((Tree)lhs.getTree()).getType())
			{
			// primaryExpression
				case THIS:
				case Identifier:
				case NULL:
				case TRUE:
				case FALSE:
				case DecimalLiteral:
				case OctalIntegerLiteral:
				case HexIntegerLiteral:
				case StringLiteral:
				case RegularExpressionLiteral:
				case ARRAY:
				case OBJECT:
				case PAREXPR:
			// functionExpression
				case FUNCTION:
			// newExpression
				case NEW:
			// leftHandSideExpression
				case CALL:
				case BYFIELD:
				case BYINDEX:
					return true;
				
				default:
					return false;
			}
		}
	}
		
	private final boolean isLeftHandSideIn(RuleReturnScope lhs, Object[] cached)
	{
		if (cached[0] != null)
		{
			return ((Boolean)cached[0]).booleanValue();
		}
		
		boolean result = isLeftHandSideExpression(lhs) && (input.LA(1) == IN);
		cached[0] = new Boolean(result);
		return result;
	}

	private final void promoteEOL(ParserRuleReturnScope rule)
	{
		// Get current token and its type (the possibly offending token).
		Token lt = input.LT(1);
		int la = lt.getType();
		
		// We only need to promote an EOL when the current token is offending (not a SEMIC, EOF, RBRACE, EOL or MultiLineComment).
		// EOL and MultiLineComment are not offending as they're already promoted in a previous call to this method.
		// Promoting an EOL means switching it from off channel to on channel.
		// A MultiLineComment gets promoted when it contains an EOL.
		if (!(la == SEMIC || la == EOF || la == RBRACE || la == EOL || la == MultiLineComment))
		{
			// Start on the possition before the current token and scan backwards off channel tokens until the previous on channel token.
			for (int ix = lt.getTokenIndex() - 1; ix > 0; ix--)
			{
				lt = input.get(ix);
				if (lt.getChannel() == Token.DEFAULT_CHANNEL)
				{
					// On channel token found: stop scanning.
					break;
				}
				else if (lt.getType() == EOL || (lt.getType() == MultiLineComment && lt.getText().matches("/.*\r\n|\r|\n")))
				{
					// We found our EOL: promote the token to on channel, position the input on it and reset the rule start.
					lt.setChannel(Token.DEFAULT_CHANNEL);
					input.seek(lt.getTokenIndex());
					if (rule != null)
					{
						rule.start = lt;
					}
					break;
				}
			}
		}
	}	

	private final String determineParam(String params, String code, String funcName ){
		String typesList = "";
		DetermineParamType dp = new DetermineParamType(code,params);
		typesList = dp.determineTypes();

		return typesList;
	}



	public static class token_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "token"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:595:1: token : ( reservedWord | Identifier | punctuator | numericLiteral | StringLiteral );
	public final ES3YUITestParser.token_return token() throws RecognitionException {
		ES3YUITestParser.token_return retval = new ES3YUITestParser.token_return();
		retval.start = input.LT(1);
		int token_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:596:2: ( reservedWord | Identifier | punctuator | numericLiteral | StringLiteral )
			int alt1=5;
			switch ( input.LA(1) ) {
			case ABSTRACT:
			case BOOLEAN:
			case BREAK:
			case BYTE:
			case CASE:
			case CATCH:
			case CHAR:
			case CLASS:
			case CONST:
			case CONTINUE:
			case DEBUGGER:
			case DEFAULT:
			case DELETE:
			case DO:
			case DOUBLE:
			case ELSE:
			case ENUM:
			case EXPORT:
			case EXTENDS:
			case FALSE:
			case FINAL:
			case FINALLY:
			case FLOAT:
			case FOR:
			case FUNCTION:
			case GOTO:
			case IF:
			case IMPLEMENTS:
			case IMPORT:
			case IN:
			case INSTANCEOF:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case NEW:
			case NULL:
			case PACKAGE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case RETURN:
			case SHORT:
			case STATIC:
			case SUPER:
			case SWITCH:
			case SYNCHRONIZED:
			case THIS:
			case THROW:
			case THROWS:
			case TRANSIENT:
			case TRUE:
			case TRY:
			case TYPEOF:
			case VAR:
			case VOID:
			case VOLATILE:
			case WHILE:
			case WITH:
				{
				alt1=1;
				}
				break;
			case Identifier:
				{
				alt1=2;
				}
				break;
			case ADD:
			case ADDASS:
			case AND:
			case ANDASS:
			case ASSIGN:
			case COLON:
			case COMMA:
			case DEC:
			case DIV:
			case DIVASS:
			case DOT:
			case EQ:
			case GT:
			case GTE:
			case INC:
			case INV:
			case LAND:
			case LBRACE:
			case LBRACK:
			case LOR:
			case LPAREN:
			case LT:
			case LTE:
			case MOD:
			case MODASS:
			case MUL:
			case MULASS:
			case NEQ:
			case NOT:
			case NSAME:
			case OR:
			case ORASS:
			case QUE:
			case RBRACE:
			case RBRACK:
			case RPAREN:
			case SAME:
			case SEMIC:
			case SHL:
			case SHLASS:
			case SHR:
			case SHRASS:
			case SHU:
			case SHUASS:
			case SUB:
			case SUBASS:
			case XOR:
			case XORASS:
				{
				alt1=3;
				}
				break;
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
				{
				alt1=4;
				}
				break;
			case StringLiteral:
				{
				alt1=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:596:4: reservedWord
					{
					pushFollow(FOLLOW_reservedWord_in_token1776);
					reservedWord();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:597:4: Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_token1781); if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:598:4: punctuator
					{
					pushFollow(FOLLOW_punctuator_in_token1786);
					punctuator();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 4 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:599:4: numericLiteral
					{
					pushFollow(FOLLOW_numericLiteral_in_token1791);
					numericLiteral();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 5 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:600:4: StringLiteral
					{
					match(input,StringLiteral,FOLLOW_StringLiteral_in_token1796); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, token_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "token"


	public static class reservedWord_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "reservedWord"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:605:1: reservedWord : ( keyword | futureReservedWord | NULL | booleanLiteral );
	public final ES3YUITestParser.reservedWord_return reservedWord() throws RecognitionException {
		ES3YUITestParser.reservedWord_return retval = new ES3YUITestParser.reservedWord_return();
		retval.start = input.LT(1);
		int reservedWord_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:606:2: ( keyword | futureReservedWord | NULL | booleanLiteral )
			int alt2=4;
			switch ( input.LA(1) ) {
			case BREAK:
			case CASE:
			case CATCH:
			case CONTINUE:
			case DEFAULT:
			case DELETE:
			case DO:
			case ELSE:
			case FINALLY:
			case FOR:
			case FUNCTION:
			case IF:
			case IN:
			case INSTANCEOF:
			case NEW:
			case RETURN:
			case SWITCH:
			case THIS:
			case THROW:
			case TRY:
			case TYPEOF:
			case VAR:
			case VOID:
			case WHILE:
			case WITH:
				{
				alt2=1;
				}
				break;
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case CONST:
			case DEBUGGER:
			case DOUBLE:
			case ENUM:
			case EXPORT:
			case EXTENDS:
			case FINAL:
			case FLOAT:
			case GOTO:
			case IMPLEMENTS:
			case IMPORT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PACKAGE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case SUPER:
			case SYNCHRONIZED:
			case THROWS:
			case TRANSIENT:
			case VOLATILE:
				{
				alt2=2;
				}
				break;
			case NULL:
				{
				alt2=3;
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt2=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:606:4: keyword
					{
					pushFollow(FOLLOW_keyword_in_reservedWord1809);
					keyword();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:607:4: futureReservedWord
					{
					pushFollow(FOLLOW_futureReservedWord_in_reservedWord1814);
					futureReservedWord();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:608:4: NULL
					{
					match(input,NULL,FOLLOW_NULL_in_reservedWord1819); if (state.failed) return retval;
					}
					break;
				case 4 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:609:4: booleanLiteral
					{
					pushFollow(FOLLOW_booleanLiteral_in_reservedWord1824);
					booleanLiteral();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, reservedWord_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "reservedWord"


	public static class keyword_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "keyword"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:616:1: keyword : ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | FUNCTION | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH );
	public final ES3YUITestParser.keyword_return keyword() throws RecognitionException {
		ES3YUITestParser.keyword_return retval = new ES3YUITestParser.keyword_return();
		retval.start = input.LT(1);
		int keyword_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:617:2: ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | FUNCTION | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:
			{
			if ( input.LA(1)==BREAK||(input.LA(1) >= CASE && input.LA(1) <= CATCH)||input.LA(1)==CONTINUE||(input.LA(1) >= DEFAULT && input.LA(1) <= DELETE)||input.LA(1)==DO||input.LA(1)==ELSE||input.LA(1)==FINALLY||input.LA(1)==FOR||input.LA(1)==FUNCTION||input.LA(1)==IF||input.LA(1)==IN||input.LA(1)==INSTANCEOF||input.LA(1)==NEW||input.LA(1)==RETURN||input.LA(1)==SWITCH||(input.LA(1) >= THIS && input.LA(1) <= THROW)||(input.LA(1) >= TRY && input.LA(1) <= TYPEOF)||(input.LA(1) >= VAR && input.LA(1) <= VOID)||(input.LA(1) >= WHILE && input.LA(1) <= WITH) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, keyword_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "keyword"


	public static class futureReservedWord_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "futureReservedWord"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:648:1: futureReservedWord : ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE );
	public final ES3YUITestParser.futureReservedWord_return futureReservedWord() throws RecognitionException {
		ES3YUITestParser.futureReservedWord_return retval = new ES3YUITestParser.futureReservedWord_return();
		retval.start = input.LT(1);
		int futureReservedWord_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:649:2: ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:
			{
			if ( input.LA(1)==ABSTRACT||input.LA(1)==BOOLEAN||input.LA(1)==BYTE||(input.LA(1) >= CHAR && input.LA(1) <= CLASS)||input.LA(1)==CONST||input.LA(1)==DEBUGGER||input.LA(1)==DOUBLE||input.LA(1)==ENUM||input.LA(1)==EXPORT||input.LA(1)==EXTENDS||input.LA(1)==FINAL||input.LA(1)==FLOAT||input.LA(1)==GOTO||(input.LA(1) >= IMPLEMENTS && input.LA(1) <= IMPORT)||(input.LA(1) >= INT && input.LA(1) <= INTERFACE)||input.LA(1)==LONG||input.LA(1)==NATIVE||input.LA(1)==PACKAGE||(input.LA(1) >= PRIVATE && input.LA(1) <= PROTECTED)||input.LA(1)==PUBLIC||input.LA(1)==SHORT||input.LA(1)==STATIC||input.LA(1)==SUPER||input.LA(1)==SYNCHRONIZED||(input.LA(1) >= THROWS && input.LA(1) <= TRANSIENT)||input.LA(1)==VOLATILE ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, futureReservedWord_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "futureReservedWord"


	public static class punctuator_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "punctuator"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:726:1: punctuator : ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS );
	public final ES3YUITestParser.punctuator_return punctuator() throws RecognitionException {
		ES3YUITestParser.punctuator_return retval = new ES3YUITestParser.punctuator_return();
		retval.start = input.LT(1);
		int punctuator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:727:2: ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:
			{
			if ( (input.LA(1) >= ADD && input.LA(1) <= ANDASS)||input.LA(1)==ASSIGN||(input.LA(1) >= COLON && input.LA(1) <= COMMA)||input.LA(1)==DEC||(input.LA(1) >= DIV && input.LA(1) <= DIVASS)||input.LA(1)==DOT||input.LA(1)==EQ||(input.LA(1) >= GT && input.LA(1) <= GTE)||input.LA(1)==INC||input.LA(1)==INV||(input.LA(1) >= LAND && input.LA(1) <= LBRACK)||(input.LA(1) >= LOR && input.LA(1) <= LPAREN)||(input.LA(1) >= LT && input.LA(1) <= LTE)||(input.LA(1) >= MOD && input.LA(1) <= MULASS)||input.LA(1)==NEQ||(input.LA(1) >= NOT && input.LA(1) <= NSAME)||(input.LA(1) >= OR && input.LA(1) <= ORASS)||(input.LA(1) >= QUE && input.LA(1) <= RBRACK)||input.LA(1)==RPAREN||(input.LA(1) >= SAME && input.LA(1) <= SHLASS)||(input.LA(1) >= SHR && input.LA(1) <= SHUASS)||(input.LA(1) >= SUB && input.LA(1) <= SUBASS)||(input.LA(1) >= XOR && input.LA(1) <= XORASS) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, punctuator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "punctuator"


	public static class literal_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "literal"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:781:1: literal : ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral );
	public final ES3YUITestParser.literal_return literal() throws RecognitionException {
		ES3YUITestParser.literal_return retval = new ES3YUITestParser.literal_return();
		retval.start = input.LT(1);
		int literal_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:782:2: ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral )
			int alt3=5;
			switch ( input.LA(1) ) {
			case NULL:
				{
				alt3=1;
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt3=2;
				}
				break;
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
				{
				alt3=3;
				}
				break;
			case StringLiteral:
				{
				alt3=4;
				}
				break;
			case RegularExpressionLiteral:
				{
				alt3=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:782:4: NULL
					{
					match(input,NULL,FOLLOW_NULL_in_literal2505); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:783:4: booleanLiteral
					{
					pushFollow(FOLLOW_booleanLiteral_in_literal2510);
					booleanLiteral();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:784:4: numericLiteral
					{
					pushFollow(FOLLOW_numericLiteral_in_literal2515);
					numericLiteral();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 4 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:785:4: StringLiteral
					{
					match(input,StringLiteral,FOLLOW_StringLiteral_in_literal2520); if (state.failed) return retval;
					}
					break;
				case 5 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:786:4: RegularExpressionLiteral
					{
					match(input,RegularExpressionLiteral,FOLLOW_RegularExpressionLiteral_in_literal2525); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, literal_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "literal"


	public static class booleanLiteral_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "booleanLiteral"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:789:1: booleanLiteral : ( TRUE | FALSE );
	public final ES3YUITestParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
		ES3YUITestParser.booleanLiteral_return retval = new ES3YUITestParser.booleanLiteral_return();
		retval.start = input.LT(1);
		int booleanLiteral_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:790:2: ( TRUE | FALSE )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:
			{
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, booleanLiteral_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "booleanLiteral"


	public static class numericLiteral_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "numericLiteral"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:836:1: numericLiteral : ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral );
	public final ES3YUITestParser.numericLiteral_return numericLiteral() throws RecognitionException {
		ES3YUITestParser.numericLiteral_return retval = new ES3YUITestParser.numericLiteral_return();
		retval.start = input.LT(1);
		int numericLiteral_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:837:2: ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:
			{
			if ( input.LA(1)==DecimalLiteral||input.LA(1)==HexIntegerLiteral||input.LA(1)==OctalIntegerLiteral ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, numericLiteral_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "numericLiteral"


	public static class primaryExpression_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "primaryExpression"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:924:1: primaryExpression : ( THIS | Identifier | literal | arrayLiteral | objectLiteral |lpar= LPAREN expression RPAREN );
	public final ES3YUITestParser.primaryExpression_return primaryExpression() throws RecognitionException {
		ES3YUITestParser.primaryExpression_return retval = new ES3YUITestParser.primaryExpression_return();
		retval.start = input.LT(1);
		int primaryExpression_StartIndex = input.index();

		Token lpar=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:925:2: ( THIS | Identifier | literal | arrayLiteral | objectLiteral |lpar= LPAREN expression RPAREN )
			int alt4=6;
			switch ( input.LA(1) ) {
			case THIS:
				{
				alt4=1;
				}
				break;
			case Identifier:
				{
				alt4=2;
				}
				break;
			case DecimalLiteral:
			case FALSE:
			case HexIntegerLiteral:
			case NULL:
			case OctalIntegerLiteral:
			case RegularExpressionLiteral:
			case StringLiteral:
			case TRUE:
				{
				alt4=3;
				}
				break;
			case LBRACK:
				{
				alt4=4;
				}
				break;
			case LBRACE:
				{
				alt4=5;
				}
				break;
			case LPAREN:
				{
				alt4=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:925:4: THIS
					{
					match(input,THIS,FOLLOW_THIS_in_primaryExpression3138); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:926:4: Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_primaryExpression3143); if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:927:4: literal
					{
					pushFollow(FOLLOW_literal_in_primaryExpression3148);
					literal();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 4 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:928:4: arrayLiteral
					{
					pushFollow(FOLLOW_arrayLiteral_in_primaryExpression3153);
					arrayLiteral();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 5 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:929:4: objectLiteral
					{
					pushFollow(FOLLOW_objectLiteral_in_primaryExpression3158);
					objectLiteral();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 6 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:930:4: lpar= LPAREN expression RPAREN
					{
					lpar=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression3165); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_primaryExpression3167);
					expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression3169); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, primaryExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primaryExpression"


	public static class arrayLiteral_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "arrayLiteral"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:936:1: arrayLiteral : lb= LBRACK ( arrayItem ( COMMA ( arrayItem )? )* )? RBRACK ;
	public final ES3YUITestParser.arrayLiteral_return arrayLiteral() throws RecognitionException {
		ES3YUITestParser.arrayLiteral_return retval = new ES3YUITestParser.arrayLiteral_return();
		retval.start = input.LT(1);
		int arrayLiteral_StartIndex = input.index();

		Token lb=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:937:2: (lb= LBRACK ( arrayItem ( COMMA ( arrayItem )? )* )? RBRACK )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:937:4: lb= LBRACK ( arrayItem ( COMMA ( arrayItem )? )* )? RBRACK
			{
			lb=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_arrayLiteral3185); if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:937:14: ( arrayItem ( COMMA ( arrayItem )? )* )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ADD||LA7_0==COMMA||LA7_0==DEC||LA7_0==DELETE||LA7_0==DecimalLiteral||LA7_0==FALSE||LA7_0==FUNCTION||LA7_0==HexIntegerLiteral||LA7_0==INC||LA7_0==INV||LA7_0==Identifier||(LA7_0 >= LBRACE && LA7_0 <= LBRACK)||LA7_0==LPAREN||(LA7_0 >= NEW && LA7_0 <= NOT)||LA7_0==NULL||LA7_0==OctalIntegerLiteral||LA7_0==RegularExpressionLiteral||LA7_0==SUB||LA7_0==StringLiteral||LA7_0==THIS||LA7_0==TRUE||LA7_0==TYPEOF||LA7_0==VOID) ) {
				alt7=1;
			}
			else if ( (LA7_0==RBRACK) ) {
				int LA7_2 = input.LA(2);
				if ( (((( input.LA(1) == COMMA )&&( input.LA(1) == COMMA ))&&synpred123_ES3YUITest())) ) {
					alt7=1;
				}
			}
			switch (alt7) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:937:16: arrayItem ( COMMA ( arrayItem )? )*
					{
					pushFollow(FOLLOW_arrayItem_in_arrayLiteral3189);
					arrayItem();
					state._fsp--;
					if (state.failed) return retval;
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:937:26: ( COMMA ( arrayItem )? )*
					loop6:
					do {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==COMMA) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:937:28: COMMA ( arrayItem )?
							{
							match(input,COMMA,FOLLOW_COMMA_in_arrayLiteral3193); if (state.failed) return retval;
							// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:937:34: ( arrayItem )?
							int alt5=2;
							switch ( input.LA(1) ) {
								case ADD:
								case DEC:
								case DELETE:
								case DecimalLiteral:
								case FALSE:
								case FUNCTION:
								case HexIntegerLiteral:
								case INC:
								case INV:
								case Identifier:
								case LBRACE:
								case LBRACK:
								case LPAREN:
								case NEW:
								case NOT:
								case NULL:
								case OctalIntegerLiteral:
								case RegularExpressionLiteral:
								case SUB:
								case StringLiteral:
								case THIS:
								case TRUE:
								case TYPEOF:
								case VOID:
									{
									alt5=1;
									}
									break;
								case RBRACK:
									{
									int LA5_2 = input.LA(2);
									if ( (((( input.LA(1) == COMMA )&&( input.LA(1) == COMMA ))&&synpred121_ES3YUITest())) ) {
										alt5=1;
									}
									}
									break;
								case COMMA:
									{
									int LA5_3 = input.LA(2);
									if ( (((( input.LA(1) == COMMA )&&( input.LA(1) == COMMA ))&&synpred121_ES3YUITest())) ) {
										alt5=1;
									}
									}
									break;
							}
							switch (alt5) {
								case 1 :
									// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:937:34: arrayItem
									{
									pushFollow(FOLLOW_arrayItem_in_arrayLiteral3195);
									arrayItem();
									state._fsp--;
									if (state.failed) return retval;
									}
									break;

							}

							}
							break;

						default :
							break loop6;
						}
					} while (true);

					}
					break;

			}

			match(input,RBRACK,FOLLOW_RBRACK_in_arrayLiteral3204); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, arrayLiteral_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arrayLiteral"


	public static class arrayItem_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "arrayItem"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:941:1: arrayItem : (expr= assignmentExpression |{...}?) ;
	public final ES3YUITestParser.arrayItem_return arrayItem() throws RecognitionException {
		ES3YUITestParser.arrayItem_return retval = new ES3YUITestParser.arrayItem_return();
		retval.start = input.LT(1);
		int arrayItem_StartIndex = input.index();

		ParserRuleReturnScope expr =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:942:2: ( (expr= assignmentExpression |{...}?) )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:942:4: (expr= assignmentExpression |{...}?)
			{
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:942:4: (expr= assignmentExpression |{...}?)
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==ADD||LA8_0==DEC||LA8_0==DELETE||LA8_0==DecimalLiteral||LA8_0==FALSE||LA8_0==FUNCTION||LA8_0==HexIntegerLiteral||LA8_0==INC||LA8_0==INV||LA8_0==Identifier||(LA8_0 >= LBRACE && LA8_0 <= LBRACK)||LA8_0==LPAREN||(LA8_0 >= NEW && LA8_0 <= NOT)||LA8_0==NULL||LA8_0==OctalIntegerLiteral||LA8_0==RegularExpressionLiteral||LA8_0==SUB||LA8_0==StringLiteral||LA8_0==THIS||LA8_0==TRUE||LA8_0==TYPEOF||LA8_0==VOID) ) {
				alt8=1;
			}
			else if ( (LA8_0==EOF||LA8_0==COMMA||LA8_0==RBRACK) ) {
				alt8=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:942:6: expr= assignmentExpression
					{
					pushFollow(FOLLOW_assignmentExpression_in_arrayItem3221);
					expr=assignmentExpression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:942:34: {...}?
					{
					if ( !(( input.LA(1) == COMMA )) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "arrayItem", " input.LA(1) == COMMA ");
					}
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, arrayItem_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arrayItem"


	public static class objectLiteral_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "objectLiteral"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:946:1: objectLiteral : lb= LBRACE ( nameValuePair ( COMMA nameValuePair )* )? RBRACE ;
	public final ES3YUITestParser.objectLiteral_return objectLiteral() throws RecognitionException {
		ES3YUITestParser.objectLiteral_return retval = new ES3YUITestParser.objectLiteral_return();
		retval.start = input.LT(1);
		int objectLiteral_StartIndex = input.index();

		Token lb=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:947:2: (lb= LBRACE ( nameValuePair ( COMMA nameValuePair )* )? RBRACE )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:947:4: lb= LBRACE ( nameValuePair ( COMMA nameValuePair )* )? RBRACE
			{
			lb=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objectLiteral3242); if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:947:14: ( nameValuePair ( COMMA nameValuePair )* )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==DecimalLiteral||LA10_0==HexIntegerLiteral||LA10_0==Identifier||LA10_0==OctalIntegerLiteral||LA10_0==StringLiteral) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:947:16: nameValuePair ( COMMA nameValuePair )*
					{
					pushFollow(FOLLOW_nameValuePair_in_objectLiteral3246);
					nameValuePair();
					state._fsp--;
					if (state.failed) return retval;
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:947:30: ( COMMA nameValuePair )*
					loop9:
					do {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==COMMA) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:947:32: COMMA nameValuePair
							{
							match(input,COMMA,FOLLOW_COMMA_in_objectLiteral3250); if (state.failed) return retval;
							pushFollow(FOLLOW_nameValuePair_in_objectLiteral3252);
							nameValuePair();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

						default :
							break loop9;
						}
					} while (true);

					}
					break;

			}

			match(input,RBRACE,FOLLOW_RBRACE_in_objectLiteral3260); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, objectLiteral_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "objectLiteral"


	public static class nameValuePair_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "nameValuePair"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:955:1: nameValuePair : propertyName COLON assignmentExpression ;
	public final ES3YUITestParser.nameValuePair_return nameValuePair() throws RecognitionException {
		ES3YUITestParser.nameValuePair_return retval = new ES3YUITestParser.nameValuePair_return();
		retval.start = input.LT(1);
		int nameValuePair_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:956:2: ( propertyName COLON assignmentExpression )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:956:4: propertyName COLON assignmentExpression
			{
			pushFollow(FOLLOW_propertyName_in_nameValuePair3276);
			propertyName();
			state._fsp--;
			if (state.failed) return retval;
			match(input,COLON,FOLLOW_COLON_in_nameValuePair3278); if (state.failed) return retval;
			pushFollow(FOLLOW_assignmentExpression_in_nameValuePair3280);
			assignmentExpression();
			state._fsp--;
			if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, nameValuePair_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "nameValuePair"


	public static class propertyName_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "propertyName"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:960:1: propertyName : ( Identifier | StringLiteral | numericLiteral );
	public final ES3YUITestParser.propertyName_return propertyName() throws RecognitionException {
		ES3YUITestParser.propertyName_return retval = new ES3YUITestParser.propertyName_return();
		retval.start = input.LT(1);
		int propertyName_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:961:2: ( Identifier | StringLiteral | numericLiteral )
			int alt11=3;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				alt11=1;
				}
				break;
			case StringLiteral:
				{
				alt11=2;
				}
				break;
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
				{
				alt11=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:961:4: Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_propertyName3293); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:962:4: StringLiteral
					{
					match(input,StringLiteral,FOLLOW_StringLiteral_in_propertyName3298); if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:963:4: numericLiteral
					{
					pushFollow(FOLLOW_numericLiteral_in_propertyName3303);
					numericLiteral();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, propertyName_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "propertyName"


	public static class memberExpression_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "memberExpression"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:975:1: memberExpression : ( primaryExpression ( memberExpressionSuffix )* | functionExpression | newExpression );
	public final ES3YUITestParser.memberExpression_return memberExpression() throws RecognitionException {
		ES3YUITestParser.memberExpression_return retval = new ES3YUITestParser.memberExpression_return();
		retval.start = input.LT(1);
		int memberExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:976:2: ( primaryExpression ( memberExpressionSuffix )* | functionExpression | newExpression )
			int alt13=3;
			switch ( input.LA(1) ) {
			case DecimalLiteral:
			case FALSE:
			case HexIntegerLiteral:
			case Identifier:
			case LBRACE:
			case LBRACK:
			case LPAREN:
			case NULL:
			case OctalIntegerLiteral:
			case RegularExpressionLiteral:
			case StringLiteral:
			case THIS:
			case TRUE:
				{
				alt13=1;
				}
				break;
			case FUNCTION:
				{
				alt13=2;
				}
				break;
			case NEW:
				{
				alt13=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:976:4: primaryExpression ( memberExpressionSuffix )*
					{
					pushFollow(FOLLOW_primaryExpression_in_memberExpression3321);
					primaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:976:22: ( memberExpressionSuffix )*
					loop12:
					do {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==LBRACK) ) {
							int LA12_2 = input.LA(2);
							if ( (LA12_2==Identifier) ) {
								int LA12_4 = input.LA(3);
								if ( (LA12_4==RBRACK) ) {
									int LA12_6 = input.LA(4);
									if ( (synpred129_ES3YUITest()) ) {
										alt12=1;
									}

								}

							}

						}
						else if ( (LA12_0==DOT) ) {
							int LA12_3 = input.LA(2);
							if ( (LA12_3==Identifier) ) {
								int LA12_5 = input.LA(3);
								if ( (synpred129_ES3YUITest()) ) {
									alt12=1;
								}

							}

						}

						switch (alt12) {
						case 1 :
							// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:976:23: memberExpressionSuffix
							{
							pushFollow(FOLLOW_memberExpressionSuffix_in_memberExpression3324);
							memberExpressionSuffix();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

						default :
							break loop12;
						}
					} while (true);

					}
					break;
				case 2 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:977:4: functionExpression
					{
					pushFollow(FOLLOW_functionExpression_in_memberExpression3331);
					functionExpression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:978:4: newExpression
					{
					pushFollow(FOLLOW_newExpression_in_memberExpression3336);
					newExpression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 15, memberExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "memberExpression"


	public static class newExpression_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "newExpression"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:981:1: newExpression : ( NEW primaryExpression | NEW functionExpression );
	public final ES3YUITestParser.newExpression_return newExpression() throws RecognitionException {
		ES3YUITestParser.newExpression_return retval = new ES3YUITestParser.newExpression_return();
		retval.start = input.LT(1);
		int newExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:982:2: ( NEW primaryExpression | NEW functionExpression )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==NEW) ) {
				int LA14_1 = input.LA(2);
				if ( (LA14_1==DecimalLiteral||LA14_1==FALSE||LA14_1==HexIntegerLiteral||LA14_1==Identifier||(LA14_1 >= LBRACE && LA14_1 <= LBRACK)||LA14_1==LPAREN||LA14_1==NULL||LA14_1==OctalIntegerLiteral||LA14_1==RegularExpressionLiteral||LA14_1==StringLiteral||LA14_1==THIS||LA14_1==TRUE) ) {
					alt14=1;
				}
				else if ( (LA14_1==FUNCTION) ) {
					alt14=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:982:4: NEW primaryExpression
					{
					match(input,NEW,FOLLOW_NEW_in_newExpression3347); if (state.failed) return retval;
					pushFollow(FOLLOW_primaryExpression_in_newExpression3349);
					primaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:983:11: NEW functionExpression
					{
					match(input,NEW,FOLLOW_NEW_in_newExpression3361); if (state.failed) return retval;
					pushFollow(FOLLOW_functionExpression_in_newExpression3363);
					functionExpression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, newExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "newExpression"


	public static class memberExpressionSuffix_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "memberExpressionSuffix"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:986:1: memberExpressionSuffix : ( indexSuffix | propertyReferenceSuffix );
	public final ES3YUITestParser.memberExpressionSuffix_return memberExpressionSuffix() throws RecognitionException {
		ES3YUITestParser.memberExpressionSuffix_return retval = new ES3YUITestParser.memberExpressionSuffix_return();
		retval.start = input.LT(1);
		int memberExpressionSuffix_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:987:2: ( indexSuffix | propertyReferenceSuffix )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==LBRACK) ) {
				alt15=1;
			}
			else if ( (LA15_0==DOT) ) {
				alt15=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:987:4: indexSuffix
					{
					pushFollow(FOLLOW_indexSuffix_in_memberExpressionSuffix3377);
					indexSuffix();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:988:4: propertyReferenceSuffix
					{
					pushFollow(FOLLOW_propertyReferenceSuffix_in_memberExpressionSuffix3382);
					propertyReferenceSuffix();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 17, memberExpressionSuffix_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "memberExpressionSuffix"


	public static class indexSuffix_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "indexSuffix"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:991:1: indexSuffix : '[' Identifier ']' ;
	public final ES3YUITestParser.indexSuffix_return indexSuffix() throws RecognitionException {
		ES3YUITestParser.indexSuffix_return retval = new ES3YUITestParser.indexSuffix_return();
		retval.start = input.LT(1);
		int indexSuffix_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:992:2: ( '[' Identifier ']' )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:992:4: '[' Identifier ']'
			{
			match(input,LBRACK,FOLLOW_LBRACK_in_indexSuffix3393); if (state.failed) return retval;
			match(input,Identifier,FOLLOW_Identifier_in_indexSuffix3395); if (state.failed) return retval;
			match(input,RBRACK,FOLLOW_RBRACK_in_indexSuffix3397); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, indexSuffix_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "indexSuffix"


	public static class propertyReferenceSuffix_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "propertyReferenceSuffix"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:995:1: propertyReferenceSuffix : '.' Identifier ;
	public final ES3YUITestParser.propertyReferenceSuffix_return propertyReferenceSuffix() throws RecognitionException {
		ES3YUITestParser.propertyReferenceSuffix_return retval = new ES3YUITestParser.propertyReferenceSuffix_return();
		retval.start = input.LT(1);
		int propertyReferenceSuffix_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:996:2: ( '.' Identifier )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:996:4: '.' Identifier
			{
			match(input,DOT,FOLLOW_DOT_in_propertyReferenceSuffix3411); if (state.failed) return retval;
			match(input,Identifier,FOLLOW_Identifier_in_propertyReferenceSuffix3413); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 19, propertyReferenceSuffix_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "propertyReferenceSuffix"


	public static class arguments_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "arguments"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:999:1: arguments : LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN ;
	public final ES3YUITestParser.arguments_return arguments() throws RecognitionException {
		ES3YUITestParser.arguments_return retval = new ES3YUITestParser.arguments_return();
		retval.start = input.LT(1);
		int arguments_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1000:2: ( LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1000:4: LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_arguments3426); if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1000:11: ( assignmentExpression ( COMMA assignmentExpression )* )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==ADD||LA17_0==DEC||LA17_0==DELETE||LA17_0==DecimalLiteral||LA17_0==FALSE||LA17_0==FUNCTION||LA17_0==HexIntegerLiteral||LA17_0==INC||LA17_0==INV||LA17_0==Identifier||(LA17_0 >= LBRACE && LA17_0 <= LBRACK)||LA17_0==LPAREN||(LA17_0 >= NEW && LA17_0 <= NOT)||LA17_0==NULL||LA17_0==OctalIntegerLiteral||LA17_0==RegularExpressionLiteral||LA17_0==SUB||LA17_0==StringLiteral||LA17_0==THIS||LA17_0==TRUE||LA17_0==TYPEOF||LA17_0==VOID) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1000:13: assignmentExpression ( COMMA assignmentExpression )*
					{
					pushFollow(FOLLOW_assignmentExpression_in_arguments3430);
					assignmentExpression();
					state._fsp--;
					if (state.failed) return retval;
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1000:34: ( COMMA assignmentExpression )*
					loop16:
					do {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==COMMA) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1000:36: COMMA assignmentExpression
							{
							match(input,COMMA,FOLLOW_COMMA_in_arguments3434); if (state.failed) return retval;
							pushFollow(FOLLOW_assignmentExpression_in_arguments3436);
							assignmentExpression();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

						default :
							break loop16;
						}
					} while (true);

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_arguments3444); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 20, arguments_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arguments"


	public static class leftHandSideExpression_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "leftHandSideExpression"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1004:1: leftHandSideExpression : ( memberExpression ) ( arguments | LBRACK expression RBRACK | DOT Identifier )* ;
	public final ES3YUITestParser.leftHandSideExpression_return leftHandSideExpression() throws RecognitionException {
		ES3YUITestParser.leftHandSideExpression_return retval = new ES3YUITestParser.leftHandSideExpression_return();
		retval.start = input.LT(1);
		int leftHandSideExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1005:2: ( ( memberExpression ) ( arguments | LBRACK expression RBRACK | DOT Identifier )* )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1006:2: ( memberExpression ) ( arguments | LBRACK expression RBRACK | DOT Identifier )*
			{
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1006:2: ( memberExpression )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1007:3: memberExpression
			{
			pushFollow(FOLLOW_memberExpression_in_leftHandSideExpression3463);
			memberExpression();
			state._fsp--;
			if (state.failed) return retval;
			}

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1009:2: ( arguments | LBRACK expression RBRACK | DOT Identifier )*
			loop18:
			do {
				int alt18=4;
				switch ( input.LA(1) ) {
				case LPAREN:
					{
					alt18=1;
					}
					break;
				case LBRACK:
					{
					alt18=2;
					}
					break;
				case DOT:
					{
					alt18=3;
					}
					break;
				}
				switch (alt18) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1010:3: arguments
					{
					pushFollow(FOLLOW_arguments_in_leftHandSideExpression3476);
					arguments();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1011:5: LBRACK expression RBRACK
					{
					match(input,LBRACK,FOLLOW_LBRACK_in_leftHandSideExpression3485); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_leftHandSideExpression3487);
					expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input,RBRACK,FOLLOW_RBRACK_in_leftHandSideExpression3489); if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1012:5: DOT Identifier
					{
					match(input,DOT,FOLLOW_DOT_in_leftHandSideExpression3496); if (state.failed) return retval;
					match(input,Identifier,FOLLOW_Identifier_in_leftHandSideExpression3498); if (state.failed) return retval;
					}
					break;

				default :
					break loop18;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 21, leftHandSideExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "leftHandSideExpression"


	public static class postfixExpression_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "postfixExpression"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1026:1: postfixExpression : leftHandSideExpression ( postfixOperator )? ;
	public final ES3YUITestParser.postfixExpression_return postfixExpression() throws RecognitionException {
		ES3YUITestParser.postfixExpression_return retval = new ES3YUITestParser.postfixExpression_return();
		retval.start = input.LT(1);
		int postfixExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1027:2: ( leftHandSideExpression ( postfixOperator )? )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1027:4: leftHandSideExpression ( postfixOperator )?
			{
			pushFollow(FOLLOW_leftHandSideExpression_in_postfixExpression3521);
			leftHandSideExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { if (input.LA(1) == INC || input.LA(1) == DEC) promoteEOL(null); }
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1027:95: ( postfixOperator )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==DEC||LA19_0==INC) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1027:97: postfixOperator
					{
					pushFollow(FOLLOW_postfixOperator_in_postfixExpression3527);
					postfixOperator();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 22, postfixExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "postfixExpression"


	public static class postfixOperator_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "postfixOperator"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1030:1: postfixOperator : (op= INC |op= DEC );
	public final ES3YUITestParser.postfixOperator_return postfixOperator() throws RecognitionException {
		ES3YUITestParser.postfixOperator_return retval = new ES3YUITestParser.postfixOperator_return();
		retval.start = input.LT(1);
		int postfixOperator_StartIndex = input.index();

		Token op=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1031:2: (op= INC |op= DEC )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==INC) ) {
				alt20=1;
			}
			else if ( (LA20_0==DEC) ) {
				alt20=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1031:4: op= INC
					{
					op=(Token)match(input,INC,FOLLOW_INC_in_postfixOperator3544); if (state.failed) return retval;
					if ( state.backtracking==0 ) { op.setType(PINC); }
					}
					break;
				case 2 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1032:4: op= DEC
					{
					op=(Token)match(input,DEC,FOLLOW_DEC_in_postfixOperator3553); if (state.failed) return retval;
					if ( state.backtracking==0 ) { op.setType(PDEC); }
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 23, postfixOperator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "postfixOperator"


	public static class unaryExpression_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "unaryExpression"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1039:1: unaryExpression : ( postfixExpression | unaryOperator unaryExpression );
	public final ES3YUITestParser.unaryExpression_return unaryExpression() throws RecognitionException {
		ES3YUITestParser.unaryExpression_return retval = new ES3YUITestParser.unaryExpression_return();
		retval.start = input.LT(1);
		int unaryExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1040:2: ( postfixExpression | unaryOperator unaryExpression )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==DecimalLiteral||LA21_0==FALSE||LA21_0==FUNCTION||LA21_0==HexIntegerLiteral||LA21_0==Identifier||(LA21_0 >= LBRACE && LA21_0 <= LBRACK)||LA21_0==LPAREN||LA21_0==NEW||LA21_0==NULL||LA21_0==OctalIntegerLiteral||LA21_0==RegularExpressionLiteral||LA21_0==StringLiteral||LA21_0==THIS||LA21_0==TRUE) ) {
				alt21=1;
			}
			else if ( (LA21_0==ADD||LA21_0==DEC||LA21_0==DELETE||LA21_0==INC||LA21_0==INV||LA21_0==NOT||LA21_0==SUB||LA21_0==TYPEOF||LA21_0==VOID) ) {
				alt21=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1040:4: postfixExpression
					{
					pushFollow(FOLLOW_postfixExpression_in_unaryExpression3570);
					postfixExpression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1041:4: unaryOperator unaryExpression
					{
					pushFollow(FOLLOW_unaryOperator_in_unaryExpression3575);
					unaryOperator();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_unaryExpression_in_unaryExpression3577);
					unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 24, unaryExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "unaryExpression"


	public static class unaryOperator_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "unaryOperator"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1044:1: unaryOperator : ( DELETE | VOID | TYPEOF | INC | DEC |op= ADD |op= SUB | INV | NOT );
	public final ES3YUITestParser.unaryOperator_return unaryOperator() throws RecognitionException {
		ES3YUITestParser.unaryOperator_return retval = new ES3YUITestParser.unaryOperator_return();
		retval.start = input.LT(1);
		int unaryOperator_StartIndex = input.index();

		Token op=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1045:2: ( DELETE | VOID | TYPEOF | INC | DEC |op= ADD |op= SUB | INV | NOT )
			int alt22=9;
			switch ( input.LA(1) ) {
			case DELETE:
				{
				alt22=1;
				}
				break;
			case VOID:
				{
				alt22=2;
				}
				break;
			case TYPEOF:
				{
				alt22=3;
				}
				break;
			case INC:
				{
				alt22=4;
				}
				break;
			case DEC:
				{
				alt22=5;
				}
				break;
			case ADD:
				{
				alt22=6;
				}
				break;
			case SUB:
				{
				alt22=7;
				}
				break;
			case INV:
				{
				alt22=8;
				}
				break;
			case NOT:
				{
				alt22=9;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1045:4: DELETE
					{
					match(input,DELETE,FOLLOW_DELETE_in_unaryOperator3589); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1046:4: VOID
					{
					match(input,VOID,FOLLOW_VOID_in_unaryOperator3594); if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1047:4: TYPEOF
					{
					match(input,TYPEOF,FOLLOW_TYPEOF_in_unaryOperator3599); if (state.failed) return retval;
					}
					break;
				case 4 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1048:4: INC
					{
					match(input,INC,FOLLOW_INC_in_unaryOperator3604); if (state.failed) return retval;
					}
					break;
				case 5 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1049:4: DEC
					{
					match(input,DEC,FOLLOW_DEC_in_unaryOperator3609); if (state.failed) return retval;
					}
					break;
				case 6 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1050:4: op= ADD
					{
					op=(Token)match(input,ADD,FOLLOW_ADD_in_unaryOperator3616); if (state.failed) return retval;
					if ( state.backtracking==0 ) { op.setType(POS); }
					}
					break;
				case 7 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1051:4: op= SUB
					{
					op=(Token)match(input,SUB,FOLLOW_SUB_in_unaryOperator3625); if (state.failed) return retval;
					if ( state.backtracking==0 ) { op.setType(NEG); }
					}
					break;
				case 8 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1052:4: INV
					{
					match(input,INV,FOLLOW_INV_in_unaryOperator3632); if (state.failed) return retval;
					}
					break;
				case 9 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1053:4: NOT
					{
					match(input,NOT,FOLLOW_NOT_in_unaryOperator3637); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 25, unaryOperator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "unaryOperator"


	public static class multiplicativeExpression_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "multiplicativeExpression"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1060:1: multiplicativeExpression : unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* ;
	public final ES3YUITestParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
		ES3YUITestParser.multiplicativeExpression_return retval = new ES3YUITestParser.multiplicativeExpression_return();
		retval.start = input.LT(1);
		int multiplicativeExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1061:2: ( unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1061:4: unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )*
			{
			pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression3652);
			unaryExpression();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1061:20: ( ( MUL | DIV | MOD ) unaryExpression )*
			loop23:
			do {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==DIV||LA23_0==MOD||LA23_0==MUL) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1061:22: ( MUL | DIV | MOD ) unaryExpression
					{
					if ( input.LA(1)==DIV||input.LA(1)==MOD||input.LA(1)==MUL ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression3670);
					unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop23;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 26, multiplicativeExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "multiplicativeExpression"


	public static class additiveExpression_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "additiveExpression"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1068:1: additiveExpression : multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* ;
	public final ES3YUITestParser.additiveExpression_return additiveExpression() throws RecognitionException {
		ES3YUITestParser.additiveExpression_return retval = new ES3YUITestParser.additiveExpression_return();
		retval.start = input.LT(1);
		int additiveExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1069:2: ( multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1069:4: multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )*
			{
			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression3688);
			multiplicativeExpression();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1069:29: ( ( ADD | SUB ) multiplicativeExpression )*
			loop24:
			do {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==ADD||LA24_0==SUB) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1069:31: ( ADD | SUB ) multiplicativeExpression
					{
					if ( input.LA(1)==ADD||input.LA(1)==SUB ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression3702);
					multiplicativeExpression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop24;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 27, additiveExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "additiveExpression"


	public static class shiftExpression_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "shiftExpression"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1076:1: shiftExpression : additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* ;
	public final ES3YUITestParser.shiftExpression_return shiftExpression() throws RecognitionException {
		ES3YUITestParser.shiftExpression_return retval = new ES3YUITestParser.shiftExpression_return();
		retval.start = input.LT(1);
		int shiftExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1077:2: ( additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1077:4: additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )*
			{
			pushFollow(FOLLOW_additiveExpression_in_shiftExpression3721);
			additiveExpression();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1077:23: ( ( SHL | SHR | SHU ) additiveExpression )*
			loop25:
			do {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==SHL||LA25_0==SHR||LA25_0==SHU) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1077:25: ( SHL | SHR | SHU ) additiveExpression
					{
					if ( input.LA(1)==SHL||input.LA(1)==SHR||input.LA(1)==SHU ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_additiveExpression_in_shiftExpression3739);
					additiveExpression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop25;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 28, shiftExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "shiftExpression"


	public static class relationalExpression_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "relationalExpression"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1084:1: relationalExpression : shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )* ;
	public final ES3YUITestParser.relationalExpression_return relationalExpression() throws RecognitionException {
		ES3YUITestParser.relationalExpression_return retval = new ES3YUITestParser.relationalExpression_return();
		retval.start = input.LT(1);
		int relationalExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1085:2: ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )* )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1085:4: shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )*
			{
			pushFollow(FOLLOW_shiftExpression_in_relationalExpression3758);
			shiftExpression();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1085:20: ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )*
			loop26:
			do {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( ((LA26_0 >= GT && LA26_0 <= GTE)||LA26_0==IN||LA26_0==INSTANCEOF||(LA26_0 >= LT && LA26_0 <= LTE)) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1085:22: ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression
					{
					if ( (input.LA(1) >= GT && input.LA(1) <= GTE)||input.LA(1)==IN||input.LA(1)==INSTANCEOF||(input.LA(1) >= LT && input.LA(1) <= LTE) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_shiftExpression_in_relationalExpression3788);
					shiftExpression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop26;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 29, relationalExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "relationalExpression"


	public static class relationalExpressionNoIn_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "relationalExpressionNoIn"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1088:1: relationalExpressionNoIn : shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )* ;
	public final ES3YUITestParser.relationalExpressionNoIn_return relationalExpressionNoIn() throws RecognitionException {
		ES3YUITestParser.relationalExpressionNoIn_return retval = new ES3YUITestParser.relationalExpressionNoIn_return();
		retval.start = input.LT(1);
		int relationalExpressionNoIn_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1089:2: ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )* )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1089:4: shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
			{
			pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn3802);
			shiftExpression();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1089:20: ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
			loop27:
			do {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( ((LA27_0 >= GT && LA27_0 <= GTE)||LA27_0==INSTANCEOF||(LA27_0 >= LT && LA27_0 <= LTE)) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1089:22: ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression
					{
					if ( (input.LA(1) >= GT && input.LA(1) <= GTE)||input.LA(1)==INSTANCEOF||(input.LA(1) >= LT && input.LA(1) <= LTE) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn3828);
					shiftExpression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop27;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 30, relationalExpressionNoIn_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "relationalExpressionNoIn"


	public static class equalityExpression_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "equalityExpression"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1096:1: equalityExpression : relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )* ;
	public final ES3YUITestParser.equalityExpression_return equalityExpression() throws RecognitionException {
		ES3YUITestParser.equalityExpression_return retval = new ES3YUITestParser.equalityExpression_return();
		retval.start = input.LT(1);
		int equalityExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1097:2: ( relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )* )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1097:4: relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
			{
			pushFollow(FOLLOW_relationalExpression_in_equalityExpression3847);
			relationalExpression();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1097:25: ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
			loop28:
			do {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==EQ||LA28_0==NEQ||LA28_0==NSAME||LA28_0==SAME) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1097:27: ( EQ | NEQ | SAME | NSAME ) relationalExpression
					{
					if ( input.LA(1)==EQ||input.LA(1)==NEQ||input.LA(1)==NSAME||input.LA(1)==SAME ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relationalExpression_in_equalityExpression3869);
					relationalExpression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop28;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 31, equalityExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "equalityExpression"


	public static class equalityExpressionNoIn_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "equalityExpressionNoIn"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1100:1: equalityExpressionNoIn : relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* ;
	public final ES3YUITestParser.equalityExpressionNoIn_return equalityExpressionNoIn() throws RecognitionException {
		ES3YUITestParser.equalityExpressionNoIn_return retval = new ES3YUITestParser.equalityExpressionNoIn_return();
		retval.start = input.LT(1);
		int equalityExpressionNoIn_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1101:2: ( relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1101:4: relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
			{
			pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn3883);
			relationalExpressionNoIn();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1101:29: ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
			loop29:
			do {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==EQ||LA29_0==NEQ||LA29_0==NSAME||LA29_0==SAME) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1101:31: ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn
					{
					if ( input.LA(1)==EQ||input.LA(1)==NEQ||input.LA(1)==NSAME||input.LA(1)==SAME ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn3905);
					relationalExpressionNoIn();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop29;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 32, equalityExpressionNoIn_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "equalityExpressionNoIn"


	public static class bitwiseANDExpression_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "bitwiseANDExpression"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1108:1: bitwiseANDExpression : equalityExpression ( AND equalityExpression )* ;
	public final ES3YUITestParser.bitwiseANDExpression_return bitwiseANDExpression() throws RecognitionException {
		ES3YUITestParser.bitwiseANDExpression_return retval = new ES3YUITestParser.bitwiseANDExpression_return();
		retval.start = input.LT(1);
		int bitwiseANDExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1109:2: ( equalityExpression ( AND equalityExpression )* )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1109:4: equalityExpression ( AND equalityExpression )*
			{
			pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression3925);
			equalityExpression();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1109:23: ( AND equalityExpression )*
			loop30:
			do {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==AND) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1109:25: AND equalityExpression
					{
					match(input,AND,FOLLOW_AND_in_bitwiseANDExpression3929); if (state.failed) return retval;
					pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression3931);
					equalityExpression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop30;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 33, bitwiseANDExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseANDExpression"


	public static class bitwiseANDExpressionNoIn_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "bitwiseANDExpressionNoIn"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1112:1: bitwiseANDExpressionNoIn : equalityExpressionNoIn ( AND equalityExpressionNoIn )* ;
	public final ES3YUITestParser.bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn() throws RecognitionException {
		ES3YUITestParser.bitwiseANDExpressionNoIn_return retval = new ES3YUITestParser.bitwiseANDExpressionNoIn_return();
		retval.start = input.LT(1);
		int bitwiseANDExpressionNoIn_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1113:2: ( equalityExpressionNoIn ( AND equalityExpressionNoIn )* )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1113:4: equalityExpressionNoIn ( AND equalityExpressionNoIn )*
			{
			pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn3945);
			equalityExpressionNoIn();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1113:27: ( AND equalityExpressionNoIn )*
			loop31:
			do {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==AND) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1113:29: AND equalityExpressionNoIn
					{
					match(input,AND,FOLLOW_AND_in_bitwiseANDExpressionNoIn3949); if (state.failed) return retval;
					pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn3951);
					equalityExpressionNoIn();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop31;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 34, bitwiseANDExpressionNoIn_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseANDExpressionNoIn"


	public static class bitwiseXORExpression_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "bitwiseXORExpression"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1116:1: bitwiseXORExpression : bitwiseANDExpression ( XOR bitwiseANDExpression )* ;
	public final ES3YUITestParser.bitwiseXORExpression_return bitwiseXORExpression() throws RecognitionException {
		ES3YUITestParser.bitwiseXORExpression_return retval = new ES3YUITestParser.bitwiseXORExpression_return();
		retval.start = input.LT(1);
		int bitwiseXORExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1117:2: ( bitwiseANDExpression ( XOR bitwiseANDExpression )* )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1117:4: bitwiseANDExpression ( XOR bitwiseANDExpression )*
			{
			pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression3967);
			bitwiseANDExpression();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1117:25: ( XOR bitwiseANDExpression )*
			loop32:
			do {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==XOR) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1117:27: XOR bitwiseANDExpression
					{
					match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpression3971); if (state.failed) return retval;
					pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression3973);
					bitwiseANDExpression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop32;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 35, bitwiseXORExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseXORExpression"


	public static class bitwiseXORExpressionNoIn_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "bitwiseXORExpressionNoIn"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1120:1: bitwiseXORExpressionNoIn : bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* ;
	public final ES3YUITestParser.bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn() throws RecognitionException {
		ES3YUITestParser.bitwiseXORExpressionNoIn_return retval = new ES3YUITestParser.bitwiseXORExpressionNoIn_return();
		retval.start = input.LT(1);
		int bitwiseXORExpressionNoIn_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1121:2: ( bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1121:4: bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )*
			{
			pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn3989);
			bitwiseANDExpressionNoIn();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1121:29: ( XOR bitwiseANDExpressionNoIn )*
			loop33:
			do {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==XOR) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1121:31: XOR bitwiseANDExpressionNoIn
					{
					match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpressionNoIn3993); if (state.failed) return retval;
					pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn3995);
					bitwiseANDExpressionNoIn();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop33;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 36, bitwiseXORExpressionNoIn_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseXORExpressionNoIn"


	public static class bitwiseORExpression_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "bitwiseORExpression"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1124:1: bitwiseORExpression : bitwiseXORExpression ( OR bitwiseXORExpression )* ;
	public final ES3YUITestParser.bitwiseORExpression_return bitwiseORExpression() throws RecognitionException {
		ES3YUITestParser.bitwiseORExpression_return retval = new ES3YUITestParser.bitwiseORExpression_return();
		retval.start = input.LT(1);
		int bitwiseORExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1125:2: ( bitwiseXORExpression ( OR bitwiseXORExpression )* )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1125:4: bitwiseXORExpression ( OR bitwiseXORExpression )*
			{
			pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4010);
			bitwiseXORExpression();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1125:25: ( OR bitwiseXORExpression )*
			loop34:
			do {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==OR) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1125:27: OR bitwiseXORExpression
					{
					match(input,OR,FOLLOW_OR_in_bitwiseORExpression4014); if (state.failed) return retval;
					pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4016);
					bitwiseXORExpression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop34;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 37, bitwiseORExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseORExpression"


	public static class bitwiseORExpressionNoIn_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "bitwiseORExpressionNoIn"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1128:1: bitwiseORExpressionNoIn : bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* ;
	public final ES3YUITestParser.bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn() throws RecognitionException {
		ES3YUITestParser.bitwiseORExpressionNoIn_return retval = new ES3YUITestParser.bitwiseORExpressionNoIn_return();
		retval.start = input.LT(1);
		int bitwiseORExpressionNoIn_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1129:2: ( bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1129:4: bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )*
			{
			pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4031);
			bitwiseXORExpressionNoIn();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1129:29: ( OR bitwiseXORExpressionNoIn )*
			loop35:
			do {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==OR) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1129:31: OR bitwiseXORExpressionNoIn
					{
					match(input,OR,FOLLOW_OR_in_bitwiseORExpressionNoIn4035); if (state.failed) return retval;
					pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4037);
					bitwiseXORExpressionNoIn();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop35;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 38, bitwiseORExpressionNoIn_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseORExpressionNoIn"


	public static class logicalANDExpression_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "logicalANDExpression"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1136:1: logicalANDExpression : bitwiseORExpression ( LAND bitwiseORExpression )* ;
	public final ES3YUITestParser.logicalANDExpression_return logicalANDExpression() throws RecognitionException {
		ES3YUITestParser.logicalANDExpression_return retval = new ES3YUITestParser.logicalANDExpression_return();
		retval.start = input.LT(1);
		int logicalANDExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1137:2: ( bitwiseORExpression ( LAND bitwiseORExpression )* )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1137:4: bitwiseORExpression ( LAND bitwiseORExpression )*
			{
			pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression4056);
			bitwiseORExpression();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1137:24: ( LAND bitwiseORExpression )*
			loop36:
			do {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==LAND) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1137:26: LAND bitwiseORExpression
					{
					match(input,LAND,FOLLOW_LAND_in_logicalANDExpression4060); if (state.failed) return retval;
					pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression4062);
					bitwiseORExpression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop36;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 39, logicalANDExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicalANDExpression"


	public static class logicalANDExpressionNoIn_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "logicalANDExpressionNoIn"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1140:1: logicalANDExpressionNoIn : bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* ;
	public final ES3YUITestParser.logicalANDExpressionNoIn_return logicalANDExpressionNoIn() throws RecognitionException {
		ES3YUITestParser.logicalANDExpressionNoIn_return retval = new ES3YUITestParser.logicalANDExpressionNoIn_return();
		retval.start = input.LT(1);
		int logicalANDExpressionNoIn_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1141:2: ( bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1141:4: bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )*
			{
			pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4076);
			bitwiseORExpressionNoIn();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1141:28: ( LAND bitwiseORExpressionNoIn )*
			loop37:
			do {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==LAND) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1141:30: LAND bitwiseORExpressionNoIn
					{
					match(input,LAND,FOLLOW_LAND_in_logicalANDExpressionNoIn4080); if (state.failed) return retval;
					pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4082);
					bitwiseORExpressionNoIn();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop37;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 40, logicalANDExpressionNoIn_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicalANDExpressionNoIn"


	public static class logicalORExpression_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "logicalORExpression"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1144:1: logicalORExpression : logicalANDExpression ( LOR logicalANDExpression )* ;
	public final ES3YUITestParser.logicalORExpression_return logicalORExpression() throws RecognitionException {
		ES3YUITestParser.logicalORExpression_return retval = new ES3YUITestParser.logicalORExpression_return();
		retval.start = input.LT(1);
		int logicalORExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1145:2: ( logicalANDExpression ( LOR logicalANDExpression )* )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1145:4: logicalANDExpression ( LOR logicalANDExpression )*
			{
			pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression4097);
			logicalANDExpression();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1145:25: ( LOR logicalANDExpression )*
			loop38:
			do {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==LOR) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1145:27: LOR logicalANDExpression
					{
					match(input,LOR,FOLLOW_LOR_in_logicalORExpression4101); if (state.failed) return retval;
					pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression4103);
					logicalANDExpression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop38;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 41, logicalORExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicalORExpression"


	public static class logicalORExpressionNoIn_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "logicalORExpressionNoIn"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1148:1: logicalORExpressionNoIn : logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* ;
	public final ES3YUITestParser.logicalORExpressionNoIn_return logicalORExpressionNoIn() throws RecognitionException {
		ES3YUITestParser.logicalORExpressionNoIn_return retval = new ES3YUITestParser.logicalORExpressionNoIn_return();
		retval.start = input.LT(1);
		int logicalORExpressionNoIn_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1149:2: ( logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1149:4: logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )*
			{
			pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4118);
			logicalANDExpressionNoIn();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1149:29: ( LOR logicalANDExpressionNoIn )*
			loop39:
			do {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==LOR) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1149:31: LOR logicalANDExpressionNoIn
					{
					match(input,LOR,FOLLOW_LOR_in_logicalORExpressionNoIn4122); if (state.failed) return retval;
					pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4124);
					logicalANDExpressionNoIn();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop39;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 42, logicalORExpressionNoIn_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicalORExpressionNoIn"


	public static class conditionalExpression_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "conditionalExpression"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1156:1: conditionalExpression : logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? ;
	public final ES3YUITestParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
		ES3YUITestParser.conditionalExpression_return retval = new ES3YUITestParser.conditionalExpression_return();
		retval.start = input.LT(1);
		int conditionalExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1157:2: ( logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1157:4: logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )?
			{
			pushFollow(FOLLOW_logicalORExpression_in_conditionalExpression4143);
			logicalORExpression();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1157:24: ( QUE assignmentExpression COLON assignmentExpression )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==QUE) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1157:26: QUE assignmentExpression COLON assignmentExpression
					{
					match(input,QUE,FOLLOW_QUE_in_conditionalExpression4147); if (state.failed) return retval;
					pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression4149);
					assignmentExpression();
					state._fsp--;
					if (state.failed) return retval;
					match(input,COLON,FOLLOW_COLON_in_conditionalExpression4151); if (state.failed) return retval;
					pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression4153);
					assignmentExpression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 43, conditionalExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "conditionalExpression"


	public static class conditionalExpressionNoIn_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "conditionalExpressionNoIn"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1160:1: conditionalExpressionNoIn : logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? ;
	public final ES3YUITestParser.conditionalExpressionNoIn_return conditionalExpressionNoIn() throws RecognitionException {
		ES3YUITestParser.conditionalExpressionNoIn_return retval = new ES3YUITestParser.conditionalExpressionNoIn_return();
		retval.start = input.LT(1);
		int conditionalExpressionNoIn_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1161:2: ( logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1161:4: logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
			{
			pushFollow(FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn4167);
			logicalORExpressionNoIn();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1161:28: ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==QUE) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1161:30: QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn
					{
					match(input,QUE,FOLLOW_QUE_in_conditionalExpressionNoIn4171); if (state.failed) return retval;
					pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4173);
					assignmentExpressionNoIn();
					state._fsp--;
					if (state.failed) return retval;
					match(input,COLON,FOLLOW_COLON_in_conditionalExpressionNoIn4175); if (state.failed) return retval;
					pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4177);
					assignmentExpressionNoIn();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 44, conditionalExpressionNoIn_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "conditionalExpressionNoIn"


	public static class assignmentExpression_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assignmentExpression"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1190:1: assignmentExpression : (lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? | leftHandSideExpression assignmentOperator assignmentExpression );
	public final ES3YUITestParser.assignmentExpression_return assignmentExpression() throws RecognitionException {
		ES3YUITestParser.assignmentExpression_return retval = new ES3YUITestParser.assignmentExpression_return();
		retval.start = input.LT(1);
		int assignmentExpression_StartIndex = input.index();

		ParserRuleReturnScope lhs =null;


			Object[] isLhs = new Object[1];

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1196:2: (lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? | leftHandSideExpression assignmentOperator assignmentExpression )
			int alt43=2;
			switch ( input.LA(1) ) {
			case THIS:
				{
				int LA43_1 = input.LA(2);
				if ( (synpred190_ES3YUITest()) ) {
					alt43=1;
				}
				else if ( (true) ) {
					alt43=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 43, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				int LA43_2 = input.LA(2);
				if ( (synpred190_ES3YUITest()) ) {
					alt43=1;
				}
				else if ( (true) ) {
					alt43=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 43, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case NULL:
				{
				int LA43_3 = input.LA(2);
				if ( (synpred190_ES3YUITest()) ) {
					alt43=1;
				}
				else if ( (true) ) {
					alt43=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 43, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case FALSE:
			case TRUE:
				{
				int LA43_4 = input.LA(2);
				if ( (synpred190_ES3YUITest()) ) {
					alt43=1;
				}
				else if ( (true) ) {
					alt43=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 43, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
				{
				int LA43_5 = input.LA(2);
				if ( (synpred190_ES3YUITest()) ) {
					alt43=1;
				}
				else if ( (true) ) {
					alt43=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 43, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case StringLiteral:
				{
				int LA43_6 = input.LA(2);
				if ( (synpred190_ES3YUITest()) ) {
					alt43=1;
				}
				else if ( (true) ) {
					alt43=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 43, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case RegularExpressionLiteral:
				{
				int LA43_7 = input.LA(2);
				if ( (synpred190_ES3YUITest()) ) {
					alt43=1;
				}
				else if ( (true) ) {
					alt43=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 43, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case LBRACK:
				{
				int LA43_8 = input.LA(2);
				if ( (synpred190_ES3YUITest()) ) {
					alt43=1;
				}
				else if ( (true) ) {
					alt43=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 43, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case LBRACE:
				{
				int LA43_9 = input.LA(2);
				if ( (synpred190_ES3YUITest()) ) {
					alt43=1;
				}
				else if ( (true) ) {
					alt43=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 43, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case LPAREN:
				{
				int LA43_10 = input.LA(2);
				if ( (synpred190_ES3YUITest()) ) {
					alt43=1;
				}
				else if ( (true) ) {
					alt43=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 43, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case FUNCTION:
				{
				int LA43_11 = input.LA(2);
				if ( (synpred190_ES3YUITest()) ) {
					alt43=1;
				}
				else if ( (true) ) {
					alt43=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 43, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case NEW:
				{
				int LA43_12 = input.LA(2);
				if ( (synpred190_ES3YUITest()) ) {
					alt43=1;
				}
				else if ( (true) ) {
					alt43=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 43, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case ADD:
			case DEC:
			case DELETE:
			case INC:
			case INV:
			case NOT:
			case SUB:
			case TYPEOF:
			case VOID:
				{
				alt43=1;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}
			switch (alt43) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1196:4: lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )?
					{
					pushFollow(FOLLOW_conditionalExpression_in_assignmentExpression4206);
					lhs=conditionalExpression();
					state._fsp--;
					if (state.failed) return retval;
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1196:30: ({...}? assignmentOperator assignmentExpression )?
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==ADDASS||LA42_0==ANDASS||LA42_0==ASSIGN||LA42_0==DIVASS||LA42_0==MODASS||LA42_0==MULASS||LA42_0==ORASS||LA42_0==SHLASS||LA42_0==SHRASS||LA42_0==SHUASS||LA42_0==SUBASS||LA42_0==XORASS) ) {
						int LA42_1 = input.LA(2);
						if ( (((( false )&&( false ))&&synpred189_ES3YUITest())) ) {
							alt42=1;
						}
					}
					switch (alt42) {
						case 1 :
							// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1196:32: {...}? assignmentOperator assignmentExpression
							{
							if ( !(( false )) ) {
								if (state.backtracking>0) {state.failed=true; return retval;}
								throw new FailedPredicateException(input, "assignmentExpression", " false ");
							}
							pushFollow(FOLLOW_assignmentOperator_in_assignmentExpression4212);
							assignmentOperator();
							state._fsp--;
							if (state.failed) return retval;
							pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression4214);
							assignmentExpression();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1197:4: leftHandSideExpression assignmentOperator assignmentExpression
					{
					pushFollow(FOLLOW_leftHandSideExpression_in_assignmentExpression4222);
					leftHandSideExpression();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_assignmentOperator_in_assignmentExpression4224);
					assignmentOperator();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression4226);
					assignmentExpression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 45, assignmentExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "assignmentExpression"


	public static class assignmentOperator_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assignmentOperator"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1201:1: assignmentOperator : ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS );
	public final ES3YUITestParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
		ES3YUITestParser.assignmentOperator_return retval = new ES3YUITestParser.assignmentOperator_return();
		retval.start = input.LT(1);
		int assignmentOperator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1202:2: ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:
			{
			if ( input.LA(1)==ADDASS||input.LA(1)==ANDASS||input.LA(1)==ASSIGN||input.LA(1)==DIVASS||input.LA(1)==MODASS||input.LA(1)==MULASS||input.LA(1)==ORASS||input.LA(1)==SHLASS||input.LA(1)==SHRASS||input.LA(1)==SHUASS||input.LA(1)==SUBASS||input.LA(1)==XORASS ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 46, assignmentOperator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "assignmentOperator"


	public static class assignmentExpressionNoIn_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assignmentExpressionNoIn"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1205:1: assignmentExpressionNoIn : lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? ;
	public final ES3YUITestParser.assignmentExpressionNoIn_return assignmentExpressionNoIn() throws RecognitionException {
		ES3YUITestParser.assignmentExpressionNoIn_return retval = new ES3YUITestParser.assignmentExpressionNoIn_return();
		retval.start = input.LT(1);
		int assignmentExpressionNoIn_StartIndex = input.index();

		ParserRuleReturnScope lhs =null;


			Object[] isLhs = new Object[1];

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1211:2: (lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1211:4: lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )?
			{
			pushFollow(FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn4302);
			lhs=conditionalExpressionNoIn();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1211:34: ({...}? assignmentOperator assignmentExpressionNoIn )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==ADDASS||LA44_0==ANDASS||LA44_0==ASSIGN||LA44_0==DIVASS||LA44_0==MODASS||LA44_0==MULASS||LA44_0==ORASS||LA44_0==SHLASS||LA44_0==SHRASS||LA44_0==SHUASS||LA44_0==SUBASS||LA44_0==XORASS) ) {
				int LA44_1 = input.LA(2);
				if ( (((( false )&&( false ))&&synpred202_ES3YUITest())) ) {
					alt44=1;
				}
			}
			switch (alt44) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1211:36: {...}? assignmentOperator assignmentExpressionNoIn
					{
					if ( !(( false )) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "assignmentExpressionNoIn", " false ");
					}
					pushFollow(FOLLOW_assignmentOperator_in_assignmentExpressionNoIn4308);
					assignmentOperator();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn4310);
					assignmentExpressionNoIn();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 47, assignmentExpressionNoIn_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "assignmentExpressionNoIn"


	public static class expression_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expression"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1219:1: expression :exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* ;
	public final ES3YUITestParser.expression_return expression() throws RecognitionException {
		ES3YUITestParser.expression_return retval = new ES3YUITestParser.expression_return();
		retval.start = input.LT(1);
		int expression_StartIndex = input.index();

		List<Object> list_exprs=null;
		RuleReturnScope exprs = null;
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1220:2: (exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1220:4: exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )*
			{
			pushFollow(FOLLOW_assignmentExpression_in_expression4333);
			exprs=assignmentExpression();
			state._fsp--;
			if (state.failed) return retval;
			if (list_exprs==null) list_exprs=new ArrayList<Object>();
			list_exprs.add(exprs.getTemplate());
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1220:32: ( COMMA exprs+= assignmentExpression )*
			loop45:
			do {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==COMMA) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1220:34: COMMA exprs+= assignmentExpression
					{
					match(input,COMMA,FOLLOW_COMMA_in_expression4337); if (state.failed) return retval;
					pushFollow(FOLLOW_assignmentExpression_in_expression4341);
					exprs=assignmentExpression();
					state._fsp--;
					if (state.failed) return retval;
					if (list_exprs==null) list_exprs=new ArrayList<Object>();
					list_exprs.add(exprs.getTemplate());
					}
					break;

				default :
					break loop45;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 48, expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class expressionNoIn_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expressionNoIn"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1225:1: expressionNoIn :exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* ;
	public final ES3YUITestParser.expressionNoIn_return expressionNoIn() throws RecognitionException {
		ES3YUITestParser.expressionNoIn_return retval = new ES3YUITestParser.expressionNoIn_return();
		retval.start = input.LT(1);
		int expressionNoIn_StartIndex = input.index();

		List<Object> list_exprs=null;
		RuleReturnScope exprs = null;
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1226:2: (exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1226:4: exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )*
			{
			pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4361);
			exprs=assignmentExpressionNoIn();
			state._fsp--;
			if (state.failed) return retval;
			if (list_exprs==null) list_exprs=new ArrayList<Object>();
			list_exprs.add(exprs.getTemplate());
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1226:36: ( COMMA exprs+= assignmentExpressionNoIn )*
			loop46:
			do {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==COMMA) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1226:38: COMMA exprs+= assignmentExpressionNoIn
					{
					match(input,COMMA,FOLLOW_COMMA_in_expressionNoIn4365); if (state.failed) return retval;
					pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4369);
					exprs=assignmentExpressionNoIn();
					state._fsp--;
					if (state.failed) return retval;
					if (list_exprs==null) list_exprs=new ArrayList<Object>();
					list_exprs.add(exprs.getTemplate());
					}
					break;

				default :
					break loop46;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 49, expressionNoIn_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expressionNoIn"


	public static class semic_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "semic"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1253:1: semic : ( SEMIC | EOF | RBRACE | EOL | MultiLineComment );
	public final ES3YUITestParser.semic_return semic() throws RecognitionException {
		ES3YUITestParser.semic_return retval = new ES3YUITestParser.semic_return();
		retval.start = input.LT(1);
		int semic_StartIndex = input.index();


			// Mark current position so we can unconsume a RBRACE.
			int marker = input.mark();
			// Promote EOL if appropriate	
			promoteEOL(retval);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1261:2: ( SEMIC | EOF | RBRACE | EOL | MultiLineComment )
			int alt47=5;
			switch ( input.LA(1) ) {
			case SEMIC:
				{
				alt47=1;
				}
				break;
			case EOF:
				{
				alt47=2;
				}
				break;
			case RBRACE:
				{
				alt47=3;
				}
				break;
			case EOL:
				{
				alt47=4;
				}
				break;
			case MultiLineComment:
				{
				alt47=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}
			switch (alt47) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1261:4: SEMIC
					{
					match(input,SEMIC,FOLLOW_SEMIC_in_semic4403); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1262:4: EOF
					{
					match(input,EOF,FOLLOW_EOF_in_semic4408); if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1263:4: RBRACE
					{
					match(input,RBRACE,FOLLOW_RBRACE_in_semic4413); if (state.failed) return retval;
					if ( state.backtracking==0 ) { input.rewind(marker); }
					}
					break;
				case 4 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1264:4: EOL
					{
					match(input,EOL,FOLLOW_EOL_in_semic4420); if (state.failed) return retval;
					}
					break;
				case 5 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1264:10: MultiLineComment
					{
					match(input,MultiLineComment,FOLLOW_MultiLineComment_in_semic4424); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 50, semic_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "semic"


	protected static class statement_scope {
		boolean isBlock;
		String currentFunc;
	}
	protected Stack<statement_scope> statement_stack = new Stack<statement_scope>();

	public static class statement_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "statement"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1272:1: statement options {k=1; } : ({...}? block | statementTail ) -> {instrument && !$statement::isBlock}? cover_line(src=$program::namecode=$textfuncName=$statement::currentFuncline=$start.getLine()) -> ignore(code=$text);
	public final ES3YUITestParser.statement_return statement() throws RecognitionException {
		statement_stack.push(new statement_scope());
		ES3YUITestParser.statement_return retval = new ES3YUITestParser.statement_return();
		retval.start = input.LT(1);
		int statement_StartIndex = input.index();


		    boolean instrument = false;
		       
			if (((Token)retval.start).getLine() > program_stack.peek().stopLine) {
				instrument = true;
				
			}	else {
		    	//System.out.print(((Token)retval.start).getLine()+","+ program_stack.peek().stopLine+"|");
			}
			
			if(functionDeclaration_stack.isEmpty() && functionExpression_stack.isEmpty()){
				statement_stack.peek().currentFunc = "";
			} else if(!functionDeclaration_stack.isEmpty()){
				statement_stack.peek().currentFunc = functionDeclaration_stack.peek().funcName;
			} else if(!functionExpression_stack.isEmpty()){
				statement_stack.peek().currentFunc = functionExpression_stack.peek().funcName;
			}		
			

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1313:2: ( ({...}? block | statementTail ) -> {instrument && !$statement::isBlock}? cover_line(src=$program::namecode=$textfuncName=$statement::currentFuncline=$start.getLine()) -> ignore(code=$text))
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1313:4: ({...}? block | statementTail )
			{
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1313:4: ({...}? block | statementTail )
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==LBRACE) ) {
				int LA48_1 = input.LA(2);
				if ( (((( statement_stack.peek().isBlock = input.LA(1) == LBRACE )&&( statement_stack.peek().isBlock = input.LA(1) == LBRACE ))&&synpred209_ES3YUITest())) ) {
					alt48=1;
				}
				else if ( (true) ) {
					alt48=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 48, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA48_0==ADD||LA48_0==BREAK||LA48_0==CONTINUE||LA48_0==DEC||LA48_0==DELETE||LA48_0==DO||LA48_0==DecimalLiteral||LA48_0==FALSE||LA48_0==FOR||LA48_0==FUNCTION||(LA48_0 >= HexIntegerLiteral && LA48_0 <= IF)||LA48_0==INC||LA48_0==INV||LA48_0==Identifier||LA48_0==LBRACK||LA48_0==LPAREN||(LA48_0 >= NEW && LA48_0 <= NOT)||LA48_0==NULL||LA48_0==OctalIntegerLiteral||LA48_0==RETURN||LA48_0==RegularExpressionLiteral||LA48_0==SEMIC||LA48_0==SUB||LA48_0==SWITCH||LA48_0==StringLiteral||(LA48_0 >= THIS && LA48_0 <= THROW)||(LA48_0 >= TRUE && LA48_0 <= TYPEOF)||(LA48_0 >= VAR && LA48_0 <= VOID)||(LA48_0 >= WHILE && LA48_0 <= WITH)) ) {
				alt48=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}
			switch (alt48) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1313:5: {...}? block
					{
					if ( !(( statement_stack.peek().isBlock = input.LA(1) == LBRACE )) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "statement", " $statement::isBlock = input.LA(1) == LBRACE ");
					}
					pushFollow(FOLLOW_block_in_statement4467);
					block();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1313:62: statementTail
					{
					pushFollow(FOLLOW_statementTail_in_statement4471);
					statementTail();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 1314:4: -> {instrument && !$statement::isBlock}? cover_line(src=$program::namecode=$textfuncName=$statement::currentFuncline=$start.getLine())
			  if (instrument && !statement_stack.peek().isBlock) {
			  	retval.st = templateLib.getInstanceOf("cover_line",new STAttrMap().put("src", program_stack.peek().name).put("code", input.toString(retval.start,input.LT(-1))).put("funcName", statement_stack.peek().currentFunc).put("line", ((Token)retval.start).getLine()));
			  }

			  else // 1315:4: -> ignore(code=$text)
			  {
			  	retval.st = templateLib.getInstanceOf("ignore",new STAttrMap().put("code", input.toString(retval.start,input.LT(-1))));
			  }


			  ((TokenRewriteStream)input).replace(
			    ((Token)retval.start).getTokenIndex(),
			    input.LT(-1).getTokenIndex(),
			    retval.st);

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {	
				
			        if (instrument && !statement_stack.peek().isBlock) {
						program_stack.peek().stopLine = ((Token)retval.start).getLine();	
						program_stack.peek().executableLines.add(((Token)retval.start).getLine());
			        }
			        
			        
			        
				if (verbose){
					System.err.println("\n[INFO] Instrumenting statement on line " + ((Token)retval.start).getLine());
				}
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 51, statement_StartIndex); }

			statement_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class statementTail_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "statementTail"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1318:1: statementTail : ( variableStatement | objectDeclaration | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement );
	public final ES3YUITestParser.statementTail_return statementTail() throws RecognitionException {
		ES3YUITestParser.statementTail_return retval = new ES3YUITestParser.statementTail_return();
		retval.start = input.LT(1);
		int statementTail_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1319:2: ( variableStatement | objectDeclaration | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement )
			int alt49=14;
			switch ( input.LA(1) ) {
			case VAR:
				{
				alt49=1;
				}
				break;
			case THIS:
				{
				int LA49_2 = input.LA(2);
				if ( (synpred211_ES3YUITest()) ) {
					alt49=2;
				}
				else if ( (synpred213_ES3YUITest()) ) {
					alt49=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 49, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				int LA49_3 = input.LA(2);
				if ( (synpred211_ES3YUITest()) ) {
					alt49=2;
				}
				else if ( (synpred213_ES3YUITest()) ) {
					alt49=4;
				}
				else if ( (synpred220_ES3YUITest()) ) {
					alt49=11;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 49, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case NULL:
				{
				int LA49_4 = input.LA(2);
				if ( (synpred211_ES3YUITest()) ) {
					alt49=2;
				}
				else if ( (synpred213_ES3YUITest()) ) {
					alt49=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 49, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case FALSE:
			case TRUE:
				{
				int LA49_5 = input.LA(2);
				if ( (synpred211_ES3YUITest()) ) {
					alt49=2;
				}
				else if ( (synpred213_ES3YUITest()) ) {
					alt49=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 49, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
				{
				int LA49_6 = input.LA(2);
				if ( (synpred211_ES3YUITest()) ) {
					alt49=2;
				}
				else if ( (synpred213_ES3YUITest()) ) {
					alt49=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 49, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case StringLiteral:
				{
				int LA49_7 = input.LA(2);
				if ( (synpred211_ES3YUITest()) ) {
					alt49=2;
				}
				else if ( (synpred213_ES3YUITest()) ) {
					alt49=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 49, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case RegularExpressionLiteral:
				{
				int LA49_8 = input.LA(2);
				if ( (synpred211_ES3YUITest()) ) {
					alt49=2;
				}
				else if ( (synpred213_ES3YUITest()) ) {
					alt49=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 49, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case LBRACK:
				{
				int LA49_9 = input.LA(2);
				if ( (synpred211_ES3YUITest()) ) {
					alt49=2;
				}
				else if ( (synpred213_ES3YUITest()) ) {
					alt49=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 49, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case LBRACE:
				{
				int LA49_10 = input.LA(2);
				if ( (synpred211_ES3YUITest()) ) {
					alt49=2;
				}
				else if ( (synpred213_ES3YUITest()) ) {
					alt49=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 49, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case LPAREN:
				{
				int LA49_11 = input.LA(2);
				if ( (synpred211_ES3YUITest()) ) {
					alt49=2;
				}
				else if ( (synpred213_ES3YUITest()) ) {
					alt49=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 49, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case FUNCTION:
				{
				int LA49_12 = input.LA(2);
				if ( (synpred211_ES3YUITest()) ) {
					alt49=2;
				}
				else if ( (synpred213_ES3YUITest()) ) {
					alt49=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 49, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case NEW:
				{
				int LA49_13 = input.LA(2);
				if ( (synpred211_ES3YUITest()) ) {
					alt49=2;
				}
				else if ( (synpred213_ES3YUITest()) ) {
					alt49=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 49, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case SEMIC:
				{
				alt49=3;
				}
				break;
			case ADD:
			case DEC:
			case DELETE:
			case INC:
			case INV:
			case NOT:
			case SUB:
			case TYPEOF:
			case VOID:
				{
				alt49=4;
				}
				break;
			case IF:
				{
				alt49=5;
				}
				break;
			case DO:
			case FOR:
			case WHILE:
				{
				alt49=6;
				}
				break;
			case CONTINUE:
				{
				alt49=7;
				}
				break;
			case BREAK:
				{
				alt49=8;
				}
				break;
			case RETURN:
				{
				alt49=9;
				}
				break;
			case WITH:
				{
				alt49=10;
				}
				break;
			case SWITCH:
				{
				alt49=12;
				}
				break;
			case THROW:
				{
				alt49=13;
				}
				break;
			case TRY:
				{
				alt49=14;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}
			switch (alt49) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1319:4: variableStatement
					{
					pushFollow(FOLLOW_variableStatement_in_statementTail4528);
					variableStatement();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1320:4: objectDeclaration
					{
					pushFollow(FOLLOW_objectDeclaration_in_statementTail4533);
					objectDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1321:4: emptyStatement
					{
					pushFollow(FOLLOW_emptyStatement_in_statementTail4538);
					emptyStatement();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 4 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1322:4: expressionStatement
					{
					pushFollow(FOLLOW_expressionStatement_in_statementTail4543);
					expressionStatement();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 5 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1323:4: ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statementTail4548);
					ifStatement();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 6 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1324:4: iterationStatement
					{
					pushFollow(FOLLOW_iterationStatement_in_statementTail4553);
					iterationStatement();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 7 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1325:4: continueStatement
					{
					pushFollow(FOLLOW_continueStatement_in_statementTail4558);
					continueStatement();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 8 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1326:4: breakStatement
					{
					pushFollow(FOLLOW_breakStatement_in_statementTail4563);
					breakStatement();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 9 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1327:4: returnStatement
					{
					pushFollow(FOLLOW_returnStatement_in_statementTail4568);
					returnStatement();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 10 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1328:4: withStatement
					{
					pushFollow(FOLLOW_withStatement_in_statementTail4573);
					withStatement();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 11 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1329:4: labelledStatement
					{
					pushFollow(FOLLOW_labelledStatement_in_statementTail4578);
					labelledStatement();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 12 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1330:4: switchStatement
					{
					pushFollow(FOLLOW_switchStatement_in_statementTail4583);
					switchStatement();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 13 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1331:4: throwStatement
					{
					pushFollow(FOLLOW_throwStatement_in_statementTail4588);
					throwStatement();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 14 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1332:4: tryStatement
					{
					pushFollow(FOLLOW_tryStatement_in_statementTail4593);
					tryStatement();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 52, statementTail_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "statementTail"


	public static class block_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "block"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1337:1: block : lb= LBRACE ( statement )* RBRACE ;
	public final ES3YUITestParser.block_return block() throws RecognitionException {
		ES3YUITestParser.block_return retval = new ES3YUITestParser.block_return();
		retval.start = input.LT(1);
		int block_StartIndex = input.index();

		Token lb=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1338:2: (lb= LBRACE ( statement )* RBRACE )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1338:4: lb= LBRACE ( statement )* RBRACE
			{
			lb=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block4608); if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1338:14: ( statement )*
			loop50:
			do {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==ADD||LA50_0==BREAK||LA50_0==CONTINUE||LA50_0==DEC||LA50_0==DELETE||LA50_0==DO||LA50_0==DecimalLiteral||LA50_0==FALSE||LA50_0==FOR||LA50_0==FUNCTION||(LA50_0 >= HexIntegerLiteral && LA50_0 <= IF)||LA50_0==INC||LA50_0==INV||LA50_0==Identifier||(LA50_0 >= LBRACE && LA50_0 <= LBRACK)||LA50_0==LPAREN||(LA50_0 >= NEW && LA50_0 <= NOT)||LA50_0==NULL||LA50_0==OctalIntegerLiteral||LA50_0==RETURN||LA50_0==RegularExpressionLiteral||LA50_0==SEMIC||LA50_0==SUB||LA50_0==SWITCH||LA50_0==StringLiteral||(LA50_0 >= THIS && LA50_0 <= THROW)||(LA50_0 >= TRUE && LA50_0 <= TYPEOF)||(LA50_0 >= VAR && LA50_0 <= VOID)||(LA50_0 >= WHILE && LA50_0 <= WITH)) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1338:14: statement
					{
					pushFollow(FOLLOW_statement_in_block4610);
					statement();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop50;
				}
			} while (true);

			match(input,RBRACE,FOLLOW_RBRACE_in_block4613); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 53, block_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "block"


	public static class variableStatement_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "variableStatement"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1346:1: variableStatement : VAR variableDeclaration ( COMMA variableDeclaration )* semic ;
	public final ES3YUITestParser.variableStatement_return variableStatement() throws RecognitionException {
		ES3YUITestParser.variableStatement_return retval = new ES3YUITestParser.variableStatement_return();
		retval.start = input.LT(1);
		int variableStatement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1347:2: ( VAR variableDeclaration ( COMMA variableDeclaration )* semic )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1347:4: VAR variableDeclaration ( COMMA variableDeclaration )* semic
			{
			match(input,VAR,FOLLOW_VAR_in_variableStatement4631); if (state.failed) return retval;
			pushFollow(FOLLOW_variableDeclaration_in_variableStatement4633);
			variableDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1347:28: ( COMMA variableDeclaration )*
			loop51:
			do {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==COMMA) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1347:30: COMMA variableDeclaration
					{
					match(input,COMMA,FOLLOW_COMMA_in_variableStatement4637); if (state.failed) return retval;
					pushFollow(FOLLOW_variableDeclaration_in_variableStatement4639);
					variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop51;
				}
			} while (true);

			pushFollow(FOLLOW_semic_in_variableStatement4644);
			semic();
			state._fsp--;
			if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 54, variableStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableStatement"


	public static class variableDeclaration_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "variableDeclaration"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1351:1: variableDeclaration : Identifier ( ASSIGN assignmentExpression )? ;
	public final ES3YUITestParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
		ES3YUITestParser.variableDeclaration_return retval = new ES3YUITestParser.variableDeclaration_return();
		retval.start = input.LT(1);
		int variableDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1352:2: ( Identifier ( ASSIGN assignmentExpression )? )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1352:4: Identifier ( ASSIGN assignmentExpression )?
			{
			match(input,Identifier,FOLLOW_Identifier_in_variableDeclaration4657); if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1352:15: ( ASSIGN assignmentExpression )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==ASSIGN) ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1352:17: ASSIGN assignmentExpression
					{
					match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclaration4661); if (state.failed) return retval;
					pushFollow(FOLLOW_assignmentExpression_in_variableDeclaration4663);
					assignmentExpression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 55, variableDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableDeclaration"


	public static class variableDeclarationNoIn_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "variableDeclarationNoIn"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1355:1: variableDeclarationNoIn : Identifier ( ASSIGN assignmentExpressionNoIn )? ;
	public final ES3YUITestParser.variableDeclarationNoIn_return variableDeclarationNoIn() throws RecognitionException {
		ES3YUITestParser.variableDeclarationNoIn_return retval = new ES3YUITestParser.variableDeclarationNoIn_return();
		retval.start = input.LT(1);
		int variableDeclarationNoIn_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1356:2: ( Identifier ( ASSIGN assignmentExpressionNoIn )? )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1356:4: Identifier ( ASSIGN assignmentExpressionNoIn )?
			{
			match(input,Identifier,FOLLOW_Identifier_in_variableDeclarationNoIn4678); if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1356:15: ( ASSIGN assignmentExpressionNoIn )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==ASSIGN) ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1356:17: ASSIGN assignmentExpressionNoIn
					{
					match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclarationNoIn4682); if (state.failed) return retval;
					pushFollow(FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn4684);
					assignmentExpressionNoIn();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 56, variableDeclarationNoIn_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableDeclarationNoIn"


	public static class emptyStatement_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "emptyStatement"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1363:1: emptyStatement : SEMIC ;
	public final ES3YUITestParser.emptyStatement_return emptyStatement() throws RecognitionException {
		ES3YUITestParser.emptyStatement_return retval = new ES3YUITestParser.emptyStatement_return();
		retval.start = input.LT(1);
		int emptyStatement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1364:2: ( SEMIC )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1364:4: SEMIC
			{
			match(input,SEMIC,FOLLOW_SEMIC_in_emptyStatement4703); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 57, emptyStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "emptyStatement"


	public static class expressionStatement_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expressionStatement"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1377:1: expressionStatement : expression semic ;
	public final ES3YUITestParser.expressionStatement_return expressionStatement() throws RecognitionException {
		ES3YUITestParser.expressionStatement_return retval = new ES3YUITestParser.expressionStatement_return();
		retval.start = input.LT(1);
		int expressionStatement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1378:2: ( expression semic )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1378:4: expression semic
			{
			pushFollow(FOLLOW_expression_in_expressionStatement4721);
			expression();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_semic_in_expressionStatement4723);
			semic();
			state._fsp--;
			if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 58, expressionStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expressionStatement"


	public static class ifStatement_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "ifStatement"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1386:1: ifStatement : IF LPAREN expression RPAREN statement ({...}? elseStatement )? -> template(p=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)body=wrapInBraces($statement.start, $statement.stop, input)elseClause=\r\n\t $elseStatement.stop != null ? input.toString($statement.stop.getTokenIndex()+1, $elseStatement.stop.getTokenIndex() ) : null) \"<p><body><elseClause>\";
	public final ES3YUITestParser.ifStatement_return ifStatement() throws RecognitionException {
		ES3YUITestParser.ifStatement_return retval = new ES3YUITestParser.ifStatement_return();
		retval.start = input.LT(1);
		int ifStatement_StartIndex = input.index();

		ParserRuleReturnScope statement1 =null;
		ParserRuleReturnScope elseStatement2 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1388:2: ( IF LPAREN expression RPAREN statement ({...}? elseStatement )? -> template(p=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)body=wrapInBraces($statement.start, $statement.stop, input)elseClause=\r\n\t $elseStatement.stop != null ? input.toString($statement.stop.getTokenIndex()+1, $elseStatement.stop.getTokenIndex() ) : null) \"<p><body><elseClause>\")
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1388:4: IF LPAREN expression RPAREN statement ({...}? elseStatement )?
			{
			match(input,IF,FOLLOW_IF_in_ifStatement4741); if (state.failed) return retval;
			match(input,LPAREN,FOLLOW_LPAREN_in_ifStatement4743); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_ifStatement4745);
			expression();
			state._fsp--;
			if (state.failed) return retval;
			match(input,RPAREN,FOLLOW_RPAREN_in_ifStatement4747); if (state.failed) return retval;
			pushFollow(FOLLOW_statement_in_ifStatement4749);
			statement1=statement();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1388:42: ({...}? elseStatement )?
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==ELSE) ) {
				int LA54_1 = input.LA(2);
				if ( (((synpred227_ES3YUITest()&&synpred227_ES3YUITest())&&( input.LA(1) == ELSE ))) ) {
					alt54=1;
				}
			}
			switch (alt54) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1388:44: {...}? elseStatement
					{
					if ( !(( input.LA(1) == ELSE )) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "ifStatement", " input.LA(1) == ELSE ");
					}
					pushFollow(FOLLOW_elseStatement_in_ifStatement4755);
					elseStatement2=elseStatement();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 1390:2: -> template(p=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)body=wrapInBraces($statement.start, $statement.stop, input)elseClause=\r\n\t $elseStatement.stop != null ? input.toString($statement.stop.getTokenIndex()+1, $elseStatement.stop.getTokenIndex() ) : null) \"<p><body><elseClause>\"
			  {
			  	retval.st = new StringTemplate(templateLib, "<p><body><elseClause>",new STAttrMap().put("p", input.toString(((Token)retval.start).getTokenIndex(), (statement1!=null?((Token)statement1.start):null).getTokenIndex() - 1)).put("body", wrapInBraces((statement1!=null?((Token)statement1.start):null), (statement1!=null?((Token)statement1.stop):null), input)).put("elseClause", 
			  	             (elseStatement2!=null?((Token)elseStatement2.stop):null) != null ? input.toString((statement1!=null?((Token)statement1.stop):null).getTokenIndex()+1, (elseStatement2!=null?((Token)elseStatement2.stop):null).getTokenIndex() ) : null));
			  }


			  ((TokenRewriteStream)input).replace(
			    ((Token)retval.start).getTokenIndex(),
			    input.LT(-1).getTokenIndex(),
			    retval.st);

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 59, ifStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "ifStatement"


	public static class elseStatement_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "elseStatement"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1396:1: elseStatement : ELSE statement -> template(prefix=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)) \"<prefix><stmt>\";
	public final ES3YUITestParser.elseStatement_return elseStatement() throws RecognitionException {
		ES3YUITestParser.elseStatement_return retval = new ES3YUITestParser.elseStatement_return();
		retval.start = input.LT(1);
		int elseStatement_StartIndex = input.index();

		ParserRuleReturnScope statement3 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1397:2: ( ELSE statement -> template(prefix=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)) \"<prefix><stmt>\")
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1397:4: ELSE statement
			{
			match(input,ELSE,FOLLOW_ELSE_in_elseStatement4827); if (state.failed) return retval;
			pushFollow(FOLLOW_statement_in_elseStatement4829);
			statement3=statement();
			state._fsp--;
			if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 1398:2: -> template(prefix=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)) \"<prefix><stmt>\"
			  {
			  	retval.st = new StringTemplate(templateLib, "<prefix><stmt>",new STAttrMap().put("prefix", input.toString(((Token)retval.start).getTokenIndex(), (statement3!=null?((Token)statement3.start):null).getTokenIndex() - 1)).put("stmt", wrapInBraces((statement3!=null?((Token)statement3.start):null), (statement3!=null?((Token)statement3.stop):null), input)));
			  }


			  ((TokenRewriteStream)input).replace(
			    ((Token)retval.start).getTokenIndex(),
			    input.LT(-1).getTokenIndex(),
			    retval.st);

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 60, elseStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "elseStatement"


	public static class iterationStatement_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "iterationStatement"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1405:1: iterationStatement : ( doStatement | whileStatement | forStatement );
	public final ES3YUITestParser.iterationStatement_return iterationStatement() throws RecognitionException {
		ES3YUITestParser.iterationStatement_return retval = new ES3YUITestParser.iterationStatement_return();
		retval.start = input.LT(1);
		int iterationStatement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1406:2: ( doStatement | whileStatement | forStatement )
			int alt55=3;
			switch ( input.LA(1) ) {
			case DO:
				{
				alt55=1;
				}
				break;
			case WHILE:
				{
				alt55=2;
				}
				break;
			case FOR:
				{
				alt55=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}
			switch (alt55) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1406:4: doStatement
					{
					pushFollow(FOLLOW_doStatement_in_iterationStatement4866);
					doStatement();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1407:4: whileStatement
					{
					pushFollow(FOLLOW_whileStatement_in_iterationStatement4871);
					whileStatement();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1408:4: forStatement
					{
					pushFollow(FOLLOW_forStatement_in_iterationStatement4876);
					forStatement();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 61, iterationStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "iterationStatement"


	public static class doStatement_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "doStatement"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1411:1: doStatement : DO statement WHILE LPAREN expression RPAREN semic -> template(pre=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)post=input.toString($WHILE, $RPAREN)end=$semic.text) \"<pre><stmt><post><end>\";
	public final ES3YUITestParser.doStatement_return doStatement() throws RecognitionException {
		ES3YUITestParser.doStatement_return retval = new ES3YUITestParser.doStatement_return();
		retval.start = input.LT(1);
		int doStatement_StartIndex = input.index();

		Token WHILE5=null;
		Token RPAREN6=null;
		ParserRuleReturnScope statement4 =null;
		ParserRuleReturnScope semic7 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1412:2: ( DO statement WHILE LPAREN expression RPAREN semic -> template(pre=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)post=input.toString($WHILE, $RPAREN)end=$semic.text) \"<pre><stmt><post><end>\")
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1412:4: DO statement WHILE LPAREN expression RPAREN semic
			{
			match(input,DO,FOLLOW_DO_in_doStatement4888); if (state.failed) return retval;
			pushFollow(FOLLOW_statement_in_doStatement4890);
			statement4=statement();
			state._fsp--;
			if (state.failed) return retval;
			WHILE5=(Token)match(input,WHILE,FOLLOW_WHILE_in_doStatement4892); if (state.failed) return retval;
			match(input,LPAREN,FOLLOW_LPAREN_in_doStatement4894); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_doStatement4896);
			expression();
			state._fsp--;
			if (state.failed) return retval;
			RPAREN6=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_doStatement4898); if (state.failed) return retval;
			pushFollow(FOLLOW_semic_in_doStatement4900);
			semic7=semic();
			state._fsp--;
			if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 1413:2: -> template(pre=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)post=input.toString($WHILE, $RPAREN)end=$semic.text) \"<pre><stmt><post><end>\"
			  {
			  	retval.st = new StringTemplate(templateLib, "<pre><stmt><post><end>",new STAttrMap().put("pre", input.toString(((Token)retval.start).getTokenIndex(), (statement4!=null?((Token)statement4.start):null).getTokenIndex() - 1)).put("stmt", wrapInBraces((statement4!=null?((Token)statement4.start):null), (statement4!=null?((Token)statement4.stop):null), input)).put("post", input.toString(WHILE5, RPAREN6)).put("end", (semic7!=null?input.toString(semic7.start,semic7.stop):null)));
			  }


			  ((TokenRewriteStream)input).replace(
			    ((Token)retval.start).getTokenIndex(),
			    input.LT(-1).getTokenIndex(),
			    retval.st);

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 62, doStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "doStatement"


	public static class whileStatement_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "whileStatement"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1419:1: whileStatement : WHILE LPAREN expression RPAREN statement -> template(pre=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)) \"<pre><stmt>\";
	public final ES3YUITestParser.whileStatement_return whileStatement() throws RecognitionException {
		ES3YUITestParser.whileStatement_return retval = new ES3YUITestParser.whileStatement_return();
		retval.start = input.LT(1);
		int whileStatement_StartIndex = input.index();

		ParserRuleReturnScope statement8 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1420:2: ( WHILE LPAREN expression RPAREN statement -> template(pre=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)) \"<pre><stmt>\")
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1420:4: WHILE LPAREN expression RPAREN statement
			{
			match(input,WHILE,FOLLOW_WHILE_in_whileStatement4986); if (state.failed) return retval;
			match(input,LPAREN,FOLLOW_LPAREN_in_whileStatement4988); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_whileStatement4990);
			expression();
			state._fsp--;
			if (state.failed) return retval;
			match(input,RPAREN,FOLLOW_RPAREN_in_whileStatement4992); if (state.failed) return retval;
			pushFollow(FOLLOW_statement_in_whileStatement4994);
			statement8=statement();
			state._fsp--;
			if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 1421:2: -> template(pre=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)) \"<pre><stmt>\"
			  {
			  	retval.st = new StringTemplate(templateLib, "<pre><stmt>",new STAttrMap().put("pre", input.toString(((Token)retval.start).getTokenIndex(), (statement8!=null?((Token)statement8.start):null).getTokenIndex() - 1)).put("stmt", wrapInBraces((statement8!=null?((Token)statement8.start):null), (statement8!=null?((Token)statement8.stop):null), input)));
			  }


			  ((TokenRewriteStream)input).replace(
			    ((Token)retval.start).getTokenIndex(),
			    input.LT(-1).getTokenIndex(),
			    retval.st);

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 63, whileStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "whileStatement"


	public static class forStatement_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "forStatement"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1467:1: forStatement : FOR LPAREN forControl RPAREN statement -> template(pre=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)) \"<pre><stmt>\";
	public final ES3YUITestParser.forStatement_return forStatement() throws RecognitionException {
		ES3YUITestParser.forStatement_return retval = new ES3YUITestParser.forStatement_return();
		retval.start = input.LT(1);
		int forStatement_StartIndex = input.index();

		ParserRuleReturnScope statement9 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1468:2: ( FOR LPAREN forControl RPAREN statement -> template(pre=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)) \"<pre><stmt>\")
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1468:4: FOR LPAREN forControl RPAREN statement
			{
			match(input,FOR,FOLLOW_FOR_in_forStatement5055); if (state.failed) return retval;
			match(input,LPAREN,FOLLOW_LPAREN_in_forStatement5057); if (state.failed) return retval;
			pushFollow(FOLLOW_forControl_in_forStatement5059);
			forControl();
			state._fsp--;
			if (state.failed) return retval;
			match(input,RPAREN,FOLLOW_RPAREN_in_forStatement5061); if (state.failed) return retval;
			pushFollow(FOLLOW_statement_in_forStatement5063);
			statement9=statement();
			state._fsp--;
			if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 1469:2: -> template(pre=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)) \"<pre><stmt>\"
			  {
			  	retval.st = new StringTemplate(templateLib, "<pre><stmt>",new STAttrMap().put("pre", input.toString(((Token)retval.start).getTokenIndex(), (statement9!=null?((Token)statement9.start):null).getTokenIndex() - 1)).put("stmt", wrapInBraces((statement9!=null?((Token)statement9.start):null), (statement9!=null?((Token)statement9.stop):null), input)));
			  }


			  ((TokenRewriteStream)input).replace(
			    ((Token)retval.start).getTokenIndex(),
			    input.LT(-1).getTokenIndex(),
			    retval.st);

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 64, forStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forStatement"


	public static class forControl_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "forControl"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1474:1: forControl : ( forControlVar | forControlExpression | forControlSemic );
	public final ES3YUITestParser.forControl_return forControl() throws RecognitionException {
		ES3YUITestParser.forControl_return retval = new ES3YUITestParser.forControl_return();
		retval.start = input.LT(1);
		int forControl_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1475:2: ( forControlVar | forControlExpression | forControlSemic )
			int alt56=3;
			switch ( input.LA(1) ) {
			case VAR:
				{
				alt56=1;
				}
				break;
			case ADD:
			case DEC:
			case DELETE:
			case DecimalLiteral:
			case FALSE:
			case FUNCTION:
			case HexIntegerLiteral:
			case INC:
			case INV:
			case Identifier:
			case LBRACE:
			case LBRACK:
			case LPAREN:
			case NEW:
			case NOT:
			case NULL:
			case OctalIntegerLiteral:
			case RegularExpressionLiteral:
			case SUB:
			case StringLiteral:
			case THIS:
			case TRUE:
			case TYPEOF:
			case VOID:
				{
				alt56=2;
				}
				break;
			case SEMIC:
				{
				alt56=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				throw nvae;
			}
			switch (alt56) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1475:4: forControlVar
					{
					pushFollow(FOLLOW_forControlVar_in_forControl5122);
					forControlVar();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1476:4: forControlExpression
					{
					pushFollow(FOLLOW_forControlExpression_in_forControl5127);
					forControlExpression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1477:4: forControlSemic
					{
					pushFollow(FOLLOW_forControlSemic_in_forControl5132);
					forControlSemic();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 65, forControl_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forControl"


	public static class forControlVar_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "forControlVar"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1480:1: forControlVar : VAR variableDeclarationNoIn ( ( IN expression ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? ) ) ;
	public final ES3YUITestParser.forControlVar_return forControlVar() throws RecognitionException {
		ES3YUITestParser.forControlVar_return retval = new ES3YUITestParser.forControlVar_return();
		retval.start = input.LT(1);
		int forControlVar_StartIndex = input.index();

		ParserRuleReturnScope ex1 =null;
		ParserRuleReturnScope ex2 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1481:2: ( VAR variableDeclarationNoIn ( ( IN expression ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? ) ) )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1481:4: VAR variableDeclarationNoIn ( ( IN expression ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? ) )
			{
			match(input,VAR,FOLLOW_VAR_in_forControlVar5143); if (state.failed) return retval;
			pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar5145);
			variableDeclarationNoIn();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1482:2: ( ( IN expression ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? ) )
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==IN) ) {
				alt60=1;
			}
			else if ( (LA60_0==COMMA||LA60_0==SEMIC) ) {
				alt60=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				throw nvae;
			}
			switch (alt60) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1483:3: ( IN expression )
					{
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1483:3: ( IN expression )
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1484:4: IN expression
					{
					match(input,IN,FOLLOW_IN_in_forControlVar5157); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_forControlVar5159);
					expression();
					state._fsp--;
					if (state.failed) return retval;
					}

					}
					break;
				case 2 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1488:3: ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? )
					{
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1488:3: ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? )
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1489:4: ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )?
					{
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1489:4: ( COMMA variableDeclarationNoIn )*
					loop57:
					do {
						int alt57=2;
						int LA57_0 = input.LA(1);
						if ( (LA57_0==COMMA) ) {
							alt57=1;
						}

						switch (alt57) {
						case 1 :
							// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1489:6: COMMA variableDeclarationNoIn
							{
							match(input,COMMA,FOLLOW_COMMA_in_forControlVar5182); if (state.failed) return retval;
							pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar5184);
							variableDeclarationNoIn();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

						default :
							break loop57;
						}
					} while (true);

					match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar5189); if (state.failed) return retval;
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1489:48: (ex1= expression )?
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==ADD||LA58_0==DEC||LA58_0==DELETE||LA58_0==DecimalLiteral||LA58_0==FALSE||LA58_0==FUNCTION||LA58_0==HexIntegerLiteral||LA58_0==INC||LA58_0==INV||LA58_0==Identifier||(LA58_0 >= LBRACE && LA58_0 <= LBRACK)||LA58_0==LPAREN||(LA58_0 >= NEW && LA58_0 <= NOT)||LA58_0==NULL||LA58_0==OctalIntegerLiteral||LA58_0==RegularExpressionLiteral||LA58_0==SUB||LA58_0==StringLiteral||LA58_0==THIS||LA58_0==TRUE||LA58_0==TYPEOF||LA58_0==VOID) ) {
						alt58=1;
					}
					switch (alt58) {
						case 1 :
							// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1489:48: ex1= expression
							{
							pushFollow(FOLLOW_expression_in_forControlVar5193);
							ex1=expression();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar5196); if (state.failed) return retval;
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1489:70: (ex2= expression )?
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==ADD||LA59_0==DEC||LA59_0==DELETE||LA59_0==DecimalLiteral||LA59_0==FALSE||LA59_0==FUNCTION||LA59_0==HexIntegerLiteral||LA59_0==INC||LA59_0==INV||LA59_0==Identifier||(LA59_0 >= LBRACE && LA59_0 <= LBRACK)||LA59_0==LPAREN||(LA59_0 >= NEW && LA59_0 <= NOT)||LA59_0==NULL||LA59_0==OctalIntegerLiteral||LA59_0==RegularExpressionLiteral||LA59_0==SUB||LA59_0==StringLiteral||LA59_0==THIS||LA59_0==TRUE||LA59_0==TYPEOF||LA59_0==VOID) ) {
						alt59=1;
					}
					switch (alt59) {
						case 1 :
							// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1489:70: ex2= expression
							{
							pushFollow(FOLLOW_expression_in_forControlVar5200);
							ex2=expression();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 66, forControlVar_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forControlVar"


	public static class forControlExpression_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "forControlExpression"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1495:1: forControlExpression : ex1= expressionNoIn ({...}? ( IN ex2= expression ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? ) ) ;
	public final ES3YUITestParser.forControlExpression_return forControlExpression() throws RecognitionException {
		ES3YUITestParser.forControlExpression_return retval = new ES3YUITestParser.forControlExpression_return();
		retval.start = input.LT(1);
		int forControlExpression_StartIndex = input.index();

		ParserRuleReturnScope ex1 =null;
		ParserRuleReturnScope ex2 =null;
		ParserRuleReturnScope ex3 =null;


			Object[] isLhs = new Object[1];

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1500:2: (ex1= expressionNoIn ({...}? ( IN ex2= expression ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? ) ) )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1500:4: ex1= expressionNoIn ({...}? ( IN ex2= expression ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? ) )
			{
			pushFollow(FOLLOW_expressionNoIn_in_forControlExpression5230);
			ex1=expressionNoIn();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1501:2: ({...}? ( IN ex2= expression ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? ) )
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==IN) ) {
				alt63=1;
			}
			else if ( (LA63_0==SEMIC) ) {
				alt63=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				throw nvae;
			}
			switch (alt63) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1502:3: {...}? ( IN ex2= expression )
					{
					if ( !(( isLeftHandSideIn(ex1, isLhs) )) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "forControlExpression", " isLeftHandSideIn(ex1, isLhs) ");
					}
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1502:37: ( IN ex2= expression )
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1503:4: IN ex2= expression
					{
					match(input,IN,FOLLOW_IN_in_forControlExpression5245); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_forControlExpression5249);
					ex2=expression();
					state._fsp--;
					if (state.failed) return retval;
					}

					}
					break;
				case 2 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1507:3: ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? )
					{
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1507:3: ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? )
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1508:4: SEMIC (ex2= expression )? SEMIC (ex3= expression )?
					{
					match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression5270); if (state.failed) return retval;
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1508:13: (ex2= expression )?
					int alt61=2;
					int LA61_0 = input.LA(1);
					if ( (LA61_0==ADD||LA61_0==DEC||LA61_0==DELETE||LA61_0==DecimalLiteral||LA61_0==FALSE||LA61_0==FUNCTION||LA61_0==HexIntegerLiteral||LA61_0==INC||LA61_0==INV||LA61_0==Identifier||(LA61_0 >= LBRACE && LA61_0 <= LBRACK)||LA61_0==LPAREN||(LA61_0 >= NEW && LA61_0 <= NOT)||LA61_0==NULL||LA61_0==OctalIntegerLiteral||LA61_0==RegularExpressionLiteral||LA61_0==SUB||LA61_0==StringLiteral||LA61_0==THIS||LA61_0==TRUE||LA61_0==TYPEOF||LA61_0==VOID) ) {
						alt61=1;
					}
					switch (alt61) {
						case 1 :
							// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1508:13: ex2= expression
							{
							pushFollow(FOLLOW_expression_in_forControlExpression5274);
							ex2=expression();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression5277); if (state.failed) return retval;
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1508:35: (ex3= expression )?
					int alt62=2;
					int LA62_0 = input.LA(1);
					if ( (LA62_0==ADD||LA62_0==DEC||LA62_0==DELETE||LA62_0==DecimalLiteral||LA62_0==FALSE||LA62_0==FUNCTION||LA62_0==HexIntegerLiteral||LA62_0==INC||LA62_0==INV||LA62_0==Identifier||(LA62_0 >= LBRACE && LA62_0 <= LBRACK)||LA62_0==LPAREN||(LA62_0 >= NEW && LA62_0 <= NOT)||LA62_0==NULL||LA62_0==OctalIntegerLiteral||LA62_0==RegularExpressionLiteral||LA62_0==SUB||LA62_0==StringLiteral||LA62_0==THIS||LA62_0==TRUE||LA62_0==TYPEOF||LA62_0==VOID) ) {
						alt62=1;
					}
					switch (alt62) {
						case 1 :
							// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1508:35: ex3= expression
							{
							pushFollow(FOLLOW_expression_in_forControlExpression5281);
							ex3=expression();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 67, forControlExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forControlExpression"


	public static class forControlSemic_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "forControlSemic"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1514:1: forControlSemic : SEMIC (ex1= expression )? SEMIC (ex2= expression )? ;
	public final ES3YUITestParser.forControlSemic_return forControlSemic() throws RecognitionException {
		ES3YUITestParser.forControlSemic_return retval = new ES3YUITestParser.forControlSemic_return();
		retval.start = input.LT(1);
		int forControlSemic_StartIndex = input.index();

		ParserRuleReturnScope ex1 =null;
		ParserRuleReturnScope ex2 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1515:2: ( SEMIC (ex1= expression )? SEMIC (ex2= expression )? )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1515:4: SEMIC (ex1= expression )? SEMIC (ex2= expression )?
			{
			match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic5304); if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1515:13: (ex1= expression )?
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==ADD||LA64_0==DEC||LA64_0==DELETE||LA64_0==DecimalLiteral||LA64_0==FALSE||LA64_0==FUNCTION||LA64_0==HexIntegerLiteral||LA64_0==INC||LA64_0==INV||LA64_0==Identifier||(LA64_0 >= LBRACE && LA64_0 <= LBRACK)||LA64_0==LPAREN||(LA64_0 >= NEW && LA64_0 <= NOT)||LA64_0==NULL||LA64_0==OctalIntegerLiteral||LA64_0==RegularExpressionLiteral||LA64_0==SUB||LA64_0==StringLiteral||LA64_0==THIS||LA64_0==TRUE||LA64_0==TYPEOF||LA64_0==VOID) ) {
				alt64=1;
			}
			switch (alt64) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1515:13: ex1= expression
					{
					pushFollow(FOLLOW_expression_in_forControlSemic5308);
					ex1=expression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic5311); if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1515:35: (ex2= expression )?
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==ADD||LA65_0==DEC||LA65_0==DELETE||LA65_0==DecimalLiteral||LA65_0==FALSE||LA65_0==FUNCTION||LA65_0==HexIntegerLiteral||LA65_0==INC||LA65_0==INV||LA65_0==Identifier||(LA65_0 >= LBRACE && LA65_0 <= LBRACK)||LA65_0==LPAREN||(LA65_0 >= NEW && LA65_0 <= NOT)||LA65_0==NULL||LA65_0==OctalIntegerLiteral||LA65_0==RegularExpressionLiteral||LA65_0==SUB||LA65_0==StringLiteral||LA65_0==THIS||LA65_0==TRUE||LA65_0==TYPEOF||LA65_0==VOID) ) {
				alt65=1;
			}
			switch (alt65) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1515:35: ex2= expression
					{
					pushFollow(FOLLOW_expression_in_forControlSemic5315);
					ex2=expression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 68, forControlSemic_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forControlSemic"


	public static class continueStatement_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "continueStatement"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1528:1: continueStatement : CONTINUE ( Identifier )? semic ;
	public final ES3YUITestParser.continueStatement_return continueStatement() throws RecognitionException {
		ES3YUITestParser.continueStatement_return retval = new ES3YUITestParser.continueStatement_return();
		retval.start = input.LT(1);
		int continueStatement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1529:2: ( CONTINUE ( Identifier )? semic )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1529:4: CONTINUE ( Identifier )? semic
			{
			match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStatement5336); if (state.failed) return retval;
			if ( state.backtracking==0 ) { if (input.LA(1) == Identifier) promoteEOL(null); }
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1529:66: ( Identifier )?
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==Identifier) ) {
				alt66=1;
			}
			switch (alt66) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1529:66: Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_continueStatement5340); if (state.failed) return retval;
					}
					break;

			}

			pushFollow(FOLLOW_semic_in_continueStatement5343);
			semic();
			state._fsp--;
			if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 69, continueStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "continueStatement"


	public static class breakStatement_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "breakStatement"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1541:1: breakStatement : BREAK ( Identifier )? semic ;
	public final ES3YUITestParser.breakStatement_return breakStatement() throws RecognitionException {
		ES3YUITestParser.breakStatement_return retval = new ES3YUITestParser.breakStatement_return();
		retval.start = input.LT(1);
		int breakStatement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1542:2: ( BREAK ( Identifier )? semic )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1542:4: BREAK ( Identifier )? semic
			{
			match(input,BREAK,FOLLOW_BREAK_in_breakStatement5361); if (state.failed) return retval;
			if ( state.backtracking==0 ) { if (input.LA(1) == Identifier) promoteEOL(null); }
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1542:63: ( Identifier )?
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==Identifier) ) {
				alt67=1;
			}
			switch (alt67) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1542:63: Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_breakStatement5365); if (state.failed) return retval;
					}
					break;

			}

			pushFollow(FOLLOW_semic_in_breakStatement5368);
			semic();
			state._fsp--;
			if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 70, breakStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "breakStatement"


	public static class returnStatement_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "returnStatement"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1562:1: returnStatement : RETURN ( expression )? semic ;
	public final ES3YUITestParser.returnStatement_return returnStatement() throws RecognitionException {
		ES3YUITestParser.returnStatement_return retval = new ES3YUITestParser.returnStatement_return();
		retval.start = input.LT(1);
		int returnStatement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1563:2: ( RETURN ( expression )? semic )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1563:4: RETURN ( expression )? semic
			{
			match(input,RETURN,FOLLOW_RETURN_in_returnStatement5386); if (state.failed) return retval;
			if ( state.backtracking==0 ) { promoteEOL(null); }
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1563:33: ( expression )?
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==ADD||LA68_0==DEC||LA68_0==DELETE||LA68_0==DecimalLiteral||LA68_0==FALSE||LA68_0==FUNCTION||LA68_0==HexIntegerLiteral||LA68_0==INC||LA68_0==INV||LA68_0==Identifier||(LA68_0 >= LBRACE && LA68_0 <= LBRACK)||LA68_0==LPAREN||(LA68_0 >= NEW && LA68_0 <= NOT)||LA68_0==NULL||LA68_0==OctalIntegerLiteral||LA68_0==RegularExpressionLiteral||LA68_0==SUB||LA68_0==StringLiteral||LA68_0==THIS||LA68_0==TRUE||LA68_0==TYPEOF||LA68_0==VOID) ) {
				alt68=1;
			}
			switch (alt68) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1563:33: expression
					{
					pushFollow(FOLLOW_expression_in_returnStatement5390);
					expression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			pushFollow(FOLLOW_semic_in_returnStatement5393);
			semic();
			state._fsp--;
			if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 71, returnStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "returnStatement"


	public static class withStatement_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "withStatement"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1570:1: withStatement : WITH LPAREN expression RPAREN statement -> template(pre=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)) \"<pre><stmt>\";
	public final ES3YUITestParser.withStatement_return withStatement() throws RecognitionException {
		ES3YUITestParser.withStatement_return retval = new ES3YUITestParser.withStatement_return();
		retval.start = input.LT(1);
		int withStatement_StartIndex = input.index();

		ParserRuleReturnScope statement10 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1571:2: ( WITH LPAREN expression RPAREN statement -> template(pre=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)) \"<pre><stmt>\")
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1571:4: WITH LPAREN expression RPAREN statement
			{
			match(input,WITH,FOLLOW_WITH_in_withStatement5409); if (state.failed) return retval;
			match(input,LPAREN,FOLLOW_LPAREN_in_withStatement5411); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_withStatement5413);
			expression();
			state._fsp--;
			if (state.failed) return retval;
			match(input,RPAREN,FOLLOW_RPAREN_in_withStatement5415); if (state.failed) return retval;
			pushFollow(FOLLOW_statement_in_withStatement5417);
			statement10=statement();
			state._fsp--;
			if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 1572:2: -> template(pre=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)) \"<pre><stmt>\"
			  {
			  	retval.st = new StringTemplate(templateLib, "<pre><stmt>",new STAttrMap().put("pre", input.toString(((Token)retval.start).getTokenIndex(), (statement10!=null?((Token)statement10.start):null).getTokenIndex() - 1)).put("stmt", wrapInBraces((statement10!=null?((Token)statement10.start):null), (statement10!=null?((Token)statement10.stop):null), input)));
			  }


			  ((TokenRewriteStream)input).replace(
			    ((Token)retval.start).getTokenIndex(),
			    input.LT(-1).getTokenIndex(),
			    retval.st);

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 72, withStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "withStatement"


	public static class switchStatement_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "switchStatement"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1581:1: switchStatement : SWITCH LPAREN expression RPAREN caseBlock ;
	public final ES3YUITestParser.switchStatement_return switchStatement() throws RecognitionException {
		ES3YUITestParser.switchStatement_return retval = new ES3YUITestParser.switchStatement_return();
		retval.start = input.LT(1);
		int switchStatement_StartIndex = input.index();


			int defaultClauseCount = 0;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1587:2: ( SWITCH LPAREN expression RPAREN caseBlock )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1587:4: SWITCH LPAREN expression RPAREN caseBlock
			{
			match(input,SWITCH,FOLLOW_SWITCH_in_switchStatement5488); if (state.failed) return retval;
			match(input,LPAREN,FOLLOW_LPAREN_in_switchStatement5490); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_switchStatement5492);
			expression();
			state._fsp--;
			if (state.failed) return retval;
			match(input,RPAREN,FOLLOW_RPAREN_in_switchStatement5494); if (state.failed) return retval;
			pushFollow(FOLLOW_caseBlock_in_switchStatement5496);
			caseBlock();
			state._fsp--;
			if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 73, switchStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "switchStatement"


	public static class caseBlock_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "caseBlock"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1591:1: caseBlock : LBRACE ( caseClause )* ( defaultClause ( caseClause )* )? RBRACE ;
	public final ES3YUITestParser.caseBlock_return caseBlock() throws RecognitionException {
		ES3YUITestParser.caseBlock_return retval = new ES3YUITestParser.caseBlock_return();
		retval.start = input.LT(1);
		int caseBlock_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1592:2: ( LBRACE ( caseClause )* ( defaultClause ( caseClause )* )? RBRACE )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1592:4: LBRACE ( caseClause )* ( defaultClause ( caseClause )* )? RBRACE
			{
			match(input,LBRACE,FOLLOW_LBRACE_in_caseBlock5509); if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1592:11: ( caseClause )*
			loop69:
			do {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==CASE) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1592:12: caseClause
					{
					pushFollow(FOLLOW_caseClause_in_caseBlock5512);
					caseClause();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop69;
				}
			} while (true);

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1592:25: ( defaultClause ( caseClause )* )?
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==DEFAULT) ) {
				alt71=1;
			}
			switch (alt71) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1592:26: defaultClause ( caseClause )*
					{
					pushFollow(FOLLOW_defaultClause_in_caseBlock5517);
					defaultClause();
					state._fsp--;
					if (state.failed) return retval;
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1592:40: ( caseClause )*
					loop70:
					do {
						int alt70=2;
						int LA70_0 = input.LA(1);
						if ( (LA70_0==CASE) ) {
							alt70=1;
						}

						switch (alt70) {
						case 1 :
							// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1592:41: caseClause
							{
							pushFollow(FOLLOW_caseClause_in_caseBlock5520);
							caseClause();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

						default :
							break loop70;
						}
					} while (true);

					}
					break;

			}

			match(input,RBRACE,FOLLOW_RBRACE_in_caseBlock5526); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 74, caseBlock_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "caseBlock"


	public static class caseClause_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "caseClause"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1595:1: caseClause : CASE expression COLON ( statement )* ;
	public final ES3YUITestParser.caseClause_return caseClause() throws RecognitionException {
		ES3YUITestParser.caseClause_return retval = new ES3YUITestParser.caseClause_return();
		retval.start = input.LT(1);
		int caseClause_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1596:2: ( CASE expression COLON ( statement )* )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1596:4: CASE expression COLON ( statement )*
			{
			match(input,CASE,FOLLOW_CASE_in_caseClause5537); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_caseClause5539);
			expression();
			state._fsp--;
			if (state.failed) return retval;
			match(input,COLON,FOLLOW_COLON_in_caseClause5541); if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1596:26: ( statement )*
			loop72:
			do {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==ADD||LA72_0==BREAK||LA72_0==CONTINUE||LA72_0==DEC||LA72_0==DELETE||LA72_0==DO||LA72_0==DecimalLiteral||LA72_0==FALSE||LA72_0==FOR||LA72_0==FUNCTION||(LA72_0 >= HexIntegerLiteral && LA72_0 <= IF)||LA72_0==INC||LA72_0==INV||LA72_0==Identifier||(LA72_0 >= LBRACE && LA72_0 <= LBRACK)||LA72_0==LPAREN||(LA72_0 >= NEW && LA72_0 <= NOT)||LA72_0==NULL||LA72_0==OctalIntegerLiteral||LA72_0==RETURN||LA72_0==RegularExpressionLiteral||LA72_0==SEMIC||LA72_0==SUB||LA72_0==SWITCH||LA72_0==StringLiteral||(LA72_0 >= THIS && LA72_0 <= THROW)||(LA72_0 >= TRUE && LA72_0 <= TYPEOF)||(LA72_0 >= VAR && LA72_0 <= VOID)||(LA72_0 >= WHILE && LA72_0 <= WITH)) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1596:26: statement
					{
					pushFollow(FOLLOW_statement_in_caseClause5543);
					statement();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop72;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 75, caseClause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "caseClause"


	public static class defaultClause_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "defaultClause"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1599:1: defaultClause : DEFAULT COLON ( statement )* ;
	public final ES3YUITestParser.defaultClause_return defaultClause() throws RecognitionException {
		ES3YUITestParser.defaultClause_return retval = new ES3YUITestParser.defaultClause_return();
		retval.start = input.LT(1);
		int defaultClause_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1600:2: ( DEFAULT COLON ( statement )* )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1600:4: DEFAULT COLON ( statement )*
			{
			match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultClause5556); if (state.failed) return retval;
			match(input,COLON,FOLLOW_COLON_in_defaultClause5558); if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1600:18: ( statement )*
			loop73:
			do {
				int alt73=2;
				int LA73_0 = input.LA(1);
				if ( (LA73_0==ADD||LA73_0==BREAK||LA73_0==CONTINUE||LA73_0==DEC||LA73_0==DELETE||LA73_0==DO||LA73_0==DecimalLiteral||LA73_0==FALSE||LA73_0==FOR||LA73_0==FUNCTION||(LA73_0 >= HexIntegerLiteral && LA73_0 <= IF)||LA73_0==INC||LA73_0==INV||LA73_0==Identifier||(LA73_0 >= LBRACE && LA73_0 <= LBRACK)||LA73_0==LPAREN||(LA73_0 >= NEW && LA73_0 <= NOT)||LA73_0==NULL||LA73_0==OctalIntegerLiteral||LA73_0==RETURN||LA73_0==RegularExpressionLiteral||LA73_0==SEMIC||LA73_0==SUB||LA73_0==SWITCH||LA73_0==StringLiteral||(LA73_0 >= THIS && LA73_0 <= THROW)||(LA73_0 >= TRUE && LA73_0 <= TYPEOF)||(LA73_0 >= VAR && LA73_0 <= VOID)||(LA73_0 >= WHILE && LA73_0 <= WITH)) ) {
					alt73=1;
				}

				switch (alt73) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1600:18: statement
					{
					pushFollow(FOLLOW_statement_in_defaultClause5560);
					statement();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop73;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 76, defaultClause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "defaultClause"


	public static class labelledStatement_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "labelledStatement"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1607:1: labelledStatement : Identifier COLON statement ;
	public final ES3YUITestParser.labelledStatement_return labelledStatement() throws RecognitionException {
		ES3YUITestParser.labelledStatement_return retval = new ES3YUITestParser.labelledStatement_return();
		retval.start = input.LT(1);
		int labelledStatement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1608:2: ( Identifier COLON statement )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1608:4: Identifier COLON statement
			{
			match(input,Identifier,FOLLOW_Identifier_in_labelledStatement5577); if (state.failed) return retval;
			match(input,COLON,FOLLOW_COLON_in_labelledStatement5579); if (state.failed) return retval;
			pushFollow(FOLLOW_statement_in_labelledStatement5581);
			statement();
			state._fsp--;
			if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 77, labelledStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "labelledStatement"


	public static class throwStatement_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "throwStatement"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1631:1: throwStatement : THROW expression semic ;
	public final ES3YUITestParser.throwStatement_return throwStatement() throws RecognitionException {
		ES3YUITestParser.throwStatement_return retval = new ES3YUITestParser.throwStatement_return();
		retval.start = input.LT(1);
		int throwStatement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1632:2: ( THROW expression semic )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1632:4: THROW expression semic
			{
			match(input,THROW,FOLLOW_THROW_in_throwStatement5601); if (state.failed) return retval;
			if ( state.backtracking==0 ) { promoteEOL(null); }
			pushFollow(FOLLOW_expression_in_throwStatement5605);
			expression();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_semic_in_throwStatement5607);
			semic();
			state._fsp--;
			if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 78, throwStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "throwStatement"


	public static class tryStatement_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "tryStatement"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1639:1: tryStatement : TRY block ( catchClause ( finallyClause )? | finallyClause ) ;
	public final ES3YUITestParser.tryStatement_return tryStatement() throws RecognitionException {
		ES3YUITestParser.tryStatement_return retval = new ES3YUITestParser.tryStatement_return();
		retval.start = input.LT(1);
		int tryStatement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1640:2: ( TRY block ( catchClause ( finallyClause )? | finallyClause ) )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1640:4: TRY block ( catchClause ( finallyClause )? | finallyClause )
			{
			match(input,TRY,FOLLOW_TRY_in_tryStatement5623); if (state.failed) return retval;
			pushFollow(FOLLOW_block_in_tryStatement5625);
			block();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1640:14: ( catchClause ( finallyClause )? | finallyClause )
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==CATCH) ) {
				alt75=1;
			}
			else if ( (LA75_0==FINALLY) ) {
				alt75=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 75, 0, input);
				throw nvae;
			}
			switch (alt75) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1640:16: catchClause ( finallyClause )?
					{
					pushFollow(FOLLOW_catchClause_in_tryStatement5629);
					catchClause();
					state._fsp--;
					if (state.failed) return retval;
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1640:28: ( finallyClause )?
					int alt74=2;
					int LA74_0 = input.LA(1);
					if ( (LA74_0==FINALLY) ) {
						alt74=1;
					}
					switch (alt74) {
						case 1 :
							// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1640:28: finallyClause
							{
							pushFollow(FOLLOW_finallyClause_in_tryStatement5631);
							finallyClause();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1640:45: finallyClause
					{
					pushFollow(FOLLOW_finallyClause_in_tryStatement5636);
					finallyClause();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 79, tryStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "tryStatement"


	public static class catchClause_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "catchClause"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1643:1: catchClause : CATCH LPAREN Identifier RPAREN block ;
	public final ES3YUITestParser.catchClause_return catchClause() throws RecognitionException {
		ES3YUITestParser.catchClause_return retval = new ES3YUITestParser.catchClause_return();
		retval.start = input.LT(1);
		int catchClause_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1644:2: ( CATCH LPAREN Identifier RPAREN block )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1644:4: CATCH LPAREN Identifier RPAREN block
			{
			match(input,CATCH,FOLLOW_CATCH_in_catchClause5650); if (state.failed) return retval;
			match(input,LPAREN,FOLLOW_LPAREN_in_catchClause5652); if (state.failed) return retval;
			match(input,Identifier,FOLLOW_Identifier_in_catchClause5654); if (state.failed) return retval;
			match(input,RPAREN,FOLLOW_RPAREN_in_catchClause5656); if (state.failed) return retval;
			pushFollow(FOLLOW_block_in_catchClause5658);
			block();
			state._fsp--;
			if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 80, catchClause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "catchClause"


	public static class finallyClause_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "finallyClause"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1647:1: finallyClause : FINALLY block ;
	public final ES3YUITestParser.finallyClause_return finallyClause() throws RecognitionException {
		ES3YUITestParser.finallyClause_return retval = new ES3YUITestParser.finallyClause_return();
		retval.start = input.LT(1);
		int finallyClause_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1648:2: ( FINALLY block )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1648:4: FINALLY block
			{
			match(input,FINALLY,FOLLOW_FINALLY_in_finallyClause5670); if (state.failed) return retval;
			pushFollow(FOLLOW_block_in_finallyClause5672);
			block();
			state._fsp--;
			if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 81, finallyClause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "finallyClause"


	protected static class functionDeclaration_scope {
		String funcName;
		Integer funcLine;
		String paramList;
	}
	protected Stack<functionDeclaration_scope> functionDeclaration_stack = new Stack<functionDeclaration_scope>();

	public static class functionDeclaration_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "functionDeclaration"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1662:1: functionDeclaration : FUNCTION name= Identifier formalParameterList functionDeclarationBody -> {instrument}? cover_line(src=$program::namecode=$textfuncName=$functionDeclaration::funcNameline=$start.getLine()) -> ignore(code=$text);
	public final ES3YUITestParser.functionDeclaration_return functionDeclaration() throws RecognitionException {
		functionDeclaration_stack.push(new functionDeclaration_scope());
		ES3YUITestParser.functionDeclaration_return retval = new ES3YUITestParser.functionDeclaration_return();
		retval.start = input.LT(1);
		int functionDeclaration_StartIndex = input.index();

		Token name=null;
		ParserRuleReturnScope formalParameterList11 =null;


			
		    boolean instrument = false;
			if (((Token)retval.start).getLine() > program_stack.peek().stopLine) {
			  program_stack.peek().executableLines.add(((Token)retval.start).getLine());
			  program_stack.peek().stopLine = ((Token)retval.start).getLine();
			  instrument = true;
			}
			functionDeclaration_stack.peek().funcLine = ((Token)retval.start).getLine();		

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1688:2: ( FUNCTION name= Identifier formalParameterList functionDeclarationBody -> {instrument}? cover_line(src=$program::namecode=$textfuncName=$functionDeclaration::funcNameline=$start.getLine()) -> ignore(code=$text))
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1688:4: FUNCTION name= Identifier formalParameterList functionDeclarationBody
			{
			match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDeclaration5708); if (state.failed) return retval;
			name=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDeclaration5712); if (state.failed) return retval;
			if ( state.backtracking==0 ) {functionDeclaration_stack.peek().funcName =(name!=null?name.getText():null);}
			pushFollow(FOLLOW_formalParameterList_in_functionDeclaration5716);
			formalParameterList11=formalParameterList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {functionDeclaration_stack.peek().paramList = (formalParameterList11!=null?((ES3YUITestParser.formalParameterList_return)formalParameterList11).params:null); }
			pushFollow(FOLLOW_functionDeclarationBody_in_functionDeclaration5720);
			functionDeclarationBody();
			state._fsp--;
			if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 1689:4: -> {instrument}? cover_line(src=$program::namecode=$textfuncName=$functionDeclaration::funcNameline=$start.getLine())
			  if (instrument) {
			  	retval.st = templateLib.getInstanceOf("cover_line",new STAttrMap().put("src", program_stack.peek().name).put("code", input.toString(retval.start,input.LT(-1))).put("funcName", functionDeclaration_stack.peek().funcName).put("line", ((Token)retval.start).getLine()));
			  }

			  else // 1690:4: -> ignore(code=$text)
			  {
			  	retval.st = templateLib.getInstanceOf("ignore",new STAttrMap().put("code", input.toString(retval.start,input.LT(-1))));
			  }


			  ((TokenRewriteStream)input).replace(
			    ((Token)retval.start).getTokenIndex(),
			    input.LT(-1).getTokenIndex(),
			    retval.st);

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) { 
				program_stack.peek().functions.add("\"" + functionDeclaration_stack.peek().funcName + ":" + ((Token)retval.start).getLine() + "\"");
			  	if (verbose){
			    		System.err.println("\n[INFO] Instrumenting function " + functionDeclaration_stack.peek().funcName + " on line " +  ((Token)retval.start).getLine());
			  	} 
			  	//functionDeclaration_stack.peek().paramList = formalParameterList_stack.params;
				//System.out.println(functionDeclaration_stack.peek().paramList);	

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 82, functionDeclaration_StartIndex); }

			functionDeclaration_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "functionDeclaration"


	protected static class functionExpression_scope {
		String funcName;
		Integer funcLine;
		String paramList;
	}
	protected Stack<functionExpression_scope> functionExpression_stack = new Stack<functionExpression_scope>();

	public static class functionExpression_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "functionExpression"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1694:1: functionExpression : FUNCTION ( Identifier )? formalParameterList functionExpressionBody ;
	public final ES3YUITestParser.functionExpression_return functionExpression() throws RecognitionException {
		functionExpression_stack.push(new functionExpression_scope());
		ES3YUITestParser.functionExpression_return retval = new ES3YUITestParser.functionExpression_return();
		retval.start = input.LT(1);
		int functionExpression_StartIndex = input.index();

		ParserRuleReturnScope formalParameterList12 =null;


		    functionExpression_stack.peek().funcLine =((Token)retval.start).getLine();
			
		    /*
		     * The function expression might have an identifier, and if so, use that as
		     * the name.
		     *
		     * This might be a function that's a method in an object literal. If so,
		     * the previous token will be a colon and the one prior to that will be the
		     * identifier.
		     *
		     * Function may also be assigned to a variable. In that case, the previous
		     * token will be the equals sign (=) and the token prior to that is the
		     * variable/property.
		     *
		     * Even after all that, the function expression might have a declared name
		     * as if it were a function declaration. If so, the declared function name
		     * takes precendence over any object literal or variable assignment.
		     */
		    int lastTT = input.LA(-1);   //look for = or :
		    int nextTT = input.LA(2);    //look for an identifer

		    if (nextTT == Identifier){
		        functionExpression_stack.peek().funcName = input.LT(2).getText();
		    } else if (lastTT == COLON || lastTT == ASSIGN) {
		        functionExpression_stack.peek().funcName = input.LT(-2).getText().replace("\"", "\\\"").replace("'", "\\'");

		        //TODO: Continue walking back in case the identifier is object.name
		        //right now, I end up just with name.
		    } else {
		        functionExpression_stack.peek().funcName = "(anonymous " +  (++program_stack.peek().anonymousFunctionCount) + ")";
		    }
		    String rawFuncName = functionExpression_stack.peek().funcName;
		    if(rawFuncName.contains(":")){
		    	rawFuncName.replace(":","");
		    	functionExpression_stack.peek().funcName = rawFuncName;
		    }


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1743:2: ( FUNCTION ( Identifier )? formalParameterList functionExpressionBody )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1743:4: FUNCTION ( Identifier )? formalParameterList functionExpressionBody
			{
			match(input,FUNCTION,FOLLOW_FUNCTION_in_functionExpression5787); if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1743:13: ( Identifier )?
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==Identifier) ) {
				alt76=1;
			}
			switch (alt76) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1743:13: Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_functionExpression5789); if (state.failed) return retval;
					}
					break;

			}

			pushFollow(FOLLOW_formalParameterList_in_functionExpression5792);
			formalParameterList12=formalParameterList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {functionExpression_stack.peek().paramList = (formalParameterList12!=null?((ES3YUITestParser.formalParameterList_return)formalParameterList12).params:null); }
			pushFollow(FOLLOW_functionExpressionBody_in_functionExpression5796);
			functionExpressionBody();
			state._fsp--;
			if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
				//functionExpression_stack.peek().paramList = formalParameterList_stack.params;
			    //System.out.println(functionExpression_stack.peek().paramList);	
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 83, functionExpression_StartIndex); }

			functionExpression_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "functionExpression"


	protected static class formalParameterList_scope {
		Set<String> paramListSet;
		String paramList;
	}
	protected Stack<formalParameterList_scope> formalParameterList_stack = new Stack<formalParameterList_scope>();

	public static class formalParameterList_return extends ParserRuleReturnScope {
		public String params;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "formalParameterList"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1746:1: formalParameterList returns [String params] : LPAREN (name= Identifier ( COMMA name= Identifier )* )? RPAREN ;
	public final ES3YUITestParser.formalParameterList_return formalParameterList() throws RecognitionException {
		formalParameterList_stack.push(new formalParameterList_scope());
		ES3YUITestParser.formalParameterList_return retval = new ES3YUITestParser.formalParameterList_return();
		retval.start = input.LT(1);
		int formalParameterList_StartIndex = input.index();

		Token name=null;


		    formalParameterList_stack.peek().paramList ="";
		    Set<String> paramListSet = new java.util.HashSet<String>();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1766:3: ( LPAREN (name= Identifier ( COMMA name= Identifier )* )? RPAREN )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1766:5: LPAREN (name= Identifier ( COMMA name= Identifier )* )? RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_formalParameterList5827); if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1766:12: (name= Identifier ( COMMA name= Identifier )* )?
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==Identifier) ) {
				alt78=1;
			}
			switch (alt78) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1766:14: name= Identifier ( COMMA name= Identifier )*
					{
					name=(Token)match(input,Identifier,FOLLOW_Identifier_in_formalParameterList5833); if (state.failed) return retval;
					if ( state.backtracking==0 ) {formalParameterList_stack.peek().paramList += name.getText();}
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1766:84: ( COMMA name= Identifier )*
					loop77:
					do {
						int alt77=2;
						int LA77_0 = input.LA(1);
						if ( (LA77_0==COMMA) ) {
							alt77=1;
						}

						switch (alt77) {
						case 1 :
							// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1766:86: COMMA name= Identifier
							{
							match(input,COMMA,FOLLOW_COMMA_in_formalParameterList5839); if (state.failed) return retval;
							name=(Token)match(input,Identifier,FOLLOW_Identifier_in_formalParameterList5843); if (state.failed) return retval;
							if ( state.backtracking==0 ) {formalParameterList_stack.peek().paramList += "," + name.getText();}
							}
							break;

						default :
							break loop77;
						}
					} while (true);

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_formalParameterList5853); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {

			    if(!functionExpression_stack.isEmpty()){
			    	//System.out.println("Line: " + ((Token)retval.start).getLine() +" Function: " + functionExpression_stack.peek().funcName  + " formalParams: "+formalParameterList_stack.peek().paramList);
			    	retval.params = formalParameterList_stack.peek().paramList;    	
			    }
			    if(!functionDeclaration_stack.isEmpty()){
			    	//System.out.println("Line: " + ((Token)retval.start).getLine() +" Function: " + functionExpression_stack.peek().funcName  + " formalParams: "+formalParameterList_stack.peek().paramList);
			    	retval.params = formalParameterList_stack.peek().paramList;    	
			    }
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 84, formalParameterList_StartIndex); }

			formalParameterList_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "formalParameterList"


	public static class functionDeclarationBody_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "functionDeclarationBody"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1769:1: functionDeclarationBody : lb= LBRACE ( functionDeclarationBodyWithoutBraces )? RBRACE ;
	public final ES3YUITestParser.functionDeclarationBody_return functionDeclarationBody() throws RecognitionException {
		ES3YUITestParser.functionDeclarationBody_return retval = new ES3YUITestParser.functionDeclarationBody_return();
		retval.start = input.LT(1);
		int functionDeclarationBody_StartIndex = input.index();

		Token lb=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1770:2: (lb= LBRACE ( functionDeclarationBodyWithoutBraces )? RBRACE )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1770:4: lb= LBRACE ( functionDeclarationBodyWithoutBraces )? RBRACE
			{
			lb=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_functionDeclarationBody5866); if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1770:14: ( functionDeclarationBodyWithoutBraces )?
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==ADD||LA79_0==BREAK||LA79_0==CONTINUE||LA79_0==DEC||LA79_0==DELETE||LA79_0==DO||LA79_0==DecimalLiteral||LA79_0==FALSE||LA79_0==FOR||LA79_0==FUNCTION||(LA79_0 >= HexIntegerLiteral && LA79_0 <= IF)||LA79_0==INC||LA79_0==INV||LA79_0==Identifier||(LA79_0 >= LBRACE && LA79_0 <= LBRACK)||LA79_0==LPAREN||(LA79_0 >= NEW && LA79_0 <= NOT)||LA79_0==NULL||LA79_0==OctalIntegerLiteral||LA79_0==RETURN||LA79_0==RegularExpressionLiteral||LA79_0==SEMIC||LA79_0==SUB||LA79_0==SWITCH||LA79_0==StringLiteral||(LA79_0 >= THIS && LA79_0 <= THROW)||(LA79_0 >= TRUE && LA79_0 <= TYPEOF)||(LA79_0 >= VAR && LA79_0 <= VOID)||(LA79_0 >= WHILE && LA79_0 <= WITH)) ) {
				alt79=1;
			}
			switch (alt79) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1770:14: functionDeclarationBodyWithoutBraces
					{
					pushFollow(FOLLOW_functionDeclarationBodyWithoutBraces_in_functionDeclarationBody5868);
					functionDeclarationBodyWithoutBraces();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			match(input,RBRACE,FOLLOW_RBRACE_in_functionDeclarationBody5871); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 85, functionDeclarationBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionDeclarationBody"


	public static class functionExpressionBody_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "functionExpressionBody"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1773:1: functionExpressionBody : lb= LBRACE ( functionExpressionBodyWithoutBraces )? RBRACE ;
	public final ES3YUITestParser.functionExpressionBody_return functionExpressionBody() throws RecognitionException {
		ES3YUITestParser.functionExpressionBody_return retval = new ES3YUITestParser.functionExpressionBody_return();
		retval.start = input.LT(1);
		int functionExpressionBody_StartIndex = input.index();

		Token lb=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1774:2: (lb= LBRACE ( functionExpressionBodyWithoutBraces )? RBRACE )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1774:4: lb= LBRACE ( functionExpressionBodyWithoutBraces )? RBRACE
			{
			lb=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_functionExpressionBody5884); if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1774:14: ( functionExpressionBodyWithoutBraces )?
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==ADD||LA80_0==BREAK||LA80_0==CONTINUE||LA80_0==DEC||LA80_0==DELETE||LA80_0==DO||LA80_0==DecimalLiteral||LA80_0==FALSE||LA80_0==FOR||LA80_0==FUNCTION||(LA80_0 >= HexIntegerLiteral && LA80_0 <= IF)||LA80_0==INC||LA80_0==INV||LA80_0==Identifier||(LA80_0 >= LBRACE && LA80_0 <= LBRACK)||LA80_0==LPAREN||(LA80_0 >= NEW && LA80_0 <= NOT)||LA80_0==NULL||LA80_0==OctalIntegerLiteral||LA80_0==RETURN||LA80_0==RegularExpressionLiteral||LA80_0==SEMIC||LA80_0==SUB||LA80_0==SWITCH||LA80_0==StringLiteral||(LA80_0 >= THIS && LA80_0 <= THROW)||(LA80_0 >= TRUE && LA80_0 <= TYPEOF)||(LA80_0 >= VAR && LA80_0 <= VOID)||(LA80_0 >= WHILE && LA80_0 <= WITH)) ) {
				alt80=1;
			}
			switch (alt80) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1774:14: functionExpressionBodyWithoutBraces
					{
					pushFollow(FOLLOW_functionExpressionBodyWithoutBraces_in_functionExpressionBody5886);
					functionExpressionBodyWithoutBraces();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			match(input,RBRACE,FOLLOW_RBRACE_in_functionExpressionBody5889); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 86, functionExpressionBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionExpressionBody"


	protected static class functionExpressionBodyWithoutBraces_scope {
		String codeLine;
		String typesList;
		String objName;
	}
	protected Stack<functionExpressionBodyWithoutBraces_scope> functionExpressionBodyWithoutBraces_stack = new Stack<functionExpressionBodyWithoutBraces_scope>();

	public static class functionExpressionBodyWithoutBraces_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "functionExpressionBodyWithoutBraces"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1778:1: functionExpressionBodyWithoutBraces : sourceElement ( sourceElement )* -> {$functionExpression::funcName!=null}? cover_func(src=$program::namecode=$textobject=$functionExpressionBodyWithoutBraces::objNamename=$functionExpression::funcNameline=$functionExpression::funcLineparams=$functionExpressionBodyWithoutBraces::typesList) -> cover_func(src=$program::namecode=$textobject=$functionExpressionBodyWithoutBraces::objNamename=$functionExpression::funcNameline=$functionExpression::funcLineparams=$functionExpressionBodyWithoutBraces::typesList);
	public final ES3YUITestParser.functionExpressionBodyWithoutBraces_return functionExpressionBodyWithoutBraces() throws RecognitionException {
		functionExpressionBodyWithoutBraces_stack.push(new functionExpressionBodyWithoutBraces_scope());
		ES3YUITestParser.functionExpressionBodyWithoutBraces_return retval = new ES3YUITestParser.functionExpressionBodyWithoutBraces_return();
		retval.start = input.LT(1);
		int functionExpressionBodyWithoutBraces_StartIndex = input.index();


			if(objectDeclaration_stack.isEmpty()){
				functionExpressionBodyWithoutBraces_stack.peek().objName = "";
			} else {
				functionExpressionBodyWithoutBraces_stack.peek().objName = objectDeclaration_stack.peek().objectName;
			}

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1803:2: ( sourceElement ( sourceElement )* -> {$functionExpression::funcName!=null}? cover_func(src=$program::namecode=$textobject=$functionExpressionBodyWithoutBraces::objNamename=$functionExpression::funcNameline=$functionExpression::funcLineparams=$functionExpressionBodyWithoutBraces::typesList) -> cover_func(src=$program::namecode=$textobject=$functionExpressionBodyWithoutBraces::objNamename=$functionExpression::funcNameline=$functionExpression::funcLineparams=$functionExpressionBodyWithoutBraces::typesList))
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1803:4: sourceElement ( sourceElement )*
			{
			pushFollow(FOLLOW_sourceElement_in_functionExpressionBodyWithoutBraces5916);
			sourceElement();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1803:18: ( sourceElement )*
			loop81:
			do {
				int alt81=2;
				int LA81_0 = input.LA(1);
				if ( (LA81_0==ADD||LA81_0==BREAK||LA81_0==CONTINUE||LA81_0==DEC||LA81_0==DELETE||LA81_0==DO||LA81_0==DecimalLiteral||LA81_0==FALSE||LA81_0==FOR||LA81_0==FUNCTION||(LA81_0 >= HexIntegerLiteral && LA81_0 <= IF)||LA81_0==INC||LA81_0==INV||LA81_0==Identifier||(LA81_0 >= LBRACE && LA81_0 <= LBRACK)||LA81_0==LPAREN||(LA81_0 >= NEW && LA81_0 <= NOT)||LA81_0==NULL||LA81_0==OctalIntegerLiteral||LA81_0==RETURN||LA81_0==RegularExpressionLiteral||LA81_0==SEMIC||LA81_0==SUB||LA81_0==SWITCH||LA81_0==StringLiteral||(LA81_0 >= THIS && LA81_0 <= THROW)||(LA81_0 >= TRUE && LA81_0 <= TYPEOF)||(LA81_0 >= VAR && LA81_0 <= VOID)||(LA81_0 >= WHILE && LA81_0 <= WITH)) ) {
					alt81=1;
				}

				switch (alt81) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1803:19: sourceElement
					{
					pushFollow(FOLLOW_sourceElement_in_functionExpressionBodyWithoutBraces5919);
					sourceElement();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop81;
				}
			} while (true);

			if ( state.backtracking==0 ) {
					try {
						functionExpressionBodyWithoutBraces_stack.peek().typesList = determineParam(functionExpression_stack.peek().paramList,input.toString(retval.start,input.LT(-1)),functionExpression_stack.peek().funcName);
					} catch(Exception e){
					
					}
				}
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 1811:2: -> {$functionExpression::funcName!=null}? cover_func(src=$program::namecode=$textobject=$functionExpressionBodyWithoutBraces::objNamename=$functionExpression::funcNameline=$functionExpression::funcLineparams=$functionExpressionBodyWithoutBraces::typesList)
			  if (functionExpression_stack.peek().funcName!=null) {
			  	retval.st = templateLib.getInstanceOf("cover_func",new STAttrMap().put("src", program_stack.peek().name).put("code", input.toString(retval.start,input.LT(-1))).put("object", functionExpressionBodyWithoutBraces_stack.peek().objName).put("name", functionExpression_stack.peek().funcName).put("line", functionExpression_stack.peek().funcLine).put("params", functionExpressionBodyWithoutBraces_stack.peek().typesList));
			  }

			  else // 1812:2: -> cover_func(src=$program::namecode=$textobject=$functionExpressionBodyWithoutBraces::objNamename=$functionExpression::funcNameline=$functionExpression::funcLineparams=$functionExpressionBodyWithoutBraces::typesList)
			  {
			  	retval.st = templateLib.getInstanceOf("cover_func",new STAttrMap().put("src", program_stack.peek().name).put("code", input.toString(retval.start,input.LT(-1))).put("object", functionExpressionBodyWithoutBraces_stack.peek().objName).put("name", functionExpression_stack.peek().funcName).put("line", functionExpression_stack.peek().funcLine).put("params", functionExpressionBodyWithoutBraces_stack.peek().typesList));
			  }


			  ((TokenRewriteStream)input).replace(
			    ((Token)retval.start).getTokenIndex(),
			    input.LT(-1).getTokenIndex(),
			    retval.st);

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) { 
				//favor the function expression's declared name, otherwise assign an anonymous function name
				program_stack.peek().functions.add("\"" + functionExpression_stack.peek().funcName + ":" + functionExpression_stack.peek().funcLine + "\"");
				
				

				if (verbose){
						System.err.println("\n[INFO] Instrumenting function expression '" + functionExpression_stack.peek().funcName + "' on line " + functionExpression_stack.peek().funcLine);

				}	
				
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 87, functionExpressionBodyWithoutBraces_StartIndex); }

			functionExpressionBodyWithoutBraces_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "functionExpressionBodyWithoutBraces"


	protected static class functionDeclarationBodyWithoutBraces_scope {
		String typesList;
		String objName;
	}
	protected Stack<functionDeclarationBodyWithoutBraces_scope> functionDeclarationBodyWithoutBraces_stack = new Stack<functionDeclarationBodyWithoutBraces_scope>();

	public static class functionDeclarationBodyWithoutBraces_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "functionDeclarationBodyWithoutBraces"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1815:1: functionDeclarationBodyWithoutBraces : sourceElement ( sourceElement )* -> {$functionDeclaration::funcName!=null}? cover_func(src=$program::namecode=$textobject=$functionDeclarationBodyWithoutBraces::objNamename=$functionDeclaration::funcNameline=$functionDeclaration::funcLineparams=$functionDeclarationBodyWithoutBraces::typesList) -> cover_func(src=$program::namecode=$textobject=$functionDeclarationBodyWithoutBraces::objNamename=$functionDeclaration::funcNameline=$functionDeclaration::funcLineparams=$functionDeclarationBodyWithoutBraces::typesList);
	public final ES3YUITestParser.functionDeclarationBodyWithoutBraces_return functionDeclarationBodyWithoutBraces() throws RecognitionException {
		functionDeclarationBodyWithoutBraces_stack.push(new functionDeclarationBodyWithoutBraces_scope());
		ES3YUITestParser.functionDeclarationBodyWithoutBraces_return retval = new ES3YUITestParser.functionDeclarationBodyWithoutBraces_return();
		retval.start = input.LT(1);
		int functionDeclarationBodyWithoutBraces_StartIndex = input.index();

		    
			if(objectDeclaration_stack.isEmpty()){
				functionDeclarationBodyWithoutBraces_stack.peek().objName = "";
			} else {
				functionDeclarationBodyWithoutBraces_stack.peek().objName = objectDeclaration_stack.peek().objectName;
			}

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1830:2: ( sourceElement ( sourceElement )* -> {$functionDeclaration::funcName!=null}? cover_func(src=$program::namecode=$textobject=$functionDeclarationBodyWithoutBraces::objNamename=$functionDeclaration::funcNameline=$functionDeclaration::funcLineparams=$functionDeclarationBodyWithoutBraces::typesList) -> cover_func(src=$program::namecode=$textobject=$functionDeclarationBodyWithoutBraces::objNamename=$functionDeclaration::funcNameline=$functionDeclaration::funcLineparams=$functionDeclarationBodyWithoutBraces::typesList))
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1830:4: sourceElement ( sourceElement )*
			{
			pushFollow(FOLLOW_sourceElement_in_functionDeclarationBodyWithoutBraces6020);
			sourceElement();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1830:18: ( sourceElement )*
			loop82:
			do {
				int alt82=2;
				int LA82_0 = input.LA(1);
				if ( (LA82_0==ADD||LA82_0==BREAK||LA82_0==CONTINUE||LA82_0==DEC||LA82_0==DELETE||LA82_0==DO||LA82_0==DecimalLiteral||LA82_0==FALSE||LA82_0==FOR||LA82_0==FUNCTION||(LA82_0 >= HexIntegerLiteral && LA82_0 <= IF)||LA82_0==INC||LA82_0==INV||LA82_0==Identifier||(LA82_0 >= LBRACE && LA82_0 <= LBRACK)||LA82_0==LPAREN||(LA82_0 >= NEW && LA82_0 <= NOT)||LA82_0==NULL||LA82_0==OctalIntegerLiteral||LA82_0==RETURN||LA82_0==RegularExpressionLiteral||LA82_0==SEMIC||LA82_0==SUB||LA82_0==SWITCH||LA82_0==StringLiteral||(LA82_0 >= THIS && LA82_0 <= THROW)||(LA82_0 >= TRUE && LA82_0 <= TYPEOF)||(LA82_0 >= VAR && LA82_0 <= VOID)||(LA82_0 >= WHILE && LA82_0 <= WITH)) ) {
					alt82=1;
				}

				switch (alt82) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1830:18: sourceElement
					{
					pushFollow(FOLLOW_sourceElement_in_functionDeclarationBodyWithoutBraces6022);
					sourceElement();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop82;
				}
			} while (true);

			if ( state.backtracking==0 ) {
					try {		  
					    if(!functionDeclaration_stack.isEmpty()){
					    	
							functionDeclarationBodyWithoutBraces_stack.peek().typesList = determineParam(functionDeclaration_stack.peek().paramList,input.toString(retval.start,input.LT(-1)),functionDeclaration_stack.peek().funcName);
							
					    }    
					} catch(Exception e){

					}
				}
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 1842:2: -> {$functionDeclaration::funcName!=null}? cover_func(src=$program::namecode=$textobject=$functionDeclarationBodyWithoutBraces::objNamename=$functionDeclaration::funcNameline=$functionDeclaration::funcLineparams=$functionDeclarationBodyWithoutBraces::typesList)
			  if (functionDeclaration_stack.peek().funcName!=null) {
			  	retval.st = templateLib.getInstanceOf("cover_func",new STAttrMap().put("src", program_stack.peek().name).put("code", input.toString(retval.start,input.LT(-1))).put("object", functionDeclarationBodyWithoutBraces_stack.peek().objName).put("name", functionDeclaration_stack.peek().funcName).put("line", functionDeclaration_stack.peek().funcLine).put("params", functionDeclarationBodyWithoutBraces_stack.peek().typesList));
			  }

			  else // 1843:2: -> cover_func(src=$program::namecode=$textobject=$functionDeclarationBodyWithoutBraces::objNamename=$functionDeclaration::funcNameline=$functionDeclaration::funcLineparams=$functionDeclarationBodyWithoutBraces::typesList)
			  {
			  	retval.st = templateLib.getInstanceOf("cover_func",new STAttrMap().put("src", program_stack.peek().name).put("code", input.toString(retval.start,input.LT(-1))).put("object", functionDeclarationBodyWithoutBraces_stack.peek().objName).put("name", functionDeclaration_stack.peek().funcName).put("line", functionDeclaration_stack.peek().funcLine).put("params", functionDeclarationBodyWithoutBraces_stack.peek().typesList));
			  }


			  ((TokenRewriteStream)input).replace(
			    ((Token)retval.start).getTokenIndex(),
			    input.LT(-1).getTokenIndex(),
			    retval.st);

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
					
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 88, functionDeclarationBodyWithoutBraces_StartIndex); }

			functionDeclarationBodyWithoutBraces_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "functionDeclarationBodyWithoutBraces"


	protected static class program_scope {
		java.util.List<Integer> executableLines;
		java.util.List<String> functions;
		int stopLine;
		String name;
		String currentClass;
		int anonymousFunctionCount;
		//String moduleName;
	}
	protected Stack<program_scope> program_stack = new Stack<program_scope>();

	public static class program_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "program"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1857:1: program : ( ( sourceElement )* ) ;
	public final ES3YUITestParser.program_return program() throws RecognitionException {
		program_stack.push(new program_scope());
		ES3YUITestParser.program_return retval = new ES3YUITestParser.program_return();
		retval.start = input.LT(1);
		int program_StartIndex = input.index();


		  program_stack.peek().executableLines = new java.util.LinkedList();
		  program_stack.peek().functions = new java.util.LinkedList();
		  program_stack.peek().stopLine = 0;
		  program_stack.peek().name = getSourceName();
		  program_stack.peek().anonymousFunctionCount = 0;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1874:2: ( ( ( sourceElement )* ) )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1874:4: ( ( sourceElement )* )
			{
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1874:4: ( ( sourceElement )* )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1874:5: ( sourceElement )*
			{
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1874:5: ( sourceElement )*
			loop83:
			do {
				int alt83=2;
				int LA83_0 = input.LA(1);
				if ( (LA83_0==ADD||LA83_0==BREAK||LA83_0==CONTINUE||LA83_0==DEC||LA83_0==DELETE||LA83_0==DO||LA83_0==DecimalLiteral||LA83_0==FALSE||LA83_0==FOR||LA83_0==FUNCTION||(LA83_0 >= HexIntegerLiteral && LA83_0 <= IF)||LA83_0==INC||LA83_0==INV||LA83_0==Identifier||(LA83_0 >= LBRACE && LA83_0 <= LBRACK)||LA83_0==LPAREN||(LA83_0 >= NEW && LA83_0 <= NOT)||LA83_0==NULL||LA83_0==OctalIntegerLiteral||LA83_0==RETURN||LA83_0==RegularExpressionLiteral||LA83_0==SEMIC||LA83_0==SUB||LA83_0==SWITCH||LA83_0==StringLiteral||(LA83_0 >= THIS && LA83_0 <= THROW)||(LA83_0 >= TRUE && LA83_0 <= TYPEOF)||(LA83_0 >= VAR && LA83_0 <= VOID)||(LA83_0 >= WHILE && LA83_0 <= WITH)) ) {
					alt83=1;
				}

				switch (alt83) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1874:5: sourceElement
					{
					pushFollow(FOLLOW_sourceElement_in_program6128);
					sourceElement();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop83;
				}
			} while (true);

			}

			if ( state.backtracking==0 ) {java.util.Collections.sort(program_stack.peek().executableLines);}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 89, program_StartIndex); }

			program_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "program"


	protected static class objectDeclaration_scope {
		String objectName;
	}
	protected Stack<objectDeclaration_scope> objectDeclaration_stack = new Stack<objectDeclaration_scope>();

	public static class objectDeclaration_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "objectDeclaration"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1885:1: objectDeclaration : memberExpression assignmentOperator objectLiteral ;
	public final ES3YUITestParser.objectDeclaration_return objectDeclaration() throws RecognitionException {
		objectDeclaration_stack.push(new objectDeclaration_scope());
		ES3YUITestParser.objectDeclaration_return retval = new ES3YUITestParser.objectDeclaration_return();
		retval.start = input.LT(1);
		int objectDeclaration_StartIndex = input.index();

		ParserRuleReturnScope memberExpression13 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1889:2: ( memberExpression assignmentOperator objectLiteral )
			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1889:4: memberExpression assignmentOperator objectLiteral
			{
			pushFollow(FOLLOW_memberExpression_in_objectDeclaration6152);
			memberExpression13=memberExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {objectDeclaration_stack.peek().objectName =(memberExpression13!=null?input.toString(memberExpression13.start,memberExpression13.stop):null); }
			pushFollow(FOLLOW_assignmentOperator_in_objectDeclaration6156);
			assignmentOperator();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_objectLiteral_in_objectDeclaration6158);
			objectLiteral();
			state._fsp--;
			if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 90, objectDeclaration_StartIndex); }

			objectDeclaration_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "objectDeclaration"


	public static class sourceElement_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "sourceElement"
	// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1895:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );
	public final ES3YUITestParser.sourceElement_return sourceElement() throws RecognitionException {
		ES3YUITestParser.sourceElement_return retval = new ES3YUITestParser.sourceElement_return();
		retval.start = input.LT(1);
		int sourceElement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

			// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1900:2: ({...}? functionDeclaration | statement )
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==FUNCTION) ) {
				int LA84_1 = input.LA(2);
				if ( (((synpred259_ES3YUITest()&&synpred259_ES3YUITest())&&( input.LA(1) == FUNCTION ))) ) {
					alt84=1;
				}
				else if ( (true) ) {
					alt84=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 84, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA84_0==ADD||LA84_0==BREAK||LA84_0==CONTINUE||LA84_0==DEC||LA84_0==DELETE||LA84_0==DO||LA84_0==DecimalLiteral||LA84_0==FALSE||LA84_0==FOR||(LA84_0 >= HexIntegerLiteral && LA84_0 <= IF)||LA84_0==INC||LA84_0==INV||LA84_0==Identifier||(LA84_0 >= LBRACE && LA84_0 <= LBRACK)||LA84_0==LPAREN||(LA84_0 >= NEW && LA84_0 <= NOT)||LA84_0==NULL||LA84_0==OctalIntegerLiteral||LA84_0==RETURN||LA84_0==RegularExpressionLiteral||LA84_0==SEMIC||LA84_0==SUB||LA84_0==SWITCH||LA84_0==StringLiteral||(LA84_0 >= THIS && LA84_0 <= THROW)||(LA84_0 >= TRUE && LA84_0 <= TYPEOF)||(LA84_0 >= VAR && LA84_0 <= VOID)||(LA84_0 >= WHILE && LA84_0 <= WITH)) ) {
				alt84=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 84, 0, input);
				throw nvae;
			}
			switch (alt84) {
				case 1 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1900:4: {...}? functionDeclaration
					{
					if ( !(( input.LA(1) == FUNCTION )) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "sourceElement", " input.LA(1) == FUNCTION ");
					}
					pushFollow(FOLLOW_functionDeclaration_in_sourceElement6188);
					functionDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1901:4: statement
					{
					pushFollow(FOLLOW_statement_in_sourceElement6193);
					statement();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 91, sourceElement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "sourceElement"

	// $ANTLR start synpred121_ES3YUITest
	public final void synpred121_ES3YUITest_fragment() throws RecognitionException {
		// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:937:34: ( arrayItem )
		// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:937:34: arrayItem
		{
		pushFollow(FOLLOW_arrayItem_in_synpred121_ES3YUITest3195);
		arrayItem();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred121_ES3YUITest

	// $ANTLR start synpred123_ES3YUITest
	public final void synpred123_ES3YUITest_fragment() throws RecognitionException {
		// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:937:16: ( arrayItem ( COMMA ( arrayItem )? )* )
		// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:937:16: arrayItem ( COMMA ( arrayItem )? )*
		{
		pushFollow(FOLLOW_arrayItem_in_synpred123_ES3YUITest3189);
		arrayItem();
		state._fsp--;
		if (state.failed) return ;
		// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:937:26: ( COMMA ( arrayItem )? )*
		loop87:
		do {
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0==COMMA) ) {
				alt87=1;
			}

			switch (alt87) {
			case 1 :
				// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:937:28: COMMA ( arrayItem )?
				{
				match(input,COMMA,FOLLOW_COMMA_in_synpred123_ES3YUITest3193); if (state.failed) return ;
				// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:937:34: ( arrayItem )?
				int alt86=2;
				switch ( input.LA(1) ) {
					case ADD:
					case DEC:
					case DELETE:
					case DecimalLiteral:
					case FALSE:
					case FUNCTION:
					case HexIntegerLiteral:
					case INC:
					case INV:
					case Identifier:
					case LBRACE:
					case LBRACK:
					case LPAREN:
					case NEW:
					case NOT:
					case NULL:
					case OctalIntegerLiteral:
					case RegularExpressionLiteral:
					case SUB:
					case StringLiteral:
					case THIS:
					case TRUE:
					case TYPEOF:
					case VOID:
						{
						alt86=1;
						}
						break;
					case EOF:
						{
						int LA86_2 = input.LA(2);
						if ( (((( input.LA(1) == COMMA )&&( input.LA(1) == COMMA ))&&synpred121_ES3YUITest())) ) {
							alt86=1;
						}
						}
						break;
					case COMMA:
						{
						int LA86_3 = input.LA(2);
						if ( (((( input.LA(1) == COMMA )&&( input.LA(1) == COMMA ))&&synpred121_ES3YUITest())) ) {
							alt86=1;
						}
						}
						break;
				}
				switch (alt86) {
					case 1 :
						// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:937:34: arrayItem
						{
						pushFollow(FOLLOW_arrayItem_in_synpred123_ES3YUITest3195);
						arrayItem();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

				}

				}
				break;

			default :
				break loop87;
			}
		} while (true);

		}

	}
	// $ANTLR end synpred123_ES3YUITest

	// $ANTLR start synpred129_ES3YUITest
	public final void synpred129_ES3YUITest_fragment() throws RecognitionException {
		// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:976:23: ( memberExpressionSuffix )
		// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:976:23: memberExpressionSuffix
		{
		pushFollow(FOLLOW_memberExpressionSuffix_in_synpred129_ES3YUITest3324);
		memberExpressionSuffix();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred129_ES3YUITest

	// $ANTLR start synpred189_ES3YUITest
	public final void synpred189_ES3YUITest_fragment() throws RecognitionException {
		// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1196:32: ({...}? assignmentOperator assignmentExpression )
		// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1196:32: {...}? assignmentOperator assignmentExpression
		{
		if ( !(( false )) ) {
			if (state.backtracking>0) {state.failed=true; return ;}
			throw new FailedPredicateException(input, "synpred189_ES3YUITest", " false ");
		}
		pushFollow(FOLLOW_assignmentOperator_in_synpred189_ES3YUITest4212);
		assignmentOperator();
		state._fsp--;
		if (state.failed) return ;
		pushFollow(FOLLOW_assignmentExpression_in_synpred189_ES3YUITest4214);
		assignmentExpression();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred189_ES3YUITest

	// $ANTLR start synpred190_ES3YUITest
	public final void synpred190_ES3YUITest_fragment() throws RecognitionException {
		ParserRuleReturnScope lhs =null;

		// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1196:4: (lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? )
		// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1196:4: lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )?
		{
		pushFollow(FOLLOW_conditionalExpression_in_synpred190_ES3YUITest4206);
		lhs=conditionalExpression();
		state._fsp--;
		if (state.failed) return ;
		// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1196:30: ({...}? assignmentOperator assignmentExpression )?
		int alt91=2;
		int LA91_0 = input.LA(1);
		if ( (LA91_0==ADDASS||LA91_0==ANDASS||LA91_0==ASSIGN||LA91_0==DIVASS||LA91_0==MODASS||LA91_0==MULASS||LA91_0==ORASS||LA91_0==SHLASS||LA91_0==SHRASS||LA91_0==SHUASS||LA91_0==SUBASS||LA91_0==XORASS) ) {
			alt91=1;
		}
		switch (alt91) {
			case 1 :
				// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1196:32: {...}? assignmentOperator assignmentExpression
				{
				if ( !(( false )) ) {
					if (state.backtracking>0) {state.failed=true; return ;}
					throw new FailedPredicateException(input, "synpred190_ES3YUITest", " false ");
				}
				pushFollow(FOLLOW_assignmentOperator_in_synpred190_ES3YUITest4212);
				assignmentOperator();
				state._fsp--;
				if (state.failed) return ;
				pushFollow(FOLLOW_assignmentExpression_in_synpred190_ES3YUITest4214);
				assignmentExpression();
				state._fsp--;
				if (state.failed) return ;
				}
				break;

		}

		}

	}
	// $ANTLR end synpred190_ES3YUITest

	// $ANTLR start synpred202_ES3YUITest
	public final void synpred202_ES3YUITest_fragment() throws RecognitionException {
		// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1211:36: ({...}? assignmentOperator assignmentExpressionNoIn )
		// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1211:36: {...}? assignmentOperator assignmentExpressionNoIn
		{
		if ( !(( false )) ) {
			if (state.backtracking>0) {state.failed=true; return ;}
			throw new FailedPredicateException(input, "synpred202_ES3YUITest", " false ");
		}
		pushFollow(FOLLOW_assignmentOperator_in_synpred202_ES3YUITest4308);
		assignmentOperator();
		state._fsp--;
		if (state.failed) return ;
		pushFollow(FOLLOW_assignmentExpressionNoIn_in_synpred202_ES3YUITest4310);
		assignmentExpressionNoIn();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred202_ES3YUITest

	// $ANTLR start synpred209_ES3YUITest
	public final void synpred209_ES3YUITest_fragment() throws RecognitionException {
		// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1313:5: ({...}? block )
		// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1313:5: {...}? block
		{
		if ( !(( statement_stack.peek().isBlock = input.LA(1) == LBRACE )) ) {
			if (state.backtracking>0) {state.failed=true; return ;}
			throw new FailedPredicateException(input, "synpred209_ES3YUITest", " $statement::isBlock = input.LA(1) == LBRACE ");
		}
		pushFollow(FOLLOW_block_in_synpred209_ES3YUITest4467);
		block();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred209_ES3YUITest

	// $ANTLR start synpred211_ES3YUITest
	public final void synpred211_ES3YUITest_fragment() throws RecognitionException {
		// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1320:4: ( objectDeclaration )
		// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1320:4: objectDeclaration
		{
		pushFollow(FOLLOW_objectDeclaration_in_synpred211_ES3YUITest4533);
		objectDeclaration();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred211_ES3YUITest

	// $ANTLR start synpred213_ES3YUITest
	public final void synpred213_ES3YUITest_fragment() throws RecognitionException {
		// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1322:4: ( expressionStatement )
		// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1322:4: expressionStatement
		{
		pushFollow(FOLLOW_expressionStatement_in_synpred213_ES3YUITest4543);
		expressionStatement();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred213_ES3YUITest

	// $ANTLR start synpred220_ES3YUITest
	public final void synpred220_ES3YUITest_fragment() throws RecognitionException {
		// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1329:4: ( labelledStatement )
		// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1329:4: labelledStatement
		{
		pushFollow(FOLLOW_labelledStatement_in_synpred220_ES3YUITest4578);
		labelledStatement();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred220_ES3YUITest

	// $ANTLR start synpred227_ES3YUITest
	public final void synpred227_ES3YUITest_fragment() throws RecognitionException {
		// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1388:44: ({...}? elseStatement )
		// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1388:44: {...}? elseStatement
		{
		if ( !(( input.LA(1) == ELSE )) ) {
			if (state.backtracking>0) {state.failed=true; return ;}
			throw new FailedPredicateException(input, "synpred227_ES3YUITest", " input.LA(1) == ELSE ");
		}
		pushFollow(FOLLOW_elseStatement_in_synpred227_ES3YUITest4755);
		elseStatement();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred227_ES3YUITest

	// $ANTLR start synpred259_ES3YUITest
	public final void synpred259_ES3YUITest_fragment() throws RecognitionException {
		// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1900:4: ({...}? functionDeclaration )
		// D:\\Boxes\\Dropbox\\GIT\\master_project\\JSTestCoverage\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1900:4: {...}? functionDeclaration
		{
		if ( !(( input.LA(1) == FUNCTION )) ) {
			if (state.backtracking>0) {state.failed=true; return ;}
			throw new FailedPredicateException(input, "synpred259_ES3YUITest", " input.LA(1) == FUNCTION ");
		}
		pushFollow(FOLLOW_functionDeclaration_in_synpred259_ES3YUITest6188);
		functionDeclaration();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred259_ES3YUITest

	// Delegated rules

	public final boolean synpred220_ES3YUITest() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred220_ES3YUITest_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred259_ES3YUITest() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred259_ES3YUITest_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred189_ES3YUITest() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred189_ES3YUITest_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred213_ES3YUITest() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred213_ES3YUITest_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred227_ES3YUITest() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred227_ES3YUITest_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred211_ES3YUITest() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred211_ES3YUITest_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred129_ES3YUITest() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred129_ES3YUITest_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred202_ES3YUITest() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred202_ES3YUITest_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred209_ES3YUITest() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred209_ES3YUITest_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred121_ES3YUITest() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred121_ES3YUITest_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred123_ES3YUITest() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred123_ES3YUITest_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred190_ES3YUITest() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred190_ES3YUITest_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_reservedWord_in_token1776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_token1781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_punctuator_in_token1786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numericLiteral_in_token1791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_StringLiteral_in_token1796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_keyword_in_reservedWord1809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_futureReservedWord_in_reservedWord1814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_reservedWord1819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanLiteral_in_reservedWord1824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_literal2505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanLiteral_in_literal2510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numericLiteral_in_literal2515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_StringLiteral_in_literal2520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RegularExpressionLiteral_in_literal2525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THIS_in_primaryExpression3138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpression3143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_primaryExpression3148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayLiteral_in_primaryExpression3153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objectLiteral_in_primaryExpression3158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_primaryExpression3165 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_expression_in_primaryExpression3167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_RPAREN_in_primaryExpression3169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_arrayLiteral3185 = new BitSet(new long[]{0x4040100A08000020L,0x400416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3189 = new BitSet(new long[]{0x0000000008000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_COMMA_in_arrayLiteral3193 = new BitSet(new long[]{0x4040100A08000020L,0x400416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3195 = new BitSet(new long[]{0x0000000008000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_RBRACK_in_arrayLiteral3204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentExpression_in_arrayItem3221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_objectLiteral3242 = new BitSet(new long[]{0x0000100000000000L,0x2004000000008010L,0x0000000000400000L});
	public static final BitSet FOLLOW_nameValuePair_in_objectLiteral3246 = new BitSet(new long[]{0x0000000008000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_COMMA_in_objectLiteral3250 = new BitSet(new long[]{0x0000100000000000L,0x0004000000008010L,0x0000000000400000L});
	public static final BitSet FOLLOW_nameValuePair_in_objectLiteral3252 = new BitSet(new long[]{0x0000000008000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_RBRACE_in_objectLiteral3260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_propertyName_in_nameValuePair3276 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLON_in_nameValuePair3278 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_assignmentExpression_in_nameValuePair3280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_propertyName3293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_StringLiteral_in_propertyName3298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numericLiteral_in_propertyName3303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpression_in_memberExpression3321 = new BitSet(new long[]{0x0000008000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_memberExpressionSuffix_in_memberExpression3324 = new BitSet(new long[]{0x0000008000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_functionExpression_in_memberExpression3331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newExpression_in_memberExpression3336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEW_in_newExpression3347 = new BitSet(new long[]{0x0040100000000000L,0x0004100004608010L,0x0000000011400008L});
	public static final BitSet FOLLOW_primaryExpression_in_newExpression3349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEW_in_newExpression3361 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_functionExpression_in_newExpression3363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_indexSuffix_in_memberExpressionSuffix3377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_propertyReferenceSuffix_in_memberExpressionSuffix3382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_indexSuffix3393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_indexSuffix3395 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_RBRACK_in_indexSuffix3397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_propertyReferenceSuffix3411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_propertyReferenceSuffix3413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_arguments3426 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410009L});
	public static final BitSet FOLLOW_assignmentExpression_in_arguments3430 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_COMMA_in_arguments3434 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_assignmentExpression_in_arguments3436 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_RPAREN_in_arguments3444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_memberExpression_in_leftHandSideExpression3463 = new BitSet(new long[]{0x0000008000000002L,0x0000000004400000L});
	public static final BitSet FOLLOW_arguments_in_leftHandSideExpression3476 = new BitSet(new long[]{0x0000008000000002L,0x0000000004400000L});
	public static final BitSet FOLLOW_LBRACK_in_leftHandSideExpression3485 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_expression_in_leftHandSideExpression3487 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_RBRACK_in_leftHandSideExpression3489 = new BitSet(new long[]{0x0000008000000002L,0x0000000004400000L});
	public static final BitSet FOLLOW_DOT_in_leftHandSideExpression3496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_leftHandSideExpression3498 = new BitSet(new long[]{0x0000008000000002L,0x0000000004400000L});
	public static final BitSet FOLLOW_leftHandSideExpression_in_postfixExpression3521 = new BitSet(new long[]{0x0000000200000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_postfixOperator_in_postfixExpression3527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INC_in_postfixOperator3544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEC_in_postfixOperator3553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postfixExpression_in_unaryExpression3570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryOperator_in_unaryExpression3575 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression3577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DELETE_in_unaryOperator3589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_unaryOperator3594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEOF_in_unaryOperator3599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INC_in_unaryOperator3604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEC_in_unaryOperator3609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ADD_in_unaryOperator3616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUB_in_unaryOperator3625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INV_in_unaryOperator3632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_unaryOperator3637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression3652 = new BitSet(new long[]{0x0000001000000002L,0x0000000280000000L});
	public static final BitSet FOLLOW_set_in_multiplicativeExpression3656 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression3670 = new BitSet(new long[]{0x0000001000000002L,0x0000000280000000L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression3688 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_set_in_additiveExpression3692 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression3702 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_additiveExpression_in_shiftExpression3721 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000A40L});
	public static final BitSet FOLLOW_set_in_shiftExpression3725 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_additiveExpression_in_shiftExpression3739 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000A40L});
	public static final BitSet FOLLOW_shiftExpression_in_relationalExpression3758 = new BitSet(new long[]{0x0000000000000002L,0x0000000030000503L});
	public static final BitSet FOLLOW_set_in_relationalExpression3762 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_shiftExpression_in_relationalExpression3788 = new BitSet(new long[]{0x0000000000000002L,0x0000000030000503L});
	public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn3802 = new BitSet(new long[]{0x0000000000000002L,0x0000000030000403L});
	public static final BitSet FOLLOW_set_in_relationalExpressionNoIn3806 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn3828 = new BitSet(new long[]{0x0000000000000002L,0x0000000030000403L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression3847 = new BitSet(new long[]{0x0001000000000002L,0x0000090000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_set_in_equalityExpression3851 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression3869 = new BitSet(new long[]{0x0001000000000002L,0x0000090000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn3883 = new BitSet(new long[]{0x0001000000000002L,0x0000090000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_set_in_equalityExpressionNoIn3887 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn3905 = new BitSet(new long[]{0x0001000000000002L,0x0000090000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression3925 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_AND_in_bitwiseANDExpression3929 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression3931 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn3945 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_AND_in_bitwiseANDExpressionNoIn3949 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn3951 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression3967 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_XOR_in_bitwiseXORExpression3971 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression3973 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn3989 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_XOR_in_bitwiseXORExpressionNoIn3993 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn3995 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4010 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
	public static final BitSet FOLLOW_OR_in_bitwiseORExpression4014 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4016 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
	public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4031 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
	public static final BitSet FOLLOW_OR_in_bitwiseORExpressionNoIn4035 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4037 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
	public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression4056 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_LAND_in_logicalANDExpression4060 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression4062 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4076 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_LAND_in_logicalANDExpressionNoIn4080 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4082 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression4097 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
	public static final BitSet FOLLOW_LOR_in_logicalORExpression4101 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression4103 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
	public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4118 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
	public static final BitSet FOLLOW_LOR_in_logicalORExpressionNoIn4122 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4124 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
	public static final BitSet FOLLOW_logicalORExpression_in_conditionalExpression4143 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L});
	public static final BitSet FOLLOW_QUE_in_conditionalExpression4147 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression4149 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLON_in_conditionalExpression4151 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression4153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn4167 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L});
	public static final BitSet FOLLOW_QUE_in_conditionalExpressionNoIn4171 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4173 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLON_in_conditionalExpressionNoIn4175 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalExpression_in_assignmentExpression4206 = new BitSet(new long[]{0x0000002000000942L,0x0000800500000000L,0x0000020000021480L});
	public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpression4212 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression4214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_leftHandSideExpression_in_assignmentExpression4222 = new BitSet(new long[]{0x0000002000000940L,0x0000800500000000L,0x0000020000021480L});
	public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpression4224 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression4226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn4302 = new BitSet(new long[]{0x0000002000000942L,0x0000800500000000L,0x0000020000021480L});
	public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpressionNoIn4308 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn4310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentExpression_in_expression4333 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_in_expression4337 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_assignmentExpression_in_expression4341 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4361 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_in_expressionNoIn4365 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4369 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_SEMIC_in_semic4403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EOF_in_semic4408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RBRACE_in_semic4413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EOL_in_semic4420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MultiLineComment_in_semic4424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_statement4467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statementTail_in_statement4471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableStatement_in_statementTail4528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objectDeclaration_in_statementTail4533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_emptyStatement_in_statementTail4538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionStatement_in_statementTail4543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statementTail4548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iterationStatement_in_statementTail4553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_continueStatement_in_statementTail4558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breakStatement_in_statementTail4563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnStatement_in_statementTail4568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withStatement_in_statementTail4573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_labelledStatement_in_statementTail4578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchStatement_in_statementTail4583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_throwStatement_in_statementTail4588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tryStatement_in_statementTail4593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_block4608 = new BitSet(new long[]{0x4840104A20004020L,0xA00416000460A230L,0x0000006673490028L});
	public static final BitSet FOLLOW_statement_in_block4610 = new BitSet(new long[]{0x4840104A20004020L,0xA00416000460A230L,0x0000006673490028L});
	public static final BitSet FOLLOW_RBRACE_in_block4613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_variableStatement4631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableStatement4633 = new BitSet(new long[]{0x0000800008000000L,0x2000000800000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_COMMA_in_variableStatement4637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableStatement4639 = new BitSet(new long[]{0x0000800008000000L,0x2000000800000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_semic_in_variableStatement4644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_variableDeclaration4657 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_ASSIGN_in_variableDeclaration4661 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_assignmentExpression_in_variableDeclaration4663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_variableDeclarationNoIn4678 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_ASSIGN_in_variableDeclarationNoIn4682 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn4684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMIC_in_emptyStatement4703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionStatement4721 = new BitSet(new long[]{0x0000800000000000L,0x2000000800000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_semic_in_expressionStatement4723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStatement4741 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_ifStatement4743 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_expression_in_ifStatement4745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_RPAREN_in_ifStatement4747 = new BitSet(new long[]{0x4840104A20004020L,0x800416000460A230L,0x0000006673490028L});
	public static final BitSet FOLLOW_statement_in_ifStatement4749 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_elseStatement_in_ifStatement4755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_elseStatement4827 = new BitSet(new long[]{0x4840104A20004020L,0x800416000460A230L,0x0000006673490028L});
	public static final BitSet FOLLOW_statement_in_elseStatement4829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doStatement_in_iterationStatement4866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_iterationStatement4871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_iterationStatement4876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_doStatement4888 = new BitSet(new long[]{0x4840104A20004020L,0x800416000460A230L,0x0000006673490028L});
	public static final BitSet FOLLOW_statement_in_doStatement4890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_WHILE_in_doStatement4892 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_doStatement4894 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_expression_in_doStatement4896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_RPAREN_in_doStatement4898 = new BitSet(new long[]{0x0000800000000000L,0x2000000800000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_semic_in_doStatement4900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileStatement4986 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_whileStatement4988 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_expression_in_whileStatement4990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_RPAREN_in_whileStatement4992 = new BitSet(new long[]{0x4840104A20004020L,0x800416000460A230L,0x0000006673490028L});
	public static final BitSet FOLLOW_statement_in_whileStatement4994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forStatement5055 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_forStatement5057 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000651410028L});
	public static final BitSet FOLLOW_forControl_in_forStatement5059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_RPAREN_in_forStatement5061 = new BitSet(new long[]{0x4840104A20004020L,0x800416000460A230L,0x0000006673490028L});
	public static final BitSet FOLLOW_statement_in_forStatement5063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forControlVar_in_forControl5122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forControlExpression_in_forControl5127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forControlSemic_in_forControl5132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_forControlVar5143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar5145 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000100L,0x0000000000000020L});
	public static final BitSet FOLLOW_IN_in_forControlVar5157 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_expression_in_forControlVar5159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_forControlVar5182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar5184 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMIC_in_forControlVar5189 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410028L});
	public static final BitSet FOLLOW_expression_in_forControlVar5193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMIC_in_forControlVar5196 = new BitSet(new long[]{0x4040100A00000022L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_expression_in_forControlVar5200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionNoIn_in_forControlExpression5230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x0000000000000020L});
	public static final BitSet FOLLOW_IN_in_forControlExpression5245 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_expression_in_forControlExpression5249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMIC_in_forControlExpression5270 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410028L});
	public static final BitSet FOLLOW_expression_in_forControlExpression5274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMIC_in_forControlExpression5277 = new BitSet(new long[]{0x4040100A00000022L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_expression_in_forControlExpression5281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMIC_in_forControlSemic5304 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410028L});
	public static final BitSet FOLLOW_expression_in_forControlSemic5308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMIC_in_forControlSemic5311 = new BitSet(new long[]{0x4040100A00000022L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_expression_in_forControlSemic5315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTINUE_in_continueStatement5336 = new BitSet(new long[]{0x0000800000000000L,0x2000000800008000L,0x0000000000000020L});
	public static final BitSet FOLLOW_Identifier_in_continueStatement5340 = new BitSet(new long[]{0x0000800000000000L,0x2000000800000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_semic_in_continueStatement5343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_breakStatement5361 = new BitSet(new long[]{0x0000800000000000L,0x2000000800008000L,0x0000000000000020L});
	public static final BitSet FOLLOW_Identifier_in_breakStatement5365 = new BitSet(new long[]{0x0000800000000000L,0x2000000800000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_semic_in_breakStatement5368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_returnStatement5386 = new BitSet(new long[]{0x4040900A00000020L,0x200416080460A210L,0x0000000451410028L});
	public static final BitSet FOLLOW_expression_in_returnStatement5390 = new BitSet(new long[]{0x0000800000000000L,0x2000000800000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_semic_in_returnStatement5393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITH_in_withStatement5409 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_withStatement5411 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_expression_in_withStatement5413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_RPAREN_in_withStatement5415 = new BitSet(new long[]{0x4840104A20004020L,0x800416000460A230L,0x0000006673490028L});
	public static final BitSet FOLLOW_statement_in_withStatement5417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWITCH_in_switchStatement5488 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_switchStatement5490 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_expression_in_switchStatement5492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_RPAREN_in_switchStatement5494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_caseBlock_in_switchStatement5496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_caseBlock5509 = new BitSet(new long[]{0x0000000400200000L,0x2000000000000000L});
	public static final BitSet FOLLOW_caseClause_in_caseBlock5512 = new BitSet(new long[]{0x0000000400200000L,0x2000000000000000L});
	public static final BitSet FOLLOW_defaultClause_in_caseBlock5517 = new BitSet(new long[]{0x0000000000200000L,0x2000000000000000L});
	public static final BitSet FOLLOW_caseClause_in_caseBlock5520 = new BitSet(new long[]{0x0000000000200000L,0x2000000000000000L});
	public static final BitSet FOLLOW_RBRACE_in_caseBlock5526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_caseClause5537 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_expression_in_caseClause5539 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLON_in_caseClause5541 = new BitSet(new long[]{0x4840104A20004022L,0x800416000460A230L,0x0000006673490028L});
	public static final BitSet FOLLOW_statement_in_caseClause5543 = new BitSet(new long[]{0x4840104A20004022L,0x800416000460A230L,0x0000006673490028L});
	public static final BitSet FOLLOW_DEFAULT_in_defaultClause5556 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLON_in_defaultClause5558 = new BitSet(new long[]{0x4840104A20004022L,0x800416000460A230L,0x0000006673490028L});
	public static final BitSet FOLLOW_statement_in_defaultClause5560 = new BitSet(new long[]{0x4840104A20004022L,0x800416000460A230L,0x0000006673490028L});
	public static final BitSet FOLLOW_Identifier_in_labelledStatement5577 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLON_in_labelledStatement5579 = new BitSet(new long[]{0x4840104A20004020L,0x800416000460A230L,0x0000006673490028L});
	public static final BitSet FOLLOW_statement_in_labelledStatement5581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THROW_in_throwStatement5601 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_expression_in_throwStatement5605 = new BitSet(new long[]{0x0000800000000000L,0x2000000800000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_semic_in_throwStatement5607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRY_in_tryStatement5623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_block_in_tryStatement5625 = new BitSet(new long[]{0x0200000000400000L});
	public static final BitSet FOLLOW_catchClause_in_tryStatement5629 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_finallyClause_in_tryStatement5631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_finallyClause_in_tryStatement5636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CATCH_in_catchClause5650 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_catchClause5652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_catchClause5654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_RPAREN_in_catchClause5656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_block_in_catchClause5658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FINALLY_in_finallyClause5670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_block_in_finallyClause5672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_functionDeclaration5708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_functionDeclaration5712 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_formalParameterList_in_functionDeclaration5716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_functionDeclarationBody_in_functionDeclaration5720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_functionExpression5787 = new BitSet(new long[]{0x0000000000000000L,0x0000000004008000L});
	public static final BitSet FOLLOW_Identifier_in_functionExpression5789 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_formalParameterList_in_functionExpression5792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_functionExpressionBody_in_functionExpression5796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_formalParameterList5827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L,0x0000000000000001L});
	public static final BitSet FOLLOW_Identifier_in_formalParameterList5833 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_COMMA_in_formalParameterList5839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_formalParameterList5843 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_RPAREN_in_formalParameterList5853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_functionDeclarationBody5866 = new BitSet(new long[]{0x4840104A20004020L,0xA00416000460A230L,0x0000006673490028L});
	public static final BitSet FOLLOW_functionDeclarationBodyWithoutBraces_in_functionDeclarationBody5868 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_RBRACE_in_functionDeclarationBody5871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_functionExpressionBody5884 = new BitSet(new long[]{0x4840104A20004020L,0xA00416000460A230L,0x0000006673490028L});
	public static final BitSet FOLLOW_functionExpressionBodyWithoutBraces_in_functionExpressionBody5886 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_RBRACE_in_functionExpressionBody5889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sourceElement_in_functionExpressionBodyWithoutBraces5916 = new BitSet(new long[]{0x4840104A20004022L,0x800416000460A230L,0x0000006673490028L});
	public static final BitSet FOLLOW_sourceElement_in_functionExpressionBodyWithoutBraces5919 = new BitSet(new long[]{0x4840104A20004022L,0x800416000460A230L,0x0000006673490028L});
	public static final BitSet FOLLOW_sourceElement_in_functionDeclarationBodyWithoutBraces6020 = new BitSet(new long[]{0x4840104A20004022L,0x800416000460A230L,0x0000006673490028L});
	public static final BitSet FOLLOW_sourceElement_in_functionDeclarationBodyWithoutBraces6022 = new BitSet(new long[]{0x4840104A20004022L,0x800416000460A230L,0x0000006673490028L});
	public static final BitSet FOLLOW_sourceElement_in_program6128 = new BitSet(new long[]{0x4840104A20004022L,0x800416000460A230L,0x0000006673490028L});
	public static final BitSet FOLLOW_memberExpression_in_objectDeclaration6152 = new BitSet(new long[]{0x0000002000000940L,0x0000800500000000L,0x0000020000021480L});
	public static final BitSet FOLLOW_assignmentOperator_in_objectDeclaration6156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_objectLiteral_in_objectDeclaration6158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclaration_in_sourceElement6188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_sourceElement6193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayItem_in_synpred121_ES3YUITest3195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayItem_in_synpred123_ES3YUITest3189 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_in_synpred123_ES3YUITest3193 = new BitSet(new long[]{0x4040100A08000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_arrayItem_in_synpred123_ES3YUITest3195 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_memberExpressionSuffix_in_synpred129_ES3YUITest3324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentOperator_in_synpred189_ES3YUITest4212 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_assignmentExpression_in_synpred189_ES3YUITest4214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalExpression_in_synpred190_ES3YUITest4206 = new BitSet(new long[]{0x0000002000000942L,0x0000800500000000L,0x0000020000021480L});
	public static final BitSet FOLLOW_assignmentOperator_in_synpred190_ES3YUITest4212 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_assignmentExpression_in_synpred190_ES3YUITest4214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentOperator_in_synpred202_ES3YUITest4308 = new BitSet(new long[]{0x4040100A00000020L,0x000416000460A210L,0x0000000451410008L});
	public static final BitSet FOLLOW_assignmentExpressionNoIn_in_synpred202_ES3YUITest4310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_synpred209_ES3YUITest4467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objectDeclaration_in_synpred211_ES3YUITest4533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionStatement_in_synpred213_ES3YUITest4543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_labelledStatement_in_synpred220_ES3YUITest4578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_elseStatement_in_synpred227_ES3YUITest4755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclaration_in_synpred259_ES3YUITest6188 = new BitSet(new long[]{0x0000000000000002L});
}
