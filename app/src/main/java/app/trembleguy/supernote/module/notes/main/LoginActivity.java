package app.fadai.supernote.module.notes.main;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import com.app.fadai.supernote.R;

public class LoginActivity extends AppCompatActivity {

    private EditText login_name,
                    login_pwd;

    private Button btn_login,
                    btn_register;

    private CheckBox checkBox;

    private ButtonListener buttonListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }
    private void init() {
        login_name = (EditText) findViewById(R.id.edit_username_login);
        login_pwd = (EditText) findViewById(R.id.edit_pwd_login);
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_register = (Button) findViewById(R.id.btn_register);
        checkBox = (CheckBox) findViewById(R.id.checkbox);
        buttonListener = new ButtonListener();
        btn_login.setOnClickListener(buttonListener);
        btn_register.setOnClickListener(buttonListener);

    }

    class CheckBoxListener implements CompoundButton.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (isChecked) {

                Toast.makeText(LoginActivity.this, "确定记住密码", Toast.LENGTH_LONG).show();
            } else {

                Toast.makeText(LoginActivity.this, "取消记住密码", Toast.LENGTH_LONG).show();
            }
        }
    }
    class ButtonListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_login:
                    check();
                    break;
                case R.id.btn_register:
                    startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
                    break;
            }
        }
    }
    private void check(){
        String str_name = login_name.getText().toString();
        String str_pwd = login_pwd.getText().toString();
        SharedPreferences userSettings= getSharedPreferences("log", 0);
        String log = userSettings.getString(str_name,"");
        System.out.println(log);

        if (userSettings.getString(str_name, "").equals(str_pwd)){
            System.out.println("yes");
            Toast.makeText(LoginActivity.this, "登录成功", Toast.LENGTH_LONG).show();
            startActivity(new Intent(LoginActivity.this, NoteMainActivity.class));
        }else  {
            System.out.println("NO");
            Toast.makeText(LoginActivity.this, "登录失败,密码或账号错误", Toast.LENGTH_LONG).show();
        }
    }
}
