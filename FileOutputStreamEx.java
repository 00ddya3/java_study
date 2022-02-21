package may6;
import java.io.*;

public class FileOutputStreamEx {
	public static void writeFile() {
		byte b[] = {7, 51, 3, 4, -1, 24};
		try {
			FileOutputStream fout = new FileOutputStream("test.out");
		
			for (int i=0; i<b.length; i++)
				fout.write(b[i]);
		
			fout.close();
		}catch(IOException e) {
			System.out.println("test.out을 저장할 수 없습니다. " + "경로명을 확인해주세요.");
			return;
		}
		System.out.println("test.out을 저장하였습니다. \n");
	}
	
	public static void readFile() {
		byte b[] = new byte[6];
		try {
			FileInputStream fin = new FileInputStream("test.out");
			
			int n=0; int c;
			while ((c=fin.read()) != -1) {
				b[n] = (byte)c;
				n++;
			}
			
			System.out.println("test.out에서 읽은 배열을 출력합니다. ");
			for(int i=0; i<b.length; i++)
				System.out.print(b[i] + " ");
			System.out.println();
			
			fin.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		writeFile();
		readFile();
	}
}
