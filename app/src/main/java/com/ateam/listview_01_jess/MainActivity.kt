package com.ateam.listview_01_jess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ateam.listview_01_jess.adapters.StudentAdapter
import com.ateam.listview_01_jess.datas.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student>()

    lateinit var mAdapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add(Student("강중성",1994))
        mStudentList.add(Student("아팔성",1964))
        mStudentList.add(Student("초이송",1997))
        mStudentList.add(Student("최동필",1982))
        mStudentList.add(Student("강인헉",1989))
        mStudentList.add(Student("초대학",1976))
        mStudentList.add(Student("추소현",1989))

        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)
        studentListView.adapter = mAdapter
        
        studentListView.setOnItemClickListener { parent, view, position, id -> 
            
            val clickedStudent = mStudentList[position]

            Toast.makeText(this, "${clickedStudent.name}이 클릭 됨", Toast.LENGTH_SHORT).show()
        }
    }
}