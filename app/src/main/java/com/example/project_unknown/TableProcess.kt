package com.example.project_unknown

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TableProcess : AppCompatActivity() {

    private lateinit var showfavorite : TextView
    private lateinit var showGPA : TextView
    private lateinit var showfaculty : TextView
    private lateinit var showuniversity : TextView
    private lateinit var solution : TextView
    private lateinit var imageback : ImageView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table_process)

        showfavorite = findViewById(R.id.txt_getFavorite)
        showGPA = findViewById(R.id.txt_getGrade)
        showfaculty = findViewById(R.id.txt_getFaculty)
        showuniversity = findViewById(R.id.txt_getUniversity)
        solution = findViewById(R.id.txt_paragraph)
        imageback = findViewById(R.id.iv_back3)

        imageback.setOnClickListener {
            val intent = Intent(this, inputinformation::class.java)
            startActivity(intent)
        }


        val getfavorite = intent.getStringExtra("favorite")
        if (getfavorite != null){
            showfavorite.setText(getfavorite)
        }

        val getGPA = intent.getStringExtra("GPA")
        if (getGPA != null){
            showGPA.setText(getGPA)
        }

        val getfaculty = intent.getStringExtra("faculty")
        if (getfaculty != null)
            showfaculty.setText(getfaculty)

        val getuniverity = intent.getStringExtra("University")
        if (getuniverity != null)
            showuniversity.setText(getuniverity)

        if (getuniverity != null) {
            if (getuniverity == "SPU"){
                solution.text = "1.Faculty of Digital \n 2.Faculty of Communication Arts \n 3.Faculty of Design and Architectural Council \n 4.Faculty of Interdisciplinary Technology and Innovation Department \n 5.Faculty of Business Administration \n 6.Faculty of Logistics and Supply \n 7.Faculty of Accountancy \n 8.Faculty of Information Technology \n 9.Faculty of Aviation and Transportation \n 10.Faculty of Liberal Arts"
            }else if (getuniverity == "KU") {
                solution.text = "1.Faculty of Engineering : GPA 3.25+ \n 2.Faculty of Humanities(china & Japan language) : GPA 3.25 \n 3.Faculty of Business Administration : GPA 3.25 \n 4.Faculty of Veterinary Medicine : GPA 3.20 \n 5.Faculty of Science : GPA 3.0 \n 6.Faculty of Education : GPA 2.75+ \n 7.Faculty of Social Sciences : GPA 2.75 \n 8.Faculty of AgroIndustry : GPA 2.75 \n 9.Faculty of Humanities : GPA 3.0 \n 10.Faculty of Veterinary Technology : GPA 2.75"
            }else if (getuniverity == "CHULA"){
                solution.text = " GPA 3.0+ : \n Faculty of Architecture , Faculty of Commerce and Accountancy , Faculty of Education , Faculty of Psychology \n GPA 2.75+ : \n Faculty of Science , Faculty of Communication Arts , Faculty of Economics , Faculty of Allied Health Sciences \n GPA 2.50+ : \n Faculty of Engineering , Faculty of Political Science , Faculty of Sports Science , Faculty of School of Agricultural Resources "
            }else if (getuniverity == "CMU"){
                solution.text = "GPA 3.50+ \n Faculty of Humanities English major & French major ,\n Faculty of Humanities : Department of Clinical Psychology , Department of Industrial and Organizational Psychology , Japanese & China & Mianma language major \n GPA 3.0 : \n Faculty of Social Sciences : ASEAN Studies major , Department of Chemistry, Industrial Chemistry Biochemistry and Biochemistry Technology , Field of study: Biology, Microbiology, Zoology \n Faculty of Science : Field of study: Biology, Microbiology, Zoology , Department of Physics, Materials Science , Department of Geology ,  Department of Gemology \n GPA 2.75 : \n Faculty of Humanities : Home and community field of study , Philosophy major \n GPA 2.0 : \n Faculty of Fine Arts : Graphic arts subject , Painting subject , Sculpture subject   "
            }else if (getuniverity == "KKU"){
                solution.text = "1.Faculty of pharmacy : GPA 3.0+ \n 2.Faculty of Humanities and Social Sciences : 3.0 \n 3.Faculty of Fine arts : GPA 2.0 \n 4.Faculty of Engineering : GPA 2.75 \n 5.Faculty of Dentistry : GPA 3.50 \n 6.Faculty of Education : GPA 2.75 \n 7.Faculty of Pharmacy : GPA 2.75 \n 8.Faculty of Humanities and Social Sciences : GPA 3.0 \n 9.Faculty of Agriculture : GPA 2.75 \n 10.international college : GPA 2.0+ & Language skills  "
            }else if (getuniverity == "TU"){
                solution.text = "1.Faculty of Law : GPA 2.75 \n 2.Faculty of Commerce and Accountancy : 2.50 \n 3.Faculty of Political Science : GPA 2.75 \n 4.Faculty of Economics : GPA 2.75 \n 5.Faculty of Learning Sciences and Education : GPA 3.0 \n 6.Faculty of Liberal Arts : GPA 2.75 \n 7.Faculty of Social Work : GPA 2.50 \n 8.Faculty of Medicine : GPA 3.50 \n 9.Faculty of Nursing : GPA 2.75 \n 10.Faculty of Public Health : GPA 2.75"
            }else if (getuniverity == "KMITL"){
                solution.text = "1.Faculty of Engineering : GPA 3.0 \n 2.Faculty of Agricultural Technology : GPA 3.0 \n 3.College of Materials Technology and Innovation : GPA 3.0 \n 4.College of Musical Engineering : GPA 3.0 \n 5.College of Advanced Manufacturing Innovation : GPA 3.0 \n 6.Faculty of Information Technology : GPA 3.0 \n 7.Faculty of Business Administration : GPA 2.75 \n 8.Faculty of Science : GPA is exchange as appropriate \n 9.Faculty of Liberal Arts : GPA 3.25 \n 10.International Aviation Industry College : GPA 3.0 , CU_TEP , TGAT1 , TOEFL , ITELTS"
            }else if (getuniverity == "KMUTNB"){
                solution.text = "1.Faculty of Industrial Education : 2.50 \n 2.Faculty of Engineering : GPA 2.75 \n 3.Faculty applied science : GPA 2.0 \n 4.Department of Architecture and Design : GPA 2.0 \n 5.Faculty of Business and industrial development : GPA 2.25 \n 6.Faculty of Science, Technology and Industry : GPA 3.0 \n 7.Faculty of Engineering and Technology : GPA 3.0"
            }else if (getuniverity == "MAHIDOL"){
                solution.text = "1.Faculty of Medicine Siriraj Hospital : GPA 3.50 \n 2.Faculty of Sports Science and Technology : GPA 3.0 \n 3.Faculty of Information and Communication Technology : GPA 2.50 \n 4.Faculty of Science : GPA 2.75 \n 5.Faculty of Medicine Ramathibodi Hospital : GPA 3.0 \n 6.Faculty of Public Health : GPA 3.0 \n 7.Faculty of Engineering : GPA 3.0 \n 8.Faculty of Liberal Arts : GPA 3.0 \n 9.Faculty of Veterinary Medicine : GPA 3.50 \n 10.Faculty of Medical Technology : GPA 3.80 "
            }else if (getuniverity == "SWU"){
                solution.text = "1.Faculty of Science : GPA 3.0 \n 2.Faculty of Humanities : GPA 2.50-3.0 \n 3.Faculty of Social Sciences : GPA 2.75 \n 4.Faculty of Social Business Administration : GPA 2.50-3.0 \n 5.Faculty of Physical Education : GPA 2.50 \n 6.Faculty of Education : GPA 2.75 & 3.0 \n 7.Faculty of Economics : GPA 2.0-3.75 \n 8.Faculty of Dentistry : GPA 3.75 \n 9.Faculty of Engineering 2.50-3.50 \n 10.Faculty of Technology and Agricultural Product Innovation : GPA >2.0 "
            }else if (getuniverity == "RMUTT" ){
                solution.text = "1.Faculty of Liberal Arts : GPA 3.0 \n 2.Faculty of Industrial Education : GPA 2.75 \n 3.Faculty of Engineering : GPA 2.75-3.0 \n 4.Faculty of Business Administration : GPA 2.75-3.5 \n 5.Faculty of Home Economics Technology : GPA 2.5-2.75 \n 6.Faculty of Mass Communication Technology : 2.75-3.0 \n 7.Faculty of Science : GPA 2.75+ \n 8.Faculty of Architecture : GPA 2.75"
            }
        }
    }
}