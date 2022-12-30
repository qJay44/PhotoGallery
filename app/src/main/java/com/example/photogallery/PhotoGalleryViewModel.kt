package com.example.photogallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import edu.muiv.photogallery.GalleryItem
import com.example.photogallery.api.FlickrFetcher

class PhotoGalleryViewModel : ViewModel() {
    val galleryItemLiveData: LiveData<List<GalleryItem>> = FlickrFetcher().fetchPhotos()

}
