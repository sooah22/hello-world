package p686;

public class MultiThreadExample1 {

	public static void main(String[] args) {
		Thread thread = new DigitThread(); 		//슈퍼클래스의 타입으로 선언
		thread.start();
		for(char ch = 'A'; ch <= 'Z'; ch++){
			System.out.print(ch);
		}
	}

}
