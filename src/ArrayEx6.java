// **********************************************************************
//  Programmer:         Ma Pauline Sadaya
//  Class:		CS30S
//
//  Assignment:         ArrayEx6
//
//  Description:	program will compute first 20 numbers of the Fibonacci
//                      sequence
//
//
//  Input:		describe any input from keyboard or file
//
//  Output:		first 20 numbers of the Fibonacci sequence
// ***********************************************************************

import javax.swing.*;
import java.text.DecimalFormat;

public class ArrayEx6
{  // begin class
    
    public static void main(String args[])
    {  // begin main
    // ***** declaration of constants *****
        
        final int MAXLIST = 20;        //maximum array size
        final int five = 5;     //constant five

    // ***** declaration of variables *****
        
        int list[] = new int[MAXLIST];      //set max array size
        list[0] = 0;        //starting point
        list[1] = 1;        //starting point

    // ***** create objects *****


    // ***** create input stream *****

        //ConsoleReader console = new ConsoleReader(System.in);

    // ***** Print Banner *****

        System.out.println("**********************************");
        System.out.println("NAME:        Ma. Pauline Sadaya");
        System.out.println("Class:       CS30S");
        System.out.println("Assignment:  ArrayEx6");
        System.out.println("**********************************");

    // ***** get input *****

        // all input is gathered in this section
        // remember to put ConsoleReader.class into the
        // same folder.

    // ***** processing *****

        for (int i = 2; i < MAXLIST; i++) {
            list[i] = list[i-1] + list[i-2];
       }//end for loop calculating remaining numbers

    // ***** output *****

        for(int i = 0; i < MAXLIST; i++){
            System.out.print(list[i] + "\n");
        }//end output for loop

        System.out.println("\nFirst 5 Numbers");
        for(int i = 0; i < five; i++){      
            System.out.println(list[i]); 
        }//end output for loop
        
        System.out.println("\nLast 5 Numbers");
        for(int i = MAXLIST-five; i < MAXLIST; i++){
            System.out.println(list[i]);
        }//end output for loop
        
    // ***** closing message *****

        System.out.println("\nend of processing");

	}  // end main	
}  // end class