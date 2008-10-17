// $ANTLR 3.0.1 src/main/resources/org/drools/lang/DRL.g 2008-10-16 18:53:58

	package org.drools.lang;
	
	import java.util.List;
	import java.util.LinkedList;
	import org.drools.compiler.DroolsParserException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class DRLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VT_COMPILATION_UNIT", "VT_FUNCTION_IMPORT", "VT_FACT", "VT_CONSTRAINTS", "VT_LABEL", "VT_QUERY_ID", "VT_TEMPLATE_ID", "VT_TYPE_DECLARE_ID", "VT_RULE_ID", "VT_ENTRYPOINT_ID", "VT_SLOT_ID", "VT_SLOT", "VT_RULE_ATTRIBUTES", "VT_RHS_CHUNK", "VT_CURLY_CHUNK", "VT_SQUARE_CHUNK", "VT_PAREN_CHUNK", "VT_BEHAVIOR", "VT_AND_IMPLICIT", "VT_AND_PREFIX", "VT_OR_PREFIX", "VT_AND_INFIX", "VT_OR_INFIX", "VT_ACCUMULATE_INIT_CLAUSE", "VT_ACCUMULATE_ID_CLAUSE", "VT_FROM_SOURCE", "VT_EXPRESSION_CHAIN", "VT_PATTERN", "VT_FACT_BINDING", "VT_FACT_OR", "VT_BIND_FIELD", "VT_FIELD", "VT_ACCESSOR_PATH", "VT_ACCESSOR_ELEMENT", "VT_DATA_TYPE", "VT_PATTERN_TYPE", "VT_PACKAGE_ID", "VT_IMPORT_ID", "VT_GLOBAL_ID", "VT_FUNCTION_ID", "VT_PARAM_LIST", "VK_DATE_EFFECTIVE", "VK_DATE_EXPIRES", "VK_LOCK_ON_ACTIVE", "VK_NO_LOOP", "VK_AUTO_FOCUS", "VK_ACTIVATION_GROUP", "VK_AGENDA_GROUP", "VK_RULEFLOW_GROUP", "VK_DURATION", "VK_DIALECT", "VK_SALIENCE", "VK_ENABLED", "VK_ATTRIBUTES", "VK_RULE", "VK_IMPORT", "VK_PACKAGE", "VK_TEMPLATE", "VK_QUERY", "VK_DECLARE", "VK_FUNCTION", "VK_GLOBAL", "VK_EVAL", "VK_CONTAINS", "VK_MATCHES", "VK_EXCLUDES", "VK_SOUNDSLIKE", "VK_MEMBEROF", "VK_ENTRY_POINT", "VK_NOT", "VK_IN", "VK_OR", "VK_AND", "VK_EXISTS", "VK_FORALL", "VK_ACTION", "VK_REVERSE", "VK_RESULT", "SEMICOLON", "ID", "DOT", "DOT_STAR", "END", "STRING", "LEFT_PAREN", "COMMA", "RIGHT_PAREN", "AT", "COLON", "EQUALS", "WHEN", "BOOL", "INT", "DOUBLE_PIPE", "DOUBLE_AMPER", "FROM", "OVER", "ACCUMULATE", "INIT", "COLLECT", "ARROW", "EQUAL", "GREATER", "GREATER_EQUAL", "LESS", "LESS_EQUAL", "NOT_EQUAL", "GRAVE_ACCENT", "FLOAT", "NULL", "LEFT_SQUARE", "RIGHT_SQUARE", "THEN", "LEFT_CURLY", "RIGHT_CURLY", "MISC", "EOL", "WS", "EscapeSequence", "HexDigit", "UnicodeEscape", "OctalEscape", "SH_STYLE_SINGLE_LINE_COMMENT", "C_STYLE_SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT"
    };
    public static final int ACCUMULATE=101;
    public static final int VT_ACCESSOR_ELEMENT=37;
    public static final int VT_DATA_TYPE=38;
    public static final int DOT_STAR=85;
    public static final int VK_FUNCTION=64;
    public static final int VK_GLOBAL=65;
    public static final int VK_AND=76;
    public static final int EQUALS=93;
    public static final int SH_STYLE_SINGLE_LINE_COMMENT=126;
    public static final int VK_AUTO_FOCUS=49;
    public static final int VK_SALIENCE=55;
    public static final int EOF=-1;
    public static final int VT_PATTERN_TYPE=39;
    public static final int VT_FUNCTION_IMPORT=5;
    public static final int VT_OR_INFIX=26;
    public static final int EOL=120;
    public static final int GREATER=106;
    public static final int DOUBLE_AMPER=98;
    public static final int VK_IMPORT=59;
    public static final int NOT_EQUAL=110;
    public static final int VK_ACTION=79;
    public static final int VK_RULE=58;
    public static final int LESS=108;
    public static final int VK_MEMBEROF=71;
    public static final int GRAVE_ACCENT=111;
    public static final int VT_SLOT=15;
    public static final int VK_OR=75;
    public static final int VT_AND_PREFIX=23;
    public static final int NULL=113;
    public static final int BOOL=95;
    public static final int VK_QUERY=62;
    public static final int INT=96;
    public static final int SEMICOLON=82;
    public static final int VT_FUNCTION_ID=43;
    public static final int VT_RHS_CHUNK=17;
    public static final int VT_FACT_BINDING=32;
    public static final int VK_RULEFLOW_GROUP=52;
    public static final int VK_ENTRY_POINT=72;
    public static final int VT_PACKAGE_ID=40;
    public static final int VK_RESULT=81;
    public static final int VT_LABEL=8;
    public static final int WS=121;
    public static final int VK_NO_LOOP=48;
    public static final int LEFT_CURLY=117;
    public static final int VT_FACT=6;
    public static final int VT_PATTERN=31;
    public static final int VK_IN=74;
    public static final int LEFT_PAREN=88;
    public static final int LESS_EQUAL=109;
    public static final int VT_IMPORT_ID=41;
    public static final int VT_RULE_ID=12;
    public static final int MISC=119;
    public static final int FROM=99;
    public static final int END=86;
    public static final int COLLECT=103;
    public static final int INIT=102;
    public static final int EscapeSequence=122;
    public static final int VK_ACTIVATION_GROUP=50;
    public static final int VK_ENABLED=56;
    public static final int C_STYLE_SINGLE_LINE_COMMENT=127;
    public static final int VK_PACKAGE=60;
    public static final int OVER=100;
    public static final int RIGHT_SQUARE=115;
    public static final int RIGHT_CURLY=118;
    public static final int VK_MATCHES=68;
    public static final int VT_FACT_OR=33;
    public static final int VT_FIELD=35;
    public static final int FLOAT=112;
    public static final int VT_ACCUMULATE_ID_CLAUSE=28;
    public static final int VK_EXISTS=77;
    public static final int VK_DATE_EXPIRES=46;
    public static final int ID=83;
    public static final int HexDigit=123;
    public static final int VT_OR_PREFIX=24;
    public static final int VK_EVAL=66;
    public static final int DOUBLE_PIPE=97;
    public static final int AT=91;
    public static final int RIGHT_PAREN=90;
    public static final int THEN=116;
    public static final int VT_COMPILATION_UNIT=4;
    public static final int VT_EXPRESSION_CHAIN=30;
    public static final int COMMA=89;
    public static final int EQUAL=105;
    public static final int VT_BEHAVIOR=21;
    public static final int VT_QUERY_ID=9;
    public static final int VK_DIALECT=54;
    public static final int DOT=84;
    public static final int VT_GLOBAL_ID=42;
    public static final int VK_NOT=73;
    public static final int VT_FROM_SOURCE=29;
    public static final int VT_ENTRYPOINT_ID=13;
    public static final int VK_DECLARE=63;
    public static final int VT_PAREN_CHUNK=20;
    public static final int VK_CONTAINS=67;
    public static final int VT_TYPE_DECLARE_ID=11;
    public static final int VK_REVERSE=80;
    public static final int VK_LOCK_ON_ACTIVE=47;
    public static final int VK_TEMPLATE=61;
    public static final int VT_AND_INFIX=25;
    public static final int VT_RULE_ATTRIBUTES=16;
    public static final int VK_DURATION=53;
    public static final int VT_ACCESSOR_PATH=36;
    public static final int MULTI_LINE_COMMENT=128;
    public static final int VK_FORALL=78;
    public static final int COLON=92;
    public static final int VK_EXCLUDES=69;
    public static final int VT_AND_IMPLICIT=22;
    public static final int VK_SOUNDSLIKE=70;
    public static final int VT_ACCUMULATE_INIT_CLAUSE=27;
    public static final int VT_CURLY_CHUNK=18;
    public static final int VT_SLOT_ID=14;
    public static final int VK_ATTRIBUTES=57;
    public static final int WHEN=94;
    public static final int UnicodeEscape=124;
    public static final int VT_SQUARE_CHUNK=19;
    public static final int VT_TEMPLATE_ID=10;
    public static final int VK_DATE_EFFECTIVE=45;
    public static final int VT_PARAM_LIST=44;
    public static final int ARROW=104;
    public static final int VT_BIND_FIELD=34;
    public static final int VT_CONSTRAINTS=7;
    public static final int VK_AGENDA_GROUP=51;
    public static final int LEFT_SQUARE=114;
    public static final int OctalEscape=125;
    public static final int GREATER_EQUAL=107;
    public static final int STRING=87;

        public DRLParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[141+1];
         }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "src/main/resources/org/drools/lang/DRL.g"; }


    	private Stack<Map<DroolsParaphraseTypes, String>> paraphrases = new Stack<Map<DroolsParaphraseTypes, String>>();
    	private List<DroolsParserException> errors = new ArrayList<DroolsParserException>();
    	private DroolsParserExceptionFactory errorMessageFactory = new DroolsParserExceptionFactory(tokenNames, paraphrases);
    	private String source = "unknown";
    	private boolean lookaheadTest = false;
    	private LinkedList<DroolsSentence> editorInterface = null;
    	private boolean isEditorInterfaceEnabled = false;

    	public LinkedList<DroolsSentence> getEditorInterface(){
    		return editorInterface;
    	}

    	public void enableEditorInterface(){
    		isEditorInterfaceEnabled = true;
    	}

    	public void disableEditorInterface(){
    		isEditorInterfaceEnabled = false;
    	}

    	private void beginSentence(DroolsSentenceType sentenceType){
    		if (isEditorInterfaceEnabled) {
    			if (null == editorInterface) {
    				editorInterface = new LinkedList<DroolsSentence>();
    			}
    			DroolsSentence sentence = new DroolsSentence();
    			sentence.setType(sentenceType);
    			editorInterface.add(sentence);
    		}
    	}

    	private DroolsSentence getActiveSentence(){
    		return editorInterface.getLast();
    	}

    	private void emit(List tokens, DroolsEditorType editorType){
    		if (isEditorInterfaceEnabled && tokens != null) {		
    			for (Object activeObject : tokens){
    				emit((Token) activeObject, editorType);
    			}
    		}
    	}

    	private void emit(Token token, DroolsEditorType editorType){
    		if (isEditorInterfaceEnabled && token != null) {
    			((DroolsToken)token).setEditorType(editorType);
    			getActiveSentence().addContent((DroolsToken) token);
    		}
    	}

    	private void emit(boolean forceEmit, int activeContext){
    		if (isEditorInterfaceEnabled) {
    				getActiveSentence().addContent(activeContext);
    		}
    	}
    	
    	private void emit(int activeContext){
    		if (isEditorInterfaceEnabled) {
    			emit(false, activeContext);
    		}
    	}

    	private DroolsToken getLastTokenOnList(LinkedList list){
    		DroolsToken lastToken = null;
    		for (Object object : list) {
    			if (object instanceof DroolsToken) {
    				lastToken = (DroolsToken) object;
    			}
    		}
    		return lastToken;
    	}

    	private int getLastIntegerValue(LinkedList list) {
    		int lastIntergerValue = -1;
    		for (Object object : list) {
    			if (object instanceof Integer) {
    				lastIntergerValue = (Integer) object;
    			}
    		}
    		return lastIntergerValue;
    	}

    	private boolean validateLT(int LTNumber, String text) {
    		if (null == input)
    			return false;
    		if (null == input.LT(LTNumber))
    			return false;
    		if (null == input.LT(LTNumber).getText())
    			return false;
    	
    		String text2Validate = input.LT(LTNumber).getText();
    		return text2Validate.equalsIgnoreCase(text);
    	}
    	
    	private boolean validateIdentifierKey(String text) {
    		return validateLT(1, text);
    	}
    	
    	void checkTrailingSemicolon(String text, Token token) {
    		if (text.trim().endsWith(";")) {
    			errors.add(errorMessageFactory
    					.createTrailingSemicolonException(((DroolsToken) token)
    							.getLine(), ((DroolsToken) token)
    							.getCharPositionInLine(), ((DroolsToken) token)
    							.getStopIndex()));
    		}
    	}
    	
    	private boolean validateNotWithBinding(){
    		if (input.LA(1) == ID && input.LA(2) == ID && input.LA(3) == COLON){
    			return true;
    		}
    		return false;
    	}

    	private boolean validateRestr() {
    		int lookahead = 2;
    		int countParen = 1;

    		while (true) {
    			if (input.LA(lookahead) == COMMA) {
    				break;
    			} else if (input.LA(lookahead) == LEFT_PAREN) {
    				countParen++;
    			} else if (input.LA(lookahead) == RIGHT_PAREN) {
    				countParen--;
    			} else if (input.LA(lookahead) == EOF) {
    				break;
    			}
    			if (countParen == 0){
    				break;
    			}
    			lookahead++;
    		}
    		
    		boolean returnValue = false;
    		int activeIndex = input.index();
    		lookaheadTest = true;
    		try {
    			input.seek(input.LT(2).getTokenIndex());
    			constraint_expression();
    			returnValue = true;
    		} catch (RecognitionException e) {
    		} finally{
    			input.seek(activeIndex);
    		}
    		lookaheadTest = false;

    		return returnValue;
    	}
    	
    	private String safeSubstring(String text, int start, int end) {
    		return text.substring(Math.min(start, text.length()), Math.min(Math
    				.max(start, end), text.length()));
    	}
    	
    	public void reportError(RecognitionException ex) {
    		// if we've already reported an error and have not matched a token
    		// yet successfully, don't report any errors.
    		if (errorRecovery) {
    			return;
    		}
    		errorRecovery = true;
    	
    		errors.add(errorMessageFactory.createDroolsException(ex));
    	}
    	
    	/** return the raw DroolsParserException errors */
    	public List<DroolsParserException> getErrors() {
    		return errors;
    	}
    	
    	/** Return a list of pretty strings summarising the errors */
    	public List<String> getErrorMessages() {
    		List<String> messages = new ArrayList<String>(errors.size());
    	
    		for (DroolsParserException activeException : errors) {
    			messages.add(activeException.getMessage());
    		}
    	
    		return messages;
    	}
    	
    	/** return true if any parser errors were accumulated */
    	public boolean hasErrors() {
    		return !errors.isEmpty();
    	}

    	/**
    	 * Method that adds a paraphrase type into paraphrases stack.
    	 * 
    	 * @param type
    	 *            paraphrase type
    	 */
    	private void pushParaphrases(DroolsParaphraseTypes type) {
    		Map<DroolsParaphraseTypes, String> activeMap = new HashMap<DroolsParaphraseTypes, String>();
    		activeMap.put(type, "");
    		paraphrases.push(activeMap);
    	}

    	/**
    	 * Method that sets paraphrase value for a type into paraphrases stack.
    	 * 
    	 * @param type
    	 *            paraphrase type
    	 * @param value
    	 *            paraphrase value
    	 */
    	private void setParaphrasesValue(DroolsParaphraseTypes type, String value) {
    		paraphrases.peek().put(type, value);
    	}

    	/**
    	 * Helper method that creates a string from a token list.
    	 * 
    	 * @param tokenList
    	 *            token list
    	 * @return string
    	 */
    	private String buildStringFromTokens(List<Token> tokenList) {
    		StringBuilder sb = new StringBuilder();
    		if (null != tokenList) {
    			for (Token activeToken : tokenList) {
    				if (null != activeToken) {
    					sb.append(activeToken.getText());
    				}
    			}
    		}
    		return sb.toString();
    	}
    	
    	/**
    	 * This methos is a copy from ANTLR base class (BaseRecognizer). 
    	 * We had to copy it just to remove a System.err.println() 
    	 * 
    	 */
    	public void recoverFromMismatchedToken(IntStream input,
    			RecognitionException e, int ttype, BitSet follow)
    			throws RecognitionException {
    		// if next token is what we are looking for then "delete" this token
    		if (input.LA(2) == ttype) {
    			reportError(e);
    			/*
    			 * System.err.println("recoverFromMismatchedToken deleting
    			 * "+input.LT(1)+ " since "+input.LT(2)+" is what we want");
    			 */
    			beginResync();
    			input.consume(); // simply delete extra token
    			endResync();
    			input.consume(); // move past ttype token as if all were ok
    			return;
    		}
    		if (!recoverFromMismatchedElement(input, e, follow)) {
    			throw e;
    		}
    	}
    	
    	/** Overrided this method to not output mesages */
    	public void emitErrorMessage(String msg) {
    	}


    public static class compilation_unit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start compilation_unit
    // src/main/resources/org/drools/lang/DRL.g:395:1: compilation_unit : ( package_statement )? ( statement )* EOF -> ^( VT_COMPILATION_UNIT ( package_statement )? ( statement )* ) ;
    public final compilation_unit_return compilation_unit() throws RecognitionException {
        compilation_unit_return retval = new compilation_unit_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF3=null;
        package_statement_return package_statement1 = null;

        statement_return statement2 = null;


        Object EOF3_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_package_statement=new RewriteRuleSubtreeStream(adaptor,"rule package_statement");
        try {
            // src/main/resources/org/drools/lang/DRL.g:396:2: ( ( package_statement )? ( statement )* EOF -> ^( VT_COMPILATION_UNIT ( package_statement )? ( statement )* ) )
            // src/main/resources/org/drools/lang/DRL.g:396:4: ( package_statement )? ( statement )* EOF
            {
            // src/main/resources/org/drools/lang/DRL.g:396:4: ( package_statement )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==ID) && ((((validateLT(1, "import") && validateLT(2, "function") )&&(validateIdentifierKey(DroolsSoftKeywords.IMPORT)))||(validateIdentifierKey(DroolsSoftKeywords.AUTO) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.FOCUS))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||(validateIdentifierKey(DroolsSoftKeywords.ACTIVATION) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||(validateIdentifierKey(DroolsSoftKeywords.SALIENCE))||(validateIdentifierKey(DroolsSoftKeywords.RULE))||((validateLT(1, "import") && validateLT(2, "function") )&&(validateIdentifierKey(DroolsSoftKeywords.IMPORT)))||(validateIdentifierKey(DroolsSoftKeywords.LOCK) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.ON) && validateLT(4, "-") && validateLT(5, DroolsSoftKeywords.ACTIVE))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||(validateIdentifierKey(DroolsSoftKeywords.DATE) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.EXPIRES))||((validateLT(1, "import") && validateLT(2, "function") )&&(validateIdentifierKey(DroolsSoftKeywords.IMPORT)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||(validateIdentifierKey(DroolsSoftKeywords.QUERY))||(validateIdentifierKey(DroolsSoftKeywords.DIALECT))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||(validateIdentifierKey(DroolsSoftKeywords.AGENDA) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||(validateIdentifierKey(DroolsSoftKeywords.ENABLED))||(validateIdentifierKey(DroolsSoftKeywords.RULEFLOW) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, "import") && validateLT(2, "function") )&&(validateIdentifierKey(DroolsSoftKeywords.IMPORT)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, "import") && validateLT(2, "function") )&&(validateIdentifierKey(DroolsSoftKeywords.IMPORT)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||(validateIdentifierKey(DroolsSoftKeywords.IMPORT))||(validateIdentifierKey(DroolsSoftKeywords.DATE) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.EFFECTIVE))||(validateIdentifierKey(DroolsSoftKeywords.PACKAGE))||(validateIdentifierKey(DroolsSoftKeywords.FUNCTION))||(validateIdentifierKey(DroolsSoftKeywords.NO) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.LOOP))||(validateIdentifierKey(DroolsSoftKeywords.GLOBAL))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, "import") && validateLT(2, "function") )&&(validateIdentifierKey(DroolsSoftKeywords.IMPORT)))||(validateIdentifierKey(DroolsSoftKeywords.DURATION))||((validateLT(1, "import") && validateLT(2, "function") )&&(validateIdentifierKey(DroolsSoftKeywords.IMPORT)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))))) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==ID) && ((((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, "import") && validateLT(2, "function") )&&(validateIdentifierKey(DroolsSoftKeywords.IMPORT)))||(validateIdentifierKey(DroolsSoftKeywords.IMPORT))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, "import") && validateLT(2, "function") )&&(validateIdentifierKey(DroolsSoftKeywords.IMPORT)))||((validateLT(1, "import") && validateLT(2, "function") )&&(validateIdentifierKey(DroolsSoftKeywords.IMPORT)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||(validateIdentifierKey(DroolsSoftKeywords.RULE))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, "import") && validateLT(2, "function") )&&(validateIdentifierKey(DroolsSoftKeywords.IMPORT)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, "import") && validateLT(2, "function") )&&(validateIdentifierKey(DroolsSoftKeywords.IMPORT)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, "import") && validateLT(2, "function") )&&(validateIdentifierKey(DroolsSoftKeywords.IMPORT)))||(validateIdentifierKey(DroolsSoftKeywords.QUERY))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, "import") && validateLT(2, "function") )&&(validateIdentifierKey(DroolsSoftKeywords.IMPORT)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||(validateIdentifierKey(DroolsSoftKeywords.PACKAGE))||(validateIdentifierKey(DroolsSoftKeywords.FUNCTION))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||(validateIdentifierKey(DroolsSoftKeywords.GLOBAL))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))))) {
                    int LA1_5 = input.LA(3);

                    if ( ((validateIdentifierKey(DroolsSoftKeywords.PACKAGE))) ) {
                        alt1=1;
                    }
                }
            }
            switch (alt1) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:396:4: package_statement
                    {
                    pushFollow(FOLLOW_package_statement_in_compilation_unit388);
                    package_statement1=package_statement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_package_statement.add(package_statement1.getTree());

                    }
                    break;

            }

            // src/main/resources/org/drools/lang/DRL.g:397:3: ( statement )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ID) && (((validateIdentifierKey(DroolsSoftKeywords.AUTO) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.FOCUS))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||(validateIdentifierKey(DroolsSoftKeywords.ACTIVATION) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||(validateIdentifierKey(DroolsSoftKeywords.RULE))||(validateIdentifierKey(DroolsSoftKeywords.SALIENCE))||(validateIdentifierKey(DroolsSoftKeywords.IMPORT))||(validateIdentifierKey(DroolsSoftKeywords.LOCK) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.ON) && validateLT(4, "-") && validateLT(5, DroolsSoftKeywords.ACTIVE))||(validateIdentifierKey(DroolsSoftKeywords.DATE) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.EFFECTIVE))||(validateIdentifierKey(DroolsSoftKeywords.FUNCTION))||(validateIdentifierKey(DroolsSoftKeywords.NO) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.LOOP))||(validateIdentifierKey(DroolsSoftKeywords.DATE) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.EXPIRES))||(validateIdentifierKey(DroolsSoftKeywords.DIALECT))||(validateIdentifierKey(DroolsSoftKeywords.GLOBAL))||(validateIdentifierKey(DroolsSoftKeywords.QUERY))||((validateLT(1, "import") && validateLT(2, "function") )&&(validateIdentifierKey(DroolsSoftKeywords.IMPORT)))||(validateIdentifierKey(DroolsSoftKeywords.AGENDA) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||(validateIdentifierKey(DroolsSoftKeywords.RULEFLOW) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||(validateIdentifierKey(DroolsSoftKeywords.ENABLED))||(validateIdentifierKey(DroolsSoftKeywords.DURATION))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))))) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:397:3: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_compilation_unit393);
            	    statement2=statement();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_statement.add(statement2.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            EOF3=(Token)input.LT(1);
            match(input,EOF,FOLLOW_EOF_in_compilation_unit398); if (failed) return retval;
            if ( backtracking==0 ) stream_EOF.add(EOF3);


            // AST REWRITE
            // elements: statement, package_statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 399:3: -> ^( VT_COMPILATION_UNIT ( package_statement )? ( statement )* )
            {
                // src/main/resources/org/drools/lang/DRL.g:399:6: ^( VT_COMPILATION_UNIT ( package_statement )? ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(VT_COMPILATION_UNIT, "VT_COMPILATION_UNIT"), root_1);

                // src/main/resources/org/drools/lang/DRL.g:399:28: ( package_statement )?
                if ( stream_package_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_package_statement.next());

                }
                stream_package_statement.reset();
                // src/main/resources/org/drools/lang/DRL.g:399:47: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.next());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch ( RecognitionException e ) {

            		reportError( e );
            	
        }
        catch ( RewriteEmptyStreamException e ) {

            	
        }
        finally {

            	if (isEditorInterfaceEnabled && retval.tree == null) {
            		retval.tree = root_0;
            		root_0 = (Object) adaptor.nil();
            		Object root_1 = (Object) adaptor.nil();
            		root_1 = (Object) adaptor.becomeRoot(adaptor.create(
            				VT_COMPILATION_UNIT, "VT_COMPILATION_UNIT"), root_1);
            		if (stream_package_statement.hasNext()) {
            			adaptor.addChild(root_1, stream_package_statement.next());
            		}
            		while (stream_statement.hasNext()) {
            			adaptor.addChild(root_1, stream_statement.next());
            		}
            		adaptor.addChild(root_0, root_1);
            		retval.stop = input.LT(-1);
            		retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            		adaptor.setTokenBoundaries(retval.tree, retval.start,
            				retval.stop);
            	}
            	if (isEditorInterfaceEnabled && hasErrors()) {
            		DroolsTree rootNode = (DroolsTree) retval.tree;
            		for (int i = 0; i < rootNode.getChildCount(); i++) {
            			DroolsTree childNode = (DroolsTree) rootNode.getChild(i);
            			if (childNode.getStartCharOffset() >= errors.get(0).getOffset()) {
            				rootNode.deleteChild(i);
            			}
            		}
            	}

        }
        return retval;
    }
    // $ANTLR end compilation_unit

    public static class package_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start package_statement
    // src/main/resources/org/drools/lang/DRL.g:436:1: package_statement : package_key package_id ( SEMICOLON )? -> ^( package_key package_id ) ;
    public final package_statement_return package_statement() throws RecognitionException {
        package_statement_return retval = new package_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON6=null;
        package_key_return package_key4 = null;

        package_id_return package_id5 = null;


        Object SEMICOLON6_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_package_key=new RewriteRuleSubtreeStream(adaptor,"rule package_key");
        RewriteRuleSubtreeStream stream_package_id=new RewriteRuleSubtreeStream(adaptor,"rule package_id");
         pushParaphrases(DroolsParaphraseTypes.PACKAGE); 
        try {
            // src/main/resources/org/drools/lang/DRL.g:439:2: ( package_key package_id ( SEMICOLON )? -> ^( package_key package_id ) )
            // src/main/resources/org/drools/lang/DRL.g:440:2: package_key package_id ( SEMICOLON )?
            {
            if ( backtracking==0 ) {
              	beginSentence(DroolsSentenceType.PACKAGE);	
            }
            pushFollow(FOLLOW_package_key_in_package_statement458);
            package_key4=package_key();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_package_key.add(package_key4.getTree());
            pushFollow(FOLLOW_package_id_in_package_statement462);
            package_id5=package_id();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_package_id.add(package_id5.getTree());
            // src/main/resources/org/drools/lang/DRL.g:442:14: ( SEMICOLON )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==SEMICOLON) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:442:14: SEMICOLON
                    {
                    SEMICOLON6=(Token)input.LT(1);
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_package_statement464); if (failed) return retval;
                    if ( backtracking==0 ) stream_SEMICOLON.add(SEMICOLON6);


                    }
                    break;

            }

            if ( backtracking==0 ) {
              	emit(SEMICOLON6, DroolsEditorType.SYMBOL);	
            }

            // AST REWRITE
            // elements: package_key, package_id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 444:3: -> ^( package_key package_id )
            {
                // src/main/resources/org/drools/lang/DRL.g:444:6: ^( package_key package_id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_package_key.nextNode(), root_1);

                adaptor.addChild(root_1, stream_package_id.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( backtracking==0 ) {
               paraphrases.pop(); 
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end package_statement

    public static class package_id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start package_id
    // src/main/resources/org/drools/lang/DRL.g:447:1: package_id : id+= ID (id+= DOT id+= ID )* -> ^( VT_PACKAGE_ID ( ID )+ ) ;
    public final package_id_return package_id() throws RecognitionException {
        package_id_return retval = new package_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;
        List list_id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");

        try {
            // src/main/resources/org/drools/lang/DRL.g:448:2: (id+= ID (id+= DOT id+= ID )* -> ^( VT_PACKAGE_ID ( ID )+ ) )
            // src/main/resources/org/drools/lang/DRL.g:448:4: id+= ID (id+= DOT id+= ID )*
            {
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_package_id491); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if (list_id==null) list_id=new ArrayList();
            list_id.add(id);

            // src/main/resources/org/drools/lang/DRL.g:448:11: (id+= DOT id+= ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==DOT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:448:13: id+= DOT id+= ID
            	    {
            	    id=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_package_id497); if (failed) return retval;
            	    if ( backtracking==0 ) stream_DOT.add(id);

            	    if (list_id==null) list_id=new ArrayList();
            	    list_id.add(id);

            	    id=(Token)input.LT(1);
            	    match(input,ID,FOLLOW_ID_in_package_id501); if (failed) return retval;
            	    if ( backtracking==0 ) stream_ID.add(id);

            	    if (list_id==null) list_id=new ArrayList();
            	    list_id.add(id);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( backtracking==0 ) {
              	emit(list_id, DroolsEditorType.IDENTIFIER);
              		setParaphrasesValue(DroolsParaphraseTypes.PACKAGE, buildStringFromTokens(list_id));	
            }

            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 451:3: -> ^( VT_PACKAGE_ID ( ID )+ )
            {
                // src/main/resources/org/drools/lang/DRL.g:451:6: ^( VT_PACKAGE_ID ( ID )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(VT_PACKAGE_ID, "VT_PACKAGE_ID"), root_1);

                if ( !(stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.next());

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end package_id

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start statement
    // src/main/resources/org/drools/lang/DRL.g:454:1: statement options {k=2; } : ( rule_attribute | {...}? => function_import_statement | import_statement | global | function | {...}? => template | {...}? => type_declaration | rule | query );
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        rule_attribute_return rule_attribute7 = null;

        function_import_statement_return function_import_statement8 = null;

        import_statement_return import_statement9 = null;

        global_return global10 = null;

        function_return function11 = null;

        template_return template12 = null;

        type_declaration_return type_declaration13 = null;

        rule_return rule14 = null;

        query_return query15 = null;



        try {
            // src/main/resources/org/drools/lang/DRL.g:457:3: ( rule_attribute | {...}? => function_import_statement | import_statement | global | function | {...}? => template | {...}? => type_declaration | rule | query )
            int alt5=9;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID) && ((((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||(validateIdentifierKey(DroolsSoftKeywords.AUTO) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.FOCUS))||(validateIdentifierKey(DroolsSoftKeywords.ACTIVATION) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||((validateLT(1, "import") && validateLT(2, "function") )&&(validateIdentifierKey(DroolsSoftKeywords.IMPORT)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||(validateIdentifierKey(DroolsSoftKeywords.SALIENCE))||(validateIdentifierKey(DroolsSoftKeywords.RULE))||(validateIdentifierKey(DroolsSoftKeywords.LOCK) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.ON) && validateLT(4, "-") && validateLT(5, DroolsSoftKeywords.ACTIVE))||((validateLT(1, "import") && validateLT(2, "function") )&&(validateIdentifierKey(DroolsSoftKeywords.IMPORT)))||((validateLT(1, "import") && validateLT(2, "function") )&&(validateIdentifierKey(DroolsSoftKeywords.IMPORT)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||(validateIdentifierKey(DroolsSoftKeywords.DATE) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.EXPIRES))||((validateLT(1, "import") && validateLT(2, "function") )&&(validateIdentifierKey(DroolsSoftKeywords.IMPORT)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||(validateIdentifierKey(DroolsSoftKeywords.QUERY))||(validateIdentifierKey(DroolsSoftKeywords.DIALECT))||(validateIdentifierKey(DroolsSoftKeywords.AGENDA) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||(validateIdentifierKey(DroolsSoftKeywords.ENABLED))||(validateIdentifierKey(DroolsSoftKeywords.RULEFLOW) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||((validateLT(1, "import") && validateLT(2, "function") )&&(validateIdentifierKey(DroolsSoftKeywords.IMPORT)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||(validateIdentifierKey(DroolsSoftKeywords.IMPORT))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||(validateIdentifierKey(DroolsSoftKeywords.DATE) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.EFFECTIVE))||(validateIdentifierKey(DroolsSoftKeywords.FUNCTION))||(validateIdentifierKey(DroolsSoftKeywords.NO) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.LOOP))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, "import") && validateLT(2, "function") )&&(validateIdentifierKey(DroolsSoftKeywords.IMPORT)))||(validateIdentifierKey(DroolsSoftKeywords.GLOBAL))||((validateLT(1, "import") && validateLT(2, "function") )&&(validateIdentifierKey(DroolsSoftKeywords.IMPORT)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||(validateIdentifierKey(DroolsSoftKeywords.DURATION))))) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==MISC) && (((validateIdentifierKey(DroolsSoftKeywords.NO) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.LOOP))||(validateIdentifierKey(DroolsSoftKeywords.AUTO) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.FOCUS))||(validateIdentifierKey(DroolsSoftKeywords.DATE) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.EXPIRES))||(validateIdentifierKey(DroolsSoftKeywords.ACTIVATION) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||(validateIdentifierKey(DroolsSoftKeywords.AGENDA) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||(validateIdentifierKey(DroolsSoftKeywords.RULEFLOW) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||(validateIdentifierKey(DroolsSoftKeywords.LOCK) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.ON) && validateLT(4, "-") && validateLT(5, DroolsSoftKeywords.ACTIVE))||(validateIdentifierKey(DroolsSoftKeywords.DATE) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.EFFECTIVE))))) {
                    alt5=1;
                }
                else if ( (LA5_1==ID) && ((((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, "import") && validateLT(2, "function") )&&(validateIdentifierKey(DroolsSoftKeywords.IMPORT)))||(validateIdentifierKey(DroolsSoftKeywords.RULE))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, "import") && validateLT(2, "function") )&&(validateIdentifierKey(DroolsSoftKeywords.IMPORT)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||(validateIdentifierKey(DroolsSoftKeywords.QUERY))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, "import") && validateLT(2, "function") )&&(validateIdentifierKey(DroolsSoftKeywords.IMPORT)))||((validateLT(1, "import") && validateLT(2, "function") )&&(validateIdentifierKey(DroolsSoftKeywords.IMPORT)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, "import") && validateLT(2, "function") )&&(validateIdentifierKey(DroolsSoftKeywords.IMPORT)))||(validateIdentifierKey(DroolsSoftKeywords.IMPORT))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||(validateIdentifierKey(DroolsSoftKeywords.FUNCTION))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, "import") && validateLT(2, "function") )&&(validateIdentifierKey(DroolsSoftKeywords.IMPORT)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||(validateIdentifierKey(DroolsSoftKeywords.GLOBAL))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))||((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))))) {
                    int LA5_3 = input.LA(3);

                    if ( (((validateLT(1, "import") && validateLT(2, "function") )&&(validateIdentifierKey(DroolsSoftKeywords.IMPORT)))) ) {
                        alt5=2;
                    }
                    else if ( ((validateIdentifierKey(DroolsSoftKeywords.IMPORT))) ) {
                        alt5=3;
                    }
                    else if ( ((validateIdentifierKey(DroolsSoftKeywords.GLOBAL))) ) {
                        alt5=4;
                    }
                    else if ( ((validateIdentifierKey(DroolsSoftKeywords.FUNCTION))) ) {
                        alt5=5;
                    }
                    else if ( (((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))) ) {
                        alt5=6;
                    }
                    else if ( (((validateLT(1, DroolsSoftKeywords.DECLARE))&&(validateIdentifierKey(DroolsSoftKeywords.DECLARE)))) ) {
                        alt5=7;
                    }
                    else if ( ((validateIdentifierKey(DroolsSoftKeywords.RULE))) ) {
                        alt5=8;
                    }
                    else if ( ((validateIdentifierKey(DroolsSoftKeywords.QUERY))) ) {
                        alt5=9;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("454:1: statement options {k=2; } : ( rule_attribute | {...}? => function_import_statement | import_statement | global | function | {...}? => template | {...}? => type_declaration | rule | query );", 5, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA5_1==STRING) && ((((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||(validateIdentifierKey(DroolsSoftKeywords.RULE))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||(validateIdentifierKey(DroolsSoftKeywords.DIALECT))||(validateIdentifierKey(DroolsSoftKeywords.QUERY))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))||((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))))) {
                    int LA5_4 = input.LA(3);

                    if ( ((validateIdentifierKey(DroolsSoftKeywords.DIALECT))) ) {
                        alt5=1;
                    }
                    else if ( (((validateLT(1, DroolsSoftKeywords.TEMPLATE))&&(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE)))) ) {
                        alt5=6;
                    }
                    else if ( ((validateIdentifierKey(DroolsSoftKeywords.RULE))) ) {
                        alt5=8;
                    }
                    else if ( ((validateIdentifierKey(DroolsSoftKeywords.QUERY))) ) {
                        alt5=9;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("454:1: statement options {k=2; } : ( rule_attribute | {...}? => function_import_statement | import_statement | global | function | {...}? => template | {...}? => type_declaration | rule | query );", 5, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA5_1==INT) && (((validateIdentifierKey(DroolsSoftKeywords.SALIENCE))||(validateIdentifierKey(DroolsSoftKeywords.DURATION))))) {
                    alt5=1;
                }
                else if ( (LA5_1==LEFT_PAREN) && ((validateIdentifierKey(DroolsSoftKeywords.SALIENCE)))) {
                    alt5=1;
                }
                else if ( (LA5_1==BOOL) && ((validateIdentifierKey(DroolsSoftKeywords.ENABLED)))) {
                    alt5=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("454:1: statement options {k=2; } : ( rule_attribute | {...}? => function_import_statement | import_statement | global | function | {...}? => template | {...}? => type_declaration | rule | query );", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("454:1: statement options {k=2; } : ( rule_attribute | {...}? => function_import_statement | import_statement | global | function | {...}? => template | {...}? => type_declaration | rule | query );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:458:2: rule_attribute
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( backtracking==0 ) {
                      	beginSentence(DroolsSentenceType.RULE_ATTRIBUTE);	
                    }
                    pushFollow(FOLLOW_rule_attribute_in_statement545);
                    rule_attribute7=rule_attribute();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, rule_attribute7.getTree());

                    }
                    break;
                case 2 :
                    // src/main/resources/org/drools/lang/DRL.g:460:3: {...}? => function_import_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !((validateLT(1, "import") && validateLT(2, "function") )) ) {
                        if (backtracking>0) {failed=true; return retval;}
                        throw new FailedPredicateException(input, "statement", "(validateLT(1, \"import\") && validateLT(2, \"function\") )");
                    }
                    pushFollow(FOLLOW_function_import_statement_in_statement552);
                    function_import_statement8=function_import_statement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, function_import_statement8.getTree());

                    }
                    break;
                case 3 :
                    // src/main/resources/org/drools/lang/DRL.g:461:4: import_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_import_statement_in_statement558);
                    import_statement9=import_statement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, import_statement9.getTree());

                    }
                    break;
                case 4 :
                    // src/main/resources/org/drools/lang/DRL.g:462:4: global
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_global_in_statement564);
                    global10=global();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, global10.getTree());

                    }
                    break;
                case 5 :
                    // src/main/resources/org/drools/lang/DRL.g:463:4: function
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_function_in_statement570);
                    function11=function();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, function11.getTree());

                    }
                    break;
                case 6 :
                    // src/main/resources/org/drools/lang/DRL.g:464:4: {...}? => template
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !((validateLT(1, DroolsSoftKeywords.TEMPLATE))) ) {
                        if (backtracking>0) {failed=true; return retval;}
                        throw new FailedPredicateException(input, "statement", "(validateLT(1, DroolsSoftKeywords.TEMPLATE))");
                    }
                    pushFollow(FOLLOW_template_in_statement578);
                    template12=template();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, template12.getTree());

                    }
                    break;
                case 7 :
                    // src/main/resources/org/drools/lang/DRL.g:465:4: {...}? => type_declaration
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !((validateLT(1, DroolsSoftKeywords.DECLARE))) ) {
                        if (backtracking>0) {failed=true; return retval;}
                        throw new FailedPredicateException(input, "statement", "(validateLT(1, DroolsSoftKeywords.DECLARE))");
                    }
                    pushFollow(FOLLOW_type_declaration_in_statement586);
                    type_declaration13=type_declaration();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, type_declaration13.getTree());

                    }
                    break;
                case 8 :
                    // src/main/resources/org/drools/lang/DRL.g:466:4: rule
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_rule_in_statement591);
                    rule14=rule();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, rule14.getTree());

                    }
                    break;
                case 9 :
                    // src/main/resources/org/drools/lang/DRL.g:467:4: query
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_query_in_statement596);
                    query15=query();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, query15.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end statement

    public static class import_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start import_statement
    // src/main/resources/org/drools/lang/DRL.g:470:1: import_statement : import_key import_name[DroolsParaphraseTypes.IMPORT] ( SEMICOLON )? -> ^( import_key import_name ) ;
    public final import_statement_return import_statement() throws RecognitionException {
        import_statement_return retval = new import_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON18=null;
        import_key_return import_key16 = null;

        import_name_return import_name17 = null;


        Object SEMICOLON18_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_import_key=new RewriteRuleSubtreeStream(adaptor,"rule import_key");
        RewriteRuleSubtreeStream stream_import_name=new RewriteRuleSubtreeStream(adaptor,"rule import_name");
         pushParaphrases(DroolsParaphraseTypes.IMPORT); 
        try {
            // src/main/resources/org/drools/lang/DRL.g:473:2: ( import_key import_name[DroolsParaphraseTypes.IMPORT] ( SEMICOLON )? -> ^( import_key import_name ) )
            // src/main/resources/org/drools/lang/DRL.g:474:2: import_key import_name[DroolsParaphraseTypes.IMPORT] ( SEMICOLON )?
            {
            if ( backtracking==0 ) {
              	beginSentence(DroolsSentenceType.IMPORT_STATEMENT);	
            }
            pushFollow(FOLLOW_import_key_in_import_statement623);
            import_key16=import_key();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_import_key.add(import_key16.getTree());
            pushFollow(FOLLOW_import_name_in_import_statement625);
            import_name17=import_name(DroolsParaphraseTypes.IMPORT);
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_import_name.add(import_name17.getTree());
            // src/main/resources/org/drools/lang/DRL.g:475:56: ( SEMICOLON )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==SEMICOLON) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:475:56: SEMICOLON
                    {
                    SEMICOLON18=(Token)input.LT(1);
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_import_statement628); if (failed) return retval;
                    if ( backtracking==0 ) stream_SEMICOLON.add(SEMICOLON18);


                    }
                    break;

            }

            if ( backtracking==0 ) {
              	emit(SEMICOLON18, DroolsEditorType.SYMBOL);	
            }

            // AST REWRITE
            // elements: import_key, import_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 477:3: -> ^( import_key import_name )
            {
                // src/main/resources/org/drools/lang/DRL.g:477:6: ^( import_key import_name )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_import_key.nextNode(), root_1);

                adaptor.addChild(root_1, stream_import_name.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( backtracking==0 ) {
               paraphrases.pop(); 
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end import_statement

    public static class function_import_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start function_import_statement
    // src/main/resources/org/drools/lang/DRL.g:480:1: function_import_statement : imp= import_key function_key import_name[DroolsParaphraseTypes.FUNCTION_IMPORT] ( SEMICOLON )? -> ^( VT_FUNCTION_IMPORT[$imp.start] function_key import_name ) ;
    public final function_import_statement_return function_import_statement() throws RecognitionException {
        function_import_statement_return retval = new function_import_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON21=null;
        import_key_return imp = null;

        function_key_return function_key19 = null;

        import_name_return import_name20 = null;


        Object SEMICOLON21_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_function_key=new RewriteRuleSubtreeStream(adaptor,"rule function_key");
        RewriteRuleSubtreeStream stream_import_key=new RewriteRuleSubtreeStream(adaptor,"rule import_key");
        RewriteRuleSubtreeStream stream_import_name=new RewriteRuleSubtreeStream(adaptor,"rule import_name");
         pushParaphrases(DroolsParaphraseTypes.FUNCTION_IMPORT); 
        try {
            // src/main/resources/org/drools/lang/DRL.g:483:2: (imp= import_key function_key import_name[DroolsParaphraseTypes.FUNCTION_IMPORT] ( SEMICOLON )? -> ^( VT_FUNCTION_IMPORT[$imp.start] function_key import_name ) )
            // src/main/resources/org/drools/lang/DRL.g:484:2: imp= import_key function_key import_name[DroolsParaphraseTypes.FUNCTION_IMPORT] ( SEMICOLON )?
            {
            if ( backtracking==0 ) {
              	beginSentence(DroolsSentenceType.FUNCTION_IMPORT_STATEMENT);	
            }
            pushFollow(FOLLOW_import_key_in_function_import_statement671);
            imp=import_key();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_import_key.add(imp.getTree());
            pushFollow(FOLLOW_function_key_in_function_import_statement673);
            function_key19=function_key();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_function_key.add(function_key19.getTree());
            pushFollow(FOLLOW_import_name_in_function_import_statement675);
            import_name20=import_name(DroolsParaphraseTypes.FUNCTION_IMPORT);
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_import_name.add(import_name20.getTree());
            // src/main/resources/org/drools/lang/DRL.g:485:82: ( SEMICOLON )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==SEMICOLON) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:485:82: SEMICOLON
                    {
                    SEMICOLON21=(Token)input.LT(1);
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_function_import_statement678); if (failed) return retval;
                    if ( backtracking==0 ) stream_SEMICOLON.add(SEMICOLON21);


                    }
                    break;

            }

            if ( backtracking==0 ) {
              	emit(SEMICOLON21, DroolsEditorType.SYMBOL);	
            }

            // AST REWRITE
            // elements: function_key, import_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 487:3: -> ^( VT_FUNCTION_IMPORT[$imp.start] function_key import_name )
            {
                // src/main/resources/org/drools/lang/DRL.g:487:6: ^( VT_FUNCTION_IMPORT[$imp.start] function_key import_name )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(VT_FUNCTION_IMPORT, ((Token)imp.start)), root_1);

                adaptor.addChild(root_1, stream_function_key.next());
                adaptor.addChild(root_1, stream_import_name.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( backtracking==0 ) {
               paraphrases.pop(); 
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end function_import_statement

    public static class import_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start import_name
    // src/main/resources/org/drools/lang/DRL.g:490:1: import_name[DroolsParaphraseTypes importType] : id+= ID (id+= DOT id+= ID )* (id+= DOT_STAR )? -> ^( VT_IMPORT_ID ( ID )+ ( DOT_STAR )? ) ;
    public final import_name_return import_name(DroolsParaphraseTypes importType) throws RecognitionException {
        import_name_return retval = new import_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;
        List list_id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_DOT_STAR=new RewriteRuleTokenStream(adaptor,"token DOT_STAR");

        try {
            // src/main/resources/org/drools/lang/DRL.g:491:2: (id+= ID (id+= DOT id+= ID )* (id+= DOT_STAR )? -> ^( VT_IMPORT_ID ( ID )+ ( DOT_STAR )? ) )
            // src/main/resources/org/drools/lang/DRL.g:491:4: id+= ID (id+= DOT id+= ID )* (id+= DOT_STAR )?
            {
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_import_name712); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if (list_id==null) list_id=new ArrayList();
            list_id.add(id);

            // src/main/resources/org/drools/lang/DRL.g:491:11: (id+= DOT id+= ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==DOT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:491:13: id+= DOT id+= ID
            	    {
            	    id=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_import_name718); if (failed) return retval;
            	    if ( backtracking==0 ) stream_DOT.add(id);

            	    if (list_id==null) list_id=new ArrayList();
            	    list_id.add(id);

            	    id=(Token)input.LT(1);
            	    match(input,ID,FOLLOW_ID_in_import_name722); if (failed) return retval;
            	    if ( backtracking==0 ) stream_ID.add(id);

            	    if (list_id==null) list_id=new ArrayList();
            	    list_id.add(id);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // src/main/resources/org/drools/lang/DRL.g:491:33: (id+= DOT_STAR )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==DOT_STAR) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:491:33: id+= DOT_STAR
                    {
                    id=(Token)input.LT(1);
                    match(input,DOT_STAR,FOLLOW_DOT_STAR_in_import_name729); if (failed) return retval;
                    if ( backtracking==0 ) stream_DOT_STAR.add(id);

                    if (list_id==null) list_id=new ArrayList();
                    list_id.add(id);


                    }
                    break;

            }

            if ( backtracking==0 ) {
              	emit(list_id, DroolsEditorType.IDENTIFIER);
              		setParaphrasesValue(importType, buildStringFromTokens(list_id));	
            }

            // AST REWRITE
            // elements: ID, DOT_STAR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 494:3: -> ^( VT_IMPORT_ID ( ID )+ ( DOT_STAR )? )
            {
                // src/main/resources/org/drools/lang/DRL.g:494:6: ^( VT_IMPORT_ID ( ID )+ ( DOT_STAR )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(VT_IMPORT_ID, "VT_IMPORT_ID"), root_1);

                if ( !(stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.next());

                }
                stream_ID.reset();
                // src/main/resources/org/drools/lang/DRL.g:494:25: ( DOT_STAR )?
                if ( stream_DOT_STAR.hasNext() ) {
                    adaptor.addChild(root_1, stream_DOT_STAR.next());

                }
                stream_DOT_STAR.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end import_name

    public static class global_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start global
    // src/main/resources/org/drools/lang/DRL.g:497:1: global : global_key data_type global_id ( SEMICOLON )? -> ^( global_key data_type global_id ) ;
    public final global_return global() throws RecognitionException {
        global_return retval = new global_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON25=null;
        global_key_return global_key22 = null;

        data_type_return data_type23 = null;

        global_id_return global_id24 = null;


        Object SEMICOLON25_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_global_key=new RewriteRuleSubtreeStream(adaptor,"rule global_key");
        RewriteRuleSubtreeStream stream_data_type=new RewriteRuleSubtreeStream(adaptor,"rule data_type");
        RewriteRuleSubtreeStream stream_global_id=new RewriteRuleSubtreeStream(adaptor,"rule global_id");
         pushParaphrases(DroolsParaphraseTypes.GLOBAL); 
        try {
            // src/main/resources/org/drools/lang/DRL.g:500:2: ( global_key data_type global_id ( SEMICOLON )? -> ^( global_key data_type global_id ) )
            // src/main/resources/org/drools/lang/DRL.g:501:2: global_key data_type global_id ( SEMICOLON )?
            {
            if ( backtracking==0 ) {
              	beginSentence(DroolsSentenceType.GLOBAL);	
            }
            pushFollow(FOLLOW_global_key_in_global774);
            global_key22=global_key();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_global_key.add(global_key22.getTree());
            pushFollow(FOLLOW_data_type_in_global776);
            data_type23=data_type();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_data_type.add(data_type23.getTree());
            pushFollow(FOLLOW_global_id_in_global778);
            global_id24=global_id();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_global_id.add(global_id24.getTree());
            // src/main/resources/org/drools/lang/DRL.g:502:34: ( SEMICOLON )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==SEMICOLON) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:502:34: SEMICOLON
                    {
                    SEMICOLON25=(Token)input.LT(1);
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_global780); if (failed) return retval;
                    if ( backtracking==0 ) stream_SEMICOLON.add(SEMICOLON25);


                    }
                    break;

            }

            if ( backtracking==0 ) {
              	emit(SEMICOLON25, DroolsEditorType.SYMBOL);	
            }

            // AST REWRITE
            // elements: global_key, global_id, data_type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 504:3: -> ^( global_key data_type global_id )
            {
                // src/main/resources/org/drools/lang/DRL.g:504:6: ^( global_key data_type global_id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_global_key.nextNode(), root_1);

                adaptor.addChild(root_1, stream_data_type.next());
                adaptor.addChild(root_1, stream_global_id.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( backtracking==0 ) {
               paraphrases.pop(); 
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end global

    public static class global_id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start global_id
    // src/main/resources/org/drools/lang/DRL.g:507:1: global_id : id= ID -> VT_GLOBAL_ID[$id] ;
    public final global_id_return global_id() throws RecognitionException {
        global_id_return retval = new global_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:508:2: (id= ID -> VT_GLOBAL_ID[$id] )
            // src/main/resources/org/drools/lang/DRL.g:508:4: id= ID
            {
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_global_id809); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.IDENTIFIER);
              		setParaphrasesValue(DroolsParaphraseTypes.GLOBAL, id.getText());	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 511:3: -> VT_GLOBAL_ID[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VT_GLOBAL_ID, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end global_id

    public static class function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start function
    // src/main/resources/org/drools/lang/DRL.g:514:1: function : function_key ( data_type )? function_id parameters curly_chunk -> ^( function_key ( data_type )? function_id parameters curly_chunk ) ;
    public final function_return function() throws RecognitionException {
        function_return retval = new function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        function_key_return function_key26 = null;

        data_type_return data_type27 = null;

        function_id_return function_id28 = null;

        parameters_return parameters29 = null;

        curly_chunk_return curly_chunk30 = null;


        RewriteRuleSubtreeStream stream_function_key=new RewriteRuleSubtreeStream(adaptor,"rule function_key");
        RewriteRuleSubtreeStream stream_function_id=new RewriteRuleSubtreeStream(adaptor,"rule function_id");
        RewriteRuleSubtreeStream stream_data_type=new RewriteRuleSubtreeStream(adaptor,"rule data_type");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        RewriteRuleSubtreeStream stream_curly_chunk=new RewriteRuleSubtreeStream(adaptor,"rule curly_chunk");
         pushParaphrases(DroolsParaphraseTypes.FUNCTION); 
        try {
            // src/main/resources/org/drools/lang/DRL.g:517:2: ( function_key ( data_type )? function_id parameters curly_chunk -> ^( function_key ( data_type )? function_id parameters curly_chunk ) )
            // src/main/resources/org/drools/lang/DRL.g:518:2: function_key ( data_type )? function_id parameters curly_chunk
            {
            if ( backtracking==0 ) {
              	beginSentence(DroolsSentenceType.FUNCTION);	
            }
            pushFollow(FOLLOW_function_key_in_function846);
            function_key26=function_key();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_function_key.add(function_key26.getTree());
            // src/main/resources/org/drools/lang/DRL.g:519:16: ( data_type )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID) ) {
                int LA11_1 = input.LA(2);

                if ( ((LA11_1>=ID && LA11_1<=DOT)||LA11_1==LEFT_SQUARE) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:519:16: data_type
                    {
                    pushFollow(FOLLOW_data_type_in_function848);
                    data_type27=data_type();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_data_type.add(data_type27.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_function_id_in_function851);
            function_id28=function_id();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_function_id.add(function_id28.getTree());
            pushFollow(FOLLOW_parameters_in_function853);
            parameters29=parameters();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_parameters.add(parameters29.getTree());
            pushFollow(FOLLOW_curly_chunk_in_function855);
            curly_chunk30=curly_chunk();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_curly_chunk.add(curly_chunk30.getTree());

            // AST REWRITE
            // elements: data_type, function_key, parameters, function_id, curly_chunk
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 520:3: -> ^( function_key ( data_type )? function_id parameters curly_chunk )
            {
                // src/main/resources/org/drools/lang/DRL.g:520:6: ^( function_key ( data_type )? function_id parameters curly_chunk )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_function_key.nextNode(), root_1);

                // src/main/resources/org/drools/lang/DRL.g:520:21: ( data_type )?
                if ( stream_data_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_data_type.next());

                }
                stream_data_type.reset();
                adaptor.addChild(root_1, stream_function_id.next());
                adaptor.addChild(root_1, stream_parameters.next());
                adaptor.addChild(root_1, stream_curly_chunk.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( backtracking==0 ) {
               paraphrases.pop(); 
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end function

    public static class function_id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start function_id
    // src/main/resources/org/drools/lang/DRL.g:523:1: function_id : id= ID -> VT_FUNCTION_ID[$id] ;
    public final function_id_return function_id() throws RecognitionException {
        function_id_return retval = new function_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:524:2: (id= ID -> VT_FUNCTION_ID[$id] )
            // src/main/resources/org/drools/lang/DRL.g:524:4: id= ID
            {
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_function_id885); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.IDENTIFIER);
              		setParaphrasesValue(DroolsParaphraseTypes.FUNCTION, id.getText());	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 527:3: -> VT_FUNCTION_ID[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VT_FUNCTION_ID, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end function_id

    public static class query_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start query
    // src/main/resources/org/drools/lang/DRL.g:530:1: query : query_key query_id ( parameters )? normal_lhs_block END ( SEMICOLON )? -> ^( query_key query_id ( parameters )? normal_lhs_block END ) ;
    public final query_return query() throws RecognitionException {
        query_return retval = new query_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token END35=null;
        Token SEMICOLON36=null;
        query_key_return query_key31 = null;

        query_id_return query_id32 = null;

        parameters_return parameters33 = null;

        normal_lhs_block_return normal_lhs_block34 = null;


        Object END35_tree=null;
        Object SEMICOLON36_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_query_key=new RewriteRuleSubtreeStream(adaptor,"rule query_key");
        RewriteRuleSubtreeStream stream_normal_lhs_block=new RewriteRuleSubtreeStream(adaptor,"rule normal_lhs_block");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        RewriteRuleSubtreeStream stream_query_id=new RewriteRuleSubtreeStream(adaptor,"rule query_id");
         pushParaphrases(DroolsParaphraseTypes.QUERY); 
        try {
            // src/main/resources/org/drools/lang/DRL.g:533:2: ( query_key query_id ( parameters )? normal_lhs_block END ( SEMICOLON )? -> ^( query_key query_id ( parameters )? normal_lhs_block END ) )
            // src/main/resources/org/drools/lang/DRL.g:534:2: query_key query_id ( parameters )? normal_lhs_block END ( SEMICOLON )?
            {
            if ( backtracking==0 ) {
              	beginSentence(DroolsSentenceType.QUERY);	
            }
            pushFollow(FOLLOW_query_key_in_query922);
            query_key31=query_key();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_query_key.add(query_key31.getTree());
            pushFollow(FOLLOW_query_id_in_query924);
            query_id32=query_id();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_query_id.add(query_id32.getTree());
            if ( backtracking==0 ) {
              	emit(Location.LOCATION_RULE_HEADER);	
            }
            // src/main/resources/org/drools/lang/DRL.g:537:3: ( parameters )?
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:537:3: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_query932);
                    parameters33=parameters();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_parameters.add(parameters33.getTree());

                    }
                    break;

            }

            if ( backtracking==0 ) {
              	emit(Location.LOCATION_LHS_BEGIN_OF_CONDITION);	
            }
            pushFollow(FOLLOW_normal_lhs_block_in_query941);
            normal_lhs_block34=normal_lhs_block();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_normal_lhs_block.add(normal_lhs_block34.getTree());
            END35=(Token)input.LT(1);
            match(input,END,FOLLOW_END_in_query946); if (failed) return retval;
            if ( backtracking==0 ) stream_END.add(END35);

            // src/main/resources/org/drools/lang/DRL.g:540:7: ( SEMICOLON )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==SEMICOLON) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:540:7: SEMICOLON
                    {
                    SEMICOLON36=(Token)input.LT(1);
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_query948); if (failed) return retval;
                    if ( backtracking==0 ) stream_SEMICOLON.add(SEMICOLON36);


                    }
                    break;

            }

            if ( backtracking==0 ) {
              	emit(END35, DroolsEditorType.KEYWORD);
              		emit(SEMICOLON36, DroolsEditorType.SYMBOL);	
            }

            // AST REWRITE
            // elements: query_id, END, normal_lhs_block, parameters, query_key
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 543:3: -> ^( query_key query_id ( parameters )? normal_lhs_block END )
            {
                // src/main/resources/org/drools/lang/DRL.g:543:6: ^( query_key query_id ( parameters )? normal_lhs_block END )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_query_key.nextNode(), root_1);

                adaptor.addChild(root_1, stream_query_id.next());
                // src/main/resources/org/drools/lang/DRL.g:543:27: ( parameters )?
                if ( stream_parameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameters.next());

                }
                stream_parameters.reset();
                adaptor.addChild(root_1, stream_normal_lhs_block.next());
                adaptor.addChild(root_1, stream_END.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( backtracking==0 ) {
               paraphrases.pop(); 
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end query

    public static class query_id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start query_id
    // src/main/resources/org/drools/lang/DRL.g:546:1: query_id : (id= ID -> VT_QUERY_ID[$id] | id= STRING -> VT_QUERY_ID[$id] );
    public final query_id_return query_id() throws RecognitionException {
        query_id_return retval = new query_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // src/main/resources/org/drools/lang/DRL.g:547:2: (id= ID -> VT_QUERY_ID[$id] | id= STRING -> VT_QUERY_ID[$id] )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==STRING) ) {
                alt14=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("546:1: query_id : (id= ID -> VT_QUERY_ID[$id] | id= STRING -> VT_QUERY_ID[$id] );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:547:5: id= ID
                    {
                    id=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_query_id983); if (failed) return retval;
                    if ( backtracking==0 ) stream_ID.add(id);

                    if ( backtracking==0 ) {
                      	emit(id, DroolsEditorType.IDENTIFIER);
                      		setParaphrasesValue(DroolsParaphraseTypes.QUERY, id.getText());	
                    }

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 549:65: -> VT_QUERY_ID[$id]
                    {
                        adaptor.addChild(root_0, adaptor.create(VT_QUERY_ID, id));

                    }

                    }

                    }
                    break;
                case 2 :
                    // src/main/resources/org/drools/lang/DRL.g:550:5: id= STRING
                    {
                    id=(Token)input.LT(1);
                    match(input,STRING,FOLLOW_STRING_in_query_id999); if (failed) return retval;
                    if ( backtracking==0 ) stream_STRING.add(id);

                    if ( backtracking==0 ) {
                      	emit(id, DroolsEditorType.IDENTIFIER);
                      		setParaphrasesValue(DroolsParaphraseTypes.QUERY, id.getText());	
                    }

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 552:65: -> VT_QUERY_ID[$id]
                    {
                        adaptor.addChild(root_0, adaptor.create(VT_QUERY_ID, id));

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end query_id

    public static class parameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start parameters
    // src/main/resources/org/drools/lang/DRL.g:555:1: parameters : LEFT_PAREN ( param_definition ( COMMA param_definition )* )? RIGHT_PAREN -> ^( VT_PARAM_LIST ( param_definition )* RIGHT_PAREN ) ;
    public final parameters_return parameters() throws RecognitionException {
        parameters_return retval = new parameters_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_PAREN37=null;
        Token COMMA39=null;
        Token RIGHT_PAREN41=null;
        param_definition_return param_definition38 = null;

        param_definition_return param_definition40 = null;


        Object LEFT_PAREN37_tree=null;
        Object COMMA39_tree=null;
        Object RIGHT_PAREN41_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_param_definition=new RewriteRuleSubtreeStream(adaptor,"rule param_definition");
        try {
            // src/main/resources/org/drools/lang/DRL.g:556:2: ( LEFT_PAREN ( param_definition ( COMMA param_definition )* )? RIGHT_PAREN -> ^( VT_PARAM_LIST ( param_definition )* RIGHT_PAREN ) )
            // src/main/resources/org/drools/lang/DRL.g:556:4: LEFT_PAREN ( param_definition ( COMMA param_definition )* )? RIGHT_PAREN
            {
            LEFT_PAREN37=(Token)input.LT(1);
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_parameters1018); if (failed) return retval;
            if ( backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN37);

            if ( backtracking==0 ) {
              	emit(LEFT_PAREN37, DroolsEditorType.SYMBOL);	
            }
            // src/main/resources/org/drools/lang/DRL.g:557:4: ( param_definition ( COMMA param_definition )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:557:6: param_definition ( COMMA param_definition )*
                    {
                    pushFollow(FOLLOW_param_definition_in_parameters1027);
                    param_definition38=param_definition();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_param_definition.add(param_definition38.getTree());
                    // src/main/resources/org/drools/lang/DRL.g:557:23: ( COMMA param_definition )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==COMMA) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // src/main/resources/org/drools/lang/DRL.g:557:24: COMMA param_definition
                    	    {
                    	    COMMA39=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_parameters1030); if (failed) return retval;
                    	    if ( backtracking==0 ) stream_COMMA.add(COMMA39);

                    	    if ( backtracking==0 ) {
                    	      	emit(COMMA39, DroolsEditorType.SYMBOL);	
                    	    }
                    	    pushFollow(FOLLOW_param_definition_in_parameters1034);
                    	    param_definition40=param_definition();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) stream_param_definition.add(param_definition40.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            RIGHT_PAREN41=(Token)input.LT(1);
            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_parameters1043); if (failed) return retval;
            if ( backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN41);

            if ( backtracking==0 ) {
              	emit(RIGHT_PAREN41, DroolsEditorType.SYMBOL);	
            }

            // AST REWRITE
            // elements: RIGHT_PAREN, param_definition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 559:3: -> ^( VT_PARAM_LIST ( param_definition )* RIGHT_PAREN )
            {
                // src/main/resources/org/drools/lang/DRL.g:559:6: ^( VT_PARAM_LIST ( param_definition )* RIGHT_PAREN )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(VT_PARAM_LIST, "VT_PARAM_LIST"), root_1);

                // src/main/resources/org/drools/lang/DRL.g:559:22: ( param_definition )*
                while ( stream_param_definition.hasNext() ) {
                    adaptor.addChild(root_1, stream_param_definition.next());

                }
                stream_param_definition.reset();
                adaptor.addChild(root_1, stream_RIGHT_PAREN.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end parameters

    public static class param_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start param_definition
    // src/main/resources/org/drools/lang/DRL.g:562:1: param_definition : ( data_type )? argument ;
    public final param_definition_return param_definition() throws RecognitionException {
        param_definition_return retval = new param_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        data_type_return data_type42 = null;

        argument_return argument43 = null;



        try {
            // src/main/resources/org/drools/lang/DRL.g:563:2: ( ( data_type )? argument )
            // src/main/resources/org/drools/lang/DRL.g:563:4: ( data_type )? argument
            {
            root_0 = (Object)adaptor.nil();

            // src/main/resources/org/drools/lang/DRL.g:563:4: ( data_type )?
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:563:4: data_type
                    {
                    pushFollow(FOLLOW_data_type_in_param_definition1069);
                    data_type42=data_type();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, data_type42.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_argument_in_param_definition1072);
            argument43=argument();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, argument43.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end param_definition

    public static class argument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start argument
    // src/main/resources/org/drools/lang/DRL.g:566:1: argument : ID ( dimension_definition )* ;
    public final argument_return argument() throws RecognitionException {
        argument_return retval = new argument_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID44=null;
        dimension_definition_return dimension_definition45 = null;


        Object ID44_tree=null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:567:2: ( ID ( dimension_definition )* )
            // src/main/resources/org/drools/lang/DRL.g:567:4: ID ( dimension_definition )*
            {
            root_0 = (Object)adaptor.nil();

            ID44=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_argument1083); if (failed) return retval;
            if ( backtracking==0 ) {
            ID44_tree = (Object)adaptor.create(ID44);
            adaptor.addChild(root_0, ID44_tree);
            }
            if ( backtracking==0 ) {
              	emit(ID44, DroolsEditorType.IDENTIFIER);	
            }
            // src/main/resources/org/drools/lang/DRL.g:568:3: ( dimension_definition )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==LEFT_SQUARE) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:568:3: dimension_definition
            	    {
            	    pushFollow(FOLLOW_dimension_definition_in_argument1089);
            	    dimension_definition45=dimension_definition();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, dimension_definition45.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end argument

    public static class type_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start type_declaration
    // src/main/resources/org/drools/lang/DRL.g:571:1: type_declaration : declare_key type_declare_id ( decl_metadata )* ( decl_field )* END -> ^( declare_key type_declare_id ( decl_metadata )* ( decl_field )* END ) ;
    public final type_declaration_return type_declaration() throws RecognitionException {
        type_declaration_return retval = new type_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token END50=null;
        declare_key_return declare_key46 = null;

        type_declare_id_return type_declare_id47 = null;

        decl_metadata_return decl_metadata48 = null;

        decl_field_return decl_field49 = null;


        Object END50_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_decl_field=new RewriteRuleSubtreeStream(adaptor,"rule decl_field");
        RewriteRuleSubtreeStream stream_type_declare_id=new RewriteRuleSubtreeStream(adaptor,"rule type_declare_id");
        RewriteRuleSubtreeStream stream_decl_metadata=new RewriteRuleSubtreeStream(adaptor,"rule decl_metadata");
        RewriteRuleSubtreeStream stream_declare_key=new RewriteRuleSubtreeStream(adaptor,"rule declare_key");
         pushParaphrases(DroolsParaphraseTypes.TYPE_DECLARE); 
        try {
            // src/main/resources/org/drools/lang/DRL.g:574:2: ( declare_key type_declare_id ( decl_metadata )* ( decl_field )* END -> ^( declare_key type_declare_id ( decl_metadata )* ( decl_field )* END ) )
            // src/main/resources/org/drools/lang/DRL.g:575:2: declare_key type_declare_id ( decl_metadata )* ( decl_field )* END
            {
            if ( backtracking==0 ) {
              	beginSentence(DroolsSentenceType.TYPE_DECLARATION);	
            }
            pushFollow(FOLLOW_declare_key_in_type_declaration1117);
            declare_key46=declare_key();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_declare_key.add(declare_key46.getTree());
            pushFollow(FOLLOW_type_declare_id_in_type_declaration1120);
            type_declare_id47=type_declare_id();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_type_declare_id.add(type_declare_id47.getTree());
            // src/main/resources/org/drools/lang/DRL.g:577:3: ( decl_metadata )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==AT) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:577:3: decl_metadata
            	    {
            	    pushFollow(FOLLOW_decl_metadata_in_type_declaration1124);
            	    decl_metadata48=decl_metadata();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_decl_metadata.add(decl_metadata48.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // src/main/resources/org/drools/lang/DRL.g:578:3: ( decl_field )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:578:3: decl_field
            	    {
            	    pushFollow(FOLLOW_decl_field_in_type_declaration1129);
            	    decl_field49=decl_field();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_decl_field.add(decl_field49.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            END50=(Token)input.LT(1);
            match(input,END,FOLLOW_END_in_type_declaration1134); if (failed) return retval;
            if ( backtracking==0 ) stream_END.add(END50);

            if ( backtracking==0 ) {
              	emit(END50, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: decl_metadata, type_declare_id, decl_field, END, declare_key
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 581:3: -> ^( declare_key type_declare_id ( decl_metadata )* ( decl_field )* END )
            {
                // src/main/resources/org/drools/lang/DRL.g:581:6: ^( declare_key type_declare_id ( decl_metadata )* ( decl_field )* END )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_declare_key.nextNode(), root_1);

                adaptor.addChild(root_1, stream_type_declare_id.next());
                // src/main/resources/org/drools/lang/DRL.g:581:36: ( decl_metadata )*
                while ( stream_decl_metadata.hasNext() ) {
                    adaptor.addChild(root_1, stream_decl_metadata.next());

                }
                stream_decl_metadata.reset();
                // src/main/resources/org/drools/lang/DRL.g:581:51: ( decl_field )*
                while ( stream_decl_field.hasNext() ) {
                    adaptor.addChild(root_1, stream_decl_field.next());

                }
                stream_decl_field.reset();
                adaptor.addChild(root_1, stream_END.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( backtracking==0 ) {
               paraphrases.pop(); 
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end type_declaration

    public static class type_declare_id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start type_declare_id
    // src/main/resources/org/drools/lang/DRL.g:584:1: type_declare_id : id= ID -> VT_TYPE_DECLARE_ID[$id] ;
    public final type_declare_id_return type_declare_id() throws RecognitionException {
        type_declare_id_return retval = new type_declare_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:585:2: (id= ID -> VT_TYPE_DECLARE_ID[$id] )
            // src/main/resources/org/drools/lang/DRL.g:585:5: id= ID
            {
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_type_declare_id1169); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.IDENTIFIER);
              		setParaphrasesValue(DroolsParaphraseTypes.TYPE_DECLARE, id.getText());	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 587:72: -> VT_TYPE_DECLARE_ID[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VT_TYPE_DECLARE_ID, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end type_declare_id

    public static class decl_metadata_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start decl_metadata
    // src/main/resources/org/drools/lang/DRL.g:590:1: decl_metadata : AT ID paren_chunk -> ^( AT ID paren_chunk ) ;
    public final decl_metadata_return decl_metadata() throws RecognitionException {
        decl_metadata_return retval = new decl_metadata_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AT51=null;
        Token ID52=null;
        paren_chunk_return paren_chunk53 = null;


        Object AT51_tree=null;
        Object ID52_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_paren_chunk=new RewriteRuleSubtreeStream(adaptor,"rule paren_chunk");
        try {
            // src/main/resources/org/drools/lang/DRL.g:591:2: ( AT ID paren_chunk -> ^( AT ID paren_chunk ) )
            // src/main/resources/org/drools/lang/DRL.g:591:4: AT ID paren_chunk
            {
            AT51=(Token)input.LT(1);
            match(input,AT,FOLLOW_AT_in_decl_metadata1188); if (failed) return retval;
            if ( backtracking==0 ) stream_AT.add(AT51);

            if ( backtracking==0 ) {
              	emit(AT51, DroolsEditorType.SYMBOL);	
            }
            ID52=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_decl_metadata1196); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(ID52);

            if ( backtracking==0 ) {
              	emit(ID52, DroolsEditorType.IDENTIFIER);	
            }
            pushFollow(FOLLOW_paren_chunk_in_decl_metadata1203);
            paren_chunk53=paren_chunk();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_paren_chunk.add(paren_chunk53.getTree());

            // AST REWRITE
            // elements: AT, ID, paren_chunk
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 596:3: -> ^( AT ID paren_chunk )
            {
                // src/main/resources/org/drools/lang/DRL.g:596:6: ^( AT ID paren_chunk )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_AT.next(), root_1);

                adaptor.addChild(root_1, stream_ID.next());
                adaptor.addChild(root_1, stream_paren_chunk.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end decl_metadata

    public static class decl_field_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start decl_field
    // src/main/resources/org/drools/lang/DRL.g:599:1: decl_field : ID ( decl_field_initialization )? COLON data_type ( decl_metadata )* -> ^( ID ( decl_field_initialization )? data_type ( decl_metadata )* ) ;
    public final decl_field_return decl_field() throws RecognitionException {
        decl_field_return retval = new decl_field_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID54=null;
        Token COLON56=null;
        decl_field_initialization_return decl_field_initialization55 = null;

        data_type_return data_type57 = null;

        decl_metadata_return decl_metadata58 = null;


        Object ID54_tree=null;
        Object COLON56_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_decl_field_initialization=new RewriteRuleSubtreeStream(adaptor,"rule decl_field_initialization");
        RewriteRuleSubtreeStream stream_data_type=new RewriteRuleSubtreeStream(adaptor,"rule data_type");
        RewriteRuleSubtreeStream stream_decl_metadata=new RewriteRuleSubtreeStream(adaptor,"rule decl_metadata");
        try {
            // src/main/resources/org/drools/lang/DRL.g:600:2: ( ID ( decl_field_initialization )? COLON data_type ( decl_metadata )* -> ^( ID ( decl_field_initialization )? data_type ( decl_metadata )* ) )
            // src/main/resources/org/drools/lang/DRL.g:600:4: ID ( decl_field_initialization )? COLON data_type ( decl_metadata )*
            {
            ID54=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_decl_field1226); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(ID54);

            if ( backtracking==0 ) {
              	emit(ID54, DroolsEditorType.IDENTIFIER);	
            }
            // src/main/resources/org/drools/lang/DRL.g:601:3: ( decl_field_initialization )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==EQUALS) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:601:3: decl_field_initialization
                    {
                    pushFollow(FOLLOW_decl_field_initialization_in_decl_field1232);
                    decl_field_initialization55=decl_field_initialization();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_decl_field_initialization.add(decl_field_initialization55.getTree());

                    }
                    break;

            }

            COLON56=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_decl_field1238); if (failed) return retval;
            if ( backtracking==0 ) stream_COLON.add(COLON56);

            if ( backtracking==0 ) {
              	emit(COLON56, DroolsEditorType.SYMBOL);	
            }
            pushFollow(FOLLOW_data_type_in_decl_field1244);
            data_type57=data_type();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_data_type.add(data_type57.getTree());
            // src/main/resources/org/drools/lang/DRL.g:604:3: ( decl_metadata )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==AT) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:604:3: decl_metadata
            	    {
            	    pushFollow(FOLLOW_decl_metadata_in_decl_field1248);
            	    decl_metadata58=decl_metadata();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_decl_metadata.add(decl_metadata58.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            // AST REWRITE
            // elements: decl_metadata, data_type, decl_field_initialization, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 605:3: -> ^( ID ( decl_field_initialization )? data_type ( decl_metadata )* )
            {
                // src/main/resources/org/drools/lang/DRL.g:605:6: ^( ID ( decl_field_initialization )? data_type ( decl_metadata )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ID.next(), root_1);

                // src/main/resources/org/drools/lang/DRL.g:605:11: ( decl_field_initialization )?
                if ( stream_decl_field_initialization.hasNext() ) {
                    adaptor.addChild(root_1, stream_decl_field_initialization.next());

                }
                stream_decl_field_initialization.reset();
                adaptor.addChild(root_1, stream_data_type.next());
                // src/main/resources/org/drools/lang/DRL.g:605:48: ( decl_metadata )*
                while ( stream_decl_metadata.hasNext() ) {
                    adaptor.addChild(root_1, stream_decl_metadata.next());

                }
                stream_decl_metadata.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end decl_field

    public static class decl_field_initialization_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start decl_field_initialization
    // src/main/resources/org/drools/lang/DRL.g:608:1: decl_field_initialization : EQUALS paren_chunk -> ^( EQUALS paren_chunk ) ;
    public final decl_field_initialization_return decl_field_initialization() throws RecognitionException {
        decl_field_initialization_return retval = new decl_field_initialization_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EQUALS59=null;
        paren_chunk_return paren_chunk60 = null;


        Object EQUALS59_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_paren_chunk=new RewriteRuleSubtreeStream(adaptor,"rule paren_chunk");
        try {
            // src/main/resources/org/drools/lang/DRL.g:609:2: ( EQUALS paren_chunk -> ^( EQUALS paren_chunk ) )
            // src/main/resources/org/drools/lang/DRL.g:609:4: EQUALS paren_chunk
            {
            EQUALS59=(Token)input.LT(1);
            match(input,EQUALS,FOLLOW_EQUALS_in_decl_field_initialization1276); if (failed) return retval;
            if ( backtracking==0 ) stream_EQUALS.add(EQUALS59);

            if ( backtracking==0 ) {
              	emit(EQUALS59, DroolsEditorType.SYMBOL);	
            }
            pushFollow(FOLLOW_paren_chunk_in_decl_field_initialization1282);
            paren_chunk60=paren_chunk();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_paren_chunk.add(paren_chunk60.getTree());

            // AST REWRITE
            // elements: paren_chunk, EQUALS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 611:2: -> ^( EQUALS paren_chunk )
            {
                // src/main/resources/org/drools/lang/DRL.g:611:5: ^( EQUALS paren_chunk )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_EQUALS.next(), root_1);

                adaptor.addChild(root_1, stream_paren_chunk.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end decl_field_initialization

    public static class template_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start template
    // src/main/resources/org/drools/lang/DRL.g:614:1: template : template_key template_id (semi1= SEMICOLON )? ( template_slot )+ END (semi2= SEMICOLON )? -> ^( template_key template_id ( template_slot )+ END ) ;
    public final template_return template() throws RecognitionException {
        template_return retval = new template_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token semi1=null;
        Token semi2=null;
        Token END64=null;
        template_key_return template_key61 = null;

        template_id_return template_id62 = null;

        template_slot_return template_slot63 = null;


        Object semi1_tree=null;
        Object semi2_tree=null;
        Object END64_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_template_slot=new RewriteRuleSubtreeStream(adaptor,"rule template_slot");
        RewriteRuleSubtreeStream stream_template_id=new RewriteRuleSubtreeStream(adaptor,"rule template_id");
        RewriteRuleSubtreeStream stream_template_key=new RewriteRuleSubtreeStream(adaptor,"rule template_key");
         pushParaphrases(DroolsParaphraseTypes.TEMPLATE); 
        try {
            // src/main/resources/org/drools/lang/DRL.g:617:2: ( template_key template_id (semi1= SEMICOLON )? ( template_slot )+ END (semi2= SEMICOLON )? -> ^( template_key template_id ( template_slot )+ END ) )
            // src/main/resources/org/drools/lang/DRL.g:618:2: template_key template_id (semi1= SEMICOLON )? ( template_slot )+ END (semi2= SEMICOLON )?
            {
            if ( backtracking==0 ) {
              	beginSentence(DroolsSentenceType.TEMPLATE);	
            }
            pushFollow(FOLLOW_template_key_in_template1319);
            template_key61=template_key();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_template_key.add(template_key61.getTree());
            pushFollow(FOLLOW_template_id_in_template1321);
            template_id62=template_id();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_template_id.add(template_id62.getTree());
            // src/main/resources/org/drools/lang/DRL.g:620:8: (semi1= SEMICOLON )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==SEMICOLON) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:620:8: semi1= SEMICOLON
                    {
                    semi1=(Token)input.LT(1);
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_template1328); if (failed) return retval;
                    if ( backtracking==0 ) stream_SEMICOLON.add(semi1);


                    }
                    break;

            }

            if ( backtracking==0 ) {
              	emit(semi1, DroolsEditorType.SYMBOL);	
            }
            // src/main/resources/org/drools/lang/DRL.g:622:3: ( template_slot )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:622:3: template_slot
            	    {
            	    pushFollow(FOLLOW_template_slot_in_template1336);
            	    template_slot63=template_slot();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_template_slot.add(template_slot63.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
            	    if (backtracking>0) {failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            END64=(Token)input.LT(1);
            match(input,END,FOLLOW_END_in_template1341); if (failed) return retval;
            if ( backtracking==0 ) stream_END.add(END64);

            // src/main/resources/org/drools/lang/DRL.g:623:12: (semi2= SEMICOLON )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==SEMICOLON) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:623:12: semi2= SEMICOLON
                    {
                    semi2=(Token)input.LT(1);
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_template1345); if (failed) return retval;
                    if ( backtracking==0 ) stream_SEMICOLON.add(semi2);


                    }
                    break;

            }

            if ( backtracking==0 ) {
              	emit(END64, DroolsEditorType.KEYWORD);
              		emit(semi2, DroolsEditorType.SYMBOL);	
            }

            // AST REWRITE
            // elements: template_slot, template_key, template_id, END
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 626:3: -> ^( template_key template_id ( template_slot )+ END )
            {
                // src/main/resources/org/drools/lang/DRL.g:626:6: ^( template_key template_id ( template_slot )+ END )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_template_key.nextNode(), root_1);

                adaptor.addChild(root_1, stream_template_id.next());
                if ( !(stream_template_slot.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_template_slot.hasNext() ) {
                    adaptor.addChild(root_1, stream_template_slot.next());

                }
                stream_template_slot.reset();
                adaptor.addChild(root_1, stream_END.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( backtracking==0 ) {
               paraphrases.pop(); 
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end template

    public static class template_id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start template_id
    // src/main/resources/org/drools/lang/DRL.g:629:1: template_id : (id= ID -> VT_TEMPLATE_ID[$id] | id= STRING -> VT_TEMPLATE_ID[$id] );
    public final template_id_return template_id() throws RecognitionException {
        template_id_return retval = new template_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // src/main/resources/org/drools/lang/DRL.g:630:2: (id= ID -> VT_TEMPLATE_ID[$id] | id= STRING -> VT_TEMPLATE_ID[$id] )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ID) ) {
                alt26=1;
            }
            else if ( (LA26_0==STRING) ) {
                alt26=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("629:1: template_id : (id= ID -> VT_TEMPLATE_ID[$id] | id= STRING -> VT_TEMPLATE_ID[$id] );", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:630:5: id= ID
                    {
                    id=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_template_id1378); if (failed) return retval;
                    if ( backtracking==0 ) stream_ID.add(id);

                    if ( backtracking==0 ) {
                      	emit(id, DroolsEditorType.IDENTIFIER);
                      		setParaphrasesValue(DroolsParaphraseTypes.TEMPLATE, id.getText());	
                    }

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 632:68: -> VT_TEMPLATE_ID[$id]
                    {
                        adaptor.addChild(root_0, adaptor.create(VT_TEMPLATE_ID, id));

                    }

                    }

                    }
                    break;
                case 2 :
                    // src/main/resources/org/drools/lang/DRL.g:633:5: id= STRING
                    {
                    id=(Token)input.LT(1);
                    match(input,STRING,FOLLOW_STRING_in_template_id1394); if (failed) return retval;
                    if ( backtracking==0 ) stream_STRING.add(id);

                    if ( backtracking==0 ) {
                      	emit(id, DroolsEditorType.IDENTIFIER);
                      		setParaphrasesValue(DroolsParaphraseTypes.TEMPLATE, id.getText());	
                    }

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 635:68: -> VT_TEMPLATE_ID[$id]
                    {
                        adaptor.addChild(root_0, adaptor.create(VT_TEMPLATE_ID, id));

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end template_id

    public static class template_slot_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start template_slot
    // src/main/resources/org/drools/lang/DRL.g:638:1: template_slot : data_type slot_id ( SEMICOLON )? -> ^( VT_SLOT data_type slot_id ) ;
    public final template_slot_return template_slot() throws RecognitionException {
        template_slot_return retval = new template_slot_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON67=null;
        data_type_return data_type65 = null;

        slot_id_return slot_id66 = null;


        Object SEMICOLON67_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_slot_id=new RewriteRuleSubtreeStream(adaptor,"rule slot_id");
        RewriteRuleSubtreeStream stream_data_type=new RewriteRuleSubtreeStream(adaptor,"rule data_type");
        try {
            // src/main/resources/org/drools/lang/DRL.g:639:2: ( data_type slot_id ( SEMICOLON )? -> ^( VT_SLOT data_type slot_id ) )
            // src/main/resources/org/drools/lang/DRL.g:639:5: data_type slot_id ( SEMICOLON )?
            {
            pushFollow(FOLLOW_data_type_in_template_slot1414);
            data_type65=data_type();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_data_type.add(data_type65.getTree());
            pushFollow(FOLLOW_slot_id_in_template_slot1416);
            slot_id66=slot_id();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_slot_id.add(slot_id66.getTree());
            // src/main/resources/org/drools/lang/DRL.g:639:23: ( SEMICOLON )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==SEMICOLON) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:639:23: SEMICOLON
                    {
                    SEMICOLON67=(Token)input.LT(1);
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_template_slot1418); if (failed) return retval;
                    if ( backtracking==0 ) stream_SEMICOLON.add(SEMICOLON67);


                    }
                    break;

            }

            if ( backtracking==0 ) {
              	emit(SEMICOLON67, DroolsEditorType.SYMBOL);	
            }

            // AST REWRITE
            // elements: slot_id, data_type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 641:3: -> ^( VT_SLOT data_type slot_id )
            {
                // src/main/resources/org/drools/lang/DRL.g:641:6: ^( VT_SLOT data_type slot_id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(VT_SLOT, "VT_SLOT"), root_1);

                adaptor.addChild(root_1, stream_data_type.next());
                adaptor.addChild(root_1, stream_slot_id.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end template_slot

    public static class slot_id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start slot_id
    // src/main/resources/org/drools/lang/DRL.g:644:1: slot_id : id= ID -> VT_SLOT_ID[$id] ;
    public final slot_id_return slot_id() throws RecognitionException {
        slot_id_return retval = new slot_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:645:2: (id= ID -> VT_SLOT_ID[$id] )
            // src/main/resources/org/drools/lang/DRL.g:645:4: id= ID
            {
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_slot_id1447); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.IDENTIFIER);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 647:3: -> VT_SLOT_ID[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VT_SLOT_ID, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end slot_id

    public static class rule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start rule
    // src/main/resources/org/drools/lang/DRL.g:650:1: rule : rule_key rule_id ( rule_attributes )? ( decl_metadata )* ( when_part )? rhs_chunk -> ^( rule_key rule_id ( rule_attributes )? ( decl_metadata )* ( when_part )? rhs_chunk ) ;
    public final rule_return rule() throws RecognitionException {
        rule_return retval = new rule_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        rule_key_return rule_key68 = null;

        rule_id_return rule_id69 = null;

        rule_attributes_return rule_attributes70 = null;

        decl_metadata_return decl_metadata71 = null;

        when_part_return when_part72 = null;

        rhs_chunk_return rhs_chunk73 = null;


        RewriteRuleSubtreeStream stream_rule_id=new RewriteRuleSubtreeStream(adaptor,"rule rule_id");
        RewriteRuleSubtreeStream stream_rhs_chunk=new RewriteRuleSubtreeStream(adaptor,"rule rhs_chunk");
        RewriteRuleSubtreeStream stream_rule_attributes=new RewriteRuleSubtreeStream(adaptor,"rule rule_attributes");
        RewriteRuleSubtreeStream stream_rule_key=new RewriteRuleSubtreeStream(adaptor,"rule rule_key");
        RewriteRuleSubtreeStream stream_decl_metadata=new RewriteRuleSubtreeStream(adaptor,"rule decl_metadata");
        RewriteRuleSubtreeStream stream_when_part=new RewriteRuleSubtreeStream(adaptor,"rule when_part");
         pushParaphrases(DroolsParaphraseTypes.RULE); 
        try {
            // src/main/resources/org/drools/lang/DRL.g:653:2: ( rule_key rule_id ( rule_attributes )? ( decl_metadata )* ( when_part )? rhs_chunk -> ^( rule_key rule_id ( rule_attributes )? ( decl_metadata )* ( when_part )? rhs_chunk ) )
            // src/main/resources/org/drools/lang/DRL.g:654:2: rule_key rule_id ( rule_attributes )? ( decl_metadata )* ( when_part )? rhs_chunk
            {
            if ( backtracking==0 ) {
              	beginSentence(DroolsSentenceType.RULE);	
            }
            pushFollow(FOLLOW_rule_key_in_rule1484);
            rule_key68=rule_key();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_rule_key.add(rule_key68.getTree());
            pushFollow(FOLLOW_rule_id_in_rule1486);
            rule_id69=rule_id();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_rule_id.add(rule_id69.getTree());
            if ( backtracking==0 ) {
              	emit(Location.LOCATION_RULE_HEADER);	
            }
            // src/main/resources/org/drools/lang/DRL.g:657:3: ( rule_attributes )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ID) && (((validateIdentifierKey(DroolsSoftKeywords.AUTO) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.FOCUS))||(validateIdentifierKey(DroolsSoftKeywords.ACTIVATION) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||(validateIdentifierKey(DroolsSoftKeywords.SALIENCE))||(validateIdentifierKey(DroolsSoftKeywords.DATE) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.EFFECTIVE))||(validateIdentifierKey(DroolsSoftKeywords.LOCK) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.ON) && validateLT(4, "-") && validateLT(5, DroolsSoftKeywords.ACTIVE))||(validateIdentifierKey(DroolsSoftKeywords.NO) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.LOOP))||(validateIdentifierKey(DroolsSoftKeywords.ATTRIBUTES))||(validateIdentifierKey(DroolsSoftKeywords.DATE) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.EXPIRES))||(validateIdentifierKey(DroolsSoftKeywords.DIALECT))||(validateIdentifierKey(DroolsSoftKeywords.AGENDA) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||(validateIdentifierKey(DroolsSoftKeywords.RULEFLOW) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||(validateIdentifierKey(DroolsSoftKeywords.ENABLED))||(validateIdentifierKey(DroolsSoftKeywords.DURATION))))) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:657:3: rule_attributes
                    {
                    pushFollow(FOLLOW_rule_attributes_in_rule1494);
                    rule_attributes70=rule_attributes();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_rule_attributes.add(rule_attributes70.getTree());

                    }
                    break;

            }

            // src/main/resources/org/drools/lang/DRL.g:657:20: ( decl_metadata )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==AT) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:657:20: decl_metadata
            	    {
            	    pushFollow(FOLLOW_decl_metadata_in_rule1497);
            	    decl_metadata71=decl_metadata();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_decl_metadata.add(decl_metadata71.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // src/main/resources/org/drools/lang/DRL.g:657:35: ( when_part )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==WHEN) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:657:35: when_part
                    {
                    pushFollow(FOLLOW_when_part_in_rule1500);
                    when_part72=when_part();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_when_part.add(when_part72.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_rhs_chunk_in_rule1503);
            rhs_chunk73=rhs_chunk();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_rhs_chunk.add(rhs_chunk73.getTree());

            // AST REWRITE
            // elements: rule_id, rule_key, when_part, rhs_chunk, decl_metadata, rule_attributes
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 658:3: -> ^( rule_key rule_id ( rule_attributes )? ( decl_metadata )* ( when_part )? rhs_chunk )
            {
                // src/main/resources/org/drools/lang/DRL.g:658:6: ^( rule_key rule_id ( rule_attributes )? ( decl_metadata )* ( when_part )? rhs_chunk )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_rule_key.nextNode(), root_1);

                adaptor.addChild(root_1, stream_rule_id.next());
                // src/main/resources/org/drools/lang/DRL.g:658:25: ( rule_attributes )?
                if ( stream_rule_attributes.hasNext() ) {
                    adaptor.addChild(root_1, stream_rule_attributes.next());

                }
                stream_rule_attributes.reset();
                // src/main/resources/org/drools/lang/DRL.g:658:42: ( decl_metadata )*
                while ( stream_decl_metadata.hasNext() ) {
                    adaptor.addChild(root_1, stream_decl_metadata.next());

                }
                stream_decl_metadata.reset();
                // src/main/resources/org/drools/lang/DRL.g:658:57: ( when_part )?
                if ( stream_when_part.hasNext() ) {
                    adaptor.addChild(root_1, stream_when_part.next());

                }
                stream_when_part.reset();
                adaptor.addChild(root_1, stream_rhs_chunk.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( backtracking==0 ) {
               paraphrases.pop(); 
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end rule

    public static class when_part_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start when_part
    // src/main/resources/org/drools/lang/DRL.g:661:1: when_part : WHEN ( COLON )? normal_lhs_block -> WHEN normal_lhs_block ;
    public final when_part_return when_part() throws RecognitionException {
        when_part_return retval = new when_part_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHEN74=null;
        Token COLON75=null;
        normal_lhs_block_return normal_lhs_block76 = null;


        Object WHEN74_tree=null;
        Object COLON75_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_WHEN=new RewriteRuleTokenStream(adaptor,"token WHEN");
        RewriteRuleSubtreeStream stream_normal_lhs_block=new RewriteRuleSubtreeStream(adaptor,"rule normal_lhs_block");
        try {
            // src/main/resources/org/drools/lang/DRL.g:662:2: ( WHEN ( COLON )? normal_lhs_block -> WHEN normal_lhs_block )
            // src/main/resources/org/drools/lang/DRL.g:662:5: WHEN ( COLON )? normal_lhs_block
            {
            WHEN74=(Token)input.LT(1);
            match(input,WHEN,FOLLOW_WHEN_in_when_part1536); if (failed) return retval;
            if ( backtracking==0 ) stream_WHEN.add(WHEN74);

            if ( backtracking==0 ) {
              	emit(WHEN74, DroolsEditorType.KEYWORD);	
            }
            // src/main/resources/org/drools/lang/DRL.g:663:3: ( COLON )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==COLON) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:663:3: COLON
                    {
                    COLON75=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_when_part1542); if (failed) return retval;
                    if ( backtracking==0 ) stream_COLON.add(COLON75);


                    }
                    break;

            }

            if ( backtracking==0 ) {
              	emit(COLON75, DroolsEditorType.SYMBOL);	
            }
            if ( backtracking==0 ) {
              	emit(Location.LOCATION_LHS_BEGIN_OF_CONDITION);	
            }
            pushFollow(FOLLOW_normal_lhs_block_in_when_part1552);
            normal_lhs_block76=normal_lhs_block();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_normal_lhs_block.add(normal_lhs_block76.getTree());

            // AST REWRITE
            // elements: normal_lhs_block, WHEN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 666:2: -> WHEN normal_lhs_block
            {
                adaptor.addChild(root_0, stream_WHEN.next());
                adaptor.addChild(root_0, stream_normal_lhs_block.next());

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end when_part

    public static class rule_id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start rule_id
    // src/main/resources/org/drools/lang/DRL.g:669:1: rule_id : (id= ID -> VT_RULE_ID[$id] | id= STRING -> VT_RULE_ID[$id] );
    public final rule_id_return rule_id() throws RecognitionException {
        rule_id_return retval = new rule_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // src/main/resources/org/drools/lang/DRL.g:670:2: (id= ID -> VT_RULE_ID[$id] | id= STRING -> VT_RULE_ID[$id] )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==ID) ) {
                alt32=1;
            }
            else if ( (LA32_0==STRING) ) {
                alt32=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("669:1: rule_id : (id= ID -> VT_RULE_ID[$id] | id= STRING -> VT_RULE_ID[$id] );", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:670:5: id= ID
                    {
                    id=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_rule_id1573); if (failed) return retval;
                    if ( backtracking==0 ) stream_ID.add(id);

                    if ( backtracking==0 ) {
                      	emit(id, DroolsEditorType.IDENTIFIER);
                      		setParaphrasesValue(DroolsParaphraseTypes.RULE, id.getText());	
                    }

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 672:64: -> VT_RULE_ID[$id]
                    {
                        adaptor.addChild(root_0, adaptor.create(VT_RULE_ID, id));

                    }

                    }

                    }
                    break;
                case 2 :
                    // src/main/resources/org/drools/lang/DRL.g:673:5: id= STRING
                    {
                    id=(Token)input.LT(1);
                    match(input,STRING,FOLLOW_STRING_in_rule_id1589); if (failed) return retval;
                    if ( backtracking==0 ) stream_STRING.add(id);

                    if ( backtracking==0 ) {
                      	emit(id, DroolsEditorType.IDENTIFIER);
                      		setParaphrasesValue(DroolsParaphraseTypes.RULE, id.getText());	
                    }

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 675:64: -> VT_RULE_ID[$id]
                    {
                        adaptor.addChild(root_0, adaptor.create(VT_RULE_ID, id));

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end rule_id

    public static class rule_attributes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start rule_attributes
    // src/main/resources/org/drools/lang/DRL.g:678:1: rule_attributes : ( attributes_key COLON )? rule_attribute ( ( COMMA )? attr= rule_attribute )* -> ^( VT_RULE_ATTRIBUTES ( attributes_key )? ( rule_attribute )+ ) ;
    public final rule_attributes_return rule_attributes() throws RecognitionException {
        rule_attributes_return retval = new rule_attributes_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON78=null;
        Token COMMA80=null;
        rule_attribute_return attr = null;

        attributes_key_return attributes_key77 = null;

        rule_attribute_return rule_attribute79 = null;


        Object COLON78_tree=null;
        Object COMMA80_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_rule_attribute=new RewriteRuleSubtreeStream(adaptor,"rule rule_attribute");
        RewriteRuleSubtreeStream stream_attributes_key=new RewriteRuleSubtreeStream(adaptor,"rule attributes_key");
        try {
            // src/main/resources/org/drools/lang/DRL.g:679:2: ( ( attributes_key COLON )? rule_attribute ( ( COMMA )? attr= rule_attribute )* -> ^( VT_RULE_ATTRIBUTES ( attributes_key )? ( rule_attribute )+ ) )
            // src/main/resources/org/drools/lang/DRL.g:679:4: ( attributes_key COLON )? rule_attribute ( ( COMMA )? attr= rule_attribute )*
            {
            // src/main/resources/org/drools/lang/DRL.g:679:4: ( attributes_key COLON )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==ID) && (((validateIdentifierKey(DroolsSoftKeywords.AUTO) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.FOCUS))||(validateIdentifierKey(DroolsSoftKeywords.ACTIVATION) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||(validateIdentifierKey(DroolsSoftKeywords.SALIENCE))||(validateIdentifierKey(DroolsSoftKeywords.DATE) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.EFFECTIVE))||(validateIdentifierKey(DroolsSoftKeywords.LOCK) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.ON) && validateLT(4, "-") && validateLT(5, DroolsSoftKeywords.ACTIVE))||(validateIdentifierKey(DroolsSoftKeywords.NO) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.LOOP))||(validateIdentifierKey(DroolsSoftKeywords.ATTRIBUTES))||(validateIdentifierKey(DroolsSoftKeywords.DATE) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.EXPIRES))||(validateIdentifierKey(DroolsSoftKeywords.DIALECT))||(validateIdentifierKey(DroolsSoftKeywords.AGENDA) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||(validateIdentifierKey(DroolsSoftKeywords.ENABLED))||(validateIdentifierKey(DroolsSoftKeywords.RULEFLOW) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||(validateIdentifierKey(DroolsSoftKeywords.DURATION))))) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==COLON) && ((validateIdentifierKey(DroolsSoftKeywords.ATTRIBUTES)))) {
                    alt33=1;
                }
            }
            switch (alt33) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:679:6: attributes_key COLON
                    {
                    pushFollow(FOLLOW_attributes_key_in_rule_attributes1610);
                    attributes_key77=attributes_key();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_attributes_key.add(attributes_key77.getTree());
                    COLON78=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_rule_attributes1612); if (failed) return retval;
                    if ( backtracking==0 ) stream_COLON.add(COLON78);

                    if ( backtracking==0 ) {
                      	emit(COLON78, DroolsEditorType.SYMBOL);	
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_rule_attribute_in_rule_attributes1622);
            rule_attribute79=rule_attribute();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_rule_attribute.add(rule_attribute79.getTree());
            // src/main/resources/org/drools/lang/DRL.g:680:18: ( ( COMMA )? attr= rule_attribute )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==COMMA) ) {
                    alt35=1;
                }
                else if ( (LA35_0==ID) && (((validateIdentifierKey(DroolsSoftKeywords.NO) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.LOOP))||(validateIdentifierKey(DroolsSoftKeywords.DATE) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.EXPIRES))||(validateIdentifierKey(DroolsSoftKeywords.AUTO) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.FOCUS))||(validateIdentifierKey(DroolsSoftKeywords.DIALECT))||(validateIdentifierKey(DroolsSoftKeywords.ACTIVATION) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||(validateIdentifierKey(DroolsSoftKeywords.SALIENCE))||(validateIdentifierKey(DroolsSoftKeywords.AGENDA) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||(validateIdentifierKey(DroolsSoftKeywords.RULEFLOW) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||(validateIdentifierKey(DroolsSoftKeywords.ENABLED))||(validateIdentifierKey(DroolsSoftKeywords.DURATION))||(validateIdentifierKey(DroolsSoftKeywords.LOCK) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.ON) && validateLT(4, "-") && validateLT(5, DroolsSoftKeywords.ACTIVE))||(validateIdentifierKey(DroolsSoftKeywords.DATE) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.EFFECTIVE))))) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:680:20: ( COMMA )? attr= rule_attribute
            	    {
            	    // src/main/resources/org/drools/lang/DRL.g:680:20: ( COMMA )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==COMMA) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // src/main/resources/org/drools/lang/DRL.g:680:20: COMMA
            	            {
            	            COMMA80=(Token)input.LT(1);
            	            match(input,COMMA,FOLLOW_COMMA_in_rule_attributes1626); if (failed) return retval;
            	            if ( backtracking==0 ) stream_COMMA.add(COMMA80);


            	            }
            	            break;

            	    }

            	    if ( backtracking==0 ) {
            	      	emit(COMMA80, DroolsEditorType.SYMBOL);	
            	    }
            	    pushFollow(FOLLOW_rule_attribute_in_rule_attributes1633);
            	    attr=rule_attribute();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_rule_attribute.add(attr.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            // AST REWRITE
            // elements: rule_attribute, attributes_key
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 681:3: -> ^( VT_RULE_ATTRIBUTES ( attributes_key )? ( rule_attribute )+ )
            {
                // src/main/resources/org/drools/lang/DRL.g:681:6: ^( VT_RULE_ATTRIBUTES ( attributes_key )? ( rule_attribute )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(VT_RULE_ATTRIBUTES, "VT_RULE_ATTRIBUTES"), root_1);

                // src/main/resources/org/drools/lang/DRL.g:681:27: ( attributes_key )?
                if ( stream_attributes_key.hasNext() ) {
                    adaptor.addChild(root_1, stream_attributes_key.next());

                }
                stream_attributes_key.reset();
                if ( !(stream_rule_attribute.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_rule_attribute.hasNext() ) {
                    adaptor.addChild(root_1, stream_rule_attribute.next());

                }
                stream_rule_attribute.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end rule_attributes

    public static class rule_attribute_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start rule_attribute
    // src/main/resources/org/drools/lang/DRL.g:684:1: rule_attribute : ( salience | no_loop | agenda_group | duration | activation_group | auto_focus | date_effective | date_expires | enabled | ruleflow_group | lock_on_active | dialect );
    public final rule_attribute_return rule_attribute() throws RecognitionException {
        rule_attribute_return retval = new rule_attribute_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        salience_return salience81 = null;

        no_loop_return no_loop82 = null;

        agenda_group_return agenda_group83 = null;

        duration_return duration84 = null;

        activation_group_return activation_group85 = null;

        auto_focus_return auto_focus86 = null;

        date_effective_return date_effective87 = null;

        date_expires_return date_expires88 = null;

        enabled_return enabled89 = null;

        ruleflow_group_return ruleflow_group90 = null;

        lock_on_active_return lock_on_active91 = null;

        dialect_return dialect92 = null;



         boolean isFailed = true; pushParaphrases(DroolsParaphraseTypes.RULE_ATTRIBUTE); 
        try {
            // src/main/resources/org/drools/lang/DRL.g:687:2: ( salience | no_loop | agenda_group | duration | activation_group | auto_focus | date_effective | date_expires | enabled | ruleflow_group | lock_on_active | dialect )
            int alt36=12;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==ID) && (((validateIdentifierKey(DroolsSoftKeywords.NO) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.LOOP))||(validateIdentifierKey(DroolsSoftKeywords.AUTO) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.FOCUS))||(validateIdentifierKey(DroolsSoftKeywords.DATE) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.EXPIRES))||(validateIdentifierKey(DroolsSoftKeywords.ACTIVATION) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||(validateIdentifierKey(DroolsSoftKeywords.DIALECT))||(validateIdentifierKey(DroolsSoftKeywords.SALIENCE))||(validateIdentifierKey(DroolsSoftKeywords.AGENDA) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||(validateIdentifierKey(DroolsSoftKeywords.RULEFLOW) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||(validateIdentifierKey(DroolsSoftKeywords.ENABLED))||(validateIdentifierKey(DroolsSoftKeywords.DURATION))||(validateIdentifierKey(DroolsSoftKeywords.LOCK) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.ON) && validateLT(4, "-") && validateLT(5, DroolsSoftKeywords.ACTIVE))||(validateIdentifierKey(DroolsSoftKeywords.DATE) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.EFFECTIVE))))) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==MISC) && (((validateIdentifierKey(DroolsSoftKeywords.NO) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.LOOP))||(validateIdentifierKey(DroolsSoftKeywords.AUTO) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.FOCUS))||(validateIdentifierKey(DroolsSoftKeywords.DATE) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.EXPIRES))||(validateIdentifierKey(DroolsSoftKeywords.ACTIVATION) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||(validateIdentifierKey(DroolsSoftKeywords.AGENDA) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||(validateIdentifierKey(DroolsSoftKeywords.RULEFLOW) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||(validateIdentifierKey(DroolsSoftKeywords.LOCK) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.ON) && validateLT(4, "-") && validateLT(5, DroolsSoftKeywords.ACTIVE))||(validateIdentifierKey(DroolsSoftKeywords.DATE) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.EFFECTIVE))))) {
                    int LA36_2 = input.LA(3);

                    if ( (LA36_2==ID) && (((validateIdentifierKey(DroolsSoftKeywords.NO) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.LOOP))||(validateIdentifierKey(DroolsSoftKeywords.DATE) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.EXPIRES))||(validateIdentifierKey(DroolsSoftKeywords.AUTO) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.FOCUS))||(validateIdentifierKey(DroolsSoftKeywords.ACTIVATION) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||(validateIdentifierKey(DroolsSoftKeywords.AGENDA) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||(validateIdentifierKey(DroolsSoftKeywords.RULEFLOW) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||(validateIdentifierKey(DroolsSoftKeywords.LOCK) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.ON) && validateLT(4, "-") && validateLT(5, DroolsSoftKeywords.ACTIVE))||(validateIdentifierKey(DroolsSoftKeywords.DATE) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.EFFECTIVE))))) {
                        int LA36_7 = input.LA(4);

                        if ( (LA36_7==MISC) && ((validateIdentifierKey(DroolsSoftKeywords.LOCK) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.ON) && validateLT(4, "-") && validateLT(5, DroolsSoftKeywords.ACTIVE)))) {
                            alt36=11;
                        }
                        else if ( (LA36_7==STRING) && (((validateIdentifierKey(DroolsSoftKeywords.DATE) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.EXPIRES))||(validateIdentifierKey(DroolsSoftKeywords.ACTIVATION) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||(validateIdentifierKey(DroolsSoftKeywords.AGENDA) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||(validateIdentifierKey(DroolsSoftKeywords.RULEFLOW) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))||(validateIdentifierKey(DroolsSoftKeywords.DATE) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.EFFECTIVE))))) {
                            int LA36_10 = input.LA(5);

                            if ( ((validateIdentifierKey(DroolsSoftKeywords.AGENDA) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))) ) {
                                alt36=3;
                            }
                            else if ( ((validateIdentifierKey(DroolsSoftKeywords.ACTIVATION) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))) ) {
                                alt36=5;
                            }
                            else if ( ((validateIdentifierKey(DroolsSoftKeywords.DATE) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.EFFECTIVE))) ) {
                                alt36=7;
                            }
                            else if ( ((validateIdentifierKey(DroolsSoftKeywords.DATE) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.EXPIRES))) ) {
                                alt36=8;
                            }
                            else if ( ((validateIdentifierKey(DroolsSoftKeywords.RULEFLOW) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))) ) {
                                alt36=10;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("684:1: rule_attribute : ( salience | no_loop | agenda_group | duration | activation_group | auto_focus | date_effective | date_expires | enabled | ruleflow_group | lock_on_active | dialect );", 36, 10, input);

                                throw nvae;
                            }
                        }
                        else if ( ((validateIdentifierKey(DroolsSoftKeywords.NO) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.LOOP))) ) {
                            alt36=2;
                        }
                        else if ( ((validateIdentifierKey(DroolsSoftKeywords.AUTO) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.FOCUS))) ) {
                            alt36=6;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("684:1: rule_attribute : ( salience | no_loop | agenda_group | duration | activation_group | auto_focus | date_effective | date_expires | enabled | ruleflow_group | lock_on_active | dialect );", 36, 7, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("684:1: rule_attribute : ( salience | no_loop | agenda_group | duration | activation_group | auto_focus | date_effective | date_expires | enabled | ruleflow_group | lock_on_active | dialect );", 36, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA36_1==INT) && (((validateIdentifierKey(DroolsSoftKeywords.SALIENCE))||(validateIdentifierKey(DroolsSoftKeywords.DURATION))))) {
                    int LA36_3 = input.LA(3);

                    if ( ((validateIdentifierKey(DroolsSoftKeywords.SALIENCE))) ) {
                        alt36=1;
                    }
                    else if ( ((validateIdentifierKey(DroolsSoftKeywords.DURATION))) ) {
                        alt36=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("684:1: rule_attribute : ( salience | no_loop | agenda_group | duration | activation_group | auto_focus | date_effective | date_expires | enabled | ruleflow_group | lock_on_active | dialect );", 36, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA36_1==LEFT_PAREN) && ((validateIdentifierKey(DroolsSoftKeywords.SALIENCE)))) {
                    alt36=1;
                }
                else if ( (LA36_1==STRING) && ((validateIdentifierKey(DroolsSoftKeywords.DIALECT)))) {
                    alt36=12;
                }
                else if ( (LA36_1==BOOL) && ((validateIdentifierKey(DroolsSoftKeywords.ENABLED)))) {
                    alt36=9;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("684:1: rule_attribute : ( salience | no_loop | agenda_group | duration | activation_group | auto_focus | date_effective | date_expires | enabled | ruleflow_group | lock_on_active | dialect );", 36, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("684:1: rule_attribute : ( salience | no_loop | agenda_group | duration | activation_group | auto_focus | date_effective | date_expires | enabled | ruleflow_group | lock_on_active | dialect );", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:687:4: salience
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_salience_in_rule_attribute1672);
                    salience81=salience();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, salience81.getTree());

                    }
                    break;
                case 2 :
                    // src/main/resources/org/drools/lang/DRL.g:688:4: no_loop
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_no_loop_in_rule_attribute1678);
                    no_loop82=no_loop();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, no_loop82.getTree());

                    }
                    break;
                case 3 :
                    // src/main/resources/org/drools/lang/DRL.g:689:4: agenda_group
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_agenda_group_in_rule_attribute1683);
                    agenda_group83=agenda_group();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, agenda_group83.getTree());

                    }
                    break;
                case 4 :
                    // src/main/resources/org/drools/lang/DRL.g:690:4: duration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_duration_in_rule_attribute1690);
                    duration84=duration();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, duration84.getTree());

                    }
                    break;
                case 5 :
                    // src/main/resources/org/drools/lang/DRL.g:691:4: activation_group
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_activation_group_in_rule_attribute1697);
                    activation_group85=activation_group();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, activation_group85.getTree());

                    }
                    break;
                case 6 :
                    // src/main/resources/org/drools/lang/DRL.g:692:4: auto_focus
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_auto_focus_in_rule_attribute1703);
                    auto_focus86=auto_focus();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, auto_focus86.getTree());

                    }
                    break;
                case 7 :
                    // src/main/resources/org/drools/lang/DRL.g:693:4: date_effective
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_date_effective_in_rule_attribute1709);
                    date_effective87=date_effective();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, date_effective87.getTree());

                    }
                    break;
                case 8 :
                    // src/main/resources/org/drools/lang/DRL.g:694:4: date_expires
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_date_expires_in_rule_attribute1715);
                    date_expires88=date_expires();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, date_expires88.getTree());

                    }
                    break;
                case 9 :
                    // src/main/resources/org/drools/lang/DRL.g:695:4: enabled
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enabled_in_rule_attribute1721);
                    enabled89=enabled();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, enabled89.getTree());

                    }
                    break;
                case 10 :
                    // src/main/resources/org/drools/lang/DRL.g:696:4: ruleflow_group
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ruleflow_group_in_rule_attribute1727);
                    ruleflow_group90=ruleflow_group();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ruleflow_group90.getTree());

                    }
                    break;
                case 11 :
                    // src/main/resources/org/drools/lang/DRL.g:697:4: lock_on_active
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lock_on_active_in_rule_attribute1733);
                    lock_on_active91=lock_on_active();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, lock_on_active91.getTree());

                    }
                    break;
                case 12 :
                    // src/main/resources/org/drools/lang/DRL.g:698:4: dialect
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dialect_in_rule_attribute1738);
                    dialect92=dialect();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, dialect92.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( backtracking==0 ) {
               paraphrases.pop(); isFailed = false; emit(Location.LOCATION_RULE_HEADER); 
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (isEditorInterfaceEnabled && isFailed) {
            		if (input.LA(6) == EOF && input.LA(1) == ID && input.LA(2) == MISC && input.LA(3) == ID && 
            			input.LA(5) == MISC && input.LA(6) == ID && 
            			validateLT(1, DroolsSoftKeywords.LOCK) && validateLT(3, DroolsSoftKeywords.ON) &&
            			validateLT(5, DroolsSoftKeywords.ACTIVE)){
            			emit(input.LT(1), DroolsEditorType.KEYWORD);
            			emit(input.LT(2), DroolsEditorType.KEYWORD);
            			emit(input.LT(3), DroolsEditorType.KEYWORD);
            			emit(input.LT(4), DroolsEditorType.KEYWORD);
            			emit(input.LT(5), DroolsEditorType.KEYWORD);
            			emit(Location.LOCATION_RULE_HEADER_KEYWORD);
            			input.consume();
            			input.consume();
            			input.consume();
            			input.consume();
            			input.consume();
            		} else if (input.LA(4) == EOF && input.LA(1) == ID && input.LA(2) == MISC && input.LA(3) == ID && 
            			(	(validateLT(1, DroolsSoftKeywords.ACTIVATION) && validateLT(3, DroolsSoftKeywords.GROUP)) ||
            				(validateLT(1, DroolsSoftKeywords.DATE) && validateLT(3, DroolsSoftKeywords.EXPIRES)) ||
            				(validateLT(1, DroolsSoftKeywords.NO) && validateLT(3, DroolsSoftKeywords.LOOP)) ||
            				(validateLT(1, DroolsSoftKeywords.DATE) && validateLT(3, DroolsSoftKeywords.EFFECTIVE)) ||
            				(validateLT(1, DroolsSoftKeywords.AUTO) && validateLT(3, DroolsSoftKeywords.FOCUS)) ||
            				(validateLT(1, DroolsSoftKeywords.ACTIVATION) && validateLT(3, DroolsSoftKeywords.GROUP)) ||
            				(validateLT(1, DroolsSoftKeywords.RULEFLOW) && validateLT(3, DroolsSoftKeywords.GROUP)) ||
            				(validateLT(1, DroolsSoftKeywords.AGENDA) && validateLT(3, DroolsSoftKeywords.GROUP))	)){
            			emit(input.LT(1), DroolsEditorType.KEYWORD);
            			emit(input.LT(2), DroolsEditorType.KEYWORD);
            			emit(input.LT(3), DroolsEditorType.KEYWORD);
            			emit(Location.LOCATION_RULE_HEADER_KEYWORD);
            			input.consume();
            			input.consume();
            			input.consume();
            		} else if (input.LA(2) == EOF && input.LA(1) == ID && 
            				(validateLT(1, DroolsSoftKeywords.DIALECT) || validateLT(1, DroolsSoftKeywords.ENABLED) ||
            				 validateLT(1, DroolsSoftKeywords.SALIENCE) || validateLT(1, DroolsSoftKeywords.DURATION))){
            			emit(input.LT(1), DroolsEditorType.KEYWORD);
            			emit(Location.LOCATION_RULE_HEADER_KEYWORD);
            			input.consume();
            		}
            	}

        }
        return retval;
    }
    // $ANTLR end rule_attribute

    public static class date_effective_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start date_effective
    // src/main/resources/org/drools/lang/DRL.g:743:1: date_effective : date_effective_key STRING ;
    public final date_effective_return date_effective() throws RecognitionException {
        date_effective_return retval = new date_effective_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING94=null;
        date_effective_key_return date_effective_key93 = null;


        Object STRING94_tree=null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:744:2: ( date_effective_key STRING )
            // src/main/resources/org/drools/lang/DRL.g:744:4: date_effective_key STRING
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_date_effective_key_in_date_effective1754);
            date_effective_key93=date_effective_key();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(date_effective_key93.getTree(), root_0);
            if ( backtracking==0 ) {
              	emit(Location.LOCATION_RULE_HEADER_KEYWORD);	
            }
            STRING94=(Token)input.LT(1);
            match(input,STRING,FOLLOW_STRING_in_date_effective1759); if (failed) return retval;
            if ( backtracking==0 ) {
            STRING94_tree = (Object)adaptor.create(STRING94);
            adaptor.addChild(root_0, STRING94_tree);
            }
            if ( backtracking==0 ) {
              	emit(STRING94, DroolsEditorType.STRING_CONST );	
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end date_effective

    public static class date_expires_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start date_expires
    // src/main/resources/org/drools/lang/DRL.g:748:1: date_expires : date_expires_key STRING ;
    public final date_expires_return date_expires() throws RecognitionException {
        date_expires_return retval = new date_expires_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING96=null;
        date_expires_key_return date_expires_key95 = null;


        Object STRING96_tree=null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:749:2: ( date_expires_key STRING )
            // src/main/resources/org/drools/lang/DRL.g:749:4: date_expires_key STRING
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_date_expires_key_in_date_expires1773);
            date_expires_key95=date_expires_key();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(date_expires_key95.getTree(), root_0);
            if ( backtracking==0 ) {
              	emit(Location.LOCATION_RULE_HEADER_KEYWORD);	
            }
            STRING96=(Token)input.LT(1);
            match(input,STRING,FOLLOW_STRING_in_date_expires1778); if (failed) return retval;
            if ( backtracking==0 ) {
            STRING96_tree = (Object)adaptor.create(STRING96);
            adaptor.addChild(root_0, STRING96_tree);
            }
            if ( backtracking==0 ) {
              	emit(STRING96, DroolsEditorType.STRING_CONST );	
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end date_expires

    public static class enabled_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start enabled
    // src/main/resources/org/drools/lang/DRL.g:753:1: enabled : enabled_key BOOL ;
    public final enabled_return enabled() throws RecognitionException {
        enabled_return retval = new enabled_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BOOL98=null;
        enabled_key_return enabled_key97 = null;


        Object BOOL98_tree=null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:754:2: ( enabled_key BOOL )
            // src/main/resources/org/drools/lang/DRL.g:754:4: enabled_key BOOL
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_enabled_key_in_enabled1793);
            enabled_key97=enabled_key();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(enabled_key97.getTree(), root_0);
            if ( backtracking==0 ) {
              	emit(Location.LOCATION_RULE_HEADER_KEYWORD);	
            }
            BOOL98=(Token)input.LT(1);
            match(input,BOOL,FOLLOW_BOOL_in_enabled1798); if (failed) return retval;
            if ( backtracking==0 ) {
            BOOL98_tree = (Object)adaptor.create(BOOL98);
            adaptor.addChild(root_0, BOOL98_tree);
            }
            if ( backtracking==0 ) {
              	emit(BOOL98, DroolsEditorType.BOOLEAN_CONST );	
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end enabled

    public static class salience_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start salience
    // src/main/resources/org/drools/lang/DRL.g:758:1: salience : salience_key ( INT | paren_chunk ) ;
    public final salience_return salience() throws RecognitionException {
        salience_return retval = new salience_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT100=null;
        salience_key_return salience_key99 = null;

        paren_chunk_return paren_chunk101 = null;


        Object INT100_tree=null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:759:2: ( salience_key ( INT | paren_chunk ) )
            // src/main/resources/org/drools/lang/DRL.g:759:4: salience_key ( INT | paren_chunk )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_salience_key_in_salience1813);
            salience_key99=salience_key();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(salience_key99.getTree(), root_0);
            if ( backtracking==0 ) {
              	emit(Location.LOCATION_RULE_HEADER_KEYWORD);	
            }
            // src/main/resources/org/drools/lang/DRL.g:760:3: ( INT | paren_chunk )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==INT) ) {
                alt37=1;
            }
            else if ( (LA37_0==LEFT_PAREN) ) {
                alt37=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("760:3: ( INT | paren_chunk )", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:760:5: INT
                    {
                    INT100=(Token)input.LT(1);
                    match(input,INT,FOLLOW_INT_in_salience1822); if (failed) return retval;
                    if ( backtracking==0 ) {
                    INT100_tree = (Object)adaptor.create(INT100);
                    adaptor.addChild(root_0, INT100_tree);
                    }
                    if ( backtracking==0 ) {
                      	emit(INT100, DroolsEditorType.NUMERIC_CONST );	
                    }

                    }
                    break;
                case 2 :
                    // src/main/resources/org/drools/lang/DRL.g:761:5: paren_chunk
                    {
                    pushFollow(FOLLOW_paren_chunk_in_salience1831);
                    paren_chunk101=paren_chunk();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, paren_chunk101.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end salience

    public static class no_loop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start no_loop
    // src/main/resources/org/drools/lang/DRL.g:765:1: no_loop : no_loop_key ( BOOL )? ;
    public final no_loop_return no_loop() throws RecognitionException {
        no_loop_return retval = new no_loop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BOOL103=null;
        no_loop_key_return no_loop_key102 = null;


        Object BOOL103_tree=null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:766:2: ( no_loop_key ( BOOL )? )
            // src/main/resources/org/drools/lang/DRL.g:766:4: no_loop_key ( BOOL )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_no_loop_key_in_no_loop1846);
            no_loop_key102=no_loop_key();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(no_loop_key102.getTree(), root_0);
            if ( backtracking==0 ) {
              	emit(Location.LOCATION_RULE_HEADER_KEYWORD);	
            }
            // src/main/resources/org/drools/lang/DRL.g:766:66: ( BOOL )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==BOOL) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:766:66: BOOL
                    {
                    BOOL103=(Token)input.LT(1);
                    match(input,BOOL,FOLLOW_BOOL_in_no_loop1851); if (failed) return retval;
                    if ( backtracking==0 ) {
                    BOOL103_tree = (Object)adaptor.create(BOOL103);
                    adaptor.addChild(root_0, BOOL103_tree);
                    }

                    }
                    break;

            }

            if ( backtracking==0 ) {
              	emit(BOOL103, DroolsEditorType.BOOLEAN_CONST );	
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end no_loop

    public static class auto_focus_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start auto_focus
    // src/main/resources/org/drools/lang/DRL.g:770:1: auto_focus : auto_focus_key ( BOOL )? ;
    public final auto_focus_return auto_focus() throws RecognitionException {
        auto_focus_return retval = new auto_focus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BOOL105=null;
        auto_focus_key_return auto_focus_key104 = null;


        Object BOOL105_tree=null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:771:2: ( auto_focus_key ( BOOL )? )
            // src/main/resources/org/drools/lang/DRL.g:771:4: auto_focus_key ( BOOL )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_auto_focus_key_in_auto_focus1866);
            auto_focus_key104=auto_focus_key();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(auto_focus_key104.getTree(), root_0);
            if ( backtracking==0 ) {
              	emit(Location.LOCATION_RULE_HEADER_KEYWORD);	
            }
            // src/main/resources/org/drools/lang/DRL.g:771:69: ( BOOL )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==BOOL) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:771:69: BOOL
                    {
                    BOOL105=(Token)input.LT(1);
                    match(input,BOOL,FOLLOW_BOOL_in_auto_focus1871); if (failed) return retval;
                    if ( backtracking==0 ) {
                    BOOL105_tree = (Object)adaptor.create(BOOL105);
                    adaptor.addChild(root_0, BOOL105_tree);
                    }

                    }
                    break;

            }

            if ( backtracking==0 ) {
              	emit(BOOL105, DroolsEditorType.BOOLEAN_CONST );	
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end auto_focus

    public static class activation_group_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start activation_group
    // src/main/resources/org/drools/lang/DRL.g:775:1: activation_group : activation_group_key STRING ;
    public final activation_group_return activation_group() throws RecognitionException {
        activation_group_return retval = new activation_group_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING107=null;
        activation_group_key_return activation_group_key106 = null;


        Object STRING107_tree=null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:776:2: ( activation_group_key STRING )
            // src/main/resources/org/drools/lang/DRL.g:776:4: activation_group_key STRING
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_activation_group_key_in_activation_group1888);
            activation_group_key106=activation_group_key();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(activation_group_key106.getTree(), root_0);
            if ( backtracking==0 ) {
              	emit(Location.LOCATION_RULE_HEADER_KEYWORD);	
            }
            STRING107=(Token)input.LT(1);
            match(input,STRING,FOLLOW_STRING_in_activation_group1893); if (failed) return retval;
            if ( backtracking==0 ) {
            STRING107_tree = (Object)adaptor.create(STRING107);
            adaptor.addChild(root_0, STRING107_tree);
            }
            if ( backtracking==0 ) {
              	emit(STRING107, DroolsEditorType.STRING_CONST );	
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end activation_group

    public static class ruleflow_group_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ruleflow_group
    // src/main/resources/org/drools/lang/DRL.g:780:1: ruleflow_group : ruleflow_group_key STRING ;
    public final ruleflow_group_return ruleflow_group() throws RecognitionException {
        ruleflow_group_return retval = new ruleflow_group_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING109=null;
        ruleflow_group_key_return ruleflow_group_key108 = null;


        Object STRING109_tree=null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:781:2: ( ruleflow_group_key STRING )
            // src/main/resources/org/drools/lang/DRL.g:781:4: ruleflow_group_key STRING
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ruleflow_group_key_in_ruleflow_group1907);
            ruleflow_group_key108=ruleflow_group_key();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(ruleflow_group_key108.getTree(), root_0);
            if ( backtracking==0 ) {
              	emit(Location.LOCATION_RULE_HEADER_KEYWORD);	
            }
            STRING109=(Token)input.LT(1);
            match(input,STRING,FOLLOW_STRING_in_ruleflow_group1912); if (failed) return retval;
            if ( backtracking==0 ) {
            STRING109_tree = (Object)adaptor.create(STRING109);
            adaptor.addChild(root_0, STRING109_tree);
            }
            if ( backtracking==0 ) {
              	emit(STRING109, DroolsEditorType.STRING_CONST );	
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end ruleflow_group

    public static class agenda_group_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start agenda_group
    // src/main/resources/org/drools/lang/DRL.g:785:1: agenda_group : agenda_group_key STRING ;
    public final agenda_group_return agenda_group() throws RecognitionException {
        agenda_group_return retval = new agenda_group_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING111=null;
        agenda_group_key_return agenda_group_key110 = null;


        Object STRING111_tree=null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:786:2: ( agenda_group_key STRING )
            // src/main/resources/org/drools/lang/DRL.g:786:4: agenda_group_key STRING
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_agenda_group_key_in_agenda_group1926);
            agenda_group_key110=agenda_group_key();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(agenda_group_key110.getTree(), root_0);
            if ( backtracking==0 ) {
              	emit(Location.LOCATION_RULE_HEADER_KEYWORD);	
            }
            STRING111=(Token)input.LT(1);
            match(input,STRING,FOLLOW_STRING_in_agenda_group1931); if (failed) return retval;
            if ( backtracking==0 ) {
            STRING111_tree = (Object)adaptor.create(STRING111);
            adaptor.addChild(root_0, STRING111_tree);
            }
            if ( backtracking==0 ) {
              	emit(STRING111, DroolsEditorType.STRING_CONST );	
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end agenda_group

    public static class duration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start duration
    // src/main/resources/org/drools/lang/DRL.g:790:1: duration : duration_key INT ;
    public final duration_return duration() throws RecognitionException {
        duration_return retval = new duration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT113=null;
        duration_key_return duration_key112 = null;


        Object INT113_tree=null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:791:2: ( duration_key INT )
            // src/main/resources/org/drools/lang/DRL.g:791:4: duration_key INT
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_duration_key_in_duration1945);
            duration_key112=duration_key();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(duration_key112.getTree(), root_0);
            if ( backtracking==0 ) {
              	emit(Location.LOCATION_RULE_HEADER_KEYWORD);	
            }
            INT113=(Token)input.LT(1);
            match(input,INT,FOLLOW_INT_in_duration1950); if (failed) return retval;
            if ( backtracking==0 ) {
            INT113_tree = (Object)adaptor.create(INT113);
            adaptor.addChild(root_0, INT113_tree);
            }
            if ( backtracking==0 ) {
              	emit(INT113, DroolsEditorType.NUMERIC_CONST );	
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end duration

    public static class dialect_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start dialect
    // src/main/resources/org/drools/lang/DRL.g:795:1: dialect : dialect_key STRING ;
    public final dialect_return dialect() throws RecognitionException {
        dialect_return retval = new dialect_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING115=null;
        dialect_key_return dialect_key114 = null;


        Object STRING115_tree=null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:796:2: ( dialect_key STRING )
            // src/main/resources/org/drools/lang/DRL.g:796:4: dialect_key STRING
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_dialect_key_in_dialect1966);
            dialect_key114=dialect_key();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(dialect_key114.getTree(), root_0);
            if ( backtracking==0 ) {
              	emit(Location.LOCATION_RULE_HEADER_KEYWORD);	
            }
            STRING115=(Token)input.LT(1);
            match(input,STRING,FOLLOW_STRING_in_dialect1971); if (failed) return retval;
            if ( backtracking==0 ) {
            STRING115_tree = (Object)adaptor.create(STRING115);
            adaptor.addChild(root_0, STRING115_tree);
            }
            if ( backtracking==0 ) {
              	emit(STRING115, DroolsEditorType.STRING_CONST );	
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end dialect

    public static class lock_on_active_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start lock_on_active
    // src/main/resources/org/drools/lang/DRL.g:800:1: lock_on_active : lock_on_active_key ( BOOL )? ;
    public final lock_on_active_return lock_on_active() throws RecognitionException {
        lock_on_active_return retval = new lock_on_active_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BOOL117=null;
        lock_on_active_key_return lock_on_active_key116 = null;


        Object BOOL117_tree=null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:801:2: ( lock_on_active_key ( BOOL )? )
            // src/main/resources/org/drools/lang/DRL.g:801:4: lock_on_active_key ( BOOL )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_lock_on_active_key_in_lock_on_active1989);
            lock_on_active_key116=lock_on_active_key();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(lock_on_active_key116.getTree(), root_0);
            if ( backtracking==0 ) {
              	emit(Location.LOCATION_RULE_HEADER_KEYWORD);	
            }
            // src/main/resources/org/drools/lang/DRL.g:801:73: ( BOOL )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==BOOL) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:801:73: BOOL
                    {
                    BOOL117=(Token)input.LT(1);
                    match(input,BOOL,FOLLOW_BOOL_in_lock_on_active1994); if (failed) return retval;
                    if ( backtracking==0 ) {
                    BOOL117_tree = (Object)adaptor.create(BOOL117);
                    adaptor.addChild(root_0, BOOL117_tree);
                    }

                    }
                    break;

            }

            if ( backtracking==0 ) {
              	emit(BOOL117, DroolsEditorType.BOOLEAN_CONST );	
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end lock_on_active

    public static class normal_lhs_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start normal_lhs_block
    // src/main/resources/org/drools/lang/DRL.g:805:1: normal_lhs_block : ( lhs )* -> ^( VT_AND_IMPLICIT ( lhs )* ) ;
    public final normal_lhs_block_return normal_lhs_block() throws RecognitionException {
        normal_lhs_block_return retval = new normal_lhs_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        lhs_return lhs118 = null;


        RewriteRuleSubtreeStream stream_lhs=new RewriteRuleSubtreeStream(adaptor,"rule lhs");
        try {
            // src/main/resources/org/drools/lang/DRL.g:806:2: ( ( lhs )* -> ^( VT_AND_IMPLICIT ( lhs )* ) )
            // src/main/resources/org/drools/lang/DRL.g:806:4: ( lhs )*
            {
            // src/main/resources/org/drools/lang/DRL.g:806:4: ( lhs )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==ID||LA41_0==LEFT_PAREN) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:806:4: lhs
            	    {
            	    pushFollow(FOLLOW_lhs_in_normal_lhs_block2009);
            	    lhs118=lhs();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_lhs.add(lhs118.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            // AST REWRITE
            // elements: lhs
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 807:2: -> ^( VT_AND_IMPLICIT ( lhs )* )
            {
                // src/main/resources/org/drools/lang/DRL.g:807:5: ^( VT_AND_IMPLICIT ( lhs )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(VT_AND_IMPLICIT, "VT_AND_IMPLICIT"), root_1);

                // src/main/resources/org/drools/lang/DRL.g:807:23: ( lhs )*
                while ( stream_lhs.hasNext() ) {
                    adaptor.addChild(root_1, stream_lhs.next());

                }
                stream_lhs.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end normal_lhs_block

    public static class lhs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start lhs
    // src/main/resources/org/drools/lang/DRL.g:810:1: lhs : lhs_or ;
    public final lhs_return lhs() throws RecognitionException {
        lhs_return retval = new lhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        lhs_or_return lhs_or119 = null;



        try {
            // src/main/resources/org/drools/lang/DRL.g:810:5: ( lhs_or )
            // src/main/resources/org/drools/lang/DRL.g:810:7: lhs_or
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_lhs_or_in_lhs2030);
            lhs_or119=lhs_or();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, lhs_or119.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end lhs

    public static class lhs_or_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start lhs_or
    // src/main/resources/org/drools/lang/DRL.g:813:1: lhs_or : ( ( LEFT_PAREN or_key )=> LEFT_PAREN or= or_key ( lhs_and )+ RIGHT_PAREN -> ^( VT_OR_PREFIX[$or.start] ( lhs_and )+ RIGHT_PAREN ) | ( lhs_and -> lhs_and ) ( ( or_key | DOUBLE_PIPE )=> (value= or_key | pipe= DOUBLE_PIPE ) lhs_and -> ^( VT_OR_INFIX[orToken] $lhs_or lhs_and ) )* );
    public final lhs_or_return lhs_or() throws RecognitionException {
        lhs_or_return retval = new lhs_or_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token pipe=null;
        Token LEFT_PAREN120=null;
        Token RIGHT_PAREN122=null;
        or_key_return or = null;

        or_key_return value = null;

        lhs_and_return lhs_and121 = null;

        lhs_and_return lhs_and123 = null;

        lhs_and_return lhs_and124 = null;


        Object pipe_tree=null;
        Object LEFT_PAREN120_tree=null;
        Object RIGHT_PAREN122_tree=null;
        RewriteRuleTokenStream stream_DOUBLE_PIPE=new RewriteRuleTokenStream(adaptor,"token DOUBLE_PIPE");
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleSubtreeStream stream_or_key=new RewriteRuleSubtreeStream(adaptor,"rule or_key");
        RewriteRuleSubtreeStream stream_lhs_and=new RewriteRuleSubtreeStream(adaptor,"rule lhs_and");

        	Token orToken = null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:816:3: ( ( LEFT_PAREN or_key )=> LEFT_PAREN or= or_key ( lhs_and )+ RIGHT_PAREN -> ^( VT_OR_PREFIX[$or.start] ( lhs_and )+ RIGHT_PAREN ) | ( lhs_and -> lhs_and ) ( ( or_key | DOUBLE_PIPE )=> (value= or_key | pipe= DOUBLE_PIPE ) lhs_and -> ^( VT_OR_INFIX[orToken] $lhs_or lhs_and ) )* )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==LEFT_PAREN) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==LEFT_PAREN) ) {
                    alt45=2;
                }
                else if ( (LA45_1==ID) ) {
                    switch ( input.LA(3) ) {
                    case DOT:
                    case COLON:
                    case LEFT_SQUARE:
                        {
                        alt45=2;
                        }
                        break;
                    case LEFT_PAREN:
                        {
                        int LA45_4 = input.LA(4);

                        if ( (synpred1()) ) {
                            alt45=1;
                        }
                        else if ( (true) ) {
                            alt45=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("813:1: lhs_or : ( ( LEFT_PAREN or_key )=> LEFT_PAREN or= or_key ( lhs_and )+ RIGHT_PAREN -> ^( VT_OR_PREFIX[$or.start] ( lhs_and )+ RIGHT_PAREN ) | ( lhs_and -> lhs_and ) ( ( or_key | DOUBLE_PIPE )=> (value= or_key | pipe= DOUBLE_PIPE ) lhs_and -> ^( VT_OR_INFIX[orToken] $lhs_or lhs_and ) )* );", 45, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case ID:
                        {
                        int LA45_5 = input.LA(4);

                        if ( (synpred1()) ) {
                            alt45=1;
                        }
                        else if ( (true) ) {
                            alt45=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("813:1: lhs_or : ( ( LEFT_PAREN or_key )=> LEFT_PAREN or= or_key ( lhs_and )+ RIGHT_PAREN -> ^( VT_OR_PREFIX[$or.start] ( lhs_and )+ RIGHT_PAREN ) | ( lhs_and -> lhs_and ) ( ( or_key | DOUBLE_PIPE )=> (value= or_key | pipe= DOUBLE_PIPE ) lhs_and -> ^( VT_OR_INFIX[orToken] $lhs_or lhs_and ) )* );", 45, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("813:1: lhs_or : ( ( LEFT_PAREN or_key )=> LEFT_PAREN or= or_key ( lhs_and )+ RIGHT_PAREN -> ^( VT_OR_PREFIX[$or.start] ( lhs_and )+ RIGHT_PAREN ) | ( lhs_and -> lhs_and ) ( ( or_key | DOUBLE_PIPE )=> (value= or_key | pipe= DOUBLE_PIPE ) lhs_and -> ^( VT_OR_INFIX[orToken] $lhs_or lhs_and ) )* );", 45, 3, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("813:1: lhs_or : ( ( LEFT_PAREN or_key )=> LEFT_PAREN or= or_key ( lhs_and )+ RIGHT_PAREN -> ^( VT_OR_PREFIX[$or.start] ( lhs_and )+ RIGHT_PAREN ) | ( lhs_and -> lhs_and ) ( ( or_key | DOUBLE_PIPE )=> (value= or_key | pipe= DOUBLE_PIPE ) lhs_and -> ^( VT_OR_INFIX[orToken] $lhs_or lhs_and ) )* );", 45, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA45_0==ID) ) {
                alt45=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("813:1: lhs_or : ( ( LEFT_PAREN or_key )=> LEFT_PAREN or= or_key ( lhs_and )+ RIGHT_PAREN -> ^( VT_OR_PREFIX[$or.start] ( lhs_and )+ RIGHT_PAREN ) | ( lhs_and -> lhs_and ) ( ( or_key | DOUBLE_PIPE )=> (value= or_key | pipe= DOUBLE_PIPE ) lhs_and -> ^( VT_OR_INFIX[orToken] $lhs_or lhs_and ) )* );", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:816:5: ( LEFT_PAREN or_key )=> LEFT_PAREN or= or_key ( lhs_and )+ RIGHT_PAREN
                    {
                    LEFT_PAREN120=(Token)input.LT(1);
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_lhs_or2054); if (failed) return retval;
                    if ( backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN120);

                    if ( backtracking==0 ) {
                      	emit(LEFT_PAREN120, DroolsEditorType.SYMBOL);	
                    }
                    pushFollow(FOLLOW_or_key_in_lhs_or2064);
                    or=or_key();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_or_key.add(or.getTree());
                    if ( backtracking==0 ) {
                      	emit(Location.LOCATION_LHS_BEGIN_OF_CONDITION_AND_OR);	
                    }
                    // src/main/resources/org/drools/lang/DRL.g:820:4: ( lhs_and )+
                    int cnt42=0;
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==ID||LA42_0==LEFT_PAREN) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // src/main/resources/org/drools/lang/DRL.g:820:4: lhs_and
                    	    {
                    	    pushFollow(FOLLOW_lhs_and_in_lhs_or2072);
                    	    lhs_and121=lhs_and();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) stream_lhs_and.add(lhs_and121.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt42 >= 1 ) break loop42;
                    	    if (backtracking>0) {failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(42, input);
                                throw eee;
                        }
                        cnt42++;
                    } while (true);

                    RIGHT_PAREN122=(Token)input.LT(1);
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_lhs_or2078); if (failed) return retval;
                    if ( backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN122);

                    if ( backtracking==0 ) {
                      	emit(RIGHT_PAREN122, DroolsEditorType.SYMBOL);	
                    }

                    // AST REWRITE
                    // elements: lhs_and, RIGHT_PAREN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 822:3: -> ^( VT_OR_PREFIX[$or.start] ( lhs_and )+ RIGHT_PAREN )
                    {
                        // src/main/resources/org/drools/lang/DRL.g:822:6: ^( VT_OR_PREFIX[$or.start] ( lhs_and )+ RIGHT_PAREN )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(VT_OR_PREFIX, ((Token)or.start)), root_1);

                        if ( !(stream_lhs_and.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_lhs_and.hasNext() ) {
                            adaptor.addChild(root_1, stream_lhs_and.next());

                        }
                        stream_lhs_and.reset();
                        adaptor.addChild(root_1, stream_RIGHT_PAREN.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // src/main/resources/org/drools/lang/DRL.g:823:4: ( lhs_and -> lhs_and ) ( ( or_key | DOUBLE_PIPE )=> (value= or_key | pipe= DOUBLE_PIPE ) lhs_and -> ^( VT_OR_INFIX[orToken] $lhs_or lhs_and ) )*
                    {
                    // src/main/resources/org/drools/lang/DRL.g:823:4: ( lhs_and -> lhs_and )
                    // src/main/resources/org/drools/lang/DRL.g:823:5: lhs_and
                    {
                    pushFollow(FOLLOW_lhs_and_in_lhs_or2101);
                    lhs_and123=lhs_and();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_lhs_and.add(lhs_and123.getTree());

                    // AST REWRITE
                    // elements: lhs_and
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 823:13: -> lhs_and
                    {
                        adaptor.addChild(root_0, stream_lhs_and.next());

                    }

                    }

                    }

                    // src/main/resources/org/drools/lang/DRL.g:824:3: ( ( or_key | DOUBLE_PIPE )=> (value= or_key | pipe= DOUBLE_PIPE ) lhs_and -> ^( VT_OR_INFIX[orToken] $lhs_or lhs_and ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==ID) ) {
                            int LA44_2 = input.LA(2);

                            if ( ((synpred2()&&(validateIdentifierKey(DroolsSoftKeywords.OR)))) ) {
                                alt44=1;
                            }


                        }
                        else if ( (LA44_0==DOUBLE_PIPE) ) {
                            int LA44_3 = input.LA(2);

                            if ( (synpred2()) ) {
                                alt44=1;
                            }


                        }


                        switch (alt44) {
                    	case 1 :
                    	    // src/main/resources/org/drools/lang/DRL.g:824:5: ( or_key | DOUBLE_PIPE )=> (value= or_key | pipe= DOUBLE_PIPE ) lhs_and
                    	    {
                    	    // src/main/resources/org/drools/lang/DRL.g:824:28: (value= or_key | pipe= DOUBLE_PIPE )
                    	    int alt43=2;
                    	    int LA43_0 = input.LA(1);

                    	    if ( (LA43_0==ID) && ((validateIdentifierKey(DroolsSoftKeywords.OR)))) {
                    	        alt43=1;
                    	    }
                    	    else if ( (LA43_0==DOUBLE_PIPE) ) {
                    	        alt43=2;
                    	    }
                    	    else {
                    	        if (backtracking>0) {failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("824:28: (value= or_key | pipe= DOUBLE_PIPE )", 43, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt43) {
                    	        case 1 :
                    	            // src/main/resources/org/drools/lang/DRL.g:824:29: value= or_key
                    	            {
                    	            pushFollow(FOLLOW_or_key_in_lhs_or2123);
                    	            value=or_key();
                    	            _fsp--;
                    	            if (failed) return retval;
                    	            if ( backtracking==0 ) stream_or_key.add(value.getTree());
                    	            if ( backtracking==0 ) {
                    	              orToken = ((Token)value.start);
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // src/main/resources/org/drools/lang/DRL.g:824:69: pipe= DOUBLE_PIPE
                    	            {
                    	            pipe=(Token)input.LT(1);
                    	            match(input,DOUBLE_PIPE,FOLLOW_DOUBLE_PIPE_in_lhs_or2130); if (failed) return retval;
                    	            if ( backtracking==0 ) stream_DOUBLE_PIPE.add(pipe);

                    	            if ( backtracking==0 ) {
                    	              orToken = pipe; emit(pipe, DroolsEditorType.SYMBOL);
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    if ( backtracking==0 ) {
                    	      	emit(Location.LOCATION_LHS_BEGIN_OF_CONDITION_AND_OR);	
                    	    }
                    	    pushFollow(FOLLOW_lhs_and_in_lhs_or2141);
                    	    lhs_and124=lhs_and();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) stream_lhs_and.add(lhs_and124.getTree());

                    	    // AST REWRITE
                    	    // elements: lhs_or, lhs_and
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    if ( backtracking==0 ) {
                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    	    root_0 = (Object)adaptor.nil();
                    	    // 827:3: -> ^( VT_OR_INFIX[orToken] $lhs_or lhs_and )
                    	    {
                    	        // src/main/resources/org/drools/lang/DRL.g:827:6: ^( VT_OR_INFIX[orToken] $lhs_or lhs_and )
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(VT_OR_INFIX, orToken), root_1);

                    	        adaptor.addChild(root_1, stream_retval.next());
                    	        adaptor.addChild(root_1, stream_lhs_and.next());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }

                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end lhs_or

    public static class lhs_and_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start lhs_and
    // src/main/resources/org/drools/lang/DRL.g:830:1: lhs_and : ( ( LEFT_PAREN and_key )=> LEFT_PAREN and= and_key ( lhs_unary )+ RIGHT_PAREN -> ^( VT_AND_PREFIX[$and.start] ( lhs_unary )+ RIGHT_PAREN ) | ( lhs_unary -> lhs_unary ) ( ( and_key | DOUBLE_AMPER )=> (value= and_key | amper= DOUBLE_AMPER ) lhs_unary -> ^( VT_AND_INFIX[andToken] $lhs_and lhs_unary ) )* );
    public final lhs_and_return lhs_and() throws RecognitionException {
        lhs_and_return retval = new lhs_and_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token amper=null;
        Token LEFT_PAREN125=null;
        Token RIGHT_PAREN127=null;
        and_key_return and = null;

        and_key_return value = null;

        lhs_unary_return lhs_unary126 = null;

        lhs_unary_return lhs_unary128 = null;

        lhs_unary_return lhs_unary129 = null;


        Object amper_tree=null;
        Object LEFT_PAREN125_tree=null;
        Object RIGHT_PAREN127_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_DOUBLE_AMPER=new RewriteRuleTokenStream(adaptor,"token DOUBLE_AMPER");
        RewriteRuleSubtreeStream stream_lhs_unary=new RewriteRuleSubtreeStream(adaptor,"rule lhs_unary");
        RewriteRuleSubtreeStream stream_and_key=new RewriteRuleSubtreeStream(adaptor,"rule and_key");

        	Token andToken = null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:833:3: ( ( LEFT_PAREN and_key )=> LEFT_PAREN and= and_key ( lhs_unary )+ RIGHT_PAREN -> ^( VT_AND_PREFIX[$and.start] ( lhs_unary )+ RIGHT_PAREN ) | ( lhs_unary -> lhs_unary ) ( ( and_key | DOUBLE_AMPER )=> (value= and_key | amper= DOUBLE_AMPER ) lhs_unary -> ^( VT_AND_INFIX[andToken] $lhs_and lhs_unary ) )* )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==LEFT_PAREN) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==ID) ) {
                    switch ( input.LA(3) ) {
                    case DOT:
                    case COLON:
                    case LEFT_SQUARE:
                        {
                        alt49=2;
                        }
                        break;
                    case LEFT_PAREN:
                        {
                        switch ( input.LA(4) ) {
                        case LEFT_PAREN:
                            {
                            int LA49_6 = input.LA(5);

                            if ( (synpred3()) ) {
                                alt49=1;
                            }
                            else if ( (true) ) {
                                alt49=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("830:1: lhs_and : ( ( LEFT_PAREN and_key )=> LEFT_PAREN and= and_key ( lhs_unary )+ RIGHT_PAREN -> ^( VT_AND_PREFIX[$and.start] ( lhs_unary )+ RIGHT_PAREN ) | ( lhs_unary -> lhs_unary ) ( ( and_key | DOUBLE_AMPER )=> (value= and_key | amper= DOUBLE_AMPER ) lhs_unary -> ^( VT_AND_INFIX[andToken] $lhs_and lhs_unary ) )* );", 49, 6, input);

                                throw nvae;
                            }
                            }
                            break;
                        case ID:
                            {
                            int LA49_7 = input.LA(5);

                            if ( (synpred3()) ) {
                                alt49=1;
                            }
                            else if ( (true) ) {
                                alt49=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("830:1: lhs_and : ( ( LEFT_PAREN and_key )=> LEFT_PAREN and= and_key ( lhs_unary )+ RIGHT_PAREN -> ^( VT_AND_PREFIX[$and.start] ( lhs_unary )+ RIGHT_PAREN ) | ( lhs_unary -> lhs_unary ) ( ( and_key | DOUBLE_AMPER )=> (value= and_key | amper= DOUBLE_AMPER ) lhs_unary -> ^( VT_AND_INFIX[andToken] $lhs_and lhs_unary ) )* );", 49, 7, input);

                                throw nvae;
                            }
                            }
                            break;
                        case VT_COMPILATION_UNIT:
                        case VT_FUNCTION_IMPORT:
                        case VT_FACT:
                        case VT_CONSTRAINTS:
                        case VT_LABEL:
                        case VT_QUERY_ID:
                        case VT_TEMPLATE_ID:
                        case VT_TYPE_DECLARE_ID:
                        case VT_RULE_ID:
                        case VT_ENTRYPOINT_ID:
                        case VT_SLOT_ID:
                        case VT_SLOT:
                        case VT_RULE_ATTRIBUTES:
                        case VT_RHS_CHUNK:
                        case VT_CURLY_CHUNK:
                        case VT_SQUARE_CHUNK:
                        case VT_PAREN_CHUNK:
                        case VT_BEHAVIOR:
                        case VT_AND_IMPLICIT:
                        case VT_AND_PREFIX:
                        case VT_OR_PREFIX:
                        case VT_AND_INFIX:
                        case VT_OR_INFIX:
                        case VT_ACCUMULATE_INIT_CLAUSE:
                        case VT_ACCUMULATE_ID_CLAUSE:
                        case VT_FROM_SOURCE:
                        case VT_EXPRESSION_CHAIN:
                        case VT_PATTERN:
                        case VT_FACT_BINDING:
                        case VT_FACT_OR:
                        case VT_BIND_FIELD:
                        case VT_FIELD:
                        case VT_ACCESSOR_PATH:
                        case VT_ACCESSOR_ELEMENT:
                        case VT_DATA_TYPE:
                        case VT_PATTERN_TYPE:
                        case VT_PACKAGE_ID:
                        case VT_IMPORT_ID:
                        case VT_GLOBAL_ID:
                        case VT_FUNCTION_ID:
                        case VT_PARAM_LIST:
                        case VK_DATE_EFFECTIVE:
                        case VK_DATE_EXPIRES:
                        case VK_LOCK_ON_ACTIVE:
                        case VK_NO_LOOP:
                        case VK_AUTO_FOCUS:
                        case VK_ACTIVATION_GROUP:
                        case VK_AGENDA_GROUP:
                        case VK_RULEFLOW_GROUP:
                        case VK_DURATION:
                        case VK_DIALECT:
                        case VK_SALIENCE:
                        case VK_ENABLED:
                        case VK_ATTRIBUTES:
                        case VK_RULE:
                        case VK_IMPORT:
                        case VK_PACKAGE:
                        case VK_TEMPLATE:
                        case VK_QUERY:
                        case VK_DECLARE:
                        case VK_FUNCTION:
                        case VK_GLOBAL:
                        case VK_EVAL:
                        case VK_CONTAINS:
                        case VK_MATCHES:
                        case VK_EXCLUDES:
                        case VK_SOUNDSLIKE:
                        case VK_MEMBEROF:
                        case VK_ENTRY_POINT:
                        case VK_NOT:
                        case VK_IN:
                        case VK_OR:
                        case VK_AND:
                        case VK_EXISTS:
                        case VK_FORALL:
                        case VK_ACTION:
                        case VK_REVERSE:
                        case VK_RESULT:
                        case SEMICOLON:
                        case DOT:
                        case DOT_STAR:
                        case END:
                        case STRING:
                        case COMMA:
                        case RIGHT_PAREN:
                        case AT:
                        case COLON:
                        case EQUALS:
                        case WHEN:
                        case BOOL:
                        case INT:
                        case DOUBLE_PIPE:
                        case DOUBLE_AMPER:
                        case FROM:
                        case OVER:
                        case ACCUMULATE:
                        case INIT:
                        case COLLECT:
                        case ARROW:
                        case EQUAL:
                        case GREATER:
                        case GREATER_EQUAL:
                        case LESS:
                        case LESS_EQUAL:
                        case NOT_EQUAL:
                        case GRAVE_ACCENT:
                        case FLOAT:
                        case NULL:
                        case LEFT_SQUARE:
                        case RIGHT_SQUARE:
                        case THEN:
                        case LEFT_CURLY:
                        case RIGHT_CURLY:
                        case MISC:
                        case EOL:
                        case WS:
                        case EscapeSequence:
                        case HexDigit:
                        case UnicodeEscape:
                        case OctalEscape:
                        case SH_STYLE_SINGLE_LINE_COMMENT:
                        case C_STYLE_SINGLE_LINE_COMMENT:
                        case MULTI_LINE_COMMENT:
                            {
                            alt49=2;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("830:1: lhs_and : ( ( LEFT_PAREN and_key )=> LEFT_PAREN and= and_key ( lhs_unary )+ RIGHT_PAREN -> ^( VT_AND_PREFIX[$and.start] ( lhs_unary )+ RIGHT_PAREN ) | ( lhs_unary -> lhs_unary ) ( ( and_key | DOUBLE_AMPER )=> (value= and_key | amper= DOUBLE_AMPER ) lhs_unary -> ^( VT_AND_INFIX[andToken] $lhs_and lhs_unary ) )* );", 49, 4, input);

                            throw nvae;
                        }

                        }
                        break;
                    case ID:
                        {
                        int LA49_5 = input.LA(4);

                        if ( (synpred3()) ) {
                            alt49=1;
                        }
                        else if ( (true) ) {
                            alt49=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("830:1: lhs_and : ( ( LEFT_PAREN and_key )=> LEFT_PAREN and= and_key ( lhs_unary )+ RIGHT_PAREN -> ^( VT_AND_PREFIX[$and.start] ( lhs_unary )+ RIGHT_PAREN ) | ( lhs_unary -> lhs_unary ) ( ( and_key | DOUBLE_AMPER )=> (value= and_key | amper= DOUBLE_AMPER ) lhs_unary -> ^( VT_AND_INFIX[andToken] $lhs_and lhs_unary ) )* );", 49, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("830:1: lhs_and : ( ( LEFT_PAREN and_key )=> LEFT_PAREN and= and_key ( lhs_unary )+ RIGHT_PAREN -> ^( VT_AND_PREFIX[$and.start] ( lhs_unary )+ RIGHT_PAREN ) | ( lhs_unary -> lhs_unary ) ( ( and_key | DOUBLE_AMPER )=> (value= and_key | amper= DOUBLE_AMPER ) lhs_unary -> ^( VT_AND_INFIX[andToken] $lhs_and lhs_unary ) )* );", 49, 3, input);

                        throw nvae;
                    }

                }
                else if ( (LA49_1==LEFT_PAREN) ) {
                    alt49=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("830:1: lhs_and : ( ( LEFT_PAREN and_key )=> LEFT_PAREN and= and_key ( lhs_unary )+ RIGHT_PAREN -> ^( VT_AND_PREFIX[$and.start] ( lhs_unary )+ RIGHT_PAREN ) | ( lhs_unary -> lhs_unary ) ( ( and_key | DOUBLE_AMPER )=> (value= and_key | amper= DOUBLE_AMPER ) lhs_unary -> ^( VT_AND_INFIX[andToken] $lhs_and lhs_unary ) )* );", 49, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA49_0==ID) ) {
                alt49=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("830:1: lhs_and : ( ( LEFT_PAREN and_key )=> LEFT_PAREN and= and_key ( lhs_unary )+ RIGHT_PAREN -> ^( VT_AND_PREFIX[$and.start] ( lhs_unary )+ RIGHT_PAREN ) | ( lhs_unary -> lhs_unary ) ( ( and_key | DOUBLE_AMPER )=> (value= and_key | amper= DOUBLE_AMPER ) lhs_unary -> ^( VT_AND_INFIX[andToken] $lhs_and lhs_unary ) )* );", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:833:5: ( LEFT_PAREN and_key )=> LEFT_PAREN and= and_key ( lhs_unary )+ RIGHT_PAREN
                    {
                    LEFT_PAREN125=(Token)input.LT(1);
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_lhs_and2182); if (failed) return retval;
                    if ( backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN125);

                    if ( backtracking==0 ) {
                      	emit(LEFT_PAREN125, DroolsEditorType.SYMBOL);	
                    }
                    pushFollow(FOLLOW_and_key_in_lhs_and2192);
                    and=and_key();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_and_key.add(and.getTree());
                    if ( backtracking==0 ) {
                      	emit(Location.LOCATION_LHS_BEGIN_OF_CONDITION_AND_OR);	
                    }
                    // src/main/resources/org/drools/lang/DRL.g:837:4: ( lhs_unary )+
                    int cnt46=0;
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==ID||LA46_0==LEFT_PAREN) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // src/main/resources/org/drools/lang/DRL.g:837:4: lhs_unary
                    	    {
                    	    pushFollow(FOLLOW_lhs_unary_in_lhs_and2200);
                    	    lhs_unary126=lhs_unary();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) stream_lhs_unary.add(lhs_unary126.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt46 >= 1 ) break loop46;
                    	    if (backtracking>0) {failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(46, input);
                                throw eee;
                        }
                        cnt46++;
                    } while (true);

                    RIGHT_PAREN127=(Token)input.LT(1);
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_lhs_and2206); if (failed) return retval;
                    if ( backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN127);

                    if ( backtracking==0 ) {
                      	emit(RIGHT_PAREN127, DroolsEditorType.SYMBOL);	
                    }

                    // AST REWRITE
                    // elements: lhs_unary, RIGHT_PAREN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 839:3: -> ^( VT_AND_PREFIX[$and.start] ( lhs_unary )+ RIGHT_PAREN )
                    {
                        // src/main/resources/org/drools/lang/DRL.g:839:6: ^( VT_AND_PREFIX[$and.start] ( lhs_unary )+ RIGHT_PAREN )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(VT_AND_PREFIX, ((Token)and.start)), root_1);

                        if ( !(stream_lhs_unary.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_lhs_unary.hasNext() ) {
                            adaptor.addChild(root_1, stream_lhs_unary.next());

                        }
                        stream_lhs_unary.reset();
                        adaptor.addChild(root_1, stream_RIGHT_PAREN.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // src/main/resources/org/drools/lang/DRL.g:840:4: ( lhs_unary -> lhs_unary ) ( ( and_key | DOUBLE_AMPER )=> (value= and_key | amper= DOUBLE_AMPER ) lhs_unary -> ^( VT_AND_INFIX[andToken] $lhs_and lhs_unary ) )*
                    {
                    // src/main/resources/org/drools/lang/DRL.g:840:4: ( lhs_unary -> lhs_unary )
                    // src/main/resources/org/drools/lang/DRL.g:840:5: lhs_unary
                    {
                    pushFollow(FOLLOW_lhs_unary_in_lhs_and2230);
                    lhs_unary128=lhs_unary();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_lhs_unary.add(lhs_unary128.getTree());

                    // AST REWRITE
                    // elements: lhs_unary
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 840:15: -> lhs_unary
                    {
                        adaptor.addChild(root_0, stream_lhs_unary.next());

                    }

                    }

                    }

                    // src/main/resources/org/drools/lang/DRL.g:841:3: ( ( and_key | DOUBLE_AMPER )=> (value= and_key | amper= DOUBLE_AMPER ) lhs_unary -> ^( VT_AND_INFIX[andToken] $lhs_and lhs_unary ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==ID) ) {
                            int LA48_2 = input.LA(2);

                            if ( ((synpred4()&&(validateIdentifierKey(DroolsSoftKeywords.AND)))) ) {
                                alt48=1;
                            }


                        }
                        else if ( (LA48_0==DOUBLE_AMPER) ) {
                            int LA48_3 = input.LA(2);

                            if ( (synpred4()) ) {
                                alt48=1;
                            }


                        }


                        switch (alt48) {
                    	case 1 :
                    	    // src/main/resources/org/drools/lang/DRL.g:841:5: ( and_key | DOUBLE_AMPER )=> (value= and_key | amper= DOUBLE_AMPER ) lhs_unary
                    	    {
                    	    // src/main/resources/org/drools/lang/DRL.g:841:30: (value= and_key | amper= DOUBLE_AMPER )
                    	    int alt47=2;
                    	    int LA47_0 = input.LA(1);

                    	    if ( (LA47_0==ID) && ((validateIdentifierKey(DroolsSoftKeywords.AND)))) {
                    	        alt47=1;
                    	    }
                    	    else if ( (LA47_0==DOUBLE_AMPER) ) {
                    	        alt47=2;
                    	    }
                    	    else {
                    	        if (backtracking>0) {failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("841:30: (value= and_key | amper= DOUBLE_AMPER )", 47, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt47) {
                    	        case 1 :
                    	            // src/main/resources/org/drools/lang/DRL.g:841:31: value= and_key
                    	            {
                    	            pushFollow(FOLLOW_and_key_in_lhs_and2252);
                    	            value=and_key();
                    	            _fsp--;
                    	            if (failed) return retval;
                    	            if ( backtracking==0 ) stream_and_key.add(value.getTree());
                    	            if ( backtracking==0 ) {
                    	              andToken = ((Token)value.start);
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // src/main/resources/org/drools/lang/DRL.g:841:73: amper= DOUBLE_AMPER
                    	            {
                    	            amper=(Token)input.LT(1);
                    	            match(input,DOUBLE_AMPER,FOLLOW_DOUBLE_AMPER_in_lhs_and2259); if (failed) return retval;
                    	            if ( backtracking==0 ) stream_DOUBLE_AMPER.add(amper);

                    	            if ( backtracking==0 ) {
                    	              andToken = amper; emit(amper, DroolsEditorType.SYMBOL);
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    if ( backtracking==0 ) {
                    	      	emit(Location.LOCATION_LHS_BEGIN_OF_CONDITION_AND_OR);	
                    	    }
                    	    pushFollow(FOLLOW_lhs_unary_in_lhs_and2270);
                    	    lhs_unary129=lhs_unary();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) stream_lhs_unary.add(lhs_unary129.getTree());

                    	    // AST REWRITE
                    	    // elements: lhs_and, lhs_unary
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    if ( backtracking==0 ) {
                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    	    root_0 = (Object)adaptor.nil();
                    	    // 844:3: -> ^( VT_AND_INFIX[andToken] $lhs_and lhs_unary )
                    	    {
                    	        // src/main/resources/org/drools/lang/DRL.g:844:6: ^( VT_AND_INFIX[andToken] $lhs_and lhs_unary )
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(VT_AND_INFIX, andToken), root_1);

                    	        adaptor.addChild(root_1, stream_retval.next());
                    	        adaptor.addChild(root_1, stream_lhs_unary.next());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }

                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end lhs_and

    public static class lhs_unary_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start lhs_unary
    // src/main/resources/org/drools/lang/DRL.g:847:1: lhs_unary : ( lhs_exist | {...}? => lhs_not_binding | lhs_not | lhs_eval | lhs_forall | LEFT_PAREN lhs_or RIGHT_PAREN | pattern_source ) ( ( SEMICOLON )=> SEMICOLON )? ;
    public final lhs_unary_return lhs_unary() throws RecognitionException {
        lhs_unary_return retval = new lhs_unary_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_PAREN135=null;
        Token RIGHT_PAREN137=null;
        Token SEMICOLON139=null;
        lhs_exist_return lhs_exist130 = null;

        lhs_not_binding_return lhs_not_binding131 = null;

        lhs_not_return lhs_not132 = null;

        lhs_eval_return lhs_eval133 = null;

        lhs_forall_return lhs_forall134 = null;

        lhs_or_return lhs_or136 = null;

        pattern_source_return pattern_source138 = null;


        Object LEFT_PAREN135_tree=null;
        Object RIGHT_PAREN137_tree=null;
        Object SEMICOLON139_tree=null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:848:2: ( ( lhs_exist | {...}? => lhs_not_binding | lhs_not | lhs_eval | lhs_forall | LEFT_PAREN lhs_or RIGHT_PAREN | pattern_source ) ( ( SEMICOLON )=> SEMICOLON )? )
            // src/main/resources/org/drools/lang/DRL.g:848:4: ( lhs_exist | {...}? => lhs_not_binding | lhs_not | lhs_eval | lhs_forall | LEFT_PAREN lhs_or RIGHT_PAREN | pattern_source ) ( ( SEMICOLON )=> SEMICOLON )?
            {
            root_0 = (Object)adaptor.nil();

            // src/main/resources/org/drools/lang/DRL.g:848:4: ( lhs_exist | {...}? => lhs_not_binding | lhs_not | lhs_eval | lhs_forall | LEFT_PAREN lhs_or RIGHT_PAREN | pattern_source )
            int alt50=7;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==ID) ) {
                int LA50_1 = input.LA(2);

                if ( ((validateIdentifierKey(DroolsSoftKeywords.EXISTS))) ) {
                    alt50=1;
                }
                else if ( ((validateNotWithBinding()&&(validateIdentifierKey(DroolsSoftKeywords.NOT)))) ) {
                    alt50=2;
                }
                else if ( ((validateIdentifierKey(DroolsSoftKeywords.NOT))) ) {
                    alt50=3;
                }
                else if ( ((validateIdentifierKey(DroolsSoftKeywords.EVAL))) ) {
                    alt50=4;
                }
                else if ( ((validateIdentifierKey(DroolsSoftKeywords.FORALL))) ) {
                    alt50=5;
                }
                else if ( (true) ) {
                    alt50=7;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("848:4: ( lhs_exist | {...}? => lhs_not_binding | lhs_not | lhs_eval | lhs_forall | LEFT_PAREN lhs_or RIGHT_PAREN | pattern_source )", 50, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA50_0==LEFT_PAREN) ) {
                alt50=6;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("848:4: ( lhs_exist | {...}? => lhs_not_binding | lhs_not | lhs_eval | lhs_forall | LEFT_PAREN lhs_or RIGHT_PAREN | pattern_source )", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:848:6: lhs_exist
                    {
                    pushFollow(FOLLOW_lhs_exist_in_lhs_unary2301);
                    lhs_exist130=lhs_exist();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, lhs_exist130.getTree());

                    }
                    break;
                case 2 :
                    // src/main/resources/org/drools/lang/DRL.g:849:4: {...}? => lhs_not_binding
                    {
                    if ( !(validateNotWithBinding()) ) {
                        if (backtracking>0) {failed=true; return retval;}
                        throw new FailedPredicateException(input, "lhs_unary", "validateNotWithBinding()");
                    }
                    pushFollow(FOLLOW_lhs_not_binding_in_lhs_unary2309);
                    lhs_not_binding131=lhs_not_binding();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, lhs_not_binding131.getTree());

                    }
                    break;
                case 3 :
                    // src/main/resources/org/drools/lang/DRL.g:850:5: lhs_not
                    {
                    pushFollow(FOLLOW_lhs_not_in_lhs_unary2315);
                    lhs_not132=lhs_not();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, lhs_not132.getTree());

                    }
                    break;
                case 4 :
                    // src/main/resources/org/drools/lang/DRL.g:851:5: lhs_eval
                    {
                    pushFollow(FOLLOW_lhs_eval_in_lhs_unary2321);
                    lhs_eval133=lhs_eval();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, lhs_eval133.getTree());

                    }
                    break;
                case 5 :
                    // src/main/resources/org/drools/lang/DRL.g:852:5: lhs_forall
                    {
                    pushFollow(FOLLOW_lhs_forall_in_lhs_unary2327);
                    lhs_forall134=lhs_forall();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, lhs_forall134.getTree());

                    }
                    break;
                case 6 :
                    // src/main/resources/org/drools/lang/DRL.g:853:5: LEFT_PAREN lhs_or RIGHT_PAREN
                    {
                    LEFT_PAREN135=(Token)input.LT(1);
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_lhs_unary2333); if (failed) return retval;
                    if ( backtracking==0 ) {
                      	emit(LEFT_PAREN135, DroolsEditorType.SYMBOL); emit(Location.LOCATION_LHS_BEGIN_OF_CONDITION );	
                    }
                    pushFollow(FOLLOW_lhs_or_in_lhs_unary2344);
                    lhs_or136=lhs_or();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, lhs_or136.getTree());
                    RIGHT_PAREN137=(Token)input.LT(1);
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_lhs_unary2350); if (failed) return retval;
                    if ( backtracking==0 ) {
                    RIGHT_PAREN137_tree = (Object)adaptor.create(RIGHT_PAREN137);
                    adaptor.addChild(root_0, RIGHT_PAREN137_tree);
                    }
                    if ( backtracking==0 ) {
                      	emit(RIGHT_PAREN137, DroolsEditorType.SYMBOL);	
                    }

                    }
                    break;
                case 7 :
                    // src/main/resources/org/drools/lang/DRL.g:856:5: pattern_source
                    {
                    pushFollow(FOLLOW_pattern_source_in_lhs_unary2358);
                    pattern_source138=pattern_source();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, pattern_source138.getTree());

                    }
                    break;

            }

            // src/main/resources/org/drools/lang/DRL.g:858:3: ( ( SEMICOLON )=> SEMICOLON )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==SEMICOLON) ) {
                int LA51_1 = input.LA(2);

                if ( (synpred5()) ) {
                    alt51=1;
                }
            }
            switch (alt51) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:858:4: ( SEMICOLON )=> SEMICOLON
                    {
                    SEMICOLON139=(Token)input.LT(1);
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_lhs_unary2372); if (failed) return retval;
                    if ( backtracking==0 ) {
                      	emit(SEMICOLON139, DroolsEditorType.SYMBOL);	
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end lhs_unary

    public static class lhs_exist_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start lhs_exist
    // src/main/resources/org/drools/lang/DRL.g:861:1: lhs_exist : exists_key ( ( LEFT_PAREN ( or_key | and_key ) )=> lhs_or | LEFT_PAREN lhs_or RIGHT_PAREN | lhs_pattern ) -> ^( exists_key ( lhs_or )? ( lhs_pattern )? ( RIGHT_PAREN )? ) ;
    public final lhs_exist_return lhs_exist() throws RecognitionException {
        lhs_exist_return retval = new lhs_exist_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_PAREN142=null;
        Token RIGHT_PAREN144=null;
        exists_key_return exists_key140 = null;

        lhs_or_return lhs_or141 = null;

        lhs_or_return lhs_or143 = null;

        lhs_pattern_return lhs_pattern145 = null;


        Object LEFT_PAREN142_tree=null;
        Object RIGHT_PAREN144_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleSubtreeStream stream_lhs_pattern=new RewriteRuleSubtreeStream(adaptor,"rule lhs_pattern");
        RewriteRuleSubtreeStream stream_lhs_or=new RewriteRuleSubtreeStream(adaptor,"rule lhs_or");
        RewriteRuleSubtreeStream stream_exists_key=new RewriteRuleSubtreeStream(adaptor,"rule exists_key");
        try {
            // src/main/resources/org/drools/lang/DRL.g:862:2: ( exists_key ( ( LEFT_PAREN ( or_key | and_key ) )=> lhs_or | LEFT_PAREN lhs_or RIGHT_PAREN | lhs_pattern ) -> ^( exists_key ( lhs_or )? ( lhs_pattern )? ( RIGHT_PAREN )? ) )
            // src/main/resources/org/drools/lang/DRL.g:862:4: exists_key ( ( LEFT_PAREN ( or_key | and_key ) )=> lhs_or | LEFT_PAREN lhs_or RIGHT_PAREN | lhs_pattern )
            {
            pushFollow(FOLLOW_exists_key_in_lhs_exist2388);
            exists_key140=exists_key();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_exists_key.add(exists_key140.getTree());
            if ( backtracking==0 ) {
              	emit(Location.LOCATION_LHS_BEGIN_OF_CONDITION_EXISTS);	
            }
            // src/main/resources/org/drools/lang/DRL.g:864:10: ( ( LEFT_PAREN ( or_key | and_key ) )=> lhs_or | LEFT_PAREN lhs_or RIGHT_PAREN | lhs_pattern )
            int alt52=3;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:864:12: ( LEFT_PAREN ( or_key | and_key ) )=> lhs_or
                    {
                    pushFollow(FOLLOW_lhs_or_in_lhs_exist2415);
                    lhs_or141=lhs_or();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_lhs_or.add(lhs_or141.getTree());

                    }
                    break;
                case 2 :
                    // src/main/resources/org/drools/lang/DRL.g:865:5: LEFT_PAREN lhs_or RIGHT_PAREN
                    {
                    LEFT_PAREN142=(Token)input.LT(1);
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_lhs_exist2422); if (failed) return retval;
                    if ( backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN142);

                    if ( backtracking==0 ) {
                      	emit(LEFT_PAREN142, DroolsEditorType.SYMBOL);	
                    }
                    pushFollow(FOLLOW_lhs_or_in_lhs_exist2430);
                    lhs_or143=lhs_or();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_lhs_or.add(lhs_or143.getTree());
                    RIGHT_PAREN144=(Token)input.LT(1);
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_lhs_exist2437); if (failed) return retval;
                    if ( backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN144);

                    if ( backtracking==0 ) {
                      	emit(RIGHT_PAREN144, DroolsEditorType.SYMBOL);	
                    }

                    }
                    break;
                case 3 :
                    // src/main/resources/org/drools/lang/DRL.g:868:12: lhs_pattern
                    {
                    pushFollow(FOLLOW_lhs_pattern_in_lhs_exist2452);
                    lhs_pattern145=lhs_pattern();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_lhs_pattern.add(lhs_pattern145.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: lhs_pattern, lhs_or, RIGHT_PAREN, exists_key
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 870:10: -> ^( exists_key ( lhs_or )? ( lhs_pattern )? ( RIGHT_PAREN )? )
            {
                // src/main/resources/org/drools/lang/DRL.g:870:13: ^( exists_key ( lhs_or )? ( lhs_pattern )? ( RIGHT_PAREN )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_exists_key.nextNode(), root_1);

                // src/main/resources/org/drools/lang/DRL.g:870:26: ( lhs_or )?
                if ( stream_lhs_or.hasNext() ) {
                    adaptor.addChild(root_1, stream_lhs_or.next());

                }
                stream_lhs_or.reset();
                // src/main/resources/org/drools/lang/DRL.g:870:34: ( lhs_pattern )?
                if ( stream_lhs_pattern.hasNext() ) {
                    adaptor.addChild(root_1, stream_lhs_pattern.next());

                }
                stream_lhs_pattern.reset();
                // src/main/resources/org/drools/lang/DRL.g:870:47: ( RIGHT_PAREN )?
                if ( stream_RIGHT_PAREN.hasNext() ) {
                    adaptor.addChild(root_1, stream_RIGHT_PAREN.next());

                }
                stream_RIGHT_PAREN.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end lhs_exist

    public static class lhs_not_binding_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start lhs_not_binding
    // src/main/resources/org/drools/lang/DRL.g:873:1: lhs_not_binding : not_key fact_binding -> ^( not_key ^( VT_PATTERN fact_binding ) ) ;
    public final lhs_not_binding_return lhs_not_binding() throws RecognitionException {
        lhs_not_binding_return retval = new lhs_not_binding_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        not_key_return not_key146 = null;

        fact_binding_return fact_binding147 = null;


        RewriteRuleSubtreeStream stream_fact_binding=new RewriteRuleSubtreeStream(adaptor,"rule fact_binding");
        RewriteRuleSubtreeStream stream_not_key=new RewriteRuleSubtreeStream(adaptor,"rule not_key");
        try {
            // src/main/resources/org/drools/lang/DRL.g:874:2: ( not_key fact_binding -> ^( not_key ^( VT_PATTERN fact_binding ) ) )
            // src/main/resources/org/drools/lang/DRL.g:874:4: not_key fact_binding
            {
            pushFollow(FOLLOW_not_key_in_lhs_not_binding2498);
            not_key146=not_key();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_not_key.add(not_key146.getTree());
            pushFollow(FOLLOW_fact_binding_in_lhs_not_binding2500);
            fact_binding147=fact_binding();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_fact_binding.add(fact_binding147.getTree());

            // AST REWRITE
            // elements: fact_binding, not_key
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 875:2: -> ^( not_key ^( VT_PATTERN fact_binding ) )
            {
                // src/main/resources/org/drools/lang/DRL.g:875:5: ^( not_key ^( VT_PATTERN fact_binding ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_not_key.nextNode(), root_1);

                // src/main/resources/org/drools/lang/DRL.g:875:15: ^( VT_PATTERN fact_binding )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(VT_PATTERN, "VT_PATTERN"), root_2);

                adaptor.addChild(root_2, stream_fact_binding.next());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end lhs_not_binding

    public static class lhs_not_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start lhs_not
    // src/main/resources/org/drools/lang/DRL.g:878:1: lhs_not : not_key ( ( LEFT_PAREN ( or_key | and_key ) )=> lhs_or | LEFT_PAREN lhs_or RIGHT_PAREN | lhs_pattern ) -> ^( not_key ( lhs_or )? ( lhs_pattern )? ( RIGHT_PAREN )? ) ;
    public final lhs_not_return lhs_not() throws RecognitionException {
        lhs_not_return retval = new lhs_not_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_PAREN150=null;
        Token RIGHT_PAREN152=null;
        not_key_return not_key148 = null;

        lhs_or_return lhs_or149 = null;

        lhs_or_return lhs_or151 = null;

        lhs_pattern_return lhs_pattern153 = null;


        Object LEFT_PAREN150_tree=null;
        Object RIGHT_PAREN152_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleSubtreeStream stream_not_key=new RewriteRuleSubtreeStream(adaptor,"rule not_key");
        RewriteRuleSubtreeStream stream_lhs_pattern=new RewriteRuleSubtreeStream(adaptor,"rule lhs_pattern");
        RewriteRuleSubtreeStream stream_lhs_or=new RewriteRuleSubtreeStream(adaptor,"rule lhs_or");
        try {
            // src/main/resources/org/drools/lang/DRL.g:878:9: ( not_key ( ( LEFT_PAREN ( or_key | and_key ) )=> lhs_or | LEFT_PAREN lhs_or RIGHT_PAREN | lhs_pattern ) -> ^( not_key ( lhs_or )? ( lhs_pattern )? ( RIGHT_PAREN )? ) )
            // src/main/resources/org/drools/lang/DRL.g:878:11: not_key ( ( LEFT_PAREN ( or_key | and_key ) )=> lhs_or | LEFT_PAREN lhs_or RIGHT_PAREN | lhs_pattern )
            {
            pushFollow(FOLLOW_not_key_in_lhs_not2523);
            not_key148=not_key();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_not_key.add(not_key148.getTree());
            if ( backtracking==0 ) {
              	emit(Location.LOCATION_LHS_BEGIN_OF_CONDITION_NOT);	
            }
            // src/main/resources/org/drools/lang/DRL.g:880:3: ( ( LEFT_PAREN ( or_key | and_key ) )=> lhs_or | LEFT_PAREN lhs_or RIGHT_PAREN | lhs_pattern )
            int alt53=3;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:880:5: ( LEFT_PAREN ( or_key | and_key ) )=> lhs_or
                    {
                    if ( backtracking==0 ) {
                      	emit(Location.LOCATION_LHS_BEGIN_OF_CONDITION );	
                    }
                    pushFollow(FOLLOW_lhs_or_in_lhs_not2545);
                    lhs_or149=lhs_or();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_lhs_or.add(lhs_or149.getTree());

                    }
                    break;
                case 2 :
                    // src/main/resources/org/drools/lang/DRL.g:881:5: LEFT_PAREN lhs_or RIGHT_PAREN
                    {
                    LEFT_PAREN150=(Token)input.LT(1);
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_lhs_not2552); if (failed) return retval;
                    if ( backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN150);

                    if ( backtracking==0 ) {
                      	emit(LEFT_PAREN150, DroolsEditorType.SYMBOL); emit(Location.LOCATION_LHS_BEGIN_OF_CONDITION );	
                    }
                    pushFollow(FOLLOW_lhs_or_in_lhs_not2561);
                    lhs_or151=lhs_or();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_lhs_or.add(lhs_or151.getTree());
                    RIGHT_PAREN152=(Token)input.LT(1);
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_lhs_not2567); if (failed) return retval;
                    if ( backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN152);

                    if ( backtracking==0 ) {
                      	emit(RIGHT_PAREN152, DroolsEditorType.SYMBOL);	
                    }

                    }
                    break;
                case 3 :
                    // src/main/resources/org/drools/lang/DRL.g:884:6: lhs_pattern
                    {
                    pushFollow(FOLLOW_lhs_pattern_in_lhs_not2577);
                    lhs_pattern153=lhs_pattern();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_lhs_pattern.add(lhs_pattern153.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: not_key, lhs_or, RIGHT_PAREN, lhs_pattern
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 885:10: -> ^( not_key ( lhs_or )? ( lhs_pattern )? ( RIGHT_PAREN )? )
            {
                // src/main/resources/org/drools/lang/DRL.g:885:13: ^( not_key ( lhs_or )? ( lhs_pattern )? ( RIGHT_PAREN )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_not_key.nextNode(), root_1);

                // src/main/resources/org/drools/lang/DRL.g:885:23: ( lhs_or )?
                if ( stream_lhs_or.hasNext() ) {
                    adaptor.addChild(root_1, stream_lhs_or.next());

                }
                stream_lhs_or.reset();
                // src/main/resources/org/drools/lang/DRL.g:885:31: ( lhs_pattern )?
                if ( stream_lhs_pattern.hasNext() ) {
                    adaptor.addChild(root_1, stream_lhs_pattern.next());

                }
                stream_lhs_pattern.reset();
                // src/main/resources/org/drools/lang/DRL.g:885:44: ( RIGHT_PAREN )?
                if ( stream_RIGHT_PAREN.hasNext() ) {
                    adaptor.addChild(root_1, stream_RIGHT_PAREN.next());

                }
                stream_RIGHT_PAREN.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end lhs_not

    public static class lhs_eval_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start lhs_eval
    // src/main/resources/org/drools/lang/DRL.g:888:1: lhs_eval : ev= eval_key pc= paren_chunk -> ^( eval_key paren_chunk ) ;
    public final lhs_eval_return lhs_eval() throws RecognitionException {
        lhs_eval_return retval = new lhs_eval_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        eval_key_return ev = null;

        paren_chunk_return pc = null;


        RewriteRuleSubtreeStream stream_paren_chunk=new RewriteRuleSubtreeStream(adaptor,"rule paren_chunk");
        RewriteRuleSubtreeStream stream_eval_key=new RewriteRuleSubtreeStream(adaptor,"rule eval_key");
        try {
            // src/main/resources/org/drools/lang/DRL.g:889:2: (ev= eval_key pc= paren_chunk -> ^( eval_key paren_chunk ) )
            // src/main/resources/org/drools/lang/DRL.g:889:4: ev= eval_key pc= paren_chunk
            {
            pushFollow(FOLLOW_eval_key_in_lhs_eval2616);
            ev=eval_key();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_eval_key.add(ev.getTree());
            if ( backtracking==0 ) {
              	emit(Location.LOCATION_LHS_INSIDE_EVAL);	
            }
            pushFollow(FOLLOW_paren_chunk_in_lhs_eval2625);
            pc=paren_chunk();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_paren_chunk.add(pc.getTree());
            if ( backtracking==0 ) {
              	emit(Location.LOCATION_LHS_BEGIN_OF_CONDITION);	
            }
            if ( backtracking==0 ) {
              	String body = safeSubstring( input.toString(pc.start,pc.stop), 1, input.toString(pc.start,pc.stop).length()-1 );
              		checkTrailingSemicolon( body, ((Token)ev.start) );	
            }

            // AST REWRITE
            // elements: eval_key, paren_chunk
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 895:3: -> ^( eval_key paren_chunk )
            {
                // src/main/resources/org/drools/lang/DRL.g:895:6: ^( eval_key paren_chunk )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_eval_key.nextNode(), root_1);

                adaptor.addChild(root_1, stream_paren_chunk.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end lhs_eval

    public static class lhs_forall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start lhs_forall
    // src/main/resources/org/drools/lang/DRL.g:898:1: lhs_forall : forall_key LEFT_PAREN ( lhs_pattern )+ RIGHT_PAREN -> ^( forall_key ( lhs_pattern )+ RIGHT_PAREN ) ;
    public final lhs_forall_return lhs_forall() throws RecognitionException {
        lhs_forall_return retval = new lhs_forall_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_PAREN155=null;
        Token RIGHT_PAREN157=null;
        forall_key_return forall_key154 = null;

        lhs_pattern_return lhs_pattern156 = null;


        Object LEFT_PAREN155_tree=null;
        Object RIGHT_PAREN157_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleSubtreeStream stream_forall_key=new RewriteRuleSubtreeStream(adaptor,"rule forall_key");
        RewriteRuleSubtreeStream stream_lhs_pattern=new RewriteRuleSubtreeStream(adaptor,"rule lhs_pattern");
        try {
            // src/main/resources/org/drools/lang/DRL.g:899:2: ( forall_key LEFT_PAREN ( lhs_pattern )+ RIGHT_PAREN -> ^( forall_key ( lhs_pattern )+ RIGHT_PAREN ) )
            // src/main/resources/org/drools/lang/DRL.g:899:4: forall_key LEFT_PAREN ( lhs_pattern )+ RIGHT_PAREN
            {
            pushFollow(FOLLOW_forall_key_in_lhs_forall2652);
            forall_key154=forall_key();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_forall_key.add(forall_key154.getTree());
            LEFT_PAREN155=(Token)input.LT(1);
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_lhs_forall2657); if (failed) return retval;
            if ( backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN155);

            if ( backtracking==0 ) {
              	emit(LEFT_PAREN155, DroolsEditorType.SYMBOL);	
            }
            // src/main/resources/org/drools/lang/DRL.g:901:4: ( lhs_pattern )+
            int cnt54=0;
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==ID) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:901:4: lhs_pattern
            	    {
            	    pushFollow(FOLLOW_lhs_pattern_in_lhs_forall2665);
            	    lhs_pattern156=lhs_pattern();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_lhs_pattern.add(lhs_pattern156.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt54 >= 1 ) break loop54;
            	    if (backtracking>0) {failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
            } while (true);

            RIGHT_PAREN157=(Token)input.LT(1);
            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_lhs_forall2671); if (failed) return retval;
            if ( backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN157);

            if ( backtracking==0 ) {
              	emit(RIGHT_PAREN157, DroolsEditorType.SYMBOL);	
            }

            // AST REWRITE
            // elements: RIGHT_PAREN, lhs_pattern, forall_key
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 903:3: -> ^( forall_key ( lhs_pattern )+ RIGHT_PAREN )
            {
                // src/main/resources/org/drools/lang/DRL.g:903:6: ^( forall_key ( lhs_pattern )+ RIGHT_PAREN )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_forall_key.nextNode(), root_1);

                if ( !(stream_lhs_pattern.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_lhs_pattern.hasNext() ) {
                    adaptor.addChild(root_1, stream_lhs_pattern.next());

                }
                stream_lhs_pattern.reset();
                adaptor.addChild(root_1, stream_RIGHT_PAREN.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end lhs_forall

    public static class pattern_source_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start pattern_source
    // src/main/resources/org/drools/lang/DRL.g:906:1: pattern_source : lhs_pattern ( over_clause )? ( FROM ( accumulate_statement | collect_statement | entrypoint_statement | from_source ) )? ;
    public final pattern_source_return pattern_source() throws RecognitionException {
        pattern_source_return retval = new pattern_source_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FROM160=null;
        lhs_pattern_return lhs_pattern158 = null;

        over_clause_return over_clause159 = null;

        accumulate_statement_return accumulate_statement161 = null;

        collect_statement_return collect_statement162 = null;

        entrypoint_statement_return entrypoint_statement163 = null;

        from_source_return from_source164 = null;


        Object FROM160_tree=null;

         boolean isFailed = true;	
        try {
            // src/main/resources/org/drools/lang/DRL.g:909:2: ( lhs_pattern ( over_clause )? ( FROM ( accumulate_statement | collect_statement | entrypoint_statement | from_source ) )? )
            // src/main/resources/org/drools/lang/DRL.g:909:4: lhs_pattern ( over_clause )? ( FROM ( accumulate_statement | collect_statement | entrypoint_statement | from_source ) )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_lhs_pattern_in_pattern_source2707);
            lhs_pattern158=lhs_pattern();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, lhs_pattern158.getTree());
            // src/main/resources/org/drools/lang/DRL.g:910:3: ( over_clause )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==OVER) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:910:3: over_clause
                    {
                    pushFollow(FOLLOW_over_clause_in_pattern_source2711);
                    over_clause159=over_clause();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, over_clause159.getTree());

                    }
                    break;

            }

            // src/main/resources/org/drools/lang/DRL.g:911:3: ( FROM ( accumulate_statement | collect_statement | entrypoint_statement | from_source ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==FROM) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:912:4: FROM ( accumulate_statement | collect_statement | entrypoint_statement | from_source )
                    {
                    FROM160=(Token)input.LT(1);
                    match(input,FROM,FOLLOW_FROM_in_pattern_source2721); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FROM160_tree = (Object)adaptor.create(FROM160);
                    root_0 = (Object)adaptor.becomeRoot(FROM160_tree, root_0);
                    }
                    if ( backtracking==0 ) {
                      	emit(FROM160, DroolsEditorType.KEYWORD);
                      			emit(Location.LOCATION_LHS_FROM);	
                    }
                    // src/main/resources/org/drools/lang/DRL.g:915:11: ( accumulate_statement | collect_statement | entrypoint_statement | from_source )
                    int alt56=4;
                    switch ( input.LA(1) ) {
                    case ACCUMULATE:
                        {
                        alt56=1;
                        }
                        break;
                    case COLLECT:
                        {
                        alt56=2;
                        }
                        break;
                    case ID:
                        {
                        int LA56_3 = input.LA(2);

                        if ( (LA56_3==MISC) && ((validateIdentifierKey(DroolsSoftKeywords.ENTRY) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.POINT)))) {
                            alt56=3;
                        }
                        else if ( ((LA56_3>=SEMICOLON && LA56_3<=DOT)||LA56_3==END||(LA56_3>=LEFT_PAREN && LA56_3<=RIGHT_PAREN)||(LA56_3>=DOUBLE_PIPE && LA56_3<=DOUBLE_AMPER)||LA56_3==INIT||LA56_3==THEN) ) {
                            alt56=4;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("915:11: ( accumulate_statement | collect_statement | entrypoint_statement | from_source )", 56, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("915:11: ( accumulate_statement | collect_statement | entrypoint_statement | from_source )", 56, 0, input);

                        throw nvae;
                    }

                    switch (alt56) {
                        case 1 :
                            // src/main/resources/org/drools/lang/DRL.g:915:14: accumulate_statement
                            {
                            pushFollow(FOLLOW_accumulate_statement_in_pattern_source2741);
                            accumulate_statement161=accumulate_statement();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, accumulate_statement161.getTree());

                            }
                            break;
                        case 2 :
                            // src/main/resources/org/drools/lang/DRL.g:916:15: collect_statement
                            {
                            pushFollow(FOLLOW_collect_statement_in_pattern_source2757);
                            collect_statement162=collect_statement();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, collect_statement162.getTree());

                            }
                            break;
                        case 3 :
                            // src/main/resources/org/drools/lang/DRL.g:917:15: entrypoint_statement
                            {
                            pushFollow(FOLLOW_entrypoint_statement_in_pattern_source2774);
                            entrypoint_statement163=entrypoint_statement();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, entrypoint_statement163.getTree());

                            }
                            break;
                        case 4 :
                            // src/main/resources/org/drools/lang/DRL.g:918:15: from_source
                            {
                            pushFollow(FOLLOW_from_source_in_pattern_source2790);
                            from_source164=from_source();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, from_source164.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( backtracking==0 ) {
               isFailed = false;	
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (isEditorInterfaceEnabled && input.LA(3) == EOF && input.LA(1) == ACCUMULATE) {
            			emit(input.LT(1), DroolsEditorType.KEYWORD);
            			emit(input.LT(2), DroolsEditorType.SYMBOL);
            			input.consume();
            			emit(true, Location.LOCATION_LHS_FROM_ACCUMULATE);
            	} else if (isEditorInterfaceEnabled && input.LA(3) == EOF && input.LA(1) == COLLECT) {
            			emit(input.LT(1), DroolsEditorType.KEYWORD);
            			emit(input.LT(2), DroolsEditorType.SYMBOL);
            			input.consume();
            			emit(true, Location.LOCATION_LHS_FROM_COLLECT);
            	}

        }
        return retval;
    }
    // $ANTLR end pattern_source

    public static class over_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start over_clause
    // src/main/resources/org/drools/lang/DRL.g:936:1: over_clause : OVER over_elements ( COMMA over_elements )* ;
    public final over_clause_return over_clause() throws RecognitionException {
        over_clause_return retval = new over_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OVER165=null;
        Token COMMA167=null;
        over_elements_return over_elements166 = null;

        over_elements_return over_elements168 = null;


        Object OVER165_tree=null;
        Object COMMA167_tree=null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:937:2: ( OVER over_elements ( COMMA over_elements )* )
            // src/main/resources/org/drools/lang/DRL.g:937:4: OVER over_elements ( COMMA over_elements )*
            {
            root_0 = (Object)adaptor.nil();

            OVER165=(Token)input.LT(1);
            match(input,OVER,FOLLOW_OVER_in_over_clause2822); if (failed) return retval;
            if ( backtracking==0 ) {
            OVER165_tree = (Object)adaptor.create(OVER165);
            root_0 = (Object)adaptor.becomeRoot(OVER165_tree, root_0);
            }
            if ( backtracking==0 ) {
              	emit(OVER165, DroolsEditorType.KEYWORD);	
            }
            pushFollow(FOLLOW_over_elements_in_over_clause2827);
            over_elements166=over_elements();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, over_elements166.getTree());
            // src/main/resources/org/drools/lang/DRL.g:938:4: ( COMMA over_elements )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==COMMA) ) {
                    int LA58_2 = input.LA(2);

                    if ( (LA58_2==ID) ) {
                        int LA58_3 = input.LA(3);

                        if ( (LA58_3==COLON) ) {
                            alt58=1;
                        }


                    }


                }


                switch (alt58) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:938:5: COMMA over_elements
            	    {
            	    COMMA167=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_over_clause2834); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	      	emit(COMMA167, DroolsEditorType.SYMBOL);	
            	    }
            	    pushFollow(FOLLOW_over_elements_in_over_clause2839);
            	    over_elements168=over_elements();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, over_elements168.getTree());

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end over_clause

    public static class over_elements_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start over_elements
    // src/main/resources/org/drools/lang/DRL.g:941:1: over_elements : id1= ID COLON id2= ID paren_chunk -> ^( VT_BEHAVIOR $id1 $id2 paren_chunk ) ;
    public final over_elements_return over_elements() throws RecognitionException {
        over_elements_return retval = new over_elements_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id1=null;
        Token id2=null;
        Token COLON169=null;
        paren_chunk_return paren_chunk170 = null;


        Object id1_tree=null;
        Object id2_tree=null;
        Object COLON169_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_paren_chunk=new RewriteRuleSubtreeStream(adaptor,"rule paren_chunk");
        try {
            // src/main/resources/org/drools/lang/DRL.g:942:2: (id1= ID COLON id2= ID paren_chunk -> ^( VT_BEHAVIOR $id1 $id2 paren_chunk ) )
            // src/main/resources/org/drools/lang/DRL.g:942:4: id1= ID COLON id2= ID paren_chunk
            {
            id1=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_over_elements2854); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id1);

            if ( backtracking==0 ) {
              	emit(id1, DroolsEditorType.IDENTIFIER);	
            }
            COLON169=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_over_elements2861); if (failed) return retval;
            if ( backtracking==0 ) stream_COLON.add(COLON169);

            if ( backtracking==0 ) {
              	emit(COLON169, DroolsEditorType.SYMBOL);	
            }
            id2=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_over_elements2870); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id2);

            if ( backtracking==0 ) {
              	emit(id2, DroolsEditorType.IDENTIFIER);	
            }
            pushFollow(FOLLOW_paren_chunk_in_over_elements2877);
            paren_chunk170=paren_chunk();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_paren_chunk.add(paren_chunk170.getTree());

            // AST REWRITE
            // elements: paren_chunk, id2, id1
            // token labels: id2, id1
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_id2=new RewriteRuleTokenStream(adaptor,"token id2",id2);
            RewriteRuleTokenStream stream_id1=new RewriteRuleTokenStream(adaptor,"token id1",id1);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 946:2: -> ^( VT_BEHAVIOR $id1 $id2 paren_chunk )
            {
                // src/main/resources/org/drools/lang/DRL.g:946:5: ^( VT_BEHAVIOR $id1 $id2 paren_chunk )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(VT_BEHAVIOR, "VT_BEHAVIOR"), root_1);

                adaptor.addChild(root_1, stream_id1.next());
                adaptor.addChild(root_1, stream_id2.next());
                adaptor.addChild(root_1, stream_paren_chunk.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end over_elements

    public static class accumulate_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start accumulate_statement
    // src/main/resources/org/drools/lang/DRL.g:949:1: accumulate_statement : ACCUMULATE LEFT_PAREN lhs_or ( COMMA )? ( accumulate_init_clause | accumulate_id_clause ) RIGHT_PAREN -> ^( ACCUMULATE lhs_or ( accumulate_init_clause )? ( accumulate_id_clause )? RIGHT_PAREN ) ;
    public final accumulate_statement_return accumulate_statement() throws RecognitionException {
        accumulate_statement_return retval = new accumulate_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ACCUMULATE171=null;
        Token LEFT_PAREN172=null;
        Token COMMA174=null;
        Token RIGHT_PAREN177=null;
        lhs_or_return lhs_or173 = null;

        accumulate_init_clause_return accumulate_init_clause175 = null;

        accumulate_id_clause_return accumulate_id_clause176 = null;


        Object ACCUMULATE171_tree=null;
        Object LEFT_PAREN172_tree=null;
        Object COMMA174_tree=null;
        Object RIGHT_PAREN177_tree=null;
        RewriteRuleTokenStream stream_ACCUMULATE=new RewriteRuleTokenStream(adaptor,"token ACCUMULATE");
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_accumulate_init_clause=new RewriteRuleSubtreeStream(adaptor,"rule accumulate_init_clause");
        RewriteRuleSubtreeStream stream_accumulate_id_clause=new RewriteRuleSubtreeStream(adaptor,"rule accumulate_id_clause");
        RewriteRuleSubtreeStream stream_lhs_or=new RewriteRuleSubtreeStream(adaptor,"rule lhs_or");
        try {
            // src/main/resources/org/drools/lang/DRL.g:950:2: ( ACCUMULATE LEFT_PAREN lhs_or ( COMMA )? ( accumulate_init_clause | accumulate_id_clause ) RIGHT_PAREN -> ^( ACCUMULATE lhs_or ( accumulate_init_clause )? ( accumulate_id_clause )? RIGHT_PAREN ) )
            // src/main/resources/org/drools/lang/DRL.g:950:4: ACCUMULATE LEFT_PAREN lhs_or ( COMMA )? ( accumulate_init_clause | accumulate_id_clause ) RIGHT_PAREN
            {
            ACCUMULATE171=(Token)input.LT(1);
            match(input,ACCUMULATE,FOLLOW_ACCUMULATE_in_accumulate_statement2903); if (failed) return retval;
            if ( backtracking==0 ) stream_ACCUMULATE.add(ACCUMULATE171);

            if ( backtracking==0 ) {
              	emit(ACCUMULATE171, DroolsEditorType.KEYWORD);	
            }
            if ( backtracking==0 ) {
              	emit(Location.LOCATION_LHS_FROM_ACCUMULATE);	
            }
            LEFT_PAREN172=(Token)input.LT(1);
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_accumulate_statement2912); if (failed) return retval;
            if ( backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN172);

            if ( backtracking==0 ) {
              	emit(LEFT_PAREN172, DroolsEditorType.SYMBOL);	
            }
            pushFollow(FOLLOW_lhs_or_in_accumulate_statement2920);
            lhs_or173=lhs_or();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_lhs_or.add(lhs_or173.getTree());
            // src/main/resources/org/drools/lang/DRL.g:954:3: ( COMMA )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==COMMA) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:954:3: COMMA
                    {
                    COMMA174=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_accumulate_statement2925); if (failed) return retval;
                    if ( backtracking==0 ) stream_COMMA.add(COMMA174);


                    }
                    break;

            }

            if ( backtracking==0 ) {
              	emit(COMMA174, DroolsEditorType.SYMBOL);	
            }
            // src/main/resources/org/drools/lang/DRL.g:955:3: ( accumulate_init_clause | accumulate_id_clause )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==INIT) ) {
                alt60=1;
            }
            else if ( (LA60_0==ID) ) {
                alt60=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("955:3: ( accumulate_init_clause | accumulate_id_clause )", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:955:5: accumulate_init_clause
                    {
                    pushFollow(FOLLOW_accumulate_init_clause_in_accumulate_statement2935);
                    accumulate_init_clause175=accumulate_init_clause();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_accumulate_init_clause.add(accumulate_init_clause175.getTree());

                    }
                    break;
                case 2 :
                    // src/main/resources/org/drools/lang/DRL.g:956:5: accumulate_id_clause
                    {
                    pushFollow(FOLLOW_accumulate_id_clause_in_accumulate_statement2941);
                    accumulate_id_clause176=accumulate_id_clause();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_accumulate_id_clause.add(accumulate_id_clause176.getTree());

                    }
                    break;

            }

            RIGHT_PAREN177=(Token)input.LT(1);
            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_accumulate_statement2949); if (failed) return retval;
            if ( backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN177);

            if ( backtracking==0 ) {
              	emit(RIGHT_PAREN177, DroolsEditorType.SYMBOL);	
            }
            if ( backtracking==0 ) {
              	emit(Location.LOCATION_LHS_BEGIN_OF_CONDITION);	
            }

            // AST REWRITE
            // elements: accumulate_init_clause, lhs_or, ACCUMULATE, RIGHT_PAREN, accumulate_id_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 960:3: -> ^( ACCUMULATE lhs_or ( accumulate_init_clause )? ( accumulate_id_clause )? RIGHT_PAREN )
            {
                // src/main/resources/org/drools/lang/DRL.g:960:6: ^( ACCUMULATE lhs_or ( accumulate_init_clause )? ( accumulate_id_clause )? RIGHT_PAREN )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ACCUMULATE.next(), root_1);

                adaptor.addChild(root_1, stream_lhs_or.next());
                // src/main/resources/org/drools/lang/DRL.g:960:26: ( accumulate_init_clause )?
                if ( stream_accumulate_init_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_accumulate_init_clause.next());

                }
                stream_accumulate_init_clause.reset();
                // src/main/resources/org/drools/lang/DRL.g:960:50: ( accumulate_id_clause )?
                if ( stream_accumulate_id_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_accumulate_id_clause.next());

                }
                stream_accumulate_id_clause.reset();
                adaptor.addChild(root_1, stream_RIGHT_PAREN.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end accumulate_statement

    public static class accumulate_init_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start accumulate_init_clause
    // src/main/resources/org/drools/lang/DRL.g:964:1: accumulate_init_clause : INIT pc1= accumulate_paren_chunk[Location.LOCATION_LHS_FROM_ACCUMULATE_INIT_INSIDE] (cm1= COMMA )? action_key pc2= accumulate_paren_chunk[Location.LOCATION_LHS_FROM_ACCUMULATE_ACTION_INSIDE] (cm2= COMMA )? ( reverse_key pc3= accumulate_paren_chunk[Location.LOCATION_LHS_FROM_ACCUMULATE_REVERSE_INSIDE] (cm3= COMMA )? )? res1= result_key pc4= accumulate_paren_chunk[Location.LOCATION_LHS_FROM_ACCUMULATE_RESULT_INSIDE] -> ^( VT_ACCUMULATE_INIT_CLAUSE ^( INIT $pc1) ^( action_key $pc2) ( ^( reverse_key $pc3) )? ^( result_key $pc4) ) ;
    public final accumulate_init_clause_return accumulate_init_clause() throws RecognitionException {
        accumulate_init_clause_return retval = new accumulate_init_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token cm1=null;
        Token cm2=null;
        Token cm3=null;
        Token INIT178=null;
        accumulate_paren_chunk_return pc1 = null;

        accumulate_paren_chunk_return pc2 = null;

        accumulate_paren_chunk_return pc3 = null;

        result_key_return res1 = null;

        accumulate_paren_chunk_return pc4 = null;

        action_key_return action_key179 = null;

        reverse_key_return reverse_key180 = null;


        Object cm1_tree=null;
        Object cm2_tree=null;
        Object cm3_tree=null;
        Object INIT178_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_INIT=new RewriteRuleTokenStream(adaptor,"token INIT");
        RewriteRuleSubtreeStream stream_action_key=new RewriteRuleSubtreeStream(adaptor,"rule action_key");
        RewriteRuleSubtreeStream stream_accumulate_paren_chunk=new RewriteRuleSubtreeStream(adaptor,"rule accumulate_paren_chunk");
        RewriteRuleSubtreeStream stream_reverse_key=new RewriteRuleSubtreeStream(adaptor,"rule reverse_key");
        RewriteRuleSubtreeStream stream_result_key=new RewriteRuleSubtreeStream(adaptor,"rule result_key");
         boolean isFailed = true;	
        try {
            // src/main/resources/org/drools/lang/DRL.g:967:2: ( INIT pc1= accumulate_paren_chunk[Location.LOCATION_LHS_FROM_ACCUMULATE_INIT_INSIDE] (cm1= COMMA )? action_key pc2= accumulate_paren_chunk[Location.LOCATION_LHS_FROM_ACCUMULATE_ACTION_INSIDE] (cm2= COMMA )? ( reverse_key pc3= accumulate_paren_chunk[Location.LOCATION_LHS_FROM_ACCUMULATE_REVERSE_INSIDE] (cm3= COMMA )? )? res1= result_key pc4= accumulate_paren_chunk[Location.LOCATION_LHS_FROM_ACCUMULATE_RESULT_INSIDE] -> ^( VT_ACCUMULATE_INIT_CLAUSE ^( INIT $pc1) ^( action_key $pc2) ( ^( reverse_key $pc3) )? ^( result_key $pc4) ) )
            // src/main/resources/org/drools/lang/DRL.g:967:4: INIT pc1= accumulate_paren_chunk[Location.LOCATION_LHS_FROM_ACCUMULATE_INIT_INSIDE] (cm1= COMMA )? action_key pc2= accumulate_paren_chunk[Location.LOCATION_LHS_FROM_ACCUMULATE_ACTION_INSIDE] (cm2= COMMA )? ( reverse_key pc3= accumulate_paren_chunk[Location.LOCATION_LHS_FROM_ACCUMULATE_REVERSE_INSIDE] (cm3= COMMA )? )? res1= result_key pc4= accumulate_paren_chunk[Location.LOCATION_LHS_FROM_ACCUMULATE_RESULT_INSIDE]
            {
            INIT178=(Token)input.LT(1);
            match(input,INIT,FOLLOW_INIT_in_accumulate_init_clause2995); if (failed) return retval;
            if ( backtracking==0 ) stream_INIT.add(INIT178);

            if ( backtracking==0 ) {
              	emit(INIT178, DroolsEditorType.KEYWORD);	
            }
            if ( backtracking==0 ) {
              	emit(Location.LOCATION_LHS_FROM_ACCUMULATE_INIT);	
            }
            pushFollow(FOLLOW_accumulate_paren_chunk_in_accumulate_init_clause3006);
            pc1=accumulate_paren_chunk(Location.LOCATION_LHS_FROM_ACCUMULATE_INIT_INSIDE);
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_accumulate_paren_chunk.add(pc1.getTree());
            // src/main/resources/org/drools/lang/DRL.g:969:84: (cm1= COMMA )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==COMMA) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:969:84: cm1= COMMA
                    {
                    cm1=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_accumulate_init_clause3011); if (failed) return retval;
                    if ( backtracking==0 ) stream_COMMA.add(cm1);


                    }
                    break;

            }

            if ( backtracking==0 ) {
              	emit(cm1, DroolsEditorType.SYMBOL);	
            }
            if ( backtracking==0 ) {
              	emit(Location.LOCATION_LHS_FROM_ACCUMULATE_ACTION);	
            }
            pushFollow(FOLLOW_action_key_in_accumulate_init_clause3022);
            action_key179=action_key();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_action_key.add(action_key179.getTree());
            pushFollow(FOLLOW_accumulate_paren_chunk_in_accumulate_init_clause3026);
            pc2=accumulate_paren_chunk(Location.LOCATION_LHS_FROM_ACCUMULATE_ACTION_INSIDE);
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_accumulate_paren_chunk.add(pc2.getTree());
            // src/main/resources/org/drools/lang/DRL.g:971:97: (cm2= COMMA )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==COMMA) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:971:97: cm2= COMMA
                    {
                    cm2=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_accumulate_init_clause3031); if (failed) return retval;
                    if ( backtracking==0 ) stream_COMMA.add(cm2);


                    }
                    break;

            }

            if ( backtracking==0 ) {
              	emit(cm2, DroolsEditorType.SYMBOL);	
            }
            if ( backtracking==0 ) {
              	emit(Location.LOCATION_LHS_FROM_ACCUMULATE_REVERSE);	
            }
            // src/main/resources/org/drools/lang/DRL.g:974:2: ( reverse_key pc3= accumulate_paren_chunk[Location.LOCATION_LHS_FROM_ACCUMULATE_REVERSE_INSIDE] (cm3= COMMA )? )?
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:974:4: reverse_key pc3= accumulate_paren_chunk[Location.LOCATION_LHS_FROM_ACCUMULATE_REVERSE_INSIDE] (cm3= COMMA )?
                    {
                    pushFollow(FOLLOW_reverse_key_in_accumulate_init_clause3044);
                    reverse_key180=reverse_key();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_reverse_key.add(reverse_key180.getTree());
                    pushFollow(FOLLOW_accumulate_paren_chunk_in_accumulate_init_clause3048);
                    pc3=accumulate_paren_chunk(Location.LOCATION_LHS_FROM_ACCUMULATE_REVERSE_INSIDE);
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_accumulate_paren_chunk.add(pc3.getTree());
                    // src/main/resources/org/drools/lang/DRL.g:974:100: (cm3= COMMA )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==COMMA) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // src/main/resources/org/drools/lang/DRL.g:974:100: cm3= COMMA
                            {
                            cm3=(Token)input.LT(1);
                            match(input,COMMA,FOLLOW_COMMA_in_accumulate_init_clause3053); if (failed) return retval;
                            if ( backtracking==0 ) stream_COMMA.add(cm3);


                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      	emit(cm3, DroolsEditorType.SYMBOL);	
                    }

                    }
                    break;

            }

            if ( backtracking==0 ) {
              	emit(Location.LOCATION_LHS_FROM_ACCUMULATE_RESULT);	
            }
            pushFollow(FOLLOW_result_key_in_accumulate_init_clause3068);
            res1=result_key();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_result_key.add(res1.getTree());
            if ( backtracking==0 ) {
              	emit(((Token)res1.start), DroolsEditorType.KEYWORD);	
            }
            pushFollow(FOLLOW_accumulate_paren_chunk_in_accumulate_init_clause3074);
            pc4=accumulate_paren_chunk(Location.LOCATION_LHS_FROM_ACCUMULATE_RESULT_INSIDE);
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_accumulate_paren_chunk.add(pc4.getTree());

            // AST REWRITE
            // elements: pc2, pc1, pc3, result_key, reverse_key, INIT, pc4, action_key
            // token labels: 
            // rule labels: pc4, pc3, retval, pc1, pc2
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_pc4=new RewriteRuleSubtreeStream(adaptor,"token pc4",pc4!=null?pc4.tree:null);
            RewriteRuleSubtreeStream stream_pc3=new RewriteRuleSubtreeStream(adaptor,"token pc3",pc3!=null?pc3.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_pc1=new RewriteRuleSubtreeStream(adaptor,"token pc1",pc1!=null?pc1.tree:null);
            RewriteRuleSubtreeStream stream_pc2=new RewriteRuleSubtreeStream(adaptor,"token pc2",pc2!=null?pc2.tree:null);

            root_0 = (Object)adaptor.nil();
            // 977:2: -> ^( VT_ACCUMULATE_INIT_CLAUSE ^( INIT $pc1) ^( action_key $pc2) ( ^( reverse_key $pc3) )? ^( result_key $pc4) )
            {
                // src/main/resources/org/drools/lang/DRL.g:977:5: ^( VT_ACCUMULATE_INIT_CLAUSE ^( INIT $pc1) ^( action_key $pc2) ( ^( reverse_key $pc3) )? ^( result_key $pc4) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(VT_ACCUMULATE_INIT_CLAUSE, "VT_ACCUMULATE_INIT_CLAUSE"), root_1);

                // src/main/resources/org/drools/lang/DRL.g:977:33: ^( INIT $pc1)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_INIT.next(), root_2);

                adaptor.addChild(root_2, stream_pc1.next());

                adaptor.addChild(root_1, root_2);
                }
                // src/main/resources/org/drools/lang/DRL.g:977:46: ^( action_key $pc2)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_action_key.nextNode(), root_2);

                adaptor.addChild(root_2, stream_pc2.next());

                adaptor.addChild(root_1, root_2);
                }
                // src/main/resources/org/drools/lang/DRL.g:977:65: ( ^( reverse_key $pc3) )?
                if ( stream_pc3.hasNext()||stream_reverse_key.hasNext() ) {
                    // src/main/resources/org/drools/lang/DRL.g:977:65: ^( reverse_key $pc3)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_reverse_key.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_pc3.next());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_pc3.reset();
                stream_reverse_key.reset();
                // src/main/resources/org/drools/lang/DRL.g:977:86: ^( result_key $pc4)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_result_key.nextNode(), root_2);

                adaptor.addChild(root_2, stream_pc4.next());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( backtracking==0 ) {
               isFailed = false;	
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
             
            	if (isEditorInterfaceEnabled && isFailed && input.LA(1) == ID && validateLT(1, DroolsSoftKeywords.RESULT)) {
            		emit(input.LT(1), DroolsEditorType.KEYWORD);
            		input.consume();
            		if (input.LA(1) == LEFT_PAREN){
            			input.consume();
            			emit(Location.LOCATION_LHS_FROM_ACCUMULATE_RESULT_INSIDE);
            		}
            	}

        }
        return retval;
    }
    // $ANTLR end accumulate_init_clause

    public static class accumulate_paren_chunk_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start accumulate_paren_chunk
    // src/main/resources/org/drools/lang/DRL.g:990:1: accumulate_paren_chunk[int locationType] : pc= accumulate_paren_chunk_data[false,$locationType] -> VT_PAREN_CHUNK[$pc.start,text] ;
    public final accumulate_paren_chunk_return accumulate_paren_chunk(int locationType) throws RecognitionException {
        accumulate_paren_chunk_return retval = new accumulate_paren_chunk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        accumulate_paren_chunk_data_return pc = null;


        RewriteRuleSubtreeStream stream_accumulate_paren_chunk_data=new RewriteRuleSubtreeStream(adaptor,"rule accumulate_paren_chunk_data");

        	String text = "";

        try {
            // src/main/resources/org/drools/lang/DRL.g:993:3: (pc= accumulate_paren_chunk_data[false,$locationType] -> VT_PAREN_CHUNK[$pc.start,text] )
            // src/main/resources/org/drools/lang/DRL.g:993:5: pc= accumulate_paren_chunk_data[false,$locationType]
            {
            pushFollow(FOLLOW_accumulate_paren_chunk_data_in_accumulate_paren_chunk3132);
            pc=accumulate_paren_chunk_data(false, locationType);
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_accumulate_paren_chunk_data.add(pc.getTree());
            if ( backtracking==0 ) {
              text = input.toString(pc.start,pc.stop);
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 994:2: -> VT_PAREN_CHUNK[$pc.start,text]
            {
                adaptor.addChild(root_0, adaptor.create(VT_PAREN_CHUNK, ((Token)pc.start), text));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end accumulate_paren_chunk

    public static class accumulate_paren_chunk_data_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start accumulate_paren_chunk_data
    // src/main/resources/org/drools/lang/DRL.g:997:1: accumulate_paren_chunk_data[boolean isRecursive, int locationType] : lp1= LEFT_PAREN (any=~ ( LEFT_PAREN | RIGHT_PAREN ) | accumulate_paren_chunk_data[true,-1] )* rp1= RIGHT_PAREN ;
    public final accumulate_paren_chunk_data_return accumulate_paren_chunk_data(boolean isRecursive, int locationType) throws RecognitionException {
        accumulate_paren_chunk_data_return retval = new accumulate_paren_chunk_data_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lp1=null;
        Token any=null;
        Token rp1=null;
        accumulate_paren_chunk_data_return accumulate_paren_chunk_data181 = null;


        Object lp1_tree=null;
        Object any_tree=null;
        Object rp1_tree=null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:998:2: (lp1= LEFT_PAREN (any=~ ( LEFT_PAREN | RIGHT_PAREN ) | accumulate_paren_chunk_data[true,-1] )* rp1= RIGHT_PAREN )
            // src/main/resources/org/drools/lang/DRL.g:998:4: lp1= LEFT_PAREN (any=~ ( LEFT_PAREN | RIGHT_PAREN ) | accumulate_paren_chunk_data[true,-1] )* rp1= RIGHT_PAREN
            {
            root_0 = (Object)adaptor.nil();

            lp1=(Token)input.LT(1);
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_accumulate_paren_chunk_data3156); if (failed) return retval;
            if ( backtracking==0 ) {
            lp1_tree = (Object)adaptor.create(lp1);
            adaptor.addChild(root_0, lp1_tree);
            }
            if ( backtracking==0 ) {
              	if (!isRecursive) {
              				emit(lp1, DroolsEditorType.SYMBOL);
              				emit(locationType);
              			} else {
              				emit(lp1, DroolsEditorType.CODE_CHUNK);
              			}	
              		
            }
            // src/main/resources/org/drools/lang/DRL.g:1006:4: (any=~ ( LEFT_PAREN | RIGHT_PAREN ) | accumulate_paren_chunk_data[true,-1] )*
            loop65:
            do {
                int alt65=3;
                int LA65_0 = input.LA(1);

                if ( ((LA65_0>=VT_COMPILATION_UNIT && LA65_0<=STRING)||LA65_0==COMMA||(LA65_0>=AT && LA65_0<=MULTI_LINE_COMMENT)) ) {
                    alt65=1;
                }
                else if ( (LA65_0==LEFT_PAREN) ) {
                    alt65=2;
                }


                switch (alt65) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:1006:5: any=~ ( LEFT_PAREN | RIGHT_PAREN )
            	    {
            	    any=(Token)input.LT(1);
            	    if ( (input.LA(1)>=VT_COMPILATION_UNIT && input.LA(1)<=STRING)||input.LA(1)==COMMA||(input.LA(1)>=AT && input.LA(1)<=MULTI_LINE_COMMENT) ) {
            	        input.consume();
            	        if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(any));
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_accumulate_paren_chunk_data3168);    throw mse;
            	    }

            	    if ( backtracking==0 ) {
            	       emit(any, DroolsEditorType.CODE_CHUNK); 
            	    }

            	    }
            	    break;
            	case 2 :
            	    // src/main/resources/org/drools/lang/DRL.g:1006:87: accumulate_paren_chunk_data[true,-1]
            	    {
            	    pushFollow(FOLLOW_accumulate_paren_chunk_data_in_accumulate_paren_chunk_data3184);
            	    accumulate_paren_chunk_data181=accumulate_paren_chunk_data(true, -1);
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, accumulate_paren_chunk_data181.getTree());

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            rp1=(Token)input.LT(1);
            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_accumulate_paren_chunk_data3195); if (failed) return retval;
            if ( backtracking==0 ) {
            rp1_tree = (Object)adaptor.create(rp1);
            adaptor.addChild(root_0, rp1_tree);
            }
            if ( backtracking==0 ) {
              	if (!isRecursive) {
              				emit(rp1, DroolsEditorType.SYMBOL);
              			} else {
              				emit(rp1, DroolsEditorType.CODE_CHUNK);
              			}	
              		
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end accumulate_paren_chunk_data

    public static class accumulate_id_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start accumulate_id_clause
    // src/main/resources/org/drools/lang/DRL.g:1016:1: accumulate_id_clause : ID paren_chunk -> ^( VT_ACCUMULATE_ID_CLAUSE ID paren_chunk ) ;
    public final accumulate_id_clause_return accumulate_id_clause() throws RecognitionException {
        accumulate_id_clause_return retval = new accumulate_id_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID182=null;
        paren_chunk_return paren_chunk183 = null;


        Object ID182_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_paren_chunk=new RewriteRuleSubtreeStream(adaptor,"rule paren_chunk");
        try {
            // src/main/resources/org/drools/lang/DRL.g:1017:2: ( ID paren_chunk -> ^( VT_ACCUMULATE_ID_CLAUSE ID paren_chunk ) )
            // src/main/resources/org/drools/lang/DRL.g:1017:4: ID paren_chunk
            {
            ID182=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_accumulate_id_clause3211); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(ID182);

            if ( backtracking==0 ) {
              	emit(ID182, DroolsEditorType.IDENTIFIER);	
            }
            pushFollow(FOLLOW_paren_chunk_in_accumulate_id_clause3217);
            paren_chunk183=paren_chunk();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_paren_chunk.add(paren_chunk183.getTree());

            // AST REWRITE
            // elements: paren_chunk, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1019:2: -> ^( VT_ACCUMULATE_ID_CLAUSE ID paren_chunk )
            {
                // src/main/resources/org/drools/lang/DRL.g:1019:5: ^( VT_ACCUMULATE_ID_CLAUSE ID paren_chunk )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(VT_ACCUMULATE_ID_CLAUSE, "VT_ACCUMULATE_ID_CLAUSE"), root_1);

                adaptor.addChild(root_1, stream_ID.next());
                adaptor.addChild(root_1, stream_paren_chunk.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end accumulate_id_clause

    public static class collect_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start collect_statement
    // src/main/resources/org/drools/lang/DRL.g:1022:1: collect_statement : COLLECT LEFT_PAREN pattern_source RIGHT_PAREN -> ^( COLLECT pattern_source RIGHT_PAREN ) ;
    public final collect_statement_return collect_statement() throws RecognitionException {
        collect_statement_return retval = new collect_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLLECT184=null;
        Token LEFT_PAREN185=null;
        Token RIGHT_PAREN187=null;
        pattern_source_return pattern_source186 = null;


        Object COLLECT184_tree=null;
        Object LEFT_PAREN185_tree=null;
        Object RIGHT_PAREN187_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_COLLECT=new RewriteRuleTokenStream(adaptor,"token COLLECT");
        RewriteRuleSubtreeStream stream_pattern_source=new RewriteRuleSubtreeStream(adaptor,"rule pattern_source");
        try {
            // src/main/resources/org/drools/lang/DRL.g:1023:2: ( COLLECT LEFT_PAREN pattern_source RIGHT_PAREN -> ^( COLLECT pattern_source RIGHT_PAREN ) )
            // src/main/resources/org/drools/lang/DRL.g:1023:4: COLLECT LEFT_PAREN pattern_source RIGHT_PAREN
            {
            COLLECT184=(Token)input.LT(1);
            match(input,COLLECT,FOLLOW_COLLECT_in_collect_statement3239); if (failed) return retval;
            if ( backtracking==0 ) stream_COLLECT.add(COLLECT184);

            if ( backtracking==0 ) {
              	emit(COLLECT184, DroolsEditorType.KEYWORD);	
            }
            if ( backtracking==0 ) {
              	emit(Location.LOCATION_LHS_FROM_COLLECT);	
            }
            LEFT_PAREN185=(Token)input.LT(1);
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_collect_statement3248); if (failed) return retval;
            if ( backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN185);

            if ( backtracking==0 ) {
              	emit(LEFT_PAREN185, DroolsEditorType.SYMBOL);	
            }
            pushFollow(FOLLOW_pattern_source_in_collect_statement3255);
            pattern_source186=pattern_source();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_pattern_source.add(pattern_source186.getTree());
            RIGHT_PAREN187=(Token)input.LT(1);
            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_collect_statement3260); if (failed) return retval;
            if ( backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN187);

            if ( backtracking==0 ) {
              	emit(RIGHT_PAREN187, DroolsEditorType.SYMBOL);	
            }
            if ( backtracking==0 ) {
              	emit(Location.LOCATION_LHS_BEGIN_OF_CONDITION);	
            }

            // AST REWRITE
            // elements: COLLECT, RIGHT_PAREN, pattern_source
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1029:2: -> ^( COLLECT pattern_source RIGHT_PAREN )
            {
                // src/main/resources/org/drools/lang/DRL.g:1029:5: ^( COLLECT pattern_source RIGHT_PAREN )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_COLLECT.next(), root_1);

                adaptor.addChild(root_1, stream_pattern_source.next());
                adaptor.addChild(root_1, stream_RIGHT_PAREN.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end collect_statement

    public static class entrypoint_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start entrypoint_statement
    // src/main/resources/org/drools/lang/DRL.g:1032:1: entrypoint_statement : entry_point_key entrypoint_id -> ^( entry_point_key entrypoint_id ) ;
    public final entrypoint_statement_return entrypoint_statement() throws RecognitionException {
        entrypoint_statement_return retval = new entrypoint_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        entry_point_key_return entry_point_key188 = null;

        entrypoint_id_return entrypoint_id189 = null;


        RewriteRuleSubtreeStream stream_entrypoint_id=new RewriteRuleSubtreeStream(adaptor,"rule entrypoint_id");
        RewriteRuleSubtreeStream stream_entry_point_key=new RewriteRuleSubtreeStream(adaptor,"rule entry_point_key");
        try {
            // src/main/resources/org/drools/lang/DRL.g:1033:2: ( entry_point_key entrypoint_id -> ^( entry_point_key entrypoint_id ) )
            // src/main/resources/org/drools/lang/DRL.g:1033:4: entry_point_key entrypoint_id
            {
            pushFollow(FOLLOW_entry_point_key_in_entrypoint_statement3287);
            entry_point_key188=entry_point_key();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_entry_point_key.add(entry_point_key188.getTree());
            if ( backtracking==0 ) {
              	emit(Location.LOCATION_LHS_FROM_COLLECT);	
            }
            pushFollow(FOLLOW_entrypoint_id_in_entrypoint_statement3295);
            entrypoint_id189=entrypoint_id();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_entrypoint_id.add(entrypoint_id189.getTree());
            if ( backtracking==0 ) {
              	emit(Location.LOCATION_LHS_BEGIN_OF_CONDITION);	
            }

            // AST REWRITE
            // elements: entry_point_key, entrypoint_id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1037:2: -> ^( entry_point_key entrypoint_id )
            {
                // src/main/resources/org/drools/lang/DRL.g:1037:5: ^( entry_point_key entrypoint_id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_entry_point_key.nextNode(), root_1);

                adaptor.addChild(root_1, stream_entrypoint_id.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end entrypoint_statement

    public static class entrypoint_id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start entrypoint_id
    // src/main/resources/org/drools/lang/DRL.g:1040:1: entrypoint_id : (value= ID -> VT_ENTRYPOINT_ID[$value] | value= STRING -> VT_ENTRYPOINT_ID[$value] );
    public final entrypoint_id_return entrypoint_id() throws RecognitionException {
        entrypoint_id_return retval = new entrypoint_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token value=null;

        Object value_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // src/main/resources/org/drools/lang/DRL.g:1041:2: (value= ID -> VT_ENTRYPOINT_ID[$value] | value= STRING -> VT_ENTRYPOINT_ID[$value] )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==ID) ) {
                alt66=1;
            }
            else if ( (LA66_0==STRING) ) {
                alt66=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1040:1: entrypoint_id : (value= ID -> VT_ENTRYPOINT_ID[$value] | value= STRING -> VT_ENTRYPOINT_ID[$value] );", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:1041:5: value= ID
                    {
                    value=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_entrypoint_id3321); if (failed) return retval;
                    if ( backtracking==0 ) stream_ID.add(value);

                    if ( backtracking==0 ) {
                      	emit(value, DroolsEditorType.IDENTIFIER);	
                    }

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1042:3: -> VT_ENTRYPOINT_ID[$value]
                    {
                        adaptor.addChild(root_0, adaptor.create(VT_ENTRYPOINT_ID, value));

                    }

                    }

                    }
                    break;
                case 2 :
                    // src/main/resources/org/drools/lang/DRL.g:1043:5: value= STRING
                    {
                    value=(Token)input.LT(1);
                    match(input,STRING,FOLLOW_STRING_in_entrypoint_id3338); if (failed) return retval;
                    if ( backtracking==0 ) stream_STRING.add(value);

                    if ( backtracking==0 ) {
                      	emit(value, DroolsEditorType.IDENTIFIER);	
                    }

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1044:3: -> VT_ENTRYPOINT_ID[$value]
                    {
                        adaptor.addChild(root_0, adaptor.create(VT_ENTRYPOINT_ID, value));

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end entrypoint_id

    public static class from_source_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start from_source
    // src/main/resources/org/drools/lang/DRL.g:1047:1: from_source : ID ( ( LEFT_PAREN )=>args= paren_chunk )? ( expression_chain )? -> ^( VT_FROM_SOURCE ID ( paren_chunk )? ( expression_chain )? ) ;
    public final from_source_return from_source() throws RecognitionException {
        from_source_return retval = new from_source_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID190=null;
        paren_chunk_return args = null;

        expression_chain_return expression_chain191 = null;


        Object ID190_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_paren_chunk=new RewriteRuleSubtreeStream(adaptor,"rule paren_chunk");
        RewriteRuleSubtreeStream stream_expression_chain=new RewriteRuleSubtreeStream(adaptor,"rule expression_chain");
        try {
            // src/main/resources/org/drools/lang/DRL.g:1048:2: ( ID ( ( LEFT_PAREN )=>args= paren_chunk )? ( expression_chain )? -> ^( VT_FROM_SOURCE ID ( paren_chunk )? ( expression_chain )? ) )
            // src/main/resources/org/drools/lang/DRL.g:1048:4: ID ( ( LEFT_PAREN )=>args= paren_chunk )? ( expression_chain )?
            {
            ID190=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_from_source3358); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(ID190);

            if ( backtracking==0 ) {
              	emit(ID190, DroolsEditorType.IDENTIFIER);	
            }
            // src/main/resources/org/drools/lang/DRL.g:1049:3: ( ( LEFT_PAREN )=>args= paren_chunk )?
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:1049:5: ( LEFT_PAREN )=>args= paren_chunk
                    {
                    pushFollow(FOLLOW_paren_chunk_in_from_source3373);
                    args=paren_chunk();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_paren_chunk.add(args.getTree());

                    }
                    break;

            }

            // src/main/resources/org/drools/lang/DRL.g:1050:3: ( expression_chain )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==DOT) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:1050:3: expression_chain
                    {
                    pushFollow(FOLLOW_expression_chain_in_from_source3380);
                    expression_chain191=expression_chain();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_expression_chain.add(expression_chain191.getTree());

                    }
                    break;

            }

            if ( backtracking==0 ) {
              	if ( input.LA(1) == EOF && input.get(input.index() - 1).getType() == WS) {
              			emit(Location.LOCATION_LHS_BEGIN_OF_CONDITION);
              		} else if ( input.LA(1) != EOF ) {
              			emit(Location.LOCATION_LHS_BEGIN_OF_CONDITION);
              		}	
            }

            // AST REWRITE
            // elements: expression_chain, paren_chunk, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1056:2: -> ^( VT_FROM_SOURCE ID ( paren_chunk )? ( expression_chain )? )
            {
                // src/main/resources/org/drools/lang/DRL.g:1056:5: ^( VT_FROM_SOURCE ID ( paren_chunk )? ( expression_chain )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(VT_FROM_SOURCE, "VT_FROM_SOURCE"), root_1);

                adaptor.addChild(root_1, stream_ID.next());
                // src/main/resources/org/drools/lang/DRL.g:1056:25: ( paren_chunk )?
                if ( stream_paren_chunk.hasNext() ) {
                    adaptor.addChild(root_1, stream_paren_chunk.next());

                }
                stream_paren_chunk.reset();
                // src/main/resources/org/drools/lang/DRL.g:1056:38: ( expression_chain )?
                if ( stream_expression_chain.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression_chain.next());

                }
                stream_expression_chain.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end from_source

    public static class expression_chain_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start expression_chain
    // src/main/resources/org/drools/lang/DRL.g:1059:1: expression_chain : DOT ID ({...}? paren_chunk | square_chunk )? ( expression_chain )? -> ^( VT_EXPRESSION_CHAIN[$DOT] ID ( square_chunk )? ( paren_chunk )? ( expression_chain )? ) ;
    public final expression_chain_return expression_chain() throws RecognitionException {
        expression_chain_return retval = new expression_chain_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT192=null;
        Token ID193=null;
        paren_chunk_return paren_chunk194 = null;

        square_chunk_return square_chunk195 = null;

        expression_chain_return expression_chain196 = null;


        Object DOT192_tree=null;
        Object ID193_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_paren_chunk=new RewriteRuleSubtreeStream(adaptor,"rule paren_chunk");
        RewriteRuleSubtreeStream stream_square_chunk=new RewriteRuleSubtreeStream(adaptor,"rule square_chunk");
        RewriteRuleSubtreeStream stream_expression_chain=new RewriteRuleSubtreeStream(adaptor,"rule expression_chain");
        try {
            // src/main/resources/org/drools/lang/DRL.g:1060:2: ( DOT ID ({...}? paren_chunk | square_chunk )? ( expression_chain )? -> ^( VT_EXPRESSION_CHAIN[$DOT] ID ( square_chunk )? ( paren_chunk )? ( expression_chain )? ) )
            // src/main/resources/org/drools/lang/DRL.g:1061:3: DOT ID ({...}? paren_chunk | square_chunk )? ( expression_chain )?
            {
            DOT192=(Token)input.LT(1);
            match(input,DOT,FOLLOW_DOT_in_expression_chain3413); if (failed) return retval;
            if ( backtracking==0 ) stream_DOT.add(DOT192);

            if ( backtracking==0 ) {
              	emit(DOT192, DroolsEditorType.IDENTIFIER);	
            }
            ID193=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_expression_chain3420); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(ID193);

            if ( backtracking==0 ) {
              	emit(ID193, DroolsEditorType.IDENTIFIER);	
            }
            // src/main/resources/org/drools/lang/DRL.g:1063:4: ({...}? paren_chunk | square_chunk )?
            int alt69=3;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:1064:6: {...}? paren_chunk
                    {
                    if ( !(input.LA(1) == LEFT_PAREN) ) {
                        if (backtracking>0) {failed=true; return retval;}
                        throw new FailedPredicateException(input, "expression_chain", "input.LA(1) == LEFT_PAREN");
                    }
                    pushFollow(FOLLOW_paren_chunk_in_expression_chain3436);
                    paren_chunk194=paren_chunk();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_paren_chunk.add(paren_chunk194.getTree());

                    }
                    break;
                case 2 :
                    // src/main/resources/org/drools/lang/DRL.g:1066:6: square_chunk
                    {
                    pushFollow(FOLLOW_square_chunk_in_expression_chain3450);
                    square_chunk195=square_chunk();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_square_chunk.add(square_chunk195.getTree());

                    }
                    break;

            }

            // src/main/resources/org/drools/lang/DRL.g:1068:4: ( expression_chain )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==DOT) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:1068:4: expression_chain
                    {
                    pushFollow(FOLLOW_expression_chain_in_expression_chain3461);
                    expression_chain196=expression_chain();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_expression_chain.add(expression_chain196.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: paren_chunk, expression_chain, ID, square_chunk
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1069:4: -> ^( VT_EXPRESSION_CHAIN[$DOT] ID ( square_chunk )? ( paren_chunk )? ( expression_chain )? )
            {
                // src/main/resources/org/drools/lang/DRL.g:1069:7: ^( VT_EXPRESSION_CHAIN[$DOT] ID ( square_chunk )? ( paren_chunk )? ( expression_chain )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(VT_EXPRESSION_CHAIN, DOT192), root_1);

                adaptor.addChild(root_1, stream_ID.next());
                // src/main/resources/org/drools/lang/DRL.g:1069:38: ( square_chunk )?
                if ( stream_square_chunk.hasNext() ) {
                    adaptor.addChild(root_1, stream_square_chunk.next());

                }
                stream_square_chunk.reset();
                // src/main/resources/org/drools/lang/DRL.g:1069:52: ( paren_chunk )?
                if ( stream_paren_chunk.hasNext() ) {
                    adaptor.addChild(root_1, stream_paren_chunk.next());

                }
                stream_paren_chunk.reset();
                // src/main/resources/org/drools/lang/DRL.g:1069:65: ( expression_chain )?
                if ( stream_expression_chain.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression_chain.next());

                }
                stream_expression_chain.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end expression_chain

    public static class lhs_pattern_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start lhs_pattern
    // src/main/resources/org/drools/lang/DRL.g:1072:1: lhs_pattern : ( fact_binding -> ^( VT_PATTERN fact_binding ) | fact -> ^( VT_PATTERN fact ) );
    public final lhs_pattern_return lhs_pattern() throws RecognitionException {
        lhs_pattern_return retval = new lhs_pattern_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        fact_binding_return fact_binding197 = null;

        fact_return fact198 = null;


        RewriteRuleSubtreeStream stream_fact_binding=new RewriteRuleSubtreeStream(adaptor,"rule fact_binding");
        RewriteRuleSubtreeStream stream_fact=new RewriteRuleSubtreeStream(adaptor,"rule fact");
        try {
            // src/main/resources/org/drools/lang/DRL.g:1073:2: ( fact_binding -> ^( VT_PATTERN fact_binding ) | fact -> ^( VT_PATTERN fact ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==ID) ) {
                int LA71_1 = input.LA(2);

                if ( (LA71_1==COLON) ) {
                    alt71=1;
                }
                else if ( (LA71_1==DOT||LA71_1==LEFT_PAREN||LA71_1==LEFT_SQUARE) ) {
                    alt71=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("1072:1: lhs_pattern : ( fact_binding -> ^( VT_PATTERN fact_binding ) | fact -> ^( VT_PATTERN fact ) );", 71, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1072:1: lhs_pattern : ( fact_binding -> ^( VT_PATTERN fact_binding ) | fact -> ^( VT_PATTERN fact ) );", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:1073:4: fact_binding
                    {
                    pushFollow(FOLLOW_fact_binding_in_lhs_pattern3494);
                    fact_binding197=fact_binding();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_fact_binding.add(fact_binding197.getTree());

                    // AST REWRITE
                    // elements: fact_binding
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1073:17: -> ^( VT_PATTERN fact_binding )
                    {
                        // src/main/resources/org/drools/lang/DRL.g:1073:20: ^( VT_PATTERN fact_binding )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(VT_PATTERN, "VT_PATTERN"), root_1);

                        adaptor.addChild(root_1, stream_fact_binding.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // src/main/resources/org/drools/lang/DRL.g:1074:4: fact
                    {
                    pushFollow(FOLLOW_fact_in_lhs_pattern3507);
                    fact198=fact();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_fact.add(fact198.getTree());

                    // AST REWRITE
                    // elements: fact
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1074:9: -> ^( VT_PATTERN fact )
                    {
                        // src/main/resources/org/drools/lang/DRL.g:1074:12: ^( VT_PATTERN fact )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(VT_PATTERN, "VT_PATTERN"), root_1);

                        adaptor.addChild(root_1, stream_fact.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end lhs_pattern

    public static class fact_binding_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start fact_binding
    // src/main/resources/org/drools/lang/DRL.g:1077:1: fact_binding : label ( fact | LEFT_PAREN fact_binding_expression RIGHT_PAREN ) -> ^( VT_FACT_BINDING label ( fact )? ( fact_binding_expression )? ( RIGHT_PAREN )? ) ;
    public final fact_binding_return fact_binding() throws RecognitionException {
        fact_binding_return retval = new fact_binding_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_PAREN201=null;
        Token RIGHT_PAREN203=null;
        label_return label199 = null;

        fact_return fact200 = null;

        fact_binding_expression_return fact_binding_expression202 = null;


        Object LEFT_PAREN201_tree=null;
        Object RIGHT_PAREN203_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleSubtreeStream stream_fact=new RewriteRuleSubtreeStream(adaptor,"rule fact");
        RewriteRuleSubtreeStream stream_fact_binding_expression=new RewriteRuleSubtreeStream(adaptor,"rule fact_binding_expression");
        RewriteRuleSubtreeStream stream_label=new RewriteRuleSubtreeStream(adaptor,"rule label");
        try {
            // src/main/resources/org/drools/lang/DRL.g:1078:3: ( label ( fact | LEFT_PAREN fact_binding_expression RIGHT_PAREN ) -> ^( VT_FACT_BINDING label ( fact )? ( fact_binding_expression )? ( RIGHT_PAREN )? ) )
            // src/main/resources/org/drools/lang/DRL.g:1078:5: label ( fact | LEFT_PAREN fact_binding_expression RIGHT_PAREN )
            {
            pushFollow(FOLLOW_label_in_fact_binding3527);
            label199=label();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_label.add(label199.getTree());
            // src/main/resources/org/drools/lang/DRL.g:1079:3: ( fact | LEFT_PAREN fact_binding_expression RIGHT_PAREN )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==ID) ) {
                alt72=1;
            }
            else if ( (LA72_0==LEFT_PAREN) ) {
                alt72=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1079:3: ( fact | LEFT_PAREN fact_binding_expression RIGHT_PAREN )", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:1079:5: fact
                    {
                    pushFollow(FOLLOW_fact_in_fact_binding3533);
                    fact200=fact();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_fact.add(fact200.getTree());

                    }
                    break;
                case 2 :
                    // src/main/resources/org/drools/lang/DRL.g:1080:6: LEFT_PAREN fact_binding_expression RIGHT_PAREN
                    {
                    LEFT_PAREN201=(Token)input.LT(1);
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_fact_binding3540); if (failed) return retval;
                    if ( backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN201);

                    if ( backtracking==0 ) {
                      	emit(LEFT_PAREN201, DroolsEditorType.SYMBOL);	
                    }
                    pushFollow(FOLLOW_fact_binding_expression_in_fact_binding3548);
                    fact_binding_expression202=fact_binding_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_fact_binding_expression.add(fact_binding_expression202.getTree());
                    RIGHT_PAREN203=(Token)input.LT(1);
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_fact_binding3556); if (failed) return retval;
                    if ( backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN203);

                    if ( backtracking==0 ) {
                      	emit(RIGHT_PAREN203, DroolsEditorType.SYMBOL);	
                    }

                    }
                    break;

            }


            // AST REWRITE
            // elements: fact_binding_expression, fact, label, RIGHT_PAREN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1084:3: -> ^( VT_FACT_BINDING label ( fact )? ( fact_binding_expression )? ( RIGHT_PAREN )? )
            {
                // src/main/resources/org/drools/lang/DRL.g:1084:6: ^( VT_FACT_BINDING label ( fact )? ( fact_binding_expression )? ( RIGHT_PAREN )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(VT_FACT_BINDING, "VT_FACT_BINDING"), root_1);

                adaptor.addChild(root_1, stream_label.next());
                // src/main/resources/org/drools/lang/DRL.g:1084:30: ( fact )?
                if ( stream_fact.hasNext() ) {
                    adaptor.addChild(root_1, stream_fact.next());

                }
                stream_fact.reset();
                // src/main/resources/org/drools/lang/DRL.g:1084:36: ( fact_binding_expression )?
                if ( stream_fact_binding_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_fact_binding_expression.next());

                }
                stream_fact_binding_expression.reset();
                // src/main/resources/org/drools/lang/DRL.g:1084:61: ( RIGHT_PAREN )?
                if ( stream_RIGHT_PAREN.hasNext() ) {
                    adaptor.addChild(root_1, stream_RIGHT_PAREN.next());

                }
                stream_RIGHT_PAREN.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end fact_binding

    public static class fact_binding_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start fact_binding_expression
    // src/main/resources/org/drools/lang/DRL.g:1087:1: fact_binding_expression : ( fact -> fact ) ( (value= or_key | pipe= DOUBLE_PIPE ) fact -> ^( VT_FACT_OR[orToken] $fact_binding_expression fact ) )* ;
    public final fact_binding_expression_return fact_binding_expression() throws RecognitionException {
        fact_binding_expression_return retval = new fact_binding_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token pipe=null;
        or_key_return value = null;

        fact_return fact204 = null;

        fact_return fact205 = null;


        Object pipe_tree=null;
        RewriteRuleTokenStream stream_DOUBLE_PIPE=new RewriteRuleTokenStream(adaptor,"token DOUBLE_PIPE");
        RewriteRuleSubtreeStream stream_fact=new RewriteRuleSubtreeStream(adaptor,"rule fact");
        RewriteRuleSubtreeStream stream_or_key=new RewriteRuleSubtreeStream(adaptor,"rule or_key");

        	Token orToken = null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:1090:3: ( ( fact -> fact ) ( (value= or_key | pipe= DOUBLE_PIPE ) fact -> ^( VT_FACT_OR[orToken] $fact_binding_expression fact ) )* )
            // src/main/resources/org/drools/lang/DRL.g:1090:5: ( fact -> fact ) ( (value= or_key | pipe= DOUBLE_PIPE ) fact -> ^( VT_FACT_OR[orToken] $fact_binding_expression fact ) )*
            {
            // src/main/resources/org/drools/lang/DRL.g:1090:5: ( fact -> fact )
            // src/main/resources/org/drools/lang/DRL.g:1090:6: fact
            {
            pushFollow(FOLLOW_fact_in_fact_binding_expression3597);
            fact204=fact();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_fact.add(fact204.getTree());

            // AST REWRITE
            // elements: fact
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1090:11: -> fact
            {
                adaptor.addChild(root_0, stream_fact.next());

            }

            }

            }

            // src/main/resources/org/drools/lang/DRL.g:1090:20: ( (value= or_key | pipe= DOUBLE_PIPE ) fact -> ^( VT_FACT_OR[orToken] $fact_binding_expression fact ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==ID) && ((validateIdentifierKey(DroolsSoftKeywords.OR)))) {
                    alt74=1;
                }
                else if ( (LA74_0==DOUBLE_PIPE) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:1090:22: (value= or_key | pipe= DOUBLE_PIPE ) fact
            	    {
            	    // src/main/resources/org/drools/lang/DRL.g:1090:22: (value= or_key | pipe= DOUBLE_PIPE )
            	    int alt73=2;
            	    int LA73_0 = input.LA(1);

            	    if ( (LA73_0==ID) && ((validateIdentifierKey(DroolsSoftKeywords.OR)))) {
            	        alt73=1;
            	    }
            	    else if ( (LA73_0==DOUBLE_PIPE) ) {
            	        alt73=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("1090:22: (value= or_key | pipe= DOUBLE_PIPE )", 73, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt73) {
            	        case 1 :
            	            // src/main/resources/org/drools/lang/DRL.g:1090:23: value= or_key
            	            {
            	            pushFollow(FOLLOW_or_key_in_fact_binding_expression3609);
            	            value=or_key();
            	            _fsp--;
            	            if (failed) return retval;
            	            if ( backtracking==0 ) stream_or_key.add(value.getTree());
            	            if ( backtracking==0 ) {
            	              orToken = ((Token)value.start);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // src/main/resources/org/drools/lang/DRL.g:1090:62: pipe= DOUBLE_PIPE
            	            {
            	            pipe=(Token)input.LT(1);
            	            match(input,DOUBLE_PIPE,FOLLOW_DOUBLE_PIPE_in_fact_binding_expression3615); if (failed) return retval;
            	            if ( backtracking==0 ) stream_DOUBLE_PIPE.add(pipe);

            	            if ( backtracking==0 ) {
            	              orToken = pipe;
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_fact_in_fact_binding_expression3620);
            	    fact205=fact();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_fact.add(fact205.getTree());

            	    // AST REWRITE
            	    // elements: fact_binding_expression, fact
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    if ( backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 1091:3: -> ^( VT_FACT_OR[orToken] $fact_binding_expression fact )
            	    {
            	        // src/main/resources/org/drools/lang/DRL.g:1091:6: ^( VT_FACT_OR[orToken] $fact_binding_expression fact )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(VT_FACT_OR, orToken), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_fact.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    }

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end fact_binding_expression

    public static class fact_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start fact
    // src/main/resources/org/drools/lang/DRL.g:1094:1: fact : pattern_type LEFT_PAREN ( constraints )? RIGHT_PAREN -> ^( VT_FACT pattern_type ( constraints )? RIGHT_PAREN ) ;
    public final fact_return fact() throws RecognitionException {
        fact_return retval = new fact_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_PAREN207=null;
        Token RIGHT_PAREN209=null;
        pattern_type_return pattern_type206 = null;

        constraints_return constraints208 = null;


        Object LEFT_PAREN207_tree=null;
        Object RIGHT_PAREN209_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleSubtreeStream stream_constraints=new RewriteRuleSubtreeStream(adaptor,"rule constraints");
        RewriteRuleSubtreeStream stream_pattern_type=new RewriteRuleSubtreeStream(adaptor,"rule pattern_type");
         boolean isFailedOnConstraints = true; pushParaphrases(DroolsParaphraseTypes.PATTERN); 
        try {
            // src/main/resources/org/drools/lang/DRL.g:1097:2: ( pattern_type LEFT_PAREN ( constraints )? RIGHT_PAREN -> ^( VT_FACT pattern_type ( constraints )? RIGHT_PAREN ) )
            // src/main/resources/org/drools/lang/DRL.g:1097:4: pattern_type LEFT_PAREN ( constraints )? RIGHT_PAREN
            {
            pushFollow(FOLLOW_pattern_type_in_fact3660);
            pattern_type206=pattern_type();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_pattern_type.add(pattern_type206.getTree());
            LEFT_PAREN207=(Token)input.LT(1);
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_fact3665); if (failed) return retval;
            if ( backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN207);

            if ( backtracking==0 ) {
              	emit(LEFT_PAREN207, DroolsEditorType.SYMBOL);	
            }
            if ( backtracking==0 ) {
              	emit(Location.LOCATION_LHS_INSIDE_CONDITION_START);	
            }
            // src/main/resources/org/drools/lang/DRL.g:1100:4: ( constraints )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==ID||LA75_0==LEFT_PAREN) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:1100:4: constraints
                    {
                    pushFollow(FOLLOW_constraints_in_fact3676);
                    constraints208=constraints();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_constraints.add(constraints208.getTree());

                    }
                    break;

            }

            RIGHT_PAREN209=(Token)input.LT(1);
            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_fact3682); if (failed) return retval;
            if ( backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN209);

            if ( backtracking==0 ) {
              	isFailedOnConstraints = false;	
            }
            if ( backtracking==0 ) {
              	if (RIGHT_PAREN209.getText().equals(")") ){ //WORKAROUND FOR ANTLR BUG!
              			emit(RIGHT_PAREN209, DroolsEditorType.SYMBOL);
              			emit(Location.LOCATION_LHS_BEGIN_OF_CONDITION);
              		}	
            }

            // AST REWRITE
            // elements: pattern_type, constraints, RIGHT_PAREN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1106:2: -> ^( VT_FACT pattern_type ( constraints )? RIGHT_PAREN )
            {
                // src/main/resources/org/drools/lang/DRL.g:1106:5: ^( VT_FACT pattern_type ( constraints )? RIGHT_PAREN )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(VT_FACT, "VT_FACT"), root_1);

                adaptor.addChild(root_1, stream_pattern_type.next());
                // src/main/resources/org/drools/lang/DRL.g:1106:28: ( constraints )?
                if ( stream_constraints.hasNext() ) {
                    adaptor.addChild(root_1, stream_constraints.next());

                }
                stream_constraints.reset();
                adaptor.addChild(root_1, stream_RIGHT_PAREN.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( backtracking==0 ) {
               paraphrases.pop();	
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (isEditorInterfaceEnabled && isFailedOnConstraints && input.LA(1) == EOF && input.get(input.index() - 1).getType() == WS){
            		if (!(getActiveSentence().getContent().getLast() instanceof Integer) && input.LA(-1) != COLON) {
            			emit(Location.LOCATION_LHS_INSIDE_CONDITION_OPERATOR);
            		}
            	}

        }
        return retval;
    }
    // $ANTLR end fact

    public static class constraints_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start constraints
    // src/main/resources/org/drools/lang/DRL.g:1116:1: constraints : constraint ( COMMA constraint )* ;
    public final constraints_return constraints() throws RecognitionException {
        constraints_return retval = new constraints_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA211=null;
        constraint_return constraint210 = null;

        constraint_return constraint212 = null;


        Object COMMA211_tree=null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:1117:2: ( constraint ( COMMA constraint )* )
            // src/main/resources/org/drools/lang/DRL.g:1117:4: constraint ( COMMA constraint )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_constraint_in_constraints3716);
            constraint210=constraint();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, constraint210.getTree());
            // src/main/resources/org/drools/lang/DRL.g:1117:15: ( COMMA constraint )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==COMMA) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:1117:17: COMMA constraint
            	    {
            	    COMMA211=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_constraints3720); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	      	emit(COMMA211, DroolsEditorType.SYMBOL);
            	      		emit(Location.LOCATION_LHS_INSIDE_CONDITION_START);	
            	    }
            	    pushFollow(FOLLOW_constraint_in_constraints3727);
            	    constraint212=constraint();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, constraint212.getTree());

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end constraints

    public static class constraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start constraint
    // src/main/resources/org/drools/lang/DRL.g:1122:1: constraint : or_constr ;
    public final constraint_return constraint() throws RecognitionException {
        constraint_return retval = new constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        or_constr_return or_constr213 = null;



        try {
            // src/main/resources/org/drools/lang/DRL.g:1123:2: ( or_constr )
            // src/main/resources/org/drools/lang/DRL.g:1123:4: or_constr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_or_constr_in_constraint3741);
            or_constr213=or_constr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, or_constr213.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end constraint

    public static class or_constr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start or_constr
    // src/main/resources/org/drools/lang/DRL.g:1126:1: or_constr : and_constr ( DOUBLE_PIPE and_constr )* ;
    public final or_constr_return or_constr() throws RecognitionException {
        or_constr_return retval = new or_constr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOUBLE_PIPE215=null;
        and_constr_return and_constr214 = null;

        and_constr_return and_constr216 = null;


        Object DOUBLE_PIPE215_tree=null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:1127:2: ( and_constr ( DOUBLE_PIPE and_constr )* )
            // src/main/resources/org/drools/lang/DRL.g:1127:4: and_constr ( DOUBLE_PIPE and_constr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_and_constr_in_or_constr3752);
            and_constr214=and_constr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, and_constr214.getTree());
            // src/main/resources/org/drools/lang/DRL.g:1127:15: ( DOUBLE_PIPE and_constr )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==DOUBLE_PIPE) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:1127:17: DOUBLE_PIPE and_constr
            	    {
            	    DOUBLE_PIPE215=(Token)input.LT(1);
            	    match(input,DOUBLE_PIPE,FOLLOW_DOUBLE_PIPE_in_or_constr3756); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    DOUBLE_PIPE215_tree = (Object)adaptor.create(DOUBLE_PIPE215);
            	    root_0 = (Object)adaptor.becomeRoot(DOUBLE_PIPE215_tree, root_0);
            	    }
            	    if ( backtracking==0 ) {
            	      	emit(DOUBLE_PIPE215, DroolsEditorType.SYMBOL);	
            	    }
            	    pushFollow(FOLLOW_and_constr_in_or_constr3763);
            	    and_constr216=and_constr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, and_constr216.getTree());

            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end or_constr

    public static class and_constr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start and_constr
    // src/main/resources/org/drools/lang/DRL.g:1131:1: and_constr : unary_constr ( DOUBLE_AMPER unary_constr )* ;
    public final and_constr_return and_constr() throws RecognitionException {
        and_constr_return retval = new and_constr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOUBLE_AMPER218=null;
        unary_constr_return unary_constr217 = null;

        unary_constr_return unary_constr219 = null;


        Object DOUBLE_AMPER218_tree=null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:1132:2: ( unary_constr ( DOUBLE_AMPER unary_constr )* )
            // src/main/resources/org/drools/lang/DRL.g:1132:4: unary_constr ( DOUBLE_AMPER unary_constr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unary_constr_in_and_constr3778);
            unary_constr217=unary_constr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, unary_constr217.getTree());
            // src/main/resources/org/drools/lang/DRL.g:1132:17: ( DOUBLE_AMPER unary_constr )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==DOUBLE_AMPER) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:1132:19: DOUBLE_AMPER unary_constr
            	    {
            	    DOUBLE_AMPER218=(Token)input.LT(1);
            	    match(input,DOUBLE_AMPER,FOLLOW_DOUBLE_AMPER_in_and_constr3782); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    DOUBLE_AMPER218_tree = (Object)adaptor.create(DOUBLE_AMPER218);
            	    root_0 = (Object)adaptor.becomeRoot(DOUBLE_AMPER218_tree, root_0);
            	    }
            	    if ( backtracking==0 ) {
            	      	emit(DOUBLE_AMPER218, DroolsEditorType.SYMBOL);;	
            	    }
            	    pushFollow(FOLLOW_unary_constr_in_and_constr3789);
            	    unary_constr219=unary_constr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, unary_constr219.getTree());

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end and_constr

    public static class unary_constr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start unary_constr
    // src/main/resources/org/drools/lang/DRL.g:1136:1: unary_constr options {k=2; } : ( eval_key paren_chunk | field_constraint | LEFT_PAREN or_constr RIGHT_PAREN );
    public final unary_constr_return unary_constr() throws RecognitionException {
        unary_constr_return retval = new unary_constr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_PAREN223=null;
        Token RIGHT_PAREN225=null;
        eval_key_return eval_key220 = null;

        paren_chunk_return paren_chunk221 = null;

        field_constraint_return field_constraint222 = null;

        or_constr_return or_constr224 = null;


        Object LEFT_PAREN223_tree=null;
        Object RIGHT_PAREN225_tree=null;

         boolean isFailed = true;	
        try {
            // src/main/resources/org/drools/lang/DRL.g:1140:2: ( eval_key paren_chunk | field_constraint | LEFT_PAREN or_constr RIGHT_PAREN )
            int alt79=3;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==ID) ) {
                int LA79_1 = input.LA(2);

                if ( ((LA79_1>=ID && LA79_1<=DOT)||LA79_1==COLON||(LA79_1>=EQUAL && LA79_1<=GRAVE_ACCENT)||LA79_1==LEFT_SQUARE) ) {
                    alt79=2;
                }
                else if ( (LA79_1==LEFT_PAREN) ) {
                    int LA79_4 = input.LA(3);

                    if ( ((validateIdentifierKey(DroolsSoftKeywords.EVAL))) ) {
                        alt79=1;
                    }
                    else if ( (true) ) {
                        alt79=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1136:1: unary_constr options {k=2; } : ( eval_key paren_chunk | field_constraint | LEFT_PAREN or_constr RIGHT_PAREN );", 79, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("1136:1: unary_constr options {k=2; } : ( eval_key paren_chunk | field_constraint | LEFT_PAREN or_constr RIGHT_PAREN );", 79, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA79_0==LEFT_PAREN) ) {
                alt79=3;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1136:1: unary_constr options {k=2; } : ( eval_key paren_chunk | field_constraint | LEFT_PAREN or_constr RIGHT_PAREN );", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:1140:4: eval_key paren_chunk
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_eval_key_in_unary_constr3822);
                    eval_key220=eval_key();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(eval_key220.getTree(), root_0);
                    pushFollow(FOLLOW_paren_chunk_in_unary_constr3825);
                    paren_chunk221=paren_chunk();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, paren_chunk221.getTree());

                    }
                    break;
                case 2 :
                    // src/main/resources/org/drools/lang/DRL.g:1141:4: field_constraint
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_field_constraint_in_unary_constr3830);
                    field_constraint222=field_constraint();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, field_constraint222.getTree());

                    }
                    break;
                case 3 :
                    // src/main/resources/org/drools/lang/DRL.g:1142:5: LEFT_PAREN or_constr RIGHT_PAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LEFT_PAREN223=(Token)input.LT(1);
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_unary_constr3836); if (failed) return retval;
                    if ( backtracking==0 ) {
                      	emit(LEFT_PAREN223, DroolsEditorType.SYMBOL);	
                    }
                    pushFollow(FOLLOW_or_constr_in_unary_constr3846);
                    or_constr224=or_constr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, or_constr224.getTree());
                    RIGHT_PAREN225=(Token)input.LT(1);
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_unary_constr3851); if (failed) return retval;
                    if ( backtracking==0 ) {
                    RIGHT_PAREN225_tree = (Object)adaptor.create(RIGHT_PAREN225);
                    adaptor.addChild(root_0, RIGHT_PAREN225_tree);
                    }
                    if ( backtracking==0 ) {
                      	emit(RIGHT_PAREN225, DroolsEditorType.SYMBOL);	
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( backtracking==0 ) {
               isFailed = false;	
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
             
            	if (isEditorInterfaceEnabled && isFailed && input.LA(2) == EOF && input.LA(1) == ID) {
            		emit(input.LT(1), DroolsEditorType.IDENTIFIER);
            		input.consume();
            		if (input.get(input.index() - 1).getType() == WS)
            			emit(Location.LOCATION_LHS_INSIDE_CONDITION_OPERATOR);
            	}

        }
        return retval;
    }
    // $ANTLR end unary_constr

    public static class field_constraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start field_constraint
    // src/main/resources/org/drools/lang/DRL.g:1155:1: field_constraint : ( label accessor_path ( or_restr_connective | arw= ARROW paren_chunk )? -> {isArrow}? ^( VT_BIND_FIELD label ^( VT_FIELD accessor_path ) ) ( ^( VK_EVAL[$arw] paren_chunk ) )? -> ^( VT_BIND_FIELD label ^( VT_FIELD accessor_path ( or_restr_connective )? ) ) | accessor_path or_restr_connective -> ^( VT_FIELD accessor_path or_restr_connective ) );
    public final field_constraint_return field_constraint() throws RecognitionException {
        field_constraint_return retval = new field_constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token arw=null;
        label_return label226 = null;

        accessor_path_return accessor_path227 = null;

        or_restr_connective_return or_restr_connective228 = null;

        paren_chunk_return paren_chunk229 = null;

        accessor_path_return accessor_path230 = null;

        or_restr_connective_return or_restr_connective231 = null;


        Object arw_tree=null;
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleSubtreeStream stream_paren_chunk=new RewriteRuleSubtreeStream(adaptor,"rule paren_chunk");
        RewriteRuleSubtreeStream stream_or_restr_connective=new RewriteRuleSubtreeStream(adaptor,"rule or_restr_connective");
        RewriteRuleSubtreeStream stream_label=new RewriteRuleSubtreeStream(adaptor,"rule label");
        RewriteRuleSubtreeStream stream_accessor_path=new RewriteRuleSubtreeStream(adaptor,"rule accessor_path");

        	boolean isArrow = false;

        try {
            // src/main/resources/org/drools/lang/DRL.g:1158:3: ( label accessor_path ( or_restr_connective | arw= ARROW paren_chunk )? -> {isArrow}? ^( VT_BIND_FIELD label ^( VT_FIELD accessor_path ) ) ( ^( VK_EVAL[$arw] paren_chunk ) )? -> ^( VT_BIND_FIELD label ^( VT_FIELD accessor_path ( or_restr_connective )? ) ) | accessor_path or_restr_connective -> ^( VT_FIELD accessor_path or_restr_connective ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==ID) ) {
                int LA81_1 = input.LA(2);

                if ( (LA81_1==COLON) ) {
                    alt81=1;
                }
                else if ( ((LA81_1>=ID && LA81_1<=DOT)||LA81_1==LEFT_PAREN||(LA81_1>=EQUAL && LA81_1<=GRAVE_ACCENT)||LA81_1==LEFT_SQUARE) ) {
                    alt81=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("1155:1: field_constraint : ( label accessor_path ( or_restr_connective | arw= ARROW paren_chunk )? -> {isArrow}? ^( VT_BIND_FIELD label ^( VT_FIELD accessor_path ) ) ( ^( VK_EVAL[$arw] paren_chunk ) )? -> ^( VT_BIND_FIELD label ^( VT_FIELD accessor_path ( or_restr_connective )? ) ) | accessor_path or_restr_connective -> ^( VT_FIELD accessor_path or_restr_connective ) );", 81, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1155:1: field_constraint : ( label accessor_path ( or_restr_connective | arw= ARROW paren_chunk )? -> {isArrow}? ^( VT_BIND_FIELD label ^( VT_FIELD accessor_path ) ) ( ^( VK_EVAL[$arw] paren_chunk ) )? -> ^( VT_BIND_FIELD label ^( VT_FIELD accessor_path ( or_restr_connective )? ) ) | accessor_path or_restr_connective -> ^( VT_FIELD accessor_path or_restr_connective ) );", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:1158:5: label accessor_path ( or_restr_connective | arw= ARROW paren_chunk )?
                    {
                    pushFollow(FOLLOW_label_in_field_constraint3871);
                    label226=label();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_label.add(label226.getTree());
                    pushFollow(FOLLOW_accessor_path_in_field_constraint3873);
                    accessor_path227=accessor_path();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_accessor_path.add(accessor_path227.getTree());
                    // src/main/resources/org/drools/lang/DRL.g:1159:3: ( or_restr_connective | arw= ARROW paren_chunk )?
                    int alt80=3;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==ID||LA80_0==LEFT_PAREN||(LA80_0>=EQUAL && LA80_0<=GRAVE_ACCENT)) ) {
                        alt80=1;
                    }
                    else if ( (LA80_0==ARROW) ) {
                        alt80=2;
                    }
                    switch (alt80) {
                        case 1 :
                            // src/main/resources/org/drools/lang/DRL.g:1159:5: or_restr_connective
                            {
                            pushFollow(FOLLOW_or_restr_connective_in_field_constraint3880);
                            or_restr_connective228=or_restr_connective();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) stream_or_restr_connective.add(or_restr_connective228.getTree());

                            }
                            break;
                        case 2 :
                            // src/main/resources/org/drools/lang/DRL.g:1159:27: arw= ARROW paren_chunk
                            {
                            arw=(Token)input.LT(1);
                            match(input,ARROW,FOLLOW_ARROW_in_field_constraint3886); if (failed) return retval;
                            if ( backtracking==0 ) stream_ARROW.add(arw);

                            if ( backtracking==0 ) {
                              	emit(arw, DroolsEditorType.SYMBOL);	
                            }
                            pushFollow(FOLLOW_paren_chunk_in_field_constraint3890);
                            paren_chunk229=paren_chunk();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) stream_paren_chunk.add(paren_chunk229.getTree());
                            if ( backtracking==0 ) {
                              isArrow = true;
                            }

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: accessor_path, paren_chunk, or_restr_connective, label, accessor_path, label
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1160:3: -> {isArrow}? ^( VT_BIND_FIELD label ^( VT_FIELD accessor_path ) ) ( ^( VK_EVAL[$arw] paren_chunk ) )?
                    if (isArrow) {
                        // src/main/resources/org/drools/lang/DRL.g:1160:17: ^( VT_BIND_FIELD label ^( VT_FIELD accessor_path ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(VT_BIND_FIELD, "VT_BIND_FIELD"), root_1);

                        adaptor.addChild(root_1, stream_label.next());
                        // src/main/resources/org/drools/lang/DRL.g:1160:39: ^( VT_FIELD accessor_path )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(VT_FIELD, "VT_FIELD"), root_2);

                        adaptor.addChild(root_2, stream_accessor_path.next());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }
                        // src/main/resources/org/drools/lang/DRL.g:1160:66: ( ^( VK_EVAL[$arw] paren_chunk ) )?
                        if ( stream_paren_chunk.hasNext() ) {
                            // src/main/resources/org/drools/lang/DRL.g:1160:66: ^( VK_EVAL[$arw] paren_chunk )
                            {
                            Object root_1 = (Object)adaptor.nil();
                            root_1 = (Object)adaptor.becomeRoot(adaptor.create(VK_EVAL, arw), root_1);

                            adaptor.addChild(root_1, stream_paren_chunk.next());

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_paren_chunk.reset();

                    }
                    else // 1161:3: -> ^( VT_BIND_FIELD label ^( VT_FIELD accessor_path ( or_restr_connective )? ) )
                    {
                        // src/main/resources/org/drools/lang/DRL.g:1161:6: ^( VT_BIND_FIELD label ^( VT_FIELD accessor_path ( or_restr_connective )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(VT_BIND_FIELD, "VT_BIND_FIELD"), root_1);

                        adaptor.addChild(root_1, stream_label.next());
                        // src/main/resources/org/drools/lang/DRL.g:1161:28: ^( VT_FIELD accessor_path ( or_restr_connective )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(VT_FIELD, "VT_FIELD"), root_2);

                        adaptor.addChild(root_2, stream_accessor_path.next());
                        // src/main/resources/org/drools/lang/DRL.g:1161:53: ( or_restr_connective )?
                        if ( stream_or_restr_connective.hasNext() ) {
                            adaptor.addChild(root_2, stream_or_restr_connective.next());

                        }
                        stream_or_restr_connective.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // src/main/resources/org/drools/lang/DRL.g:1162:4: accessor_path or_restr_connective
                    {
                    pushFollow(FOLLOW_accessor_path_in_field_constraint3944);
                    accessor_path230=accessor_path();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_accessor_path.add(accessor_path230.getTree());
                    pushFollow(FOLLOW_or_restr_connective_in_field_constraint3946);
                    or_restr_connective231=or_restr_connective();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_or_restr_connective.add(or_restr_connective231.getTree());

                    // AST REWRITE
                    // elements: accessor_path, or_restr_connective
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1163:3: -> ^( VT_FIELD accessor_path or_restr_connective )
                    {
                        // src/main/resources/org/drools/lang/DRL.g:1163:6: ^( VT_FIELD accessor_path or_restr_connective )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(VT_FIELD, "VT_FIELD"), root_1);

                        adaptor.addChild(root_1, stream_accessor_path.next());
                        adaptor.addChild(root_1, stream_or_restr_connective.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end field_constraint

    public static class label_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start label
    // src/main/resources/org/drools/lang/DRL.g:1166:1: label : value= ID COLON -> VT_LABEL[$value] ;
    public final label_return label() throws RecognitionException {
        label_return retval = new label_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token value=null;
        Token COLON232=null;

        Object value_tree=null;
        Object COLON232_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:1167:2: (value= ID COLON -> VT_LABEL[$value] )
            // src/main/resources/org/drools/lang/DRL.g:1167:4: value= ID COLON
            {
            value=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_label3971); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(value);

            if ( backtracking==0 ) {
              	emit(value, DroolsEditorType.IDENTIFIER_VARIABLE);	
            }
            COLON232=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_label3978); if (failed) return retval;
            if ( backtracking==0 ) stream_COLON.add(COLON232);

            if ( backtracking==0 ) {
              	emit(COLON232, DroolsEditorType.SYMBOL);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1169:3: -> VT_LABEL[$value]
            {
                adaptor.addChild(root_0, adaptor.create(VT_LABEL, value));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end label

    public static class or_restr_connective_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start or_restr_connective
    // src/main/resources/org/drools/lang/DRL.g:1172:1: or_restr_connective : and_restr_connective ({...}? => DOUBLE_PIPE and_restr_connective )* ;
    public final or_restr_connective_return or_restr_connective() throws RecognitionException {
        or_restr_connective_return retval = new or_restr_connective_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOUBLE_PIPE234=null;
        and_restr_connective_return and_restr_connective233 = null;

        and_restr_connective_return and_restr_connective235 = null;


        Object DOUBLE_PIPE234_tree=null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:1173:2: ( and_restr_connective ({...}? => DOUBLE_PIPE and_restr_connective )* )
            // src/main/resources/org/drools/lang/DRL.g:1173:4: and_restr_connective ({...}? => DOUBLE_PIPE and_restr_connective )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_and_restr_connective_in_or_restr_connective3999);
            and_restr_connective233=and_restr_connective();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, and_restr_connective233.getTree());
            // src/main/resources/org/drools/lang/DRL.g:1173:25: ({...}? => DOUBLE_PIPE and_restr_connective )*
            loop82:
            do {
                int alt82=2;
                alt82 = dfa82.predict(input);
                switch (alt82) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:1173:26: {...}? => DOUBLE_PIPE and_restr_connective
            	    {
            	    if ( !((validateRestr())) ) {
            	        if (backtracking>0) {failed=true; return retval;}
            	        throw new FailedPredicateException(input, "or_restr_connective", "(validateRestr())");
            	    }
            	    DOUBLE_PIPE234=(Token)input.LT(1);
            	    match(input,DOUBLE_PIPE,FOLLOW_DOUBLE_PIPE_in_or_restr_connective4005); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    DOUBLE_PIPE234_tree = (Object)adaptor.create(DOUBLE_PIPE234);
            	    root_0 = (Object)adaptor.becomeRoot(DOUBLE_PIPE234_tree, root_0);
            	    }
            	    if ( backtracking==0 ) {
            	      	emit(DOUBLE_PIPE234, DroolsEditorType.SYMBOL);	
            	    }
            	    pushFollow(FOLLOW_and_restr_connective_in_or_restr_connective4013);
            	    and_restr_connective235=and_restr_connective();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, and_restr_connective235.getTree());

            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end or_restr_connective

    public static class and_restr_connective_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start and_restr_connective
    // src/main/resources/org/drools/lang/DRL.g:1177:1: and_restr_connective : constraint_expression ({...}? => DOUBLE_AMPER constraint_expression )* ;
    public final and_restr_connective_return and_restr_connective() throws RecognitionException {
        and_restr_connective_return retval = new and_restr_connective_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOUBLE_AMPER237=null;
        constraint_expression_return constraint_expression236 = null;

        constraint_expression_return constraint_expression238 = null;


        Object DOUBLE_AMPER237_tree=null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:1178:2: ( constraint_expression ({...}? => DOUBLE_AMPER constraint_expression )* )
            // src/main/resources/org/drools/lang/DRL.g:1178:4: constraint_expression ({...}? => DOUBLE_AMPER constraint_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_constraint_expression_in_and_restr_connective4028);
            constraint_expression236=constraint_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, constraint_expression236.getTree());
            // src/main/resources/org/drools/lang/DRL.g:1178:26: ({...}? => DOUBLE_AMPER constraint_expression )*
            loop83:
            do {
                int alt83=2;
                alt83 = dfa83.predict(input);
                switch (alt83) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:1178:27: {...}? => DOUBLE_AMPER constraint_expression
            	    {
            	    if ( !((validateRestr())) ) {
            	        if (backtracking>0) {failed=true; return retval;}
            	        throw new FailedPredicateException(input, "and_restr_connective", "(validateRestr())");
            	    }
            	    DOUBLE_AMPER237=(Token)input.LT(1);
            	    match(input,DOUBLE_AMPER,FOLLOW_DOUBLE_AMPER_in_and_restr_connective4034); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    DOUBLE_AMPER237_tree = (Object)adaptor.create(DOUBLE_AMPER237);
            	    root_0 = (Object)adaptor.becomeRoot(DOUBLE_AMPER237_tree, root_0);
            	    }
            	    if ( backtracking==0 ) {
            	      	emit(DOUBLE_AMPER237, DroolsEditorType.SYMBOL);	
            	    }
            	    pushFollow(FOLLOW_constraint_expression_in_and_restr_connective4041);
            	    constraint_expression238=constraint_expression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, constraint_expression238.getTree());

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end and_restr_connective

    public static class constraint_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start constraint_expression
    // src/main/resources/org/drools/lang/DRL.g:1182:1: constraint_expression options {k=3; } : ( compound_operator | simple_operator | LEFT_PAREN or_restr_connective RIGHT_PAREN );
    public final constraint_expression_return constraint_expression() throws RecognitionException {
        constraint_expression_return retval = new constraint_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_PAREN241=null;
        Token RIGHT_PAREN243=null;
        compound_operator_return compound_operator239 = null;

        simple_operator_return simple_operator240 = null;

        or_restr_connective_return or_restr_connective242 = null;


        Object LEFT_PAREN241_tree=null;
        Object RIGHT_PAREN243_tree=null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:1185:3: ( compound_operator | simple_operator | LEFT_PAREN or_restr_connective RIGHT_PAREN )
            int alt84=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA84_1 = input.LA(2);

                if ( (LA84_1==ID) ) {
                    int LA84_10 = input.LA(3);

                    if ( (LA84_10==ID||LA84_10==STRING||(LA84_10>=BOOL && LA84_10<=INT)||(LA84_10>=FLOAT && LA84_10<=NULL)) && ((validateIdentifierKey(DroolsSoftKeywords.NOT)))) {
                        alt84=2;
                    }
                    else if ( (LA84_10==LEFT_PAREN) && ((validateIdentifierKey(DroolsSoftKeywords.NOT)))) {
                        int LA84_24 = input.LA(4);

                        if ( ((validateIdentifierKey(DroolsSoftKeywords.NOT))) ) {
                            alt84=1;
                        }
                        else if ( ((validateIdentifierKey(DroolsSoftKeywords.NOT))) ) {
                            alt84=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1182:1: constraint_expression options {k=3; } : ( compound_operator | simple_operator | LEFT_PAREN or_restr_connective RIGHT_PAREN );", 84, 24, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA84_10==DOT||(LA84_10>=COMMA && LA84_10<=RIGHT_PAREN)||(LA84_10>=DOUBLE_PIPE && LA84_10<=DOUBLE_AMPER)||LA84_10==LEFT_SQUARE) ) {
                        alt84=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1182:1: constraint_expression options {k=3; } : ( compound_operator | simple_operator | LEFT_PAREN or_restr_connective RIGHT_PAREN );", 84, 10, input);

                        throw nvae;
                    }
                }
                else if ( (LA84_1==STRING||(LA84_1>=BOOL && LA84_1<=INT)||(LA84_1>=FLOAT && LA84_1<=NULL)) ) {
                    alt84=2;
                }
                else if ( (LA84_1==LEFT_PAREN) ) {
                    switch ( input.LA(3) ) {
                    case ID:
                        {
                        int LA84_31 = input.LA(4);

                        if ( ((validateIdentifierKey(DroolsSoftKeywords.IN))) ) {
                            alt84=1;
                        }
                        else if ( (true) ) {
                            alt84=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1182:1: constraint_expression options {k=3; } : ( compound_operator | simple_operator | LEFT_PAREN or_restr_connective RIGHT_PAREN );", 84, 31, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LEFT_PAREN:
                        {
                        int LA84_32 = input.LA(4);

                        if ( ((validateIdentifierKey(DroolsSoftKeywords.IN))) ) {
                            alt84=1;
                        }
                        else if ( (true) ) {
                            alt84=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1182:1: constraint_expression options {k=3; } : ( compound_operator | simple_operator | LEFT_PAREN or_restr_connective RIGHT_PAREN );", 84, 32, input);

                            throw nvae;
                        }
                        }
                        break;
                    case VT_COMPILATION_UNIT:
                    case VT_FUNCTION_IMPORT:
                    case VT_FACT:
                    case VT_CONSTRAINTS:
                    case VT_LABEL:
                    case VT_QUERY_ID:
                    case VT_TEMPLATE_ID:
                    case VT_TYPE_DECLARE_ID:
                    case VT_RULE_ID:
                    case VT_ENTRYPOINT_ID:
                    case VT_SLOT_ID:
                    case VT_SLOT:
                    case VT_RULE_ATTRIBUTES:
                    case VT_RHS_CHUNK:
                    case VT_CURLY_CHUNK:
                    case VT_SQUARE_CHUNK:
                    case VT_PAREN_CHUNK:
                    case VT_BEHAVIOR:
                    case VT_AND_IMPLICIT:
                    case VT_AND_PREFIX:
                    case VT_OR_PREFIX:
                    case VT_AND_INFIX:
                    case VT_OR_INFIX:
                    case VT_ACCUMULATE_INIT_CLAUSE:
                    case VT_ACCUMULATE_ID_CLAUSE:
                    case VT_FROM_SOURCE:
                    case VT_EXPRESSION_CHAIN:
                    case VT_PATTERN:
                    case VT_FACT_BINDING:
                    case VT_FACT_OR:
                    case VT_BIND_FIELD:
                    case VT_FIELD:
                    case VT_ACCESSOR_PATH:
                    case VT_ACCESSOR_ELEMENT:
                    case VT_DATA_TYPE:
                    case VT_PATTERN_TYPE:
                    case VT_PACKAGE_ID:
                    case VT_IMPORT_ID:
                    case VT_GLOBAL_ID:
                    case VT_FUNCTION_ID:
                    case VT_PARAM_LIST:
                    case VK_DATE_EFFECTIVE:
                    case VK_DATE_EXPIRES:
                    case VK_LOCK_ON_ACTIVE:
                    case VK_NO_LOOP:
                    case VK_AUTO_FOCUS:
                    case VK_ACTIVATION_GROUP:
                    case VK_AGENDA_GROUP:
                    case VK_RULEFLOW_GROUP:
                    case VK_DURATION:
                    case VK_DIALECT:
                    case VK_SALIENCE:
                    case VK_ENABLED:
                    case VK_ATTRIBUTES:
                    case VK_RULE:
                    case VK_IMPORT:
                    case VK_PACKAGE:
                    case VK_TEMPLATE:
                    case VK_QUERY:
                    case VK_DECLARE:
                    case VK_FUNCTION:
                    case VK_GLOBAL:
                    case VK_EVAL:
                    case VK_CONTAINS:
                    case VK_MATCHES:
                    case VK_EXCLUDES:
                    case VK_SOUNDSLIKE:
                    case VK_MEMBEROF:
                    case VK_ENTRY_POINT:
                    case VK_NOT:
                    case VK_IN:
                    case VK_OR:
                    case VK_AND:
                    case VK_EXISTS:
                    case VK_FORALL:
                    case VK_ACTION:
                    case VK_REVERSE:
                    case VK_RESULT:
                    case SEMICOLON:
                    case DOT:
                    case DOT_STAR:
                    case END:
                    case COMMA:
                    case RIGHT_PAREN:
                    case AT:
                    case COLON:
                    case EQUALS:
                    case WHEN:
                    case DOUBLE_PIPE:
                    case DOUBLE_AMPER:
                    case FROM:
                    case OVER:
                    case ACCUMULATE:
                    case INIT:
                    case COLLECT:
                    case ARROW:
                    case EQUAL:
                    case GREATER:
                    case GREATER_EQUAL:
                    case LESS:
                    case LESS_EQUAL:
                    case NOT_EQUAL:
                    case GRAVE_ACCENT:
                    case LEFT_SQUARE:
                    case RIGHT_SQUARE:
                    case THEN:
                    case LEFT_CURLY:
                    case RIGHT_CURLY:
                    case MISC:
                    case EOL:
                    case WS:
                    case EscapeSequence:
                    case HexDigit:
                    case UnicodeEscape:
                    case OctalEscape:
                    case SH_STYLE_SINGLE_LINE_COMMENT:
                    case C_STYLE_SINGLE_LINE_COMMENT:
                    case MULTI_LINE_COMMENT:
                        {
                        alt84=2;
                        }
                        break;
                    case STRING:
                        {
                        int LA84_34 = input.LA(4);

                        if ( ((validateIdentifierKey(DroolsSoftKeywords.IN))) ) {
                            alt84=1;
                        }
                        else if ( (true) ) {
                            alt84=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1182:1: constraint_expression options {k=3; } : ( compound_operator | simple_operator | LEFT_PAREN or_restr_connective RIGHT_PAREN );", 84, 34, input);

                            throw nvae;
                        }
                        }
                        break;
                    case INT:
                        {
                        int LA84_35 = input.LA(4);

                        if ( ((validateIdentifierKey(DroolsSoftKeywords.IN))) ) {
                            alt84=1;
                        }
                        else if ( (true) ) {
                            alt84=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1182:1: constraint_expression options {k=3; } : ( compound_operator | simple_operator | LEFT_PAREN or_restr_connective RIGHT_PAREN );", 84, 35, input);

                            throw nvae;
                        }
                        }
                        break;
                    case FLOAT:
                        {
                        int LA84_36 = input.LA(4);

                        if ( ((validateIdentifierKey(DroolsSoftKeywords.IN))) ) {
                            alt84=1;
                        }
                        else if ( (true) ) {
                            alt84=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1182:1: constraint_expression options {k=3; } : ( compound_operator | simple_operator | LEFT_PAREN or_restr_connective RIGHT_PAREN );", 84, 36, input);

                            throw nvae;
                        }
                        }
                        break;
                    case BOOL:
                        {
                        int LA84_37 = input.LA(4);

                        if ( ((validateIdentifierKey(DroolsSoftKeywords.IN))) ) {
                            alt84=1;
                        }
                        else if ( (true) ) {
                            alt84=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1182:1: constraint_expression options {k=3; } : ( compound_operator | simple_operator | LEFT_PAREN or_restr_connective RIGHT_PAREN );", 84, 37, input);

                            throw nvae;
                        }
                        }
                        break;
                    case NULL:
                        {
                        int LA84_38 = input.LA(4);

                        if ( ((validateIdentifierKey(DroolsSoftKeywords.IN))) ) {
                            alt84=1;
                        }
                        else if ( (true) ) {
                            alt84=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1182:1: constraint_expression options {k=3; } : ( compound_operator | simple_operator | LEFT_PAREN or_restr_connective RIGHT_PAREN );", 84, 38, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1182:1: constraint_expression options {k=3; } : ( compound_operator | simple_operator | LEFT_PAREN or_restr_connective RIGHT_PAREN );", 84, 16, input);

                        throw nvae;
                    }

                }
                else if ( (LA84_1==GRAVE_ACCENT) && ((validateIdentifierKey(DroolsSoftKeywords.NOT)))) {
                    alt84=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("1182:1: constraint_expression options {k=3; } : ( compound_operator | simple_operator | LEFT_PAREN or_restr_connective RIGHT_PAREN );", 84, 1, input);

                    throw nvae;
                }
                }
                break;
            case EQUAL:
            case GREATER:
            case GREATER_EQUAL:
            case LESS:
            case LESS_EQUAL:
            case NOT_EQUAL:
            case GRAVE_ACCENT:
                {
                alt84=2;
                }
                break;
            case LEFT_PAREN:
                {
                alt84=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1182:1: constraint_expression options {k=3; } : ( compound_operator | simple_operator | LEFT_PAREN or_restr_connective RIGHT_PAREN );", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:1185:5: compound_operator
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_compound_operator_in_constraint_expression4063);
                    compound_operator239=compound_operator();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, compound_operator239.getTree());

                    }
                    break;
                case 2 :
                    // src/main/resources/org/drools/lang/DRL.g:1186:4: simple_operator
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_simple_operator_in_constraint_expression4068);
                    simple_operator240=simple_operator();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, simple_operator240.getTree());

                    }
                    break;
                case 3 :
                    // src/main/resources/org/drools/lang/DRL.g:1187:4: LEFT_PAREN or_restr_connective RIGHT_PAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LEFT_PAREN241=(Token)input.LT(1);
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_constraint_expression4073); if (failed) return retval;
                    if ( backtracking==0 ) {
                      	emit(LEFT_PAREN241, DroolsEditorType.SYMBOL);	
                    }
                    pushFollow(FOLLOW_or_restr_connective_in_constraint_expression4082);
                    or_restr_connective242=or_restr_connective();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, or_restr_connective242.getTree());
                    RIGHT_PAREN243=(Token)input.LT(1);
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_constraint_expression4087); if (failed) return retval;
                    if ( backtracking==0 ) {
                    RIGHT_PAREN243_tree = (Object)adaptor.create(RIGHT_PAREN243);
                    adaptor.addChild(root_0, RIGHT_PAREN243_tree);
                    }
                    if ( backtracking==0 ) {
                      	emit(RIGHT_PAREN243, DroolsEditorType.SYMBOL);	
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch ( RecognitionException re ) {

            	if (!lookaheadTest){
            		reportError(re);
            		recover(input, re);
            	} else {
            		throw re;
            	}

        }
        finally {

            	if (isEditorInterfaceEnabled && input.LA(2) == EOF && input.LA(1) == ID) {
            		emit(true, Location.LOCATION_LHS_INSIDE_CONDITION_OPERATOR);
            		emit(input.LT(1), DroolsEditorType.KEYWORD);
            		input.consume();
            		emit(true, Location.LOCATION_LHS_INSIDE_CONDITION_ARGUMENT);
            	} else if (isEditorInterfaceEnabled && input.LA(3) == EOF && input.LA(1) == ID && 
            				input.LA(2) == ID && validateLT(1, DroolsSoftKeywords.NOT)) {
            		emit(true, Location.LOCATION_LHS_INSIDE_CONDITION_OPERATOR);
            		emit(input.LT(1), DroolsEditorType.KEYWORD);
            		emit(input.LT(2), DroolsEditorType.KEYWORD);
            		input.consume();
            		input.consume();
            		emit(true, Location.LOCATION_LHS_INSIDE_CONDITION_ARGUMENT);
            	} else if (isEditorInterfaceEnabled && input.LA(3) == EOF  && input.LA(1) == ID && validateLT(1, DroolsSoftKeywords.IN)) {
            		emit(true, Location.LOCATION_LHS_INSIDE_CONDITION_OPERATOR);
            		emit(input.LT(1), DroolsEditorType.KEYWORD);
            		emit(input.LT(2), DroolsEditorType.SYMBOL);
            		input.consume();
            		input.consume();
            		emit(true, Location.LOCATION_LHS_INSIDE_CONDITION_ARGUMENT);
            	} else if (isEditorInterfaceEnabled && input.LA(3) == EOF && input.LA(1) == ID) {
            		emit(true, Location.LOCATION_LHS_INSIDE_CONDITION_OPERATOR);
            		emit(input.LT(1), DroolsEditorType.KEYWORD);
            		emit(input.LT(2), DroolsEditorType.IDENTIFIER);
            		input.consume();
            		input.consume();
            		if (input.get(input.index() - 1).getType() == WS){
            			emit(true, Location.LOCATION_LHS_INSIDE_CONDITION_END);
            		}
            	}

        }
        return retval;
    }
    // $ANTLR end constraint_expression

    public static class simple_operator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start simple_operator
    // src/main/resources/org/drools/lang/DRL.g:1232:1: simple_operator : ( EQUAL | GREATER | GREATER_EQUAL | LESS | LESS_EQUAL | NOT_EQUAL | not_key ( contains_key | soundslike_key | matches_key | memberof_key | id1= ID | ga1= GRAVE_ACCENT id2= ID square_chunk ) | contains_key | excludes_key | matches_key | soundslike_key | memberof_key | id3= ID | ga2= GRAVE_ACCENT id4= ID square_chunk ) expression_value ;
    public final simple_operator_return simple_operator() throws RecognitionException {
        simple_operator_return retval = new simple_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id1=null;
        Token ga1=null;
        Token id2=null;
        Token id3=null;
        Token ga2=null;
        Token id4=null;
        Token EQUAL244=null;
        Token GREATER245=null;
        Token GREATER_EQUAL246=null;
        Token LESS247=null;
        Token LESS_EQUAL248=null;
        Token NOT_EQUAL249=null;
        not_key_return not_key250 = null;

        contains_key_return contains_key251 = null;

        soundslike_key_return soundslike_key252 = null;

        matches_key_return matches_key253 = null;

        memberof_key_return memberof_key254 = null;

        square_chunk_return square_chunk255 = null;

        contains_key_return contains_key256 = null;

        excludes_key_return excludes_key257 = null;

        matches_key_return matches_key258 = null;

        soundslike_key_return soundslike_key259 = null;

        memberof_key_return memberof_key260 = null;

        square_chunk_return square_chunk261 = null;

        expression_value_return expression_value262 = null;


        Object id1_tree=null;
        Object ga1_tree=null;
        Object id2_tree=null;
        Object id3_tree=null;
        Object ga2_tree=null;
        Object id4_tree=null;
        Object EQUAL244_tree=null;
        Object GREATER245_tree=null;
        Object GREATER_EQUAL246_tree=null;
        Object LESS247_tree=null;
        Object LESS_EQUAL248_tree=null;
        Object NOT_EQUAL249_tree=null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:1233:2: ( ( EQUAL | GREATER | GREATER_EQUAL | LESS | LESS_EQUAL | NOT_EQUAL | not_key ( contains_key | soundslike_key | matches_key | memberof_key | id1= ID | ga1= GRAVE_ACCENT id2= ID square_chunk ) | contains_key | excludes_key | matches_key | soundslike_key | memberof_key | id3= ID | ga2= GRAVE_ACCENT id4= ID square_chunk ) expression_value )
            // src/main/resources/org/drools/lang/DRL.g:1233:4: ( EQUAL | GREATER | GREATER_EQUAL | LESS | LESS_EQUAL | NOT_EQUAL | not_key ( contains_key | soundslike_key | matches_key | memberof_key | id1= ID | ga1= GRAVE_ACCENT id2= ID square_chunk ) | contains_key | excludes_key | matches_key | soundslike_key | memberof_key | id3= ID | ga2= GRAVE_ACCENT id4= ID square_chunk ) expression_value
            {
            root_0 = (Object)adaptor.nil();

            if ( backtracking==0 ) {
              	emit(Location.LOCATION_LHS_INSIDE_CONDITION_OPERATOR);	
            }
            // src/main/resources/org/drools/lang/DRL.g:1234:3: ( EQUAL | GREATER | GREATER_EQUAL | LESS | LESS_EQUAL | NOT_EQUAL | not_key ( contains_key | soundslike_key | matches_key | memberof_key | id1= ID | ga1= GRAVE_ACCENT id2= ID square_chunk ) | contains_key | excludes_key | matches_key | soundslike_key | memberof_key | id3= ID | ga2= GRAVE_ACCENT id4= ID square_chunk )
            int alt86=14;
            switch ( input.LA(1) ) {
            case EQUAL:
                {
                alt86=1;
                }
                break;
            case GREATER:
                {
                alt86=2;
                }
                break;
            case GREATER_EQUAL:
                {
                alt86=3;
                }
                break;
            case LESS:
                {
                alt86=4;
                }
                break;
            case LESS_EQUAL:
                {
                alt86=5;
                }
                break;
            case NOT_EQUAL:
                {
                alt86=6;
                }
                break;
            case ID:
                {
                int LA86_7 = input.LA(2);

                if ( (LA86_7==ID||LA86_7==GRAVE_ACCENT) && ((validateIdentifierKey(DroolsSoftKeywords.NOT)))) {
                    alt86=7;
                }
                else if ( ((validateIdentifierKey(DroolsSoftKeywords.CONTAINS))) ) {
                    alt86=8;
                }
                else if ( ((validateIdentifierKey(DroolsSoftKeywords.EXCLUDES))) ) {
                    alt86=9;
                }
                else if ( ((validateIdentifierKey(DroolsSoftKeywords.MATCHES))) ) {
                    alt86=10;
                }
                else if ( ((validateIdentifierKey(DroolsSoftKeywords.SOUNDSLIKE))) ) {
                    alt86=11;
                }
                else if ( ((validateIdentifierKey(DroolsSoftKeywords.MEMBEROF))) ) {
                    alt86=12;
                }
                else if ( (true) ) {
                    alt86=13;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("1234:3: ( EQUAL | GREATER | GREATER_EQUAL | LESS | LESS_EQUAL | NOT_EQUAL | not_key ( contains_key | soundslike_key | matches_key | memberof_key | id1= ID | ga1= GRAVE_ACCENT id2= ID square_chunk ) | contains_key | excludes_key | matches_key | soundslike_key | memberof_key | id3= ID | ga2= GRAVE_ACCENT id4= ID square_chunk )", 86, 7, input);

                    throw nvae;
                }
                }
                break;
            case GRAVE_ACCENT:
                {
                alt86=14;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1234:3: ( EQUAL | GREATER | GREATER_EQUAL | LESS | LESS_EQUAL | NOT_EQUAL | not_key ( contains_key | soundslike_key | matches_key | memberof_key | id1= ID | ga1= GRAVE_ACCENT id2= ID square_chunk ) | contains_key | excludes_key | matches_key | soundslike_key | memberof_key | id3= ID | ga2= GRAVE_ACCENT id4= ID square_chunk )", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:1234:4: EQUAL
                    {
                    EQUAL244=(Token)input.LT(1);
                    match(input,EQUAL,FOLLOW_EQUAL_in_simple_operator4116); if (failed) return retval;
                    if ( backtracking==0 ) {
                    EQUAL244_tree = (Object)adaptor.create(EQUAL244);
                    root_0 = (Object)adaptor.becomeRoot(EQUAL244_tree, root_0);
                    }
                    if ( backtracking==0 ) {
                      	emit(EQUAL244, DroolsEditorType.SYMBOL);	
                    }

                    }
                    break;
                case 2 :
                    // src/main/resources/org/drools/lang/DRL.g:1235:4: GREATER
                    {
                    GREATER245=(Token)input.LT(1);
                    match(input,GREATER,FOLLOW_GREATER_in_simple_operator4124); if (failed) return retval;
                    if ( backtracking==0 ) {
                    GREATER245_tree = (Object)adaptor.create(GREATER245);
                    root_0 = (Object)adaptor.becomeRoot(GREATER245_tree, root_0);
                    }
                    if ( backtracking==0 ) {
                      	emit(GREATER245, DroolsEditorType.SYMBOL);	
                    }

                    }
                    break;
                case 3 :
                    // src/main/resources/org/drools/lang/DRL.g:1236:4: GREATER_EQUAL
                    {
                    GREATER_EQUAL246=(Token)input.LT(1);
                    match(input,GREATER_EQUAL,FOLLOW_GREATER_EQUAL_in_simple_operator4132); if (failed) return retval;
                    if ( backtracking==0 ) {
                    GREATER_EQUAL246_tree = (Object)adaptor.create(GREATER_EQUAL246);
                    root_0 = (Object)adaptor.becomeRoot(GREATER_EQUAL246_tree, root_0);
                    }
                    if ( backtracking==0 ) {
                      	emit(GREATER_EQUAL246, DroolsEditorType.SYMBOL);	
                    }

                    }
                    break;
                case 4 :
                    // src/main/resources/org/drools/lang/DRL.g:1237:4: LESS
                    {
                    LESS247=(Token)input.LT(1);
                    match(input,LESS,FOLLOW_LESS_in_simple_operator4140); if (failed) return retval;
                    if ( backtracking==0 ) {
                    LESS247_tree = (Object)adaptor.create(LESS247);
                    root_0 = (Object)adaptor.becomeRoot(LESS247_tree, root_0);
                    }
                    if ( backtracking==0 ) {
                      	emit(LESS247, DroolsEditorType.SYMBOL);	
                    }

                    }
                    break;
                case 5 :
                    // src/main/resources/org/drools/lang/DRL.g:1238:4: LESS_EQUAL
                    {
                    LESS_EQUAL248=(Token)input.LT(1);
                    match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_simple_operator4148); if (failed) return retval;
                    if ( backtracking==0 ) {
                    LESS_EQUAL248_tree = (Object)adaptor.create(LESS_EQUAL248);
                    root_0 = (Object)adaptor.becomeRoot(LESS_EQUAL248_tree, root_0);
                    }
                    if ( backtracking==0 ) {
                      	emit(LESS_EQUAL248, DroolsEditorType.SYMBOL);	
                    }

                    }
                    break;
                case 6 :
                    // src/main/resources/org/drools/lang/DRL.g:1239:4: NOT_EQUAL
                    {
                    NOT_EQUAL249=(Token)input.LT(1);
                    match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_simple_operator4156); if (failed) return retval;
                    if ( backtracking==0 ) {
                    NOT_EQUAL249_tree = (Object)adaptor.create(NOT_EQUAL249);
                    root_0 = (Object)adaptor.becomeRoot(NOT_EQUAL249_tree, root_0);
                    }
                    if ( backtracking==0 ) {
                      	emit(NOT_EQUAL249, DroolsEditorType.SYMBOL);	
                    }

                    }
                    break;
                case 7 :
                    // src/main/resources/org/drools/lang/DRL.g:1240:4: not_key ( contains_key | soundslike_key | matches_key | memberof_key | id1= ID | ga1= GRAVE_ACCENT id2= ID square_chunk )
                    {
                    pushFollow(FOLLOW_not_key_in_simple_operator4164);
                    not_key250=not_key();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, not_key250.getTree());
                    // src/main/resources/org/drools/lang/DRL.g:1241:3: ( contains_key | soundslike_key | matches_key | memberof_key | id1= ID | ga1= GRAVE_ACCENT id2= ID square_chunk )
                    int alt85=6;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==ID) ) {
                        int LA85_1 = input.LA(2);

                        if ( ((validateIdentifierKey(DroolsSoftKeywords.CONTAINS))) ) {
                            alt85=1;
                        }
                        else if ( ((validateIdentifierKey(DroolsSoftKeywords.SOUNDSLIKE))) ) {
                            alt85=2;
                        }
                        else if ( ((validateIdentifierKey(DroolsSoftKeywords.MATCHES))) ) {
                            alt85=3;
                        }
                        else if ( ((validateIdentifierKey(DroolsSoftKeywords.MEMBEROF))) ) {
                            alt85=4;
                        }
                        else if ( (true) ) {
                            alt85=5;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("1241:3: ( contains_key | soundslike_key | matches_key | memberof_key | id1= ID | ga1= GRAVE_ACCENT id2= ID square_chunk )", 85, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA85_0==GRAVE_ACCENT) ) {
                        alt85=6;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("1241:3: ( contains_key | soundslike_key | matches_key | memberof_key | id1= ID | ga1= GRAVE_ACCENT id2= ID square_chunk )", 85, 0, input);

                        throw nvae;
                    }
                    switch (alt85) {
                        case 1 :
                            // src/main/resources/org/drools/lang/DRL.g:1241:5: contains_key
                            {
                            pushFollow(FOLLOW_contains_key_in_simple_operator4171);
                            contains_key251=contains_key();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(contains_key251.getTree(), root_0);

                            }
                            break;
                        case 2 :
                            // src/main/resources/org/drools/lang/DRL.g:1242:5: soundslike_key
                            {
                            pushFollow(FOLLOW_soundslike_key_in_simple_operator4178);
                            soundslike_key252=soundslike_key();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(soundslike_key252.getTree(), root_0);

                            }
                            break;
                        case 3 :
                            // src/main/resources/org/drools/lang/DRL.g:1243:5: matches_key
                            {
                            pushFollow(FOLLOW_matches_key_in_simple_operator4185);
                            matches_key253=matches_key();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(matches_key253.getTree(), root_0);

                            }
                            break;
                        case 4 :
                            // src/main/resources/org/drools/lang/DRL.g:1244:5: memberof_key
                            {
                            pushFollow(FOLLOW_memberof_key_in_simple_operator4192);
                            memberof_key254=memberof_key();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(memberof_key254.getTree(), root_0);

                            }
                            break;
                        case 5 :
                            // src/main/resources/org/drools/lang/DRL.g:1245:5: id1= ID
                            {
                            id1=(Token)input.LT(1);
                            match(input,ID,FOLLOW_ID_in_simple_operator4201); if (failed) return retval;
                            if ( backtracking==0 ) {
                            id1_tree = (Object)adaptor.create(id1);
                            root_0 = (Object)adaptor.becomeRoot(id1_tree, root_0);
                            }
                            if ( backtracking==0 ) {
                              	emit(id1, DroolsEditorType.IDENTIFIER);	
                            }

                            }
                            break;
                        case 6 :
                            // src/main/resources/org/drools/lang/DRL.g:1246:5: ga1= GRAVE_ACCENT id2= ID square_chunk
                            {
                            ga1=(Token)input.LT(1);
                            match(input,GRAVE_ACCENT,FOLLOW_GRAVE_ACCENT_in_simple_operator4212); if (failed) return retval;
                            if ( backtracking==0 ) {
                              	emit(ga1, DroolsEditorType.SYMBOL);	
                            }
                            id2=(Token)input.LT(1);
                            match(input,ID,FOLLOW_ID_in_simple_operator4220); if (failed) return retval;
                            if ( backtracking==0 ) {
                            id2_tree = (Object)adaptor.create(id2);
                            root_0 = (Object)adaptor.becomeRoot(id2_tree, root_0);
                            }
                            if ( backtracking==0 ) {
                              	emit(id2, DroolsEditorType.IDENTIFIER);	
                            }
                            pushFollow(FOLLOW_square_chunk_in_simple_operator4226);
                            square_chunk255=square_chunk();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, square_chunk255.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 8 :
                    // src/main/resources/org/drools/lang/DRL.g:1247:4: contains_key
                    {
                    pushFollow(FOLLOW_contains_key_in_simple_operator4232);
                    contains_key256=contains_key();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(contains_key256.getTree(), root_0);

                    }
                    break;
                case 9 :
                    // src/main/resources/org/drools/lang/DRL.g:1248:4: excludes_key
                    {
                    pushFollow(FOLLOW_excludes_key_in_simple_operator4238);
                    excludes_key257=excludes_key();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(excludes_key257.getTree(), root_0);

                    }
                    break;
                case 10 :
                    // src/main/resources/org/drools/lang/DRL.g:1249:4: matches_key
                    {
                    pushFollow(FOLLOW_matches_key_in_simple_operator4244);
                    matches_key258=matches_key();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(matches_key258.getTree(), root_0);

                    }
                    break;
                case 11 :
                    // src/main/resources/org/drools/lang/DRL.g:1250:4: soundslike_key
                    {
                    pushFollow(FOLLOW_soundslike_key_in_simple_operator4250);
                    soundslike_key259=soundslike_key();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(soundslike_key259.getTree(), root_0);

                    }
                    break;
                case 12 :
                    // src/main/resources/org/drools/lang/DRL.g:1251:4: memberof_key
                    {
                    pushFollow(FOLLOW_memberof_key_in_simple_operator4256);
                    memberof_key260=memberof_key();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(memberof_key260.getTree(), root_0);

                    }
                    break;
                case 13 :
                    // src/main/resources/org/drools/lang/DRL.g:1252:4: id3= ID
                    {
                    id3=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_simple_operator4264); if (failed) return retval;
                    if ( backtracking==0 ) {
                    id3_tree = (Object)adaptor.create(id3);
                    root_0 = (Object)adaptor.becomeRoot(id3_tree, root_0);
                    }
                    if ( backtracking==0 ) {
                      	emit(id3, DroolsEditorType.IDENTIFIER);	
                    }

                    }
                    break;
                case 14 :
                    // src/main/resources/org/drools/lang/DRL.g:1253:4: ga2= GRAVE_ACCENT id4= ID square_chunk
                    {
                    ga2=(Token)input.LT(1);
                    match(input,GRAVE_ACCENT,FOLLOW_GRAVE_ACCENT_in_simple_operator4274); if (failed) return retval;
                    if ( backtracking==0 ) {
                      	emit(ga2, DroolsEditorType.SYMBOL);	
                    }
                    id4=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_simple_operator4282); if (failed) return retval;
                    if ( backtracking==0 ) {
                    id4_tree = (Object)adaptor.create(id4);
                    root_0 = (Object)adaptor.becomeRoot(id4_tree, root_0);
                    }
                    if ( backtracking==0 ) {
                      	emit(id4, DroolsEditorType.IDENTIFIER);	
                    }
                    pushFollow(FOLLOW_square_chunk_in_simple_operator4288);
                    square_chunk261=square_chunk();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, square_chunk261.getTree());

                    }
                    break;

            }

            if ( backtracking==0 ) {
              	emit(Location.LOCATION_LHS_INSIDE_CONDITION_ARGUMENT);	
            }
            pushFollow(FOLLOW_expression_value_in_simple_operator4295);
            expression_value262=expression_value();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, expression_value262.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end simple_operator

    public static class compound_operator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start compound_operator
    // src/main/resources/org/drools/lang/DRL.g:1259:1: compound_operator : ( in_key | not_key in_key ) LEFT_PAREN expression_value ( COMMA expression_value )* RIGHT_PAREN ;
    public final compound_operator_return compound_operator() throws RecognitionException {
        compound_operator_return retval = new compound_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_PAREN266=null;
        Token COMMA268=null;
        Token RIGHT_PAREN270=null;
        in_key_return in_key263 = null;

        not_key_return not_key264 = null;

        in_key_return in_key265 = null;

        expression_value_return expression_value267 = null;

        expression_value_return expression_value269 = null;


        Object LEFT_PAREN266_tree=null;
        Object COMMA268_tree=null;
        Object RIGHT_PAREN270_tree=null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:1260:2: ( ( in_key | not_key in_key ) LEFT_PAREN expression_value ( COMMA expression_value )* RIGHT_PAREN )
            // src/main/resources/org/drools/lang/DRL.g:1260:4: ( in_key | not_key in_key ) LEFT_PAREN expression_value ( COMMA expression_value )* RIGHT_PAREN
            {
            root_0 = (Object)adaptor.nil();

            if ( backtracking==0 ) {
              	emit(Location.LOCATION_LHS_INSIDE_CONDITION_OPERATOR);	
            }
            // src/main/resources/org/drools/lang/DRL.g:1261:2: ( in_key | not_key in_key )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==ID) && (((validateIdentifierKey(DroolsSoftKeywords.IN))||(validateIdentifierKey(DroolsSoftKeywords.NOT))))) {
                int LA87_1 = input.LA(2);

                if ( (LA87_1==ID) && ((validateIdentifierKey(DroolsSoftKeywords.NOT)))) {
                    alt87=2;
                }
                else if ( (LA87_1==LEFT_PAREN) && ((validateIdentifierKey(DroolsSoftKeywords.IN)))) {
                    alt87=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("1261:2: ( in_key | not_key in_key )", 87, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1261:2: ( in_key | not_key in_key )", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:1261:4: in_key
                    {
                    pushFollow(FOLLOW_in_key_in_compound_operator4313);
                    in_key263=in_key();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(in_key263.getTree(), root_0);

                    }
                    break;
                case 2 :
                    // src/main/resources/org/drools/lang/DRL.g:1261:14: not_key in_key
                    {
                    pushFollow(FOLLOW_not_key_in_compound_operator4318);
                    not_key264=not_key();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, not_key264.getTree());
                    pushFollow(FOLLOW_in_key_in_compound_operator4320);
                    in_key265=in_key();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(in_key265.getTree(), root_0);

                    }
                    break;

            }

            if ( backtracking==0 ) {
              	emit(Location.LOCATION_LHS_INSIDE_CONDITION_ARGUMENT);	
            }
            LEFT_PAREN266=(Token)input.LT(1);
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_compound_operator4331); if (failed) return retval;
            if ( backtracking==0 ) {
              	emit(LEFT_PAREN266, DroolsEditorType.SYMBOL);	
            }
            pushFollow(FOLLOW_expression_value_in_compound_operator4339);
            expression_value267=expression_value();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, expression_value267.getTree());
            // src/main/resources/org/drools/lang/DRL.g:1264:21: ( COMMA expression_value )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==COMMA) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:1264:23: COMMA expression_value
            	    {
            	    COMMA268=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_compound_operator4343); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	      	emit(COMMA268, DroolsEditorType.SYMBOL);	
            	    }
            	    pushFollow(FOLLOW_expression_value_in_compound_operator4348);
            	    expression_value269=expression_value();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, expression_value269.getTree());

            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);

            RIGHT_PAREN270=(Token)input.LT(1);
            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_compound_operator4356); if (failed) return retval;
            if ( backtracking==0 ) {
            RIGHT_PAREN270_tree = (Object)adaptor.create(RIGHT_PAREN270);
            adaptor.addChild(root_0, RIGHT_PAREN270_tree);
            }
            if ( backtracking==0 ) {
              	emit(RIGHT_PAREN270, DroolsEditorType.SYMBOL);	
            }
            if ( backtracking==0 ) {
              	emit(Location.LOCATION_LHS_INSIDE_CONDITION_END);	
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
             
            	if (isEditorInterfaceEnabled && input.LA(2) == EOF && input.LA(1) == DOUBLE_PIPE) {
            		emit(input.LT(1), DroolsEditorType.SYMBOL);
            		input.consume();
            		emit(true, Location.LOCATION_LHS_INSIDE_CONDITION_OPERATOR);
            	}	
        }
        return retval;
    }
    // $ANTLR end compound_operator

    public static class expression_value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start expression_value
    // src/main/resources/org/drools/lang/DRL.g:1275:1: expression_value : ( accessor_path | literal_constraint | paren_chunk ) ;
    public final expression_value_return expression_value() throws RecognitionException {
        expression_value_return retval = new expression_value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        accessor_path_return accessor_path271 = null;

        literal_constraint_return literal_constraint272 = null;

        paren_chunk_return paren_chunk273 = null;



        try {
            // src/main/resources/org/drools/lang/DRL.g:1276:2: ( ( accessor_path | literal_constraint | paren_chunk ) )
            // src/main/resources/org/drools/lang/DRL.g:1276:4: ( accessor_path | literal_constraint | paren_chunk )
            {
            root_0 = (Object)adaptor.nil();

            // src/main/resources/org/drools/lang/DRL.g:1276:4: ( accessor_path | literal_constraint | paren_chunk )
            int alt89=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt89=1;
                }
                break;
            case STRING:
            case BOOL:
            case INT:
            case FLOAT:
            case NULL:
                {
                alt89=2;
                }
                break;
            case LEFT_PAREN:
                {
                alt89=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1276:4: ( accessor_path | literal_constraint | paren_chunk )", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:1276:5: accessor_path
                    {
                    pushFollow(FOLLOW_accessor_path_in_expression_value4377);
                    accessor_path271=accessor_path();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, accessor_path271.getTree());

                    }
                    break;
                case 2 :
                    // src/main/resources/org/drools/lang/DRL.g:1277:4: literal_constraint
                    {
                    pushFollow(FOLLOW_literal_constraint_in_expression_value4382);
                    literal_constraint272=literal_constraint();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, literal_constraint272.getTree());

                    }
                    break;
                case 3 :
                    // src/main/resources/org/drools/lang/DRL.g:1278:4: paren_chunk
                    {
                    pushFollow(FOLLOW_paren_chunk_in_expression_value4388);
                    paren_chunk273=paren_chunk();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, paren_chunk273.getTree());

                    }
                    break;

            }

            if ( backtracking==0 ) {
              	if (isEditorInterfaceEnabled && !(input.LA(1) == EOF && input.get(input.index() - 1).getType() != WS))
              			emit(Location.LOCATION_LHS_INSIDE_CONDITION_END);	
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
             
            	if (isEditorInterfaceEnabled && input.LA(2) == EOF) {
            		if (input.LA(1) == DOUBLE_PIPE) {
            			emit(input.LT(1), DroolsEditorType.SYMBOL);
            			input.consume();
            			emit(true, Location.LOCATION_LHS_INSIDE_CONDITION_OPERATOR);
            		}
            	}

        }
        return retval;
    }
    // $ANTLR end expression_value

    public static class literal_constraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start literal_constraint
    // src/main/resources/org/drools/lang/DRL.g:1292:1: literal_constraint : ( STRING | INT | FLOAT | BOOL | NULL );
    public final literal_constraint_return literal_constraint() throws RecognitionException {
        literal_constraint_return retval = new literal_constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING274=null;
        Token INT275=null;
        Token FLOAT276=null;
        Token BOOL277=null;
        Token NULL278=null;

        Object STRING274_tree=null;
        Object INT275_tree=null;
        Object FLOAT276_tree=null;
        Object BOOL277_tree=null;
        Object NULL278_tree=null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:1293:2: ( STRING | INT | FLOAT | BOOL | NULL )
            int alt90=5;
            switch ( input.LA(1) ) {
            case STRING:
                {
                alt90=1;
                }
                break;
            case INT:
                {
                alt90=2;
                }
                break;
            case FLOAT:
                {
                alt90=3;
                }
                break;
            case BOOL:
                {
                alt90=4;
                }
                break;
            case NULL:
                {
                alt90=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("1292:1: literal_constraint : ( STRING | INT | FLOAT | BOOL | NULL );", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:1293:4: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING274=(Token)input.LT(1);
                    match(input,STRING,FOLLOW_STRING_in_literal_constraint4407); if (failed) return retval;
                    if ( backtracking==0 ) {
                    STRING274_tree = (Object)adaptor.create(STRING274);
                    adaptor.addChild(root_0, STRING274_tree);
                    }
                    if ( backtracking==0 ) {
                      	emit(STRING274, DroolsEditorType.STRING_CONST);	
                    }

                    }
                    break;
                case 2 :
                    // src/main/resources/org/drools/lang/DRL.g:1294:4: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT275=(Token)input.LT(1);
                    match(input,INT,FOLLOW_INT_in_literal_constraint4414); if (failed) return retval;
                    if ( backtracking==0 ) {
                    INT275_tree = (Object)adaptor.create(INT275);
                    adaptor.addChild(root_0, INT275_tree);
                    }
                    if ( backtracking==0 ) {
                      	emit(INT275, DroolsEditorType.NUMERIC_CONST);	
                    }

                    }
                    break;
                case 3 :
                    // src/main/resources/org/drools/lang/DRL.g:1295:4: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    FLOAT276=(Token)input.LT(1);
                    match(input,FLOAT,FOLLOW_FLOAT_in_literal_constraint4421); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FLOAT276_tree = (Object)adaptor.create(FLOAT276);
                    adaptor.addChild(root_0, FLOAT276_tree);
                    }
                    if ( backtracking==0 ) {
                      	emit(FLOAT276, DroolsEditorType.NUMERIC_CONST);	
                    }

                    }
                    break;
                case 4 :
                    // src/main/resources/org/drools/lang/DRL.g:1296:4: BOOL
                    {
                    root_0 = (Object)adaptor.nil();

                    BOOL277=(Token)input.LT(1);
                    match(input,BOOL,FOLLOW_BOOL_in_literal_constraint4428); if (failed) return retval;
                    if ( backtracking==0 ) {
                    BOOL277_tree = (Object)adaptor.create(BOOL277);
                    adaptor.addChild(root_0, BOOL277_tree);
                    }
                    if ( backtracking==0 ) {
                      	emit(BOOL277, DroolsEditorType.BOOLEAN_CONST);	
                    }

                    }
                    break;
                case 5 :
                    // src/main/resources/org/drools/lang/DRL.g:1297:4: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL278=(Token)input.LT(1);
                    match(input,NULL,FOLLOW_NULL_in_literal_constraint4435); if (failed) return retval;
                    if ( backtracking==0 ) {
                    NULL278_tree = (Object)adaptor.create(NULL278);
                    adaptor.addChild(root_0, NULL278_tree);
                    }
                    if ( backtracking==0 ) {
                      	emit(NULL278, DroolsEditorType.NULL_CONST);	
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end literal_constraint

    public static class pattern_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start pattern_type
    // src/main/resources/org/drools/lang/DRL.g:1300:1: pattern_type : id+= ID (id+= DOT id+= ID )* ( dimension_definition )* -> ^( VT_PATTERN_TYPE ( ID )+ ( dimension_definition )* ) ;
    public final pattern_type_return pattern_type() throws RecognitionException {
        pattern_type_return retval = new pattern_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;
        List list_id=null;
        dimension_definition_return dimension_definition279 = null;


        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_dimension_definition=new RewriteRuleSubtreeStream(adaptor,"rule dimension_definition");
        try {
            // src/main/resources/org/drools/lang/DRL.g:1301:2: (id+= ID (id+= DOT id+= ID )* ( dimension_definition )* -> ^( VT_PATTERN_TYPE ( ID )+ ( dimension_definition )* ) )
            // src/main/resources/org/drools/lang/DRL.g:1301:4: id+= ID (id+= DOT id+= ID )* ( dimension_definition )*
            {
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_pattern_type4450); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if (list_id==null) list_id=new ArrayList();
            list_id.add(id);

            // src/main/resources/org/drools/lang/DRL.g:1301:11: (id+= DOT id+= ID )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==DOT) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:1301:13: id+= DOT id+= ID
            	    {
            	    id=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_pattern_type4456); if (failed) return retval;
            	    if ( backtracking==0 ) stream_DOT.add(id);

            	    if (list_id==null) list_id=new ArrayList();
            	    list_id.add(id);

            	    id=(Token)input.LT(1);
            	    match(input,ID,FOLLOW_ID_in_pattern_type4460); if (failed) return retval;
            	    if ( backtracking==0 ) stream_ID.add(id);

            	    if (list_id==null) list_id=new ArrayList();
            	    list_id.add(id);


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);

            if ( backtracking==0 ) {
              	emit(list_id, DroolsEditorType.IDENTIFIER);
              		setParaphrasesValue(DroolsParaphraseTypes.PATTERN, buildStringFromTokens(list_id));	
            }
            // src/main/resources/org/drools/lang/DRL.g:1304:6: ( dimension_definition )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==LEFT_SQUARE) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:1304:6: dimension_definition
            	    {
            	    pushFollow(FOLLOW_dimension_definition_in_pattern_type4475);
            	    dimension_definition279=dimension_definition();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_dimension_definition.add(dimension_definition279.getTree());

            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);


            // AST REWRITE
            // elements: dimension_definition, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1305:3: -> ^( VT_PATTERN_TYPE ( ID )+ ( dimension_definition )* )
            {
                // src/main/resources/org/drools/lang/DRL.g:1305:6: ^( VT_PATTERN_TYPE ( ID )+ ( dimension_definition )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(VT_PATTERN_TYPE, "VT_PATTERN_TYPE"), root_1);

                if ( !(stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.next());

                }
                stream_ID.reset();
                // src/main/resources/org/drools/lang/DRL.g:1305:28: ( dimension_definition )*
                while ( stream_dimension_definition.hasNext() ) {
                    adaptor.addChild(root_1, stream_dimension_definition.next());

                }
                stream_dimension_definition.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end pattern_type

    public static class data_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start data_type
    // src/main/resources/org/drools/lang/DRL.g:1308:1: data_type : id+= ID (id+= DOT id+= ID )* ( dimension_definition )* -> ^( VT_DATA_TYPE ( ID )+ ( dimension_definition )* ) ;
    public final data_type_return data_type() throws RecognitionException {
        data_type_return retval = new data_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;
        List list_id=null;
        dimension_definition_return dimension_definition280 = null;


        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_dimension_definition=new RewriteRuleSubtreeStream(adaptor,"rule dimension_definition");
        try {
            // src/main/resources/org/drools/lang/DRL.g:1309:2: (id+= ID (id+= DOT id+= ID )* ( dimension_definition )* -> ^( VT_DATA_TYPE ( ID )+ ( dimension_definition )* ) )
            // src/main/resources/org/drools/lang/DRL.g:1309:4: id+= ID (id+= DOT id+= ID )* ( dimension_definition )*
            {
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_data_type4503); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if (list_id==null) list_id=new ArrayList();
            list_id.add(id);

            // src/main/resources/org/drools/lang/DRL.g:1309:11: (id+= DOT id+= ID )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==DOT) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:1309:13: id+= DOT id+= ID
            	    {
            	    id=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_data_type4509); if (failed) return retval;
            	    if ( backtracking==0 ) stream_DOT.add(id);

            	    if (list_id==null) list_id=new ArrayList();
            	    list_id.add(id);

            	    id=(Token)input.LT(1);
            	    match(input,ID,FOLLOW_ID_in_data_type4513); if (failed) return retval;
            	    if ( backtracking==0 ) stream_ID.add(id);

            	    if (list_id==null) list_id=new ArrayList();
            	    list_id.add(id);


            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);

            // src/main/resources/org/drools/lang/DRL.g:1309:31: ( dimension_definition )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==LEFT_SQUARE) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:1309:31: dimension_definition
            	    {
            	    pushFollow(FOLLOW_dimension_definition_in_data_type4518);
            	    dimension_definition280=dimension_definition();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_dimension_definition.add(dimension_definition280.getTree());

            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);

            if ( backtracking==0 ) {
              	emit(list_id, DroolsEditorType.IDENTIFIER);	
            }

            // AST REWRITE
            // elements: ID, dimension_definition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1311:3: -> ^( VT_DATA_TYPE ( ID )+ ( dimension_definition )* )
            {
                // src/main/resources/org/drools/lang/DRL.g:1311:6: ^( VT_DATA_TYPE ( ID )+ ( dimension_definition )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(VT_DATA_TYPE, "VT_DATA_TYPE"), root_1);

                if ( !(stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.next());

                }
                stream_ID.reset();
                // src/main/resources/org/drools/lang/DRL.g:1311:25: ( dimension_definition )*
                while ( stream_dimension_definition.hasNext() ) {
                    adaptor.addChild(root_1, stream_dimension_definition.next());

                }
                stream_dimension_definition.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end data_type

    public static class dimension_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start dimension_definition
    // src/main/resources/org/drools/lang/DRL.g:1314:1: dimension_definition : LEFT_SQUARE RIGHT_SQUARE ;
    public final dimension_definition_return dimension_definition() throws RecognitionException {
        dimension_definition_return retval = new dimension_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_SQUARE281=null;
        Token RIGHT_SQUARE282=null;

        Object LEFT_SQUARE281_tree=null;
        Object RIGHT_SQUARE282_tree=null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:1315:2: ( LEFT_SQUARE RIGHT_SQUARE )
            // src/main/resources/org/drools/lang/DRL.g:1315:4: LEFT_SQUARE RIGHT_SQUARE
            {
            root_0 = (Object)adaptor.nil();

            LEFT_SQUARE281=(Token)input.LT(1);
            match(input,LEFT_SQUARE,FOLLOW_LEFT_SQUARE_in_dimension_definition4547); if (failed) return retval;
            if ( backtracking==0 ) {
            LEFT_SQUARE281_tree = (Object)adaptor.create(LEFT_SQUARE281);
            adaptor.addChild(root_0, LEFT_SQUARE281_tree);
            }
            if ( backtracking==0 ) {
              	emit(LEFT_SQUARE281, DroolsEditorType.SYMBOL);	
            }
            RIGHT_SQUARE282=(Token)input.LT(1);
            match(input,RIGHT_SQUARE,FOLLOW_RIGHT_SQUARE_in_dimension_definition4554); if (failed) return retval;
            if ( backtracking==0 ) {
            RIGHT_SQUARE282_tree = (Object)adaptor.create(RIGHT_SQUARE282);
            adaptor.addChild(root_0, RIGHT_SQUARE282_tree);
            }
            if ( backtracking==0 ) {
              	emit(RIGHT_SQUARE282, DroolsEditorType.SYMBOL);	
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end dimension_definition

    public static class accessor_path_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start accessor_path
    // src/main/resources/org/drools/lang/DRL.g:1319:1: accessor_path : accessor_element ( DOT accessor_element )* -> ^( VT_ACCESSOR_PATH ( accessor_element )+ ) ;
    public final accessor_path_return accessor_path() throws RecognitionException {
        accessor_path_return retval = new accessor_path_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT284=null;
        accessor_element_return accessor_element283 = null;

        accessor_element_return accessor_element285 = null;


        Object DOT284_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_accessor_element=new RewriteRuleSubtreeStream(adaptor,"rule accessor_element");
        try {
            // src/main/resources/org/drools/lang/DRL.g:1320:2: ( accessor_element ( DOT accessor_element )* -> ^( VT_ACCESSOR_PATH ( accessor_element )+ ) )
            // src/main/resources/org/drools/lang/DRL.g:1320:4: accessor_element ( DOT accessor_element )*
            {
            pushFollow(FOLLOW_accessor_element_in_accessor_path4568);
            accessor_element283=accessor_element();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_accessor_element.add(accessor_element283.getTree());
            // src/main/resources/org/drools/lang/DRL.g:1320:21: ( DOT accessor_element )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==DOT) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:1320:23: DOT accessor_element
            	    {
            	    DOT284=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_accessor_path4572); if (failed) return retval;
            	    if ( backtracking==0 ) stream_DOT.add(DOT284);

            	    if ( backtracking==0 ) {
            	      	emit(DOT284, DroolsEditorType.IDENTIFIER);	
            	    }
            	    pushFollow(FOLLOW_accessor_element_in_accessor_path4576);
            	    accessor_element285=accessor_element();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_accessor_element.add(accessor_element285.getTree());

            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);


            // AST REWRITE
            // elements: accessor_element
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1321:2: -> ^( VT_ACCESSOR_PATH ( accessor_element )+ )
            {
                // src/main/resources/org/drools/lang/DRL.g:1321:5: ^( VT_ACCESSOR_PATH ( accessor_element )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(VT_ACCESSOR_PATH, "VT_ACCESSOR_PATH"), root_1);

                if ( !(stream_accessor_element.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_accessor_element.hasNext() ) {
                    adaptor.addChild(root_1, stream_accessor_element.next());

                }
                stream_accessor_element.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end accessor_path

    public static class accessor_element_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start accessor_element
    // src/main/resources/org/drools/lang/DRL.g:1324:1: accessor_element : ID ( square_chunk )* -> ^( VT_ACCESSOR_ELEMENT ID ( square_chunk )* ) ;
    public final accessor_element_return accessor_element() throws RecognitionException {
        accessor_element_return retval = new accessor_element_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID286=null;
        square_chunk_return square_chunk287 = null;


        Object ID286_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_square_chunk=new RewriteRuleSubtreeStream(adaptor,"rule square_chunk");
        try {
            // src/main/resources/org/drools/lang/DRL.g:1325:2: ( ID ( square_chunk )* -> ^( VT_ACCESSOR_ELEMENT ID ( square_chunk )* ) )
            // src/main/resources/org/drools/lang/DRL.g:1325:4: ID ( square_chunk )*
            {
            ID286=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_accessor_element4600); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(ID286);

            if ( backtracking==0 ) {
              	emit(ID286, DroolsEditorType.IDENTIFIER);	
            }
            // src/main/resources/org/drools/lang/DRL.g:1326:3: ( square_chunk )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==LEFT_SQUARE) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:1326:3: square_chunk
            	    {
            	    pushFollow(FOLLOW_square_chunk_in_accessor_element4606);
            	    square_chunk287=square_chunk();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_square_chunk.add(square_chunk287.getTree());

            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);


            // AST REWRITE
            // elements: ID, square_chunk
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1327:2: -> ^( VT_ACCESSOR_ELEMENT ID ( square_chunk )* )
            {
                // src/main/resources/org/drools/lang/DRL.g:1327:5: ^( VT_ACCESSOR_ELEMENT ID ( square_chunk )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(VT_ACCESSOR_ELEMENT, "VT_ACCESSOR_ELEMENT"), root_1);

                adaptor.addChild(root_1, stream_ID.next());
                // src/main/resources/org/drools/lang/DRL.g:1327:30: ( square_chunk )*
                while ( stream_square_chunk.hasNext() ) {
                    adaptor.addChild(root_1, stream_square_chunk.next());

                }
                stream_square_chunk.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end accessor_element

    public static class rhs_chunk_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start rhs_chunk
    // src/main/resources/org/drools/lang/DRL.g:1330:1: rhs_chunk : rc= rhs_chunk_data -> VT_RHS_CHUNK[$rc.start,text] ;
    public final rhs_chunk_return rhs_chunk() throws RecognitionException {
        rhs_chunk_return retval = new rhs_chunk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        rhs_chunk_data_return rc = null;


        RewriteRuleSubtreeStream stream_rhs_chunk_data=new RewriteRuleSubtreeStream(adaptor,"rule rhs_chunk_data");

        	String text = "";

        try {
            // src/main/resources/org/drools/lang/DRL.g:1333:3: (rc= rhs_chunk_data -> VT_RHS_CHUNK[$rc.start,text] )
            // src/main/resources/org/drools/lang/DRL.g:1333:5: rc= rhs_chunk_data
            {
            pushFollow(FOLLOW_rhs_chunk_data_in_rhs_chunk4635);
            rc=rhs_chunk_data();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_rhs_chunk_data.add(rc.getTree());
            if ( backtracking==0 ) {
              text = input.toString(rc.start,rc.stop);
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1334:2: -> VT_RHS_CHUNK[$rc.start,text]
            {
                adaptor.addChild(root_0, adaptor.create(VT_RHS_CHUNK, ((Token)rc.start), text));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end rhs_chunk

    public static class rhs_chunk_data_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start rhs_chunk_data
    // src/main/resources/org/drools/lang/DRL.g:1337:1: rhs_chunk_data : THEN (any=~ END )* end1= END ( SEMICOLON )? ;
    public final rhs_chunk_data_return rhs_chunk_data() throws RecognitionException {
        rhs_chunk_data_return retval = new rhs_chunk_data_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token any=null;
        Token end1=null;
        Token THEN288=null;
        Token SEMICOLON289=null;

        Object any_tree=null;
        Object end1_tree=null;
        Object THEN288_tree=null;
        Object SEMICOLON289_tree=null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:1338:2: ( THEN (any=~ END )* end1= END ( SEMICOLON )? )
            // src/main/resources/org/drools/lang/DRL.g:1338:4: THEN (any=~ END )* end1= END ( SEMICOLON )?
            {
            root_0 = (Object)adaptor.nil();

            THEN288=(Token)input.LT(1);
            match(input,THEN,FOLLOW_THEN_in_rhs_chunk_data4654); if (failed) return retval;
            if ( backtracking==0 ) {
            THEN288_tree = (Object)adaptor.create(THEN288);
            adaptor.addChild(root_0, THEN288_tree);
            }
            if ( backtracking==0 ) {
              	if (THEN288.getText().equalsIgnoreCase("then")){
              			emit(THEN288, DroolsEditorType.KEYWORD);
              			emit(Location.LOCATION_RHS);
              		}	
            }
            // src/main/resources/org/drools/lang/DRL.g:1343:4: (any=~ END )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( ((LA97_0>=VT_COMPILATION_UNIT && LA97_0<=DOT_STAR)||(LA97_0>=STRING && LA97_0<=MULTI_LINE_COMMENT)) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:1343:6: any=~ END
            	    {
            	    any=(Token)input.LT(1);
            	    if ( (input.LA(1)>=VT_COMPILATION_UNIT && input.LA(1)<=DOT_STAR)||(input.LA(1)>=STRING && input.LA(1)<=MULTI_LINE_COMMENT) ) {
            	        input.consume();
            	        if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(any));
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_rhs_chunk_data4667);    throw mse;
            	    }

            	    if ( backtracking==0 ) {
            	       emit(any, DroolsEditorType.CODE_CHUNK); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);

            end1=(Token)input.LT(1);
            match(input,END,FOLLOW_END_in_rhs_chunk_data4680); if (failed) return retval;
            if ( backtracking==0 ) {
            end1_tree = (Object)adaptor.create(end1);
            adaptor.addChild(root_0, end1_tree);
            }
            if ( backtracking==0 ) {
              	emit(end1, DroolsEditorType.KEYWORD);	
            }
            // src/main/resources/org/drools/lang/DRL.g:1345:3: ( SEMICOLON )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==SEMICOLON) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // src/main/resources/org/drools/lang/DRL.g:1345:3: SEMICOLON
                    {
                    SEMICOLON289=(Token)input.LT(1);
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_rhs_chunk_data4686); if (failed) return retval;
                    if ( backtracking==0 ) {
                    SEMICOLON289_tree = (Object)adaptor.create(SEMICOLON289);
                    adaptor.addChild(root_0, SEMICOLON289_tree);
                    }

                    }
                    break;

            }

            if ( backtracking==0 ) {
              	emit(SEMICOLON289, DroolsEditorType.KEYWORD);	
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end rhs_chunk_data

    public static class curly_chunk_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start curly_chunk
    // src/main/resources/org/drools/lang/DRL.g:1348:1: curly_chunk : cc= curly_chunk_data[false] -> VT_CURLY_CHUNK[$cc.start,text] ;
    public final curly_chunk_return curly_chunk() throws RecognitionException {
        curly_chunk_return retval = new curly_chunk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        curly_chunk_data_return cc = null;


        RewriteRuleSubtreeStream stream_curly_chunk_data=new RewriteRuleSubtreeStream(adaptor,"rule curly_chunk_data");

        	String text = "";

        try {
            // src/main/resources/org/drools/lang/DRL.g:1351:3: (cc= curly_chunk_data[false] -> VT_CURLY_CHUNK[$cc.start,text] )
            // src/main/resources/org/drools/lang/DRL.g:1351:5: cc= curly_chunk_data[false]
            {
            pushFollow(FOLLOW_curly_chunk_data_in_curly_chunk4705);
            cc=curly_chunk_data(false);
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_curly_chunk_data.add(cc.getTree());
            if ( backtracking==0 ) {
              text = input.toString(cc.start,cc.stop);
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1352:2: -> VT_CURLY_CHUNK[$cc.start,text]
            {
                adaptor.addChild(root_0, adaptor.create(VT_CURLY_CHUNK, ((Token)cc.start), text));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end curly_chunk

    public static class curly_chunk_data_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start curly_chunk_data
    // src/main/resources/org/drools/lang/DRL.g:1355:1: curly_chunk_data[boolean isRecursive] : lc1= LEFT_CURLY (any=~ ( LEFT_CURLY | RIGHT_CURLY ) | curly_chunk_data[true] )* rc1= RIGHT_CURLY ;
    public final curly_chunk_data_return curly_chunk_data(boolean isRecursive) throws RecognitionException {
        curly_chunk_data_return retval = new curly_chunk_data_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lc1=null;
        Token any=null;
        Token rc1=null;
        curly_chunk_data_return curly_chunk_data290 = null;


        Object lc1_tree=null;
        Object any_tree=null;
        Object rc1_tree=null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:1356:2: (lc1= LEFT_CURLY (any=~ ( LEFT_CURLY | RIGHT_CURLY ) | curly_chunk_data[true] )* rc1= RIGHT_CURLY )
            // src/main/resources/org/drools/lang/DRL.g:1356:4: lc1= LEFT_CURLY (any=~ ( LEFT_CURLY | RIGHT_CURLY ) | curly_chunk_data[true] )* rc1= RIGHT_CURLY
            {
            root_0 = (Object)adaptor.nil();

            lc1=(Token)input.LT(1);
            match(input,LEFT_CURLY,FOLLOW_LEFT_CURLY_in_curly_chunk_data4728); if (failed) return retval;
            if ( backtracking==0 ) {
            lc1_tree = (Object)adaptor.create(lc1);
            adaptor.addChild(root_0, lc1_tree);
            }
            if ( backtracking==0 ) {
              	if (!isRecursive) {
              				emit(lc1, DroolsEditorType.SYMBOL);
              			} else {
              				emit(lc1, DroolsEditorType.CODE_CHUNK);
              			}	
              		
            }
            // src/main/resources/org/drools/lang/DRL.g:1363:4: (any=~ ( LEFT_CURLY | RIGHT_CURLY ) | curly_chunk_data[true] )*
            loop99:
            do {
                int alt99=3;
                int LA99_0 = input.LA(1);

                if ( ((LA99_0>=VT_COMPILATION_UNIT && LA99_0<=THEN)||(LA99_0>=MISC && LA99_0<=MULTI_LINE_COMMENT)) ) {
                    alt99=1;
                }
                else if ( (LA99_0==LEFT_CURLY) ) {
                    alt99=2;
                }


                switch (alt99) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:1363:5: any=~ ( LEFT_CURLY | RIGHT_CURLY )
            	    {
            	    any=(Token)input.LT(1);
            	    if ( (input.LA(1)>=VT_COMPILATION_UNIT && input.LA(1)<=THEN)||(input.LA(1)>=MISC && input.LA(1)<=MULTI_LINE_COMMENT) ) {
            	        input.consume();
            	        if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(any));
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_curly_chunk_data4740);    throw mse;
            	    }

            	    if ( backtracking==0 ) {
            	       emit(any, DroolsEditorType.CODE_CHUNK); 
            	    }

            	    }
            	    break;
            	case 2 :
            	    // src/main/resources/org/drools/lang/DRL.g:1363:87: curly_chunk_data[true]
            	    {
            	    pushFollow(FOLLOW_curly_chunk_data_in_curly_chunk_data4756);
            	    curly_chunk_data290=curly_chunk_data(true);
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, curly_chunk_data290.getTree());

            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);

            rc1=(Token)input.LT(1);
            match(input,RIGHT_CURLY,FOLLOW_RIGHT_CURLY_in_curly_chunk_data4767); if (failed) return retval;
            if ( backtracking==0 ) {
            rc1_tree = (Object)adaptor.create(rc1);
            adaptor.addChild(root_0, rc1_tree);
            }
            if ( backtracking==0 ) {
              	if (!isRecursive) {
              				emit(rc1, DroolsEditorType.SYMBOL);
              			} else {
              				emit(rc1, DroolsEditorType.CODE_CHUNK);
              			}	
              		
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end curly_chunk_data

    public static class paren_chunk_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start paren_chunk
    // src/main/resources/org/drools/lang/DRL.g:1373:1: paren_chunk : pc= paren_chunk_data[false] -> VT_PAREN_CHUNK[$pc.start,text] ;
    public final paren_chunk_return paren_chunk() throws RecognitionException {
        paren_chunk_return retval = new paren_chunk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        paren_chunk_data_return pc = null;


        RewriteRuleSubtreeStream stream_paren_chunk_data=new RewriteRuleSubtreeStream(adaptor,"rule paren_chunk_data");

        	String text = "";

        try {
            // src/main/resources/org/drools/lang/DRL.g:1376:3: (pc= paren_chunk_data[false] -> VT_PAREN_CHUNK[$pc.start,text] )
            // src/main/resources/org/drools/lang/DRL.g:1376:5: pc= paren_chunk_data[false]
            {
            pushFollow(FOLLOW_paren_chunk_data_in_paren_chunk4788);
            pc=paren_chunk_data(false);
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_paren_chunk_data.add(pc.getTree());
            if ( backtracking==0 ) {
              text = input.toString(pc.start,pc.stop);
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1377:2: -> VT_PAREN_CHUNK[$pc.start,text]
            {
                adaptor.addChild(root_0, adaptor.create(VT_PAREN_CHUNK, ((Token)pc.start), text));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end paren_chunk

    public static class paren_chunk_data_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start paren_chunk_data
    // src/main/resources/org/drools/lang/DRL.g:1380:1: paren_chunk_data[boolean isRecursive] : lp1= LEFT_PAREN (any=~ ( LEFT_PAREN | RIGHT_PAREN ) | paren_chunk_data[true] )* rp1= RIGHT_PAREN ;
    public final paren_chunk_data_return paren_chunk_data(boolean isRecursive) throws RecognitionException {
        paren_chunk_data_return retval = new paren_chunk_data_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lp1=null;
        Token any=null;
        Token rp1=null;
        paren_chunk_data_return paren_chunk_data291 = null;


        Object lp1_tree=null;
        Object any_tree=null;
        Object rp1_tree=null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:1381:2: (lp1= LEFT_PAREN (any=~ ( LEFT_PAREN | RIGHT_PAREN ) | paren_chunk_data[true] )* rp1= RIGHT_PAREN )
            // src/main/resources/org/drools/lang/DRL.g:1381:4: lp1= LEFT_PAREN (any=~ ( LEFT_PAREN | RIGHT_PAREN ) | paren_chunk_data[true] )* rp1= RIGHT_PAREN
            {
            root_0 = (Object)adaptor.nil();

            lp1=(Token)input.LT(1);
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_paren_chunk_data4812); if (failed) return retval;
            if ( backtracking==0 ) {
            lp1_tree = (Object)adaptor.create(lp1);
            adaptor.addChild(root_0, lp1_tree);
            }
            if ( backtracking==0 ) {
              	if (!isRecursive) {
              				emit(lp1, DroolsEditorType.SYMBOL);
              			} else {
              				emit(lp1, DroolsEditorType.CODE_CHUNK);
              			}	
              		
            }
            // src/main/resources/org/drools/lang/DRL.g:1388:4: (any=~ ( LEFT_PAREN | RIGHT_PAREN ) | paren_chunk_data[true] )*
            loop100:
            do {
                int alt100=3;
                int LA100_0 = input.LA(1);

                if ( ((LA100_0>=VT_COMPILATION_UNIT && LA100_0<=STRING)||LA100_0==COMMA||(LA100_0>=AT && LA100_0<=MULTI_LINE_COMMENT)) ) {
                    alt100=1;
                }
                else if ( (LA100_0==LEFT_PAREN) ) {
                    alt100=2;
                }


                switch (alt100) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:1388:5: any=~ ( LEFT_PAREN | RIGHT_PAREN )
            	    {
            	    any=(Token)input.LT(1);
            	    if ( (input.LA(1)>=VT_COMPILATION_UNIT && input.LA(1)<=STRING)||input.LA(1)==COMMA||(input.LA(1)>=AT && input.LA(1)<=MULTI_LINE_COMMENT) ) {
            	        input.consume();
            	        if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(any));
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_paren_chunk_data4824);    throw mse;
            	    }

            	    if ( backtracking==0 ) {
            	       emit(any, DroolsEditorType.CODE_CHUNK); 
            	    }

            	    }
            	    break;
            	case 2 :
            	    // src/main/resources/org/drools/lang/DRL.g:1388:87: paren_chunk_data[true]
            	    {
            	    pushFollow(FOLLOW_paren_chunk_data_in_paren_chunk_data4840);
            	    paren_chunk_data291=paren_chunk_data(true);
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, paren_chunk_data291.getTree());

            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);

            rp1=(Token)input.LT(1);
            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_paren_chunk_data4851); if (failed) return retval;
            if ( backtracking==0 ) {
            rp1_tree = (Object)adaptor.create(rp1);
            adaptor.addChild(root_0, rp1_tree);
            }
            if ( backtracking==0 ) {
              	if (!isRecursive) {
              				emit(rp1, DroolsEditorType.SYMBOL);
              			} else {
              				emit(rp1, DroolsEditorType.CODE_CHUNK);
              			}	
              		
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end paren_chunk_data

    public static class square_chunk_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start square_chunk
    // src/main/resources/org/drools/lang/DRL.g:1398:1: square_chunk : sc= square_chunk_data[false] -> VT_SQUARE_CHUNK[$sc.start,text] ;
    public final square_chunk_return square_chunk() throws RecognitionException {
        square_chunk_return retval = new square_chunk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        square_chunk_data_return sc = null;


        RewriteRuleSubtreeStream stream_square_chunk_data=new RewriteRuleSubtreeStream(adaptor,"rule square_chunk_data");

        	String text = "";

        try {
            // src/main/resources/org/drools/lang/DRL.g:1401:3: (sc= square_chunk_data[false] -> VT_SQUARE_CHUNK[$sc.start,text] )
            // src/main/resources/org/drools/lang/DRL.g:1401:5: sc= square_chunk_data[false]
            {
            pushFollow(FOLLOW_square_chunk_data_in_square_chunk4872);
            sc=square_chunk_data(false);
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_square_chunk_data.add(sc.getTree());
            if ( backtracking==0 ) {
              text = input.toString(sc.start,sc.stop);
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1402:2: -> VT_SQUARE_CHUNK[$sc.start,text]
            {
                adaptor.addChild(root_0, adaptor.create(VT_SQUARE_CHUNK, ((Token)sc.start), text));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end square_chunk

    public static class square_chunk_data_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start square_chunk_data
    // src/main/resources/org/drools/lang/DRL.g:1405:1: square_chunk_data[boolean isRecursive] : ls1= LEFT_SQUARE (any=~ ( LEFT_SQUARE | RIGHT_SQUARE ) | square_chunk_data[true] )* rs1= RIGHT_SQUARE ;
    public final square_chunk_data_return square_chunk_data(boolean isRecursive) throws RecognitionException {
        square_chunk_data_return retval = new square_chunk_data_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ls1=null;
        Token any=null;
        Token rs1=null;
        square_chunk_data_return square_chunk_data292 = null;


        Object ls1_tree=null;
        Object any_tree=null;
        Object rs1_tree=null;

        try {
            // src/main/resources/org/drools/lang/DRL.g:1406:2: (ls1= LEFT_SQUARE (any=~ ( LEFT_SQUARE | RIGHT_SQUARE ) | square_chunk_data[true] )* rs1= RIGHT_SQUARE )
            // src/main/resources/org/drools/lang/DRL.g:1406:4: ls1= LEFT_SQUARE (any=~ ( LEFT_SQUARE | RIGHT_SQUARE ) | square_chunk_data[true] )* rs1= RIGHT_SQUARE
            {
            root_0 = (Object)adaptor.nil();

            ls1=(Token)input.LT(1);
            match(input,LEFT_SQUARE,FOLLOW_LEFT_SQUARE_in_square_chunk_data4895); if (failed) return retval;
            if ( backtracking==0 ) {
            ls1_tree = (Object)adaptor.create(ls1);
            adaptor.addChild(root_0, ls1_tree);
            }
            if ( backtracking==0 ) {
              	if (!isRecursive) {
              				emit(ls1, DroolsEditorType.SYMBOL);
              			} else {
              				emit(ls1, DroolsEditorType.CODE_CHUNK);
              			}	
              		
            }
            // src/main/resources/org/drools/lang/DRL.g:1413:4: (any=~ ( LEFT_SQUARE | RIGHT_SQUARE ) | square_chunk_data[true] )*
            loop101:
            do {
                int alt101=3;
                int LA101_0 = input.LA(1);

                if ( ((LA101_0>=VT_COMPILATION_UNIT && LA101_0<=NULL)||(LA101_0>=THEN && LA101_0<=MULTI_LINE_COMMENT)) ) {
                    alt101=1;
                }
                else if ( (LA101_0==LEFT_SQUARE) ) {
                    alt101=2;
                }


                switch (alt101) {
            	case 1 :
            	    // src/main/resources/org/drools/lang/DRL.g:1413:5: any=~ ( LEFT_SQUARE | RIGHT_SQUARE )
            	    {
            	    any=(Token)input.LT(1);
            	    if ( (input.LA(1)>=VT_COMPILATION_UNIT && input.LA(1)<=NULL)||(input.LA(1)>=THEN && input.LA(1)<=MULTI_LINE_COMMENT) ) {
            	        input.consume();
            	        if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(any));
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_square_chunk_data4907);    throw mse;
            	    }

            	    if ( backtracking==0 ) {
            	       emit(any, DroolsEditorType.CODE_CHUNK); 
            	    }

            	    }
            	    break;
            	case 2 :
            	    // src/main/resources/org/drools/lang/DRL.g:1413:88: square_chunk_data[true]
            	    {
            	    pushFollow(FOLLOW_square_chunk_data_in_square_chunk_data4922);
            	    square_chunk_data292=square_chunk_data(true);
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, square_chunk_data292.getTree());

            	    }
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);

            rs1=(Token)input.LT(1);
            match(input,RIGHT_SQUARE,FOLLOW_RIGHT_SQUARE_in_square_chunk_data4933); if (failed) return retval;
            if ( backtracking==0 ) {
            rs1_tree = (Object)adaptor.create(rs1);
            adaptor.addChild(root_0, rs1_tree);
            }
            if ( backtracking==0 ) {
              	if (!isRecursive) {
              				emit(rs1, DroolsEditorType.SYMBOL);
              			} else {
              				emit(rs1, DroolsEditorType.CODE_CHUNK);
              			}	
              		
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end square_chunk_data

    public static class lock_on_active_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start lock_on_active_key
    // src/main/resources/org/drools/lang/DRL.g:1423:1: lock_on_active_key : {...}? =>id1= ID mis1= MISC id2= ID mis2= MISC id3= ID -> VK_LOCK_ON_ACTIVE[$start, text] ;
    public final lock_on_active_key_return lock_on_active_key() throws RecognitionException {
        lock_on_active_key_return retval = new lock_on_active_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id1=null;
        Token mis1=null;
        Token id2=null;
        Token mis2=null;
        Token id3=null;

        Object id1_tree=null;
        Object mis1_tree=null;
        Object id2_tree=null;
        Object mis2_tree=null;
        Object id3_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_MISC=new RewriteRuleTokenStream(adaptor,"token MISC");


        	String text = "";

        try {
            // src/main/resources/org/drools/lang/DRL.g:1426:3: ({...}? =>id1= ID mis1= MISC id2= ID mis2= MISC id3= ID -> VK_LOCK_ON_ACTIVE[$start, text] )
            // src/main/resources/org/drools/lang/DRL.g:1426:5: {...}? =>id1= ID mis1= MISC id2= ID mis2= MISC id3= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.LOCK) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.ON) && validateLT(4, "-") && validateLT(5, DroolsSoftKeywords.ACTIVE))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "lock_on_active_key", "(validateIdentifierKey(DroolsSoftKeywords.LOCK) && validateLT(2, \"-\") && validateLT(3, DroolsSoftKeywords.ON) && validateLT(4, \"-\") && validateLT(5, DroolsSoftKeywords.ACTIVE))");
            }
            id1=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_lock_on_active_key4957); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id1);

            mis1=(Token)input.LT(1);
            match(input,MISC,FOLLOW_MISC_in_lock_on_active_key4961); if (failed) return retval;
            if ( backtracking==0 ) stream_MISC.add(mis1);

            id2=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_lock_on_active_key4965); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id2);

            mis2=(Token)input.LT(1);
            match(input,MISC,FOLLOW_MISC_in_lock_on_active_key4969); if (failed) return retval;
            if ( backtracking==0 ) stream_MISC.add(mis2);

            id3=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_lock_on_active_key4973); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id3);

            if ( backtracking==0 ) {
              text = input.toString(retval.start,input.LT(-1));
            }
            if ( backtracking==0 ) {
              	emit(id1, DroolsEditorType.KEYWORD);
              		emit(mis1, DroolsEditorType.KEYWORD);
              		emit(id2, DroolsEditorType.KEYWORD);
              		emit(mis2, DroolsEditorType.KEYWORD);
              		emit(id3, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1432:3: -> VK_LOCK_ON_ACTIVE[$start, text]
            {
                adaptor.addChild(root_0, adaptor.create(VK_LOCK_ON_ACTIVE, ((Token)retval.start),  text));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end lock_on_active_key

    public static class date_effective_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start date_effective_key
    // src/main/resources/org/drools/lang/DRL.g:1435:1: date_effective_key : {...}? =>id1= ID mis1= MISC id2= ID -> VK_DATE_EFFECTIVE[$start, text] ;
    public final date_effective_key_return date_effective_key() throws RecognitionException {
        date_effective_key_return retval = new date_effective_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id1=null;
        Token mis1=null;
        Token id2=null;

        Object id1_tree=null;
        Object mis1_tree=null;
        Object id2_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_MISC=new RewriteRuleTokenStream(adaptor,"token MISC");


        	String text = "";

        try {
            // src/main/resources/org/drools/lang/DRL.g:1438:3: ({...}? =>id1= ID mis1= MISC id2= ID -> VK_DATE_EFFECTIVE[$start, text] )
            // src/main/resources/org/drools/lang/DRL.g:1438:5: {...}? =>id1= ID mis1= MISC id2= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.DATE) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.EFFECTIVE))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "date_effective_key", "(validateIdentifierKey(DroolsSoftKeywords.DATE) && validateLT(2, \"-\") && validateLT(3, DroolsSoftKeywords.EFFECTIVE))");
            }
            id1=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_date_effective_key5005); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id1);

            mis1=(Token)input.LT(1);
            match(input,MISC,FOLLOW_MISC_in_date_effective_key5009); if (failed) return retval;
            if ( backtracking==0 ) stream_MISC.add(mis1);

            id2=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_date_effective_key5013); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id2);

            if ( backtracking==0 ) {
              text = input.toString(retval.start,input.LT(-1));
            }
            if ( backtracking==0 ) {
              	emit(id1, DroolsEditorType.KEYWORD);
              		emit(mis1, DroolsEditorType.KEYWORD);
              		emit(id2, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1442:3: -> VK_DATE_EFFECTIVE[$start, text]
            {
                adaptor.addChild(root_0, adaptor.create(VK_DATE_EFFECTIVE, ((Token)retval.start),  text));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end date_effective_key

    public static class date_expires_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start date_expires_key
    // src/main/resources/org/drools/lang/DRL.g:1445:1: date_expires_key : {...}? =>id1= ID mis1= MISC id2= ID -> VK_DATE_EXPIRES[$start, text] ;
    public final date_expires_key_return date_expires_key() throws RecognitionException {
        date_expires_key_return retval = new date_expires_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id1=null;
        Token mis1=null;
        Token id2=null;

        Object id1_tree=null;
        Object mis1_tree=null;
        Object id2_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_MISC=new RewriteRuleTokenStream(adaptor,"token MISC");


        	String text = "";

        try {
            // src/main/resources/org/drools/lang/DRL.g:1448:3: ({...}? =>id1= ID mis1= MISC id2= ID -> VK_DATE_EXPIRES[$start, text] )
            // src/main/resources/org/drools/lang/DRL.g:1448:5: {...}? =>id1= ID mis1= MISC id2= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.DATE) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.EXPIRES))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "date_expires_key", "(validateIdentifierKey(DroolsSoftKeywords.DATE) && validateLT(2, \"-\") && validateLT(3, DroolsSoftKeywords.EXPIRES))");
            }
            id1=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_date_expires_key5045); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id1);

            mis1=(Token)input.LT(1);
            match(input,MISC,FOLLOW_MISC_in_date_expires_key5049); if (failed) return retval;
            if ( backtracking==0 ) stream_MISC.add(mis1);

            id2=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_date_expires_key5053); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id2);

            if ( backtracking==0 ) {
              text = input.toString(retval.start,input.LT(-1));
            }
            if ( backtracking==0 ) {
              	emit(id1, DroolsEditorType.KEYWORD);
              		emit(mis1, DroolsEditorType.KEYWORD);
              		emit(id2, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1452:3: -> VK_DATE_EXPIRES[$start, text]
            {
                adaptor.addChild(root_0, adaptor.create(VK_DATE_EXPIRES, ((Token)retval.start),  text));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end date_expires_key

    public static class no_loop_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start no_loop_key
    // src/main/resources/org/drools/lang/DRL.g:1455:1: no_loop_key : {...}? =>id1= ID mis1= MISC id2= ID -> VK_NO_LOOP[$start, text] ;
    public final no_loop_key_return no_loop_key() throws RecognitionException {
        no_loop_key_return retval = new no_loop_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id1=null;
        Token mis1=null;
        Token id2=null;

        Object id1_tree=null;
        Object mis1_tree=null;
        Object id2_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_MISC=new RewriteRuleTokenStream(adaptor,"token MISC");


        	String text = "";

        try {
            // src/main/resources/org/drools/lang/DRL.g:1458:3: ({...}? =>id1= ID mis1= MISC id2= ID -> VK_NO_LOOP[$start, text] )
            // src/main/resources/org/drools/lang/DRL.g:1458:5: {...}? =>id1= ID mis1= MISC id2= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.NO) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.LOOP))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "no_loop_key", "(validateIdentifierKey(DroolsSoftKeywords.NO) && validateLT(2, \"-\") && validateLT(3, DroolsSoftKeywords.LOOP))");
            }
            id1=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_no_loop_key5085); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id1);

            mis1=(Token)input.LT(1);
            match(input,MISC,FOLLOW_MISC_in_no_loop_key5089); if (failed) return retval;
            if ( backtracking==0 ) stream_MISC.add(mis1);

            id2=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_no_loop_key5093); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id2);

            if ( backtracking==0 ) {
              text = input.toString(retval.start,input.LT(-1));
            }
            if ( backtracking==0 ) {
              	emit(id1, DroolsEditorType.KEYWORD);
              		emit(mis1, DroolsEditorType.KEYWORD);
              		emit(id2, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1462:3: -> VK_NO_LOOP[$start, text]
            {
                adaptor.addChild(root_0, adaptor.create(VK_NO_LOOP, ((Token)retval.start),  text));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end no_loop_key

    public static class auto_focus_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start auto_focus_key
    // src/main/resources/org/drools/lang/DRL.g:1465:1: auto_focus_key : {...}? =>id1= ID mis1= MISC id2= ID -> VK_AUTO_FOCUS[$start, text] ;
    public final auto_focus_key_return auto_focus_key() throws RecognitionException {
        auto_focus_key_return retval = new auto_focus_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id1=null;
        Token mis1=null;
        Token id2=null;

        Object id1_tree=null;
        Object mis1_tree=null;
        Object id2_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_MISC=new RewriteRuleTokenStream(adaptor,"token MISC");


        	String text = "";

        try {
            // src/main/resources/org/drools/lang/DRL.g:1468:3: ({...}? =>id1= ID mis1= MISC id2= ID -> VK_AUTO_FOCUS[$start, text] )
            // src/main/resources/org/drools/lang/DRL.g:1468:5: {...}? =>id1= ID mis1= MISC id2= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.AUTO) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.FOCUS))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "auto_focus_key", "(validateIdentifierKey(DroolsSoftKeywords.AUTO) && validateLT(2, \"-\") && validateLT(3, DroolsSoftKeywords.FOCUS))");
            }
            id1=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_auto_focus_key5125); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id1);

            mis1=(Token)input.LT(1);
            match(input,MISC,FOLLOW_MISC_in_auto_focus_key5129); if (failed) return retval;
            if ( backtracking==0 ) stream_MISC.add(mis1);

            id2=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_auto_focus_key5133); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id2);

            if ( backtracking==0 ) {
              text = input.toString(retval.start,input.LT(-1));
            }
            if ( backtracking==0 ) {
              	emit(id1, DroolsEditorType.KEYWORD);
              		emit(mis1, DroolsEditorType.KEYWORD);
              		emit(id2, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1472:3: -> VK_AUTO_FOCUS[$start, text]
            {
                adaptor.addChild(root_0, adaptor.create(VK_AUTO_FOCUS, ((Token)retval.start),  text));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end auto_focus_key

    public static class activation_group_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start activation_group_key
    // src/main/resources/org/drools/lang/DRL.g:1475:1: activation_group_key : {...}? =>id1= ID mis1= MISC id2= ID -> VK_ACTIVATION_GROUP[$start, text] ;
    public final activation_group_key_return activation_group_key() throws RecognitionException {
        activation_group_key_return retval = new activation_group_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id1=null;
        Token mis1=null;
        Token id2=null;

        Object id1_tree=null;
        Object mis1_tree=null;
        Object id2_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_MISC=new RewriteRuleTokenStream(adaptor,"token MISC");


        	String text = "";

        try {
            // src/main/resources/org/drools/lang/DRL.g:1478:3: ({...}? =>id1= ID mis1= MISC id2= ID -> VK_ACTIVATION_GROUP[$start, text] )
            // src/main/resources/org/drools/lang/DRL.g:1478:5: {...}? =>id1= ID mis1= MISC id2= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.ACTIVATION) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "activation_group_key", "(validateIdentifierKey(DroolsSoftKeywords.ACTIVATION) && validateLT(2, \"-\") && validateLT(3, DroolsSoftKeywords.GROUP))");
            }
            id1=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_activation_group_key5165); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id1);

            mis1=(Token)input.LT(1);
            match(input,MISC,FOLLOW_MISC_in_activation_group_key5169); if (failed) return retval;
            if ( backtracking==0 ) stream_MISC.add(mis1);

            id2=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_activation_group_key5173); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id2);

            if ( backtracking==0 ) {
              text = input.toString(retval.start,input.LT(-1));
            }
            if ( backtracking==0 ) {
              	emit(id1, DroolsEditorType.KEYWORD);
              		emit(mis1, DroolsEditorType.KEYWORD);
              		emit(id2, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1482:3: -> VK_ACTIVATION_GROUP[$start, text]
            {
                adaptor.addChild(root_0, adaptor.create(VK_ACTIVATION_GROUP, ((Token)retval.start),  text));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end activation_group_key

    public static class agenda_group_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start agenda_group_key
    // src/main/resources/org/drools/lang/DRL.g:1485:1: agenda_group_key : {...}? =>id1= ID mis1= MISC id2= ID -> VK_AGENDA_GROUP[$start, text] ;
    public final agenda_group_key_return agenda_group_key() throws RecognitionException {
        agenda_group_key_return retval = new agenda_group_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id1=null;
        Token mis1=null;
        Token id2=null;

        Object id1_tree=null;
        Object mis1_tree=null;
        Object id2_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_MISC=new RewriteRuleTokenStream(adaptor,"token MISC");


        	String text = "";

        try {
            // src/main/resources/org/drools/lang/DRL.g:1488:3: ({...}? =>id1= ID mis1= MISC id2= ID -> VK_AGENDA_GROUP[$start, text] )
            // src/main/resources/org/drools/lang/DRL.g:1488:5: {...}? =>id1= ID mis1= MISC id2= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.AGENDA) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "agenda_group_key", "(validateIdentifierKey(DroolsSoftKeywords.AGENDA) && validateLT(2, \"-\") && validateLT(3, DroolsSoftKeywords.GROUP))");
            }
            id1=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_agenda_group_key5205); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id1);

            mis1=(Token)input.LT(1);
            match(input,MISC,FOLLOW_MISC_in_agenda_group_key5209); if (failed) return retval;
            if ( backtracking==0 ) stream_MISC.add(mis1);

            id2=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_agenda_group_key5213); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id2);

            if ( backtracking==0 ) {
              text = input.toString(retval.start,input.LT(-1));
            }
            if ( backtracking==0 ) {
              	emit(id1, DroolsEditorType.KEYWORD);
              		emit(mis1, DroolsEditorType.KEYWORD);
              		emit(id2, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1492:3: -> VK_AGENDA_GROUP[$start, text]
            {
                adaptor.addChild(root_0, adaptor.create(VK_AGENDA_GROUP, ((Token)retval.start),  text));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end agenda_group_key

    public static class ruleflow_group_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ruleflow_group_key
    // src/main/resources/org/drools/lang/DRL.g:1495:1: ruleflow_group_key : {...}? =>id1= ID mis1= MISC id2= ID -> VK_RULEFLOW_GROUP[$start, text] ;
    public final ruleflow_group_key_return ruleflow_group_key() throws RecognitionException {
        ruleflow_group_key_return retval = new ruleflow_group_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id1=null;
        Token mis1=null;
        Token id2=null;

        Object id1_tree=null;
        Object mis1_tree=null;
        Object id2_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_MISC=new RewriteRuleTokenStream(adaptor,"token MISC");


        	String text = "";

        try {
            // src/main/resources/org/drools/lang/DRL.g:1498:3: ({...}? =>id1= ID mis1= MISC id2= ID -> VK_RULEFLOW_GROUP[$start, text] )
            // src/main/resources/org/drools/lang/DRL.g:1498:5: {...}? =>id1= ID mis1= MISC id2= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.RULEFLOW) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.GROUP))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "ruleflow_group_key", "(validateIdentifierKey(DroolsSoftKeywords.RULEFLOW) && validateLT(2, \"-\") && validateLT(3, DroolsSoftKeywords.GROUP))");
            }
            id1=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_ruleflow_group_key5245); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id1);

            mis1=(Token)input.LT(1);
            match(input,MISC,FOLLOW_MISC_in_ruleflow_group_key5249); if (failed) return retval;
            if ( backtracking==0 ) stream_MISC.add(mis1);

            id2=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_ruleflow_group_key5253); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id2);

            if ( backtracking==0 ) {
              text = input.toString(retval.start,input.LT(-1));
            }
            if ( backtracking==0 ) {
              	emit(id1, DroolsEditorType.KEYWORD);
              		emit(mis1, DroolsEditorType.KEYWORD);
              		emit(id2, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1502:3: -> VK_RULEFLOW_GROUP[$start, text]
            {
                adaptor.addChild(root_0, adaptor.create(VK_RULEFLOW_GROUP, ((Token)retval.start),  text));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end ruleflow_group_key

    public static class entry_point_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start entry_point_key
    // src/main/resources/org/drools/lang/DRL.g:1505:1: entry_point_key : {...}? =>id1= ID mis1= MISC id2= ID -> VK_ENTRY_POINT[$start, text] ;
    public final entry_point_key_return entry_point_key() throws RecognitionException {
        entry_point_key_return retval = new entry_point_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id1=null;
        Token mis1=null;
        Token id2=null;

        Object id1_tree=null;
        Object mis1_tree=null;
        Object id2_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_MISC=new RewriteRuleTokenStream(adaptor,"token MISC");


        	String text = "";

        try {
            // src/main/resources/org/drools/lang/DRL.g:1508:3: ({...}? =>id1= ID mis1= MISC id2= ID -> VK_ENTRY_POINT[$start, text] )
            // src/main/resources/org/drools/lang/DRL.g:1508:5: {...}? =>id1= ID mis1= MISC id2= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.ENTRY) && validateLT(2, "-") && validateLT(3, DroolsSoftKeywords.POINT))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "entry_point_key", "(validateIdentifierKey(DroolsSoftKeywords.ENTRY) && validateLT(2, \"-\") && validateLT(3, DroolsSoftKeywords.POINT))");
            }
            id1=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_entry_point_key5285); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id1);

            mis1=(Token)input.LT(1);
            match(input,MISC,FOLLOW_MISC_in_entry_point_key5289); if (failed) return retval;
            if ( backtracking==0 ) stream_MISC.add(mis1);

            id2=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_entry_point_key5293); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id2);

            if ( backtracking==0 ) {
              text = input.toString(retval.start,input.LT(-1));
            }
            if ( backtracking==0 ) {
              	emit(id1, DroolsEditorType.KEYWORD);
              		emit(mis1, DroolsEditorType.KEYWORD);
              		emit(id2, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1512:3: -> VK_ENTRY_POINT[$start, text]
            {
                adaptor.addChild(root_0, adaptor.create(VK_ENTRY_POINT, ((Token)retval.start),  text));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end entry_point_key

    public static class duration_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start duration_key
    // src/main/resources/org/drools/lang/DRL.g:1515:1: duration_key : {...}? =>id= ID -> VK_DURATION[$id] ;
    public final duration_key_return duration_key() throws RecognitionException {
        duration_key_return retval = new duration_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:1516:2: ({...}? =>id= ID -> VK_DURATION[$id] )
            // src/main/resources/org/drools/lang/DRL.g:1516:4: {...}? =>id= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.DURATION))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "duration_key", "(validateIdentifierKey(DroolsSoftKeywords.DURATION))");
            }
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_duration_key5322); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1518:3: -> VK_DURATION[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VK_DURATION, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end duration_key

    public static class package_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start package_key
    // src/main/resources/org/drools/lang/DRL.g:1521:1: package_key : {...}? =>id= ID -> VK_PACKAGE[$id] ;
    public final package_key_return package_key() throws RecognitionException {
        package_key_return retval = new package_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:1522:2: ({...}? =>id= ID -> VK_PACKAGE[$id] )
            // src/main/resources/org/drools/lang/DRL.g:1522:4: {...}? =>id= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.PACKAGE))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "package_key", "(validateIdentifierKey(DroolsSoftKeywords.PACKAGE))");
            }
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_package_key5349); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1524:3: -> VK_PACKAGE[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VK_PACKAGE, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end package_key

    public static class import_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start import_key
    // src/main/resources/org/drools/lang/DRL.g:1527:1: import_key : {...}? =>id= ID -> VK_IMPORT[$id] ;
    public final import_key_return import_key() throws RecognitionException {
        import_key_return retval = new import_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:1528:2: ({...}? =>id= ID -> VK_IMPORT[$id] )
            // src/main/resources/org/drools/lang/DRL.g:1528:4: {...}? =>id= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.IMPORT))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "import_key", "(validateIdentifierKey(DroolsSoftKeywords.IMPORT))");
            }
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_import_key5376); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1530:3: -> VK_IMPORT[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VK_IMPORT, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end import_key

    public static class dialect_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start dialect_key
    // src/main/resources/org/drools/lang/DRL.g:1533:1: dialect_key : {...}? =>id= ID -> VK_DIALECT[$id] ;
    public final dialect_key_return dialect_key() throws RecognitionException {
        dialect_key_return retval = new dialect_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:1534:2: ({...}? =>id= ID -> VK_DIALECT[$id] )
            // src/main/resources/org/drools/lang/DRL.g:1534:4: {...}? =>id= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.DIALECT))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "dialect_key", "(validateIdentifierKey(DroolsSoftKeywords.DIALECT))");
            }
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_dialect_key5403); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1536:3: -> VK_DIALECT[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VK_DIALECT, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end dialect_key

    public static class salience_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start salience_key
    // src/main/resources/org/drools/lang/DRL.g:1539:1: salience_key : {...}? =>id= ID -> VK_SALIENCE[$id] ;
    public final salience_key_return salience_key() throws RecognitionException {
        salience_key_return retval = new salience_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:1540:2: ({...}? =>id= ID -> VK_SALIENCE[$id] )
            // src/main/resources/org/drools/lang/DRL.g:1540:4: {...}? =>id= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.SALIENCE))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "salience_key", "(validateIdentifierKey(DroolsSoftKeywords.SALIENCE))");
            }
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_salience_key5430); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1542:3: -> VK_SALIENCE[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VK_SALIENCE, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end salience_key

    public static class enabled_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start enabled_key
    // src/main/resources/org/drools/lang/DRL.g:1545:1: enabled_key : {...}? =>id= ID -> VK_ENABLED[$id] ;
    public final enabled_key_return enabled_key() throws RecognitionException {
        enabled_key_return retval = new enabled_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:1546:2: ({...}? =>id= ID -> VK_ENABLED[$id] )
            // src/main/resources/org/drools/lang/DRL.g:1546:4: {...}? =>id= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.ENABLED))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "enabled_key", "(validateIdentifierKey(DroolsSoftKeywords.ENABLED))");
            }
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_enabled_key5457); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1548:3: -> VK_ENABLED[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VK_ENABLED, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end enabled_key

    public static class attributes_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start attributes_key
    // src/main/resources/org/drools/lang/DRL.g:1551:1: attributes_key : {...}? =>id= ID -> VK_ATTRIBUTES[$id] ;
    public final attributes_key_return attributes_key() throws RecognitionException {
        attributes_key_return retval = new attributes_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:1552:2: ({...}? =>id= ID -> VK_ATTRIBUTES[$id] )
            // src/main/resources/org/drools/lang/DRL.g:1552:4: {...}? =>id= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.ATTRIBUTES))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "attributes_key", "(validateIdentifierKey(DroolsSoftKeywords.ATTRIBUTES))");
            }
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_attributes_key5484); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1554:3: -> VK_ATTRIBUTES[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VK_ATTRIBUTES, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end attributes_key

    public static class rule_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start rule_key
    // src/main/resources/org/drools/lang/DRL.g:1557:1: rule_key : {...}? =>id= ID -> VK_RULE[$id] ;
    public final rule_key_return rule_key() throws RecognitionException {
        rule_key_return retval = new rule_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:1558:2: ({...}? =>id= ID -> VK_RULE[$id] )
            // src/main/resources/org/drools/lang/DRL.g:1558:4: {...}? =>id= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.RULE))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "rule_key", "(validateIdentifierKey(DroolsSoftKeywords.RULE))");
            }
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_rule_key5511); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1560:3: -> VK_RULE[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VK_RULE, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end rule_key

    public static class template_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start template_key
    // src/main/resources/org/drools/lang/DRL.g:1563:1: template_key : {...}? =>id= ID -> VK_TEMPLATE[$id] ;
    public final template_key_return template_key() throws RecognitionException {
        template_key_return retval = new template_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:1564:2: ({...}? =>id= ID -> VK_TEMPLATE[$id] )
            // src/main/resources/org/drools/lang/DRL.g:1564:4: {...}? =>id= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.TEMPLATE))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "template_key", "(validateIdentifierKey(DroolsSoftKeywords.TEMPLATE))");
            }
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_template_key5538); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1566:3: -> VK_TEMPLATE[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VK_TEMPLATE, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end template_key

    public static class query_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start query_key
    // src/main/resources/org/drools/lang/DRL.g:1569:1: query_key : {...}? =>id= ID -> VK_QUERY[$id] ;
    public final query_key_return query_key() throws RecognitionException {
        query_key_return retval = new query_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:1570:2: ({...}? =>id= ID -> VK_QUERY[$id] )
            // src/main/resources/org/drools/lang/DRL.g:1570:4: {...}? =>id= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.QUERY))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "query_key", "(validateIdentifierKey(DroolsSoftKeywords.QUERY))");
            }
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_query_key5565); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1572:3: -> VK_QUERY[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VK_QUERY, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end query_key

    public static class declare_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start declare_key
    // src/main/resources/org/drools/lang/DRL.g:1575:1: declare_key : {...}? =>id= ID -> VK_DECLARE[$id] ;
    public final declare_key_return declare_key() throws RecognitionException {
        declare_key_return retval = new declare_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:1576:2: ({...}? =>id= ID -> VK_DECLARE[$id] )
            // src/main/resources/org/drools/lang/DRL.g:1576:4: {...}? =>id= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.DECLARE))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "declare_key", "(validateIdentifierKey(DroolsSoftKeywords.DECLARE))");
            }
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_declare_key5592); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1578:3: -> VK_DECLARE[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VK_DECLARE, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end declare_key

    public static class function_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start function_key
    // src/main/resources/org/drools/lang/DRL.g:1581:1: function_key : {...}? =>id= ID -> VK_FUNCTION[$id] ;
    public final function_key_return function_key() throws RecognitionException {
        function_key_return retval = new function_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:1582:2: ({...}? =>id= ID -> VK_FUNCTION[$id] )
            // src/main/resources/org/drools/lang/DRL.g:1582:4: {...}? =>id= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.FUNCTION))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "function_key", "(validateIdentifierKey(DroolsSoftKeywords.FUNCTION))");
            }
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_function_key5619); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1584:3: -> VK_FUNCTION[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VK_FUNCTION, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end function_key

    public static class global_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start global_key
    // src/main/resources/org/drools/lang/DRL.g:1587:1: global_key : {...}? =>id= ID -> VK_GLOBAL[$id] ;
    public final global_key_return global_key() throws RecognitionException {
        global_key_return retval = new global_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:1588:2: ({...}? =>id= ID -> VK_GLOBAL[$id] )
            // src/main/resources/org/drools/lang/DRL.g:1588:4: {...}? =>id= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.GLOBAL))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "global_key", "(validateIdentifierKey(DroolsSoftKeywords.GLOBAL))");
            }
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_global_key5646); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1590:3: -> VK_GLOBAL[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VK_GLOBAL, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end global_key

    public static class eval_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start eval_key
    // src/main/resources/org/drools/lang/DRL.g:1593:1: eval_key : {...}? =>id= ID -> VK_EVAL[$id] ;
    public final eval_key_return eval_key() throws RecognitionException {
        eval_key_return retval = new eval_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:1594:2: ({...}? =>id= ID -> VK_EVAL[$id] )
            // src/main/resources/org/drools/lang/DRL.g:1594:4: {...}? =>id= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.EVAL))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "eval_key", "(validateIdentifierKey(DroolsSoftKeywords.EVAL))");
            }
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_eval_key5673); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1596:3: -> VK_EVAL[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VK_EVAL, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end eval_key

    public static class contains_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start contains_key
    // src/main/resources/org/drools/lang/DRL.g:1599:1: contains_key : {...}? =>id= ID -> VK_CONTAINS[$id] ;
    public final contains_key_return contains_key() throws RecognitionException {
        contains_key_return retval = new contains_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:1600:2: ({...}? =>id= ID -> VK_CONTAINS[$id] )
            // src/main/resources/org/drools/lang/DRL.g:1600:4: {...}? =>id= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.CONTAINS))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "contains_key", "(validateIdentifierKey(DroolsSoftKeywords.CONTAINS))");
            }
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_contains_key5700); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1602:3: -> VK_CONTAINS[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VK_CONTAINS, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end contains_key

    public static class matches_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start matches_key
    // src/main/resources/org/drools/lang/DRL.g:1605:1: matches_key : {...}? =>id= ID -> VK_MATCHES[$id] ;
    public final matches_key_return matches_key() throws RecognitionException {
        matches_key_return retval = new matches_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:1606:2: ({...}? =>id= ID -> VK_MATCHES[$id] )
            // src/main/resources/org/drools/lang/DRL.g:1606:4: {...}? =>id= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.MATCHES))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "matches_key", "(validateIdentifierKey(DroolsSoftKeywords.MATCHES))");
            }
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_matches_key5727); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1608:3: -> VK_MATCHES[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VK_MATCHES, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end matches_key

    public static class excludes_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start excludes_key
    // src/main/resources/org/drools/lang/DRL.g:1611:1: excludes_key : {...}? =>id= ID -> VK_EXCLUDES[$id] ;
    public final excludes_key_return excludes_key() throws RecognitionException {
        excludes_key_return retval = new excludes_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:1612:2: ({...}? =>id= ID -> VK_EXCLUDES[$id] )
            // src/main/resources/org/drools/lang/DRL.g:1612:4: {...}? =>id= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.EXCLUDES))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "excludes_key", "(validateIdentifierKey(DroolsSoftKeywords.EXCLUDES))");
            }
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_excludes_key5754); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1614:3: -> VK_EXCLUDES[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VK_EXCLUDES, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end excludes_key

    public static class soundslike_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start soundslike_key
    // src/main/resources/org/drools/lang/DRL.g:1617:1: soundslike_key : {...}? =>id= ID -> VK_SOUNDSLIKE[$id] ;
    public final soundslike_key_return soundslike_key() throws RecognitionException {
        soundslike_key_return retval = new soundslike_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:1618:2: ({...}? =>id= ID -> VK_SOUNDSLIKE[$id] )
            // src/main/resources/org/drools/lang/DRL.g:1618:4: {...}? =>id= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.SOUNDSLIKE))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "soundslike_key", "(validateIdentifierKey(DroolsSoftKeywords.SOUNDSLIKE))");
            }
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_soundslike_key5781); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1620:3: -> VK_SOUNDSLIKE[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VK_SOUNDSLIKE, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end soundslike_key

    public static class memberof_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start memberof_key
    // src/main/resources/org/drools/lang/DRL.g:1623:1: memberof_key : {...}? =>id= ID -> VK_MEMBEROF[$id] ;
    public final memberof_key_return memberof_key() throws RecognitionException {
        memberof_key_return retval = new memberof_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:1624:2: ({...}? =>id= ID -> VK_MEMBEROF[$id] )
            // src/main/resources/org/drools/lang/DRL.g:1624:4: {...}? =>id= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.MEMBEROF))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "memberof_key", "(validateIdentifierKey(DroolsSoftKeywords.MEMBEROF))");
            }
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_memberof_key5808); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1626:3: -> VK_MEMBEROF[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VK_MEMBEROF, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end memberof_key

    public static class not_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start not_key
    // src/main/resources/org/drools/lang/DRL.g:1629:1: not_key : {...}? =>id= ID -> VK_NOT[$id] ;
    public final not_key_return not_key() throws RecognitionException {
        not_key_return retval = new not_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:1630:2: ({...}? =>id= ID -> VK_NOT[$id] )
            // src/main/resources/org/drools/lang/DRL.g:1630:4: {...}? =>id= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.NOT))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "not_key", "(validateIdentifierKey(DroolsSoftKeywords.NOT))");
            }
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_not_key5835); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1632:3: -> VK_NOT[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VK_NOT, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end not_key

    public static class in_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start in_key
    // src/main/resources/org/drools/lang/DRL.g:1635:1: in_key : {...}? =>id= ID -> VK_IN[$id] ;
    public final in_key_return in_key() throws RecognitionException {
        in_key_return retval = new in_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:1636:2: ({...}? =>id= ID -> VK_IN[$id] )
            // src/main/resources/org/drools/lang/DRL.g:1636:4: {...}? =>id= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.IN))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "in_key", "(validateIdentifierKey(DroolsSoftKeywords.IN))");
            }
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_in_key5862); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1638:3: -> VK_IN[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VK_IN, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end in_key

    public static class or_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start or_key
    // src/main/resources/org/drools/lang/DRL.g:1641:1: or_key : {...}? =>id= ID -> VK_OR[$id] ;
    public final or_key_return or_key() throws RecognitionException {
        or_key_return retval = new or_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:1642:2: ({...}? =>id= ID -> VK_OR[$id] )
            // src/main/resources/org/drools/lang/DRL.g:1642:4: {...}? =>id= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.OR))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "or_key", "(validateIdentifierKey(DroolsSoftKeywords.OR))");
            }
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_or_key5889); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1644:3: -> VK_OR[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VK_OR, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end or_key

    public static class and_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start and_key
    // src/main/resources/org/drools/lang/DRL.g:1647:1: and_key : {...}? =>id= ID -> VK_AND[$id] ;
    public final and_key_return and_key() throws RecognitionException {
        and_key_return retval = new and_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:1648:2: ({...}? =>id= ID -> VK_AND[$id] )
            // src/main/resources/org/drools/lang/DRL.g:1648:4: {...}? =>id= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.AND))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "and_key", "(validateIdentifierKey(DroolsSoftKeywords.AND))");
            }
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_and_key5916); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1650:3: -> VK_AND[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VK_AND, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end and_key

    public static class exists_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start exists_key
    // src/main/resources/org/drools/lang/DRL.g:1653:1: exists_key : {...}? =>id= ID -> VK_EXISTS[$id] ;
    public final exists_key_return exists_key() throws RecognitionException {
        exists_key_return retval = new exists_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:1654:2: ({...}? =>id= ID -> VK_EXISTS[$id] )
            // src/main/resources/org/drools/lang/DRL.g:1654:4: {...}? =>id= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.EXISTS))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "exists_key", "(validateIdentifierKey(DroolsSoftKeywords.EXISTS))");
            }
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_exists_key5943); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1656:3: -> VK_EXISTS[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VK_EXISTS, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end exists_key

    public static class forall_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start forall_key
    // src/main/resources/org/drools/lang/DRL.g:1659:1: forall_key : {...}? =>id= ID -> VK_FORALL[$id] ;
    public final forall_key_return forall_key() throws RecognitionException {
        forall_key_return retval = new forall_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:1660:2: ({...}? =>id= ID -> VK_FORALL[$id] )
            // src/main/resources/org/drools/lang/DRL.g:1660:4: {...}? =>id= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.FORALL))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "forall_key", "(validateIdentifierKey(DroolsSoftKeywords.FORALL))");
            }
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_forall_key5970); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1662:3: -> VK_FORALL[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VK_FORALL, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end forall_key

    public static class action_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start action_key
    // src/main/resources/org/drools/lang/DRL.g:1665:1: action_key : {...}? =>id= ID -> VK_ACTION[$id] ;
    public final action_key_return action_key() throws RecognitionException {
        action_key_return retval = new action_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:1666:2: ({...}? =>id= ID -> VK_ACTION[$id] )
            // src/main/resources/org/drools/lang/DRL.g:1666:4: {...}? =>id= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.ACTION))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "action_key", "(validateIdentifierKey(DroolsSoftKeywords.ACTION))");
            }
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_action_key5997); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1668:3: -> VK_ACTION[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VK_ACTION, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end action_key

    public static class reverse_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start reverse_key
    // src/main/resources/org/drools/lang/DRL.g:1671:1: reverse_key : {...}? =>id= ID -> VK_REVERSE[$id] ;
    public final reverse_key_return reverse_key() throws RecognitionException {
        reverse_key_return retval = new reverse_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:1672:2: ({...}? =>id= ID -> VK_REVERSE[$id] )
            // src/main/resources/org/drools/lang/DRL.g:1672:4: {...}? =>id= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.REVERSE))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "reverse_key", "(validateIdentifierKey(DroolsSoftKeywords.REVERSE))");
            }
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_reverse_key6024); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1674:3: -> VK_REVERSE[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VK_REVERSE, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end reverse_key

    public static class result_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start result_key
    // src/main/resources/org/drools/lang/DRL.g:1677:1: result_key : {...}? =>id= ID -> VK_RESULT[$id] ;
    public final result_key_return result_key() throws RecognitionException {
        result_key_return retval = new result_key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/main/resources/org/drools/lang/DRL.g:1678:2: ({...}? =>id= ID -> VK_RESULT[$id] )
            // src/main/resources/org/drools/lang/DRL.g:1678:4: {...}? =>id= ID
            {
            if ( !((validateIdentifierKey(DroolsSoftKeywords.RESULT))) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "result_key", "(validateIdentifierKey(DroolsSoftKeywords.RESULT))");
            }
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_result_key6051); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(id);

            if ( backtracking==0 ) {
              	emit(id, DroolsEditorType.KEYWORD);	
            }

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1680:3: -> VK_RESULT[$id]
            {
                adaptor.addChild(root_0, adaptor.create(VK_RESULT, id));

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end result_key

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // src/main/resources/org/drools/lang/DRL.g:816:5: ( LEFT_PAREN or_key )
        // src/main/resources/org/drools/lang/DRL.g:816:6: LEFT_PAREN or_key
        {
        match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_synpred12045); if (failed) return ;
        pushFollow(FOLLOW_or_key_in_synpred12047);
        or_key();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // src/main/resources/org/drools/lang/DRL.g:824:5: ( or_key | DOUBLE_PIPE )
        int alt102=2;
        int LA102_0 = input.LA(1);

        if ( (LA102_0==ID) && ((validateIdentifierKey(DroolsSoftKeywords.OR)))) {
            alt102=1;
        }
        else if ( (LA102_0==DOUBLE_PIPE) ) {
            alt102=2;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("824:5: synpred2 : ( or_key | DOUBLE_PIPE );", 102, 0, input);

            throw nvae;
        }
        switch (alt102) {
            case 1 :
                // src/main/resources/org/drools/lang/DRL.g:824:6: or_key
                {
                pushFollow(FOLLOW_or_key_in_synpred22114);
                or_key();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // src/main/resources/org/drools/lang/DRL.g:824:13: DOUBLE_PIPE
                {
                match(input,DOUBLE_PIPE,FOLLOW_DOUBLE_PIPE_in_synpred22116); if (failed) return ;

                }
                break;

        }}
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // src/main/resources/org/drools/lang/DRL.g:833:5: ( LEFT_PAREN and_key )
        // src/main/resources/org/drools/lang/DRL.g:833:6: LEFT_PAREN and_key
        {
        match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_synpred32173); if (failed) return ;
        pushFollow(FOLLOW_and_key_in_synpred32175);
        and_key();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // src/main/resources/org/drools/lang/DRL.g:841:5: ( and_key | DOUBLE_AMPER )
        int alt103=2;
        int LA103_0 = input.LA(1);

        if ( (LA103_0==ID) && ((validateIdentifierKey(DroolsSoftKeywords.AND)))) {
            alt103=1;
        }
        else if ( (LA103_0==DOUBLE_AMPER) ) {
            alt103=2;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("841:5: synpred4 : ( and_key | DOUBLE_AMPER );", 103, 0, input);

            throw nvae;
        }
        switch (alt103) {
            case 1 :
                // src/main/resources/org/drools/lang/DRL.g:841:6: and_key
                {
                pushFollow(FOLLOW_and_key_in_synpred42243);
                and_key();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // src/main/resources/org/drools/lang/DRL.g:841:14: DOUBLE_AMPER
                {
                match(input,DOUBLE_AMPER,FOLLOW_DOUBLE_AMPER_in_synpred42245); if (failed) return ;

                }
                break;

        }}
    // $ANTLR end synpred4

    // $ANTLR start synpred5
    public final void synpred5_fragment() throws RecognitionException {   
        // src/main/resources/org/drools/lang/DRL.g:858:4: ( SEMICOLON )
        // src/main/resources/org/drools/lang/DRL.g:858:5: SEMICOLON
        {
        match(input,SEMICOLON,FOLLOW_SEMICOLON_in_synpred52368); if (failed) return ;

        }
    }
    // $ANTLR end synpred5

    // $ANTLR start synpred6
    public final void synpred6_fragment() throws RecognitionException {   
        // src/main/resources/org/drools/lang/DRL.g:864:12: ( LEFT_PAREN ( or_key | and_key ) )
        // src/main/resources/org/drools/lang/DRL.g:864:13: LEFT_PAREN ( or_key | and_key )
        {
        match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_synpred62405); if (failed) return ;
        // src/main/resources/org/drools/lang/DRL.g:864:24: ( or_key | and_key )
        int alt104=2;
        int LA104_0 = input.LA(1);

        if ( (LA104_0==ID) && (((validateIdentifierKey(DroolsSoftKeywords.AND))||(validateIdentifierKey(DroolsSoftKeywords.OR))))) {
            int LA104_1 = input.LA(2);

            if ( ((validateIdentifierKey(DroolsSoftKeywords.OR))) ) {
                alt104=1;
            }
            else if ( ((validateIdentifierKey(DroolsSoftKeywords.AND))) ) {
                alt104=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("864:24: ( or_key | and_key )", 104, 1, input);

                throw nvae;
            }
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("864:24: ( or_key | and_key )", 104, 0, input);

            throw nvae;
        }
        switch (alt104) {
            case 1 :
                // src/main/resources/org/drools/lang/DRL.g:864:25: or_key
                {
                pushFollow(FOLLOW_or_key_in_synpred62408);
                or_key();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // src/main/resources/org/drools/lang/DRL.g:864:32: and_key
                {
                pushFollow(FOLLOW_and_key_in_synpred62410);
                and_key();
                _fsp--;
                if (failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred6

    // $ANTLR start synpred7
    public final void synpred7_fragment() throws RecognitionException {   
        // src/main/resources/org/drools/lang/DRL.g:880:5: ( LEFT_PAREN ( or_key | and_key ) )
        // src/main/resources/org/drools/lang/DRL.g:880:6: LEFT_PAREN ( or_key | and_key )
        {
        match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_synpred72533); if (failed) return ;
        // src/main/resources/org/drools/lang/DRL.g:880:17: ( or_key | and_key )
        int alt105=2;
        int LA105_0 = input.LA(1);

        if ( (LA105_0==ID) && (((validateIdentifierKey(DroolsSoftKeywords.AND))||(validateIdentifierKey(DroolsSoftKeywords.OR))))) {
            int LA105_1 = input.LA(2);

            if ( ((validateIdentifierKey(DroolsSoftKeywords.OR))) ) {
                alt105=1;
            }
            else if ( ((validateIdentifierKey(DroolsSoftKeywords.AND))) ) {
                alt105=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("880:17: ( or_key | and_key )", 105, 1, input);

                throw nvae;
            }
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("880:17: ( or_key | and_key )", 105, 0, input);

            throw nvae;
        }
        switch (alt105) {
            case 1 :
                // src/main/resources/org/drools/lang/DRL.g:880:18: or_key
                {
                pushFollow(FOLLOW_or_key_in_synpred72536);
                or_key();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // src/main/resources/org/drools/lang/DRL.g:880:25: and_key
                {
                pushFollow(FOLLOW_and_key_in_synpred72538);
                and_key();
                _fsp--;
                if (failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred7

    // $ANTLR start synpred8
    public final void synpred8_fragment() throws RecognitionException {   
        // src/main/resources/org/drools/lang/DRL.g:1049:5: ( LEFT_PAREN )
        // src/main/resources/org/drools/lang/DRL.g:1049:6: LEFT_PAREN
        {
        match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_synpred83367); if (failed) return ;

        }
    }
    // $ANTLR end synpred8

    public final boolean synpred5() {
        backtracking++;
        int start = input.mark();
        try {
            synpred5_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred6() {
        backtracking++;
        int start = input.mark();
        try {
            synpred6_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred7() {
        backtracking++;
        int start = input.mark();
        try {
            synpred7_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred8() {
        backtracking++;
        int start = input.mark();
        try {
            synpred8_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred1() {
        backtracking++;
        int start = input.mark();
        try {
            synpred1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred2() {
        backtracking++;
        int start = input.mark();
        try {
            synpred2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred3() {
        backtracking++;
        int start = input.mark();
        try {
            synpred3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred4() {
        backtracking++;
        int start = input.mark();
        try {
            synpred4_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA82 dfa82 = new DFA82(this);
    protected DFA83 dfa83 = new DFA83(this);
    static final String DFA12_eotS =
        "\16\uffff";
    static final String DFA12_eofS =
        "\16\uffff";
    static final String DFA12_minS =
        "\2\123\1\uffff\1\123\1\uffff\2\123\2\163\2\123\1\130\1\163\1\123";
    static final String DFA12_maxS =
        "\1\130\1\132\1\uffff\1\162\1\uffff\1\162\1\123\2\163\3\162\1\163"+
        "\1\162";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\11\uffff";
    static final String DFA12_specialS =
        "\16\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\2\2\uffff\1\2\1\uffff\1\1",
            "\1\3\4\uffff\1\2\1\uffff\1\4",
            "",
            "\1\5\1\6\3\uffff\1\2\2\4\1\uffff\1\2\25\uffff\1\7",
            "",
            "\2\2\3\uffff\1\2\2\4\1\uffff\1\2\25\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\4\1\6\3\uffff\1\2\31\uffff\1\14",
            "\1\4\4\uffff\1\2\2\4\27\uffff\1\7",
            "\1\2\2\4\27\uffff\1\10",
            "\1\15",
            "\1\4\4\uffff\1\2\31\uffff\1\14"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "537:3: ( parameters )?";
        }
    }
    static final String DFA17_eotS =
        "\6\uffff";
    static final String DFA17_eofS =
        "\6\uffff";
    static final String DFA17_minS =
        "\2\123\1\163\2\uffff\1\123";
    static final String DFA17_maxS =
        "\1\123\1\162\1\163\2\uffff\1\162";
    static final String DFA17_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA17_specialS =
        "\6\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1",
            "\2\4\4\uffff\2\3\27\uffff\1\2",
            "\1\5",
            "",
            "",
            "\1\4\5\uffff\2\3\27\uffff\1\2"
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "563:4: ( data_type )?";
        }
    }
    static final String DFA52_eotS =
        "\u0083\uffff";
    static final String DFA52_eofS =
        "\u0083\uffff";
    static final String DFA52_minS =
        "\3\123\2\0\1\123\1\0\1\uffff\1\123\1\163\2\uffff\1\124\1\123\1"+
        "\uffff\1\124\1\130\1\123\1\163\1\123\1\124\1\123\1\124\1\130\1\123"+
        "\2\0\1\123\1\163\2\123\2\0\1\123\1\0\1\4\11\123\2\uffff\1\124\1"+
        "\130\1\123\1\0\2\123\1\0\1\4\11\123\2\uffff\1\123\1\uffff\1\4\32"+
        "\0\1\uffff\4\0\1\uffff\36\0";
    static final String DFA52_maxS =
        "\2\130\1\162\2\0\1\130\1\0\1\uffff\1\123\1\163\2\uffff\1\162\1"+
        "\123\1\uffff\2\162\1\123\1\163\1\132\1\162\1\132\3\162\2\0\1\123"+
        "\1\163\1\132\1\162\2\0\1\123\1\0\1\u0080\1\123\7\161\1\123\2\uffff"+
        "\3\162\1\0\1\141\1\123\1\0\1\u0080\1\123\7\161\1\123\2\uffff\1\162"+
        "\1\uffff\1\u0080\32\0\1\uffff\4\0\1\uffff\36\0";
    static final String DFA52_acceptS =
        "\7\uffff\1\1\2\uffff\2\2\2\uffff\1\3\36\uffff\2\3\21\uffff\2\3"+
        "\1\uffff\1\3\33\uffff\1\3\4\uffff\1\3\36\uffff";
    static final String DFA52_specialS =
        "\2\uffff\1\5\1\3\1\4\1\uffff\1\2\22\uffff\1\10\1\0\4\uffff\1\7"+
        "\1\1\1\uffff\1\12\17\uffff\1\11\2\uffff\1\6\115\uffff}>";
    static final String[] DFA52_transitionS = {
            "\1\2\4\uffff\1\1",
            "\1\3\4\uffff\1\4",
            "\1\7\1\10\3\uffff\1\6\3\uffff\1\5\25\uffff\1\11",
            "\1\uffff",
            "\1\uffff",
            "\1\14\4\uffff\1\15",
            "\1\uffff",
            "",
            "\1\17",
            "\1\20",
            "",
            "",
            "\1\21\3\uffff\1\23\31\uffff\1\22",
            "\1\24",
            "",
            "\1\10\3\uffff\1\25\31\uffff\1\11",
            "\1\25\31\uffff\1\11",
            "\1\26",
            "\1\27",
            "\1\30\4\uffff\1\31\1\uffff\1\32",
            "\1\33\3\uffff\1\35\31\uffff\1\34",
            "\1\36\4\uffff\1\37\1\uffff\1\40",
            "\1\21\3\uffff\1\23\31\uffff\1\22",
            "\1\23\31\uffff\1\22",
            "\1\45\1\44\3\uffff\1\42\3\uffff\1\41\14\uffff\1\46\1\47\1"+
            "\50\1\51\1\52\1\53\1\54\2\uffff\1\43",
            "\1\uffff",
            "\1\uffff",
            "\1\57",
            "\1\60",
            "\1\61\4\uffff\1\62\1\uffff\1\63",
            "\1\70\1\67\3\uffff\1\65\3\uffff\1\64\14\uffff\1\71\1\72\1"+
            "\73\1\74\1\75\1\76\1\77\2\uffff\1\66",
            "\1\uffff",
            "\1\uffff",
            "\1\102",
            "\1\uffff",
            "\156\104\1\105\1\106\15\104",
            "\1\107",
            "\1\110\3\uffff\1\111\1\116\6\uffff\1\114\1\112\16\uffff\1"+
            "\117\1\113\1\115",
            "\1\120\3\uffff\1\111\1\121\6\uffff\1\114\1\112\17\uffff\1"+
            "\113\1\115",
            "\1\120\3\uffff\1\111\1\121\6\uffff\1\114\1\112\17\uffff\1"+
            "\113\1\115",
            "\1\120\3\uffff\1\111\1\121\6\uffff\1\114\1\112\17\uffff\1"+
            "\113\1\115",
            "\1\120\3\uffff\1\111\1\121\6\uffff\1\114\1\112\17\uffff\1"+
            "\113\1\115",
            "\1\120\3\uffff\1\111\1\121\6\uffff\1\114\1\112\17\uffff\1"+
            "\113\1\115",
            "\1\120\3\uffff\1\111\1\121\6\uffff\1\114\1\112\17\uffff\1"+
            "\113\1\115",
            "\1\122",
            "",
            "",
            "\1\33\3\uffff\1\35\31\uffff\1\34",
            "\1\35\31\uffff\1\34",
            "\1\127\1\126\3\uffff\1\124\3\uffff\1\123\14\uffff\1\130\1"+
            "\131\1\132\1\133\1\134\1\135\1\136\2\uffff\1\125",
            "\1\uffff",
            "\1\140\6\uffff\1\142\6\uffff\1\141",
            "\1\143",
            "\1\uffff",
            "\156\145\1\146\1\147\15\145",
            "\1\150",
            "\1\151\3\uffff\1\152\1\157\6\uffff\1\155\1\153\16\uffff\1"+
            "\160\1\154\1\156",
            "\1\161\3\uffff\1\152\1\162\6\uffff\1\155\1\153\17\uffff\1"+
            "\154\1\156",
            "\1\161\3\uffff\1\152\1\162\6\uffff\1\155\1\153\17\uffff\1"+
            "\154\1\156",
            "\1\161\3\uffff\1\152\1\162\6\uffff\1\155\1\153\17\uffff\1"+
            "\154\1\156",
            "\1\161\3\uffff\1\152\1\162\6\uffff\1\155\1\153\17\uffff\1"+
            "\154\1\156",
            "\1\161\3\uffff\1\152\1\162\6\uffff\1\155\1\153\17\uffff\1"+
            "\154\1\156",
            "\1\161\3\uffff\1\152\1\162\6\uffff\1\155\1\153\17\uffff\1"+
            "\154\1\156",
            "\1\163",
            "",
            "",
            "\1\166\1\165\3\uffff\1\176\1\u0082\1\32\6\uffff\1\u0081\1"+
            "\u0080\5\uffff\1\177\1\167\1\170\1\171\1\172\1\173\1\174\1\175"+
            "\2\uffff\1\164",
            "",
            "\156\104\1\105\1\106\15\104",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "864:10: ( ( LEFT_PAREN ( or_key | and_key ) )=> lhs_or | LEFT_PAREN lhs_or RIGHT_PAREN | lhs_pattern )";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA52_26 = input.LA(1);

                         
                        int index52_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6()) ) {s = 7;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index52_26);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA52_32 = input.LA(1);

                         
                        int index52_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6()) ) {s = 7;}

                        else if ( (true) ) {s = 65;}

                         
                        input.seek(index52_32);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA52_6 = input.LA(1);

                         
                        int index52_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((synpred6()&&(validateIdentifierKey(DroolsSoftKeywords.EVAL)))||(synpred6()&&(validateIdentifierKey(DroolsSoftKeywords.NOT)))||synpred6()||(synpred6()&&(validateIdentifierKey(DroolsSoftKeywords.FORALL)))||(synpred6()&&(validateIdentifierKey(DroolsSoftKeywords.EXISTS))))) ) {s = 7;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index52_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA52_3 = input.LA(1);

                         
                        int index52_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6()) ) {s = 7;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index52_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA52_4 = input.LA(1);

                         
                        int index52_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6()) ) {s = 7;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index52_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA52_2 = input.LA(1);

                         
                        int index52_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA52_2==COLON) ) {s = 5;}

                        else if ( (LA52_2==LEFT_PAREN) ) {s = 6;}

                        else if ( (LA52_2==ID) && (((synpred6()&&(validateIdentifierKey(DroolsSoftKeywords.EXISTS)))||(synpred6()&&(validateIdentifierKey(DroolsSoftKeywords.NOT)))||(synpred6()&&(validateIdentifierKey(DroolsSoftKeywords.NOT)))||(synpred6()&&(validateIdentifierKey(DroolsSoftKeywords.EXISTS)))||(synpred6()&&(validateIdentifierKey(DroolsSoftKeywords.NOT)))||(synpred6()&&(validateIdentifierKey(DroolsSoftKeywords.NOT)))||(synpred6()&&(validateIdentifierKey(DroolsSoftKeywords.EXISTS)))||(synpred6()&&(validateIdentifierKey(DroolsSoftKeywords.EXISTS)))||(synpred6()&&(validateIdentifierKey(DroolsSoftKeywords.EXISTS)))||(synpred6()&&(validateIdentifierKey(DroolsSoftKeywords.NOT)))||(synpred6()&&(validateIdentifierKey(DroolsSoftKeywords.NOT)))||(synpred6()&&(validateIdentifierKey(DroolsSoftKeywords.EXISTS)))||(synpred6()&&(validateIdentifierKey(DroolsSoftKeywords.EXISTS)))||(synpred6()&&(validateIdentifierKey(DroolsSoftKeywords.NOT)))||(synpred6()&&(validateIdentifierKey(DroolsSoftKeywords.EXISTS)))||(synpred6()&&(validateIdentifierKey(DroolsSoftKeywords.NOT)))||((synpred6()&&validateNotWithBinding())&&(validateIdentifierKey(DroolsSoftKeywords.NOT)))||(synpred6()&&(validateIdentifierKey(DroolsSoftKeywords.EXISTS)))||(synpred6()&&(validateIdentifierKey(DroolsSoftKeywords.NOT)))))) {s = 7;}

                        else if ( (LA52_2==DOT) ) {s = 8;}

                        else if ( (LA52_2==LEFT_SQUARE) ) {s = 9;}

                         
                        input.seek(index52_2);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA52_53 = input.LA(1);

                         
                        int index52_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6()) ) {s = 7;}

                        else if ( (true) ) {s = 100;}

                         
                        input.seek(index52_53);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA52_31 = input.LA(1);

                         
                        int index52_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6()) ) {s = 7;}

                        else if ( (true) ) {s = 64;}

                         
                        input.seek(index52_31);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA52_25 = input.LA(1);

                         
                        int index52_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6()) ) {s = 7;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index52_25);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA52_50 = input.LA(1);

                         
                        int index52_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6()) ) {s = 7;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index52_50);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA52_34 = input.LA(1);

                         
                        int index52_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6()) ) {s = 7;}

                        else if ( (true) ) {s = 67;}

                         
                        input.seek(index52_34);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 52, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA53_eotS =
        "\u0083\uffff";
    static final String DFA53_eofS =
        "\u0083\uffff";
    static final String DFA53_minS =
        "\3\123\2\0\2\123\1\163\1\0\3\uffff\1\124\1\123\1\124\1\130\1\uffff"+
        "\1\123\1\163\1\123\1\124\1\123\1\124\1\130\1\123\2\0\1\123\1\163"+
        "\2\123\2\0\1\123\1\4\11\123\1\0\2\uffff\1\124\1\130\1\123\1\0\2"+
        "\123\1\4\11\123\1\0\2\uffff\1\123\1\4\16\0\1\uffff\14\0\1\uffff"+
        "\23\0\1\uffff\17\0";
    static final String DFA53_maxS =
        "\2\130\1\162\2\0\1\130\1\123\1\163\1\0\3\uffff\1\162\1\123\2\162"+
        "\1\uffff\1\123\1\163\1\132\1\162\1\132\3\162\2\0\1\123\1\163\1\132"+
        "\1\162\2\0\1\123\1\u0080\1\123\7\161\1\123\1\0\2\uffff\3\162\1\0"+
        "\1\141\1\123\1\u0080\1\123\7\161\1\123\1\0\2\uffff\1\162\1\u0080"+
        "\16\0\1\uffff\14\0\1\uffff\23\0\1\uffff\17\0";
    static final String DFA53_acceptS =
        "\11\uffff\1\1\2\2\4\uffff\1\3\34\uffff\2\3\21\uffff\2\3\20\uffff"+
        "\1\3\14\uffff\1\3\23\uffff\1\3\17\uffff";
    static final String DFA53_specialS =
        "\2\uffff\1\6\1\0\1\4\3\uffff\1\2\20\uffff\1\10\1\1\4\uffff\1\11"+
        "\1\5\13\uffff\1\7\5\uffff\1\12\14\uffff\1\3\103\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\2\4\uffff\1\1",
            "\1\4\4\uffff\1\3",
            "\1\11\1\6\3\uffff\1\10\3\uffff\1\5\25\uffff\1\7",
            "\1\uffff",
            "\1\uffff",
            "\1\14\4\uffff\1\15",
            "\1\16",
            "\1\17",
            "\1\uffff",
            "",
            "",
            "",
            "\1\21\3\uffff\1\23\31\uffff\1\22",
            "\1\24",
            "\1\6\3\uffff\1\25\31\uffff\1\7",
            "\1\25\31\uffff\1\7",
            "",
            "\1\26",
            "\1\27",
            "\1\30\4\uffff\1\31\1\uffff\1\32",
            "\1\33\3\uffff\1\35\31\uffff\1\34",
            "\1\36\4\uffff\1\37\1\uffff\1\40",
            "\1\21\3\uffff\1\23\31\uffff\1\22",
            "\1\23\31\uffff\1\22",
            "\1\44\1\43\3\uffff\1\54\3\uffff\1\41\14\uffff\1\45\1\46\1"+
            "\47\1\50\1\51\1\52\1\53\2\uffff\1\42",
            "\1\uffff",
            "\1\uffff",
            "\1\57",
            "\1\60",
            "\1\61\4\uffff\1\62\1\uffff\1\63",
            "\1\67\1\66\3\uffff\1\77\3\uffff\1\64\14\uffff\1\70\1\71\1"+
            "\72\1\73\1\74\1\75\1\76\2\uffff\1\65",
            "\1\uffff",
            "\1\uffff",
            "\1\102",
            "\156\103\1\104\1\105\15\103",
            "\1\106",
            "\1\107\3\uffff\1\110\1\115\6\uffff\1\113\1\111\16\uffff\1"+
            "\116\1\112\1\114",
            "\1\117\3\uffff\1\110\1\120\6\uffff\1\113\1\111\17\uffff\1"+
            "\112\1\114",
            "\1\117\3\uffff\1\110\1\120\6\uffff\1\113\1\111\17\uffff\1"+
            "\112\1\114",
            "\1\117\3\uffff\1\110\1\120\6\uffff\1\113\1\111\17\uffff\1"+
            "\112\1\114",
            "\1\117\3\uffff\1\110\1\120\6\uffff\1\113\1\111\17\uffff\1"+
            "\112\1\114",
            "\1\117\3\uffff\1\110\1\120\6\uffff\1\113\1\111\17\uffff\1"+
            "\112\1\114",
            "\1\117\3\uffff\1\110\1\120\6\uffff\1\113\1\111\17\uffff\1"+
            "\112\1\114",
            "\1\121",
            "\1\uffff",
            "",
            "",
            "\1\33\3\uffff\1\35\31\uffff\1\34",
            "\1\35\31\uffff\1\34",
            "\1\126\1\125\3\uffff\1\136\3\uffff\1\123\14\uffff\1\127\1"+
            "\130\1\131\1\132\1\133\1\134\1\135\2\uffff\1\124",
            "\1\uffff",
            "\1\140\6\uffff\1\142\6\uffff\1\141",
            "\1\143",
            "\156\144\1\145\1\146\15\144",
            "\1\147",
            "\1\150\3\uffff\1\152\1\157\6\uffff\1\155\1\153\16\uffff\1"+
            "\151\1\154\1\156",
            "\1\160\3\uffff\1\152\1\161\6\uffff\1\155\1\153\17\uffff\1"+
            "\154\1\156",
            "\1\160\3\uffff\1\152\1\161\6\uffff\1\155\1\153\17\uffff\1"+
            "\154\1\156",
            "\1\160\3\uffff\1\152\1\161\6\uffff\1\155\1\153\17\uffff\1"+
            "\154\1\156",
            "\1\160\3\uffff\1\152\1\161\6\uffff\1\155\1\153\17\uffff\1"+
            "\154\1\156",
            "\1\160\3\uffff\1\152\1\161\6\uffff\1\155\1\153\17\uffff\1"+
            "\154\1\156",
            "\1\160\3\uffff\1\152\1\161\6\uffff\1\155\1\153\17\uffff\1"+
            "\154\1\156",
            "\1\162",
            "\1\uffff",
            "",
            "",
            "\1\166\1\165\3\uffff\1\176\1\u0082\1\32\6\uffff\1\u0081\1"+
            "\u0080\5\uffff\1\177\1\167\1\170\1\171\1\172\1\173\1\174\1\175"+
            "\2\uffff\1\164",
            "\156\103\1\104\1\105\15\103",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "880:3: ( ( LEFT_PAREN ( or_key | and_key ) )=> lhs_or | LEFT_PAREN lhs_or RIGHT_PAREN | lhs_pattern )";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_3 = input.LA(1);

                         
                        int index53_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index53_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA53_26 = input.LA(1);

                         
                        int index53_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7()) ) {s = 9;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index53_26);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA53_8 = input.LA(1);

                         
                        int index53_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((synpred7()&&(validateIdentifierKey(DroolsSoftKeywords.EXISTS)))||(synpred7()&&(validateIdentifierKey(DroolsSoftKeywords.FORALL)))||(synpred7()&&(validateIdentifierKey(DroolsSoftKeywords.EVAL)))||synpred7()||(synpred7()&&(validateIdentifierKey(DroolsSoftKeywords.NOT))))) ) {s = 9;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index53_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA53_63 = input.LA(1);

                         
                        int index53_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7()) ) {s = 9;}

                        else if ( (true) ) {s = 115;}

                         
                        input.seek(index53_63);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA53_4 = input.LA(1);

                         
                        int index53_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7()) ) {s = 9;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index53_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA53_32 = input.LA(1);

                         
                        int index53_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7()) ) {s = 9;}

                        else if ( (true) ) {s = 65;}

                         
                        input.seek(index53_32);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA53_2 = input.LA(1);

                         
                        int index53_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA53_2==COLON) ) {s = 5;}

                        else if ( (LA53_2==DOT) ) {s = 6;}

                        else if ( (LA53_2==LEFT_SQUARE) ) {s = 7;}

                        else if ( (LA53_2==LEFT_PAREN) ) {s = 8;}

                        else if ( (LA53_2==ID) && ((((synpred7()&&validateNotWithBinding())&&(validateIdentifierKey(DroolsSoftKeywords.NOT)))||(synpred7()&&(validateIdentifierKey(DroolsSoftKeywords.EXISTS)))||(synpred7()&&(validateIdentifierKey(DroolsSoftKeywords.NOT)))||(synpred7()&&(validateIdentifierKey(DroolsSoftKeywords.NOT)))||(synpred7()&&(validateIdentifierKey(DroolsSoftKeywords.NOT)))||(synpred7()&&(validateIdentifierKey(DroolsSoftKeywords.NOT)))||(synpred7()&&(validateIdentifierKey(DroolsSoftKeywords.NOT)))||(synpred7()&&(validateIdentifierKey(DroolsSoftKeywords.NOT)))||(synpred7()&&(validateIdentifierKey(DroolsSoftKeywords.EXISTS)))||(synpred7()&&(validateIdentifierKey(DroolsSoftKeywords.EXISTS)))||(synpred7()&&(validateIdentifierKey(DroolsSoftKeywords.EXISTS)))||(synpred7()&&(validateIdentifierKey(DroolsSoftKeywords.NOT)))||(synpred7()&&(validateIdentifierKey(DroolsSoftKeywords.EXISTS)))||(synpred7()&&(validateIdentifierKey(DroolsSoftKeywords.EXISTS)))||(synpred7()&&(validateIdentifierKey(DroolsSoftKeywords.EXISTS)))||(synpred7()&&(validateIdentifierKey(DroolsSoftKeywords.NOT)))||(synpred7()&&(validateIdentifierKey(DroolsSoftKeywords.EXISTS)))||(synpred7()&&(validateIdentifierKey(DroolsSoftKeywords.EXISTS)))||(synpred7()&&(validateIdentifierKey(DroolsSoftKeywords.NOT)))))) {s = 9;}

                         
                        input.seek(index53_2);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA53_44 = input.LA(1);

                         
                        int index53_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7()) ) {s = 9;}

                        else if ( (true) ) {s = 82;}

                         
                        input.seek(index53_44);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA53_25 = input.LA(1);

                         
                        int index53_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7()) ) {s = 9;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index53_25);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA53_31 = input.LA(1);

                         
                        int index53_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7()) ) {s = 9;}

                        else if ( (true) ) {s = 64;}

                         
                        input.seek(index53_31);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA53_50 = input.LA(1);

                         
                        int index53_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7()) ) {s = 9;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index53_50);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA64_eotS =
        "\13\uffff";
    static final String DFA64_eofS =
        "\13\uffff";
    static final String DFA64_minS =
        "\1\123\1\130\2\4\1\0\1\123\1\0\4\uffff";
    static final String DFA64_maxS =
        "\1\123\1\130\2\u0080\1\0\1\132\1\0\4\uffff";
    static final String DFA64_acceptS =
        "\7\uffff\1\1\1\2\1\1\1\2";
    static final String DFA64_specialS =
        "\1\2\1\4\1\6\1\0\1\5\1\1\1\3\4\uffff}>";
    static final String[] DFA64_transitionS = {
            "\1\1",
            "\1\2",
            "\124\3\1\4\1\3\1\5\46\3",
            "\124\3\1\6\1\3\1\5\46\3",
            "\1\uffff",
            "\1\11\5\uffff\1\11\1\12",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "974:2: ( reverse_key pc3= accumulate_paren_chunk[Location.LOCATION_LHS_FROM_ACCUMULATE_REVERSE_INSIDE] (cm3= COMMA )? )?";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_3 = input.LA(1);

                         
                        int index64_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA64_3==RIGHT_PAREN) && (((validateIdentifierKey(DroolsSoftKeywords.REVERSE))||(validateIdentifierKey(DroolsSoftKeywords.RESULT))))) {s = 5;}

                        else if ( ((LA64_3>=VT_COMPILATION_UNIT && LA64_3<=STRING)||LA64_3==COMMA||(LA64_3>=AT && LA64_3<=MULTI_LINE_COMMENT)) && (((validateIdentifierKey(DroolsSoftKeywords.REVERSE))||(validateIdentifierKey(DroolsSoftKeywords.RESULT))))) {s = 3;}

                        else if ( (LA64_3==LEFT_PAREN) && (((validateIdentifierKey(DroolsSoftKeywords.REVERSE))||(validateIdentifierKey(DroolsSoftKeywords.RESULT))))) {s = 6;}

                         
                        input.seek(index64_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA64_5 = input.LA(1);

                         
                        int index64_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA64_5==ID||LA64_5==COMMA) && ((validateIdentifierKey(DroolsSoftKeywords.REVERSE)))) {s = 9;}

                        else if ( (LA64_5==RIGHT_PAREN) && ((validateIdentifierKey(DroolsSoftKeywords.RESULT)))) {s = 10;}

                         
                        input.seek(index64_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA64_0 = input.LA(1);

                         
                        int index64_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA64_0==ID) && (((validateIdentifierKey(DroolsSoftKeywords.REVERSE))||(validateIdentifierKey(DroolsSoftKeywords.RESULT))))) {s = 1;}

                         
                        input.seek(index64_0);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA64_6 = input.LA(1);

                         
                        int index64_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((validateIdentifierKey(DroolsSoftKeywords.REVERSE))) ) {s = 9;}

                        else if ( ((validateIdentifierKey(DroolsSoftKeywords.RESULT))) ) {s = 10;}

                         
                        input.seek(index64_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA64_1==LEFT_PAREN) && (((validateIdentifierKey(DroolsSoftKeywords.REVERSE))||(validateIdentifierKey(DroolsSoftKeywords.RESULT))))) {s = 2;}

                         
                        input.seek(index64_1);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA64_4 = input.LA(1);

                         
                        int index64_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((validateIdentifierKey(DroolsSoftKeywords.REVERSE))) ) {s = 7;}

                        else if ( ((validateIdentifierKey(DroolsSoftKeywords.RESULT))) ) {s = 8;}

                         
                        input.seek(index64_4);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA64_2 = input.LA(1);

                         
                        int index64_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA64_2>=VT_COMPILATION_UNIT && LA64_2<=STRING)||LA64_2==COMMA||(LA64_2>=AT && LA64_2<=MULTI_LINE_COMMENT)) && (((validateIdentifierKey(DroolsSoftKeywords.REVERSE))||(validateIdentifierKey(DroolsSoftKeywords.RESULT))))) {s = 3;}

                        else if ( (LA64_2==LEFT_PAREN) && (((validateIdentifierKey(DroolsSoftKeywords.REVERSE))||(validateIdentifierKey(DroolsSoftKeywords.RESULT))))) {s = 4;}

                        else if ( (LA64_2==RIGHT_PAREN) && (((validateIdentifierKey(DroolsSoftKeywords.REVERSE))||(validateIdentifierKey(DroolsSoftKeywords.RESULT))))) {s = 5;}

                         
                        input.seek(index64_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA67_eotS =
        "\25\uffff";
    static final String DFA67_eofS =
        "\25\uffff";
    static final String DFA67_minS =
        "\1\122\1\4\1\uffff\1\4\1\0\2\uffff\1\4\2\0\3\4\1\0\1\4\1\uffff"+
        "\1\4\4\0";
    static final String DFA67_maxS =
        "\1\164\1\u0080\1\uffff\1\u0080\1\0\2\uffff\1\u0080\2\0\3\u0080"+
        "\1\0\1\u0080\1\uffff\1\u0080\4\0";
    static final String DFA67_acceptS =
        "\2\uffff\1\2\2\uffff\2\1\10\uffff\1\1\5\uffff";
    static final String DFA67_specialS =
        "\1\uffff\1\7\1\uffff\1\13\1\3\2\uffff\1\1\1\5\1\4\1\12\1\2\1\0"+
        "\1\6\1\10\1\uffff\1\11\4\uffff}>";
    static final String[] DFA67_transitionS = {
            "\3\2\1\uffff\1\2\1\uffff\1\1\2\2\6\uffff\2\2\3\uffff\1\2\15"+
            "\uffff\1\2",
            "\117\5\1\3\4\5\1\4\1\5\1\6\46\5",
            "",
            "\117\5\1\11\1\12\3\5\1\10\1\5\1\6\1\5\1\7\25\5\1\13\16\5",
            "\1\uffff",
            "",
            "",
            "\117\5\1\14\4\5\1\15\1\5\1\6\46\5",
            "\1\uffff",
            "\1\uffff",
            "\117\5\1\16\4\5\1\17\1\5\1\6\46\5",
            "\124\5\1\17\1\5\1\6\30\5\1\20\15\5",
            "\120\5\1\21\3\5\1\23\1\5\1\6\27\5\1\22\16\5",
            "\1\uffff",
            "\120\5\1\12\3\5\1\24\1\5\1\6\27\5\1\13\16\5",
            "",
            "\124\5\1\24\1\5\1\6\27\5\1\13\16\5",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "1049:3: ( ( LEFT_PAREN )=>args= paren_chunk )?";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_12 = input.LA(1);

                         
                        int index67_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA67_12==DOT) ) {s = 17;}

                        else if ( (LA67_12==LEFT_SQUARE) ) {s = 18;}

                        else if ( (LA67_12==LEFT_PAREN) ) {s = 19;}

                        else if ( (LA67_12==RIGHT_PAREN) && (synpred8())) {s = 6;}

                        else if ( ((LA67_12>=VT_COMPILATION_UNIT && LA67_12<=ID)||(LA67_12>=DOT_STAR && LA67_12<=STRING)||LA67_12==COMMA||(LA67_12>=AT && LA67_12<=NULL)||(LA67_12>=RIGHT_SQUARE && LA67_12<=MULTI_LINE_COMMENT)) && (synpred8())) {s = 5;}

                         
                        input.seek(index67_12);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA67_7 = input.LA(1);

                         
                        int index67_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA67_7==ID) ) {s = 12;}

                        else if ( (LA67_7==LEFT_PAREN) ) {s = 13;}

                        else if ( (LA67_7==RIGHT_PAREN) && (synpred8())) {s = 6;}

                        else if ( ((LA67_7>=VT_COMPILATION_UNIT && LA67_7<=SEMICOLON)||(LA67_7>=DOT && LA67_7<=STRING)||LA67_7==COMMA||(LA67_7>=AT && LA67_7<=MULTI_LINE_COMMENT)) && (synpred8())) {s = 5;}

                         
                        input.seek(index67_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA67_11 = input.LA(1);

                         
                        int index67_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA67_11==RIGHT_SQUARE) ) {s = 16;}

                        else if ( (LA67_11==RIGHT_PAREN) && (synpred8())) {s = 6;}

                        else if ( ((LA67_11>=VT_COMPILATION_UNIT && LA67_11<=STRING)||LA67_11==COMMA||(LA67_11>=AT && LA67_11<=LEFT_SQUARE)||(LA67_11>=THEN && LA67_11<=MULTI_LINE_COMMENT)) && (synpred8())) {s = 5;}

                        else if ( (LA67_11==LEFT_PAREN) && (synpred8())) {s = 15;}

                         
                        input.seek(index67_11);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA67_4 = input.LA(1);

                         
                        int index67_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8()) ) {s = 6;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index67_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA67_9 = input.LA(1);

                         
                        int index67_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8()) ) {s = 6;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index67_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA67_8 = input.LA(1);

                         
                        int index67_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8()) ) {s = 6;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index67_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA67_13 = input.LA(1);

                         
                        int index67_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8()) ) {s = 15;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index67_13);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA67_1 = input.LA(1);

                         
                        int index67_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA67_1==ID) ) {s = 3;}

                        else if ( (LA67_1==LEFT_PAREN) ) {s = 4;}

                        else if ( ((LA67_1>=VT_COMPILATION_UNIT && LA67_1<=SEMICOLON)||(LA67_1>=DOT && LA67_1<=STRING)||LA67_1==COMMA||(LA67_1>=AT && LA67_1<=MULTI_LINE_COMMENT)) && (synpred8())) {s = 5;}

                        else if ( (LA67_1==RIGHT_PAREN) && (synpred8())) {s = 6;}

                         
                        input.seek(index67_1);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA67_14 = input.LA(1);

                         
                        int index67_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA67_14==LEFT_SQUARE) ) {s = 11;}

                        else if ( (LA67_14==LEFT_PAREN) ) {s = 20;}

                        else if ( (LA67_14==DOT) ) {s = 10;}

                        else if ( (LA67_14==RIGHT_PAREN) && (synpred8())) {s = 6;}

                        else if ( ((LA67_14>=VT_COMPILATION_UNIT && LA67_14<=ID)||(LA67_14>=DOT_STAR && LA67_14<=STRING)||LA67_14==COMMA||(LA67_14>=AT && LA67_14<=NULL)||(LA67_14>=RIGHT_SQUARE && LA67_14<=MULTI_LINE_COMMENT)) && (synpred8())) {s = 5;}

                         
                        input.seek(index67_14);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA67_16 = input.LA(1);

                         
                        int index67_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA67_16==LEFT_PAREN) ) {s = 20;}

                        else if ( (LA67_16==LEFT_SQUARE) ) {s = 11;}

                        else if ( (LA67_16==RIGHT_PAREN) && (synpred8())) {s = 6;}

                        else if ( ((LA67_16>=VT_COMPILATION_UNIT && LA67_16<=STRING)||LA67_16==COMMA||(LA67_16>=AT && LA67_16<=NULL)||(LA67_16>=RIGHT_SQUARE && LA67_16<=MULTI_LINE_COMMENT)) && (synpred8())) {s = 5;}

                         
                        input.seek(index67_16);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA67_10 = input.LA(1);

                         
                        int index67_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA67_10==ID) ) {s = 14;}

                        else if ( (LA67_10==RIGHT_PAREN) && (synpred8())) {s = 6;}

                        else if ( ((LA67_10>=VT_COMPILATION_UNIT && LA67_10<=SEMICOLON)||(LA67_10>=DOT && LA67_10<=STRING)||LA67_10==COMMA||(LA67_10>=AT && LA67_10<=MULTI_LINE_COMMENT)) && (synpred8())) {s = 5;}

                        else if ( (LA67_10==LEFT_PAREN) && (synpred8())) {s = 15;}

                         
                        input.seek(index67_10);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA67_3 = input.LA(1);

                         
                        int index67_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA67_3==COLON) ) {s = 7;}

                        else if ( (LA67_3==LEFT_PAREN) ) {s = 8;}

                        else if ( (LA67_3==ID) ) {s = 9;}

                        else if ( (LA67_3==DOT) ) {s = 10;}

                        else if ( (LA67_3==LEFT_SQUARE) ) {s = 11;}

                        else if ( (LA67_3==RIGHT_PAREN) && (synpred8())) {s = 6;}

                        else if ( ((LA67_3>=VT_COMPILATION_UNIT && LA67_3<=SEMICOLON)||(LA67_3>=DOT_STAR && LA67_3<=STRING)||LA67_3==COMMA||LA67_3==AT||(LA67_3>=EQUALS && LA67_3<=NULL)||(LA67_3>=RIGHT_SQUARE && LA67_3<=MULTI_LINE_COMMENT)) && (synpred8())) {s = 5;}

                         
                        input.seek(index67_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA69_eotS =
        "\27\uffff";
    static final String DFA69_eofS =
        "\27\uffff";
    static final String DFA69_minS =
        "\1\122\1\4\2\uffff\1\4\1\0\1\uffff\1\4\2\0\3\4\1\0\3\4\1\0\1\4"+
        "\2\0\1\4\1\0";
    static final String DFA69_maxS =
        "\1\164\1\u0080\2\uffff\1\u0080\1\0\1\uffff\1\u0080\2\0\3\u0080"+
        "\1\0\3\u0080\1\0\1\u0080\2\0\1\u0080\1\0";
    static final String DFA69_acceptS =
        "\2\uffff\1\2\1\3\2\uffff\1\1\20\uffff";
    static final String DFA69_specialS =
        "\5\uffff\1\6\2\uffff\1\1\1\0\3\uffff\1\2\3\uffff\1\4\1\uffff\1"+
        "\3\1\5\2\uffff}>";
    static final String[] DFA69_transitionS = {
            "\3\3\1\uffff\1\3\1\uffff\1\1\2\3\6\uffff\2\3\3\uffff\1\3\13"+
            "\uffff\1\2\1\uffff\1\3",
            "\117\6\1\4\4\6\1\5\50\6",
            "",
            "",
            "\117\6\1\11\1\12\3\6\1\10\3\6\1\7\25\6\1\13\16\6",
            "\1\uffff",
            "",
            "\117\6\1\14\4\6\1\15\50\6",
            "\1\uffff",
            "\1\uffff",
            "\117\6\1\16\55\6",
            "\157\6\1\17\15\6",
            "\120\6\1\20\3\6\1\21\31\6\1\22\16\6",
            "\1\uffff",
            "\120\6\1\12\3\6\1\23\31\6\1\13\16\6",
            "\124\6\1\24\31\6\1\13\16\6",
            "\117\6\1\25\55\6",
            "\1\uffff",
            "\157\6\1\26\15\6",
            "\1\uffff",
            "\1\uffff",
            "\120\6\1\20\3\6\1\21\31\6\1\22\16\6",
            "\1\uffff"
    };

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "1063:4: ({...}? paren_chunk | square_chunk )?";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_9 = input.LA(1);

                         
                        int index69_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (input.LA(1) == LEFT_PAREN) ) {s = 6;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index69_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA69_8 = input.LA(1);

                         
                        int index69_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (input.LA(1) == LEFT_PAREN) ) {s = 6;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index69_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA69_13 = input.LA(1);

                         
                        int index69_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (input.LA(1) == LEFT_PAREN) ) {s = 6;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index69_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA69_19 = input.LA(1);

                         
                        int index69_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (input.LA(1) == LEFT_PAREN) ) {s = 6;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index69_19);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA69_17 = input.LA(1);

                         
                        int index69_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (input.LA(1) == LEFT_PAREN) ) {s = 6;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index69_17);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA69_20 = input.LA(1);

                         
                        int index69_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (input.LA(1) == LEFT_PAREN) ) {s = 6;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index69_20);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA69_5 = input.LA(1);

                         
                        int index69_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (input.LA(1) == LEFT_PAREN) ) {s = 6;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index69_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 69, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA82_eotS =
        "\40\uffff";
    static final String DFA82_eofS =
        "\40\uffff";
    static final String DFA82_minS =
        "\1\131\1\uffff\2\123\1\uffff\1\0\1\123\1\0\1\123\1\4\6\0\1\162"+
        "\1\4\2\0\1\4\13\0";
    static final String DFA82_maxS =
        "\1\142\1\uffff\1\157\1\162\1\uffff\1\0\1\162\1\0\1\123\1\u0080"+
        "\6\0\1\162\1\u0080\2\0\1\u0080\13\0";
    static final String DFA82_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\33\uffff";
    static final String DFA82_specialS =
        "\2\uffff\1\14\1\12\1\uffff\1\13\1\11\1\2\2\uffff\1\7\1\3\1\1\1"+
        "\5\1\4\1\10\2\uffff\1\6\1\0\14\uffff}>";
    static final String[] DFA82_transitionS = {
            "\2\1\6\uffff\1\2\1\1",
            "",
            "\1\3\4\uffff\1\5\20\uffff\7\4",
            "\1\6\1\1\2\uffff\1\4\1\7\3\uffff\1\1\2\uffff\2\4\10\uffff"+
            "\6\1\1\10\2\4\1\1",
            "",
            "\1\uffff",
            "\1\12\1\4\2\uffff\1\13\1\11\2\4\4\uffff\1\16\1\14\2\4\14\uffff"+
            "\1\1\1\15\1\17\1\4",
            "\1\uffff",
            "\1\20",
            "\117\31\1\21\3\31\1\24\1\22\1\31\1\23\4\31\1\27\1\25\17\31"+
            "\1\26\1\30\17\31",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\32",
            "\120\31\1\36\3\31\1\35\1\37\1\33\27\31\1\34\16\31",
            "\1\uffff",
            "\1\uffff",
            "\124\31\1\35\1\37\1\33\46\31",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA82_eot = DFA.unpackEncodedString(DFA82_eotS);
    static final short[] DFA82_eof = DFA.unpackEncodedString(DFA82_eofS);
    static final char[] DFA82_min = DFA.unpackEncodedStringToUnsignedChars(DFA82_minS);
    static final char[] DFA82_max = DFA.unpackEncodedStringToUnsignedChars(DFA82_maxS);
    static final short[] DFA82_accept = DFA.unpackEncodedString(DFA82_acceptS);
    static final short[] DFA82_special = DFA.unpackEncodedString(DFA82_specialS);
    static final short[][] DFA82_transition;

    static {
        int numStates = DFA82_transitionS.length;
        DFA82_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA82_transition[i] = DFA.unpackEncodedString(DFA82_transitionS[i]);
        }
    }

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = DFA82_eot;
            this.eof = DFA82_eof;
            this.min = DFA82_min;
            this.max = DFA82_max;
            this.accept = DFA82_accept;
            this.special = DFA82_special;
            this.transition = DFA82_transition;
        }
        public String getDescription() {
            return "()* loopback of 1173:25: ({...}? => DOUBLE_PIPE and_restr_connective )*";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA82_19 = input.LA(1);

                         
                        int index82_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((validateRestr())) ) {s = 4;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_19);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA82_12 = input.LA(1);

                         
                        int index82_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((validateRestr())) ) {s = 4;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA82_7 = input.LA(1);

                         
                        int index82_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((validateRestr())) ) {s = 4;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA82_11 = input.LA(1);

                         
                        int index82_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((validateRestr())) ) {s = 4;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_11);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA82_14 = input.LA(1);

                         
                        int index82_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((validateRestr())) ) {s = 4;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_14);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA82_13 = input.LA(1);

                         
                        int index82_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((validateRestr())) ) {s = 4;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_13);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA82_18 = input.LA(1);

                         
                        int index82_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((validateRestr())) ) {s = 4;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_18);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA82_10 = input.LA(1);

                         
                        int index82_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((validateRestr())) ) {s = 4;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_10);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA82_15 = input.LA(1);

                         
                        int index82_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((validateRestr())) ) {s = 4;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_15);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA82_6 = input.LA(1);

                         
                        int index82_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA82_6==LEFT_PAREN) ) {s = 9;}

                        else if ( (LA82_6==ID) ) {s = 10;}

                        else if ( (LA82_6==STRING) ) {s = 11;}

                        else if ( (LA82_6==INT) ) {s = 12;}

                        else if ( (LA82_6==FLOAT) ) {s = 13;}

                        else if ( (LA82_6==BOOL) ) {s = 14;}

                        else if ( (LA82_6==NULL) ) {s = 15;}

                        else if ( (LA82_6==GRAVE_ACCENT) ) {s = 1;}

                        else if ( (LA82_6==DOT||(LA82_6>=COMMA && LA82_6<=RIGHT_PAREN)||(LA82_6>=DOUBLE_PIPE && LA82_6<=DOUBLE_AMPER)||LA82_6==LEFT_SQUARE) && ((validateRestr()))) {s = 4;}

                         
                        input.seek(index82_6);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA82_3 = input.LA(1);

                         
                        int index82_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA82_3==DOT||LA82_3==COLON||(LA82_3>=EQUAL && LA82_3<=NOT_EQUAL)||LA82_3==LEFT_SQUARE) ) {s = 1;}

                        else if ( (LA82_3==ID) ) {s = 6;}

                        else if ( (LA82_3==STRING||(LA82_3>=BOOL && LA82_3<=INT)||(LA82_3>=FLOAT && LA82_3<=NULL)) && ((validateRestr()))) {s = 4;}

                        else if ( (LA82_3==LEFT_PAREN) ) {s = 7;}

                        else if ( (LA82_3==GRAVE_ACCENT) ) {s = 8;}

                         
                        input.seek(index82_3);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA82_5 = input.LA(1);

                         
                        int index82_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((validateRestr())) ) {s = 4;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_5);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA82_2 = input.LA(1);

                         
                        int index82_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA82_2==ID) ) {s = 3;}

                        else if ( ((LA82_2>=EQUAL && LA82_2<=GRAVE_ACCENT)) && ((validateRestr()))) {s = 4;}

                        else if ( (LA82_2==LEFT_PAREN) ) {s = 5;}

                         
                        input.seek(index82_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 82, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA83_eotS =
        "\75\uffff";
    static final String DFA83_eofS =
        "\75\uffff";
    static final String DFA83_minS =
        "\1\131\1\uffff\3\123\1\uffff\2\123\1\4\1\123\7\0\1\4\1\162\3\4"+
        "\47\0";
    static final String DFA83_maxS =
        "\1\142\1\uffff\1\157\1\162\1\157\1\uffff\1\162\1\123\1\u0080\1"+
        "\162\7\0\1\u0080\1\162\3\u0080\47\0";
    static final String DFA83_acceptS =
        "\1\uffff\1\2\3\uffff\1\1\67\uffff";
    static final String DFA83_specialS =
        "\2\uffff\1\5\1\11\1\1\1\uffff\1\0\2\uffff\1\12\1\3\1\13\1\4\1\2"+
        "\1\6\1\7\1\10\54\uffff}>";
    static final String[] DFA83_transitionS = {
            "\2\1\6\uffff\1\1\1\2",
            "",
            "\1\3\4\uffff\1\4\20\uffff\7\5",
            "\1\6\1\1\2\uffff\1\5\1\10\3\uffff\1\1\2\uffff\2\5\10\uffff"+
            "\6\1\1\7\2\5\1\1",
            "\1\11\4\uffff\1\12\20\uffff\7\5",
            "",
            "\1\13\1\5\2\uffff\1\14\1\21\2\5\4\uffff\1\17\1\15\2\5\14\uffff"+
            "\1\1\1\16\1\20\1\5",
            "\1\22",
            "\117\42\1\23\3\42\1\24\1\31\1\42\1\33\4\42\1\27\1\25\10\42"+
            "\1\32\1\34\1\35\1\36\1\37\1\40\1\41\1\26\1\30\17\42",
            "\1\44\1\1\2\uffff\1\5\1\43\3\uffff\1\1\2\uffff\2\5\10\uffff"+
            "\6\1\1\45\2\5\1\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\117\55\1\46\3\55\1\47\1\54\1\55\1\56\4\55\1\52\1\50\17\55"+
            "\1\51\1\53\17\55",
            "\1\57",
            "\117\42\1\61\1\72\2\42\1\62\1\60\1\73\1\67\4\42\1\65\1\63"+
            "\16\42\1\70\1\64\1\66\1\71\16\42",
            "\124\42\1\74\1\73\1\67\46\42",
            "\124\42\1\74\1\73\1\67\46\42",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA83_eot = DFA.unpackEncodedString(DFA83_eotS);
    static final short[] DFA83_eof = DFA.unpackEncodedString(DFA83_eofS);
    static final char[] DFA83_min = DFA.unpackEncodedStringToUnsignedChars(DFA83_minS);
    static final char[] DFA83_max = DFA.unpackEncodedStringToUnsignedChars(DFA83_maxS);
    static final short[] DFA83_accept = DFA.unpackEncodedString(DFA83_acceptS);
    static final short[] DFA83_special = DFA.unpackEncodedString(DFA83_specialS);
    static final short[][] DFA83_transition;

    static {
        int numStates = DFA83_transitionS.length;
        DFA83_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA83_transition[i] = DFA.unpackEncodedString(DFA83_transitionS[i]);
        }
    }

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = DFA83_eot;
            this.eof = DFA83_eof;
            this.min = DFA83_min;
            this.max = DFA83_max;
            this.accept = DFA83_accept;
            this.special = DFA83_special;
            this.transition = DFA83_transition;
        }
        public String getDescription() {
            return "()* loopback of 1178:26: ({...}? => DOUBLE_AMPER constraint_expression )*";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA83_6 = input.LA(1);

                         
                        int index83_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA83_6==ID) ) {s = 11;}

                        else if ( (LA83_6==STRING) ) {s = 12;}

                        else if ( (LA83_6==INT) ) {s = 13;}

                        else if ( (LA83_6==FLOAT) ) {s = 14;}

                        else if ( (LA83_6==BOOL) ) {s = 15;}

                        else if ( (LA83_6==NULL) ) {s = 16;}

                        else if ( (LA83_6==LEFT_PAREN) ) {s = 17;}

                        else if ( (LA83_6==GRAVE_ACCENT) ) {s = 1;}

                        else if ( (LA83_6==DOT||(LA83_6>=COMMA && LA83_6<=RIGHT_PAREN)||(LA83_6>=DOUBLE_PIPE && LA83_6<=DOUBLE_AMPER)||LA83_6==LEFT_SQUARE) && ((validateRestr()))) {s = 5;}

                         
                        input.seek(index83_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA83_4 = input.LA(1);

                         
                        int index83_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA83_4==ID) ) {s = 9;}

                        else if ( ((LA83_4>=EQUAL && LA83_4<=GRAVE_ACCENT)) && ((validateRestr()))) {s = 5;}

                        else if ( (LA83_4==LEFT_PAREN) ) {s = 10;}

                         
                        input.seek(index83_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA83_13 = input.LA(1);

                         
                        int index83_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((validateRestr())) ) {s = 5;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index83_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA83_10 = input.LA(1);

                         
                        int index83_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((validateRestr())) ) {s = 5;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index83_10);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA83_12 = input.LA(1);

                         
                        int index83_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((validateRestr())) ) {s = 5;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index83_12);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA83_2 = input.LA(1);

                         
                        int index83_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA83_2==ID) ) {s = 3;}

                        else if ( (LA83_2==LEFT_PAREN) ) {s = 4;}

                        else if ( ((LA83_2>=EQUAL && LA83_2<=GRAVE_ACCENT)) && ((validateRestr()))) {s = 5;}

                         
                        input.seek(index83_2);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA83_14 = input.LA(1);

                         
                        int index83_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((validateRestr())) ) {s = 5;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index83_14);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA83_15 = input.LA(1);

                         
                        int index83_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((validateRestr())) ) {s = 5;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index83_15);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA83_16 = input.LA(1);

                         
                        int index83_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((validateRestr())) ) {s = 5;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index83_16);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA83_3 = input.LA(1);

                         
                        int index83_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA83_3==DOT||LA83_3==COLON||(LA83_3>=EQUAL && LA83_3<=NOT_EQUAL)||LA83_3==LEFT_SQUARE) ) {s = 1;}

                        else if ( (LA83_3==ID) ) {s = 6;}

                        else if ( (LA83_3==GRAVE_ACCENT) ) {s = 7;}

                        else if ( (LA83_3==LEFT_PAREN) ) {s = 8;}

                        else if ( (LA83_3==STRING||(LA83_3>=BOOL && LA83_3<=INT)||(LA83_3>=FLOAT && LA83_3<=NULL)) && ((validateRestr()))) {s = 5;}

                         
                        input.seek(index83_3);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA83_9 = input.LA(1);

                         
                        int index83_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA83_9==DOT||LA83_9==COLON||(LA83_9>=EQUAL && LA83_9<=NOT_EQUAL)||LA83_9==LEFT_SQUARE) ) {s = 1;}

                        else if ( (LA83_9==LEFT_PAREN) ) {s = 35;}

                        else if ( (LA83_9==ID) ) {s = 36;}

                        else if ( (LA83_9==GRAVE_ACCENT) ) {s = 37;}

                        else if ( (LA83_9==STRING||(LA83_9>=BOOL && LA83_9<=INT)||(LA83_9>=FLOAT && LA83_9<=NULL)) && ((validateRestr()))) {s = 5;}

                         
                        input.seek(index83_9);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA83_11 = input.LA(1);

                         
                        int index83_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((validateRestr())) ) {s = 5;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index83_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 83, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_package_statement_in_compilation_unit388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_statement_in_compilation_unit393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_EOF_in_compilation_unit398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_package_key_in_package_statement458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_package_id_in_package_statement462 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMICOLON_in_package_statement464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_package_id491 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_package_id497 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_package_id501 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_rule_attribute_in_statement545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_import_statement_in_statement552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_statement_in_statement558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_global_in_statement564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_statement570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_template_in_statement578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_declaration_in_statement586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_in_statement591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_in_statement596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_key_in_import_statement623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_import_name_in_import_statement625 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMICOLON_in_import_statement628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_key_in_function_import_statement671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_function_key_in_function_import_statement673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_import_name_in_function_import_statement675 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMICOLON_in_function_import_statement678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_import_name712 = new BitSet(new long[]{0x0000000000000002L,0x0000000000300000L});
    public static final BitSet FOLLOW_DOT_in_import_name718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_import_name722 = new BitSet(new long[]{0x0000000000000002L,0x0000000000300000L});
    public static final BitSet FOLLOW_DOT_STAR_in_import_name729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_global_key_in_global774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_data_type_in_global776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_global_id_in_global778 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMICOLON_in_global780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_global_id809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_key_in_function846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_data_type_in_function848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_function_id_in_function851 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_parameters_in_function853 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_curly_chunk_in_function855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function_id885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_key_in_query922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000880000L});
    public static final BitSet FOLLOW_query_id_in_query924 = new BitSet(new long[]{0x0000000000000000L,0x0000000001480000L});
    public static final BitSet FOLLOW_parameters_in_query932 = new BitSet(new long[]{0x0000000000000000L,0x0000000001480000L});
    public static final BitSet FOLLOW_normal_lhs_block_in_query941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_END_in_query946 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMICOLON_in_query948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_query_id983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_query_id999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_parameters1018 = new BitSet(new long[]{0x0000000000000000L,0x0000000004080000L});
    public static final BitSet FOLLOW_param_definition_in_parameters1027 = new BitSet(new long[]{0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_COMMA_in_parameters1030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_param_definition_in_parameters1034 = new BitSet(new long[]{0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_parameters1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_type_in_param_definition1069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_argument_in_param_definition1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_argument1083 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
    public static final BitSet FOLLOW_dimension_definition_in_argument1089 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
    public static final BitSet FOLLOW_declare_key_in_type_declaration1117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_type_declare_id_in_type_declaration1120 = new BitSet(new long[]{0x0000000000000000L,0x0000000008480000L});
    public static final BitSet FOLLOW_decl_metadata_in_type_declaration1124 = new BitSet(new long[]{0x0000000000000000L,0x0000000008480000L});
    public static final BitSet FOLLOW_decl_field_in_type_declaration1129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000480000L});
    public static final BitSet FOLLOW_END_in_type_declaration1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type_declare_id1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_decl_metadata1188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_decl_metadata1196 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_paren_chunk_in_decl_metadata1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_decl_field1226 = new BitSet(new long[]{0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_decl_field_initialization_in_decl_field1232 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_decl_field1238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_data_type_in_decl_field1244 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_decl_metadata_in_decl_field1248 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_EQUALS_in_decl_field_initialization1276 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_paren_chunk_in_decl_field_initialization1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_template_key_in_template1319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000880000L});
    public static final BitSet FOLLOW_template_id_in_template1321 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_SEMICOLON_in_template1328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_template_slot_in_template1336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000480000L});
    public static final BitSet FOLLOW_END_in_template1341 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMICOLON_in_template1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_template_id1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_template_id1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_type_in_template_slot1414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_slot_id_in_template_slot1416 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMICOLON_in_template_slot1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_slot_id1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_key_in_rule1484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000880000L});
    public static final BitSet FOLLOW_rule_id_in_rule1486 = new BitSet(new long[]{0x0000000000000000L,0x0010000048080000L});
    public static final BitSet FOLLOW_rule_attributes_in_rule1494 = new BitSet(new long[]{0x0000000000000000L,0x0010000048000000L});
    public static final BitSet FOLLOW_decl_metadata_in_rule1497 = new BitSet(new long[]{0x0000000000000000L,0x0010000048000000L});
    public static final BitSet FOLLOW_when_part_in_rule1500 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_rhs_chunk_in_rule1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHEN_in_when_part1536 = new BitSet(new long[]{0x0000000000000002L,0x0000000011080000L});
    public static final BitSet FOLLOW_COLON_in_when_part1542 = new BitSet(new long[]{0x0000000000000002L,0x0000000001080000L});
    public static final BitSet FOLLOW_normal_lhs_block_in_when_part1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_rule_id1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_rule_id1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributes_key_in_rule_attributes1610 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_rule_attributes1612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_rule_attribute_in_rule_attributes1622 = new BitSet(new long[]{0x0000000000000002L,0x0000000002080000L});
    public static final BitSet FOLLOW_COMMA_in_rule_attributes1626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_rule_attribute_in_rule_attributes1633 = new BitSet(new long[]{0x0000000000000002L,0x0000000002080000L});
    public static final BitSet FOLLOW_salience_in_rule_attribute1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_no_loop_in_rule_attribute1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_agenda_group_in_rule_attribute1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_duration_in_rule_attribute1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_activation_group_in_rule_attribute1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_auto_focus_in_rule_attribute1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_effective_in_rule_attribute1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_expires_in_rule_attribute1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enabled_in_rule_attribute1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleflow_group_in_rule_attribute1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lock_on_active_in_rule_attribute1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dialect_in_rule_attribute1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_effective_key_in_date_effective1754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_date_effective1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_expires_key_in_date_expires1773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_date_expires1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enabled_key_in_enabled1793 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_BOOL_in_enabled1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_salience_key_in_salience1813 = new BitSet(new long[]{0x0000000000000000L,0x0000000101000000L});
    public static final BitSet FOLLOW_INT_in_salience1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paren_chunk_in_salience1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_no_loop_key_in_no_loop1846 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_BOOL_in_no_loop1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_auto_focus_key_in_auto_focus1866 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_BOOL_in_auto_focus1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_activation_group_key_in_activation_group1888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_activation_group1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleflow_group_key_in_ruleflow_group1907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_ruleflow_group1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_agenda_group_key_in_agenda_group1926 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_agenda_group1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_duration_key_in_duration1945 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_duration1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dialect_key_in_dialect1966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_dialect1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lock_on_active_key_in_lock_on_active1989 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_BOOL_in_lock_on_active1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_normal_lhs_block2009 = new BitSet(new long[]{0x0000000000000002L,0x0000000001080000L});
    public static final BitSet FOLLOW_lhs_or_in_lhs2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_lhs_or2054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_or_key_in_lhs_or2064 = new BitSet(new long[]{0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_lhs_and_in_lhs_or2072 = new BitSet(new long[]{0x0000000000000000L,0x0000000005080000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_lhs_or2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_and_in_lhs_or2101 = new BitSet(new long[]{0x0000000000000002L,0x0000000200080000L});
    public static final BitSet FOLLOW_or_key_in_lhs_or2123 = new BitSet(new long[]{0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_DOUBLE_PIPE_in_lhs_or2130 = new BitSet(new long[]{0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_lhs_and_in_lhs_or2141 = new BitSet(new long[]{0x0000000000000002L,0x0000000200080000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_lhs_and2182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_and_key_in_lhs_and2192 = new BitSet(new long[]{0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_lhs_unary_in_lhs_and2200 = new BitSet(new long[]{0x0000000000000000L,0x0000000005080000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_lhs_and2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_unary_in_lhs_and2230 = new BitSet(new long[]{0x0000000000000002L,0x0000000400080000L});
    public static final BitSet FOLLOW_and_key_in_lhs_and2252 = new BitSet(new long[]{0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_DOUBLE_AMPER_in_lhs_and2259 = new BitSet(new long[]{0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_lhs_unary_in_lhs_and2270 = new BitSet(new long[]{0x0000000000000002L,0x0000000400080000L});
    public static final BitSet FOLLOW_lhs_exist_in_lhs_unary2301 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_lhs_not_binding_in_lhs_unary2309 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_lhs_not_in_lhs_unary2315 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_lhs_eval_in_lhs_unary2321 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_lhs_forall_in_lhs_unary2327 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_lhs_unary2333 = new BitSet(new long[]{0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_lhs_or_in_lhs_unary2344 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_lhs_unary2350 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_pattern_source_in_lhs_unary2358 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMICOLON_in_lhs_unary2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exists_key_in_lhs_exist2388 = new BitSet(new long[]{0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_lhs_or_in_lhs_exist2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_lhs_exist2422 = new BitSet(new long[]{0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_lhs_or_in_lhs_exist2430 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_lhs_exist2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_pattern_in_lhs_exist2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_not_key_in_lhs_not_binding2498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_fact_binding_in_lhs_not_binding2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_not_key_in_lhs_not2523 = new BitSet(new long[]{0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_lhs_or_in_lhs_not2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_lhs_not2552 = new BitSet(new long[]{0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_lhs_or_in_lhs_not2561 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_lhs_not2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_pattern_in_lhs_not2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eval_key_in_lhs_eval2616 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_paren_chunk_in_lhs_eval2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forall_key_in_lhs_forall2652 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_lhs_forall2657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_lhs_pattern_in_lhs_forall2665 = new BitSet(new long[]{0x0000000000000000L,0x0000000004080000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_lhs_forall2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_pattern_in_pattern_source2707 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000000L});
    public static final BitSet FOLLOW_over_clause_in_pattern_source2711 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_FROM_in_pattern_source2721 = new BitSet(new long[]{0x0000000000000000L,0x000000A000080000L});
    public static final BitSet FOLLOW_accumulate_statement_in_pattern_source2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collect_statement_in_pattern_source2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entrypoint_statement_in_pattern_source2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_from_source_in_pattern_source2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OVER_in_over_clause2822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_over_elements_in_over_clause2827 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_COMMA_in_over_clause2834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_over_elements_in_over_clause2839 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_ID_in_over_elements2854 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_over_elements2861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_over_elements2870 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_paren_chunk_in_over_elements2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCUMULATE_in_accumulate_statement2903 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_accumulate_statement2912 = new BitSet(new long[]{0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_lhs_or_in_accumulate_statement2920 = new BitSet(new long[]{0x0000000000000000L,0x0000004002080000L});
    public static final BitSet FOLLOW_COMMA_in_accumulate_statement2925 = new BitSet(new long[]{0x0000000000000000L,0x0000004000080000L});
    public static final BitSet FOLLOW_accumulate_init_clause_in_accumulate_statement2935 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_accumulate_id_clause_in_accumulate_statement2941 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_accumulate_statement2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INIT_in_accumulate_init_clause2995 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_accumulate_paren_chunk_in_accumulate_init_clause3006 = new BitSet(new long[]{0x0000000000000000L,0x0000000002080000L});
    public static final BitSet FOLLOW_COMMA_in_accumulate_init_clause3011 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_action_key_in_accumulate_init_clause3022 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_accumulate_paren_chunk_in_accumulate_init_clause3026 = new BitSet(new long[]{0x0000000000000000L,0x0000000002080000L});
    public static final BitSet FOLLOW_COMMA_in_accumulate_init_clause3031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_reverse_key_in_accumulate_init_clause3044 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_accumulate_paren_chunk_in_accumulate_init_clause3048 = new BitSet(new long[]{0x0000000000000000L,0x0000000002080000L});
    public static final BitSet FOLLOW_COMMA_in_accumulate_init_clause3053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_result_key_in_accumulate_init_clause3068 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_accumulate_paren_chunk_in_accumulate_init_clause3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accumulate_paren_chunk_data_in_accumulate_paren_chunk3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_accumulate_paren_chunk_data3156 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000001L});
    public static final BitSet FOLLOW_set_in_accumulate_paren_chunk_data3168 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000001L});
    public static final BitSet FOLLOW_accumulate_paren_chunk_data_in_accumulate_paren_chunk_data3184 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000001L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_accumulate_paren_chunk_data3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_accumulate_id_clause3211 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_paren_chunk_in_accumulate_id_clause3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLECT_in_collect_statement3239 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_collect_statement3248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_pattern_source_in_collect_statement3255 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_collect_statement3260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entry_point_key_in_entrypoint_statement3287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000880000L});
    public static final BitSet FOLLOW_entrypoint_id_in_entrypoint_statement3295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_entrypoint_id3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_entrypoint_id3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_from_source3358 = new BitSet(new long[]{0x0000000000000002L,0x0000000001100000L});
    public static final BitSet FOLLOW_paren_chunk_in_from_source3373 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_expression_chain_in_from_source3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_expression_chain3413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_expression_chain3420 = new BitSet(new long[]{0x0000000000000002L,0x0004000001100000L});
    public static final BitSet FOLLOW_paren_chunk_in_expression_chain3436 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_square_chunk_in_expression_chain3450 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_expression_chain_in_expression_chain3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fact_binding_in_lhs_pattern3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fact_in_lhs_pattern3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_label_in_fact_binding3527 = new BitSet(new long[]{0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_fact_in_fact_binding3533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_fact_binding3540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_fact_binding_expression_in_fact_binding3548 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_fact_binding3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fact_in_fact_binding_expression3597 = new BitSet(new long[]{0x0000000000000002L,0x0000000200080000L});
    public static final BitSet FOLLOW_or_key_in_fact_binding_expression3609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_DOUBLE_PIPE_in_fact_binding_expression3615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_fact_in_fact_binding_expression3620 = new BitSet(new long[]{0x0000000000000002L,0x0000000200080000L});
    public static final BitSet FOLLOW_pattern_type_in_fact3660 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_fact3665 = new BitSet(new long[]{0x0000000000000000L,0x0000000005080000L});
    public static final BitSet FOLLOW_constraints_in_fact3676 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_fact3682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constraint_in_constraints3716 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_COMMA_in_constraints3720 = new BitSet(new long[]{0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_constraint_in_constraints3727 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_or_constr_in_constraint3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_constr_in_or_constr3752 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_DOUBLE_PIPE_in_or_constr3756 = new BitSet(new long[]{0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_and_constr_in_or_constr3763 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_unary_constr_in_and_constr3778 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_DOUBLE_AMPER_in_and_constr3782 = new BitSet(new long[]{0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_unary_constr_in_and_constr3789 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_eval_key_in_unary_constr3822 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_paren_chunk_in_unary_constr3825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_constraint_in_unary_constr3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_unary_constr3836 = new BitSet(new long[]{0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_or_constr_in_unary_constr3846 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_unary_constr3851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_label_in_field_constraint3871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_accessor_path_in_field_constraint3873 = new BitSet(new long[]{0x0000000000000002L,0x0000FF0001080000L});
    public static final BitSet FOLLOW_or_restr_connective_in_field_constraint3880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARROW_in_field_constraint3886 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_paren_chunk_in_field_constraint3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accessor_path_in_field_constraint3944 = new BitSet(new long[]{0x0000000000000000L,0x0000FE0001080000L});
    public static final BitSet FOLLOW_or_restr_connective_in_field_constraint3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_label3971 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_label3978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_restr_connective_in_or_restr_connective3999 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_DOUBLE_PIPE_in_or_restr_connective4005 = new BitSet(new long[]{0x0000000000000000L,0x0000FE0001080000L});
    public static final BitSet FOLLOW_and_restr_connective_in_or_restr_connective4013 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_constraint_expression_in_and_restr_connective4028 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_DOUBLE_AMPER_in_and_restr_connective4034 = new BitSet(new long[]{0x0000000000000000L,0x0000FE0001080000L});
    public static final BitSet FOLLOW_constraint_expression_in_and_restr_connective4041 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_compound_operator_in_constraint_expression4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_operator_in_constraint_expression4068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_constraint_expression4073 = new BitSet(new long[]{0x0000000000000000L,0x0000FE0001080000L});
    public static final BitSet FOLLOW_or_restr_connective_in_constraint_expression4082 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_constraint_expression4087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_simple_operator4116 = new BitSet(new long[]{0x0000000000000000L,0x0003000181880000L});
    public static final BitSet FOLLOW_GREATER_in_simple_operator4124 = new BitSet(new long[]{0x0000000000000000L,0x0003000181880000L});
    public static final BitSet FOLLOW_GREATER_EQUAL_in_simple_operator4132 = new BitSet(new long[]{0x0000000000000000L,0x0003000181880000L});
    public static final BitSet FOLLOW_LESS_in_simple_operator4140 = new BitSet(new long[]{0x0000000000000000L,0x0003000181880000L});
    public static final BitSet FOLLOW_LESS_EQUAL_in_simple_operator4148 = new BitSet(new long[]{0x0000000000000000L,0x0003000181880000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_simple_operator4156 = new BitSet(new long[]{0x0000000000000000L,0x0003000181880000L});
    public static final BitSet FOLLOW_not_key_in_simple_operator4164 = new BitSet(new long[]{0x0000000000000000L,0x0000800000080000L});
    public static final BitSet FOLLOW_contains_key_in_simple_operator4171 = new BitSet(new long[]{0x0000000000000000L,0x0003000181880000L});
    public static final BitSet FOLLOW_soundslike_key_in_simple_operator4178 = new BitSet(new long[]{0x0000000000000000L,0x0003000181880000L});
    public static final BitSet FOLLOW_matches_key_in_simple_operator4185 = new BitSet(new long[]{0x0000000000000000L,0x0003000181880000L});
    public static final BitSet FOLLOW_memberof_key_in_simple_operator4192 = new BitSet(new long[]{0x0000000000000000L,0x0003000181880000L});
    public static final BitSet FOLLOW_ID_in_simple_operator4201 = new BitSet(new long[]{0x0000000000000000L,0x0003000181880000L});
    public static final BitSet FOLLOW_GRAVE_ACCENT_in_simple_operator4212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_simple_operator4220 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_square_chunk_in_simple_operator4226 = new BitSet(new long[]{0x0000000000000000L,0x0003000181880000L});
    public static final BitSet FOLLOW_contains_key_in_simple_operator4232 = new BitSet(new long[]{0x0000000000000000L,0x0003000181880000L});
    public static final BitSet FOLLOW_excludes_key_in_simple_operator4238 = new BitSet(new long[]{0x0000000000000000L,0x0003000181880000L});
    public static final BitSet FOLLOW_matches_key_in_simple_operator4244 = new BitSet(new long[]{0x0000000000000000L,0x0003000181880000L});
    public static final BitSet FOLLOW_soundslike_key_in_simple_operator4250 = new BitSet(new long[]{0x0000000000000000L,0x0003000181880000L});
    public static final BitSet FOLLOW_memberof_key_in_simple_operator4256 = new BitSet(new long[]{0x0000000000000000L,0x0003000181880000L});
    public static final BitSet FOLLOW_ID_in_simple_operator4264 = new BitSet(new long[]{0x0000000000000000L,0x0003000181880000L});
    public static final BitSet FOLLOW_GRAVE_ACCENT_in_simple_operator4274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_simple_operator4282 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_square_chunk_in_simple_operator4288 = new BitSet(new long[]{0x0000000000000000L,0x0003000181880000L});
    public static final BitSet FOLLOW_expression_value_in_simple_operator4295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_key_in_compound_operator4313 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_not_key_in_compound_operator4318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_in_key_in_compound_operator4320 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_compound_operator4331 = new BitSet(new long[]{0x0000000000000000L,0x0003000181880000L});
    public static final BitSet FOLLOW_expression_value_in_compound_operator4339 = new BitSet(new long[]{0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_COMMA_in_compound_operator4343 = new BitSet(new long[]{0x0000000000000000L,0x0003000181880000L});
    public static final BitSet FOLLOW_expression_value_in_compound_operator4348 = new BitSet(new long[]{0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_compound_operator4356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accessor_path_in_expression_value4377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_constraint_in_expression_value4382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paren_chunk_in_expression_value4388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal_constraint4407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal_constraint4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal_constraint4421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_literal_constraint4428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal_constraint4435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_pattern_type4450 = new BitSet(new long[]{0x0000000000000002L,0x0004000000100000L});
    public static final BitSet FOLLOW_DOT_in_pattern_type4456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_pattern_type4460 = new BitSet(new long[]{0x0000000000000002L,0x0004000000100000L});
    public static final BitSet FOLLOW_dimension_definition_in_pattern_type4475 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
    public static final BitSet FOLLOW_ID_in_data_type4503 = new BitSet(new long[]{0x0000000000000002L,0x0004000000100000L});
    public static final BitSet FOLLOW_DOT_in_data_type4509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_data_type4513 = new BitSet(new long[]{0x0000000000000002L,0x0004000000100000L});
    public static final BitSet FOLLOW_dimension_definition_in_data_type4518 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
    public static final BitSet FOLLOW_LEFT_SQUARE_in_dimension_definition4547 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_in_dimension_definition4554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accessor_element_in_accessor_path4568 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_accessor_path4572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_accessor_element_in_accessor_path4576 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_accessor_element4600 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
    public static final BitSet FOLLOW_square_chunk_in_accessor_element4606 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
    public static final BitSet FOLLOW_rhs_chunk_data_in_rhs_chunk4635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THEN_in_rhs_chunk_data4654 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000001L});
    public static final BitSet FOLLOW_set_in_rhs_chunk_data4667 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000001L});
    public static final BitSet FOLLOW_END_in_rhs_chunk_data4680 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_SEMICOLON_in_rhs_chunk_data4686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_curly_chunk_data_in_curly_chunk4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_CURLY_in_curly_chunk_data4728 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000001L});
    public static final BitSet FOLLOW_set_in_curly_chunk_data4740 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000001L});
    public static final BitSet FOLLOW_curly_chunk_data_in_curly_chunk_data4756 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000001L});
    public static final BitSet FOLLOW_RIGHT_CURLY_in_curly_chunk_data4767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paren_chunk_data_in_paren_chunk4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_paren_chunk_data4812 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000001L});
    public static final BitSet FOLLOW_set_in_paren_chunk_data4824 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000001L});
    public static final BitSet FOLLOW_paren_chunk_data_in_paren_chunk_data4840 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000001L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_paren_chunk_data4851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_square_chunk_data_in_square_chunk4872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_in_square_chunk_data4895 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000001L});
    public static final BitSet FOLLOW_set_in_square_chunk_data4907 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000001L});
    public static final BitSet FOLLOW_square_chunk_data_in_square_chunk_data4922 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000000001L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_in_square_chunk_data4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lock_on_active_key4957 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_MISC_in_lock_on_active_key4961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_lock_on_active_key4965 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_MISC_in_lock_on_active_key4969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_lock_on_active_key4973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_date_effective_key5005 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_MISC_in_date_effective_key5009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_date_effective_key5013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_date_expires_key5045 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_MISC_in_date_expires_key5049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_date_expires_key5053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_no_loop_key5085 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_MISC_in_no_loop_key5089 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_no_loop_key5093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_auto_focus_key5125 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_MISC_in_auto_focus_key5129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_auto_focus_key5133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_activation_group_key5165 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_MISC_in_activation_group_key5169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_activation_group_key5173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_agenda_group_key5205 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_MISC_in_agenda_group_key5209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_agenda_group_key5213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_ruleflow_group_key5245 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_MISC_in_ruleflow_group_key5249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_ruleflow_group_key5253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_entry_point_key5285 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_MISC_in_entry_point_key5289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_entry_point_key5293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_duration_key5322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_package_key5349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_import_key5376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_dialect_key5403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_salience_key5430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_enabled_key5457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_attributes_key5484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_rule_key5511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_template_key5538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_query_key5565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_declare_key5592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function_key5619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_global_key5646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_eval_key5673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_contains_key5700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_matches_key5727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_excludes_key5754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_soundslike_key5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_memberof_key5808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_not_key5835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_in_key5862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_or_key5889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_and_key5916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_exists_key5943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_forall_key5970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_action_key5997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_reverse_key6024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_result_key6051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_synpred12045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_or_key_in_synpred12047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_key_in_synpred22114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_PIPE_in_synpred22116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_synpred32173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_and_key_in_synpred32175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_key_in_synpred42243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_AMPER_in_synpred42245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_synpred52368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_synpred62405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_or_key_in_synpred62408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_key_in_synpred62410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_synpred72533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_or_key_in_synpred72536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_key_in_synpred72538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_synpred83367 = new BitSet(new long[]{0x0000000000000002L});

}