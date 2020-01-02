package com.wenruiwang.mallbuilding.dto;

import io.swagger.annotations.ApiModelProperty;

public class OssCallbackResult {
    @ApiModelProperty("file name")
    private String filename;
    @ApiModelProperty("file size")
    private String size;
    @ApiModelProperty("mime type")
    private String mimetype;
    @ApiModelProperty("image file width")
    private String width;
    @ApiModelProperty("image file height")
    private String height;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMimetype() {
        return mimetype;
    }

    public void setMimetype(String mimetype) {
        this.mimetype = mimetype;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
