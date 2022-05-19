#!/bin/sh

::Commentaires
@echo off

echo Début

title init

cls

set VAR_Espace_Un="test"
set /p VAR_Saisie_Un=ma saisie un: 
echo %VAR_Espace_Un%

echo.
set VAR_Saisie
echo.

pause

ssh -L 3305:127.0.0.1:3306 admin-blq@192.168.100.178 -pw Be8aiche3xungoh

echo Fin