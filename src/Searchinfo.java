import java.util.HashMap;
import java.util.Map;

public class Searchinfo {

    private Long totalhits;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Long getTotalhits() {
        return totalhits;
    }

    public void setTotalhits(Long totalhits) {
        this.totalhits = totalhits;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}