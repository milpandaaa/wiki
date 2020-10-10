
import java.util.HashMap;
import java.util.Map;

public class Search {

    private Long ns;
    private String title;
    private Long pageid;
    private Long size;
    private Long wordcount;
    private String snippet;
    private String timestamp;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Long getNs() {
        return ns;
    }

    public void setNs(Long ns) {
        this.ns = ns;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getPageid() {
        return pageid;
    }

    public void setPageid(Long pageid) {
        this.pageid = pageid;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Long getWordcount() {
        return wordcount;
    }

    public void setWordcount(Long wordcount) {
        this.wordcount = wordcount;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}