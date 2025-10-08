package com.example.notas.ui.theme.screens


import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun NoteDetailScreen(navController: NavController) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = { navController.popBackStack() }) {
                Icon(Icons.Default.Check, contentDescription = "Guardar")
            }
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
                .fillMaxSize()
        ) {
            OutlinedTextField(value = "", onValueChange = {}, label = { Text("Título") }, modifier = Modifier.fillMaxWidth())
            Spacer(Modifier.height(8.dp))
            OutlinedTextField(value = "", onValueChange = {}, label = { Text("Descripción") }, modifier = Modifier.fillMaxWidth().height(200.dp))
            Spacer(Modifier.height(16.dp))
            Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
                IconButton(onClick = {}) { Icon(Icons.Default.Check, contentDescription = "Foto") }
                IconButton(onClick = {}) { Icon(Icons.Default.Check, contentDescription = "Galería") }
                IconButton(onClick = {}) { Icon(Icons.Default.Check, contentDescription = "Archivo") }
                IconButton(onClick = {}) { Icon(Icons.Default.Check, contentDescription = "Audio") }
            }
        }
    }
}
