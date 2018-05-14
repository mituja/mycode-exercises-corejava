package exercises.exercises.objects;

public class MyNumber {

    private double number;

    public MyNumber(double number) {
        this.number = number;
    }

    public boolean isOdd(){
        return number % 2 != 0;
    }

    public boolean isEven(){
        return number % 2 == 0;
    }

    public double sqrt(){
        return Math.sqrt(number);
    }

    public MyNumber pow(MyNumber sumeNumber){
        return new MyNumber(Math.pow(number, sumeNumber.number));
    }

    public MyNumber add(MyNumber sumeNumber){
        return new MyNumber(number + sumeNumber.number);
    }

    public MyNumber sutract(MyNumber sumeNumber){
        return new MyNumber(number - sumeNumber.number);
    }
}
