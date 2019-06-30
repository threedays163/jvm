package jvm;

import java.util.ArrayList;
import java.util.List;

public class RuntimeConstantPoolOOM {

    //这段代码在1.7版本的jvm上会一直运行下去
    /*public static void main(String[] args){
        List<String> list=new ArrayList<String>();

        int i=0;

        while(true){
            list.add(String.valueOf(i++).intern());
        }
    }*/

    public static void main(String[] args) {
        String str1=new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern()==str1);

        String str2=new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern()==str2);

        String str3=new StringBuilder("ja").append("va1").toString();
        System.out.println(str3.intern()==str3);


        String str4=new StringBuilder("ja").append("va1").toString();
        System.out.println(str4.intern()==str4);
    }
}
