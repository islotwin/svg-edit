package islotwin.tkom.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InvalidArgumentTypeException extends RuntimeException {

    final public String message;

    final static Logger logger = LoggerFactory.getLogger(InvalidArgumentTypeException.class);

    public InvalidArgumentTypeException(final String message) {
        this.message = message;
        logger.error(message);
    }

}
