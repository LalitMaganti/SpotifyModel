package co.fusionx.spotify.model.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

import co.fusionx.spotify.model.Track;

public class JacksonTrack extends JacksonSimpleTrack implements Track {

    @JsonProperty(value = "album")
    private JacksonSimpleAlbum mAlbum;

    @JsonProperty(value = "disc_number")
    private int mDiscNumber;

    @JsonProperty(value = "external_ids")
    private JacksonExternalID mExternalID;

    @JsonProperty(value = "popularity")
    private int mPopularity;

    @Override
    public JacksonSimpleAlbum getAlbum() {
        return mAlbum;
    }

    @Override
    public int getDiscNumber() {
        return mDiscNumber;
    }

    @Override
    public JacksonExternalID getExternalID() {
        return mExternalID;
    }

    @Override
    public int getPopularity() {
        return mPopularity;
    }
}