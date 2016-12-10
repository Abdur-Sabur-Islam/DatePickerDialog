package work.daily.student.datepickerdialogpractice;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

/**
 * Created by acer on 12/10/2016.
 */

public class DateDialog extends DialogFragment implements DatePickerDialog.OnDateSetListener {

    EditText dateText;
    Context context;

    public DateDialog(Context context,EditText dateText) {
        this.context = context;
        this.dateText = dateText;
    }

    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        return new DatePickerDialog(getActivity(), this, year, month, day);

    }

        @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int day) {

            String date = day+"-"+(month+1)+"-"+year;
            dateText.setText(date);

    }
}
