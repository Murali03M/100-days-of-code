package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SumOfAll {


    //find the sum of subset
    public static void main(String[] args) {


        int n = 3;
        ArrayList < Integer > arr = new ArrayList < > ();
        arr.add(5);
        arr.add(2);
        arr.add(1);

        ArrayList<Integer> subofSubsequesnce = new ArrayList<Integer>();
        findSum(n, arr , subofSubsequesnce,0,0 );

        Collections.sort(subofSubsequesnce);

        for(int i=0;i<subofSubsequesnce.size();i++)
        {
            System.out.println(subofSubsequesnce.get(i));
        }





    }




    static void findSum(int n, ArrayList<Integer> arr, ArrayList<Integer> subofSubsequesnce,int sum ,int index) {

         if(index==n)
         {
             subofSubsequesnce.add(sum);
             return ;

         }

        findSum(n,arr,subofSubsequesnce,sum+ arr.get(index),index+1);


        findSum(n,arr,subofSubsequesnce,sum,index+1);





    }


}