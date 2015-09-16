/* A Bison parser, made by GNU Bison 2.5.  */

/* Bison interface for Yacc-like parsers in C
   
      Copyright (C) 1984, 1989-1990, 2000-2011 Free Software Foundation, Inc.
   
   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.
   
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.
   
   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.
   
   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */


/* Tokens.  */
#ifndef YYTOKENTYPE
# define YYTOKENTYPE
   /* Put the tokens into the symbol table, so that GDB and other debuggers
      know about them.  */
   enum yytokentype {
     NUMERO = 258,
     VARIABLE = 259,
     STRING = 260,
     MENORIGUAL = 261,
     MAYORIGUAL = 262,
     IGUALIGUAL = 263,
     DIFERENTE = 264,
     MAYOR = 265,
     MENOR = 266,
     TYPE_NAME = 267,
     TIPODATO = 268,
     CASE = 269,
     DEFAULT = 270,
     IF = 271,
     ELSE = 272,
     SWITCH = 273,
     WHILE = 274,
     DO = 275,
     FOR = 276,
     BREAK = 277,
     RETURN = 278,
     COMA = 279,
     PUNTOYCOMA = 280,
     SUMA = 281,
     RESTA = 282,
     MULTIPLICACION = 283,
     DIVISION = 284,
     PARENTESISIZQ = 285,
     PARENTESISDER = 286,
     LLAVEIZQ = 287,
     LLAVEDER = 288,
     DOSPUNTOS = 289,
     IGUAL = 290,
     PUNTO = 291
   };
#endif



#if ! defined YYSTYPE && ! defined YYSTYPE_IS_DECLARED
typedef union YYSTYPE
{

/* Line 2068 of yacc.c  */
#line 12 "sintactico.y"

  int numero;
  char* texto;



/* Line 2068 of yacc.c  */
#line 93 "sintactico.tab.h"
} YYSTYPE;
# define YYSTYPE_IS_TRIVIAL 1
# define yystype YYSTYPE /* obsolescent; will be withdrawn */
# define YYSTYPE_IS_DECLARED 1
#endif

extern YYSTYPE yylval;


