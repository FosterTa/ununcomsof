package comfostertaununcomsof.github.urbanwarfare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import comfostertaununcomsof.github.urbanwarfare.Google_API.Main;

public class Login extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView email = (TextView) findViewById(R.id.email);
        TextView password = (TextView) findViewById(R.id.password);

        Button register = (Button) findViewById(R.id.register);
        Button login = (Button) findViewById(R.id.login);

        register.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                startActivity(new Intent(Login.this, Register.class));
            }

        });

        login.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                startActivity(new Intent(Login.this, Main.class));
            }

        });
    }



// some more code

    public void myFancyMethod(View v) {
        // does something very interesting
    }
}
