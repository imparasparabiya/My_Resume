package com.example.myresume;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    TextView edtcnt, edtmail, edtadd, edtname, edtbirth, edthigh, edtdegree, edtclg, edtpassy, edtpr, edtobj, edts1, edts2, edts3, edth1, edth2, edth3, edtl1, edtl2, edtl3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        edtname = findViewById(R.id.edtname);
        edtbirth = findViewById(R.id.edtbirth);
        edtcnt = findViewById(R.id.edtcnt);
        edtmail = findViewById(R.id.edtmail);
        edtadd = findViewById(R.id.edtadd);
        edtdegree = findViewById(R.id.edtdegree);
        edthigh = findViewById(R.id.edthigh);
        edtclg = findViewById(R.id.edtclg);
        edtpassy = findViewById(R.id.edtpassy);
        edtpr = findViewById(R.id.edtpr);
        edtl1 = findViewById(R.id.edtl1);
        edtl2 = findViewById(R.id.edtl2);
        edtl3 = findViewById(R.id.edtl3);
        edts1 = findViewById(R.id.edts1);
        edts2 = findViewById(R.id.edts2);
        edts3 = findViewById(R.id.edts3);
        edth1 = findViewById(R.id.edth1);
        edth2 = findViewById(R.id.edth2);
        edth3 = findViewById(R.id.edth3);
        edtobj = findViewById(R.id.edtobj);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        String birth = intent.getStringExtra("birth");
        String cnt = intent.getStringExtra("cnt");
        String mail = intent.getStringExtra("mail");
        String add = intent.getStringExtra("add");
        String degree = intent.getStringExtra("degree");
        String high = intent.getStringExtra("high");
        String clg = intent.getStringExtra("clg");
        String passy = intent.getStringExtra("passy");
        String pr = intent.getStringExtra("pr");
        String laun1 = intent.getStringExtra("laun1");
        String laun2 = intent.getStringExtra("laun2");
        String laun3 = intent.getStringExtra("laun3");
        String skill1 = intent.getStringExtra("skill1");
        String skill2 = intent.getStringExtra("skill2");
        String skill3 = intent.getStringExtra("skill3");
        String hobby1 = intent.getStringExtra("hobby1");
        String hobby2 = intent.getStringExtra("hobby2");
        String hobby3 = intent.getStringExtra("hobby3");
        String obj = intent.getStringExtra("obj");

        edtname.setText(name);
        edtbirth.setText(birth);
        edtcnt.setText(cnt);
        edtmail.setText(mail);
        edtadd.setText(add);
        edtdegree.setText(degree);
        edthigh.setText(high);
        edtclg.setText(clg);
        edtpassy.setText(passy);
        edtpr.setText(pr);
        edtl1.setText(laun1);
        edtl2.setText(laun2);
        edtl3.setText(laun3);
        edts1.setText(skill1);
        edts2.setText(skill2);
        edts3.setText(skill3);
        edth1.setText(hobby1);
        edth2.setText(hobby2);
        edth3.setText(hobby3);
        edtobj.setText(obj);
    }
}