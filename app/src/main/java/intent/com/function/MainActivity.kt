package intent.com.function

import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


/***
 *  * @Desc:Simple usage of textview and button properties used in programmatically
 *
 * */
class MainActivity : AppCompatActivity() {


    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*****************TEXTVIEW************************/
      //  val textView: TextView = findViewById(R.id.text) // Declaration
        /*****************OR************************/
        textview.text = "Kotlin textview example"
        textview.setTextColor(Color.RED)
        textview.maxLines = 10

        textview.setOnClickListener {
            Toast.makeText(this, "" + start(), Toast.LENGTH_LONG).show()

        }



        /*********************BUTTON*ONCLICK*******************/
        btn.setOnClickListener {
            view: View? ->
            if (view != null) {
               // var x = view.id
                btn.text = "Button Clicked "
                Toast.makeText(this, "OnClick", Toast.LENGTH_LONG).show()
                btn.background = ContextCompat.getDrawable(this, R.drawable.ic_launcher_background)

            }
            setValues()

        }
        /************************************************/

        btn_click.setOnClickListener {


           var intent= Intent(this,SecondActivity::class.java)
            intent.putExtra("msg",  getString(R.string.kotlin_feature))
            startActivity(intent)



        }


    }

    /***********************FUNCTION CALLING*****************************/
    fun setValues() {
        this.textview.text = "Welcome to Kotlin"
    }

    fun start(): String = "HelloWorld!!!"

}
