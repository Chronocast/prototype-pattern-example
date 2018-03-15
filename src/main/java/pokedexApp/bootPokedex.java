package pokedexApp;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import pokemon.Pokemon;

import java.util.List;

public class bootPokedex extends Application
{
    private Stage stage;

    public void start(Stage stage) throws Exception
    {
        stage.setTitle("Gotta Catch 'em All!");
        stage.getIcons().add(new Image("img/pokedexicon.png"));
        stage.setScene(StartScreen());
        stage.show();
    }

    public Scene StartScreen()
    {
        VBox vox = viewBuilder();

        BorderPane borderPane = mainPane();

        vox.getChildren().add(borderPane);

        return new Scene(vox, 800, 600);
    }

    private VBox viewBuilder()
    {
        VBox tempVox = new VBox();

        tempVox.setAlignment(Pos.CENTER);
        tempVox.setPadding(new Insets(10));

        return tempVox;
    }

    private BorderPane mainPane()
    {
        BorderPane thePane = new BorderPane();

        thePane.setLeft(westPane());
        thePane.setRight(eastPane());

        return thePane;
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

//            final URL resource = getClass().getResource("img/ditto.mp3");
//            final AudioClip clip = new AudioClip(resource.toString());
//            clip.play(1.0);
            Object selectedPokemon = pokemonSelector.getValue();
            alert.setContentText("Cloning into " + selectedPokemon);
            alert.showAndWait();


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
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        scrollPane.setPrefHeight(550);
        scrollPane.setPrefWidth(325);

        Pokemon pokemons = new Pokemon();

        List<Pokemon> pokeList = pokemons.loadData();



        eastPanel.getChildren().add(scrollPane);

        return eastPanel;
    }

    private Pane northPane()
    {
        return new Pane();
    }

    private Pane southPane()
    {
//        Button button = new Button();

//        button.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent e) {
//                if (emailComboBox.getValue() != null &&
//                        !emailComboBox.getValue().toString().isEmpty()){
//                    notification.setText("Your message was successfully sent"
//                            + " to " + address);
//                    emailComboBox.setValue(null);
//                    if (priorityComboBox.getValue() != null &&
//                            !priorityComboBox.getValue().toString().isEmpty()){
//                        priorityComboBox.setValue(null);
//                    }
//                    subject.clear();
//                    text.clear();
//                }
//                else {
//                    notification.setText("You have not selected a recipient!");
//                }
//            }
//        });

        return new Pane();
    }

    private ComboBox<String> comboBuild()
    {
        //do I really need a final?
        //final String[] cloningSubject = {" "};

//        final ComboBox<String> comboBox = new ComboBox<String>();
//        comboBox.getItems().addAll(
                ObservableList<String> items = FXCollections.observableArrayList("bulbasaur","ivysaur","venusaur","charmander","charmeleon","charizard",
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

        ComboBox comboBox = new ComboBox();
        comboBox.setPromptText("Clone a Pokemon");
        comboBox.getItems().addAll(items);

//        comboBox.setEditable(true);
//        comboBox.valueProperty().addListener((observable, oldValue, newValue) ->
//                cloningSubject[0] = newValue);
        return comboBox;
    }
}
