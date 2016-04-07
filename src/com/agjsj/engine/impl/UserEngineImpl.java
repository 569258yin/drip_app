package com.agjsj.engine.impl;

import java.util.HashMap;
import java.util.Map;

import android.content.Context;

import com.agjsj.bean.User;
import com.agjsj.engine.BaseEngine;
import com.agjsj.engine.UserEngine;
import com.agjsj.net.JsonUtils;

public class UserEngineImpl extends BaseEngine implements UserEngine {

	public UserEngineImpl(Context context) {
		super(context);
	}

	@Override
	public String register(User user) {

		// 第一步创建请求的json字符串
		Map<String, String> map = new HashMap<String, String>();
		map.put("requestCode", "10001");

		map.put("userName", user.getUserName());
		map.put("userPsw", user.getUserPsw());
		map.put("userSex", user.getUserSex().toString());
		map.put("userPhone", user.getUserPhone());
		map.put("userEmail", user.getUserEmail());
		map.put("userBirthdate", user.getUserBirthdate().toString());
		map.put("userAddress", user.getUserAddress());
		map.put("userAddressinfo", user.getUserAddressinfo());
		map.put("userIcon", user.getUserIcon());

		String requestJsonString = JsonUtils.createJson(map);

		// 第二步 向服务器发送请求 并的到回复
		String responseJsonString = sendAndGetJson(requestJsonString);

		return responseJsonString;

	}
}
