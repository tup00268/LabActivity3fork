package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView
    lateinit var nameEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with views defined in Layout - the first one is done for you
        displayTextView = findViewById(R.id.displayTextView)
        nameEditText = findViewById(R.id.nameEditText)

        findViewById<Button>(R.id.clickMeButton).setOnClickListener {
            val name = nameEditText.text.toString()
            if (name.isBlank()){
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            }else {
                displayTextView.text = "Hello, ${findViewById<EditText>(R.id.nameEditText).text}"
            }
        }


    }
}