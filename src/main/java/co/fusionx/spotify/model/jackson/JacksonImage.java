package co.fusionx.spotify.model.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

import co.fusionx.spotify.model.Image;

public class JacksonImage implements Image {

    @JsonProperty(value = "height")
    private int mHeight;

    @JsonProperty(value = "url")
    private String mUrl;

    @JsonProperty(value = "width")
    private int mWidth;

    @Override
    public int getHeight() {
        return mHeight;
    }

    @Override
    public String getUrl() {
        return mUrl;
    }

    @Override
    public int getWidth() {
        return mWidth;
    }
}