import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'downToZero' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int downToZero(int n) {
      Queue<Integer>q=new LinkedList<>();
      Set<Integer>visited=new HashSet<>();
      int steps=0;
      q.add(n);
      visited.add(n);
      while(!q.isEmpty()){
          int size=q.size();
          for(int i=0;i<size;i++){
              int curr=q.poll();
              if(curr==0){
                  return steps;
              }
              //factor
              for(int j=2;j<=Math.sqrt(curr);j++){
                  if(curr%j==0){
                      int factor=curr/j;
                      if(!visited.contains(factor)){
                          q.add(factor);
                          visited.add(factor);
                      }
                  }
              }
              //subtract
              if(!visited.contains(curr-1)){
                  visited.add(curr-1);
                  q.add(curr-1);
              }
          }
        steps++;
    }
        return -1;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int result = Result.downToZero(n);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
