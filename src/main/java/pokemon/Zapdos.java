package pokemon;

 public class Zapdos implements IPokemon
 {
        private String name = null;
        public String getName() { return name; }
        @Override
        public Zapdos clone() throws CloneNotSupportedException {
            System.out.println("Cloning Zapdos object..");
            return (Zapdos) super.clone();
        }
        @Override
        public String toString() {
            return "Zapdos";
        }
}