package islotwin.tkom;

import islotwin.tkom.exceptions.InvalidArgumentTypeException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.w3c.dom.Element;
import org.w3c.dom.svg.SVGDocument;

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
        else if (type.equals(TypeEnum.NUM)) {
            return Double.compare((Double) value, (Double) v.getValue());
        }
        else if (type.equals(TypeEnum.STRING)) {
            return ((String) value).compareTo((String) v.getValue());
        }
        else if (type.equals(TypeEnum.ELEM)) {
            if (this.equals((Element) v.value))
                return 0;
        }
        else if (type.equals(TypeEnum.LIST)) {
            if (this.equals((SVGDocument) v.value))
                return 0;
        }
        return -1;
    }

}
