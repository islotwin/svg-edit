package islotwin.tkom.exceptions;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InvalidArgumentTypeException extends RuntimeException {

    final public String message;

}
