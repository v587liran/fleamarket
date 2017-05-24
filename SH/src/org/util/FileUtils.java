package org.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.UUID;


public class FileUtils {

	/**
	 * 保存文件功能
	 * 
	 * @param orgFile
	 *            要保存的文件
	 * @param savePath
	 *            保存的路径(物理路径)
	 * @param orgFileName
	 *            原文件名(用来取得扩展名)
	 * @return
	 * @throws Exception
	 */
	public static String saveFile(File orgFile, String savePath,String orgFileName) throws Exception {
		// 生成文件名
		String fileName = UUID.randomUUID().toString();
		// 处理扩展名
		String extName = orgFileName.substring(orgFileName.lastIndexOf("."));

		FileOutputStream os = new FileOutputStream(new File(savePath + fileName+ extName));

		FileInputStream is = new FileInputStream(orgFile);

		byte[] data = new byte[1024];

		int length = 0;
		try {
			while ((length = is.read(data)) != -1) {
				os.write(data, 0, length);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (is != null) {
				is.close();
			}
			if (os != null) {
				os.close();
			}
		}

		LogUtils.addInfo("保存了一个文件: " + fileName + extName);

		return fileName + extName;
	}

	public static void deleteFile(String filePath, String fileName) {
		File file = new File(filePath + fileName);
		if (file.exists()) {
			file.delete();
		}
	}
}
