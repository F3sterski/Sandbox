package xmlResources;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class ConnectionTest {


    public static void main(String[] args) throws JAXBException, IOException {

        URL url = new URL("http://ap+" +
                "i.wolframa+" +
                "lpha.com/v2/que+" +
                "ry?inp+" +
                "ut=3*4/7&app+" +
                "id=9UK+" +
                "PL3-82YH+" +
                "Y62+" +
                "U3G");

        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.addRequestProperty("User-Agent", "Mozilla/4.76");
        InputStream is = http.getInputStream();

        JAXBContext jc =  JAXBContext.newInstance(QueryResult.class);
        Unmarshaller jaxbUnmarshaller = jc.createUnmarshaller();
        QueryResult qr = (QueryResult) jaxbUnmarshaller.unmarshal(is);
        System.out.println(qr);

    }
}
