package mongodbtwitter;

import java.io.Serializable;
import java.util.Date;
import org.bson.Document;

/**
 *
 * @author Danny Franco
 */
public class Info implements Serializable {

    private String hashtagFrase;
    private String usuario;
    private Date data;
    private String url;

    public Info(String hashtagFrase, String usuario, Date data, String url) {
        this.hashtagFrase = hashtagFrase;
        this.usuario = usuario;
        this.data = data;
        this.url = url;
    }

    public Info(String hashtagFrase, String usuario, Date data) {
        this.hashtagFrase = hashtagFrase;
        this.usuario = usuario;
        this.data = data;

    }

    public String getHashtagFrase() {
        return hashtagFrase;
    }

    public void setHashtagFrase(String hashtagFrase) {
        this.hashtagFrase = hashtagFrase;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Document toDocument() {
        Document aux = new Document();
        aux.put("hashtagFrase", hashtagFrase);
        aux.put("usuario", usuario);
        aux.put("data", data);
        aux.put("url", url);

        return aux;
    }

    public Document toDocumentNotUrl() {
        Document aux = new Document();
        aux.put("hashtagFrase", hashtagFrase);
        aux.put("usuario", usuario);
        aux.put("data", data);

        return aux;
    }

    public Info(Document doc) {
        hashtagFrase = (String) doc.get("hashtagFrase");
        usuario = (String) doc.get("usuario");
        data = (Date) doc.get("data");
        url = (String) doc.get("url");
    }

    @Override
    public String toString() {
        return "Info{" + "hashtagFrase=" + hashtagFrase + ", usuario=" + usuario + ", data=" + data + ", url=" + url + '}';
    }
}
