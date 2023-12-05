package com.example.myresume;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class main_img extends AppCompatActivity {
    ImageView img1, img2, img3, img4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_img);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);

        String name = getIntent().getStringExtra("name");
        String birth = getIntent().getStringExtra("birth");
        String cnt = getIntent().getStringExtra("cnt");
        String mail = getIntent().getStringExtra("mail");
        String add = getIntent().getStringExtra("add");
        String degree = getIntent().getStringExtra("degree");
        String high = getIntent().getStringExtra("high");
        String clg = getIntent().getStringExtra("clg");
        String passy = getIntent().getStringExtra("passy");
        String pr = getIntent().getStringExtra("pr");
        String laun1 = getIntent().getStringExtra("laun1");
        String laun2 = getIntent().getStringExtra("laun2");
        String laun3 = getIntent().getStringExtra("laun3");
        String skill1 = getIntent().getStringExtra("skill1");
        String skill2 = getIntent().getStringExtra("skill2");
        String skill3 = getIntent().getStringExtra("skill3");
        String hobby1 = getIntent().getStringExtra("hobby1");
        String hobby2 = getIntent().getStringExtra("hobby2");
        String hobby3 = getIntent().getStringExtra("hobby3");
        String obj = getIntent().getStringExtra("obj");

        img1.setOnClickListener(view -> {

            Intent intent = new Intent(main_img.this, img1.class);
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
            intent.putExtra("boj",obj);

            startActivity(intent);


        });

        img2.setOnClickListener(view -> {

            Intent intent = new Intent(main_img.this, SecondActivity.class);
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
            intent.putExtra("boj",obj);

            startActivity(intent);

        });

        img3.setOnClickListener(view -> {

            Intent intent = new Intent(main_img.this, ThirdActivity.class);
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
            intent.putExtra("boj",obj);
            startActivity(intent);

        });

        img4.setOnClickListener(view -> {

            Intent intent = new Intent(main_img.this, FourthActivity.class);
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
            intent.putExtra("boj",obj);

            startActivity(intent);

        });
    }

}