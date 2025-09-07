package output;

public class consoleOutput implements OutputStrategy{
    public void output(double result) {
        System.out.println("Result = " + result);
    }
}
