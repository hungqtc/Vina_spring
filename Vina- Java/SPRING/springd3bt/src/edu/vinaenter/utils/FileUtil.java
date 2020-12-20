package edu.vinaenter.utils;

import org.apache.commons.io.FilenameUtils;

public class FileUtil {
	public static String rename(String fileName){
		//ab-c.jpg
		
		//FilenameUtils.getBaseName: ab-c
		//FilenameUtils.getExtension: jpg
		return FilenameUtils.getBaseName(fileName).concat("-")
		+ System.nanoTime() + "." + FilenameUtils.getExtension(fileName);
	}
		
}
