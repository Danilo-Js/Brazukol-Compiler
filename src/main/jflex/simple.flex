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
%caseless
%ignorecase

%debug

ALPHA=[A-Za-z]
DIGIT=[0-9]
NONNEWLINE_WHITE_SPACE_CHAR=[\ \t\b\012]
NEWLINE=\r|\n|\r\n
WHITE_SPACE_CHAR=[\n\r\ \t\b\012]
STRING_TEXT=(\\\"|[^\n\r\"\\]|\\{WHITE_SPACE_CHAR}+\\)*
COMMENT_TEXT=([^*/\n]|[^*\n]"/"[^*\n]|[^/\n]"*"[^/\n]|"*"[^/\n]|"/"[^*\n])+
Ident = {ALPHA}({ALPHA}|{DIGIT}|_)*

ID=[_|a-z|A-Z][a-z|A-Z|0-9|_]*
INTEIRO=0|[1-9][0-9]*
REAL={INTEIRO}.{INTEIRO}|{INTEIRO},{INTEIRO}

variavel=variavel|variavel{WHITE_SPACE_CHAR}
startConstante=constante|constante{WHITE_SPACE_CHAR}
tipo=inteiro|real|caracteres|caracter|booleano

%%

<YYINITIAL> {
  "," { return (new Yytoken(yytext(),yyline,"TKN_virgula")); }
  ":" { return (new Yytoken(yytext(),yyline,"TKN_doisPontos")); }
  ";" { return (new Yytoken(yytext(),yyline,"TKN_pontoEvirgula")); }
  "(" { return (new Yytoken(yytext(),yyline,"TKN_abreParenteses")); }
  ")" { return (new Yytoken(yytext(),yyline,"TKN_fechaParenteses")); }
  "[" { return (new Yytoken(yytext(),yyline,"TKN_abreColchetes")); }
  "]" { return (new Yytoken(yytext(),yyline,"TKN_fechaColchetes")); }
  "{" { return (new Yytoken(yytext(),yyline,"TKN_abreChaves")); }
  "}" { return (new Yytoken(yytext(),yyline,"TKN_fechaChaves")); }
  "." { return (new Yytoken(yytext(),yyline,"TKN_ponto")); }
  "+" { return (new Yytoken(yytext(),yyline,"TKN_mais")); }
  "-" { return (new Yytoken(yytext(),yyline,"TKN_hifen")); }
  "*" { return (new Yytoken(yytext(),yyline,"TKN_asterisco")); }
  "/" { return (new Yytoken(yytext(),yyline,"TKN_barra")); }
  "=" { return (new Yytoken(yytext(),yyline,"TKN_igual")); }
  "<>" { return (new Yytoken(yytext(),yyline,"TKN_diferente")); }
  "<"  { return (new Yytoken(yytext(),yyline,"TKN_menor")); }
  "<=" { return (new Yytoken(yytext(),yyline,"TKN_menorOuIgual")); }
  ">"  { return (new Yytoken(yytext(),yyline,"TKN_maior")); }
  ">=" { return (new Yytoken(yytext(),yyline,"TKN_maiorOuIgual")); }
  "&"  { return (new Yytoken(yytext(),yyline,"TKN_eComercial")); }
  "|"  { return (new Yytoken(yytext(),yyline,"TKN_barraVertical")); }
  {NONNEWLINE_WHITE_SPACE_CHAR}+ { }
}

<YYINITIAL> "vetor" { return (new Yytoken(yytext(),yyline,"TKN_declaraVetor")); }
<YYINITIAL> "de" { return (new Yytoken(yytext(),yyline,"TKN_associaVetorATipo")); }

<YYINITIAL> "procedimento" { return (new Yytoken(yytext(),yyline,"TKN_declaraProcedimento")); }
<YYINITIAL> "inicio" { return (new Yytoken(yytext(),yyline,"TKN_iniciaBloco")); }
<YYINITIAL> "fim" { return (new Yytoken(yytext(),yyline,"TKN_terminaBloco")); }

<YYINITIAL> "programa" { return (new Yytoken(yytext(),yyline,"TKN_nomeiaPrograma")); }
<YYINITIAL> {startConstante} { return (new Yytoken(yytext(),yyline,"TKN_iniciaConstante")); }
<YYINITIAL> {tipo} { return (new Yytoken(yytext(),yyline,"TKN_tipoVariavel")); }
<YYINITIAL> {ID} { return (new Yytoken(yytext(),yyline,"TKN_identificador")); }
<YYINITIAL> {INTEIRO} { return (new Yytoken(yytext(),yyline,"TKN_tipoInteiro")); }
<YYINITIAL> {ALPHA} { return (new Yytoken(yytext(),yyline,"TKN_tipoCaractere")); }
<YYINITIAL> {REAL} { return (new Yytoken(yytext(),yyline,"TKN_tipoReal")); }
<YYINITIAL> {variavel} { return (new Yytoken(yytext(),yyline,"TKN_iniciaVariavel")); }

<COMMENT> {
  "/*" { comment_count++; }
  "*/" { if (--comment_count == 0) yybegin(YYINITIAL); }
  {COMMENT_TEXT} { }
}

{NEWLINE} { }