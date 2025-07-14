import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);

        // Load your .gif files
        Image img1 = new Image("flag1.gif");
        Image img2 = new Image("flag2.gif");
        Image img3 = new Image("flag6.gif");
        Image img4 = new Image("flag7.gif");

        // Wrap each in an ImageView
        ImageView iv1 = new ImageView(img1);
        ImageView iv2 = new ImageView(img2);
        ImageView iv3 = new ImageView(img3);
        ImageView iv4 = new ImageView(img4);

        // Optionally resize uniformly
        double fitWidth = 200;
        for (ImageView iv : new ImageView[]{iv1, iv2, iv3, iv4}) {
            iv.setFitWidth(fitWidth);
            iv.setPreserveRatio(true);
        }

        // Place them in a 2×2 GridPane
        pane.add(iv1, 0, 0);
        pane.add(iv2, 1, 0);
        pane.add(iv3, 0, 1);
        pane.add(iv4, 1, 1);

        // Center each image
        GridPane.setHalignment(iv1, HPos.CENTER);
        GridPane.setHalignment(iv2, HPos.CENTER);
        GridPane.setHalignment(iv3, HPos.CENTER);
        GridPane.setHalignment(iv4, HPos.CENTER);
        GridPane.setValignment(iv1, VPos.CENTER);
        GridPane.setValignment(iv2, VPos.CENTER);
        GridPane.setValignment(iv3, VPos.CENTER);
        GridPane.setValignment(iv4, VPos.CENTER);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Display Four GIF Flags");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

}
