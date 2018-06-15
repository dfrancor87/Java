package mongodbtwitter;

import java.io.Serializable;
import java.util.Date;
import org.bson.Document;

/**
 *
 * @author Danny Franco
 */
public class TrendingTopics implements Serializable {

    private String ciudad;
    private String tendencia;
    private String url;
    private Date data;

    public TrendingTopics(String ciudad, String tendencia, String url, Date data) {
        this.ciudad = ciudad;
        this.tendencia = tendencia;
        this.url = url;
        this.data = data;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTendencia() {
        return tendencia;
    }

    public void setTendencia(String tendencia) {
        this.tendencia = tendencia;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Document toDocument() {
        Document aux = new Document();
        aux.put("ciudad", ciudad);
        aux.put("tendencia", tendencia);
        aux.put("url", url);
        aux.put("data", data);

        return aux;
    }

    public TrendingTopics(Document doc) {
        ciudad = (String) doc.get("ciudad");
        tendencia = (String) doc.get("tendencia");
        url = (String) doc.get("url");
        data = (Date) doc.get("data");
    }

    @Override
    public String toString() {
        return "TrendingTopics{" + "ciudad=" + ciudad + ", tendencia=" + tendencia + ", url=" + url + ", data=" + data + '}';
    }
    
    
}
