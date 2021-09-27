package com.accenture.stack;

public class Testert {
public static void main(String[] args) {
int sum = 0;
String test="hello i love java";
String str=test.indexOf('e')+" "+test.indexOf('a')+" "+test.indexOf(' ')+" "+test.indexOf('a');
System.out.println(str);
for(int
i=0;i<str.length();i++){
if(str.charAt(i)!=' ') {
	System.out.println(str.charAt(i));
sum = sum+str.charAt(i);
}
}
System.out.print(sum);
}
}

