import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class MovieApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		MovieList.addMovies();
		ArrayList<Movie> movies = MovieList.getMovies();

		System.out.println("Welcome to GC Blockbuster!");
		System.out.println("Please Select a Movie from the list: ");

		// iterates through the movie array list and prints out the movies
		for (int i = 0; i < movies.size(); i++) {
			System.out.print((i + 1) + ") ");
			System.out.println(movies.get(i).getTitle());
		}
		
		int selection = selectMovie(movies, scanner);
		
		// asks the user to confirm that this is the movie they want to watch
		
		System.out.println("Do you want to watch " + (movies.get(selection-1).getTitle() + "?" + " Select yes or no."));
		String answer = scanner.nextLine();

		// if yes, displays the scene and prompts for what scene to watch
		if (answer.equalsIgnoreCase("yes")) {
			movies.get(selection-1).play();
//			selectScene(movies, scanner, selection);	
		}

	}
	
	public static int selectMovie(ArrayList<Movie> movies, Scanner scanner) {
		// asks the user what movie they want to watch and stores the answer in a var
		boolean cont = true;
		int selection = 0;
		System.out.println("Please select a movie you want to watch: ");
		do {
			try {
				selection = scanner.nextInt();
				if (selection <= movies.size() && selection > 0) {
					cont = false;
				}
				else {
					System.out.println("Please enter a valid number.");
				}
			}catch(InputMismatchException e) {
				System.out.println("Please try again, enter a valid number.");
				scanner.next();
			}

		}while(cont);		
		
		scanner.nextLine();
		movies.get(selection - 1).printInfo();
		return selection;
	}
	

}
