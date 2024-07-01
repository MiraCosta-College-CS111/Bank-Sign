public class Main {
    private int age;
    private String name;
    private double balance;

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the Main class
     *
     * @param age age of the main class
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public static int convertFtoC(int temperatureF) {
        return Integer.MIN_VALUE;
    }
}