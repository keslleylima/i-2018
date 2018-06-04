package br.ufg.inf.es.integracao;

import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import org.bson.Document;

/**
 * Created by aluno on 04/06/18.
 */
public class Main {
    public static void main(String[] args) {
            MongoClientURI uri = new MongoClientURI("mongodb://keslleylima:qwe123@ds159776.mlab.com:59776/registro");
            MongoClient client = new MongoClient(uri);
            MongoDatabase db = client.getDatabase(uri.getDatabase());

            MongoCollection<Document> individuos = db.getCollection("individuo");

            MongoCursor<Document> cursor = individuos.find().iterator();

//            Document novoUser = new Document("name","Bia");
//            individuos.insertOne(novoUser);

           Document updDocument = new Document("name", "pimas2");
          individuos.updateOne(updDocument, new Document("$set", new Document("idade", 20)));

            try {
                while (cursor.hasNext()){
                    Document doc = cursor.next();
                    System.out.println(doc.get("name"));
                }
            } catch (Exception e){
                System.out.println(e);
            }



            //            DBObject query = new BasicDBObject("_id", "jo");

            //            List<Integer> books = Arrays.asList(27464, 747854);
//            DBObject person = new BasicDBObject("_id", "jo")
//                    .append("name", "Jo Bloggs")
//                    .append("address", new BasicDBObject("street", "123 Fake St")
//                            .append("city", "Faketon")
//                            .append("state", "MA")
//                            .append("zip", 12345))
//                    .append("books", books);
//
//            collection.insert(person);

    }
}
