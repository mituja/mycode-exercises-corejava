package exercises.loops;

public class Inversion {

    private String string;

    public Inversion(String string) {
        this.string = string;
    }

    public void invertString() {
        StringBuilder sb = new StringBuilder();
        for (int i = string.length(); i > 0; i--) {
            sb.append(string.charAt(i - 1));
        }
        System.out.println(String.valueOf("string: " + sb));
    }

    public static void main(String[] args) {
        new Inversion("pies").invertString();
    }
}
