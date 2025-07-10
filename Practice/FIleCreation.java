package Practice;

import java.io.File;

public class FIleCreation {
    public static void main(String[] args) {
        File v = new File("FileManagement.txt");
        System.out.println(v.canWrite());
    }
}
