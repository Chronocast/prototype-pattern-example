package pokemon;

 public class Dratini implements IPokemon
 {
        private String name = null;
        public String getName() { return name; }
        @Override
        public Dratini clone() throws CloneNotSupportedException {
            System.out.println("Cloning Dratini object..");
            return (Dratini) super.clone();
        }
        @Override
        public String toString() {
            return "Dratini";
        }
}