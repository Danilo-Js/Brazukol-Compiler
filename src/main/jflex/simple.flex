/* this is the scanner example from the JLex website
   (with small modifications to make it more readable) */

%%

%public

%{
  private int comment_count = 0;
%}

%line
%char
%state COMMENT
%unicode

%debug

ALPHA=[A-Za-z]
DIGIT=[0-9]
NONNEWLINE_WHITE_SPACE_CHAR=[\ \t\b\012]
NEWLINE=\r|\n|\r\n
WHITE_SPACE_CHAR=[\n\r\ \t\b\012]
STRING_TEXT=(\\\"|[^\n\r\"\\]|\\{WHITE_SPACE_CHAR}+\\)*
COMMENT_TEXT=([^*/\n]|[^*\n]"/"[^*\n]|[^/\n]"*"[^/\n]|"*"[^/\n]|"/"[^*\n])+
Ident = {ALPHA}({ALPHA}|{DIGIT}|_)*

%%

<YYINITIAL> {
  "," { return (new Yytoken(yytext(),yyline,"TKN_tokenEscolhido")); }
  ":" { return (new Yytoken(yytext(),yyline,"TKN_tokenEscolhido")); }
  ";" { return (new Yytoken(yytext(),yyline,"TKN_tokenEscolhido")); }
  "(" { return (new Yytoken(yytext(),yyline,"TKN_tokenEscolhido")); }
  ")" { return (new Yytoken(yytext(),yyline,"TKN_tokenEscolhido")); }
  "[" { return (new Yytoken(yytext(),yyline,"TKN_tokenEscolhido")); }
  "]" { return (new Yytoken(yytext(),yyline,"TKN_tokenEscolhido")); }
  "{" { return (new Yytoken(yytext(),yyline,"TKN_tokenEscolhido")); }
  "}" { return (new Yytoken(yytext(),yyline,"TKN_tokenEscolhido")); }
  "." { return (new Yytoken(yytext(),yyline,"TKN_tokenEscolhido")); }
  "+" { return (new Yytoken(yytext(),yyline,"TKN_tokenEscolhido")); }
  "-" { return (new Yytoken(yytext(),yyline,"TKN_tokenEscolhido")); }
  "*" { return (new Yytoken(yytext(),yyline,"TKN_tokenEscolhido")); }
  "/" { return (new Yytoken(yytext(),yyline,"TKN_tokenEscolhido")); }
  "=" { return (new Yytoken(yytext(),yyline,"TKN_tokenEscolhido")); }
  "<>" { return (new Yytoken(yytext(),yyline,"TKN_tokenEscolhido")); }
  "<"  { return (new Yytoken(yytext(),yyline,"TKN_tokenEscolhido")); }
  "<=" { return (new Yytoken(yytext(),yyline,"TKN_tokenEscolhido")); }
  ">"  { return (new Yytoken(yytext(),yyline,"TKN_tokenEscolhido")); }
  ">=" { return (new Yytoken(yytext(),yyline,"TKN_tokenEscolhido")); }
  "&"  { return (new Yytoken(yytext(),yyline,"TKN_tokenEscolhido")); }
  "|"  { return (new Yytoken(yytext(),yyline,"TKN_tokenEscolhido")); }
  ":=" { return (new Yytoken(yytext(),yyline,"TKN_tokenEscolhido")); }

  {NONNEWLINE_WHITE_SPACE_CHAR}+ { }

  "/*" { yybegin(COMMENT); comment_count++; }

  \"{STRING_TEXT}\" {
    String str =  yytext().substring(1,yylength()-1);
    return (new Yytoken(str,yyline,"TKN_tokenEscolhido"));
  }

  \"{STRING_TEXT} {
    String str =  yytext().substring(1,yytext().length());
    Utility.error(Utility.E_UNCLOSEDSTR);
    return (new Yytoken(str,yyline,"TKN_tokenEscolhido"));
  }

  {DIGIT}+ { return (new Yytoken(yytext(),yyline,"TKN_tokenEscolhido")); }

  {Ident} { return (new Yytoken(yytext(),yyline,"TKN_tokenEscolhido")); }
}

<COMMENT> {
  "/*" { comment_count++; }
  "*/" { if (--comment_count == 0) yybegin(YYINITIAL); }
  {COMMENT_TEXT} { }
}


{NEWLINE} { }

. {
  System.out.println("Illegal character: <" + yytext() + ">");
	Utility.error(Utility.E_UNMATCHED);
}

