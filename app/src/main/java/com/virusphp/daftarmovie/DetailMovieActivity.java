package com.virusphp.daftarmovie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMovieActivity extends AppCompatActivity {
    public static final String EXTRA_MOVIE = "extra_movie";
    public static final int EXTRA_IMAGE = 1;

    ImageView imDetail;
    TextView txtNama, txtDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);

        imDetail = findViewById(R.id.iv_foto_movie);
        txtNama = findViewById(R.id.tv_nama_movie);
        txtDetail = findViewById(R.id.tv_detail_movie);

    }
}
