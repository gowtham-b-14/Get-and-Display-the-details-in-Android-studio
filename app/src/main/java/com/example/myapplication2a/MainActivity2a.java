package com.example.myapplication2a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2a extends AppCompatActivity {

    TextView nameTxt;
    TextView regTxt;
    TextView deptTxt;
    TextView clgTxt;
    TextView skillsTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2a);
        nameTxt = (TextView)findViewById(R.id.putName);
        regTxt = (TextView)findViewById(R.id.putReg);
        deptTxt = (TextView)findViewById(R.id.putDept);
        clgTxt = (TextView)findViewById(R.id.putClg);
        skillsTxt = (TextView)findViewById(R.id.putSkills);

        Bundle bundle = getIntent().getExtras();
        String Name = "Name : " + bundle.getString("fname");
        String RegNo = "Reg No. : " + bundle.getString("regNo");
        String Dept = "Department : " + bundle.getString("deptName");
        String ClgName = "College : " + bundle.getString("clgName");
        String Skills = "Skills : " + bundle.getString("skills");

        nameTxt.setText(String.valueOf(Name));
        regTxt.setText(String.valueOf(RegNo));
        deptTxt.setText(String.valueOf(Dept));
        clgTxt.setText(String.valueOf(ClgName));
        skillsTxt.setText(String.valueOf(Skills));
    }
}