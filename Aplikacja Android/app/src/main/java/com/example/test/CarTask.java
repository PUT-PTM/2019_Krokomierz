package com.example.test;
import android.content.Context;
import android.content.Intent;

public class CarTask implements Runnable  {

    private Context kontekst;

    CarTask(Context context) {
        kontekst = context;
    }

    @Override
    public void run() {
        while (Integer.parseInt(BTStatic.stepsCar.getText().toString()) < BTStatic.whenIssue) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.print(e.getMessage());
            }
        }

        //BTStatic.ready = true;
        kontekst.sendBroadcast(new Intent("com.example.READY"));
    }
}
