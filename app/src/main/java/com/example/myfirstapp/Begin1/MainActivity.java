package com.example.myfirstapp.Begin1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myfirstapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    //this is what we see when we click the button
    //this is register onClick method from main.xml
    public void onBtnClick (View view) {
        //access to text view
        //find view id is used to find the text view
        //txtMessage used here matches the id box
//        TextView textView = findViewById(R.id.txtMessage);
        //makes edit text box work
        TextView textView1 = findViewById(R.id.edtTxtFName);
        TextView textView2 = findViewById(R.id.editTxtLastName);
        TextView textView3 = findViewById(R.id.editTxtEmail);

        //makes edit text box work
        EditText editTextFName = findViewById(R.id.edtTxtFName);
        EditText editTextLName = findViewById(R.id.editTxtLastName);
        EditText editTextEmail = findViewById(R.id.editTxtEmail);
        //to change the view of text
//        textView.setText("Hello "+editText.getText().toString());
        textView1.setText("First Name " +editTextFName.getText().toString());

        textView2.setText("Last Name " +editTextLName.getText().toString());


        textView3.setText("Email: "+editTextEmail.getText().toString());

        //toString method converts whatever is in the text box to a text in java file







    }

}