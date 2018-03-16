package pokemon;

 public class Blastoise implements IPokemon
 {
        private String name = null;
        public String getName() { return name; }
        @Override
        public Blastoise clone() throws CloneNotSupportedException {
            System.out.println("Cloning Blastoise object..");
            return (Blastoise) super.clone();
        }
        @Override
        public String toString() {
            return "Blastoise";
        }
}