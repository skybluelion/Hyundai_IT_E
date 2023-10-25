package io.system.property;

import java.io.File;
import java.io.IOException;

public class CreatedFileObject {

	public static void main(String[] args) throws IOException {
		//p.755
		// 1-1. C드라이브 내에 temp 폴더가 없을 때 생성
		File tempDir = new File("/Users/jun/Desktop/dev/Hyundai_IT_e/xcijava01/C");
		if(!tempDir.exists())
			tempDir.mkdir();
		System.out.println(tempDir.exists());
		// 1-2. 파일 객체 생성(실제 파일 생성)
		File newFile = new File("/Users/jun/Desktop/dev/Hyundai_IT_e/xcijava01/newFile.txt");
		if(!newFile.exists())
			newFile.createNewFile(); // temp 폴더가 없을 때 예외 발생
		System.out.println(newFile.exists());
		System.out.println();
		//2. 파일 구분자
		File newFile2 = new File("/Users/jun/Desktop/dev/Hyundai_IT_e/xcijava01/newFile.txt");
		System.out.println(newFile2.exists());
		//3-1 절대 경로
		File newFile5 = new File("/Users/jun/Desktop/dev/Hyundai_IT_e/xcijava01/abc/newFile.txt");
		File newFile6 = new File("/Users/jun/Desktop/dev/Hyundai_IT_e/xcijava01/abc/bcd/newFile.txt");
		System.out.println(newFile5.getAbsolutePath());
		System.out.println(newFile6.getAbsolutePath());
		//3-2 상대 경로
		System.out.println(System.getProperty("user.dir"));
		File newFile7 = new File("newFile1.txt");
		File newFile8 = new File("bcd/newFile2.txt");
		System.out.println(newFile7.getAbsolutePath());
		System.out.println(newFile8.getAbsolutePath());
	
	}

}
