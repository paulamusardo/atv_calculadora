@echo off
echo Compilando a Calculadora...
javac -cp src\main\java src\main\java\*.java

if %errorlevel% equ 0 (
    echo Compilacao bem-sucedida! Executando a aplicacao...
    java -cp src\main\java CalculadoraApp
) else (
    echo Erro na compilacao!
    pause
)
