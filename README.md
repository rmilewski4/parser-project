# parser-project

FS23 PoPL Parser Project _(Parsing the Red Sea)_

## About

This project is a custom-built parser for Python3. It is built using our grammars, which are then read by ANTLR to generate the parser and lexer. Our program then takes in a Python3 file and parses it, outputting the parse tree to both a CLI and GUI, as well as whether the file is syntactically correct or not (with a list of errors if not).

## Authors

-   Andrew Kim
-   Kai Chen
-   Ryan Milewski
-   Jackson Bowes
-   Tyler Harsell
-   Jack Riebel

## Requirements

-   Unix-based CLI (Linux, MacOS, etc.)
-   Python 3.X.X
-   Pip X.X.X
-   ANTLR 4.13.1

## Instructions

1. To setup, clone this repo and ensure all requirements (above) are met.
2. Execute `sudo chmod +x ./clean.sh ./build.sh ./run.sh` in the root directory to make the clean, build and run scripts executable.
3. Run `./build.sh` in the root directory to generate the ANTLR files needed to run the driver script.
4. Run `./run.sh` in the root directory to run the driver script.

## Video Demo

[![Video Demo - Parsing the Red Sea](https://img.youtube.com/vi/dQw4w9WgXcQ/0.jpg)](https://www.youtube.com/watch?v=QNk7fpCNRJc)
