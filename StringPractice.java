public class StringPractice {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
      
        System.out.println("Length of str1: " + str1.length());

        System.out.println("Concatenation: " + str1.concat(" " + str2));

        System.out.println("Uppercase: " + str1.toUpperCase());

        System.out.println("Substring of str2: " + str2.substring(1, 4));

        System.out.println("Are strings equal? " + str1.equals(str2));

        System.out.println("Replace l with x: " + str1.replace('l', 'x'));

        System.out.println("Character at index 1 in str1: " + str1.charAt(1));
    }
}
