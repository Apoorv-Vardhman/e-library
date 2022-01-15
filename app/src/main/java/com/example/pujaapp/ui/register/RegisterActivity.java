package com.example.pujaapp.ui.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pujaapp.R;
import com.example.pujaapp.db.DBHelper;
import com.example.pujaapp.ui.login.LoginActivity;

import java.util.regex.Pattern;

public class RegisterActivity extends AppCompatActivity {
    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{6,}$");
    //password must be contain 1 digit, 1 lowercase letter, 1uppercase letter, 1special character and 6 characters
    private EditText username,password,repassword;
    Button signup;
    DBHelper DB;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        repassword=findViewById(R.id.c_password);
        signup=findViewById(R.id.signup);

        DB= new DBHelper(this);

        signup.setOnClickListener(v -> {
            String user= username.getText().toString();
            String pass= password.getText().toString();
            String repass= repassword.getText().toString();

            if(user.equals("") || pass.equals("") || repass.equals(""))
            {
                Toast.makeText(RegisterActivity.this, "All fields Required",Toast.LENGTH_SHORT).show();
            }
            else{
                if(pass.equals(repass) && validatePassword()){
                    Boolean usercheckresult= DB.checkusername(user);
                    if(usercheckresult==false){
                        Boolean regResult = DB.insertData(user,pass);
                        if (regResult==true){
                            Toast.makeText(RegisterActivity.this, "Registration Successfully",Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(getApplicationContext(), LoginActivity.class);
                            startActivity(intent);
                        }else{
                            Toast.makeText( RegisterActivity.this, "Registration failed", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(RegisterActivity.this, "User already Exists.\n please login", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(RegisterActivity.this, "Invalid Password", Toast.LENGTH_SHORT).show();
                }
            }

        });

    }

    private boolean validatePassword() {
        String passwordInput = password.getText().toString().trim();

        if (passwordInput.isEmpty()) {
            password.setError("Field can't be empty");
            return false;
        } else if (!PASSWORD_PATTERN.matcher(passwordInput).matches()) {
            password.setError("Password too weak");
            return false;
        } else {
            password.setError(null);
            return true;
        }

    }
}
