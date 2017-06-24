package br.edu.ifpb.activitys;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;
import br.edu.ifpb.edittextlistenerapp.R;
import br.edu.ifpb.asynctask.BuscarNomeAsyncTask;
import br.edu.ifpb.asynctask.BuscarNomeCallBack;

@SuppressLint("ShowToast")
public class BuscarNomeActivity extends Activity implements TextWatcher, BuscarNomeCallBack {


    private EditText nomeEditText;
    List<String> nomes;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Inicialização da activity e definição do layout.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_nome);

        // Recuperando o EditText e
        nomeEditText = (EditText) findViewById(R.id.nomeEditText);
        nomeEditText.addTextChangedListener(this);

        ListView nomesListView = (ListView) findViewById(R.id.nomesListView);
        nomes = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                nomes);

        nomesListView.setAdapter(adapter);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {
        
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
        String nome = charSequence.toString();

        try {
        
                // JSON
                JSONObject json = new JSONObject();
                json.put("fullName", nome);

                BuscarNomeAsyncTask buscarNomeAsyncTask = new BuscarNomeAsyncTask(this);
                buscarNomeAsyncTask.execute(json);

        } catch (JSONException e) {
            Log.e("EditTextListener", e.getMessage());
        }
    }

    @Override
    public void afterTextChanged(Editable editable) {
        
    }

    @Override
    public void backBuscarNome(List<String> names) {
        nomes.clear();
        nomes.addAll(names);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void errorBuscarNome(String error) {
        Toast.makeText(this, error, Toast.LENGTH_LONG);
    }
}
