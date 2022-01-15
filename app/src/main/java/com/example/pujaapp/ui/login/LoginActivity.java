package com.example.pujaapp.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pujaapp.MainActivity;
import com.example.pujaapp.R;
import com.example.pujaapp.db.DBHelper;
import com.example.pujaapp.db.PrefConnect;
import com.example.pujaapp.ui.register.RegisterActivity;
import com.example.pujaapp.utils.Constants;

public class LoginActivity extends AppCompatActivity {
    DBHelper DB;

    private Button btn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        DB=new DBHelper(this);
        EditText username = findViewById(R.id.edt_username);
        EditText password = findViewById(R.id.edt_password);
        btn = findViewById(R.id.login);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=username.getText().toString();
                String pass=password.getText().toString();
                if (user.equals("") || pass.equals("")){
                    Toast.makeText(LoginActivity.this,"please enter the Credentials.",Toast.LENGTH_SHORT).show();
                } else{
                    Boolean result=  DB.checkusernamepassword(user,pass);
                    if (result==true){
                        PrefConnect.writeString(LoginActivity.this, Constants.username,user);
                        PrefConnect.writeBoolean(LoginActivity.this,Constants.IS_LOGIN,true);
                        Intent i=new Intent( getApplicationContext(), MainActivity.class);
                        startActivity(i);
                        finish();
                    }
                    else{
                        Toast.makeText(LoginActivity.this,"Invalid Credentials.",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        findViewById(R.id.btn_register).setOnClickListener(v->{
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);
        });



    }
}
