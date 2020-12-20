package edu.vinaenter.utils;

import java.io.File;

import javax.servlet.ServletContext;

import org.apache.commons.io.FilenameUtils;

import edu.vinaenter.constants.CommonConstants;

public class FileUtil {

	private static ServletContext servletContext;

	public static String rename(String fileName) {
		return FilenameUtils.getBaseName(fileName).concat("-") + System.nanoTime() + "."
				+ FilenameUtils.getExtension(fileName);
	}

	public static void delFile(String fileName) {

		String filePath =  servletContext.getRealPath("") +  
				CommonConstants.DIR_UPLOAD + File.separator + fileName;
		 
		File file = new File(filePath);
		if (file.exists()) {
			file.delete();
		}

	}

}
