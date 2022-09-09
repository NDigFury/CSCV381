package edu.arizona.cast.nikkidiguardi.hellodate
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import edu.arizona.cast.nikkidiguardi.hellodate.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
    private var date_button: Button = findViewById(R.id.date_button)
    private var display_date: TextView = findViewById(R.id.display_date)
    // private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(binding.root)

        //binding.date_button.setOnClickListener{
        //displayDate()
        //}
        //binding.display_date.setText(displayDate())

        display_date.setText(displayDate().toString())
        //date_button.setOnClickListener{
        // displayDate().toString()
        // }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun displayDate() {
        val dateTime = LocalDateTime.now()
        //val display_date: TextView = findViewById(R.id.display_date) as TextView
        display_date.text = dateTime.format(
            // date_button.text = dateTime.format(
            DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withZone(
                ZoneId.systemDefault()
            )
        )
    }

}




