package com.example.lab119;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button send_button;
    private EditText myText;
    public final static String EXTRA_MESSAGE = "com.example.lab119"; //"il.ac.technion.ee.nssl.example"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        send_button = (Button) findViewById(R.id.button1);
        myText = (EditText) findViewById(R.id.editText1);

        final Intent intent = new Intent(this, DisplayMessageActivity.class);
        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = myText.getText().toString();
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            }
        });

    }
}
