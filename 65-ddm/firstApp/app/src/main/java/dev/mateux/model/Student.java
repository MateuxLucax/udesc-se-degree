package dev.mateux.model;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;

public class Student {
    private final String name;
    private final String email;
    private final Drawable picture;

    public Student(String name, String email, Drawable picture) {
        this.name = name;
        this.email = email;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Drawable getPicture() {
        return picture;
    }

    @NonNull
    @Override
    public String toString() {
        return  name + ", " + email;
    }
}
