package util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import model.edunova.model.Operator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import us.codecraft.xsoup.Xsoup;


public class Util {

    public static Operator operator;
    public static final String APP_TITLE = "Edunova app";

    public static String getTitle(String title) {
        if (Util.operator == null) {
            return Util.APP_TITLE + title;
        }
        return Util.APP_TITLE + " " + title + " " + Util.operator.getName() + " "
                + Util.operator.getSurname() + " - " + Util.operator.getRole();
    }

    public static String generateOib() {
        try {
            URL url = new URL("http://oib.itcentrala.com/oib-generator/");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()
                    ));

            String inputLine;
            StringBuilder sb = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                sb.append(inputLine);
            }
            in.close();
            Document d = Jsoup.parse(sb.toString());

            return Xsoup.compile("/html/body/div[1]/div[1]/text()").evaluate(d).get();

        } catch (Exception e) {
        }

        return "";
    }

}
