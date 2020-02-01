/*
UPLOADED ON: 31/1/2020
UPDATES: NONES
*/

/*
==========================
*    PLEASE READ!!:     *
==========================
PLEASE READ THIS BEFORE LOOKING THROUGH THIS FILE:
--------------------------------------------------
I will be covering the basic programming in Java in this file, 
these will surely be covered and some other things are extra part
but also handy to know. You WILL be learning these at some point so might as well learn it early so you don't need to worry about it
later.  

You could always refer to this document as you go along in class.

There will be notes through the file trying to explain
what I'm doing and how it works and what it does etc. 
If you still don't understand something, try to look up what it is
and if that still doesn't help you, P.M me or email me (email below).
-----------

Throughout this tutorial, I will ask you to do a few tasks for your own practice work. Do them if you'd like. 
If you want more I can come up with more.
I will tell you what you need and you try to figure out how to do it. 
More you practice in Java, the more you will learn it.
As Aaron's file is a demonstration of making a simple Java program, 
this is a step-by-step guide with the basics with a deeper explanation.  

Before you move onto ANYTHING else 
LEARN the basics in Java 
otherwise, you're running before you walk so learn the below 
because there's so much to learn in programming,
you will end up overwhelming yourself. 
---------------
- Classes                                   
- Datatypes/variables       
- I/O (Input/Output)                       
- If statements                             
- loops                                     
- Methods                                  
- Error handling                            
---------------

I will try to make this as comprehensible as possible. 
It is recommended to read and use this next to your java file.  
This should cover this semester of programming otherwise I'll update 
the file as it's hosted on GitHub, I can easily update this file at anytime
and give notice on the Discord server when something new or updated has been added. 

You can join by this link:
(https://discord.gg/GFknCp6)

Have any questions, or want me to review your code and give feedback?
P.M me on Discord or email me at:
x19141301@student.ncirl.ie

Good luck!
- John

 */





/* 
   There are three types of errors in programming and you WILL come across these
   at some point so it's extremely good to know them and the difference:

    Syntax Error: Errors in the code that the rules of the programming language 
                  weren't followed such not including a semi-colon, misspelt variable/method names etc

    Runtime Error: Are errors when you basically ask the program to do something it can't do, 
                   This can be simple as opening a file that doesn't exist, or if you divide 0 by 0 and it crashes the program 
                   as another example. Runtime errors are also referred to as, "bugs"

    Logical Error: Are errors on the programmers end. It's an error in your logic, such as if you want to multiple 
                   something in your program but instead you accidentally divide the numbers. The program will run but not how you want it to. 
*/


package com.johncrawley.javatutorial;

/* 
I imported this tool to show you can convert text to a number
*/
import static java.lang.Integer.parseInt;

/*
Import library for Scanner tool. You can't use the Scanner tool without importing it first. 
Scanner allows console input to be taken and used 
*/
import java.util.Scanner;



        /*
        Access Modifiers: 
        ===========================
        First off, access modifiers are the public, private, protected and default that are in objects such as classes, variables, methods and so on. 
        Access modifiers allow or not allow parts of the program to use or visibly see them.
        -----------------------
        public      - The public keyword basically means that this can be accessed anywhere and everywhere in the project. 
                      Let's say you have a public String in the class before the main method, you can access 
                      that String in another class and throughout the program

        private     - The private keyword means that it can't be accessed outside the class it resides

        protected   - The access level of a protected modifier is within the package and outside 
                      the package through child class. If you do not make the child class, it cannot be accessed from outside the package

        Default     - Default is accessed automatically given if you don't specify any of the above. 
                      It means anything default can't be used outside the package
        
        */




