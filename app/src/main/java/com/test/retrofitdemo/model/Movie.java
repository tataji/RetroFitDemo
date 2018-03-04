package com.test.retrofitdemo.model;

import com.google.gson.annotations.SerializedName;


public class Movie {
    @SerializedName("PoliceStaion")
    private String PoliceStation;
    @SerializedName("PSCode")
    private String PSCode;
    @SerializedName("PSID")
    private String PSID;
//    @SerializedName("release_date")
//    private String releaseDate;
//    @SerializedName("genre_ids")
//    private List<Integer> genreIds = new ArrayList<Integer>();
//    @SerializedName("id")
//    private Integer id;
//    @SerializedName("original_title")
//    private String originalTitle;
//    @SerializedName("original_language")
//    private String originalLanguage;
//    @SerializedName("title")
//    private String title;
//    @SerializedName("backdrop_path")
//    private String backdropPath;
//    @SerializedName("popularity")
//    private Double popularity;
//    @SerializedName("vote_count")
//    private Integer voteCount;
//    @SerializedName("video")
//    private Boolean video;
//    @SerializedName("vote_average")
//    private Double voteAverage;

    public Movie(String PoliceStation, String PSCode, String PSID) {
        this.PoliceStation = PoliceStation;
        this.PSCode = PSCode;
        this.PSID = PSID;

    }

    public String getPoliceStation() {
        return PoliceStation;
    }

    public void setPoliceStation(String policeStation) {
        PoliceStation = policeStation;
    }

    public String getPSCode() {
        return PSCode;
    }

    public void setPSCode(String PSCode) {
        this.PSCode = PSCode;
    }

    public String getPSID() {
        return PSID;
    }

    public void setPSID(String PSID) {
        this.PSID = PSID;
    }
    //    public String getPosterPath() {
//        return posterPath;
//    }
//
//    public void setPosterPath(String posterPath) {
//        this.posterPath = posterPath;
//    }
//
//    public boolean isAdult() {
//        return adult;
//    }
//
//    public void setAdult(boolean adult) {
//        this.adult = adult;
//    }
//
//    public String getOverview() {
//        return overview;
//    }
//
//    public void setOverview(String overview) {
//        this.overview = overview;
//    }
//
//    public String getReleaseDate() {
//        return releaseDate;
//    }
//
//    public void setReleaseDate(String releaseDate) {
//        this.releaseDate = releaseDate;
//    }
//
//    public List<Integer> getGenreIds() {
//        return genreIds;
//    }
//
//    public void setGenreIds(List<Integer> genreIds) {
//        this.genreIds = genreIds;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getOriginalTitle() {
//        return originalTitle;
//    }
//
//    public void setOriginalTitle(String originalTitle) {
//        this.originalTitle = originalTitle;
//    }
//
//    public String getOriginalLanguage() {
//        return originalLanguage;
//    }
//
//    public void setOriginalLanguage(String originalLanguage) {
//        this.originalLanguage = originalLanguage;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getBackdropPath() {
//        return backdropPath;
//    }
//
//    public void setBackdropPath(String backdropPath) {
//        this.backdropPath = backdropPath;
//    }
//
//    public Double getPopularity() {
//        return popularity;
//    }
//
//    public void setPopularity(Double popularity) {
//        this.popularity = popularity;
//    }
//
//    public Integer getVoteCount() {
//        return voteCount;
//    }
//
//    public void setVoteCount(Integer voteCount) {
//        this.voteCount = voteCount;
//    }
//
//    public Boolean getVideo() {
//        return video;
//    }
//
//    public void setVideo(Boolean video) {
//        this.video = video;
//    }
//
//    public Double getVoteAverage() {
//        return voteAverage;
//    }
//
//    public void setVoteAverage(Double voteAverage) {
//        this.voteAverage = voteAverage;
//    }
}
