package bd;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Failik {
    private static int numb = 7;
    private static String fileName = "E://Sd/vlad.txt:1111.txt";

    public static void main(String[] args) throws IOException {
    	 Random random = new Random();
         int randNum = random.nextInt(10);
         System.out.println(randNum);
      
        Failik laba = new Failik();
        File file = new File(fileName);
            file.createNewFile();
        PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            out.print(numb);

        StringBuilder sb = new StringBuilder();
        file.exists();
        BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
            String s;
            while ((s = in.readLine()) != null) {
                sb.append(s);
                sb.append("\n");
            }

       
        int somePass = randNum + numb;
        int someValue;
        System.out.println("Тепер додайте виведене рандомне число до паролю: ");
        Scanner scanner = new Scanner(System.in);
        someValue = scanner.nextInt();
        Runtime runtime = Runtime.getRuntime();

        if (someValue == somePass) {
            System.out.println("Ви ввійшли!");
        }
        else System.out.println("Ви ввели неправильний пароль!!");
    }

}