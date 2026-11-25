package ders04;
public class BildirimServisi {
    private final BildirimKanali kanal;
    public BildirimServisi(BildirimKanali kanal) { this.kanal = kanal; }
    public void haberVer(String alici, String mesaj) { kanal.gonder(alici, mesaj); }
}
