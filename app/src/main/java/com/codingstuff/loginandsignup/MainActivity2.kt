package com.codingstuff.loginandsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity2 : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<News>
    lateinit var imageId: Array<Int>
    lateinit var heading: Array<String>
    lateinit var news: Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val user = findViewById<TextView>(R.id.user)
        user.setOnClickListener {
            val intent = Intent(this, List_users::class.java)
            startActivity(intent)
        }


            imageId = arrayOf(
                R.drawable.laptops,
                R.drawable.iphone,
                R.drawable.tv,
                R.drawable.blender,
                R.drawable.toster,

                )

            heading = arrayOf(
                "Laptop",
                "Iphone",
                "TV",
                "Blender",
                "Toaster"

            )
            news = arrayOf(
                getString(R.string.laptop),
                getString(R.string.iphone),
                getString(R.string.tv),
                getString(R.string.blender),
                getString(R.string.toaster)

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
                    val intent = Intent(this@MainActivity2, shoppingcard::class.java)
                    intent.putExtra("heading", newArrayList[position].heading)
                    intent.putExtra("imageId", newArrayList[position].titleImage)
                    intent.putExtra("news", news[position])
                    startActivity(intent)


                }

            })


    }
}
