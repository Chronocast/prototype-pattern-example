package pokemon;

 public class Charmander implements IPokemon
 {
        private String name = null;
        public String getName() { return name; }
        @Override
        public Charmander clone() throws CloneNotSupportedException {
            System.out.println("Cloning Charmander object..");
            return (Charmander) super.clone();
        }
        @Override
        public String toString() {
            return "Charmander";
        }
}