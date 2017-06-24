package br.edu.ifpb.activitys;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import br.edu.ifpb.asynctask.CalcularIMCAsyncTask;
import br.edu.ifpb.calculadoracorporal.R;

public class CalcularIMCActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_calculoimc);

        Button calcularIMCButton = (Button) findViewById(R.id.calcularIMCButton);
        calcularIMCButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        // Calcular o IMC.
    	
        Log.i("NotificationWearApp", "Clique no botão da AsyncTask");

        JSONObject valores = new JSONObject();

        try {
            // Peso
        	
            EditText pesoEditText = (EditText) findViewById(R.id.pesoEditText);
            String peso = pesoEditText.getText().toString();
            valores.put("peso", peso);

            // Altura
            
            EditText alturaEditText = (EditText) findViewById(R.id.alturaEditText);
            String altura = alturaEditText.getText().toString();
            valores.put("altura", altura);

            CalcularIMCAsyncTask calcularIMCAsyncTask = new CalcularIMCAsyncTask(this);
            calcularIMCAsyncTask.execute(valores);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}