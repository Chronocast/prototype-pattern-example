package pokemon;

 public class Kabutops implements IPokemon
 {
        private String name = null;
        public String getName() { return name; }
        @Override
        public Kabutops clone() throws CloneNotSupportedException {
            System.out.println("Cloning Kabutops object..");
            return (Kabutops) super.clone();
        }
        @Override
        public String toString() {
            return "Kabutops";
        }
}