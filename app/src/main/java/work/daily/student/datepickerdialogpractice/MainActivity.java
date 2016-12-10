package work.daily.student.datepickerdialogpractice;

import android.app.DatePickerDialog;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity{

    EditText date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        date = (EditText) findViewById(R.id.dateEt);
    }

    public void showDatePickerDialog(View view) {

        DateDialog newFragment = new DateDialog(this,date);
        newFragment.show(getSupportFragmentManager(), "datePicker");

    }
}
