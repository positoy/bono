package org.tacademy.web;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText editText1;
	WebView webView1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		editText1 = (EditText) findViewById(R.id.editText1);
		webView1 = (WebView) findViewById(R.id.webView1);
		
		WebSettings settings = webView1.getSettings();
		settings.setJavaScriptEnabled(true);
		
	}
	
	public void onButton1Clicked(View v) {
		String url = editText1.getText().toString();
		Toast.makeText(this, url, Toast.LENGTH_LONG).show();
		
		webView1.loadUrl(url);
	}
	
}
