package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

//        System.out.println("please enter a string");
//        String userInput = input.getString();
//        System.out.println(userInput);
//
//        System.out.println("would you like to continue?");
//        boolean cont = input.yesNo();
//        System.out.println(cont);
//
//        int userNum = input.getInt(4, 24);
//        System.out.println(userNum);
//
//        int num2 = input.getInt();
//        System.out.println(num2);
//
        double userdoub = input.getDouble(3.14, 28.9945);
        System.out.println(userdoub);
//
//        double doub2 = input.getDouble();
//        System.out.println(doub2);
    }
}
