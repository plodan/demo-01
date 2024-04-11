public class Main {
    public static void main(String[] args) {
        boolean passIsValid = true;
        boolean inCarantine = true;

        String message = passIsValid && !inCarantine?
                "Проход открыто":"Проход закрыто";

        System.out.println(message);
    }
}
