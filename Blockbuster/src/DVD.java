import java.util.Scanner;

public class DVD extends Movie {
	
	public DVD() {
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("What scene would you like to watch? ");
		for (String scene : scenes) {
			System.out.println(scene);

		}

		int sceneSelect = scanner.nextInt();
		System.out.println(scenes.get(sceneSelect));
		
		scanner.close();
	}
}