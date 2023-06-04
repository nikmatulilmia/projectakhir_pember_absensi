package com.example.absensi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class InfooFragment : Fragment() {

                    private lateinit var recyclerView: RecyclerView
                    private lateinit var collegeStudentAdapter: CollegeStudentAdapter
                    private lateinit var collegeStudent: MutableList<CollegeStudent>

                    override fun onCreateView(
                        inflater: LayoutInflater, container: ViewGroup?,
                        savedInstanceState: Bundle?
                    ): View? {
                        val view = inflater.inflate(R.layout.fragment_infooo, container, false)

                        recyclerView = view.findViewById(R.id.recyclerview)

                        val layoutManager = LinearLayoutManager(activity)
                        recyclerView.layoutManager = layoutManager

                        collegeStudent = mutableListOf()
                        collegeStudent.add(CollegeStudent("Cndy Putri Hayati",  R.drawable.lisa1))
                        collegeStudent.add(CollegeStudent("Hesti Aprilia Sari",  R.drawable.jennie2))
                        collegeStudent.add(CollegeStudent("Diki Putra Saputra", R.drawable.jaemin3))
                        collegeStudent.add(CollegeStudent("Alex Anggara", R.drawable.taehyung4))
                        collegeStudent.add(CollegeStudent("Putri Hayani", R.drawable.seulgi5))
                        collegeStudent.add(CollegeStudent("Nizar Bahtiar Putra", R.drawable.renjun6))
                        collegeStudent.add(CollegeStudent("Angkasa Anggara", R.drawable.jaehyun7))
                        collegeStudent.add(CollegeStudent("M. Muhyi", R.drawable.ten8))
                        collegeStudent.add(CollegeStudent("MBagus Ramdhani", R.drawable.kun9))
                        collegeStudent.add(CollegeStudent("Riki Afandi ", R.drawable.eunwoo10))

                        collegeStudentAdapter = CollegeStudentAdapter(collegeStudent)
                        recyclerView.adapter = collegeStudentAdapter

                        return view
                    }
                }




