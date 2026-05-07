package utils;

public class CliConfigParser implements ConfigParser {
    @Override
    public ProgramConfiguration parse(String[] args) {
        ProgramConfiguration cfg = new ProgramConfiguration();

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {

                case "-s": case "-size": {
                    String val = requireNext(args, i++, "-s");
                    String[] parts = val.split(":");
                    if (parts.length != 2)
                    {
                        throw new IllegalArgumentException("-s очаква формат <width>:<height>, получено: " + val);
                    }
                    cfg.setWidth(parseInt(parts[0], "-s width"));
                    cfg.setHeight(parseInt(parts[1], "-s height"));
                    break;
                }

                case "-r": {
                    String val = requireNext(args, i++, "-r");
                    String[] parts = val.split(":");
                    if (parts.length != 4)
                    {
                        throw new IllegalArgumentException("-r очаква формат a0:a1:b0:b1, получено: " + val);
                    }
                    cfg.setReMin(parseDouble(parts[0], "-r reMin"));
                    cfg.setReMax(parseDouble(parts[1], "-r reMax"));
                    cfg.setImMin(parseDouble(parts[2], "-r imMin"));
                    cfg.setImMax(parseDouble(parts[3], "-r imMax"));
                    if (cfg.getReMin() >= cfg.getReMax())  throw new IllegalArgumentException("-r: reMin трябва да е < reMax");
                    if (cfg.getImMin() >= cfg.getImMax())  throw new IllegalArgumentException("-r: imMin трябва да е < imMax");
                    break;
                }

                case "-t": {
                    String val = requireNext(args, i++, "-t");
                    int threads = parseInt(val, "-t");
                    if (threads < 1)
                    {
                        throw new IllegalArgumentException("-t: броят нишки трябва да е >= 1");
                    }
                    cfg.setThreads(threads);
                    break;
                }

                case "-o": {
                    cfg.setOutput(requireNext(args, i++, "-o"));
                    break;
                }

                case "-i": {
                    String val = requireNext(args, i++, "-i");
                    int maxIter = parseInt(val, "-i");
                    if (maxIter < 1)  throw new IllegalArgumentException("-i: max итерации трябва да са >= 1");
                    cfg.setMaxIter(maxIter);
                    break;
                }

                case "-q":
                    cfg.setQuiet(true);
                    break;

                case "-d":
                    cfg.setDynamic(true);
                    break;

                default:
                    System.err.println("Непознат аргумент: " + args[i]);
            }
        }

        return cfg;
    }

    private String requireNext(String[] args, int i, String flag) {
        if (i + 1 >= args.length)
        {
            throw new IllegalArgumentException(flag + " изисква стойност след флага");
        }
        return args[i + 1];
    }

    private int parseInt(String s, String context) {
        try {
            return Integer.parseInt(s.trim());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Невалидна стойност за " + context + ": '" + s + "'");
        }
    }

    private double parseDouble(String s, String context) {
        try {
            return Double.parseDouble(s.trim());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Невалидна стойност за " + context + ": '" + s + "'");
        }
    }
}