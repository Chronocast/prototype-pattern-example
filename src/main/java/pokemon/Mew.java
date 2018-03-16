package pokemon;

 public class Mew implements IPokemon
 {
        private String name = null;
        public String getName() { return name; }
        @Override
        public Mew clone() throws CloneNotSupportedException {
            System.out.println("Cloning Mew object..");
            return (Mew) super.clone();
        }
        @Override
        public String toString() {
            return "Mew";
        }
}