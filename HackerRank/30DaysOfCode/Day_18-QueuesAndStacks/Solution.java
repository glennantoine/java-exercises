import java.io.*;
import java.util.*;

public class Solution {

    //****************************
    //ArrayDeque in Java provides a way to apply resizable-array in addition to 
    //the implementation of the Deque interface. It is also known as Array Double 
    //Ended Queue or Array Deck. This is a special kind of array that grows and 
    //allows users to add or remove an element from both the sides of the queue.
    //** 
    //Stack: Use ArrayDeque
    ArrayDeque<Character> dequeAsStack = new ArrayDeque<>();

    //Add characters to stack
    void pushCharacter(char ch) {
        dequeAsStack.push(ch);
    }
    
    //Remove characters from stack
    char popCharacter() {
        return dequeAsStack.pop();
    }
    
    //******************************
    //Queue: Use ArrayDeque
    ArrayDeque<Character> dequeAsQueue = new ArrayDeque<>();
    
    //Add characters to queue
    void enqueueCharacter(char ch) {
        dequeAsQueue.add(ch);
    }

    //Remove characters from queue
    char dequeueCharacter() {
        return dequeAsQueue.remove();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
