package com.example.unitconverter.ui.conversionScreen

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.Selection
import android.view.View
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.example.unitconverter.R
import com.example.unitconverter.databinding.FragmentConversionScreenBinding

class ConversionScreenFragment : Fragment(R.layout.fragment_conversion_screen){
private lateinit var binding: FragmentConversionScreenBinding
lateinit var editText1 : EditText
lateinit var editText2 : EditText
lateinit var textz: Editable
lateinit var zero: AppCompatButton
lateinit var one: AppCompatButton
lateinit var two: AppCompatButton
lateinit var three: AppCompatButton
lateinit var four: AppCompatButton
lateinit var five: AppCompatButton
lateinit var six: AppCompatButton
lateinit var seven: AppCompatButton
lateinit var eight : AppCompatButton
lateinit var nine : AppCompatButton
lateinit var point : AppCompatButton
lateinit var multiplication: AppCompatButton
lateinit var doubleZero: AppCompatButton
lateinit var clear: AppCompatButton
var yellow:Boolean = false
lateinit var customButtonLayout : ConstraintLayout

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        zero = view.findViewById(R.id.zero);
        one = view. findViewById(R.id.one) ;
        two = view.findViewById(R.id.two);
        three = view.findViewById(R.id.three);
        four = view.findViewById(R.id.four);
        five = view.findViewById(R.id.five);
        six = view.findViewById(R.id.six);
        seven = view.findViewById(R.id.seven)
        eight = view.findViewById(R.id.eight);
        nine = view.findViewById(R.id.nine);
        clear = view.findViewById(R.id.clear);
        editText1 = view.findViewById(R.id.editText1);

        editText2 = view.findViewById(R.id.editText2);



            zero.setOnClickListener(View.OnClickListener { view ->

                if (yellow)addValue2(resources.getString(R.string.zero))
                else
                    addValue(resources.getString(R.string.zero))
            })


                one.setOnClickListener(View.OnClickListener { view ->
         if(yellow)
           addValue2(resources.getString(R.string.one))
           else addValue(resources.getString(R.string.one))

       })

        two.setOnClickListener(View.OnClickListener { view ->
           if(yellow) addValue2(resources.getString(R.string.two))
            else addValue(resources.getString(R.string.two))
        })

        three.setOnClickListener(View.OnClickListener { view ->
           if(yellow) addValue2(resources.getString(R.string.three))
            else addValue(resources.getString(R.string.three))

        })

        four.setOnClickListener(View.OnClickListener { view ->
            if (yellow) addValue2(resources.getString(R.string.four))
          else  addValue(resources.getString(R.string.four))
        })

        five.setOnClickListener(View.OnClickListener { view ->
           if (yellow) addValue2(resources.getString(R.string.five))
            else addValue(resources.getString(R.string.five))

        })

        six.setOnClickListener(View.OnClickListener { view ->
          if (yellow) addValue2(resources.getString(R.string.six))
            else addValue(resources.getString(R.string.six))

        })

        seven.setOnClickListener(View.OnClickListener { view ->
            if (yellow)addValue2(resources.getString(R.string.seven))
            else addValue("7")

        })

        eight.setOnClickListener(View.OnClickListener { view ->
            if (yellow)addValue2(resources.getString(R.string.eight))
            else addValue("8")

        })

        nine.setOnClickListener(View.OnClickListener { view ->
            if (yellow) addValue2 (resources.getString(R.string.nine))
            else addValue("9")
        })

        clear.setOnClickListener(View.OnClickListener { view ->
          if (yellow) addValue2 ("")
            else addValue("")

        })
        editText1.showSoftInputOnFocus = false;

        editText2.showSoftInputOnFocus = false;

        customButtonLayout = view.findViewById(R.id.customButtonLayout)

                    //editText1.setOnClickListener{}


        editText1.setOnClickListener(View.OnClickListener { view ->

            yellow = false

            customButtonLayout.isVisible = true

           if (getString(R.string.editText1).equals(editText1.text.toString())){

               editText1.setText("");
           }

            })



        binding = FragmentConversionScreenBinding.bind(view);


        editText2.setOnClickListener(View.OnClickListener { view ->

            yellow = true

            customButtonLayout.isVisible = true

            if(getString(R.string.editText2).equals(editText2.text.toString())){

                editText2.setText("");
            }



            })

    }

    private fun addValue(Value: String) {


        var initialValue = editText1.text.toString();
        val startCursor = editText1.selectionStart



        var positiontextBegin = initialValue.substring(0, startCursor)
        var positiontextEnd = initialValue.substring(startCursor)

        editText1.setText(String.format("%s%s",positiontextBegin, Value, positiontextEnd ))
       editText1.setSelection(startCursor + Value.length)
    }


    private fun addValue2 (Value: String) {


        var initialValue = editText2.text.toString();
        val startCursor = editText2.selectionStart



        var positiontextBegin = initialValue.substring(0, startCursor)
        var positiontextEnd = initialValue.substring(startCursor)

        editText2.setText(String.format("%s%s%s",positiontextBegin, Value, positiontextEnd ))
        editText2.setSelection(startCursor + Value.length)
    }


}