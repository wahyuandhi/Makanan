package com.wahyuandhi.makanan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

lateinit var RV_new_pesan: RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RV_new_pesan = findViewById(R.id.rvFood)
        val recyclerView = findViewById<RecyclerView>(R.id.rvFood)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val food = ArrayList<Food>()

        food.add(Food("Donut", "Roti bundar dengan isian dan toping", R.drawable.donut))
        food.add(Food("Burger", "Roti bulat isi daging dan lalapan", R.drawable.burger))
        food.add(Food("Pizza", "Pasta oven daging dengan taburan sosis dan paprika", R.drawable.pizza_slice))
        food.add(Food("French Fries", "Kentang goreng diiris panjang direndam minyak panas", R.drawable.fried_potatoes))
        food.add(Food("Hot Dog", "Roti panjang dibakar dengan sosis dan saus", R.drawable.hot_dog))

        val adapter = CustomAdapter(food)
        recyclerView.adapter = adapter
    }
}