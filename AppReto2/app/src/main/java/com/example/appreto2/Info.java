package com.example.appreto2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Info extends AppCompatActivity {
    private TextView InfoProduct, textDescriptionInfo, textPriceInfo;
    private ImageView imageInfo;
    private Button btnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        InfoProduct = (TextView) findViewById(R.id.InfoProduct);
        textDescriptionInfo = (TextView) findViewById(R.id.textDescriptionInfo);
        textPriceInfo = (TextView) findViewById(R.id.textPriceInfo);
        imageInfo = (ImageView) findViewById(R.id.imageInfo);
        btnInfo =(Button) findViewById(R.id.btnInfo);

        Intent intent = getIntent();
        InfoProduct.setText(intent.getStringExtra( "name"));
        textDescriptionInfo.setText(intent.getStringExtra( "description"));
        textPriceInfo.setText(intent.getStringExtra( "price"));
        imageInfo.setImageResource(intent.getIntExtra( "image",0));

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Products.class);
                startActivity(intent);

            }
        });



    }
}