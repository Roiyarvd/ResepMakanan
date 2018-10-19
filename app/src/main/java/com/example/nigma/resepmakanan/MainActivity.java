package com.example.nigma.resepmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;

    private LinkedList<ModelMasakan> listResep = new LinkedList<>();
    private int mCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Panggil fungsi untuk mendapat data resep makanan
        listResep = kumpulanResep();

        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new WordListAdapter(this, listResep);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    // fungsi untuk mendata resep makanan secara statis
    private LinkedList<ModelMasakan> kumpulanResep(){
        LinkedList<ModelMasakan> listMasakan = new LinkedList<>();
        String[] bahan;
        String[] tahap;

        bahan = new String[]{
                "Air",
                "Mie Rebus"
        };
        tahap = new String[]{
                "Siapkan alat dan bahan.",
                "Panaskan Air Hingga Mendidih.",
                "Masukan Bumbu-Bumbu yang ada dalam kemasan mie rebus.",
                "jika air sudah mendidih masukan mie.",
                "Rebus Hingga Mendidih .",
                "Tuang Ke dalam mangkuk yang sudah ada bumbu lalu aduk dan siap disajikan."
        };
        listMasakan.addLast(new ModelMasakan("Mie Rebus","Mie Rebus","enak, segar dan mudah dibuat",bahan,tahap));

        bahan = new String[]{
                "2 sdm sirup",
                "air secukupnya",
                "es batu secukupnya",
      
        };
        tahap = new String[]{
                "Masukan Sirup kedalam gelas.",
                "Tuang Air lalu aduk hingga merata.",
                "Masukan es batu secukupnya."
        };
        listMasakan.addLast(new ModelMasakan("Es Sirup","teh","Es Sirup manis dan segarnya menggoda.",bahan,tahap));

        bahan = new String[]{
                "Air",
                "secukupnya jamur kuping",
                "2 buah wortel potong kecil",
                "Garam",
                "Gula pasir",
                "penyedap rasa",
                "1 siung bawang putih digeprek",
                "1 lembar daun bawang diiris tipis",
                "Merica"

        };
        tahap = new String[]{
                "Panaskan Air dan masukan bawang putih yang sudah di geprek tunggu hingga mendidih.",
                "Jika sudah mendidih masukan sayur.gula.garam.penyedap rasa.merica lalu aduk tunggu hingga matang."
                
        listMasakan.addLast(new ModelMasakan("Sop Jamur","sop","Sop Jamur, mudah dibuat, Menyehatkan",bahan,tahap));


        bahan = new String[]{
                "1 buah jagung di sisirin",
                "1 butir Telur",
                "Daun bawang yg udh di potong",
                "2 sdm tepung terigu",
                "1 sdm tepung beras",
                "4 siung bawang putih",
                "1 sdt garam",
                "1/2 sdt masako",
                "1/2 sdt lada",
                "Minyak"

        };
        tahap = new String[]{
                "Sediakan baskom, masukan jagung yang udah di sisirin dan daun bawangnya.",
                "Masukan bumbu ulek (bawang putih dan lada) ke dalam baskom. Aduk-aduk sampai merata.",
                "Masukan tepung terigu dan tepung beras. Lalu masukan telur. Kemudian aduk-aduk sampai merata.",
                "Masukan garam, lada, masako ke dalam baskom tsb. Lalu aduk-aduk sampai merata.",
                "Panaskan minyak. Lalu saat minyaknya mulai panas, masukan adonan bakwan jagung ke dalam wajan",
                "Balikin bakwannya biar merata matangnya. Jika bakwan sudah berwarna kecoklatan. Matikan kompor dan tiriskan bakwannya",
                "Lalu sajikan ke dalam piring dan siap di makan"
        };
        listMasakan.addLast(new ModelMasakan("Bakwan Jagung","bakwan","Bakwan jagung hangat, mudah dibuat",bahan,tahap));
        return listMasakan;
    }
}
