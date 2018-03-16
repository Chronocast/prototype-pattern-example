package pokemon;

 public class Arcanine implements IPokemon
 {
        private String name = null;
        public String getName() { return name; }
        @Override
        public Arcanine clone() throws CloneNotSupportedException {
            System.out.println("Cloning Arcanine object..");
            return (Arcanine) super.clone();
        }
        @Override
        public String toString() {
            return "Arcanine";
        }
}