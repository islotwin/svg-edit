package islotwin.tkom.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VariableAlreadyExistsException extends RuntimeException {

    final public String message;

    final static Logger logger = LoggerFactory.getLogger(VariableAlreadyExistsException.class);

    public VariableAlreadyExistsException(final String message) {
        this.message = message;
        logger.error(message);
    }
}
