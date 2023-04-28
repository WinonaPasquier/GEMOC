package l3IAProjectHTML.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import l3IAProjectHTML.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'Column'", "':'", "'abs'", "'Graph'", "'{'", "'graphName'", "'graphType'", "'}'", "'File'", "'line'", "'bar'", "'pie'", "'doughnut'", "'scatter'", "'bubble'", "'radar'", "'polarArea'", "'none'", "'='", "'>'", "'<'", "'>='", "'<='", "'!='"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalMyDsl.g:65:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalMyDsl.g:65:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalMyDsl.g:66:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMyDsl.g:72:1: ruleProgram returns [EObject current=null] : ( ( ( (lv_filter_0_0= ruleFilter ) ) ( (lv_filter_1_0= ruleFilter ) )* )? ( (lv_fileloader_2_0= ruleFileLoader ) ) (otherlv_3= ',' ( (lv_fileloader_4_0= ruleFileLoader ) ) )* ( ( (lv_graph_5_0= ruleGraph ) ) (otherlv_6= ',' ( (lv_graph_7_0= ruleGraph ) ) )* )? ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_filter_0_0 = null;

        EObject lv_filter_1_0 = null;

        EObject lv_fileloader_2_0 = null;

        EObject lv_fileloader_4_0 = null;

        EObject lv_graph_5_0 = null;

        EObject lv_graph_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( ( ( (lv_filter_0_0= ruleFilter ) ) ( (lv_filter_1_0= ruleFilter ) )* )? ( (lv_fileloader_2_0= ruleFileLoader ) ) (otherlv_3= ',' ( (lv_fileloader_4_0= ruleFileLoader ) ) )* ( ( (lv_graph_5_0= ruleGraph ) ) (otherlv_6= ',' ( (lv_graph_7_0= ruleGraph ) ) )* )? ) )
            // InternalMyDsl.g:79:2: ( ( ( (lv_filter_0_0= ruleFilter ) ) ( (lv_filter_1_0= ruleFilter ) )* )? ( (lv_fileloader_2_0= ruleFileLoader ) ) (otherlv_3= ',' ( (lv_fileloader_4_0= ruleFileLoader ) ) )* ( ( (lv_graph_5_0= ruleGraph ) ) (otherlv_6= ',' ( (lv_graph_7_0= ruleGraph ) ) )* )? )
            {
            // InternalMyDsl.g:79:2: ( ( ( (lv_filter_0_0= ruleFilter ) ) ( (lv_filter_1_0= ruleFilter ) )* )? ( (lv_fileloader_2_0= ruleFileLoader ) ) (otherlv_3= ',' ( (lv_fileloader_4_0= ruleFileLoader ) ) )* ( ( (lv_graph_5_0= ruleGraph ) ) (otherlv_6= ',' ( (lv_graph_7_0= ruleGraph ) ) )* )? )
            // InternalMyDsl.g:80:3: ( ( (lv_filter_0_0= ruleFilter ) ) ( (lv_filter_1_0= ruleFilter ) )* )? ( (lv_fileloader_2_0= ruleFileLoader ) ) (otherlv_3= ',' ( (lv_fileloader_4_0= ruleFileLoader ) ) )* ( ( (lv_graph_5_0= ruleGraph ) ) (otherlv_6= ',' ( (lv_graph_7_0= ruleGraph ) ) )* )?
            {
            // InternalMyDsl.g:80:3: ( ( (lv_filter_0_0= ruleFilter ) ) ( (lv_filter_1_0= ruleFilter ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:81:4: ( (lv_filter_0_0= ruleFilter ) ) ( (lv_filter_1_0= ruleFilter ) )*
                    {
                    // InternalMyDsl.g:81:4: ( (lv_filter_0_0= ruleFilter ) )
                    // InternalMyDsl.g:82:5: (lv_filter_0_0= ruleFilter )
                    {
                    // InternalMyDsl.g:82:5: (lv_filter_0_0= ruleFilter )
                    // InternalMyDsl.g:83:6: lv_filter_0_0= ruleFilter
                    {

                    						newCompositeNode(grammarAccess.getProgramAccess().getFilterFilterParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_filter_0_0=ruleFilter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProgramRule());
                    						}
                    						add(
                    							current,
                    							"filter",
                    							lv_filter_0_0,
                    							"l3IAProjectHTML.MyDsl.Filter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:100:4: ( (lv_filter_1_0= ruleFilter ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==12) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyDsl.g:101:5: (lv_filter_1_0= ruleFilter )
                    	    {
                    	    // InternalMyDsl.g:101:5: (lv_filter_1_0= ruleFilter )
                    	    // InternalMyDsl.g:102:6: lv_filter_1_0= ruleFilter
                    	    {

                    	    						newCompositeNode(grammarAccess.getProgramAccess().getFilterFilterParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_3);
                    	    lv_filter_1_0=ruleFilter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getProgramRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"filter",
                    	    							lv_filter_1_0,
                    	    							"l3IAProjectHTML.MyDsl.Filter");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:120:3: ( (lv_fileloader_2_0= ruleFileLoader ) )
            // InternalMyDsl.g:121:4: (lv_fileloader_2_0= ruleFileLoader )
            {
            // InternalMyDsl.g:121:4: (lv_fileloader_2_0= ruleFileLoader )
            // InternalMyDsl.g:122:5: lv_fileloader_2_0= ruleFileLoader
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getFileloaderFileLoaderParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_fileloader_2_0=ruleFileLoader();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					add(
            						current,
            						"fileloader",
            						lv_fileloader_2_0,
            						"l3IAProjectHTML.MyDsl.FileLoader");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:139:3: (otherlv_3= ',' ( (lv_fileloader_4_0= ruleFileLoader ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:140:4: otherlv_3= ',' ( (lv_fileloader_4_0= ruleFileLoader ) )
            	    {
            	    otherlv_3=(Token)match(input,11,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getProgramAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:144:4: ( (lv_fileloader_4_0= ruleFileLoader ) )
            	    // InternalMyDsl.g:145:5: (lv_fileloader_4_0= ruleFileLoader )
            	    {
            	    // InternalMyDsl.g:145:5: (lv_fileloader_4_0= ruleFileLoader )
            	    // InternalMyDsl.g:146:6: lv_fileloader_4_0= ruleFileLoader
            	    {

            	    						newCompositeNode(grammarAccess.getProgramAccess().getFileloaderFileLoaderParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_fileloader_4_0=ruleFileLoader();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProgramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"fileloader",
            	    							lv_fileloader_4_0,
            	    							"l3IAProjectHTML.MyDsl.FileLoader");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalMyDsl.g:164:3: ( ( (lv_graph_5_0= ruleGraph ) ) (otherlv_6= ',' ( (lv_graph_7_0= ruleGraph ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:165:4: ( (lv_graph_5_0= ruleGraph ) ) (otherlv_6= ',' ( (lv_graph_7_0= ruleGraph ) ) )*
                    {
                    // InternalMyDsl.g:165:4: ( (lv_graph_5_0= ruleGraph ) )
                    // InternalMyDsl.g:166:5: (lv_graph_5_0= ruleGraph )
                    {
                    // InternalMyDsl.g:166:5: (lv_graph_5_0= ruleGraph )
                    // InternalMyDsl.g:167:6: lv_graph_5_0= ruleGraph
                    {

                    						newCompositeNode(grammarAccess.getProgramAccess().getGraphGraphParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_graph_5_0=ruleGraph();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProgramRule());
                    						}
                    						add(
                    							current,
                    							"graph",
                    							lv_graph_5_0,
                    							"l3IAProjectHTML.MyDsl.Graph");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:184:4: (otherlv_6= ',' ( (lv_graph_7_0= ruleGraph ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==11) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:185:5: otherlv_6= ',' ( (lv_graph_7_0= ruleGraph ) )
                    	    {
                    	    otherlv_6=(Token)match(input,11,FOLLOW_6); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getProgramAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalMyDsl.g:189:5: ( (lv_graph_7_0= ruleGraph ) )
                    	    // InternalMyDsl.g:190:6: (lv_graph_7_0= ruleGraph )
                    	    {
                    	    // InternalMyDsl.g:190:6: (lv_graph_7_0= ruleGraph )
                    	    // InternalMyDsl.g:191:7: lv_graph_7_0= ruleGraph
                    	    {

                    	    							newCompositeNode(grammarAccess.getProgramAccess().getGraphGraphParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_graph_7_0=ruleGraph();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProgramRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"graph",
                    	    								lv_graph_7_0,
                    	    								"l3IAProjectHTML.MyDsl.Graph");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleFilter"
    // InternalMyDsl.g:214:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalMyDsl.g:214:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalMyDsl.g:215:2: iv_ruleFilter= ruleFilter EOF
            {
             newCompositeNode(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilter=ruleFilter();

            state._fsp--;

             current =iv_ruleFilter; 
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
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalMyDsl.g:221:1: ruleFilter returns [EObject current=null] : (otherlv_0= 'Column' otherlv_1= ':' () ( (lv_columnname_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_abs_5_0= 'abs' ) ) )? ( (lv_comparaison_6_0= ruleEnumComparaison ) )? ( (lv_elementComparaison_7_0= ruleEString ) )? ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token lv_abs_5_0=null;
        AntlrDatatypeRuleToken lv_columnname_3_0 = null;

        Enumerator lv_comparaison_6_0 = null;

        AntlrDatatypeRuleToken lv_elementComparaison_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:227:2: ( (otherlv_0= 'Column' otherlv_1= ':' () ( (lv_columnname_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_abs_5_0= 'abs' ) ) )? ( (lv_comparaison_6_0= ruleEnumComparaison ) )? ( (lv_elementComparaison_7_0= ruleEString ) )? ) )
            // InternalMyDsl.g:228:2: (otherlv_0= 'Column' otherlv_1= ':' () ( (lv_columnname_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_abs_5_0= 'abs' ) ) )? ( (lv_comparaison_6_0= ruleEnumComparaison ) )? ( (lv_elementComparaison_7_0= ruleEString ) )? )
            {
            // InternalMyDsl.g:228:2: (otherlv_0= 'Column' otherlv_1= ':' () ( (lv_columnname_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_abs_5_0= 'abs' ) ) )? ( (lv_comparaison_6_0= ruleEnumComparaison ) )? ( (lv_elementComparaison_7_0= ruleEString ) )? )
            // InternalMyDsl.g:229:3: otherlv_0= 'Column' otherlv_1= ':' () ( (lv_columnname_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_abs_5_0= 'abs' ) ) )? ( (lv_comparaison_6_0= ruleEnumComparaison ) )? ( (lv_elementComparaison_7_0= ruleEString ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getFilterAccess().getColumnKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFilterAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:237:3: ()
            // InternalMyDsl.g:238:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFilterAccess().getFilterAction_2(),
            					current);
            			

            }

            // InternalMyDsl.g:244:3: ( (lv_columnname_3_0= ruleEString ) )
            // InternalMyDsl.g:245:4: (lv_columnname_3_0= ruleEString )
            {
            // InternalMyDsl.g:245:4: (lv_columnname_3_0= ruleEString )
            // InternalMyDsl.g:246:5: lv_columnname_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFilterAccess().getColumnnameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_columnname_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterRule());
            					}
            					set(
            						current,
            						"columnname",
            						lv_columnname_3_0,
            						"l3IAProjectHTML.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:263:3: (otherlv_4= ',' ( (lv_abs_5_0= 'abs' ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:264:4: otherlv_4= ',' ( (lv_abs_5_0= 'abs' ) )
                    {
                    otherlv_4=(Token)match(input,11,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getFilterAccess().getCommaKeyword_4_0());
                    			
                    // InternalMyDsl.g:268:4: ( (lv_abs_5_0= 'abs' ) )
                    // InternalMyDsl.g:269:5: (lv_abs_5_0= 'abs' )
                    {
                    // InternalMyDsl.g:269:5: (lv_abs_5_0= 'abs' )
                    // InternalMyDsl.g:270:6: lv_abs_5_0= 'abs'
                    {
                    lv_abs_5_0=(Token)match(input,14,FOLLOW_11); 

                    						newLeafNode(lv_abs_5_0, grammarAccess.getFilterAccess().getAbsAbsKeyword_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFilterRule());
                    						}
                    						setWithLastConsumed(current, "abs", lv_abs_5_0 != null, "abs");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:283:3: ( (lv_comparaison_6_0= ruleEnumComparaison ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=29 && LA7_0<=35)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:284:4: (lv_comparaison_6_0= ruleEnumComparaison )
                    {
                    // InternalMyDsl.g:284:4: (lv_comparaison_6_0= ruleEnumComparaison )
                    // InternalMyDsl.g:285:5: lv_comparaison_6_0= ruleEnumComparaison
                    {

                    					newCompositeNode(grammarAccess.getFilterAccess().getComparaisonEnumComparaisonEnumRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_comparaison_6_0=ruleEnumComparaison();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFilterRule());
                    					}
                    					set(
                    						current,
                    						"comparaison",
                    						lv_comparaison_6_0,
                    						"l3IAProjectHTML.MyDsl.EnumComparaison");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:302:3: ( (lv_elementComparaison_7_0= ruleEString ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:303:4: (lv_elementComparaison_7_0= ruleEString )
                    {
                    // InternalMyDsl.g:303:4: (lv_elementComparaison_7_0= ruleEString )
                    // InternalMyDsl.g:304:5: lv_elementComparaison_7_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getFilterAccess().getElementComparaisonEStringParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_elementComparaison_7_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFilterRule());
                    					}
                    					set(
                    						current,
                    						"elementComparaison",
                    						lv_elementComparaison_7_0,
                    						"l3IAProjectHTML.MyDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleGraph"
    // InternalMyDsl.g:325:1: entryRuleGraph returns [EObject current=null] : iv_ruleGraph= ruleGraph EOF ;
    public final EObject entryRuleGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraph = null;


        try {
            // InternalMyDsl.g:325:46: (iv_ruleGraph= ruleGraph EOF )
            // InternalMyDsl.g:326:2: iv_ruleGraph= ruleGraph EOF
            {
             newCompositeNode(grammarAccess.getGraphRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraph=ruleGraph();

            state._fsp--;

             current =iv_ruleGraph; 
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
    // $ANTLR end "entryRuleGraph"


    // $ANTLR start "ruleGraph"
    // InternalMyDsl.g:332:1: ruleGraph returns [EObject current=null] : (otherlv_0= 'Graph' otherlv_1= '{' otherlv_2= 'graphName' otherlv_3= ':' ( (lv_graphname_4_0= ruleEString ) ) otherlv_5= 'graphType' otherlv_6= ':' ( (lv_graphtype_7_0= ruleEnumType ) ) otherlv_8= '}' ) ;
    public final EObject ruleGraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_graphname_4_0 = null;

        Enumerator lv_graphtype_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:338:2: ( (otherlv_0= 'Graph' otherlv_1= '{' otherlv_2= 'graphName' otherlv_3= ':' ( (lv_graphname_4_0= ruleEString ) ) otherlv_5= 'graphType' otherlv_6= ':' ( (lv_graphtype_7_0= ruleEnumType ) ) otherlv_8= '}' ) )
            // InternalMyDsl.g:339:2: (otherlv_0= 'Graph' otherlv_1= '{' otherlv_2= 'graphName' otherlv_3= ':' ( (lv_graphname_4_0= ruleEString ) ) otherlv_5= 'graphType' otherlv_6= ':' ( (lv_graphtype_7_0= ruleEnumType ) ) otherlv_8= '}' )
            {
            // InternalMyDsl.g:339:2: (otherlv_0= 'Graph' otherlv_1= '{' otherlv_2= 'graphName' otherlv_3= ':' ( (lv_graphname_4_0= ruleEString ) ) otherlv_5= 'graphType' otherlv_6= ':' ( (lv_graphtype_7_0= ruleEnumType ) ) otherlv_8= '}' )
            // InternalMyDsl.g:340:3: otherlv_0= 'Graph' otherlv_1= '{' otherlv_2= 'graphName' otherlv_3= ':' ( (lv_graphname_4_0= ruleEString ) ) otherlv_5= 'graphType' otherlv_6= ':' ( (lv_graphtype_7_0= ruleEnumType ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphAccess().getGraphKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphAccess().getGraphNameKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphAccess().getColonKeyword_3());
            		
            // InternalMyDsl.g:356:3: ( (lv_graphname_4_0= ruleEString ) )
            // InternalMyDsl.g:357:4: (lv_graphname_4_0= ruleEString )
            {
            // InternalMyDsl.g:357:4: (lv_graphname_4_0= ruleEString )
            // InternalMyDsl.g:358:5: lv_graphname_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphAccess().getGraphnameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_graphname_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphRule());
            					}
            					set(
            						current,
            						"graphname",
            						lv_graphname_4_0,
            						"l3IAProjectHTML.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getGraphAccess().getGraphTypeKeyword_5());
            		
            otherlv_6=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getGraphAccess().getColonKeyword_6());
            		
            // InternalMyDsl.g:383:3: ( (lv_graphtype_7_0= ruleEnumType ) )
            // InternalMyDsl.g:384:4: (lv_graphtype_7_0= ruleEnumType )
            {
            // InternalMyDsl.g:384:4: (lv_graphtype_7_0= ruleEnumType )
            // InternalMyDsl.g:385:5: lv_graphtype_7_0= ruleEnumType
            {

            					newCompositeNode(grammarAccess.getGraphAccess().getGraphtypeEnumTypeEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_17);
            lv_graphtype_7_0=ruleEnumType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphRule());
            					}
            					set(
            						current,
            						"graphtype",
            						lv_graphtype_7_0,
            						"l3IAProjectHTML.MyDsl.EnumType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getGraphAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleGraph"


    // $ANTLR start "entryRuleFileLoader"
    // InternalMyDsl.g:410:1: entryRuleFileLoader returns [EObject current=null] : iv_ruleFileLoader= ruleFileLoader EOF ;
    public final EObject entryRuleFileLoader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileLoader = null;


        try {
            // InternalMyDsl.g:410:51: (iv_ruleFileLoader= ruleFileLoader EOF )
            // InternalMyDsl.g:411:2: iv_ruleFileLoader= ruleFileLoader EOF
            {
             newCompositeNode(grammarAccess.getFileLoaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFileLoader=ruleFileLoader();

            state._fsp--;

             current =iv_ruleFileLoader; 
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
    // $ANTLR end "entryRuleFileLoader"


    // $ANTLR start "ruleFileLoader"
    // InternalMyDsl.g:417:1: ruleFileLoader returns [EObject current=null] : ( () otherlv_1= 'File' otherlv_2= ':' ( (lv_path_3_0= ruleEString ) ) ) ;
    public final EObject ruleFileLoader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_path_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:423:2: ( ( () otherlv_1= 'File' otherlv_2= ':' ( (lv_path_3_0= ruleEString ) ) ) )
            // InternalMyDsl.g:424:2: ( () otherlv_1= 'File' otherlv_2= ':' ( (lv_path_3_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:424:2: ( () otherlv_1= 'File' otherlv_2= ':' ( (lv_path_3_0= ruleEString ) ) )
            // InternalMyDsl.g:425:3: () otherlv_1= 'File' otherlv_2= ':' ( (lv_path_3_0= ruleEString ) )
            {
            // InternalMyDsl.g:425:3: ()
            // InternalMyDsl.g:426:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFileLoaderAccess().getFileLoaderAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getFileLoaderAccess().getFileKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getFileLoaderAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:440:3: ( (lv_path_3_0= ruleEString ) )
            // InternalMyDsl.g:441:4: (lv_path_3_0= ruleEString )
            {
            // InternalMyDsl.g:441:4: (lv_path_3_0= ruleEString )
            // InternalMyDsl.g:442:5: lv_path_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFileLoaderAccess().getPathEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_path_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFileLoaderRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_3_0,
            						"l3IAProjectHTML.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleFileLoader"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:463:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:463:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:464:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:470:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:476:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:477:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:477:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:478:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:486:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleEnumType"
    // InternalMyDsl.g:497:1: ruleEnumType returns [Enumerator current=null] : ( (enumLiteral_0= 'line' ) | (enumLiteral_1= 'bar' ) | (enumLiteral_2= 'pie' ) | (enumLiteral_3= 'doughnut' ) | (enumLiteral_4= 'scatter' ) | (enumLiteral_5= 'bubble' ) | (enumLiteral_6= 'radar' ) | (enumLiteral_7= 'polarArea' ) ) ;
    public final Enumerator ruleEnumType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:503:2: ( ( (enumLiteral_0= 'line' ) | (enumLiteral_1= 'bar' ) | (enumLiteral_2= 'pie' ) | (enumLiteral_3= 'doughnut' ) | (enumLiteral_4= 'scatter' ) | (enumLiteral_5= 'bubble' ) | (enumLiteral_6= 'radar' ) | (enumLiteral_7= 'polarArea' ) ) )
            // InternalMyDsl.g:504:2: ( (enumLiteral_0= 'line' ) | (enumLiteral_1= 'bar' ) | (enumLiteral_2= 'pie' ) | (enumLiteral_3= 'doughnut' ) | (enumLiteral_4= 'scatter' ) | (enumLiteral_5= 'bubble' ) | (enumLiteral_6= 'radar' ) | (enumLiteral_7= 'polarArea' ) )
            {
            // InternalMyDsl.g:504:2: ( (enumLiteral_0= 'line' ) | (enumLiteral_1= 'bar' ) | (enumLiteral_2= 'pie' ) | (enumLiteral_3= 'doughnut' ) | (enumLiteral_4= 'scatter' ) | (enumLiteral_5= 'bubble' ) | (enumLiteral_6= 'radar' ) | (enumLiteral_7= 'polarArea' ) )
            int alt10=8;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt10=1;
                }
                break;
            case 22:
                {
                alt10=2;
                }
                break;
            case 23:
                {
                alt10=3;
                }
                break;
            case 24:
                {
                alt10=4;
                }
                break;
            case 25:
                {
                alt10=5;
                }
                break;
            case 26:
                {
                alt10=6;
                }
                break;
            case 27:
                {
                alt10=7;
                }
                break;
            case 28:
                {
                alt10=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:505:3: (enumLiteral_0= 'line' )
                    {
                    // InternalMyDsl.g:505:3: (enumLiteral_0= 'line' )
                    // InternalMyDsl.g:506:4: enumLiteral_0= 'line'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getEnumTypeAccess().getLineEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEnumTypeAccess().getLineEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:513:3: (enumLiteral_1= 'bar' )
                    {
                    // InternalMyDsl.g:513:3: (enumLiteral_1= 'bar' )
                    // InternalMyDsl.g:514:4: enumLiteral_1= 'bar'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getEnumTypeAccess().getBarEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEnumTypeAccess().getBarEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:521:3: (enumLiteral_2= 'pie' )
                    {
                    // InternalMyDsl.g:521:3: (enumLiteral_2= 'pie' )
                    // InternalMyDsl.g:522:4: enumLiteral_2= 'pie'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getEnumTypeAccess().getPieEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEnumTypeAccess().getPieEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:529:3: (enumLiteral_3= 'doughnut' )
                    {
                    // InternalMyDsl.g:529:3: (enumLiteral_3= 'doughnut' )
                    // InternalMyDsl.g:530:4: enumLiteral_3= 'doughnut'
                    {
                    enumLiteral_3=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getEnumTypeAccess().getDoughnutEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEnumTypeAccess().getDoughnutEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:537:3: (enumLiteral_4= 'scatter' )
                    {
                    // InternalMyDsl.g:537:3: (enumLiteral_4= 'scatter' )
                    // InternalMyDsl.g:538:4: enumLiteral_4= 'scatter'
                    {
                    enumLiteral_4=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getEnumTypeAccess().getScatterEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getEnumTypeAccess().getScatterEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:545:3: (enumLiteral_5= 'bubble' )
                    {
                    // InternalMyDsl.g:545:3: (enumLiteral_5= 'bubble' )
                    // InternalMyDsl.g:546:4: enumLiteral_5= 'bubble'
                    {
                    enumLiteral_5=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getEnumTypeAccess().getBubbleEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getEnumTypeAccess().getBubbleEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:553:3: (enumLiteral_6= 'radar' )
                    {
                    // InternalMyDsl.g:553:3: (enumLiteral_6= 'radar' )
                    // InternalMyDsl.g:554:4: enumLiteral_6= 'radar'
                    {
                    enumLiteral_6=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getEnumTypeAccess().getRadarEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getEnumTypeAccess().getRadarEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:561:3: (enumLiteral_7= 'polarArea' )
                    {
                    // InternalMyDsl.g:561:3: (enumLiteral_7= 'polarArea' )
                    // InternalMyDsl.g:562:4: enumLiteral_7= 'polarArea'
                    {
                    enumLiteral_7=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getEnumTypeAccess().getPolarAreaEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getEnumTypeAccess().getPolarAreaEnumLiteralDeclaration_7());
                    			

                    }


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
    // $ANTLR end "ruleEnumType"


    // $ANTLR start "ruleEnumComparaison"
    // InternalMyDsl.g:572:1: ruleEnumComparaison returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '!=' ) ) ;
    public final Enumerator ruleEnumComparaison() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:578:2: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '!=' ) ) )
            // InternalMyDsl.g:579:2: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '!=' ) )
            {
            // InternalMyDsl.g:579:2: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '!=' ) )
            int alt11=7;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt11=1;
                }
                break;
            case 30:
                {
                alt11=2;
                }
                break;
            case 31:
                {
                alt11=3;
                }
                break;
            case 32:
                {
                alt11=4;
                }
                break;
            case 33:
                {
                alt11=5;
                }
                break;
            case 34:
                {
                alt11=6;
                }
                break;
            case 35:
                {
                alt11=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:580:3: (enumLiteral_0= 'none' )
                    {
                    // InternalMyDsl.g:580:3: (enumLiteral_0= 'none' )
                    // InternalMyDsl.g:581:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getEnumComparaisonAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEnumComparaisonAccess().getNoneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:588:3: (enumLiteral_1= '=' )
                    {
                    // InternalMyDsl.g:588:3: (enumLiteral_1= '=' )
                    // InternalMyDsl.g:589:4: enumLiteral_1= '='
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getEnumComparaisonAccess().getEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEnumComparaisonAccess().getEqualEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:596:3: (enumLiteral_2= '>' )
                    {
                    // InternalMyDsl.g:596:3: (enumLiteral_2= '>' )
                    // InternalMyDsl.g:597:4: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getEnumComparaisonAccess().getSupEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEnumComparaisonAccess().getSupEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:604:3: (enumLiteral_3= '<' )
                    {
                    // InternalMyDsl.g:604:3: (enumLiteral_3= '<' )
                    // InternalMyDsl.g:605:4: enumLiteral_3= '<'
                    {
                    enumLiteral_3=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getEnumComparaisonAccess().getInfEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEnumComparaisonAccess().getInfEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:612:3: (enumLiteral_4= '>=' )
                    {
                    // InternalMyDsl.g:612:3: (enumLiteral_4= '>=' )
                    // InternalMyDsl.g:613:4: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getEnumComparaisonAccess().getSupEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getEnumComparaisonAccess().getSupEqualEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:620:3: (enumLiteral_5= '<=' )
                    {
                    // InternalMyDsl.g:620:3: (enumLiteral_5= '<=' )
                    // InternalMyDsl.g:621:4: enumLiteral_5= '<='
                    {
                    enumLiteral_5=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getEnumComparaisonAccess().getInfEqualEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getEnumComparaisonAccess().getInfEqualEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:628:3: (enumLiteral_6= '!=' )
                    {
                    // InternalMyDsl.g:628:3: (enumLiteral_6= '!=' )
                    // InternalMyDsl.g:629:4: enumLiteral_6= '!='
                    {
                    enumLiteral_6=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getEnumComparaisonAccess().getNotEqualEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getEnumComparaisonAccess().getNotEqualEnumLiteralDeclaration_6());
                    			

                    }


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
    // $ANTLR end "ruleEnumComparaison"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000FE0000832L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000FE0000032L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000001FE00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});

}