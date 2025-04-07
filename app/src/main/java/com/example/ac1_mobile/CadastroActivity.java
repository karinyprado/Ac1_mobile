package com.example.ac1_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class CadastroActivity extends AppCompatActivity {
    private EditText edtNome, edtDescricao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_edit_habito);

        edtNome = findViewById(R.id.edtNome);
        edtDescricao = findViewById(R.id.edtDescricao);

        findViewById(R.id.btnSalvar).setOnClickListener(v -> {
            String nome = edtNome.getText().toString();
            String descricao = edtDescricao.getText().toString();

            Habito habito = new Habito(nome, descricao);
            Intent resultIntent = new Intent();
            resultIntent.putExtra("habito", habito);
            setResult(RESULT_OK, resultIntent);
            finish();
        });
    }
}
