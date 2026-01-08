package com.asyiraaf.myfirebase.viewmodel

import com.asyiraaf.myfirebase.modeldata.Siswa

sealed interface StatusUIDetail {
    data class Success(val satusiswa: Siswa?) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}