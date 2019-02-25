package br.com.starwars.starwars.view;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

import br.com.starwars.starwars.R;
import br.com.starwars.starwars.model.Genero;
import br.com.starwars.starwars.model.Personagem;

public class PersonagemListActivity extends ListActivity {

    List<Personagem> personagens;
    PersonagemListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personagem_list);

        criarPersonagens();

        adapter = new PersonagemListAdapter(this,R.layout.activity_personagem_list_item,personagens);

        setListAdapter(adapter);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Personagem personagem = personagens.get(position);

        Intent it = new Intent(this,PersonagemActivity.class);
        it.putExtra("PERSONAGEM",personagem);
        startActivity(it);
    }

    public void criarPersonagens(){
        int[] finn = {R.drawable.item_finn,R.drawable.perfil_finn};
        int[] yoda = {R.drawable.item_yoda,R.drawable.perfil_yoda};
        int[] chewbacca = {R.drawable.item_chewbacca,R.drawable.perfil_chewbacca};
        int[] r2d2 = {R.drawable.item_r2d2,R.drawable.perfil_r2d2};
        int[] leia = {R.drawable.item_leia,R.drawable.perfil_leia};
        int[] luke = {R.drawable.item_skywalker,R.drawable.perfil_skywalker};

        personagens = Arrays.asList(
                new Personagem(finn,"FINN",
                        "FN-2187 was trained since birth to serve the First Order as a stormtrooper",
                        "Star Wars: Episode VII The Force Awakens, Star Wars: Episode VIII The Last Jedi",
                        "The Resistance, The First Order",
                        "Jakku,  Crait, Canto Bight",
                        Genero.MASCULINO,
                        "Height: 1.78m",
                        "Lightsaber, Blaster Rifle",
                        "Resistance ski speeder, Resistance Transport Pod"
                ),
                new Personagem(yoda,"YODA",
                        "Yoda was a legendary Jedi Master and stronger than most in his connection with the Force.",
                        "Star Wars: Episode II Attack of the Clones, Star Wars: Episode III Revenge of the Sith, Star Wars: Episode V The Empire Strikes Back, Star Wars: Episode I The Phantom Menace, Star Wars: Episode VI Return of the Jedi, Star Wars Rebels, Star Wars: The Clone Wars",
                        "Jedi Order",
                        "Yoda's Hut",
                        Genero.MASCULINO,
                        "Height: 0.66m",
                        "Lightsaber, Yoda's Lightsaber",
                        "Yoda's Fighter"
                ),
                new Personagem(chewbacca,"CHEWBACCA",
                        "During his long life Chewbacca has been many things: Wookiee warrior, ace smuggler and rebel hero.",
                        "Star Wars: Episode III Revenge of the Sith, Star Wars: Episode IV A New Hope, Star Wars: Episode VI Return of the Jedi, Star Wars: Episode VII The Force Awakens, Star Wars: Episode V The Empire Strikes Back, Star Wars: Episode VIII The Last Jedi, Solo: A Star Wars Story, Star Wars: The Clone Wars",
                        "Rebel Alliance",
                        "Kashyyyk, Numidian Prime",
                        Genero.MASCULINO,
                        "Height: 2.28m",
                        "Millennium Falcon, The Eravana",
                        "Bowcaster"
                ),
                new Personagem(r2d2,"R2-D2",
                        "A resourceful astromech droid, R2-D2 served Padmé Amidala, Anakin Skywalker and Luke Skywalker in turn, showing great bravery in rescuing his masters and their friends from many perils. ",
                        "Star Wars: Episode II Attack of the Clones, Star Wars: Episode III Revenge of the Sith, Star Wars: Episode V The Empire Strikes Back, Star Wars: Episode I The Phantom Menace, Star Wars: Episode IV A New Hope, Star Wars: Episode VI Return of the Jedi, Star Wars: Episode VII The Force Awakens, Rogue One: A Star Wars Story, Star Wars: Episode VIII The Last Jedi, Star Wars Rebels,  Star Wars: The Clone Wars",
                        "Rebel Alliance, Galactic Republic",
                        "Naboo, Havoc Outpost",
                        Genero.MASCULINO,
                        "Height: 1.09m",
                        "X-wing Starfighter, Jedi Starfighter",
                        "Restraining Bolt"
                ),
                new Personagem(leia,"LEIA ORGANA",
                        "Princess Leia Organa was one of the Rebel Alliance’s greatest leaders, fearless on the battlefield and dedicated to ending the tyranny of the Empire. ",
                        "Star Wars: Episode III Revenge of the Sith, Star Wars: Episode V The Empire Strikes Back, Star Wars: Episode IV A New Hope, Star Wars: Episode VI Return of the Jedi, Star Wars: Episode VII The Force Awakens, Rogue One: A Star Wars Story, Star Wars: Episode VIII The Last Jedi, Star Wars Rebels",
                        "Rebel Alliance, The Resistance, Galactic Senate, Alderaan Royal Family",
                        "Alderaan, Polis Massa, Crait",
                        Genero.FEMININO,
                        "Height: 1.5m",
                        "Tantive IV, The Raddus",
                        "Blaster Pistol"
                ),
                new Personagem(luke,"LUKE SKYWALKER",
                        "Luke Skywalker was a Tatooine farmboy who rose from humble beginnings to become one of the greatest Jedi the galaxy has ever known.",
                        "Star Wars: Episode III Revenge of the Sith, Star Wars: Episode V The Empire Strikes Back, Star Wars: Episode IV A New Hope, Star Wars: Episode VI Return of the Jedi, Star Wars: Episode VII The Force Awakens, Star Wars: Episode VIII The Last Jedi, Star Wars Rebels",
                        "Jedi Order, Rebel Alliance",
                        "Polis Massa, Lars Moisture Farm, Tatooine",
                        Genero.MASCULINO,
                        "Height: 1.72m",
                        "Blaster Pistol, Lightsaber, Luke Skywalker's Lightsaber (Green Blade), Anakin, Luke, and Rey's Lightsaber",
                        "T-16 Skyhopper, X-34 Landspeeder, X-wing Starfighter, Snowspeeder"
                )
        );
    }
}
