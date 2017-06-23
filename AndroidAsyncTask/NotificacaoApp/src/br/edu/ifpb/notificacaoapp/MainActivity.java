package br.edu.ifpb.notificacaoapp;


import android.app.Activity;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.edu.ifpb.notificacaoapp.R;
import br.edu.ifpb.asynctask.LoginAsyncTask;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button notificacaoButton = (Button)findViewById(R.id.enviarButton);
        notificacaoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("NotificationWearApp", "Clique no bot√£o da Notifica√ß√£o");
                int notificationId = 001;

                NotificationCompat.Builder notificationBuilder =
                        new NotificationCompat.Builder(MainActivity.this)
                                .setSmallIcon(R.drawable.ic_launcher)
                                .setContentTitle("Title")
                                .setContentText("Android Wear Notification");

                NotificationManagerCompat notificationManager =
                        NotificationManagerCompat.from(MainActivity.this);

                notificationManager.notify(notificationId, notificationBuilder.build());

                Uri som = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION); //sonzinho (musiquinha) de notificaÁao do smartphone
                Ringtone toque = RingtoneManager.getRingtone(v.getContext(), som); //toque
                toque.play();
            }
        });

        Button asyncTaskButton = (Button)findViewById(R.id.enviarButton);
        asyncTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("NotificationWearApp", "Clique no bot„o da AsyncTask");

                EditText nomeEditText = (EditText) findViewById(R.id.nomeEditText);
                String nome = nomeEditText.getText().toString();

                LoginAsyncTask loginAsyncTask = new LoginAsyncTask(v.getContext());
                String[] valores = {nome};

                loginAsyncTask.execute(valores);
            }
        });
    }
}
