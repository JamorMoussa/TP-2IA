package video3;

public class DownloadFileTask implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Download file ..." + Thread.currentThread().getId());
		
	}
	
}
