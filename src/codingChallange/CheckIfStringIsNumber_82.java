package codingChallange;

public class CheckIfStringIsNumber_82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String no = "1234567890";
		boolean isNo = false;
		try {
			int no1 = Integer.parseInt(no);
			System.out.println(no + " is number");
		} catch (NumberFormatException e) {
			System.out.println(no + " is not number");
		}
	}
}
