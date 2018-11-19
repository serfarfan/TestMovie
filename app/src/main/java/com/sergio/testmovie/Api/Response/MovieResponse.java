package com.sergio.testmovie.Api.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sergio.testmovie.Api.Request.MovieRequest;

import java.util.List;

public class MovieResponse {

    @SerializedName("page")
    @Expose
    private int page;

    @SerializedName("total_results")
    @Expose
    private int totalResults;

    @SerializedName("results")
    @Expose
    private List<MovieRequest> movieList;


    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<MovieRequest> getMovies() {
        return movieList;
    }

    public void setMovies(List<MovieRequest> movieList) {
        this.movieList = movieList;
    }


}
