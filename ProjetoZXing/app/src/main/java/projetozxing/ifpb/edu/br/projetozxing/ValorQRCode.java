package projetozxing.ifpb.edu.br.projetozxing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ValorQRCode extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valor_qr);

        TextView conteudoLido = (TextView) findViewById(R.id.textViewValorLido);

        Intent intent = getIntent();

        conteudoLido.setText(("O conteúdo lido foi: "+ (String) intent.getSerializableExtra("conteudo")));
    }
}
