package id.co.androidkejar.mysunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.weather_day_title)
    TextView weatherDayTitle;

    @BindView(R.id.weather_temperature)
    TextView weatherTemperature;

    @BindView(R.id.weather_desc)
    TextView weatherDesc;

    @BindView(R.id.img_weather)
    ImageView imgWeather;

    @BindView(R.id.weather_lists)
    RecyclerView weatherLists;

    private WeatherAdapter weatherAdapter;
    /**
     * this for define and initialize
     */
    private void init() {
        ButterKnife.bind(this);
        weatherDayTitle.setText("Hari Minggu");
        weatherTemperature.setText("30 Derajat");
        weatherDesc.setText("Hari ini Terang Benderang");
        imgWeather.setImageResource(R.mipmap.weather);
        weatherLists.setLayoutManager(new LinearLayoutManager(
                this, LinearLayoutManager.VERTICAL, false
        ));
        weatherAdapter = new WeatherAdapter();
        weatherLists.setAdapter(weatherAdapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
}
