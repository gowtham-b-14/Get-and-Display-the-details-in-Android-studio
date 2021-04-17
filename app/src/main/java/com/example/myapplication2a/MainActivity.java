package com.example.myapplication2a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    TextView nameTxt;
    TextView regTxt;
    TextView deptTxt;
    TextView clgTxt;
    TextView skillsTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameTxt = (TextView)findViewById(R.id.Name);
        regTxt = (TextView)findViewById(R.id.regNo);
        deptTxt = (TextView)findViewById(R.id.dept);
        clgTxt = (TextView)findViewById(R.id.college);
        skillsTxt = (TextView)findViewById(R.id.skills);

    }
    public void btnSubmit(View view) {
        String name = nameTxt.getText().toString();
        String regno = regTxt.getText().toString();
        String dept = deptTxt.getText().toString();
        String clg = clgTxt.getText().toString();
        String skill = skillsTxt.getText().toString();
        if(name.equals("") || regno.equals("") || dept.equals("") || clg.equals("") || skill.equals("")){
            Toast.makeText(this, "Fill the form", Toast.LENGTH_LONG).show();
        }else {
            Intent intent = new Intent(MainActivity.this, MainActivity2a.class);
            intent.putExtra("fname", name);
            intent.putExtra("regNo", regno);
            intent.putExtra("deptName", dept);
            intent.putExtra("clgName", clg);
            intent.putExtra("skills", skill);
            startActivity(intent);
        }
    }
}