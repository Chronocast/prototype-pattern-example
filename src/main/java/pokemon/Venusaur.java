package pokemon;

 public class Venusaur implements IPokemon
 {
        private String name = null;
        public String getName() { return name; }
        @Override
        public Venusaur clone() throws CloneNotSupportedException {
            System.out.println("Cloning Venusaur object..");
            return (Venusaur) super.clone();
        }
        @Override
        public String toString() {
            return "Venusaur";
        }
}