package com.recepgemalmaz.pazarama_bootcamp_ders_5_4_flow_sample_4


import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow

class SayiciVM : ViewModel()
{
    var Sayi = flow<Int>
    {
        for (i in 1..100)
        {
            delay(200)
            emit(i)

        }

    }

    //Flow aslinda livedata ya alternatif olarak kullanilabilir


}