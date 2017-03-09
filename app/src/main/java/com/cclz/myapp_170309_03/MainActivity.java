package com.cclz.myapp_170309_03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView act;
    String str[]={"AAA", "AAB", "ABB", "CCC", "BBC", "BBB"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        act=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String>adapter =new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1,str);

        act.setAdapter(adapter);
        act.setThreshold(1); // 設定幾個字出現 AutoCompleteTextView
    }
}
