package com.example.syf191uygulama7;

import android.util.Log;

public class Personel {
    private int yas;
    private int maas;

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas<18 || yas>55){
            Log.e("Kapsülleme", "Hatalı Yaş Girişi Yapıldı!!");
            yas = 18;
        }
        this.yas = yas;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        if (maas<4253){
            Log.e("Kapsülleme2","Maaş 4253'ten küçük olmaz");
            maas = 4253;
        }
        this.maas = maas;
    }
}
