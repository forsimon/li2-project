package com.li;

public class HomeWork2 {
    public static void main(String[] args) {
        int shu=0;
        for (int x=1;x<=9;x++){
            for (int y=1;y<=9;y++){
                for(int z=1;z<=9;z++){
                    int sum;

                    sum=x*x*x+y*y*y+z*z*z;
                    if(sum<=999&&sum>=100){
                        shu++;
                        System.out.println(sum);

                    }

                }
            }
        }
        System.out.println(shu);
    }
}
