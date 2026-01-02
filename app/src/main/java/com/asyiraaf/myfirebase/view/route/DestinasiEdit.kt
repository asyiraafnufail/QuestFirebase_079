package com.asyiraaf.myfirebase.view.controllNavigasi

import com.asyiraaf.myfirebase.view.route.DestinasiNavigasi
import com.asyiraaf.myfirebase.R

object DestinasiEdit : DestinasiNavigasi {
    override val route = "item_edit"
    override val titleRes = R.string.edit_siswa
    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}