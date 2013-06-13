import java.io.FileWriter;
import java.io.IOException;


public class ConanTxt {
	public static void main(String[] arg) throws IOException {
		FileWriter fw = new FileWriter("a.txt");
		for (int i = 43;i<=674;i++) {
			fw.append("http://m.animeboy.org/ddata/afdata/Detective%20Conan%20mp4/"+i+"a.mp4\n");
			fw.append("http://m.animeboy.org/ddata/afdata/Detective%20Conan%20mp4/"+i+"b.mp4\n");
		}
		fw.close();
	}
}
