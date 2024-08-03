package practical_5;
/*
Practical No. : - 5 
Q.5] Write a JAVA program to perform String operations using String/ String Buffer class. 
a) Write a program that reads a word and then prints the first character, the last character, and the 
characters in the middle. For example, if the input is GCOEN, the program prints G N COE. 
b) Write a program that reads a name (such as Ranbir Rishi Kapoor) and then prints a monogram consisting 
of the initial letters of the first, middle, and last name (such as RRK). 
Code:- */

import java.util.Scanner; 
public class Practical_5 { 
 public static void main(String[] args) { 
 try (Scanner sc = new Scanner(System.in)) {
    // A PART 
     System.out.println("1st part" + '\n'); 
     System.out.println("Enter a string: "); 
     String str = sc.nextLine(); 
     System.out.println(str.charAt(0) + " " + 
    str.charAt(str.length() -1) + " " + str.substring(1,str.length() -1)); 
     // B PART 
     System.out.println('\n' + "2nd part" + '\n'); 
     System.out.println("Enter a full name: "); 
     String name = sc.nextLine(); 
     String b[] = name.split(" "); 
     for (String a : b) { 
     System.out.print(a.charAt(0) + " "); 
     }
} 
 } 
}