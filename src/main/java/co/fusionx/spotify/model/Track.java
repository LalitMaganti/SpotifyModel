package co.fusionx.spotify.model;

public interface Track extends SimpleTrack {

    public SimpleAlbum getAlbum();

    public int getDiscNumber();

    public ExternalID getExternalID();

    public int getPopularity();
}
