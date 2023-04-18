package com.example.jetpackcomponentscatalog

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun SimpleRecyclerView() {
    val myList = listOf("Juan","Pablo","Hector","Asdrubal")
    LazyColumn{
        item { Text(text = "Primer item") }
        items(7){
            Text(text = "este es el item $it")
        }
        items(myList){
            Text(text = "Hola el nombre de la lista es $it" )
        }
    }
}

