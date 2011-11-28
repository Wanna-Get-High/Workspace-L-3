#!/bin/sh
java java_cup.Main -parser ParserCalcul -symbols TypeSymboles spec/syntaxeCalcul.cup
mv TypeSymboles.java ParserCalcul.java src/calcul/analyseurs
