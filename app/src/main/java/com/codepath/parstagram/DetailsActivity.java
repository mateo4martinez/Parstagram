package com.codepath.parstagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.parse.ParseFile;

import org.parceler.Parcels;

import jp.wasabeef.glide.transformations.RoundedCornersTransformation;

public class DetailsActivity extends AppCompatActivity {

    public static final int RADIUS = 30;
    public static final int MARGIN = 0;

    private TextView tvUsername;
    private ImageView ivImage;
    private TextView tvDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        tvUsername = findViewById(R.id.tvUsername);
        ivImage = findViewById(R.id.ivImage);
        tvDescription = findViewById(R.id.tvDescription);

        tvUsername.setText(getIntent().getStringExtra("username"));
        tvDescription.setText(getIntent().getStringExtra("description"));
        String imageUrl = getIntent().getStringExtra("imageUrl");
        Glide.with(this).load(imageUrl).transform(new RoundedCornersTransformation(RADIUS, MARGIN)).into(ivImage);
    }
}