package com.rayshaayundami2b.wisatajepang

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.rayshaayundami2b.wisatajepang.adapter.AdapterGambar

class HomePage : AppCompatActivity() {
    private val imageList = arrayOf(
        R.drawable.shintenoji,
        R.drawable.images2,
        R.drawable.images3,
        R.drawable.images4
    )

    private val title = arrayOf("Shitennoji", "Byodo-in", "Yama-dera", "Todai-ji")
    private val location = arrayOf("Lokasi : Osaka,Jepang", "Lokasi : Kyoto,Jepang", "Lokasi : Yamagata,Jepang", "Lokasi : Nara,Jepang")
    private val tgl = arrayOf(
        "Tgl : 20 - September - 2024",
        "Tgl : 1 - Agustus - 2024",
        "Tgl : 12 - Maret - 2024",
        "Tgl : 17 - Juni - 2024"
    )

    private val des = arrayOf(
        "Originally, the temple was created to teach and spread Buddhism when Buddhism wasn’t a thing in Japan yet. The teachings didn’t belong to any particular sect. Then there was a period when it became a temple for the Tiantai school (天台宗). But then in 1946, it became the main temple for an independent sect of Buddhism called “Washu” (和宗) which hopes to transcend the wall of “sects” in Buddhism and welcome anyone.",
        "Byodo-in in Uji, Kyoto Prefecture was built in 998. The Phoenix Hall features 1,000 year-old Buddhist statues and other national treasures. The image of the Phoenix Hall can be seen on the Japanese 10 yen coin.",
        "Yama-dera is a mountain temple in Yamagata Prefecture built in 860. Visitors must hike up nearly 1,000 stone steps in order to reach the temple grounds. The trek takes approximately 30 minutes and can be quite strenuous. Once at the top, the temple offers fantastic views of the valley.",
        "Todai-ji in Nara was built in 752 and is the largest wooden structure in the world. Inside is the largest Buddha statue in Japan, measuring 15 meters tall and consisting of 437 tons of bronze and 130 kg of gold."
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home_page)

        val gridView = findViewById<GridView>(R.id.gridView)
        val adapter = AdapterGambar(this, imageList, title, location)
        gridView.adapter = adapter

        gridView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, DetailGambar::class.java)
            intent.putExtra("data", imageList[position])
            intent.putExtra("data1", title[position])
            intent.putExtra("data2", location[position])
            intent.putExtra("data3", tgl[position])
            intent.putExtra("data4", des[position])
            startActivity(intent)
        }
    }
}