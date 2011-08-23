package com.henteko.teres.android.Masked_Rider_OOO;

import java.io.IOException;
import java.text.DecimalFormat;

import android.app.Activity;
import android.hardware.SensorListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

@SuppressWarnings("deprecation")
public class mainActivity extends Activity implements SensorListener{
	
	
	private int sentakumedaru[] = new int[3];
	private int scaningflag[] = new int[3];
	int flag = 0;
	
	private int sentaku;
	
	private MediaPlayer scan;
	private MediaPlayer taiki;
	private MediaPlayer kidou;
	
	private MediaPlayer Medaru[] = new MediaPlayer[18];
	
	private MediaPlayer hensin;
	
	private MediaPlayer scaningk;
    
    
	SensorManager sensorManager;
    static DecimalFormat format;
    static {
        format = new DecimalFormat();
        format.applyLocalizedPattern("#0.000");
    }
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        sentakumedaru[0] = 99;
    	sentakumedaru[1] = 99;
    	sentakumedaru[2] = 99;
    	
    	sentaku = 0;
    	
        
        
        kidou = MediaPlayer.create(this, R.raw.kidou);
        scan = MediaPlayer.create(this, R.raw.scan);
        
        taiki = MediaPlayer.create(this, R.raw.taiki);
        taiki.setLooping(true);
        
        
        Medaru[0] = MediaPlayer.create(this, R.raw.taka);
        Medaru[1] = MediaPlayer.create(this, R.raw.kujaku);
        Medaru[2] = MediaPlayer.create(this, R.raw.kondoru);
        Medaru[3] = MediaPlayer.create(this, R.raw.lion);
        Medaru[4] = MediaPlayer.create(this, R.raw.tora);
        Medaru[5] = MediaPlayer.create(this, R.raw.tita);
        Medaru[6] = MediaPlayer.create(this, R.raw.kuwagata);
        Medaru[7] = MediaPlayer.create(this, R.raw.kamakiri);
        Medaru[8] = MediaPlayer.create(this, R.raw.bata);
        Medaru[9] = MediaPlayer.create(this, R.raw.sai);
        Medaru[10] = MediaPlayer.create(this, R.raw.gorira);
        Medaru[11] = MediaPlayer.create(this, R.raw.zou);
        Medaru[12] = MediaPlayer.create(this, R.raw.sixyati);
        Medaru[13] = MediaPlayer.create(this, R.raw.unagi);
        Medaru[14] = MediaPlayer.create(this, R.raw.tako);
        Medaru[15] = MediaPlayer.create(this, R.raw.putera);
        Medaru[16] = MediaPlayer.create(this, R.raw.torikera);
        Medaru[17] = MediaPlayer.create(this, R.raw.tirano);
        
        
        
        
        scaningk = MediaPlayer.create(this,R.raw.scaning);
        
        
        
