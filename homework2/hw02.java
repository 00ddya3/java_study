
public class hw02 {

		public static void main(String[] args) {
			int[] intArray = new int[10];
			int j;

			for (int i =0 ; i<10; i++) {
				int r =(int)(Math.random()*100+1);
				
				for(j=2; j<r; j++) {
					if (r%j == 0)
						break;  //r이 j로 나누어떨어진다면 소수가 아님 >> break
				}
				
				if (j == r)
					intArray[i] = r; // j가 break에 걸리지않고 r까지 도달한다면 소수라 할 수 있음. >> i번째 칸에 저장
				else 
					i--; // i--를 해주지 않는다면 intArray[i]=0(초기화값)으로 되고 넘어감
			}
				
			for (int i=0; i<intArray.length; i++)
				System.out.print(intArray[i] + " "); // intArray 출력
			
			int Max = intArray[0];
			for (int i=0; i<10; i++)
				if (Max < intArray[i])
					Max = intArray[i]; // Max값보다 큰 값이 있다면 그 값이 Max
			System.out.print("\n최댓값 : " + Max);
			
			int Min = intArray[0];
			for (int i=0; i<10; i++)
				if (Min > intArray[i])
					Min = intArray[i]; // Min보다 작은 값이 있다면 그 값이 Min
			System.out.print(",  최솟값 : " + Min);
		}

	}
