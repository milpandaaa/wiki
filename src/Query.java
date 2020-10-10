import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Query {

    private Searchinfo searchinfo;
    private List<Search> search = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Searchinfo getSearchinfo() {
        return searchinfo;
    }

    public void setSearchinfo(Searchinfo searchinfo) {
        this.searchinfo = searchinfo;
    }

    public List<Search> getSearch() {
        return search;
    }

    public void setSearch(List<Search> search) {
        this.search = search;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Query{" +
                "searchinfo=" + searchinfo +
                ", search=" + search +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
