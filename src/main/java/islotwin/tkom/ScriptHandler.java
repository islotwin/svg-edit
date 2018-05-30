package islotwin.tkom;

import java.util.Scanner;

public abstract class ScriptHandler {

    public static String parseFile() {
        final Scanner scanner = new Scanner(System.in);

        final String script = scanner.useDelimiter("\\A").next();

        return script;
    }
}
