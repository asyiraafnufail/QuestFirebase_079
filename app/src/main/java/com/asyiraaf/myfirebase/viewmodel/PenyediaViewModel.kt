package com.asyiraaf.myfirebase.viewmodel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.asyiraaf.myfirebase.repositori.AplikasiDataSiswa

object PenyediaViewModel {
    val Factory = viewModelFactory {

        // Initializer untuk HomeViewModel
        initializer {
            HomeViewModel(aplikasiDataSiswa().container.repositorySiswa)
        }

        // Initializer untuk EntryViewModel
        initializer {
            EntryViewModel(aplikasiDataSiswa().container.repositorySiswa)
        }

        initializer {
            DetailViewModel(
                this.createSavedStateHandle(),
                aplikasiDataSiswa().container.repositorySiswa
            )
        }
        initializer {
            EditViewModel(
                this.createSavedStateHandle(),
                aplikasiDataSiswa().container.repositorySiswa
            )
        }
    }
}

/**
 * Fungsi ekstensi untuk mengambil objek AplikasiDataSiswa dari CreationExtras.
 * Pastikan nama class 'AplikasiDataSiswa' sesuai dengan yang ada di ContainerApp.kt
 */
fun CreationExtras.aplikasiDataSiswa(): AplikasiDataSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiDataSiswa)