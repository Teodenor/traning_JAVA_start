import java.util.Random;
import java.util.Scanner;

public class Controller {

    private final int MAX_RAND=100;
    private Model model;
    private Random random;

    public Controller(){
        this.random=new Random();
        this.model=new Model(this.getRandInt());
    }

    public void begin() {
        System.out.println(this.model.getNumber());
    }

    private  int getRandInt(){
        return this.random.nextInt(this.MAX_RAND);
    }
}
