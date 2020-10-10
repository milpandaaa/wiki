import com.google.gson.Gson;
import jdk.nashorn.internal.parser.JSONParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.sql.SQLOutput;


public class Wikipedia {

    String request;

    public String getRequest() {
        return request;
    }

    public Wikipedia(String request) throws UnsupportedEncodingException {
        this.request = request;
        final char dm = (char) 34;
        this.request = URLEncoder.encode(this.request, "UTF-8");
        this.request ="https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch="+ dm + this.request +dm;
        System.out.print(this.request);
    }

    public void answerWikipedia() throws Exception {
        this.request = executePost();
        responseProcessing();
    }

    public String executePost() throws Exception {
        URL yahoo = new URL(this.request);
        URLConnection yc = yahoo.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        yc.getInputStream()));
        String inputLine;
        String outLine = null;

        while ((inputLine = in.readLine()) != null)
            outLine+=inputLine;
        in.close();
        return outLine;
    }

    public void responseProcessing(){
        Gson g = new Gson();
        Page page = g.fromJson(request, Page.class);
        Query query = page.getQuery();
        for (Search search : query.getSearch()) {
            System.out.println(search.getTitle());
            System.out.println(search.getSnippet());
//            for (Phones phone : temp.phoneNumbers) {
//                System.out.println(" - phone type: " + phone.type + ", phone number : " + phone.number);
//            }
        }
    }
}
