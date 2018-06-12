package com.tencent.mm.plugin.shake.ui;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import android.os.Vibrator;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.j;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.R.m;
import com.tencent.mm.g.a.dl;
import com.tencent.mm.g.a.dm;
import com.tencent.mm.g.a.ds;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.c;
import com.tencent.mm.model.aq;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bl;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.platformtools.y;
import com.tencent.mm.platformtools.y.a;
import com.tencent.mm.plugin.shake.b.l.a;
import com.tencent.mm.plugin.shake.b.l.b;
import com.tencent.mm.plugin.shake.d.a.h.a;
import com.tencent.mm.plugin.shake.d.a.k.1;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.c.avq;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bo;
import com.tencent.mm.storage.bp;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ShakeReportUI
  extends MMActivity
  implements aq, y.a, l.a, com.tencent.mm.plugin.shake.c.a.f.a, j.a, m.b
{
  private static List<h.a> cXq = new CopyOnWriteArrayList();
  private com.tencent.mm.modelgeo.c cXl;
  private boolean cXo = false;
  private Map<String, h.a> cXp = new ConcurrentHashMap();
  private a.a cXs = new a.a()
  {
    public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
    {
      if (paramAnonymousBoolean)
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ShakeReportUI", "on location get ok");
        au.HU();
        com.tencent.mm.model.c.DT().a(aa.a.sPK, String.valueOf(paramAnonymousFloat2));
        au.HU();
        com.tencent.mm.model.c.DT().a(aa.a.sPL, String.valueOf(paramAnonymousFloat1));
        au.HU();
        com.tencent.mm.model.c.DT().a(aa.a.sSf, String.valueOf(paramAnonymousDouble2));
        ShakeReportUI.a(ShakeReportUI.this);
        if (ShakeReportUI.b(ShakeReportUI.this) != null) {
          ShakeReportUI.b(ShakeReportUI.this).c(ShakeReportUI.c(ShakeReportUI.this));
        }
      }
      for (;;)
      {
        return false;
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ShakeReportUI", "getLocation fail");
      }
    }
  };
  private com.tencent.mm.ak.a.a dWD = null;
  private ImageView eBM;
  private boolean eLU = true;
  private com.tencent.mm.pluginsdk.i.c lAY;
  private boolean mZS = false;
  private boolean mZT = false;
  private boolean mZU;
  private boolean mZV = false;
  private boolean mZW = false;
  private boolean mZX = false;
  private boolean mZY = false;
  private int mZZ = 22;
  private ImageView naA;
  private ImageView naB;
  private ImageView naC;
  private ImageView naD;
  private ImageView naE;
  private ImageView naF;
  private TextView naG;
  private int naH = 1;
  private int naI = 0;
  private View naJ;
  private ImageView naK;
  private ImageView naL;
  private ImageView naM;
  private ImageView naN;
  private View naO;
  private View naP;
  private View naQ;
  private View naR;
  private View naS = null;
  private int naT = 0;
  private com.tencent.mm.plugin.shake.c.b.a naU;
  private boolean naV = false;
  @SuppressLint({"UseSparseArrays"})
  private Map<Integer, Boolean> naW = new HashMap();
  private boolean naX = false;
  private boolean naY = false;
  private boolean naZ = false;
  private c naa;
  private com.tencent.mm.plugin.shake.b.l nab = new com.tencent.mm.plugin.shake.b.l();
  private com.tencent.mm.pluginsdk.ui.f nac;
  private View nad;
  private View nae;
  private TextView naf;
  private TextView nag;
  private TextView nah;
  private View nai;
  private View naj;
  private View nak;
  private View nal;
  private Animation nam;
  private Animation nan;
  private Animation nao;
  private Animation nap;
  private View naq = null;
  private View nar = null;
  private MMImageView nas = null;
  private TextView nat = null;
  private ImageView nau = null;
  private String nav = "";
  private Bitmap naw = null;
  private Dialog nax;
  private ImageView nay = null;
  private com.tencent.mm.plugin.shake.b.d naz = null;
  private boolean nba = false;
  private int nbb = 1;
  private long nbc = 0L;
  private boolean nbd = false;
  private com.tencent.mm.sdk.b.c nbe = new com.tencent.mm.sdk.b.c() {};
  private com.tencent.mm.sdk.b.c nbf = new com.tencent.mm.sdk.b.c() {};
  private View.OnClickListener nbg = new ShakeReportUI.18(this);
  
  private void Lj(String paramString)
  {
    this.mZV = false;
    if (this.mZU) {
      as.I(this.mController.tml, R.l.shake_nomatch);
    }
    if (this.nap == null) {
      this.nap = AnimationUtils.loadAnimation(this.mController.tml, R.a.faded_out);
    }
    wc(2);
    if ((paramString != null) && (paramString.length() > 1)) {
      this.nag.setText(paramString);
    }
    for (;;)
    {
      this.nag.startAnimation(this.nap);
      this.mZY = true;
      ah.i(new ShakeReportUI.14(this), this.nap.getDuration());
      return;
      this.nag.setText(R.l.shake_getfial);
    }
  }
  
  private void a(com.tencent.mm.plugin.shake.c.a.e parame)
  {
    this.naU = com.tencent.mm.plugin.shake.c.b.a.a(this, parame, new ShakeReportUI.16(this), new ShakeReportUI.17(this));
  }
  
  private void aN(String paramString, boolean paramBoolean)
  {
    this.mZV = false;
    if (this.nap == null) {
      this.nap = AnimationUtils.loadAnimation(this.mController.tml, R.a.faded_out);
    }
    wc(2);
    hH(true);
    if ((paramString != null) && (paramString.length() > 1)) {
      this.nag.setText(paramString);
    }
    for (;;)
    {
      this.mZY = true;
      return;
      if (paramBoolean)
      {
        this.nag.setText(R.l.shake_card_init_tips);
      }
      else
      {
        this.nag.setText("");
        hH(false);
      }
    }
  }
  
  private void bpD()
  {
    bvn();
    au.HU();
    com.tencent.mm.model.c.a(this);
    au.HU();
    com.tencent.mm.model.c.DT().a(this);
    com.tencent.mm.plugin.shake.b.m.buC().c(this);
    if (this.nab.mWP != null) {
      this.nab.mWP.resume();
    }
    this.mZX = true;
    if ((this.naU != null) && (this.naU.isShowing()) && (!this.naU.mXW)) {
      this.mZX = false;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeReportUI", "tryStartShake");
    Object localObject;
    label290:
    boolean bool;
    if ((this.lAY != null) && (!this.lAY.ccQ()))
    {
      this.lAY.a(new a(this));
      if ((this.lAY.ccS()) && (this.naf != null)) {
        this.naf.setText(getString(R.l.shake_a_friend));
      }
    }
    else
    {
      new ag().postDelayed(new ShakeReportUI.22(this), 1000L);
      if (this.lAY != null) {
        this.lAY.ccR();
      }
      hH(false);
      hI(false);
      bvp();
      au.HU();
      localObject = (String)com.tencent.mm.model.c.DT().get(327696, "1");
      if (com.tencent.mm.plugin.shake.d.a.k.buA())
      {
        if (this.naH == 4) {
          hE(true);
        }
        if (((String)localObject).equals("4")) {
          cw(findViewById(R.h.shake_report_tab_tv_ll));
        }
      }
      if (!((String)localObject).equals("3")) {
        break label437;
      }
      cw(findViewById(R.h.shake_report_tab_music_ll));
      bool = com.tencent.mm.s.c.Cp().aU(262154, 266258);
      if ((!getIntent().getBooleanExtra("shake_music", false)) || (!com.tencent.mm.an.c.Qf()) || (this.nab.mWO == 3)) {
        break label467;
      }
      getIntent().putExtra("shake_music", false);
      this.naH = 3;
    }
    for (;;)
    {
      bvo();
      hF(true);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ShakeReportUI", "isShakeGetConfigList = %s", new Object[] { Boolean.valueOf(af.exc) });
      if (af.exc)
      {
        localObject = new com.tencent.mm.ar.k(7);
        au.DF().a((com.tencent.mm.ab.l)localObject, 0);
      }
      bvy();
      bvv();
      bvl();
      return;
      this.naf.setText(getString(R.l.shake_not_support));
      break;
      label437:
      if ((!((String)localObject).equals("6")) || (!com.tencent.mm.plugin.shake.c.c.a.bvb())) {
        break label290;
      }
      cw(findViewById(R.h.shake_report_tab_card_ll));
      break label290;
      label467:
      if ((getIntent().getBooleanExtra("shake_tv", false)) && (this.nab.mWO != 4) && (com.tencent.mm.plugin.shake.d.a.k.buA()))
      {
        getIntent().putExtra("shake_tv", false);
        this.naH = 4;
      }
      else if ((this.nab.mWO != 6) && (com.tencent.mm.plugin.shake.c.c.a.bvb()) && ((bool) || (getIntent().getBooleanExtra("shake_card", false))))
      {
        this.naT = getIntent().getIntExtra("shake_card", 0);
        getIntent().putExtra("shake_card", false);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeReportUI", "onresume shake card tab is open, activity type is 0 or open from specialview");
        this.naH = 6;
      }
    }
  }
  
  private void bvl()
  {
    if (!bvx()) {
      break label6;
    }
    for (;;)
    {
      label6:
      return;
      if (BluetoothAdapter.getDefaultAdapter() != null)
      {
        Object localObject = com.tencent.mm.k.g.AU().AJ();
        if (localObject == null) {
          break;
        }
        this.nbc = System.currentTimeMillis();
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeReportUI", "op=true,iBeacon = %s", new Object[] { str });
          dl localdl = new dl();
          localdl.bLj.bLl = str;
          localdl.bLj.bLi = true;
          com.tencent.mm.sdk.b.a.sFg.m(localdl);
        }
      }
    }
  }
  
  private void bvm()
  {
    au.HU();
    if (!Boolean.valueOf(bi.a((Boolean)com.tencent.mm.model.c.DT().get(aa.a.sRU, null), false)).booleanValue())
    {
      this.cXp.clear();
      cXq = new CopyOnWriteArrayList();
    }
    if (Build.VERSION.SDK_INT >= 18)
    {
      Object localObject = com.tencent.mm.k.g.AU().AJ();
      if (localObject != null)
      {
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          dl localdl = new dl();
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeReportUI", "op=false,iBeacon = %s", new Object[] { str });
          localdl.bLj.bLl = str;
          localdl.bLj.bLi = false;
          com.tencent.mm.sdk.b.a.sFg.m(localdl);
        }
      }
    }
  }
  
  private void bvn()
  {
    au.HU();
    int j = bi.a((Integer)com.tencent.mm.model.c.DT().get(12290, null), 0);
    ImageView localImageView = (ImageView)findViewById(R.h.shake_report_bg_img);
    if ((this.naw != null) && (!this.naw.isRecycled())) {
      this.naw.recycle();
    }
    au.HU();
    Object localObject1;
    if (bi.c((Boolean)com.tencent.mm.model.c.DT().get(4110, null)))
    {
      localObject1 = new StringBuilder();
      au.HU();
      localObject1 = com.tencent.mm.model.c.Gb() + "default_shake_img_filename.jpg";
      if (com.tencent.mm.a.e.cn((String)localObject1))
      {
        this.naw = y.oQ((String)localObject1);
        localImageView.setImageDrawable(new BitmapDrawable(this.naw));
        localObject1 = (ImageView)findViewById(R.h.shake_logo_up);
        localImageView = (ImageView)findViewById(R.h.shake_logo_down);
        if (j != 2) {
          break label382;
        }
        i = R.g.shake_logo_female_up;
        label173:
        ((ImageView)localObject1).setImageResource(i);
        if (j != 2) {
          break label389;
        }
      }
    }
    label382:
    label389:
    for (int i = R.g.shake_logo_female_down;; i = R.g.shake_logo_down)
    {
      localImageView.setImageResource(i);
      ShakeReportUI.7 local7 = new ShakeReportUI.7(this);
      ((ImageView)localObject1).setOnClickListener(local7);
      localImageView.setOnClickListener(local7);
      if (this.nak == null) {
        this.nak = findViewById(R.h.shake_line_down);
      }
      this.nak.setOnClickListener(local7);
      if (this.nal == null) {
        this.nal = findViewById(R.h.shake_line_up);
      }
      this.nal.setOnClickListener(local7);
      return;
      try
      {
        localObject1 = new BitmapDrawable(com.tencent.mm.sdk.platformtools.c.decodeStream(this.mController.tml.getAssets().open("resource/shakehideimg_man.jpg")));
        localImageView.setImageDrawable((Drawable)localObject1);
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ShakeReportUI", "Bg decode exp:" + localIOException.getLocalizedMessage());
          Object localObject2 = null;
        }
      }
      au.HU();
      this.naw = y.oQ((String)com.tencent.mm.model.c.DT().get(4111, null));
      localImageView.setImageDrawable(new BitmapDrawable(this.naw));
      break;
      i = R.g.shake_logo_up;
      break label173;
    }
  }
  
  private void bvo()
  {
    if ((this.naH == 3) && (com.tencent.mm.an.c.Qf()))
    {
      this.naH = 3;
      this.nah.setText(R.l.shake_searching_music_tips);
      this.nay.setBackgroundResource(R.g.shake_icon_ibeacon);
      this.naA.setBackgroundResource(R.g.shake_icon_people);
      this.naB.setBackgroundResource(R.g.shake_icon_music_hl);
      this.naC.setBackgroundResource(R.g.shake_icon_tv);
      this.naD.setBackgroundResource(R.g.shake_cardpack_icon);
      findViewById(R.h.shake_report_bottom_tabs_ll).setVisibility(0);
      setMMTitle(R.l.shake_report_title_music);
      com.tencent.mm.plugin.report.service.h.mEJ.h(11720, new Object[] { Integer.valueOf(2) });
      com.tencent.mm.plugin.report.service.h.mEJ.e(834L, 2L, 1L);
    }
    Object localObject1;
    int i;
    Object localObject2;
    for (;;)
    {
      localObject1 = this.nab;
      i = this.naH;
      if (i != ((com.tencent.mm.plugin.shake.b.l)localObject1).mWO) {
        break;
      }
      localObject1 = ((com.tencent.mm.plugin.shake.b.l)localObject1).mWP;
      if (!this.mZV) {
        hI(false);
      }
      if ((com.tencent.mm.plugin.shake.c.c.a.bvb()) && ((localObject1 instanceof com.tencent.mm.plugin.shake.c.a.g)))
      {
        localObject2 = (com.tencent.mm.plugin.shake.c.a.g)localObject1;
        i = this.naT;
        ((com.tencent.mm.plugin.shake.c.a.g)localObject2).hop = i;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeCardService", "ShakeCardService from_scene:" + i);
        if (this.naT == 3)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeReportUI", "open shake card from specialview");
          localObject1 = (com.tencent.mm.plugin.shake.c.a.g)localObject1;
          localObject2 = getIntent().getStringExtra("key_shake_card_ext_info");
          if ((localObject2 == null) || (((String)localObject2).length() > 256)) {
            break label973;
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeCardService", "ShakeCardService mExtInfo:" + ((com.tencent.mm.plugin.shake.c.a.g)localObject1).fHA);
          ((com.tencent.mm.plugin.shake.c.a.g)localObject1).fHA = ((String)localObject2);
        }
      }
      return;
      if ((this.naH == 4) && (com.tencent.mm.plugin.shake.d.a.k.buA()))
      {
        this.naH = 4;
        this.nah.setText(R.l.shake_searching_tv_tips);
        this.nay.setBackgroundResource(R.g.shake_icon_ibeacon);
        this.naA.setBackgroundResource(R.g.shake_icon_people);
        this.naB.setBackgroundResource(R.g.shake_icon_music);
        this.naC.setBackgroundResource(R.g.shake_icon_tv_hl);
        this.naD.setBackgroundResource(R.g.shake_cardpack_icon);
        findViewById(R.h.shake_report_bottom_tabs_ll).setVisibility(0);
        setMMTitle(R.l.shake_report_title_tv);
        com.tencent.mm.plugin.report.service.h.mEJ.h(11720, new Object[] { Integer.valueOf(3) });
        com.tencent.mm.plugin.report.service.h.mEJ.e(834L, 3L, 1L);
      }
      else if ((this.naH == 5) && (bvw()))
      {
        this.naH = 5;
        this.nah.setText(R.l.shake_searching_ibeacon_tips);
        this.nay.setBackgroundResource(R.g.shake_icon_ibeacon_hl);
        this.naA.setBackgroundResource(R.g.shake_icon_people);
        this.naB.setBackgroundResource(R.g.shake_icon_music);
        this.naC.setBackgroundResource(R.g.shake_icon_tv);
        this.naD.setBackgroundResource(R.g.shake_cardpack_icon);
        findViewById(R.h.shake_report_bottom_tabs_ll).setVisibility(0);
        setMMTitle(R.l.shake_report_title_ibeacon);
        com.tencent.mm.plugin.report.service.h.mEJ.h(11720, new Object[] { Integer.valueOf(4) });
        com.tencent.mm.plugin.report.service.h.mEJ.e(834L, 4L, 1L);
      }
      else if ((this.naH == 6) && (com.tencent.mm.plugin.shake.c.c.a.bvb()))
      {
        this.naH = 6;
        this.nah.setText(R.l.shake_searching_card_tips);
        this.nay.setBackgroundResource(R.g.shake_icon_ibeacon);
        this.naA.setBackgroundResource(R.g.shake_icon_people);
        this.naB.setBackgroundResource(R.g.shake_icon_music);
        this.naC.setBackgroundResource(R.g.shake_icon_tv);
        this.naD.setBackgroundResource(R.g.shake_cardpack_iconhl);
        findViewById(R.h.shake_report_bottom_tabs_ll).setVisibility(0);
        setMMTitle(R.l.shake_report_title_card);
        bvr();
        bvu();
        com.tencent.mm.plugin.report.service.h.mEJ.h(11720, new Object[] { Integer.valueOf(5) });
        com.tencent.mm.plugin.report.service.h.mEJ.e(834L, 5L, 1L);
      }
      else
      {
        this.naH = 1;
        this.nah.setText(R.l.shake_finding);
        this.nay.setBackgroundResource(R.g.shake_icon_ibeacon);
        this.naA.setBackgroundResource(R.g.shake_icon_people_hl);
        this.naB.setBackgroundResource(R.g.shake_icon_music);
        this.naC.setBackgroundResource(R.g.shake_icon_tv);
        this.naD.setBackgroundResource(R.g.shake_cardpack_icon);
        if (com.tencent.mm.an.c.Qf()) {
          findViewById(R.h.shake_report_bottom_tabs_ll).setVisibility(0);
        }
        setMMTitle(R.l.shake_report_title);
        com.tencent.mm.plugin.report.service.h.mEJ.h(11720, new Object[] { Integer.valueOf(1) });
        com.tencent.mm.plugin.report.service.h.mEJ.e(834L, 1L, 1L);
      }
    }
    if (((com.tencent.mm.plugin.shake.b.l)localObject1).mWP != null) {
      ((com.tencent.mm.plugin.shake.b.l)localObject1).mWP.bup();
    }
    switch (i)
    {
    }
    for (;;)
    {
      ((com.tencent.mm.plugin.shake.b.l)localObject1).mWO = i;
      ((com.tencent.mm.plugin.shake.b.l)localObject1).mWP.init();
      localObject1 = ((com.tencent.mm.plugin.shake.b.l)localObject1).mWP;
      break;
      ((com.tencent.mm.plugin.shake.b.l)localObject1).mWP = new com.tencent.mm.plugin.shake.b.c(this, this);
      continue;
      ((com.tencent.mm.plugin.shake.b.l)localObject1).mWP = com.tencent.mm.plugin.shake.d.a.j.a(this);
      continue;
      ((com.tencent.mm.plugin.shake.b.l)localObject1).mWP = new com.tencent.mm.plugin.shake.d.a.l(this, this);
      continue;
      ((com.tencent.mm.plugin.shake.b.l)localObject1).mWP = new com.tencent.mm.plugin.shake.d.a.h(this);
      continue;
      ((com.tencent.mm.plugin.shake.b.l)localObject1).mWP = new com.tencent.mm.plugin.shake.c.a.g(this);
    }
    label973:
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeCardService", "ShakeCardService ext_info size > 256 byte, extinfo:" + (String)localObject2);
  }
  
  private void bvp()
  {
    au.HU();
    this.mZU = bi.c((Boolean)com.tencent.mm.model.c.DT().get(4112, null));
    if (this.mZU)
    {
      setTitleMuteIconVisibility(8);
      return;
    }
    setTitleMuteIconVisibility(0);
  }
  
  private void bvq()
  {
    if (com.tencent.mm.plugin.shake.c.c.a.bvb())
    {
      if (com.tencent.mm.s.c.Cp().aU(262155, 266259)) {
        this.naF.setVisibility(0);
      }
    }
    else {
      return;
    }
    this.naF.setVisibility(8);
  }
  
  private void bvr()
  {
    boolean bool2;
    if ((this.naH == 6) && (com.tencent.mm.plugin.shake.c.c.a.bvb()))
    {
      boolean bool1 = com.tencent.mm.s.c.Cp().aU(262154, 266258);
      bool2 = com.tencent.mm.s.c.Cp().aU(262155, 266259);
      if (!bool1) {
        break label54;
      }
      aN(com.tencent.mm.plugin.shake.c.c.a.buW(), true);
    }
    label54:
    do
    {
      return;
      if (bool2)
      {
        aN(com.tencent.mm.plugin.shake.c.c.a.buY(), true);
        return;
      }
    } while (this.naV);
    if (!TextUtils.isEmpty(com.tencent.mm.plugin.shake.c.c.a.buU()))
    {
      aN(com.tencent.mm.plugin.shake.c.c.a.buU(), true);
      return;
    }
    aN(getString(R.l.shake_card_init_tips), true);
  }
  
  private void bvs()
  {
    if ((this.naU != null) && (this.naU.isShowing())) {
      this.naU.dismiss();
    }
    this.naU = null;
  }
  
  private void bvt()
  {
    int m = 1;
    boolean bool1 = com.tencent.mm.plugin.shake.c.c.a.bux();
    boolean bool2 = com.tencent.mm.s.c.Cp().aU(262154, 266258);
    boolean bool3 = com.tencent.mm.s.c.Cp().aU(262155, 266259);
    if (getIntent().getBooleanExtra("shake_card", false)) {}
    for (int i = getIntent().getIntExtra("shake_card", 0);; i = 0)
    {
      com.tencent.mm.plugin.report.service.h localh = com.tencent.mm.plugin.report.service.h.mEJ;
      int j;
      if (bool2)
      {
        j = 1;
        if (!bool1) {
          break label219;
        }
        k = 1;
        label81:
        localh.h(11668, new Object[] { Integer.valueOf(1), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), com.tencent.mm.plugin.shake.c.c.a.buX(), Integer.valueOf(com.tencent.mm.plugin.shake.c.c.a.buT()) });
        localh = com.tencent.mm.plugin.report.service.h.mEJ;
        if (!bool3) {
          break label224;
        }
        j = 1;
        label149:
        if (!bool1) {
          break label229;
        }
      }
      label219:
      label224:
      label229:
      for (int k = m;; k = 0)
      {
        localh.h(11668, new Object[] { Integer.valueOf(2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), com.tencent.mm.plugin.shake.c.c.a.buX(), Integer.valueOf(com.tencent.mm.plugin.shake.c.c.a.buT()) });
        return;
        j = 0;
        break;
        k = 0;
        break label81;
        j = 0;
        break label149;
      }
    }
  }
  
  private void bvu()
  {
    if (!TextUtils.isEmpty(com.tencent.mm.plugin.shake.c.c.a.buV())) {
      this.naG.setText(com.tencent.mm.plugin.shake.c.c.a.buV());
    }
  }
  
  private void bvv()
  {
    label119:
    label164:
    label206:
    Object localObject;
    int i;
    if (com.tencent.mm.an.c.Qf())
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeReportUI", "is not oversea user, show shake music");
      this.naW.put(Integer.valueOf(3), Boolean.valueOf(true));
      findViewById(R.h.shake_report_tab_music_ll).setVisibility(0);
      if (com.tencent.mm.an.c.Qg())
      {
        au.HU();
        if (com.tencent.mm.model.c.DT().getInt(4118, 0) == 0) {
          this.naE.setVisibility(0);
        }
      }
      else
      {
        if (!com.tencent.mm.plugin.shake.d.a.k.buA()) {
          break label308;
        }
        this.naW.put(Integer.valueOf(4), Boolean.valueOf(true));
        findViewById(R.h.shake_report_tab_tv_ll).setVisibility(0);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeReportUI", "show shake tv tab");
        if (!com.tencent.mm.plugin.shake.c.c.a.bvb()) {
          break label350;
        }
        this.naW.put(Integer.valueOf(6), Boolean.valueOf(true));
        findViewById(R.h.shake_report_tab_card_ll).setVisibility(0);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeReportUI", "show shake card tab");
        if (!bvw()) {
          break label393;
        }
        this.naW.put(Integer.valueOf(5), Boolean.valueOf(true));
        this.naS.setVisibility(0);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeReportUI", "[shakezb]show shake ibeacon tab");
        localObject = this.naW.values().iterator();
        i = 0;
        label223:
        if (!((Iterator)localObject).hasNext()) {
          break label432;
        }
        if (!((Boolean)((Iterator)localObject).next()).booleanValue()) {
          break label557;
        }
        i += 1;
      }
    }
    label308:
    label350:
    label393:
    label432:
    label511:
    label557:
    for (;;)
    {
      break label223;
      this.naE.setVisibility(8);
      break;
      this.naW.put(Integer.valueOf(3), Boolean.valueOf(false));
      findViewById(R.h.shake_report_tab_music_ll).setVisibility(8);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeReportUI", "is oversea user, hide shake music");
      break;
      this.naW.put(Integer.valueOf(4), Boolean.valueOf(false));
      findViewById(R.h.shake_report_tab_tv_ll).setVisibility(8);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeReportUI", "hide shake tv tab");
      break label119;
      findViewById(R.h.shake_report_tab_card_ll).setVisibility(8);
      this.naW.put(Integer.valueOf(6), Boolean.valueOf(false));
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeReportUI", "hide shake card tab");
      break label164;
      this.naW.put(Integer.valueOf(5), Boolean.valueOf(false));
      this.naS.setVisibility(8);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeReportUI", "[shakezb]hide shake ibeacon tab");
      break label206;
      this.naI = i;
      localObject = (LinearLayout)findViewById(R.h.shake_report_bottom_tabs_ll);
      if (i == 1)
      {
        ((LinearLayout)localObject).setVisibility(8);
        if ((i <= 4) || (!this.nbd)) {
          break label511;
        }
        findViewById(R.h.shake_report_tab_tv_ll).setVisibility(8);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeReportUI", "show tab count is > 4 and beaconMap.size() > 0.");
        this.naI -= 1;
      }
      while ((i <= 4) || (this.nbd))
      {
        return;
        ((LinearLayout)localObject).setVisibility(0);
        break;
      }
      this.naS.setVisibility(8);
      this.naX = false;
      this.naI -= 1;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeReportUI", "show tab count is > 4 and beaconMap.size() <= 0.");
      return;
    }
  }
  
  private boolean bvw()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeReportUI", "[shakezb] isChineseAppLang :" + com.tencent.mm.sdk.platformtools.w.chL() + " ,getApplicationLanguage[en or zh_CN or zh_HK or zh_TW is avaliable] :" + com.tencent.mm.sdk.platformtools.w.chP());
    return (this.naX) && (bvx());
  }
  
  private static boolean bvx()
  {
    return (com.tencent.mm.sdk.platformtools.w.chL()) || (com.tencent.mm.sdk.platformtools.w.chP().equals("en")) || (com.tencent.mm.sdk.platformtools.w.chP().equals("ja"));
  }
  
  private void bvy()
  {
    this.naJ.setVisibility(8);
  }
  
  private void cw(View paramView)
  {
    if (paramView == null) {}
    do
    {
      return;
      bool = com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.RECORD_AUDIO", 80, "", "");
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeReportUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bi.cjd(), this });
    } while (!bool);
    aN("", false);
    if (paramView.getId() == R.h.shake_report_tab_friend_ll)
    {
      com.tencent.mm.plugin.report.service.h.mEJ.h(11722, new Object[] { Integer.valueOf(1) });
      if (this.naH != 1)
      {
        if (this.naH == 4) {
          hE(false);
        }
        this.naH = 1;
        bvo();
        hG(false);
        if (this.nad != null) {
          this.nad.setVisibility(8);
        }
      }
    }
    do
    {
      for (;;)
      {
        hF(true);
        hI(false);
        bvy();
        return;
        if (paramView.getId() == R.h.shake_report_tab_music_ll)
        {
          com.tencent.mm.plugin.report.service.h.mEJ.h(11722, new Object[] { Integer.valueOf(2) });
          if ((!this.cXo) && (this.cXl != null)) {
            this.cXl.a(this.cXs, true);
          }
          if ((!com.tencent.mm.p.a.by(this)) && (!com.tencent.mm.p.a.bw(this)) && (this.naH != 3))
          {
            if (this.naH == 4) {
              hE(false);
            }
            this.naH = 3;
            bvo();
            hG(false);
            if (this.nad != null) {
              this.nad.setVisibility(8);
            }
          }
          if (com.tencent.mm.an.c.Qg())
          {
            au.HU();
            if (com.tencent.mm.model.c.DT().getInt(4118, 0) == 0)
            {
              paramView = new com.tencent.mm.ui.widget.a.c.a(this.mController.tml);
              paramView.Gq(R.l.app_tip);
              paramView.Gr(R.l.shake_info_music);
              paramView.Gt(R.l.shake_info_known).a(new ShakeReportUI.2(this));
              paramView.mF(true);
              paramView.e(new ShakeReportUI.3(this));
              this.nax = paramView.anj();
              this.nax.show();
            }
          }
        }
        else
        {
          if (paramView.getId() != R.h.shake_report_tab_tv_ll) {
            break;
          }
          com.tencent.mm.plugin.report.service.h.mEJ.h(11722, new Object[] { Integer.valueOf(3) });
          if ((!this.cXo) && (this.cXl != null)) {
            this.cXl.a(this.cXs, true);
          }
          if ((!com.tencent.mm.p.a.by(this)) && (!com.tencent.mm.p.a.bw(this)) && (this.naH != 4))
          {
            hE(true);
            this.naH = 4;
            bvo();
            hG(false);
            if (this.nad != null) {
              this.nad.setVisibility(8);
            }
          }
        }
      }
      if ((paramView.getId() != R.h.shake_report_tab_ibeacon_ll) && (paramView.getId() != R.h.shake_report_tab_ibeacon_first_ll)) {
        break;
      }
      com.tencent.mm.plugin.report.service.h.mEJ.h(11722, new Object[] { Integer.valueOf(4) });
    } while (this.naH == 5);
    this.naH = 5;
    bvo();
    hG(false);
    if (this.nad != null) {
      this.nad.setVisibility(8);
    }
    if ((!Build.VERSION.RELEASE.equals("6.0")) && (!Build.VERSION.RELEASE.equals("6.0.0")) && (Build.VERSION.SDK_INT >= 23))
    {
      paramView = (LocationManager)ad.getContext().getSystemService("location");
      if (paramView == null) {
        break label807;
      }
    }
    label807:
    for (boolean bool = paramView.isProviderEnabled("gps");; bool = true)
    {
      if (!bool) {
        Lj(getString(R.l.shake_ibeacon_gps_off));
      }
      paramView = BluetoothAdapter.getDefaultAdapter();
      if ((paramView != null) && (paramView.getState() != 12))
      {
        Lj(getString(R.l.shake_ibeacon_bluetooth_off));
        break;
      }
      if (paramView != null) {
        break;
      }
      Lj(getString(R.l.shake_ibeacon_not_support));
      break;
      if (paramView.getId() != R.h.shake_report_tab_card_ll) {
        break;
      }
      com.tencent.mm.plugin.report.service.h.mEJ.h(11722, new Object[] { Integer.valueOf(5) });
      if (this.naH == 6) {
        break;
      }
      if (this.naH == 4) {
        hE(false);
      }
      this.naH = 6;
      bvo();
      hG(false);
      if (this.nad != null) {
        this.nad.setVisibility(8);
      }
      com.tencent.mm.s.c.Cp().v(262155, false);
      this.naF.setVisibility(8);
      break;
    }
  }
  
  private void hE(boolean paramBoolean)
  {
    String str = String.format("%1$s-shaketype-%2$d", new Object[] { getClass().getName(), Integer.valueOf(4) });
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ShakeReportUI", "activate change report , class name=" + str + ", isActive=" + paramBoolean);
    com.tencent.mm.ui.base.x.b(paramBoolean, new Intent().putExtra("classname", str));
  }
  
  private void hF(boolean paramBoolean)
  {
    Object localObject1 = null;
    hG(paramBoolean);
    if (this.nar == null) {
      this.nar = findViewById(R.h.goto_shake_msg_btn);
    }
    if (!paramBoolean)
    {
      this.nar.setVisibility(8);
      return;
    }
    int i = com.tencent.mm.plugin.shake.b.m.buD().axd();
    if (i <= 0)
    {
      this.nar.setVisibility(8);
      return;
    }
    if (this.nat == null) {
      this.nat = ((TextView)this.nar.findViewById(R.h.shake_msg_count));
    }
    this.nat.setText(getString(R.l.shake_msg_count_text, new Object[] { Integer.valueOf(i) }));
    this.nar.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        paramAnonymousView = new Intent(ShakeReportUI.this, ShakeMsgListUI.class);
        paramAnonymousView.putExtra("shake_msg_from", 1);
        paramAnonymousView.putExtra("shake_msg_list_title", ShakeReportUI.this.getString(R.l.shake_tv_msg_center_title));
        ShakeReportUI.this.startActivity(paramAnonymousView);
      }
    });
    if (this.nas == null) {
      this.nas = ((MMImageView)findViewById(R.h.shake_msg_thumb));
    }
    Object localObject2 = com.tencent.mm.plugin.shake.b.m.buD();
    String str = "SELECT * FROM " + ((com.tencent.mm.plugin.shake.b.g)localObject2).getTableName() + " where status != 1 ORDER BY rowid DESC LIMIT 1";
    localObject2 = ((com.tencent.mm.plugin.shake.b.g)localObject2).diF.b(str, null, 2);
    if (localObject2 == null)
    {
      if (localObject1 != null)
      {
        localObject1 = ((com.tencent.mm.plugin.shake.b.f)localObject1).field_thumburl;
        if (bi.oW((String)localObject1)) {
          break label320;
        }
        localObject1 = new com.tencent.mm.plugin.shake.e.b((String)localObject1);
        localObject2 = y.a((com.tencent.mm.platformtools.w)localObject1);
        this.nas.setTag(((com.tencent.mm.plugin.shake.e.b)localObject1).Vx());
        if ((localObject2 != null) && (!((Bitmap)localObject2).isRecycled())) {
          this.nas.setImageBitmap((Bitmap)localObject2);
        }
      }
      else
      {
        label264:
        this.nar.setVisibility(0);
      }
    }
    else
    {
      if (!((Cursor)localObject2).moveToFirst()) {
        break label333;
      }
      localObject1 = new com.tencent.mm.plugin.shake.b.f();
      ((com.tencent.mm.plugin.shake.b.f)localObject1).d((Cursor)localObject2);
    }
    for (;;)
    {
      ((Cursor)localObject2).close();
      break;
      this.nas.setImageResource(R.k.app_attach_file_icon_webpage);
      break label264;
      label320:
      this.nas.setImageResource(R.k.app_attach_file_icon_webpage);
      break label264;
      label333:
      localObject1 = null;
    }
  }
  
  private void hG(boolean paramBoolean)
  {
    if (this.naq == null) {
      this.naq = findViewById(R.h.goto_sayhi_btn);
    }
    if ((this.nab.mWO == 3) || (this.nab.mWO == 4) || (this.nab.mWO == 5) || (this.nab.mWO == 6) || (!paramBoolean)) {
      this.naq.setVisibility(8);
    }
    bo localbo;
    do
    {
      return;
      int i = com.tencent.mm.az.d.SH().axd();
      if (i <= 0)
      {
        this.naq.setVisibility(8);
        return;
      }
      this.naq.setVisibility(0);
      ((TextView)this.naq.findViewById(R.h.say_hi_count)).setText(getResources().getQuantityString(R.j.say_hi_count_text_quantity, i, new Object[] { Integer.valueOf(i) }));
      this.naq.setOnClickListener(new ShakeReportUI.8(this));
      if (this.nau == null) {
        this.nau = ((ImageView)findViewById(R.h.match_dlg_img));
      }
      localbo = com.tencent.mm.az.d.SH().cna();
    } while (localbo == null);
    this.nav = localbo.field_sayhiuser;
    a.b.a(this.nau, this.nav);
  }
  
  private void hH(boolean paramBoolean)
  {
    if (this.nag != null)
    {
      if (paramBoolean) {
        this.nag.setVisibility(0);
      }
    }
    else {
      return;
    }
    this.nag.setVisibility(8);
    this.nag.cancelLongPress();
  }
  
  private void hI(boolean paramBoolean)
  {
    if (this.nae != null)
    {
      if (paramBoolean) {
        this.nae.setVisibility(0);
      }
    }
    else {
      return;
    }
    this.nae.setVisibility(4);
  }
  
  private void wc(int paramInt)
  {
    if (paramInt == 1) {}
    for (boolean bool = true;; bool = false)
    {
      hI(bool);
      if (paramInt != 2) {
        break;
      }
      hH(true);
      return;
    }
    hH(false);
  }
  
  public final void HK()
  {
    bvo();
  }
  
  public final void a(int paramInt, final com.tencent.mm.plugin.shake.c.a.e parame, long paramLong)
  {
    this.naV = true;
    if (paramInt == 1251) {
      if (parame != null) {}
    }
    Object localObject;
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeReportUI", "onShakeCardReturn MMFunc_Biz_GetLbsCard");
            com.tencent.mm.plugin.shake.c.c.a.buw();
            bvv();
            bvq();
            bvt();
            this.naT = 4;
            com.tencent.mm.plugin.shake.b.m.buI().putValue("key_shake_card_item", parame);
            return;
          } while (paramInt != 1250);
          if (parame == null)
          {
            this.naz = null;
            Lj(null);
            return;
          }
          if (((parame == null) || (this.mZV)) && (!this.mZV))
          {
            this.naz = null;
            Lj(null);
            return;
          }
          this.mZV = false;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeReportUI", "onShakeCardReturn MMFunc_Biz_ShakeCard");
        } while (this.nab.mWO != 6);
        localObject = this.nab.mWP;
      } while ((localObject == null) || (!(localObject instanceof com.tencent.mm.plugin.shake.c.a.g)));
      localObject = (com.tencent.mm.plugin.shake.c.a.g)localObject;
      switch ((int)paramLong)
      {
      default: 
        return;
      case 1: 
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeReportUI", "onShakeGetReturn() ShakeCardService RETURN_OK");
        if (((com.tencent.mm.plugin.shake.c.a.g)localObject).hwF == 3)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeReportUI", "onShakeGetReturn() actionType is  MMBIZ_SHAKE_CARD_ACTION_TYPE_NO_CARD");
          if ((parame != null) && (!TextUtils.isEmpty(parame.mXr)))
          {
            Lj(parame.mXr);
            return;
          }
          Lj(getString(R.l.shake_card_fail_tip));
          return;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeReportUI", "onShakeGetReturn() actionType is " + ((com.tencent.mm.plugin.shake.c.a.g)localObject).hwF);
        wc(3);
        if (parame.hwF == 1) {
          this.mZX = false;
        }
        break;
      }
    } while ((this.naU != null) && (this.naU.isShowing()));
    if (parame.mXt)
    {
      localObject = (ViewStub)findViewById(R.h.viewstub_egg_animframe);
      if (localObject != null) {
        ((ViewStub)localObject).inflate();
      }
      ((ShakeEggAnimFrame)findViewById(R.h.chatting_anim_iv)).G(this);
      new ag().postDelayed(new Runnable()
      {
        public final void run()
        {
          ShakeReportUI.a(ShakeReportUI.this, parame);
        }
      }, 1000L);
      return;
    }
    a(parame);
    return;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeReportUI", "onShakeGetReturn() ShakeCardService RETURN_ERR_REPORT");
    Lj(getString(R.l.shake_card_fail_tip));
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    a("", null);
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    bvp();
    if (!this.mZW) {
      hF(true);
    }
  }
  
  public final void buL()
  {
    com.tencent.mm.plugin.shake.c.c.a.buw();
    bvq();
    bvr();
    bvu();
    bvv();
    bvt();
  }
  
  public final void d(List<com.tencent.mm.plugin.shake.b.d> paramList, long paramLong)
  {
    bvy();
    if ((paramList == null) || (!this.mZV) || (paramLong == 6L))
    {
      this.naz = null;
      if (paramLong == 6L) {
        Lj(getString(R.l.shake_ibeacon_over_frequency_tips));
      }
    }
    label522:
    label582:
    label647:
    label737:
    label767:
    label880:
    label971:
    label977:
    label994:
    label1003:
    label1011:
    label1101:
    do
    {
      do
      {
        int i;
        do
        {
          do
          {
            do
            {
              return;
              if (paramLong == 7L)
              {
                Lj(getString(R.l.shake_ibeacon_no_activity));
                return;
              }
              if (paramLong == 8L)
              {
                Lj(getString(R.l.shake_ibeacon_gps_off));
                return;
              }
              if (paramLong == 9L)
              {
                Lj(getString(R.l.shake_ibeacon_bluetooth_off));
                return;
              }
              if (paramLong == 10L)
              {
                Lj(getString(R.l.shake_ibeacon_not_support));
                return;
              }
              Lj(null);
              return;
              this.mZV = false;
              if (paramList.size() > 0) {
                this.naz = ((com.tencent.mm.plugin.shake.b.d)paramList.get(0));
              }
              if (this.nab.mWO != 1) {
                break label1101;
              }
              if ((paramList.size() > 0) && (((com.tencent.mm.plugin.shake.b.d)paramList.get(0)).field_type != 0))
              {
                Lj(null);
                return;
              }
              this.mZZ = ((com.tencent.mm.plugin.shake.b.d)paramList.get(0)).scene;
              i = paramList.size();
              if (i == 0)
              {
                Lj(null);
                return;
              }
              if (i != 1) {
                break;
              }
              localObject1 = ((com.tencent.mm.plugin.shake.b.d)paramList.get(0)).field_username;
              localObject2 = ((com.tencent.mm.plugin.shake.b.d)paramList.get(0)).field_nickname;
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeReportUI", "1 u:" + (String)localObject1 + " n:" + (String)localObject2 + " d:" + ((com.tencent.mm.plugin.shake.b.d)paramList.get(0)).field_distance);
              if (this.mZU) {
                as.I(this.mController.tml, R.l.shake_match);
              }
              wc(3);
              localObject1 = (com.tencent.mm.plugin.shake.b.d)paramList.get(0);
            } while (bi.oW(((com.tencent.mm.plugin.shake.b.d)localObject1).field_username));
            this.nad.setTag(((com.tencent.mm.plugin.shake.b.d)localObject1).field_username);
            this.nad.setVisibility(0);
            au.HU();
            Object localObject2 = com.tencent.mm.model.c.FR().Yg(((com.tencent.mm.plugin.shake.b.d)localObject1).field_username);
            Object localObject3 = new StringBuilder().append(((com.tencent.mm.plugin.shake.b.d)localObject1).field_nickname);
            if (com.tencent.mm.l.a.gd(((ai)localObject2).field_type))
            {
              paramList = getString(R.l.shake_match_isfriend);
              localObject3 = paramList;
              if (((com.tencent.mm.plugin.shake.b.d)localObject1).field_sex != 1) {
                break label880;
              }
              this.nad.setContentDescription((String)localObject3 + ((com.tencent.mm.plugin.shake.b.d)localObject1).field_distance + this.mController.tml.getString(R.l.shake_sex_male));
              TextView localTextView = (TextView)this.nad.findViewById(R.h.shake_match_dlg_nickname);
              ActionBarActivity localActionBarActivity = this.mController.tml;
              StringBuilder localStringBuilder = new StringBuilder().append(((com.tencent.mm.plugin.shake.b.d)localObject1).field_nickname);
              if (!com.tencent.mm.l.a.gd(((ai)localObject2).field_type)) {
                break label971;
              }
              paramList = getString(R.l.shake_match_isfriend);
              localTextView.setText(com.tencent.mm.pluginsdk.ui.d.j.a(localActionBarActivity, paramList, localTextView.getTextSize()));
              if (this.eBM != null)
              {
                if (bi.oW((String)localObject3)) {
                  break label977;
                }
                this.eBM.setContentDescription(String.format(getString(R.l.shake_avatar), new Object[] { localObject3 }));
              }
              ((TextView)this.nad.findViewById(R.h.shake_match_dlg_distance)).setText(((com.tencent.mm.plugin.shake.b.d)localObject1).field_distance);
              a.b.a((ImageView)this.nad.findViewById(R.h.shake_match_dlg_img), ((com.tencent.mm.plugin.shake.b.d)localObject1).field_username);
              paramList = (ImageView)this.nad.findViewById(R.h.shake_match_dlg_vinfo_iv);
              if (((com.tencent.mm.plugin.shake.b.d)localObject1).field_reserved1 == 0) {
                break label994;
              }
              paramList.setVisibility(0);
              paramList.setImageBitmap(BackwardSupportUtil.b.e(am.a.dBt.gX(((com.tencent.mm.plugin.shake.b.d)localObject1).field_reserved1), 2.0F));
              if ((((com.tencent.mm.plugin.shake.b.d)localObject1).field_reserved1 != 0) || (((com.tencent.mm.plugin.shake.b.d)localObject1).field_sex == 0)) {
                break label1011;
              }
              if (((com.tencent.mm.plugin.shake.b.d)localObject1).field_sex != 1) {
                break label1003;
              }
              i = R.k.ic_sex_male;
              paramList = com.tencent.mm.bp.a.f(this, i);
              this.nad.findViewById(R.h.shake_match_dlg_sex_iv).setVisibility(0);
              ((ImageView)this.nad.findViewById(R.h.shake_match_dlg_sex_iv)).setImageDrawable(paramList);
            }
            for (;;)
            {
              if (((com.tencent.mm.plugin.shake.b.d)localObject1).getProvince() == null)
              {
                com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ShakeReportUI", "PROVINCE NULL");
                ((com.tencent.mm.plugin.shake.b.d)localObject1).field_province = "";
              }
              if (((com.tencent.mm.plugin.shake.b.d)localObject1).getCity() == null)
              {
                com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ShakeReportUI", "CITY NULL");
                ((com.tencent.mm.plugin.shake.b.d)localObject1).field_city = "";
              }
              this.nad.startAnimation(AnimationUtils.loadAnimation(this.mController.tml, R.a.shake_report_dlg_translate_in));
              return;
              paramList = "";
              break;
              if (((com.tencent.mm.plugin.shake.b.d)localObject1).field_sex == 2)
              {
                this.nad.setContentDescription((String)localObject3 + ((com.tencent.mm.plugin.shake.b.d)localObject1).field_distance + this.mController.tml.getString(R.l.shake_sex_female));
                break label522;
              }
              this.nad.setContentDescription((String)localObject3 + ((com.tencent.mm.plugin.shake.b.d)localObject1).field_distance);
              break label522;
              paramList = "";
              break label582;
              this.eBM.setContentDescription(getString(R.l.shake_avatar_unknow));
              break label647;
              paramList.setVisibility(8);
              break label737;
              i = R.k.ic_sex_female;
              break label767;
              this.nad.findViewById(R.h.shake_match_dlg_sex_iv).setVisibility(8);
            }
            if (this.mZU) {
              as.I(this.mController.tml, R.l.shake_match);
            }
            wc(3);
            hG(false);
            paramList = new Intent(this, ShakeItemListUI.class);
            paramList.putExtra("_key_show_type_", -1);
            paramList.putExtra("_key_title_", getString(R.l.shake_item_shake_person_list));
            startActivity(paramList);
            return;
            if (this.nab.mWO != 3) {
              break;
            }
            i = paramList.size();
            if (i == 0)
            {
              Lj(getString(R.l.shake_music_no_match));
              return;
            }
          } while (i != 1);
          if (this.mZU) {
            as.I(this.mController.tml, R.l.shake_match);
          }
          wc(3);
          if (((com.tencent.mm.plugin.shake.b.d)paramList.get(0)).field_type == 4)
          {
            paramList = com.tencent.mm.plugin.shake.d.a.i.c(((com.tencent.mm.plugin.shake.b.d)paramList.get(0)).field_lvbuffer, paramLong);
            com.tencent.mm.an.b.c(paramList);
            localObject1 = new Intent();
            ((Intent)localObject1).putExtra("key_mode", 1);
            ((Intent)localObject1).putExtra("key_offset", paramList.rYk);
            ((Intent)localObject1).putExtra("music_player_beg_time", paramList.nlo);
            ((Intent)localObject1).putExtra("key_scene", 3);
            if (com.tencent.mm.an.c.Qg()) {
              ((Intent)localObject1).putExtra("KGlobalShakeMusic", true);
            }
            com.tencent.mm.bg.d.b(this, "music", ".ui.MusicMainUI", (Intent)localObject1);
            return;
          }
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ShakeReportUI", "Unexpected type, ignore.");
          return;
          if (this.nab.mWO != 4) {
            break;
          }
          bvy();
          i = paramList.size();
          if (i == 0)
          {
            Lj(getString(R.l.shake_tv_no_match));
            return;
          }
        } while (i != 1);
        if (this.mZU) {
          as.I(this.mController.tml, R.l.shake_match);
        }
        wc(3);
        paramList = (com.tencent.mm.plugin.shake.b.d)paramList.get(0);
        new ag().postDelayed(new k.1(paramList, this), 100L);
        return;
      } while (this.nab.mWO != 5);
      switch ((int)paramLong)
      {
      default: 
        return;
      case 1: 
        if ((paramList.isEmpty()) || (((com.tencent.mm.plugin.shake.b.d)paramList.get(0)).field_type != 11)) {
          break label1767;
        }
        if (paramList.size() != 1) {
          break label1665;
        }
        if (this.mZU) {
          as.I(this.mController.tml, R.l.shake_match);
        }
        wc(3);
        paramList = (com.tencent.mm.plugin.shake.b.d)paramList.get(0);
      }
    } while (bi.oW(paramList.field_username));
    this.nad.setTag(paramList.field_username);
    ((TextView)this.nad.findViewById(R.h.shake_match_dlg_nickname)).setText(paramList.field_username);
    this.nad.setContentDescription(bi.oV(paramList.field_nickname));
    ((TextView)this.nad.findViewById(R.h.shake_match_dlg_distance)).setText(paramList.field_signature);
    this.dWD.a(paramList.getProvince(), (ImageView)this.nad.findViewById(R.h.shake_match_dlg_img));
    this.nad.findViewById(R.h.shake_match_dlg_sex_iv).setVisibility(8);
    this.nad.startAnimation(AnimationUtils.loadAnimation(this.mController.tml, R.a.shake_report_dlg_translate_in));
    this.nad.setVisibility(0);
    return;
    label1665:
    if (this.mZU) {
      as.I(this.mController.tml, R.l.shake_match);
    }
    wc(3);
    hG(false);
    Object localObject1 = new Intent(this, ShakeItemListUI.class);
    ((Intent)localObject1).putExtra("_key_show_type_", -12);
    ((Intent)localObject1).putExtra("_key_title_", getString(R.l.shake_item_shake_ibeacon));
    ((Intent)localObject1).putExtra("_key_show_from_shake_", true);
    ((Intent)localObject1).putExtra("_ibeacon_new_insert_size", paramList.size());
    startActivity((Intent)localObject1);
    return;
    label1767:
    Lj(null);
    return;
    Lj(getString(R.l.shake_ibeacon_over_frequency_tips));
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return R.i.shake_report;
  }
  
  protected final void initView()
  {
    com.tencent.mm.plugin.shake.c.c.a.buw();
    this.naW.put(Integer.valueOf(1), Boolean.valueOf(true));
    this.naW.put(Integer.valueOf(3), Boolean.valueOf(false));
    this.naW.put(Integer.valueOf(4), Boolean.valueOf(false));
    this.naW.put(Integer.valueOf(5), Boolean.valueOf(false));
    this.naW.put(Integer.valueOf(6), Boolean.valueOf(false));
    this.dWD = new com.tencent.mm.ak.a.a(this);
    this.naf = ((TextView)findViewById(R.h.shake_report_static));
    this.nae = findViewById(R.h.shake_report_waiting);
    this.nag = ((TextView)findViewById(R.h.shake_report_anim));
    this.nah = ((TextView)findViewById(R.h.shake_report_shaking_tips));
    this.naJ = findViewById(R.h.shake_tv_history_ll);
    this.naK = ((ImageView)findViewById(R.h.shake_tv_history_icon1));
    this.naL = ((ImageView)findViewById(R.h.shake_tv_history_icon2));
    this.naM = ((ImageView)findViewById(R.h.shake_tv_history_icon3));
    this.naN = ((ImageView)findViewById(R.h.shake_tv_history_icon_more));
    this.naO = findViewById(R.h.shake_tv_history_icon1_ll);
    this.naP = findViewById(R.h.shake_tv_history_icon2_ll);
    this.naQ = findViewById(R.h.shake_tv_history_icon3_ll);
    this.naR = findViewById(R.h.shake_tv_history_icon_more_ll);
    this.nad = findViewById(R.h.shake_report_card);
    this.nad.setOnClickListener(this.nbg);
    this.eBM = ((ImageView)this.nad.findViewById(R.h.shake_match_dlg_img));
    this.eBM.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        if (ShakeReportUI.o(ShakeReportUI.this) != 5)
        {
          ShakeReportUI.a(ShakeReportUI.this, new com.tencent.mm.pluginsdk.ui.f(ShakeReportUI.this, (String)ShakeReportUI.p(ShakeReportUI.this).getTag(), null, com.tencent.mm.pluginsdk.ui.f.a.qFv));
          ShakeReportUI.q(ShakeReportUI.this).cde();
        }
      }
    });
    bvn();
    Object localObject = View.inflate(this.mController.tml, R.i.shake_info_dialog_view, null);
    this.nax = new com.tencent.mm.ui.base.i(this.mController.tml, R.m.mmalertdialog);
    this.nax.setContentView((View)localObject);
    this.nax.setOnCancelListener(new ShakeReportUI.4(this));
    ((Button)((View)localObject).findViewById(R.h.shake_info_close)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        ShakeReportUI.r(ShakeReportUI.this).cancel();
      }
    });
    au.HU();
    boolean bool1 = bi.d((Boolean)com.tencent.mm.model.c.DT().get(4108, null));
    au.HU();
    boolean bool2 = bi.d((Boolean)com.tencent.mm.model.c.DT().get(4117, null));
    if (!bool1)
    {
      ((View)localObject).setVisibility(0);
      this.nax.show();
      au.HU();
      com.tencent.mm.model.c.DT().set(4108, Boolean.valueOf(true));
      setBackBtn(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          ShakeReportUI.a(ShakeReportUI.this, false);
          ShakeReportUI.this.finish();
          return true;
        }
      });
      addIconOptionMenu(0, R.l.actionbar_title_setting, R.k.actionbar_setting_icon, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          ShakeReportUI.a(ShakeReportUI.this, false);
          paramAnonymousMenuItem = new Intent();
          paramAnonymousMenuItem.setClass(ShakeReportUI.this, ShakePersonalInfoUI.class);
          ShakeReportUI.this.startActivityForResult(paramAnonymousMenuItem, 3);
          return true;
        }
      });
      localObject = new ShakeReportUI.29(this);
      if ((!this.nba) && (!this.naY)) {
        break label772;
      }
    }
    label772:
    for (this.nay = ((ImageView)findViewById(R.h.shake_report_tab_ibeacon_image_view));; this.nay = ((ImageView)findViewById(R.h.shake_report_tab_ibeacon_image_first_view)))
    {
      this.naA = ((ImageView)findViewById(R.h.shake_report_tab_friend));
      this.naB = ((ImageView)findViewById(R.h.shake_report_tab_music));
      this.naC = ((ImageView)findViewById(R.h.shake_report_tab_tv));
      this.naD = ((ImageView)findViewById(R.h.shake_report_tab_card));
      this.naG = ((TextView)findViewById(R.h.shake_report_tab_card_tv));
      this.naF = ((ImageView)findViewById(R.h.shake_report_tab_card_red_dot));
      this.naE = ((ImageView)findViewById(R.h.shake_report_tab_music_red_dot));
      bvu();
      this.naS.setOnClickListener((View.OnClickListener)localObject);
      findViewById(R.h.shake_report_tab_ibeacon_ll).setOnClickListener((View.OnClickListener)localObject);
      findViewById(R.h.shake_report_tab_friend_ll).setOnClickListener((View.OnClickListener)localObject);
      findViewById(R.h.shake_report_tab_music_ll).setOnClickListener((View.OnClickListener)localObject);
      findViewById(R.h.shake_report_tab_tv_ll).setOnClickListener((View.OnClickListener)localObject);
      findViewById(R.h.shake_report_tab_card_ll).setOnClickListener((View.OnClickListener)localObject);
      com.tencent.mm.sdk.b.a.sFg.b(this.nbe);
      com.tencent.mm.sdk.b.a.sFg.b(this.nbf);
      bvq();
      bvt();
      bvy();
      return;
      if (bool2) {
        break;
      }
      Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler()
      {
        public final boolean queueIdle()
        {
          com.tencent.mm.ui.base.s.a(ShakeReportUI.this, 0, ShakeReportUI.this.getString(R.l.shake_set_mute_tips));
          au.HU();
          com.tencent.mm.model.c.DT().set(4117, Boolean.valueOf(true));
          return false;
        }
      });
      break;
    }
  }
  
  public final void m(String paramString, Bitmap paramBitmap)
  {
    if ((paramString == null) || (paramBitmap == null) || (paramBitmap.isRecycled())) {}
    while ((this.nas == null) || (this.nas.getTag() == null) || (!paramString.equals((String)this.nas.getTag()))) {
      return;
    }
    this.nas.setImageBitmap(paramBitmap);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    }
    do
    {
      do
      {
        return;
      } while (paramIntent == null);
      Intent localIntent = new Intent();
      localIntent.putExtra("CropImageMode", 4);
      localIntent.putExtra("CropImage_Filter", true);
      localIntent.putExtra("CropImage_DirectlyIntoFilter", true);
      StringBuilder localStringBuilder = new StringBuilder();
      au.HU();
      localIntent.putExtra("CropImage_OutputPath", com.tencent.mm.model.c.Gb() + "custom_shake_img_filename.jpg");
      com.tencent.mm.plugin.shake.a.ezn.a(localIntent, 2, this, paramIntent);
      return;
    } while (paramIntent == null);
    paramIntent = paramIntent.getStringExtra("CropImage_OutputPath");
    au.HU();
    com.tencent.mm.model.c.DT().set(4110, Boolean.valueOf(false));
    au.HU();
    com.tencent.mm.model.c.DT().set(4111, paramIntent);
    bvn();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(R.l.shake_report_title);
    lF(getResources().getColor(R.e.dark_actionbar_color));
    cqh();
    this.cXl = com.tencent.mm.modelgeo.c.OB();
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sPK, "");
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sPL, "");
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sSf, "");
    this.naS = findViewById(R.h.shake_report_tab_ibeacon_first_ll);
    paramBundle = bl.IC();
    Object localObject1 = bi.oV(paramBundle.dDf);
    Object localObject2 = bi.oV(paramBundle.dDe);
    paramBundle = com.tencent.mm.k.g.AU().G("IBeacon", "GatedLaunch");
    int i;
    int j;
    if (!bi.oW(paramBundle))
    {
      this.naY = false;
      this.naZ = false;
      if (paramBundle != null) {}
      try
      {
        paramBundle = new JSONObject(paramBundle);
        i = paramBundle.getInt("gatedlaunch");
        au.HX();
        if (i == 0) {
          break label473;
        }
        if (i != 1) {
          break label311;
        }
        paramBundle = paramBundle.getJSONArray("citylist");
        k = paramBundle.length();
        i = 0;
      }
      catch (JSONException paramBundle)
      {
        for (;;)
        {
          try
          {
            int k;
            String str;
            int m;
            label283:
            label311:
            label332:
            ((com.tencent.mm.plugin.shake.b.d)localObject2).field_lvbuffer = (String.valueOf(localObject1[4]) + "," + String.valueOf(localObject1[5]) + "," + String.valueOf(localObject1[6])).getBytes("utf-8");
            ((com.tencent.mm.plugin.shake.b.d)localObject2).field_insertBatch = 2;
            Object localObject3 = com.tencent.mm.plugin.shake.b.m.buC();
            ((com.tencent.mm.plugin.shake.b.e)localObject3).buu();
            ((com.tencent.mm.plugin.shake.b.e)localObject3).a((com.tencent.mm.plugin.shake.b.d)localObject2, true);
            localObject3 = new LinkedList();
            ((List)localObject3).add(localObject2);
            d((List)localObject3, 1L);
            au.HU();
            com.tencent.mm.model.c.DT().a(aa.a.sRQ, "");
            paramBundle = paramBundle + "," + localObject1[4] + localObject1[5] + localObject1[6];
            au.HU();
            com.tencent.mm.model.c.DT().a(aa.a.sRR, paramBundle);
            this.naa = new c(this.mController.tlX);
            this.lAY = new com.tencent.mm.pluginsdk.i.c(this);
            if (!this.lAY.ccS()) {
              com.tencent.mm.ui.base.h.a(this, R.l.shake_not_support, R.l.app_tip, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  ShakeReportUI.this.finish();
                }
              });
            }
            if (com.tencent.mm.plugin.shake.a.ezo != null) {
              com.tencent.mm.plugin.shake.a.ezo.vl();
            }
            y.b(this);
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeReportUI", "%s", new Object[] { getResources().getDisplayMetrics().toString() });
            i = com.tencent.mm.plugin.shake.b.m.buD().axd();
            com.tencent.mm.plugin.report.service.h.mEJ.h(11317, new Object[] { Integer.valueOf(i), e.bvA() });
            com.tencent.mm.plugin.report.service.h.mEJ.h(11710, new Object[] { Integer.valueOf(1) });
            com.tencent.mm.plugin.report.service.h.mEJ.e(834L, 0L, 1L);
            return;
            if (i != 4) {
              continue;
            }
            this.naY = true;
            this.naZ = true;
            continue;
            paramBundle = paramBundle;
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ShakeReportUI", "[shakezb]parse dymanic setting json fail!!");
            this.naY = false;
            this.naZ = false;
            continue;
            this.nbb = 1;
            continue;
            com.tencent.mm.plugin.report.service.h.mEJ.h(13139, new Object[] { localObject1, localObject2, Integer.valueOf(0), Integer.valueOf(this.nbb), Integer.valueOf(i), Integer.valueOf(j) });
            continue;
            if (paramBundle == null) {
              continue;
            }
            paramBundle.getState();
          }
          catch (UnsupportedEncodingException localUnsupportedEncodingException)
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ShakeReportUI", "[kevinkma]parst shakeItem error!");
            continue;
          }
          initView();
          continue;
          j = 0;
          continue;
          i = 0;
          continue;
          i += 1;
        }
      }
      if (i < k)
      {
        localObject3 = paramBundle.getJSONObject(i);
        str = ((JSONObject)localObject3).getString("province");
        j = ((JSONObject)localObject3).getInt("allgatedlaunch");
        if ((str.equals(localObject1)) && (j == 1))
        {
          this.naY = true;
          break label1543;
        }
        if ((!str.equals(localObject1)) || (j != 0)) {
          break label1543;
        }
        localObject3 = ((JSONObject)localObject3).getJSONArray("cities");
        m = ((JSONArray)localObject3).length();
        j = 0;
        if (j >= m) {
          break label1543;
        }
        if (!((JSONArray)localObject3).getString(j).equals(localObject2)) {
          break label1555;
        }
        this.naY = true;
        break label1555;
        if (i == 2)
        {
          paramBundle = paramBundle.getJSONArray("citylist");
          k = paramBundle.length();
          i = 0;
          if (i >= k) {
            break label473;
          }
          localObject3 = paramBundle.getJSONObject(i);
          str = ((JSONObject)localObject3).getString("province");
          j = ((JSONObject)localObject3).getInt("allgatedlaunch");
          if ((str.equals(localObject1)) && (j == 1))
          {
            this.naZ = true;
            this.naY = true;
            break label1562;
          }
          if ((!str.equals(localObject1)) || (j != 0)) {
            break label1562;
          }
          localObject3 = ((JSONObject)localObject3).getJSONArray("cities");
          m = ((JSONArray)localObject3).length();
          j = 0;
        }
      }
    }
    for (;;)
    {
      if (j < m)
      {
        if (!((JSONArray)localObject3).getString(j).equals(localObject2)) {
          break label1569;
        }
        this.naZ = true;
        this.naY = true;
        break label1569;
        if (i == 3)
        {
          this.naY = true;
          this.naZ = false;
          label473:
          if (au.HX())
          {
            au.HU();
            if (((Integer)com.tencent.mm.model.c.DT().get(aa.a.sRX, Integer.valueOf(0))).intValue() == 1) {
              this.nba = true;
            }
          }
          paramBundle = BluetoothAdapter.getDefaultAdapter();
          boolean bool = ad.getContext().getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
          if ((paramBundle == null) || (!bool) || (Build.VERSION.SDK_INT < 18) || (paramBundle.getState() != 12)) {
            break label1434;
          }
          this.nbb = 0;
          if ((paramBundle == null) || (paramBundle.getState() != 12)) {
            break label1538;
          }
          i = 1;
          if (!bool) {
            break label1533;
          }
          j = 1;
          if (!this.naY) {
            break label1442;
          }
          com.tencent.mm.plugin.report.service.h.mEJ.h(13139, new Object[] { localObject1, localObject2, Integer.valueOf(1), Integer.valueOf(this.nbb), Integer.valueOf(i), Integer.valueOf(j) });
          if ((this.nba) || (this.naY))
          {
            this.naX = true;
            this.naS = findViewById(R.h.shake_report_tab_ibeacon_ll);
            if (this.naZ)
            {
              if ((paramBundle != null) && (paramBundle.getState() == 12)) {
                break label1500;
              }
              this.naX = false;
            }
          }
          paramBundle = com.tencent.mm.plugin.shake.b.m.buH();
          if (paramBundle.htB == null) {
            paramBundle.htB = new ArrayList();
          }
          if (this != null) {
            paramBundle.htB.add(new WeakReference(this));
          }
          paramBundle = Boolean.valueOf(false);
          long l3 = bi.VE();
          long l2 = 0L;
          long l1 = 0L;
          if (au.HX())
          {
            au.HU();
            com.tencent.mm.model.c.DT().a(aa.a.sRU, Boolean.valueOf(true));
            au.HU();
            bool = bi.a((Boolean)com.tencent.mm.model.c.DT().get(aa.a.sRS, null), false);
            au.HU();
            l2 = bi.a((Long)com.tencent.mm.model.c.DT().get(aa.a.sRT, null), 0L);
            au.HU();
            l1 = bi.a((Long)com.tencent.mm.model.c.DT().get(aa.a.sRN, null), 0L);
            paramBundle = Boolean.valueOf(bool);
          }
          if ((!paramBundle.booleanValue()) || (l3 - l2 >= l1)) {
            break label1526;
          }
          this.naH = 5;
          this.naX = true;
          this.mZV = true;
          initView();
          bvo();
          au.HU();
          paramBundle = bi.aG((String)com.tencent.mm.model.c.DT().get(aa.a.sRR, null), "");
          au.HU();
          localObject1 = bi.aG((String)com.tencent.mm.model.c.DT().get(aa.a.sRQ, null), "");
          if ((localObject1 != null) && (!((String)localObject1).equals("")))
          {
            localObject1 = ((String)localObject1).split(",");
            localObject2 = new com.tencent.mm.plugin.shake.b.d();
            ((com.tencent.mm.plugin.shake.b.d)localObject2).field_type = 11;
            ((com.tencent.mm.plugin.shake.b.d)localObject2).field_username = localObject1[0];
            ((com.tencent.mm.plugin.shake.b.d)localObject2).field_nickname = localObject1[0];
            ((com.tencent.mm.plugin.shake.b.d)localObject2).field_signature = localObject1[1];
            ((com.tencent.mm.plugin.shake.b.d)localObject2).field_province = localObject1[2];
            ((com.tencent.mm.plugin.shake.b.d)localObject2).field_city = localObject1[3];
            ((com.tencent.mm.plugin.shake.b.d)localObject2).field_sex = 1;
          }
        }
        label1434:
        label1442:
        label1500:
        label1526:
        label1533:
        label1538:
        label1543:
        paramBundle = null;
        break;
        label1555:
        j += 1;
        break label283;
      }
      label1562:
      i += 1;
      break label332;
      label1569:
      j += 1;
    }
  }
  
  protected void onDestroy()
  {
    if ((this.naw != null) && (!this.naw.isRecycled())) {
      this.naw.recycle();
    }
    if ((this.nax != null) && (this.nax.isShowing()))
    {
      this.nax.dismiss();
      this.nax = null;
    }
    if (this.nab.mWP != null) {
      this.nab.mWP.bup();
    }
    if (this.lAY != null)
    {
      this.lAY.aDc();
      this.lAY = null;
    }
    Object localObject = com.tencent.mm.plugin.shake.d.a.j.a(null);
    if (com.tencent.mm.plugin.shake.d.a.j.lkO)
    {
      com.tencent.mm.plugin.shake.d.a.j.lkO = false;
      if (!((com.tencent.mm.plugin.shake.d.a.j)localObject).mYR.bvd()) {
        com.tencent.mm.sdk.platformtools.x.e("Micromsg.ShakeMusicMgr", "release MusicFingerPrintRecorder error");
      }
    }
    com.tencent.mm.plugin.shake.d.a.j.mYS = null;
    y.c(this);
    com.tencent.mm.sdk.b.a.sFg.c(this.nbe);
    com.tencent.mm.sdk.b.a.sFg.c(this.nbf);
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sRU, Boolean.valueOf(false));
    bvm();
    if (com.tencent.mm.plugin.shake.c.c.a.bvb()) {
      com.tencent.mm.s.c.Cp().v(262154, false);
    }
    bvs();
    localObject = com.tencent.mm.plugin.shake.b.m.buH();
    if ((((com.tencent.mm.plugin.shake.c.a.f)localObject).htB == null) || (this == null)) {}
    label329:
    for (;;)
    {
      localObject = com.tencent.mm.plugin.shake.b.m.buI();
      ((com.tencent.mm.plugin.shake.c.a.d)localObject).cXm = -85.0F;
      ((com.tencent.mm.plugin.shake.c.a.d)localObject).cXn = -1000.0F;
      if (this.cXl != null) {
        this.cXl.c(this.cXs);
      }
      super.onDestroy();
      return;
      int i = 0;
      for (;;)
      {
        if (i >= ((com.tencent.mm.plugin.shake.c.a.f)localObject).htB.size()) {
          break label329;
        }
        WeakReference localWeakReference = (WeakReference)((com.tencent.mm.plugin.shake.c.a.f)localObject).htB.get(i);
        if (localWeakReference != null)
        {
          com.tencent.mm.plugin.shake.c.a.f.a locala = (com.tencent.mm.plugin.shake.c.a.f.a)localWeakReference.get();
          if ((locala != null) && (locala.equals(this)))
          {
            ((com.tencent.mm.plugin.shake.c.a.f)localObject).htB.remove(localWeakReference);
            break;
          }
        }
        i += 1;
      }
    }
  }
  
  protected void onPause()
  {
    au.HU();
    com.tencent.mm.model.c.b(this);
    au.HU();
    com.tencent.mm.model.c.DT().b(this);
    com.tencent.mm.plugin.shake.b.m.buC().d(this);
    if (this.nab.mWP != null) {
      this.nab.mWP.pause();
    }
    this.mZX = false;
    if (this.lAY != null) {
      this.lAY.aDc();
    }
    this.naa.bvj();
    if (this.naH != 5)
    {
      au.HU();
      com.tencent.mm.model.c.DT().set(327696, this.naH);
    }
    if (this.naH == 4) {
      hE(false);
    }
    bvm();
    super.onPause();
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    int i;
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0)) {
      if (paramArrayOfInt == null)
      {
        i = -1;
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ShakeReportUI", "summerper onRequestPermissionsResult, grantResults length is:%d requestCode:%d, permissions:%s, stack:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), paramArrayOfString, bi.cjd() });
      }
    }
    do
    {
      return;
      i = paramArrayOfInt.length;
      break;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeReportUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
      switch (paramInt)
      {
      default: 
        return;
      case 64: 
        if (paramArrayOfInt[0] != 0) {
          break label201;
        }
        bpD();
        return;
      }
    } while (paramArrayOfInt[0] == 0);
    com.tencent.mm.ui.base.h.a(this, getString(R.l.permission_microphone_request_again_msg), getString(R.l.permission_tips_title), getString(R.l.jump_to_settings), getString(R.l.cancel), false, new ShakeReportUI.19(this), new ShakeReportUI.20(this));
    return;
    label201:
    this.eLU = false;
    com.tencent.mm.ui.base.h.a(this, getString(R.l.permission_location_request_again_msg), getString(R.l.permission_tips_title), getString(R.l.jump_to_settings), getString(R.l.cancel), false, new ShakeReportUI.21(this), new ShakeReportUI.23(this));
  }
  
  protected void onResume()
  {
    super.onResume();
    if (this.eLU)
    {
      boolean bool = com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.ACCESS_COARSE_LOCATION", 64, "", "");
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeReportUI", "summerper checkPermission checkposition[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bi.cjd(), this });
      if (bool) {}
    }
    else
    {
      return;
    }
    bpD();
  }
  
  static final class a
    extends com.tencent.mm.pluginsdk.i.c.a
  {
    private final long[] eyq = { 300L, 200L, 300L, 200L };
    private long hmb = bi.VG();
    private Vibrator hni;
    WeakReference<ShakeReportUI> nbn;
    
    public a(ShakeReportUI paramShakeReportUI)
    {
      this.nbn = new WeakReference(paramShakeReportUI);
    }
    
    public final void biM()
    {
      ShakeReportUI localShakeReportUI = (ShakeReportUI)this.nbn.get();
      if (localShakeReportUI == null) {
        return;
      }
      if (localShakeReportUI.isFinishing())
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ShakeReportUI", "ui finished");
        return;
      }
      if (!ShakeReportUI.u(localShakeReportUI))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeReportUI", "tryShake the status is can's shake");
        return;
      }
      ShakeReportUI.v(localShakeReportUI);
      long l = bi.bI(this.hmb);
      if (l < 1200L)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeReportUI", "tryStartShake delay too short:" + l);
        return;
      }
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ShakeReportUI", "tryStartShake delaytoo enough:" + l);
      this.hmb = bi.VG();
      Object localObject;
      if (ShakeReportUI.w(localShakeReportUI) != null)
      {
        localObject = ShakeReportUI.w(localShakeReportUI);
        if (((c)localObject).view != null) {
          ((c)localObject).view.setKeepScreenOn(true);
        }
        ((c)localObject).bAZ.J(30000L, 30000L);
      }
      if (ShakeReportUI.q(localShakeReportUI) != null)
      {
        localObject = ShakeReportUI.q(localShakeReportUI);
        if (((com.tencent.mm.pluginsdk.ui.f)localObject).kXg != null) {
          ((com.tencent.mm.pluginsdk.ui.f)localObject).kXg.dismiss();
        }
      }
      if (ShakeReportUI.x(localShakeReportUI))
      {
        localObject = (ShakeReportUI)this.nbn.get();
        if (localObject != null) {
          as.I((Context)localObject, R.l.shake_sound_male);
        }
      }
      for (;;)
      {
        reset();
        ShakeReportUI.y(localShakeReportUI);
        return;
        localObject = (ShakeReportUI)this.nbn.get();
        if (localObject != null)
        {
          if (this.hni == null) {
            this.hni = ((Vibrator)((ShakeReportUI)localObject).getSystemService("vibrator"));
          }
          if (this.hni != null) {
            this.hni.vibrate(this.eyq, -1);
          }
        }
      }
    }
    
    public final void onRelease() {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/ui/ShakeReportUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */