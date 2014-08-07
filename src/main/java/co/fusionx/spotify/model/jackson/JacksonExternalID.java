package co.fusionx.spotify.model.jackson;

import java.util.HashMap;

import co.fusionx.spotify.model.ExternalID;

public class JacksonExternalID extends HashMap<String, String> implements ExternalID {

    @Override
    public String get(final String key) {
        return get((Object) key);
    }
}