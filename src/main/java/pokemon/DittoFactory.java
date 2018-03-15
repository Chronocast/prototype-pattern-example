package pokemon;

import javax.swing.*;

public class DittoFactory
{
    public static class PokemonType
    {
        public static final String PIKACHU = "pikachu";
    }

    private static java.util.Map<String, IPokemon> prototypes = new java.util.HashMap<String, IPokemon>();

    static
    {
        prototypes.put(PokemonType.PIKACHU, new Pikachu());
    }

    public static IPokemon getInstance(final String s) throws CloneNotSupportedException
    {
        return ((IPokemon) prototypes.get(s)).clone();
    }
}
