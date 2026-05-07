import utils.ProgramConfiguration;
import utils.ConfigParser;
import utils.CliConfigParser;

public class Main {
    public static void main(String[] args) {
        ConfigParser parser = new CliConfigParser();
        ProgramConfiguration cfg = null;
        try {
            cfg = parser.parse(args);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
        catch (Exception e) {
            System.err.println("Fatal error!");
            System.err.println(e.getMessage());
            System.exit(1);
        }
        System.out.println(cfg.toString());
    }
}