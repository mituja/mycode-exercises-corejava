package exercises.interfaces;

public class Addition implements Computation, Witam {

    @Override
    public void witamSie() {
        System.out.println("Witam");
    }

    @Override
    public double compute(double argument1, double argument2) {
        return argument1 + argument2;
    }
}
