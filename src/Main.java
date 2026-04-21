import utils.ProgramConfiguration;

/**
 * Входна точка на програмата.
 * Поддържани аргументи:
 *   -s / -size     <width>x<height>   Размер на изображението (по подразбиране: 640x480)
 *   -r / -rect     <a0>:<a1>:<b0>:<b1> Комплексна равнина (по подразбиране: -2.0:2.0:-2.0:2.0)
 *   -t / -tasks    <n>                 Брой нишки (по подразбиране: 1)
 *   -o / -output   <file>              Изходен файл (по подразбиране: zad15.png)
 *   -q / -quiet                        Тих режим — само общото време
 *   -d / -dynamic                      Динамично балансиране (по подразбиране: статично)
 *   -i / -iter     <n>                 Макс. брой итерации (по подразбиране: 1000)
 */

public class Main {
    public static void main(String[] args) {
        ProgramConfiguration cfg = parseArgs(args);
    }
}