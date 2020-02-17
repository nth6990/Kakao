package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText editID;
    private EditText editPW;
    public String myID = "hoon";
    public String myPW = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editID = findViewById(R.id.editID);
        editPW = findViewById(R.id.editPW);

        Button btn= findViewById(R.id.btnLogin);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = editID.getText().toString();
                String pw = editPW.getText().toString();
                if(id.equals(myID) && pw.equals(myPW)){
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    intent.putExtra("id", id);
                    intent.putExtra("pw", pw);
                    startActivity(intent);
                } else{
                    Toast.makeText(getApplicationContext(), "id or pw is wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
