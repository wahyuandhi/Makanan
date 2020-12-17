 package com.wahyuandhi.makanan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val foodList: ArrayList<Food>): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_layout, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        holder.bindItems(foodList[position])
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return foodList.size
    }

    //the class is holding the list view
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bindItems(food: Food) {
            val tvFoodName = itemView.findViewById<TextView>(R.id.tvFoodName)
            val tvFoodInfo = itemView.findViewById<TextView>(R.id.tvFoodInfo)
            val ivFood = itemView.findViewById<ImageView>(R.id.ivFood)

            tvFoodName.text = food.foodName
            tvFoodInfo.text = food.foodInfo
            ivFood.setImageResource(food.foodImage)
        }
    }
}