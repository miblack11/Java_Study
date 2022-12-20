public class InverseOperator {
//编写一个 main 方法
public static void main(String[] args) {
//! 操作是取反 T->F , F -> T
System.out.println(60 > 20); //T
System.out.println(!(60 > 20)); //F
//a^b: 叫逻辑异或，当 a 和 b 不同时，则结果为 true, 否则为 false
boolean b = (10 > 1) ^ ( 3 > 5);
System.out.println("b=" + b);//T
}
}