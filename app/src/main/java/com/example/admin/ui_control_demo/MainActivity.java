package com.example.admin.ui_control_demo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity
implements View.OnClickListener {

    TextView textView;
    ImageButton btnImageButton;
    Button btnLogin;
    ToggleButton btnToggle;
    TextView textColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
        btnImageButton=findViewById(R.id.btnImageButton);
        btnLogin=findViewById(R.id.btnLogin);
        btnToggle=findViewById(R.id.toggleButton);
        textColor=findViewById(R.id.color);

       textViewDemo();



       //register event
        // three types fo subscribe button event
        /**
         * 1.  create anonymous inner class
         * 2 . implement from Interface OnClickListener
         * 3 . use onClick attribute in XML
         */

        //anonymous
        /*btnImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessage("Anonymous Button clicked");
            }
        });*/

        btnImageButton.setOnClickListener(this);
        btnLogin.setOnClickListener(this);

        btnToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    textColor.setBackgroundColor(Color.BLUE);
                }else
                    textColor.setBackgroundColor(Color.RED);
            }
        });

    }

    void showMessage(String smg){
        Toast.makeText(this,smg, Toast.LENGTH_SHORT).show();
    }

    void textViewDemo(){
        String text=getString(R.string.text);
        //textView.setText(text);
        //textView.getText().toString();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnImageButton:
                //code for image button
                showMessage("ImageButton clicked btn Id"+ v.getId());
                break;
            case R.id.btnLogin :
                //code login button
                showMessage("Login clicked btn Id"+ v.getId());
                break;
        }

    }

    void onAttributeClick(View v){
        showMessage("On clicked attribute");
    }
}
