package nl.altindag.random;

import java.util.Random;
import java.util.UUID;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Component;

@Component
public class Controller {

    @FXML
    private TextField randomUUIDOutputField;
    @FXML
    private TextField randomHashOutputField;
    @FXML
    private TextField randomNumberOutputField;
    private Random random;

    @Autowired
    public Controller(Random random) {
        this.random = random;
    }

    @FXML
    public void getRandomNumber() throws InterruptedException {
        int aRandomNumber = random.nextInt(999999999);
        randomNumberOutputField.setText(String.valueOf(aRandomNumber));
        randomHashOutputField.setText(BCrypt.hashpw(String.valueOf(aRandomNumber), BCrypt.gensalt()));
        randomUUIDOutputField.setText(UUID.randomUUID().toString());
    }

}
