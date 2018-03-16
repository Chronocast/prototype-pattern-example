package pokemon;

 public class Growlithe implements IPokemon
 {
        private String name = null;
        public String getName() { return name; }
        @Override
        public Growlithe clone() throws CloneNotSupportedException {
            System.out.println("Cloning Growlithe object..");
            return (Growlithe) super.clone();
        }
        @Override
        public String toString() {
            return "Growlithe";
        }
}