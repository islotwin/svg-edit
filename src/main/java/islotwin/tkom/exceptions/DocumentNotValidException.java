package islotwin.tkom.exceptions;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DocumentNotValidException extends RuntimeException {

    final public String message;

}
