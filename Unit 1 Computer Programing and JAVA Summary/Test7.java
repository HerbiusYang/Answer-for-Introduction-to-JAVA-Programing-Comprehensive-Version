//根据题意已知公式去求给出的两个事例：
//算法思想：
//根据之前的算法我们还可以继续沿用
import java.lang.*;  //lang包中含有math函数 函数形式是 Math.pow(double 底数, double 指数)
    
public class Test7{
	public static void main(String[] args) {
		double pie1=0,pie2=0; //注意这里要赋值成double类型的值才能精确 要有初值否则得到的数值会有问题

		int i=1;
		for(;i<=11;i++)
		{
			pie1=4*(1.0/i)*Math.pow(-1,i+1)+pie1; //注意这个问题 首先是1.0而不是1 这是因为如果是1 编译器会自动将1/i的1所得的值转换成整形数值 这个在之后会讲
		}               						  //是i+1不是i 因为 第一个数字是1

		i=1;  //将i的值要重新归一 之前的i值已经改变

		for(;i<=13;i++)
		{
			pie2=4*(1.0/i)*Math.pow(-1,i+1)+pie1; //注意这个问题 首先是1.0而不是1 这是因为如果是1 编译器会自动将1/i的1所得的值转换成整形数值 这个在之后会讲
		}

		System.out.println(pie1);
		System.out.println(pie2);

	}
}