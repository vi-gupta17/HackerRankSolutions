import java.io.*;
import java.util.*;



public class Solution {

    /*
     * Complete the twoStacks function below.
     */
    static int twoStacks(int x, int[] a, int[] b) {
        
        int totalSum = 0;
        int i = 0;
        int j = 0;
        int countToReturn = 0;
        
        while( j < a.length  && (totalSum + a[j]) <=x ){
            totalSum = totalSum + a[j];     
            j++;
        }
        countToReturn = j;
        while( j >= 0 && i < b.length && b[i] < x){
            totalSum = totalSum + b[i];
            while(totalSum > x && (j-1)>=0){
                totalSum = totalSum - a[j-1];
                j--;
            }
            if(countToReturn < (i+j+1) && totalSum > x && j == 0 ){
                break;
            } else if(countToReturn < (i+j+1) && totalSum <= x ){
                countToReturn = i+j+1;
            }
            i++;
        }
        
        
     return countToReturn;
    }

    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(scanner.nextLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            String[] nmx = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nmx[0].trim());

            int m = Integer.parseInt(nmx[1].trim());

            int x = Integer.parseInt(nmx[2].trim());

            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");

            for (int aItr = 0; aItr < n; aItr++) {
                int aItem = Integer.parseInt(aItems[aItr].trim());
                a[aItr] = aItem;
            }

            int[] b = new int[m];

            String[] bItems = scanner.nextLine().split(" ");

            for (int bItr = 0; bItr < m; bItr++) {
                int bItem = Integer.parseInt(bItems[bItr].trim());
                b[bItr] = bItem;
            }

            int result = twoStacks(x, a, b);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}