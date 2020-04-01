package com.hfad.snacksichikaru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int ramen,apple,orange,omelette,tea;
    EditText et;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ramen = apple = orange = omelette =  tea = 0;
        setContentView(R.layout.activity_main);
    }


    public void calories(View view)
    {int calories = 0;
        et = findViewById(R.id.r);
        ramen = Integer.valueOf(et.getText().toString());

        et = findViewById(R.id.a);
        apple = Integer.valueOf(et.getText().toString());

        et = findViewById(R.id.o);
        orange = Integer.valueOf(et.getText().toString());

        et = findViewById(R.id.t);
        tea = Integer.valueOf(et.getText().toString());

        et = findViewById(R.id.om);
        omelette = Integer.valueOf(et.getText().toString());

        calories += ramen*436 + apple*52 + orange*47 + omelette*154 + tea*1;

       toast = Toast.makeText(this,"Your order has "+calories+" calories",Toast.LENGTH_SHORT);
       toast.show();

    }
}
