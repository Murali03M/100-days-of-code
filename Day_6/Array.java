import java.util.Arrays;
  
public class Array {
    public static void main(String[] args)
    {
        int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
  
        Arrays.sort(arr);
  
        System.out.printf("Modified arr[] : %s",
                          Arrays.toString(arr));
    }
}