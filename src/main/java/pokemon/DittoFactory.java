package pokemon;

import javax.swing.*;

public class DittoFactory
{
    public static class PokemonType
    {
        //put in array
        public static final String PIKACHU = "pikachu";
        public static final String CHARMANDER = "charmander";

    }

    private static java.util.Map<String, IPokemon> prototypes = new java.util.HashMap<>();

    static
    {
        //loop over array add all
        prototypes.put(PokemonType.PIKACHU, new Pikachu());
    }

    public static IPokemon getInstance(final String s) throws CloneNotSupportedException
    {
        return ( prototypes.get(s)).clone();
    }
}
