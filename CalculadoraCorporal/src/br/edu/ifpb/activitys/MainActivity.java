package br.edu.ifpb.activitys;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import br.edu.ifpb.calculadoracorporal.R;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button buttonCalcularIMC = (Button) findViewById(R.id.calcularIMCButton);
		Button buttonCalcularVCT = (Button) findViewById(R.id.calcularVCTButton);
		Button botaoCalcularPA = (Button) findViewById(R.id.calcularPAButton);

		buttonCalcularIMC.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v) {
				calculoIMC();
			}
		});
		buttonCalcularVCT.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v) {
				calculoVCT();
			}
		});
		botaoCalcularPA.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v) {
				calculoPerfil();
			}
		});

	}
	public void calculoIMC (){
		startActivity(new Intent(this, CalcularIMCActivity.class));
	}
	public void calculoVCT (){
		startActivity(new Intent(this, CalcularVCTAcitivity.class));
	}
	public void calculoPerfil(){
		startActivity(new Intent(this, CalcularPAActivity.class));
	}


}