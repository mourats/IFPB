package br.edu.ifpb.appevaluation;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private BancoDeDados BancoDeDados = new BancoDeDados();
    
    private EditText nome_avaliador;
    private EditText titulo;
    private EditText nota;
    private EditText comentarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button avaliar = (Button)findViewById(R.id.button1);
        Button consulta = (Button)findViewById(R.id.button2);


        avaliar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nome_avaliador = (EditText) findViewById(R.id.nome_avaliador);
                titulo = (EditText) findViewById(R.id.titulo_trabalho);
                nota = (EditText) findViewById(R.id.nota);
                comentarios = (EditText) findViewById(R.id.comentarios);

                
                BancoDeDados.setNOME_AVALIADOR(nome_avaliador.getText().toString());
                BancoDeDados.setTITULO_TRABALHO(titulo.getText().toString());
                BancoDeDados.setNOTA(nota.getText().toString());
                BancoDeDados.setCOMENTARIO(comentarios.getText().toString());

                BancoDeDadosDao insercao = new BancoDeDadosDao(MainActivity.this);
                insercao.inserir(BancoDeDados);
                Toast.makeText(MainActivity.this, "Avaliação enviada!" , Toast.LENGTH_SHORT).show();

            }
        });

        consulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                criarNotificacao();
            }
        });


    }

    protected void criarNotificacao()  {

        BancoDeDadosDao bd = new BancoDeDadosDao(MainActivity.this);

        int notificationId = 001;

        NotificationCompat.Builder notificationBuilder =
                new NotificationCompat.Builder(MainActivity.this)
                        .setContentTitle("Avaliações Realizadas: ")
                        .setContentText("Foram feitas "+ bd.buscar()+" avaliações.");

        NotificationManagerCompat notificationManager =
                NotificationManagerCompat.from(MainActivity.this);

        notificationManager.notify(notificationId, notificationBuilder.build());

        }

}
