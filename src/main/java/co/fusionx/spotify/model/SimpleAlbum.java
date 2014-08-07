package co.fusionx.spotify.model;

import java.util.Set;

public interface SimpleAlbum {

    public String getAlbumType();

    public Set<String> getAvailableMarkets();

    public ExternalURL getExternalURL();

    public String getHref();

    public String getId();

    public Set<? extends Image> getImages();

    public String getName();

    public String getType();

    public String getURI();
}
