package org.example;

public class StringtoInteger {


    public static void main(String[] args) {
        String str= "123 ";




      char[]  newArr =str.toCharArray();
       int len=newArr.length;

     int val= StringtoNumber(newArr , len-1 );
        System.out.println(val);


    }

    public static int StringtoNumber(char[] newArr, int len) {

        if(len==0)
        {
            return newArr[len]-'0';

        }

       int ans= StringtoNumber(newArr,len-1);

        int a =newArr[len]-'0';
        return ans*10+a;
    };
}
