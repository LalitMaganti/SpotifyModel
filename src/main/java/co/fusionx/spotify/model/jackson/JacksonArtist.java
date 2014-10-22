package co.fusionx.spotify.model.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Set;

import co.fusionx.spotify.model.Artist;

public class JacksonArtist extends JacksonSimpleArtist implements Artist {

    @JsonProperty(value = "followers")
    private JacksonFollowers mFollowers;

    @JsonProperty(value = "genres")
    private Set<String> mGenres;

    @JsonProperty(value = "images")
    private List<JacksonImage> mImages;

    @JsonProperty(value = "popularity")
    private int mPopularity;

    @Override
    public Set<String> getGenres() {
        return mGenres;
    }

    @Override
    public List<JacksonImage> getImages() {
        return mImages;
    }

    @Override
    public int getPopularity() {
        return mPopularity;
    }
}