package org.sopt.jointseminar

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class ShopMenuViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView){
    var MenuName : TextView = itemView!!.findViewById(R.id.shop_menu_name)
    var MenuPrice : TextView = itemView!!.findViewById(R.id.shop_menu_price)
}