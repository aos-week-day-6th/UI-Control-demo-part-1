package com.example.admin.ui_control_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ChooseSubjectActivity extends AppCompatActivity {

    TextView result;
    List<String> subjects=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_subject);

        result=findViewById(R.id.result);

    }

    void onCheckBox(View view){
        CheckBox checkBox= (CheckBox) view;
        boolean isChecked=checkBox.isChecked();

        if(isChecked){
            subjects.add(checkBox.getText().toString());
            Toast.makeText(this, checkBox.getText().toString() + "checked", Toast.LENGTH_SHORT).show();
        }else{
            subjects.remove(checkBox.getText().toString());
            Toast.makeText(this, checkBox.getText().toString() + "unchecked", Toast.LENGTH_SHORT).show();
        }

        result.setText(subjects.toString());
    }
}
