class Main {
  static int numMethod(int a, int b)
    {
        return a+b;
    }
    static double numMethod(double a, double b)
    {
        return a-b;
    }
    public static void main(String[] args) {
        int num1 = numMethod(10, 5);
        double num2 = numMethod(75.543, 30.123);
        System.out.println("Num1 is: "+ num1);
        System.out.println("Num2 is: "+ num2);
    }
}