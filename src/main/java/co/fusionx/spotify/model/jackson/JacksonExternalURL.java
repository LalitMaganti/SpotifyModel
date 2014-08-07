package co.fusionx.spotify.model.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

import co.fusionx.spotify.model.ExternalURL;

public class JacksonExternalURL implements ExternalURL {

    @JsonProperty(value = "spotify")
    private String mUrl;

    public String getUrl() {
        return mUrl;
    }
}