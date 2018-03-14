package pokedexApp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.net.MalformedURLException;

public class bootPokedex extends Application
{
    private Stage stage;

    public void start(Stage stage) throws Exception
    {
        stage.setTitle("Gotta Catch 'em All!");
//        stage.getIcons().add(new Image(""));
        stage.setScene(StartScreen());
        stage.show();
    }

    public Scene StartScreen() throws MalformedURLException
    {
        VBox vox = new VBox();

        vox.setAlignment(Pos.CENTER);
        vox.setPadding(new Insets(10));

        Image image = new Image(new File("images/pokedex_icon.png").toURI().toURL().toString());
        final ImageView myImageView = new ImageView(image);
        myImageView.setFitWidth(380);
        myImageView.setFitHeight(350);

        vox.getChildren().add(myImageView);

        return new Scene(vox, 800, 600);
    }
}
