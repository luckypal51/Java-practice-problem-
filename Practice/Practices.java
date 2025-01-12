package Practice;

public class Practices {
    
        public static void main(String[] args) {
            String str1 = "ABABAB";
            String str2 = "ABAB";
    
            System.out.println(gcdOfStrings(str1, str2)); // Output: "ABC"
        }
    
        public static String gcdOfStrings(String str1, String str2) {
            // If concatenating in different orders doesn't result in the same string, there's no common divisor
            if (!(str1 + str2).equals(str2 + str1)) {
                return "";
            }
    
            // Compute the GCD of the lengths of the two strings
            int gcdLength = gcd(str1.length(), str2.length());
    
            // Return the substring of length gcdLength from str1
            return str1.substring(0, gcdLength);
        }
    
        // Helper method to calculate GCD using the Euclidean algorithm
        private static int gcd(int a, int b) {
            System.out.println(a);
            System.out.println(b);
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
                System.out.println(a);
                System.out.println(b);
            }
            System.out.println(a);
            return a;
        }
    }
    

