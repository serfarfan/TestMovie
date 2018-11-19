package com.sergio.testmovie.Application;

import android.app.Application;
import android.arch.persistence.room.Room;

import com.sergio.testmovie.Database.MovieDatabase;

public class MovieApp extends Application {

    private static MovieDatabase movieDatabase;

    @Override
    public void onCreate() {
        super.onCreate();
        movieDatabase = Room.databaseBuilder(getApplicationContext(), MovieDatabase.class,
                "MovieDb").build();
    }

    public static MovieDatabase getDatabase() {
        return movieDatabase;
    }
}
