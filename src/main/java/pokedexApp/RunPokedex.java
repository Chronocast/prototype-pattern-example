package pokedexApp;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import pokemon.DittoFactory;
import pokemon.IPokemon;

import java.util.ArrayList;
import java.util.List;

public class RunPokedex extends Application
{

    private Stage stage;
    private ScrollPane scrollPane = new ScrollPane();
    private List<IPokemon> newMyPokemon = new ArrayList<>();
    private int pkmnCount = 0;
    ListView pokemonList;
    ObservableList<String> items;
    ObservableList<IPokemon> pokemonObservableList;

    private final Image IMG_BULBASAUR = new Image("img/bulbasaur.jpg");
    private final Image IMG_IVYSAUR = new Image("img/ivysaur.jpg");
    private final Image IMG_VENUSAUR = new Image("img/venusaur.jpg");
    private final Image IMG_CHARMANDER = new Image("img/charmander.jpg");
    private final Image IMG_CHARMELEON = new Image("img/charmeleon.jpg");
    private final Image IMG_CHARIZARD = new Image("img/charizard.jpg");
    private final Image IMG_SQUIRTLE = new Image("img/squirtle.jpg");
    private final Image IMG_WARTORTLE = new Image("img/wartortle.jpg");
    private final Image IMG_BLASTOISE = new Image("img/blastoise.jpg");
    private final Image IMG_CATERPIE = new Image("img/caterpie.jpg");
    private final Image IMG_METAPOD = new Image("img/metapod.jpg");
    private final Image IMG_BUTTERFREE = new Image("img/butterfree.jpg");
    private final Image IMG_PIKACHU = new Image("img/pikachu.jpg");
    private final Image IMG_PSYDUCK = new Image("img/psyduck.jpg");
    private final Image IMG_GROWLITHE = new Image("img/growlithe.jpg");
    private final Image IMG_ARCANINE = new Image("img/arcanine.jpg");
    private final Image IMG_SCYTHER = new Image("img/scyther.jpg");
    private final Image IMG_KABUTOPS = new Image("img/kabutops.jpg");
    private final Image IMG_SNORLAX = new Image("img/snowlax.jpg");
    private final Image IMG_MEWTWO = new Image("img/mewtwo.jpg");
    private final Image IMG_MEW = new Image("img/mew.jpg");


    private Image[] listOfImages = {IMG_BULBASAUR, IMG_IVYSAUR, IMG_VENUSAUR, IMG_CHARMANDER, IMG_CHARMELEON, IMG_CHARIZARD,
            IMG_SQUIRTLE, IMG_WARTORTLE, IMG_BLASTOISE, IMG_CATERPIE, IMG_METAPOD, IMG_BUTTERFREE,IMG_PIKACHU,IMG_PSYDUCK,IMG_SCYTHER,
    IMG_GROWLITHE,IMG_ARCANINE,IMG_KABUTOPS,IMG_SNORLAX,IMG_MEWTWO, IMG_MEW};

    public void start(Stage stage) throws Exception
    {
        stage.setTitle("Gotta Catch 'em All!");
        stage.getIcons().add(new Image("img/pokedexicon.png"));
        stage.setScene(StartScreen());
        stage.show();
    }

    public Scene StartScreen()
    {
        VBox vox = new VBox();

        vox.setAlignment(Pos.CENTER);
        vox.setPadding(new Insets(10));

        BorderPane borderPane = new BorderPane();

        borderPane.setLeft(westPane());
        borderPane.setRight(eastPane());

        vox.getChildren().add(borderPane);

        return new Scene(vox, 1024, 768);
    }

    private Pane westPane()
    {
        VBox westPanel = new VBox();
        westPanel.setAlignment(Pos.CENTER);
        westPanel.setSpacing(10);
        westPanel.setId("west");

        ImageView dittoView = new ImageView();
        Image ditto = new Image("img/ditto.png");
        dittoView.setImage(ditto);

        Label comboLabel = new Label("Which Pokemon should Ditto clone?");

        ComboBox pokemonSelector = comboBuild();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("I'm a ditto!");
        alert.setHeaderText(null);

        dittoView.setOnMouseClicked((MouseEvent e) -> {
            String selectedPokemon = pokemonSelector.getValue().toString();
            try{
                IPokemon pokemonPrototype = DittoFactory.getInstance(selectedPokemon);
                System.out.println(pokemonPrototype);
                newMyPokemon.add(pokemonPrototype);
                System.out.println(newMyPokemon);
                pokemonObservableList.add(pokemonPrototype);
            } catch (CloneNotSupportedException err){
                err.printStackTrace();
            }
        });

        westPanel.getChildren().add(dittoView);
        westPanel.getChildren().add(comboLabel);
        westPanel.getChildren().add(pokemonSelector);

        return westPanel;
    }

