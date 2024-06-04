import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {
    private static Fisherman Glen = new Fisherman("Glen");
    private static Fisherman Jack = new Fisherman("Jack");
    private static Fisherman Bob = new Fisherman("Bob");
    private static Fisherman Brent = new Fisherman("Brent");
    private static Fisherman Mark = new Fisherman("Mark");
    private int day = 0;
    private String person = "";
    private char fish = 'a';
    private String tournament = "";
    private String action = "";
    private String text = "";

    @FXML
    private TextArea textArea;
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
    private Button juneButton;
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
    private void bob() {
        person = "bob";
        bobButton.setStyle("-fx-background-color: #90ee90;");
        jackButton.setStyle("-fx-background-color: #808080;");
        brentButton.setStyle("-fx-background-color: #808080;");
        glenButton.setStyle("-fx-background-color: #808080;");
        markButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void brent() {
        person = "brent";
        brentButton.setStyle("-fx-background-color: #90ee90;");
        bobButton.setStyle("-fx-background-color: #808080;");
        jackButton.setStyle("-fx-background-color: #808080;");
        glenButton.setStyle("-fx-background-color: #808080;");
        markButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void glen() {
        person = "glen";
        glenButton.setStyle("-fx-background-color: #90ee90;");
        bobButton.setStyle("-fx-background-color: #808080;");
        brentButton.setStyle("-fx-background-color: #808080;");
        jackButton.setStyle("-fx-background-color: #808080;");
        markButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void jack() {
        person = "jack";
        jackButton.setStyle("-fx-background-color: #90ee90;");
        bobButton.setStyle("-fx-background-color: #808080;");
        brentButton.setStyle("-fx-background-color: #808080;");
        glenButton.setStyle("-fx-background-color: #808080;");
        markButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void mark() {
        person = "mark";
        markButton.setStyle("-fx-background-color: #90ee90;");
        bobButton.setStyle("-fx-background-color: #808080;");
        brentButton.setStyle("-fx-background-color: #808080;");
        glenButton.setStyle("-fx-background-color: #808080;");
        jackButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void printScores() {
        action = "print";
        printButton.setStyle("-fx-background-color: #90ee90;");
        emailButton.setStyle("-fx-background-color: #808080;");
        addButton.setStyle("-fx-background-color: #808080;");
        removeButton.setStyle("-fx-background-color: #808080;");
        displayButton.setStyle("-fx-background-color: #808080;");
        tournamentButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void email() {
        action = "email";
        emailButton.setStyle("-fx-background-color: #90ee90;");
        printButton.setStyle("-fx-background-color: #808080;");
        addButton.setStyle("-fx-background-color: #808080;");
        removeButton.setStyle("-fx-background-color: #808080;");
        displayButton.setStyle("-fx-background-color: #808080;");
        tournamentButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void addFish() {
        action = "add";
        addButton.setStyle("-fx-background-color: #90ee90;");
        emailButton.setStyle("-fx-background-color: #808080;");
        printButton.setStyle("-fx-background-color: #808080;");
        removeButton.setStyle("-fx-background-color: #808080;");
        displayButton.setStyle("-fx-background-color: #808080;");
        tournamentButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void removeFish() {
        action = "remove";
        removeButton.setStyle("-fx-background-color: #90ee90;");
        emailButton.setStyle("-fx-background-color: #808080;");
        addButton.setStyle("-fx-background-color: #808080;");
        printButton.setStyle("-fx-background-color: #808080;");
        displayButton.setStyle("-fx-background-color: #808080;");
        tournamentButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void displayFish() {
        action = "display";
        displayButton.setStyle("-fx-background-color: #90ee90;");
        emailButton.setStyle("-fx-background-color: #808080;");
        addButton.setStyle("-fx-background-color: #808080;");
        removeButton.setStyle("-fx-background-color: #808080;");
        printButton.setStyle("-fx-background-color: #808080;");
        tournamentButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void tournament() {
        action = "tournament";
        tournamentButton.setStyle("-fx-background-color: #90ee90;");
        emailButton.setStyle("-fx-background-color: #808080;");
        addButton.setStyle("-fx-background-color: #808080;");
        removeButton.setStyle("-fx-background-color: #808080;");
        printButton.setStyle("-fx-background-color: #808080;");
        displayButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void multi() {
        tournament = "multi";
        multiButton.setStyle("-fx-background-color: #90ee90;");
        trollingButton.setStyle("-fx-background-color: #808080;");
        bumperButton.setStyle("-fx-background-color: #808080;");
        landButton.setStyle("-fx-background-color: #808080;");
        bassholeButton.setStyle("-fx-background-color: #808080;");
        sizeButton.setStyle("-fx-background-color: #808080;");
        juneButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void trolling() {
        tournament = "trolling";
        trollingButton.setStyle("-fx-background-color: #90ee90;");
        multiButton.setStyle("-fx-background-color: #808080;");
        bumperButton.setStyle("-fx-background-color: #808080;");
        landButton.setStyle("-fx-background-color: #808080;");
        bassholeButton.setStyle("-fx-background-color: #808080;");
        sizeButton.setStyle("-fx-background-color: #808080;");
        juneButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void bumper() {
        tournament = "bumper";
        bumperButton.setStyle("-fx-background-color: #90ee90;");
        trollingButton.setStyle("-fx-background-color: #808080;");
        multiButton.setStyle("-fx-background-color: #808080;");
        landButton.setStyle("-fx-background-color: #808080;");
        bassholeButton.setStyle("-fx-background-color: #808080;");
        sizeButton.setStyle("-fx-background-color: #808080;");
        juneButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void land() {
        tournament = "land";
        landButton.setStyle("-fx-background-color: #90ee90;");
        trollingButton.setStyle("-fx-background-color: #808080;");
        bumperButton.setStyle("-fx-background-color: #808080;");
        multiButton.setStyle("-fx-background-color: #808080;");
        bassholeButton.setStyle("-fx-background-color: #808080;");
        sizeButton.setStyle("-fx-background-color: #808080;");
        juneButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void basshole() {
        tournament = "basshole";
        bassholeButton.setStyle("-fx-background-color: #90ee90;");
        trollingButton.setStyle("-fx-background-color: #808080;");
        bumperButton.setStyle("-fx-background-color: #808080;");
        landButton.setStyle("-fx-background-color: #808080;");
        multiButton.setStyle("-fx-background-color: #808080;");
        sizeButton.setStyle("-fx-background-color: #808080;");
        juneButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void size() {
        tournament = "size";
        sizeButton.setStyle("-fx-background-color: #90ee90;");
        trollingButton.setStyle("-fx-background-color: #808080;");
        bumperButton.setStyle("-fx-background-color: #808080;");
        landButton.setStyle("-fx-background-color: #808080;");
        bassholeButton.setStyle("-fx-background-color: #808080;");
        multiButton.setStyle("-fx-background-color: #808080;");
        juneButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void june() {
        tournament = "june";
        juneButton.setStyle("-fx-background-color: #90ee90;");
        trollingButton.setStyle("-fx-background-color: #808080;");
        bumperButton.setStyle("-fx-background-color: #808080;");
        landButton.setStyle("-fx-background-color: #808080;");
        bassholeButton.setStyle("-fx-background-color: #808080;");
        multiButton.setStyle("-fx-background-color: #808080;");
        sizeButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void day1() {
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
    private void day2() {
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
    private void day3() {
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
    private void day4() {
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
    private void day5() {
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
    private void day6() {
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
    private void day7() {
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
    private void walleye() {
        fish = 'w';
        walleyeButton.setStyle("-fx-background-color: #90ee90;");
        bassButton.setStyle("-fx-background-color: #808080;");
        northernButton.setStyle("-fx-background-color: #808080;");
        muskyButton.setStyle("-fx-background-color: #808080;");
        perchButton.setStyle("-fx-background-color: #808080;");
        crappieButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void bass() {
        fish = 'b';
        bassButton.setStyle("-fx-background-color: #90ee90;");
        walleyeButton.setStyle("-fx-background-color: #808080;");
        northernButton.setStyle("-fx-background-color: #808080;");
        muskyButton.setStyle("-fx-background-color: #808080;");
        perchButton.setStyle("-fx-background-color: #808080;");
        crappieButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void northern() {
        fish = 'n';
        northernButton.setStyle("-fx-background-color: #90ee90;");
        walleyeButton.setStyle("-fx-background-color: #808080;");
        bassButton.setStyle("-fx-background-color: #808080;");
        muskyButton.setStyle("-fx-background-color: #808080;");
        perchButton.setStyle("-fx-background-color: #808080;");
        crappieButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void musky() {
        fish = 'm';
        muskyButton.setStyle("-fx-background-color: #90ee90;");
        walleyeButton.setStyle("-fx-background-color: #808080;");
        northernButton.setStyle("-fx-background-color: #808080;");
        bassButton.setStyle("-fx-background-color: #808080;");
        perchButton.setStyle("-fx-background-color: #808080;");
        crappieButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void perch() {
        fish = 'p';
        perchButton.setStyle("-fx-background-color: #90ee90;");
        walleyeButton.setStyle("-fx-background-color: #808080;");
        northernButton.setStyle("-fx-background-color: #808080;");
        muskyButton.setStyle("-fx-background-color: #808080;");
        bassButton.setStyle("-fx-background-color: #808080;");
        crappieButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void crappie() {
        fish = 'c';
        crappieButton.setStyle("-fx-background-color: #90ee90;");
        walleyeButton.setStyle("-fx-background-color: #808080;");
        northernButton.setStyle("-fx-background-color: #808080;");
        muskyButton.setStyle("-fx-background-color: #808080;");
        perchButton.setStyle("-fx-background-color: #808080;");
        bassButton.setStyle("-fx-background-color: #808080;");
    }

    @FXML
    private void getText() {
        text = inputField.getText();
        inputField.setText("");
        go();
    }

    private void go() {
        switch (action) {
            case "print":
                print();
                break;
            case "email":
                emailResults();
                break;
            case "add":
                add();
                break;
            case "remove":
                remove();
                break;
            case "display":
                display();
                break;
            case "tournament":
                addTournamentResults();
                break;
        }
    }

    private void print() {
        updateScores();
        textArea.setText(printScore());
    }

    public static void emailResults() {
        updateScores();
        String subject = "subject";
        String message = printScore() + "\n\n" + Bob.printFish() + "\n\n" + Brent.printFish() +
                "\n\n" + Glen.printFish() + "\n\n" + Jack.printFish() + "\n\n" + Mark.printFish();
        EmailSender.sendEmail(subject, message);
    }

    private void add() {
        getFisherman(person).addFish(day, fish, getNumber(text));
    }

    private void remove() {
        getFisherman(person).removeFish(day, fish, getNumber(text));
    }

    private void display() {
        updateScores();
        textArea.setText(getFisherman(person).printFish());
    }


    private Fisherman getFisherman(String fisherman) {
        Fisherman toReturn = null;
        switch (fisherman) {
            case "bob":
                toReturn = Bob;
                break;
            case "brent":
                toReturn = Brent;
                break;
            case "glen":
                toReturn = Glen;
                break;
            case "jack":
                toReturn = Jack;
                break;
            case "mark":
                toReturn = Mark;
                break;
        }
        return toReturn;
    }

    private double getNumber(String string) {
        try {
            return Double.parseDouble(string);
        } catch (NumberFormatException nfe) {
            reset();
        }
        return 0;
    }

    private void addTournamentResults() {
        switch (tournament) {
            case "multi":
                getFisherman(person).hotMultiSpeciesActionPlace = getNumber(text);
                break;
            case "trolling":
                getFisherman(person).DT6PackTrollingPlace = getNumber(text);
                break;
            case "bumper":
                getFisherman(person).meatHoleBumperBoatsPlace = getNumber(text);
                break;
            case "land":
                getFisherman(person).landSharkPlace = getNumber(text);
                break;
            case "basshole":
                getFisherman(person).bassHoleGoneWildPlace = getNumber(text);
                break;
            case "size":
                getFisherman(person).sizeMattersPlace = getNumber(text);
                break;
            case "june":
                getFisherman(person).juneMadnessPlace = getNumber(text);
                break;
        }
    }

    private void reset() {
        inputField.setText("");
        textArea.setText("");
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
        fish = 'a';
        action = "";
        tournament = "";
        emailResults();
    }




    private static String printScore() {
        String toReturn = "";
        ArrayList<Score> scores = new ArrayList<>();

        scores.add(new Score("Glen", Glen.getScore()));
        scores.add(new Score("Jack", Jack.getScore()));
        scores.add(new Score("Bob", Bob.getScore()));
        scores.add(new Score("Brent", Brent.getScore()));
        scores.add(new Score("Mark", Mark.getScore()));

        for (int i = 0; i < scores.size(); i++) {
            for (int j = i + 1; j < scores.size(); j++) {
                if (scores.get(j).score < scores.get(i).score) {
                    Score temp = scores.get(i);
                    scores.set(i, scores.get(j));
                    scores.set(j, temp);
                }
            }
        }
        for (int i = 0; i < scores.size(); i++) {
            toReturn += (i + 1 + ": " + scores.get(i).name + " (" + scores.get(i).score + ") ");
        }

        toReturn += "\n\n" + printTournament();
        return toReturn;
    }

    private static String printTournament() {
        updateScores();
        return "Largest Walleye: Bob(" + Bob.largestWalleyePlace + ") " + "Brent(" + Brent.largestWalleyePlace + ") " + "Glen(" + Glen.largestWalleyePlace + ") " + "Jack(" + Jack.largestWalleyePlace + ") " + "Mark(" + Mark.largestWalleyePlace + ") "  +
                "\nLargest Pike: Bob(" + Bob.largestPikePlace + ") " + "Brent(" + Brent.largestPikePlace + ") " + "Glen(" + Glen.largestPikePlace + ") " + "Jack(" + Jack.largestPikePlace + ") " + "Mark(" + Mark.largestPikePlace + ") "  +
                "\nLargest Bass: Bob(" + Bob.largestBassPlace + ") " + "Brent(" + Brent.largestBassPlace + ") " + "Glen(" + Glen.largestBassPlace + ") " + "Jack(" + Jack.largestBassPlace + ") " + "Mark(" + Mark.largestBassPlace + ") "  +
                "\nLargest Perch: Bob(" + Bob.largestPerchPlace + ") " + "Brent(" + Brent.largestPerchPlace + ") " + "Glen(" + Glen.largestPerchPlace + ") " + "Jack(" + Jack.largestPerchPlace + ") " + "Mark(" + Mark.largestPerchPlace + ") "  +
                "\nLargest Crappie: Bob(" + Bob.largestCrappiePlace + ") " + "Brent(" + Brent.largestCrappiePlace + ") " + "Glen(" + Glen.largestCrappiePlace + ") " + "Jack(" + Jack.largestCrappiePlace + ") " + "Mark(" + Mark.largestCrappiePlace + ") "  +
                "\nLargest Musky: Bob(" + Bob.largestMuskyPlace + ") " + "Brent(" + Brent.largestMuskyPlace + ") " + "Glen(" + Glen.largestMuskyPlace + ") " + "Jack(" + Jack.largestMuskyPlace + ") " + "Mark(" + Mark.largestMuskyPlace + ") "  +
                "\nMost Fish: Bob(" + Bob.mostFishPlace + ") " + "Brent(" + Brent.mostFishPlace + ") " + "Glen(" + Glen.mostFishPlace + ") " + "Jack(" + Jack.mostFishPlace + ") " + "Mark(" + Mark.mostFishPlace + ") "  +
                "\nMost Fish In One Day: Bob(" + Bob.mostFishInOneDayPlace + ") " + "Brent(" + Brent.mostFishInOneDayPlace + ") " + "Glen(" + Glen.mostFishInOneDayPlace + ") " + "Jack(" + Jack.mostFishInOneDayPlace + ") " + "Mark(" + Mark.mostFishInOneDayPlace + ") "  +
                "\nMost Walleye: Bob(" + Bob.mostWalleyePlace + ") " + "Brent(" + Brent.mostWalleyePlace + ") " + "Glen(" + Glen.mostWalleyePlace + ") " + "Jack(" + Jack.mostWalleyePlace + ") " + "Mark(" + Mark.mostWalleyePlace + ") "  +
                "\nDT6 Pack Trolling: Bob(" + Bob.DT6PackTrollingPlace + ") " + "Brent(" + Brent.DT6PackTrollingPlace + ") " + "Glen(" + Glen.DT6PackTrollingPlace + ") " + "Jack(" + Jack.DT6PackTrollingPlace + ") " + "Mark(" + Mark.DT6PackTrollingPlace + ") "  +
                "\nBumper Boats: Bob(" + Bob.meatHoleBumperBoatsPlace + ") " + "Brent(" + Brent.meatHoleBumperBoatsPlace + ") " + "Glen(" + Glen.meatHoleBumperBoatsPlace + ") " + "Jack(" + Jack.meatHoleBumperBoatsPlace + ") " + "Mark(" + Mark.meatHoleBumperBoatsPlace + ") "  +
                "\nLand Shark: Bob(" + Bob.landSharkPlace + ") " + "Brent(" + Brent.landSharkPlace + ") " + "Glen(" + Glen.landSharkPlace + ") " + "Jack(" + Jack.landSharkPlace + ") " + "Mark(" + Mark.landSharkPlace + ") "  +
                "\nTwin Sisters Gone Wild: Bob(" + Bob.bassHoleGoneWildPlace + ") " + "Brent(" + Brent.bassHoleGoneWildPlace + ") " + "Glen(" + Glen.bassHoleGoneWildPlace + ") " + "Jack(" + Jack.bassHoleGoneWildPlace + ") " + "Mark(" + Mark.bassHoleGoneWildPlace + ") "  +
                "\nHot Multi Species Action: Bob(" + Bob.hotMultiSpeciesActionPlace + ") " + "Brent(" + Brent.hotMultiSpeciesActionPlace + ") " + "Glen(" + Glen.hotMultiSpeciesActionPlace + ") " + "Jack(" + Jack.hotMultiSpeciesActionPlace + ") " + "Mark(" + Mark.hotMultiSpeciesActionPlace + ") "+
                "\nJune Madness: Bob(" + Bob.juneMadnessPlace + ") " + "Brent(" + Brent.juneMadnessPlace + ") " + "Glen(" + Glen.juneMadnessPlace + ") " + "Jack(" + Jack.juneMadnessPlace + ") " + "Mark(" + Mark.juneMadnessPlace + ") "  +
                "\nSize Matters: Bob(" + Bob.sizeMattersPlace + ") " + "Brent(" + Brent.sizeMattersPlace + ") " + "Glen(" + Glen.sizeMattersPlace + ") " + "Jack(" + Jack.sizeMattersPlace + ") " + "Mark(" + Mark.sizeMattersPlace + ") ";
    }


    private static void updateScores() {
        updateLargestWalleye();
        updateLargestPike();
        updateLargestBass();
        updateLargestPerch();
        updateLargestCrappie();
        updateLargestMusky();
        updateMostFish();
        updateMostFishInOneDay();
        updateMostWalleye();
    }

    private static void updateLargestMusky() {
        ArrayList<Score> scores = new ArrayList<>();

        scores.add(new Score("Glen", Glen.getLongestMusky()));
        scores.add(new Score("Jack", Jack.getLongestMusky()));
        scores.add(new Score("Bob", Bob.getLongestMusky()));
        scores.add(new Score("Brent", Brent.getLongestMusky()));
        scores.add(new Score("Mark", Mark.getLongestMusky()));

        for (int i = 0; i < scores.size(); i++) {
            for (int j = i + 1; j < scores.size(); j++) {
                if (scores.get(j).score < scores.get(i).score) {
                    Score temp = scores.get(i);
                    scores.set(i, scores.get(j));
                    scores.set(j, temp);
                }
            }
        }
        getPlace(scores);
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i).name.equalsIgnoreCase("Glen")) {
                Glen.largestMuskyPlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Jack")) {
                Jack.largestMuskyPlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Bob")) {
                Bob.largestMuskyPlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Brent")) {
                Brent.largestMuskyPlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Mark")) {
                Mark.largestMuskyPlace = scores.get(i).place;
            }
        }
    }

    private static void updateLargestWalleye() {
        ArrayList<Score> scores = new ArrayList<>();

        scores.add(new Score("Glen", Glen.getLongestWalleye()));
        scores.add(new Score("Jack", Jack.getLongestWalleye()));
        scores.add(new Score("Bob", Bob.getLongestWalleye()));
        scores.add(new Score("Brent", Brent.getLongestWalleye()));
        scores.add(new Score("Mark", Mark.getLongestWalleye()));

        for (int i = 0; i < scores.size(); i++) {
            for (int j = i + 1; j < scores.size(); j++) {
                if (scores.get(j).score < scores.get(i).score) {
                    Score temp = scores.get(i);
                    scores.set(i, scores.get(j));
                    scores.set(j, temp);
                }
            }
        }
        getPlace(scores);
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i).name.equalsIgnoreCase("Glen")) {
                Glen.largestWalleyePlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Jack")) {
                Jack.largestWalleyePlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Bob")) {
                Bob.largestWalleyePlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Brent")) {
                Brent.largestWalleyePlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Mark")) {
                Mark.largestWalleyePlace = scores.get(i).place;
            }
        }
    }

    private static void updateLargestPike() {
        ArrayList<Score> scores = new ArrayList<>();

        scores.add(new Score("Glen", Glen.getLongestPike()));
        scores.add(new Score("Jack", Jack.getLongestPike()));
        scores.add(new Score("Bob", Bob.getLongestPike()));
        scores.add(new Score("Brent", Brent.getLongestPike()));
        scores.add(new Score("Mark", Mark.getLongestPike()));

        for (int i = 0; i < scores.size(); i++) {
            for (int j = i + 1; j < scores.size(); j++) {
                if (scores.get(j).score < scores.get(i).score) {
                    Score temp = scores.get(i);
                    scores.set(i, scores.get(j));
                    scores.set(j, temp);
                }
            }
        }
        getPlace(scores);
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i).name.equalsIgnoreCase("Glen")) {
                Glen.largestPikePlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Jack")) {
                Jack.largestPikePlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Bob")) {
                Bob.largestPikePlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Brent")) {
                Brent.largestPikePlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Mark")) {
                Mark.largestPikePlace = scores.get(i).place;
            }
        }
    }

    private static void updateLargestBass() {
        ArrayList<Score> scores = new ArrayList<>();

        scores.add(new Score("Glen", Glen.getLongestBass()));
        scores.add(new Score("Jack", Jack.getLongestBass()));
        scores.add(new Score("Bob", Bob.getLongestBass()));
        scores.add(new Score("Brent", Brent.getLongestBass()));
        scores.add(new Score("Mark", Mark.getLongestBass()));

        for (int i = 0; i < scores.size(); i++) {
            for (int j = i + 1; j < scores.size(); j++) {
                if (scores.get(j).score < scores.get(i).score) {
                    Score temp = scores.get(i);
                    scores.set(i, scores.get(j));
                    scores.set(j, temp);
                }
            }
        }
        getPlace(scores);
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i).name.equalsIgnoreCase("Glen")) {
                Glen.largestBassPlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Jack")) {
                Jack.largestBassPlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Bob")) {
                Bob.largestBassPlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Brent")) {
                Brent.largestBassPlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Mark")) {
                Mark.largestBassPlace = scores.get(i).place;
            }
        }
    }

    private static void updateLargestPerch() {
        ArrayList<Score> scores = new ArrayList<>();

        scores.add(new Score("Glen", Glen.getLongestPerch()));
        scores.add(new Score("Jack", Jack.getLongestPerch()));
        scores.add(new Score("Bob", Bob.getLongestPerch()));
        scores.add(new Score("Brent", Brent.getLongestPerch()));
        scores.add(new Score("Mark", Mark.getLongestPerch()));

        for (int i = 0; i < scores.size(); i++) {
            for (int j = i + 1; j < scores.size(); j++) {
                if (scores.get(j).score < scores.get(i).score) {
                    Score temp = scores.get(i);
                    scores.set(i, scores.get(j));
                    scores.set(j, temp);
                }
            }
        }
        getPlace(scores);
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i).name.equalsIgnoreCase("Glen")) {
                Glen.largestPerchPlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Jack")) {
                Jack.largestPerchPlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Bob")) {
                Bob.largestPerchPlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Brent")) {
                Brent.largestPerchPlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Mark")) {
                Mark.largestPerchPlace = scores.get(i).place;
            }
        }
    }

    private static void updateLargestCrappie() {
        ArrayList<Score> scores = new ArrayList<>();

        scores.add(new Score("Glen", Glen.getLongestCrappie()));
        scores.add(new Score("Jack", Jack.getLongestCrappie()));
        scores.add(new Score("Bob", Bob.getLongestCrappie()));
        scores.add(new Score("Brent", Brent.getLongestCrappie()));
        scores.add(new Score("Mark", Mark.getLongestCrappie()));

        for (int i = 0; i < scores.size(); i++) {
            for (int j = i + 1; j < scores.size(); j++) {
                if (scores.get(j).score < scores.get(i).score) {
                    Score temp = scores.get(i);
                    scores.set(i, scores.get(j));
                    scores.set(j, temp);
                }
            }
        }
        getPlace(scores);
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i).name.equalsIgnoreCase("Glen")) {
                Glen.largestCrappiePlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Jack")) {
                Jack.largestCrappiePlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Bob")) {
                Bob.largestCrappiePlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Brent")) {
                Brent.largestCrappiePlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Mark")) {
                Mark.largestCrappiePlace = scores.get(i).place;
            }
        }
    }

    private static void updateMostFish() {
        ArrayList<Score> scores = new ArrayList<>();

        scores.add(new Score("Glen", Glen.getTotalFish()));
        scores.add(new Score("Jack", Jack.getTotalFish()));
        scores.add(new Score("Bob", Bob.getTotalFish()));
        scores.add(new Score("Brent", Brent.getTotalFish()));
        scores.add(new Score("Mark", Mark.getTotalFish()));

        for (int i = 0; i < scores.size(); i++) {
            for (int j = i + 1; j < scores.size(); j++) {
                if (scores.get(j).score < scores.get(i).score) {
                    Score temp = scores.get(i);
                    scores.set(i, scores.get(j));
                    scores.set(j, temp);
                }
            }
        }
        getPlace(scores);
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i).name.equalsIgnoreCase("Glen")) {
                Glen.mostFishPlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Jack")) {
                Jack.mostFishPlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Bob")) {
                Bob.mostFishPlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Brent")) {
                Brent.mostFishPlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Mark")) {
                Mark.mostFishPlace = scores.get(i).place;
            }
        }
    }

    private static void updateMostFishInOneDay() {
        ArrayList<Score> scores = new ArrayList<>();

        scores.add(new Score("Glen", Glen.getMostFishInOneDay()));
        scores.add(new Score("Jack", Jack.getMostFishInOneDay()));
        scores.add(new Score("Bob", Bob.getMostFishInOneDay()));
        scores.add(new Score("Brent", Brent.getMostFishInOneDay()));
        scores.add(new Score("Mark", Mark.getMostFishInOneDay()));

        for (int i = 0; i < scores.size(); i++) {
            for (int j = i + 1; j < scores.size(); j++) {
                if (scores.get(j).score < scores.get(i).score) {
                    Score temp = scores.get(i);
                    scores.set(i, scores.get(j));
                    scores.set(j, temp);
                }
            }
        }
        getPlace(scores);
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i).name.equalsIgnoreCase("Glen")) {
                Glen.mostFishInOneDayPlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Jack")) {
                Jack.mostFishInOneDayPlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Bob")) {
                Bob.mostFishInOneDayPlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Brent")) {
                Brent.mostFishInOneDayPlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Mark")) {
                Mark.mostFishInOneDayPlace = scores.get(i).place;
            }
        }
    }

    private static void updateMostWalleye() {
        ArrayList<Score> scores = new ArrayList<>();

        scores.add(new Score("Glen", Glen.getTotalWalleye()));
        scores.add(new Score("Jack", Jack.getTotalWalleye()));
        scores.add(new Score("Bob", Bob.getTotalWalleye()));
        scores.add(new Score("Brent", Brent.getTotalWalleye()));
        scores.add(new Score("Mark", Mark.getTotalWalleye()));

        for (int i = 0; i < scores.size(); i++) {
            for (int j = i + 1; j < scores.size(); j++) {
                if (scores.get(j).score < scores.get(i).score) {
                    Score temp = scores.get(i);
                    scores.set(i, scores.get(j));
                    scores.set(j, temp);
                }
            }
        }
        getPlace(scores);
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i).name.equalsIgnoreCase("Glen")) {
                Glen.mostWalleyePlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Jack")) {
                Jack.mostWalleyePlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Bob")) {
                Bob.mostWalleyePlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Brent")) {
                Brent.mostWalleyePlace = scores.get(i).place;
            }
            if (scores.get(i).name.equalsIgnoreCase("Mark")) {
                Mark.mostWalleyePlace = scores.get(i).place;
            }
        }
    }

    private static void getPlace(ArrayList<Score> scores) {
        int count = 0;
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i).score == 0) {
                count++;
            }
        }
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i).score == 0) {
                scores.get(i).place = 6 - count;
            } else {
                //scores.get(i).place = i + 1 - count;
                scores.get(i).place = 5 - i;
            }

        }
        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i - 1).score == scores.get(i).score) {
                scores.get(i).place = scores.get(i - 1).place;
            }
        }
    }
}
