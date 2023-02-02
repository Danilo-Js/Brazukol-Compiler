/* this is the scanner example from the JLex website
   (with small modifications to make it more readable) */

package com.ufes.compilador.JFlex;

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

LineTerminator=\r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace={LineTerminator} | [ \t\f]
Comment={TraditionalComment} | {EndOfLineComment} | {DocumentationComment}
TraditionalComment="(*" [^*] ~"*)" | "(*" "*"+ ")"
EndOfLineComment="//"{InputCharacter}* {LineTerminator}?
DocumentationComment="{"{CommentContent} "}"
CommentContent=( [^*] | \*+ [^/*] )*

ALPHA=[A-Za-z]
DIGIT=[0-9]
NONNEWLINE_WHITE_SPACE_CHAR=[\ \t\b\012]
NEWLINE=\r|\n|\r\n
WHITE_SPACE_CHAR=[\n\r\ \t\b\012]
STRING_TEXT=(\\\"|[^\n\r\"\\]|\\{WHITE_SPACE_CHAR}+\\)*
COMMENT_TEXT=([^*/\n]|[^*\n]"/"[^*\n]|[^/\n]"*"[^/\n]|"*"[^/\n]|"/"[^*\n])+
Ident = {ALPHA}({ALPHA}|{DIGIT}|_)*

espaco={NONNEWLINE_WHITE_SPACE_CHAR}|{NONNEWLINE_WHITE_SPACE_CHAR}+|{WHITE_SPACE_CHAR}|{WhiteSpace}
ID=[_|a-z|A-Z][a-z|A-Z|0-9|_|$|%|@|#|!|?]*
INTEIRO=0|[1-9][0-9]*
REAL={INTEIRO}.{INTEIRO}|{INTEIRO},{INTEIRO}

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
  {espaco} { }
  {Comment} { }
}

<YYINITIAL> "verdadeiro" { return (new Yytoken(yytext(),yyline,"TKN_verdadeiro")); }
<YYINITIAL> "falso" { return (new Yytoken(yytext(),yyline,"TKN_falso")); }

<YYINITIAL> "variavel" { return (new Yytoken(yytext(),yyline,"TKN_iniciaVariavel")); }
<YYINITIAL> "constante" { return (new Yytoken(yytext(),yyline,"TKN_iniciaConstante")); }

<YYINITIAL> \" { return (new Yytoken(yytext(),yyline,"TKN_aspas")); }
<YYINITIAL> \” { return (new Yytoken(yytext(),yyline,"TKN_aspas")); }
<YYINITIAL> \“ { return (new Yytoken(yytext(),yyline,"TKN_aspas")); }
<YYINITIAL> "quociente" { return (new Yytoken(yytext(),yyline,"TKN_quociente")); }
<YYINITIAL> "resto" { return (new Yytoken(yytext(),yyline,"TKN_resto")); }
<YYINITIAL> "se" { return (new Yytoken(yytext(),yyline,"TKN_se")); }
<YYINITIAL> "entao" { return (new Yytoken(yytext(),yyline,"TKN_entao")); }
<YYINITIAL> "senao" { return (new Yytoken(yytext(),yyline,"TKN_senao")); }
<YYINITIAL> "enquanto" { return (new Yytoken(yytext(),yyline,"TKN_enquanto")); }
<YYINITIAL> "faca" { return (new Yytoken(yytext(),yyline,"TKN_faca")); }
<YYINITIAL> "repita" { return (new Yytoken(yytext(),yyline,"TKN_repita")); }
<YYINITIAL> "ate" { return (new Yytoken(yytext(),yyline,"TKN_ate")); }
<YYINITIAL> "pare" { return (new Yytoken(yytext(),yyline,"TKN_pare")); }
<YYINITIAL> "continua" { return (new Yytoken(yytext(),yyline,"TKN_continua")); }
<YYINITIAL> "leia" { return (new Yytoken(yytext(),yyline,"TKN_leia")); }
<YYINITIAL> "escreva" { return (new Yytoken(yytext(),yyline,"TKN_escreva")); }


<YYINITIAL> "funcao" { return (new Yytoken(yytext(),yyline,"TKN_declarafuncao")); }


<YYINITIAL> "vetor" { return (new Yytoken(yytext(),yyline,"TKN_declaraVetor")); }
<YYINITIAL> "de" { return (new Yytoken(yytext(),yyline,"TKN_associaVetorATipo")); }

<YYINITIAL> "procedimento" { return (new Yytoken(yytext(),yyline,"TKN_declaraProcedimento")); }
<YYINITIAL> "inicio" { return (new Yytoken(yytext(),yyline,"TKN_iniciaBloco")); }
<YYINITIAL> "fim" { return (new Yytoken(yytext(),yyline,"TKN_terminaBloco")); }

<YYINITIAL> "programa" { return (new Yytoken(yytext(),yyline,"TKN_nomeiaPrograma")); }
<YYINITIAL> {tipo} { return (new Yytoken(yytext(),yyline,"TKN_tipoVariavel")); }
<YYINITIAL> {ID} { return (new Yytoken(yytext(),yyline,"TKN_identificador")); }
<YYINITIAL> {INTEIRO} { return (new Yytoken(yytext(),yyline,"TKN_tipoInteiro")); }
<YYINITIAL> {ALPHA} { return (new Yytoken(yytext(),yyline,"TKN_tipoCaractere")); }
<YYINITIAL> {REAL} { return (new Yytoken(yytext(),yyline,"TKN_tipoReal")); }

<COMMENT> {
  "{" { comment_count++; }
  "}" { if (--comment_count == 0) yybegin(YYINITIAL); }
  {COMMENT_TEXT} { }
}

<COMMENT> {
  "(*" { comment_count++; }
  "*)" { if (--comment_count == 0) yybegin(YYINITIAL); }
  {COMMENT_TEXT} { }
}

{NEWLINE} { }