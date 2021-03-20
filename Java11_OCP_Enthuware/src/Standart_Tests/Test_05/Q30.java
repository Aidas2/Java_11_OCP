package Standart_Tests.Test_05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Q30 {

    //Assume appropriate imports

    public static void copy(String records1, String records2) throws IOException {
        try (
                InputStream is = new FileInputStream(records1);
                OutputStream os = new FileOutputStream(records2);) {
            var buffer = new byte[1024];
            var bytesRead = 0;
            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }

        } catch (FileNotFoundException | java.io.InvalidClassException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
//        copy("c:\\temp\\test1.txt", "c:\\temp\\test2.txt");
        copy("E:\\DEV_Code\\Java11_OCP\\Java11_OCP_Enthuware\\src\\Standart_Tests\\Test_05\\test\\test1.txt",
                "E:\\DEV_Code\\Java11_OCP\\Java11_OCP_Enthuware\\src\\Standart_Tests\\Test_05\\test\\test2.txt");
    }

//    Given that test1.txt exists but test2.txt does not exist, what will happen when the above program is compiled and run?
}
