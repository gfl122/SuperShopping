package cn.edu.jnu.supershopping;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewHelloWorld;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textViewHelloWorld = this.findViewById(R.id.text_view_hello_world);
        if(null!=textViewHelloWorld){
            textViewHelloWorld.setText("test");
        }
        else{
            Log.i("MainActivity","the control is null");
        }
        setContentView(R.layout.activity_main);//这个得在textViewHelloWorld赋值前其才不会是null，否则报错

        textViewHelloWorld = this.findViewById(R.id.text_view_hello_world);
        textViewHelloWorld.setText(R.string.string_test1);

//        String strHelloWorld=textViewHelloWorld.getText().toString();//4
//        Log.i("MainActivity",strHelloWorld);//4
        //textViewHelloWorld.setText("test");//1
        //textViewHelloWorld.setText(R.string.app_name);//2
//        String strHelloWorld2=this.getResources().getText(R.string.string_test1).toString();//3
//        Log.i("MainActivity",strHelloWorld2);//alt+enter添加import  3
//        textViewHelloWorld.setText(strHelloWorld2);//3
    }
}