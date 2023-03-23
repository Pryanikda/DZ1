package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.counter.R;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    final static String countVariableKey = "COUNT";

     private TextView textView;
     private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView2);

        button.setOnClickListener(listener);
    }

         private View.OnClickListener listener = new View.OnClickListener(){
   @Override
           public void onClick(View view){
       count++;
       textView.setText(Integer.toString(count));
    }


   };



    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt(countVariableKey, count);
        super.onSaveInstanceState(outState);
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        count = savedInstanceState.getInt(countVariableKey);

    }


    @Override
    protected void onStart() {
        Toast toast = Toast.makeText(getApplicationContext(),"onStart()", Toast.LENGTH_SHORT);
        toast.show();
        super.onStart();

    }

    @Override
    protected void onStop() {
        Toast toast = Toast.makeText(getApplicationContext(),"onStop()", Toast.LENGTH_SHORT);
        toast.show();
        super.onStop();

    }



        @Override
    protected void onDestroy() {
        Toast toast = Toast.makeText(getApplicationContext(),"onDestroy()", Toast.LENGTH_SHORT);
        toast.show();
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Toast toast = Toast.makeText(getApplicationContext(),"onPause()", Toast.LENGTH_SHORT);
        toast.show();
        super.onPause();

    }

    @Override
    protected void onResume() {
        Toast toast = Toast.makeText(getApplicationContext(),"onResume()", Toast.LENGTH_SHORT);
        toast.show();
        super.onResume();
        textView.setText(Integer.toString(count));
    }
}