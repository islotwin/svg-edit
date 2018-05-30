package islotwin.tkom.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FunctionNotFoundException extends RuntimeException {

    final public String message;

    final static Logger logger = LoggerFactory.getLogger(FunctionNotFoundException.class);

    public FunctionNotFoundException(final String message) {
        this.message = message;
        logger.error(message);
    }

}
