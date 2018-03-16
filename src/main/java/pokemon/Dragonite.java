package pokemon;

 public class Dragonite implements IPokemon
 {
        private String name = null;
        public String getName() { return name; }
        @Override
        public Dragonite clone() throws CloneNotSupportedException {
            System.out.println("Cloning Dragonite object..");
            return (Dragonite) super.clone();
        }
        @Override
        public String toString() {
            return "Dragonite";
        }
}