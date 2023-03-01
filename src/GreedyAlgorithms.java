import java.lang.reflect.Array;
import java.util.Arrays;


//Вывести самое большое число из предосталвенных чисел
public class GreedyAlgorithms {
    public static void main(String[] args) {
    int digits [] = {3, 1, 7, 9, 9, 5};
        System.out.println(maxNumberFromDigits(digits));
    }

    public static String maxNumberFromDigits (int digits []){
        Arrays.sort(digits);
        String result = "";

        for (int i = digits.length-1; i >=0 ; i--)
            result += digits [i];

        return result;
            
        }
    }

