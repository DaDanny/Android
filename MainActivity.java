package com.example.myfirstapp;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private final String TAG = "HelloWorldTest";
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"Debug testing! How cool!");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void onClick(View view){
    	String message = "";
    	RelativeLayout layout = (RelativeLayout) findViewById(R.id.back);
    	Toast.makeText(this, "Button 1 pressed!",Toast.LENGTH_LONG).show();
    	EditText text = (EditText) findViewById(R.id.main_input);
    	message = text.getText().toString();
    	layout.setBackgroundColor(Color.parseColor("#8A8A5C"));
    	
    	if(message.length() != 0){
    		Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    	}
    	else{
    		Toast.makeText(this, "Are you sure you don't want to type anything?", Toast.LENGTH_LONG).show();
    	}
    }
    
}
