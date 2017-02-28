package com.example.patel.myfirstapp;
        import android.os.Bundle;
        import android.app.Activity;
        import android.view.Menu;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick (View v) {
        EditText e1 = (EditText)findViewById(R.id.editText);
        EditText e2 = (EditText)findViewById(R.id.editText);
        TextView t1 = (TextView)findViewById(R.id.textView3);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int sum = num1 + num2;
        t1.setText(Integer.toString(sum));
    }

}
