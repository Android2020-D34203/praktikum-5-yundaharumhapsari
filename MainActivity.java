package id.ac.id.telkomuniversity.tass.praktikum5;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainActivity extends Activity {
    Button button1, button2;
    EditText edit1, edit2;
    TextView txt1;
    int counter = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 =(Button) findViewById(R.id.btnLogin);
        button2 =(Button) findViewById(R.id.btnForgetPass);
        edit1 =(EditText) findViewById(R.id.editUser);
        edit2 =(EditText) findViewById(R.id.editPass);
        txt1 =(TextView) findViewById(R.id.textView2);
        txt1.setVisibility(View.GONE);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit1.getText().toString().equals("admin") &&
                        edit2.getText().toString().equals("admin123"))
                    Toast.makeText(getApplicationContext(), "Login Berhasil", Toast.LENGTH_SHORT).show();
                else {
                    Toast.makeText(getApplicationContext(), "Username atau Password Anda Salah",
                            Toast.LENGTH_SHORT).show();
                    txt1.setVisibility(View.VISIBLE);
                    txt1.setBackgroundColor(Color.RED);
                    counter--;
                    txt1.setText(Integer.toString(counter));
                    if (counter == 0) {
                        button1.setEnabled(false);
                    }
                }
            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}