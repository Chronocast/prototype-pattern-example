package pokemon;

public interface IPokemon extends Cloneable
{
    IPokemon clone() throws CloneNotSupportedException;
}
