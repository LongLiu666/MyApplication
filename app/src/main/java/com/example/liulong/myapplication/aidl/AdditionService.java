package com.example.liulong.myapplication.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.util.Log;

import com.example.liulong.myapplication.IMyAidlInterface;

/**
 * 创建时间：2018/4/18
 * 编写人：liulong
 * 功能作用：
 */

public class AdditionService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {

        Log.e("tag","hahhahhahhahh");
        return new MyBinder();
    }

     public  class MyBinder extends IMyAidlInterface.Stub {


         @Override
         public String strValue() throws RemoteException {
             return "成功成功";
         }
     }


}
