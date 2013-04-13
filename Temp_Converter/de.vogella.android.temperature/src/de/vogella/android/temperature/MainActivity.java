package de.vogella.android.temperature;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
	private EditText editText;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        editText = (EditText)findViewById(R.id.editText1);
    }
    public void onClick(View view)
    {
    	switch (view.getId()) {
		case R.id.button1:
			RadioButton celsiusBtn = (RadioButton) findViewById(R.id.radioButton1);
			RadioButton fehrenheitBtn = (RadioButton) findViewById(R.id.radioButton2);
			
			if(editText.getText().length() == 0)
			{
				Toast.makeText(this, "Please Enter a valid number", Toast.LENGTH_LONG).show();
				return;
			}
			
			float inputValue = Float.parseFloat(editText.getText().toString());
			if(celsiusBtn.isChecked())
			{
				editText.setText(String.valueOf(converFehrenheitToCelcius(inputValue)));
				celsiusBtn.setChecked(false);
				fehrenheitBtn.setChecked(true);
			}
			else
			{
				editText.setText(String.valueOf(converCelsiusToFehrenheit(inputValue)));
				fehrenheitBtn.setChecked(false);
				celsiusBtn.setChecked(true);
			}
			break;
		}
    }
	private float converCelsiusToFehrenheit(float celsius) 
	{

		return ((celsius*9/5)+32);
	}
	private float converFehrenheitToCelcius(float fehrenheit) 
	{
		
		return ((fehrenheit-32)*5/9);
	}
    
}