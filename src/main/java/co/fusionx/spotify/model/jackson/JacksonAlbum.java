package co.fusionx.spotify.model.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Set;

import co.fusionx.spotify.model.Album;
import co.fusionx.spotify.model.PagingObject;

public class JacksonAlbum extends JacksonSimpleAlbum implements Album {

    @JsonProperty(value = "artists")
    private Set<JacksonSimpleArtist> mArtists;

    @JsonProperty(value = "external_ids")
    private JacksonExternalID mExternalID;

    @JsonProperty(value = "genres")
    private Set<String> mGenres;

    @JsonProperty(value = "popularity")
    private int mPopularity;

    @JsonProperty(value = "release_date")
    private String mReleaseDate;

    @JsonProperty(value = "release_date_precision")
    private String mReleaseDatePrecision;

    @JsonProperty(value = "tracks")
    private JacksonPagingObject<JacksonSimpleTrack> mTracks;

    @Override
    public Set<JacksonSimpleArtist> getArtists() {
        return mArtists;
    }

    @Override
    public JacksonExternalID getExternalID() {
        return mExternalID;
    }

    @Override
    public Set<String> getGenres() {
        return mGenres;
    }

    @Override
    public int getPopularity() {
        return mPopularity;
    }

    @Override
    public String getReleaseDate() {
        return mReleaseDate;
    }

    @Override
    public String getReleaseDatePrecision() {
        return mReleaseDatePrecision;
    }

    @Override
    public PagingObject<JacksonSimpleTrack> getTracks() {
        return mTracks;
    }
}