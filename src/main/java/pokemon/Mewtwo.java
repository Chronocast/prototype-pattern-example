package pokemon;

 public class Mewtwo implements IPokemon
 {
        private String name = null;
        public String getName() { return name; }
        @Override
        public Mewtwo clone() throws CloneNotSupportedException {
            System.out.println("Cloning Mewtwo object..");
            return (Mewtwo) super.clone();
        }
        @Override
        public String toString() {
            return "Mewtwo";
        }
}