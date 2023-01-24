package com.ufes.compilador.JFlex;
// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/main/jflex/simple.flex

/* this is the scanner example from the JLex website
   (with small modifications to make it more readable) */


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class Yylex {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;
  private static final String ZZ_NL = System.getProperty("line.separator");

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1, 1
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\36\u0200\1\u0300\267\u0200\10\u0400\u1020\u0200";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\10\0\2\1\1\2\2\3\1\4\22\0\1\1\1\0"+
    "\1\5\3\0\1\6\1\0\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\11\20\1\21\1\22"+
    "\1\23\1\24\1\25\2\0\1\26\1\27\1\30\1\31"+
    "\1\32\1\31\1\33\1\31\1\34\2\31\1\35\1\36"+
    "\1\37\1\40\1\41\1\31\1\42\1\43\1\44\6\31"+
    "\1\45\1\46\1\47\1\0\1\31\1\0\1\26\1\27"+
    "\1\30\1\31\1\32\1\31\1\33\1\31\1\34\2\31"+
    "\1\35\1\36\1\37\1\40\1\41\1\31\1\42\1\43"+
    "\1\44\6\31\1\50\1\51\1\52\7\0\1\3\252\0"+
    "\2\53\115\0\1\54\u01a8\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1280];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\2\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\2\13\1\14\1\15\1\16\1\17"+
    "\1\20\7\21\1\22\1\23\1\24\1\25\1\26\2\0"+
    "\3\1\3\0\1\27\1\30\1\31\1\32\7\21\4\0"+
    "\1\1\1\33\1\34\1\1\2\35\7\21\2\0\3\21"+
    "\1\0\2\21\1\36\1\21\2\0\3\21\1\0\1\21"+
    "\1\0\2\21\1\0\3\21\1\0\1\21\1\0\1\21"+
    "\1\36\2\21\1\0\3\21\1\0\1\21\2\37\1\40"+
    "\1\37\2\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[111];
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
    "\0\0\0\55\0\132\0\207\0\264\0\264\0\264\0\264"+
    "\0\264\0\264\0\264\0\264\0\264\0\341\0\u010e\0\u013b"+
    "\0\264\0\u0168\0\264\0\u0195\0\u01c2\0\u01ef\0\u021c\0\u0249"+
    "\0\u0276\0\u02a3\0\u02d0\0\264\0\264\0\264\0\u01c2\0\264"+
    "\0\u02fd\0\u032a\0\u0357\0\264\0\u0384\0\u03b1\0\u03de\0\u040b"+
    "\0\264\0\264\0\264\0\264\0\u0438\0\u0465\0\u0492\0\u04bf"+
    "\0\u04ec\0\u0519\0\u0546\0\u0573\0\u05a0\0\u05cd\0\u05fa\0\u0627"+
    "\0\264\0\264\0\u0654\0\264\0\u0681\0\u06ae\0\u06db\0\u0708"+
    "\0\u0735\0\u0762\0\u078f\0\u07bc\0\u07e9\0\u0816\0\u0843\0\u0870"+
    "\0\u089d\0\u08ca\0\u08f7\0\u0924\0\u01c2\0\u0951\0\u097e\0\u09ab"+
    "\0\u09d8\0\u0a05\0\u0a32\0\u0a5f\0\u0a8c\0\u0ab9\0\u0ae6\0\u0b13"+
    "\0\u0b40\0\u0b6d\0\u0b9a\0\u0bc7\0\u0bf4\0\u0c21\0\u0c4e\0\u0c7b"+
    "\0\264\0\u0ca8\0\u0cd5\0\u0d02\0\u0d2f\0\u0d5c\0\u0d89\0\u0db6"+
    "\0\u0de3\0\u0e10\0\u0e3d\0\u0e6a\0\264\0\u0e97\0\u0ec4";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[111];
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
    "\1\0\2\3\1\0\1\4\1\0\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\3\25\1\30\4\25\1\31\1\32\1\33\1\25\1\34"+
    "\1\0\1\35\1\36\1\37\1\40\1\41\1\42\2\43"+
    "\1\44\1\43\1\45\4\43\1\46\4\43\1\47\36\43"+
    "\1\0\2\3\54\0\1\44\127\0\2\50\3\0\52\50"+
    "\3\0\12\50\2\17\34\50\24\0\1\51\54\0\1\52"+
    "\1\53\53\0\1\54\47\0\2\25\5\0\17\25\4\0"+
    "\1\25\22\0\2\25\5\0\12\25\1\55\4\25\4\0"+
    "\1\25\22\0\2\25\5\0\1\56\11\25\1\57\4\25"+
    "\4\0\1\25\22\0\2\25\5\0\11\25\1\60\5\25"+
    "\4\0\1\25\22\0\2\25\5\0\14\25\1\61\2\25"+
    "\4\0\1\25\22\0\2\25\5\0\4\25\1\62\12\25"+
    "\4\0\1\25\22\0\2\25\5\0\16\25\1\63\4\0"+
    "\1\25\42\0\1\64\61\0\1\65\10\0\2\43\1\0"+
    "\6\43\1\66\4\43\1\67\40\43\1\44\6\43\1\66"+
    "\4\43\1\67\40\43\1\0\6\43\1\70\4\43\1\71"+
    "\40\43\1\0\6\43\1\72\4\43\1\73\36\43\17\0"+
    "\1\74\1\75\53\0\2\25\5\0\12\25\1\76\4\25"+
    "\4\0\1\25\22\0\2\25\5\0\14\25\1\77\2\25"+
    "\4\0\1\25\22\0\2\25\5\0\11\25\1\100\5\25"+
    "\4\0\1\25\22\0\2\25\5\0\16\25\1\101\4\0"+
    "\1\25\22\0\2\25\5\0\12\25\1\102\4\25\4\0"+
    "\1\25\22\0\2\25\5\0\1\103\16\25\4\0\1\25"+
    "\22\0\2\25\5\0\14\25\1\104\2\25\4\0\1\25"+
    "\47\0\1\105\52\0\1\106\12\0\2\43\1\0\6\43"+
    "\1\70\4\43\1\0\40\43\1\0\6\43\1\0\4\43"+
    "\1\73\40\43\1\0\6\43\1\70\4\43\1\67\40\43"+
    "\1\0\6\43\1\66\4\43\1\73\36\43\17\0\2\75"+
    "\53\0\2\25\5\0\7\25\1\107\7\25\4\0\1\25"+
    "\22\0\2\25\5\0\1\110\16\25\4\0\1\25\22\0"+
    "\2\25\5\0\15\25\1\111\1\25\4\0\1\25\2\0"+
    "\1\112\17\0\2\25\5\0\4\25\1\113\12\25\4\0"+
    "\1\25\22\0\2\25\5\0\5\25\1\114\11\25\4\0"+
    "\1\25\22\0\2\25\5\0\7\25\1\115\7\25\4\0"+
    "\1\25\22\0\2\25\5\0\6\25\1\116\10\25\4\0"+
    "\1\25\1\0\1\117\33\0\1\120\56\0\1\117\16\0"+
    "\1\117\20\0\2\25\5\0\4\25\1\121\12\25\4\0"+
    "\1\25\22\0\2\25\5\0\2\25\1\122\14\25\4\0"+
    "\1\25\22\0\2\25\5\0\16\25\1\123\4\0\1\25"+
    "\47\0\1\124\27\0\2\25\5\0\6\25\1\125\10\25"+
    "\4\0\1\25\1\0\1\126\20\0\2\25\5\0\14\25"+
    "\1\127\2\25\4\0\1\25\22\0\2\25\5\0\11\25"+
    "\1\130\5\25\4\0\1\25\42\0\1\131\51\0\1\126"+
    "\16\0\1\126\20\0\2\25\5\0\1\132\16\25\4\0"+
    "\1\25\22\0\2\25\5\0\16\25\1\133\4\0\1\25"+
    "\22\0\2\25\5\0\1\134\16\25\4\0\1\25\31\0"+
    "\1\135\45\0\2\25\5\0\14\25\1\136\2\25\4\0"+
    "\1\25\45\0\1\137\31\0\2\25\5\0\1\140\16\25"+
    "\4\0\1\25\22\0\2\25\5\0\5\25\1\115\11\25"+
    "\4\0\1\25\36\0\1\141\40\0\2\25\5\0\11\25"+
    "\1\136\5\25\4\0\1\25\22\0\2\25\5\0\4\25"+
    "\1\142\12\25\4\0\1\25\22\0\2\25\5\0\11\25"+
    "\1\143\5\25\4\0\1\25\42\0\1\144\34\0\2\25"+
    "\5\0\12\25\1\115\4\25\4\0\1\25\43\0\1\141"+
    "\33\0\2\25\5\0\10\25\1\145\6\25\4\0\1\25"+
    "\22\0\2\25\5\0\14\25\1\146\2\25\4\0\1\25"+
    "\22\0\2\25\5\0\16\25\1\147\4\0\1\25\47\0"+
    "\1\150\27\0\2\25\5\0\1\151\16\25\4\0\1\25"+
    "\22\0\2\25\5\0\4\25\1\115\12\25\4\0\1\25"+
    "\22\0\2\25\5\0\4\25\1\152\12\25\4\0\1\25"+
    "\35\0\1\153\23\0\2\154\1\0\1\154\12\0\2\25"+
    "\5\0\17\25\4\0\1\25\4\0\2\155\1\0\1\155"+
    "\12\0\2\25\5\0\17\25\4\0\1\25\4\0\2\155"+
    "\1\0\1\155\50\0\2\154\1\0\1\154\2\0\40\154"+
    "\1\156\6\154\1\0\2\157\1\0\1\157\1\154\50\0"+
    "\2\157\1\0\1\157\41\0\1\154\6\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3825];
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\2\1\11\11\3\1\1\11\1\1\1\11\10\1"+
    "\3\11\1\1\1\11\2\0\1\1\1\11\1\1\3\0"+
    "\4\11\7\1\4\0\1\1\2\11\1\1\1\11\10\1"+
    "\2\0\3\1\1\0\4\1\2\0\3\1\1\0\1\1"+
    "\1\0\2\1\1\0\3\1\1\0\1\1\1\0\1\1"+
    "\1\11\2\1\1\0\3\1\1\0\4\1\1\11\2\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[111];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
  private int comment_count = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Yylex(java.io.Reader in) {
    this.zzReader = in;
  }


  private static String zzToPrintable(String str) {
    StringBuilder builder = new StringBuilder();
    for (int n = 0 ; n < str.length() ; ) {
      int ch = str.codePointAt(n);
      int charCount = Character.charCount(ch);
      n += charCount;
      if (ch > 31 && ch < 127) {
        builder.append((char)ch);
      } else if (charCount == 1) {
        builder.append(String.format("\\u%04X", ch));
      } else {
        builder.append(String.format("\\U%06X", ch));
      }
    }
    return builder.toString();
  }
  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Yytoken yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
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

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [64] {  }");
            { 
            }
            // fall through
          case 33: break;
          case 2:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [61] { return (new Yytoken(yytext(),yyline,\"TKN_eComercial\")); }");
            { return (new Yytoken(yytext(),yyline,"TKN_eComercial"));
            }
            // fall through
          case 34: break;
          case 3:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [44] { return (new Yytoken(yytext(),yyline,\"TKN_abreParenteses\")); }");
            { return (new Yytoken(yytext(),yyline,"TKN_abreParenteses"));
            }
            // fall through
          case 35: break;
          case 4:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [45] { return (new Yytoken(yytext(),yyline,\"TKN_fechaParenteses\")); }");
            { return (new Yytoken(yytext(),yyline,"TKN_fechaParenteses"));
            }
            // fall through
          case 36: break;
          case 5:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [53] { return (new Yytoken(yytext(),yyline,\"TKN_asterisco\")); }");
            { return (new Yytoken(yytext(),yyline,"TKN_asterisco"));
            }
            // fall through
          case 37: break;
          case 6:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [51] { return (new Yytoken(yytext(),yyline,\"TKN_mais\")); }");
            { return (new Yytoken(yytext(),yyline,"TKN_mais"));
            }
            // fall through
          case 38: break;
          case 7:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [41] { return (new Yytoken(yytext(),yyline,\"TKN_virgula\")); }");
            { return (new Yytoken(yytext(),yyline,"TKN_virgula"));
            }
            // fall through
          case 39: break;
          case 8:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [52] { return (new Yytoken(yytext(),yyline,\"TKN_hifen\")); }");
            { return (new Yytoken(yytext(),yyline,"TKN_hifen"));
            }
            // fall through
          case 40: break;
          case 9:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [50] { return (new Yytoken(yytext(),yyline,\"TKN_ponto\")); }");
            { return (new Yytoken(yytext(),yyline,"TKN_ponto"));
            }
            // fall through
          case 41: break;
          case 10:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [54] { return (new Yytoken(yytext(),yyline,\"TKN_barra\")); }");
            { return (new Yytoken(yytext(),yyline,"TKN_barra"));
            }
            // fall through
          case 42: break;
          case 11:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [71] { return (new Yytoken(yytext(),yyline,\"TKN_tipoInteiro\")); }");
            { return (new Yytoken(yytext(),yyline,"TKN_tipoInteiro"));
            }
            // fall through
          case 43: break;
          case 12:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [42] { return (new Yytoken(yytext(),yyline,\"TKN_doisPontos\")); }");
            { return (new Yytoken(yytext(),yyline,"TKN_doisPontos"));
            }
            // fall through
          case 44: break;
          case 13:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [43] { return (new Yytoken(yytext(),yyline,\"TKN_pontoEvirgula\")); }");
            { return (new Yytoken(yytext(),yyline,"TKN_pontoEvirgula"));
            }
            // fall through
          case 45: break;
          case 14:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [57] { return (new Yytoken(yytext(),yyline,\"TKN_menor\")); }");
            { return (new Yytoken(yytext(),yyline,"TKN_menor"));
            }
            // fall through
          case 46: break;
          case 15:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [55] { return (new Yytoken(yytext(),yyline,\"TKN_igual\")); }");
            { return (new Yytoken(yytext(),yyline,"TKN_igual"));
            }
            // fall through
          case 47: break;
          case 16:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [59] { return (new Yytoken(yytext(),yyline,\"TKN_maior\")); }");
            { return (new Yytoken(yytext(),yyline,"TKN_maior"));
            }
            // fall through
          case 48: break;
          case 17:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [70] { return (new Yytoken(yytext(),yyline,\"TKN_identificador\")); }");
            { return (new Yytoken(yytext(),yyline,"TKN_identificador"));
            }
            // fall through
          case 49: break;
          case 18:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [46] { return (new Yytoken(yytext(),yyline,\"TKN_abreColchetes\")); }");
            { return (new Yytoken(yytext(),yyline,"TKN_abreColchetes"));
            }
            // fall through
          case 50: break;
          case 19:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [47] { return (new Yytoken(yytext(),yyline,\"TKN_fechaColchetes\")); }");
            { return (new Yytoken(yytext(),yyline,"TKN_fechaColchetes"));
            }
            // fall through
          case 51: break;
          case 20:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [48] { return (new Yytoken(yytext(),yyline,\"TKN_abreChaves\")); }");
            { return (new Yytoken(yytext(),yyline,"TKN_abreChaves"));
            }
            // fall through
          case 52: break;
          case 21:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [62] { return (new Yytoken(yytext(),yyline,\"TKN_barraVertical\")); }");
            { return (new Yytoken(yytext(),yyline,"TKN_barraVertical"));
            }
            // fall through
          case 53: break;
          case 22:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [49] { return (new Yytoken(yytext(),yyline,\"TKN_fechaChaves\")); }");
            { return (new Yytoken(yytext(),yyline,"TKN_fechaChaves"));
            }
            // fall through
          case 54: break;
          case 23:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [63] { return (new Yytoken(yytext(),yyline,\"TKN_recebe\")); }");
            { return (new Yytoken(yytext(),yyline,"TKN_recebe"));
            }
            // fall through
          case 55: break;
          case 24:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [58] { return (new Yytoken(yytext(),yyline,\"TKN_menorOuIgual\")); }");
            { return (new Yytoken(yytext(),yyline,"TKN_menorOuIgual"));
            }
            // fall through
          case 56: break;
          case 25:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [56] { return (new Yytoken(yytext(),yyline,\"TKN_diferente\")); }");
            { return (new Yytoken(yytext(),yyline,"TKN_diferente"));
            }
            // fall through
          case 57: break;
          case 26:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [60] { return (new Yytoken(yytext(),yyline,\"TKN_maiorOuIgual\")); }");
            { return (new Yytoken(yytext(),yyline,"TKN_maiorOuIgual"));
            }
            // fall through
          case 58: break;
          case 27:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [77] { if (--comment_count == 0) yybegin(YYINITIAL); }");
            { if (--comment_count == 0) yybegin(YYINITIAL);
            }
            // fall through
          case 59: break;
          case 28:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [76] { comment_count++; }");
            { comment_count++;
            }
            // fall through
          case 60: break;
          case 29:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [73] { return (new Yytoken(yytext(),yyline,\"TKN_tipoReal\")); }");
            { return (new Yytoken(yytext(),yyline,"TKN_tipoReal"));
            }
            // fall through
          case 61: break;
          case 30:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [69] { return (new Yytoken(yytext(),yyline,\"TKN_tipoVariavel\")); }");
            { return (new Yytoken(yytext(),yyline,"TKN_tipoVariavel"));
            }
            // fall through
          case 62: break;
          case 31:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [68] { return (new Yytoken(yytext(),yyline,\"TKN_iniciaConstante\")); }");
            { return (new Yytoken(yytext(),yyline,"TKN_iniciaConstante"));
            }
            // fall through
          case 63: break;
          case 32:
            System.out.println("line: "+(yyline+1)+" "+"char: "+yychar+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [67] { return (new Yytoken(yytext(),yyline,\"TKN_nomeiaPrograma\")); }");
            { return (new Yytoken(yytext(),yyline,"TKN_nomeiaPrograma"));
            }
            // fall through
          case 64: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This main method is the debugging routine for the scanner.
   * It prints debugging information about each returned token to
   * System.out until the end of file is reached, or an error occured.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String[] argv) {
    if (argv.length == 0) {
      System.out.println("Usage : java Yylex [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          // Side-effect: is encodingName valid?
          java.nio.charset.Charset.forName(encodingName);
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Yylex scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Yylex(reader);
          do {
            System.out.println(scanner.yylex());
          } while (!scanner.zzAtEOF);

        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
