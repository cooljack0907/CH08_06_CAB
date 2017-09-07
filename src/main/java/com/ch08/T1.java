package com.ch08;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by cooljack on 2017/9/3.
 */
public class T1 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_main);

        Intent intent=this.getIntent();
//        String showtest=intent.getStringExtra("test");
//        Toast.makeText(T1.this,showtest.toString(),Toast.LENGTH_SHORT).show();
    }
}
