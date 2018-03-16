package pokemon;

import java.util.Map;

import static pokemon.DittoFactory.PokemonType.POKEMONS;

public class DittoFactory
{
    public static class PokemonType
    {
        public static final String[] POKEMONNAMES = {"bulbasaur","ivysaur","venusaur","charmander","charmeleon","charizard",
                "squirtle","wartortle","blastoise","caterpie","metapod","butterfree","pikachu","psyduck","growlithe","arcanine",
                "scyther","tauros","kabutops","snorlax","mewtwo","mew"};
        public static final IPokemon[] POKEMONS = {Bulbasaur::new,Ivysaur::new,Venusaur::new,Charmander::new,Charmeleon::new,Charizard::new,Squirtle::new,Wartortle::new,Blastoise::new,
                Caterpie::new, Metapod::new,Butterfree::new,Pikachu::new,Psyduck::new,Growlithe::new,Arcanine::new,Scyther::new,Tauros::new,Kabutops::new,Snorlax::new,Mewtwo::new,Mew::new};
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
