package w2prac;
import java.util.HashSet;
import com.emp.Employee;

public class JavaAdvanced {
	//Q11
	public static int longestSubstring(String s) {
		HashSet<Character> seen = new HashSet<>(); 
		int lP = 0;
		int maxLen = 0;
		for(int rP = 0; rP < s.length(); rP++) {
			while(seen.contains(s.charAt(rP))) {
				seen.remove(s.charAt(lP));
				lP++;
			}
			seen.add(s.charAt(rP));
			if(rP - lP + 1 > maxLen) {
				maxLen = rP - lP + 1;
			}
		}
		return maxLen;
	}
	
	//Q12
	public static String compress(String s) {
		if(s.length() == 0) {
			return "";
		}
		StringBuilder cs = new StringBuilder();
		char cCh = s.charAt(0);
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != cCh) {
				cs.append(cCh);
				cs.append(count);
				count = 1;
				cCh = s.charAt(i);
			}
			else {
				count++;
			}
		}
		cs.append(cCh);
		cs.append(count);
		return cs.toString();
	}
	
	//Q13
	public static String reverseWordOrder(String s) {
		String[] sa = s.trim().split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i = sa.length - 1; i >= 0; i--) {
			sb.append(sa[i]);
			if(i != 0) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}
	
	//Q14
	public static void bufferVsBuilder() {
		StringBuilder sbui = new StringBuilder();
		for(int i = 0; i < 1000; i++) {
			sbui.append(String.valueOf((char) i));
		}
		StringBuffer sbuf = new StringBuffer();
		for(int i = 0; i < 1000; i++) {
			sbuf.append(String.valueOf((char) i));
		}
		
		// The same output
		System.out.println("Builder: " + sbui);
		System.out.println("Buffer: " + sbuf);
		
		// StringBuffer places a lock on itself when a thread begins working on it, meaning only one can be modifying it at a time, making it thread safe
		// StringBuilder does not do this, meaning that there can be conflicting edits at the same time.
		
		ThreadRunnerBuff buff1 = new ThreadRunnerBuff();
		ThreadRunnerBuff buff2 = new ThreadRunnerBuff();
		buff1.start();
		buff2.start();
		// Both threads output the same, with ABCD in order, and with the proper count of 40 repetitions of the sequence
		
		ThreadRunnerBuild build1 = new ThreadRunnerBuild();
		ThreadRunnerBuild build2 = new ThreadRunnerBuild();
		build1.start();
		build2.start();
		// Both still output the same, but there are less then 40 repetitions of the sequence. This is because the overwrote eachother at some points.
	}
	
	//Q15
	public static void testEmployee() {
		Employee rahul = new Employee(101, "Rahul", 60000, 20, true);
		Employee rahul2 = rahul;
		System.out.println("Assigned object reference equality: " + (rahul2 == rahul));
		Employee rahul3 = new Employee(101, "Rahul", 60000, 20, true);
		System.out.println("New object equality: " + (rahul2 == rahul3));
		
		System.out.println(rahul + "\n");
		
		rahul2.setName("Ravna");
		System.out.println("After r2 change: ");
		System.out.println(rahul + "\n");
		
		rahul3.setName("Rajesh");
		System.out.println("After r3 change: ");
		System.out.println(rahul + "\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestSubstring(""));
		System.out.println(compress("a"));
		System.out.println(reverseWordOrder("Java is easy to learn"));
		//bufferVsBuilder();
		testEmployee();
	}

}
