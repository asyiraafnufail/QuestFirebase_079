package com.asyiraaf.myfirebase.viewmodel

import android.view.View
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.asyiraaf.myfirebase.modeldata.Siswa
import com.asyiraaf.myfirebase.repositori.RepositorySiswa

sealed interface StatusUIDetail {
    data class Success(val satusiswa: Siswa?) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}

class DetailViewModel(
    savedStateHandle: SavedStateHandle,
    private val repositorySiswa: RepositorySiswa
) : ViewModel() {

}