package info.continuum.firebase.Core;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by AkifHatipoğlu on 23.12.2016.
 */

public class FirebaseAuthOperations {

    //Todo:Singleton pattern eklenmeli
    private FirebaseAuth fAuth;

    public FirebaseAuthOperations(FirebaseAuth fAuth) {
        this.fAuth = fAuth;
    }

    public void setfAuth(FirebaseAuth fAuth) {
        this.fAuth = fAuth;
    }

    public FirebaseAuth getfAuth() {
        return fAuth;
    }

    //Todo: google, passport, fb ve anonym login fonksiyonları buraya taşınacak.
}
