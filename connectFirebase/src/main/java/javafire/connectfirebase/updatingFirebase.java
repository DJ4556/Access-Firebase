package javafire.connectfirebase;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author diego
 */
public class updatingFirebase {
        //add Delete Update
    
    private static Firestore bd = null;
    public updatingFirebase(){
        ConnectFirebase connectFirebase = new ConnectFirebase();
        bd = connectFirebase.beginFirestore();
    }
    
    public boolean addFirebase(Item item){
        
        Boolean key = false;
        // Create a Map to store the data we want to set
        Map<String, Object> docItem = new HashMap<>();
            docItem.put("id", item.getId().toString());
            docItem.put("name", item.getName());
            docItem.put("price", item.getPrice().toString());
            
// Add a new document (asynchronously) in collection "cities" with id "LA"
        ApiFuture<WriteResult> future = bd.collection("Items").document(UUID.randomUUID().toString()).set(docItem);
        try {
            // ...
// future.get() blocks on response
        System.out.println("Update time : " + future.get().getUpdateTime());
        key = true;
                } catch (InterruptedException | ExecutionException ex) {
                    ex.printStackTrace();
                } 
        return key;
    }
}
