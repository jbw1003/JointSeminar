package org.sopt.jointseminar

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ShopReviewAdapter(var reviewItems: ArrayList<ShopReviewData>) : RecyclerView.Adapter<ShopReviewViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopReviewViewHolder {
        val mainView : View = LayoutInflater.from(parent.context).inflate(R.layout.shop_review_format, parent, false)
        return ShopReviewViewHolder(mainView)
    }

    override fun getItemCount(): Int = reviewItems.size

    override fun onBindViewHolder(holder: ShopReviewViewHolder, position: Int) {
        holder.reviewId.text = reviewItems[position].id
        holder.reviewTime.text = reviewItems[position].time
        holder.reviewText.text = reviewItems[position].text
    }
}