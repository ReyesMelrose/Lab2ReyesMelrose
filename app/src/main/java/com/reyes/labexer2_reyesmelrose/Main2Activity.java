package com.reyes.labexer2_reyesmelrose;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText etinput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        etinput = findViewById(R.id.editText9);
    }

    public void validate(View v){
        SharedPreferences sp = getSharedPreferences("myData", MODE_PRIVATE);
        String course1SP = sp.getString("course1", null);
        String course2SP = sp.getString("course2", null);
        String course3SP = sp.getString("course3", null);
        String course4SP = sp.getString("course4", null);
        String course5SP = sp.getString("course5", null);
        String course6SP = sp.getString("course6", null);
        String course7SP = sp.getString("course7", null);
        String course8SP = sp.getString("course8", null);
        String course = etinput.getText().toString();

        if(course.equals(course1SP) || course.equals(course2SP) || course.equals(course3SP) || course.equals(course4SP) ||
                course.equals(course5SP) || course.equals(course6SP) || course.equals(course7SP) || course.equals(course8SP)) {
            Toast.makeText(this, "course is available in UST...", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "course not available in UST...", Toast.LENGTH_LONG).show();
        }
    }

    public void previous(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
