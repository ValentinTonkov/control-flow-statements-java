public class Main {
    public static void main(String[] args) {
        /*if statement is the most basic of all the control flow statements.
         It tells your program to execute a certain section of code only
         if a particular test evaluates to true.
         if ( condition ) {
            code
            ..
            ..
         }
         */

        if (12 > 3) {
            // this line is executed, if the condition is true (in this case it is true)
            System.out.println("12 is greater than 3");
        }


        // else is used to handle the program flow, if the condition is not true
        boolean isRaining = false;
        //in this case isRaining evaluates to false,
        // so the program execution jumps to the else section
        if (isRaining) {
            System.out.println("It's raining outside");
        } else {
            System.out.println("It's not raining outside");
        }


        // there could also be another if following after else:
        int currentDay = 4;

        if (currentDay == 1) {
            //if the value of currentDay is 1,
            // "Monday" will be printed
            System.out.println("Monday");
        } else if (currentDay == 2) {
            System.out.println("Tuesday");
        } else if (currentDay == 3) {
            System.out.println("Tuesday");
        } else if (currentDay == 4) {
            System.out.println("Tuesday");
        } else if (currentDay == 5) {
            System.out.println("Tuesday");
        } else if (currentDay == 6) {
            System.out.println("Tuesday");
        } else if (currentDay == 7) {
            System.out.println("Tuesday");
        } else {
            //if currentDay value is not in [1 ; 7]
            // than "No such day" will be printed
            System.out.println("No such day");
        }


        //for similar tasks as the one shown above, switch statement
        // could be used.
        // the value of the variable month will be checked
        int month = 8;

        switch (month) {
            //if the value is equal to 1, then "January" is printed
            case 1:
                System.out.println("January");
                //the break statement stops the execution of the switch
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }


/*   The while statement continually executes a block of statements while a particular condition is true. Its syntax can be expressed as:
        while (expression) {
            statement(s)
        }
*/
        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }

        /* Infinite loop could be created as follows:
        while (true){
            // your code goes here
        }

         */


/*
        The Java programming language also provides a do-while statement, which can be expressed as follows:
        do {
            statement(s)
        } while (expression);
        The difference between do-while and while is that do-while evaluates its expression at the bottom of the loop instead of the top.
*/
        count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);


        /*The for statement provides a compact way to iterate over a range of values.
        for (initialization; termination; increment) {
              statement(s)
        }
      */

        for(int i=1; i<11; i++){
            // here the i variable has values from 1 to 10.
            System.out.println("Count is: " + i);
        }

        // for loop is also commonly used for iterating
        // array elements:
        int[] numbers = {12, 87, 6, 54, 98};
        for (int i = 0; i <= numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        //enhanced for also could be used:
        // for each i in numbers.. do..
        for (int i : numbers) {
            System.out.print(i + " ");
        }

    }
}