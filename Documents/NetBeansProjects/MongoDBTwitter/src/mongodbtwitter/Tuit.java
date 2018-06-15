package mongodbtwitter;

import java.io.Serializable;
import java.util.Date;
import org.bson.Document;

/** Guarda el text d'un tuit, l'identificador únic i quan es va piular.
 * ISODate de MongoDB és compatible amb la classe Date de Java.
 * POJO amb funcions afegides per convertir a la classe org.bson.Document
 *
 * @author montse
 * @version abril 2016
 */
public class Tuit implements Serializable{
private String text;
private long id;
private Date data;

    public Tuit(String text, long id, Date data) {
        this.text = text;
        this.id = id;
        this.data = data;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
 
    public Document toDocument(){
     Document aux=new Document();
     aux.put("text",text);
     aux.put("id", id);
     aux.put("data",data);
     return aux;
    }
   
    public Tuit(Document doc){
        text=(String)doc.get("text");
        id=(Long)doc.get("id");
        data=(Date)doc.get("data");
    }    

    @Override
    public String toString() {
        return "Tuit{" + "text=" + text + ", id=" + id + ", data=" + data + '}';
    }
    
}

