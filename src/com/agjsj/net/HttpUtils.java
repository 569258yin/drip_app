package com.agjsj.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import android.util.Log;

import com.agjsj.drop.MyApplication;

public class HttpUtils {

	private static HttpURLConnection getConnection() {

		URL url;
		try {
			url = new URL(MyApplication.url);
			// url = new URL(
			// "http://wthrcdn.etouch.cn/weather_mini?citykey=101010100");
			// 打开链接
			URLConnection connection = url.openConnection();
			HttpURLConnection httpURLConnection = (HttpURLConnection) connection;
			httpURLConnection.setRequestMethod("POST");
			// httpURLConnection.setRequestMethod("GET");
			httpURLConnection.setUseCaches(false);
			httpURLConnection.setDoInput(true);
			httpURLConnection.setDoOutput(true);
			return httpURLConnection;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 向服务器发送一个json字符串，并接受一个服务器返回的json字符串
	 * 
	 * @param jsonString
	 *            要发送的json字符串
	 * @return 服务器返回的json字符串
	 */
	public static String sendJsonString(String jsonString) {
		HttpURLConnection httpURLConnection = getConnection();
		try {

			BufferedWriter bufferedWriter = new BufferedWriter(
					new OutputStreamWriter(httpURLConnection.getOutputStream()));
			bufferedWriter.write(jsonString);
			bufferedWriter.flush();

			// // 读入流数据
			// InputStream is = httpURLConnection.getInputStream();
			// // 设置缓冲
			// BufferedInputStream bis = new BufferedInputStream(is);
			// // 设置输出流
			// ByteArrayOutputStream outStream = new ByteArrayOutputStream();
			// byte[] buff = new byte[512];
			// int read = 0;
			// while ((read = bis.read(buff)) != -1) {
			// outStream.write(buff, 0, read);
			// }
			// byte[] data = outStream.toByteArray();// 网页的二进制数据
			// outStream.flush();
			// outStream.close();
			// bis.close();
			// is.close();
			// String str = new String(data, "utf-8");// 格式转换

			// InputStream inputStream = httpURLConnection.getInputStream();
			// byte[] buffer = new byte[1024];
			// int len = 0;
			// StringBuffer stringBuffer = new StringBuffer();
			// while ((len = inputStream.read(buffer)) != -1) {
			//
			// stringBuffer.append(new String(buffer, 0, len));
			// }

			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(httpURLConnection.getInputStream()));
			String jsonString2 = bufferedReader.readLine();
			Log.v("json", jsonString2);
			System.out.println("输出：" + jsonString2);
			return jsonString2;
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;

	}

}
