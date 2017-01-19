package xmlResources;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by szkol_000 on 19.01.2017.
 */
@XmlRootElement(name="img")
public class Img {
    @XmlAttribute
    String src;
    @XmlAttribute
    String alt;
    @XmlAttribute
    String title;
    @XmlAttribute
    String width;
    @XmlAttribute
    String height;

    @Override
    public String toString() {
        return "Img{" +
                "src='" + src + '\'' +
                ", alt='" + alt + '\'' +
                ", title='" + title + '\'' +
                ", width='" + width + '\'' +
                ", height='" + height + '\'' +
                '}';
    }
}
