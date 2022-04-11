
package com.example.currency_exchange_rate.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fixed_width_still",
    "preview_gif",
    "fixed_height_downsampled",
    "preview",
    "fixed_height_small",
    "downsized",
    "fixed_width_downsampled",
    "fixed_width",
    "downsized_still",
    "downsized_medium",
    "original_mp4",
    "downsized_large",
    "preview_webp",
    "original",
    "original_still",
    "fixed_height_small_still",
    "fixed_width_small",
    "looping",
    "downsized_small",
    "fixed_width_small_still",
    "fixed_height_still",
    "fixed_height",
    "480w_still"
})
@Generated("jsonschema2pojo")
public class Images {

    @JsonProperty("fixed_width_still")
    private FixedWidthStill fixedWidthStill;
    @JsonProperty("preview_gif")
    private PreviewGif previewGif;
    @JsonProperty("fixed_height_downsampled")
    private FixedHeightDownsampled fixedHeightDownsampled;
    @JsonProperty("preview")
    private Preview preview;
    @JsonProperty("fixed_height_small")
    private FixedHeightSmall fixedHeightSmall;
    @JsonProperty("downsized")
    private Downsized downsized;
    @JsonProperty("fixed_width_downsampled")
    private FixedWidthDownsampled fixedWidthDownsampled;
    @JsonProperty("fixed_width")
    private FixedWidth fixedWidth;
    @JsonProperty("downsized_still")
    private DownsizedStill downsizedStill;
    @JsonProperty("downsized_medium")
    private DownsizedMedium downsizedMedium;
    @JsonProperty("original_mp4")
    private OriginalMp4 originalMp4;
    @JsonProperty("downsized_large")
    private DownsizedLarge downsizedLarge;
    @JsonProperty("preview_webp")
    private PreviewWebp previewWebp;
    @JsonProperty("original")
    private Original original;
    @JsonProperty("original_still")
    private OriginalStill originalStill;
    @JsonProperty("fixed_height_small_still")
    private FixedHeightSmallStill fixedHeightSmallStill;
    @JsonProperty("fixed_width_small")
    private FixedWidthSmall fixedWidthSmall;
    @JsonProperty("looping")
    private Looping looping;
    @JsonProperty("downsized_small")
    private DownsizedSmall downsizedSmall;
    @JsonProperty("fixed_width_small_still")
    private FixedWidthSmallStill fixedWidthSmallStill;
    @JsonProperty("fixed_height_still")
    private FixedHeightStill fixedHeightStill;
    @JsonProperty("fixed_height")
    private FixedHeight fixedHeight;
    @JsonProperty("480w_still")
    private com.example.currency_exchange_rate.model._480wStill _480wStill;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fixed_width_still")
    public FixedWidthStill getFixedWidthStill() {
        return fixedWidthStill;
    }

    @JsonProperty("fixed_width_still")
    public void setFixedWidthStill(FixedWidthStill fixedWidthStill) {
        this.fixedWidthStill = fixedWidthStill;
    }

    @JsonProperty("preview_gif")
    public PreviewGif getPreviewGif() {
        return previewGif;
    }

    @JsonProperty("preview_gif")
    public void setPreviewGif(PreviewGif previewGif) {
        this.previewGif = previewGif;
    }

    @JsonProperty("fixed_height_downsampled")
    public FixedHeightDownsampled getFixedHeightDownsampled() {
        return fixedHeightDownsampled;
    }

    @JsonProperty("fixed_height_downsampled")
    public void setFixedHeightDownsampled(FixedHeightDownsampled fixedHeightDownsampled) {
        this.fixedHeightDownsampled = fixedHeightDownsampled;
    }

    @JsonProperty("preview")
    public Preview getPreview() {
        return preview;
    }

    @JsonProperty("preview")
    public void setPreview(Preview preview) {
        this.preview = preview;
    }

    @JsonProperty("fixed_height_small")
    public FixedHeightSmall getFixedHeightSmall() {
        return fixedHeightSmall;
    }

    @JsonProperty("fixed_height_small")
    public void setFixedHeightSmall(FixedHeightSmall fixedHeightSmall) {
        this.fixedHeightSmall = fixedHeightSmall;
    }

    @JsonProperty("downsized")
    public Downsized getDownsized() {
        return downsized;
    }

    @JsonProperty("downsized")
    public void setDownsized(Downsized downsized) {
        this.downsized = downsized;
    }

    @JsonProperty("fixed_width_downsampled")
    public FixedWidthDownsampled getFixedWidthDownsampled() {
        return fixedWidthDownsampled;
    }

    @JsonProperty("fixed_width_downsampled")
    public void setFixedWidthDownsampled(FixedWidthDownsampled fixedWidthDownsampled) {
        this.fixedWidthDownsampled = fixedWidthDownsampled;
    }

