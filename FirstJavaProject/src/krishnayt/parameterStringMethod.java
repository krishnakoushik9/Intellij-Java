package krishnayt;

public class parameterStringMethod {
    public static void main(String[] args) {
        String personalised = myGreet("Krishna");
        System.out.println(personalised);
    }

    static String myGreet(String name) {
        String message = "Hello "+ name;
        return message;
    }


}
