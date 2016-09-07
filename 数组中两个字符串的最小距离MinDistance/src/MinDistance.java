import java.util.Scanner;

/**
 * 文件名称：数组中两个字符串的最小距离MinDistance
 * 时间：2016-9-7 20:50
 * 说明：1、题目：给定一个字符串数组strs,再给定两个字符串str1和str2，返回在strs中str1和str2
 * 的最小距离，如果str1或str2为null,或不在strs中返回-1。
 * */
public class MinDistance {
	
	public static int FindMinDistance(String[]strs,String str1,String str2){
		if(str1==null||str2==null){
			return -1;
		}
		if(str1.equals(str2)){
			return 0;
		}
		/**最近一次出现str1的位置*/
		int last1=-1;
		/**最近一次出现str2的位置*/
		int last2=-1;
		
		int min=Integer.MAX_VALUE;
		for(int i=0;i!=strs.length;i++){
			if(strs[i].equals(str1)){
				min=Math.min(min,last2==-1?min:i-last2);
				last1=i;
			}
			if(strs[i].equals(str2)){
				min=Math.min(min,last1==-1?min:i-last1);
				last2=i;
			}
		}
		return min==Integer.MAX_VALUE?-1:min;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int n=in.nextInt();
			String[]strs=new String[n];
			for(int i=0;i<n;i++){
				strs[i]=in.next();
			}
			String str1=in.next();
			String str2=in.next();
			System.out.println(FindMinDistance(strs, str1, str2));
		}
	}

}
