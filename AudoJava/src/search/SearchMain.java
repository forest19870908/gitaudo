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
	private static String con="yiibai";//搜索条件
	private static String noInclude="";//不包括
	private static String range="F:\\maven";//范围(目录)
	
	public static void main(String[] args) {
		
	}
	
	public static void getFiles(File file){
		List<File> files=new ArrayList<File>();
		if(file.isDirectory()){
			files=Arrays.asList(file.listFiles());
		}else{
			if(file.getName().contains(con)){
				System.out.println(file.getAbsolutePath());
			}
		}
	}
}
