package w2prac;

public class ThreadRunnerBuff extends Thread{
	static StringBuffer sb = new StringBuffer();
	public void run() {
		for(int i = 0; i < 20; i++) {
			sb.append("ABCD");
		}
		System.out.println("Buffer: " + sb);
	}
}
