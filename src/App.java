import com.customchar.MyChar;

public class App {
    public static void main(String[] args) throws Exception {
        MyChar aChar = new MyChar('8');

        System.out.println(aChar.isDigit());
        System.out.println(aChar.isVowel());
    }
}
