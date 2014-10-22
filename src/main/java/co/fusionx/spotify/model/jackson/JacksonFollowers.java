package co.fusionx.spotify.model.jackson;

import co.fusionx.spotify.model.Followers;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JacksonFollowers implements Followers {

    @JsonProperty(value = "href")
    private String mHref;

    @JsonProperty(value = "total")
    private int mTotal;

    @Override
    public String getHref() {
        return mHref;
    }

    @Override
    public int getTotal() {
        return mTotal;
    }
}