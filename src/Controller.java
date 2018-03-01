import java.util.Random;
import java.util.Scanner;

public class Controller {

    private final int MAX_RAND=100;
    private Model model;
    private View view;
    private Random random;

    public Controller(){
        this.random = new Random();
        this.model = new Model();
        this.view = new View();
    }

    public void begin() {
        Scanner scanner = new Scanner(System.in);
        this.view.printMessage(View.WELCOME);
        this.model.setNumber(this.getRandInt());

        int userNumber = inputIntValueWithScanner(scanner);

//        System.out.println("(imba) " + Integer.toString(this.model.getNumber()));

        while (!this.model.isEquals(userNumber)) {
            this.view.printMessage(this.model.isSmaller(userNumber) ? View.IS_SMALLER : View.IS_LARGE);
            this.view.printMessage(View.TRY_AGAIN);
            userNumber = inputIntValueWithScanner(scanner);
        }

        this.view.printMessage(View.CONGRATULATION);
    }

    public int inputIntValueWithScanner(Scanner sc) {
        this.view.printMessage(View.ENTER);
        while( ! sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }

    private int getRandInt(){
        this.view.printMessage(View.WAIT);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this.random.nextInt(this.MAX_RAND);
    }
}
