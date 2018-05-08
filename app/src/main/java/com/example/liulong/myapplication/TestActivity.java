package com.example.liulong.myapplication;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.liulong.myapplication.util.SystemUtil;

public class TestActivity extends AppCompatActivity {


    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        tv = (TextView) findViewById(R.id.test_tv);

//        tv.setText(SystemUtil.getDeviceBrand());


//        maoPao();

//        choice();


//        // 冒泡
//        int [] array={23,67,94,54,71};
//
//        for(int i=0;i<array.length;i++){
//            for (int j=0;j<array.length-1-i;j++){
//                if (array[j]>array[j+1]) {
//                    int temp=array[j];
//                    array[j]=array[j+1];
//                    array[j+1]=temp;
//                }
//            }
//
//
//            for(int z:array){
//                Log.e("tag",z+"");
//            }
//
//            Log.e("tag","******************");
//            Log.e("tag","\n");
//
//        }

        //选择

        int [] array={5,9,0,76,3,43};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                if (array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }


            }

            for (int a:array) {
                Log.e("tag",a+"");
            }

            Log.e("tag","***************");
            Log.e("tag","\n");
        }






    }


    /****
     * 04-18 00:25:13.394 29878-29878/com.example.liulong.myapplication I/System.out: 4,3,2,1,5,
     04-18 00:25:13.394 29878-29878/com.example.liulong.myapplication I/System.out: 3,2,1,4,5,
     04-18 00:25:13.394 29878-29878/com.example.liulong.myapplication I/System.out: 2,1,3,4,5,
     04-18 00:25:13.394 29878-29878/com.example.liulong.myapplication I/System.out: 1,2,3,4,5,
     04-18 00:25:13.394 29878-29878/com.example.liulong.myapplication I/System.out: 1,2,3,4,5,
     */

    //冒泡
    private void maoPao() {

        int[] nums = {5, 4, 3, 2, 1};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            for (int x = 0; x < nums.length; x++) {
                System.out.print(nums[x] + ",");
            }
            System.out.print("\n");
        }

    }

    // 选择

    private void choice() {

        /*****
         * 04-17 23:59:46.357 29199-29199/com.example.liulong.myapplication I/System.out: 5,4,3,2,1,
         04-17 23:59:46.357 29199-29199/com.example.liulong.myapplication I/System.out: 4,5,3,2,1,
         04-17 23:59:46.357 29199-29199/com.example.liulong.myapplication I/System.out: 3,4,5,2,1,
         04-17 23:59:46.357 29199-29199/com.example.liulong.myapplication I/System.out: 2,3,4,5,1,
         04-17 23:59:46.357 29199-29199/com.example.liulong.myapplication I/System.out: 1,2,3,4,5,
         */


        int[] nums = {5, 4, 3, 2, 1};
        Log.e("tag", nums.length + "");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            for (int x = 0; x < nums.length; x++) {
                System.out.print(nums[x] + ",");
            }
            System.out.print("\n");
        }

    }


}
