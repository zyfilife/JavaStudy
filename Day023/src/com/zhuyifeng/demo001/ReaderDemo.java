package com.zhuyifeng.demo001;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ReaderDemo {
	
	private static int i = 0;
	
	public static void main(String[] args) {
		
		getAllMuseFile("/Users/zhuyifeng/Documents/希韵/曲谱资源/规范好的曲谱");
		
	}
	
	public static void find(String path, String containString) {
		FileReader fr = null;
		try {
			fr = new FileReader(path);
			int len = 0;
			var b = new char[1024];
			var bs = new StringBuffer("");
			try {
				while ((len = fr.read(b)) != -1) {
					bs.append(b, 0, len);
				}
				var string = new String(bs);
				if (string.contains(containString)) {
					var file = new File(path);
					var destFile = new File("/Users/zhuyifeng/Desktop/"+containString+File.separator);
					if (!destFile.exists()) {
						destFile.mkdirs();
					}
					copy(path, new File(destFile, file.getName()).getPath());
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	static void copy(String path, String destPath) {
		FileWriter fw = null;
		FileReader fr = null;
		var c = new char[1024];
		int len = 0;
		try {
			fr = new FileReader(path);
			fw = new FileWriter(destPath);
			while ((len = fr.read(c)) != -1) {
				fw.write(c, 0, len);
				fw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					if (fr != null) {
						fr.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void getAllMuseFile(String path) {
		var file = new File(path);
		if (file.exists()) {
			var files = file.listFiles();
			if (files == null || files.length == 0) {
				System.out.println("empty files");
			}else {
				for (File file2 : files) {
					if (file2.isDirectory()) {
						getAllMuseFile(file2.getAbsolutePath());
					}else if (file2.getName().endsWith("mscz") || file2.getName().endsWith("mscx")) {
						i++;
//						find(file2.getPath(), "turn");
//						find(file2.getPath(), "mordent");
//						find(file2.getPath(), "dot");
//						find(file2.getPath(), "Tie");
//						find(file2.getPath(), "fermata");
						find(file2.getPath(), "staccato");
					}
				}
			}
		}
	}
}
