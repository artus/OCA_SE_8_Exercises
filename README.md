# Training question for the OCA exam.

## Rules

The `helpers.Helper` methods are there to check which type an expression returns. They are always correct, so you don't need to check for mistakes over there. So if, for instance, you see:

```java
import helpers.Helper;
```

or 

```java
Helper.GET_TYPE(3 * 4);
```

You don't have to check for errors. The `GET_TYPE` method will return the type of the expression passed as a parameter.

## Running one-liners

Using the `java-terminal.sh` you can execute one-liners to test certain expressions.

```shell
bash java-terminal.sh # PRESS ENTER
> System.out.println("Hello"); # PRESS ENTER
Hello
```

## Training

### Continuous exercises

To just start practicing, run

```shell
bash ./run.sh train
```

This will show you Java 1.8 code, which you can analyse and think about how the compiler will handle it. When you think what will happen, you just press a button and the compiler will show what he makes of it.

After you've seen the result, press another button to continue to the next code fragment.

### Running exercises for a specific chapter

To run exercises from a specific chapter, just type

```shell
bash ./run.sh [chapter_number]
```

where `[chapter_number]` is the number of the chapter you want to train.

### Running specific exercises.

To run specific exercises, just type

```shell
bash ./run.sh [chapter_number] [exercise_number]
```

where `[chapter_number]` is the number of the chapter you want to train and `[exercise_number]` is the number of the exercise you want to train.