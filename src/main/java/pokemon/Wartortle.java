package pokemon;

 public class Wartortle implements IPokemon
 {
        private String name = null;
        public String getName() { return name; }
        @Override
        public Wartortle clone() throws CloneNotSupportedException {
            System.out.println("Cloning Wartortle object..");
            return (Wartortle) super.clone();
        }
        @Override
        public String toString() {
            return "Wartortle";
        }
}