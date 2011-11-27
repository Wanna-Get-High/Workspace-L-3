#!/bin/sh
java JFlex.Main spec/lexiqueCalcul.lex
mv spec/ScannerCalcul.java src/calcul/analyseurs
