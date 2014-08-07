package co.fusionx.spotify.model;

import java.util.Set;

public interface Album extends SimpleAlbum {

    public Set<? extends SimpleArtist> getArtists();

    public ExternalID getExternalID();

    public Set<String> getGenres();

    public int getPopularity();

    public String getReleaseDate();

    public String getReleaseDatePrecision();

    public PagingObject<? extends SimpleTrack> getTracks();
}
