package p2023_08_02;

//ArithmeticException : 숫자를 0 으로 나눌떄 발생화는 예외
//ArrayIndexOutOfBoundsException : 배열의 범위를 벗어 났을떄
public class MultiExceptionHandling {
    public static void main( String[] args ) {
		
	int value = 20;
	int div = 0;
	int[] intArray = { 1, 2, 3 };
	//intArray[0]=1, intArray[1]=2, intArray[2]=3

	try {
		   int arrayValue = intArray[4]; //예외발생(4번방의 원소를 구해오라고 해서)
		  System.out.println( arrayValue );	

	      // 두수의 나눗셈을 구함
	      int result = value / div;  // 예외발생 (0발생 무한대)
	      System.out.println( result );

		  // 배열의 특정 값을 저장
//          int arrayValue = intArray[4];  //실행되지않음.
//		  System.out.println( arrayValue );	    

		// 예외의 간단한 설명문을 반환함.
	    } catch ( ArithmeticException ae ) {		
			System.out.println( ae.toString() );
			System.out.println("0으로 나눌수 없습니다.");
	    } catch ( ArrayIndexOutOfBoundsException ai ) {
			ai.printStackTrace();
			System.out.println("배열의 범위를 벗어 났습니다.");
	    } 
    }    
}



