package com.google.android.DemoKit;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class BaseActivity extends DemoKitActivity {


	public BaseActivity() {
		super();
	}

	@Override
	public void onDestroy() {
		CommandsController.stop();
		super.onDestroy();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("BaseActivity", "BaseActivity.onCreate");
		if (mAccessory != null) {
			//do something?
		} else {
			//do something?
		}
		Toast.makeText(this, "BaseActivity.onCreate", Toast.LENGTH_SHORT).show();
		CommandsController.activity = this;
		CommandsController.start();
		Toast.makeText(this, "BaseActivity.onCreate.started", Toast.LENGTH_SHORT).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add("Quit");
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getTitle() == "Quit") {
			finish();
			System.exit(0);
		}
		return true;
	}


}