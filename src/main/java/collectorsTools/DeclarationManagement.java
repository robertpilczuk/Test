package collectorsTools;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

public class DeclarationManagement {
    private static final List<Declaration> decList = new ArrayList<>();

    public void createDeclaration(Declaration declaration) {
        decList.add(declaration);
        System.out.println(Arrays.toString(decList.toArray()));
        String path = "D:\\collectorsTools\\declarations.csv";

        try {
            FileWriter fileWriter = new FileWriter(path, true);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            for (int i = 0; i < decList.size(); i++) {
                writer.write(decList.get(i).toString());
                writer.write("\r\n");
                writer.flush();
            }
            System.out.println("Zapis udany!!!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Optional<Declaration> retrieveByDate(LocalDate declarationDate) {
        if (decList.size() == 0) {
            System.out.println("Brak deklaracji!!!");
        }
        //jak zrobić streama tak, żeby wyrzucał obiekt, który zostanie znaleziony???
        //bo na razie wyrzuca obiekt i info o tym, że nie ma obiektu!!!

        //chcę zrobić listę przefiltrowanych obietktów i zliczyc ich getDeclarationValue
        //jak to zrobić???
        List<Optional<Declaration>> tempList = new ArrayList<>();
        tempList.add(decList.stream()
                .filter(declaration -> declaration.getDeclarationDate().equals(declarationDate))
                .findAny());
        int sum = 0;
        for (Optional<Declaration> getValue :tempList) {
            //sum += tempList.
        }
        System.out.println("suma deklaracji w filtrze deklaracji po datach: ");

        return decList.stream()
                .filter(declaration -> declaration.getDeclarationDate().equals(declarationDate))
                .findAny();
//        return decList.stream()
//                .filter(declaration -> declaration.getDeclarationDate().equals(declarationDate))
//                .findAny().orElseThrow(() -> new IllegalArgumentException("Nie ma takich deklaracji: " + declarationDate));
    }

    public int getDeclarationsSum() {
        int decSum = 0;
        for (Declaration getValueFromDec : decList) {
            decSum += getValueFromDec.getDeclarationValue();
        }
        return decSum;
    }
}
