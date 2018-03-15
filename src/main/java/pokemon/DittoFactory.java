package pokemon;

import javax.swing.*;

import static pokemon.DittoFactory.PokemonType.POKEMONS;

public class DittoFactory
{
    public static class PokemonType
    {
        //put in array
        //public static final String PIKACHU = "pikachu";
        //public static final String CHARMANDER = "charmander";

        public static final String[] POKEMONNAMES = {"charmander", "pikachu", "scyther"};
        public static final IPokemon[] POKEMONS = {Charmander::new, Pikachu::new, Scyther::new};
    }

    private static java.util.Map<String, IPokemon> prototypes = new java.util.HashMap<>();

    static
    {
        //loop over array add all
        for (int i = 0; i < POKEMONS.length; i++)
        {
            prototypes.put(PokemonType.POKEMONNAMES[i],POKEMONS[i]);
        }
    }

    public static IPokemon getInstance(final String s) throws CloneNotSupportedException
    {
        return ( prototypes.get(s)).clone();
    }
}
