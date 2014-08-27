package com.niit.ahri;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyAhriAvtivity extends Activity {
	private ListView meListview;
	private static final String[] arr = { "我的书籍", "阅读记录", "我的音乐", "我的评论",
			"我的日记", "我的分类" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.myahri);
		meListview = (ListView) this.findViewById(R.id.melistview);

		meListview.setAdapter(new ArrayAdapter<String>(this, R.layout.me_item,
				R.id.fav_title, arr));

	}
}
