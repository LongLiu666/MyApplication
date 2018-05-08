package com.example.liulong.myapplication;

/**
 * 创建时间：2018/4/18
 * 编写人：liulong
 * 功能作用：
 */

public class Singleton {

    //饿汉式
    private  static Singleton instance=new Singleton();
    public  static Singleton getInstance() {
        return instance;
    }

    //懒汉式
    private static  Singleton instance1=new Singleton();
    public static  Singleton getInstance1(){
        if (instance1 == null) {
            synchronized(Singleton.class){
                if (instance1 == null) {
                    instance1=new Singleton();
                }

            }

        }
        return instance1;

    }


}
