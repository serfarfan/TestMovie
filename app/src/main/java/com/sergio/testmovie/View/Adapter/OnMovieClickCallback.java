package com.sergio.testmovie.View.Adapter;

import com.sergio.testmovie.Api.Request.MovieRequest;
import com.sergio.testmovie.Database.Entity.Movie;
import com.sergio.testmovie.Database.Entity.TopRatedMovie;
import com.sergio.testmovie.Database.Entity.UpComingMovie;

public interface OnMovieClickCallback {

    void onClick(MovieRequest movie);

    void onClick(Movie movie);
    void onClick(TopRatedMovie movie);
    void onClick(UpComingMovie movie);
}
