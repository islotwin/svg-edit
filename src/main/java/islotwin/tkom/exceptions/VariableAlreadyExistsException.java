package islotwin.tkom.exceptions;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class VariableAlreadyExistsException extends RuntimeException {

    final public String message;

}
