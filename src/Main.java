import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int validFilePathCount = 0; // Счетчик для верно указанных путей к файлам
        while (true) {
            System.out.print("Введите путь к файлу: ");
            String path = new Scanner(System.in).nextLine();
            if (path.isEmpty()) {
                System.out.println("Путь не может быть пустым.");
                continue;
            }
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            if (!fileExists) {
                System.out.println("Файл не существует.");
                continue;
            }
            if (isDirectory) {
                System.out.println("Указанный путь является директорией, а не файлом.");
                continue;
            }
            validFilePathCount++;
            System.out.println("Путь указан верно ");
            System.out.println("Общее количество верно указанных путей к файлам: " + validFilePathCount);
        }
    }
}