import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 12/16/11
 */
public class Problem24 {
    private static ArrayList<String> lexicographicPermutations  = new ArrayList<String>();

    public static void main(String[] args) {
        System.out.println("Result is : " + Solution1());
    }

    private static String Solution1() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        permutation(numbers, "");
        return lexicographicPermutations.get(999999);
    }

    private static void permutation(ArrayList<Integer> numbers, String num){
        if(numbers.isEmpty()){
            lexicographicPermutations.add(num);
        }
        for(int number : numbers){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp.addAll(numbers);
            temp.remove(new Integer(number));
            permutation(temp, num + number);
        }
    }
}
