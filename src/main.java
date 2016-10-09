import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Created by KDK on 09.10.2016.
 */
public class main extends Application {
    public int saveJmak = 0;
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Подключение к gitHub");
        BorderPane pane = new BorderPane();
        Button go = new Button("Jmakni");
        Label label = new Label("It's PO IN RUSSIA");


        pane.setCenter(go);
        //=================
        go.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                saveJmak++;
                label.setText("Новое значение "+ saveJmak);
            }
        });

        //=================


        pane.setTop(label);

        Scene scene = new Scene(pane,800,600);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
