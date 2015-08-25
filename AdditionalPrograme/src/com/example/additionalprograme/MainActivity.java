package com.example.additionalprograme;


import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	Button totlaButton,minusButton;
	EditText fistnumber, secondNumber;
	TextView totalText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		totlaButton = (Button) findViewById(R.id.button1);
		fistnumber = (EditText) findViewById(R.id.editText1);
		secondNumber = (EditText) findViewById(R.id.editText1);
		totalText = (TextView) findViewById(R.id.textView1);
		minusButton=(Button)findViewById(R.id.button2);
		minusButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
<<<<<<< HEAD
				String v1 = fistnumber.getText().toString().trim();
				String V2 = secondNumber.getText().toString().trim();
				if (!v1.equals("") && !V2.equals("")) {
					minuse(v1, V2);
					// abc
				} else if (!v1.equals("")) {
					// nkjj
            Toast.makeText(getApplicationContext(),"Please Inset vlaue V2", Toast.LENGTH_LONG).show();

				} else {

					// jkjhkjhj
					Toast.makeText(getApplicationContext(),
							"Please Inset vlaue V3", Toast.LENGTH_LONG).show();

				}
=======
				// ading function
>>>>>>> branch 'master' of https://github.com/LilhareAnand/AddtionalExample.git
			}
		});
		totlaButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				String v1 = fistnumber.getText().toString().trim();
				String V2 = secondNumber.getText().toString().trim();
				if (!v1.equals("") && !V2.equals("")) {
					addOperation(v1, V2);
					// abc
				} else if (!v1.equals("")) {
					// nkjj
            Toast.makeText(getApplicationContext(),"Please Inset vlaue V2", Toast.LENGTH_LONG).show();

				} else {

					// jkjhkjhj
					Toast.makeText(getApplicationContext(),
							"Please Inset vlaue V3", Toast.LENGTH_LONG).show();

				}

			}
		});

	}

	protected void minuse(String v1, String v2) {
		// TODO Auto-generated method stub
		try {
			int total = 0;
			total = Integer.parseInt(v1) + Integer.parseInt(v2);
			totalText.setText(String.valueOf(total));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void addOperation(String v1, String v2) {
		// TODO Auto-generated method stub

		try {
			int total = 0;
			total = Integer.parseInt(v1) + Integer.parseInt(v2);
			totalText.setText(String.valueOf(total));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
