import java.util.ArrayList;

public class MovieList {
	private static ArrayList<Movie> movies = new ArrayList<>();
	
	public static void addMovies() {
		VHS vhs = new VHS();
		DVD dvd = new DVD();

		
		Movie vhs1 = new Movie(vhs);
		Movie vhs2 = new Movie(vhs);
		Movie vhs3 = new Movie(vhs);
		Movie dvd1 = new Movie(dvd);
		Movie dvd2 = new Movie(dvd);
		Movie dvd3 = new Movie(dvd);
		
		movies.add(vhs1);
		movies.add(vhs2);
		movies.add(vhs3);
		movies.add(dvd1);
		movies.add(dvd2);
		movies.add(dvd3);
		
		vhs1.setTitle("Avatar the Last Airbender");
		vhs1.setRunTime(103);
		vhs1.scenes.add("Aang awakes");
		vhs1.scenes.add("Aang fights Zuko");
		vhs1.scenes.add("Aang beats up the Fire Nation");

		vhs2.setTitle("National Treasure");
		vhs2.setRunTime(103);
		vhs2.scenes.add("Lost ship in the arctic is found");
		vhs2.scenes.add("Declaration of Independence is stolen");
		vhs2.scenes.add("Ben is arrested by the FBI");
		vhs2.scenes.add("Underground passage is found");
		vhs2.scenes.add("Treasure is found");

		vhs3.setTitle("Harry Potter & the Chamber of Secrets");
		vhs3.setRunTime(161);
		vhs3.scenes.add("Harry meets Dobby");
		vhs3.scenes.add("The Chamber of Secrets is opened");
		vhs3.scenes.add("Ginny has been taken into the Chamber");
		vhs3.scenes.add("Riddle summons the basilisk.");
		vhs3.scenes.add("Harry stabs the diary");
		vhs3.scenes.add("Dobby is freed");

		dvd1.setTitle("The Martian");
		dvd1.setRunTime(141);
		dvd1.scenes.add("Mark is stuck on Mars");
		dvd1.scenes.add("Mark creates a garden");
		dvd1.scenes.add("Mark is saved");
		dvd1.scenes.add("Mark returns to Earth");

		dvd2.setTitle("Dunkirk");
		dvd2.setRunTime(106);
		dvd2.scenes.add("The German ambush");
		dvd2.scenes.add("Tommy, Alex and Gibson are picked up by the British");
		dvd2.scenes.add("Tommy and Alex board the train");
		dvd2.scenes.add("Churchill's address to the nation");

		dvd3.setTitle("El Camino");
		dvd3.setRunTime(122);
		dvd3.scenes.add("Jesse talks to Mike");
		dvd3.scenes.add("Jesse flees");
		dvd3.scenes.add("Jesse talks to Ed Galbriath");
		dvd3.scenes.add("Jesse drives off in Alaska");

	}

	public static ArrayList<Movie> getMovies() {
		return movies;
	}

}
