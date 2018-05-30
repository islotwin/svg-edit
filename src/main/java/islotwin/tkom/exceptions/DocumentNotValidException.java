package islotwin.tkom.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DocumentNotValidException extends RuntimeException {

    final public String message;

    final static Logger logger = LoggerFactory.getLogger(DocumentNotValidException.class);

    public DocumentNotValidException(final String message) {
        this.message = message;
        logger.error(message);
    }

}
