package homework6;
import java.io.*;
import java.util.Scanner;

public class example {
	public static void main(String[] args) {
		String path = "BlockBinaryCopyEx.java"; // 찾을 파일
		String str = null;
		
		Scanner scanner = new Scanner(System.in);
		
		  try
		  {
			  int i =0;
			  BufferedReader br = new BufferedReader(new FileReader(path));

			  while (i==0) {
				  System.out.printf("검색할 단어나 문장 >> ");
				  String word = scanner.next();
			   
				  if (word.equals("quit")) {
					  System.out.println("end");
					  i = 1;
				  }
				 
				  for (int j=1; j<=100; j++) {
					  if ( (str = br.readLine()) != null ) {
						  if(str.indexOf(word) != -1)
							  System.out.println(j + ": " + str);
					  }
				   	}
				  System.out.printf("\n");
				  
			  }
			  br.close();
		  }
		  
		  catch (Exception e) {
			  e.printStackTrace();
		  }
	}

}
