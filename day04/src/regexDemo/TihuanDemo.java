package regexDemo;

/**
 * @author li
 * @description
 */
public class TihuanDemo {
    public static void main(String[] args) {

        String str = "张三的电话号码是：13877778888，李四的电话号码是：13966669999，王五的电话号码是：18898765432。";

        String regex = "1[3|5-9]\\d{9}";

        String s = str.replaceAll(regex, "****");

        System.out.println(s);

        System.out.println("---------------");
        String ss = "T M  D别送了，你T  MD真是个人才";
        String r ="T\\s*M\\s*D";

        String s1 = ss.replaceAll(r, "#");
        System.out.println(s1);
    }
}
