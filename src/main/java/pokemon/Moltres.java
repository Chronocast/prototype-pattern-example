package pokemon;

 public class Moltres implements IPokemon
 {
        private String name = null;
        public String getName() { return name; }
        @Override
        public Moltres clone() throws CloneNotSupportedException {
            System.out.println("Cloning Moltres object..");
            return (Moltres) super.clone();
        }
        @Override
        public String toString() {
            return "Moltres";
        }
}