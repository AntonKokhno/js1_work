import javax.swing.*;

public class Hello {
  //this is name of the man
     String name = "Ivan";

     int height = 189;

     /*
     This is main method
     of class Hello
      */
    public static void main(String[] args) {

        System.out.println("Hello World " + args[0]);
        JFrame jFrame = new JFrame("Hello Java");
        jFrame.setSize(800, 600);

        JTextPane jTextPane = new JTextPane();
        jTextPane.setText("I LOVE JAVA");

        jFrame.add(jTextPane);

        jFrame.setVisible(true);
    }
}