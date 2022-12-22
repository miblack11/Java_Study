public class TernaryOperator {
//编写一个 main 方法
public static void main(String[] args) {
int a = 10;
int b = 99;
// 解读
// 1. a > b 为 false
// 2. 返回 b--, 先返回 b 的值,然后在 b-1
// 3. 返回的结果是 99
int result = a > b ? a++ : b--;
System.out.println("result=" + result);
System.out.println("a=" + a);
System.out.println("b=" + b);
}
}