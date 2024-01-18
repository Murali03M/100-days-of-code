package org.example;

public class Subsequence {

    public static void main(String[] args) {

        int[] arr ={1,4,5,76,4};
         subsequesnce(arr, 0);
    }


    public static void subsequesnce(int[] arr,int index)
    {

        if(index>=arr.length)
        {
            System.out.println(arr);
            return ;
        }
        
        subsequesnce(arr,index+1 );
        


    }
}
