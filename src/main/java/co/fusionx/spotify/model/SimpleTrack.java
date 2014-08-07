package co.fusionx.spotify.model;

import java.util.List;
import java.util.Set;

public interface SimpleTrack {

    public List<? extends SimpleArtist> getArtists();

    public Set<String> getAvailableMarkets();

    public int getDiscNumber();

    public int getDurationMs();

    public boolean isExplicit();

    public ExternalURL getExternalURLs();

    public String getHref();

    public String getId();

    public String getName();

    public String getPreviewUrl();

    public int getTrackNumber();

    public String getType();

    public String getUri();
}
