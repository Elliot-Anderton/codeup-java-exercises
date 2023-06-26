public class ServerNameGenerator {
    public static String getName(String[] arr1, String[] arr2){
        return
                arr1[(int)Math.floor(Math.random() * (10))] + "-" +
                        arr2[(int)Math.floor(Math.random() * (10))];
    }


    public static void main(String[] args) {
        String[] adjectives = {"adorable", "adventurous", "aggressive", "agreeable", "alert", "alive", "amused", "angry", "annoyed", "annoying"};

        String[] nouns = {"time", "person", "year", "way", "day", "thing", "man", "world", "life", "hand"};


        String newName =  getName (adjectives, nouns);
        System.out.println(newName);
    }


}
