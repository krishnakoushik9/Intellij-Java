package krishnayt;

public class StringPerformance {
    public static void main(String[] args) {
        String series = "";
        for(int i = 0;i<26;i++){
            char ch = (char)('a' + i);
            series = series + ch;
        }System.out.println(series);
    }
}
