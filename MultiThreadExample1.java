package p686;

public class MultiThreadExample1 {

	public static void main(String[] args) {
		Thread thread = new DigitThread(); 		//����Ŭ������ Ÿ������ ����
		thread.start();
		for(char ch = 'A'; ch <= 'Z'; ch++){
			System.out.print(ch);
		}
	}

}
