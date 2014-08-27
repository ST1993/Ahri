package com.niit.ahri;

import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {
	private TabHost mHost;
	private LayoutInflater infalter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main_tab);
		infalter = LayoutInflater.from(this);
		mHost = (TabHost) findViewById(android.R.id.tabhost);
		mHost.addTab(getAhri());
		mHost.addTab(getNewBook());
		mHost.setCurrentTabByTag("newahri");
	}

	private TabSpec getAhri() {
		TabSpec spec = mHost.newTabSpec("newahri");
		Intent intent = new Intent(this, MyAhriAvtivity.class);
		spec.setContent(intent);
		// Drawable icon = getResources().getDrawable(R.drawable.ic_launcher);
		spec.setIndicator(getIndView("个人中心", R.drawable.tab_main_nav_me));
		return spec;

	}

	private TabSpec getNewBook() {
		TabSpec spec = mHost.newTabSpec("newbook");
		Intent intent = new Intent(this, TestAvtivity1.class);
		spec.setContent(intent);
		spec.setIndicator(getIndView("阿狸书城", R.drawable.tab_main_nav_book));
		return spec;
	}

	private View getIndView(String name, int iconid) {
		View view = infalter.inflate(R.layout.tab_main_nav, null);
		ImageView igview = (ImageView) view.findViewById(R.id.ivIcon);
		TextView tvTitle = (TextView) view.findViewById(R.id.tvTitle);
		igview.setImageResource(iconid);
		tvTitle.setText(name);
		return view;

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
