import controller.Controller;
import view.Interface;

public class MainClass {
    public static void main(String[] args){
        Interface mainView = new Interface();
        Controller controller = new Controller(mainView);
        mainView.setVisible(true);
    }
}
