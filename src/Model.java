public class Model {
    private int number;

    public Model(){
        this.number = 0;
    }

    public boolean isEquals(int number) {
        return this.number == number;
    }

    public boolean isSmaller(int number) {
        return this.number < number;
    }

    public void setNumber (int number){
        this.number=number;
    }

    public int getNumber() {
        return number;
    }
}
