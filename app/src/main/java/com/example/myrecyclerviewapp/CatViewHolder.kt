package com.example.myrecyclerviewapp

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.text.HtmlCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecyclerviewapp.model.CatUiModel


class CatViewHolder(
    containerView: View,
    private val imageLoader: ImageLoader
) : RecyclerView.ViewHolder(containerView) {
    private val catBiographyView: TextView
            by lazy { containerView.findViewById(R.id.item_music_singer) }
    private val catNameView: TextView
            by lazy { containerView.findViewById(R.id.item_music_name) }
    private val catPhotoView: ImageView
            by lazy { containerView.findViewById(R.id.item_music_photo) }
    fun bindData(catData: CatUiModel) {
        imageLoader.loadImage(catData.imageUrl, catPhotoView)
        catNameView.text = catData.name
        catBiographyView.text = catData.singer

    }
}