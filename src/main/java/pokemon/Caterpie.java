package pokemon;

 public class Caterpie implements IPokemon
 {
        private String name = null;
        public String getName() { return name; }
        @Override
        public Caterpie clone() throws CloneNotSupportedException {
            System.out.println("Cloning Caterpie object..");
            return (Caterpie) super.clone();
        }
        @Override
        public String toString() {
            return "Caterpie";
        }
}