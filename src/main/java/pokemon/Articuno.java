package pokemon;

 public class Articuno implements IPokemon
 {
        private String name = null;
        public String getName() { return name; }
        @Override
        public Articuno clone() throws CloneNotSupportedException {
            System.out.println("Cloning Articuno object..");
            return (Articuno) super.clone();
        }
        @Override
        public String toString() {
            return "Articuno";
        }
}