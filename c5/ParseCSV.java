import java.io.*;

public class ParseCSV{
	public static void main(String[] args) throws Exception{

        	BufferedReader bufRdr = new BufferedReader(new InputStreamReader(System.in));

        	String file_name;
		System.out.print("Enter file name/dir : ");
		file_name = bufRdr.readLine();
		if(!file_name.contains(".csv")){
			file_name = file_name + ".csv";
		}

		bufRdr = new BufferedReader(new FileReader(file_name));
		String[] line = new String[150];
		String[] val;
		int res = 0, i = 0;
		while((line[i] = bufRdr.readLine()) != null){
			val = line[i].split(",");
			res += Integer.parseInt(val[5]);
			line[i] = null;
		}
		System.out.println("Total tasks done : " + res);
	}
}
