package nl.altindag.random;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;

import java.security.SecureRandom;
import java.util.UUID;

@Controller
public class RandomController {

    @FXML
    private TextField randomUUIDOutputField;
    @FXML
    private TextField randomHashOutputField;
    @FXML
    private TextField randomNumberOutputField;
    private SecureRandom random;

    @Autowired
    public RandomController(SecureRandom random) {
        this.random = random;
    }

    @FXML
    public void getRandomNumber() {
        String aRandomNumber = String.valueOf(random.nextInt(999999999));

        randomNumberOutputField.setText(aRandomNumber);
        randomUUIDOutputField.setText(UUID.randomUUID().toString());
        randomHashOutputField.setText(BCrypt.hashpw(aRandomNumber, BCrypt.gensalt()));
    }

}
