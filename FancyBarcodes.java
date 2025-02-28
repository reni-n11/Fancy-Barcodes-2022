import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int barcodeCount = Integer.parseInt(scanner.nextLine());
        String validBarcodeRegex = "@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+";
        //"@, #, an uppercase letter, at least 4 uppercase or lowercase letters or digits from 0 to 9, an uppercase letter, @, #
        Pattern pattern = Pattern.compile(validBarcodeRegex);
        Matcher matcher = null;

        for (int i = 0; i < barcodeCount; i++) {
            String barcode = scanner.nextLine();
             matcher = pattern.matcher(barcode);
             if (matcher.find()){//ако има съвпадение
                 StringBuilder sb = new StringBuilder();
                 for (int j = 0; j < barcode.length(); j++) { //обхождаме баркода
                    char symbol = barcode.charAt(j);
                    if (Character.isDigit(symbol)) {//ако е цифра
                        sb.append(symbol);
                    }
                 }
                 if (sb.length() == 0){
                     System.out.println("Product group: 00");
                 } else {
                     System.out.printf("Product group: %s%n", sb);
                 }
             } else {
                 System.out.println("Invalid barcode");
             }
        }
    }
}
