package com.example.emlody;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;

public class LoadingAlert {
    private Activity activity;
    private AlertDialog dialog;
    LoadingAlert(Activity activity){
        this.activity=activity;

    }
    void startAlertDialog(){
        AlertDialog.Builder builder=new AlertDialog.Builder(activity);
        LayoutInflater inflater=activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.dialog_layout,null));
        builder.setCancelable(true);
        dialog=builder.create();
        dialog.show();

    }
    void  closeAlertDialog(){
        dialog.dismiss();
    }
}
