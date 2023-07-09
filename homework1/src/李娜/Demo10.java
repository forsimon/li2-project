/**
 * @author li
 * @description
 */
public class Demo10 {
    public static void main(String[] args) {
        //厚度
        double paper=0.104;
        //珠穆朗玛峰(8844.43米=8844430毫米)
        double zf=8844430;
        //折叠次数
        int count=0;
        while (paper<zf){
            paper *=2;
            count++;
        }
        System.out.println(count);
    }
}
