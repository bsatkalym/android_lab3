package kz.talipovsn.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class StartActivity extends AppCompatActivity {
    // Локальные переменные для доступа к компонентам окна
    private EditText editText;
    private CheckBox checkBox;
    Button b_starter; // Переменная для доступа к компоненту кнопки

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        b_starter = findViewById(R.id.b_starter);
        b_starter.setEnabled(false);
    }

    public void onCheckboxClicked(View view) {
        // Получаем флажок
        CheckBox checkBox = (CheckBox) view;
        // Получаем, отмечен ли данный флажок
        if(checkBox.isChecked()) {
            b_starter.setEnabled(true);
        }
        else {
            b_starter.setEnabled(false);
        }
    }

    public void onStart(View v) {
        // Создание второго окна
        Intent intent = new Intent(StartActivity.this, MainActivity.class);
        //Intent intent = new Intent("kz.talipovsn.questionnaire.ResultActivity");
        // Запуск второго окна
        startActivity(intent);
    }
}