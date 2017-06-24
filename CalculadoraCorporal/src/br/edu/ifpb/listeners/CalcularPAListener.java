package br.edu.ifpb.listeners;

import org.json.JSONException;
import org.json.JSONObject;

import android.view.View;
import android.widget.EditText;
import br.edu.ifpb.asynctask.CalcularPAAsyncTask;
import br.edu.ifpb.calculadoracorporal.R;

public class CalcularPAListener implements View.OnClickListener {
	@Override
    public void onClick(View v) {

    	
        JSONObject valores = new JSONObject();

        try {
            // Peso
            EditText pesoEditText = (EditText) v.findViewById(R.id.pesoEditTextPA);
            String peso = pesoEditText.getText().toString();
            valores.put("peso", peso);

            // Altura
            EditText alturaEditText = (EditText) v.findViewById(R.id.alturaEditTextPA);
            String altura = alturaEditText.getText().toString();
            valores.put("altura", altura);

            //Entrevistado
            JSONObject entrevistado = new JSONObject();

            //Sexo do Entrevistado
            
            EditText sexoEditText = (EditText) v.findViewById(R.id.sexoEditText);
            String sexo = sexoEditText.getText().toString();
            valores.put("sexo", sexo);

            //Data de Nascimento
            EditText dataNascimentoEditTextPerfilAntropometrico = (EditText) v.findViewById(R.id.dataNascimentoEditTextPA);
            String dataNascimento = dataNascimentoEditTextPerfilAntropometrico.getText().toString();
            entrevistado.put("dataNascimento", dataNascimento);

            valores.put("entrevistado", entrevistado);
            //Colocando os dados de valores para o AsyncTask

            CalcularPAAsyncTask calcularPAAsyncTask = new CalcularPAAsyncTask(v.getContext());
            calcularPAAsyncTask.execute(valores);

        } catch (JSONException e) {
            e.printStackTrace();
        }
	}

}
