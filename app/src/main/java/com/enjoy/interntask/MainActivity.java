package com.enjoy.interntask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    MeowBottomNavigation meow;
    private static final int ID_HOME = 1;
    private static final int ID_DASHBOARD = 2;
    private static final int ID_ACCOUNT = 3;
    private FirebaseFirestore db;
    ArrayList<String> ImageLink = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        meow = (MeowBottomNavigation)findViewById(R.id.bottom_navigation);
        meow.add(new MeowBottomNavigation.Model(1,R.drawable.ic_baseline_home_24));
        meow.add(new MeowBottomNavigation.Model(2,R.drawable.ic_baseline_dashboard_24));
        meow.add(new MeowBottomNavigation.Model(3,R.drawable.ic_baseline_account_circle_24));
       // getSupportFragmentManager().beginTransaction().replace(R.id.fragment_cont,new HomeFragment()).commit();
        meow.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                Toast.makeText(getApplicationContext(),"Clicked item:"+item.getId(),Toast.LENGTH_SHORT).show();
            }
        });
        meow.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                Fragment select_fragment=null;
                switch (item.getId()) {
                    case ID_HOME:
                        select_fragment = new HomeFragment();
                        break;
                    case ID_DASHBOARD:
                        select_fragment = new DashboardFragment();
                        break;
                    case ID_ACCOUNT:
                        select_fragment = new AccountFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_cont,select_fragment).commit();
            }
        });
       /* db.collection("products").get()
                .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                    @Override
                    public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                        if(!queryDocumentSnapshots.isEmpty()){
                            List<DocumentSnapshot> list = queryDocumentSnapshots.getDocuments();
                            for (DocumentSnapshot d :list){
                                String p = d.toString();
                                ImageLink.add(p);
                            }
                        }
                    }
                });*/
    }
}
