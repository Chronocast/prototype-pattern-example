package pokemon;

 public class Ivysaur implements IPokemon
 {
        private String name = null;
        public String getName() { return name; }
        @Override
        public Ivysaur clone() throws CloneNotSupportedException {
            System.out.println("Cloning Ivysaur object..");
            return (Ivysaur) super.clone();
        }
        @Override
        public String toString() {
            return "Ivysaur";
        }
}