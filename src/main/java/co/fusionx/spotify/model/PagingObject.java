package co.fusionx.spotify.model;

import java.util.List;

public interface PagingObject<T> {

    public String getHref();

    public List<T> getItems();

    public int getLimit();

    public String getNext();

    public int getOffset();

    public String getPrevious();

    public int getTotal();
}