    @JsonProperty("fixed_width")
    public FixedWidth getFixedWidth() {
        return fixedWidth;
    }

    @JsonProperty("fixed_width")
    public void setFixedWidth(FixedWidth fixedWidth) {
        this.fixedWidth = fixedWidth;
    }

    @JsonProperty("downsized_still")
    public DownsizedStill getDownsizedStill() {
        return downsizedStill;
    }

    @JsonProperty("downsized_still")
    public void setDownsizedStill(DownsizedStill downsizedStill) {
        this.downsizedStill = downsizedStill;
    }

    @JsonProperty("downsized_medium")
    public DownsizedMedium getDownsizedMedium() {
        return downsizedMedium;
    }

    @JsonProperty("downsized_medium")
    public void setDownsizedMedium(DownsizedMedium downsizedMedium) {
        this.downsizedMedium = downsizedMedium;
    }

    @JsonProperty("original_mp4")
    public OriginalMp4 getOriginalMp4() {
        return originalMp4;
    }

    @JsonProperty("original_mp4")
    public void setOriginalMp4(OriginalMp4 originalMp4) {
        this.originalMp4 = originalMp4;
    }

    @JsonProperty("downsized_large")
    public DownsizedLarge getDownsizedLarge() {
        return downsizedLarge;
    }

    @JsonProperty("downsized_large")
    public void setDownsizedLarge(DownsizedLarge downsizedLarge) {
        this.downsizedLarge = downsizedLarge;
    }

    @JsonProperty("preview_webp")
    public PreviewWebp getPreviewWebp() {
        return previewWebp;
    }

    @JsonProperty("preview_webp")
    public void setPreviewWebp(PreviewWebp previewWebp) {
        this.previewWebp = previewWebp;
    }

    @JsonProperty("original")
    public Original getOriginal() {
        return original;
    }

    @JsonProperty("original")
    public void setOriginal(Original original) {
        this.original = original;
    }

    @JsonProperty("original_still")
    public OriginalStill getOriginalStill() {
        return originalStill;
    }

    @JsonProperty("original_still")
    public void setOriginalStill(OriginalStill originalStill) {
        this.originalStill = originalStill;
    }

    @JsonProperty("fixed_height_small_still")
    public FixedHeightSmallStill getFixedHeightSmallStill() {
        return fixedHeightSmallStill;
    }

    @JsonProperty("fixed_height_small_still")
    public void setFixedHeightSmallStill(FixedHeightSmallStill fixedHeightSmallStill) {
        this.fixedHeightSmallStill = fixedHeightSmallStill;
    }

    @JsonProperty("fixed_width_small")
    public FixedWidthSmall getFixedWidthSmall() {
        return fixedWidthSmall;
    }

    @JsonProperty("fixed_width_small")
    public void setFixedWidthSmall(FixedWidthSmall fixedWidthSmall) {
        this.fixedWidthSmall = fixedWidthSmall;
    }

    @JsonProperty("looping")
    public Looping getLooping() {
        return looping;
    }

    @JsonProperty("looping")
    public void setLooping(Looping looping) {
        this.looping = looping;
    }

    @JsonProperty("downsized_small")
    public DownsizedSmall getDownsizedSmall() {
        return downsizedSmall;
    }

    @JsonProperty("downsized_small")
    public void setDownsizedSmall(DownsizedSmall downsizedSmall) {
        this.downsizedSmall = downsizedSmall;
    }

    @JsonProperty("fixed_width_small_still")
    public FixedWidthSmallStill getFixedWidthSmallStill() {
        return fixedWidthSmallStill;
    }

    @JsonProperty("fixed_width_small_still")
    public void setFixedWidthSmallStill(FixedWidthSmallStill fixedWidthSmallStill) {
        this.fixedWidthSmallStill = fixedWidthSmallStill;
    }

    @JsonProperty("fixed_height_still")
    public FixedHeightStill getFixedHeightStill() {
        return fixedHeightStill;
    }

    @JsonProperty("fixed_height_still")
    public void setFixedHeightStill(FixedHeightStill fixedHeightStill) {
        this.fixedHeightStill = fixedHeightStill;
    }

    @JsonProperty("fixed_height")
    public FixedHeight getFixedHeight() {
        return fixedHeight;
    }

    @JsonProperty("fixed_height")
    public void setFixedHeight(FixedHeight fixedHeight) {
        this.fixedHeight = fixedHeight;
    }

    @JsonProperty("480w_still")
    public com.example.currency_exchange_rate.model._480wStill get480wStill() {
        return _480wStill;
    }

    @JsonProperty("480w_still")
    public void set480wStill(com.example.currency_exchange_rate.model._480wStill _480wStill) {
        this._480wStill = _480wStill;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
