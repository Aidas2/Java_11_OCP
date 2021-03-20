package Standart_Tests.Test_05;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Paths;

public class Q42 {
    public static void main(String[] args) throws Exception {
//        Consider the directory structure and its contents shown in the figure.
//        (c:\temp is a directory that contains two text files - test1.txt and text2.txt)
//
//        What should be inserted at //Line 10 in the following code so that it will write "hello" to text2.txt?
        writeData();
    }
        public static void writeData() throws Exception{
            var p1 = Paths.get("E:\\DEV_Code\\Java11_OCP\\Java11_OCP_Enthuware\\src\\Standart_Tests\\Test_05\\test\\test1.txt");
            var p2 =  p1.resolveSibling("text2.txt");
            var bw = new BufferedWriter(new FileWriter(p2.toFile()));
            bw.write("hello");
            bw.close();
        }
}
