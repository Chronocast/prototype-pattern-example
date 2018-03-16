package pokemon;

 public class Tauros implements IPokemon
 {
        private String name = null;
        public String getName() { return name; }
        @Override
        public Tauros clone() throws CloneNotSupportedException {
            System.out.println("Cloning Tauros object..");
            return (Tauros) super.clone();
        }
        @Override
        public String toString() {
            return "Tauros";
        }
}