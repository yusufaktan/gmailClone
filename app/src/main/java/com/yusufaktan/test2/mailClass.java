package com.yusufaktan.test2;

public class mailClass {
    String mailAd;
    String mailMesaj;
    int foto;

    public mailClass(String mailAd, String mailMesaj, int foto) {
        this.mailAd = mailAd;
        this.mailMesaj = mailMesaj;
        this.foto = foto;
    }

    public String getMailAd() {
        return mailAd;
    }

    public void setMailAd(String mailAd) {
        this.mailAd = mailAd;
    }

    public String getMailMesaj() {
        return mailMesaj;
    }

    public void setMailMesaj(String mailMesaj) {
        this.mailMesaj = mailMesaj;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
