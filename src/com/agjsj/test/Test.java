package com.agjsj.test;

import android.test.AndroidTestCase;

import com.agjsj.bean.User;
import com.agjsj.net.HttpUtils;

public class Test extends AndroidTestCase {

	public static void test() {
		User user = new User("姓名", "密码", 20, "电话号", "email", "6454", "地址",
				"详细地址", "头像URL");

		HttpUtils.sendJsonString("");
		// {"userAddress":"地址","requestCode":"10001","userSex":"20","userIcon":"头像URL","userName":"姓名","userAddressinfo":"详细地址","userPhone":"电话号","userEmail":"email","userPsw":"密码","userBirthdate":"Wed Apr 06 07:24:08 EDT 2016"}

	}

}
