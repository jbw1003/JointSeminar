package org.sopt.jointseminar

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ShopMenuAdapter(private var shopMenu : ArrayList<ShopMenuData>) : RecyclerView.Adapter<ShopMenuViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopMenuViewHolder {
        val mainView : View = LayoutInflater.from(parent.context).inflate(R.layout.shop_menu_format, parent, false)
        return ShopMenuViewHolder(mainView)
    }

    override fun getItemCount(): Int = shopMenu.size

    override fun onBindViewHolder(holder: ShopMenuViewHolder, position: Int) {
        holder.MenuName.text = shopMenu[position].menuName
        holder.MenuPrice.text = "단품: "+ shopMenu[position].menuPrice
    }
}
