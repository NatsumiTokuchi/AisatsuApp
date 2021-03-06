package jp.techacademy.natsumi.tokuchi

import android.app.TimePickerDialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour,minute ->
               if (hour in 2..9) {
                   textView.text = "おはよう"
               } else if (hour in 10..17) {
                   textView.text = "こんにちは"
               } else {
                   textView.text = "こんばんは"
               }
            },
            13, 0, true)
        timePickerDialog.show()
    }
}
