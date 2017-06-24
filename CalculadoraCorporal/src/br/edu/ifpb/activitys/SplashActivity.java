package br.edu.ifpb.activitys;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import br.edu.ifpb.asynctask.StatusServer;
import br.edu.ifpb.calculadoracorporal.R;

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

        StatusServer server = new StatusServer(SplashActivity.this);
        server.execute();

    }
    
}
