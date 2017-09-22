package intent.com.function

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
 * @Author: Vadivel
 * @Desc:Simple usage of textview and button properties used in programmatically
 *
 * */
class MainActivity : AppCompatActivity() {


    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*****************TEXTVIEW************************/
        textview.text = "Kotlin textview example"
        textview.setTextColor(Color.RED)
        textview.maxLines = 10

        /*********************TEXTVIEW*ONCLICK*******************/
        textview.setOnClickListener {
            Toast.makeText(this, "" + start(), Toast.LENGTH_LONG).show()

        }
        /*********************BUTTON********************/


        /*********************BUTTON*ONCLICK*******************/
        button.setOnClickListener {
            view: View? ->
            if (view != null) {
                var x = view.id
                button.text = "Button Clicked "
                Toast.makeText(this, "OnClick", Toast.LENGTH_LONG).show()
                button.background = ContextCompat.getDrawable(this, R.drawable.ic_launcher_background)

            }
            setValues()

        }
        /************************************************/


    }

    /***********************FUNCTION CALLING*****************************/
    fun setValues() {
        this.textview.text = "Welcome to Kotlin"
    }

    fun start(): String = "HelloWorld!!!"

}
