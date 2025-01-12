package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String an ="\"Generate a set of 15 mock test questions for an Android developer with 5 years of **Question** experience. Include MCQs, code analysis, and scenario-based questions on topics like Jetpack libraries, Kotlin features, performance optimization, and security practices. Provide answers with explanations.\"\n";
        System.out.println(trim(an));
    }
    public static String trim(String q) {
        // Substring to search for
        String marker = "**Question**";
        int index = q.indexOf(marker); // Find the index of the marker
        if (index != -1) {
            // Return the substring starting after the marker
            return q.substring(index + marker.length()).trim();
        }
        // If the marker is not found, return the original string
        return q;
    }
}
