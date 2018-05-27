package islotwin.tkom.exceptions;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FunctionNotFoundException extends RuntimeException {

    final public String message;

}
