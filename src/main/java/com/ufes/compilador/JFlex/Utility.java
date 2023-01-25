package com.ufes.compilador.JFlex;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Utility {

  private Utility() {}

  private static final List<String> ERROR_MESSAGES =
      Collections.unmodifiableList(
          Arrays.asList(
              "Error: Unmatched end-of-comment punctuation.",
              "Error: Unmatched start-of-comment punctuation.",
              "Error: Unclosed string.",
              "Error: Illegal character."));

  public static final int E_ENDCOMMENT = 0;
  public static final int E_STARTCOMMENT = 1;
  public static final int E_UNCLOSEDSTR = 2;
  public static final int E_UNMATCHED = 3;

  public static void error(int code) {
    System.err.println(ERROR_MESSAGES.get(code));
  }
}
