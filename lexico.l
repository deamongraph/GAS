%{
	#include <stdio.h>
	#include <stdlib.h>
	#include "sintactico.tab.h"
%}

digito [0-9]
tipodato (string|int|float|void|bool)
palabra  [a-zA-Z][a-zA-Z0-9]*
string \".*\"

%%
for 					{return(FOR);};
while					{return(WHILE);};
switch					{return(SWITCH);};
case					{return(CASE);};
if						{return(IF);};
else					{return(ELSE);};
{tipodato}				{return(TIPODATO);};
{palabra} 				{return(VARIABLE);};
{digito}+ 				{return(NUMERO);};
{string}				{return(STRING);};
{digito}*\.{digito}+ 	{return(NUMERO);};

\+ 						{return(SUMA);};
- 						{return(RESTA);};
\/						{return(DIVISION);};
\*						{return(MULTIPLICACION);};
\{ 						{return(LLAVEIZQ);};
\}						{return(LLAVEDER);};
\( 						{return(PARENTESISIZQ);};
\)						{return(PARENTESISDER);};
;						{return(PUNTOYCOMA);}; 	
,						{return(COMA);};
: 						{return(DOSPUNTOS);};
\.						{return(PUNTO);};
=						{return(IGUAL);};
==						{return(IGUALIGUAL);};
>						{return(MAYOR);};
\<						{return(MENOR);};
>=						{return(MAYORIGUAL);};
\<=						{return(MENORIGUAL);};
!=						{return(DIFERENTE);};
%%
