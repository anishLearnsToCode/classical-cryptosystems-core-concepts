import java.util.Scanner;

public class StringBuilderExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder(scanner.nextLine());
        builder.append(" hello world");
        System.out.println(builder.toString());
    }
}
