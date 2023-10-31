package com.recepgemalmaz.pazarama_bootcamp_ders_5_4_flow_sample_4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.recepgemalmaz.pazarama_bootcamp_ders_5_4_flow_sample_4.ui.theme.Pazarama_Bootcamp_Ders_5_4_Flow_Sample_4Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Pazarama_Bootcamp_Ders_5_4_Flow_Sample_4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val vm: SayiciVM by viewModels() //var ile tanimlanmaz
                    var alinanDeger = vm.Sayi.collectAsState(initial = 0)


                    Box(modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    )
                    {
                        Text(text = "ViewModel'den alınan değer ${alinanDeger.value}",
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.Red
                        )
                    }
                }
            }
        }
    }
}

