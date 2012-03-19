package com.henteko.teres.android.Masked_Rider_OOO;

import java.io.IOException;
import java.text.DecimalFormat;

import android.app.Activity;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.ImageButton;

public class OOO_set {
	private int sentakumedaru[] = new int[3];
	private int scaningflag[] = new int[3];
	int flag = 0;

	private int sentaku;

	private MediaPlayer scan;
	private MediaPlayer taiki;
	private MediaPlayer kidou;

	private MediaPlayer Medaru[] = new MediaPlayer[15];

	private MediaPlayer hensin;

	private MediaPlayer scaningk;

	SensorManager sensorManager;
	static DecimalFormat format;
	static {
		format = new DecimalFormat();
		format.applyLocalizedPattern("#0.000");
	}

	Activity context;

	public OOO_set(Activity context) {

		this.context = context;

		sentakumedaru[0] = 99;
		sentakumedaru[1] = 99;
		sentakumedaru[2] = 99;

		sentaku = 0;

		kidou = MediaPlayer.create(this.context, R.raw.kidou);
		scan = MediaPlayer.create(this.context, R.raw.scan);

		taiki = MediaPlayer.create(this.context, R.raw.taiki);
		taiki.setLooping(true);

		Medaru[0] = MediaPlayer.create(this.context, R.raw.taka);
		Medaru[1] = MediaPlayer.create(this.context, R.raw.kujaku);
		Medaru[2] = MediaPlayer.create(this.context, R.raw.kondoru);
		Medaru[3] = MediaPlayer.create(this.context, R.raw.lion);
		Medaru[4] = MediaPlayer.create(this.context, R.raw.tora);
		Medaru[5] = MediaPlayer.create(this.context, R.raw.tita);
		Medaru[6] = MediaPlayer.create(this.context, R.raw.kuwagata);
		Medaru[7] = MediaPlayer.create(this.context, R.raw.kamakiri);
		Medaru[8] = MediaPlayer.create(this.context, R.raw.bata);
		Medaru[9] = MediaPlayer.create(this.context, R.raw.sai);
		Medaru[10] = MediaPlayer.create(this.context, R.raw.gorira);
		Medaru[11] = MediaPlayer.create(this.context, R.raw.zou);
		Medaru[12] = MediaPlayer.create(this.context, R.raw.sixyati);
		Medaru[13] = MediaPlayer.create(this.context, R.raw.unagi);
		Medaru[14] = MediaPlayer.create(this.context, R.raw.tako);

		scaningk = MediaPlayer.create(this.context, R.raw.scaning);

		kidou.start();
		while (kidou.isPlaying()) {
		}
		kidou.release();

		ImageButton takabutton = (ImageButton) this.context
				.findViewById(R.id.taka);
		takabutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				if (Medaru[0].isPlaying()) {
					Medaru[0].pause();
				} else {
					if (Medaru[1].isPlaying()) {
						Medaru[1].pause();
					}
					if (Medaru[2].isPlaying()) {
						Medaru[2].pause();
					}
					if (Medaru[3].isPlaying()) {
						Medaru[3].pause();
					}
					if (Medaru[4].isPlaying()) {
						Medaru[4].pause();
					}
					if (Medaru[5].isPlaying()) {
						Medaru[5].pause();
					}
					if (Medaru[6].isPlaying()) {
						Medaru[6].pause();
					}
					if (Medaru[7].isPlaying()) {
						Medaru[7].pause();
					}
					if (Medaru[8].isPlaying()) {
						Medaru[8].pause();
					}
					if (Medaru[9].isPlaying()) {
						Medaru[9].pause();
					}
					if (Medaru[10].isPlaying()) {
						Medaru[10].pause();
					}
					if (Medaru[11].isPlaying()) {
						Medaru[11].pause();
					}
					if (Medaru[12].isPlaying()) {
						Medaru[12].pause();
					}
					if (Medaru[13].isPlaying()) {
						Medaru[13].pause();
					}
					if (Medaru[14].isPlaying()) {
						Medaru[14].pause();
					}
					if (taiki.isPlaying()) {
						taiki.pause();
					}
					Medaru[0].seekTo(0);
					Medaru[0].start();

					if (sentaku < 3) {
						sentakumedaru[sentaku] = 0;
						sentaku++;
					} else {
						sentakumedaru[0] = sentakumedaru[1];
						sentakumedaru[1] = sentakumedaru[2];
						sentakumedaru[2] = 0;
					}

				}
			}
		});

		ImageButton kujakubutton = (ImageButton) this.context
				.findViewById(R.id.kujaku);
		kujakubutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				if (taiki.isPlaying()) {
					taiki.pause();
				}
				Medaru[1].seekTo(0);
				Medaru[1].start();

				if (sentaku < 3) {
					sentakumedaru[sentaku] = 1;
					sentaku++;
				} else {
					sentakumedaru[0] = sentakumedaru[1];
					sentakumedaru[1] = sentakumedaru[2];
					sentakumedaru[2] = 1;
				}

			}
		});

		ImageButton kondorubutton = (ImageButton) this.context
				.findViewById(R.id.kondoru);
		kondorubutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				if (taiki.isPlaying()) {
					taiki.pause();
				}
				Medaru[2].seekTo(0);
				Medaru[2].start();

				if (sentaku < 3) {
					sentakumedaru[sentaku] = 2;
					sentaku++;
				} else {
					sentakumedaru[0] = sentakumedaru[1];
					sentakumedaru[1] = sentakumedaru[2];
					sentakumedaru[2] = 2;
				}

			}
		});

		ImageButton lionbutton = (ImageButton) this.context
				.findViewById(R.id.lion);
		lionbutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {

				if (taiki.isPlaying()) {
					taiki.pause();
				}
				Medaru[3].seekTo(0);
				Medaru[3].start();

				if (sentaku < 3) {
					sentakumedaru[sentaku] = 3;
					sentaku++;
				} else {
					sentakumedaru[0] = sentakumedaru[1];
					sentakumedaru[1] = sentakumedaru[2];
					sentakumedaru[2] = 3;
				}

			}
		});

		ImageButton torabutton = (ImageButton) this.context
				.findViewById(R.id.tora);
		torabutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {

				if (taiki.isPlaying()) {
					taiki.pause();
				}
				Medaru[4].seekTo(0);
				Medaru[4].start();

				if (sentaku < 3) {
					sentakumedaru[sentaku] = 4;
					sentaku++;
				} else {
					sentakumedaru[0] = sentakumedaru[1];
					sentakumedaru[1] = sentakumedaru[2];
					sentakumedaru[2] = 4;
				}

			}
		});

		ImageButton titabutton = (ImageButton) this.context
				.findViewById(R.id.tita);
		titabutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				if (taiki.isPlaying()) {
					taiki.pause();
				}
				Medaru[5].seekTo(0);
				Medaru[5].start();

				if (sentaku < 3) {
					sentakumedaru[sentaku] = 5;
					sentaku++;
				} else {
					sentakumedaru[0] = sentakumedaru[1];
					sentakumedaru[1] = sentakumedaru[2];
					sentakumedaru[2] = 5;
				}

			}
		});

		ImageButton kuwagatabutton = (ImageButton) this.context
				.findViewById(R.id.kuwagata);
		kuwagatabutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {

				if (taiki.isPlaying()) {
					taiki.pause();
				}
				Medaru[6].seekTo(0);
				Medaru[6].start();

				if (sentaku < 3) {
					sentakumedaru[sentaku] = 6;
					sentaku++;
				} else {
					sentakumedaru[0] = sentakumedaru[1];
					sentakumedaru[1] = sentakumedaru[2];
					sentakumedaru[2] = 6;
				}

			}
		});

		ImageButton kamakiributton = (ImageButton) this.context
				.findViewById(R.id.kamakiri);
		kamakiributton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {

				if (taiki.isPlaying()) {
					taiki.pause();
				}
				Medaru[7].seekTo(0);
				Medaru[7].start();

				if (sentaku < 3) {
					sentakumedaru[sentaku] = 7;
					sentaku++;
				} else {
					sentakumedaru[0] = sentakumedaru[1];
					sentakumedaru[1] = sentakumedaru[2];
					sentakumedaru[2] = 7;
				}

			}
		});

		ImageButton batabutton = (ImageButton) this.context
				.findViewById(R.id.bata);
		batabutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {

				if (taiki.isPlaying()) {
					taiki.pause();
				}
				Medaru[8].seekTo(0);
				Medaru[8].start();

				if (sentaku < 3) {
					sentakumedaru[sentaku] = 8;
					sentaku++;
				} else {
					sentakumedaru[0] = sentakumedaru[1];
					sentakumedaru[1] = sentakumedaru[2];
					sentakumedaru[2] = 8;
				}

			}
		});

		ImageButton saibutton = (ImageButton) this.context
				.findViewById(R.id.sai);
		saibutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {

				if (taiki.isPlaying()) {
					taiki.pause();
				}
				Medaru[9].seekTo(0);
				Medaru[9].start();

				if (sentaku < 3) {
					sentakumedaru[sentaku] = 9;
					sentaku++;
				} else {
					sentakumedaru[0] = sentakumedaru[1];
					sentakumedaru[1] = sentakumedaru[2];
					sentakumedaru[2] = 9;
				}

			}
		});

		ImageButton gorirabutton = (ImageButton) this.context
				.findViewById(R.id.gorira);
		gorirabutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {

				if (taiki.isPlaying()) {
					taiki.pause();
				}
				Medaru[10].seekTo(0);
				Medaru[10].start();

				if (sentaku < 3) {
					sentakumedaru[sentaku] = 10;
					sentaku++;
				} else {
					sentakumedaru[0] = sentakumedaru[1];
					sentakumedaru[1] = sentakumedaru[2];
					sentakumedaru[2] = 10;
				}

			}
		});

		ImageButton zoubutton = (ImageButton) this.context
				.findViewById(R.id.zou);
		zoubutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {

				if (taiki.isPlaying()) {
					taiki.pause();
				}
				Medaru[11].seekTo(0);
				Medaru[11].start();

				if (sentaku < 3) {
					sentakumedaru[sentaku] = 11;
					sentaku++;
				} else {
					sentakumedaru[0] = sentakumedaru[1];
					sentakumedaru[1] = sentakumedaru[2];
					sentakumedaru[2] = 11;
				}

			}
		});

		ImageButton sixyatibutton = (ImageButton) this.context
				.findViewById(R.id.sixyati);
		sixyatibutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {

				if (taiki.isPlaying()) {
					taiki.pause();
				}
				Medaru[12].seekTo(0);
				Medaru[12].start();

				if (sentaku < 3) {
					sentakumedaru[sentaku] = 12;
					sentaku++;
				} else {
					sentakumedaru[0] = sentakumedaru[1];
					sentakumedaru[1] = sentakumedaru[2];
					sentakumedaru[2] = 12;
				}

			}
		});

		ImageButton unagibutton = (ImageButton) this.context
				.findViewById(R.id.unagi);
		unagibutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {

				if (taiki.isPlaying()) {
					taiki.pause();
				}
				Medaru[13].seekTo(0);
				Medaru[13].start();

				if (sentaku < 3) {
					sentakumedaru[sentaku] = 13;
					sentaku++;
				} else {
					sentakumedaru[0] = sentakumedaru[1];
					sentakumedaru[1] = sentakumedaru[2];
					sentakumedaru[2] = 13;
				}

			}
		});

		ImageButton takobutton = (ImageButton) this.context
				.findViewById(R.id.tako);
		takobutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {

				if (taiki.isPlaying()) {
					taiki.pause();
				}
				Medaru[14].seekTo(0);
				Medaru[14].start();

				if (sentaku < 3) {
					sentakumedaru[sentaku] = 14;
					sentaku++;
				} else {
					sentakumedaru[0] = sentakumedaru[1];
					sentakumedaru[1] = sentakumedaru[2];
					sentakumedaru[2] = 14;
				}

			}
		});

		ImageButton taikibutton = (ImageButton) this.context
				.findViewById(R.id.taiki);
		taikibutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				taiki.seekTo(0);
				taiki.start();
			}
		});

	}

	public void Pause() {
		if (taiki.isPlaying()) {
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

		for (int i = 0; i < 12; i++) {
			if (Medaru[i].isPlaying()) {
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

		if (hensin.isPlaying()) {
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
		} else if (scaningk.isPlaying()) {
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

	public void on_henshin() {

		if (taiki.isPlaying()) {
			taiki.stop();

			// これを書かないと再定義しないと再生されなくなる
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
			while (scan.isPlaying()) {
			}

			if (flag == 3) {
				flag = 0;
			} else if (sentakumedaru[0] == scaningflag[0]
					&& sentakumedaru[1] == scaningflag[1]
					&& sentakumedaru[2] == scaningflag[2]) {
				flag = 1;
			}

			/*
			 * for(int i=0;i<3;i++) { try { Medaru[(sentakumedaru[i] -
			 * 1)].start(); while(Medaru[(sentakumedaru[i] - 1)].isPlaying()){}
			 * }catch (Exception e) { } }
			 */

			// スキャニングじゃないときだけ
			if (flag == 0) {
				try {
					Medaru[sentakumedaru[0]].start();
					while (Medaru[sentakumedaru[0]].isPlaying()) {
					}
				} catch (Exception e) {
				}
				try {
					Medaru[sentakumedaru[1]].start();
					while (Medaru[sentakumedaru[1]].isPlaying()) {
					}
				} catch (Exception e) {
				}
				try {
					Medaru[sentakumedaru[2]].start();
					while (Medaru[sentakumedaru[2]].isPlaying()) {
					}
				} catch (Exception e) {
				}
			}

			if ((sentakumedaru[0] == 0 && sentakumedaru[1] == 1 && sentakumedaru[2] == 2)
					|| (sentakumedaru[0] == 0 && sentakumedaru[1] == 2 && sentakumedaru[2] == 1)
					|| (sentakumedaru[0] == 1 && sentakumedaru[1] == 0 && sentakumedaru[2] == 2)
					|| (sentakumedaru[0] == 1 && sentakumedaru[1] == 2 && sentakumedaru[2] == 0)
					|| (sentakumedaru[0] == 2 && sentakumedaru[1] == 0 && sentakumedaru[2] == 1)
					|| (sentakumedaru[0] == 2 && sentakumedaru[1] == 1 && sentakumedaru[2] == 0)) {

				if (flag == 1) {
					try {
						scaningk.start();
						flag = 3;
					} catch (Exception e) {

					}

				} else {
					try {
						hensin = MediaPlayer.create(this.context,
								R.raw.tajadoru);
						hensin.start();
					} catch (Exception e) {

					}
				}

			} else if ((sentakumedaru[0] == 4 && sentakumedaru[1] == 5 && sentakumedaru[2] == 3)
					|| (sentakumedaru[0] == 4 && sentakumedaru[1] == 3 && sentakumedaru[2] == 5)
					|| (sentakumedaru[0] == 3 && sentakumedaru[1] == 4 && sentakumedaru[2] == 5)
					|| (sentakumedaru[0] == 3 && sentakumedaru[1] == 5 && sentakumedaru[2] == 4)
					|| (sentakumedaru[0] == 5 && sentakumedaru[1] == 4 && sentakumedaru[2] == 3)
					|| (sentakumedaru[0] == 5 && sentakumedaru[1] == 3 && sentakumedaru[2] == 4)) {
				if (flag == 1) {
					try {
						scaningk.start();
						flag = 3;
					} catch (Exception e) {

					}

				} else {
					try {
						hensin = MediaPlayer.create(this.context,
								R.raw.ratorata);
						hensin.start();
					} catch (Exception e) {

					}
				}
			} else if ((sentakumedaru[0] == 7 && sentakumedaru[1] == 8 && sentakumedaru[2] == 6)
					|| (sentakumedaru[0] == 7 && sentakumedaru[1] == 6 && sentakumedaru[2] == 8)
					|| (sentakumedaru[0] == 6 && sentakumedaru[1] == 7 && sentakumedaru[2] == 8)
					|| (sentakumedaru[0] == 6 && sentakumedaru[1] == 8 && sentakumedaru[2] == 7)
					|| (sentakumedaru[0] == 8 && sentakumedaru[1] == 7 && sentakumedaru[2] == 6)
					|| (sentakumedaru[0] == 8 && sentakumedaru[1] == 6 && sentakumedaru[2] == 7)) {

				if (flag == 1) {
					try {
						scaningk.start();
						flag = 3;
					} catch (Exception e) {

					}

				} else {
					try {
						hensin = MediaPlayer.create(this.context,
								R.raw.gatakiriba);
						hensin.start();
					} catch (Exception e) {

					}
				}
			} else if ((sentakumedaru[0] == 10 && sentakumedaru[1] == 11 && sentakumedaru[2] == 9)
					|| (sentakumedaru[0] == 10 && sentakumedaru[1] == 9 && sentakumedaru[2] == 11)
					|| (sentakumedaru[0] == 9 && sentakumedaru[1] == 10 && sentakumedaru[2] == 11)
					|| (sentakumedaru[0] == 9 && sentakumedaru[1] == 11 && sentakumedaru[2] == 10)
					|| (sentakumedaru[0] == 11 && sentakumedaru[1] == 10 && sentakumedaru[2] == 9)
					|| (sentakumedaru[0] == 11 && sentakumedaru[1] == 9 && sentakumedaru[2] == 10)) {

				if (flag == 1) {
					try {
						scaningk.start();
						flag = 3;
					} catch (Exception e) {

					}

				} else {
					try {
						hensin = MediaPlayer.create(this.context, R.raw.sagozo);
						hensin.start();
					} catch (Exception e) {

					}
				}
			} else if ((sentakumedaru[0] == 4 && sentakumedaru[1] == 8 && sentakumedaru[2] == 0)
					|| (sentakumedaru[0] == 4 && sentakumedaru[1] == 0 && sentakumedaru[2] == 8)
					|| (sentakumedaru[0] == 0 && sentakumedaru[1] == 4 && sentakumedaru[2] == 8)
					|| (sentakumedaru[0] == 0 && sentakumedaru[1] == 8 && sentakumedaru[2] == 4)
					|| (sentakumedaru[0] == 8 && sentakumedaru[1] == 4 && sentakumedaru[2] == 0)
					|| (sentakumedaru[0] == 8 && sentakumedaru[1] == 0 && sentakumedaru[2] == 4)) {

				if (flag == 1) {
					try {
						scaningk.start();
						flag = 3;
					} catch (Exception e) {

					}

				} else {
					try {
						hensin = MediaPlayer.create(this.context, R.raw.tatoba);
						hensin.start();
					} catch (Exception e) {

					}
				}
			} else if ((sentakumedaru[0] == 12 && sentakumedaru[1] == 13 && sentakumedaru[2] == 14)
					|| (sentakumedaru[0] == 12 && sentakumedaru[1] == 14 && sentakumedaru[2] == 13)
					|| (sentakumedaru[0] == 13 && sentakumedaru[1] == 12 && sentakumedaru[2] == 14)
					|| (sentakumedaru[0] == 13 && sentakumedaru[1] == 14 && sentakumedaru[2] == 12)
					|| (sentakumedaru[0] == 14 && sentakumedaru[1] == 12 && sentakumedaru[2] == 13)
					|| (sentakumedaru[0] == 14 && sentakumedaru[1] == 13 && sentakumedaru[2] == 12)) {

				if (flag == 1) {
					try {
						scaningk.start();
						flag = 3;
					} catch (Exception e) {

					}

				} else {
					try {
						hensin = MediaPlayer.create(this.context,
								R.raw.sixyauta);
						hensin.start();
					} catch (Exception e) {

					}
				}
			} else {
				try {
					hensin = MediaPlayer.create(this.context,
							R.raw.publichensin);
					hensin.start();
				} catch (Exception e) {

				}
			}

			for (int i = 0; i < 3; i++) {
				scaningflag[i] = sentakumedaru[i];
			}

		}
	}

}
