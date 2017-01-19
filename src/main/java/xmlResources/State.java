package xmlResources;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by szkol_000 on 19.01.2017.
 */
@XmlRootElement(name="state")
public class State {
    @XmlAttribute
    String name;
    @XmlAttribute
    String input;

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", input='" + input + '\'' +
                '}';
    }
}
