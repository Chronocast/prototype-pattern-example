package pokemon;

 public class Bulbasaur implements IPokemon
 {
        private String name = null;
        public String getName() { return name; }
        @Override
        public Bulbasaur clone() throws CloneNotSupportedException {
            System.out.println("Cloning Bulbasaur object..");
            return (Bulbasaur) super.clone();
        }
        @Override
        public String toString() {
            return "Bulbasaur";
        }
}