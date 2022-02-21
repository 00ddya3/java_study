package homework6;
import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class FindWord {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		try {
			BufferedReader file = new BufferedReader(new FileReader("BlockBinaryCopyEx.java"));
			Vector<String> line = new Vector<String>();
			
			for (int j=0; j<100; j++)
				line.add(file.readLine());	//파일에서 한줄씩 읽어오기
						
			while(true) {
				int i=0;	//i: 찾는 단어가 포함된 문자열의 갯수
				
				System.out.printf("검색할 단어나 문장 >> ");
				String word = scanner.next();
				
				if (word.equals("quit")) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}	//프로그램 종료
				
				for(int j=1; j<=line.size(); j++) {
					String aaa = line.get(j); //문자열 aaa에 j번째 line 저장
					
					if(aaa.indexOf(word) != -1) {
						System.out.println(j + ": " + aaa);
						i += 1;
					}	//찾는 단어가 있으면 문자열 출력
				}
				
				if (i==0)
					System.out.println(word + " not found!");	//찾는 단어가 없는 경우
				  
				System.out.printf("\n");
			}
			
			file.close();
		} catch (IOException e) {
			System.out.println("입출력오류");
		}
		scanner.close();
	}
}