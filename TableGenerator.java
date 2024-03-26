import java.util.Random;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
class TableGenerator {
    public static void main(String[] args){
        if (args.length != 5){
            System.out.println("Use the following format:");
            System.out.println("java TableGenerator start_value num num_columns max_value txtfile");
            System.exit(1);
        }
        int start_value = Integer.parseInt(args[0]);
        int num = Integer.parseInt(args[1]);
        int num_columns = Integer.parseInt(args[2]);
        int max_value = Integer.parseInt(args[3]);
        String txtfile = args[4];
        populateFile(start_value, num, num_columns, max_value, txtfile);

    }

    public static void populateFile(int start_value, int num, int num_columns, int max_value, String txtfile){
        Random random = new Random();

        try {

            FileWriter fileWrite = new FileWriter(txtfile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWrite);

            int increment = start_value;
            for (int i = 0; i < num; i++) {
                String add_to_file = increment + " ";
                increment++;
                for (int j = 0; j < num_columns - 1; j++) {
                    int randomNumber = random.nextInt(max_value);
                    add_to_file = add_to_file + randomNumber + " ";
                }
                bufferedWriter.write(add_to_file);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e){
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }


}