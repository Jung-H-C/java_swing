import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        panel.add(new JLabel("Welcome this lecture"));
        

        frame.add(panel);
        // panel을 frame안에 삽입
        frame.setResizable(false);
        // frame size 고정 (default:true)
        frame.setVisible(true);
        //  gui를 볼 수 있게함 ( default: false)
        frame.setPreferredSize(new Dimension(840, 840/12*9));
        frame.setSize(840, 840/12*9);
        // frame size 조정
        
        frame.setLocationRelativeTo(null);
        // frame 가운데 출력
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 프로그램 종료시 자바도 종료


        // frame안에 panel을 object처럼 형성
    }
}
