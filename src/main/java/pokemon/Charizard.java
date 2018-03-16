package pokemon;

 public class Charizard implements IPokemon
 {
        private String name = null;
        public String getName() { return name; }
        @Override
        public Charizard clone() throws CloneNotSupportedException {
            System.out.println("Cloning Charizard object..");
            return (Charizard) super.clone();
        }
        @Override
        public String toString() {
            return "Charizard";
        }
}