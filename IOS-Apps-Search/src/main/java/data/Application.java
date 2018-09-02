package data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Application {

    private String artworkUrl100;
    private String sellerName;
    private String description;
    private String artistId;
    private String trackName;
    private String artistViewUrl;
    private String fileSizeBytes;
    private String trackViewUrl;

    public String getTrackViewUrl() {
        return trackViewUrl;
    }

    public void setTrackViewUrl(String trackViewUrl) {
        this.trackViewUrl = trackViewUrl;
    }

    public String getArtworkUrl100() {
        return artworkUrl100;
    }

    public void setArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getArtistId() {
        return artistId;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getArtistViewUrl() {
        return artistViewUrl;
    }

    public void setArtistViewUrl(String artistViewUrl) {
        this.artistViewUrl = artistViewUrl;
    }

    public String getFileSizeBytes() {
        return fileSizeBytes;
    }

    public void setFileSizeBytes(String fileSizeBytes) {
        this.fileSizeBytes = fileSizeBytes;
    }
}
