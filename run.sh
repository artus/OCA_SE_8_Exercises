#!/bin/bash

# Parse input
CHAPTER="chapter$1";
EXERCISE="Exercise$2";
FULL_PATH="src/$CHAPTER/$EXERCISE";

# Compile and run
echo "Compiling $FULL_PATH" && \
javac "$FULL_PATH.java" && \
echo "Running $FULL_PATH" && \
java "$FULL_PATH";
