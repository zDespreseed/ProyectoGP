package com.example.gpaplicacion.interfaces;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.gpaplicacion.R;

public class evaluacion_p extends AppCompatActivity {
    public static final String r_correctas = "Respuesta Correcta";
    public static final String p_actual = "Pregunta Actual";
    public static final String r_incorrecta = "Respuesta Incorrecta";
    public static final String respuesta = "Respuesta";


    private int ids_answers[] = {
            R.id.rdbOpcion1, R.id.rdbOpcion2, R.id.rdbOpcion3, R.id.rdbOpcion4
    };
    private String[] t_preguntas;

    private TextView txt_pregunta;
    private RadioGroup gr_evaluaionA;
    private Button btn_next, btn_prev;
    ImageView img_pregunta;

    private int correct_answer;
    private int current_question;
    private boolean[] answer_is_correct;
    private int[] answer;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.i("lifecycle", "onSaveInstanceState");
        super.onSaveInstanceState(outState);
        outState.putInt(r_correctas, correct_answer);
        outState.putInt(p_actual, current_question);
        outState.putBooleanArray(r_incorrecta, answer_is_correct);
        outState.putIntArray(respuesta, answer);
    }

    @Override
    protected void onStop() {
        Log.i("lifecycle", "onStop");
        super.onStop();
    }

    @Override
    protected void onStart() {
        Log.i("lifecycle", "onStart");
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        Log.i("lifecycle", "onDestroy");
        super.onDestroy();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("lifecycle", "onCreate");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluacion_p);

        txt_pregunta = findViewById(R.id.text_question);
        gr_evaluaionA = findViewById(R.id.rgOpciones);
        btn_next = findViewById(R.id.btn_check);
        btn_prev = findViewById(R.id.btn_prev);
        img_pregunta= findViewById(R.id.img_EA);

        t_preguntas = getResources().getStringArray(R.array.ev_animales);

        if (savedInstanceState == null) {
            startOver();
        } else {
            Bundle state = savedInstanceState;
            correct_answer = state.getInt(r_correctas);
            current_question = state.getInt(p_actual);
            answer_is_correct = state.getBooleanArray(r_incorrecta);
            answer = state.getIntArray(respuesta);
            showQuestion();
        }

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer();
                if (current_question < t_preguntas.length-1) {
                    current_question++;
                    showQuestion();
                } else {
                    checkResults();
                }
            }
        });

        btn_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer();
                if (current_question > 0) {
                    current_question--;
                    showQuestion();
                }
            }
        });
    }
    private void checkResults() {
        int correctas = 0, incorrectas = 0, nocontestadas = 0;
        for (int i = 0; i < t_preguntas.length; i++) {
            if (answer_is_correct[i]) correctas++;
            else if (answer[i] == -1) nocontestadas++;
            else incorrectas++;
        }

        // TODO: Permitir traducción de este texto:
        String message =
                String.format("Correctas: %d\nIncorrectas: %d\nNo contestadas: %d\n",
                        correctas, incorrectas, nocontestadas);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Resultado");
        builder.setMessage(message);
        builder.setCancelable(false);
        builder.setPositiveButton("Terminado", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("Volver a empezar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startOver();
            }
        });
        builder.create().show();
    }

    private void startOver() {
        answer_is_correct = new boolean[t_preguntas.length];
        answer = new int[t_preguntas.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = -1;
        }
        current_question = 0;
        showQuestion();
    }

    private void checkAnswer() {
        int id = gr_evaluaionA.getCheckedRadioButtonId();
        int ans = -1;
        for (int i = 0; i < ids_answers.length; i++) {
            if (ids_answers[i] == id) {
                ans = i;
            }
        }
        answer_is_correct[current_question] = (ans == correct_answer);
        answer[current_question] = ans;
    }

    private void showQuestion() {
        String q = t_preguntas[current_question];
        String[] parts = q.split(";");

        gr_evaluaionA.clearCheck();

        txt_pregunta.setText(parts[0]);
        for (int i = 0; i < ids_answers.length; i++) {
            RadioButton rb = (RadioButton) findViewById(ids_answers[i]);
            String ans = parts[i+1];
            if (ans.charAt(0) == '*') {
                correct_answer = i;
                ans = ans.substring(1);
            }
            rb.setText(ans);
            if (answer[current_question] == i) {
                rb.setChecked(true);
            }
        }
        if (current_question == 0) {
            btn_prev.setVisibility(View.GONE);
        } else {
            btn_prev.setVisibility(View.VISIBLE);
        }
        if (current_question == t_preguntas.length-1) {
            btn_next.setText("Terminar");
        } else {
            btn_next.setText("Siguiente");
        }
    }
}