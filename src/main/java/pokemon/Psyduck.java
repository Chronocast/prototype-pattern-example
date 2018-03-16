package pokemon;

 public class Psyduck implements IPokemon
 {
        private String name = null;
        public String getName() { return name; }
        @Override
        public Psyduck clone() throws CloneNotSupportedException {
            System.out.println("Cloning Psyduck object..");
            return (Psyduck) super.clone();
        }
        @Override
        public String toString() {
            return "Psyduck";
        }
}