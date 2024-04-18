package ls.ls24;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    IModel m;
    UI ui;
    Controller(IModel m){
        ui=new UI(this);
        this.m=m;
    }
    public void click(){
        m.print();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        click();
    }
}