        kidou.start();
        while(kidou.isPlaying()){}
        kidou.release();
        
        
        ImageButton takabutton = (ImageButton) findViewById(R.id.taka);
        takabutton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View view) {
    	    	if(taiki.isPlaying()) {
    	    		taiki.pause();
    	    	}
    	    	Medaru[0].seekTo(0);
    	    	Medaru[0].start();
    	    	
    	    	if(sentaku < 3) {
    	    		sentakumedaru[sentaku] = 0;
    	    		sentaku++;
    	    	}else {
    	    		sentakumedaru[0] = sentakumedaru[1];
    	    		sentakumedaru[1] = sentakumedaru[2];
    	    		sentakumedaru[2] = 0;
    	    	}
        	}
        });
        
        
        ImageButton kujakubutton = (ImageButton) findViewById(R.id.kujaku);
        kujakubutton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View view) { 
    	    	if(taiki.isPlaying()) {
    	    		taiki.pause();
    	    	}
    	    	Medaru[1].seekTo(0);
    	    	Medaru[1].start();
    	    	
    	    	if(sentaku < 3) {
    	    		sentakumedaru[sentaku] = 1;
    	    		sentaku++;
    	    	}else {
    	    		sentakumedaru[0] = sentakumedaru[1];
    	    		sentakumedaru[1] = sentakumedaru[2];
    	    		sentakumedaru[2] = 1;
    	    	}
        	}
        });
        
        
        ImageButton kondorubutton = (ImageButton) findViewById(R.id.kondoru);
        kondorubutton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View view) { 
    	    	if(taiki.isPlaying()) {
    	    		taiki.pause();
    	    	}
    	    	Medaru[2].seekTo(0);
    	    	Medaru[2].start();
    	    	
    	    	if(sentaku < 3) {
    	    		sentakumedaru[sentaku] = 2;
    	    		sentaku++;
    	    	}else {
    	    		sentakumedaru[0] = sentakumedaru[1];
    	    		sentakumedaru[1] = sentakumedaru[2];
    	    		sentakumedaru[2] = 2;
    	    	}
        	}
        });
        
        
        ImageButton lionbutton = (ImageButton) findViewById(R.id.lion);
        lionbutton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View view) { 
    	    	if(taiki.isPlaying()) {
    	    		taiki.pause();
    	    	}
    	    	Medaru[3].seekTo(0);
    	    	Medaru[3].start();
    	    	
    	    	if(sentaku < 3) {
    	    		sentakumedaru[sentaku] = 3;
    	    		sentaku++;
    	    	}else {
    	    		sentakumedaru[0] = sentakumedaru[1];
    	    		sentakumedaru[1] = sentakumedaru[2];
    	    		sentakumedaru[2] = 3;
    	    	}
        	}
        });
        
        
        ImageButton torabutton = (ImageButton) findViewById(R.id.tora);
        torabutton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View view) { 
    	    	if(taiki.isPlaying()) {
    	    		taiki.pause();
    	    	}
    	    	Medaru[4].seekTo(0);
    	    	Medaru[4].start();
    	    	
    	    	if(sentaku < 3) {
    	    		sentakumedaru[sentaku] = 4;
    	    		sentaku++;
    	    	}else {
    	    		sentakumedaru[0] = sentakumedaru[1];
    	    		sentakumedaru[1] = sentakumedaru[2];
    	    		sentakumedaru[2] = 4;
    	    	}
        	}
        });
        
        
        ImageButton titabutton = (ImageButton) findViewById(R.id.tita);
        titabutton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View view) { 
    	    	if(taiki.isPlaying()) {
    	    		taiki.pause();
    	    	}
    	    	Medaru[5].seekTo(0);
    	    	Medaru[5].start();
    	    	
    	    	if(sentaku < 3) {
    	    		sentakumedaru[sentaku] = 5;
    	    		sentaku++;
    	    	}else {
    	    		sentakumedaru[0] = sentakumedaru[1];
    	    		sentakumedaru[1] = sentakumedaru[2];
    	    		sentakumedaru[2] = 5;
    	    	}
        	}
        });
        
        ImageButton kuwagatabutton = (ImageButton) findViewById(R.id.kuwagata);
        kuwagatabutton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View view) { 
    	    	if(taiki.isPlaying()) {
    	    		taiki.pause();
    	    	}
    	    	Medaru[6].seekTo(0);
    	    	Medaru[6].start();
    	    	
    	    	if(sentaku < 3) {
    	    		sentakumedaru[sentaku] = 6;
    	    		sentaku++;
    	    	}else {
    	    		sentakumedaru[0] = sentakumedaru[1];
    	    		sentakumedaru[1] = sentakumedaru[2];
    	    		sentakumedaru[2] = 6;
    	    	}
        	}
        });
        
        ImageButton kamakiributton = (ImageButton) findViewById(R.id.kamakiri);
        kamakiributton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View view) { 
    	    	if(taiki.isPlaying()) {
    	    		taiki.pause();
    	    	}
    	    	Medaru[7].seekTo(0);
    	    	Medaru[7].start();
    	    	
    	    	if(sentaku < 3) {
    	    		sentakumedaru[sentaku] = 7;
    	    		sentaku++;
    	    	}else {
    	    		sentakumedaru[0] = sentakumedaru[1];
    	    		sentakumedaru[1] = sentakumedaru[2];
    	    		sentakumedaru[2] = 7;
    	    	}
        	}
        });
        
        ImageButton batabutton = (ImageButton) findViewById(R.id.bata);
        batabutton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View view) { 
    	    	if(taiki.isPlaying()) {
    	    		taiki.pause();
    	    	}
    	    	Medaru[8].seekTo(0);
    	    	Medaru[8].start();
    	    	
    	    	if(sentaku < 3) {
    	    		sentakumedaru[sentaku] = 8;
    	    		sentaku++;
    	    	}else {
    	    		sentakumedaru[0] = sentakumedaru[1];
    	    		sentakumedaru[1] = sentakumedaru[2];
    	    		sentakumedaru[2] = 8;
    	    	}
        	}
        });
        
        ImageButton saibutton = (ImageButton) findViewById(R.id.sai);
        saibutton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View view) { 
    	    	if(taiki.isPlaying()) {
    	    		taiki.pause();
    	    	}
    	    	Medaru[9].seekTo(0);
    	    	Medaru[9].start();
    	    	
    	    	if(sentaku < 3) {
    	    		sentakumedaru[sentaku] = 9;
    	    		sentaku++;
    	    	}else {
    	    		sentakumedaru[0] = sentakumedaru[1];
    	    		sentakumedaru[1] = sentakumedaru[2];
    	    		sentakumedaru[2] = 9;
    	    	}
        	}
        });
        
        ImageButton gorirabutton = (ImageButton) findViewById(R.id.gorira);
        gorirabutton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View view) { 
    	    	if(taiki.isPlaying()) {
    	    		taiki.pause();
    	    	}
    	    	Medaru[10].seekTo(0);
    	    	Medaru[10].start();
    	    	
    	    	if(sentaku < 3) {
    	    		sentakumedaru[sentaku] = 10;
    	    		sentaku++;
    	    	}else {
    	    		sentakumedaru[0] = sentakumedaru[1];
    	    		sentakumedaru[1] = sentakumedaru[2];
    	    		sentakumedaru[2] = 10;
    	    	}
        	}
        });
        
        ImageButton zoubutton = (ImageButton) findViewById(R.id.zou);
        zoubutton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View view) { 
    	    	if(taiki.isPlaying()) {
    	    		taiki.pause();
    	    	}
    	    	Medaru[11].seekTo(0);
    	    	Medaru[11].start();
    	    	
    	    	if(sentaku < 3) {
    	    		sentakumedaru[sentaku] = 11;
    	    		sentaku++;
    	    	}else {
    	    		sentakumedaru[0] = sentakumedaru[1];
    	    		sentakumedaru[1] = sentakumedaru[2];
    	    		sentakumedaru[2] = 11;
    	    	}
        	}
        });
        
        
        ImageButton sixyatibutton = (ImageButton) findViewById(R.id.sixyati);
        sixyatibutton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View view) { 
    	    	if(taiki.isPlaying()) {
    	    		taiki.pause();
    	    	}
    	    	Medaru[12].seekTo(0);
    	    	Medaru[12].start();
    	    	
    	    	if(sentaku < 3) {
    	    		sentakumedaru[sentaku] = 12;
    	    		sentaku++;
    	    	}else {
    	    		sentakumedaru[0] = sentakumedaru[1];
    	    		sentakumedaru[1] = sentakumedaru[2];
    	    		sentakumedaru[2] = 12;
    	    	}
        	}
        });
        
        ImageButton unagibutton = (ImageButton) findViewById(R.id.unagi);
        unagibutton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View view) { 
    	    	if(taiki.isPlaying()) {
    	    		taiki.pause();
    	    	}
    	    	Medaru[13].seekTo(0);
    	    	Medaru[13].start();
    	    	
    	    	if(sentaku < 3) {
    	    		sentakumedaru[sentaku] = 13;
    	    		sentaku++;
    	    	}else {
    	    		sentakumedaru[0] = sentakumedaru[1];
    	    		sentakumedaru[1] = sentakumedaru[2];
    	    		sentakumedaru[2] = 13;
    	    	}
        	}
        });
        
        ImageButton takobutton = (ImageButton) findViewById(R.id.tako);
        takobutton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View view) { 
    	    	if(taiki.isPlaying()) {
    	    		taiki.pause();
    	    	}
    	    	Medaru[14].seekTo(0);
    	    	Medaru[14].start();
    	    	
    	    	if(sentaku < 3) {
    	    		sentakumedaru[sentaku] = 14;
    	    		sentaku++;
    	    	}else {
    	    		sentakumedaru[0] = sentakumedaru[1];
    	    		sentakumedaru[1] = sentakumedaru[2];
    	    		sentakumedaru[2] = 14;
    	    	}
        	}
        });
        
        
        ImageButton puterabutton = (ImageButton) findViewById(R.id.putera);
        puterabutton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View view) { 
    	    	if(taiki.isPlaying()) {
    	    		taiki.pause();
    	    	}
    	    	Medaru[15].seekTo(0);
    	    	Medaru[15].start();
    	    	
    	    	if(sentaku < 3) {
    	    		sentakumedaru[sentaku] = 15;
    	    		sentaku++;
    	    	}else {
    	    		sentakumedaru[0] = sentakumedaru[1];
    	    		sentakumedaru[1] = sentakumedaru[2];
    	    		sentakumedaru[2] = 15;
    	    	}
        	}
        });
        
        
        ImageButton torikerabutton = (ImageButton) findViewById(R.id.torikera);
        torikerabutton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View view) { 
    	    	if(taiki.isPlaying()) {
    	    		taiki.pause();
    	    	}
    	    	Medaru[16].seekTo(0);
    	    	Medaru[16].start();
    	    	
    	    	if(sentaku < 3) {
    	    		sentakumedaru[sentaku] = 16;
    	    		sentaku++;
    	    	}else {
    	    		sentakumedaru[0] = sentakumedaru[1];
    	    		sentakumedaru[1] = sentakumedaru[2];
    	    		sentakumedaru[2] = 16;
    	    	}
        	}
        });
        
        
        ImageButton tiranobutton = (ImageButton) findViewById(R.id.tirano);
        tiranobutton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View view) { 
    	    	if(taiki.isPlaying()) {
    	    		taiki.pause();
    	    	}
    	    	Medaru[17].seekTo(0);
    	    	Medaru[17].start();
    	    	
    	    	if(sentaku < 3) {
    	    		sentakumedaru[sentaku] = 17;
    	    		sentaku++;
    	    	}else {
    	    		sentakumedaru[0] = sentakumedaru[1];
    	    		sentakumedaru[1] = sentakumedaru[2];
    	    		sentakumedaru[2] = 17;
    	    	}
        	}
        });
        
        
        ImageButton taikibutton = (ImageButton) findViewById(R.id.taiki);
        taikibutton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View view) { 
    	    	taiki.seekTo(0);
    	    	taiki.start();
        	}
        });
        
        
        
        
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
    }
    
    @Override
    protected void onStop() {
        sensorManager.unregisterListener(this);
        super.onStop();
    }
    
    @Override
    protected void onPause() {
    	super.onPause();
    	
    	if(taiki.isPlaying()) {
    		taiki.stop();
    		try {
				taiki.prepare();
			} catch (IllegalStateException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    	}
    	
    	for(int i = 0;i<12;i++) {
    		if(Medaru[i].isPlaying()){
    			Medaru[i].stop();
    			try {
					Medaru[i].prepare();
				} catch (IllegalStateException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    		}
    	}
    	
    	if(hensin.isPlaying()) {
    		hensin.stop();
    		try {
				hensin.prepare();
			} catch (IllegalStateException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    	}else if(scaningk.isPlaying()) {
    		scaningk.stop();
    		try {
				scaningk.prepare();
			} catch (IllegalStateException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    	}
    	
    }
    
    @Override
    protected void onRestart() {
    	super.onRestart();
    }
    
    
    @Override
    protected void onResume() {
        super.onResume();
        
        sensorManager.registerListener(this, 
                SensorManager.SENSOR_ACCELEROMETER | 
                SensorManager.SENSOR_ORIENTATION,
                SensorManager.SENSOR_DELAY_FASTEST);
    }
    
    private float[] currentOrientationValues = {0.0f, 0.0f, 0.0f};
    private float[] currentAccelerationValues = {0.0f, 0.0f, 0.0f};
    public void onSensorChanged(int sensor, float[] values) {
        switch(sensor) {
        case SensorManager.SENSOR_ACCELEROMETER:
            // 傾き（ハイカット）
            currentOrientationValues[0] = values[0] * 0.1f + currentOrientationValues[0] * (1.0f - 0.1f);
            currentOrientationValues[1] = values[1] * 0.1f + currentOrientationValues[1] * (1.0f - 0.1f);
            currentOrientationValues[2] = values[2] * 0.1f + currentOrientationValues[2] * (1.0f - 0.1f);
            // 加速度（ローカット）
            currentAccelerationValues[0] = values[0] - currentOrientationValues[0];
            currentAccelerationValues[1] = values[1] - currentOrientationValues[1];
            currentAccelerationValues[2] = values[2] - currentOrientationValues[2];
            // 振ってる？　絶対値（あるいは２乗の平方根）の合計がいくつ以上か？
            // 実装例
            float targetValue = 
                Math.abs(currentAccelerationValues[0]) + 
                Math.abs(currentAccelerationValues[1]) +
                Math.abs(currentAccelerationValues[2]);
            if(targetValue > 30.0f) {
            	//振ってる時の処理
            	
            	if(taiki.isPlaying()) {
            		taiki.stop();
            		
            		//これを書かないと再定義しないと再生されなくなる
            		try {
						taiki.prepare();
					} catch (IllegalStateException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
            		
            		
            		scan.start();
            		while(scan.isPlaying()){}
            		
            		
            		
            		if(flag == 3) {
            			flag = 0;
            		}else if(sentakumedaru[0] == scaningflag[0]
            			&& sentakumedaru[1] == scaningflag[1]
            			&& sentakumedaru[2] == scaningflag[2]) {
            			flag = 1;
            		}
            		
            		/*
            		for(int i=0;i<3;i++) {
            			try {
            			Medaru[(sentakumedaru[i] - 1)].start();
            			while(Medaru[(sentakumedaru[i] - 1)].isPlaying()){}
            			}catch (Exception e) {
            			}
            		}
            		*/
            		
            		//スキャニングじゃないときだけ
            		if(flag == 0) {
            			try {
            				Medaru[sentakumedaru[0]].start();
            				while(Medaru[sentakumedaru[0]].isPlaying()){}
            			}catch (Exception e) {
            			}
            			try {
            				Medaru[sentakumedaru[1]].start();
            				while(Medaru[sentakumedaru[1]].isPlaying()){}
            			}catch (Exception e) {
            			}
            			try {
            				Medaru[sentakumedaru[2]].start();
            				while(Medaru[sentakumedaru[2]].isPlaying()){}
            			}catch (Exception e) {
            			}
            		}
            		
            		
            		if((sentakumedaru[0] == 0 && sentakumedaru[1] == 1 && sentakumedaru[2] == 2)
            				|| (sentakumedaru[0] == 0 && sentakumedaru[1] == 2 && sentakumedaru[2] == 1)
            				|| (sentakumedaru[0] == 1 && sentakumedaru[1] == 0 && sentakumedaru[2] == 2)
            				|| (sentakumedaru[0] == 1 && sentakumedaru[1] == 2 && sentakumedaru[2] == 0)
            				|| (sentakumedaru[0] == 2 && sentakumedaru[1] == 0 && sentakumedaru[2] == 1)
            				|| (sentakumedaru[0] == 2 && sentakumedaru[1] == 1 && sentakumedaru[2] == 0)) {
            			
            			if(flag == 1) {
            				try {
            					//scaningk.start();
        						hensin = MediaPlayer.create(this,R.raw.tajadoruscaning);
        						hensin.start();
            					flag = 3;
            				}catch (Exception e) {
            					
            				}
            				
            				}else {
            					try {
            						hensin = MediaPlayer.create(this,R.raw.tajadoru);
            						hensin.start();
            					}catch (Exception e) {
            					
            					}
            			}
            			
            		}else if((sentakumedaru[0] == 4 && sentakumedaru[1] == 5 && sentakumedaru[2] == 3)
            				|| (sentakumedaru[0] == 4 && sentakumedaru[1] == 3 && sentakumedaru[2] == 5)
            				|| (sentakumedaru[0] == 3 && sentakumedaru[1] == 4 && sentakumedaru[2] == 5)
            				|| (sentakumedaru[0] == 3 && sentakumedaru[1] == 5 && sentakumedaru[2] == 4)
            				|| (sentakumedaru[0] == 5 && sentakumedaru[1] == 4 && sentakumedaru[2] == 3)
            				|| (sentakumedaru[0] == 5 && sentakumedaru[1] == 3 && sentakumedaru[2] == 4)) {
            			if(flag == 1) {
            				try {
            					//scaningk.start();
        						hensin = MediaPlayer.create(this,R.raw.ratoratascaning);
        						hensin.start();
            					flag = 3;
            				}catch (Exception e) {
            					
            				}
            				
            			}else {
            				try {
        						hensin = MediaPlayer.create(this,R.raw.ratorata);
        						hensin.start();
            				}catch (Exception e) {
            					
            				}
            			}
            		}else if((sentakumedaru[0] == 7 && sentakumedaru[1] == 8 && sentakumedaru[2] == 6)
            				|| (sentakumedaru[0] == 7 && sentakumedaru[1] == 6 && sentakumedaru[2] == 8)
            				|| (sentakumedaru[0] == 6 && sentakumedaru[1] == 7 && sentakumedaru[2] == 8)
            				|| (sentakumedaru[0] == 6 && sentakumedaru[1] == 8 && sentakumedaru[2] == 7)
            				|| (sentakumedaru[0] == 8 && sentakumedaru[1] == 7 && sentakumedaru[2] == 6)
            				|| (sentakumedaru[0] == 8 && sentakumedaru[1] == 6 && sentakumedaru[2] == 7)) {
            			
            			if(flag == 1) {
            				try {
            					//scaningk.start();
        						hensin = MediaPlayer.create(this,R.raw.gatakiribascaning);
        						hensin.start();
            					flag = 3;
            				}catch (Exception e) {
            					
            				}
            				
            			}else {
            				try {
        						hensin = MediaPlayer.create(this,R.raw.gatakiriba);
        						hensin.start();
            				}catch (Exception e) {
            					
            				}
            			}
            		}else if((sentakumedaru[0] == 10 && sentakumedaru[1] == 11 && sentakumedaru[2] == 9)
            				|| (sentakumedaru[0] == 10 && sentakumedaru[1] == 9 && sentakumedaru[2] == 11)
            				|| (sentakumedaru[0] == 9 && sentakumedaru[1] == 10 && sentakumedaru[2] == 11)
            				|| (sentakumedaru[0] == 9 && sentakumedaru[1] == 11 && sentakumedaru[2] == 10)
            				|| (sentakumedaru[0] == 11 && sentakumedaru[1] == 10 && sentakumedaru[2] == 9)
            				|| (sentakumedaru[0] == 11 && sentakumedaru[1] == 9 && sentakumedaru[2] == 10)) {
            			
            			if(flag == 1) {
            				try {
            					//scaningk.start();
        						hensin = MediaPlayer.create(this,R.raw.sagozoscaning);
        						hensin.start();
             					flag = 3;
            				}catch (Exception e) {
            					
            				}
            				
            			}else {
            				try {
        						hensin = MediaPlayer.create(this,R.raw.sagozo);
        						hensin.start();
            				}catch (Exception e) {
            					
            				}
            			}
            		}else if((sentakumedaru[0] == 4 && sentakumedaru[1] == 8 && sentakumedaru[2] == 0)
            				|| (sentakumedaru[0] == 4 && sentakumedaru[1] == 0 && sentakumedaru[2] == 8)
            				|| (sentakumedaru[0] == 0 && sentakumedaru[1] == 4 && sentakumedaru[2] == 8)
            				|| (sentakumedaru[0] == 0 && sentakumedaru[1] == 8 && sentakumedaru[2] == 4)
            				|| (sentakumedaru[0] == 8 && sentakumedaru[1] == 4 && sentakumedaru[2] == 0)
            				|| (sentakumedaru[0] == 8 && sentakumedaru[1] == 0 && sentakumedaru[2] == 4)) {
            			
            			if(flag == 1) {
            				try {
            					//scaningk.start();
        						hensin = MediaPlayer.create(this,R.raw.tatobascaning);
        						hensin.start();
            					flag = 3;
            				}catch (Exception e) {
            					
            				}
            				
            			}else {
            				try {
        						hensin = MediaPlayer.create(this,R.raw.tatoba);
        						hensin.start();
            				}catch (Exception e) {
            					
            				}
            			}
            		}else if((sentakumedaru[0] == 12 && sentakumedaru[1] == 13 && sentakumedaru[2] == 14)
            				|| (sentakumedaru[0] == 12 && sentakumedaru[1] == 14 && sentakumedaru[2] == 13)
            				|| (sentakumedaru[0] == 13 && sentakumedaru[1] == 12 && sentakumedaru[2] == 14)
            				|| (sentakumedaru[0] == 13 && sentakumedaru[1] == 14 && sentakumedaru[2] == 12)
            				|| (sentakumedaru[0] == 14 && sentakumedaru[1] == 12 && sentakumedaru[2] == 13)
            				|| (sentakumedaru[0] == 14 && sentakumedaru[1] == 13 && sentakumedaru[2] == 12)) {
            			
            			if(flag == 1) {
            				try {
            					//scaningk.start();
        						hensin = MediaPlayer.create(this,R.raw.sixyautascaning);
        						hensin.start();
            					flag = 3;
            				}catch (Exception e) {
            					
            				}
            				
            			}else {
            				try {
        						hensin = MediaPlayer.create(this,R.raw.sixyauta);
        						hensin.start();
            				}catch (Exception e) {
            					
            				}
            			}
            		}else if((sentakumedaru[0] == 15 && sentakumedaru[1] == 16 && sentakumedaru[2] == 17)
            				|| (sentakumedaru[0] == 15 && sentakumedaru[1] == 17 && sentakumedaru[2] == 16)
            				|| (sentakumedaru[0] == 16 && sentakumedaru[1] == 15 && sentakumedaru[2] == 17)
            				|| (sentakumedaru[0] == 16 && sentakumedaru[1] == 17 && sentakumedaru[2] == 15)
            				|| (sentakumedaru[0] == 17 && sentakumedaru[1] == 15 && sentakumedaru[2] == 16)
            				|| (sentakumedaru[0] == 17 && sentakumedaru[1] == 16 && sentakumedaru[2] == 15)) {
            			
            			if(flag == 1) {
            				try {
            					//scaningk.start();
        						hensin = MediaPlayer.create(this,R.raw.putotirascaning);
        						hensin.start();
            					flag = 3;
            				}catch (Exception e) {
            					
            				}
            				
            			}else {
            				try {
        						hensin = MediaPlayer.create(this,R.raw.putotira);
        						hensin.start();
            				}catch (Exception e) {
            					
            				}
            			}
            		}else if(flag == 1) {
            				try {
            					scaningk.start();
            					flag = 3;
            				}catch (Exception e) {
            					
            				}
            				
            			}else {
            				try {
        						hensin = MediaPlayer.create(this,R.raw.publichensin);
        						hensin.start();
            				}catch (Exception e) {
            					
            				}
            			}
                    
                    
                    
                    for(int i=0;i<3;i++) {
            			scaningflag[i] = sentakumedaru[i];
            		}
            		
            		
            	}
            	
            	
            }
            else if(targetValue < 10.0f) {
            	//振ってない時の処理
            	
            	
            }
            // かたむきは？３つの絶対値（あるいは２乗の平方根）のうちどれがいちばんでかいか？
            // 実装例
            if(Math.abs(currentOrientationValues[0]) > 7.0f) {
                //横を向いている時の処理
            } else if(Math.abs(currentOrientationValues[1]) > 7.0f) {
                //縦を向いている時の処理
            } else if(Math.abs(currentOrientationValues[2]) > 7.0f) {
                //水平を向いている時の処理
            } else {
                //その他の時
            }
            
            if(targetValue > 30.0f && Math.abs(currentOrientationValues[0]) > 1.5f && 
            		Math.abs(currentOrientationValues[1]) > 7.0f && Math.abs(currentOrientationValues[2]) > 1.0f) {
            	
            	
            	
            	
            }
            break;
        case SensorManager.SENSOR_ORIENTATION:
        	//傾きだけの時？
            break;
        default:
        }
    }
    
    public void onAccuracyChanged(int sensor, int accuracy) {
        //これを実装していないと、エラーがはかれる
    }
    
    
    
    
    
}