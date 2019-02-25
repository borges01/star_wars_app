package br.com.starwars.starwars.view;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import br.com.starwars.starwars.R;
import br.com.starwars.starwars.model.Personagem;

public class PersonagemActivity extends AppCompatActivity {

    Personagem personagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personagem);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            personagem = (Personagem) bundle.getSerializable("PERSONAGEM");
        }

        ImageView imgPerfil = findViewById(R.id.personagem_imgPerfil);
        imgPerfil.setImageDrawable( ContextCompat.getDrawable(this, personagem.getImagem()[1]));

        setTitle(personagem.getNome());

        TextView tvDescricao = findViewById(R.id.content_personagem_tvDescricao);
        TextView tvAparicao = findViewById(R.id.content_personagem_tvAparicao);
        TextView tvFiliacao = findViewById(R.id.content_personagem_tvFiliacao);
        TextView tvLocalizacao = findViewById(R.id.content_personagem_tvLocalizacao);
        TextView tvGenero = findViewById(R.id.content_personagem_tvGenero);
        TextView tvAltura = findViewById(R.id.content_personagem_tvAltura);
        TextView tvArma = findViewById(R.id.content_personagem_tvArma);
        TextView tvVeiculo = findViewById(R.id.content_personagem_tvVeiculo);


        tvDescricao.setText(personagem.getAparicao());
        tvAparicao.setText(personagem.getAparicao());
        tvFiliacao.setText(personagem.getFiliacao());
        tvLocalizacao.setText(personagem.getLocalizacao());
        tvGenero.setText(personagem.getGenero().toString());
        tvAltura.setText(personagem.getAltura());
        tvArma.setText(personagem.getArma());
        tvVeiculo.setText(personagem.getVeiculo());

    }
}
