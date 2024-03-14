package IOStreams;

// program shows how a input and output streams works 
// here from source 1 text file the content is transfered to source2 file 

import java.io.*;

public class IoStream1 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("source1.txt");
        FileOutputStream fos = new FileOutputStream("source2.txt");

        int b;
        while ((b = fis.read()) != -1) {
            if (b >= 65 && b <= 120)
                fos.write(b + 32);
            else
                fos.write(b);
        }
        fis.close();
        fos.close();
    }
}
