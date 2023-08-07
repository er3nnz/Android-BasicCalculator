package com.erenaksu.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1;
    EditText number2;
    TextView sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1=findViewById(R.id.editTextText);
        number2=findViewById(R.id.editTextText2);
        sonuc=findViewById(R.id.textView);
    }

    public void toplama(View view){
       int sayi1=Integer.parseInt(number1.getText().toString());
       int sayi2=Integer.parseInt(number2.getText().toString());
       int result=sayi1+sayi2;
       sonuc.setText("Result:"+result);
    }
    public void cikarma(View view){
      int sayi1=Integer.parseInt(number1.getText().toString());
      int sayi2=Integer.parseInt(number2.getText().toString());
      int result=sayi1-sayi2;
      sonuc.setText("Result:"+result);
    }
    public void carpma(View view){
      int sayi1=Integer.parseInt(number1.getText().toString());
      int sayi2=Integer.parseInt(number2.getText().toString());
      int result=sayi1*sayi2;
      sonuc.setText("Result:"+result);
    }
    public void bolme(View view){
       int sayi1=Integer.parseInt(number1.getText().toString());
       int sayi2=Integer.parseInt(number2.getText().toString());
       int result=sayi1/sayi2;
       sonuc.setText("Result:"+result);
    }
}