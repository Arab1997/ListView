package my.way.listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//ArrayList
        val values = arrayListOf("Item One, Item Two,Item Three, Item Four, Item Five")
//ListView
        val mListView = findViewById<ListView>(R.id.listView)
        //adapter
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values)
        //set adapter
        mListView.adapter = adapter

        //list item click
        mListView.setOnItemClickListener { parent, view, position, id ->
            if (position == 0) {
                Toast.makeText(this@MainActivity, "Item One clicked", Toast.LENGTH_SHORT).show()
            }
            if (position == 1) {
                Toast.makeText(this@MainActivity, "Item Two clicked", Toast.LENGTH_SHORT).show()
            }

            if (position == 2) {
                Toast.makeText(this@MainActivity, "Item Three clicked", Toast.LENGTH_SHORT).show()
            }

            if (position == 3) {
                Toast.makeText(this@MainActivity, "Item Four clicked", Toast.LENGTH_SHORT).show()
            }
            if (position == 4) {
                Toast.makeText(this@MainActivity, "Item Five clicked", Toast.LENGTH_SHORT).show()
            }

        }

    }
}