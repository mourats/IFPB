package br.edu.ifpb.activitys;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import br.edu.ifpb.asynctask.LoginAsyncTask;
import br.edu.ifpb.calculadoracorporal.R;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button enviar = (Button) findViewById(R.id.enviarLogin);

        enviar.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        JSONObject valores = new JSONObject();

                        try {

                            EditText loginEditText = (EditText) findViewById(R.id.edit_Text_Login);
                            String login = loginEditText.getText().toString();
                            valores.put("login", login);


                            EditText senhaEditText = (EditText) findViewById(R.id.edit_Text_Senha);
                            String senha = senhaEditText.getText().toString();
                            valores.put("senha", senha);


                            LoginAsyncTask loginAsyncTask = new LoginAsyncTask(LoginActivity.this);
                            loginAsyncTask.execute(valores);

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }
        );
    }

}
