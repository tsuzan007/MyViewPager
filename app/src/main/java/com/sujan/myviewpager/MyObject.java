package com.sujan.myviewpager;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by macbookpro on 4/6/17.
 */

public class MyObject implements Parcelable {
    String name;
    int age;
    String gender;

    public MyObject(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    protected MyObject(Parcel in) {
        this.name = in.readString();
        this.age = in.readInt();
        this.gender = in.readString();


    }

    public static final Creator<MyObject> CREATOR = new Creator<MyObject>() {
        @Override
        public MyObject createFromParcel(Parcel in) {
            return new MyObject(in);
        }

        @Override
        public MyObject[] newArray(int size) {
            return new MyObject[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
        dest.writeString(gender);

    }
}
