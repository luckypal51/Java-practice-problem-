package SelectionSort;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int testCases = scanner.nextInt();

                while (testCases-- > 0) {
                    int n = scanner.nextInt();
                    int c = scanner.nextInt();
                    String s = scanner.next();

                    int tot1 = 0;
                    if (s.length() > c) {
                        int x = s.length() - c;
                        n -= x;
                        tot1 = x * c;
                    }

                    for (int i = 0; i < n; i++) {
                        tot1 += i + 1;
                    }

                    int tot2 = 0;
                    Set<Character> uniqueChars = new HashSet<>();
                    for (char ch : s.toCharArray()) {
                        uniqueChars.add(ch);
                    }
                    tot2 = uniqueChars.size() * c;

                    System.out.println(Math.min(tot1, tot2));
                    testCases--;
                }
            }

}
