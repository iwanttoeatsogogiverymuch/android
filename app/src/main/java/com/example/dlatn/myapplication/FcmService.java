package com.example.dlatn.myapplication;

import android.util.Log;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class FcmService extends FirebaseInstanceIdService {
    public FcmService() {
    }

    @Override
    public void onTokenRefresh(){
        String refresthToken = FirebaseInstanceId.getInstance().getToken();
        Log.d("fcm","refreshed Token:" + refresthToken);
        Toast.makeText(getApplicationContext(),"resigterToken",Toast.LENGTH_SHORT);

    }


}
