package br.edu.ifpb.activitys;


import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import br.edu.ifpb.asynctask.CalcularVCTAsyncTask;
import br.edu.ifpb.calculadoracorporal.R;

public class CalcularVCTAcitivity extends Activity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculovct);

        Button calcularVCTButton = (Button) findViewById(R.id.calcularVCTButton);
        calcularVCTButton.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        RadioGroup NivelEsporte = (RadioGroup) findViewById(R.id.NivelEsporte);

        // Calcular o VCT
        
        Log.i("NotificationWearApp", "Clique no bot√£o da AsyncTask");

        JSONObject valores = new JSONObject();

        try {
            // Peso
            EditText pesoEditText = (EditText) v.findViewById(R.id.pesoEditText);
            String peso = pesoEditText.getText().toString();
            valores.put("peso", peso);

            // Altura
            EditText alturaEditText = (EditText) v.findViewById(R.id.alturaEditText);
            String altura = alturaEditText.getText().toString();
            valores.put("altura", altura);

            //NÌvel do Esporte
            int selectedId = NivelEsporte.getCheckedRadioButtonId();
            NivelEsporte = (RadioGroup) findViewById(selectedId);
            String nivelEsporte = NivelEsporte.toString();

            valores.put("nivelEsporte", nivelEsporte);

            //Entrevistado
            JSONObject entrevistado = new JSONObject();

            //Sexo do Entrevistado
            EditText sexoEditText = (EditText) v.findViewById(R.id.sexoEditText);
            String sexo = sexoEditText.getText().toString();
            valores.put("sexo", sexo);

            //Data de Nascimento
            EditText dataNascimentoEditText = (EditText) v.findViewById(R.id.dataNascimentoEditText);
            String dataNascimento = dataNascimentoEditText.getText().toString();
            entrevistado.put("dataNascimento", dataNascimento);

            valores.put("entrevistado", entrevistado);
            //Colocando os dados de valores para o AsyncTask

            CalcularVCTAsyncTask calcularVCTAsyncTask = new CalcularVCTAsyncTask(this);
            calcularVCTAsyncTask.execute(valores);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}


