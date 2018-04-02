package vad.zuev.imagedownloader.activities;


import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.so.example.R;

public abstract class AbsActivity extends AppCompatActivity{

    public static final String KEY_URL = "url";
    public static final String KEY_NAME = "name";
    /**
     * ResId of the error drawable
     */
    protected final int ERROR_RES = R.drawable.error_orange;
    protected final int PLACEHOLDER_RED = R.drawable.placeholder_grey;
    /**
     * URL of the image - passed via an Intent
     */
    protected String imageUrl = "";
    /**
     * The name to use when saving an image to disk - passed via an Intent
     */
    protected String fileName = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  for the sake of simplicity, this project does not cover handling configuration changes
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
        // get data that was passed via an Intent
        imageUrl = getIntent().getStringExtra(KEY_URL);
        fileName = getIntent().getStringExtra(KEY_NAME);
    }
}