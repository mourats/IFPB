package projetozxing.ifpb.edu.br.projetozxing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                IntentIntegrator scanIntegrator = new IntentIntegrator(MainActivity.this);
                scanIntegrator.initiateScan();
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        IntentResult scanningResult = IntentIntegrator.parseActivityResult
                (requestCode, resultCode, intent);

        if (scanningResult != null) {
            String conteudo = scanningResult.getContents();

            intent = new Intent(this, ValorQRCode.class);
            intent.putExtra("conteudo", conteudo);
            this.startActivity(intent);
            this.finish();

        }else{
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Não foi lido nenhum dado!", Toast.LENGTH_SHORT);
            toast.show();
        }


    }

}