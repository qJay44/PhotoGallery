package com.example.photogallery.api

import com.google.gson.annotations.SerializedName
import edu.muiv.photogallery.GalleryItem

class PhotoResponse {
    @SerializedName("photo")
    lateinit var galleryItems: List<GalleryItem>
}