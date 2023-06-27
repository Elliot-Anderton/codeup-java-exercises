public class ServerNameGenerator {

    private final static String[] adjectives = {"adorable", "adventurous", "aggressive", "agreeable", "alert", "alive", "amused", "angry", "annoyed", "annoying"};
    private final static String[] nouns = {"time", "person", "year", "way", "day", "thing", "man", "world", "life", "hand"};

    private static String getName(){
        return
                adjectives[(int)Math.floor(Math.random() * (10))] + "-" +
                        nouns[(int)Math.floor(Math.random() * (10))];
    }


    public static void main(String[] args) {


        String newName =  getName ();
        System.out.println(newName);
    }


}
