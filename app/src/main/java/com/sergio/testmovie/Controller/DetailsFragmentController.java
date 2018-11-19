package com.sergio.testmovie.Controller;

import android.os.Bundle;
import android.view.View;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.sergio.testmovie.Model.MovieModel;
import com.sergio.testmovie.R;
import com.sergio.testmovie.Util.Constants;
import com.sergio.testmovie.Util.Utils;
import com.sergio.testmovie.View.DetailsFragment;

public class DetailsFragmentController {

    private DetailsFragment fragment;
    private String backDrop, title, originTitle, releaseDate, overview, localBackDropPath;
    private float rating;

    public DetailsFragmentController(DetailsFragment fragment){
        this.fragment = fragment;
    }

    public void initListeners(){

    }

    private void setValues(){

        //Set values
        fragment.getMovieDetailsTitle().setText(title);
        fragment.getRatingDetailsMovie().setText(String.valueOf(rating));
        fragment.getReleaseDateDetailsMovie().setText(releaseDate);
        fragment.getMovieDetailsOriginTitle().setText(originTitle);
        fragment.getOverviewDetailsMovie().setText(overview);

        if (Utils.isConnected(fragment.getActivity())){
            Glide.with(fragment.getActivity())
                    .load(Constants.IMAGE_URL + backDrop)
                    .apply(RequestOptions.placeholderOf(R.mipmap.ic_launcher))
                    .into(fragment.getMovieDetailsBackdrop());
        } else {
            Glide.with(fragment.getActivity())
                    .load(localBackDropPath)
                    .apply(RequestOptions.placeholderOf(R.mipmap.ic_launcher))
                    .into(fragment.getMovieDetailsBackdrop());
        }
    }

    public void getMovie(){

        Bundle bundle = fragment.getArguments();
        MovieModel movieModel = bundle.getParcelable("movieMod");
        //Get values
        if (movieModel != null) {
            title = movieModel.getTitle();
            rating = movieModel.getRating();
            releaseDate = movieModel.getReleaseDate();
            originTitle = movieModel.getOriginTitle();
            overview = movieModel.getOverview();
            backDrop = movieModel.getBackDrop();
            localBackDropPath = movieModel.getLocalBackDropPath();
        }
        setValues();
    }
}
