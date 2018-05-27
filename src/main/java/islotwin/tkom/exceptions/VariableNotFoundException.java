package islotwin.tkom.exceptions;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class VariableNotFoundException extends RuntimeException {

    final public String message;

}
