package deepshikha;

public class ExceptionEg {
	public static void main(String[] args) {
		try {
			int res = 50/5;
			System.out.println(res);
			
			String s = " Mamta ";
			System.out.println(s.length());
			
			int[] abc = new int[3];
			abc[4]=123;
			System.out.println(abc[4]);
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
