grammar ProtoPas;

program  : 'program' ID  ';'  vars body '.';

body: 'begin' stmts 'end' ;

stmts : stmt ';' stmts
      | stmt
      ;

stmt : assign
      | {Delphi.supportsInlineVar}? inline_var
      |
      ;

inline_var: 'var' ID inline_type  inline_assign ;

inline_type : ':' ID
           |
           ;

inline_assign :  ':=' expr
              |
              ;

vars : ( 'var'  ( var )+ )?
     ;

var :  ID ':' ID ';'
    ;

assign : ID ':=' expr;

expr: ID
    | NUM
    ;


NUM: [0-9]+ ;
ID : [a-z]+ ;
WS : [ \t\r\n]+ -> skip ;