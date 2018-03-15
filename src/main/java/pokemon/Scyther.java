package pokemon;

 public class Scyther implements IPokemon
 {
        private String name = null;
        public String getName() { return name; }
        @Override
        public Scyther clone() throws CloneNotSupportedException {
            System.out.println("Cloning Scyther object..");
            return (Scyther) super.clone();
        }
        @Override
        public String toString() {
            return "Scyther";
        }
}