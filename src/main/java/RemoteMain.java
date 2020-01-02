import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class RemoteMain {
    public static void main(String[] args) throws IOException {
        names2();
//        RemoteControl remoteControl = new RemoteControl("black");
//
//        remoteControl.volumeUp();
//        remoteControl.volumeUp();
//        remoteControl.volumeUp();
//
//        remoteControl.nextChannel();
//        remoteControl.nextChannel();
//
//        remoteControl.setCurrentVolume(30);
//        remoteControl.setCurrentChannel(3);
//
//        System.out.println(remoteControl.getCurrentChannel());
//        System.out.println(remoteControl.getCurrentVolume());
//
//        System.out.println(remoteControl.getColor());

//        int row1 = 10;
//        int column1 = 10;
//        int counter = 1;
//        int matrix1[][] = new int[row1][column1];
//        for (int i = 0; i < matrix1.length; i++) {
//            for (int j = 0; j < matrix1.length; j++) {
//                matrix1[i][j] = counter++;
//            }
//        }
//        for (int[] tab : matrix1) {
//            System.out.println(Arrays.toString(tab));
//
//        }
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] input = br.readLine().split(" ");
//        int row = Integer.parseInt(input[0]);
//        int column = Integer.parseInt(input[1]);
//        String[][] matrix = new String[row][column];
//        for (int i = 0; i < row; i++) {
//            input = br.readLine().split(" ");
//            matrix[i] = input;
//        }
//        for (int i = 0; i < column; i++) {
//            for (int j = 0; j < row; j++) {
//                System.out.print(matrix[j][i] + " ");
//            }
//            System.out.println();
//        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int row = Integer.parseInt(input[0]);
        int column = Integer.parseInt(input[1]);
        String[][] matrix = new String[row][column];
        for (int i = 0; i < row; i++) {
            input = br.readLine().split(" ");
            matrix[i] = input;
        }
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }


    }

    //    private static void names(){
//        String[] names = {"maja","kaja", "ania", "asia", "basia", "marta", "jan", "paweł", "janusz", "kszempa", "igorek"};
//        List<String> namesWithoutA = new ArrayList<>();
//        for (int i = 0; i < names.length; i++) {
//            if(names[i].contains("j")) {
//                continue;
//            }
//            namesWithoutA.add(names[i]);
//
//            if (namesWithoutA.size()>1){
//                break;
//            }
//        }
//        namesWithoutA.forEach(System.out::println);
//    }
    private static void names2() {
        String[] names = {"maja", "kaja", "ania", "asia", "basia", "marta", "jan", "paweł", "janusz", "kszempa", "igorek"};

        Stream.of(names)
                .filter(name -> !name.contains("j"))
                .limit(2)
                .forEach(System.out::println);
    }
}
