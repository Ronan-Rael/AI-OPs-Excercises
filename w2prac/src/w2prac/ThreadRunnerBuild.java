package w2prac;

public class ThreadRunnerBuild extends Thread{
	static StringBuilder sb = new StringBuilder();
	public void run() {
		for(int i = 0; i < 20; i++) {
			sb.append("ABCD");
		}
		System.out.println("Builder: " + sb);
	}
}
