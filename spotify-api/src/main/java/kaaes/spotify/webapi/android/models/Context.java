package kaaes.spotify.webapi.android.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Context implements Parcelable{
    public String type;
    public String href;
    public String uri;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.type);
        dest.writeString(this.href);
        dest.writeString(this.uri);

    }

    public Context() {
    }

    protected Context(Parcel in) {
        this.type = (String) in.readValue(String.class.getClassLoader());
        this.href = (String) in.readValue(String.class.getClassLoader());
        this.uri = (String) in.readValue(String.class.getClassLoader());
    }

    public static final Parcelable.Creator<Context> CREATOR = new Parcelable.Creator<Context>() {
        public Context createFromParcel(Parcel source) {
            return new Context(source);
        }

        public Context[] newArray(int size) {
            return new Context[size];
        }
    };
}
