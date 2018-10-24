#!/bin/bash

# Variables
DIRECTORY="./tmp";
FILE="Main";

execute()
{
    # Delete old file
    rm -rf "$DIRECTORY" 2> /dev/null;

    # Read input
    read -p "> " input;

    # Check for commands
    case "$input" in

        clear)
            clear;
            ;;

        exit)
            exit;
            ;;

        *)
            # Create a new file
            mkdir "$DIRECTORY";
            touch "$DIRECTORY/$FILE.java";

            # Write code in the new file
            echo "public class Main {" >> "$DIRECTORY/$FILE.java";
            echo "public static void main(String[] args) {" >> "$DIRECTORY/$FILE.java";
            echo "$input" >> "$DIRECTORY/$FILE.java";
            echo "} }" >> "$DIRECTORY/$FILE.java";

            # Compile
            javac "$DIRECTORY/$FILE.java";

            # Execute
            java -classpath "$DIRECTORY" "$FILE";
            ;;

    esac;

    # Delete files
    rm -rf "$DIRECTORY" 2> /dev/null;
}

while [ true ]; do
    execute;
done;
