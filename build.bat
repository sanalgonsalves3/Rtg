@echo off
echo ==================================
echo RTG Client - Quick Build Script
echo ==================================
echo.
echo Setting up Forge development environment...
call gradlew.bat setupDecompWorkspace
echo.
echo Building RTG Client JAR...
call gradlew.bat build
echo.
echo ==================================
echo Build Complete!
echo ==================================
echo.
echo Your JAR file is at:
echo build\libs\RTGClient-1.0.0-release.jar
echo.
echo Copy this file to your .minecraft\mods\ folder to test!
echo.
pause
