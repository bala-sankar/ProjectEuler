import org.omg.CORBA.CharHolder;

import java.io.*;
import java.util.TreeMap;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 12/15/11
 */
public class Problem22 {
    public static void main(String[] args) {
        System.out.println("Result is : " + Solution1());
    }

    private static long Solution1() {
        long OverallScore = 0;
        try{

            FileInputStream fileStream = new FileInputStream("resources/names.txt");
            DataInputStream dataStream = new DataInputStream(fileStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dataStream));
            String[] names = bufferedReader.readLine().split(",");
            dataStream.close();
            TreeMap<String, Integer> nameScores =  new TreeMap<String, Integer>();
            for(String name : names){
                StringBuilder tempName = new StringBuilder(name);
                tempName.deleteCharAt(0);
                tempName.deleteCharAt(tempName.length()-1);
                int score = 0;
                for(int i=0; i<tempName.length(); i++){
                    //Assuming the names contains only A-Z
                    score = score + (tempName.charAt(i)%'A') + 1;
                }
                nameScores.put(tempName.toString(), score);
            }
            int pos = 0;
            for(String name : nameScores.keySet()){
                pos++;
                OverallScore = OverallScore + pos*nameScores.get(name);
            }

        } catch (FileNotFoundException e){
           System.out.println(e.getMessage());
        } catch (IOException e){
           System.out.println(e.getMessage());
        }
        return OverallScore;
    }
}
