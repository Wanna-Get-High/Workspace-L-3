/* The following code was generated by JFlex 1.4.3 on 06/10/11 11:42 */

/*****************************************************
 * Analyseur lexical pour Init version simple
 * fichier de description pour JFlex
 * produit anLexInit/ScannerInit.java
 * M. Lepan & M. Van Ryseghem 
 * 2011/10/05
 ****************************************************/

/***********************************************************************
 * Première partie : code utilisateur inclus tel quel dans le fichier
 * .java généré. On met typiquement ici les déclarations de paquetage
 * (package) et les importations de classes (import).
 ***********************************************************************/

// déclaration du paquetage auquel appartient la classe générée
package planningMaster.analyseurs;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 06/10/11 11:42 from the specification file
 * <tt>spec/lexiquePlanning.lex</tt>
 */
public class ScannerPlanning implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int A = 2;
  public static final int YYINITIAL = 0;
  public static final int C = 6;
  public static final int B = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3, 3
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\53\13\0\1\37"+
    "\1\36\2\0\1\31\1\25\1\26\1\30\1\32\1\33\1\34\3\4"+
    "\1\0\1\40\5\0\1\10\5\5\1\11\1\5\1\7\2\5\1\12"+
    "\3\5\1\47\1\5\1\14\1\16\1\13\1\5\1\24\4\5\6\0"+
    "\1\42\1\6\1\22\1\41\1\15\1\6\1\51\1\35\1\21\2\6"+
    "\1\45\1\44\1\52\1\6\1\46\1\6\1\17\1\23\1\43\1\50"+
    "\1\20\4\6\u05e5\0\12\27\206\0\12\27\u026c\0\12\27\166\0\12\27"+
    "\166\0\12\27\166\0\12\27\166\0\12\27\167\0\11\27\166\0\12\27"+
    "\166\0\12\27\166\0\12\27\340\0\12\27\166\0\12\27\106\0\12\27"+
    "\u0116\0\12\27\u031f\0\11\27\u046e\0\12\27\46\0\12\27\u012c\0\12\27"+
    "\ue5c0\0\12\27\346\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\1\1\2\2\15\1\16\3\1\2\3\1\1\2"+
    "\3\3\3\0\4\4\10\0\2\3\5\4\7\3\1\5"+
    "\4\4\1\6\3\4\3\0\1\4\1\7\1\4\6\0"+
    "\3\3\2\0\1\3\1\4\1\7\1\4\6\3\2\0"+
    "\1\4\1\7\2\4\1\7\1\4\5\0\1\10\3\0"+
    "\2\3\1\0\3\3\1\10\3\3\4\0\1\11\3\0"+
    "\2\3\2\12\1\3\1\11\3\3\1\13\5\0\1\14"+
    "\2\0\5\3\1\14\2\3\5\0\5\3\1\15\5\0"+
    "\1\15\5\3\1\16\1\7\2\0\1\16\1\7\2\3"+
    "\2\0\2\3\1\17\1\20\1\17\1\20";

  private static int [] zzUnpackAction() {
    int [] result = new int[206];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\54\0\130\0\204\0\260\0\334\0\260\0\u0108"+
    "\0\u0134\0\u0160\0\u018c\0\u01b8\0\u01e4\0\u0210\0\u023c\0\u0268"+
    "\0\u0294\0\u02c0\0\u02ec\0\u0318\0\u0344\0\u0370\0\u039c\0\u03c8"+
    "\0\u03f4\0\u0420\0\u044c\0\u0478\0\u04a4\0\u04d0\0\u04fc\0\u0528"+
    "\0\u0554\0\u0580\0\u05ac\0\u05d8\0\u0604\0\u0630\0\u065c\0\u0688"+
    "\0\u06b4\0\u06e0\0\u070c\0\u0738\0\u0764\0\u0134\0\u0790\0\u07bc"+
    "\0\u07e8\0\u0814\0\u0840\0\u0108\0\u086c\0\u0898\0\u08c4\0\u08f0"+
    "\0\u091c\0\u0948\0\u0974\0\u0688\0\u09a0\0\u09cc\0\u09f8\0\u0a24"+
    "\0\u0a50\0\u0a7c\0\u0aa8\0\u0ad4\0\u0b00\0\u0b2c\0\u0b58\0\260"+
    "\0\u0b84\0\u0bb0\0\u0bdc\0\u0c08\0\260\0\u0c34\0\u0c60\0\u0c8c"+
    "\0\u0cb8\0\u0ce4\0\u0d10\0\u0d3c\0\u0134\0\u0d68\0\u0d94\0\u0dc0"+
    "\0\u0dec\0\u0e18\0\u0e44\0\u0e70\0\u0e9c\0\u0ec8\0\u0ef4\0\u0f20"+
    "\0\u0f4c\0\u0f78\0\u0fa4\0\u09a0\0\u0fd0\0\u0ffc\0\u1028\0\u1054"+
    "\0\u1080\0\u10ac\0\u10d8\0\u1104\0\u1130\0\u115c\0\u0b84\0\u1188"+
    "\0\u11b4\0\u0688\0\u11e0\0\u120c\0\u1238\0\u1264\0\u1290\0\u12bc"+
    "\0\260\0\u12e8\0\u1314\0\u1340\0\u136c\0\u1398\0\u13c4\0\u13f0"+
    "\0\u141c\0\u1448\0\u039c\0\u1474\0\u14a0\0\u14cc\0\u14f8\0\u1524"+
    "\0\u1550\0\u157c\0\260\0\u15a8\0\u15d4\0\u1600\0\u162c\0\u1658"+
    "\0\u1684\0\u16b0\0\u16dc\0\u039c\0\u1708\0\u1734\0\u1760\0\u178c"+
    "\0\u17b8\0\u17e4\0\u1810\0\u183c\0\u1868\0\260\0\u1894\0\u18c0"+
    "\0\u18ec\0\u1918\0\u1944\0\u1970\0\u199c\0\u039c\0\u19c8\0\u19f4"+
    "\0\u1a20\0\u1a4c\0\u1a78\0\u1aa4\0\u1ad0\0\u1afc\0\u1b28\0\u1b54"+
    "\0\u1b80\0\u1bac\0\260\0\u1bd8\0\u1c04\0\u1c30\0\u1c5c\0\u1c88"+
    "\0\u039c\0\u1cb4\0\u1ce0\0\u1d0c\0\u1d38\0\u1d64\0\260\0\260"+
    "\0\u1d90\0\u1dbc\0\u039c\0\u039c\0\u1de8\0\u1e14\0\u1e40\0\u1e6c"+
    "\0\u1e98\0\u1ec4\0\260\0\260\0\u039c\0\u039c";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[206];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\5\1\6\2\7\1\10\1\11\1\5\1\12\3\11"+
    "\1\13\1\11\1\14\1\11\4\5\1\15\1\11\1\16"+
    "\1\17\1\10\1\20\4\10\4\5\1\21\2\5\1\22"+
    "\1\5\1\23\1\11\1\5\1\24\1\5\1\7\1\5"+
    "\1\6\2\7\1\25\1\26\1\27\1\30\3\26\1\31"+
    "\1\26\1\32\1\26\4\27\1\33\1\26\1\34\1\35"+
    "\1\10\1\36\4\25\1\27\3\5\1\37\2\27\1\40"+
    "\1\27\1\41\1\26\1\27\1\42\1\27\1\43\1\5"+
    "\1\6\2\7\1\10\1\44\1\5\1\45\3\44\1\46"+
    "\1\44\1\14\1\44\4\5\1\15\1\44\1\16\1\17"+
    "\1\10\1\20\4\10\4\5\1\21\2\5\1\22\1\5"+
    "\1\23\1\44\1\5\1\24\1\5\1\47\1\5\1\6"+
    "\2\7\1\25\1\50\1\27\1\51\3\50\1\52\1\50"+
    "\1\32\1\50\4\27\1\33\1\50\1\34\1\35\1\10"+
    "\1\36\4\25\1\27\3\5\1\37\2\27\1\40\1\27"+
    "\1\41\1\50\1\27\1\42\1\27\1\7\56\0\1\7"+
    "\52\0\1\53\2\54\31\0\1\55\15\0\1\54\4\0"+
    "\23\56\1\0\6\56\3\0\12\56\5\0\4\56\1\57"+
    "\13\56\1\60\2\56\1\0\6\56\3\0\12\56\5\0"+
    "\3\56\1\61\17\56\1\0\6\56\3\0\12\56\17\0"+
    "\1\62\77\0\1\63\12\0\1\53\2\54\1\64\20\0"+
    "\10\64\1\55\15\0\1\54\1\0\1\53\2\54\1\65"+
    "\20\0\2\64\1\65\3\64\2\65\1\55\15\0\1\54"+
    "\1\0\1\53\2\54\21\0\1\65\3\0\1\65\3\0"+
    "\1\55\15\0\1\54\42\0\1\66\53\0\1\67\26\0"+
    "\1\70\55\0\1\71\35\0\1\53\1\54\1\72\23\27"+
    "\1\0\5\27\1\73\15\27\1\72\3\0\1\27\1\74"+
    "\20\75\2\74\1\0\5\74\1\75\3\27\12\75\1\27"+
    "\3\0\24\27\1\0\24\27\3\0\1\27\1\74\3\75"+
    "\1\76\13\75\1\77\2\74\1\0\5\74\1\75\3\27"+
    "\12\75\1\27\3\0\1\27\1\74\2\75\1\100\15\75"+
    "\2\74\1\0\5\74\1\75\3\27\12\75\1\27\3\0"+
    "\13\27\1\101\10\27\1\0\24\27\3\0\24\27\1\0"+
    "\12\27\1\102\11\27\1\0\1\53\1\54\1\72\1\25"+
    "\20\27\2\25\1\64\5\25\1\73\15\27\1\72\1\0"+
    "\1\53\1\54\1\72\1\103\20\27\2\25\1\65\3\25"+
    "\2\103\1\73\15\27\1\72\1\0\1\53\1\54\1\72"+
    "\21\27\1\103\1\27\1\0\1\27\1\103\3\27\1\73"+
    "\15\27\1\72\3\0\24\27\1\0\12\27\1\104\11\27"+
    "\3\0\24\27\1\0\12\27\1\105\11\27\3\0\12\27"+
    "\1\106\11\27\1\0\24\27\3\0\14\27\1\107\7\27"+
    "\1\0\24\27\40\0\1\110\17\0\1\56\20\111\2\56"+
    "\1\0\5\56\1\111\3\0\12\111\5\0\1\56\3\111"+
    "\1\112\13\111\1\113\2\56\1\0\5\56\1\111\3\0"+
    "\12\111\5\0\1\56\2\111\1\114\15\111\2\56\1\0"+
    "\5\56\1\111\3\0\12\111\41\0\1\115\16\0\1\27"+
    "\23\74\1\0\6\74\3\27\12\74\1\27\3\0\1\27"+
    "\4\74\1\116\13\74\1\117\2\74\1\0\6\74\3\27"+
    "\12\74\1\27\3\0\1\27\3\74\1\120\17\74\1\0"+
    "\6\74\3\27\12\74\1\27\2\0\1\54\1\0\23\121"+
    "\1\0\6\121\3\0\12\121\5\0\23\121\1\0\6\121"+
    "\3\0\12\121\26\0\2\122\1\0\4\122\1\123\23\0"+
    "\5\56\1\124\15\56\1\0\6\56\3\0\12\56\5\0"+
    "\3\56\1\125\17\56\1\0\6\56\3\0\12\56\5\0"+
    "\3\56\1\126\17\56\1\0\6\56\3\0\12\56\16\0"+
    "\1\127\103\0\1\130\7\0\1\53\2\54\47\0\1\54"+
    "\43\0\1\131\33\0\1\132\73\0\1\133\52\0\1\134"+
    "\14\0\1\27\23\135\1\0\6\135\3\27\12\135\1\27"+
    "\3\0\22\27\2\136\1\0\4\136\1\137\17\27\1\0"+
    "\1\140\1\141\1\142\1\74\20\75\2\74\1\0\5\74"+
    "\1\75\3\27\12\75\1\142\1\0\1\140\1\141\1\142"+
    "\1\74\4\75\1\143\13\75\2\74\1\0\5\74\1\75"+
    "\3\27\12\75\1\142\1\0\1\140\1\141\1\142\1\74"+
    "\2\75\1\144\15\75\2\74\1\0\5\74\1\75\3\27"+
    "\12\75\1\142\1\0\1\140\1\141\1\142\1\74\2\75"+
    "\1\145\15\75\2\74\1\0\5\74\1\75\3\27\12\75"+
    "\1\142\3\0\12\27\1\146\11\27\1\0\24\27\3\0"+
    "\24\27\1\0\15\27\1\147\6\27\1\0\1\53\1\54"+
    "\1\72\23\27\1\0\23\27\1\72\3\0\24\27\1\0"+
    "\13\27\1\150\10\27\3\0\20\27\1\151\3\27\1\0"+
    "\24\27\3\0\24\27\1\0\13\27\1\152\10\27\3\0"+
    "\24\27\1\0\12\27\1\153\11\27\1\0\1\154\2\155"+
    "\1\56\20\111\2\56\1\0\5\56\1\111\3\0\12\111"+
    "\1\155\1\0\1\154\2\155\1\56\4\111\1\156\13\111"+
    "\2\56\1\0\5\56\1\111\3\0\12\111\1\155\1\0"+
    "\1\154\2\155\1\56\2\111\1\157\15\111\2\56\1\0"+
    "\5\56\1\111\3\0\12\111\1\155\1\0\1\154\2\155"+
    "\1\56\2\111\1\160\15\111\2\56\1\0\5\56\1\111"+
    "\3\0\12\111\1\155\3\0\1\27\5\74\1\161\15\74"+
    "\1\0\6\74\3\27\12\74\1\27\3\0\1\27\3\74"+
    "\1\162\17\74\1\0\6\74\3\27\12\74\1\27\3\0"+
    "\1\27\3\74\1\163\17\74\1\0\6\74\3\27\12\74"+
    "\1\27\1\0\1\164\2\165\23\121\1\0\6\121\3\0"+
    "\12\121\1\165\4\0\1\166\20\0\10\166\50\0\1\166"+
    "\26\0\6\56\1\125\14\56\1\0\6\56\3\0\12\56"+
    "\5\0\10\56\1\125\12\56\1\0\6\56\3\0\12\56"+
    "\20\0\1\167\101\0\1\170\23\0\1\171\101\0\1\172"+
    "\31\0\1\173\104\0\1\174\2\0\1\164\1\165\1\175"+
    "\23\135\1\0\6\135\3\27\12\135\1\175\3\0\1\27"+
    "\1\176\20\27\2\176\1\166\5\176\17\27\3\0\24\27"+
    "\1\0\1\27\1\176\22\27\2\0\1\141\2\0\1\177"+
    "\1\0\6\177\1\0\1\177\5\0\1\177\22\0\1\177"+
    "\11\0\1\177\1\0\6\177\1\0\1\177\5\0\1\177"+
    "\22\0\1\177\7\0\2\27\1\200\1\27\6\200\1\27"+
    "\1\200\5\27\1\200\2\27\1\0\17\27\1\200\4\27"+
    "\1\0\1\140\1\141\1\142\1\74\5\75\1\144\12\75"+
    "\2\74\1\0\5\74\1\75\3\27\12\75\1\142\1\0"+
    "\1\140\1\141\1\142\1\74\7\75\1\144\10\75\2\74"+
    "\1\0\5\74\1\75\3\27\12\75\1\142\3\0\14\27"+
    "\1\201\7\27\1\0\24\27\3\0\24\27\1\0\15\27"+
    "\1\202\6\27\3\0\12\27\1\203\11\27\1\0\24\27"+
    "\3\0\24\27\1\0\13\27\1\204\10\27\3\0\16\27"+
    "\1\205\5\27\1\0\24\27\3\0\24\27\1\0\22\27"+
    "\1\206\1\27\2\0\1\155\2\0\1\207\1\0\6\207"+
    "\1\0\1\207\5\0\1\207\22\0\1\207\11\0\1\207"+
    "\1\0\6\207\1\0\1\207\5\0\1\207\22\0\1\207"+
    "\5\0\1\154\2\155\1\56\5\111\1\157\12\111\2\56"+
    "\1\0\5\56\1\111\3\0\12\111\1\155\1\0\1\154"+
    "\2\155\1\56\7\111\1\157\10\111\2\56\1\0\5\56"+
    "\1\111\3\0\12\111\1\155\3\0\1\27\6\74\1\162"+
    "\14\74\1\0\6\74\3\27\12\74\1\27\3\0\1\27"+
    "\10\74\1\162\12\74\1\0\6\74\3\27\12\74\1\27"+
    "\2\0\1\165\23\0\1\210\53\0\1\210\63\0\1\211"+
    "\35\0\1\212\50\0\1\213\53\0\1\214\101\0\1\215"+
    "\51\0\1\216\15\0\23\27\1\217\1\0\24\27\3\0"+
    "\24\27\1\0\6\27\1\220\15\27\5\0\20\221\10\0"+
    "\1\221\3\0\12\221\4\0\2\27\20\222\2\27\1\0"+
    "\5\27\1\222\3\27\12\222\1\27\3\0\15\27\1\223"+
    "\6\27\1\0\24\27\3\0\12\27\1\224\11\27\1\0"+
    "\24\27\3\0\12\27\1\225\11\27\1\0\24\27\3\0"+
    "\24\27\1\0\13\27\1\226\10\27\3\0\24\27\1\0"+
    "\11\27\1\227\12\27\5\0\20\230\10\0\1\230\3\0"+
    "\12\230\32\0\1\231\26\0\1\232\20\0\1\233\1\234"+
    "\6\232\40\0\1\235\51\0\1\236\51\0\1\237\53\0"+
    "\1\240\41\0\24\27\1\0\1\27\1\241\22\27\3\0"+
    "\1\27\1\242\20\27\1\243\1\244\1\232\5\242\17\27"+
    "\1\0\1\140\2\141\1\0\20\221\10\0\1\221\3\0"+
    "\12\221\1\141\1\0\1\140\1\141\1\142\1\27\20\222"+
    "\2\27\1\0\5\27\1\222\3\27\12\222\1\142\3\0"+
    "\16\27\1\245\5\27\1\0\24\27\3\0\14\27\1\246"+
    "\7\27\1\0\24\27\3\0\12\27\1\247\11\27\1\0"+
    "\24\27\3\0\12\27\1\250\11\27\1\0\24\27\1\0"+
    "\1\154\2\155\1\0\20\230\10\0\1\230\3\0\12\230"+
    "\1\155\4\0\1\251\20\0\10\251\54\0\1\252\22\0"+
    "\1\232\20\0\10\232\1\252\43\0\2\232\1\0\3\232"+
    "\2\0\1\252\40\0\1\253\100\0\1\254\53\0\1\255"+
    "\7\0\1\27\1\256\20\27\2\256\1\251\5\256\17\27"+
    "\3\0\24\27\1\0\5\27\1\257\16\27\3\0\1\27"+
    "\1\242\20\27\2\242\1\232\5\242\1\257\16\27\3\0"+
    "\22\27\2\242\1\0\3\242\2\27\1\257\16\27\3\0"+
    "\17\27\1\260\4\27\1\0\24\27\3\0\24\27\1\0"+
    "\17\27\1\261\4\27\3\0\24\27\1\0\17\27\1\262"+
    "\4\27\4\0\1\263\20\0\10\263\44\0\2\264\1\0"+
    "\4\264\1\265\34\0\1\266\100\0\1\267\53\0\1\270"+
    "\14\0\1\27\1\271\20\27\2\271\1\263\5\271\17\27"+
    "\3\0\22\27\2\272\1\0\4\272\1\273\17\27\3\0"+
    "\12\27\1\274\11\27\1\0\24\27\3\0\24\27\1\0"+
    "\12\27\1\275\11\27\3\0\24\27\1\0\12\27\1\276"+
    "\11\27\4\0\1\277\20\0\10\277\50\0\1\277\45\0"+
    "\1\300\100\0\1\301\53\0\1\302\6\0\1\27\1\303"+
    "\20\27\2\303\1\277\5\303\17\27\3\0\24\27\1\0"+
    "\1\27\1\303\22\27\3\0\20\27\1\304\3\27\1\0"+
    "\24\27\3\0\24\27\1\0\20\27\1\305\3\27\3\0"+
    "\24\27\1\0\20\27\1\306\3\27\23\0\1\307\53\0"+
    "\1\310\33\0\20\27\1\311\3\27\1\0\24\27\3\0"+
    "\20\27\1\312\3\27\1\0\24\27\15\0\1\313\53\0"+
    "\1\314\41\0\12\27\1\315\11\27\1\0\24\27\3\0"+
    "\12\27\1\316\11\27\1\0\24\27";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7920];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\4\0\1\11\1\1\1\11\43\1\3\0\4\1\10\0"+
    "\16\1\1\11\4\1\1\11\3\1\3\0\3\1\6\0"+
    "\3\1\2\0\12\1\2\0\6\1\5\0\1\11\3\0"+
    "\2\1\1\0\7\1\4\0\1\11\3\0\12\1\5\0"+
    "\1\11\2\0\10\1\5\0\5\1\1\11\5\0\6\1"+
    "\2\11\2\0\4\1\2\0\2\1\2\11\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[206];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private Symbole creerSymbole(String representation, int type) {
    return new Symbole(representation,type,yyline,yycolumn);
  }

  private Symbole creerSymbole(String representation, int type, Object valeur) {
    return new Symbole(representation,type,valeur,yyline,yycolumn);
  }  


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public ScannerPlanning(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public ScannerPlanning(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 206) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException, ScannerException
 {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 16: 
          { // on a reconnu un read
  return creerSymbole("grandePause",TypeSymboles.GRANDEPAUSE);
          }
        case 17: break;
        case 5: 
          { // on a reconnu un ";"
		yybegin(B);
		return creerSymbole("SEPARATOR",TypeSymboles.SEPARATOR);
          }
        case 18: break;
        case 14: 
          { yybegin(A);
  	return creerSymbole("SLOT", TypeSymboles.SLOT, yytext());
          }
        case 19: break;
        case 10: 
          { return creerSymbole("NAME",TypeSymboles.NAME,yytext());
          }
        case 20: break;
        case 3: 
          { yybegin(YYINITIAL);
	  	return creerSymbole("OPTIONS",TypeSymboles.OPTIONS, yytext());
          }
        case 21: break;
        case 11: 
          { return creerSymbole("ENTREPRISE",TypeSymboles.ENTREPRISE,yytext());
          }
        case 22: break;
        case 2: 
          { /* on ne fait rien */
          }
        case 23: break;
        case 6: 
          { // on a reconnu un ";"
			yybegin(C);
			return creerSymbole("SEPARATOR",TypeSymboles.SEPARATOR);
          }
        case 24: break;
        case 1: 
          { // erreur : .|\n désigne n'importe quel caractère non reconnu
      // par une des règles précédentes 
  throw new ScannerException("symbole inconnu, caractère " + yytext() + 
				 " ligne " + yyline + " colonne " + yycolumn);
          }
        case 25: break;
        case 13: 
          { return creerSymbole("DATE",TypeSymboles.DATE,yytext());
          }
        case 26: break;
        case 12: 
          { // on a reconnu le mot-clé int
  return creerSymbole("master",TypeSymboles.MASTERCST);
          }
        case 27: break;
        case 7: 
          { return creerSymbole("MASTER",TypeSymboles.MASTER,yytext());
          }
        case 28: break;
        case 8: 
          { // on a reconnu le mot-clé program
  return creerSymbole("date",TypeSymboles.DATECST);
          }
        case 29: break;
        case 15: 
          { // on a reconnu un read
  return creerSymbole("petitePause",TypeSymboles.PETITEPAUSE);
          }
        case 30: break;
        case 9: 
          { // on a reconnu un read
  return creerSymbole("room",TypeSymboles.ROOMCST);
          }
        case 31: break;
        case 4: 
          { return creerSymbole("ROOM",TypeSymboles.ROOM,yytext());
          }
        case 32: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
              {   return new Symbole(TypeSymboles.EOF);
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}