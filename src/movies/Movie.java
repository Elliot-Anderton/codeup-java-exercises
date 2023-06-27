package movies;

public class Movie {
    private String name;
    private String categorie;

    public Movie(String newname, String newcategorie) {
        name = newname;
        categorie = newcategorie;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCategorie() {
        return categorie;
    }
}
