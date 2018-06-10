package kaaes.spotify.webapi.android.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Map;

public class CurrentlyPlaying implements Parcelable {
    public boolean is_playing;
    public Track item;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.is_playing);
        dest.writeParcelable(this.item, 0);
    }

    public CurrentlyPlaying() {
    }

    protected CurrentlyPlaying(Parcel in) {
        this.is_playing = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.item = in.readParcelable(Track.class.getClassLoader());
    }

    public static final Parcelable.Creator<CurrentlyPlaying> CREATOR = new Parcelable.Creator<CurrentlyPlaying>() {
        public CurrentlyPlaying createFromParcel(Parcel source) {
            return new CurrentlyPlaying(source);
        }

        public CurrentlyPlaying[] newArray(int size) {
            return new CurrentlyPlaying[size];
        }
    };
}