import java.util.Arrays;
public class varargs{
    public static void main(String[] args){
        multi(new int[]{2, 3, 43, 89, 100,123}, new String[]{"atif","ali","ahmad"});

    }
    static void multi(int[] nums , String[] wor){
        System.out.print(Arrays.toString(nums));
        System.out.println(Arrays.toString(wor));
    }
}