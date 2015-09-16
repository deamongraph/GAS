%{

  #include <stdio.h>
  #include <stdlib.h>
  #include "string.h"
  #include <math.h>
  extern FILE *yyin;
  void yyerror(char *s);
%}

%union
{
  int numero;
  char* texto;
}

%start UnidadTraductora;

%token <numero> NUMERO
%token <texto> VARIABLE STRING
%token MENORIGUAL MAYORIGUAL IGUALIGUAL DIFERENTE MAYOR MENOR
%token TYPE_NAME
%token TIPODATO
%token CASE DEFAULT IF ELSE SWITCH WHILE DO FOR BREAK RETURN
%token COMA PUNTOYCOMA SUMA RESTA MULTIPLICACION DIVISION PARENTESISIZQ PARENTESISDER LLAVEIZQ LLAVEDER DOSPUNTOS IGUAL PUNTO

%%

UnidadTraductora
  : DeclaracionExterna {printf ("El programa corre correctamente.\n");}
  | UnidadTraductora DeclaracionExterna;

DeclaracionExterna: Funcion | Declaracion;

Funcion: TIPODATO VARIABLE PARENTESISIZQ ListaArg PARENTESISDER SentCompuestas;

ListaArg: Arg | ListaArg COMA Arg;

Arg: TIPODATO VARIABLE ;

SentCompuestas: LLAVEIZQ ListaSent LLAVEDER;

ListaSent: ListaSent Sentencia | Sentencia;

Sentencia: For | While | If | Switch | SentCompuestas | Declaracion | Expresion;

For: FOR PARENTESISIZQ ExprFor PUNTOYCOMA ExprFor PUNTOYCOMA ExprFor PARENTESISDER Sentencia;

ExprFor: Expresion  |  ;

While: WHILE PARENTESISIZQ Expresion PARENTESISDER Sentencia;

If: IF PARENTESISIZQ Expresion PARENTESISDER Sentencia Else;

Else: ELSE Sentencia |  ;

Switch: SWITCH PARENTESISIZQ VARIABLE PARENTESISDER ListaCases;

Caso: CASE PARENTESISIZQ Constante PARENTESISDER DOSPUNTOS ListaSent;

ListaCases: ListaCases Caso | CASE PARENTESISIZQ Constante PARENTESISDER DOSPUNTOS ListaSent;

Expresion: VARIABLE IGUAL Expresion | ValorR;

ValorR: ValorR Comparador Mag | Mag;

Mag: Mag SUMA Termino | Mag SUMA Mag | Mag RESTA Termino | Mag RESTA Mag | Termino;

Termino: Termino MULTIPLICACION Factor | Termino DIVISION Factor | Factor;

Factor: PARENTESISIZQ Expresion PARENTESISDER| RESTA Factor | SUMA Factor | Constante;

Constante: VARIABLE | NUMERO | STRING;

Declaracion: TIPODATO ListaNombres;

ListaNombres: VARIABLE | VARIABLE COMA ListaNombres;

Comparador: IGUALIGUAL | MAYOR | MENOR | MAYORIGUAL  | MENORIGUAL | DIFERENTE;
%%


void yyerror(char *s)
{
  printf("%s\n",s);
}

int main(int argc, char **argv)
{
  if (argc>1)
    yyin=fopen(argv[1],"rt");
      
  yyparse();
  return 0;
}
