package org.sopt.jointseminar

import android.support.v4.app.Fragment
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_shop_review.*
import java.util.ArrayList

class ShopReviewFragment : Fragment() {

    private lateinit var reviewItems: ArrayList<ShopReviewData>
    private lateinit var shopreviewAdapter: ShopReviewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_shop_review, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        reviewItems = ArrayList()
        reviewItems.add(ShopReviewData("Jam", "2:26", "Everything is good and brown I'm here again With a sunshine smile upon my face My friends are close at hand And all my inhibitions have disappeared without a trace I'm glad, oh, that I found Ooh, somebody who I can rely on"))
        reviewItems.add(ShopReviewData("Jam", "2:26", "Everything is good and brown I'm here again With a sunshine smile upon my face My friends are close at hand And all my inhibitions have disappeared without a trace I'm glad, oh, that I found Ooh, somebody who I can rely on"))
        reviewItems.add(ShopReviewData("Jam", "2:26", "Everything is good and brown I'm here again With a sunshine smile upon my face My friends are close at hand And all my inhibitions have disappeared without a trace I'm glad, oh, that I found Ooh, somebody who I can rely on"))
        reviewItems.add(ShopReviewData("Jam", "2:26", "Everything is good and brown I'm here again With a sunshine smile upon my face My friends are close at hand And all my inhibitions have disappeared without a trace I'm glad, oh, that I found Ooh, somebody who I can rely on"))
        reviewItems.add(ShopReviewData("Jam", "2:26", "Everything is good and brown I'm here again With a sunshine smile upon my face My friends are close at hand And all my inhibitions have disappeared without a trace I'm glad, oh, that I found Ooh, somebody who I can rely on"))
        reviewItems.add(ShopReviewData("Jam", "2:26", "Everything is good and brown I'm here again With a sunshine smile upon my face My friends are close at hand And all my inhibitions have disappeared without a trace I'm glad, oh, that I found Ooh, somebody who I can rely on"))
        reviewItems.add(ShopReviewData("Jam", "2:26", "Everything is good and brown I'm here again With a sunshine smile upon my face My friends are close at hand And all my inhibitions have disappeared without a trace I'm glad, oh, that I found Ooh, somebody who I can rely on"))
        reviewItems.add(ShopReviewData("Jam", "2:26", "Everything is good and brown I'm here again With a sunshine smile upon my face My friends are close at hand And all my inhibitions have disappeared without a trace I'm glad, oh, that I found Ooh, somebody who I can rely on"))
        reviewItems.add(ShopReviewData("Jam", "2:26", "Everything is good and brown I'm here again With a sunshine smile upon my face My friends are close at hand And all my inhibitions have disappeared without a trace I'm glad, oh, that I found Ooh, somebody who I can rely on"))
        reviewItems.add(ShopReviewData("Jam", "2:26", "Everything is good and brown I'm here again With a sunshine smile upon my face My friends are close at hand And all my inhibitions have disappeared without a trace I'm glad, oh, that I found Ooh, somebody who I can rely on"))
        reviewItems.add(ShopReviewData("Jam", "2:26", "Everything is good and brown I'm here again With a sunshine smile upon my face My friends are close at hand And all my inhibitions have disappeared without a trace I'm glad, oh, that I found Ooh, somebody who I can rely on"))
        reviewItems.add(ShopReviewData("Jam", "2:26", "Everything is good and brown I'm here again With a sunshine smile upon my face My friends are close at hand And all my inhibitions have disappeared without a trace I'm glad, oh, that I found Ooh, somebody who I can rely on"))

        shopreviewAdapter = ShopReviewAdapter(reviewItems)

        shop_review_rv.layoutManager = LinearLayoutManager(activity)
        shop_review_rv.adapter = shopreviewAdapter
    }

    companion object {

        fun newInstance(): ShopReviewFragment {
            return ShopReviewFragment()
        }
    }

}
