package com.example.hsjy.test.utils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Post {

	public  void connectWeiXinInterface(String action,String json){

		URL url;

		try {

			url = new URL(action);

			HttpURLConnection http = (HttpURLConnection) url.openConnection();

			http.setRequestMethod("POST");

			http.setRequestProperty("Content-Type",

					"application/x-www-form-urlencoded");

			http.setDoOutput(true);

			http.setDoInput(true);

			System.setProperty("sun.net.client.defaultConnectTimeout", "30000");// 连接超时30秒

			System.setProperty("sun.net.client.defaultReadTimeout", "30000"); // 读取超时30秒

			http.connect();

			OutputStream os = http.getOutputStream();

			os.write(json.getBytes("UTF-8"));// 传入参数

			InputStream is = http.getInputStream();

			int size = is.available();

			byte[] jsonBytes = new byte[size];

			is.read(jsonBytes);

			String result = new String(jsonBytes, "UTF-8");

			System.out.println("请求返回结果:"+result);

			os.flush();

			os.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}
}
