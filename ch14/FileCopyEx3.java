package ch14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyEx3 {
	
	public static void main(String[] args) {
		copyFileByStream("ch14/aaa.pdf", "ch14/bbb.pdf");
	}
	
	public static void copyFileByStream(String sourcePath, String TargetPath) {
		File source = new File(sourcePath);
		File target = new File(TargetPath);
		if(!source.exists()) {
			System.out.println("경로 잘못됨");
			return;
		}
		if(!target.getParentFile().exists()) {
			target.getAbsoluteFile().mkdirs();
//			target.getAbsoluteFile().mkdir();
		}
		try {
			InputStream is = new FileInputStream(source);
			OutputStream os = new FileOutputStream(target);
			int temp = 0;
			byte[] data = new byte[1024];
			while((temp = is.read(data))!=-1) {
				os.write(data, 0, temp);
			}
			os.close();
			is.close();
			System.out.println("복사 끝~~~");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}