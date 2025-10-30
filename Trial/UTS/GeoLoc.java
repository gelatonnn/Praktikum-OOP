/**Soal No. 1:
Buatlah kelas dengan nama GeoLoc. Kelas ini mempunyai 3 buah atribut yaitu lat
(latitude) bertipe float, Ion (longitude) bertipe float, dan alt (altitude) yang bertipe
integer. Kelas ini mempunyai sebuah konstruktor berparameter lat, lon, dan alt
yang nilainya dijadikan inisialisasi nilai atribut kelas ini. Kelas ini juga memiliki sebuah
method bernama setLoc dengan parameter lat, don, dan alt setter heiga
atribut yang dimiliki. Lengkapi getter agar aspek information hiding terpenuhi. */

public class GeoLoc {
    private float latitude;
    private float longitude;
    private int alt;

    public GeoLoc(float latitude, float longitude, int alt) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.alt = alt;
    }

    public setLoc(float latitude, float longitude, int alt) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.alt = alt;
    }

    public void setLatitude (float latitude) {
        this.latitude = latitude;
    }

    public void setLongitude (float longitude) {
        this.longitude = longitude;
    }

    public void setAlt (int alt) {
        this.alt = alt;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }
    public int getAlt() {
        return alt;
    }

}