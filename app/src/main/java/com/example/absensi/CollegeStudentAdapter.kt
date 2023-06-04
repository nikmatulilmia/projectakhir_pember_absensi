package com.example.absensi

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CollegeStudentAdapter(private val listMahasiswa: List<CollegeStudent>) :
    RecyclerView.Adapter<ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_rv, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val mahasiswa = listMahasiswa[position]
        holder.bind(mahasiswa)
    }

    override fun getItemCount(): Int {
        return listMahasiswa.size
    }

}