package may6;
import java.io.*;

public class FileReadHangeul {
	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("hangul.txt");
			//in = new InputStreamReader(fin, "MS949"); //문자 스트림 클래스
			in = new InputStreamReader(fin, "UTF8"); //문자 스트림 클래스
			//in = new InputStreamReader(fin, "US-ASCII"); 
			
			int c;
			System.out.println("인코딩 문자 집합은 " + in.getEncoding());
			
			while ((c = in.read()) != -1) {
				System.out.print((char)c);
				}
		
			in.close();
			fin.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
