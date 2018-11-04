package apps.farid.football.matchfootbalapps.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import apps.farid.football.matchfootbalapps.R;
import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailMatchActivity extends AppCompatActivity {

    @BindView(R.id.iv_homee)
    ImageView ivHomee;
    @BindView(R.id.iv_awayy)
    ImageView ivAwayy;
    @BindView(R.id.tv_name_homee)
    TextView tvNameHomee;
    @BindView(R.id.tv_name_awayy)
    TextView tvNameAwayy;
    @BindView(R.id.tv_score_home)
    TextView tvScoreHome;
    @BindView(R.id.tv_score_away)
    TextView tvScoreAway;
    @BindView(R.id.description)
    TextView description;

    String nameHome = "", nameAway = "", descriptionMatch = "", scoreHome = "", scoreAway = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_match);
        ButterKnife.bind(this);

        nameHome = getIntent().getStringExtra("namehome");
        nameAway = getIntent().getStringExtra("nameaway");
        scoreHome = getIntent().getStringExtra("scorehome");
        scoreAway = getIntent().getStringExtra("scoreaway");
        descriptionMatch = getIntent().getStringExtra("description");

        Toast.makeText(DetailMatchActivity.this, nameAway + nameHome + scoreHome + scoreAway + descriptionMatch, Toast.LENGTH_LONG).show();
        tvNameHomee.setText("fggjfgjnfvg");
     /*   tvNameAwayy.setText(nameAway);
        tvScoreHome.setText(scoreHome);
        tvScoreAway.setText(scoreAway);
        description.setText(descriptionMatch);
        ivHomee.setImageResource(getIntent().getIntExtra("imagehome", 0));
        ivAwayy.setImageResource(getIntent().getIntExtra("imageaway", 0));*/

    }

}
