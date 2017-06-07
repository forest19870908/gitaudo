package search;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 搜索入口
 * @author gq
 * @time 2016年12月13日
 */
public class SearchMain {
//	private static String con="Java 并发编程实战.pdf";//搜索条件
	private static String con="game";//搜索条件
	private static String noInclude="";//不包括
	private static String[] range=new String[]{"D:","E:","F:","C:"};//范围(目录)
	
	public static void main(String[] args) {
		for (String str : range) {
			getFiles(new File(str));
		}
	}
	
	public static void getFiles(File file){
		File[] files=null;
		if(file.getName().contains(con)){
			System.out.println(file.getAbsolutePath());
		}
		if(file.isDirectory()){
			files=file.listFiles();
			if(files!=null){
				for (File f : files) {
					getFiles(f);
				}
			}
		}
	}
}
