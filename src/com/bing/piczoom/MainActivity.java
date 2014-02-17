package com.bing.piczoom;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.view.Menu;

public class MainActivity extends Activity {

	private ZoomImageView zoomImageView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		zoomImageView=(ZoomImageView)findViewById(R.id.zoomImageView1);
		Bitmap bitmap=BingTools.readBitMap(this, R.drawable.ic_launcher);
		
		zoomImageView.setImageBitmap(bitmap);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
