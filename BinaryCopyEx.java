package may6;
import java.io.*;

public class BinaryCopyEx {
	public static void main(String[] args) {
		String org_img = "c:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg";
		String copy_img = "c:\\Temp\\copyimg.jpg";
		
		File src = new File(org_img);
		File dest = new File(copy_img);
		
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
		
			while((c=fi.read()) != -1) {
				fo.write((byte)c);
			}

			fi.close();
			fo.close();

			System.out.println(src.getPath() + "를 " + dest.getPath()+ "로 복사하였습니다.");
		}catch(IOException e) {
		System.out.println("파일 복사 오류 ");
		e.printStackTrace();
		}
	}
}
