package co.fusionx.spotify.model.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JacksonError implements co.fusionx.spotify.model.Error {

    @JsonProperty(value = "status")
    private int mStatus;

    @JsonProperty(value = "message")
    private String mMessage;

    @Override
    public int getStatus() {
        return mStatus;
    }

    @Override
    public String getMessage() {
        return mMessage;
    }
}
