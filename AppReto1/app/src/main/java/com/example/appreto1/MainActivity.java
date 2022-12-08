package com.example.appreto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button btnOk;
private TextView textName, textLastName, textRegis, textDocument;
private EditText editName, editLastName, editDocument;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOk = (Button) findViewById(R.id.btnOk);
        textName = (TextView) findViewById(R.id.textName);
        textLastName = (TextView) findViewById(R.id.textLastName);
        textRegis = (TextView) findViewById(R.id.textRegis);
        textDocument = (TextView) findViewById(R.id.textDocument);

        editName = (EditText)  findViewById(R.id.editName);
        editLastName = (EditText)  findViewById(R.id.editLastName);
        editDocument = (EditText) findViewById(R.id.editDocument);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = editName.getText().toString();
                String LastName = editLastName.getText().toString();
                String fullName = name + " "+ LastName;
                textRegis.setText(fullName);

            }
        });
        btnOk.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Intent Intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(Intent);

                return false;
            }
        });
    }
}