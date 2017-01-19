package xmlResources;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by szkol_000 on 19.01.2017.
 */
@XmlRootElement(name="subpod")
public class Subpod {
    @XmlElement
    Img img;
    @XmlElement
    String plaintext;

    @Override
    public String toString() {
        return "Subpod{" +
                "img=" + img +
                ", plaintext='" + plaintext + '\'' +
                '}';
    }
}
