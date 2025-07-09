package krishnayt;

public class Shadowing {
    static int x = 99;//This will be availble for all the blocks inside Shadowing Class
    //The above line got shadowed by line 9 below
    public static void main(String[] args) {
        //I can no longer initialize x here cause then it will have error
        System.out.println(x);
        int x = 40;
        System.out.println(x);
        shadow();

    }
    static void shadow(){
        System.out.println(x);
    }
}
