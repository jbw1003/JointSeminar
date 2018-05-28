package org.sopt.jointseminar

import android.support.v4.app.Fragment
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_shop_menu.*
import java.util.ArrayList

class ShopMenuFragment : Fragment() {

    private lateinit var shopItems: ArrayList<ShopMenuData>
    private lateinit var shopMenuAdapter: ShopMenuAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_shop_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        shopItems = ArrayList()
        shopItems.add(ShopMenuData("엽떡", "18000원"))
        shopItems.add(ShopMenuData("엽떡", "18000원"))
        shopItems.add(ShopMenuData("엽떡", "18000원"))
        shopItems.add(ShopMenuData("엽떡", "18000원"))
        shopItems.add(ShopMenuData("엽떡", "18000원"))
        shopItems.add(ShopMenuData("엽떡", "18000원"))
        shopItems.add(ShopMenuData("엽떡", "18000원"))
        shopItems.add(ShopMenuData("엽떡", "18000원"))
        shopItems.add(ShopMenuData("엽떡", "18000원"))
        shopItems.add(ShopMenuData("엽떡", "18000원"))
        shopItems.add(ShopMenuData("엽떡", "18000원"))
        shopItems.add(ShopMenuData("엽떡", "18000원"))
        shopItems.add(ShopMenuData("엽떡", "18000원"))
        shopItems.add(ShopMenuData("엽떡", "18000원"))
        shopItems.add(ShopMenuData("엽떡", "18000원"))
        shopItems.add(ShopMenuData("엽떡", "18000원"))
        shopItems.add(ShopMenuData("엽떡", "18000원"))
        shopItems.add(ShopMenuData("엽떡", "18000원"))
        shopItems.add(ShopMenuData("엽떡", "18000원"))
        shopItems.add(ShopMenuData("엽떡", "18000원"))
        shopItems.add(ShopMenuData("엽떡", "18000원"))
        shopItems.add(ShopMenuData("엽떡", "18000원"))
        shopItems.add(ShopMenuData("엽떡", "18000원"))
        shopItems.add(ShopMenuData("엽떡", "18000원"))
        shopItems.add(ShopMenuData("엽떡", "18000원"))
        shopItems.add(ShopMenuData("엽떡", "18000원"))
        shopItems.add(ShopMenuData("엽떡", "18000원"))
        shopItems.add(ShopMenuData("엽떡", "18000원"))
        shopItems.add(ShopMenuData("엽떡", "18000원"))

        shopMenuAdapter = ShopMenuAdapter(shopItems)

        shop_menu_rv.layoutManager = LinearLayoutManager(activity)
        shop_menu_rv.adapter = shopMenuAdapter
    }

    companion object {

        fun newInstance(): ShopMenuFragment {
            return ShopMenuFragment()
        }
    }
}
