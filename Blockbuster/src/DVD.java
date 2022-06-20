import java.util.ArrayList;
import java.util.Scanner;

public class DVD implements Play{
	ArrayList<String> scenes = new ArrayList<>();

	
	public DVD() {
		
	}

	@Override
	public void play(ArrayList<String> scenes) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("What scene would you like to watch? ");
//		MovieApp.selectScene(MovieList.getMovies(), scanner, MovieList.getMovies().indexOf(dvd1));
		for (int i = 0; i < scenes.size(); i++) {
			System.out.print("Scene " + (i + 1) + ") ");
			System.out.println(scenes.get(i));
			}

		int sceneSelect = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Playing scene #" + sceneSelect + ", " + scenes.get(sceneSelect-1));
		
		scanner.close();
	}
	}
	

