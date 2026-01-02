package com.asyiraaf.myfirebase.view.navigasi

import com.asyiraaf.myfirebase.view.route.DestinasiNavigasi
import com.asyiraaf.myfirebase.R

object DestinasiDetail : DestinasiNavigasi {
    override val route = "detail_siswa"
    override val titleRes = R.string.detail_siswa
    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}