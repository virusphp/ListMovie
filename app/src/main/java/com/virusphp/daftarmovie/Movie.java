package com.virusphp.daftarmovie;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {

    private int foto;
    private String nama, deskripsi;

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.foto);
        dest.writeString(this.nama);
        dest.writeString(this.deskripsi);
    }

    public Movie() {
    }

    protected Movie(Parcel in) {
        this.foto = in.readInt();
        this.nama = in.readString();
        this.deskripsi = in.readString();
    }

    public static final Parcelable.Creator<Movie> CREATOR = new Parcelable.Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel source) {
            return new Movie(source);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };
}
