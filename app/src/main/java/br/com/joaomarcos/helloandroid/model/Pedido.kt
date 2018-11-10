package br.com.joaomarcos.helloandroid.model

import android.os.Parcel
import android.os.Parcelable

data class Pedido(val nome: String, val telefone: String): Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nome)
        parcel.writeString(telefone)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Pedido> {
        override fun createFromParcel(parcel: Parcel): Pedido {
            return Pedido(parcel)
        }

        override fun newArray(size: Int): Array<Pedido?> {
            return arrayOfNulls(size)
        }
    }

}