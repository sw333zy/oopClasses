public class Mouse extends Animal {
    public Mouse() {
        //super();
        System.out.println("A mouse runs out its hole...");
    }


    public String runs() {
        return "A mouse runs...";
    }

    @Override
    public String eat() {
        return "A mouse eats cheese...";
    }

}
