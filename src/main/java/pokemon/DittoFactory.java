package pokemon;

import java.util.Map;

import static pokemon.DittoFactory.PokemonType.POKEMONS;

public class DittoFactory
{
    public static class PokemonType
    {
        public static final String[] POKEMONNAMES = {"bulbasaur","ivysaur","venusaur","charmander","charmeleon","charizard",
                "squirtle","wartortle","blastoise","caterpie","metapod","butterfree","weedle","kakuna","beedrill",
                "pidgey","pidgeotto","pidgeot", "rattata","raticate","spearow","fearow","ekans","arbok","pikachu",
                "raichu","sandshrew","sandslash", "nidoran♀","nidorina","nidoqueen","nidoran♂","nidorino","nidoking",
                "clefairy","clefable","vulpix", "ninetales","jigglypuff","wigglytuff","zubat","golbat","oddish","gloom",
                "vileplume","paras","parasect", "venonat","venomoth","diglett","dugtrio","meowth","persian","psyduck",
                "golduck","mankey","primeape", "growlithe","arcanine","poliwag","poliwhirl","poliwrath","abra",
                "kadabra","alakazam","machop", "machoke","machamp","bellsprout","weepinbell","victreebel","tentacool",
                "tentacruel","geodude", "graveler","golem","ponyta","rapidash","slowpoke","slowbro","magnemite",
                "magneton","farfetch’d","doduo", "dodrio","seel","dewgong","grimer","muk","shellder","cloyster",
                "gastly","haunter","gengar","onix", "drowzee","hypno","krabby","kingler","voltorb","electrode",
                "exeggcute","exeggutor","cubone","marowak", "hitmonlee","hitmonchan","lickitung","koffing","weezing",
                "rhyhorn","rhydon","chansey","tangela", "kangaskhan","horsea","seadra","goldeen","seaking","staryu",
                "starmie","mr. mime","scyther","jynx", "electabuzz","magmar","pinsir","tauros","magikarp","gyarados",
                "lapras","ditto","eevee","vaporeon", "jolteon","flareon","porygon","omanyte","omastar","kabuto",
                "kabutops","aerodactyl","snorlax","articuno","zapdos","moltres","dratini","dragonair","dragonite",
                "mewtwo","mew"};
        public static final IPokemon[] POKEMONS = {Bulbasaur::new,Ivysaur::new,Venusaur::new,Charmander::new,Charmeleon::new,Charizard::new,Squirtle::new,Wartortle::new,Blastoise::new,
                Caterpie::new, Metapod::new,Butterfree::new,Pikachu::new,Psyduck::new,Scyther::new,Mewtwo::new,Mew::new};
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
