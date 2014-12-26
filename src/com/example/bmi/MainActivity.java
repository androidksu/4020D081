package com.example.bmi;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button showBtn;
	EditText edittext1 , edittext2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		showBtn=(Button)findViewById(R.id.button1);
		edittext1=(EditText)findViewById(R.id.EditText1);
		edittext2=(EditText)findViewById(R.id.EditText2);
				
	}
	
	public void clic(View view) {
		double height = Double.parseDouble(edittext1.getText().toString()) / 100;
		double weight = Double.parseDouble(edittext2.getText().toString());
		double BMI = weight / (height * height);
		
		TextView textView1 = (TextView) findViewById(R.id.textView1);
		textView1.setText(String.valueOf(BMI));
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
