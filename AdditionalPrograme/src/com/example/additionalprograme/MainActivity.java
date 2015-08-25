package com.example.additionalprograme;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

				String v1=fistnumber.getText().toString().trim();
				String V2=secondNumber.getText().toString().trim();
				if(!v1.equals("")&&!V2.equals(""))
				{
					addOperation(v1,V2);
					//abc
				}
				else if(!v1.equals(""))
				{
					
				
				}
				else
				{
					
				}
				

			}
		});
		
	}

	protected void addOperation(String v1, String v2) {
		// TODO Auto-generated method stub
		
	      try {
			int total=0;
			  total=Integer.parseInt(v1)+Integer.parseInt(v2);
			  totalText.setText(String.valueOf(total));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
		
	}



	
}
