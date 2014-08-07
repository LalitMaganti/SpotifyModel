package co.fusionx.spotify.model.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import co.fusionx.spotify.model.PagingObject;

public class JacksonPagingObject<T> implements PagingObject<T> {

    @JsonProperty(value = "href")
    private String mHref;

    @JsonProperty(value = "items")
    private List<T> mItems;

    @JsonProperty(value = "limit")
    private int mLimit;

    @JsonProperty(value = "next")
    private String mNext;

    @JsonProperty(value = "offset")
    private int mOffset;

    @JsonProperty(value = "previous")
    private String mPrevious;

    @JsonProperty(value = "total")
    private int mTotal;

    @Override
    public String getHref() {
        return mHref;
    }

    @Override
    public List<T> getItems() {
        return mItems;
    }

    @Override
    public int getLimit() {
        return mLimit;
    }

    @Override
    public String getNext() {
        return mNext;
    }

    @Override
    public int getOffset() {
        return mOffset;
    }

    @Override
    public String getPrevious() {
        return mPrevious;
    }

    @Override
    public int getTotal() {
        return mTotal;
    }
}