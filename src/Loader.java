import javax.swing.*;

public class Loader {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Our first window application");
        frame.setVisible(true);
        System.out.println("Вывод в консоль");

    }
}
