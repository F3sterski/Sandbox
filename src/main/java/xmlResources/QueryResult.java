package xmlResources;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by szkol_000 on 19.01.2017.
 */
@XmlRootElement(name="queryresult")
public class QueryResult {

    @XmlElement(name="pod")
    List<Pod> pods = new LinkedList<Pod>();

    public void setPods(List pods){
        this.pods = pods;
    }

    @Override
    public String toString() {
        return "QueryResult{\n" +
                "pods=" + pods +
                "\n}";
    }
}
