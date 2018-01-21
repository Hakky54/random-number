package nl.altindag.random;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;

import java.util.Random;
import java.util.UUID;

@Controller
public class RandomController {

    @FXML
    private TextField randomUUIDOutputField;
    @FXML
    private TextField randomHashOutputField;
    @FXML
    private TextField randomNumberOutputField;
    private Random random;

    @Autowired
    public RandomController(Random random) {
        this.random = random;
    }

    @FXML
    public void getRandomNumber() {
        String aRandomNumber = String.valueOf(random.nextInt(999999999));

        randomNumberOutputField.setText(aRandomNumber);
        randomHashOutputField.setText(BCrypt.hashpw(aRandomNumber, BCrypt.gensalt()));
        randomUUIDOutputField.setText(UUID.randomUUID().toString());
    }

}
