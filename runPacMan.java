import java.awt.EventQueue;
import javax.swing.JFrame;

public class runPacMan extends JFrame {

    public runPacMan() {

        initUI();
    }

    private void initUI() {

        add(new Board());

        setTitle("Pacman");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(380, 420);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            runPacMan ex = new runPacMan();
            ex.setVisible(true);
        });
    }
}