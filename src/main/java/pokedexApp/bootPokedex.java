//package pokedexApp;
//
//import javafx.application.Application;
//import javafx.application.Platform;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.*;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.input.MouseEvent;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.Pane;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;
//import pokemon.DittoFactory;
//import pokemon.IPokemon;
//import pokemon.Pikachu;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class bootPokedex extends Application
//{
//    private Stage stage;
//    private ScrollPane scrollPane = new ScrollPane();
//    private List<String> myPokemon = new ArrayList<>();
//    private List<IPokemon> newMyPokemon = new ArrayList();
//    private int pkmnCount = 0;
//    ListView pokemonList;
//
//    public void start(Stage stage) throws Exception
//    {
//        stage.setTitle("Gotta Catch 'em All!");
//        stage.getIcons().add(new Image("img/pokedexicon.png"));
//        stage.setScene(StartScreen());
//        stage.show();
//    }
//
//    public Scene StartScreen()
//    {
//        VBox vox = viewBuilder();
//
//        BorderPane borderPane = mainPane();
//
//        vox.getChildren().add(borderPane);
//
//        return new Scene(vox, 800, 600);
//    }
//
//    private VBox viewBuilder()
//    {
//        VBox tempVox = new VBox();
//
//        tempVox.setAlignment(Pos.CENTER);
//        tempVox.setPadding(new Insets(10));
//
//        return tempVox;
//    }
//
//    private BorderPane mainPane()
//    {
//        BorderPane thePane = new BorderPane();
//
//        thePane.setLeft(westPane());
//        thePane.setRight(eastPane());
//        //thePane.setBottom(southPane());
//
//        return thePane;
//    }
//
//    private Pane westPane()
//    {
//        VBox westPanel = new VBox();
//        westPanel.setAlignment(Pos.CENTER);
//        westPanel.setSpacing(10);
//        westPanel.setId("west");
//
//        ImageView dittoView = new ImageView();
//        Image ditto = new Image("img/ditto.png");
//        dittoView.setImage(ditto);
//
//        Label comboLabel = new Label("Which Pokemon should Ditto clone?");
//
//        ComboBox pokemonSelector = comboBuild();
//
//        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//        alert.setTitle("I'm a ditto!");
//        alert.setHeaderText(null);
//
//        dittoView.setOnMouseClicked((MouseEvent e) -> {
//            Object selectedPokemon = pokemonSelector.getValue();
//            alert.setContentText("Cloning into " + selectedPokemon);
//            alert.showAndWait();
//
//            myPokemon.add((String) pokemonSelector.getValue());
//            //System.out.println(pokemonSelector.getValue());
//            //System.out.println(myPokemon);
//            pkmnCount++;
//
//            String nameconverter = pokemonSelector.getValue().toString().toUpperCase();
//
//            System.out.println(nameconverter);
//
//            try
//            {
//                String pokemonPrototype = DittoFactory.getInstance(DittoFactory.PokemonType.PIKACHU).toString();
//                System.out.println(pokemonPrototype);
//                newMyPokemon.add(DittoFactory.getInstance(DittoFactory.PokemonType.PIKACHU));
//                System.out.println(newMyPokemon);
//
//
//            } catch (CloneNotSupportedException err)
//            {
//                err.printStackTrace();
//            }
//        });
//
//        westPanel.getChildren().add(dittoView);
//        westPanel.getChildren().add(comboLabel);
//        westPanel.getChildren().add(pokemonSelector);
//
//        return westPanel;
//    }
//
//    private Pane eastPane()
//    {
//        VBox eastPanel = new VBox();
//        eastPanel.setAlignment(Pos.CENTER);
//        eastPanel.setSpacing(10);
//        eastPanel.setId("east");
//
//        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
//        scrollPane.setPrefHeight(550);
//        scrollPane.setPrefWidth(325);
//
//        //List<String> getPokemonList = myPokemon;
//
//        ArrayList<IPokemon> theListedPokemon = new ArrayList<>();
//
//        theListedPokemon.addAll(newMyPokemon);
//
//        ObservableList<IPokemon> pokemonObservableList = FXCollections.observableArrayList(theListedPokemon);
//
//        pokemonList = new ListView(pokemonObservableList);
//
//        pokemonList.setItems(pokemonObservableList);
//
//        pokemonList.setPrefHeight(550);
//        pokemonList.setPrefWidth(325);
//
//        eastPanel.getChildren().addAll(pokemonList);
//
//        return eastPanel;
//    }
//
//    private Pane northPane()
//    {
//        return new Pane();
//    }
//
////    private Pane southPane()
////    {
////        VBox southPanel = new VBox();
////        southPanel.setAlignment(Pos.BOTTOM_CENTER);
////        southPanel.setSpacing(10);
////        southPanel.setId("east");
////
////        Button button = refresh();
////
////        southPanel.getChildren().add(button);
////
////        return southPanel;
////    }
//
//    private ComboBox<String> comboBuild()
//    {
//        //do I really need a final?
//        //final String[] cloningSubject = {" "};
//
////        final ComboBox<String> comboBox = new ComboBox<String>();
////        comboBox.getItems().addAll(
//                ObservableList<String> items = FXCollections.observableArrayList("bulbasaur","ivysaur","venusaur","charmander","charmeleon","charizard",
//                "squirtle","wartortle","blastoise","caterpie","metapod","butterfree","weedle","kakuna","beedrill",
//                "pidgey","pidgeotto","pidgeot", "rattata","raticate","spearow","fearow","ekans","arbok","pikachu",
//                "raichu","sandshrew","sandslash", "nidoran♀","nidorina","nidoqueen","nidoran♂","nidorino","nidoking",
//                "clefairy","clefable","vulpix", "ninetales","jigglypuff","wigglytuff","zubat","golbat","oddish","gloom",
//                "vileplume","paras","parasect", "venonat","venomoth","diglett","dugtrio","meowth","persian","psyduck",
//                "golduck","mankey","primeape", "growlithe","arcanine","poliwag","poliwhirl","poliwrath","abra",
//                "kadabra","alakazam","machop", "machoke","machamp","bellsprout","weepinbell","victreebel","tentacool",
//                "tentacruel","geodude", "graveler","golem","ponyta","rapidash","slowpoke","slowbro","magnemite",
//                "magneton","farfetch’d","doduo", "dodrio","seel","dewgong","grimer","muk","shellder","cloyster",
//                "gastly","haunter","gengar","onix", "drowzee","hypno","krabby","kingler","voltorb","electrode",
//                "exeggcute","exeggutor","cubone","marowak", "hitmonlee","hitmonchan","lickitung","koffing","weezing",
//                "rhyhorn","rhydon","chansey","tangela", "kangaskhan","horsea","seadra","goldeen","seaking","staryu",
//                "starmie","mr. mime","scyther","jynx", "electabuzz","magmar","pinsir","tauros","magikarp","gyarados",
//                "lapras","ditto","eevee","vaporeon", "jolteon","flareon","porygon","omanyte","omastar","kabuto",
//                "kabutops","aerodactyl","snorlax","articuno","zapdos","moltres","dratini","dragonair","dragonite",
//                "mewtwo","mew"
//        );
//
//        ComboBox<String> comboBox = new ComboBox<>();
//        comboBox.setPromptText("Clone a Pokemon");
//        comboBox.getItems().addAll(items);
//
////        comboBox.setEditable(true);
////        comboBox.valueProperty().addListener((observable, oldValue, newValue) ->
////                cloningSubject[0] = newValue);
//        return comboBox;
//    }
//
//    private Button refresh () {
//        Button refreshButton = new Button("Refresh Pokedex");
//        refreshButton.setId("refresh-btn");
//
//        //When clicked, the Edit Reminders scene will show
//        refreshButton.setOnAction(event -> {  //used lambda expression
//
//            stage.close();
//            //Platform.runLater( () -> new bootPokedex().start( new Stage() ) );
//        });
//
//        return refreshButton;
//    }
//}
