package org.xtext.example.mydsl.parser.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'System'", "'{'", "'}'", "'Node'", "'Executor'", "'Type'", "'executed'", "'Service'", "'serviceReq'", "'clientCAll'", "'serviceCAll'", "'ServiceRequest'", "'service'", "'Topic'", "'published'", "'subscribed'", "'Publisher'", "'publishes'", "'BufferSize'", "'SubscriberCallback'", "'CallbackName'", "'subscribesTo'", "'executedIn'", "'CallBackExecutionTime'", "'ServiceCallback'", "'ClientCallback'", "'TimerCallback'", "'of'", "'PeriodicTimer'", "'Period'", "'SystemTimerName'", "'from'", "'Walltimer'", "'ReleaseTimes'", "'SINGLETHREADED'", "'STATICSINGLETHREADED'", "'MULTITHREADED'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
        	return "SystemModel";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSystemModel"
    // InternalMyDsl.g:65:1: entryRuleSystemModel returns [EObject current=null] : iv_ruleSystemModel= ruleSystemModel EOF ;
    public final EObject entryRuleSystemModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemModel = null;


        try {
            // InternalMyDsl.g:65:52: (iv_ruleSystemModel= ruleSystemModel EOF )
            // InternalMyDsl.g:66:2: iv_ruleSystemModel= ruleSystemModel EOF
            {
             newCompositeNode(grammarAccess.getSystemModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemModel=ruleSystemModel();

            state._fsp--;

             current =iv_ruleSystemModel; 
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
    // $ANTLR end "entryRuleSystemModel"


    // $ANTLR start "ruleSystemModel"
    // InternalMyDsl.g:72:1: ruleSystemModel returns [EObject current=null] : ( (lv_systems_0_0= ruleSystem ) )* ;
    public final EObject ruleSystemModel() throws RecognitionException {
        EObject current = null;

        EObject lv_systems_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( (lv_systems_0_0= ruleSystem ) )* )
            // InternalMyDsl.g:79:2: ( (lv_systems_0_0= ruleSystem ) )*
            {
            // InternalMyDsl.g:79:2: ( (lv_systems_0_0= ruleSystem ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:80:3: (lv_systems_0_0= ruleSystem )
            	    {
            	    // InternalMyDsl.g:80:3: (lv_systems_0_0= ruleSystem )
            	    // InternalMyDsl.g:81:4: lv_systems_0_0= ruleSystem
            	    {

            	    				newCompositeNode(grammarAccess.getSystemModelAccess().getSystemsSystemParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_systems_0_0=ruleSystem();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getSystemModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"systems",
            	    					lv_systems_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.System");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleSystemModel"


    // $ANTLR start "entryRuleSystem"
    // InternalMyDsl.g:101:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalMyDsl.g:101:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalMyDsl.g:102:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalMyDsl.g:108:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'System' ( (lv_SystemName_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_nodes_3_0= ruleNode ) )+ ( (lv_topics_4_0= ruleTopic ) )* ( (lv_executors_5_0= ruleExecutor ) )+ ( (lv_services_6_0= ruleService ) )* ( (lv_periodictimers_7_0= rulePeriodicTimer ) )* ( (lv_walltimers_8_0= ruleWalltimer ) )* otherlv_9= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_SystemName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_9=null;
        EObject lv_nodes_3_0 = null;

        EObject lv_topics_4_0 = null;

        EObject lv_executors_5_0 = null;

        EObject lv_services_6_0 = null;

        EObject lv_periodictimers_7_0 = null;

        EObject lv_walltimers_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:114:2: ( (otherlv_0= 'System' ( (lv_SystemName_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_nodes_3_0= ruleNode ) )+ ( (lv_topics_4_0= ruleTopic ) )* ( (lv_executors_5_0= ruleExecutor ) )+ ( (lv_services_6_0= ruleService ) )* ( (lv_periodictimers_7_0= rulePeriodicTimer ) )* ( (lv_walltimers_8_0= ruleWalltimer ) )* otherlv_9= '}' ) )
            // InternalMyDsl.g:115:2: (otherlv_0= 'System' ( (lv_SystemName_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_nodes_3_0= ruleNode ) )+ ( (lv_topics_4_0= ruleTopic ) )* ( (lv_executors_5_0= ruleExecutor ) )+ ( (lv_services_6_0= ruleService ) )* ( (lv_periodictimers_7_0= rulePeriodicTimer ) )* ( (lv_walltimers_8_0= ruleWalltimer ) )* otherlv_9= '}' )
            {
            // InternalMyDsl.g:115:2: (otherlv_0= 'System' ( (lv_SystemName_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_nodes_3_0= ruleNode ) )+ ( (lv_topics_4_0= ruleTopic ) )* ( (lv_executors_5_0= ruleExecutor ) )+ ( (lv_services_6_0= ruleService ) )* ( (lv_periodictimers_7_0= rulePeriodicTimer ) )* ( (lv_walltimers_8_0= ruleWalltimer ) )* otherlv_9= '}' )
            // InternalMyDsl.g:116:3: otherlv_0= 'System' ( (lv_SystemName_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_nodes_3_0= ruleNode ) )+ ( (lv_topics_4_0= ruleTopic ) )* ( (lv_executors_5_0= ruleExecutor ) )+ ( (lv_services_6_0= ruleService ) )* ( (lv_periodictimers_7_0= rulePeriodicTimer ) )* ( (lv_walltimers_8_0= ruleWalltimer ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
            		
            // InternalMyDsl.g:120:3: ( (lv_SystemName_1_0= RULE_STRING ) )
            // InternalMyDsl.g:121:4: (lv_SystemName_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:121:4: (lv_SystemName_1_0= RULE_STRING )
            // InternalMyDsl.g:122:5: lv_SystemName_1_0= RULE_STRING
            {
            lv_SystemName_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_SystemName_1_0, grammarAccess.getSystemAccess().getSystemNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"SystemName",
            						lv_SystemName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:142:3: ( (lv_nodes_3_0= ruleNode ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:143:4: (lv_nodes_3_0= ruleNode )
            	    {
            	    // InternalMyDsl.g:143:4: (lv_nodes_3_0= ruleNode )
            	    // InternalMyDsl.g:144:5: lv_nodes_3_0= ruleNode
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getNodesNodeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_nodes_3_0=ruleNode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"nodes",
            	    						lv_nodes_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Node");
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

            // InternalMyDsl.g:161:3: ( (lv_topics_4_0= ruleTopic ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==24) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:162:4: (lv_topics_4_0= ruleTopic )
            	    {
            	    // InternalMyDsl.g:162:4: (lv_topics_4_0= ruleTopic )
            	    // InternalMyDsl.g:163:5: lv_topics_4_0= ruleTopic
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getTopicsTopicParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_topics_4_0=ruleTopic();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"topics",
            	    						lv_topics_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.Topic");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalMyDsl.g:180:3: ( (lv_executors_5_0= ruleExecutor ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:181:4: (lv_executors_5_0= ruleExecutor )
            	    {
            	    // InternalMyDsl.g:181:4: (lv_executors_5_0= ruleExecutor )
            	    // InternalMyDsl.g:182:5: lv_executors_5_0= ruleExecutor
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getExecutorsExecutorParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_executors_5_0=ruleExecutor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"executors",
            	    						lv_executors_5_0,
            	    						"org.xtext.example.mydsl.MyDsl.Executor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // InternalMyDsl.g:199:3: ( (lv_services_6_0= ruleService ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:200:4: (lv_services_6_0= ruleService )
            	    {
            	    // InternalMyDsl.g:200:4: (lv_services_6_0= ruleService )
            	    // InternalMyDsl.g:201:5: lv_services_6_0= ruleService
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getServicesServiceParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_services_6_0=ruleService();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"services",
            	    						lv_services_6_0,
            	    						"org.xtext.example.mydsl.MyDsl.Service");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalMyDsl.g:218:3: ( (lv_periodictimers_7_0= rulePeriodicTimer ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==39) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:219:4: (lv_periodictimers_7_0= rulePeriodicTimer )
            	    {
            	    // InternalMyDsl.g:219:4: (lv_periodictimers_7_0= rulePeriodicTimer )
            	    // InternalMyDsl.g:220:5: lv_periodictimers_7_0= rulePeriodicTimer
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getPeriodictimersPeriodicTimerParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_periodictimers_7_0=rulePeriodicTimer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"periodictimers",
            	    						lv_periodictimers_7_0,
            	    						"org.xtext.example.mydsl.MyDsl.PeriodicTimer");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalMyDsl.g:237:3: ( (lv_walltimers_8_0= ruleWalltimer ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==43) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:238:4: (lv_walltimers_8_0= ruleWalltimer )
            	    {
            	    // InternalMyDsl.g:238:4: (lv_walltimers_8_0= ruleWalltimer )
            	    // InternalMyDsl.g:239:5: lv_walltimers_8_0= ruleWalltimer
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getWalltimersWalltimerParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_walltimers_8_0=ruleWalltimer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"walltimers",
            	    						lv_walltimers_8_0,
            	    						"org.xtext.example.mydsl.MyDsl.Walltimer");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleNode"
    // InternalMyDsl.g:264:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalMyDsl.g:264:45: (iv_ruleNode= ruleNode EOF )
            // InternalMyDsl.g:265:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalMyDsl.g:271:1: ruleNode returns [EObject current=null] : (otherlv_0= 'Node' ( (lv_NodeName_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_publishers_3_0= rulePublisher ) )* ( (lv_subscribers_4_0= ruleSubscriberCallback ) )* ( (lv_services_5_0= ruleServiceCallback ) )* ( (lv_servicerequests_6_0= ruleServiceRequest ) )* ( (lv_clients_7_0= ruleClientCallback ) )* ( (lv_timers_8_0= ruleTimerCallback ) )* otherlv_9= '}' ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_NodeName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_9=null;
        EObject lv_publishers_3_0 = null;

        EObject lv_subscribers_4_0 = null;

        EObject lv_services_5_0 = null;

        EObject lv_servicerequests_6_0 = null;

        EObject lv_clients_7_0 = null;

        EObject lv_timers_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:277:2: ( (otherlv_0= 'Node' ( (lv_NodeName_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_publishers_3_0= rulePublisher ) )* ( (lv_subscribers_4_0= ruleSubscriberCallback ) )* ( (lv_services_5_0= ruleServiceCallback ) )* ( (lv_servicerequests_6_0= ruleServiceRequest ) )* ( (lv_clients_7_0= ruleClientCallback ) )* ( (lv_timers_8_0= ruleTimerCallback ) )* otherlv_9= '}' ) )
            // InternalMyDsl.g:278:2: (otherlv_0= 'Node' ( (lv_NodeName_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_publishers_3_0= rulePublisher ) )* ( (lv_subscribers_4_0= ruleSubscriberCallback ) )* ( (lv_services_5_0= ruleServiceCallback ) )* ( (lv_servicerequests_6_0= ruleServiceRequest ) )* ( (lv_clients_7_0= ruleClientCallback ) )* ( (lv_timers_8_0= ruleTimerCallback ) )* otherlv_9= '}' )
            {
            // InternalMyDsl.g:278:2: (otherlv_0= 'Node' ( (lv_NodeName_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_publishers_3_0= rulePublisher ) )* ( (lv_subscribers_4_0= ruleSubscriberCallback ) )* ( (lv_services_5_0= ruleServiceCallback ) )* ( (lv_servicerequests_6_0= ruleServiceRequest ) )* ( (lv_clients_7_0= ruleClientCallback ) )* ( (lv_timers_8_0= ruleTimerCallback ) )* otherlv_9= '}' )
            // InternalMyDsl.g:279:3: otherlv_0= 'Node' ( (lv_NodeName_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_publishers_3_0= rulePublisher ) )* ( (lv_subscribers_4_0= ruleSubscriberCallback ) )* ( (lv_services_5_0= ruleServiceCallback ) )* ( (lv_servicerequests_6_0= ruleServiceRequest ) )* ( (lv_clients_7_0= ruleClientCallback ) )* ( (lv_timers_8_0= ruleTimerCallback ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
            		
            // InternalMyDsl.g:283:3: ( (lv_NodeName_1_0= RULE_STRING ) )
            // InternalMyDsl.g:284:4: (lv_NodeName_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:284:4: (lv_NodeName_1_0= RULE_STRING )
            // InternalMyDsl.g:285:5: lv_NodeName_1_0= RULE_STRING
            {
            lv_NodeName_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_NodeName_1_0, grammarAccess.getNodeAccess().getNodeNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"NodeName",
            						lv_NodeName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:305:3: ( (lv_publishers_3_0= rulePublisher ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:306:4: (lv_publishers_3_0= rulePublisher )
            	    {
            	    // InternalMyDsl.g:306:4: (lv_publishers_3_0= rulePublisher )
            	    // InternalMyDsl.g:307:5: lv_publishers_3_0= rulePublisher
            	    {

            	    					newCompositeNode(grammarAccess.getNodeAccess().getPublishersPublisherParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_publishers_3_0=rulePublisher();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"publishers",
            	    						lv_publishers_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Publisher");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalMyDsl.g:324:3: ( (lv_subscribers_4_0= ruleSubscriberCallback ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==30) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:325:4: (lv_subscribers_4_0= ruleSubscriberCallback )
            	    {
            	    // InternalMyDsl.g:325:4: (lv_subscribers_4_0= ruleSubscriberCallback )
            	    // InternalMyDsl.g:326:5: lv_subscribers_4_0= ruleSubscriberCallback
            	    {

            	    					newCompositeNode(grammarAccess.getNodeAccess().getSubscribersSubscriberCallbackParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_subscribers_4_0=ruleSubscriberCallback();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"subscribers",
            	    						lv_subscribers_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.SubscriberCallback");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalMyDsl.g:343:3: ( (lv_services_5_0= ruleServiceCallback ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==35) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:344:4: (lv_services_5_0= ruleServiceCallback )
            	    {
            	    // InternalMyDsl.g:344:4: (lv_services_5_0= ruleServiceCallback )
            	    // InternalMyDsl.g:345:5: lv_services_5_0= ruleServiceCallback
            	    {

            	    					newCompositeNode(grammarAccess.getNodeAccess().getServicesServiceCallbackParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_services_5_0=ruleServiceCallback();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"services",
            	    						lv_services_5_0,
            	    						"org.xtext.example.mydsl.MyDsl.ServiceCallback");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalMyDsl.g:362:3: ( (lv_servicerequests_6_0= ruleServiceRequest ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:363:4: (lv_servicerequests_6_0= ruleServiceRequest )
            	    {
            	    // InternalMyDsl.g:363:4: (lv_servicerequests_6_0= ruleServiceRequest )
            	    // InternalMyDsl.g:364:5: lv_servicerequests_6_0= ruleServiceRequest
            	    {

            	    					newCompositeNode(grammarAccess.getNodeAccess().getServicerequestsServiceRequestParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_servicerequests_6_0=ruleServiceRequest();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"servicerequests",
            	    						lv_servicerequests_6_0,
            	    						"org.xtext.example.mydsl.MyDsl.ServiceRequest");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalMyDsl.g:381:3: ( (lv_clients_7_0= ruleClientCallback ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==36) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:382:4: (lv_clients_7_0= ruleClientCallback )
            	    {
            	    // InternalMyDsl.g:382:4: (lv_clients_7_0= ruleClientCallback )
            	    // InternalMyDsl.g:383:5: lv_clients_7_0= ruleClientCallback
            	    {

            	    					newCompositeNode(grammarAccess.getNodeAccess().getClientsClientCallbackParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_clients_7_0=ruleClientCallback();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"clients",
            	    						lv_clients_7_0,
            	    						"org.xtext.example.mydsl.MyDsl.ClientCallback");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalMyDsl.g:400:3: ( (lv_timers_8_0= ruleTimerCallback ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==37) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:401:4: (lv_timers_8_0= ruleTimerCallback )
            	    {
            	    // InternalMyDsl.g:401:4: (lv_timers_8_0= ruleTimerCallback )
            	    // InternalMyDsl.g:402:5: lv_timers_8_0= ruleTimerCallback
            	    {

            	    					newCompositeNode(grammarAccess.getNodeAccess().getTimersTimerCallbackParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_timers_8_0=ruleTimerCallback();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"timers",
            	    						lv_timers_8_0,
            	    						"org.xtext.example.mydsl.MyDsl.TimerCallback");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleExecutor"
    // InternalMyDsl.g:427:1: entryRuleExecutor returns [EObject current=null] : iv_ruleExecutor= ruleExecutor EOF ;
    public final EObject entryRuleExecutor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutor = null;


        try {
            // InternalMyDsl.g:427:49: (iv_ruleExecutor= ruleExecutor EOF )
            // InternalMyDsl.g:428:2: iv_ruleExecutor= ruleExecutor EOF
            {
             newCompositeNode(grammarAccess.getExecutorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExecutor=ruleExecutor();

            state._fsp--;

             current =iv_ruleExecutor; 
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
    // $ANTLR end "entryRuleExecutor"


    // $ANTLR start "ruleExecutor"
    // InternalMyDsl.g:434:1: ruleExecutor returns [EObject current=null] : ( () otherlv_1= 'Executor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Type' ( (lv_type_4_0= ruleExecutorType ) ) (otherlv_5= 'executed' ( (otherlv_6= RULE_ID ) )* ) otherlv_7= '{' otherlv_8= '}' ) ;
    public final EObject ruleExecutor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:440:2: ( ( () otherlv_1= 'Executor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Type' ( (lv_type_4_0= ruleExecutorType ) ) (otherlv_5= 'executed' ( (otherlv_6= RULE_ID ) )* ) otherlv_7= '{' otherlv_8= '}' ) )
            // InternalMyDsl.g:441:2: ( () otherlv_1= 'Executor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Type' ( (lv_type_4_0= ruleExecutorType ) ) (otherlv_5= 'executed' ( (otherlv_6= RULE_ID ) )* ) otherlv_7= '{' otherlv_8= '}' )
            {
            // InternalMyDsl.g:441:2: ( () otherlv_1= 'Executor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Type' ( (lv_type_4_0= ruleExecutorType ) ) (otherlv_5= 'executed' ( (otherlv_6= RULE_ID ) )* ) otherlv_7= '{' otherlv_8= '}' )
            // InternalMyDsl.g:442:3: () otherlv_1= 'Executor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Type' ( (lv_type_4_0= ruleExecutorType ) ) (otherlv_5= 'executed' ( (otherlv_6= RULE_ID ) )* ) otherlv_7= '{' otherlv_8= '}'
            {
            // InternalMyDsl.g:442:3: ()
            // InternalMyDsl.g:443:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExecutorAccess().getExecutorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getExecutorAccess().getExecutorKeyword_1());
            		
            // InternalMyDsl.g:453:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:454:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:454:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:455:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_2_0, grammarAccess.getExecutorAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecutorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getExecutorAccess().getTypeKeyword_3());
            		
            // InternalMyDsl.g:475:3: ( (lv_type_4_0= ruleExecutorType ) )
            // InternalMyDsl.g:476:4: (lv_type_4_0= ruleExecutorType )
            {
            // InternalMyDsl.g:476:4: (lv_type_4_0= ruleExecutorType )
            // InternalMyDsl.g:477:5: lv_type_4_0= ruleExecutorType
            {

            					newCompositeNode(grammarAccess.getExecutorAccess().getTypeExecutorTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
            lv_type_4_0=ruleExecutorType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExecutorRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"org.xtext.example.mydsl.MyDsl.ExecutorType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:494:3: (otherlv_5= 'executed' ( (otherlv_6= RULE_ID ) )* )
            // InternalMyDsl.g:495:4: otherlv_5= 'executed' ( (otherlv_6= RULE_ID ) )*
            {
            otherlv_5=(Token)match(input,17,FOLLOW_23); 

            				newLeafNode(otherlv_5, grammarAccess.getExecutorAccess().getExecutedKeyword_5_0());
            			
            // InternalMyDsl.g:499:4: ( (otherlv_6= RULE_ID ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:500:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalMyDsl.g:500:5: (otherlv_6= RULE_ID )
            	    // InternalMyDsl.g:501:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getExecutorRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_23); 

            	    						newLeafNode(otherlv_6, grammarAccess.getExecutorAccess().getExecutedCallbackCrossReference_5_1_0());
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            otherlv_7=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_7, grammarAccess.getExecutorAccess().getLeftCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getExecutorAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleExecutor"


    // $ANTLR start "entryRuleService"
    // InternalMyDsl.g:525:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalMyDsl.g:525:48: (iv_ruleService= ruleService EOF )
            // InternalMyDsl.g:526:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalMyDsl.g:532:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'serviceReq' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'clientCAll' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'serviceCAll' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '{' otherlv_9= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalMyDsl.g:538:2: ( (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'serviceReq' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'clientCAll' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'serviceCAll' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '{' otherlv_9= '}' ) )
            // InternalMyDsl.g:539:2: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'serviceReq' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'clientCAll' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'serviceCAll' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '{' otherlv_9= '}' )
            {
            // InternalMyDsl.g:539:2: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'serviceReq' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'clientCAll' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'serviceCAll' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '{' otherlv_9= '}' )
            // InternalMyDsl.g:540:3: otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'serviceReq' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'clientCAll' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'serviceCAll' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '{' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            // InternalMyDsl.g:544:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:545:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:545:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:546:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_name_1_0, grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:562:3: (otherlv_2= 'serviceReq' ( (otherlv_3= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:563:4: otherlv_2= 'serviceReq' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getServiceReqKeyword_2_0());
                    			
                    // InternalMyDsl.g:567:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMyDsl.g:568:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMyDsl.g:568:5: (otherlv_3= RULE_ID )
                    // InternalMyDsl.g:569:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServiceRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_26); 

                    						newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getServiceReqServiceRequestCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:581:3: (otherlv_4= 'clientCAll' ( (otherlv_5= RULE_ID ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:582:4: otherlv_4= 'clientCAll' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getClientCAllKeyword_3_0());
                    			
                    // InternalMyDsl.g:586:4: ( (otherlv_5= RULE_ID ) )
                    // InternalMyDsl.g:587:5: (otherlv_5= RULE_ID )
                    {
                    // InternalMyDsl.g:587:5: (otherlv_5= RULE_ID )
                    // InternalMyDsl.g:588:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServiceRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_27); 

                    						newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getClientCAllClientCallbackCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:600:3: (otherlv_6= 'serviceCAll' ( (otherlv_7= RULE_ID ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:601:4: otherlv_6= 'serviceCAll' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getServiceCAllKeyword_4_0());
                    			
                    // InternalMyDsl.g:605:4: ( (otherlv_7= RULE_ID ) )
                    // InternalMyDsl.g:606:5: (otherlv_7= RULE_ID )
                    {
                    // InternalMyDsl.g:606:5: (otherlv_7= RULE_ID )
                    // InternalMyDsl.g:607:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServiceRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getServiceCAllServiceCallbackCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_5());
            		
            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleServiceRequest"
    // InternalMyDsl.g:631:1: entryRuleServiceRequest returns [EObject current=null] : iv_ruleServiceRequest= ruleServiceRequest EOF ;
    public final EObject entryRuleServiceRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceRequest = null;


        try {
            // InternalMyDsl.g:631:55: (iv_ruleServiceRequest= ruleServiceRequest EOF )
            // InternalMyDsl.g:632:2: iv_ruleServiceRequest= ruleServiceRequest EOF
            {
             newCompositeNode(grammarAccess.getServiceRequestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceRequest=ruleServiceRequest();

            state._fsp--;

             current =iv_ruleServiceRequest; 
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
    // $ANTLR end "entryRuleServiceRequest"


    // $ANTLR start "ruleServiceRequest"
    // InternalMyDsl.g:638:1: ruleServiceRequest returns [EObject current=null] : (otherlv_0= 'ServiceRequest' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'service' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= '}' ) ;
    public final EObject ruleServiceRequest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:644:2: ( (otherlv_0= 'ServiceRequest' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'service' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= '}' ) )
            // InternalMyDsl.g:645:2: (otherlv_0= 'ServiceRequest' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'service' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= '}' )
            {
            // InternalMyDsl.g:645:2: (otherlv_0= 'ServiceRequest' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'service' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= '}' )
            // InternalMyDsl.g:646:3: otherlv_0= 'ServiceRequest' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'service' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceRequestAccess().getServiceRequestKeyword_0());
            		
            // InternalMyDsl.g:650:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:651:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:651:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:652:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_name_1_0, grammarAccess.getServiceRequestAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRequestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:668:3: (otherlv_2= 'service' ( (otherlv_3= RULE_ID ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:669:4: otherlv_2= 'service' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getServiceRequestAccess().getServiceKeyword_2_0());
                    			
                    // InternalMyDsl.g:673:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMyDsl.g:674:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMyDsl.g:674:5: (otherlv_3= RULE_ID )
                    // InternalMyDsl.g:675:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServiceRequestRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(otherlv_3, grammarAccess.getServiceRequestAccess().getServiceServiceCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceRequestAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getServiceRequestAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleServiceRequest"


    // $ANTLR start "entryRuleTopic"
    // InternalMyDsl.g:699:1: entryRuleTopic returns [EObject current=null] : iv_ruleTopic= ruleTopic EOF ;
    public final EObject entryRuleTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopic = null;


        try {
            // InternalMyDsl.g:699:46: (iv_ruleTopic= ruleTopic EOF )
            // InternalMyDsl.g:700:2: iv_ruleTopic= ruleTopic EOF
            {
             newCompositeNode(grammarAccess.getTopicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopic=ruleTopic();

            state._fsp--;

             current =iv_ruleTopic; 
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
    // $ANTLR end "entryRuleTopic"


    // $ANTLR start "ruleTopic"
    // InternalMyDsl.g:706:1: ruleTopic returns [EObject current=null] : ( () otherlv_1= 'Topic' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'published' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'subscribed' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '{' otherlv_8= '}' ) ;
    public final EObject ruleTopic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalMyDsl.g:712:2: ( ( () otherlv_1= 'Topic' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'published' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'subscribed' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '{' otherlv_8= '}' ) )
            // InternalMyDsl.g:713:2: ( () otherlv_1= 'Topic' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'published' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'subscribed' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '{' otherlv_8= '}' )
            {
            // InternalMyDsl.g:713:2: ( () otherlv_1= 'Topic' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'published' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'subscribed' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '{' otherlv_8= '}' )
            // InternalMyDsl.g:714:3: () otherlv_1= 'Topic' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'published' ( (otherlv_4= RULE_ID ) ) )* (otherlv_5= 'subscribed' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '{' otherlv_8= '}'
            {
            // InternalMyDsl.g:714:3: ()
            // InternalMyDsl.g:715:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTopicAccess().getTopicAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getTopicAccess().getTopicKeyword_1());
            		
            // InternalMyDsl.g:725:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:726:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:726:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:727:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTopicAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTopicRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:743:3: (otherlv_3= 'published' ( (otherlv_4= RULE_ID ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:744:4: otherlv_3= 'published' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,25,FOLLOW_19); 

            	    				newLeafNode(otherlv_3, grammarAccess.getTopicAccess().getPublishedKeyword_3_0());
            	    			
            	    // InternalMyDsl.g:748:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalMyDsl.g:749:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalMyDsl.g:749:5: (otherlv_4= RULE_ID )
            	    // InternalMyDsl.g:750:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTopicRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_29); 

            	    						newLeafNode(otherlv_4, grammarAccess.getTopicAccess().getPublishedPublisherCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalMyDsl.g:762:3: (otherlv_5= 'subscribed' ( (otherlv_6= RULE_ID ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:763:4: otherlv_5= 'subscribed' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,26,FOLLOW_19); 

            	    				newLeafNode(otherlv_5, grammarAccess.getTopicAccess().getSubscribedKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:767:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalMyDsl.g:768:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalMyDsl.g:768:5: (otherlv_6= RULE_ID )
            	    // InternalMyDsl.g:769:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTopicRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_30); 

            	    						newLeafNode(otherlv_6, grammarAccess.getTopicAccess().getSubscribedSubscriberCallbackCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_7=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_7, grammarAccess.getTopicAccess().getLeftCurlyBracketKeyword_5());
            		
            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTopicAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleTopic"


    // $ANTLR start "entryRulePublisher"
    // InternalMyDsl.g:793:1: entryRulePublisher returns [EObject current=null] : iv_rulePublisher= rulePublisher EOF ;
    public final EObject entryRulePublisher() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublisher = null;


        try {
            // InternalMyDsl.g:793:50: (iv_rulePublisher= rulePublisher EOF )
            // InternalMyDsl.g:794:2: iv_rulePublisher= rulePublisher EOF
            {
             newCompositeNode(grammarAccess.getPublisherRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePublisher=rulePublisher();

            state._fsp--;

             current =iv_rulePublisher; 
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
    // $ANTLR end "entryRulePublisher"


    // $ANTLR start "rulePublisher"
    // InternalMyDsl.g:800:1: rulePublisher returns [EObject current=null] : (otherlv_0= 'Publisher' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'publishes' ( (otherlv_3= RULE_ID ) )+ ) (otherlv_4= 'BufferSize' ( (lv_bufferSize_5_0= RULE_INT ) ) ) otherlv_6= '{' otherlv_7= '}' ) ;
    public final EObject rulePublisher() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_bufferSize_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:806:2: ( (otherlv_0= 'Publisher' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'publishes' ( (otherlv_3= RULE_ID ) )+ ) (otherlv_4= 'BufferSize' ( (lv_bufferSize_5_0= RULE_INT ) ) ) otherlv_6= '{' otherlv_7= '}' ) )
            // InternalMyDsl.g:807:2: (otherlv_0= 'Publisher' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'publishes' ( (otherlv_3= RULE_ID ) )+ ) (otherlv_4= 'BufferSize' ( (lv_bufferSize_5_0= RULE_INT ) ) ) otherlv_6= '{' otherlv_7= '}' )
            {
            // InternalMyDsl.g:807:2: (otherlv_0= 'Publisher' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'publishes' ( (otherlv_3= RULE_ID ) )+ ) (otherlv_4= 'BufferSize' ( (lv_bufferSize_5_0= RULE_INT ) ) ) otherlv_6= '{' otherlv_7= '}' )
            // InternalMyDsl.g:808:3: otherlv_0= 'Publisher' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'publishes' ( (otherlv_3= RULE_ID ) )+ ) (otherlv_4= 'BufferSize' ( (lv_bufferSize_5_0= RULE_INT ) ) ) otherlv_6= '{' otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getPublisherAccess().getPublisherKeyword_0());
            		
            // InternalMyDsl.g:812:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:813:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:813:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:814:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPublisherAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPublisherRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:830:3: (otherlv_2= 'publishes' ( (otherlv_3= RULE_ID ) )+ )
            // InternalMyDsl.g:831:4: otherlv_2= 'publishes' ( (otherlv_3= RULE_ID ) )+
            {
            otherlv_2=(Token)match(input,28,FOLLOW_19); 

            				newLeafNode(otherlv_2, grammarAccess.getPublisherAccess().getPublishesKeyword_2_0());
            			
            // InternalMyDsl.g:835:4: ( (otherlv_3= RULE_ID ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:836:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalMyDsl.g:836:5: (otherlv_3= RULE_ID )
            	    // InternalMyDsl.g:837:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPublisherRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_32); 

            	    						newLeafNode(otherlv_3, grammarAccess.getPublisherAccess().getPublishesTopicCrossReference_2_1_0());
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            }

            // InternalMyDsl.g:849:3: (otherlv_4= 'BufferSize' ( (lv_bufferSize_5_0= RULE_INT ) ) )
            // InternalMyDsl.g:850:4: otherlv_4= 'BufferSize' ( (lv_bufferSize_5_0= RULE_INT ) )
            {
            otherlv_4=(Token)match(input,29,FOLLOW_33); 

            				newLeafNode(otherlv_4, grammarAccess.getPublisherAccess().getBufferSizeKeyword_3_0());
            			
            // InternalMyDsl.g:854:4: ( (lv_bufferSize_5_0= RULE_INT ) )
            // InternalMyDsl.g:855:5: (lv_bufferSize_5_0= RULE_INT )
            {
            // InternalMyDsl.g:855:5: (lv_bufferSize_5_0= RULE_INT )
            // InternalMyDsl.g:856:6: lv_bufferSize_5_0= RULE_INT
            {
            lv_bufferSize_5_0=(Token)match(input,RULE_INT,FOLLOW_5); 

            						newLeafNode(lv_bufferSize_5_0, grammarAccess.getPublisherAccess().getBufferSizeINTTerminalRuleCall_3_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getPublisherRule());
            						}
            						setWithLastConsumed(
            							current,
            							"bufferSize",
            							lv_bufferSize_5_0,
            							"org.eclipse.xtext.common.Terminals.INT");
            					

            }


            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_6, grammarAccess.getPublisherAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPublisherAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulePublisher"


    // $ANTLR start "entryRuleSubscriberCallback"
    // InternalMyDsl.g:885:1: entryRuleSubscriberCallback returns [EObject current=null] : iv_ruleSubscriberCallback= ruleSubscriberCallback EOF ;
    public final EObject entryRuleSubscriberCallback() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubscriberCallback = null;


        try {
            // InternalMyDsl.g:885:59: (iv_ruleSubscriberCallback= ruleSubscriberCallback EOF )
            // InternalMyDsl.g:886:2: iv_ruleSubscriberCallback= ruleSubscriberCallback EOF
            {
             newCompositeNode(grammarAccess.getSubscriberCallbackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubscriberCallback=ruleSubscriberCallback();

            state._fsp--;

             current =iv_ruleSubscriberCallback; 
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
    // $ANTLR end "entryRuleSubscriberCallback"


    // $ANTLR start "ruleSubscriberCallback"
    // InternalMyDsl.g:892:1: ruleSubscriberCallback returns [EObject current=null] : (otherlv_0= 'SubscriberCallback' otherlv_1= 'BufferSize' ( (lv_bufferSize_2_0= RULE_INT ) ) otherlv_3= 'CallbackName' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'subscribesTo' ( (otherlv_6= RULE_ID ) )+ )? (otherlv_7= 'executedIn' ( (otherlv_8= RULE_ID ) )+ )? (otherlv_9= 'CallBackExecutionTime' ( (lv_executionTime_10_0= RULE_INT ) ) )? otherlv_11= '{' otherlv_12= '}' ) ;
    public final EObject ruleSubscriberCallback() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_bufferSize_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_executionTime_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalMyDsl.g:898:2: ( (otherlv_0= 'SubscriberCallback' otherlv_1= 'BufferSize' ( (lv_bufferSize_2_0= RULE_INT ) ) otherlv_3= 'CallbackName' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'subscribesTo' ( (otherlv_6= RULE_ID ) )+ )? (otherlv_7= 'executedIn' ( (otherlv_8= RULE_ID ) )+ )? (otherlv_9= 'CallBackExecutionTime' ( (lv_executionTime_10_0= RULE_INT ) ) )? otherlv_11= '{' otherlv_12= '}' ) )
            // InternalMyDsl.g:899:2: (otherlv_0= 'SubscriberCallback' otherlv_1= 'BufferSize' ( (lv_bufferSize_2_0= RULE_INT ) ) otherlv_3= 'CallbackName' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'subscribesTo' ( (otherlv_6= RULE_ID ) )+ )? (otherlv_7= 'executedIn' ( (otherlv_8= RULE_ID ) )+ )? (otherlv_9= 'CallBackExecutionTime' ( (lv_executionTime_10_0= RULE_INT ) ) )? otherlv_11= '{' otherlv_12= '}' )
            {
            // InternalMyDsl.g:899:2: (otherlv_0= 'SubscriberCallback' otherlv_1= 'BufferSize' ( (lv_bufferSize_2_0= RULE_INT ) ) otherlv_3= 'CallbackName' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'subscribesTo' ( (otherlv_6= RULE_ID ) )+ )? (otherlv_7= 'executedIn' ( (otherlv_8= RULE_ID ) )+ )? (otherlv_9= 'CallBackExecutionTime' ( (lv_executionTime_10_0= RULE_INT ) ) )? otherlv_11= '{' otherlv_12= '}' )
            // InternalMyDsl.g:900:3: otherlv_0= 'SubscriberCallback' otherlv_1= 'BufferSize' ( (lv_bufferSize_2_0= RULE_INT ) ) otherlv_3= 'CallbackName' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'subscribesTo' ( (otherlv_6= RULE_ID ) )+ )? (otherlv_7= 'executedIn' ( (otherlv_8= RULE_ID ) )+ )? (otherlv_9= 'CallBackExecutionTime' ( (lv_executionTime_10_0= RULE_INT ) ) )? otherlv_11= '{' otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getSubscriberCallbackAccess().getSubscriberCallbackKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getSubscriberCallbackAccess().getBufferSizeKeyword_1());
            		
            // InternalMyDsl.g:908:3: ( (lv_bufferSize_2_0= RULE_INT ) )
            // InternalMyDsl.g:909:4: (lv_bufferSize_2_0= RULE_INT )
            {
            // InternalMyDsl.g:909:4: (lv_bufferSize_2_0= RULE_INT )
            // InternalMyDsl.g:910:5: lv_bufferSize_2_0= RULE_INT
            {
            lv_bufferSize_2_0=(Token)match(input,RULE_INT,FOLLOW_35); 

            					newLeafNode(lv_bufferSize_2_0, grammarAccess.getSubscriberCallbackAccess().getBufferSizeINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubscriberCallbackRule());
            					}
            					setWithLastConsumed(
            						current,
            						"bufferSize",
            						lv_bufferSize_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getSubscriberCallbackAccess().getCallbackNameKeyword_3());
            		
            // InternalMyDsl.g:930:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalMyDsl.g:931:4: (lv_name_4_0= RULE_ID )
            {
            // InternalMyDsl.g:931:4: (lv_name_4_0= RULE_ID )
            // InternalMyDsl.g:932:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(lv_name_4_0, grammarAccess.getSubscriberCallbackAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubscriberCallbackRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:948:3: (otherlv_5= 'subscribesTo' ( (otherlv_6= RULE_ID ) )+ )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:949:4: otherlv_5= 'subscribesTo' ( (otherlv_6= RULE_ID ) )+
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getSubscriberCallbackAccess().getSubscribesToKeyword_5_0());
                    			
                    // InternalMyDsl.g:953:4: ( (otherlv_6= RULE_ID ) )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_ID) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalMyDsl.g:954:5: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:954:5: (otherlv_6= RULE_ID )
                    	    // InternalMyDsl.g:955:6: otherlv_6= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getSubscriberCallbackRule());
                    	    						}
                    	    					
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_37); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getSubscriberCallbackAccess().getSubscribesToTopicCrossReference_5_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt22 >= 1 ) break loop22;
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:967:3: (otherlv_7= 'executedIn' ( (otherlv_8= RULE_ID ) )+ )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:968:4: otherlv_7= 'executedIn' ( (otherlv_8= RULE_ID ) )+
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_7, grammarAccess.getSubscriberCallbackAccess().getExecutedInKeyword_6_0());
                    			
                    // InternalMyDsl.g:972:4: ( (otherlv_8= RULE_ID ) )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_ID) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalMyDsl.g:973:5: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:973:5: (otherlv_8= RULE_ID )
                    	    // InternalMyDsl.g:974:6: otherlv_8= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getSubscriberCallbackRule());
                    	    						}
                    	    					
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_38); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getSubscriberCallbackAccess().getExecutedInExecutorCrossReference_6_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:986:3: (otherlv_9= 'CallBackExecutionTime' ( (lv_executionTime_10_0= RULE_INT ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==34) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:987:4: otherlv_9= 'CallBackExecutionTime' ( (lv_executionTime_10_0= RULE_INT ) )
                    {
                    otherlv_9=(Token)match(input,34,FOLLOW_33); 

                    				newLeafNode(otherlv_9, grammarAccess.getSubscriberCallbackAccess().getCallBackExecutionTimeKeyword_7_0());
                    			
                    // InternalMyDsl.g:991:4: ( (lv_executionTime_10_0= RULE_INT ) )
                    // InternalMyDsl.g:992:5: (lv_executionTime_10_0= RULE_INT )
                    {
                    // InternalMyDsl.g:992:5: (lv_executionTime_10_0= RULE_INT )
                    // InternalMyDsl.g:993:6: lv_executionTime_10_0= RULE_INT
                    {
                    lv_executionTime_10_0=(Token)match(input,RULE_INT,FOLLOW_5); 

                    						newLeafNode(lv_executionTime_10_0, grammarAccess.getSubscriberCallbackAccess().getExecutionTimeINTTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSubscriberCallbackRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"executionTime",
                    							lv_executionTime_10_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_11, grammarAccess.getSubscriberCallbackAccess().getLeftCurlyBracketKeyword_8());
            		
            otherlv_12=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getSubscriberCallbackAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleSubscriberCallback"


    // $ANTLR start "entryRuleServiceCallback"
    // InternalMyDsl.g:1022:1: entryRuleServiceCallback returns [EObject current=null] : iv_ruleServiceCallback= ruleServiceCallback EOF ;
    public final EObject entryRuleServiceCallback() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceCallback = null;


        try {
            // InternalMyDsl.g:1022:56: (iv_ruleServiceCallback= ruleServiceCallback EOF )
            // InternalMyDsl.g:1023:2: iv_ruleServiceCallback= ruleServiceCallback EOF
            {
             newCompositeNode(grammarAccess.getServiceCallbackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceCallback=ruleServiceCallback();

            state._fsp--;

             current =iv_ruleServiceCallback; 
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
    // $ANTLR end "entryRuleServiceCallback"


    // $ANTLR start "ruleServiceCallback"
    // InternalMyDsl.g:1029:1: ruleServiceCallback returns [EObject current=null] : (otherlv_0= 'ServiceCallback' otherlv_1= 'BufferSize' ( (lv_bufferSize_2_0= RULE_INT ) ) otherlv_3= 'CallbackName' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'service' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'executedIn' ( (otherlv_8= RULE_ID ) )+ )? (otherlv_9= 'CallBackExecutionTime' ( (lv_executionTime_10_0= RULE_INT ) ) )? otherlv_11= '{' otherlv_12= '}' ) ;
    public final EObject ruleServiceCallback() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_bufferSize_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_executionTime_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1035:2: ( (otherlv_0= 'ServiceCallback' otherlv_1= 'BufferSize' ( (lv_bufferSize_2_0= RULE_INT ) ) otherlv_3= 'CallbackName' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'service' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'executedIn' ( (otherlv_8= RULE_ID ) )+ )? (otherlv_9= 'CallBackExecutionTime' ( (lv_executionTime_10_0= RULE_INT ) ) )? otherlv_11= '{' otherlv_12= '}' ) )
            // InternalMyDsl.g:1036:2: (otherlv_0= 'ServiceCallback' otherlv_1= 'BufferSize' ( (lv_bufferSize_2_0= RULE_INT ) ) otherlv_3= 'CallbackName' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'service' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'executedIn' ( (otherlv_8= RULE_ID ) )+ )? (otherlv_9= 'CallBackExecutionTime' ( (lv_executionTime_10_0= RULE_INT ) ) )? otherlv_11= '{' otherlv_12= '}' )
            {
            // InternalMyDsl.g:1036:2: (otherlv_0= 'ServiceCallback' otherlv_1= 'BufferSize' ( (lv_bufferSize_2_0= RULE_INT ) ) otherlv_3= 'CallbackName' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'service' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'executedIn' ( (otherlv_8= RULE_ID ) )+ )? (otherlv_9= 'CallBackExecutionTime' ( (lv_executionTime_10_0= RULE_INT ) ) )? otherlv_11= '{' otherlv_12= '}' )
            // InternalMyDsl.g:1037:3: otherlv_0= 'ServiceCallback' otherlv_1= 'BufferSize' ( (lv_bufferSize_2_0= RULE_INT ) ) otherlv_3= 'CallbackName' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'service' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'executedIn' ( (otherlv_8= RULE_ID ) )+ )? (otherlv_9= 'CallBackExecutionTime' ( (lv_executionTime_10_0= RULE_INT ) ) )? otherlv_11= '{' otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceCallbackAccess().getServiceCallbackKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceCallbackAccess().getBufferSizeKeyword_1());
            		
            // InternalMyDsl.g:1045:3: ( (lv_bufferSize_2_0= RULE_INT ) )
            // InternalMyDsl.g:1046:4: (lv_bufferSize_2_0= RULE_INT )
            {
            // InternalMyDsl.g:1046:4: (lv_bufferSize_2_0= RULE_INT )
            // InternalMyDsl.g:1047:5: lv_bufferSize_2_0= RULE_INT
            {
            lv_bufferSize_2_0=(Token)match(input,RULE_INT,FOLLOW_35); 

            					newLeafNode(lv_bufferSize_2_0, grammarAccess.getServiceCallbackAccess().getBufferSizeINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceCallbackRule());
            					}
            					setWithLastConsumed(
            						current,
            						"bufferSize",
            						lv_bufferSize_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceCallbackAccess().getCallbackNameKeyword_3());
            		
            // InternalMyDsl.g:1067:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalMyDsl.g:1068:4: (lv_name_4_0= RULE_ID )
            {
            // InternalMyDsl.g:1068:4: (lv_name_4_0= RULE_ID )
            // InternalMyDsl.g:1069:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(lv_name_4_0, grammarAccess.getServiceCallbackAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceCallbackRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:1085:3: (otherlv_5= 'service' ( (otherlv_6= RULE_ID ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1086:4: otherlv_5= 'service' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getServiceCallbackAccess().getServiceKeyword_5_0());
                    			
                    // InternalMyDsl.g:1090:4: ( (otherlv_6= RULE_ID ) )
                    // InternalMyDsl.g:1091:5: (otherlv_6= RULE_ID )
                    {
                    // InternalMyDsl.g:1091:5: (otherlv_6= RULE_ID )
                    // InternalMyDsl.g:1092:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServiceCallbackRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_40); 

                    						newLeafNode(otherlv_6, grammarAccess.getServiceCallbackAccess().getServiceServiceCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1104:3: (otherlv_7= 'executedIn' ( (otherlv_8= RULE_ID ) )+ )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==33) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:1105:4: otherlv_7= 'executedIn' ( (otherlv_8= RULE_ID ) )+
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_7, grammarAccess.getServiceCallbackAccess().getExecutedInKeyword_6_0());
                    			
                    // InternalMyDsl.g:1109:4: ( (otherlv_8= RULE_ID ) )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==RULE_ID) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalMyDsl.g:1110:5: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:1110:5: (otherlv_8= RULE_ID )
                    	    // InternalMyDsl.g:1111:6: otherlv_8= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getServiceCallbackRule());
                    	    						}
                    	    					
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_38); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getServiceCallbackAccess().getExecutedInExecutorCrossReference_6_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt28 >= 1 ) break loop28;
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:1123:3: (otherlv_9= 'CallBackExecutionTime' ( (lv_executionTime_10_0= RULE_INT ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==34) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:1124:4: otherlv_9= 'CallBackExecutionTime' ( (lv_executionTime_10_0= RULE_INT ) )
                    {
                    otherlv_9=(Token)match(input,34,FOLLOW_33); 

                    				newLeafNode(otherlv_9, grammarAccess.getServiceCallbackAccess().getCallBackExecutionTimeKeyword_7_0());
                    			
                    // InternalMyDsl.g:1128:4: ( (lv_executionTime_10_0= RULE_INT ) )
                    // InternalMyDsl.g:1129:5: (lv_executionTime_10_0= RULE_INT )
                    {
                    // InternalMyDsl.g:1129:5: (lv_executionTime_10_0= RULE_INT )
                    // InternalMyDsl.g:1130:6: lv_executionTime_10_0= RULE_INT
                    {
                    lv_executionTime_10_0=(Token)match(input,RULE_INT,FOLLOW_5); 

                    						newLeafNode(lv_executionTime_10_0, grammarAccess.getServiceCallbackAccess().getExecutionTimeINTTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServiceCallbackRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"executionTime",
                    							lv_executionTime_10_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_11, grammarAccess.getServiceCallbackAccess().getLeftCurlyBracketKeyword_8());
            		
            otherlv_12=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getServiceCallbackAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleServiceCallback"


    // $ANTLR start "entryRuleClientCallback"
    // InternalMyDsl.g:1159:1: entryRuleClientCallback returns [EObject current=null] : iv_ruleClientCallback= ruleClientCallback EOF ;
    public final EObject entryRuleClientCallback() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClientCallback = null;


        try {
            // InternalMyDsl.g:1159:55: (iv_ruleClientCallback= ruleClientCallback EOF )
            // InternalMyDsl.g:1160:2: iv_ruleClientCallback= ruleClientCallback EOF
            {
             newCompositeNode(grammarAccess.getClientCallbackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClientCallback=ruleClientCallback();

            state._fsp--;

             current =iv_ruleClientCallback; 
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
    // $ANTLR end "entryRuleClientCallback"


    // $ANTLR start "ruleClientCallback"
    // InternalMyDsl.g:1166:1: ruleClientCallback returns [EObject current=null] : (otherlv_0= 'ClientCallback' otherlv_1= 'BufferSize' ( (lv_bufferSize_2_0= RULE_INT ) ) otherlv_3= 'CallbackName' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'executedIn' ( (otherlv_6= RULE_ID ) )+ )? (otherlv_7= 'CallBackExecutionTime' ( (lv_executionTime_8_0= RULE_INT ) ) )? otherlv_9= '{' otherlv_10= '}' ) ;
    public final EObject ruleClientCallback() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_bufferSize_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_executionTime_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1172:2: ( (otherlv_0= 'ClientCallback' otherlv_1= 'BufferSize' ( (lv_bufferSize_2_0= RULE_INT ) ) otherlv_3= 'CallbackName' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'executedIn' ( (otherlv_6= RULE_ID ) )+ )? (otherlv_7= 'CallBackExecutionTime' ( (lv_executionTime_8_0= RULE_INT ) ) )? otherlv_9= '{' otherlv_10= '}' ) )
            // InternalMyDsl.g:1173:2: (otherlv_0= 'ClientCallback' otherlv_1= 'BufferSize' ( (lv_bufferSize_2_0= RULE_INT ) ) otherlv_3= 'CallbackName' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'executedIn' ( (otherlv_6= RULE_ID ) )+ )? (otherlv_7= 'CallBackExecutionTime' ( (lv_executionTime_8_0= RULE_INT ) ) )? otherlv_9= '{' otherlv_10= '}' )
            {
            // InternalMyDsl.g:1173:2: (otherlv_0= 'ClientCallback' otherlv_1= 'BufferSize' ( (lv_bufferSize_2_0= RULE_INT ) ) otherlv_3= 'CallbackName' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'executedIn' ( (otherlv_6= RULE_ID ) )+ )? (otherlv_7= 'CallBackExecutionTime' ( (lv_executionTime_8_0= RULE_INT ) ) )? otherlv_9= '{' otherlv_10= '}' )
            // InternalMyDsl.g:1174:3: otherlv_0= 'ClientCallback' otherlv_1= 'BufferSize' ( (lv_bufferSize_2_0= RULE_INT ) ) otherlv_3= 'CallbackName' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'executedIn' ( (otherlv_6= RULE_ID ) )+ )? (otherlv_7= 'CallBackExecutionTime' ( (lv_executionTime_8_0= RULE_INT ) ) )? otherlv_9= '{' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getClientCallbackAccess().getClientCallbackKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getClientCallbackAccess().getBufferSizeKeyword_1());
            		
            // InternalMyDsl.g:1182:3: ( (lv_bufferSize_2_0= RULE_INT ) )
            // InternalMyDsl.g:1183:4: (lv_bufferSize_2_0= RULE_INT )
            {
            // InternalMyDsl.g:1183:4: (lv_bufferSize_2_0= RULE_INT )
            // InternalMyDsl.g:1184:5: lv_bufferSize_2_0= RULE_INT
            {
            lv_bufferSize_2_0=(Token)match(input,RULE_INT,FOLLOW_35); 

            					newLeafNode(lv_bufferSize_2_0, grammarAccess.getClientCallbackAccess().getBufferSizeINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClientCallbackRule());
            					}
            					setWithLastConsumed(
            						current,
            						"bufferSize",
            						lv_bufferSize_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getClientCallbackAccess().getCallbackNameKeyword_3());
            		
            // InternalMyDsl.g:1204:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalMyDsl.g:1205:4: (lv_name_4_0= RULE_ID )
            {
            // InternalMyDsl.g:1205:4: (lv_name_4_0= RULE_ID )
            // InternalMyDsl.g:1206:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_40); 

            					newLeafNode(lv_name_4_0, grammarAccess.getClientCallbackAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClientCallbackRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:1222:3: (otherlv_5= 'executedIn' ( (otherlv_6= RULE_ID ) )+ )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==33) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:1223:4: otherlv_5= 'executedIn' ( (otherlv_6= RULE_ID ) )+
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getClientCallbackAccess().getExecutedInKeyword_5_0());
                    			
                    // InternalMyDsl.g:1227:4: ( (otherlv_6= RULE_ID ) )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_ID) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalMyDsl.g:1228:5: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:1228:5: (otherlv_6= RULE_ID )
                    	    // InternalMyDsl.g:1229:6: otherlv_6= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getClientCallbackRule());
                    	    						}
                    	    					
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_38); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getClientCallbackAccess().getExecutedInExecutorCrossReference_5_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt31 >= 1 ) break loop31;
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:1241:3: (otherlv_7= 'CallBackExecutionTime' ( (lv_executionTime_8_0= RULE_INT ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==34) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:1242:4: otherlv_7= 'CallBackExecutionTime' ( (lv_executionTime_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_33); 

                    				newLeafNode(otherlv_7, grammarAccess.getClientCallbackAccess().getCallBackExecutionTimeKeyword_6_0());
                    			
                    // InternalMyDsl.g:1246:4: ( (lv_executionTime_8_0= RULE_INT ) )
                    // InternalMyDsl.g:1247:5: (lv_executionTime_8_0= RULE_INT )
                    {
                    // InternalMyDsl.g:1247:5: (lv_executionTime_8_0= RULE_INT )
                    // InternalMyDsl.g:1248:6: lv_executionTime_8_0= RULE_INT
                    {
                    lv_executionTime_8_0=(Token)match(input,RULE_INT,FOLLOW_5); 

                    						newLeafNode(lv_executionTime_8_0, grammarAccess.getClientCallbackAccess().getExecutionTimeINTTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClientCallbackRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"executionTime",
                    							lv_executionTime_8_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_9, grammarAccess.getClientCallbackAccess().getLeftCurlyBracketKeyword_7());
            		
            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getClientCallbackAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleClientCallback"


    // $ANTLR start "entryRuleTimerCallback"
    // InternalMyDsl.g:1277:1: entryRuleTimerCallback returns [EObject current=null] : iv_ruleTimerCallback= ruleTimerCallback EOF ;
    public final EObject entryRuleTimerCallback() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimerCallback = null;


        try {
            // InternalMyDsl.g:1277:54: (iv_ruleTimerCallback= ruleTimerCallback EOF )
            // InternalMyDsl.g:1278:2: iv_ruleTimerCallback= ruleTimerCallback EOF
            {
             newCompositeNode(grammarAccess.getTimerCallbackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimerCallback=ruleTimerCallback();

            state._fsp--;

             current =iv_ruleTimerCallback; 
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
    // $ANTLR end "entryRuleTimerCallback"


    // $ANTLR start "ruleTimerCallback"
    // InternalMyDsl.g:1284:1: ruleTimerCallback returns [EObject current=null] : (otherlv_0= 'TimerCallback' otherlv_1= 'BufferSize' ( (lv_bufferSize_2_0= RULE_INT ) ) otherlv_3= 'CallbackName' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'executedIn' ( (otherlv_6= RULE_ID ) )+ )? (otherlv_7= 'of' ( (otherlv_8= RULE_STRING ) ) )? (otherlv_9= 'CallBackExecutionTime' ( (lv_executionTime_10_0= RULE_INT ) ) )? otherlv_11= '{' otherlv_12= '}' ) ;
    public final EObject ruleTimerCallback() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_bufferSize_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_executionTime_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1290:2: ( (otherlv_0= 'TimerCallback' otherlv_1= 'BufferSize' ( (lv_bufferSize_2_0= RULE_INT ) ) otherlv_3= 'CallbackName' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'executedIn' ( (otherlv_6= RULE_ID ) )+ )? (otherlv_7= 'of' ( (otherlv_8= RULE_STRING ) ) )? (otherlv_9= 'CallBackExecutionTime' ( (lv_executionTime_10_0= RULE_INT ) ) )? otherlv_11= '{' otherlv_12= '}' ) )
            // InternalMyDsl.g:1291:2: (otherlv_0= 'TimerCallback' otherlv_1= 'BufferSize' ( (lv_bufferSize_2_0= RULE_INT ) ) otherlv_3= 'CallbackName' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'executedIn' ( (otherlv_6= RULE_ID ) )+ )? (otherlv_7= 'of' ( (otherlv_8= RULE_STRING ) ) )? (otherlv_9= 'CallBackExecutionTime' ( (lv_executionTime_10_0= RULE_INT ) ) )? otherlv_11= '{' otherlv_12= '}' )
            {
            // InternalMyDsl.g:1291:2: (otherlv_0= 'TimerCallback' otherlv_1= 'BufferSize' ( (lv_bufferSize_2_0= RULE_INT ) ) otherlv_3= 'CallbackName' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'executedIn' ( (otherlv_6= RULE_ID ) )+ )? (otherlv_7= 'of' ( (otherlv_8= RULE_STRING ) ) )? (otherlv_9= 'CallBackExecutionTime' ( (lv_executionTime_10_0= RULE_INT ) ) )? otherlv_11= '{' otherlv_12= '}' )
            // InternalMyDsl.g:1292:3: otherlv_0= 'TimerCallback' otherlv_1= 'BufferSize' ( (lv_bufferSize_2_0= RULE_INT ) ) otherlv_3= 'CallbackName' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'executedIn' ( (otherlv_6= RULE_ID ) )+ )? (otherlv_7= 'of' ( (otherlv_8= RULE_STRING ) ) )? (otherlv_9= 'CallBackExecutionTime' ( (lv_executionTime_10_0= RULE_INT ) ) )? otherlv_11= '{' otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getTimerCallbackAccess().getTimerCallbackKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getTimerCallbackAccess().getBufferSizeKeyword_1());
            		
            // InternalMyDsl.g:1300:3: ( (lv_bufferSize_2_0= RULE_INT ) )
            // InternalMyDsl.g:1301:4: (lv_bufferSize_2_0= RULE_INT )
            {
            // InternalMyDsl.g:1301:4: (lv_bufferSize_2_0= RULE_INT )
            // InternalMyDsl.g:1302:5: lv_bufferSize_2_0= RULE_INT
            {
            lv_bufferSize_2_0=(Token)match(input,RULE_INT,FOLLOW_35); 

            					newLeafNode(lv_bufferSize_2_0, grammarAccess.getTimerCallbackAccess().getBufferSizeINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimerCallbackRule());
            					}
            					setWithLastConsumed(
            						current,
            						"bufferSize",
            						lv_bufferSize_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getTimerCallbackAccess().getCallbackNameKeyword_3());
            		
            // InternalMyDsl.g:1322:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalMyDsl.g:1323:4: (lv_name_4_0= RULE_ID )
            {
            // InternalMyDsl.g:1323:4: (lv_name_4_0= RULE_ID )
            // InternalMyDsl.g:1324:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(lv_name_4_0, grammarAccess.getTimerCallbackAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimerCallbackRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:1340:3: (otherlv_5= 'executedIn' ( (otherlv_6= RULE_ID ) )+ )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==33) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:1341:4: otherlv_5= 'executedIn' ( (otherlv_6= RULE_ID ) )+
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getTimerCallbackAccess().getExecutedInKeyword_5_0());
                    			
                    // InternalMyDsl.g:1345:4: ( (otherlv_6= RULE_ID ) )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==RULE_ID) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalMyDsl.g:1346:5: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:1346:5: (otherlv_6= RULE_ID )
                    	    // InternalMyDsl.g:1347:6: otherlv_6= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getTimerCallbackRule());
                    	    						}
                    	    					
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_42); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getTimerCallbackAccess().getExecutedInExecutorCrossReference_5_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:1359:3: (otherlv_7= 'of' ( (otherlv_8= RULE_STRING ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:1360:4: otherlv_7= 'of' ( (otherlv_8= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getTimerCallbackAccess().getOfKeyword_6_0());
                    			
                    // InternalMyDsl.g:1364:4: ( (otherlv_8= RULE_STRING ) )
                    // InternalMyDsl.g:1365:5: (otherlv_8= RULE_STRING )
                    {
                    // InternalMyDsl.g:1365:5: (otherlv_8= RULE_STRING )
                    // InternalMyDsl.g:1366:6: otherlv_8= RULE_STRING
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTimerCallbackRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_STRING,FOLLOW_43); 

                    						newLeafNode(otherlv_8, grammarAccess.getTimerCallbackAccess().getOfSystemTimerCrossReference_6_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1378:3: (otherlv_9= 'CallBackExecutionTime' ( (lv_executionTime_10_0= RULE_INT ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==34) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:1379:4: otherlv_9= 'CallBackExecutionTime' ( (lv_executionTime_10_0= RULE_INT ) )
                    {
                    otherlv_9=(Token)match(input,34,FOLLOW_33); 

                    				newLeafNode(otherlv_9, grammarAccess.getTimerCallbackAccess().getCallBackExecutionTimeKeyword_7_0());
                    			
                    // InternalMyDsl.g:1383:4: ( (lv_executionTime_10_0= RULE_INT ) )
                    // InternalMyDsl.g:1384:5: (lv_executionTime_10_0= RULE_INT )
                    {
                    // InternalMyDsl.g:1384:5: (lv_executionTime_10_0= RULE_INT )
                    // InternalMyDsl.g:1385:6: lv_executionTime_10_0= RULE_INT
                    {
                    lv_executionTime_10_0=(Token)match(input,RULE_INT,FOLLOW_5); 

                    						newLeafNode(lv_executionTime_10_0, grammarAccess.getTimerCallbackAccess().getExecutionTimeINTTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTimerCallbackRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"executionTime",
                    							lv_executionTime_10_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_11, grammarAccess.getTimerCallbackAccess().getLeftCurlyBracketKeyword_8());
            		
            otherlv_12=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getTimerCallbackAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleTimerCallback"


    // $ANTLR start "entryRuleSystemTimer"
    // InternalMyDsl.g:1414:1: entryRuleSystemTimer returns [EObject current=null] : iv_ruleSystemTimer= ruleSystemTimer EOF ;
    public final EObject entryRuleSystemTimer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemTimer = null;


        try {
            // InternalMyDsl.g:1414:52: (iv_ruleSystemTimer= ruleSystemTimer EOF )
            // InternalMyDsl.g:1415:2: iv_ruleSystemTimer= ruleSystemTimer EOF
            {
             newCompositeNode(grammarAccess.getSystemTimerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemTimer=ruleSystemTimer();

            state._fsp--;

             current =iv_ruleSystemTimer; 
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
    // $ANTLR end "entryRuleSystemTimer"


    // $ANTLR start "ruleSystemTimer"
    // InternalMyDsl.g:1421:1: ruleSystemTimer returns [EObject current=null] : (this_PeriodicTimer_0= rulePeriodicTimer | this_Walltimer_1= ruleWalltimer ) ;
    public final EObject ruleSystemTimer() throws RecognitionException {
        EObject current = null;

        EObject this_PeriodicTimer_0 = null;

        EObject this_Walltimer_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1427:2: ( (this_PeriodicTimer_0= rulePeriodicTimer | this_Walltimer_1= ruleWalltimer ) )
            // InternalMyDsl.g:1428:2: (this_PeriodicTimer_0= rulePeriodicTimer | this_Walltimer_1= ruleWalltimer )
            {
            // InternalMyDsl.g:1428:2: (this_PeriodicTimer_0= rulePeriodicTimer | this_Walltimer_1= ruleWalltimer )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==39) ) {
                alt38=1;
            }
            else if ( (LA38_0==43) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:1429:3: this_PeriodicTimer_0= rulePeriodicTimer
                    {

                    			newCompositeNode(grammarAccess.getSystemTimerAccess().getPeriodicTimerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PeriodicTimer_0=rulePeriodicTimer();

                    state._fsp--;


                    			current = this_PeriodicTimer_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1438:3: this_Walltimer_1= ruleWalltimer
                    {

                    			newCompositeNode(grammarAccess.getSystemTimerAccess().getWalltimerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Walltimer_1=ruleWalltimer();

                    state._fsp--;


                    			current = this_Walltimer_1;
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
    // $ANTLR end "ruleSystemTimer"


    // $ANTLR start "entryRulePeriodicTimer"
    // InternalMyDsl.g:1450:1: entryRulePeriodicTimer returns [EObject current=null] : iv_rulePeriodicTimer= rulePeriodicTimer EOF ;
    public final EObject entryRulePeriodicTimer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePeriodicTimer = null;


        try {
            // InternalMyDsl.g:1450:54: (iv_rulePeriodicTimer= rulePeriodicTimer EOF )
            // InternalMyDsl.g:1451:2: iv_rulePeriodicTimer= rulePeriodicTimer EOF
            {
             newCompositeNode(grammarAccess.getPeriodicTimerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePeriodicTimer=rulePeriodicTimer();

            state._fsp--;

             current =iv_rulePeriodicTimer; 
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
    // $ANTLR end "entryRulePeriodicTimer"


    // $ANTLR start "rulePeriodicTimer"
    // InternalMyDsl.g:1457:1: rulePeriodicTimer returns [EObject current=null] : ( () otherlv_1= 'PeriodicTimer' otherlv_2= 'Period' ( (lv_period_3_0= RULE_INT ) ) otherlv_4= 'SystemTimerName' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'from' ( (otherlv_7= RULE_ID ) ) otherlv_8= '{' ( (lv_systemtimer_9_0= ruleSystemTimer ) )* otherlv_10= '}' ) ;
    public final EObject rulePeriodicTimer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_period_3_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_systemtimer_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1463:2: ( ( () otherlv_1= 'PeriodicTimer' otherlv_2= 'Period' ( (lv_period_3_0= RULE_INT ) ) otherlv_4= 'SystemTimerName' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'from' ( (otherlv_7= RULE_ID ) ) otherlv_8= '{' ( (lv_systemtimer_9_0= ruleSystemTimer ) )* otherlv_10= '}' ) )
            // InternalMyDsl.g:1464:2: ( () otherlv_1= 'PeriodicTimer' otherlv_2= 'Period' ( (lv_period_3_0= RULE_INT ) ) otherlv_4= 'SystemTimerName' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'from' ( (otherlv_7= RULE_ID ) ) otherlv_8= '{' ( (lv_systemtimer_9_0= ruleSystemTimer ) )* otherlv_10= '}' )
            {
            // InternalMyDsl.g:1464:2: ( () otherlv_1= 'PeriodicTimer' otherlv_2= 'Period' ( (lv_period_3_0= RULE_INT ) ) otherlv_4= 'SystemTimerName' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'from' ( (otherlv_7= RULE_ID ) ) otherlv_8= '{' ( (lv_systemtimer_9_0= ruleSystemTimer ) )* otherlv_10= '}' )
            // InternalMyDsl.g:1465:3: () otherlv_1= 'PeriodicTimer' otherlv_2= 'Period' ( (lv_period_3_0= RULE_INT ) ) otherlv_4= 'SystemTimerName' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'from' ( (otherlv_7= RULE_ID ) ) otherlv_8= '{' ( (lv_systemtimer_9_0= ruleSystemTimer ) )* otherlv_10= '}'
            {
            // InternalMyDsl.g:1465:3: ()
            // InternalMyDsl.g:1466:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPeriodicTimerAccess().getPeriodicTimerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getPeriodicTimerAccess().getPeriodicTimerKeyword_1());
            		
            otherlv_2=(Token)match(input,40,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getPeriodicTimerAccess().getPeriodKeyword_2());
            		
            // InternalMyDsl.g:1480:3: ( (lv_period_3_0= RULE_INT ) )
            // InternalMyDsl.g:1481:4: (lv_period_3_0= RULE_INT )
            {
            // InternalMyDsl.g:1481:4: (lv_period_3_0= RULE_INT )
            // InternalMyDsl.g:1482:5: lv_period_3_0= RULE_INT
            {
            lv_period_3_0=(Token)match(input,RULE_INT,FOLLOW_45); 

            					newLeafNode(lv_period_3_0, grammarAccess.getPeriodicTimerAccess().getPeriodINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPeriodicTimerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"period",
            						lv_period_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getPeriodicTimerAccess().getSystemTimerNameKeyword_4());
            		
            // InternalMyDsl.g:1502:3: ( (lv_name_5_0= RULE_STRING ) )
            // InternalMyDsl.g:1503:4: (lv_name_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:1503:4: (lv_name_5_0= RULE_STRING )
            // InternalMyDsl.g:1504:5: lv_name_5_0= RULE_STRING
            {
            lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_46); 

            					newLeafNode(lv_name_5_0, grammarAccess.getPeriodicTimerAccess().getNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPeriodicTimerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,42,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getPeriodicTimerAccess().getFromKeyword_6());
            		
            // InternalMyDsl.g:1524:3: ( (otherlv_7= RULE_ID ) )
            // InternalMyDsl.g:1525:4: (otherlv_7= RULE_ID )
            {
            // InternalMyDsl.g:1525:4: (otherlv_7= RULE_ID )
            // InternalMyDsl.g:1526:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPeriodicTimerRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_7, grammarAccess.getPeriodicTimerAccess().getFromTimerCallbackCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getPeriodicTimerAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalMyDsl.g:1541:3: ( (lv_systemtimer_9_0= ruleSystemTimer ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==39||LA39_0==43) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalMyDsl.g:1542:4: (lv_systemtimer_9_0= ruleSystemTimer )
            	    {
            	    // InternalMyDsl.g:1542:4: (lv_systemtimer_9_0= ruleSystemTimer )
            	    // InternalMyDsl.g:1543:5: lv_systemtimer_9_0= ruleSystemTimer
            	    {

            	    					newCompositeNode(grammarAccess.getPeriodicTimerAccess().getSystemtimerSystemTimerParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_systemtimer_9_0=ruleSystemTimer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPeriodicTimerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"systemtimer",
            	    						lv_systemtimer_9_0,
            	    						"org.xtext.example.mydsl.MyDsl.SystemTimer");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getPeriodicTimerAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "rulePeriodicTimer"


    // $ANTLR start "entryRuleWalltimer"
    // InternalMyDsl.g:1568:1: entryRuleWalltimer returns [EObject current=null] : iv_ruleWalltimer= ruleWalltimer EOF ;
    public final EObject entryRuleWalltimer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWalltimer = null;


        try {
            // InternalMyDsl.g:1568:50: (iv_ruleWalltimer= ruleWalltimer EOF )
            // InternalMyDsl.g:1569:2: iv_ruleWalltimer= ruleWalltimer EOF
            {
             newCompositeNode(grammarAccess.getWalltimerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWalltimer=ruleWalltimer();

            state._fsp--;

             current =iv_ruleWalltimer; 
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
    // $ANTLR end "entryRuleWalltimer"


    // $ANTLR start "ruleWalltimer"
    // InternalMyDsl.g:1575:1: ruleWalltimer returns [EObject current=null] : ( () otherlv_1= 'Walltimer' otherlv_2= 'ReleaseTimes' ( (lv_releaseTimes_3_0= RULE_INT ) ) otherlv_4= 'SystemTimerName' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'from' ( (otherlv_7= RULE_ID ) ) otherlv_8= '{' ( (lv_systemtimer_9_0= ruleSystemTimer ) )* otherlv_10= '}' ) ;
    public final EObject ruleWalltimer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_releaseTimes_3_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_systemtimer_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1581:2: ( ( () otherlv_1= 'Walltimer' otherlv_2= 'ReleaseTimes' ( (lv_releaseTimes_3_0= RULE_INT ) ) otherlv_4= 'SystemTimerName' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'from' ( (otherlv_7= RULE_ID ) ) otherlv_8= '{' ( (lv_systemtimer_9_0= ruleSystemTimer ) )* otherlv_10= '}' ) )
            // InternalMyDsl.g:1582:2: ( () otherlv_1= 'Walltimer' otherlv_2= 'ReleaseTimes' ( (lv_releaseTimes_3_0= RULE_INT ) ) otherlv_4= 'SystemTimerName' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'from' ( (otherlv_7= RULE_ID ) ) otherlv_8= '{' ( (lv_systemtimer_9_0= ruleSystemTimer ) )* otherlv_10= '}' )
            {
            // InternalMyDsl.g:1582:2: ( () otherlv_1= 'Walltimer' otherlv_2= 'ReleaseTimes' ( (lv_releaseTimes_3_0= RULE_INT ) ) otherlv_4= 'SystemTimerName' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'from' ( (otherlv_7= RULE_ID ) ) otherlv_8= '{' ( (lv_systemtimer_9_0= ruleSystemTimer ) )* otherlv_10= '}' )
            // InternalMyDsl.g:1583:3: () otherlv_1= 'Walltimer' otherlv_2= 'ReleaseTimes' ( (lv_releaseTimes_3_0= RULE_INT ) ) otherlv_4= 'SystemTimerName' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= 'from' ( (otherlv_7= RULE_ID ) ) otherlv_8= '{' ( (lv_systemtimer_9_0= ruleSystemTimer ) )* otherlv_10= '}'
            {
            // InternalMyDsl.g:1583:3: ()
            // InternalMyDsl.g:1584:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWalltimerAccess().getWalltimerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getWalltimerAccess().getWalltimerKeyword_1());
            		
            otherlv_2=(Token)match(input,44,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getWalltimerAccess().getReleaseTimesKeyword_2());
            		
            // InternalMyDsl.g:1598:3: ( (lv_releaseTimes_3_0= RULE_INT ) )
            // InternalMyDsl.g:1599:4: (lv_releaseTimes_3_0= RULE_INT )
            {
            // InternalMyDsl.g:1599:4: (lv_releaseTimes_3_0= RULE_INT )
            // InternalMyDsl.g:1600:5: lv_releaseTimes_3_0= RULE_INT
            {
            lv_releaseTimes_3_0=(Token)match(input,RULE_INT,FOLLOW_45); 

            					newLeafNode(lv_releaseTimes_3_0, grammarAccess.getWalltimerAccess().getReleaseTimesINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWalltimerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"releaseTimes",
            						lv_releaseTimes_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getWalltimerAccess().getSystemTimerNameKeyword_4());
            		
            // InternalMyDsl.g:1620:3: ( (lv_name_5_0= RULE_STRING ) )
            // InternalMyDsl.g:1621:4: (lv_name_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:1621:4: (lv_name_5_0= RULE_STRING )
            // InternalMyDsl.g:1622:5: lv_name_5_0= RULE_STRING
            {
            lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_46); 

            					newLeafNode(lv_name_5_0, grammarAccess.getWalltimerAccess().getNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWalltimerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,42,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getWalltimerAccess().getFromKeyword_6());
            		
            // InternalMyDsl.g:1642:3: ( (otherlv_7= RULE_ID ) )
            // InternalMyDsl.g:1643:4: (otherlv_7= RULE_ID )
            {
            // InternalMyDsl.g:1643:4: (otherlv_7= RULE_ID )
            // InternalMyDsl.g:1644:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWalltimerRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_7, grammarAccess.getWalltimerAccess().getFromTimerCallbackCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getWalltimerAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalMyDsl.g:1659:3: ( (lv_systemtimer_9_0= ruleSystemTimer ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==39||LA40_0==43) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMyDsl.g:1660:4: (lv_systemtimer_9_0= ruleSystemTimer )
            	    {
            	    // InternalMyDsl.g:1660:4: (lv_systemtimer_9_0= ruleSystemTimer )
            	    // InternalMyDsl.g:1661:5: lv_systemtimer_9_0= ruleSystemTimer
            	    {

            	    					newCompositeNode(grammarAccess.getWalltimerAccess().getSystemtimerSystemTimerParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_systemtimer_9_0=ruleSystemTimer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWalltimerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"systemtimer",
            	    						lv_systemtimer_9_0,
            	    						"org.xtext.example.mydsl.MyDsl.SystemTimer");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getWalltimerAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleWalltimer"


    // $ANTLR start "ruleExecutorType"
    // InternalMyDsl.g:1686:1: ruleExecutorType returns [Enumerator current=null] : ( (enumLiteral_0= 'SINGLETHREADED' ) | (enumLiteral_1= 'STATICSINGLETHREADED' ) | (enumLiteral_2= 'MULTITHREADED' ) ) ;
    public final Enumerator ruleExecutorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1692:2: ( ( (enumLiteral_0= 'SINGLETHREADED' ) | (enumLiteral_1= 'STATICSINGLETHREADED' ) | (enumLiteral_2= 'MULTITHREADED' ) ) )
            // InternalMyDsl.g:1693:2: ( (enumLiteral_0= 'SINGLETHREADED' ) | (enumLiteral_1= 'STATICSINGLETHREADED' ) | (enumLiteral_2= 'MULTITHREADED' ) )
            {
            // InternalMyDsl.g:1693:2: ( (enumLiteral_0= 'SINGLETHREADED' ) | (enumLiteral_1= 'STATICSINGLETHREADED' ) | (enumLiteral_2= 'MULTITHREADED' ) )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt41=1;
                }
                break;
            case 46:
                {
                alt41=2;
                }
                break;
            case 47:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:1694:3: (enumLiteral_0= 'SINGLETHREADED' )
                    {
                    // InternalMyDsl.g:1694:3: (enumLiteral_0= 'SINGLETHREADED' )
                    // InternalMyDsl.g:1695:4: enumLiteral_0= 'SINGLETHREADED'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getExecutorTypeAccess().getSINGLETHREADEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getExecutorTypeAccess().getSINGLETHREADEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1702:3: (enumLiteral_1= 'STATICSINGLETHREADED' )
                    {
                    // InternalMyDsl.g:1702:3: (enumLiteral_1= 'STATICSINGLETHREADED' )
                    // InternalMyDsl.g:1703:4: enumLiteral_1= 'STATICSINGLETHREADED'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getExecutorTypeAccess().getSTATICSINGLETHREADEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getExecutorTypeAccess().getSTATICSINGLETHREADEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1710:3: (enumLiteral_2= 'MULTITHREADED' )
                    {
                    // InternalMyDsl.g:1710:3: (enumLiteral_2= 'MULTITHREADED' )
                    // InternalMyDsl.g:1711:4: enumLiteral_2= 'MULTITHREADED'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getExecutorTypeAccess().getMULTITHREADEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getExecutorTypeAccess().getMULTITHREADEDEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleExecutorType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000100C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000008800104A000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000088000042000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000088000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000080000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000003848402000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000003840402000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000003800402000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000003000402000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000003000002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000E00000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000381000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000301000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000006001000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000004001000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000700001000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000600001020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000400001020L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000600801000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000600001000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000004600001000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000004400001020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000400001000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000100000000000L});

}