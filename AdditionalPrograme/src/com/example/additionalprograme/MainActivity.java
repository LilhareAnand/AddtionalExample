package com.example.additionalprograme;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	Button totlaButton;
	EditText fistnumber,secondNumber;
	TextView totalText;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		totlaButton=(Button)findViewById(R.id.button1);
		fistnumber=(EditText)findViewById(R.id.editText1);
		secondNumber=(EditText)findViewById(R.id.editText1);
		totalText=(TextView)findViewById(R.id.textView1);
		totlaButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int xy=0;
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
}
