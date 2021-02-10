import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class SummaFrame extends Frame {
    SummaFrame(){
        setTitle("Sum of two numbers");
        setLayout(null);
        Label IntA=new Label("a");
        Label IntB=new Label("b");
        Label IntSum=new Label("sum");

        IntA.setBounds(70, 55, 80, 20);
        IntB.setBounds(70, 85, 80, 20);
        IntSum.setBounds(70, 115, 80, 20);

        TextField a=new TextField();
        TextField b=new TextField();
        TextField sum=new TextField();
        a.setBounds(110,55, 80, 20);
        b.setBounds(110,85,80,20);
        sum.setBounds(110,115,80,20);

        Button calc=new Button("Calculate");
        Button clear=new Button("clear");
        calc.setBounds(110,150,80,30);
        clear.setBounds(110,180,80,30);

        calc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double NumA=Double.parseDouble(a.getText());
                double NumB=Double.parseDouble(b.getText());
                sum.setText(Double.toString(NumA+NumB));
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                a.setText("");
                b.setText("");
                sum.setText("");
            }
        });
        add(calc);
        add(clear);
        add(a);
        add(b);
        add(sum);
        add(IntA);
        add(IntB);
        add(IntSum);
        setSize(320,300);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

    }
    public static void main(String[] args){
        SummaFrame l=new SummaFrame();
    }

}