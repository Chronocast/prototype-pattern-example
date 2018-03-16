package pokemon;

 public class Butterfree implements IPokemon
 {
        private String name = null;
        public String getName() { return name; }
        @Override
        public Butterfree clone() throws CloneNotSupportedException {
            System.out.println("Cloning Butterfree object..");
            return (Butterfree) super.clone();
        }
        @Override
        public String toString() {
            return "Butterfree";
        }
}