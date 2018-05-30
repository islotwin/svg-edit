package islotwin.tkom.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VariableNotFoundException extends RuntimeException {

    final public String message;

    final static Logger logger = LoggerFactory.getLogger(VariableNotFoundException.class);

    public VariableNotFoundException(final String message) {
        this.message = message;
        logger.error(message);
    }

}
