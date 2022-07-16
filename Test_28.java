public class Test_28 {
    public static void main(String[] args) {
        System.out.print("输入字符串:");
        String str = Main.input.nextLine();
        str = str.trim();
        str = str.replaceAll(" ", "");
        System.out.println(str);
    }
}
