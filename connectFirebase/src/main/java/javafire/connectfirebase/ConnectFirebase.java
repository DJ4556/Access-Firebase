package javafire.connectfirebase;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.io.IOException;

public class ConnectFirebase {

    
    public Firestore beginFirestore(){

        try {
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(getClass().getResourceAsStream("asereje-a6027-firebase-adminsdk-wgu7z-9e81bca85a.json")))
                    .setDatabaseUrl("https://asereje-a6027-default-rtdb.firebaseio.com")
                    .build();
            
            FirebaseApp.initializeApp(options);
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return FirestoreClient.getFirestore();
    }
        
}
