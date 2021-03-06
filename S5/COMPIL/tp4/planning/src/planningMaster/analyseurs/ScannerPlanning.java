/* The following code was generated by JFlex 1.4.3 on 11/16/11 4:58 PM */

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
 * on 11/16/11 4:58 PM from the specification file
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
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\3\13\0\1\21"+
    "\1\20\2\0\1\13\1\7\1\10\1\12\1\14\1\15\1\16\3\4"+
    "\1\0\1\22\5\0\1\24\5\5\1\25\1\5\1\23\2\5\1\26"+
    "\3\5\1\47\1\5\1\30\1\32\1\27\1\5\1\40\4\5\6\0"+
    "\1\42\1\6\1\36\1\41\1\31\1\6\1\51\1\17\1\35\2\6"+
    "\1\45\1\44\1\52\1\6\1\46\1\6\1\33\1\37\1\43\1\50"+
    "\1\34\4\6\u05e5\0\12\11\206\0\12\11\u026c\0\12\11\166\0\12\11"+
    "\166\0\12\11\166\0\12\11\166\0\12\11\167\0\11\11\166\0\12\11"+
    "\166\0\12\11\166\0\12\11\340\0\12\11\166\0\12\11\106\0\12\11"+
    "\u0116\0\12\11\u031f\0\11\11\u046e\0\12\11\46\0\12\11\u012c\0\12\11"+
    "\ue5c0\0\12\11\346\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\2\5\5\4\1\6"+
    "\14\4\11\2\11\3\3\0\1\7\3\0\3\7\12\0"+
    "\6\2\6\3\5\0\1\7\1\10\1\7\12\0\7\2"+
    "\7\3\10\0\1\11\4\0\1\1\2\2\1\11\3\2"+
    "\2\3\1\11\3\3\6\0\1\12\3\0\1\12\3\2"+
    "\1\3\1\12\3\3\4\13\4\0\1\14\2\0\1\14"+
    "\2\2\3\3\1\14\2\3\4\0\2\2\3\3\5\0"+
    "\2\2\4\3\1\15\1\10\2\0\2\2\1\15\2\3"+
    "\2\0\2\2\2\3\1\16\1\17\1\16\1\17\1\16"+
    "\1\17";

  private static int [] zzUnpackAction() {
    int [] result = new int[213];
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
    "\0\0\0\53\0\126\0\201\0\254\0\327\0\254\0\u0102"+
    "\0\u012d\0\u0158\0\u0183\0\u01ae\0\254\0\u01d9\0\u0204\0\u022f"+
    "\0\u025a\0\u0285\0\u02b0\0\u02db\0\u0306\0\u0331\0\u035c\0\u0387"+
    "\0\u03b2\0\u03dd\0\u0408\0\u0433\0\u045e\0\u0489\0\u04b4\0\u04df"+
    "\0\u050a\0\u0535\0\u0560\0\u058b\0\u05b6\0\u05e1\0\u060c\0\u0637"+
    "\0\u0662\0\u068d\0\u06b8\0\u06e3\0\u070e\0\u0739\0\u012d\0\u0764"+
    "\0\u0102\0\u078f\0\u07ba\0\u07e5\0\u0810\0\u083b\0\u0866\0\u0891"+
    "\0\u08bc\0\u08e7\0\u0912\0\u093d\0\u0968\0\u0331\0\u0408\0\u0993"+
    "\0\u09be\0\u09e9\0\u0a14\0\u0a3f\0\u0a6a\0\u0a95\0\u0ac0\0\u0aeb"+
    "\0\u0b16\0\u0b41\0\u0b6c\0\u0b97\0\u0bc2\0\u0bed\0\u0c18\0\u0c43"+
    "\0\u0c6e\0\u012d\0\u0c99\0\u0cc4\0\u0cef\0\u0d1a\0\u0d45\0\u0d70"+
    "\0\u0d9b\0\u0dc6\0\u0df1\0\u0e1c\0\u0e47\0\u0e72\0\u0e9d\0\u0ec8"+
    "\0\u0ef3\0\u0f1e\0\u0f49\0\u0f74\0\u0f9f\0\u0fca\0\u0ff5\0\u1020"+
    "\0\u104b\0\u1076\0\u10a1\0\u10cc\0\u10f7\0\u1122\0\u114d\0\u1178"+
    "\0\u11a3\0\u11ce\0\u11f9\0\254\0\u1224\0\u124f\0\u127a\0\u12a5"+
    "\0\u0e47\0\u12d0\0\u12fb\0\u0408\0\u1326\0\u1351\0\u137c\0\u13a7"+
    "\0\u13d2\0\u058b\0\u13fd\0\u1428\0\u1453\0\u147e\0\u14a9\0\u14d4"+
    "\0\u14ff\0\u152a\0\u1555\0\254\0\u1580\0\u15ab\0\u15d6\0\u0408"+
    "\0\u1601\0\u162c\0\u1657\0\u1682\0\u058b\0\u16ad\0\u16d8\0\u1703"+
    "\0\u070e\0\u0bc2\0\254\0\u10f7\0\u172e\0\u1759\0\u1784\0\u17af"+
    "\0\254\0\u17da\0\u1805\0\u0408\0\u1830\0\u185b\0\u1886\0\u18b1"+
    "\0\u18dc\0\u058b\0\u1907\0\u1932\0\u195d\0\u1988\0\u19b3\0\u19de"+
    "\0\u1a09\0\u1a34\0\u1a5f\0\u1a8a\0\u1ab5\0\u1ae0\0\u1b0b\0\u1b36"+
    "\0\u1b61\0\u1b8c\0\u1bb7\0\u1be2\0\u1c0d\0\u1c38\0\u1c63\0\u1c8e"+
    "\0\254\0\254\0\u1cb9\0\u1ce4\0\u1d0f\0\u1d3a\0\u058b\0\u1d65"+
    "\0\u1d90\0\u1dbb\0\u1de6\0\u1e11\0\u1e3c\0\u1e67\0\u1e92\0\254"+
    "\0\254\0\u0408\0\u0408\0\u058b\0\u058b";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[213];
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
    "\1\5\1\6\2\7\1\10\1\11\1\5\1\12\1\13"+
    "\1\10\1\14\4\10\3\5\1\15\1\16\3\11\1\17"+
    "\1\11\1\20\1\11\4\5\1\21\1\11\1\22\2\5"+
    "\1\23\1\5\1\24\1\11\1\5\1\25\2\5\1\6"+
    "\2\7\1\26\1\27\1\5\1\30\1\31\6\26\3\5"+
    "\1\15\6\27\1\5\1\27\4\5\1\21\1\27\1\22"+
    "\2\5\1\23\1\5\1\24\1\27\1\5\1\25\2\5"+
    "\1\6\2\7\1\32\2\33\1\34\1\35\1\26\5\32"+
    "\1\33\2\5\1\15\14\33\1\36\1\33\1\37\2\33"+
    "\1\40\1\33\1\41\2\33\1\42\1\33\1\5\1\6"+
    "\2\7\1\43\2\44\1\45\1\46\1\26\5\43\1\44"+
    "\2\5\1\15\14\44\1\47\1\44\1\50\2\44\1\51"+
    "\1\44\1\52\2\44\1\53\1\44\55\0\1\7\51\0"+
    "\3\54\5\55\1\0\5\55\1\56\3\0\30\55\4\0"+
    "\5\57\1\0\6\57\3\0\30\57\1\0\3\54\1\60"+
    "\2\55\2\60\1\61\5\60\1\56\3\0\30\55\1\0"+
    "\3\54\1\62\2\55\2\60\1\54\3\60\2\62\1\56"+
    "\3\0\30\55\1\0\3\54\3\55\1\62\1\55\1\0"+
    "\1\55\1\62\3\55\1\56\3\0\30\55\4\0\5\57"+
    "\1\0\6\57\3\0\1\57\1\63\13\57\1\64\12\57"+
    "\4\0\5\57\1\0\6\57\3\0\1\65\27\57\32\0"+
    "\1\66\62\0\1\67\52\0\1\70\52\0\1\71\41\0"+
    "\1\72\54\0\1\73\36\0\1\74\40\0\2\75\10\0"+
    "\1\75\3\0\30\75\4\0\1\76\2\0\10\76\1\74"+
    "\42\0\2\76\1\0\3\76\2\0\1\74\34\0\3\77"+
    "\5\33\1\0\5\33\1\100\3\0\30\33\1\0\3\77"+
    "\5\33\1\0\6\33\3\0\30\33\1\0\3\77\1\32"+
    "\2\33\2\32\1\76\5\32\1\100\3\0\30\33\1\0"+
    "\3\77\3\33\2\32\1\0\3\32\2\33\1\100\3\0"+
    "\30\33\1\0\3\77\5\33\1\0\6\33\3\0\17\33"+
    "\1\101\10\33\1\0\3\77\5\33\1\0\6\33\3\0"+
    "\17\33\1\102\10\33\1\0\3\77\5\33\1\0\6\33"+
    "\3\0\17\33\1\103\10\33\1\0\3\77\5\33\1\0"+
    "\6\33\3\0\6\33\1\104\21\33\1\0\3\77\5\33"+
    "\1\0\6\33\3\0\10\33\1\105\17\33\3\0\6\44"+
    "\1\0\5\44\1\106\33\44\3\0\6\44\1\0\41\44"+
    "\3\0\1\44\1\43\2\44\2\43\1\76\5\43\1\106"+
    "\33\44\3\0\4\44\2\43\1\0\3\43\2\44\1\106"+
    "\33\44\3\0\6\44\1\0\30\44\1\107\10\44\3\0"+
    "\6\44\1\0\30\44\1\110\10\44\3\0\6\44\1\0"+
    "\30\44\1\111\10\44\3\0\6\44\1\0\17\44\1\112"+
    "\21\44\3\0\6\44\1\0\21\44\1\113\17\44\1\0"+
    "\3\54\5\55\1\0\6\55\3\0\30\55\1\0\3\114"+
    "\4\55\1\115\1\0\6\55\3\0\30\55\1\0\3\114"+
    "\3\55\1\116\1\117\1\0\4\116\1\120\1\55\3\0"+
    "\30\55\1\0\3\62\4\55\1\115\1\0\5\55\1\56"+
    "\3\0\30\55\1\0\3\62\4\55\1\115\1\0\6\55"+
    "\3\0\30\55\4\0\5\57\1\0\6\57\3\0\2\57"+
    "\1\121\25\57\4\0\5\57\1\0\6\57\3\0\1\122"+
    "\27\57\4\0\5\57\1\0\6\57\3\0\1\123\27\57"+
    "\31\0\1\124\66\0\1\125\50\0\1\126\46\0\1\127"+
    "\56\0\1\130\51\0\1\131\17\0\2\132\1\0\4\132"+
    "\1\133\35\0\3\134\1\0\1\135\1\75\10\0\1\75"+
    "\3\0\6\135\1\75\1\135\5\75\1\135\6\75\1\135"+
    "\3\75\1\0\3\77\3\33\2\136\1\0\4\136\1\137"+
    "\1\33\3\0\30\33\1\0\3\77\5\33\1\0\6\33"+
    "\3\0\22\33\1\140\5\33\1\0\3\77\5\33\1\0"+
    "\6\33\3\0\20\33\1\141\7\33\1\0\3\77\5\33"+
    "\1\0\6\33\3\0\14\33\1\142\13\33\1\0\3\77"+
    "\5\33\1\0\6\33\3\0\20\33\1\143\7\33\1\0"+
    "\3\77\5\33\1\0\6\33\3\0\17\33\1\144\10\33"+
    "\3\0\4\44\2\145\1\0\4\145\1\146\34\44\3\0"+
    "\6\44\1\0\33\44\1\147\5\44\3\0\6\44\1\0"+
    "\31\44\1\150\7\44\3\0\6\44\1\0\25\44\1\151"+
    "\13\44\3\0\6\44\1\0\31\44\1\152\7\44\3\0"+
    "\6\44\1\0\30\44\1\153\10\44\1\0\3\114\4\0"+
    "\1\154\43\0\3\114\4\55\1\115\1\0\1\55\1\155"+
    "\4\55\3\0\30\55\1\0\3\114\1\156\2\55\1\156"+
    "\1\157\1\160\5\156\1\55\3\0\30\55\1\0\3\114"+
    "\1\156\2\55\1\156\1\157\1\160\1\156\1\161\3\156"+
    "\1\55\3\0\30\55\1\0\3\114\4\55\1\115\1\0"+
    "\1\55\1\156\4\55\3\0\30\55\4\0\5\57\1\0"+
    "\6\57\3\0\3\57\1\122\24\57\4\0\5\57\1\0"+
    "\6\57\3\0\5\57\1\122\22\57\33\0\1\162\64\0"+
    "\1\163\36\0\1\164\64\0\1\165\44\0\1\166\67\0"+
    "\1\167\4\0\1\160\2\0\10\160\47\0\1\160\40\0"+
    "\3\134\1\0\1\170\15\0\6\170\1\0\1\170\5\0"+
    "\1\170\6\0\1\170\4\0\3\134\1\0\2\171\10\0"+
    "\1\171\3\0\30\171\1\0\3\77\1\172\2\33\2\172"+
    "\1\160\5\172\1\33\3\0\30\33\1\0\3\77\5\33"+
    "\1\0\1\33\1\172\4\33\3\0\30\33\1\0\3\77"+
    "\5\33\1\0\6\33\3\0\22\33\1\173\5\33\1\0"+
    "\3\77\5\33\1\0\6\33\3\0\6\33\1\174\21\33"+
    "\1\0\3\77\5\33\1\0\6\33\3\0\20\33\1\175"+
    "\7\33\1\0\3\77\5\33\1\0\6\33\3\0\12\33"+
    "\1\176\15\33\1\0\3\77\5\33\1\0\6\33\3\0"+
    "\27\33\1\177\3\0\1\44\1\200\2\44\2\200\1\160"+
    "\5\200\34\44\3\0\6\44\1\0\1\44\1\200\37\44"+
    "\3\0\6\44\1\0\33\44\1\201\5\44\3\0\6\44"+
    "\1\0\17\44\1\202\21\44\3\0\6\44\1\0\31\44"+
    "\1\203\7\44\3\0\6\44\1\0\23\44\1\204\15\44"+
    "\3\0\6\44\1\0\40\44\1\205\13\0\1\206\40\0"+
    "\3\114\1\207\2\55\1\207\1\210\1\211\5\207\1\55"+
    "\3\0\30\55\1\0\3\114\4\55\1\115\1\0\6\55"+
    "\1\212\2\0\30\55\1\0\3\114\4\55\1\115\1\0"+
    "\1\55\1\155\4\55\1\212\2\0\30\55\20\0\1\212"+
    "\33\0\3\114\1\207\2\55\1\207\1\210\1\211\5\207"+
    "\1\55\1\212\2\0\30\55\34\0\1\213\47\0\1\214"+
    "\52\0\1\215\64\0\1\216\50\0\1\217\16\0\2\171"+
    "\10\0\1\171\3\0\30\171\1\0\3\77\5\33\1\0"+
    "\6\33\1\212\2\0\30\33\1\0\3\77\5\33\1\0"+
    "\6\33\3\0\6\33\1\220\21\33\1\0\3\77\5\33"+
    "\1\0\6\33\3\0\6\33\1\221\21\33\1\0\3\77"+
    "\5\33\1\0\6\33\3\0\20\33\1\222\7\33\1\0"+
    "\3\77\5\33\1\0\6\33\3\0\16\33\1\223\11\33"+
    "\3\0\6\44\1\0\6\44\1\224\32\44\3\0\6\44"+
    "\1\0\17\44\1\225\21\44\3\0\6\44\1\0\17\44"+
    "\1\226\21\44\3\0\6\44\1\0\31\44\1\227\7\44"+
    "\3\0\6\44\1\0\27\44\1\230\11\44\4\0\1\211"+
    "\2\0\10\211\35\0\3\114\1\231\2\55\1\231\1\232"+
    "\1\233\5\231\1\55\3\0\30\55\1\0\3\114\1\231"+
    "\2\55\1\231\1\232\1\233\1\231\1\234\3\231\1\55"+
    "\3\0\30\55\4\0\1\233\2\0\10\233\40\0\1\235"+
    "\2\0\1\236\1\237\6\235\71\0\1\240\50\0\1\241"+
    "\50\0\1\242\52\0\1\243\22\0\3\77\5\33\1\0"+
    "\6\33\3\0\10\33\1\244\17\33\1\0\3\77\5\33"+
    "\1\0\6\33\3\0\6\33\1\245\21\33\1\0\3\77"+
    "\5\33\1\0\6\33\3\0\6\33\1\246\21\33\3\0"+
    "\1\44\1\247\2\44\1\250\1\251\1\235\5\247\34\44"+
    "\3\0\6\44\1\0\21\44\1\252\17\44\3\0\6\44"+
    "\1\0\17\44\1\253\21\44\3\0\6\44\1\0\17\44"+
    "\1\254\21\44\17\0\1\255\37\0\1\235\2\0\10\235"+
    "\1\255\42\0\2\235\1\0\3\235\2\0\1\255\71\0"+
    "\1\256\63\0\1\257\52\0\1\260\4\0\3\77\5\33"+
    "\1\0\6\33\3\0\24\33\1\261\3\33\1\0\3\77"+
    "\5\33\1\0\6\33\3\0\24\33\1\262\3\33\3\0"+
    "\6\44\1\0\5\44\1\263\33\44\3\0\1\44\1\247"+
    "\2\44\2\247\1\235\5\247\1\263\33\44\3\0\4\44"+
    "\2\247\1\0\3\247\2\44\1\263\33\44\3\0\6\44"+
    "\1\0\35\44\1\264\3\44\3\0\6\44\1\0\35\44"+
    "\1\265\3\44\7\0\2\266\1\0\4\266\1\267\65\0"+
    "\1\270\63\0\1\271\52\0\1\272\11\0\3\77\5\33"+
    "\1\0\6\33\3\0\17\33\1\273\10\33\1\0\3\77"+
    "\5\33\1\0\6\33\3\0\17\33\1\274\10\33\3\0"+
    "\4\44\2\275\1\0\4\275\1\276\34\44\3\0\6\44"+
    "\1\0\30\44\1\277\10\44\3\0\6\44\1\0\30\44"+
    "\1\300\10\44\4\0\1\301\2\0\10\301\47\0\1\301"+
    "\76\0\1\302\63\0\1\303\52\0\1\304\3\0\3\77"+
    "\5\33\1\0\6\33\3\0\25\33\1\305\2\33\1\0"+
    "\3\77\5\33\1\0\6\33\3\0\25\33\1\306\2\33"+
    "\3\0\1\44\1\307\2\44\2\307\1\301\5\307\34\44"+
    "\3\0\6\44\1\0\1\44\1\307\37\44\3\0\6\44"+
    "\1\0\36\44\1\310\2\44\3\0\6\44\1\0\36\44"+
    "\1\311\2\44\37\0\1\312\52\0\1\313\14\0\3\77"+
    "\5\33\1\0\6\33\3\0\14\33\1\314\13\33\1\0"+
    "\3\77\5\33\1\0\6\33\3\0\14\33\1\315\13\33"+
    "\3\0\6\44\1\0\25\44\1\316\13\44\3\0\6\44"+
    "\1\0\25\44\1\317\13\44\31\0\1\320\52\0\1\321"+
    "\22\0\3\77\5\33\1\0\6\33\3\0\6\33\1\322"+
    "\21\33\1\0\3\77\5\33\1\0\6\33\3\0\6\33"+
    "\1\323\21\33\3\0\6\44\1\0\17\44\1\324\21\44"+
    "\3\0\6\44\1\0\17\44\1\325\21\44";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7869];
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
    "\1\0\3\1\1\11\1\1\1\11\5\1\1\11\36\1"+
    "\3\0\1\1\3\0\3\1\12\0\14\1\5\0\3\1"+
    "\12\0\16\1\10\0\1\11\4\0\15\1\6\0\1\11"+
    "\3\0\13\1\1\11\1\1\4\0\1\11\2\0\11\1"+
    "\4\0\5\1\5\0\6\1\2\11\2\0\5\1\2\0"+
    "\4\1\2\11\4\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[213];
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
        case 1: 
          { yybegin(B);
   return creerSymbole("NAME",TypeSymboles.NAME,yytext());
          }
        case 16: break;
        case 4: 
          { // erreur : .|\n désigne n'importe quel caractère non reconnu
      // par une des règles précédentes
  throw new ScannerException("symbole inconnu, caractère " + yytext() +
" ligne " + yyline + " colonne " + yycolumn);
          }
        case 17: break;
        case 6: 
          { // on a reconnu un ";"
return creerSymbole("SEPARATOR",TypeSymboles.SEPARATOR);
          }
        case 18: break;
        case 10: 
          { // on a reconnu le mot-clé roomCst
  return creerSymbole("room",TypeSymboles.ROOMCST);
          }
        case 19: break;
        case 12: 
          { // on a reconnu le mot-clé masterCst
  return creerSymbole("master",TypeSymboles.MASTERCST);
          }
        case 20: break;
        case 3: 
          { // on a reconnu un opérateur d'affectation
	yybegin(YYINITIAL);
   return creerSymbole("OPTIONS",TypeSymboles.OPTIONS, yytext());
          }
        case 21: break;
        case 5: 
          { /* on ne fait rien */
          }
        case 22: break;
        case 2: 
          { yybegin(C);
   return creerSymbole("ENTREPRISE",TypeSymboles.ENTREPRISE,yytext());
          }
        case 23: break;
        case 14: 
          { // on a reconnu le mot-clé  smallPauseCst
  return creerSymbole("petitePause",TypeSymboles.PETITEPAUSE);
          }
        case 24: break;
        case 11: 
          { return creerSymbole("DATE",TypeSymboles.DATE,yytext());
          }
        case 25: break;
        case 8: 
          { return creerSymbole("MASTER",TypeSymboles.MASTER,yytext());
          }
        case 26: break;
        case 13: 
          { yybegin(A);
	return creerSymbole("SLOT", TypeSymboles.SLOT, yytext());
          }
        case 27: break;
        case 9: 
          { // on a reconnu le mot-clé dateCst
  return creerSymbole("date",TypeSymboles.DATECST);
          }
        case 28: break;
        case 7: 
          { return creerSymbole("ROOM",TypeSymboles.ROOM,yytext());
          }
        case 29: break;
        case 15: 
          { // on a reconnu le mot-clé  bigPauseCst
  return creerSymbole("grandePause",TypeSymboles.GRANDEPAUSE);
          }
        case 30: break;
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
