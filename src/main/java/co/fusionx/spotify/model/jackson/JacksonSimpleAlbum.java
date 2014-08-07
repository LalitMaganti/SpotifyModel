package co.fusionx.spotify.model.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Set;

import co.fusionx.spotify.model.SimpleAlbum;

public class JacksonSimpleAlbum implements SimpleAlbum {

    @JsonProperty(value = "album_type")
    private String mAlbumType;

    @JsonProperty(value = "available_markets")
    private Set<String> mAvailableMarkets;

    @JsonProperty(value = "external_urls")
    private JacksonExternalURL mExternalURL;

    @JsonProperty(value = "href")
    private String mHref;

    @JsonProperty(value = "id")
    private String mId;

    @JsonProperty(value = "images")
    private Set<JacksonImage> mImages;

    @JsonProperty(value = "name")
    private String mName;

    @JsonProperty(value = "type")
    private String mType;

    @JsonProperty(value = "uri")
    private String mURI;

    @Override
    public String getAlbumType() {
        return mAlbumType;
    }

    @Override
    public Set<String> getAvailableMarkets() {
        return mAvailableMarkets;
    }

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
    public Set<JacksonImage> getImages() {
        return mImages;
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