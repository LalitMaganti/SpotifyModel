package co.fusionx.spotify.model.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Set;

import co.fusionx.spotify.model.SimpleTrack;

public class JacksonSimpleTrack implements SimpleTrack {

    @JsonProperty(value = "artists")
    private List<JacksonSimpleArtist> mArtists;

    @JsonProperty(value = "available_markets")
    private Set<String> mAvailableMarkets;

    @JsonProperty(value = "disc_number")
    private int mDiscNumber;

    @JsonProperty(value = "duration_ms")
    private int mDurationMs;

    @JsonProperty(value = "explicit")
    private boolean mExplicit;

    @JsonProperty(value = "external_urls")
    private JacksonExternalURL mExternalURLs;

    @JsonProperty(value = "href")
    private String mHref;

    @JsonProperty(value = "id")
    private String mId;

    @JsonProperty(value = "name")
    private String mName;

    @JsonProperty(value = "preview_url")
    private String mPreviewUrl;

    @JsonProperty(value = "track_number")
    private int mTrackNumber;

    @JsonProperty(value = "type")
    private String mType;

    @JsonProperty(value = "uri")
    private String mUri;

    @Override
    public List<JacksonSimpleArtist> getArtists() {
        return mArtists;
    }

    @Override
    public Set<String> getAvailableMarkets() {
        return mAvailableMarkets;
    }

    @Override
    public int getDiscNumber() {
        return mDiscNumber;
    }

    @Override
    public int getDurationMs() {
        return mDurationMs;
    }

    @Override
    public boolean isExplicit() {
        return mExplicit;
    }

    @Override
    public JacksonExternalURL getExternalURLs() {
        return mExternalURLs;
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
    public String getPreviewUrl() {
        return mPreviewUrl;
    }

    @Override
    public int getTrackNumber() {
        return mTrackNumber;
    }

    @Override
    public String getType() {
        return mType;
    }

    @Override
    public String getUri() {
        return mUri;
    }
}