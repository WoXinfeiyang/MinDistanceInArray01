import java.util.Scanner;

/**
 * �ļ����ƣ������������ַ�������С����MinDistance
 * ʱ�䣺2016-9-7 20:50
 * ˵����1����Ŀ������һ���ַ�������strs,�ٸ��������ַ���str1��str2��������strs��str1��str2
 * ����С���룬���str1��str2Ϊnull,����strs�з���-1��
 * */
public class MinDistance {
	
	public static int FindMinDistance(String[]strs,String str1,String str2){
		if(str1==null||str2==null){
			return -1;
		}
		if(str1.equals(str2)){
			return 0;
		}
		/**���һ�γ���str1��λ��*/
		int last1=-1;
		/**���һ�γ���str2��λ��*/
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