/*
Classes:
-------
I always find this hard to describe to people but:
A class contains sets of methods and variables. 
A class is like a blueprint to a car or house. 

This is a higher example of classes but it might help you understand a class. 
This is called inheritance:

Let's say you want to make an RPG game with a play-style of a warrior, mage or range archery.
You don't want to make repetitive code so you 
create a super-class with the main properties of a player or an enemy character
such as health, level, age and so on and you can call that class which is the blueprint for what 
you're doing and we can call this, "Player.java"
Then you can create sub-classes to that class, for example, Warrior.java, Mage.java and Range.java
You will need to add, extends Player beside them class, for example:

public class Warrior extends Player

(There is one more part to this but for the sake of explaining classes, bare with me)

From the properties inherited by Player, you can mould RPG classes (Warrior, Mage and Range) 
around it to avoid repeating code or make larger chunks of code. 
So to wrap this up, you make a blueprint for what the player traits are and you extend that into another class that can increase or decrease as you want. 

I probably won't update this file with inheritance but just for explanatory sake,
I used it to explain a class and I hope it explains it. 


*/
public class tutorial  
{
    
    
    public static void main(String args[])
    {        
 
        /*
        Variables:
        -----------------------------
        String  - A string is a sequence of characters such as but not limited to @,!, £, text, numbers etc. Strings count space too. 
        Char    - A Char holds a single alphabet variable so it only holds a single alphabetical letter 
        Int     - Integer (int) holds non-decimal values of numerical values from -2,147,483,648 to 2,147,483,648. You can go bigger than that by using Long
        Long    - Long holds a much bigger value than an int with a range from -9,223,372,036,854,775,807 to 9,223,372,036,854,775,807
        Byte    - Byte holds numerical values from a range of -128 to 127
        Double  - Double holds decimal values that hold up to about 16 digit precision  
        Float   - Floats are also decimal value variables however it can only hold up to 6-7
        Boolean - Is a true or false value type. 
        
        Below I'll show you how to declare each of these.     
        There are a few ways you can also create a variable; 
        
        declared:
        String t;    
        
        or
        
        initialized:
        String t = "text";

        
        initialized is creating the variable and giving it values however declaring it is just
        declaring it without values until later notice
        
        but when you declare a variable, either way, you first call the type of variable
        then give it a name and use a single = symbol which means assign value in programming
        and finally, you give value and end it with a semi-colon.
        
        Somepeople like to give it empty values when declaring it, for example:
        int age = 0;
        String name = "";
        
        If you want to make a constant variable in Java, you add final before int which means you can't 
        change it after assigning it a variable
        
        */
        
        
        /*
        PRO TIP: 
        ALWAYS AND I MEAN ALWAYS create the variables top of the main method
        or within the top of the class. This is my lesson file so don't mistake 
        me going through different things as bad practices. 
        */
        
   
        
        String txt = "this is text";
        char character = 'c';
        int a = 1;
        long l = 200000000000000000l;
        byte b = 2;
        double pi = 3.141592653589793;
        float ab = 3.3f;
        boolean running = true;
        
        /*
        NOTE: 
        basic operations, 
        if later in the program you want to add more value to the variable you can. 
        Let's say if you make a game and your character's health is 100 so we make a variable:
        int hp = 100;
        
        He trips and hurts himself, we decrease it by doing the following at any point you want in the program 
        that's below the creation of the variable:
        hp -= 10;
        Which means, minus 10 from the current value of hp
        You can increase it too!.
        hp += 10;
        
        Test this out. Make a variable, decrease/increase and see if it changes
        */

        
          // You can do maths inside of variables, for example
        
        
        int numOne = 1;
        int numTwo = 2;
        int numOnePlusNumTwo = numOne + numTwo;
        int numOneSubtractNumTwo = numOne - numTwo;
        int numbOneDvidedNumTwo = numOne / numTwo;
        int numbOneMultipledNumTwo = numOne * numTwo;
        
        
        System.out.println("1 + 2 = " + numOnePlusNumTwo);
        
        
        /*
        NOTE:
        Inside System.out.print or System.out.println when you add a + sign inside 
        the parentheses or parameters it means to add it to the output, it's not addition (necessarily)
        It's including a variable to the output. 
        
        Let's say:
        String name = "Bob";
        String course = "Computing";
        int age = 21;
        
        and we want to output all that into one line, then we do this: 
        System.out.println("The name is " + name + " and his age is " + age + " and he is studying " + course );
        
        the output is, "The name is Bob and his age is 21 and he is studying Computing"
        
        Notice how in the string in the output code before and after there's spacing, that's because 
        as mentioned Strings add spaces where spaces are given.
        If you didn't add the space it will look like this: 
        
        The name isBoband his age is21and he is studyingComputing"
        */
        
        
        
    
        //Or we can use BIDMAS inside of the println or int
 
        
        int j = 2;
        int y = 10;
        int z = 4;
        System.out.print("BIDMAS: ");
        System.out.println(j + j * ( (y / z) - 1 ) % 2);
        
        int bidmas = (2 * 100) + (1000 / 4) - 20;
        
        
        //Howevr, you can do maths inside of the System.out.println
  
       
        System.out.println(1 + 2);
        
       
       
        
        /*
        Arrays:
       An array is a way of storing a collection of data of a specific type. 
        Think of arrays like file cabinets or kitchen cabinets where let's say in the office cabinet, 
        you are looking for section full of names or in another cabinet where there are financial records. 
        This is arrays essentially. They're a way of organising data.  
        
        Note: Arrays can be more than one dimensional, up to three dimensional
        but that is more advanced than what we will learn here at this time 
        */
        
        String[] names = {"Bob", "Danny", "Robert", "Aaron", "James", "Dean"};
        char[] cList = {'a', 'b', 'c', 'd', 'e', 'f'};
        int[] ages = {20, 21, 19, 23, 18, 20};
        byte[] byteArray = {18, 19, 20, 21, 22, 23, 24};
        double[] dx = {3.345677654567654, 3.10, 240.40244245635};
        float[] xf = {3f, 3.3333333333f, 2.4f};
        boolean[] truth = {true, true, false, true};
        
        /*
How do arrays work?

        Well, arrays have elements which are the contents of the array 
        and the index which is the postion of each of those contents. 
        The index always starts at a 0 which is the first element. 
        
        Let's say there's an array of this int:
        int[] intArr = {10, 15, 20, 5, 50};
        
        Index   =  | 0  | 1 | 2  | 3 | 4  |
        Element =  | 10 |15 | 20 | 5 | 50 |
        
        So what does this mean? well, the index is a way of grabbing specific parts of the array.
        So let's say we want to grab the element 20 from the array, we'd simply call it like so:
        intArr[2]. Try to create this exact array and play around with the index position and all 
        by printing it like so: 
        System.out.println(intArr[2]);
        
        and if we want the element 50, we call it like, intArr[4] and so on. 
        If you want to loop through an array and print all them out, I'd suggest for loops which 
        will be shown below
        */
        
  
        
        
        
        
        /*
        Parse variables:
        You can parse values from a String to an int or an int to a String. 
        I will give you an example of this. 
        So if we want to parse a String to an int
        */
        
        String stringNumber = "1";
        int parsedString = parseInt(stringNumber);
        
        
        //and int to string
        int intToString = 111;
	String str = String.valueOf(intToString);
        
        
        
        /*
        Scanner tool:
        We can take input by using this tool to take input and we can
        store it in variables so we need to create the Scanner tool like this
        Scanner [scanner name] = new Scanner(System input) is what it basically means
        */
        Scanner input = new Scanner(System.in);
        
        /*
        We can do the following now that it's created. 
        We can ask the user for their age and display it
        */
        
        int userAge;    //Declare the variable//
        
        //Output the question//
        System.out.println("What is your age?:");
        
        userAge = input.nextInt();  //This basically is giving the userAge the int valued input a user entered//
        
        //Output the outcome//
        System.out.println("Your age is: " + userAge);
        
        
        
        //We can do this with Strings too//
        
        String username; 
        System.out.println("What is your name?:");
        username = input.nextLine();                //To read strings we use, nextLine()
        System.out.println("Hello " + username);
        
        
        //Try this out yourself, mess around with storing inputs and displaying it
        
        
        /*
        TASK ONE:
        Before moving on. With what I explained and added above, try to make the following 
        console calculator:
        ---------
        Write a console program that takes input from the user,
        ask the user for the first number then the second number and
        store that input inside variables and calculate results that are addition (+)
        and print it out to the user 
        ----
        What you need?:
        1. Three variables (first input number, second input number and result number)
        2. Scanner tool
        ----
        
        */
        
       
        
        
        
        
        
        
        
        
        
        
        

        
        /*
        If statements :
        ------------------------------
        
        
        If statement operators:
        ----------
        is equalled to: ==
        More than: >
        More than equal to: >=
        Less than: < 
        Less than equal to: <=
        Not equal to: !=
        and: &&
        or: ||
        
        
        Before I get into if statements, the expressions are important to know 
        so above I described what the symbols are and I'll explain it further below 
        but learn the differences as beginners might get confused between the = symbol 
        and the == symbol. 
        ----
        If statements allow decision making in programming and execute code if the condition is true.
        Basic terms, IF something true THEN executes this code. 
        If you want to add more if statements, you can add:
        else if()
        which means if the line before it wasn't true, check this line to see if it's true. 
        
        As below I'm using numbers, when you are using a String (for beginners) you can just use equals 
        to and double quotes and enter a string inside the quotes. 
        For example, 
        if(txt == "bob")
        however there is another way and you can use it to ignore the uppercases/lower cases which is:
        if(txt.equalsIgnoreCase("BOB"))
        */
        
        //What this means is: IF numOne variable is equal to 1 then execute code inside them brackets//
        if (numOne == 1)    
        {
            //In these brackets, you put the code you want to execute if numOne is equal to 1
        }
        //What this means is: ELSE IF the first line is not true, check this line if this line is true so inside the brackets it means, IF numOne is NOT equal to 1 and execute the code inside the brackets//
        else if (numOne != 1)  
        {
            
        }
        //Same thing, so if second line isn't true, check to see if this is true so is numOne more than 1 or equal to 1//
        else if (numOne >= 1)
        {
            
        }
        //Is numOne less than equal or to 1?
        else if (numOne <= 1)
        {
            
        }
        //Is numOne more than the value of 1 but not 1 itself?
        else if (numOne > 1)
        {
            
        }
        //Is numOne less than the value of 1 but not 1 itself?
        else if (numOne < 1)
        {
            
        }
        //What this line means is that it's checking for two conditions and if both are true it will execute the code inside them brackets so if numOne is equal to 1 and numTwo is equal to 2 then it will execute the following
        else if (numOne == 1 && numTwo == 2)
        {
            
        }
        //What this line means is that it's checking for two conditions which checks if either condition is true so if either numOne is equal to 1 it will execute even if numTwo is not equal to 2
        else if (numOne == 1 || numTwo == 2)
        {
            
        }
        //This is the final else, which if all else fails do this line of code
        else
        {
            
        }
        
        
        //To show if statements with strings
        
        
        String firstName = "Bob";
        //The equalsIgnoreCase ignores any uppercase or lowercase to compare Strings
        if (firstName.equalsIgnoreCase("BOB"))
        {
            System.out.println("Your name is " + firstName);
        }
        //However, the equals means as it written so if it has a captial letter it will look specifically for the captial in the position you made
        else if (firstName.equals("Bob"))
        {
            System.out.println("Your name is " + firstName);
        }
        else
        {
            System.out.println("Your name isn't Bob");
        }
        
        
        
        
        
        
        
        /*
        TASK TWO:
        Console calculator but option of a String to change what type of maths it will calculae
        ---------
        Create a calculator that asks first input then second inputer and ask the user what operation of maths 
        do they want to calculate then use a way of making a decision to change the operation of the sum 
        
        ----
        What you need?:
        1. Four variables (String for operation which are (+ for addition, - for subtraction, / for division, * for multiplication) 
        first input number, second input number and result number)
        2. Scanner tool
        3. IF statement
        ----
        */
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        For Loops:
        For loops are used to do something a specific amount of times 
        
        
        Inside the parentheses of a for loop, there's three parts you need to do:
        
        Initialization: The initialization is used to initialize the for loop with a controlled throwaway variable and to give it a starting position
                        int i = 0;
        
        Condition:  The condition of the for loop is executed each time the loop is iterated. Meaning, it will do what you want until the condition is met. 
                    So we can use the initialized variable called, "i" to iterate until it reaches 10 by using the less than and equal to 10 which is:
                    i <= 10;
                    However, if we want to loop through an array and display all elements at once, we use:
                    i < colours.length
        
        Iteration:  The iteration part of this is do we want to increase by adding:
                    i++
                    or decrease by doing:
                    i--
        
        */
        
        //This for loop iterates an output from 0 to 10. However if we remove the = between the < and 10, it will only print out 0 to 9
        for (int i = 0; i <= 10; i++)
        {
            //You add the variable, 'i' to the output and it will iterate itself to 10
            System.out.println(i);
        }
        
        
        //Let's create an array to loop through//
        String[] colours = {"blue", "red", "yellow", "orange", "purple", "pink"};
        
        for(int i = 0; i < colours.length; i++)
        {
            //However since this is an array, you will need to add the, 'i' variable in the brackets
            System.out.println(colours[i]);
        }
        
        //This array will only print from 1 to 9 as an example of you don't always need to start from 0//
        for(int i = 1; i < 10; i++)
        {
            System.out.println(i);
        }
        
        
        
        
        
        
        
        
        /*
        A while loop do something while the condition you have in the parentheses is true 
        For example:
        int x = 1;
        
        while (x == 1)
        {
            System.out.println(x);
        }
        
        While x is equal to 1, it will do it forever print the value so there's a few things you can add and should know.
        
        break; - break results in the termination of the loop
        continue; - continue stops the current execution of the iteration and proceeds to the next iteration
       
        
        You can use these in for loops too!.
        
        */
        
        while (running = true)
        {
            System.out.println("program is on"); 
            break;
        }
        
        
        /*
        Let's create a loop where we skip over the number 5
        */
        
        for(int i = 1; i <= 10; i++)
        {
                if(i == 5)
                {
                    continue;
                }
                else 
                {
                    System.out.println(i);
                }
        }
 
        
        

        
        
        
        
        /*
            Error handling:
            Let's say you want a user to enter a number but if they enter any text
            or symbol it will break and crash the program. How do we stop this?, 
            we use a try and a catch. It tries to execute the code, if it fails,
            it will throw a catch error. This means that the program wont crash 
            and you can tell the user the error. 
            For demostration purposes, I will create a variable inside the try. 
            You should always create the variables at the top!!!.
        */
        
        try
        {
            int age = 0;
            
            System.out.println("Enter your age:");
            
            age = input.nextInt();
            
            System.out.println("Your age is " + age);
        }
        catch (Exception e)
        {
            System.out.println("Please enter numerical values");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    

    
    /*
    Methods:
    Methods are time savers and help reuse code without making repetition. 
    For example, we can have a method to only display the output of Hello World and call it 
    by using the following:
    HelloWorld();
    
    You can use this as many times as you like without typing the same System.out.println("Hello world!");
    over and over and over again. 
        
    When you create a method, it's outside the main method. You can't have a method inside of method 
    so you write your methods below the main method curly bracket. 
    
    So if the main method is here: 
     public static void main(String args[])
    {        
    }
    
    you create your methods here like this:
     public static void main(String args[])
    {        
    }
    
    public void HelloWorld()
    {
    }
    
    
    */
    public void HelloWorld()
    {
         System.out.println("Hello world!");
    }
    
  
    /*
    Methods are only for creating reusable code. You can make variable methods such as a String input. 
    What this method does is, you input a String in the parentheses when you declare it which will look like: name("bob");
    and inside the method we create another String which we call, "greeting" and we give it the value of, "Hello" with the input String
    beside it so the name will be added to the String 
    then we NEED to have a return statement which returns the value of what we provide, in this case, the greeting variable
    */
    public String name(String input)
    {
        String greeting = "Hello " + input;
        return greeting;
    }
    
    
    
    
    /* 
    We can take in multiple inputs to the parentheses by adding a comma. So when you declare it somewhere in the program you write it like this:
    CalcAddition(5, 10);
    Which will return the value of 15. 
    You can add this to the System.out.println
    but you will need to make it static so it will output so it'll look like this:
     public static int CalcAddition (int fnum, int snum)
    {
    }
    */
    public int CalcAddition (int fnum, int snum)
    {
        int result = fnum + snum; 
        
        return result;
    }
    
    
}


//EXTRA TASK//

/*
TASK 2.5:
-----------------
    Console calculator:
    Try make methods for the math operations (+, -, /, *) and call them if the user enters what kind of maths they want to do
    
    Try this on your own and see if you can figure out it
*/



/*
Try create more things with what I've wrote here. Maybe create a small quiz by making two arrays (questions, answers) and a variable for score. 
Mess around and figure things out.
    
*/