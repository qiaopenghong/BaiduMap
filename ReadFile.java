import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
/**
 *读取文件 
 **/
public class ReadFile {
   /**
 * @param args
 */
/**
 * @param args
 */
/**
 * @param args
 */
public static void main(String[] args) {
		java.io.BufferedReader reader;
		try {
			File f1 = new File("f:/qqgroup.txt");// 打开文件 
            FileInputStream in = new FileInputStream(f1); 
			reader = new java.io.BufferedReader(new InputStreamReader(in,"gbk"));
			String s=reader.readLine();
			StringBuffer sb = new StringBuffer();
			while (s!=null) {
				sb.append(s);
				sb.append("\r\n\n");
				s=reader.readLine();
			}
			//System.out.println(sb.toString());
			reader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
