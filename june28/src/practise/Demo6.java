package practise;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author li
 * @description
 */
public class Demo6 {
    public static void main(String[] args) {

/*

        int[] arr1 = {1, 2, 9,2, 3, 3, 3 };
        int[] arr2 = {3, 5,9,2,2,5,9,3};
*/
/*
        int[] arr1 = {1, 2, 2, 3, 3, 3, 9};
        int[] arr2 = {2, 3, 5};*/
        int[] arr1 = {1, 3};
        int[] arr2 = {2, 4, 5};
       Demo6 d6=new Demo6();
       d6.intersection(arr1,arr2);

    }
/*
    private void intersection(int[] num1,int[] num2){
        List<Integer> nums1 = new ArrayList<>();
        List<Integer> nums2 = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <num1.length ; i++) {
            nums1.add(num1[i]);
        }
        for (int i = 0; i <num2.length ; i++) {
            nums2.add(num2[i]);
        }
        for (int i =0 ;i<nums1.size() ;i++){
            for (int j =0 ;j<nums2.size();j++){
                Integer o = nums1.get(i);
                Integer b = nums2.get(j);
                if ( o.equals(b)&&!list.contains(o) ){
                    list.add(o);
                    nums1.remove(nums1.get(i));
                    nums2.remove(nums2.get(j));
                    i--;
                    break;
                }
            }
        }

        System.out.println(list.toString());
    }
*/
        private void intersection(int[] num1,int[] num2){
            Arrays.sort(num1);
            Arrays.sort(num2);
            List<Integer> list=new ArrayList<>();
            int i=0;
            int j=0;
            while (i<num1.length&&j<num2.length){
                if(num1[i]==num2[j]&&!list.contains(num1[i])){
                    list.add(num1[i]);
                }else if (num1[i]>num2[j]){
                    j++;
                }else {
                    i++;
                }
            }
            System.out.println(list.toString());
        }


}
