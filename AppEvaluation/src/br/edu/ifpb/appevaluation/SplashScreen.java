package br.edu.ifpb.appevaluation;

import android.app.Activity;
import java.util.Timer;
import java.util.TimerTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import br.edu.ifpb.appevaluation.MainActivity;
import br.edu.ifpb.appevaluation.R;
import br.edu.ifpb.appevaluation.R.layout;

/**
 * Created by Thiago Santos on 26/11/2015.
 */

public class SplashScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);
	new Timer().schedule(new TimerTask(){
		public void run(){
			finish();
			Intent intent = new Intent();
			intent.setClass(SplashScreen.this,MainActivity.class);
			startActivity(intent);
		}
	}, 3500);
	}

    public void run(){
        startActivity(new Intent(SplashScreen.this, MainActivity.class));
        finish();
    }
}
