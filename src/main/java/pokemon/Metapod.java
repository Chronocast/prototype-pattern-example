package pokemon;

 public class Metapod implements IPokemon
 {
        private String name = null;
        public String getName() { return name; }
        @Override
        public Metapod clone() throws CloneNotSupportedException {
            System.out.println("Cloning Metapod object..");
            return (Metapod) super.clone();
        }
        @Override
        public String toString() {
            return "Metapod";
        }
}