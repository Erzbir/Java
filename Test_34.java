public class Test_34 {
    public static void main(String[] args) {
        System.out.print("输入摄氏温度:");
        double Celsius = Main.input.nextInt();
        double Fahrenheit = (9.0 / 5) * Celsius + 32;
        System.out.println(Fahrenheit);
    }
}
