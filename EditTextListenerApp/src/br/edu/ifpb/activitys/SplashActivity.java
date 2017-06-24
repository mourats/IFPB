package br.edu.ifpb.activitys;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import br.edu.ifpb.edittextlistenerapp.R;
import android.content.Intent;


public class SplashActivity extends Activity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler SplashScreen = new Handler();
        SplashScreen.postDelayed(SplashActivity.this, 3500);
    }

	@Override
	public void run() {
        finish();

        Intent intent = new Intent();
        intent.setClass(SplashActivity.this, BuscarNomeActivity.class);
        startActivity(intent);
    
};
    
}
