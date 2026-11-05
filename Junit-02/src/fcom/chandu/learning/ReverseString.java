package fcom.chandu.learning;

public class ReverseString {

public static void main(String[] args) {

    ReverseString obj = new ReverseString();

    String str = "hello";

    String reversed = obj.reverse(str);

    System.out.println("Reversed String: " + reversed);
}

public String reverse(String string) {

    String reversed = new StringBuilder(string).reverse().toString();

    return reversed;
}

}
