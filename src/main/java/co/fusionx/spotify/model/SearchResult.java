package co.fusionx.spotify.model;

public interface SearchResult {

    public PagingObject<? extends SimpleAlbum> getAlbums();

    public PagingObject<? extends Artist> getArtists();

    public PagingObject<? extends SimpleTrack> getTracks();
}
