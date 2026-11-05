package com.chandu.learning;

import com.chandu.learning.ReverseString3;
public class ReverseString3 {

public static void main(String[] args) {

    ReverseString3 obj = new ReverseString3();

    String str = "hello";

    String reversed = obj.reverse(str);

    System.out.println("Reversed String: " + reversed);
}

public String reverse(String str) {

    char[] charArray = str.toCharArray();

    int left = 0;
    int right = charArray.length - 1;

    while (left < right) {

        // Swap characters
        char temp = charArray[left];

        charArray[left] = charArray[right];

        charArray[right] = temp;

        // Move pointers
        left++;
        right--;
    }

    return new String(charArray);
}

}


