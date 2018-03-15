package pokemon;

 public class Pikachu implements IPokemon
 {
        private String name = null;
        public String getName() { return name; }
        @Override
        public Pikachu clone() throws CloneNotSupportedException {
            System.out.println("Cloning Pikachu object..");
            return (Pikachu) super.clone();
        }
        @Override
        public String toString() {
            return "Pikachu";
        }
}