import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 2/9/12
 */
public class Problem42 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Result is : " + Solution1());
        System.out.println("Time = " + (System.currentTimeMillis() - startTime) / 1000.0);
    }

    public static long Solution1() {
        TreeSet<Long> triangleNums = Util.GetTrianglenumbersByCount(1000);
        HashSet<String> triangleWords =  new HashSet<String>();
        FileInputStream fileStream;
        try {
            fileStream = new FileInputStream("resources/words.txt");
            DataInputStream dataStream = new DataInputStream(fileStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dataStream));
            String[] words = bufferedReader.readLine().split(",");
            dataStream.close();

            for(String word : words){
                StringBuilder tempName = new StringBuilder(word);
                tempName.deleteCharAt(0);
                tempName.deleteCharAt(tempName.length()-1);
                long score = 0;
                for(int i=0; i<tempName.length(); i++){
                    //Assuming the names contains only A-Z
                    score = score + (tempName.charAt(i)%'A') + 1;
                }
                if(score > triangleNums.last()){
                    System.out.println(word+"\t"+score);
                }
                if(triangleNums.contains(new Long(score))){
                    triangleWords.add(word);
                }
            }
         } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return triangleWords.size();
    }
}
