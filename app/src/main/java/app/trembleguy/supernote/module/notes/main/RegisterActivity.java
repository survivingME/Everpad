package app.fadai.supernote.module.notes.main;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.app.fadai.supernote.R;

public class RegisterActivity extends AppCompatActivity {
    private Button btn_back, btn_submit;
    private EditText edit_name,edit_pwd;
    private myButtonListener mbuttonListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btn_back = (Button) findViewById(R.id.btn_back);
        btn_submit = (Button) findViewById(R.id.btn_submit);
        edit_name = (EditText) findViewById(R.id.edit_name_register);
        edit_pwd = (EditText) findViewById(R.id.edit_pwd_register);
        mbuttonListener = new myButtonListener();
        btn_back.setOnClickListener(mbuttonListener);
        btn_submit.setOnClickListener(mbuttonListener);


    }

    class myButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_back:
                    startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                    break;
                case R.id.btn_submit:
                    register();
                    break;
            }
        }

        private void register() {

            String str_name = edit_name.getText().toString();
            String str_pwd = edit_pwd.getText().toString();

            if (str_name.isEmpty() || str_pwd.isEmpty()) {
                if (str_name.isEmpty() && !str_pwd.isEmpty()) {
                    Toast.makeText(RegisterActivity.this,"请输入用户名", Toast.LENGTH_LONG).show();
                } else if (!str_name.isEmpty() && str_pwd.isEmpty()) {
                    Toast.makeText(RegisterActivity.this,"请输入密码", Toast.LENGTH_LONG).show();
                } else if (str_name.isEmpty() && str_pwd.isEmpty()) {
                    Toast.makeText(RegisterActivity.this,"请输入用户名和密码", Toast.LENGTH_LONG).show();
                }
                str_name = edit_name.getText().toString();
                str_pwd = edit_pwd.getText().toString();
            }else {
                SharedPreferences sp = getSharedPreferences("log", 0);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString(str_name, str_pwd);
                editor.putString("current_name", str_name);
                editor.putString("current_pwd", str_pwd);
                System.out.println(sp.getString(str_name, str_pwd));
                System.out.println(str_name + ", " + str_pwd);
                editor.apply();
                editor.commit();
                Toast.makeText(RegisterActivity.this, "注册成功", Toast.LENGTH_LONG).show();
                startActivity(new Intent(RegisterActivity.this, NoteMainActivity.class));
            }
        }
    }
}
