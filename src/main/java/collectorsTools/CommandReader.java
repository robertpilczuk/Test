package collectorsTools;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CommandReader {

    private final Scanner scanner = new Scanner(System.in);
    private static Map<Integer, String> COMMANDS = new LinkedHashMap<>();
    private static Map<Integer, String> DATA_HANDLER = new LinkedHashMap<>();
    private static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//    private static StringBuilder sb = new StringBuilder();

    static {
        COMMANDS.put(1, "Dodaj deklarację");
        COMMANDS.put(2, "Sprawdź najbliższe (od dziś do podanej liczby dni)");
        COMMANDS.put(3, "Sprawdź zakres dat (od daty do daty)");
        COMMANDS.put(4, "Suma deklaracji");
        COMMANDS.put(5, "Zapis do pliku");
        COMMANDS.put(6, "Podgląd pliku");
        COMMANDS.put(7, "Edycja pliku");
        COMMANDS.put(9, "Wyjście");
    }

    public boolean readAndExecute() {
        showMenu();
        int cmd = scanner.nextInt();
        switch (cmd) {
            case 1:
                handleDeclarationAdd();
                handleDeclarationAddIfContinue();
                break;
            case 2:
                nearestDeclarationsDates();
                break;
            case 3:
                declarationsBetweenDates();
                break;
            case 4:
                declarationSum();
                break;
            case 5:
                saveToFile();
            case 6:
                fileChecker();
                break;
            case 7:
                fileEditor();
                break;
            case 9:
                return false;
            default:
                System.out.println("Nie ma takiej opcji!!!" + cmd);
        }
        return true;
    }

    private void fileEditor() {

    }

    private void saveToFile() {

    }

    private void declarationsBetweenDates() {
        DeclarationManagement dm = new DeclarationManagement();

        System.out.println("Podaj początkową datę w formacie dd/MM");
        LocalDate beginDecDate = LocalDate.parse(scanner.next().concat("/2020"), FORMATTER);
        System.out.println("Podaj końcową datę w formacie dd/MM");
        LocalDate endDecDate = LocalDate.parse(scanner.next().concat("/2020"), FORMATTER);
        int numOfDaysBetween = getDatesBetween(beginDecDate, endDecDate).size();
        for (int i = 0; i < numOfDaysBetween; i++) {
            LocalDate date = LocalDate.from(beginDecDate).plusDays(i);
            Optional<Declaration> optionalDeclaration = dm.retrieveByDate(date);
            if (optionalDeclaration.isPresent()) {
                Declaration declaration = optionalDeclaration.get();
                System.out.println(declaration);
            }
        }
        readAndExecute();
    }

    private void showMenu() {
        System.out.println("******WELCOME TO DECLARATION HANDLER !!!******");
        COMMANDS.forEach((cmd, msg) -> System.out.println(String.format("%s: %s", cmd, msg)));
    }

    private void handleDeclarationAddIfContinue() {
        System.out.println("Dodać kolejną deklarację? y/n");
        String y_n = scanner.next();
        while (!y_n.equals("n")) {
            handleDeclarationAdd();
            handleDeclarationAddIfContinue();
        }
        readAndExecute();
    }

    private void handleDeclarationAdd() {
        System.out.println("Podaj datę deklaracji w formacie dd/MM");
        String decDateIn = scanner.next().concat("/2020");
        LocalDate decDate = LocalDate.parse(decDateIn, FORMATTER);
        System.out.println("Podaj kwotę");
        int decValue = scanner.nextInt();
        System.out.println("Podaj numer sprawy");
        int caseNumber = scanner.nextInt();

        Declaration declaration = new Declaration(decDate, decValue, caseNumber);
        DeclarationManagement declarationManagement = new DeclarationManagement();
        declarationManagement.createDeclaration(declaration);

    }

    private void nearestDeclarationsDates() {
        String timeStamp = new SimpleDateFormat().format(Calendar.getInstance().getTime()).substring(0, 10);

        System.out.println("Dzisiejsza data: " + timeStamp);
        DeclarationManagement dm = new DeclarationManagement();
        System.out.println("Ile dni do przodu?");
        int daysAhead = scanner.nextInt();
        for (int i = 0; i <= daysAhead; i++) {
            LocalDate date = LocalDate.now().plusDays(i);
            System.out.println(dm.retrieveByDate(date));

            readAndExecute();
        }
        System.out.println("Podaj początkową datę w formacie dd/MM");
        LocalDate beginDecDate = LocalDate.parse(scanner.next().concat("/2020"), FORMATTER);
        System.out.println("Podaj końcową datę w formacie dd/MM");
        LocalDate endDecDate = LocalDate.parse(scanner.next().concat("/2020"), FORMATTER);
        int numOfDaysBetween = getDatesBetween(beginDecDate, endDecDate).size();
        for (int i = 0; i < numOfDaysBetween; i++) {
            LocalDate date = LocalDate.from(beginDecDate).plusDays(i);
            System.out.println(dm.retrieveByDate(date));
            readAndExecute();
        }
    }

    private static List<LocalDate> getDatesBetween(LocalDate startDate, LocalDate endDate) {
        long numOfDaysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        return IntStream.iterate(0, i -> i + 1)
                .limit(numOfDaysBetween)
                .mapToObj(i -> startDate.plusDays(i))
                .collect(Collectors.toList());
    }

    private void declarationSum() {
        DeclarationManagement dm = new DeclarationManagement();
        System.out.println("Suma wszystkich dodanych deklaracji: " + dm.getDeclarationsSum());
    }


    private void fileChecker() {
        //odczyt z pliku i wyświetlenie

        //można jeszcze dodać fileMAnager np usuń deklaracje itp

    }

    private void allDeclarationsToFile() {
        //dodać obiekty z listy do pliku!!!
    }
}
