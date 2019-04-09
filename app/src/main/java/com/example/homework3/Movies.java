package com.example.homework3;

import android.os.Parcel;
import android.os.Parcelable;

public class Movies implements Parcelable {

    public int image;
    public String title;
    public String rating;
    public String info;

    public Movies(int image, String title, String rating, String info) {
        this.image = image;
        this.title = title;
        this.rating = rating;
        this.info = info;
    }

    protected Movies(Parcel in) {
        image = in.readInt();
        title = in.readString();
        rating = in.readString();
        info = in.readString();
    }

    public static final Creator<Movies> CREATOR = new Creator<Movies>() {
        @Override
        public Movies createFromParcel(Parcel in) {
            return new Movies(in);
        }

        @Override
        public Movies[] newArray(int size) {
            return new Movies[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

        parcel.writeInt(image);
        parcel.writeString(title);
        parcel.writeString(rating);
        parcel.writeString(info);
    }
}