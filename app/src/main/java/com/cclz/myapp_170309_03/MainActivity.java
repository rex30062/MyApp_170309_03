package com.cclz.myapp_170309_03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView act;
    ImageView img;
    String str[]={"AAA", "AAB", "ABB", "CCC", "BBC", "BBB"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        act=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        img=(ImageView)findViewById((R.id.imageView));
        ArrayAdapter<String>adapter =new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1,str);
        act.setAdapter(adapter);
        act.setThreshold(1); // 設定幾個字出現 AutoCompleteTextView
    }
    public void click1(View v){
        img.setImageResource(R.drawable.e01);
    }
    public void click2(View v){
        img.setImageResource(R.drawable.e02);
    }
}
