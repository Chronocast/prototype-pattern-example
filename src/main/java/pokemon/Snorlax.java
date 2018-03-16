package pokemon;

 public class Snorlax implements IPokemon
 {
        private String name = null;
        public String getName() { return name; }
        @Override
        public Snorlax clone() throws CloneNotSupportedException {
            System.out.println("Cloning Snorlax object..");
            return (Snorlax) super.clone();
        }
        @Override
        public String toString() {
            return "Snorlax";
        }
}