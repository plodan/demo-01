public class Main {
    public static void main(String[] args) {
        boolean passIsValid = true;
        boolean inCarantine = true;

        String message = passIsValid && !inCarantine?
                "Проход открыт":"Проход закрыт";

        System.out.println(message);
    }
}
