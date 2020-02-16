package ml.samiyal.samiyalization;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

	WebView wv;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wv=(WebView) findViewById(R.id.ww);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.loadUrl("http://samiyalization.ml/mob");
        wv.setWebViewClient(new WebViewClient());
    }
    @Override
    public void onBackPressed() {
    	
    	if(wv.canGoBack()) {
    		wv.goBack();
    	}else {
    		super.onBackPressed();
    	}
    }
}
