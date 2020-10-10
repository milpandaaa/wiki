import java.util.HashMap;
import java.util.Map;

public class Continue {

    private Long sroffset;
    private String _continue;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Long getSroffset() {
        return sroffset;
    }

    public void setSroffset(Long sroffset) {
        this.sroffset = sroffset;
    }

    public String getContinue() {
        return _continue;
    }

    public void setContinue(String _continue) {
        this._continue = _continue;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
