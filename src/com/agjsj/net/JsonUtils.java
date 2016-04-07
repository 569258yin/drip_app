package com.agjsj.net;

import java.util.Map;

import org.json.JSONObject;

public class JsonUtils {

	public static String createJson(Map<String, String> map) {
		JSONObject jsonObject = new JSONObject(map);

		return jsonObject.toString();
	}
}
