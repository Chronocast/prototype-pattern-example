package pokemon;

 public class Squirtle implements IPokemon
 {
        private String name = null;
        public String getName() { return name; }
        @Override
        public Squirtle clone() throws CloneNotSupportedException {
            System.out.println("Cloning Squirtle object..");
            return (Squirtle) super.clone();
        }
        @Override
        public String toString() {
            return "Squirtle";
        }
}