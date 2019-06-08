package com.webuitest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;




public class savaFile {
	
	/**
	 * 改名称的方法，（新名称=原名称+_+年月日时分秒时间+_+八位随机数）
	 * 
	 * @param oldname
	 *            原名称
	 * @return newName 新名称
	 */
	public static String changName(String oldName) {
 
		// 第一步：得到系统时间
		SimpleDateFormat ff = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
		Date d = new Date();
		String time = ff.format(d);
		// 第二步：得到一个随机数
		int rad = new Random().nextInt(900000000);
		// 第三步：得到原文件的后缀名如:.jpg .doc .txt
		String lastName = oldName.substring(oldName.lastIndexOf("."));
		// 第四步：拼装新名（保证唯一性）
		String newName = oldName + "_" + time + "_" + rad + lastName;
		System.out.println("文件新名称：" + newName);
		return newName;
	}

	
	/**
	* 保存文件
	* 
	* @param file
	* 保存的文件
	* @param filename
	* 保存文件的名称（参考）
	* @param savepath
	* 文件保存的路径
	* @param saveasnewname
	* 是否以新名字保存
	* @return boolean (true:保存成功;false:保存失败)
	*/
	public static boolean save(File file, String filename, String savepath,boolean saveasnewname) {
		filename = saveasnewname ? changName(filename) : filename;
		File f = new File(savepath, filename);
		try {
		FileUtils.copyFile(file, f);
		} catch (IOException e) {
		e.printStackTrace();
		return false;
	    }
	return true;

   }
	
}	
