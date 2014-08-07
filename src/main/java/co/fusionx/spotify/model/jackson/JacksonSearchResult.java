package co.fusionx.spotify.model.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

import co.fusionx.spotify.model.PagingObject;
import co.fusionx.spotify.model.SearchResult;

public class JacksonSearchResult implements SearchResult {

    @JsonProperty(value = "albums")
    private JacksonPagingObject<JacksonSimpleAlbum> mAlbums;

    @JsonProperty(value = "artists")
    private JacksonPagingObject<JacksonArtist> mArtists;

    @JsonProperty(value = "tracks")
    private JacksonPagingObject<JacksonSimpleTrack> mTracks;

    @Override
    public PagingObject<JacksonSimpleAlbum> getAlbums() {
        return mAlbums;
    }

    @Override
    public PagingObject<JacksonArtist> getArtists() {
        return mArtists;
    }

    @Override
    public PagingObject<JacksonSimpleTrack> getTracks() {
        return mTracks;
    }
}