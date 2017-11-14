package lesson5OOP.Work2;

public class Main {

    public static void main(String[] args) {

        MyReader reader = new MyReaderImpl();
        String getText = reader.someRead();
        StringBuilder newText = new StringBuilder();

        for (int i = 0; i < getText.length(); i++) {
            if (getText.charAt(i) == '(') {
                newText.append(')');
            } else {
                newText.append(getText.charAt(i));
            }
        }
        System.out.println(newText);
    }
}
