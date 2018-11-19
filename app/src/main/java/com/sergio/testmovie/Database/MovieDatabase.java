package com.sergio.testmovie.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.sergio.testmovie.Database.Entity.Movie;
import com.sergio.testmovie.Database.Entity.TopRatedMovie;
import com.sergio.testmovie.Database.Entity.UpComingMovie;

@Database(entities = {Movie.class, TopRatedMovie.class, UpComingMovie.class}, version = 1)
 public abstract class MovieDatabase extends RoomDatabase{

    public abstract DaoAccess daoAccess();
}
