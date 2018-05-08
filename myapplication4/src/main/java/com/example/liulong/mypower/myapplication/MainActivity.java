package com.example.liulong.mypower.myapplication;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.liulong.myapplication.IMyAidlInterface;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private IMyAidlInterface mService;
    private Button btn_bind, btn_get;
    private TextView tv;
    private ServiceConnection connection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {

            Log.e("tag","onServiceConnected");
            mService = IMyAidlInterface.Stub.asInterface(service);
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            mService = null;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        btn_bind = (Button) findViewById(R.id.btn_bind);
        btn_get = (Button) findViewById(R.id.btn_get);
        tv = (TextView) findViewById(R.id.tv);

        btn_bind.setOnClickListener(this);
        btn_get.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_bind:
                Intent intent = new Intent();
//                intent.setAction("com.example.liulong.myapplication.aidl.AdditionService");
//                //从 Android 5.0开始 隐式Intent绑定服务的方式已不能使用,所以这里需要设置Service所在服务端的包名
//                intent.setPackage("com.example.liulong.myapplication.aidl");

                intent.setComponent(new ComponentName("com.example.liulong.myapplication.aidl","com.example.liulong.myapplication.aidl.AdditionService"));
                bindService(intent, connection, Context.BIND_AUTO_CREATE);
                break;
            case R.id.btn_get:
                try {
                    if (mService == null) {
                        Log.e("tag","空的空的");
                    }

                    String str = mService.strValue();
                    tv.setText(str);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (connection != null) {
            unbindService(connection);
        }
    }
}
