package br.edu.ifpb.listeners;

import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import br.edu.ifpb.asynctask.CalcularIMCAsyncTask;
import br.edu.ifpb.calculadoracorporal.R;

public class CalcularIMCListener implements View.OnClickListener {
	@Override
    public void onClick(View v) {

        // Calcular o IMC.
        Log.i("NotificationWearApp", "Clique no botão da AsyncTask");

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

            CalcularIMCAsyncTask calcularIMCAsyncTask = new CalcularIMCAsyncTask(v.getContext());
            calcularIMCAsyncTask.execute(valores);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
