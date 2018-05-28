package org.sopt.jointseminar

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ShopReviewViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
    var reviewId : TextView = itemView!!.findViewById(R.id.shop_review_id)
    var reviewTime : TextView = itemView!!.findViewById(R.id.shop_review_time)
    var reviewImg : ImageView = itemView!!.findViewById(R.id.shop_review_img)
    var reviewText : TextView = itemView!!.findViewById(R.id.shop_review_text)
}