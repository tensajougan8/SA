import java.util.Scanner;

public class UserClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Song with Extension : ");
		String sring = scan.nextLine();
		MediaPlayer ap = new AudioPlayer();
		ap.play(sring);

	}

}
