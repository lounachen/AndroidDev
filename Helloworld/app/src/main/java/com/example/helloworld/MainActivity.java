package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));
        // User can tap a button to change the text color of the label
        findViewById(R.id.txtbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // change the text color of the label
                textView.setTextColor(getResources().getColor(R.color.purple_200));
            }
        });

        findViewById(R.id.bgbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // change the background color
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.frank_orange));
            }
        });

        findViewById(R.id.stringbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // change the text
                textView.setText("Android is Awesome!");
            }
        });
        // User can tap on the bg view to reset all views to default settings
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Reset the text to "Hello from Luna!"
                textView.setText("Hello from Luna!");
                // Reset the color of the text to original color
                // original color: black
                textView.setTextColor(getResources().getColor(R.color.black));
                // Reset the color of the bg to original color
                // original color: baby skin pink
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.baby_skin_pink));
            }
        });
        findViewById(R.id.changecustomtxtbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // change the text view to what's in the edit text view
                String userEnteredText = ((EditText)findViewById(R.id.editTxt)).getText().toString();
                if (userEnteredText.isEmpty()){
                    textView.setText("Enter your own text!");
                }else {
                    textView.setText(userEnteredText);
                }

            }
        });
    }

}