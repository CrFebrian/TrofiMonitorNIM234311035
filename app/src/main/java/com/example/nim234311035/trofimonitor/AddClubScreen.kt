package com.example.nim234311035.trofimonitor

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AddClubScreen(onAddClub: (Club) -> Unit) {
    // State untuk menyimpan input pengguna
    var name by remember { mutableStateOf("") }
    var premierLeague by remember { mutableStateOf("") }
    var faCup by remember { mutableStateOf("") }
    var eflCup by remember { mutableStateOf("") }
    var championsLeague by remember { mutableStateOf("") }
    var europaLeague by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(20.dp)) {
        // Input untuk nama klub
        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Club Name") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))

        // Input untuk Premier League trofi
        TextField(
            value = premierLeague,
            onValueChange = { premierLeague = it },
            label = { Text("Premier League Tropi") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))

        // Input untuk FA Cup trofi
        TextField(
            value = faCup,
            onValueChange = { faCup = it },
            label = { Text("FA Cup Tropi") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))

        // Input untuk EFL Cup trofi
        TextField(
            value = eflCup,
            onValueChange = { eflCup = it },
            label = { Text("EFL Cup Tropi") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))

        // Input untuk Champions League trofi
        TextField(
            value = championsLeague,
            onValueChange = { championsLeague = it },
            label = { Text("Champions League Tropi") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))

        // Input untuk Europa League trofi
        TextField(
            value = europaLeague,
            onValueChange = { europaLeague = it },
            label = { Text("Europa League Tropi") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))

        // Tombol untuk menambah klub baru ke daftar
        Button(
            onClick = {
                // Konversi input dari String ke Int dan tambahkan klub baru
                val newClub = Club(
                    name = name,
                    premierLeague = premierLeague.toIntOrNull() ?: 0,
                    faCup = faCup.toIntOrNull() ?: 0,
                    eflCup = eflCup.toIntOrNull() ?: 0,
                    championsLeague = championsLeague.toIntOrNull() ?: 0,
                    europaLeague = europaLeague.toIntOrNull() ?: 0
                )
                // Tambahkan klub baru ke daftar
                onAddClub(newClub)

                // Reset field setelah menambahkan
                name = ""
                premierLeague = ""
                faCup = ""
                eflCup = ""
                championsLeague = ""
                europaLeague = ""
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Tambah Club", fontSize = 18.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AddClubScreenPreview() {
    AddClubScreen(onAddClub = {})
}