public class Dog extends Animal {
        public Dog() {
            super();
            System.out.println("Now I am a Dog!");
        }


        public String woof() {
            return "woof woof...";
        }

        @Override
        public String sleep() {
            return "A dog sleeps outside...";
        }

       @Override
        public String eat() {
            return "A dog eats...";
        }

}
