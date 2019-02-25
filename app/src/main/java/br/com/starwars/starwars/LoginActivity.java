package br.com.starwars.starwars;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.com.starwars.starwars.view.PersonagemListActivity;

public class LoginActivity extends AppCompatActivity {

    EditText edtUsuario, edtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsuario = findViewById(R.id.login_edtUsuario);
        edtSenha = findViewById(R.id.login_edtSenha);
    }

    public void abrirApp(View v){
        if((edtUsuario.getText().toString().equals("admin")) && (edtSenha.getText().toString().equals("admin"))){
            Intent it = new Intent(this,PersonagemListActivity.class);
            startActivity(it);
            finish();
        }else{
            Toast.makeText(this,"usuario e senha invalido!",Toast.LENGTH_LONG).show();
        }
    }
}
