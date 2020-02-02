package collectorsTools;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Declaration {
    @Override
    public String toString() {
        return "\rData: " + declarationDate + "\r kwota: " +
                declarationValue + "zł" + "\r nr sprawy: " +
                declarationCaseNumber +"\n" ;
    }

    private LocalDate declarationDate;
    private int declarationValue;
    private int declarationCaseNumber;

    public Declaration(LocalDate declarationDate, int declarationValue, int declarationCaseNumber) {
        this.declarationDate = declarationDate;
        this.declarationValue = declarationValue;
        this.declarationCaseNumber = declarationCaseNumber;
    }

    public LocalDate getDeclarationDate() {
        return declarationDate;
    }

    public int getDeclarationValue() {
        return declarationValue;
    }

    public int getDeclarationCaseNumber() {
        return declarationCaseNumber;
    }

    public void setDeclarationDate(LocalDate declarationDate) {
        this.declarationDate = declarationDate;
    }

    public void setDeclarationValue(int declarationValue) {
        this.declarationValue = declarationValue;
    }

    public void setDeclarationCaseNumber(int declarationCaseNumber) {
        this.declarationCaseNumber = declarationCaseNumber;
    }
}
