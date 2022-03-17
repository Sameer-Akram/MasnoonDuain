package com.example.myapplicationdua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Scrool1 extends AppCompatActivity {
    TextView txt1;
    TextView txt2;
    TextView txt3;
    TextView txt4;
    TextView txt5;
    TextView txt6;
    TextView txt7;
    TextView txt8;
    TextView txt9;
    TextView txt10;
    TextView txt11;
    TextView txt12;
    TextView txt13;
    TextView txt14;
    TextView txt15;
    TextView txt16;
    TextView txt17;
    TextView txt18;
    TextView txt19;
    TextView txt20;
    TextView txt21;
    TextView txt22;
    TextView txt23;
    TextView txt24;
    TextView txt25;
    TextView txt26;
    TextView txt27;
    TextView txt28;
    TextView txt29;
    TextView txt30;
    TextView txt31;
    TextView txt32;
    TextView txt33;
    TextView txt34;
    TextView txt35;
    TextView txt36;
    TextView txt37;
    TextView txt38;
    TextView txt39;
    TextView txt40;
    TextView txt41;
    TextView txt42;
    TextView txt43;
    TextView txt44;
    TextView txt45;
    TextView morning;

    int index=0;
    String[] dua1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrool1);
        morning=(TextView)findViewById(R.id.morningduas);
        txt1=(TextView)findViewById(R.id.txt01);
        txt2=(TextView)findViewById(R.id.txt02);
        txt3=(TextView)findViewById(R.id.txt03);
        txt4=(TextView)findViewById(R.id.txt04);
        txt5=(TextView)findViewById(R.id.txt05);
        txt6=(TextView)findViewById(R.id.txt06);
        txt7=(TextView)findViewById(R.id.txt07);
        txt8=(TextView)findViewById(R.id.txt08);
        txt9=(TextView)findViewById(R.id.txt09);
        txt10=(TextView)findViewById(R.id.txt10);
        txt11=(TextView)findViewById(R.id.txt11);
        txt12=(TextView)findViewById(R.id.txt12);
        txt13=(TextView)findViewById(R.id.txt13);
        txt14=(TextView)findViewById(R.id.txt14);
        txt15=(TextView)findViewById(R.id.txt15);
        txt16=(TextView)findViewById(R.id.txt16);
        txt17=(TextView)findViewById(R.id.txt17);
        txt18=(TextView)findViewById(R.id.txt18);
        txt19=(TextView)findViewById(R.id.txt19);
        txt20=(TextView)findViewById(R.id.txt20);
        txt21=(TextView)findViewById(R.id.txt21);
        txt22=(TextView)findViewById(R.id.txt22);
        txt23=(TextView)findViewById(R.id.txt23);
        txt24=(TextView)findViewById(R.id.txt24);
        txt25=(TextView)findViewById(R.id.txt25);
        txt26=(TextView)findViewById(R.id.txt26);
        txt27=(TextView)findViewById(R.id.txt27);
        txt28=(TextView)findViewById(R.id.txt28);
        txt29=(TextView)findViewById(R.id.txt29);
        txt30=(TextView)findViewById(R.id.txt30);
        txt31=(TextView)findViewById(R.id.txt31);
        txt32=(TextView)findViewById(R.id.txt32);
        txt33=(TextView)findViewById(R.id.txt33);
        txt34=(TextView)findViewById(R.id.txt34);
        txt35=(TextView)findViewById(R.id.txt35);
        txt36=(TextView)findViewById(R.id.txt36);
        txt37=(TextView)findViewById(R.id.txt37);
        txt38=(TextView)findViewById(R.id.txt38);
        txt39=(TextView)findViewById(R.id.txt39);
        txt40=(TextView)findViewById(R.id.txt40);
        txt41=(TextView)findViewById(R.id.txt41);
        txt42=(TextView)findViewById(R.id.txt42);
        txt43=(TextView)findViewById(R.id.txt43);
        txt44=(TextView)findViewById(R.id.txt44);
        txt45=(TextView)findViewById(R.id.txt45);

        dua1=getResources().getStringArray(R.array.MasnonDua);
        txt1.setText("أسْتَغْفِرُ اللهَ العَظِيمَ الَّذِي....");
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(dua1[index=0]);
            }
        });
        txt2.setText("اللَّهُمَّ أَنْتَ رَبِّي، لَا.... ");
        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("أسْتَغْفِرُ اللهَ العَظِيمَ الَّذِي....");
                txt2.setText(dua1[index=1]);
            }
        });
        txt3.setText("اللَّهُ لَا إِلَهَ إِلَّا هُو....");
        txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt2.setText("اللَّهُمَّ أَنْتَ رَبِّي، لَا....");
                txt3.setText(dua1[index=2]);
            }
        });
        txt4.setText("اللَّهُمَّ أَنْتَ رَبِّي لا....");
        txt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt3.setText("اللَّهُ لَا إِلَهَ إِلَّا هُو....");
                txt4.setText(dua1[index=3]);
            }
        });
        txt5.setText("بسم اللہ الرحمن الرحیم....");
        txt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt4.setText("اللَّهُمَّ أَنْتَ رَبِّي لا....");
                txt5.setText(dua1[index=4]);
            }
        });
        txt6.setText("رَضيـتُ بِاللهِ رَبَّـاً وَبِالإسْلامِ....");
        txt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt5.setText("بسم اللہ الرحمن الرحیم....");
                txt6.setText(dua1[index=5]);
            }
        });
        txt7.setText("اللہم اجرنی من النار....");
        txt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt6.setText("رَضيـتُ بِاللهِ رَبَّـاً وَبِالإسْلامِ....");
                txt7.setText(dua1[index=6]);
            }
        });
         txt8.setText("اللّهُـمَّ إِنِّـي أسْـأَلُـكَ العَـفْو....");
        txt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt7.setText("اللہم اجرنی من النار....");
                txt8.setText(dua1[index=7]);
            }
        });
        txt9.setText("يَاحَيُّ يَا قيُّومُ بِرَحْمَتِكَ.... ");
        txt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt8.setText("اللّهُـمَّ إِنِّـي أسْـأَلُـكَ العَـفْو....");
                txt9.setText(dua1[index=8]);
            }
        });
        txt10.setText("سبحان اللہ العظیم و....");
        txt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt9.setText("يَاحَيُّ يَا قيُّومُ بِرَحْمَتِكَ.... ");
                txt10.setText(dua1[index=9]);
            }
        });
        txt11.setText("اللّهُـمَّ ما أَصْبَـَحَ بي....");
        txt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt10.setText("سبحان اللہ العظیم و....");
                txt11.setText(dua1[index=10]);
            }
        });
        txt12.setText("اللّهُـمَّ إِنِّـي أَصْبَـحْتُ أُشْـهِدُك....");
        txt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt11.setText("اللّهُـمَّ ما أَصْبَـَحَ بي....");
                txt12.setText(dua1[index=11]);
            }
        });
        txt13.setText("َصْـبَحْنا وَأَصْـبَحَ المُـلْكُ لله.... ");
        txt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt12.setText("اللّهُـمَّ إِنِّـي أَصْبَـحْتُ أُشْـهِدُك....");
                txt13.setText(dua1[index=12]);
            }
        });
         txt14.setText("اللّهُـمَّ بِكَ أَصْـبَحْنا وَبِكَ.... ");
        txt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt13.setText("َصْـبَحْنا وَأَصْـبَحَ المُـلْكُ لله.... ");
                txt14.setText(dua1[index=13]);
            }
        });
       txt15.setText("أَصْبَـحْـنا وَأَصْبَـحْ المُـلكُ لله....");
        txt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt14.setText("اللّهُـمَّ بِكَ أَصْـبَحْنا وَبِكَ....");
                txt15.setText(dua1[index=14]);
            }
        });
        txt16.setText("َصْبَـحْـنا عَلَى فِطْرَةِ الإسْلاَم....");
        txt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt15.setText("أَصْبَـحْـنا وَأَصْبَـحْ المُـلكُ لله....");
                txt16.setText(dua1[index=15]);
            }
        });
        txt17.setText("اللّهُـمَّ عافِـني في بَدَنـي....");
        txt17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt16.setText("َصْبَـحْـنا عَلَى فِطْرَةِ الإسْلاَم....");
                txt17.setText(dua1[index=16]);
            }
        });
        txt18.setText("اللّهُـمَّ عالِـمَ الغَـيْبِ وَالشّـهادَة....");
        txt18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt17.setText("اللّهُـمَّ عافِـني في بَدَنـي....");
                txt18.setText(dua1[index=17]);
            }
        });
        txt19.setText("اللَّهُمَّ إنِّي أصبَحْتُ منكَ....");
        txt19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt18.setText("اللّهُـمَّ عالِـمَ الغَـيْبِ وَالشّـهادَة....");
                txt19.setText(dua1[index=18]);
            }
        });
        txt20.setText("اللهمَّ اجعَلْ أوَّلَ هذ....");
        txt20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt19.setText("اللَّهُمَّ إنِّي أصبَحْتُ منكَ....");
                txt20.setText(dua1[index=19]);
            }
        });
        txt21.setText("الحمدُ للهِ الَّذي تواضع.... ");
        txt21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt20.setText("اللهمَّ اجعَلْ أوَّلَ هذ....");
                txt21.setText(dua1[index=20]);
            }
        });
        txt22.setText("أخرجه الطبراني في....");
        txt22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt21.setText("الحمدُ للهِ الَّذي تواضع.... ");
                txt22.setText(dua1[index=21]);
            }
        });
        txt23.setText("سُبْحـانَ اللهِ وَبِحَمْـدِهِ عَدَد....");
        txt23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt22.setText("أخرجه الطبراني في....");
                txt23.setText(dua1[index=22]);
            }
        });
        txt24.setText("بِسـمِ اللهِ الذي لا يَضُـر....");
        txt24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt23.setText("سُبْحـانَ اللهِ وَبِحَمْـدِهِ عَدَد....");
                txt24.setText(dua1[index=23]);
            }
        });
        txt25.setText("حَسبيَ اللهُ لا إلهَ....");
        txt25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt24.setText("بِسـمِ اللهِ الذي لا يَضُـر....");
                txt25.setText(dua1[index=24]);
            }
        });
        txt26.setText("بسم اللہ علی نفسی....");
        txt26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt25.setText("حَسبيَ اللهُ لا إلهَ....");
                txt26.setText(dua1[index=25]);
            }
        });
        txt27.setText("َعـوذُ بِكَلِمـاتِ اللّهِ التّـامّـاتِ....");
        txt27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt26.setText("بسم اللہ علی نفسی....");
                txt27.setText(dua1[index=26]);
            }
        });
        txt28.setText("أعوذُ بكلماتِ اللهِ التامَّات،....");
        txt28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt27.setText("َعـوذُ بِكَلِمـاتِ اللّهِ التّـامّـاتِ....");
                txt28.setText(dua1[index=27]);
            }
        });
        txt29.setText("َعُوذُ بكَلِماتِ اللَّهِ التّامَّة....");
        txt29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt28.setText("أعوذُ بكلماتِ اللهِ التامَّات،....");
                txt29.setText(dua1[index=28]);
            }
        });
        txt30.setText("فَسُبۡحٰنَ اللّٰهِ حِيۡنَ تُمۡسُوۡنَ....");
        txt30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt29.setText("َعُوذُ بكَلِماتِ اللَّهِ التّامَّة....");
                txt30.setText(dua1[index=29]);
            }
        });
        txt31.setText("أعُوذُبِاللهِ السَّمِيع العَلِيمِ....");
        txt31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt30.setText("فَسُبۡحٰنَ اللّٰهِ حِيۡنَ تُمۡسُوۡنَ....");
                txt31.setText(dua1[index=30]);
            }
        });
        txt32.setText("هُوَ اللَّهُ الَّذِي لَا إِلَهَ....");
        txt32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt31.setText("أعُوذُبِاللهِ السَّمِيع العَلِيمِ....");
                txt32.setText(dua1[index=31]);
            }
        });
        txt33.setText("اللہم صل و سلم");
        txt33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt32.setText("هُوَ اللَّهُ الَّذِي لَا إِلَه....َ");
                txt33.setText(dua1[index=32]);
            }
        });
        txt34.setText("لَا إلَه إلّا اللهُ وَحْدَهُ....");
        txt34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt33.setText("اللہم صل و سلم....");
                txt34.setText(dua1[index=33]);
            }
        });
        txt35.setText("اللَّهُمَّ إِنِّي أَسْأَلُكَ عِلْمًا....");
        txt35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt34.setText("لَا إلَه إلّا اللهُ وَحْدَهُ....");
                txt35.setText(dua1[index=34]);
            }
        });
       txt36.setText("مَا شَآءَ اللّٰهُ لَا حَوْل....َ");
        txt36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt35.setText("اللَّهُمَّ إِنِّي أَسْأَلُكَ عِلْمًا....");
                txt36.setText(dua1[index=35]);
            }
        });
       txt37.setText("الحمد للہ ربی اللہ....");
        txt37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt36.setText("مَا شَآءَ اللّٰهُ لَا حَوْلَ....");
                txt37.setText(dua1[index=36]);
            }
        });
        txt38.setText("َعُوذُ بِوَجْهِ اللَّهِ الْكَرِيمِ....");
        txt38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt37.setText("الحمد للہ ربی اللہ....");
                txt38.setText(dua1[index=37]);
            }
        });
        txt39.setText("أَعُوذُ بِوَجْهِ اللَّهِ الْعَظِيمِ،");
        txt39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt38.setText("َعُوذُ بِوَجْهِ اللَّهِ الْكَرِيمِ....");
                txt39.setText(dua1[index=38]);
            }
        });
        txt40.setText("اللَّهُمَّ إِنَّا نَعُوذُ بِكَ مِنْ....");
        txt40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt39.setText("أَعُوذُ بِوَجْهِ اللَّهِ الْعَظِيمِ،....");
                txt40.setText(dua1[index=39]);
            }
        });
        txt41.setText("اللَّهمَّ لَكَ الحمدُ لا إلَهَ....");
        txt41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt40.setText("اللَّهُمَّ إِنَّا نَعُوذُ بِكَ مِنْ....");
                txt41.setText(dua1[index=40]);
            }
        });
        txt42.setText("اللَّهُمَّ إِنِّي أَعُوذُ بِكَ....");
        txt42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt41.setText("اللَّهمَّ لَكَ الحمدُ لا إلَهَ....");
                txt42.setText(dua1[index=41]);
            }
        });
        txt43.setText("اللَّهُمَّ إِنِّي أَعُوذُ بِكَ....");
        txt43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt42.setText("اللَّهُمَّ إِنِّي أَعُوذُ بِكَ....");
                txt43.setText(dua1[index=42]);
            }
        });
        txt44.setText("يَا رَبِّ لَكَ الْحَمْدُ....");
        txt44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt43.setText("اللَّهُمَّ إِنِّي أَعُوذُ بِكَ....");
                txt44.setText(dua1[index=43]);
            }
        });
       txt45.setText("اَصْبَحْنَا وَاَصْبَحَ الْمُلْكُ لِلّٰهِ....");
        txt45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt44.setText("يَا رَبِّ لَكَ الْحَمْد....ُ");
                txt45.setText(dua1[index=44]);
            }
        });

    }
}