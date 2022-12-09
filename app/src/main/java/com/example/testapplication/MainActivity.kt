package com.example.testapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), Parcelable {
    @SuppressLint("MissingInflatedId")

    /**
     * Responsible for behavior of UI in the Main Activity.
     * Also is responsible for the calculation of numerical values
     * placed within the UI.
     * @param savedInstanceState Bundle of saved instance state.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity()
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }
}