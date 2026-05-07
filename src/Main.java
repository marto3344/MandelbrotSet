import utils.ProgramConfiguration;
import utils.ConfigParser;
import utils.CliConfigParser;

public class Main {
    public static void main(String[] args) {
        ConfigParser parser = new CliConfigParser();
        ProgramConfiguration cfg = parser.parse(args);
        System.out.println(cfg.toString());
    }
}