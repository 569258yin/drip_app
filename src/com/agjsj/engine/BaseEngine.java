package com.agjsj.engine;

import android.content.Context;

import com.agjsj.net.HttpUtils;

public abstract class BaseEngine {

	private Context context;

	public BaseEngine(Context context) {
		this.context = context;
	}

	/**
	 * 通用的方法，向服务器发送json字符串，并得到服务器回复的json字符串
	 * 
	 * 
	 * @param jsonString
	 *            请求json字符串
	 * @return 回复json字符串
	 */
	protected String sendAndGetJson(String jsonString) {

		return HttpUtils.sendJsonString(jsonString);
		// if (NetUtil.checkNet(context)) {
		// } else {
		// Toast.makeText(context, "请打开网络", Toast.LENGTH_LONG).show();
		// return null;
		// }
	}

}
