package file;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author li
 * @description
 */
public class Zifuliu {
    public static void main(String[] args) throws IOException {

        BufferedReader in=new BufferedReader(new FileReader("day05//a.txt"));
        BufferedWriter out=new BufferedWriter(new FileWriter("day05//b.txt"));
        while (true){
            String line = in.readLine();
            if(line==null){
                break;
            }
            String[] s = line.split("\\s+");
            int[] arr=new int[s.length];
            for (int i = 0; i < s.length; i++) {
                arr[i]=Integer.parseInt(s[i]);
            }
            Arrays.sort(arr);
            StringBuilder sb =new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]);
                if(i!=arr.length-1){
                    sb.append(" ");
                }
            }
            out.write(sb.toString());
            out.newLine();

        }
        in.close();
        out.close();
    }
}
