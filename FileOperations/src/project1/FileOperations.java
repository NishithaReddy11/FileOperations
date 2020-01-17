package project1;

import java.io.*;

public class FileOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("hello.txt");
			// FileInputStream fin=new FileInputStream(file);
			FileReader fin = new FileReader(file);
			BufferedReader br = new BufferedReader(fin);
//		int c;
//		while((c=fin.read())!=-1)
//		{
//			System.out.print((char)c);
//		}
			File file2 = new File("file.txt");
			FileWriter fout=new FileWriter(file2);
			BufferedWriter bw=new BufferedWriter(fout);
			String line;
			while ((line = br.readLine()) != null) {
				if(line.length()>15)
				{
				bw.write(line+"\n");
				}
			}
			br.close();
			bw.close();
		} catch (Exception ex) {

		}
	}

}
