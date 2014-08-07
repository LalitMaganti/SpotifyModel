package co.fusionx.spotify.model.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

import co.fusionx.spotify.model.SimpleArtist;

public class JacksonSimpleArtist implements SimpleArtist {

    @JsonProperty(value = "external_urls")
    private JacksonExternalURL mExternalURL;

    @JsonProperty(value = "href")
    private String mHref;

    @JsonProperty(value = "id")
    private String mId;

    @JsonProperty(value = "name")
    private String mName;

    @JsonProperty(value = "type")
    private String mType;

    @JsonProperty(value = "uri")
    private String mURI;

    @Override
    public JacksonExternalURL getExternalURL() {
        return mExternalURL;
    }

    @Override
    public String getHref() {
        return mHref;
    }

    @Override
    public String getId() {
        return mId;
    }

    @Override
    public String getName() {
        return mName;
    }

    @Override
    public String getType() {
        return mType;
    }

    @Override
    public String getURI() {
        return mURI;
    }
}