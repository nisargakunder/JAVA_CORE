package Q1;
class FastDownloader implements Runnable{
    private String url;
    public FastDownloader(String url){
        this.url=url;
    }
    @Override
    public void run() {
        new Downloader().download(url);
    }
}
public class Downloader {
    public void download(String url){
        System.out.println(Thread.currentThread().getName()+" is downloading "+url);
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted IO");
        }
        System.out.println(Thread.currentThread().getName()+" finished downloading "+url);
    }
}
