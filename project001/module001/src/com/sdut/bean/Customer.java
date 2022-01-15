package com.sdut.bean;

import java.util.ArrayList;

public class Customer {
    public static void main(String[] args){
       /* System.out.println("helloworld!!!!");
        System.out.println("args = [" + args + "]");
        System.out.println("Customer.main");
        System.out.println("args = " + args);
        ArrayList list = new ArrayList();*/
        /*String[] arr=new String[]{"Tom","Jerry","HanMeiMei","LiLei"};
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);

        }*/

        ArrayList list = new ArrayList();
        list.add(123);

        for (Object o : list) {
            
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list);

        }
        for (int i = list.size() - 1; i >= 0; i--) {

            System.out.println(list);
        }
    }



}
