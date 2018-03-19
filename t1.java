/*
打印
   *
  * *
 *   *
*******
*/
public class t1{
public static void main(String[] args) {
	int l=4;
	for (int i=1;i<=l;i++ ) 
	{
		//kongge
		for (int k=1;k<=l-i;k++ )
		{
			System.out.print(" ");
		}
		for (int j=1;j<=2*i-1;j++ )
		{
			if (i==1||i==l) {
				System.out.print("*");//顶底层不处理
			}
			else//否侧判断是星还是空格
			{
				if (j==1||j==2*i-1) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}

		}
		 System.out.println();
	}
}
}