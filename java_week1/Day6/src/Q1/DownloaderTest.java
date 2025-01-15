package Q1;

import java.util.List;

public class DownloaderTest {
    public static void main(String[] args) {
        List<String> urls = FileRead.read("C:\\JAVA_CORE\\java_week1\\Day6\\src\\Q1\\Links.txt");
        for (String url : urls) {
            Thread t = new Thread(new FastDownloader(url));
            t.start();

        }
    }
}
