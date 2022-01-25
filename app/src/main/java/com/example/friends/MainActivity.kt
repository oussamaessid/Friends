package com.example.friends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.friends.DataSource.createDataSet
import com.example.friends.databinding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.items.*
import kotlinx.android.synthetic.main.items.view.*


class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private lateinit var database: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.list.setOnClickListener {
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.button.setOnClickListener {
            val id: String = binding.textView.text.toString()
            if (id.isNotEmpty()) {

                readData(id)

            } else {

                Toast.makeText(this, "PLease enter the id", Toast.LENGTH_SHORT).show()

            }

        }
    }

    private fun readData(id: String) {

        database = FirebaseDatabase.getInstance().getReference("Users")
        database.child(id).get().addOnSuccessListener {

            if (it.exists()) {

                val questions = it.child("question").value

                Toast.makeText(this, "Successfuly Read", Toast.LENGTH_SHORT).show()
                binding.textView.text.clear()
                binding.etTxt.text = questions.toString()


            } else {

                Toast.makeText(this, "User Doesn't Exist", Toast.LENGTH_SHORT).show()


            }

        }.addOnFailureListener {

            Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()


        }

    }
}



