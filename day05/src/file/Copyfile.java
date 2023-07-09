package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author li
 * @description
 */
public class Copyfile {
    public static void main(String[] args) throws IOException {

        long start= System.currentTimeMillis();

        FileInputStream in=new FileInputStream("C:\\Users\\86185\\Desktop\\开题报告 -19计3李娜.pdf");
        FileOutputStream out=new FileOutputStream("day05/开题报告 -19计3李娜.pdf");

  /*      int by;
        while ((by=in.read())!=-1){
            out.write(by);
        }*/
         byte[] bytes=new byte[8192];
         int len;
         while ((len=in.read(bytes))!=-1){
             out.write(bytes,0,len);
         }

        in.close();
        out.close();

        long end= System.currentTimeMillis();
        System.out.println(end-start);
    }
}
