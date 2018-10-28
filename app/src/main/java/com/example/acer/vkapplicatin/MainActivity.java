package com.example.acer.vkapplicatin;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends Activity {

    private ArrayList<String> ArrayNameUser = new ArrayList<>();

    int[] imgsArray = new int[]{R.drawable.avatar, R.drawable.avatar2, R.drawable.avatar3, R.drawable.avatar4, R.drawable.avatar5};

    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayNameUser.add("Аня");
        ArrayNameUser.add("Тетя Таня");
        ArrayNameUser.add("Богдан");
        ArrayNameUser.add("Кирилл");
        ArrayNameUser.add("Женя");

        LinearLayout linLayout = (LinearLayout) findViewById(R.id.linLayout);
        LayoutInflater ltInflater = getLayoutInflater();

        for (int i = 0; i < ArrayNameUser.size(); i++) {
            Log.d("myLogs", "i = " + i);
            View item = ltInflater.inflate(R.layout.item, linLayout, false);

            TextView textViewNameUser = (TextView) item.findViewById(R.id.textViewNameUser);
            textViewNameUser.setText(ArrayNameUser.get(i));

            ImageView imageViewAvatar = (ImageView) item.findViewById(R.id.imageViewAvatar);
            int imgsId = imgsArray[i];
            imageViewAvatar.setImageResource(imgsId);

            item.getLayoutParams().width = LayoutParams.MATCH_PARENT;
            linLayout.addView(item);
        }
    }
}
