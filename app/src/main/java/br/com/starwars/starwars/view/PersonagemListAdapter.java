package br.com.starwars.starwars.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.starwars.starwars.R;
import br.com.starwars.starwars.model.Personagem;

public class PersonagemListAdapter extends ArrayAdapter<Personagem> {

    Context context;
    int resource;
    List<Personagem> personagens;

    public PersonagemListAdapter(@NonNull Context context, int resource, @NonNull List<Personagem> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.personagens = objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(resource,null) ;

        ImageView imgItem = itemView.findViewById(R.id.personagem_list_item_imgItem);
        TextView tvNome = itemView.findViewById(R.id.personagem_list_item_tvNome);

        Personagem personagem = personagens.get(position);
        imgItem.setImageDrawable( ContextCompat.getDrawable(context, personagem.getImagem()[0]));
        tvNome.setText(personagem.getNome());

        return itemView;
    }
}
