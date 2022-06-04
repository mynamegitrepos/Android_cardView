package com.example.cardview.activit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardview.Model.Postagem;
import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   private RecyclerView recyclerPostagem;
   private List<Postagem> postagens = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);
        //define layout
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        //RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerPostagem.setLayoutManager( layoutManager );
        //define adapter
        prepararPostagem();
        PostagemAdapter postagemAdapter = new PostagemAdapter( postagens );
       recyclerPostagem.setAdapter( postagemAdapter );
    }
    public void prepararPostagem(){
    Postagem p = new Postagem("Jamilton", "aviao", R.drawable.imagem1);
    this.postagens.add( p );

        p = new Postagem("Jamilton", "aviao", R.drawable.imagem2);
        this.postagens.add( p );

         p = new Postagem("Jamilton", "aviao", R.drawable.imagem3);
        this.postagens.add( p );

        p = new Postagem("Jamilton", "aviao", R.drawable.imagem4);
        this.postagens.add( p );
    }
}