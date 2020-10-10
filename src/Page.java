
import java.util.HashMap;
import java.util.Map;

public class Page {

    private String batchcomplete;
    private Continue _continue;
    private Query query;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getBatchcomplete() {
        return batchcomplete;
    }

    public void setBatchcomplete(String batchcomplete) {
        this.batchcomplete = batchcomplete;
    }

    public Continue getContinue() {
        return _continue;
    }

    public void setContinue(Continue _continue) {
        this._continue = _continue;
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Page(String batchcomplete, Continue _continue, Query query, Map<String, Object> additionalProperties) {
        this.batchcomplete = batchcomplete;
        this._continue = _continue;
        this.query = query;
        this.additionalProperties = additionalProperties;
    }
}