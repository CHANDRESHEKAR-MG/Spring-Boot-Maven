package com.chandu.learning;

public class ReverseString2 {

public static void main(String[] args) {

    ReverseString2 obj = new ReverseString2();

    String str = "hello";

    String reversed = obj.reverse(str);

    System.out.println("Reversed String: " + reversed);
}

public String reverse(String string) {

    String reversed = new StringBuilder(string).reverse().toString();

    return reversed;
}

}
