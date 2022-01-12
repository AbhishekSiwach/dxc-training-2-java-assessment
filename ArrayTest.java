import java.util.*;
public class ArrayTest {

    //TASK 1

    public static boolean isUnique(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    array[i] = array[j];
                    array[j] = min;
                    min = array[i];
                }
            }
            
        }
        
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                return false;
            }
        }
        
        return true;
    }

    //TASK 2

    public static boolean isSorted(double[] array) {
        double pre = array[0];
        
        for (int i = 1; i < array.length; i++) {
            double current = array[i];
            if (pre >= current) {
                return false;
            }
            pre = current;
        }
        
        return true;
    }

    public static void main(String[] args){
        int[] ar =  {3, 6, 12, 4, 5, 7, 8, 9, 10, 11};;
        int[] ar2 = {3, 6, 12, 4, 5, 7, 8, 9, 10, 11, 3};
        System.out.println(isUnique(ar));
        System.out.println(isUnique(ar2));

        double[] dr = {16.1, 12.3, 22.2, 14.4};
        double[] dr2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
        System.out.println(isSorted(dr));
        System.out.println(isSorted(dr2));
    }
}