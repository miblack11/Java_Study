public class Stars{
	public static void main(String[] args){
		int totalLevel = 20;//���ò���
		for (int i = 1; i <= totalLevel; i++){//���� 
			for ( int k = 1; k <= totalLevel - i; k++){
				System.out.print(" ");
			}
			for ( int j = 1; j <= 2 * i - 1; j++){//*��
				if (j == 1 || j == 2 * i - 1  ){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}	
			}
			System.out.println();
		}
		for ( int a = totalLevel; a >= 1; a--){//����
			for ( int c = 1; c <= totalLevel - a; c++){//�ո�
				System.out.print(" ");
			}
			for ( int b = 1; b <= 2 * a - 1; b++){//*��
				if ( b == 1 || b == 2 * a - 1){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}