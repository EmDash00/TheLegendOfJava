# Task 1: Variables and Input

## Declaring variables

You may be familiar with the word "variable" in math. In math, a variable represents an unknown or varying quantity. In programming, a varible is a *piece of stored data*. Variables are how computers can remember things.

Here's how we can *declare* a variable in Java.

```java
String myString;
```

>[!NOTE]
> We typically declare variables in Java in camelCase. In camelCase, the starting letter is lowercase. The first letter of each word that follows is uppercase (as in the name!).

This declares a piece of data called `myString` that stores text. In general the format for declarations are: `[type of variable] [name of variable];`

There are a few different types of variables in Java that you should become familiar with:

| Type     | What it represents     | Example(s)    | How to declare (and initialize)    |
| -------- | ---------------------- | ------------- | ---------------------------------- |
| `String` | Text                   | `"hello"`     | `String str = "hello";`            |
| `int`    | Signed whole numbers   | `1`, `-1`     | `int numberOfFriends = 0;`         |
| `double` | Signed decimal numbers | `0.5`, `-0.5` | `double numberOfBraincells = 0.5;` |
| `char`   | A single character     | `'a'`, `'A'`  | `char myGrades = 'A';`              |


>[!WARNING]
> Always make sure you *initialize* a variable (give it a value) before you use it. Variables that aren't initialized can lead to *undefined behavior* (anything could happen!).

>[!INFO]
> You can also set an initial value like so.
>```java
>String myName = "Gene Eric";
>```

>[!INFO]
> The equal sign in Java should be read as "store". When you use `=`, the data on the right hand side of the equal sign gets stored in the variable on the left hand side. We will learn later how to check if things are equal. This process of storing a value in a variable is called *assignment* or "assigning" the variable a value.

## Java Scanner

If all we could do was output, computer programs would be quite boring. Now let's learn how to take input from the user using the `Scanner`. Here's how we can use it.

```java
import java.util.Scanner;  // Import the Scanner class

var scanner = new Scanner(System.in);
String input = scanner.nextLine(); // get a line of input and store it.

scanner.close(); // make sure to close it!
```

Let's add some interactive input to the game. After the LEGEND is printed, we should ask the player for their name with the following dialogue:

```
Traveler, I have not seen you before. What is your name?
Your name:
```

Your cursor should land right after the colon on "Your name: " without starting a new line.

>[!TIP]
> `System.out.println()` always adds a new line. Don't need one? Use `System.out.print()` instead!`

>[!TIP]
> Make sure to add a space after the color in "Your name:"

<details>
<summary> Solution </summary> 

```java
System.out.println("Traveler, I have not seen you before. What is your name?");
System.out.print("Your name: ");
```

</details>  <br>

Now let's use the `Scanner` to actually store the user's input via `Scanner.nextLine()`. Store the user's inputted name in a variable called `playerName`. Make sure to add the import to the top of the file after the `package` statement.

<details>
<summary> Solution </summary> 

```java
var scanner = new Scanner(System.in)
System.out.println("Traveler, I have not seen you before. What is your name?");
System.out.print("Your name: ");
String playerName = scanner.nextLine();

scanner.close();
```

</details>  <br>

Now let's use the player's name to greet them by saying: `"It is nice to meet you, [playerName].`.

>[!TIP]
> You can combine Strings using `+`. For example `"Hello " + "world"` makes `"Hello world"`
> You can also do this with strings inside of variables so `"Hello " + str` cobines the word "Hello " with the contents of the variable `str`. Don't forget to add spaces!

<details>
<summary> Solution </summary> 

```java
var scanner = new Scanner(System.in);
System.out.println("Traveler, I have not seen you before. What is your name?");
System.out.print("Your name: ");
String playerName = scanner.nextLine();
System.out.println("It is nice to meet you, " + playerName + ".");

scanner.close();
```

</details>  <br>

## Parsing

In order to convert text into numeric data, we need to perform a process known as *parsing*. There are two types of parsing to know:
    - `Integer.parseInt()` - Turns a `String` into an `int`
    - `Double.parseDouble()` - Turns a `String` into a `double`

>[!WARNING]
> Text that can't be parsed gives an error. Make sure your text actually represents an integer or a double before converting it.

Examples:

```java
    int a = Integer.parseInt("1"); // a is now 1.
    double b = Double.parseInt("0.5"); // b is now 0.5
```

This will be helpful for creating a character, which will we do next time. For now we'll end by having a character ask the player how far they've traveled. Prompt the player the following:

```
[player name], how many miles have you traveled?
> [cursor here]
```

Make sure to include the right arrow! Then use the scanner to get the player's input and try to interpret that as number. Then say:

```
Oh, you've travelled [distance] miles..?
```

>[!TIP]
> You can use `+` to add numbers to strings too. `"age: " + 16` gives the string `"age: 16"`.

<details>
<summary> Solution </summary> 

```java
var scanner = new Scanner(System.in);
// ...
// After it is nice to meet you

System.out.println(playerName + ", how many miles have you travelled?");
System.out.print("> ");
String input = scanner.getNextLine();
double distance = Double.parseDouble(input);
System.out.println("Oh, you've travelled " + distance + " miles..?");

scanner.close();
```

</details>  <br>
