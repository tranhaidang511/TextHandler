import java.io.*;


public class StringRead1 {
	public static void main(String[] args) throws IOException{
/*		reader = new BufferedReader( new FileReader ("input.dat"));
	    String line = null;
	    StringBuilder  stringBuilder = new StringBuilder();
	    String ls = System.getProperty("line.separator");
	    while (( line = reader.readLine())!=null) {
	        stringBuilder.append(line);
	        stringBuilder.append(ls);
	    }
	    
	    System.out.println(stringBuilder.toString());
		FileWriter fw = new FileWriter("output.dat");
		fw.write(stringBuilder.toString());
		fw.close();*/
        Reader reader = new InputStreamReader(new FileInputStream("input.txt"),"Shift_JIS");
        BufferedReader fin = new BufferedReader(reader);
        Writer writer = new OutputStreamWriter(new FileOutputStream("output.txt"), "UTF-8");
        BufferedWriter fout = new BufferedWriter(writer);
        String s;
        while ((s=fin.readLine())!=null) {
        	fout.write(s.replace(", ","\n").replace("- ","\n").replace("†","†"));
        	System.out.println(s);
        	fout.newLine();
        }
        fin.close();
        fout.close();
	}
}