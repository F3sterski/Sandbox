package xmlResources;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by szkol_000 on 19.01.2017.
 */
@XmlRootElement(name="pod")
public class Pod {
    @XmlElement(name="states")
    List<State> states = new LinkedList<State>();
    @XmlElement(name="subpod")
    List<Subpod> subpods = new LinkedList<Subpod>();

    public void setSubpods(List subpods){
        this.subpods = subpods;
    }
    public void setStates(List states){
        this.states = states;
    }
    @XmlAttribute
    String title;
    @XmlAttribute
    String scanner;
    @XmlAttribute
    String id;
    @XmlAttribute
    String position;
    @XmlAttribute
    boolean error;
    @XmlAttribute
    int numsubpods;
    @XmlAttribute
    boolean primary;

    @Override
    public String toString() {
        return "Pod{" +
                "states=" + states +
                ", subpods=" + subpods +
                ", title='" + title + '\'' +
                ", scanner='" + scanner + '\'' +
                ", id='" + id + '\'' +
                ", position='" + position + '\'' +
                ", error=" + error +
                ", numsubpods=" + numsubpods +
                ", primary=" + primary +
                '}';
    }
}