    private Pane eastPane()
    {
        VBox eastPanel = new VBox();
        eastPanel.setAlignment(Pos.CENTER);
        eastPanel.setSpacing(10);
        eastPanel.setId("east");

        ScrollPane scrollPane = new ScrollPane();

        ArrayList<IPokemon> theListedPokemon = new ArrayList<>();

        theListedPokemon.addAll(newMyPokemon);

        pokemonObservableList = FXCollections.observableArrayList(theListedPokemon);

        pokemonList = new ListView(pokemonObservableList);

        pokemonList.setItems(pokemonObservableList);

        pokemonList.setCellFactory(param -> new ListCell<IPokemon>()
        {
            private ImageView imageView = new ImageView();
            public void updateItem(IPokemon name, boolean empty)
            {
                super.updateItem(name, empty);
                if (empty) {
                    setText(null);
                    setGraphic(null);
                } else {
                    if(name.toString().equals("Bulbasaur"))
                        imageView.setImage(listOfImages[0]);
                    else if(name.toString().equals("Ivysaur"))
                        imageView.setImage(listOfImages[1]);
                    else if(name.toString().equals("Venusaur"))
                        imageView.setImage(listOfImages[2]);
                    else if(name.toString().equals("Charmander"))
                        imageView.setImage(listOfImages[3]);
                    else if(name.toString().equals("Charmeleon"))
                        imageView.setImage(listOfImages[4]);
                    else if(name.toString().equals("Charizard"))
                        imageView.setImage(listOfImages[5]);
                    else if(name.toString().equals("Squirtle"))
                        imageView.setImage(listOfImages[6]);
                    else if(name.toString().equals("Wartortlte"))
                        imageView.setImage(listOfImages[7]);
                    else if(name.toString().equals("Blastoise"))
                        imageView.setImage(listOfImages[8]);
                    else if(name.toString().equals("Caterpie"))
                        imageView.setImage(listOfImages[9]);
                    else if(name.toString().equals("Metapod"))
                        imageView.setImage(listOfImages[10]);
                    else if(name.toString().equals("Butterfree"))
                        imageView.setImage(listOfImages[11]);
                    else if(name.toString().equals("Pikachu"))
                        imageView.setImage(listOfImages[12]);
                    else if(name.toString().equals("Psyduck"))
                        imageView.setImage(listOfImages[13]);
                    else if(name.toString().equals("Growlithe"))
                        imageView.setImage(listOfImages[14]);
                    else if(name.toString().equals("Arcanine"))
                        imageView.setImage(listOfImages[15]);
                    else if(name.toString().equals("Scyther"))
                        imageView.setImage(listOfImages[124]);
                    else if(name.toString().equals("Kabutops"))
                        imageView.setImage(listOfImages[142]);
                    else if(name.toString().equals("Snorlax"))
                        imageView.setImage(listOfImages[144]);
                    else if(name.toString().equals("Mewtwo"))
                        imageView.setImage(listOfImages[151]);
                    else if(name.toString().equals("Mew"))
                        imageView.setImage(listOfImages[152]);
                    setText(name.toString());
                    setGraphic(imageView);
                }
            }
        });

        pokemonList.setPrefHeight(550);
        pokemonList.setPrefWidth(400);

        HBox pokeBox = new HBox(pokemonList);

        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);

        eastPanel.getChildren().add(pokeBox);

        return eastPanel;
    }

    private ComboBox<String> comboBuild()
    {
        items = FXCollections.observableArrayList("bulbasaur","ivysaur","venusaur","charmander","charmeleon","charizard",
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
                "mewtwo","mew"
        );

        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.setPromptText("Clone a Pokemon");
        comboBox.getItems().addAll(items);

        return comboBox;
    }
}
