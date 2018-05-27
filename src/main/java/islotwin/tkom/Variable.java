package islotwin.tkom;

import islotwin.tkom.exceptions.InvalidArgumentTypeException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Variable implements Comparable<Variable> {
    private final TypeEnum type;
    private final String name;
    private Object value;

    public Variable(final TypeEnum type, final String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public int compareTo(final Variable v) {
        if (!type.equals(v.getType()))
            throw new InvalidArgumentTypeException("Comparing variables of not the same type. ");
        else if (value.equals(v.getValue()))
            return 0;
        if (type.equals(TypeEnum.NUM)) {
            // TODO parse int, double, string
            return Double.compare((Double) value, (Double) v.getValue());
        }
        if (type.equals(TypeEnum.STRING)) {
            // TODO parse int, double, string
            return ((String) value).compareTo((String) v.getValue());
        }
        if (type.equals(TypeEnum.ELEM)) {
            return 0;
        }
        if (type.equals(TypeEnum.LIST)) {
            return 0;
        }
        // TODO check list, elem
        else {
            return -1;
        }
    }

}
