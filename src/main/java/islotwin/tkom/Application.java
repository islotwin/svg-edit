package islotwin.tkom;

import islotwin.tkom.gen.GramLexer;
import islotwin.tkom.gen.GramParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {


    public static void main(String[] args) throws Exception {

        // final CharStream charStream = CharStreams.fromFileName("/Users/iga/Desktop/arrow-down-rounded-light.svg");
        // final GramLexer lexer = new GramLexer(charStream);
        final String script = ScriptHandler.parseFile();
        final GramLexer lexer = new GramLexer(CharStreams.fromString(script));
        final GramParser parser = new GramParser(new CommonTokenStream(lexer));

        Visitor visitor = new Visitor();
        visitor.visit(parser.program());
    }

}
