package com.example.myedittextdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText1,editText2;
    private Button addButton,subButton;
    private TextView resultTextView;

    protected void onCreate(Bundle savedInstanceState)
    {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      editText1 = (EditText) findViewById(R.id.edit_text1_id);
        editText2 = (EditText) findViewById(R.id.edit_text2_id);

        addButton = (Button) findViewById(R.id.addButtonId);
        subButton = (Button) findViewById(R.id.subButtonId);

        resultTextView = (TextView) findViewById(R.id.resultTextViewId);

        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        try {
            String number1 = editText1.getText().toString();
            String number2 = editText2.getText().toString();

            // converting into doyble
            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);

            if (v.getId()==R.id.addButtonId){
                double sum = num1 + num2;
                resultTextView.setText("Result:  "+sum);

            } if (v.getId()==R.id.subButtonId){
                double sub = num1 - num2;
                resultTextView.setText("Result:  "+sub);


            }

        }
        catch (Exception e){
            Toast.makeText(MainActivity.this, "Please Enter numbers", Toast.LENGTH_SHORT).show();
        }
        


    }
}
