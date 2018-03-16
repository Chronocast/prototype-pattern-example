package pokemon;

 public class Charmeleon implements IPokemon
 {
        private String name = null;
        public String getName() { return name; }
        @Override
        public Charmeleon clone() throws CloneNotSupportedException {
            System.out.println("Cloning Charmeleon object..");
            return (Charmeleon) super.clone();
        }
        @Override
        public String toString() {
            return "Charmeleon";
        }
}