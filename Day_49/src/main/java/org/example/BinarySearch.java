package org.example;

public class BinarySearch {
    public static void main(String[] args) {


        int[] arr ={2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arr,11));



    }


    static int binarySearch(int[] arr , int target)
    {
        int start=0, end=arr.length-1;
        while(start<=end)
        {
            int mid =start+ (end-start)/2;

            if(arr[mid]==target)
            {
                return mid;
            }

            if(arr[mid]>target)
            {

                end=mid-1;


            }
            else
            {
                start=mid+1;

            }
        }
        return -1;
    }

}
