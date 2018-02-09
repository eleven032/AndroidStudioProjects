package kingarthur.japanesealphabet;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;



public class EnPage extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.en_page_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                this.finish();
                return true;


            case android.R.id.en_page_additional:

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_en_page);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }



        final MediaPlayer a = MediaPlayer.create(this,R.raw.sound_a);
        final MediaPlayer i = MediaPlayer.create(this,R.raw.sound_i);
        final MediaPlayer u = MediaPlayer.create(this,R.raw.sound_u);
        final MediaPlayer e = MediaPlayer.create(this,R.raw.sound_e);
        final MediaPlayer o = MediaPlayer.create(this,R.raw.sound_o);

        final MediaPlayer ka = MediaPlayer.create(this,R.raw.sound_ka);
        final MediaPlayer ki = MediaPlayer.create(this,R.raw.sound_ki);
        final MediaPlayer ku = MediaPlayer.create(this,R.raw.sound_ku);
        final MediaPlayer ke = MediaPlayer.create(this,R.raw.sound_ke);
        final MediaPlayer ko = MediaPlayer.create(this,R.raw.sound_ko);

        final MediaPlayer sa = MediaPlayer.create(this,R.raw.sound_sa);
        final MediaPlayer shi = MediaPlayer.create(this,R.raw.sound_shi);
        final MediaPlayer su = MediaPlayer.create(this,R.raw.sound_su);
        final MediaPlayer se = MediaPlayer.create(this,R.raw.sound_se);
        final MediaPlayer so = MediaPlayer.create(this,R.raw.sound_so);

        final MediaPlayer ta = MediaPlayer.create(this,R.raw.sound_ta);
        final MediaPlayer chi = MediaPlayer.create(this,R.raw.sound_chi);
        final MediaPlayer tsu = MediaPlayer.create(this,R.raw.sound_tsu);
        final MediaPlayer te = MediaPlayer.create(this,R.raw.sound_te);
        final MediaPlayer to = MediaPlayer.create(this,R.raw.sound_to);

        final MediaPlayer na = MediaPlayer.create(this,R.raw.sound_na);
        final MediaPlayer ni = MediaPlayer.create(this,R.raw.sound_ni);
        final MediaPlayer nu = MediaPlayer.create(this,R.raw.sound_nu);
        final MediaPlayer ne = MediaPlayer.create(this,R.raw.sound_ne);
        final MediaPlayer no = MediaPlayer.create(this,R.raw.sound_no);

        final MediaPlayer ha = MediaPlayer.create(this,R.raw.sound_ha);
        final MediaPlayer hi = MediaPlayer.create(this,R.raw.sound_hi);
        final MediaPlayer fu = MediaPlayer.create(this,R.raw.sound_fu);
        final MediaPlayer he = MediaPlayer.create(this,R.raw.sound_he);
        final MediaPlayer ho = MediaPlayer.create(this,R.raw.sound_ho);

        final MediaPlayer ma = MediaPlayer.create(this,R.raw.sound_ma);
        final MediaPlayer mi = MediaPlayer.create(this,R.raw.sound_mi);
        final MediaPlayer mu = MediaPlayer.create(this,R.raw.sound_mu);
        final MediaPlayer me = MediaPlayer.create(this,R.raw.sound_me);
        final MediaPlayer mo = MediaPlayer.create(this,R.raw.sound_mo);

        final MediaPlayer ya = MediaPlayer.create(this,R.raw.sound_ya);
        final MediaPlayer yi = MediaPlayer.create(this,R.raw.sound_i);
        final MediaPlayer yu = MediaPlayer.create(this,R.raw.sound_yu);
        final MediaPlayer ye = MediaPlayer.create(this,R.raw.sound_e);
        final MediaPlayer yo = MediaPlayer.create(this,R.raw.sound_yo);

        final MediaPlayer ra = MediaPlayer.create(this,R.raw.sound_ra);
        final MediaPlayer ri = MediaPlayer.create(this,R.raw.sound_ri);
        final MediaPlayer ru = MediaPlayer.create(this,R.raw.sound_ru);
        final MediaPlayer re = MediaPlayer.create(this,R.raw.sound_re);
        final MediaPlayer ro = MediaPlayer.create(this,R.raw.sound_ro);

        final MediaPlayer wa = MediaPlayer.create(this,R.raw.sound_wa);
        final MediaPlayer wi = MediaPlayer.create(this,R.raw.sound_i);
        final MediaPlayer wu = MediaPlayer.create(this,R.raw.sound_u);
        final MediaPlayer we = MediaPlayer.create(this,R.raw.sound_e);
        final MediaPlayer wo = MediaPlayer.create(this,R.raw.sound_o);

        final MediaPlayer n = MediaPlayer.create(this,R.raw.sound_n);

        Button play_a = (Button) findViewById(R.id.a);
        Button play_i = (Button) findViewById(R.id.i);
        Button play_u = (Button) findViewById(R.id.u);
        Button play_e = (Button) findViewById(R.id.e);
        Button play_o = (Button) findViewById(R.id.o);

        Button play_ka = (Button) findViewById(R.id.ka);
        Button play_ki = (Button) findViewById(R.id.ki);
        Button play_ku = (Button) findViewById(R.id.ku);
        Button play_ke = (Button) findViewById(R.id.ke);
        Button play_ko = (Button) findViewById(R.id.ko);

        Button play_sa = (Button) findViewById(R.id.sa);
        Button play_shi = (Button) findViewById(R.id.shi);
        Button play_su = (Button) findViewById(R.id.su);
        Button play_se = (Button) findViewById(R.id.se);
        Button play_so = (Button) findViewById(R.id.so);

        Button play_ta = (Button) findViewById(R.id.ta);
        Button play_chi = (Button) findViewById(R.id.chi);
        Button play_tsu = (Button) findViewById(R.id.tsu);
        Button play_te = (Button) findViewById(R.id.te);
        Button play_to = (Button) findViewById(R.id.to);

        Button play_na = (Button) findViewById(R.id.na);
        Button play_ni = (Button) findViewById(R.id.ni);
        Button play_nu = (Button) findViewById(R.id.nu);
        Button play_ne = (Button) findViewById(R.id.ne);
        Button play_no = (Button) findViewById(R.id.no);

        Button play_ha = (Button) findViewById(R.id.ha);
        Button play_hi = (Button) findViewById(R.id.hi);
        Button play_fu = (Button) findViewById(R.id.fu);
        Button play_he = (Button) findViewById(R.id.he);
        Button play_ho = (Button) findViewById(R.id.ho);

        Button play_ma = (Button) findViewById(R.id.ma);
        Button play_mi = (Button) findViewById(R.id.mi);
        Button play_mu = (Button) findViewById(R.id.mu);
        Button play_me = (Button) findViewById(R.id.me);
        Button play_mo = (Button) findViewById(R.id.mo);

        Button play_ya = (Button) findViewById(R.id.ya);
        Button play_yi = (Button) findViewById(R.id.ii);
        Button play_yu = (Button) findViewById(R.id.yu);
        Button play_ye = (Button) findViewById(R.id.ee);
        Button play_yo = (Button) findViewById(R.id.yo);

        Button play_ra = (Button) findViewById(R.id.ra);
        Button play_ri = (Button) findViewById(R.id.ri);
        Button play_ru = (Button) findViewById(R.id.ru);
        Button play_re = (Button) findViewById(R.id.re);
        Button play_ro = (Button) findViewById(R.id.ro);

        Button play_wa = (Button) findViewById(R.id.wa);
        Button play_wi = (Button) findViewById(R.id.iii);
        Button play_wu = (Button) findViewById(R.id.uuu);
        Button play_we = (Button) findViewById(R.id.eee);
        Button play_wo = (Button) findViewById(R.id.ooo);

        Button play_n = (Button) findViewById(R.id.n);

        play_a.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                a.start();

            }
        });
        play_i.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                i.start();
            }
        });
        play_u.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                u.start();
            }
        });
        play_e.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                e.start();
            }
        });
        play_o.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                o.start();
            }
        });
        play_ka.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ka.start();
            }
        });
        play_ki.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ki.start();
            }
        });
        play_ku.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ku.start();
            }
        });
        play_ke.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ke.start();
            }
        });
        play_ko.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ko.start();
            }
        });
        play_sa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                sa.start();
            }
        });
        play_shi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                shi.start();
            }
        });
        play_su.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                su.start();
            }
        });
        play_se.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                se.start();
            }
        });
        play_so.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                so.start();
            }
        });
        play_ta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ta.start();
            }
        });
        play_chi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                chi.start();
            }
        });
        play_tsu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tsu.start();
            }
        });
        play_te.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                te.start();
            }
        });
        play_to.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                to.start();
            }
        });
        play_na.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                na.start();
            }
        });
        play_ni.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ni.start();
            }
        });
        play_nu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                nu.start();
            }
        });
        play_ne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ne.start();
            }
        });
        play_no.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                no.start();
            }
        });
        play_ha.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ha.start();
            }
        });
        play_hi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                hi.start();
            }
        });
        play_fu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                fu.start();
            }
        });
        play_he.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                he.start();
            }
        });
        play_ho.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ho.start();
            }
        });
        play_ma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ma.start();
            }
        });
        play_mi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mi.start();
            }
        });
        play_mu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mu.start();
            }
        });
        play_me.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                me.start();
            }
        });
        play_mo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mo.start();
            }
        });
        play_ya.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ya.start();
            }
        });
        play_yi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                yi.start();
            }
        });
        play_yu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                yu.start();
            }
        });
        play_ye.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ye.start();
            }
        });
        play_yo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                yo.start();
            }
        });
        play_ra.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ra.start();
            }
        });
        play_ri.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ri.start();
            }
        });
        play_ru.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ru.start();
            }
        });
        play_re.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                re.start();
            }
        });
        play_ro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ro.start();
            }
        });
        play_wa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                wa.start();
            }
        });
        play_wi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                wi.start();
            }
        });
        play_wu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                wu.start();
            }
        });
        play_we.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                we.start();
            }
        });
        play_wo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                wo.start();
            }
        });
        play_n.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                n.start();
            }
        });


    }




}
