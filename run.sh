#!/bin/bash

clear;

# Reset arguments

CHAPTER_INPUT=$1;
EXERCISE_INPUT=$2;
FLOOR=1;
TRAIN=0;

# Check if training
if [ -n "$CHAPTER_INPUT" ] && [ "$CHAPTER_INPUT" = "train" ]; then

    TRAIN=1;
    CHAPTER_INPUT="random";
fi;

# Functions

function RANDOM_SMALLER_THAN()
{
    FLOOR=1;
    RANGE=$(($CEILING-$FLOOR+1));
    RESULT=$RANDOM;
    let "RESULT %= $RANGE";
    RESULT=$(($RESULT+$FLOOR));
    echo $RESULT;
}

# Clear classes

rm src/chapter*/*.class 2> /dev/null;

# Set variables

CHAPTERS=$(( $(ls -l ./src | wc -l) - 2));

# Check for random chapter

if [ -z "$CHAPTER_INPUT" ] || [ "$CHAPTER_INPUT" = "random" ]; then
    CEILING=$CHAPTERS;
    CHAPTER_INPUT=$(RANDOM_SMALLER_THAN);
fi;

#Set variables

CEILING=$(( $(ls -l "./src/chapter$CHAPTER_INPUT" | wc -l) - 2));

# Check for random exercise

if [ -z "$EXERCISE_INPUT" ] || [ "$EXERCISE_INPUT" = "random" ]; then
    EXERCISE_INPUT=$(RANDOM_SMALLER_THAN);
fi;

# Parse input
CHAPTER="chapter$CHAPTER_INPUT";
EXERCISE="Exercise$EXERCISE_INPUT";
FULL_PATH="src/$CHAPTER/$EXERCISE";

# Compile and run
if [ "$TRAIN" = "0" ]; then

    echo "Compiling $FULL_PATH" && \
    javac "$FULL_PATH.java" && \
    echo "Running $FULL_PATH" && echo "" && \
    java "$FULL_PATH";

else

    cat "$FULL_PATH.java";
    echo "";
    echo "";
    read -s -n 1 -p "Look at the code, and think about what will happen. Press any key to see the output.";
    echo "";
    echo "";

    echo "Compiling $FULL_PATH" && \
    javac "$FULL_PATH.java" && \
    echo "Running $FULL_PATH" && echo "" && \
    java "$FULL_PATH";

    echo "";
    echo "";
    read -s -n 1 -p "Was this what you expected? Press any key to proceed to the next exercise.";
    bash ./run.sh train;

fi;

# Clear classes again

rm src/chapter*/*.class 2> /dev/null;
