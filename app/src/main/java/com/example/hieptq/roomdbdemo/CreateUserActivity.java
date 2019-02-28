package com.example.hieptq.roomdbdemo;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateUserActivity extends AppCompatActivity {

    private EditText etFisrtName, etLastName, etEmail;
    private Button btnCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);
        etFisrtName = findViewById(R.id.edFirstName);
        etLastName = findViewById(R.id.edLastName);
        etEmail = findViewById(R.id.edEmail);
        btnCreate = findViewById(R.id.btnCreate);

        final AppDatabase appDatabase = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "production").allowMainThreadQueries().build();
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appDatabase.userDAO().insertAll(new User(etFisrtName.getText().toString(), etLastName.getText().toString(), etEmail.getText().toString()));
                startActivity(new Intent(CreateUserActivity.this, MainActivity.class));
            }
        });


    }
}
