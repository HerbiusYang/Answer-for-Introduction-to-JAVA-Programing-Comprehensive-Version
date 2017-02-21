//算法思想： 没有C语言基础的可以将1~9数字全部罗列出来
//          有C语言基础的只需要将数字进行逐次数值增加即可


//列出有C语言基础的程序
public class Test6{
	public static void main(String[] args) {
		int i=1;
		int sum=0;
		for(;i<=9;i++) //注意不要重复定义i 自由变量的值
		{
			sum=i+sum;
		}
		System.out.println(sum);
	}
}