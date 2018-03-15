package pokemon;

import java.util.Map;

import static pokemon.DittoFactory.PokemonType.POKEMONS;

public class DittoFactory
{
    public static class PokemonType
    {
        public static final String[] POKEMONNAMES = {"charmander", "pikachu", "scyther"};
        public static final IPokemon[] POKEMONS = {Charmander::new, Pikachu::new, Scyther::new};
    }

    private static Map<String, IPokemon> prototypes = new java.util.HashMap<>();

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
