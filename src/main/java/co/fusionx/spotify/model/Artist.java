package co.fusionx.spotify.model;

import java.util.List;
import java.util.Set;

public interface Artist extends SimpleArtist {

    public Set<String> getGenres();

    public List<? extends Image> getImages();

    public int getPopularity();
}