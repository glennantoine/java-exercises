package SimpleArraySum;

import java.io.*;
import java.util.*;

public class SimpleArraySum {

    //Simple Array Sum method
    static int simpleArraySum(int[] ar) {
        int total = 0;
        for(int a = 0; a < ar.length; a++){
            total += ar[a];
        }
        return total;
    }

    public static void main(String[] args) throws IOException {

        // Input file for program args
        File SAInput = new File("/Users/glenn/Projects/HackerRank/src/SimpleArraySum/SimpleArraySum.txt");
        Scanner scanner = new Scanner(SAInput);

        // Output file for results
        File SAOutput = new File("/Users/glenn/Projects/HackerRank/src/SimpleArraySum/SimpleArraySumOut.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(SAOutput));


        //Read input for array size
        int arCount = Integer.parseInt(scanner.nextLine().trim());
        int[] ar = new int[arCount];

        //Read input array
        String[] arItems = scanner.nextLine().split(" ");
        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = simpleArraySum(ar);

        //Terminal output of result
        System.out.println(result);

        //Write results to output file
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
}
