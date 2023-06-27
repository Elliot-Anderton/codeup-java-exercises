package movies;
import util.Input;

import static movies.MoviesArray.findAll;

public class MoviesApplication {

    public static void selectFiliter (int selection) {
        switch (selection) {
            case 1:
                filiterMovies("drama");
                break;
            case 2:
                filiterMovies("musical");
                break;
            case 3:
                filiterMovies("scifi");
                break;
            case 4:
                filiterMovies("horror");
                break;
            case 5:
                filiterMovies("comedy");
                break;
            case 6:
                filiterMovies("animated");
                break;
            default:
                filiterMovies();
        }
    }

    public static void filiterMovies(String cat) {
        Movie[] movies = findAll();
        int i = 1;
        for (Movie movie : movies) {
            if (movie.getCategorie().equals(cat)) {
                System.out.println(i++ + ". " + movie.getName() + ", " + movie.getCategorie());
            }
        }
    }

    public static void filiterMovies() {
        Movie[] movies = findAll();
        int i = 1;
        for (Movie movie : movies) {
            System.out.println(i++ + ". " + movie.getName() + ", " + movie.getCategorie());
        }
    }



    public static void main(String[] args) {
        Input input = new Input();

        boolean cont;
        int selection = 7;

        do {

            selectFiliter(selection);

            cont = input.yesNo("Would you like to continue?");

            if (cont) {
                System.out.println("""
                        Please Select:
                        1 for drama
                        2 for musical
                        3 for scifi
                        4 for horror
                        5 for comedy
                        6 for animated
                        7 for all movies""");
                selection = input.getInt();
            }
        } while (cont);
    }

}
