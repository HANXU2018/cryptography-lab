package cn.hanxu51.code;




import java.util.*;


public class main {

    public static void main(String[] args) {
        String str;
        //Scanner sr = new Scanner(System.in);
        //str = sr.nextLine();
        str = "MING CHEN WU DAIN FA DONG FAN GONG";
        System.out.println("原文=》" + str );
        //str.replaceAll(" ","");
        str.replace(" ", "");
        System.out.println(str);

        for (int i = str.length()-1 ; i>=0; i--){

            System.out.print(str.charAt(i));
        }

        String str0 = "  Ji  m m    y";
        String str1 = str.replaceAll("\\s*", "");
        String str2 = str.replaceAll(" +","");
       // String str3 = StringUtils.deleteWhitespace(str0);
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        //System.out.println("str3 = " + str3);
        Integer integer = new Integer();


    }
}

 class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array.length<2){
            return;
        }
        int temp = array[0];
        for(int i=1;i<array.length;i++){
            temp ^= array[i];
        }
        int count = 0;
        int tt = temp;
        while((temp >> ++count & 1)==0 );
        num1[0]=0;
        num2[0]=0;
        for(int num : array){
            int t = num>>count;
            if((t&1)==1){
                num1[0] ^= num;
            }
        }
        num2[0] = num1[0]^tt;

    }
}