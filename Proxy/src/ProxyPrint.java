
public class ProxyPrint implements Print {

	public Print print = new Printer();

	@Override
	public void PrintCurrent(String User, String pass) {
		// TODO Auto-generated method stub
		if (User.equals("ABCD") || pass.equals("1234")) {
			print.PrintCurrent(User, pass);
		} else {
			System.out.println("Access Denied");
		}
	}

}
