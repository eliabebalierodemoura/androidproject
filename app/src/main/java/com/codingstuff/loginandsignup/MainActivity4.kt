package com.codingstuff.loginandsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity4 : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<News>
    lateinit var imageId: Array<Int>
    lateinit var heading: Array<String>
    lateinit var news: Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        imageId = arrayOf(
            R.drawable.tshirt,
            R.drawable.jacts,
            R.drawable.dress,
            R.drawable.pants,
            R.drawable.shoes,

            )

        heading = arrayOf(
            "T-shirt",
            "Jacket",
            "Dress",
            "Pants",
            "Shoes"

        )
        news = arrayOf(
            getString(R.string.tshirt),
            getString(R.string.jacket),
            getString(R.string.dress),
            getString(R.string.pants),
            getString(R.string.shoes)

        )



        newRecyclerView = findViewById(R.id.recyclerview)

        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)
        newArrayList = arrayListOf<News>()
        getUserData()
    }

    private fun getUserData() {
        for (i in imageId.indices) {
            val news = News(imageId[i], heading[i])
            newArrayList.add(news)
        }

        var adapter = MyAdapter(newArrayList)

        newRecyclerView.adapter = adapter
        adapter.setOnItemClickListener(object : MyAdapter.onItemClickListener {
            override fun onItemClick(position: Int) {

                //  Toast.makeText(this@MainActivity,"You clicked. $position", Toast.LENGTH_SHORT).show()
                val intent = Intent(this@MainActivity4, shoppingcard::class.java)
                intent.putExtra("heading", newArrayList[position].heading)
                intent.putExtra("imageId", newArrayList[position].titleImage)
                intent.putExtra("news", news[position])
                startActivity(intent)


            }

        })
    }
}
