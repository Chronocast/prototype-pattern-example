package pokemon;

 public class Dragonair implements IPokemon
 {
        private String name = null;
        public String getName() { return name; }
        @Override
        public Dragonair clone() throws CloneNotSupportedException {
            System.out.println("Cloning Dragonair object..");
            return (Dragonair) super.clone();
        }
        @Override
        public String toString() {
            return "Dragonair";
        }
}