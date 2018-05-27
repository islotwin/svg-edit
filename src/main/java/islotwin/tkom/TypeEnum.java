package islotwin.tkom;

import islotwin.tkom.exceptions.InvalidArgumentTypeException;
import lombok.AllArgsConstructor;

import java.util.Arrays;

@AllArgsConstructor
public enum TypeEnum {

    NUM("num"), STRING("string"), LIST("list"), ELEM("elem"), VOID("");

    private final String name;

    public static TypeEnum parseType(final String type) {
        return Arrays.stream(TypeEnum.values())
                .filter(e -> e.name.equals(type))
                .findAny()
                .orElseThrow(() -> new InvalidArgumentTypeException("Type '" + type + "' not found."));
    }

}
