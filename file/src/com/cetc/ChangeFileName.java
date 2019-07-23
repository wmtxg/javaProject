package com.cetc;

import java.io.File;

public class ChangeFileName {

	/**
	 * 批量对文件夹中指定名称的文件名称进行修改
	 * 
	 * @param args
	 * @author 吴明涛
	 * @phone 17346519691
	 * @email wmtxg@126.com
	 * @time 2019年7月23日 下午7:55:05
	 */
	public static void main(String[] args) {

		File file = new File("F:\\05、springboot中小型互联网架构与运维架构平台实战\\从无到有搭建中小型互联网公司后台服务架构与运维架构");
		File fs[] = file.listFiles();
		for (int i = 0; i < fs.length; i++) {
			if (fs[i].getName().indexOf("第") == 0) {
				String fileName = fs[i].getName();
				File newFile = new File(
						"F:\\05、springboot中小型互联网架构与运维架构平台实战\\从无到有搭建中小型互联网公司后台服务架构与运维架构\\" + fileName.substring(1));
				fs[i].renameTo(newFile);
			}
		}
	}
}
