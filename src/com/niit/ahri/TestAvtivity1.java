package com.niit.ahri;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class TestAvtivity1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView textview = new TextView(this);
		textview.setText("test2");
		setContentView(textview);
	}

}
