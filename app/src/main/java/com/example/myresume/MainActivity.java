package com.example.myresume;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends main_img {

    EditText edtname, edtbirth, edtcnt, edtmail, edtadd, edtdegree, edthigh, edtclg, edtpassy, edtpr, edtl1, edtl2, edtl3, edts1, edts2, edts3, edth1, edth2, edth3, edtobj;

    Button btn;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(view -> {
            String name = edtname.getText().toString();
            String birth = edtbirth.getText().toString();
            String cnt = edtcnt.getText().toString();
            String mail = edtmail.getText().toString();
            String add = edtadd.getText().toString();
            String degree = edtdegree.getText().toString();
            String high = edthigh.getText().toString();
            String clg = edtclg.getText().toString();
            String passy = edtpassy.getText().toString();
            String pr = edtpr.getText().toString();
            String laun1 = edtl1.getText().toString();
            String laun2 = edtl2.getText().toString();
            String laun3 = edtl3.getText().toString();
            String skill1 = edts1.getText().toString();
            String skill2 = edts2.getText().toString();
            String skill3 = edts3.getText().toString();
            String hobby1 = edth1.getText().toString();
            String hobby2 = edth2.getText().toString();
            String hobby3 = edth3.getText().toString();

            Intent intent = new Intent(MainActivity.this, main_img.class);

            intent.putExtra("name", name);
            intent.putExtra("birth", birth);
            intent.putExtra("cnt", cnt);
            intent.putExtra("mail", mail);
            intent.putExtra("add", add);
            intent.putExtra("degree", degree);
            intent.putExtra("high", high);
            intent.putExtra("clg", clg);
            intent.putExtra("passy", passy);
            intent.putExtra("pr", pr);
            intent.putExtra("laun1", laun1);
            intent.putExtra("laun2", laun2);
            intent.putExtra("laun3", laun3);
            intent.putExtra("skill1", skill1);
            intent.putExtra("skill2", skill2);
            intent.putExtra("skill3", skill3);
            intent.putExtra("hobby1", hobby1);
            intent.putExtra("hobby2", hobby2);
            intent.putExtra("hobby3", hobby3);

            startActivity(intent);


        });
    }

}