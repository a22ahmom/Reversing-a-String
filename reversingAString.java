import java.util.Scanner;

public class reversingAString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        System.out.println("Reversed string is: " + sb.toString());
        sc.close();

        /* 1. Reverse a String using Static method */
        // reversingAString rev = new reversingAString();
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a string to reverse: ");
        // String input = sc.nextLine();
        // System.out.println("Reversed string is: " + rev.reverse(input));
        // sc.close();

        /* 2. Reverse a String using array */
        // String str;
        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter a string to reverse: ");
        // str = scan.nextLine();
        // char[] arr = str.toCharArray();
        // System.out.print("Reversed string is: ");
        // int j = arr.length;
        // for(int i = j; i > 0; i--){
        //     System.out.print(arr[i-1]);
        // }

        /* 3. Reverse a String using recursion */
        // reversingAString rev = new reversingAString();
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a string to reverse: ");
        // String input = sc.nextLine();
        // System.out.println("Reversed string is: " + rev.reverse(input));
        // sc.close();

        /* 4. Reverse a String using while loop */
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a string to reverse: ");
        // String input = sc.nextLine();
        // System.out.print("Reversed of string " + input + " is ");
        // sc.close();
        // int i = input.length();

        // while(i > 0){
        //     System.out.print(input.charAt(i-1));
        //     i--;
        // }

        /* 5. Reverse a String using for loop */
        // String str;
        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter a string to reverse: ");
        // str = scan.nextLine();
        // System.out.print("The reverse of string " + str + " is: ");

        // for(int i = str.length(); i > 0; i--){
        //     System.out.print(str.charAt(i-1));
        // }

        /* 6. Reverse a String using StringBuffer */
    //     String str;
    //     String word = "";
    //     Scanner scan = new Scanner(System.in);
    //     System.out.print("Enter a string: ");
    //     str = scan.nextLine();
    //     scan.close();
    //     char[] arr = str.toCharArray();
    //     for(int i = 0; i < (arr.length); i++){
    //         if(arr[i] != ' '){
    //             word = word + arr[i];
    //         } else {
    //             for(int j = word.length(); j > 0; j--){
    //                 System.out.print(word.charAt(j-1));
    //             }
    //             System.out.print(" ");
    //             word = "";
    //         }
    //     }
    //     for(int j = word.length(); j > 0; j--){
    //         System.out.print(word.charAt(j-1));
    //     }

    }

    /* Belongs to 1 */
    // static String reverse(String s){
    //     String rev = "";
    //     for(int i = s.length(); i > 0; i--){
    //         rev += s.charAt(i-1);
    //     }
    //     return rev;
    // }

    /* Belongs to 3 */
    // String reverse(String s){
    //     if(s.length() == 0)
    //         return " ";
    //     return s.charAt(s.length()-1) + reverse(s.substring(0, s.length()-1));
    // }
}