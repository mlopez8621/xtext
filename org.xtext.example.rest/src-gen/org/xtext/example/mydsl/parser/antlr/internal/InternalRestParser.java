package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.RestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRestParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IGUAL", "RULE_STRING", "RULE_PUNTOCOMA", "RULE_ID", "RULE_IGUALDAD", "RULE_INT", "RULE_PUNTO", "RULE_MAYOR", "RULE_MENOR", "RULE_MAYORIGUAL", "RULE_MENORIGUAL", "RULE_COMA", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'apiURL'", "'Test'", "'{'", "'service'", "'description'", "'}'", "'Assertions'", "'response.status'", "'response'", "'->'", "'parameter.'", "'Mapping'", "'['", "']'", "'parameter'", "'value'", "'request'", "'DELETE'", "'URL'", "'POST'", "'PUT'", "'GET'", "'Response'", "'Type'", "'[]'", "'Request'", "'?'", "'/'", "'/:{'", "'${'", "'Entity'", "'SimpleEntity'", "'('", "'PK'", "')'", "'mockType'", "'FirstNameType'", "'FirstNameMaleType'", "'LastNameType'", "'FamilyNameType'", "'FullNameType'", "'GenderType'", "'EmailAddressType'", "'PhoneType'", "'CountryType'", "'CityType'", "'CountryCodeType'", "'LatitudeType'", "'LongitudeType'", "'RowNumberType'", "'BooleanType'", "'FirstNameFemaleType'", "'string'", "'int'", "'boolean'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_IGUAL=4;
    public static final int RULE_INT=9;
    public static final int RULE_MENOR=12;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=16;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int RULE_COMA=15;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=17;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_MENORIGUAL=14;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=18;
    public static final int RULE_PUNTOCOMA=6;
    public static final int RULE_ANY_OTHER=19;
    public static final int RULE_MAYORIGUAL=13;
    public static final int RULE_PUNTO=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_IGUALDAD=8;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_MAYOR=11;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalRestParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRestParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRestParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRest.g"; }



     	private RestGrammarAccess grammarAccess;

        public InternalRestParser(TokenStream input, RestGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected RestGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalRest.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalRest.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalRest.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalRest.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'apiURL' this_IGUAL_1= RULE_IGUAL this_STRING_2= RULE_STRING this_PUNTOCOMA_3= RULE_PUNTOCOMA ( (lv_entidades_4_0= ruleEntidad ) )+ ( (lv_metodos_5_0= ruleMetodo ) )+ ( (lv_tests_6_0= ruleTest ) )+ ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_IGUAL_1=null;
        Token this_STRING_2=null;
        Token this_PUNTOCOMA_3=null;
        EObject lv_entidades_4_0 = null;

        EObject lv_metodos_5_0 = null;

        EObject lv_tests_6_0 = null;



        	enterRule();

        try {
            // InternalRest.g:77:2: ( (otherlv_0= 'apiURL' this_IGUAL_1= RULE_IGUAL this_STRING_2= RULE_STRING this_PUNTOCOMA_3= RULE_PUNTOCOMA ( (lv_entidades_4_0= ruleEntidad ) )+ ( (lv_metodos_5_0= ruleMetodo ) )+ ( (lv_tests_6_0= ruleTest ) )+ ) )
            // InternalRest.g:78:2: (otherlv_0= 'apiURL' this_IGUAL_1= RULE_IGUAL this_STRING_2= RULE_STRING this_PUNTOCOMA_3= RULE_PUNTOCOMA ( (lv_entidades_4_0= ruleEntidad ) )+ ( (lv_metodos_5_0= ruleMetodo ) )+ ( (lv_tests_6_0= ruleTest ) )+ )
            {
            // InternalRest.g:78:2: (otherlv_0= 'apiURL' this_IGUAL_1= RULE_IGUAL this_STRING_2= RULE_STRING this_PUNTOCOMA_3= RULE_PUNTOCOMA ( (lv_entidades_4_0= ruleEntidad ) )+ ( (lv_metodos_5_0= ruleMetodo ) )+ ( (lv_tests_6_0= ruleTest ) )+ )
            // InternalRest.g:79:3: otherlv_0= 'apiURL' this_IGUAL_1= RULE_IGUAL this_STRING_2= RULE_STRING this_PUNTOCOMA_3= RULE_PUNTOCOMA ( (lv_entidades_4_0= ruleEntidad ) )+ ( (lv_metodos_5_0= ruleMetodo ) )+ ( (lv_tests_6_0= ruleTest ) )+
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getApiURLKeyword_0());
            		
            this_IGUAL_1=(Token)match(input,RULE_IGUAL,FOLLOW_4); 

            			newLeafNode(this_IGUAL_1, grammarAccess.getModelAccess().getIGUALTerminalRuleCall_1());
            		
            this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_5); 

            			newLeafNode(this_STRING_2, grammarAccess.getModelAccess().getSTRINGTerminalRuleCall_2());
            		
            this_PUNTOCOMA_3=(Token)match(input,RULE_PUNTOCOMA,FOLLOW_6); 

            			newLeafNode(this_PUNTOCOMA_3, grammarAccess.getModelAccess().getPUNTOCOMATerminalRuleCall_3());
            		
            // InternalRest.g:95:3: ( (lv_entidades_4_0= ruleEntidad ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=50 && LA1_0<=51)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRest.g:96:4: (lv_entidades_4_0= ruleEntidad )
            	    {
            	    // InternalRest.g:96:4: (lv_entidades_4_0= ruleEntidad )
            	    // InternalRest.g:97:5: lv_entidades_4_0= ruleEntidad
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getEntidadesEntidadParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_entidades_4_0=ruleEntidad();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entidades",
            	    						lv_entidades_4_0,
            	    						"org.xtext.example.mydsl.Rest.Entidad");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalRest.g:114:3: ( (lv_metodos_5_0= ruleMetodo ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==37||(LA2_0>=39 && LA2_0<=41)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRest.g:115:4: (lv_metodos_5_0= ruleMetodo )
            	    {
            	    // InternalRest.g:115:4: (lv_metodos_5_0= ruleMetodo )
            	    // InternalRest.g:116:5: lv_metodos_5_0= ruleMetodo
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getMetodosMetodoParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_metodos_5_0=ruleMetodo();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"metodos",
            	    						lv_metodos_5_0,
            	    						"org.xtext.example.mydsl.Rest.Metodo");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // InternalRest.g:133:3: ( (lv_tests_6_0= ruleTest ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRest.g:134:4: (lv_tests_6_0= ruleTest )
            	    {
            	    // InternalRest.g:134:4: (lv_tests_6_0= ruleTest )
            	    // InternalRest.g:135:5: lv_tests_6_0= ruleTest
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getTestsTestParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_tests_6_0=ruleTest();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tests",
            	    						lv_tests_6_0,
            	    						"org.xtext.example.mydsl.Rest.Test");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTest"
    // InternalRest.g:156:1: entryRuleTest returns [EObject current=null] : iv_ruleTest= ruleTest EOF ;
    public final EObject entryRuleTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest = null;


        try {
            // InternalRest.g:156:45: (iv_ruleTest= ruleTest EOF )
            // InternalRest.g:157:2: iv_ruleTest= ruleTest EOF
            {
             newCompositeNode(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTest=ruleTest();

            state._fsp--;

             current =iv_ruleTest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalRest.g:163:1: ruleTest returns [EObject current=null] : ( () otherlv_1= 'Test' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'service' this_IGUAL_5= RULE_IGUAL ( (otherlv_6= RULE_ID ) ) this_PUNTOCOMA_7= RULE_PUNTOCOMA otherlv_8= 'description' this_IGUAL_9= RULE_IGUAL this_STRING_10= RULE_STRING this_PUNTOCOMA_11= RULE_PUNTOCOMA ( (lv_mapping_12_0= ruleMapping ) )? ( (lv_assertion_13_0= ruleAssertion ) ) otherlv_14= '}' ) ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_IGUAL_5=null;
        Token otherlv_6=null;
        Token this_PUNTOCOMA_7=null;
        Token otherlv_8=null;
        Token this_IGUAL_9=null;
        Token this_STRING_10=null;
        Token this_PUNTOCOMA_11=null;
        Token otherlv_14=null;
        EObject lv_mapping_12_0 = null;

        EObject lv_assertion_13_0 = null;



        	enterRule();

        try {
            // InternalRest.g:169:2: ( ( () otherlv_1= 'Test' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'service' this_IGUAL_5= RULE_IGUAL ( (otherlv_6= RULE_ID ) ) this_PUNTOCOMA_7= RULE_PUNTOCOMA otherlv_8= 'description' this_IGUAL_9= RULE_IGUAL this_STRING_10= RULE_STRING this_PUNTOCOMA_11= RULE_PUNTOCOMA ( (lv_mapping_12_0= ruleMapping ) )? ( (lv_assertion_13_0= ruleAssertion ) ) otherlv_14= '}' ) )
            // InternalRest.g:170:2: ( () otherlv_1= 'Test' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'service' this_IGUAL_5= RULE_IGUAL ( (otherlv_6= RULE_ID ) ) this_PUNTOCOMA_7= RULE_PUNTOCOMA otherlv_8= 'description' this_IGUAL_9= RULE_IGUAL this_STRING_10= RULE_STRING this_PUNTOCOMA_11= RULE_PUNTOCOMA ( (lv_mapping_12_0= ruleMapping ) )? ( (lv_assertion_13_0= ruleAssertion ) ) otherlv_14= '}' )
            {
            // InternalRest.g:170:2: ( () otherlv_1= 'Test' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'service' this_IGUAL_5= RULE_IGUAL ( (otherlv_6= RULE_ID ) ) this_PUNTOCOMA_7= RULE_PUNTOCOMA otherlv_8= 'description' this_IGUAL_9= RULE_IGUAL this_STRING_10= RULE_STRING this_PUNTOCOMA_11= RULE_PUNTOCOMA ( (lv_mapping_12_0= ruleMapping ) )? ( (lv_assertion_13_0= ruleAssertion ) ) otherlv_14= '}' )
            // InternalRest.g:171:3: () otherlv_1= 'Test' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'service' this_IGUAL_5= RULE_IGUAL ( (otherlv_6= RULE_ID ) ) this_PUNTOCOMA_7= RULE_PUNTOCOMA otherlv_8= 'description' this_IGUAL_9= RULE_IGUAL this_STRING_10= RULE_STRING this_PUNTOCOMA_11= RULE_PUNTOCOMA ( (lv_mapping_12_0= ruleMapping ) )? ( (lv_assertion_13_0= ruleAssertion ) ) otherlv_14= '}'
            {
            // InternalRest.g:171:3: ()
            // InternalRest.g:172:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTestAccess().getTestAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getTestAccess().getTestKeyword_1());
            		
            // InternalRest.g:182:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRest.g:183:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRest.g:183:4: (lv_name_2_0= RULE_ID )
            // InternalRest.g:184:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTestAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getTestAccess().getServiceKeyword_4());
            		
            this_IGUAL_5=(Token)match(input,RULE_IGUAL,FOLLOW_10); 

            			newLeafNode(this_IGUAL_5, grammarAccess.getTestAccess().getIGUALTerminalRuleCall_5());
            		
            // InternalRest.g:212:3: ( (otherlv_6= RULE_ID ) )
            // InternalRest.g:213:4: (otherlv_6= RULE_ID )
            {
            // InternalRest.g:213:4: (otherlv_6= RULE_ID )
            // InternalRest.g:214:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_6, grammarAccess.getTestAccess().getServiceMetodoCrossReference_6_0());
            				

            }


            }

            this_PUNTOCOMA_7=(Token)match(input,RULE_PUNTOCOMA,FOLLOW_13); 

            			newLeafNode(this_PUNTOCOMA_7, grammarAccess.getTestAccess().getPUNTOCOMATerminalRuleCall_7());
            		
            otherlv_8=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getTestAccess().getDescriptionKeyword_8());
            		
            this_IGUAL_9=(Token)match(input,RULE_IGUAL,FOLLOW_4); 

            			newLeafNode(this_IGUAL_9, grammarAccess.getTestAccess().getIGUALTerminalRuleCall_9());
            		
            this_STRING_10=(Token)match(input,RULE_STRING,FOLLOW_5); 

            			newLeafNode(this_STRING_10, grammarAccess.getTestAccess().getSTRINGTerminalRuleCall_10());
            		
            this_PUNTOCOMA_11=(Token)match(input,RULE_PUNTOCOMA,FOLLOW_14); 

            			newLeafNode(this_PUNTOCOMA_11, grammarAccess.getTestAccess().getPUNTOCOMATerminalRuleCall_11());
            		
            // InternalRest.g:245:3: ( (lv_mapping_12_0= ruleMapping ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==31) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRest.g:246:4: (lv_mapping_12_0= ruleMapping )
                    {
                    // InternalRest.g:246:4: (lv_mapping_12_0= ruleMapping )
                    // InternalRest.g:247:5: lv_mapping_12_0= ruleMapping
                    {

                    					newCompositeNode(grammarAccess.getTestAccess().getMappingMappingParserRuleCall_12_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_mapping_12_0=ruleMapping();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTestRule());
                    					}
                    					set(
                    						current,
                    						"mapping",
                    						lv_mapping_12_0,
                    						"org.xtext.example.mydsl.Rest.Mapping");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalRest.g:264:3: ( (lv_assertion_13_0= ruleAssertion ) )
            // InternalRest.g:265:4: (lv_assertion_13_0= ruleAssertion )
            {
            // InternalRest.g:265:4: (lv_assertion_13_0= ruleAssertion )
            // InternalRest.g:266:5: lv_assertion_13_0= ruleAssertion
            {

            					newCompositeNode(grammarAccess.getTestAccess().getAssertionAssertionParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_15);
            lv_assertion_13_0=ruleAssertion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestRule());
            					}
            					set(
            						current,
            						"assertion",
            						lv_assertion_13_0,
            						"org.xtext.example.mydsl.Rest.Assertion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getTestAccess().getRightCurlyBracketKeyword_14());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleAssertion"
    // InternalRest.g:291:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // InternalRest.g:291:50: (iv_ruleAssertion= ruleAssertion EOF )
            // InternalRest.g:292:2: iv_ruleAssertion= ruleAssertion EOF
            {
             newCompositeNode(grammarAccess.getAssertionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssertion=ruleAssertion();

            state._fsp--;

             current =iv_ruleAssertion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssertion"


    // $ANTLR start "ruleAssertion"
    // InternalRest.g:298:1: ruleAssertion returns [EObject current=null] : ( () otherlv_1= 'Assertions' otherlv_2= '{' otherlv_3= 'response.status' this_IGUALDAD_4= RULE_IGUALDAD this_INT_5= RULE_INT this_PUNTOCOMA_6= RULE_PUNTOCOMA ( (lv_assertResponse_7_0= ruleAssertResponse ) )* otherlv_8= '}' ) ;
    public final EObject ruleAssertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_IGUALDAD_4=null;
        Token this_INT_5=null;
        Token this_PUNTOCOMA_6=null;
        Token otherlv_8=null;
        EObject lv_assertResponse_7_0 = null;



        	enterRule();

        try {
            // InternalRest.g:304:2: ( ( () otherlv_1= 'Assertions' otherlv_2= '{' otherlv_3= 'response.status' this_IGUALDAD_4= RULE_IGUALDAD this_INT_5= RULE_INT this_PUNTOCOMA_6= RULE_PUNTOCOMA ( (lv_assertResponse_7_0= ruleAssertResponse ) )* otherlv_8= '}' ) )
            // InternalRest.g:305:2: ( () otherlv_1= 'Assertions' otherlv_2= '{' otherlv_3= 'response.status' this_IGUALDAD_4= RULE_IGUALDAD this_INT_5= RULE_INT this_PUNTOCOMA_6= RULE_PUNTOCOMA ( (lv_assertResponse_7_0= ruleAssertResponse ) )* otherlv_8= '}' )
            {
            // InternalRest.g:305:2: ( () otherlv_1= 'Assertions' otherlv_2= '{' otherlv_3= 'response.status' this_IGUALDAD_4= RULE_IGUALDAD this_INT_5= RULE_INT this_PUNTOCOMA_6= RULE_PUNTOCOMA ( (lv_assertResponse_7_0= ruleAssertResponse ) )* otherlv_8= '}' )
            // InternalRest.g:306:3: () otherlv_1= 'Assertions' otherlv_2= '{' otherlv_3= 'response.status' this_IGUALDAD_4= RULE_IGUALDAD this_INT_5= RULE_INT this_PUNTOCOMA_6= RULE_PUNTOCOMA ( (lv_assertResponse_7_0= ruleAssertResponse ) )* otherlv_8= '}'
            {
            // InternalRest.g:306:3: ()
            // InternalRest.g:307:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAssertionAccess().getAssertionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getAssertionAccess().getAssertionsKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getAssertionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getAssertionAccess().getResponseStatusKeyword_3());
            		
            this_IGUALDAD_4=(Token)match(input,RULE_IGUALDAD,FOLLOW_18); 

            			newLeafNode(this_IGUALDAD_4, grammarAccess.getAssertionAccess().getIGUALDADTerminalRuleCall_4());
            		
            this_INT_5=(Token)match(input,RULE_INT,FOLLOW_5); 

            			newLeafNode(this_INT_5, grammarAccess.getAssertionAccess().getINTTerminalRuleCall_5());
            		
            this_PUNTOCOMA_6=(Token)match(input,RULE_PUNTOCOMA,FOLLOW_19); 

            			newLeafNode(this_PUNTOCOMA_6, grammarAccess.getAssertionAccess().getPUNTOCOMATerminalRuleCall_6());
            		
            // InternalRest.g:337:3: ( (lv_assertResponse_7_0= ruleAssertResponse ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==28) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRest.g:338:4: (lv_assertResponse_7_0= ruleAssertResponse )
            	    {
            	    // InternalRest.g:338:4: (lv_assertResponse_7_0= ruleAssertResponse )
            	    // InternalRest.g:339:5: lv_assertResponse_7_0= ruleAssertResponse
            	    {

            	    					newCompositeNode(grammarAccess.getAssertionAccess().getAssertResponseAssertResponseParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_assertResponse_7_0=ruleAssertResponse();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAssertionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"assertResponse",
            	    						lv_assertResponse_7_0,
            	    						"org.xtext.example.mydsl.Rest.AssertResponse");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_8=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAssertionAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssertion"


    // $ANTLR start "entryRuleAssertResponse"
    // InternalRest.g:364:1: entryRuleAssertResponse returns [EObject current=null] : iv_ruleAssertResponse= ruleAssertResponse EOF ;
    public final EObject entryRuleAssertResponse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertResponse = null;


        try {
            // InternalRest.g:364:55: (iv_ruleAssertResponse= ruleAssertResponse EOF )
            // InternalRest.g:365:2: iv_ruleAssertResponse= ruleAssertResponse EOF
            {
             newCompositeNode(grammarAccess.getAssertResponseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssertResponse=ruleAssertResponse();

            state._fsp--;

             current =iv_ruleAssertResponse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssertResponse"


    // $ANTLR start "ruleAssertResponse"
    // InternalRest.g:371:1: ruleAssertResponse returns [EObject current=null] : ( () otherlv_1= 'response' ( ( ruleComparador (this_INT_3= RULE_INT | this_STRING_4= RULE_STRING ) ) | (otherlv_5= '->' ( (lv_comparacion_6_0= ruleComparacion ) ) ) ) this_PUNTOCOMA_7= RULE_PUNTOCOMA ) ;
    public final EObject ruleAssertResponse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INT_3=null;
        Token this_STRING_4=null;
        Token otherlv_5=null;
        Token this_PUNTOCOMA_7=null;
        EObject lv_comparacion_6_0 = null;



        	enterRule();

        try {
            // InternalRest.g:377:2: ( ( () otherlv_1= 'response' ( ( ruleComparador (this_INT_3= RULE_INT | this_STRING_4= RULE_STRING ) ) | (otherlv_5= '->' ( (lv_comparacion_6_0= ruleComparacion ) ) ) ) this_PUNTOCOMA_7= RULE_PUNTOCOMA ) )
            // InternalRest.g:378:2: ( () otherlv_1= 'response' ( ( ruleComparador (this_INT_3= RULE_INT | this_STRING_4= RULE_STRING ) ) | (otherlv_5= '->' ( (lv_comparacion_6_0= ruleComparacion ) ) ) ) this_PUNTOCOMA_7= RULE_PUNTOCOMA )
            {
            // InternalRest.g:378:2: ( () otherlv_1= 'response' ( ( ruleComparador (this_INT_3= RULE_INT | this_STRING_4= RULE_STRING ) ) | (otherlv_5= '->' ( (lv_comparacion_6_0= ruleComparacion ) ) ) ) this_PUNTOCOMA_7= RULE_PUNTOCOMA )
            // InternalRest.g:379:3: () otherlv_1= 'response' ( ( ruleComparador (this_INT_3= RULE_INT | this_STRING_4= RULE_STRING ) ) | (otherlv_5= '->' ( (lv_comparacion_6_0= ruleComparacion ) ) ) ) this_PUNTOCOMA_7= RULE_PUNTOCOMA
            {
            // InternalRest.g:379:3: ()
            // InternalRest.g:380:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAssertResponseAccess().getAssertResponseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getAssertResponseAccess().getResponseKeyword_1());
            		
            // InternalRest.g:390:3: ( ( ruleComparador (this_INT_3= RULE_INT | this_STRING_4= RULE_STRING ) ) | (otherlv_5= '->' ( (lv_comparacion_6_0= ruleComparacion ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_IGUALDAD||(LA7_0>=RULE_MAYOR && LA7_0<=RULE_MENORIGUAL)) ) {
                alt7=1;
            }
            else if ( (LA7_0==29) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRest.g:391:4: ( ruleComparador (this_INT_3= RULE_INT | this_STRING_4= RULE_STRING ) )
                    {
                    // InternalRest.g:391:4: ( ruleComparador (this_INT_3= RULE_INT | this_STRING_4= RULE_STRING ) )
                    // InternalRest.g:392:5: ruleComparador (this_INT_3= RULE_INT | this_STRING_4= RULE_STRING )
                    {

                    					newCompositeNode(grammarAccess.getAssertResponseAccess().getComparadorParserRuleCall_2_0_0());
                    				
                    pushFollow(FOLLOW_21);
                    ruleComparador();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    // InternalRest.g:399:5: (this_INT_3= RULE_INT | this_STRING_4= RULE_STRING )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_INT) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==RULE_STRING) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalRest.g:400:6: this_INT_3= RULE_INT
                            {
                            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_5); 

                            						newLeafNode(this_INT_3, grammarAccess.getAssertResponseAccess().getINTTerminalRuleCall_2_0_1_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalRest.g:405:6: this_STRING_4= RULE_STRING
                            {
                            this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_5); 

                            						newLeafNode(this_STRING_4, grammarAccess.getAssertResponseAccess().getSTRINGTerminalRuleCall_2_0_1_1());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRest.g:412:4: (otherlv_5= '->' ( (lv_comparacion_6_0= ruleComparacion ) ) )
                    {
                    // InternalRest.g:412:4: (otherlv_5= '->' ( (lv_comparacion_6_0= ruleComparacion ) ) )
                    // InternalRest.g:413:5: otherlv_5= '->' ( (lv_comparacion_6_0= ruleComparacion ) )
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_10); 

                    					newLeafNode(otherlv_5, grammarAccess.getAssertResponseAccess().getHyphenMinusGreaterThanSignKeyword_2_1_0());
                    				
                    // InternalRest.g:417:5: ( (lv_comparacion_6_0= ruleComparacion ) )
                    // InternalRest.g:418:6: (lv_comparacion_6_0= ruleComparacion )
                    {
                    // InternalRest.g:418:6: (lv_comparacion_6_0= ruleComparacion )
                    // InternalRest.g:419:7: lv_comparacion_6_0= ruleComparacion
                    {

                    							newCompositeNode(grammarAccess.getAssertResponseAccess().getComparacionComparacionParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_5);
                    lv_comparacion_6_0=ruleComparacion();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssertResponseRule());
                    							}
                    							set(
                    								current,
                    								"comparacion",
                    								lv_comparacion_6_0,
                    								"org.xtext.example.mydsl.Rest.Comparacion");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            this_PUNTOCOMA_7=(Token)match(input,RULE_PUNTOCOMA,FOLLOW_2); 

            			newLeafNode(this_PUNTOCOMA_7, grammarAccess.getAssertResponseAccess().getPUNTOCOMATerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssertResponse"


    // $ANTLR start "entryRuleComparacion"
    // InternalRest.g:446:1: entryRuleComparacion returns [EObject current=null] : iv_ruleComparacion= ruleComparacion EOF ;
    public final EObject entryRuleComparacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparacion = null;


        try {
            // InternalRest.g:446:52: (iv_ruleComparacion= ruleComparacion EOF )
            // InternalRest.g:447:2: iv_ruleComparacion= ruleComparacion EOF
            {
             newCompositeNode(grammarAccess.getComparacionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparacion=ruleComparacion();

            state._fsp--;

             current =iv_ruleComparacion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparacion"


    // $ANTLR start "ruleComparacion"
    // InternalRest.g:453:1: ruleComparacion returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) this_PUNTO_2= RULE_PUNTO ( (otherlv_3= RULE_ID ) ) ruleComparador (this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | (otherlv_7= 'parameter.' ( (otherlv_8= RULE_ID ) ) this_PUNTO_9= RULE_PUNTO ( (otherlv_10= RULE_ID ) ) ) ) ) ;
    public final EObject ruleComparacion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_PUNTO_2=null;
        Token otherlv_3=null;
        Token this_INT_5=null;
        Token this_STRING_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token this_PUNTO_9=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalRest.g:459:2: ( ( () ( (otherlv_1= RULE_ID ) ) this_PUNTO_2= RULE_PUNTO ( (otherlv_3= RULE_ID ) ) ruleComparador (this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | (otherlv_7= 'parameter.' ( (otherlv_8= RULE_ID ) ) this_PUNTO_9= RULE_PUNTO ( (otherlv_10= RULE_ID ) ) ) ) ) )
            // InternalRest.g:460:2: ( () ( (otherlv_1= RULE_ID ) ) this_PUNTO_2= RULE_PUNTO ( (otherlv_3= RULE_ID ) ) ruleComparador (this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | (otherlv_7= 'parameter.' ( (otherlv_8= RULE_ID ) ) this_PUNTO_9= RULE_PUNTO ( (otherlv_10= RULE_ID ) ) ) ) )
            {
            // InternalRest.g:460:2: ( () ( (otherlv_1= RULE_ID ) ) this_PUNTO_2= RULE_PUNTO ( (otherlv_3= RULE_ID ) ) ruleComparador (this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | (otherlv_7= 'parameter.' ( (otherlv_8= RULE_ID ) ) this_PUNTO_9= RULE_PUNTO ( (otherlv_10= RULE_ID ) ) ) ) )
            // InternalRest.g:461:3: () ( (otherlv_1= RULE_ID ) ) this_PUNTO_2= RULE_PUNTO ( (otherlv_3= RULE_ID ) ) ruleComparador (this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | (otherlv_7= 'parameter.' ( (otherlv_8= RULE_ID ) ) this_PUNTO_9= RULE_PUNTO ( (otherlv_10= RULE_ID ) ) ) )
            {
            // InternalRest.g:461:3: ()
            // InternalRest.g:462:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComparacionAccess().getComparacionAction_0(),
            					current);
            			

            }

            // InternalRest.g:468:3: ( (otherlv_1= RULE_ID ) )
            // InternalRest.g:469:4: (otherlv_1= RULE_ID )
            {
            // InternalRest.g:469:4: (otherlv_1= RULE_ID )
            // InternalRest.g:470:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComparacionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_1, grammarAccess.getComparacionAccess().getEntidadEntidadCrossReference_1_0());
            				

            }


            }

            this_PUNTO_2=(Token)match(input,RULE_PUNTO,FOLLOW_10); 

            			newLeafNode(this_PUNTO_2, grammarAccess.getComparacionAccess().getPUNTOTerminalRuleCall_2());
            		
            // InternalRest.g:485:3: ( (otherlv_3= RULE_ID ) )
            // InternalRest.g:486:4: (otherlv_3= RULE_ID )
            {
            // InternalRest.g:486:4: (otherlv_3= RULE_ID )
            // InternalRest.g:487:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComparacionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_3, grammarAccess.getComparacionAccess().getAtributoAtributoCrossReference_3_0());
            				

            }


            }


            			newCompositeNode(grammarAccess.getComparacionAccess().getComparadorParserRuleCall_4());
            		
            pushFollow(FOLLOW_24);
            ruleComparador();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalRest.g:505:3: (this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | (otherlv_7= 'parameter.' ( (otherlv_8= RULE_ID ) ) this_PUNTO_9= RULE_PUNTO ( (otherlv_10= RULE_ID ) ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt8=1;
                }
                break;
            case RULE_STRING:
                {
                alt8=2;
                }
                break;
            case 30:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalRest.g:506:4: this_INT_5= RULE_INT
                    {
                    this_INT_5=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				newLeafNode(this_INT_5, grammarAccess.getComparacionAccess().getINTTerminalRuleCall_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalRest.g:511:4: this_STRING_6= RULE_STRING
                    {
                    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    				newLeafNode(this_STRING_6, grammarAccess.getComparacionAccess().getSTRINGTerminalRuleCall_5_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalRest.g:516:4: (otherlv_7= 'parameter.' ( (otherlv_8= RULE_ID ) ) this_PUNTO_9= RULE_PUNTO ( (otherlv_10= RULE_ID ) ) )
                    {
                    // InternalRest.g:516:4: (otherlv_7= 'parameter.' ( (otherlv_8= RULE_ID ) ) this_PUNTO_9= RULE_PUNTO ( (otherlv_10= RULE_ID ) ) )
                    // InternalRest.g:517:5: otherlv_7= 'parameter.' ( (otherlv_8= RULE_ID ) ) this_PUNTO_9= RULE_PUNTO ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,30,FOLLOW_10); 

                    					newLeafNode(otherlv_7, grammarAccess.getComparacionAccess().getParameterKeyword_5_2_0());
                    				
                    // InternalRest.g:521:5: ( (otherlv_8= RULE_ID ) )
                    // InternalRest.g:522:6: (otherlv_8= RULE_ID )
                    {
                    // InternalRest.g:522:6: (otherlv_8= RULE_ID )
                    // InternalRest.g:523:7: otherlv_8= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getComparacionRule());
                    							}
                    						
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_22); 

                    							newLeafNode(otherlv_8, grammarAccess.getComparacionAccess().getMetodoMetodoCrossReference_5_2_1_0());
                    						

                    }


                    }

                    this_PUNTO_9=(Token)match(input,RULE_PUNTO,FOLLOW_10); 

                    					newLeafNode(this_PUNTO_9, grammarAccess.getComparacionAccess().getPUNTOTerminalRuleCall_5_2_2());
                    				
                    // InternalRest.g:538:5: ( (otherlv_10= RULE_ID ) )
                    // InternalRest.g:539:6: (otherlv_10= RULE_ID )
                    {
                    // InternalRest.g:539:6: (otherlv_10= RULE_ID )
                    // InternalRest.g:540:7: otherlv_10= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getComparacionRule());
                    							}
                    						
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_2); 

                    							newLeafNode(otherlv_10, grammarAccess.getComparacionAccess().getParamPathParamCrossReference_5_2_3_0());
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparacion"


    // $ANTLR start "entryRuleComparador"
    // InternalRest.g:557:1: entryRuleComparador returns [String current=null] : iv_ruleComparador= ruleComparador EOF ;
    public final String entryRuleComparador() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComparador = null;


        try {
            // InternalRest.g:557:50: (iv_ruleComparador= ruleComparador EOF )
            // InternalRest.g:558:2: iv_ruleComparador= ruleComparador EOF
            {
             newCompositeNode(grammarAccess.getComparadorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparador=ruleComparador();

            state._fsp--;

             current =iv_ruleComparador.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparador"


    // $ANTLR start "ruleComparador"
    // InternalRest.g:564:1: ruleComparador returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IGUALDAD_0= RULE_IGUALDAD | this_MAYOR_1= RULE_MAYOR | this_MENOR_2= RULE_MENOR | this_MAYORIGUAL_3= RULE_MAYORIGUAL | this_MENORIGUAL_4= RULE_MENORIGUAL ) ;
    public final AntlrDatatypeRuleToken ruleComparador() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IGUALDAD_0=null;
        Token this_MAYOR_1=null;
        Token this_MENOR_2=null;
        Token this_MAYORIGUAL_3=null;
        Token this_MENORIGUAL_4=null;


        	enterRule();

        try {
            // InternalRest.g:570:2: ( (this_IGUALDAD_0= RULE_IGUALDAD | this_MAYOR_1= RULE_MAYOR | this_MENOR_2= RULE_MENOR | this_MAYORIGUAL_3= RULE_MAYORIGUAL | this_MENORIGUAL_4= RULE_MENORIGUAL ) )
            // InternalRest.g:571:2: (this_IGUALDAD_0= RULE_IGUALDAD | this_MAYOR_1= RULE_MAYOR | this_MENOR_2= RULE_MENOR | this_MAYORIGUAL_3= RULE_MAYORIGUAL | this_MENORIGUAL_4= RULE_MENORIGUAL )
            {
            // InternalRest.g:571:2: (this_IGUALDAD_0= RULE_IGUALDAD | this_MAYOR_1= RULE_MAYOR | this_MENOR_2= RULE_MENOR | this_MAYORIGUAL_3= RULE_MAYORIGUAL | this_MENORIGUAL_4= RULE_MENORIGUAL )
            int alt9=5;
            switch ( input.LA(1) ) {
            case RULE_IGUALDAD:
                {
                alt9=1;
                }
                break;
            case RULE_MAYOR:
                {
                alt9=2;
                }
                break;
            case RULE_MENOR:
                {
                alt9=3;
                }
                break;
            case RULE_MAYORIGUAL:
                {
                alt9=4;
                }
                break;
            case RULE_MENORIGUAL:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalRest.g:572:3: this_IGUALDAD_0= RULE_IGUALDAD
                    {
                    this_IGUALDAD_0=(Token)match(input,RULE_IGUALDAD,FOLLOW_2); 

                    			current.merge(this_IGUALDAD_0);
                    		

                    			newLeafNode(this_IGUALDAD_0, grammarAccess.getComparadorAccess().getIGUALDADTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRest.g:580:3: this_MAYOR_1= RULE_MAYOR
                    {
                    this_MAYOR_1=(Token)match(input,RULE_MAYOR,FOLLOW_2); 

                    			current.merge(this_MAYOR_1);
                    		

                    			newLeafNode(this_MAYOR_1, grammarAccess.getComparadorAccess().getMAYORTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRest.g:588:3: this_MENOR_2= RULE_MENOR
                    {
                    this_MENOR_2=(Token)match(input,RULE_MENOR,FOLLOW_2); 

                    			current.merge(this_MENOR_2);
                    		

                    			newLeafNode(this_MENOR_2, grammarAccess.getComparadorAccess().getMENORTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalRest.g:596:3: this_MAYORIGUAL_3= RULE_MAYORIGUAL
                    {
                    this_MAYORIGUAL_3=(Token)match(input,RULE_MAYORIGUAL,FOLLOW_2); 

                    			current.merge(this_MAYORIGUAL_3);
                    		

                    			newLeafNode(this_MAYORIGUAL_3, grammarAccess.getComparadorAccess().getMAYORIGUALTerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalRest.g:604:3: this_MENORIGUAL_4= RULE_MENORIGUAL
                    {
                    this_MENORIGUAL_4=(Token)match(input,RULE_MENORIGUAL,FOLLOW_2); 

                    			current.merge(this_MENORIGUAL_4);
                    		

                    			newLeafNode(this_MENORIGUAL_4, grammarAccess.getComparadorAccess().getMENORIGUALTerminalRuleCall_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparador"


    // $ANTLR start "entryRuleMapping"
    // InternalRest.g:615:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalRest.g:615:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalRest.g:616:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalRest.g:622:1: ruleMapping returns [EObject current=null] : ( () otherlv_1= 'Mapping' otherlv_2= '[' ( (lv_maps_3_0= ruleMap ) )+ otherlv_4= ']' ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_maps_3_0 = null;



        	enterRule();

        try {
            // InternalRest.g:628:2: ( ( () otherlv_1= 'Mapping' otherlv_2= '[' ( (lv_maps_3_0= ruleMap ) )+ otherlv_4= ']' ) )
            // InternalRest.g:629:2: ( () otherlv_1= 'Mapping' otherlv_2= '[' ( (lv_maps_3_0= ruleMap ) )+ otherlv_4= ']' )
            {
            // InternalRest.g:629:2: ( () otherlv_1= 'Mapping' otherlv_2= '[' ( (lv_maps_3_0= ruleMap ) )+ otherlv_4= ']' )
            // InternalRest.g:630:3: () otherlv_1= 'Mapping' otherlv_2= '[' ( (lv_maps_3_0= ruleMap ) )+ otherlv_4= ']'
            {
            // InternalRest.g:630:3: ()
            // InternalRest.g:631:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMappingAccess().getMappingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getMappingKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getMappingAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalRest.g:645:3: ( (lv_maps_3_0= ruleMap ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRest.g:646:4: (lv_maps_3_0= ruleMap )
            	    {
            	    // InternalRest.g:646:4: (lv_maps_3_0= ruleMap )
            	    // InternalRest.g:647:5: lv_maps_3_0= ruleMap
            	    {

            	    					newCompositeNode(grammarAccess.getMappingAccess().getMapsMapParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_maps_3_0=ruleMap();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMappingRule());
            	    					}
            	    					add(
            	    						current,
            	    						"maps",
            	    						lv_maps_3_0,
            	    						"org.xtext.example.mydsl.Rest.Map");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_4=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMappingAccess().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleMap"
    // InternalRest.g:672:1: entryRuleMap returns [EObject current=null] : iv_ruleMap= ruleMap EOF ;
    public final EObject entryRuleMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMap = null;


        try {
            // InternalRest.g:672:44: (iv_ruleMap= ruleMap EOF )
            // InternalRest.g:673:2: iv_ruleMap= ruleMap EOF
            {
             newCompositeNode(grammarAccess.getMapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMap=ruleMap();

            state._fsp--;

             current =iv_ruleMap; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMap"


    // $ANTLR start "ruleMap"
    // InternalRest.g:679:1: ruleMap returns [EObject current=null] : ( () otherlv_1= '{' otherlv_2= 'parameter' this_IGUAL_3= RULE_IGUAL ( (lv_name_4_0= ruleMapName ) ) this_COMA_5= RULE_COMA otherlv_6= 'value' this_IGUAL_7= RULE_IGUAL (this_STRING_8= RULE_STRING | this_INT_9= RULE_INT | (otherlv_10= 'request' otherlv_11= '->' ( (otherlv_12= RULE_ID ) ) this_PUNTO_13= RULE_PUNTO ( (otherlv_14= RULE_ID ) ) ) ) otherlv_15= '}' ) ;
    public final EObject ruleMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_IGUAL_3=null;
        Token this_COMA_5=null;
        Token otherlv_6=null;
        Token this_IGUAL_7=null;
        Token this_STRING_8=null;
        Token this_INT_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token this_PUNTO_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalRest.g:685:2: ( ( () otherlv_1= '{' otherlv_2= 'parameter' this_IGUAL_3= RULE_IGUAL ( (lv_name_4_0= ruleMapName ) ) this_COMA_5= RULE_COMA otherlv_6= 'value' this_IGUAL_7= RULE_IGUAL (this_STRING_8= RULE_STRING | this_INT_9= RULE_INT | (otherlv_10= 'request' otherlv_11= '->' ( (otherlv_12= RULE_ID ) ) this_PUNTO_13= RULE_PUNTO ( (otherlv_14= RULE_ID ) ) ) ) otherlv_15= '}' ) )
            // InternalRest.g:686:2: ( () otherlv_1= '{' otherlv_2= 'parameter' this_IGUAL_3= RULE_IGUAL ( (lv_name_4_0= ruleMapName ) ) this_COMA_5= RULE_COMA otherlv_6= 'value' this_IGUAL_7= RULE_IGUAL (this_STRING_8= RULE_STRING | this_INT_9= RULE_INT | (otherlv_10= 'request' otherlv_11= '->' ( (otherlv_12= RULE_ID ) ) this_PUNTO_13= RULE_PUNTO ( (otherlv_14= RULE_ID ) ) ) ) otherlv_15= '}' )
            {
            // InternalRest.g:686:2: ( () otherlv_1= '{' otherlv_2= 'parameter' this_IGUAL_3= RULE_IGUAL ( (lv_name_4_0= ruleMapName ) ) this_COMA_5= RULE_COMA otherlv_6= 'value' this_IGUAL_7= RULE_IGUAL (this_STRING_8= RULE_STRING | this_INT_9= RULE_INT | (otherlv_10= 'request' otherlv_11= '->' ( (otherlv_12= RULE_ID ) ) this_PUNTO_13= RULE_PUNTO ( (otherlv_14= RULE_ID ) ) ) ) otherlv_15= '}' )
            // InternalRest.g:687:3: () otherlv_1= '{' otherlv_2= 'parameter' this_IGUAL_3= RULE_IGUAL ( (lv_name_4_0= ruleMapName ) ) this_COMA_5= RULE_COMA otherlv_6= 'value' this_IGUAL_7= RULE_IGUAL (this_STRING_8= RULE_STRING | this_INT_9= RULE_INT | (otherlv_10= 'request' otherlv_11= '->' ( (otherlv_12= RULE_ID ) ) this_PUNTO_13= RULE_PUNTO ( (otherlv_14= RULE_ID ) ) ) ) otherlv_15= '}'
            {
            // InternalRest.g:687:3: ()
            // InternalRest.g:688:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMapAccess().getMapAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getMapAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getMapAccess().getParameterKeyword_2());
            		
            this_IGUAL_3=(Token)match(input,RULE_IGUAL,FOLLOW_10); 

            			newLeafNode(this_IGUAL_3, grammarAccess.getMapAccess().getIGUALTerminalRuleCall_3());
            		
            // InternalRest.g:706:3: ( (lv_name_4_0= ruleMapName ) )
            // InternalRest.g:707:4: (lv_name_4_0= ruleMapName )
            {
            // InternalRest.g:707:4: (lv_name_4_0= ruleMapName )
            // InternalRest.g:708:5: lv_name_4_0= ruleMapName
            {

            					newCompositeNode(grammarAccess.getMapAccess().getNameMapNameParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_28);
            lv_name_4_0=ruleMapName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMapRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.xtext.example.mydsl.Rest.MapName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMA_5=(Token)match(input,RULE_COMA,FOLLOW_29); 

            			newLeafNode(this_COMA_5, grammarAccess.getMapAccess().getCOMATerminalRuleCall_5());
            		
            otherlv_6=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getMapAccess().getValueKeyword_6());
            		
            this_IGUAL_7=(Token)match(input,RULE_IGUAL,FOLLOW_30); 

            			newLeafNode(this_IGUAL_7, grammarAccess.getMapAccess().getIGUALTerminalRuleCall_7());
            		
            // InternalRest.g:737:3: (this_STRING_8= RULE_STRING | this_INT_9= RULE_INT | (otherlv_10= 'request' otherlv_11= '->' ( (otherlv_12= RULE_ID ) ) this_PUNTO_13= RULE_PUNTO ( (otherlv_14= RULE_ID ) ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt11=1;
                }
                break;
            case RULE_INT:
                {
                alt11=2;
                }
                break;
            case 36:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalRest.g:738:4: this_STRING_8= RULE_STRING
                    {
                    this_STRING_8=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    				newLeafNode(this_STRING_8, grammarAccess.getMapAccess().getSTRINGTerminalRuleCall_8_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalRest.g:743:4: this_INT_9= RULE_INT
                    {
                    this_INT_9=(Token)match(input,RULE_INT,FOLLOW_15); 

                    				newLeafNode(this_INT_9, grammarAccess.getMapAccess().getINTTerminalRuleCall_8_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalRest.g:748:4: (otherlv_10= 'request' otherlv_11= '->' ( (otherlv_12= RULE_ID ) ) this_PUNTO_13= RULE_PUNTO ( (otherlv_14= RULE_ID ) ) )
                    {
                    // InternalRest.g:748:4: (otherlv_10= 'request' otherlv_11= '->' ( (otherlv_12= RULE_ID ) ) this_PUNTO_13= RULE_PUNTO ( (otherlv_14= RULE_ID ) ) )
                    // InternalRest.g:749:5: otherlv_10= 'request' otherlv_11= '->' ( (otherlv_12= RULE_ID ) ) this_PUNTO_13= RULE_PUNTO ( (otherlv_14= RULE_ID ) )
                    {
                    otherlv_10=(Token)match(input,36,FOLLOW_31); 

                    					newLeafNode(otherlv_10, grammarAccess.getMapAccess().getRequestKeyword_8_2_0());
                    				
                    otherlv_11=(Token)match(input,29,FOLLOW_10); 

                    					newLeafNode(otherlv_11, grammarAccess.getMapAccess().getHyphenMinusGreaterThanSignKeyword_8_2_1());
                    				
                    // InternalRest.g:757:5: ( (otherlv_12= RULE_ID ) )
                    // InternalRest.g:758:6: (otherlv_12= RULE_ID )
                    {
                    // InternalRest.g:758:6: (otherlv_12= RULE_ID )
                    // InternalRest.g:759:7: otherlv_12= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getMapRule());
                    							}
                    						
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_22); 

                    							newLeafNode(otherlv_12, grammarAccess.getMapAccess().getEntidadMapEntidadCrossReference_8_2_2_0());
                    						

                    }


                    }

                    this_PUNTO_13=(Token)match(input,RULE_PUNTO,FOLLOW_10); 

                    					newLeafNode(this_PUNTO_13, grammarAccess.getMapAccess().getPUNTOTerminalRuleCall_8_2_3());
                    				
                    // InternalRest.g:774:5: ( (otherlv_14= RULE_ID ) )
                    // InternalRest.g:775:6: (otherlv_14= RULE_ID )
                    {
                    // InternalRest.g:775:6: (otherlv_14= RULE_ID )
                    // InternalRest.g:776:7: otherlv_14= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getMapRule());
                    							}
                    						
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_15); 

                    							newLeafNode(otherlv_14, grammarAccess.getMapAccess().getAtributoAtributoCrossReference_8_2_4_0());
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getMapAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMap"


    // $ANTLR start "entryRuleMapName"
    // InternalRest.g:797:1: entryRuleMapName returns [EObject current=null] : iv_ruleMapName= ruleMapName EOF ;
    public final EObject entryRuleMapName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapName = null;


        try {
            // InternalRest.g:797:48: (iv_ruleMapName= ruleMapName EOF )
            // InternalRest.g:798:2: iv_ruleMapName= ruleMapName EOF
            {
             newCompositeNode(grammarAccess.getMapNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapName=ruleMapName();

            state._fsp--;

             current =iv_ruleMapName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapName"


    // $ANTLR start "ruleMapName"
    // InternalRest.g:804:1: ruleMapName returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) this_PUNTO_2= RULE_PUNTO ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleMapName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_PUNTO_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRest.g:810:2: ( ( () ( (otherlv_1= RULE_ID ) ) this_PUNTO_2= RULE_PUNTO ( (otherlv_3= RULE_ID ) ) ) )
            // InternalRest.g:811:2: ( () ( (otherlv_1= RULE_ID ) ) this_PUNTO_2= RULE_PUNTO ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalRest.g:811:2: ( () ( (otherlv_1= RULE_ID ) ) this_PUNTO_2= RULE_PUNTO ( (otherlv_3= RULE_ID ) ) )
            // InternalRest.g:812:3: () ( (otherlv_1= RULE_ID ) ) this_PUNTO_2= RULE_PUNTO ( (otherlv_3= RULE_ID ) )
            {
            // InternalRest.g:812:3: ()
            // InternalRest.g:813:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMapNameAccess().getMapNameAction_0(),
            					current);
            			

            }

            // InternalRest.g:819:3: ( (otherlv_1= RULE_ID ) )
            // InternalRest.g:820:4: (otherlv_1= RULE_ID )
            {
            // InternalRest.g:820:4: (otherlv_1= RULE_ID )
            // InternalRest.g:821:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMapNameRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_1, grammarAccess.getMapNameAccess().getMetodoMetodoCrossReference_1_0());
            				

            }


            }

            this_PUNTO_2=(Token)match(input,RULE_PUNTO,FOLLOW_10); 

            			newLeafNode(this_PUNTO_2, grammarAccess.getMapNameAccess().getPUNTOTerminalRuleCall_2());
            		
            // InternalRest.g:836:3: ( (otherlv_3= RULE_ID ) )
            // InternalRest.g:837:4: (otherlv_3= RULE_ID )
            {
            // InternalRest.g:837:4: (otherlv_3= RULE_ID )
            // InternalRest.g:838:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMapNameRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getMapNameAccess().getParamPathParamCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapName"


    // $ANTLR start "entryRuleMetodo"
    // InternalRest.g:853:1: entryRuleMetodo returns [EObject current=null] : iv_ruleMetodo= ruleMetodo EOF ;
    public final EObject entryRuleMetodo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetodo = null;


        try {
            // InternalRest.g:853:47: (iv_ruleMetodo= ruleMetodo EOF )
            // InternalRest.g:854:2: iv_ruleMetodo= ruleMetodo EOF
            {
             newCompositeNode(grammarAccess.getMetodoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetodo=ruleMetodo();

            state._fsp--;

             current =iv_ruleMetodo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetodo"


    // $ANTLR start "ruleMetodo"
    // InternalRest.g:860:1: ruleMetodo returns [EObject current=null] : (this_GET_0= ruleGET | this_PUT_1= rulePUT | this_POST_2= rulePOST | this_DELETE_3= ruleDELETE ) ;
    public final EObject ruleMetodo() throws RecognitionException {
        EObject current = null;

        EObject this_GET_0 = null;

        EObject this_PUT_1 = null;

        EObject this_POST_2 = null;

        EObject this_DELETE_3 = null;



        	enterRule();

        try {
            // InternalRest.g:866:2: ( (this_GET_0= ruleGET | this_PUT_1= rulePUT | this_POST_2= rulePOST | this_DELETE_3= ruleDELETE ) )
            // InternalRest.g:867:2: (this_GET_0= ruleGET | this_PUT_1= rulePUT | this_POST_2= rulePOST | this_DELETE_3= ruleDELETE )
            {
            // InternalRest.g:867:2: (this_GET_0= ruleGET | this_PUT_1= rulePUT | this_POST_2= rulePOST | this_DELETE_3= ruleDELETE )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt12=1;
                }
                break;
            case 40:
                {
                alt12=2;
                }
                break;
            case 39:
                {
                alt12=3;
                }
                break;
            case 37:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalRest.g:868:3: this_GET_0= ruleGET
                    {

                    			newCompositeNode(grammarAccess.getMetodoAccess().getGETParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GET_0=ruleGET();

                    state._fsp--;


                    			current = this_GET_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRest.g:877:3: this_PUT_1= rulePUT
                    {

                    			newCompositeNode(grammarAccess.getMetodoAccess().getPUTParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PUT_1=rulePUT();

                    state._fsp--;


                    			current = this_PUT_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRest.g:886:3: this_POST_2= rulePOST
                    {

                    			newCompositeNode(grammarAccess.getMetodoAccess().getPOSTParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_POST_2=rulePOST();

                    state._fsp--;


                    			current = this_POST_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRest.g:895:3: this_DELETE_3= ruleDELETE
                    {

                    			newCompositeNode(grammarAccess.getMetodoAccess().getDELETEParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DELETE_3=ruleDELETE();

                    state._fsp--;


                    			current = this_DELETE_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetodo"


    // $ANTLR start "entryRuleDELETE"
    // InternalRest.g:907:1: entryRuleDELETE returns [EObject current=null] : iv_ruleDELETE= ruleDELETE EOF ;
    public final EObject entryRuleDELETE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDELETE = null;


        try {
            // InternalRest.g:907:47: (iv_ruleDELETE= ruleDELETE EOF )
            // InternalRest.g:908:2: iv_ruleDELETE= ruleDELETE EOF
            {
             newCompositeNode(grammarAccess.getDELETERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDELETE=ruleDELETE();

            state._fsp--;

             current =iv_ruleDELETE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDELETE"


    // $ANTLR start "ruleDELETE"
    // InternalRest.g:914:1: ruleDELETE returns [EObject current=null] : ( () otherlv_1= 'DELETE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'URL' this_IGUAL_5= RULE_IGUAL ( (lv_path_6_0= ruleURL ) ) this_PUNTOCOMA_7= RULE_PUNTOCOMA ( (lv_response_8_0= ruleResponse ) ) otherlv_9= '}' ) ;
    public final EObject ruleDELETE() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_IGUAL_5=null;
        Token this_PUNTOCOMA_7=null;
        Token otherlv_9=null;
        EObject lv_path_6_0 = null;

        EObject lv_response_8_0 = null;



        	enterRule();

        try {
            // InternalRest.g:920:2: ( ( () otherlv_1= 'DELETE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'URL' this_IGUAL_5= RULE_IGUAL ( (lv_path_6_0= ruleURL ) ) this_PUNTOCOMA_7= RULE_PUNTOCOMA ( (lv_response_8_0= ruleResponse ) ) otherlv_9= '}' ) )
            // InternalRest.g:921:2: ( () otherlv_1= 'DELETE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'URL' this_IGUAL_5= RULE_IGUAL ( (lv_path_6_0= ruleURL ) ) this_PUNTOCOMA_7= RULE_PUNTOCOMA ( (lv_response_8_0= ruleResponse ) ) otherlv_9= '}' )
            {
            // InternalRest.g:921:2: ( () otherlv_1= 'DELETE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'URL' this_IGUAL_5= RULE_IGUAL ( (lv_path_6_0= ruleURL ) ) this_PUNTOCOMA_7= RULE_PUNTOCOMA ( (lv_response_8_0= ruleResponse ) ) otherlv_9= '}' )
            // InternalRest.g:922:3: () otherlv_1= 'DELETE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'URL' this_IGUAL_5= RULE_IGUAL ( (lv_path_6_0= ruleURL ) ) this_PUNTOCOMA_7= RULE_PUNTOCOMA ( (lv_response_8_0= ruleResponse ) ) otherlv_9= '}'
            {
            // InternalRest.g:922:3: ()
            // InternalRest.g:923:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDELETEAccess().getDELETEAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getDELETEAccess().getDELETEKeyword_1());
            		
            // InternalRest.g:933:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRest.g:934:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRest.g:934:4: (lv_name_2_0= RULE_ID )
            // InternalRest.g:935:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDELETEAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDELETERule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getDELETEAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getDELETEAccess().getURLKeyword_4());
            		
            this_IGUAL_5=(Token)match(input,RULE_IGUAL,FOLLOW_33); 

            			newLeafNode(this_IGUAL_5, grammarAccess.getDELETEAccess().getIGUALTerminalRuleCall_5());
            		
            // InternalRest.g:963:3: ( (lv_path_6_0= ruleURL ) )
            // InternalRest.g:964:4: (lv_path_6_0= ruleURL )
            {
            // InternalRest.g:964:4: (lv_path_6_0= ruleURL )
            // InternalRest.g:965:5: lv_path_6_0= ruleURL
            {

            					newCompositeNode(grammarAccess.getDELETEAccess().getPathURLParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_5);
            lv_path_6_0=ruleURL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDELETERule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_6_0,
            						"org.xtext.example.mydsl.Rest.URL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_PUNTOCOMA_7=(Token)match(input,RULE_PUNTOCOMA,FOLLOW_34); 

            			newLeafNode(this_PUNTOCOMA_7, grammarAccess.getDELETEAccess().getPUNTOCOMATerminalRuleCall_7());
            		
            // InternalRest.g:986:3: ( (lv_response_8_0= ruleResponse ) )
            // InternalRest.g:987:4: (lv_response_8_0= ruleResponse )
            {
            // InternalRest.g:987:4: (lv_response_8_0= ruleResponse )
            // InternalRest.g:988:5: lv_response_8_0= ruleResponse
            {

            					newCompositeNode(grammarAccess.getDELETEAccess().getResponseResponseParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_15);
            lv_response_8_0=ruleResponse();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDELETERule());
            					}
            					set(
            						current,
            						"response",
            						lv_response_8_0,
            						"org.xtext.example.mydsl.Rest.Response");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getDELETEAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDELETE"


    // $ANTLR start "entryRulePOST"
    // InternalRest.g:1013:1: entryRulePOST returns [EObject current=null] : iv_rulePOST= rulePOST EOF ;
    public final EObject entryRulePOST() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePOST = null;


        try {
            // InternalRest.g:1013:45: (iv_rulePOST= rulePOST EOF )
            // InternalRest.g:1014:2: iv_rulePOST= rulePOST EOF
            {
             newCompositeNode(grammarAccess.getPOSTRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePOST=rulePOST();

            state._fsp--;

             current =iv_rulePOST; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePOST"


    // $ANTLR start "rulePOST"
    // InternalRest.g:1020:1: rulePOST returns [EObject current=null] : ( () otherlv_1= 'POST' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'URL' this_IGUAL_5= RULE_IGUAL ( (lv_path_6_0= ruleURL ) ) this_PUNTOCOMA_7= RULE_PUNTOCOMA ( (lv_request_8_0= ruleRequest ) ) ( (lv_response_9_0= ruleResponse ) ) otherlv_10= '}' ) ;
    public final EObject rulePOST() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_IGUAL_5=null;
        Token this_PUNTOCOMA_7=null;
        Token otherlv_10=null;
        EObject lv_path_6_0 = null;

        EObject lv_request_8_0 = null;

        EObject lv_response_9_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1026:2: ( ( () otherlv_1= 'POST' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'URL' this_IGUAL_5= RULE_IGUAL ( (lv_path_6_0= ruleURL ) ) this_PUNTOCOMA_7= RULE_PUNTOCOMA ( (lv_request_8_0= ruleRequest ) ) ( (lv_response_9_0= ruleResponse ) ) otherlv_10= '}' ) )
            // InternalRest.g:1027:2: ( () otherlv_1= 'POST' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'URL' this_IGUAL_5= RULE_IGUAL ( (lv_path_6_0= ruleURL ) ) this_PUNTOCOMA_7= RULE_PUNTOCOMA ( (lv_request_8_0= ruleRequest ) ) ( (lv_response_9_0= ruleResponse ) ) otherlv_10= '}' )
            {
            // InternalRest.g:1027:2: ( () otherlv_1= 'POST' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'URL' this_IGUAL_5= RULE_IGUAL ( (lv_path_6_0= ruleURL ) ) this_PUNTOCOMA_7= RULE_PUNTOCOMA ( (lv_request_8_0= ruleRequest ) ) ( (lv_response_9_0= ruleResponse ) ) otherlv_10= '}' )
            // InternalRest.g:1028:3: () otherlv_1= 'POST' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'URL' this_IGUAL_5= RULE_IGUAL ( (lv_path_6_0= ruleURL ) ) this_PUNTOCOMA_7= RULE_PUNTOCOMA ( (lv_request_8_0= ruleRequest ) ) ( (lv_response_9_0= ruleResponse ) ) otherlv_10= '}'
            {
            // InternalRest.g:1028:3: ()
            // InternalRest.g:1029:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPOSTAccess().getPOSTAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getPOSTAccess().getPOSTKeyword_1());
            		
            // InternalRest.g:1039:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRest.g:1040:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRest.g:1040:4: (lv_name_2_0= RULE_ID )
            // InternalRest.g:1041:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPOSTAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPOSTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getPOSTAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getPOSTAccess().getURLKeyword_4());
            		
            this_IGUAL_5=(Token)match(input,RULE_IGUAL,FOLLOW_33); 

            			newLeafNode(this_IGUAL_5, grammarAccess.getPOSTAccess().getIGUALTerminalRuleCall_5());
            		
            // InternalRest.g:1069:3: ( (lv_path_6_0= ruleURL ) )
            // InternalRest.g:1070:4: (lv_path_6_0= ruleURL )
            {
            // InternalRest.g:1070:4: (lv_path_6_0= ruleURL )
            // InternalRest.g:1071:5: lv_path_6_0= ruleURL
            {

            					newCompositeNode(grammarAccess.getPOSTAccess().getPathURLParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_5);
            lv_path_6_0=ruleURL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPOSTRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_6_0,
            						"org.xtext.example.mydsl.Rest.URL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_PUNTOCOMA_7=(Token)match(input,RULE_PUNTOCOMA,FOLLOW_35); 

            			newLeafNode(this_PUNTOCOMA_7, grammarAccess.getPOSTAccess().getPUNTOCOMATerminalRuleCall_7());
            		
            // InternalRest.g:1092:3: ( (lv_request_8_0= ruleRequest ) )
            // InternalRest.g:1093:4: (lv_request_8_0= ruleRequest )
            {
            // InternalRest.g:1093:4: (lv_request_8_0= ruleRequest )
            // InternalRest.g:1094:5: lv_request_8_0= ruleRequest
            {

            					newCompositeNode(grammarAccess.getPOSTAccess().getRequestRequestParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_34);
            lv_request_8_0=ruleRequest();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPOSTRule());
            					}
            					set(
            						current,
            						"request",
            						lv_request_8_0,
            						"org.xtext.example.mydsl.Rest.Request");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:1111:3: ( (lv_response_9_0= ruleResponse ) )
            // InternalRest.g:1112:4: (lv_response_9_0= ruleResponse )
            {
            // InternalRest.g:1112:4: (lv_response_9_0= ruleResponse )
            // InternalRest.g:1113:5: lv_response_9_0= ruleResponse
            {

            					newCompositeNode(grammarAccess.getPOSTAccess().getResponseResponseParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_15);
            lv_response_9_0=ruleResponse();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPOSTRule());
            					}
            					set(
            						current,
            						"response",
            						lv_response_9_0,
            						"org.xtext.example.mydsl.Rest.Response");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getPOSTAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePOST"


    // $ANTLR start "entryRulePUT"
    // InternalRest.g:1138:1: entryRulePUT returns [EObject current=null] : iv_rulePUT= rulePUT EOF ;
    public final EObject entryRulePUT() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePUT = null;


        try {
            // InternalRest.g:1138:44: (iv_rulePUT= rulePUT EOF )
            // InternalRest.g:1139:2: iv_rulePUT= rulePUT EOF
            {
             newCompositeNode(grammarAccess.getPUTRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePUT=rulePUT();

            state._fsp--;

             current =iv_rulePUT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePUT"


    // $ANTLR start "rulePUT"
    // InternalRest.g:1145:1: rulePUT returns [EObject current=null] : ( () otherlv_1= 'PUT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'URL' this_IGUAL_5= RULE_IGUAL ( (lv_path_6_0= ruleURL ) ) this_PUNTOCOMA_7= RULE_PUNTOCOMA ( (lv_request_8_0= ruleRequest ) ) ( (lv_response_9_0= ruleResponse ) ) otherlv_10= '}' ) ;
    public final EObject rulePUT() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_IGUAL_5=null;
        Token this_PUNTOCOMA_7=null;
        Token otherlv_10=null;
        EObject lv_path_6_0 = null;

        EObject lv_request_8_0 = null;

        EObject lv_response_9_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1151:2: ( ( () otherlv_1= 'PUT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'URL' this_IGUAL_5= RULE_IGUAL ( (lv_path_6_0= ruleURL ) ) this_PUNTOCOMA_7= RULE_PUNTOCOMA ( (lv_request_8_0= ruleRequest ) ) ( (lv_response_9_0= ruleResponse ) ) otherlv_10= '}' ) )
            // InternalRest.g:1152:2: ( () otherlv_1= 'PUT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'URL' this_IGUAL_5= RULE_IGUAL ( (lv_path_6_0= ruleURL ) ) this_PUNTOCOMA_7= RULE_PUNTOCOMA ( (lv_request_8_0= ruleRequest ) ) ( (lv_response_9_0= ruleResponse ) ) otherlv_10= '}' )
            {
            // InternalRest.g:1152:2: ( () otherlv_1= 'PUT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'URL' this_IGUAL_5= RULE_IGUAL ( (lv_path_6_0= ruleURL ) ) this_PUNTOCOMA_7= RULE_PUNTOCOMA ( (lv_request_8_0= ruleRequest ) ) ( (lv_response_9_0= ruleResponse ) ) otherlv_10= '}' )
            // InternalRest.g:1153:3: () otherlv_1= 'PUT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'URL' this_IGUAL_5= RULE_IGUAL ( (lv_path_6_0= ruleURL ) ) this_PUNTOCOMA_7= RULE_PUNTOCOMA ( (lv_request_8_0= ruleRequest ) ) ( (lv_response_9_0= ruleResponse ) ) otherlv_10= '}'
            {
            // InternalRest.g:1153:3: ()
            // InternalRest.g:1154:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPUTAccess().getPUTAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getPUTAccess().getPUTKeyword_1());
            		
            // InternalRest.g:1164:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRest.g:1165:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRest.g:1165:4: (lv_name_2_0= RULE_ID )
            // InternalRest.g:1166:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPUTAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getPUTAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getPUTAccess().getURLKeyword_4());
            		
            this_IGUAL_5=(Token)match(input,RULE_IGUAL,FOLLOW_33); 

            			newLeafNode(this_IGUAL_5, grammarAccess.getPUTAccess().getIGUALTerminalRuleCall_5());
            		
            // InternalRest.g:1194:3: ( (lv_path_6_0= ruleURL ) )
            // InternalRest.g:1195:4: (lv_path_6_0= ruleURL )
            {
            // InternalRest.g:1195:4: (lv_path_6_0= ruleURL )
            // InternalRest.g:1196:5: lv_path_6_0= ruleURL
            {

            					newCompositeNode(grammarAccess.getPUTAccess().getPathURLParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_5);
            lv_path_6_0=ruleURL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPUTRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_6_0,
            						"org.xtext.example.mydsl.Rest.URL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_PUNTOCOMA_7=(Token)match(input,RULE_PUNTOCOMA,FOLLOW_35); 

            			newLeafNode(this_PUNTOCOMA_7, grammarAccess.getPUTAccess().getPUNTOCOMATerminalRuleCall_7());
            		
            // InternalRest.g:1217:3: ( (lv_request_8_0= ruleRequest ) )
            // InternalRest.g:1218:4: (lv_request_8_0= ruleRequest )
            {
            // InternalRest.g:1218:4: (lv_request_8_0= ruleRequest )
            // InternalRest.g:1219:5: lv_request_8_0= ruleRequest
            {

            					newCompositeNode(grammarAccess.getPUTAccess().getRequestRequestParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_34);
            lv_request_8_0=ruleRequest();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPUTRule());
            					}
            					set(
            						current,
            						"request",
            						lv_request_8_0,
            						"org.xtext.example.mydsl.Rest.Request");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:1236:3: ( (lv_response_9_0= ruleResponse ) )
            // InternalRest.g:1237:4: (lv_response_9_0= ruleResponse )
            {
            // InternalRest.g:1237:4: (lv_response_9_0= ruleResponse )
            // InternalRest.g:1238:5: lv_response_9_0= ruleResponse
            {

            					newCompositeNode(grammarAccess.getPUTAccess().getResponseResponseParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_15);
            lv_response_9_0=ruleResponse();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPUTRule());
            					}
            					set(
            						current,
            						"response",
            						lv_response_9_0,
            						"org.xtext.example.mydsl.Rest.Response");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getPUTAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePUT"


    // $ANTLR start "entryRuleGET"
    // InternalRest.g:1263:1: entryRuleGET returns [EObject current=null] : iv_ruleGET= ruleGET EOF ;
    public final EObject entryRuleGET() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGET = null;


        try {
            // InternalRest.g:1263:44: (iv_ruleGET= ruleGET EOF )
            // InternalRest.g:1264:2: iv_ruleGET= ruleGET EOF
            {
             newCompositeNode(grammarAccess.getGETRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGET=ruleGET();

            state._fsp--;

             current =iv_ruleGET; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGET"


    // $ANTLR start "ruleGET"
    // InternalRest.g:1270:1: ruleGET returns [EObject current=null] : ( () otherlv_1= 'GET' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'URL' this_IGUAL_5= RULE_IGUAL ( (lv_path_6_0= ruleURL ) ) this_PUNTOCOMA_7= RULE_PUNTOCOMA ( (lv_response_8_0= ruleResponse ) ) otherlv_9= '}' ) ;
    public final EObject ruleGET() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_IGUAL_5=null;
        Token this_PUNTOCOMA_7=null;
        Token otherlv_9=null;
        EObject lv_path_6_0 = null;

        EObject lv_response_8_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1276:2: ( ( () otherlv_1= 'GET' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'URL' this_IGUAL_5= RULE_IGUAL ( (lv_path_6_0= ruleURL ) ) this_PUNTOCOMA_7= RULE_PUNTOCOMA ( (lv_response_8_0= ruleResponse ) ) otherlv_9= '}' ) )
            // InternalRest.g:1277:2: ( () otherlv_1= 'GET' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'URL' this_IGUAL_5= RULE_IGUAL ( (lv_path_6_0= ruleURL ) ) this_PUNTOCOMA_7= RULE_PUNTOCOMA ( (lv_response_8_0= ruleResponse ) ) otherlv_9= '}' )
            {
            // InternalRest.g:1277:2: ( () otherlv_1= 'GET' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'URL' this_IGUAL_5= RULE_IGUAL ( (lv_path_6_0= ruleURL ) ) this_PUNTOCOMA_7= RULE_PUNTOCOMA ( (lv_response_8_0= ruleResponse ) ) otherlv_9= '}' )
            // InternalRest.g:1278:3: () otherlv_1= 'GET' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'URL' this_IGUAL_5= RULE_IGUAL ( (lv_path_6_0= ruleURL ) ) this_PUNTOCOMA_7= RULE_PUNTOCOMA ( (lv_response_8_0= ruleResponse ) ) otherlv_9= '}'
            {
            // InternalRest.g:1278:3: ()
            // InternalRest.g:1279:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGETAccess().getGETAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getGETAccess().getGETKeyword_1());
            		
            // InternalRest.g:1289:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRest.g:1290:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRest.g:1290:4: (lv_name_2_0= RULE_ID )
            // InternalRest.g:1291:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getGETAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGETRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getGETAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getGETAccess().getURLKeyword_4());
            		
            this_IGUAL_5=(Token)match(input,RULE_IGUAL,FOLLOW_33); 

            			newLeafNode(this_IGUAL_5, grammarAccess.getGETAccess().getIGUALTerminalRuleCall_5());
            		
            // InternalRest.g:1319:3: ( (lv_path_6_0= ruleURL ) )
            // InternalRest.g:1320:4: (lv_path_6_0= ruleURL )
            {
            // InternalRest.g:1320:4: (lv_path_6_0= ruleURL )
            // InternalRest.g:1321:5: lv_path_6_0= ruleURL
            {

            					newCompositeNode(grammarAccess.getGETAccess().getPathURLParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_5);
            lv_path_6_0=ruleURL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGETRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_6_0,
            						"org.xtext.example.mydsl.Rest.URL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_PUNTOCOMA_7=(Token)match(input,RULE_PUNTOCOMA,FOLLOW_34); 

            			newLeafNode(this_PUNTOCOMA_7, grammarAccess.getGETAccess().getPUNTOCOMATerminalRuleCall_7());
            		
            // InternalRest.g:1342:3: ( (lv_response_8_0= ruleResponse ) )
            // InternalRest.g:1343:4: (lv_response_8_0= ruleResponse )
            {
            // InternalRest.g:1343:4: (lv_response_8_0= ruleResponse )
            // InternalRest.g:1344:5: lv_response_8_0= ruleResponse
            {

            					newCompositeNode(grammarAccess.getGETAccess().getResponseResponseParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_15);
            lv_response_8_0=ruleResponse();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGETRule());
            					}
            					set(
            						current,
            						"response",
            						lv_response_8_0,
            						"org.xtext.example.mydsl.Rest.Response");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getGETAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGET"


    // $ANTLR start "entryRuleResponse"
    // InternalRest.g:1369:1: entryRuleResponse returns [EObject current=null] : iv_ruleResponse= ruleResponse EOF ;
    public final EObject entryRuleResponse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponse = null;


        try {
            // InternalRest.g:1369:49: (iv_ruleResponse= ruleResponse EOF )
            // InternalRest.g:1370:2: iv_ruleResponse= ruleResponse EOF
            {
             newCompositeNode(grammarAccess.getResponseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResponse=ruleResponse();

            state._fsp--;

             current =iv_ruleResponse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResponse"


    // $ANTLR start "ruleResponse"
    // InternalRest.g:1376:1: ruleResponse returns [EObject current=null] : ( () otherlv_1= 'Response' otherlv_2= '{' otherlv_3= 'Type' this_IGUAL_4= RULE_IGUAL ( (lv_tipoResponse_5_0= ruleTipoElemento ) ) ( (lv_array_6_0= '[]' ) )? this_PUNTOCOMA_7= RULE_PUNTOCOMA otherlv_8= '}' ) ;
    public final EObject ruleResponse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_IGUAL_4=null;
        Token lv_array_6_0=null;
        Token this_PUNTOCOMA_7=null;
        Token otherlv_8=null;
        EObject lv_tipoResponse_5_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1382:2: ( ( () otherlv_1= 'Response' otherlv_2= '{' otherlv_3= 'Type' this_IGUAL_4= RULE_IGUAL ( (lv_tipoResponse_5_0= ruleTipoElemento ) ) ( (lv_array_6_0= '[]' ) )? this_PUNTOCOMA_7= RULE_PUNTOCOMA otherlv_8= '}' ) )
            // InternalRest.g:1383:2: ( () otherlv_1= 'Response' otherlv_2= '{' otherlv_3= 'Type' this_IGUAL_4= RULE_IGUAL ( (lv_tipoResponse_5_0= ruleTipoElemento ) ) ( (lv_array_6_0= '[]' ) )? this_PUNTOCOMA_7= RULE_PUNTOCOMA otherlv_8= '}' )
            {
            // InternalRest.g:1383:2: ( () otherlv_1= 'Response' otherlv_2= '{' otherlv_3= 'Type' this_IGUAL_4= RULE_IGUAL ( (lv_tipoResponse_5_0= ruleTipoElemento ) ) ( (lv_array_6_0= '[]' ) )? this_PUNTOCOMA_7= RULE_PUNTOCOMA otherlv_8= '}' )
            // InternalRest.g:1384:3: () otherlv_1= 'Response' otherlv_2= '{' otherlv_3= 'Type' this_IGUAL_4= RULE_IGUAL ( (lv_tipoResponse_5_0= ruleTipoElemento ) ) ( (lv_array_6_0= '[]' ) )? this_PUNTOCOMA_7= RULE_PUNTOCOMA otherlv_8= '}'
            {
            // InternalRest.g:1384:3: ()
            // InternalRest.g:1385:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getResponseAccess().getResponseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getResponseAccess().getResponseKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getResponseAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getResponseAccess().getTypeKeyword_3());
            		
            this_IGUAL_4=(Token)match(input,RULE_IGUAL,FOLLOW_37); 

            			newLeafNode(this_IGUAL_4, grammarAccess.getResponseAccess().getIGUALTerminalRuleCall_4());
            		
            // InternalRest.g:1407:3: ( (lv_tipoResponse_5_0= ruleTipoElemento ) )
            // InternalRest.g:1408:4: (lv_tipoResponse_5_0= ruleTipoElemento )
            {
            // InternalRest.g:1408:4: (lv_tipoResponse_5_0= ruleTipoElemento )
            // InternalRest.g:1409:5: lv_tipoResponse_5_0= ruleTipoElemento
            {

            					newCompositeNode(grammarAccess.getResponseAccess().getTipoResponseTipoElementoParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_38);
            lv_tipoResponse_5_0=ruleTipoElemento();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResponseRule());
            					}
            					set(
            						current,
            						"tipoResponse",
            						lv_tipoResponse_5_0,
            						"org.xtext.example.mydsl.Rest.TipoElemento");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:1426:3: ( (lv_array_6_0= '[]' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==44) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRest.g:1427:4: (lv_array_6_0= '[]' )
                    {
                    // InternalRest.g:1427:4: (lv_array_6_0= '[]' )
                    // InternalRest.g:1428:5: lv_array_6_0= '[]'
                    {
                    lv_array_6_0=(Token)match(input,44,FOLLOW_5); 

                    					newLeafNode(lv_array_6_0, grammarAccess.getResponseAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getResponseRule());
                    					}
                    					setWithLastConsumed(current, "array", true, "[]");
                    				

                    }


                    }
                    break;

            }

            this_PUNTOCOMA_7=(Token)match(input,RULE_PUNTOCOMA,FOLLOW_15); 

            			newLeafNode(this_PUNTOCOMA_7, grammarAccess.getResponseAccess().getPUNTOCOMATerminalRuleCall_7());
            		
            otherlv_8=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getResponseAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResponse"


    // $ANTLR start "entryRuleRequest"
    // InternalRest.g:1452:1: entryRuleRequest returns [EObject current=null] : iv_ruleRequest= ruleRequest EOF ;
    public final EObject entryRuleRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequest = null;


        try {
            // InternalRest.g:1452:48: (iv_ruleRequest= ruleRequest EOF )
            // InternalRest.g:1453:2: iv_ruleRequest= ruleRequest EOF
            {
             newCompositeNode(grammarAccess.getRequestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequest=ruleRequest();

            state._fsp--;

             current =iv_ruleRequest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequest"


    // $ANTLR start "ruleRequest"
    // InternalRest.g:1459:1: ruleRequest returns [EObject current=null] : ( () otherlv_1= 'Request' otherlv_2= '{' otherlv_3= 'Type' this_IGUAL_4= RULE_IGUAL ( (lv_tipoResponse_5_0= ruleTipoElemento ) ) ( (lv_array_6_0= '[]' ) )? this_PUNTOCOMA_7= RULE_PUNTOCOMA otherlv_8= '}' ) ;
    public final EObject ruleRequest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_IGUAL_4=null;
        Token lv_array_6_0=null;
        Token this_PUNTOCOMA_7=null;
        Token otherlv_8=null;
        EObject lv_tipoResponse_5_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1465:2: ( ( () otherlv_1= 'Request' otherlv_2= '{' otherlv_3= 'Type' this_IGUAL_4= RULE_IGUAL ( (lv_tipoResponse_5_0= ruleTipoElemento ) ) ( (lv_array_6_0= '[]' ) )? this_PUNTOCOMA_7= RULE_PUNTOCOMA otherlv_8= '}' ) )
            // InternalRest.g:1466:2: ( () otherlv_1= 'Request' otherlv_2= '{' otherlv_3= 'Type' this_IGUAL_4= RULE_IGUAL ( (lv_tipoResponse_5_0= ruleTipoElemento ) ) ( (lv_array_6_0= '[]' ) )? this_PUNTOCOMA_7= RULE_PUNTOCOMA otherlv_8= '}' )
            {
            // InternalRest.g:1466:2: ( () otherlv_1= 'Request' otherlv_2= '{' otherlv_3= 'Type' this_IGUAL_4= RULE_IGUAL ( (lv_tipoResponse_5_0= ruleTipoElemento ) ) ( (lv_array_6_0= '[]' ) )? this_PUNTOCOMA_7= RULE_PUNTOCOMA otherlv_8= '}' )
            // InternalRest.g:1467:3: () otherlv_1= 'Request' otherlv_2= '{' otherlv_3= 'Type' this_IGUAL_4= RULE_IGUAL ( (lv_tipoResponse_5_0= ruleTipoElemento ) ) ( (lv_array_6_0= '[]' ) )? this_PUNTOCOMA_7= RULE_PUNTOCOMA otherlv_8= '}'
            {
            // InternalRest.g:1467:3: ()
            // InternalRest.g:1468:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequestAccess().getRequestAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getRequestAccess().getRequestKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getRequestAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRequestAccess().getTypeKeyword_3());
            		
            this_IGUAL_4=(Token)match(input,RULE_IGUAL,FOLLOW_37); 

            			newLeafNode(this_IGUAL_4, grammarAccess.getRequestAccess().getIGUALTerminalRuleCall_4());
            		
            // InternalRest.g:1490:3: ( (lv_tipoResponse_5_0= ruleTipoElemento ) )
            // InternalRest.g:1491:4: (lv_tipoResponse_5_0= ruleTipoElemento )
            {
            // InternalRest.g:1491:4: (lv_tipoResponse_5_0= ruleTipoElemento )
            // InternalRest.g:1492:5: lv_tipoResponse_5_0= ruleTipoElemento
            {

            					newCompositeNode(grammarAccess.getRequestAccess().getTipoResponseTipoElementoParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_38);
            lv_tipoResponse_5_0=ruleTipoElemento();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequestRule());
            					}
            					set(
            						current,
            						"tipoResponse",
            						lv_tipoResponse_5_0,
            						"org.xtext.example.mydsl.Rest.TipoElemento");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:1509:3: ( (lv_array_6_0= '[]' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==44) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRest.g:1510:4: (lv_array_6_0= '[]' )
                    {
                    // InternalRest.g:1510:4: (lv_array_6_0= '[]' )
                    // InternalRest.g:1511:5: lv_array_6_0= '[]'
                    {
                    lv_array_6_0=(Token)match(input,44,FOLLOW_5); 

                    					newLeafNode(lv_array_6_0, grammarAccess.getRequestAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRequestRule());
                    					}
                    					setWithLastConsumed(current, "array", true, "[]");
                    				

                    }


                    }
                    break;

            }

            this_PUNTOCOMA_7=(Token)match(input,RULE_PUNTOCOMA,FOLLOW_15); 

            			newLeafNode(this_PUNTOCOMA_7, grammarAccess.getRequestAccess().getPUNTOCOMATerminalRuleCall_7());
            		
            otherlv_8=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRequestAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequest"


    // $ANTLR start "entryRuleURL"
    // InternalRest.g:1535:1: entryRuleURL returns [EObject current=null] : iv_ruleURL= ruleURL EOF ;
    public final EObject entryRuleURL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURL = null;


        try {
            // InternalRest.g:1535:44: (iv_ruleURL= ruleURL EOF )
            // InternalRest.g:1536:2: iv_ruleURL= ruleURL EOF
            {
             newCompositeNode(grammarAccess.getURLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleURL=ruleURL();

            state._fsp--;

             current =iv_ruleURL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleURL"


    // $ANTLR start "ruleURL"
    // InternalRest.g:1542:1: ruleURL returns [EObject current=null] : ( () rulePathName ( rulePathName | ( (lv_pathparam_3_0= rulePathParam ) ) )* (otherlv_4= '?' ( (lv_queryparam_5_0= ruleQueryParam ) ) )? ) ;
    public final EObject ruleURL() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_pathparam_3_0 = null;

        EObject lv_queryparam_5_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1548:2: ( ( () rulePathName ( rulePathName | ( (lv_pathparam_3_0= rulePathParam ) ) )* (otherlv_4= '?' ( (lv_queryparam_5_0= ruleQueryParam ) ) )? ) )
            // InternalRest.g:1549:2: ( () rulePathName ( rulePathName | ( (lv_pathparam_3_0= rulePathParam ) ) )* (otherlv_4= '?' ( (lv_queryparam_5_0= ruleQueryParam ) ) )? )
            {
            // InternalRest.g:1549:2: ( () rulePathName ( rulePathName | ( (lv_pathparam_3_0= rulePathParam ) ) )* (otherlv_4= '?' ( (lv_queryparam_5_0= ruleQueryParam ) ) )? )
            // InternalRest.g:1550:3: () rulePathName ( rulePathName | ( (lv_pathparam_3_0= rulePathParam ) ) )* (otherlv_4= '?' ( (lv_queryparam_5_0= ruleQueryParam ) ) )?
            {
            // InternalRest.g:1550:3: ()
            // InternalRest.g:1551:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getURLAccess().getURLAction_0(),
            					current);
            			

            }


            			newCompositeNode(grammarAccess.getURLAccess().getPathNameParserRuleCall_1());
            		
            pushFollow(FOLLOW_39);
            rulePathName();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalRest.g:1564:3: ( rulePathName | ( (lv_pathparam_3_0= rulePathParam ) ) )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==47) ) {
                    alt15=1;
                }
                else if ( (LA15_0==48) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRest.g:1565:4: rulePathName
            	    {

            	    				newCompositeNode(grammarAccess.getURLAccess().getPathNameParserRuleCall_2_0());
            	    			
            	    pushFollow(FOLLOW_39);
            	    rulePathName();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalRest.g:1573:4: ( (lv_pathparam_3_0= rulePathParam ) )
            	    {
            	    // InternalRest.g:1573:4: ( (lv_pathparam_3_0= rulePathParam ) )
            	    // InternalRest.g:1574:5: (lv_pathparam_3_0= rulePathParam )
            	    {
            	    // InternalRest.g:1574:5: (lv_pathparam_3_0= rulePathParam )
            	    // InternalRest.g:1575:6: lv_pathparam_3_0= rulePathParam
            	    {

            	    						newCompositeNode(grammarAccess.getURLAccess().getPathparamPathParamParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_39);
            	    lv_pathparam_3_0=rulePathParam();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getURLRule());
            	    						}
            	    						add(
            	    							current,
            	    							"pathparam",
            	    							lv_pathparam_3_0,
            	    							"org.xtext.example.mydsl.Rest.PathParam");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalRest.g:1593:3: (otherlv_4= '?' ( (lv_queryparam_5_0= ruleQueryParam ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==46) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRest.g:1594:4: otherlv_4= '?' ( (lv_queryparam_5_0= ruleQueryParam ) )
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_40); 

                    				newLeafNode(otherlv_4, grammarAccess.getURLAccess().getQuestionMarkKeyword_3_0());
                    			
                    // InternalRest.g:1598:4: ( (lv_queryparam_5_0= ruleQueryParam ) )
                    // InternalRest.g:1599:5: (lv_queryparam_5_0= ruleQueryParam )
                    {
                    // InternalRest.g:1599:5: (lv_queryparam_5_0= ruleQueryParam )
                    // InternalRest.g:1600:6: lv_queryparam_5_0= ruleQueryParam
                    {

                    						newCompositeNode(grammarAccess.getURLAccess().getQueryparamQueryParamParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_queryparam_5_0=ruleQueryParam();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getURLRule());
                    						}
                    						set(
                    							current,
                    							"queryparam",
                    							lv_queryparam_5_0,
                    							"org.xtext.example.mydsl.Rest.QueryParam");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleURL"


    // $ANTLR start "entryRulePathName"
    // InternalRest.g:1622:1: entryRulePathName returns [String current=null] : iv_rulePathName= rulePathName EOF ;
    public final String entryRulePathName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePathName = null;


        try {
            // InternalRest.g:1622:48: (iv_rulePathName= rulePathName EOF )
            // InternalRest.g:1623:2: iv_rulePathName= rulePathName EOF
            {
             newCompositeNode(grammarAccess.getPathNameRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePathName=rulePathName();

            state._fsp--;

             current =iv_rulePathName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePathName"


    // $ANTLR start "rulePathName"
    // InternalRest.g:1629:1: rulePathName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '/' this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken rulePathName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRest.g:1635:2: ( (kw= '/' this_ID_1= RULE_ID ) )
            // InternalRest.g:1636:2: (kw= '/' this_ID_1= RULE_ID )
            {
            // InternalRest.g:1636:2: (kw= '/' this_ID_1= RULE_ID )
            // InternalRest.g:1637:3: kw= '/' this_ID_1= RULE_ID
            {
            kw=(Token)match(input,47,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPathNameAccess().getSolidusKeyword_0());
            		
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            			current.merge(this_ID_1);
            		

            			newLeafNode(this_ID_1, grammarAccess.getPathNameAccess().getIDTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePathName"


    // $ANTLR start "entryRulePathParam"
    // InternalRest.g:1653:1: entryRulePathParam returns [EObject current=null] : iv_rulePathParam= rulePathParam EOF ;
    public final EObject entryRulePathParam() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathParam = null;


        try {
            // InternalRest.g:1653:50: (iv_rulePathParam= rulePathParam EOF )
            // InternalRest.g:1654:2: iv_rulePathParam= rulePathParam EOF
            {
             newCompositeNode(grammarAccess.getPathParamRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePathParam=rulePathParam();

            state._fsp--;

             current =iv_rulePathParam; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePathParam"


    // $ANTLR start "rulePathParam"
    // InternalRest.g:1660:1: rulePathParam returns [EObject current=null] : ( () otherlv_1= '/:{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}' ) ;
    public final EObject rulePathParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRest.g:1666:2: ( ( () otherlv_1= '/:{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}' ) )
            // InternalRest.g:1667:2: ( () otherlv_1= '/:{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}' )
            {
            // InternalRest.g:1667:2: ( () otherlv_1= '/:{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}' )
            // InternalRest.g:1668:3: () otherlv_1= '/:{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}'
            {
            // InternalRest.g:1668:3: ()
            // InternalRest.g:1669:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPathParamAccess().getPathParamAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getPathParamAccess().getSolidusColonLeftCurlyBracketKeyword_1());
            		
            // InternalRest.g:1679:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRest.g:1680:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRest.g:1680:4: (lv_name_2_0= RULE_ID )
            // InternalRest.g:1681:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPathParamAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPathParamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPathParamAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePathParam"


    // $ANTLR start "entryRuleQueryParam"
    // InternalRest.g:1705:1: entryRuleQueryParam returns [EObject current=null] : iv_ruleQueryParam= ruleQueryParam EOF ;
    public final EObject entryRuleQueryParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryParam = null;


        try {
            // InternalRest.g:1705:51: (iv_ruleQueryParam= ruleQueryParam EOF )
            // InternalRest.g:1706:2: iv_ruleQueryParam= ruleQueryParam EOF
            {
             newCompositeNode(grammarAccess.getQueryParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQueryParam=ruleQueryParam();

            state._fsp--;

             current =iv_ruleQueryParam; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQueryParam"


    // $ANTLR start "ruleQueryParam"
    // InternalRest.g:1712:1: ruleQueryParam returns [EObject current=null] : ( () otherlv_1= '${' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}' ) ;
    public final EObject ruleQueryParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRest.g:1718:2: ( ( () otherlv_1= '${' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}' ) )
            // InternalRest.g:1719:2: ( () otherlv_1= '${' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}' )
            {
            // InternalRest.g:1719:2: ( () otherlv_1= '${' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}' )
            // InternalRest.g:1720:3: () otherlv_1= '${' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}'
            {
            // InternalRest.g:1720:3: ()
            // InternalRest.g:1721:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQueryParamAccess().getQueryParamAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getQueryParamAccess().getDollarSignLeftCurlyBracketKeyword_1());
            		
            // InternalRest.g:1731:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRest.g:1732:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRest.g:1732:4: (lv_name_2_0= RULE_ID )
            // InternalRest.g:1733:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_2_0, grammarAccess.getQueryParamAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQueryParamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getQueryParamAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQueryParam"


    // $ANTLR start "entryRuleEntidad"
    // InternalRest.g:1757:1: entryRuleEntidad returns [EObject current=null] : iv_ruleEntidad= ruleEntidad EOF ;
    public final EObject entryRuleEntidad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidad = null;


        try {
            // InternalRest.g:1757:48: (iv_ruleEntidad= ruleEntidad EOF )
            // InternalRest.g:1758:2: iv_ruleEntidad= ruleEntidad EOF
            {
             newCompositeNode(grammarAccess.getEntidadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntidad=ruleEntidad();

            state._fsp--;

             current =iv_ruleEntidad; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntidad"


    // $ANTLR start "ruleEntidad"
    // InternalRest.g:1764:1: ruleEntidad returns [EObject current=null] : (this_EntidadSimple_0= ruleEntidadSimple | this_EntidadMock_1= ruleEntidadMock ) ;
    public final EObject ruleEntidad() throws RecognitionException {
        EObject current = null;

        EObject this_EntidadSimple_0 = null;

        EObject this_EntidadMock_1 = null;



        	enterRule();

        try {
            // InternalRest.g:1770:2: ( (this_EntidadSimple_0= ruleEntidadSimple | this_EntidadMock_1= ruleEntidadMock ) )
            // InternalRest.g:1771:2: (this_EntidadSimple_0= ruleEntidadSimple | this_EntidadMock_1= ruleEntidadMock )
            {
            // InternalRest.g:1771:2: (this_EntidadSimple_0= ruleEntidadSimple | this_EntidadMock_1= ruleEntidadMock )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==51) ) {
                alt17=1;
            }
            else if ( (LA17_0==50) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalRest.g:1772:3: this_EntidadSimple_0= ruleEntidadSimple
                    {

                    			newCompositeNode(grammarAccess.getEntidadAccess().getEntidadSimpleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntidadSimple_0=ruleEntidadSimple();

                    state._fsp--;


                    			current = this_EntidadSimple_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRest.g:1781:3: this_EntidadMock_1= ruleEntidadMock
                    {

                    			newCompositeNode(grammarAccess.getEntidadAccess().getEntidadMockParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntidadMock_1=ruleEntidadMock();

                    state._fsp--;


                    			current = this_EntidadMock_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntidad"


    // $ANTLR start "entryRuleEntidadMock"
    // InternalRest.g:1793:1: entryRuleEntidadMock returns [EObject current=null] : iv_ruleEntidadMock= ruleEntidadMock EOF ;
    public final EObject entryRuleEntidadMock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidadMock = null;


        try {
            // InternalRest.g:1793:52: (iv_ruleEntidadMock= ruleEntidadMock EOF )
            // InternalRest.g:1794:2: iv_ruleEntidadMock= ruleEntidadMock EOF
            {
             newCompositeNode(grammarAccess.getEntidadMockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntidadMock=ruleEntidadMock();

            state._fsp--;

             current =iv_ruleEntidadMock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntidadMock"


    // $ANTLR start "ruleEntidadMock"
    // InternalRest.g:1800:1: ruleEntidadMock returns [EObject current=null] : ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_atributos_4_0= ruleAtributo ) )* otherlv_5= '}' ) ;
    public final EObject ruleEntidadMock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_atributos_4_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1806:2: ( ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_atributos_4_0= ruleAtributo ) )* otherlv_5= '}' ) )
            // InternalRest.g:1807:2: ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_atributos_4_0= ruleAtributo ) )* otherlv_5= '}' )
            {
            // InternalRest.g:1807:2: ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_atributos_4_0= ruleAtributo ) )* otherlv_5= '}' )
            // InternalRest.g:1808:3: () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_atributos_4_0= ruleAtributo ) )* otherlv_5= '}'
            {
            // InternalRest.g:1808:3: ()
            // InternalRest.g:1809:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntidadMockAccess().getEntidadMockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getEntidadMockAccess().getEntityKeyword_1());
            		
            // InternalRest.g:1819:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRest.g:1820:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRest.g:1820:4: (lv_name_2_0= RULE_ID )
            // InternalRest.g:1821:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEntidadMockAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntidadMockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getEntidadMockAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRest.g:1841:3: ( (lv_atributos_4_0= ruleAtributo ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||(LA18_0>=72 && LA18_0<=74)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRest.g:1842:4: (lv_atributos_4_0= ruleAtributo )
            	    {
            	    // InternalRest.g:1842:4: (lv_atributos_4_0= ruleAtributo )
            	    // InternalRest.g:1843:5: lv_atributos_4_0= ruleAtributo
            	    {

            	    					newCompositeNode(grammarAccess.getEntidadMockAccess().getAtributosAtributoParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_41);
            	    lv_atributos_4_0=ruleAtributo();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntidadMockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"atributos",
            	    						lv_atributos_4_0,
            	    						"org.xtext.example.mydsl.Rest.Atributo");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_5=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEntidadMockAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntidadMock"


    // $ANTLR start "entryRuleEntidadSimple"
    // InternalRest.g:1868:1: entryRuleEntidadSimple returns [EObject current=null] : iv_ruleEntidadSimple= ruleEntidadSimple EOF ;
    public final EObject entryRuleEntidadSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidadSimple = null;


        try {
            // InternalRest.g:1868:54: (iv_ruleEntidadSimple= ruleEntidadSimple EOF )
            // InternalRest.g:1869:2: iv_ruleEntidadSimple= ruleEntidadSimple EOF
            {
             newCompositeNode(grammarAccess.getEntidadSimpleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntidadSimple=ruleEntidadSimple();

            state._fsp--;

             current =iv_ruleEntidadSimple; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntidadSimple"


    // $ANTLR start "ruleEntidadSimple"
    // InternalRest.g:1875:1: ruleEntidadSimple returns [EObject current=null] : ( () otherlv_1= 'SimpleEntity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_atributos_4_0= ruleAtributo ) )* otherlv_5= '}' ) ;
    public final EObject ruleEntidadSimple() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_atributos_4_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1881:2: ( ( () otherlv_1= 'SimpleEntity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_atributos_4_0= ruleAtributo ) )* otherlv_5= '}' ) )
            // InternalRest.g:1882:2: ( () otherlv_1= 'SimpleEntity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_atributos_4_0= ruleAtributo ) )* otherlv_5= '}' )
            {
            // InternalRest.g:1882:2: ( () otherlv_1= 'SimpleEntity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_atributos_4_0= ruleAtributo ) )* otherlv_5= '}' )
            // InternalRest.g:1883:3: () otherlv_1= 'SimpleEntity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_atributos_4_0= ruleAtributo ) )* otherlv_5= '}'
            {
            // InternalRest.g:1883:3: ()
            // InternalRest.g:1884:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntidadSimpleAccess().getEntidadSimpleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getEntidadSimpleAccess().getSimpleEntityKeyword_1());
            		
            // InternalRest.g:1894:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRest.g:1895:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRest.g:1895:4: (lv_name_2_0= RULE_ID )
            // InternalRest.g:1896:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEntidadSimpleAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntidadSimpleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getEntidadSimpleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRest.g:1916:3: ( (lv_atributos_4_0= ruleAtributo ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||(LA19_0>=72 && LA19_0<=74)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRest.g:1917:4: (lv_atributos_4_0= ruleAtributo )
            	    {
            	    // InternalRest.g:1917:4: (lv_atributos_4_0= ruleAtributo )
            	    // InternalRest.g:1918:5: lv_atributos_4_0= ruleAtributo
            	    {

            	    					newCompositeNode(grammarAccess.getEntidadSimpleAccess().getAtributosAtributoParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_41);
            	    lv_atributos_4_0=ruleAtributo();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntidadSimpleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"atributos",
            	    						lv_atributos_4_0,
            	    						"org.xtext.example.mydsl.Rest.Atributo");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_5=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEntidadSimpleAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntidadSimple"


    // $ANTLR start "entryRuleAtributo"
    // InternalRest.g:1943:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // InternalRest.g:1943:49: (iv_ruleAtributo= ruleAtributo EOF )
            // InternalRest.g:1944:2: iv_ruleAtributo= ruleAtributo EOF
            {
             newCompositeNode(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtributo=ruleAtributo();

            state._fsp--;

             current =iv_ruleAtributo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtributo"


    // $ANTLR start "ruleAtributo"
    // InternalRest.g:1950:1: ruleAtributo returns [EObject current=null] : ( () ( (lv_tipo_1_0= ruleTipoElemento ) ) ( (lv_array_2_0= '[]' ) )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_mocktype_4_0= ruleMock ) )? this_PUNTOCOMA_5= RULE_PUNTOCOMA ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        Token lv_array_2_0=null;
        Token lv_name_3_0=null;
        Token this_PUNTOCOMA_5=null;
        EObject lv_tipo_1_0 = null;

        EObject lv_mocktype_4_0 = null;



        	enterRule();

        try {
            // InternalRest.g:1956:2: ( ( () ( (lv_tipo_1_0= ruleTipoElemento ) ) ( (lv_array_2_0= '[]' ) )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_mocktype_4_0= ruleMock ) )? this_PUNTOCOMA_5= RULE_PUNTOCOMA ) )
            // InternalRest.g:1957:2: ( () ( (lv_tipo_1_0= ruleTipoElemento ) ) ( (lv_array_2_0= '[]' ) )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_mocktype_4_0= ruleMock ) )? this_PUNTOCOMA_5= RULE_PUNTOCOMA )
            {
            // InternalRest.g:1957:2: ( () ( (lv_tipo_1_0= ruleTipoElemento ) ) ( (lv_array_2_0= '[]' ) )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_mocktype_4_0= ruleMock ) )? this_PUNTOCOMA_5= RULE_PUNTOCOMA )
            // InternalRest.g:1958:3: () ( (lv_tipo_1_0= ruleTipoElemento ) ) ( (lv_array_2_0= '[]' ) )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_mocktype_4_0= ruleMock ) )? this_PUNTOCOMA_5= RULE_PUNTOCOMA
            {
            // InternalRest.g:1958:3: ()
            // InternalRest.g:1959:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAtributoAccess().getAtributoAction_0(),
            					current);
            			

            }

            // InternalRest.g:1965:3: ( (lv_tipo_1_0= ruleTipoElemento ) )
            // InternalRest.g:1966:4: (lv_tipo_1_0= ruleTipoElemento )
            {
            // InternalRest.g:1966:4: (lv_tipo_1_0= ruleTipoElemento )
            // InternalRest.g:1967:5: lv_tipo_1_0= ruleTipoElemento
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getTipoTipoElementoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_42);
            lv_tipo_1_0=ruleTipoElemento();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoRule());
            					}
            					set(
            						current,
            						"tipo",
            						lv_tipo_1_0,
            						"org.xtext.example.mydsl.Rest.TipoElemento");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRest.g:1984:3: ( (lv_array_2_0= '[]' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==44) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRest.g:1985:4: (lv_array_2_0= '[]' )
                    {
                    // InternalRest.g:1985:4: (lv_array_2_0= '[]' )
                    // InternalRest.g:1986:5: lv_array_2_0= '[]'
                    {
                    lv_array_2_0=(Token)match(input,44,FOLLOW_10); 

                    					newLeafNode(lv_array_2_0, grammarAccess.getAtributoAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtributoRule());
                    					}
                    					setWithLastConsumed(current, "array", true, "[]");
                    				

                    }


                    }
                    break;

            }

            // InternalRest.g:1998:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalRest.g:1999:4: (lv_name_3_0= RULE_ID )
            {
            // InternalRest.g:1999:4: (lv_name_3_0= RULE_ID )
            // InternalRest.g:2000:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_43); 

            					newLeafNode(lv_name_3_0, grammarAccess.getAtributoAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtributoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRest.g:2016:3: ( (lv_mocktype_4_0= ruleMock ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==52) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRest.g:2017:4: (lv_mocktype_4_0= ruleMock )
                    {
                    // InternalRest.g:2017:4: (lv_mocktype_4_0= ruleMock )
                    // InternalRest.g:2018:5: lv_mocktype_4_0= ruleMock
                    {

                    					newCompositeNode(grammarAccess.getAtributoAccess().getMocktypeMockParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_mocktype_4_0=ruleMock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAtributoRule());
                    					}
                    					set(
                    						current,
                    						"mocktype",
                    						lv_mocktype_4_0,
                    						"org.xtext.example.mydsl.Rest.Mock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_PUNTOCOMA_5=(Token)match(input,RULE_PUNTOCOMA,FOLLOW_2); 

            			newLeafNode(this_PUNTOCOMA_5, grammarAccess.getAtributoAccess().getPUNTOCOMATerminalRuleCall_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtributo"


    // $ANTLR start "entryRuleMock"
    // InternalRest.g:2043:1: entryRuleMock returns [EObject current=null] : iv_ruleMock= ruleMock EOF ;
    public final EObject entryRuleMock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMock = null;


        try {
            // InternalRest.g:2043:45: (iv_ruleMock= ruleMock EOF )
            // InternalRest.g:2044:2: iv_ruleMock= ruleMock EOF
            {
             newCompositeNode(grammarAccess.getMockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMock=ruleMock();

            state._fsp--;

             current =iv_ruleMock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMock"


    // $ANTLR start "ruleMock"
    // InternalRest.g:2050:1: ruleMock returns [EObject current=null] : ( () otherlv_1= '(' ( ( ( (lv_pk_2_0= 'PK' ) )? (this_COMA_3= RULE_COMA ruleMockType )? ) | ruleMockType ) otherlv_6= ')' ) ;
    public final EObject ruleMock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_pk_2_0=null;
        Token this_COMA_3=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalRest.g:2056:2: ( ( () otherlv_1= '(' ( ( ( (lv_pk_2_0= 'PK' ) )? (this_COMA_3= RULE_COMA ruleMockType )? ) | ruleMockType ) otherlv_6= ')' ) )
            // InternalRest.g:2057:2: ( () otherlv_1= '(' ( ( ( (lv_pk_2_0= 'PK' ) )? (this_COMA_3= RULE_COMA ruleMockType )? ) | ruleMockType ) otherlv_6= ')' )
            {
            // InternalRest.g:2057:2: ( () otherlv_1= '(' ( ( ( (lv_pk_2_0= 'PK' ) )? (this_COMA_3= RULE_COMA ruleMockType )? ) | ruleMockType ) otherlv_6= ')' )
            // InternalRest.g:2058:3: () otherlv_1= '(' ( ( ( (lv_pk_2_0= 'PK' ) )? (this_COMA_3= RULE_COMA ruleMockType )? ) | ruleMockType ) otherlv_6= ')'
            {
            // InternalRest.g:2058:3: ()
            // InternalRest.g:2059:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMockAccess().getMockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getMockAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRest.g:2069:3: ( ( ( (lv_pk_2_0= 'PK' ) )? (this_COMA_3= RULE_COMA ruleMockType )? ) | ruleMockType )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_COMA||(LA24_0>=53 && LA24_0<=54)) ) {
                alt24=1;
            }
            else if ( (LA24_0==55) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalRest.g:2070:4: ( ( (lv_pk_2_0= 'PK' ) )? (this_COMA_3= RULE_COMA ruleMockType )? )
                    {
                    // InternalRest.g:2070:4: ( ( (lv_pk_2_0= 'PK' ) )? (this_COMA_3= RULE_COMA ruleMockType )? )
                    // InternalRest.g:2071:5: ( (lv_pk_2_0= 'PK' ) )? (this_COMA_3= RULE_COMA ruleMockType )?
                    {
                    // InternalRest.g:2071:5: ( (lv_pk_2_0= 'PK' ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==53) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalRest.g:2072:6: (lv_pk_2_0= 'PK' )
                            {
                            // InternalRest.g:2072:6: (lv_pk_2_0= 'PK' )
                            // InternalRest.g:2073:7: lv_pk_2_0= 'PK'
                            {
                            lv_pk_2_0=(Token)match(input,53,FOLLOW_45); 

                            							newLeafNode(lv_pk_2_0, grammarAccess.getMockAccess().getPkPKKeyword_2_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMockRule());
                            							}
                            							setWithLastConsumed(current, "pk", true, "PK");
                            						

                            }


                            }
                            break;

                    }

                    // InternalRest.g:2085:5: (this_COMA_3= RULE_COMA ruleMockType )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_COMA) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalRest.g:2086:6: this_COMA_3= RULE_COMA ruleMockType
                            {
                            this_COMA_3=(Token)match(input,RULE_COMA,FOLLOW_44); 

                            						newLeafNode(this_COMA_3, grammarAccess.getMockAccess().getCOMATerminalRuleCall_2_0_1_0());
                            					

                            						newCompositeNode(grammarAccess.getMockAccess().getMockTypeParserRuleCall_2_0_1_1());
                            					
                            pushFollow(FOLLOW_46);
                            ruleMockType();

                            state._fsp--;


                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRest.g:2100:4: ruleMockType
                    {

                    				newCompositeNode(grammarAccess.getMockAccess().getMockTypeParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_46);
                    ruleMockType();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,54,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMockAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMock"


    // $ANTLR start "entryRuleMockType"
    // InternalRest.g:2116:1: entryRuleMockType returns [String current=null] : iv_ruleMockType= ruleMockType EOF ;
    public final String entryRuleMockType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMockType = null;


        try {
            // InternalRest.g:2116:48: (iv_ruleMockType= ruleMockType EOF )
            // InternalRest.g:2117:2: iv_ruleMockType= ruleMockType EOF
            {
             newCompositeNode(grammarAccess.getMockTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMockType=ruleMockType();

            state._fsp--;

             current =iv_ruleMockType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMockType"


    // $ANTLR start "ruleMockType"
    // InternalRest.g:2123:1: ruleMockType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'mockType' this_IGUAL_1= RULE_IGUAL this_TipoMock_2= ruleTipoMock ) ;
    public final AntlrDatatypeRuleToken ruleMockType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IGUAL_1=null;
        AntlrDatatypeRuleToken this_TipoMock_2 = null;



        	enterRule();

        try {
            // InternalRest.g:2129:2: ( (kw= 'mockType' this_IGUAL_1= RULE_IGUAL this_TipoMock_2= ruleTipoMock ) )
            // InternalRest.g:2130:2: (kw= 'mockType' this_IGUAL_1= RULE_IGUAL this_TipoMock_2= ruleTipoMock )
            {
            // InternalRest.g:2130:2: (kw= 'mockType' this_IGUAL_1= RULE_IGUAL this_TipoMock_2= ruleTipoMock )
            // InternalRest.g:2131:3: kw= 'mockType' this_IGUAL_1= RULE_IGUAL this_TipoMock_2= ruleTipoMock
            {
            kw=(Token)match(input,55,FOLLOW_3); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMockTypeAccess().getMockTypeKeyword_0());
            		
            this_IGUAL_1=(Token)match(input,RULE_IGUAL,FOLLOW_47); 

            			current.merge(this_IGUAL_1);
            		

            			newLeafNode(this_IGUAL_1, grammarAccess.getMockTypeAccess().getIGUALTerminalRuleCall_1());
            		

            			newCompositeNode(grammarAccess.getMockTypeAccess().getTipoMockParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_TipoMock_2=ruleTipoMock();

            state._fsp--;


            			current.merge(this_TipoMock_2);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMockType"


    // $ANTLR start "entryRuleTipoMock"
    // InternalRest.g:2157:1: entryRuleTipoMock returns [String current=null] : iv_ruleTipoMock= ruleTipoMock EOF ;
    public final String entryRuleTipoMock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoMock = null;


        try {
            // InternalRest.g:2157:48: (iv_ruleTipoMock= ruleTipoMock EOF )
            // InternalRest.g:2158:2: iv_ruleTipoMock= ruleTipoMock EOF
            {
             newCompositeNode(grammarAccess.getTipoMockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTipoMock=ruleTipoMock();

            state._fsp--;

             current =iv_ruleTipoMock.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTipoMock"


    // $ANTLR start "ruleTipoMock"
    // InternalRest.g:2164:1: ruleTipoMock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'FirstNameType' | kw= 'FirstNameMaleType' | kw= 'LastNameType' | kw= 'FamilyNameType' | kw= 'FullNameType' | kw= 'GenderType' | kw= 'EmailAddressType' | kw= 'PhoneType' | kw= 'CountryType' | kw= 'CityType' | kw= 'CountryCodeType' | kw= 'LatitudeType' | kw= 'LongitudeType' | kw= 'RowNumberType' | kw= 'BooleanType' | kw= 'FirstNameFemaleType' ) ;
    public final AntlrDatatypeRuleToken ruleTipoMock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRest.g:2170:2: ( (kw= 'FirstNameType' | kw= 'FirstNameMaleType' | kw= 'LastNameType' | kw= 'FamilyNameType' | kw= 'FullNameType' | kw= 'GenderType' | kw= 'EmailAddressType' | kw= 'PhoneType' | kw= 'CountryType' | kw= 'CityType' | kw= 'CountryCodeType' | kw= 'LatitudeType' | kw= 'LongitudeType' | kw= 'RowNumberType' | kw= 'BooleanType' | kw= 'FirstNameFemaleType' ) )
            // InternalRest.g:2171:2: (kw= 'FirstNameType' | kw= 'FirstNameMaleType' | kw= 'LastNameType' | kw= 'FamilyNameType' | kw= 'FullNameType' | kw= 'GenderType' | kw= 'EmailAddressType' | kw= 'PhoneType' | kw= 'CountryType' | kw= 'CityType' | kw= 'CountryCodeType' | kw= 'LatitudeType' | kw= 'LongitudeType' | kw= 'RowNumberType' | kw= 'BooleanType' | kw= 'FirstNameFemaleType' )
            {
            // InternalRest.g:2171:2: (kw= 'FirstNameType' | kw= 'FirstNameMaleType' | kw= 'LastNameType' | kw= 'FamilyNameType' | kw= 'FullNameType' | kw= 'GenderType' | kw= 'EmailAddressType' | kw= 'PhoneType' | kw= 'CountryType' | kw= 'CityType' | kw= 'CountryCodeType' | kw= 'LatitudeType' | kw= 'LongitudeType' | kw= 'RowNumberType' | kw= 'BooleanType' | kw= 'FirstNameFemaleType' )
            int alt25=16;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt25=1;
                }
                break;
            case 57:
                {
                alt25=2;
                }
                break;
            case 58:
                {
                alt25=3;
                }
                break;
            case 59:
                {
                alt25=4;
                }
                break;
            case 60:
                {
                alt25=5;
                }
                break;
            case 61:
                {
                alt25=6;
                }
                break;
            case 62:
                {
                alt25=7;
                }
                break;
            case 63:
                {
                alt25=8;
                }
                break;
            case 64:
                {
                alt25=9;
                }
                break;
            case 65:
                {
                alt25=10;
                }
                break;
            case 66:
                {
                alt25=11;
                }
                break;
            case 67:
                {
                alt25=12;
                }
                break;
            case 68:
                {
                alt25=13;
                }
                break;
            case 69:
                {
                alt25=14;
                }
                break;
            case 70:
                {
                alt25=15;
                }
                break;
            case 71:
                {
                alt25=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalRest.g:2172:3: kw= 'FirstNameType'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoMockAccess().getFirstNameTypeKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRest.g:2178:3: kw= 'FirstNameMaleType'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoMockAccess().getFirstNameMaleTypeKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRest.g:2184:3: kw= 'LastNameType'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoMockAccess().getLastNameTypeKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalRest.g:2190:3: kw= 'FamilyNameType'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoMockAccess().getFamilyNameTypeKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalRest.g:2196:3: kw= 'FullNameType'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoMockAccess().getFullNameTypeKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalRest.g:2202:3: kw= 'GenderType'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoMockAccess().getGenderTypeKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalRest.g:2208:3: kw= 'EmailAddressType'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoMockAccess().getEmailAddressTypeKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalRest.g:2214:3: kw= 'PhoneType'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoMockAccess().getPhoneTypeKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalRest.g:2220:3: kw= 'CountryType'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoMockAccess().getCountryTypeKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalRest.g:2226:3: kw= 'CityType'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoMockAccess().getCityTypeKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalRest.g:2232:3: kw= 'CountryCodeType'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoMockAccess().getCountryCodeTypeKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalRest.g:2238:3: kw= 'LatitudeType'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoMockAccess().getLatitudeTypeKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalRest.g:2244:3: kw= 'LongitudeType'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoMockAccess().getLongitudeTypeKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalRest.g:2250:3: kw= 'RowNumberType'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoMockAccess().getRowNumberTypeKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalRest.g:2256:3: kw= 'BooleanType'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoMockAccess().getBooleanTypeKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalRest.g:2262:3: kw= 'FirstNameFemaleType'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoMockAccess().getFirstNameFemaleTypeKeyword_15());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoMock"


    // $ANTLR start "entryRuleTipoElemento"
    // InternalRest.g:2271:1: entryRuleTipoElemento returns [EObject current=null] : iv_ruleTipoElemento= ruleTipoElemento EOF ;
    public final EObject entryRuleTipoElemento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoElemento = null;


        try {
            // InternalRest.g:2271:53: (iv_ruleTipoElemento= ruleTipoElemento EOF )
            // InternalRest.g:2272:2: iv_ruleTipoElemento= ruleTipoElemento EOF
            {
             newCompositeNode(grammarAccess.getTipoElementoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTipoElemento=ruleTipoElemento();

            state._fsp--;

             current =iv_ruleTipoElemento; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTipoElemento"


    // $ANTLR start "ruleTipoElemento"
    // InternalRest.g:2278:1: ruleTipoElemento returns [EObject current=null] : (this_TipoBasico_0= ruleTipoBasico | this_TipoEntidad_1= ruleTipoEntidad ) ;
    public final EObject ruleTipoElemento() throws RecognitionException {
        EObject current = null;

        EObject this_TipoBasico_0 = null;

        EObject this_TipoEntidad_1 = null;



        	enterRule();

        try {
            // InternalRest.g:2284:2: ( (this_TipoBasico_0= ruleTipoBasico | this_TipoEntidad_1= ruleTipoEntidad ) )
            // InternalRest.g:2285:2: (this_TipoBasico_0= ruleTipoBasico | this_TipoEntidad_1= ruleTipoEntidad )
            {
            // InternalRest.g:2285:2: (this_TipoBasico_0= ruleTipoBasico | this_TipoEntidad_1= ruleTipoEntidad )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=72 && LA26_0<=74)) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ID) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalRest.g:2286:3: this_TipoBasico_0= ruleTipoBasico
                    {

                    			newCompositeNode(grammarAccess.getTipoElementoAccess().getTipoBasicoParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TipoBasico_0=ruleTipoBasico();

                    state._fsp--;


                    			current = this_TipoBasico_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRest.g:2295:3: this_TipoEntidad_1= ruleTipoEntidad
                    {

                    			newCompositeNode(grammarAccess.getTipoElementoAccess().getTipoEntidadParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TipoEntidad_1=ruleTipoEntidad();

                    state._fsp--;


                    			current = this_TipoEntidad_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoElemento"


    // $ANTLR start "entryRuleTipoEntidad"
    // InternalRest.g:2307:1: entryRuleTipoEntidad returns [EObject current=null] : iv_ruleTipoEntidad= ruleTipoEntidad EOF ;
    public final EObject entryRuleTipoEntidad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoEntidad = null;


        try {
            // InternalRest.g:2307:52: (iv_ruleTipoEntidad= ruleTipoEntidad EOF )
            // InternalRest.g:2308:2: iv_ruleTipoEntidad= ruleTipoEntidad EOF
            {
             newCompositeNode(grammarAccess.getTipoEntidadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTipoEntidad=ruleTipoEntidad();

            state._fsp--;

             current =iv_ruleTipoEntidad; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTipoEntidad"


    // $ANTLR start "ruleTipoEntidad"
    // InternalRest.g:2314:1: ruleTipoEntidad returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleTipoEntidad() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRest.g:2320:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRest.g:2321:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRest.g:2321:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalRest.g:2322:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalRest.g:2322:3: ()
            // InternalRest.g:2323:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTipoEntidadAccess().getTipoEntidadAction_0(),
            					current);
            			

            }

            // InternalRest.g:2329:3: ( (otherlv_1= RULE_ID ) )
            // InternalRest.g:2330:4: (otherlv_1= RULE_ID )
            {
            // InternalRest.g:2330:4: (otherlv_1= RULE_ID )
            // InternalRest.g:2331:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTipoEntidadRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getTipoEntidadAccess().getEntidadEntidadCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoEntidad"


    // $ANTLR start "entryRuleTipoBasico"
    // InternalRest.g:2346:1: entryRuleTipoBasico returns [EObject current=null] : iv_ruleTipoBasico= ruleTipoBasico EOF ;
    public final EObject entryRuleTipoBasico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoBasico = null;


        try {
            // InternalRest.g:2346:51: (iv_ruleTipoBasico= ruleTipoBasico EOF )
            // InternalRest.g:2347:2: iv_ruleTipoBasico= ruleTipoBasico EOF
            {
             newCompositeNode(grammarAccess.getTipoBasicoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTipoBasico=ruleTipoBasico();

            state._fsp--;

             current =iv_ruleTipoBasico; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTipoBasico"


    // $ANTLR start "ruleTipoBasico"
    // InternalRest.g:2353:1: ruleTipoBasico returns [EObject current=null] : ( () ( ( (lv_name_1_1= 'string' | lv_name_1_2= 'int' | lv_name_1_3= 'boolean' ) ) ) ) ;
    public final EObject ruleTipoBasico() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token lv_name_1_3=null;


        	enterRule();

        try {
            // InternalRest.g:2359:2: ( ( () ( ( (lv_name_1_1= 'string' | lv_name_1_2= 'int' | lv_name_1_3= 'boolean' ) ) ) ) )
            // InternalRest.g:2360:2: ( () ( ( (lv_name_1_1= 'string' | lv_name_1_2= 'int' | lv_name_1_3= 'boolean' ) ) ) )
            {
            // InternalRest.g:2360:2: ( () ( ( (lv_name_1_1= 'string' | lv_name_1_2= 'int' | lv_name_1_3= 'boolean' ) ) ) )
            // InternalRest.g:2361:3: () ( ( (lv_name_1_1= 'string' | lv_name_1_2= 'int' | lv_name_1_3= 'boolean' ) ) )
            {
            // InternalRest.g:2361:3: ()
            // InternalRest.g:2362:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTipoBasicoAccess().getTipoBasicoAction_0(),
            					current);
            			

            }

            // InternalRest.g:2368:3: ( ( (lv_name_1_1= 'string' | lv_name_1_2= 'int' | lv_name_1_3= 'boolean' ) ) )
            // InternalRest.g:2369:4: ( (lv_name_1_1= 'string' | lv_name_1_2= 'int' | lv_name_1_3= 'boolean' ) )
            {
            // InternalRest.g:2369:4: ( (lv_name_1_1= 'string' | lv_name_1_2= 'int' | lv_name_1_3= 'boolean' ) )
            // InternalRest.g:2370:5: (lv_name_1_1= 'string' | lv_name_1_2= 'int' | lv_name_1_3= 'boolean' )
            {
            // InternalRest.g:2370:5: (lv_name_1_1= 'string' | lv_name_1_2= 'int' | lv_name_1_3= 'boolean' )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt27=1;
                }
                break;
            case 73:
                {
                alt27=2;
                }
                break;
            case 74:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalRest.g:2371:6: lv_name_1_1= 'string'
                    {
                    lv_name_1_1=(Token)match(input,72,FOLLOW_2); 

                    						newLeafNode(lv_name_1_1, grammarAccess.getTipoBasicoAccess().getNameStringKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTipoBasicoRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalRest.g:2382:6: lv_name_1_2= 'int'
                    {
                    lv_name_1_2=(Token)match(input,73,FOLLOW_2); 

                    						newLeafNode(lv_name_1_2, grammarAccess.getTipoBasicoAccess().getNameIntKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTipoBasicoRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalRest.g:2393:6: lv_name_1_3= 'boolean'
                    {
                    lv_name_1_3=(Token)match(input,74,FOLLOW_2); 

                    						newLeafNode(lv_name_1_3, grammarAccess.getTipoBasicoAccess().getNameBooleanKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTipoBasicoRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_1_3, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoBasico"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000C03A000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000003A000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000084000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020007900L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000007900L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000220L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000220L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000700L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001C00000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000002000080L,0x0000000000000700L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000100000000080L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0010000000000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00E0000000008000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0040000000008000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0xFF00000000000000L,0x00000000000000FFL});

}