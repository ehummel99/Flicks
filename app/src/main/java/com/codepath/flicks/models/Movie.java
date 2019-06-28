package com.codepath.flicks.models;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

@Parcel
public class Movie {

    //values from api
    public String title;
    public String overview;
    public String posterPath;
    public String backdropPath;
    public String voteAverage;
    public Integer id;

    //initialize from JSON
    public Movie(JSONObject object) throws JSONException {
        //these are allowed to throw exceptions
        title = object.getString("title");
        overview = object.getString("overview");
        posterPath = object.getString("poster_path");
        backdropPath = object.getString("backdrop_path");
        voteAverage = object.getString("vote_average");
        id = Integer.parseInt(object.getString("id"));
    }

    //needed for Parceler
    public Movie () {}

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public String getVoteAverage() {
        return voteAverage;
    }

    public int getId () {
        return id;
    }
}
