package cn.tr.baidumap.test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * 全排列算法
 * 
 * @author taorun
 * @date 2017年6月8日 下午4:08:56
 *
 */
public class PermutateBest {
	
	public static void main(String[] args) {
		String[] arr = { "A", "B", "C" };
		List<String> list = Arrays.asList(arr);
		
		PermutateBest permutate = new PermutateBest();
		permutate.array("", 3, list);
	}

	/**
	 * 列表全排列函数
	 * @param str
	 * @param total
	 * @param list
	 */
	public void array(String str, int total, List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			List<String> templist = new LinkedList<String>(list);
			String result = str + templist.remove(i) + ","; // 取出来的字符串
			if (total == 1) {
				List<String> l = Arrays.asList(result.split(","));
				System.out.println(l); // 以最极端 n个里面只取一个，直接把取出来的结果输出即可
			} else {
				int temp = total - 1; // 在同一层中total总量不能减,不能再原有变量的基础上
				array(result, temp, templist); // 这里的temp以及templist都是全新的变量和集合
			}
		}
	}

}
