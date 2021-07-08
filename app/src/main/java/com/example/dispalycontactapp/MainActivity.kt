package com.example.dispalycontactapp

import DispalyContactAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvContact: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayContact()
    }

    fun displayContact() {
        var contactList = listOf<Contact>(
            Contact("Beth", "beth@gmail.com", "+27888239"),
            Contact("Sophie", "sophe@gmail.com", "+2756657667"),
            Contact("Enda", "edna@gmail.ocom", "+2477888"),
            Contact("Belyse", "belyse@gmail.com", "+25677789"),
            Contact("Chantal", "chantal@gmail.com", "+253476898"),
            Contact("Jacky", "jacky@gmail.com", "+256865878"),
            Contact("Mercy", "mercy@gmail.com", "+2324546"),
            Contact("Doro", "doro@gmail.com", "+22455665"),
            Contact("Ana", "ana@gmail.com", "+23274388"),
            Contact("Belyse", "belyse@gmail.com", "+25677789"),


            )
        rvContact = findViewById(R.id.rvContact)
        var contactAdapter=DispalyContactAdapter(contactList)
        rvContact.layoutManager=LinearLayoutManager(baseContext)
        rvContact.adapter=contactAdapter


    }
}
