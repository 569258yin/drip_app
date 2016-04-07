package com.agjsj.drop;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.agjsj.bean.User;
import com.agjsj.engine.impl.UserEngineImpl;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		new Thread() {

			public void run() {
				User user = new User("zhangsan", "123456", 20, "电话号", "email",
						"2016-4-6", "地址", "详细地址", "头像URL");

				UserEngineImpl userEngineImpl = new UserEngineImpl(
						MainActivity.this);
				Log.v("chx", userEngineImpl.register(user));
			};
		}.start();
	}

}
