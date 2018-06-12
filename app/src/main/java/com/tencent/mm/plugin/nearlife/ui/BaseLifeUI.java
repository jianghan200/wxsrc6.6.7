package com.tencent.mm.plugin.nearlife.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.l;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.model.au;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.aqr;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.LatLongData;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMLoadMoreListView;
import com.tencent.mm.ui.base.MMLoadMoreListView.a;
import com.tencent.mm.ui.tools.o.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class BaseLifeUI
  extends MMActivity
  implements com.tencent.mm.ab.e
{
  boolean cXo = false;
  boolean dJO = false;
  protected boolean dSc = true;
  private com.tencent.mm.ui.tools.o eMS;
  boolean eMT = false;
  protected String fuu = "";
  private int kCL = 1;
  public int kIW = -1;
  MMLoadMoreListView kIo;
  protected String kJG = "";
  private String lCU = "";
  private boolean lCb = false;
  protected int lDA = 0;
  protected boolean lDB = false;
  protected int lDC = -1;
  protected boolean lDD = false;
  private View.OnClickListener lDE = new BaseLifeUI.1(this);
  private View.OnClickListener lDF = new BaseLifeUI.2(this);
  private a.a lDG = new BaseLifeUI.7(this);
  private View lDh;
  private NearLifeErrorContent lDi;
  private a lDj;
  private a lDk;
  private View lDl;
  private TextView lDm;
  private TextView lDn;
  private com.tencent.mm.modelgeo.c lDo = com.tencent.mm.modelgeo.c.OB();
  private com.tencent.mm.plugin.nearlife.b.c lDp;
  private int lDq;
  private List<aqr> lDr;
  protected aqr lDs = null;
  protected float lDt = 0.0F;
  protected float lDu = 0.0F;
  protected int lDv = 0;
  protected float lDw = 0.0F;
  protected long lDx = -1L;
  protected long lDy = -1L;
  protected long lDz = -1L;
  int sceneType = 0;
  
  private void bje()
  {
    if (!this.eMT) {
      x.i("MicroMsg.BaseLifeUI", "is not Search mode pass createpoi");
    }
    for (;;)
    {
      return;
      try
      {
        i = Integer.valueOf(com.tencent.mm.k.g.AT().getValue("POICreateForbiden")).intValue();
        x.i("MicroMsg.BaseLifeUI", "getDynamicConfig createpoi %d", new Object[] { Integer.valueOf(i) });
        if (i == 1) {}
      }
      catch (Exception localException)
      {
        int i;
        Object localObject;
        String str;
        for (;;) {}
      }
    }
    localObject = this.lDk;
    str = this.lDk.biZ().trim();
    localObject = ((a)localObject).lCY.iterator();
    do
    {
      if (!((Iterator)localObject).hasNext()) {
        break;
      }
    } while (!str.equals(((com.tencent.mm.plugin.nearlife.b.a)((Iterator)localObject).next()).bHD.trim()));
    for (i = 1; i == 0; i = 0)
    {
      str = String.format(getResources().getString(R.l.nl_create_poi_tips), new Object[] { this.lDk.biZ() });
      this.lDm.setText(str);
      tV(0);
      return;
    }
    tV(8);
  }
  
  private boolean gR(boolean paramBoolean)
  {
    aqr localaqr;
    do
    {
      if (this.lDp != null)
      {
        x.d("MicroMsg.BaseLifeUI", "scene is doing...");
        return false;
      }
      if (this.lDr.size() - 1 <= this.lDq)
      {
        this.lDq = -1;
        x.i("MicroMsg.BaseLifeUI", "index inc to end, ret");
        return false;
      }
      this.lDq += 1;
      localaqr = (aqr)this.lDr.get(this.lDq);
      if (this.lDq == 0) {
        this.lDA += 1;
      }
      if (!this.eMT) {
        break;
      }
      i = this.lDk.b(new BackwardSupportUtil.ExifHelper.LatLongData(localaqr.rms, localaqr.rmr));
    } while (i <= 0);
    bhy localbhy;
    if (this.eMT)
    {
      localbhy = this.lDk.a(new BackwardSupportUtil.ExifHelper.LatLongData(localaqr.rms, localaqr.rmr));
      label166:
      if (!this.eMT) {
        break label249;
      }
    }
    label249:
    for (int i = 1;; i = 0)
    {
      if (com.tencent.mm.plugin.nearlife.b.c.tS(i)) {
        break label255;
      }
      this.lDq = -1;
      return false;
      i = this.lDj.b(new BackwardSupportUtil.ExifHelper.LatLongData(localaqr.rms, localaqr.rmr));
      break;
      localbhy = this.lDj.a(new BackwardSupportUtil.ExifHelper.LatLongData(localaqr.rms, localaqr.rmr));
      break label166;
    }
    label255:
    if (-1L == this.lDx) {
      this.lDx = System.currentTimeMillis();
    }
    int j = this.sceneType;
    float f1 = localaqr.rmr;
    float f2 = localaqr.rms;
    int k = localaqr.ryV;
    int m = localaqr.ryY;
    String str2 = localaqr.ryW;
    String str3 = localaqr.ryX;
    if (this.eMT) {}
    for (String str1 = this.lDk.biZ();; str1 = "")
    {
      this.lDp = new com.tencent.mm.plugin.nearlife.b.c(i, j, f1, f2, k, m, str2, str3, localbhy, str1, this.kIW, paramBoolean);
      au.DF().a(this.lDp, 0);
      x.i("MicroMsg.BaseLifeUI", "start get lbs life list, index:%d, lat:%f, long:%f", new Object[] { Integer.valueOf(this.lDq), Float.valueOf(localaqr.rms), Float.valueOf(localaqr.rmr) });
      return true;
    }
  }
  
  private void tV(int paramInt)
  {
    this.kIo.removeFooterView(this.lDh);
    this.kIo.removeFooterView(this.lDl);
    MMLoadMoreListView localMMLoadMoreListView = this.kIo;
    localMMLoadMoreListView.removeFooterView(localMMLoadMoreListView.iln);
    this.lDl.setVisibility(paramInt);
    this.lDm.setVisibility(paramInt);
    this.lDn.setVisibility(paramInt);
    if (paramInt == 0)
    {
      this.kIo.addFooterView(this.lDl);
      return;
    }
    localMMLoadMoreListView = this.kIo;
    if (localMMLoadMoreListView.iln == null) {
      localMMLoadMoreListView.crB();
    }
    try
    {
      localMMLoadMoreListView.removeFooterView(localMMLoadMoreListView.iln);
      localMMLoadMoreListView.addFooterView(localMMLoadMoreListView.iln);
      this.kIo.addFooterView(this.lDh);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if (paraml.getType() != 603) {
      return;
    }
    this.kIo.crD();
    com.tencent.mm.plugin.nearlife.b.c localc = (com.tencent.mm.plugin.nearlife.b.c)paraml;
    LogoImageView localLogoImageView;
    Object localObject;
    if (!bi.oW(localc.lCU))
    {
      this.lCU = localc.lCU;
      localLogoImageView = (LogoImageView)this.lDh.findViewById(R.h.pwoer_by_logo_iv);
      localObject = this.lCU;
      au.HU();
      localLogoImageView.imagePath = com.tencent.mm.model.c.Gc();
      localLogoImageView.url = ((String)localObject);
      localLogoImageView.kGn = 0;
      localLogoImageView.kGo = 0;
      if ((localObject != null) && (((String)localObject).length() != 0)) {
        break label168;
      }
      localLogoImageView.setVisibility(8);
    }
    int i;
    for (;;)
    {
      this.fuu = localc.fuu;
      this.kCL = localc.kCL;
      i = ((com.tencent.mm.plugin.nearlife.b.c)paraml).bNI;
      com.tencent.mm.plugin.nearlife.b.c.tT(i);
      if (this.lDp != null) {
        break;
      }
      x.d("MicroMsg.BaseLifeUI", "scene is null");
      return;
      label168:
      if (((String)localObject).startsWith("http"))
      {
        Bitmap localBitmap = BitmapFactory.decodeFile(localLogoImageView.imagePath + com.tencent.mm.a.g.u(((String)localObject).getBytes()));
        if (localBitmap != null)
        {
          localObject = localBitmap;
          if (localLogoImageView.kGn > 0)
          {
            localObject = localBitmap;
            if (localLogoImageView.kGo > 0) {
              localObject = com.tencent.mm.sdk.platformtools.c.a(localBitmap, localLogoImageView.kGn, localLogoImageView.kGo, true, false);
            }
          }
          localLogoImageView.setImageBitmap((Bitmap)localObject);
        }
        else
        {
          com.tencent.mm.sdk.f.e.post(new LogoImageView.a((String)localObject, localLogoImageView.handler), "LogoImageView_download");
        }
      }
      else if (!com.tencent.mm.a.e.cn((String)localObject))
      {
        localLogoImageView.setVisibility(8);
      }
      else
      {
        if ((localLogoImageView.kGn <= 0) || (localLogoImageView.kGo <= 0)) {}
        for (localObject = com.tencent.mm.sdk.platformtools.c.Wb((String)localObject);; localObject = com.tencent.mm.sdk.platformtools.c.e((String)localObject, localLogoImageView.kGn, localLogoImageView.kGo, true))
        {
          if (localObject != null) {
            break label371;
          }
          localLogoImageView.setVisibility(8);
          break;
        }
        label371:
        localLogoImageView.setImageBitmap((Bitmap)localObject);
      }
    }
    x.i("MicroMsg.BaseLifeUI", "onSceneEnd: index:%d, errType=%d, errCode=%d, errMsg=%s opcde %d ", new Object[] { Integer.valueOf(this.lDq), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(i) });
    if ((paramInt2 == 0) || (paramInt2 == 101))
    {
      i = 1;
      if ((paramInt1 == 0) || (i != 0)) {
        break label538;
      }
      x.d("MicroMsg.BaseLifeUI", "error");
      if (!this.eMT) {
        break label530;
      }
      paramString = this.lDk;
      label471:
      if ((this.lDr.size() - 1 == this.lDq) && (paramString.getCount() == 0))
      {
        paramString.lDg = 1;
        this.lDi.tW(paramString.lDg);
      }
    }
    for (;;)
    {
      this.lDp = null;
      gR(false);
      return;
      i = 0;
      break;
      label530:
      paramString = this.lDj;
      break label471;
      label538:
      if (-1L == this.lDy) {
        this.lDy = System.currentTimeMillis();
      }
      this.lDz = System.currentTimeMillis();
      paraml = localc.lCV;
      paramString = (aqr)this.lDr.get(this.lDq);
      localObject = new BackwardSupportUtil.ExifHelper.LatLongData(paramString.rms, paramString.rmr);
      if ((this.eMT) && (!this.lDp.lCW)) {
        this.lDk.biY();
      }
      if (this.eMT)
      {
        this.lDk.a((BackwardSupportUtil.ExifHelper.LatLongData)localObject, localc.biX(), localc.biW());
        label654:
        if ((paraml != null) && (paraml.size() != 0)) {
          break label828;
        }
        if (!this.eMT) {
          break label820;
        }
      }
      label820:
      for (paramString = this.lDk;; paramString = this.lDj)
      {
        if (this.lDr.size() - 1 == this.lDq)
        {
          if (paramString.getCount() == 0) {
            this.lDi.tW(paramString.lDg);
          }
          this.kIo.crD();
          if ((!paramString.bja()) && (paramInt2 != 101)) {
            bje();
          }
        }
        if ((!this.lDj.bja()) && (this.lDh != null) && (!this.eMT)) {
          this.lDh.setVisibility(0);
        }
        if ((this.lDh == null) || (this.eMT)) {
          break label935;
        }
        this.lDh.setVisibility(0);
        break;
        this.lDj.a((BackwardSupportUtil.ExifHelper.LatLongData)localObject, localc.biX(), localc.biW());
        break label654;
      }
      label828:
      if (this.eMT) {}
      for (paramString = this.lDk;; paramString = this.lDj)
      {
        boolean bool = this.lDp.lCW;
        this.kIo.setVisibility(0);
        paramString.lDg = 0;
        this.lDi.tW(this.lDk.lDg);
        paramString.a((BackwardSupportUtil.ExifHelper.LatLongData)localObject, paraml);
        paramString.notifyDataSetChanged();
        if ((this.lDr.size() - 1 != this.lDq) || (paramString.bja())) {
          break;
        }
        this.kIo.crD();
        bje();
        break;
      }
      label935:
      if (this.lDh != null) {
        this.lDh.setVisibility(8);
      }
    }
  }
  
  protected final void a(int paramInt, boolean paramBoolean, String paramString)
  {
    String str2 = paramString;
    if (paramString != null)
    {
      str2 = paramString;
      if (paramString.startsWith("mm_")) {
        str2 = "";
      }
    }
    Object localObject2 = "";
    int i;
    int j;
    label57:
    Object localObject1;
    String str1;
    if (paramInt >= 0) {
      if (paramBoolean)
      {
        i = 3;
        if (this.lDD)
        {
          paramString = h.mEJ;
          if (!paramBoolean) {
            break label377;
          }
          j = 5;
          paramString.h(11139, new Object[] { Integer.valueOf(j) });
        }
        if (!paramBoolean) {
          break label383;
        }
        paramString = this.lDk.tU(paramInt).kJF;
        localObject1 = paramString;
        if (this.lDk.getCount() <= 0) {
          break label496;
        }
        str1 = this.lDk.tU(1).kJG;
        localObject1 = paramString;
        paramString = str1;
      }
    }
    for (;;)
    {
      label124:
      j = i;
      str1 = paramString;
      localObject2 = localObject1;
      if (bi.oW(paramString))
      {
        str1 = this.kJG;
        localObject2 = localObject1;
        j = i;
      }
      if (this.lDs == null) {}
      for (paramString = "null/null";; paramString = String.format("%f/%f", new Object[] { Float.valueOf(this.lDs.rms), Float.valueOf(this.lDs.rmr) }))
      {
        x.d("MicroMsg.BaseLifeUI", "index: %s, bid: %s, index: %s, searchId: %s, requestId: %s", new Object[] { Integer.valueOf(paramInt + 1), str2, Integer.valueOf(paramInt), localObject2, str1 });
        h.mEJ.h(11135, new Object[] { Integer.valueOf(j), Integer.valueOf(paramInt + 1), Long.valueOf(this.lDx), Long.valueOf(this.lDz), Long.valueOf(System.currentTimeMillis()), Long.valueOf(this.lDy), Integer.valueOf(this.lDA), paramString, str2, Integer.valueOf(this.kIW), localObject2, q.zy(), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), str1 });
        return;
        i = 1;
        break;
        label377:
        j = 4;
        break label57;
        label383:
        str1 = this.lDj.tU(paramInt).kJF;
        localObject1 = str1;
        if (this.lDj.getCount() <= 0) {
          break label496;
        }
        paramString = this.lDj.tU(1).kJG;
        localObject1 = str1;
        break label124;
        if (this.lDB) {}
        for (i = 4;; i = 2)
        {
          str1 = "";
          j = i;
          break;
        }
      }
      label496:
      paramString = "";
    }
  }
  
  public abstract a bjb();
  
  public abstract a bjc();
  
  public void bjd()
  {
    x.d("MicroMsg.BaseLifeUI", "init header");
    this.lDl = View.inflate(this, R.i.create_poi_tips_footer, null);
    this.lDm = ((TextView)this.lDl.findViewById(R.h.tv_create_poi_tips));
    this.lDn = ((TextView)this.lDl.findViewById(R.h.tv_create_not_found_poi_tips));
    this.lDl.setOnClickListener(this.lDF);
    this.lDh = View.inflate(this, R.i.power_by_footer, null);
    this.kIo.addFooterView(this.lDh);
    this.lDh.setVisibility(8);
  }
  
  protected int getLayoutId()
  {
    return R.i.near_life_ui;
  }
  
  public final void initView()
  {
    this.kIo = ((MMLoadMoreListView)findViewById(R.h.near_life_list));
    this.kIo.setFooterTips(getString(R.l.near_life_searching));
    this.lDi = ((NearLifeErrorContent)findViewById(R.h.near_life_errcontent));
    bjd();
    this.lDj = bjb();
    this.lDk = bjc();
    this.kIo.setAdapter(this.lDj);
    this.lDi.setListView(this.kIo);
    this.lDj.notifyDataSetChanged();
    setBackBtn(new BaseLifeUI.3(this));
    new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        BackwardSupportUtil.c.a(BaseLifeUI.this.kIo);
      }
    };
    this.eMS = new com.tencent.mm.ui.tools.o((byte)0);
    this.eMS.uBw = new o.b()
    {
      public final void WW()
      {
        x.d("MicroMsg.BaseLifeUI", "search helper onQuitSearch");
        BaseLifeUI.this.eMT = false;
        BaseLifeUI.this.kIo.setAdapter(BaseLifeUI.f(BaseLifeUI.this));
        BaseLifeUI.f(BaseLifeUI.this).notifyDataSetChanged();
        BaseLifeUI.g(BaseLifeUI.this).tW(BaseLifeUI.f(BaseLifeUI.this).lDg);
        if ((!BaseLifeUI.f(BaseLifeUI.this).bja()) && (BaseLifeUI.h(BaseLifeUI.this) != null)) {
          BaseLifeUI.h(BaseLifeUI.this).setVisibility(0);
        }
        BaseLifeUI.this.kIo.setOnTouchListener(null);
        BaseLifeUI.e(BaseLifeUI.this);
        BaseLifeUI.a(BaseLifeUI.this, BaseLifeUI.f(BaseLifeUI.this));
      }
      
      public final void WX()
      {
        x.d("MicroMsg.BaseLifeUI", "search helper onEnterSearch");
        BaseLifeUI.this.lDB = true;
        BaseLifeUI.i(BaseLifeUI.this).setHint(BaseLifeUI.this.getString(R.l.near_life_search_hint));
        BaseLifeUI.this.eMT = true;
        BaseLifeUI.b(BaseLifeUI.this).biY();
        BaseLifeUI.this.kIo.setAdapter(BaseLifeUI.b(BaseLifeUI.this));
        BaseLifeUI.b(BaseLifeUI.this).notifyDataSetChanged();
        BaseLifeUI.this.kIo.crD();
        BaseLifeUI.g(BaseLifeUI.this).tW(BaseLifeUI.b(BaseLifeUI.this).lDg);
        if (BaseLifeUI.h(BaseLifeUI.this) != null) {
          BaseLifeUI.h(BaseLifeUI.this).setVisibility(8);
        }
        BaseLifeUI.this.kIo.setOnTouchListener(new View.OnTouchListener()
        {
          public final boolean onTouch(View paramAnonymous2View, MotionEvent paramAnonymous2MotionEvent)
          {
            BaseLifeUI.this.YC();
            return false;
          }
        });
        BaseLifeUI.a(BaseLifeUI.this, BaseLifeUI.b(BaseLifeUI.this));
      }
      
      public final void WY()
      {
        x.d("MicroMsg.BaseLifeUI", "click clear");
        if (BaseLifeUI.c(BaseLifeUI.this) != null)
        {
          au.DF().c(BaseLifeUI.c(BaseLifeUI.this));
          BaseLifeUI.d(BaseLifeUI.this);
        }
        BaseLifeUI.b(BaseLifeUI.this).biY();
        BaseLifeUI.e(BaseLifeUI.this);
      }
      
      public final void WZ() {}
      
      public final boolean pj(String paramAnonymousString)
      {
        x.d("MicroMsg.BaseLifeUI", "search key click");
        BaseLifeUI.b(BaseLifeUI.this, paramAnonymousString);
        return false;
      }
      
      public final void pk(String paramAnonymousString)
      {
        x.d("MicroMsg.BaseLifeUI", "onSearchBarChange  %s", new Object[] { paramAnonymousString });
        if (bi.oW(paramAnonymousString))
        {
          WY();
          return;
        }
        BaseLifeUI.a(BaseLifeUI.this, paramAnonymousString);
      }
    };
    this.kIo.setOnLoadMoreListener(new MMLoadMoreListView.a()
    {
      public final void aAU()
      {
        BaseLifeUI.a(BaseLifeUI.this);
      }
    });
    this.kIo.crC();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    x.d("MicroMsg.BaseLifeUI", "onActivityResult requestCode %d %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt2 == -1) {}
    switch (paramInt1)
    {
    default: 
      return;
    }
    setResult(-1, paramIntent);
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.kIW = ((int)(System.currentTimeMillis() / 1000L));
    com.tencent.mm.plugin.nearlife.b.c.clear();
    au.DF().a(603, this);
    this.sceneType = getIntent().getIntExtra("near_life_scene", 0);
    this.kJG = getIntent().getStringExtra("request_id");
    this.lDr = new ArrayList();
    initView();
    this.kIo.crE();
    if (this.lDo != null) {
      this.lDo.b(this.lDG);
    }
    this.dJO = false;
  }
  
  protected void onDestroy()
  {
    au.DF().b(603, this);
    super.onDestroy();
    if (this.lDo != null) {
      this.lDo.c(this.lDG);
    }
  }
  
  protected void onPause()
  {
    super.onPause();
    this.lDo.c(this.lDG);
  }
  
  protected void onResume()
  {
    super.onResume();
    this.lDj.notifyDataSetChanged();
    this.lDo.a(this.lDG, true);
  }
  
  public abstract void p(double paramDouble1, double paramDouble2);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/nearlife/ui/BaseLifeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */