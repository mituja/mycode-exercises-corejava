package exercises.palindrom;

public class Palindrom {

    public boolean isPalindrom(String text){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <text.length(); i++) {
            sb.append(text.charAt(i));
        }

        String reversedText = String.valueOf(sb.reverse());

        if (reversedText.equals(text)){
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        System.out.println(new Palindrom().isPalindrom("kajak"));
        System.out.println(new Palindrom().isPalindrom("witam"));
    }
}
