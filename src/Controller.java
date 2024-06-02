import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    private static Fisherman Glen = new Fisherman("Glen");
    private static Fisherman Jack = new Fisherman("Jack");
    private static Fisherman Bob = new Fisherman("Bob");
    private static Fisherman Brent = new Fisherman("Brent");
    private static Fisherman Mark = new Fisherman("Mark");
    private int day = 0;
    private String person = "";
    private String fish = "";
    private String tournament = "";
    private String action = "";
    private String text = "";

    @FXML
    private Button bobButton;
    @FXML
    private Button brentButton;
    @FXML
    private Button glenButton;
    @FXML
    private Button jackButton;
    @FXML
    private Button markButton;
    @FXML
    private Button printButton;
    @FXML
    private Button emailButton;
    @FXML
    private Button addButton;
    @FXML
    private Button removeButton;
    @FXML
    private Button displayButton;
    @FXML
    private Button tournamentButton;
    @FXML
    private Button multiButton;
    @FXML
    private Button trollingButton;
    @FXML
    private Button bumperButton;
    @FXML
    private Button landButton;
    @FXML
    private Button bassholeButton;
    @FXML
    private Button sizeButton;
    @FXML
    private Button day1Button;
    @FXML
    private Button day2Button;
    @FXML
    private Button day3Button;
    @FXML
    private Button day4Button;
    @FXML
    private Button day5Button;
    @FXML
    private Button day6Button;
    @FXML
    private Button day7Button;
    @FXML
    private Button walleyeButton;
    @FXML
    private Button bassButton;
    @FXML
    private Button northernButton;
    @FXML
    private Button muskyButton;
    @FXML
    private Button perchButton;
    @FXML
    private Button crappieButton;
    @FXML
    private TextField inputField;

    @FXML
    private void bob(ActionEvent actionEvent) {
        person = "bob";
        bobButton.setStyle("-fx-background-color: #90ee90;");
        jackButton.setStyle("-fx-background-color: #808080;");
        brentButton.setStyle("-fx-background-color: #808080;");
        glenButton.setStyle("-fx-background-color: #808080;");
        markButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void brent(ActionEvent actionEvent) {
        person = "brent";
        brentButton.setStyle("-fx-background-color: #90ee90;");
        bobButton.setStyle("-fx-background-color: #808080;");
        jackButton.setStyle("-fx-background-color: #808080;");
        glenButton.setStyle("-fx-background-color: #808080;");
        markButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void glen(ActionEvent actionEvent) {
        person = "glen";
        glenButton.setStyle("-fx-background-color: #90ee90;");
        bobButton.setStyle("-fx-background-color: #808080;");
        brentButton.setStyle("-fx-background-color: #808080;");
        jackButton.setStyle("-fx-background-color: #808080;");
        markButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void jack(ActionEvent actionEvent) {
        person = "jack";
        jackButton.setStyle("-fx-background-color: #90ee90;");
        bobButton.setStyle("-fx-background-color: #808080;");
        brentButton.setStyle("-fx-background-color: #808080;");
        glenButton.setStyle("-fx-background-color: #808080;");
        markButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void mark(ActionEvent actionEvent) {
        person = "mark";
        markButton.setStyle("-fx-background-color: #90ee90;");
        bobButton.setStyle("-fx-background-color: #808080;");
        brentButton.setStyle("-fx-background-color: #808080;");
        glenButton.setStyle("-fx-background-color: #808080;");
        jackButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void printScores(ActionEvent actionEvent) {
        action = "print";
        printButton.setStyle("-fx-background-color: #90ee90;");
        emailButton.setStyle("-fx-background-color: #808080;");
        addButton.setStyle("-fx-background-color: #808080;");
        removeButton.setStyle("-fx-background-color: #808080;");
        displayButton.setStyle("-fx-background-color: #808080;");
        tournamentButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void email(ActionEvent actionEvent) {
        action = "email";
        emailButton.setStyle("-fx-background-color: #90ee90;");
        printButton.setStyle("-fx-background-color: #808080;");
        addButton.setStyle("-fx-background-color: #808080;");
        removeButton.setStyle("-fx-background-color: #808080;");
        displayButton.setStyle("-fx-background-color: #808080;");
        tournamentButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void addFish(ActionEvent actionEvent) {
        action = "add";
        addButton.setStyle("-fx-background-color: #90ee90;");
        emailButton.setStyle("-fx-background-color: #808080;");
        printButton.setStyle("-fx-background-color: #808080;");
        removeButton.setStyle("-fx-background-color: #808080;");
        displayButton.setStyle("-fx-background-color: #808080;");
        tournamentButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void removeFish(ActionEvent actionEvent) {
        action = "remove";
        removeButton.setStyle("-fx-background-color: #90ee90;");
        emailButton.setStyle("-fx-background-color: #808080;");
        addButton.setStyle("-fx-background-color: #808080;");
        printButton.setStyle("-fx-background-color: #808080;");
        displayButton.setStyle("-fx-background-color: #808080;");
        tournamentButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void displayFish(ActionEvent actionEvent) {
        action = "display";
        displayButton.setStyle("-fx-background-color: #90ee90;");
        emailButton.setStyle("-fx-background-color: #808080;");
        addButton.setStyle("-fx-background-color: #808080;");
        removeButton.setStyle("-fx-background-color: #808080;");
        printButton.setStyle("-fx-background-color: #808080;");
        tournamentButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void tournament(ActionEvent actionEvent) {
        action = "tournament";
        tournamentButton.setStyle("-fx-background-color: #90ee90;");
        emailButton.setStyle("-fx-background-color: #808080;");
        addButton.setStyle("-fx-background-color: #808080;");
        removeButton.setStyle("-fx-background-color: #808080;");
        printButton.setStyle("-fx-background-color: #808080;");
        displayButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void multi(ActionEvent actionEvent) {
        tournament = "multi";
        multiButton.setStyle("-fx-background-color: #90ee90;");
        trollingButton.setStyle("-fx-background-color: #808080;");
        bumperButton.setStyle("-fx-background-color: #808080;");
        landButton.setStyle("-fx-background-color: #808080;");
        bassholeButton.setStyle("-fx-background-color: #808080;");
        sizeButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void trolling(ActionEvent actionEvent) {
        tournament = "trolling";
        trollingButton.setStyle("-fx-background-color: #90ee90;");
        multiButton.setStyle("-fx-background-color: #808080;");
        bumperButton.setStyle("-fx-background-color: #808080;");
        landButton.setStyle("-fx-background-color: #808080;");
        bassholeButton.setStyle("-fx-background-color: #808080;");
        sizeButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void bumper(ActionEvent actionEvent) {
        tournament = "bumper";
        bumperButton.setStyle("-fx-background-color: #90ee90;");
        trollingButton.setStyle("-fx-background-color: #808080;");
        multiButton.setStyle("-fx-background-color: #808080;");
        landButton.setStyle("-fx-background-color: #808080;");
        bassholeButton.setStyle("-fx-background-color: #808080;");
        sizeButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void land(ActionEvent actionEvent) {
        tournament = "land";
        landButton.setStyle("-fx-background-color: #90ee90;");
        trollingButton.setStyle("-fx-background-color: #808080;");
        bumperButton.setStyle("-fx-background-color: #808080;");
        multiButton.setStyle("-fx-background-color: #808080;");
        bassholeButton.setStyle("-fx-background-color: #808080;");
        sizeButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void basshole(ActionEvent actionEvent) {
        tournament = "basshole";
        bassholeButton.setStyle("-fx-background-color: #90ee90;");
        trollingButton.setStyle("-fx-background-color: #808080;");
        bumperButton.setStyle("-fx-background-color: #808080;");
        landButton.setStyle("-fx-background-color: #808080;");
        multiButton.setStyle("-fx-background-color: #808080;");
        sizeButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void size(ActionEvent actionEvent) {
        tournament = "size";
        sizeButton.setStyle("-fx-background-color: #90ee90;");
        trollingButton.setStyle("-fx-background-color: #808080;");
        bumperButton.setStyle("-fx-background-color: #808080;");
        landButton.setStyle("-fx-background-color: #808080;");
        bassholeButton.setStyle("-fx-background-color: #808080;");
        multiButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void day1(ActionEvent actionEvent) {
        day = 1;
        day1Button.setStyle("-fx-background-color: #90ee90;");
        day2Button.setStyle("-fx-background-color: #808080;");
        day3Button.setStyle("-fx-background-color: #808080;");
        day4Button.setStyle("-fx-background-color: #808080;");
        day5Button.setStyle("-fx-background-color: #808080;");
        day6Button.setStyle("-fx-background-color: #808080;");
        day7Button.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void day2(ActionEvent actionEvent) {
        day = 2;
        day2Button.setStyle("-fx-background-color: #90ee90;");
        day1Button.setStyle("-fx-background-color: #808080;");
        day3Button.setStyle("-fx-background-color: #808080;");
        day4Button.setStyle("-fx-background-color: #808080;");
        day5Button.setStyle("-fx-background-color: #808080;");
        day6Button.setStyle("-fx-background-color: #808080;");
        day7Button.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void day3(ActionEvent actionEvent) {
        day = 3;
        day3Button.setStyle("-fx-background-color: #90ee90;");
        day2Button.setStyle("-fx-background-color: #808080;");
        day1Button.setStyle("-fx-background-color: #808080;");
        day4Button.setStyle("-fx-background-color: #808080;");
        day5Button.setStyle("-fx-background-color: #808080;");
        day6Button.setStyle("-fx-background-color: #808080;");
        day7Button.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void day4(ActionEvent actionEvent) {
        day = 4;
        day4Button.setStyle("-fx-background-color: #90ee90;");
        day2Button.setStyle("-fx-background-color: #808080;");
        day3Button.setStyle("-fx-background-color: #808080;");
        day1Button.setStyle("-fx-background-color: #808080;");
        day5Button.setStyle("-fx-background-color: #808080;");
        day6Button.setStyle("-fx-background-color: #808080;");
        day7Button.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void day5(ActionEvent actionEvent) {
        day = 5;
        day5Button.setStyle("-fx-background-color: #90ee90;");
        day2Button.setStyle("-fx-background-color: #808080;");
        day3Button.setStyle("-fx-background-color: #808080;");
        day4Button.setStyle("-fx-background-color: #808080;");
        day1Button.setStyle("-fx-background-color: #808080;");
        day6Button.setStyle("-fx-background-color: #808080;");
        day7Button.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void day6(ActionEvent actionEvent) {
        day = 6;
        day6Button.setStyle("-fx-background-color: #90ee90;");
        day2Button.setStyle("-fx-background-color: #808080;");
        day3Button.setStyle("-fx-background-color: #808080;");
        day4Button.setStyle("-fx-background-color: #808080;");
        day5Button.setStyle("-fx-background-color: #808080;");
        day1Button.setStyle("-fx-background-color: #808080;");
        day7Button.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void day7(ActionEvent actionEvent) {
        day = 7;
        day7Button.setStyle("-fx-background-color: #90ee90;");
        day2Button.setStyle("-fx-background-color: #808080;");
        day3Button.setStyle("-fx-background-color: #808080;");
        day4Button.setStyle("-fx-background-color: #808080;");
        day5Button.setStyle("-fx-background-color: #808080;");
        day6Button.setStyle("-fx-background-color: #808080;");
        day1Button.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void walleye(ActionEvent actionEvent) {
        fish = "walleye";
        walleyeButton.setStyle("-fx-background-color: #90ee90;");
        bassButton.setStyle("-fx-background-color: #808080;");
        northernButton.setStyle("-fx-background-color: #808080;");
        muskyButton.setStyle("-fx-background-color: #808080;");
        perchButton.setStyle("-fx-background-color: #808080;");
        crappieButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void bass(ActionEvent actionEvent) {
        fish = "bass";
        bassButton.setStyle("-fx-background-color: #90ee90;");
        walleyeButton.setStyle("-fx-background-color: #808080;");
        northernButton.setStyle("-fx-background-color: #808080;");
        muskyButton.setStyle("-fx-background-color: #808080;");
        perchButton.setStyle("-fx-background-color: #808080;");
        crappieButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void northern(ActionEvent actionEvent) {
        fish = "northern";
        northernButton.setStyle("-fx-background-color: #90ee90;");
        walleyeButton.setStyle("-fx-background-color: #808080;");
        bassButton.setStyle("-fx-background-color: #808080;");
        muskyButton.setStyle("-fx-background-color: #808080;");
        perchButton.setStyle("-fx-background-color: #808080;");
        crappieButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void musky(ActionEvent actionEvent) {
        fish = "musky";
        muskyButton.setStyle("-fx-background-color: #90ee90;");
        walleyeButton.setStyle("-fx-background-color: #808080;");
        northernButton.setStyle("-fx-background-color: #808080;");
        bassButton.setStyle("-fx-background-color: #808080;");
        perchButton.setStyle("-fx-background-color: #808080;");
        crappieButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void perch(ActionEvent actionEvent) {
        fish = "perch";
        perchButton.setStyle("-fx-background-color: #90ee90;");
        walleyeButton.setStyle("-fx-background-color: #808080;");
        northernButton.setStyle("-fx-background-color: #808080;");
        muskyButton.setStyle("-fx-background-color: #808080;");
        bassButton.setStyle("-fx-background-color: #808080;");
        crappieButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void crappie(ActionEvent actionEvent) {
        fish = "crappie";
        crappieButton.setStyle("-fx-background-color: #90ee90;");
        walleyeButton.setStyle("-fx-background-color: #808080;");
        northernButton.setStyle("-fx-background-color: #808080;");
        muskyButton.setStyle("-fx-background-color: #808080;");
        perchButton.setStyle("-fx-background-color: #808080;");
        bassButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void getText(ActionEvent actionEvent) {
        text = inputField.getText();
        go();
    }

    private void go() {
        switch (action) {
            case "print": print();
            case "email": emailResults();
            case "add": add();
            case "remove": remove();
            case "display": display();
            case "tournament": addTournamentResults();
            default: reset();
        }
    }

    private void print() {

    }

    private void emailResults() {

    }

    private void add() {

    }

    private void remove() {

    }

    private void display() {

    }

    private void addTournamentResults() {

    }

    private void reset() {
        inputField.setText("");
        crappieButton.setStyle("-fx-background-color: #808080;");
        walleyeButton.setStyle("-fx-background-color: #808080;");
        northernButton.setStyle("-fx-background-color: #808080;");
        muskyButton.setStyle("-fx-background-color: #808080;");
        perchButton.setStyle("-fx-background-color: #808080;");
        bassButton.setStyle("-fx-background-color: #808080;");
        day7Button.setStyle("-fx-background-color: #808080;");
        day2Button.setStyle("-fx-background-color: #808080;");
        day3Button.setStyle("-fx-background-color: #808080;");
        day4Button.setStyle("-fx-background-color: #808080;");
        day5Button.setStyle("-fx-background-color: #808080;");
        day6Button.setStyle("-fx-background-color: #808080;");
        day1Button.setStyle("-fx-background-color: #808080;");
        sizeButton.setStyle("-fx-background-color: #808080;");
        trollingButton.setStyle("-fx-background-color: #808080;");
        bumperButton.setStyle("-fx-background-color: #808080;");
        landButton.setStyle("-fx-background-color: #808080;");
        bassholeButton.setStyle("-fx-background-color: #808080;");
        multiButton.setStyle("-fx-background-color: #808080;");
        displayButton.setStyle("-fx-background-color: #808080;");
        emailButton.setStyle("-fx-background-color: #808080;");
        addButton.setStyle("-fx-background-color: #808080;");
        removeButton.setStyle("-fx-background-color: #808080;");
        printButton.setStyle("-fx-background-color: #808080;");
        bobButton.setStyle("-fx-background-color: #808080;");
        jackButton.setStyle("-fx-background-color: #808080;");
        brentButton.setStyle("-fx-background-color: #808080;");
        glenButton.setStyle("-fx-background-color: #808080;");
        markButton.setStyle("-fx-background-color: #808080;");
        person = "";
        day = 0;
        fish = "";
        action = "";
        tournament = "";
    }
}
