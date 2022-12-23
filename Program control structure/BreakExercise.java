import java.util.Scanner;
public class BreakExercise{
	public static void main(String[] args){
		//1-100 以内的数求和，求出 当和 第一次大于 20 的当前数
		int sum = 0;
		for ( int i = 1; i <= 100; i++){
			sum += i;
			if ( sum > 20){
				System.out.println(i);
				break;
			}
		}
		//实现登录验证，有 3 次机会，如果用户名为"丁真" ,密码"666"提示登录成功，否则提示还有几次机会，请使用 for+break
        //完成
        Scanner scanner = new Scanner(System.in);
       for ( int i = 2; i >= 0; i--){
       		System.out.println("请输入用户名");
       		String name =scanner.next();
       		if ("丁真".equals(name)){
       			System.out.println("请输入密码");
       			int possword = scanner.nextInt();
       			if (possword == 666){
       				System.out.println("恭喜进入");
       				break;
       			}
       		}else{
       			System.out.println("你还有" + i + "次机会");
       		}
       }
	}
}