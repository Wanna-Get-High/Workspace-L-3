// $ANTLR 3.4 Init.g 2011-12-05 19:40:20

package init.analyseurs;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class InitParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLANCS", "ENTIER", "IDENT", "LETTRE", "NEWLINE", "','", "':='", "';'", "'int'", "'program'", "'read'"
    };

    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int BLANCS=4;
    public static final int ENTIER=5;
    public static final int IDENT=6;
    public static final int LETTRE=7;
    public static final int NEWLINE=8;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public InitParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public InitParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return InitParser.tokenNames; }
    public String getGrammarFileName() { return "Init.g"; }


    public boolean erreur = false;
    @Override
    public void reportError(RecognitionException e) {
      super.reportError(e);
      this.erreur = true;
    }



    // $ANTLR start "axiome"
    // Init.g:37:1: axiome : entete ( declaration )* affectations ( read )* ( error1 )* ( error2 )* ;
    public final void axiome() throws RecognitionException {
        try {
            // Init.g:37:7: ( entete ( declaration )* affectations ( read )* ( error1 )* ( error2 )* )
            // Init.g:37:10: entete ( declaration )* affectations ( read )* ( error1 )* ( error2 )*
            {
            pushFollow(FOLLOW_entete_in_axiome48);
            entete();

            state._fsp--;


            // Init.g:37:17: ( declaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Init.g:37:17: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_axiome50);
            	    declaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            pushFollow(FOLLOW_affectations_in_axiome53);
            affectations();

            state._fsp--;


            // Init.g:37:43: ( read )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Init.g:37:43: read
            	    {
            	    pushFollow(FOLLOW_read_in_axiome55);
            	    read();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // Init.g:37:49: ( error1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ENTIER) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Init.g:37:49: error1
            	    {
            	    pushFollow(FOLLOW_error1_in_axiome58);
            	    error1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // Init.g:37:57: ( error2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Init.g:37:57: error2
            	    {
            	    pushFollow(FOLLOW_error2_in_axiome61);
            	    error2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "axiome"



    // $ANTLR start "entete"
    // Init.g:39:1: entete : 'program' IDENT ';' ;
    public final void entete() throws RecognitionException {
        try {
            // Init.g:39:7: ( 'program' IDENT ';' )
            // Init.g:39:9: 'program' IDENT ';'
            {
            match(input,13,FOLLOW_13_in_entete69); 

            match(input,IDENT,FOLLOW_IDENT_in_entete71); 

            match(input,11,FOLLOW_11_in_entete73); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "entete"



    // $ANTLR start "declaration"
    // Init.g:41:1: declaration : 'int' ( IDENT | listId ) ';' ;
    public final void declaration() throws RecognitionException {
        try {
            // Init.g:41:12: ( 'int' ( IDENT | listId ) ';' )
            // Init.g:41:14: 'int' ( IDENT | listId ) ';'
            {
            match(input,12,FOLLOW_12_in_declaration81); 

            // Init.g:41:20: ( IDENT | listId )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==IDENT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==9) ) {
                    alt5=2;
                }
                else if ( (LA5_1==11) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // Init.g:41:21: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_declaration84); 

                    }
                    break;
                case 2 :
                    // Init.g:41:28: listId
                    {
                    pushFollow(FOLLOW_listId_in_declaration87);
                    listId();

                    state._fsp--;


                    }
                    break;

            }


            match(input,11,FOLLOW_11_in_declaration90); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "declaration"



    // $ANTLR start "listId"
    // Init.g:43:1: listId : ( IDENT ',' )+ IDENT ;
    public final void listId() throws RecognitionException {
        try {
            // Init.g:43:7: ( ( IDENT ',' )+ IDENT )
            // Init.g:43:9: ( IDENT ',' )+ IDENT
            {
            // Init.g:43:9: ( IDENT ',' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==IDENT) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==9) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // Init.g:43:10: IDENT ','
            	    {
            	    match(input,IDENT,FOLLOW_IDENT_in_listId99); 

            	    match(input,9,FOLLOW_9_in_listId101); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            match(input,IDENT,FOLLOW_IDENT_in_listId105); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "listId"



    // $ANTLR start "read"
    // Init.g:45:1: read : 'read' IDENT ';' ;
    public final void read() throws RecognitionException {
        try {
            // Init.g:45:5: ( 'read' IDENT ';' )
            // Init.g:45:7: 'read' IDENT ';'
            {
            match(input,14,FOLLOW_14_in_read113); 

            match(input,IDENT,FOLLOW_IDENT_in_read115); 

            match(input,11,FOLLOW_11_in_read117); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "read"



    // $ANTLR start "affectations"
    // Init.g:47:1: affectations : ( ( error0 )+ ( affectation )+ | ( affectation )* );
    public final void affectations() throws RecognitionException {
        try {
            // Init.g:47:13: ( ( error0 )+ ( affectation )+ | ( affectation )* )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // Init.g:47:15: ( error0 )+ ( affectation )+
                    {
                    // Init.g:47:15: ( error0 )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // Init.g:47:15: error0
                    	    {
                    	    pushFollow(FOLLOW_error0_in_affectations125);
                    	    error0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    // Init.g:47:23: ( affectation )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==IDENT) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // Init.g:47:23: affectation
                    	    {
                    	    pushFollow(FOLLOW_affectation_in_affectations128);
                    	    affectation();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // Init.g:47:36: ( affectation )*
                    {
                    // Init.g:47:36: ( affectation )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==IDENT) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // Init.g:47:36: affectation
                    	    {
                    	    pushFollow(FOLLOW_affectation_in_affectations131);
                    	    affectation();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


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
        return ;
    }
    // $ANTLR end "affectations"



    // $ANTLR start "affectation"
    // Init.g:48:1: affectation : IDENT ':=' ENTIER ';' ;
    public final void affectation() throws RecognitionException {
        try {
            // Init.g:48:12: ( IDENT ':=' ENTIER ';' )
            // Init.g:48:14: IDENT ':=' ENTIER ';'
            {
            match(input,IDENT,FOLLOW_IDENT_in_affectation138); 

            match(input,10,FOLLOW_10_in_affectation140); 

            match(input,ENTIER,FOLLOW_ENTIER_in_affectation142); 

            match(input,11,FOLLOW_11_in_affectation144); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "affectation"



    // $ANTLR start "error0"
    // Init.g:50:1: error0 : read ;
    public final void error0() throws RecognitionException {
        try {
            // Init.g:50:7: ( read )
            // Init.g:50:9: read
            {
            pushFollow(FOLLOW_read_in_error0152);
            read();

            state._fsp--;


            this.reportError(new RecognitionException());

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "error0"



    // $ANTLR start "error1"
    // Init.g:51:1: error1 : ENTIER ':=' ENTIER ';' ;
    public final void error1() throws RecognitionException {
        try {
            // Init.g:51:7: ( ENTIER ':=' ENTIER ';' )
            // Init.g:51:9: ENTIER ':=' ENTIER ';'
            {
            match(input,ENTIER,FOLLOW_ENTIER_in_error1161); 

            match(input,10,FOLLOW_10_in_error1163); 

            match(input,ENTIER,FOLLOW_ENTIER_in_error1165); 

            match(input,11,FOLLOW_11_in_error1167); 

            this.reportError(new RecognitionException());

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "error1"



    // $ANTLR start "error2"
    // Init.g:52:1: error2 : ';' ;
    public final void error2() throws RecognitionException {
        try {
            // Init.g:52:7: ( ';' )
            // Init.g:52:9: ';'
            {
            match(input,11,FOLLOW_11_in_error2176); 

            this.reportError(new RecognitionException());

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "error2"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\6\uffff";
    static final String DFA10_eofS =
        "\1\2\3\uffff\1\2\1\uffff";
    static final String DFA10_minS =
        "\1\5\1\6\1\uffff\1\13\1\5\1\uffff";
    static final String DFA10_maxS =
        "\1\16\1\6\1\uffff\1\13\1\16\1\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\2\uffff\1\1";
    static final String DFA10_specialS =
        "\6\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\2\4\uffff\1\2\2\uffff\1\1",
            "\1\3",
            "",
            "\1\4",
            "\1\2\1\5\4\uffff\1\2\2\uffff\1\1",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "47:1: affectations : ( ( error0 )+ ( affectation )+ | ( affectation )* );";
        }
    }
 

    public static final BitSet FOLLOW_entete_in_axiome48 = new BitSet(new long[]{0x0000000000005860L});
    public static final BitSet FOLLOW_declaration_in_axiome50 = new BitSet(new long[]{0x0000000000005860L});
    public static final BitSet FOLLOW_affectations_in_axiome53 = new BitSet(new long[]{0x0000000000004822L});
    public static final BitSet FOLLOW_read_in_axiome55 = new BitSet(new long[]{0x0000000000004822L});
    public static final BitSet FOLLOW_error1_in_axiome58 = new BitSet(new long[]{0x0000000000000822L});
    public static final BitSet FOLLOW_error2_in_axiome61 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_13_in_entete69 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_entete71 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_entete73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_declaration81 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_declaration84 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_listId_in_declaration87 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_declaration90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_listId99 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_listId101 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_listId105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_read113 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_read115 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_read117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_error0_in_affectations125 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_affectation_in_affectations128 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_affectation_in_affectations131 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_IDENT_in_affectation138 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_affectation140 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ENTIER_in_affectation142 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_affectation144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_error0152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENTIER_in_error1161 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_error1163 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ENTIER_in_error1165 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_error1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_error2176 = new BitSet(new long[]{0x0000000000000002L});

}