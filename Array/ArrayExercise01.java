public class ArrayExercise01{
	public static void main(String[] args){
		//1) ����һ�� char ���͵� 26 ��Ԫ�ص����飬�ֱ� ����'A'-'Z'��ʹ�� for ѭ����������Ԫ�ز���ӡ��������ʾ��char ����
		//�������� 'A'+2 -> 'C
		char[] chars = new char[26];
		for (int i = 0; i < chars.length;i++){
		chars[i] = (char)('A' + i);
		System.out.print(chars[i]);
	}
	for( char a = 'a'; a <= 'z'; a++){
		System.out.print(a);
	}
	}
}