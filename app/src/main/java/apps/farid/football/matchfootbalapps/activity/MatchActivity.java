package apps.farid.football.matchfootbalapps.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import apps.farid.football.matchfootbalapps.R;
import apps.farid.football.matchfootbalapps.adapter.MatchAdapter;
import apps.farid.football.matchfootbalapps.model.MatchModel;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MatchActivity extends AppCompatActivity {

    @BindView(R.id.rv_pertandingan)
    RecyclerView mRecyclerView;
    MatchAdapter mAdapter;
    ArrayList<MatchModel> listMatch = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);
        ButterKnife.bind(this);

        listMatch.add(new MatchModel("Persib","Persija","3","2","Pertandingan ini Dilaksanakan di stadion Bandung lautan API",R.drawable.persib,R.drawable.persija));
        listMatch.add(new MatchModel("Persib","Persija","3","2","Pertandingan ini Dilaksanakan di stadion Bandung lautan API",R.drawable.persib,R.drawable.persija));
        listMatch.add(new MatchModel("Persib","Persija","3","2","Pertandingan ini Dilaksanakan di stadion Bandung lautan API",R.drawable.persib,R.drawable.persija));
        listMatch.add(new MatchModel("Persib","Persija","3","2","Pertandingan ini Dilaksanakan di stadion Bandung lautan API",R.drawable.persib,R.drawable.persija));

        mRecyclerView = findViewById(R.id.rv_pertandingan);
        mAdapter = new MatchAdapter(MatchActivity.this, listMatch);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
