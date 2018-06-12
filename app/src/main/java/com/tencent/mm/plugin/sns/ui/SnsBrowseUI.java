package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.gj;
import com.tencent.mm.g.a.gj.b;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.pluginsdk.model.t;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.tools.MMGestureGallery;
import com.tencent.mm.ui.tools.f.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@com.tencent.mm.ui.base.a(3)
public class SnsBrowseUI
  extends SnsBaseGalleryUI
  implements t.a
{
  private String bNH;
  private int bPz = 0;
  Bundle hDg;
  private boolean hDh = false;
  com.tencent.mm.ui.tools.f hDi;
  private int hDj = 0;
  private int hDk = 0;
  private int hDl = 0;
  private int hDm = 0;
  private int hmV = 0;
  private int hmW = 0;
  private ImageView jdG;
  private com.tencent.mm.sdk.platformtools.ag mHandler = new com.tencent.mm.sdk.platformtools.ag();
  private t nTA;
  private int nTB;
  private int nTC;
  private int nTD = 0;
  private float nTE = 1.0F;
  private int nTF = 0;
  private int nTG = 0;
  private int nTw = 0;
  private boolean nTx = false;
  private boolean nTy = false;
  private boolean nTz = false;
  
  public final void aun() {}
  
  public final void ayH()
  {
    int n = this.hDl;
    int i = this.hDm;
    int m = this.hDk;
    int k = this.hDj;
    if (!this.nTy)
    {
      localObject = new gj();
      ((gj)localObject).bPx.bPA = this.nTu.getGallery().getSelectedItemPosition();
      ((gj)localObject).bPx.bPz = this.bPz;
      com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
      n = ((gj)localObject).bPy.bId;
      i = ((gj)localObject).bPy.bIe;
      m = ((gj)localObject).bPy.bIb;
      k = ((gj)localObject).bPy.bIc;
    }
    this.nTB = this.nTu.getWidth();
    this.nTC = this.nTu.getHeight();
    af.byl();
    Object localObject = com.tencent.mm.plugin.sns.model.g.C(this.nTu.getCntMedia());
    int j = i;
    if (localObject != null)
    {
      localObject = com.tencent.mm.sdk.platformtools.c.VZ((String)localObject);
      float f = this.nTB / ((BitmapFactory.Options)localObject).outWidth;
      this.nTC = ((int)(((BitmapFactory.Options)localObject).outHeight * f));
      j = i;
      if (this.nTC > this.nTu.getHeight())
      {
        j = i;
        if (this.nTC < this.nTu.getHeight() * 2.5D)
        {
          this.nTD = (this.nTC - this.nTu.getHeight());
          j = i;
          if (this.nTu.getCount() == 1)
          {
            j = i * this.nTu.getHeight() / this.nTC;
            this.nTD = 0;
          }
        }
        this.nTC = this.nTu.getHeight();
      }
    }
    this.hDi.fh(this.nTB, this.nTC);
    this.hDi.u(m, k, n, j);
    if (this.nTE != 1.0D)
    {
      this.hDi.uzR = (1.0F / this.nTE);
      if ((this.nTF != 0) || (this.nTG != 0))
      {
        i = (int)(this.nTu.getWidth() / 2 * (1.0F - this.nTE));
        j = this.nTF;
        k = (int)(this.nTu.getHeight() / 2 + this.nTG - this.nTC / 2 * this.nTE);
        this.hDi.fi(i + j, k);
      }
    }
    this.hDi.nJY = this.nTD;
    this.hDi.a(this.nTu, this.jdG, new SnsBrowseUI.4(this), new f.a()
    {
      public final void v(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4)
      {
        if ((SnsBrowseUI.this.nTu.getGallery() != null) && (Build.VERSION.SDK_INT >= 18)) {
          SnsBrowseUI.this.nTu.getGallery().setClipBounds(new Rect(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4));
        }
      }
    });
  }
  
  public final void bCZ()
  {
    Gallery localGallery = this.nTu.getGallery();
    if ((localGallery instanceof MMGestureGallery)) {
      ((MMGestureGallery)localGallery).setGalleryScaleListener(new SnsBrowseUI.6(this, localGallery));
    }
  }
  
  public final void ci(String paramString, int paramInt)
  {
    x.i("MicroMsg.SnsPopMediasUI", "[notifyData] opType:%s reset:%s localId;%s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(true), paramString });
    if (this.nTu != null) {
      this.nTu.aKx();
    }
  }
  
  public final void cj(String paramString, int paramInt)
  {
    this.nTw = paramInt;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      x.d("MicroMsg.SnsPopMediasUI", "dispatchKeyEvent");
      setResult(-1, new Intent());
      ayH();
      return true;
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  protected final int getForceOrientation()
  {
    return 2;
  }
  
  protected final int getLayoutId()
  {
    return i.g.sns_browse_img;
  }
  
  protected final void initView()
  {
    this.hDi = new com.tencent.mm.ui.tools.f(this.mController.tml);
    this.hDh = false;
    Object localObject1 = bi.aG(getIntent().getStringExtra("sns_gallery_userName"), "");
    this.bNH = bi.aG(getIntent().getStringExtra("sns_gallery_localId"), "");
    this.nTw = getIntent().getIntExtra("sns_gallery_position", 0);
    this.bPz = getIntent().getIntExtra("sns_position", 0);
    this.nTx = getIntent().getBooleanExtra("k_is_from_sns_main_timeline", false);
    this.nTy = getIntent().getBooleanExtra("k_is_from_sns_msg_ui", false);
    this.nTz = getIntent().getBooleanExtra("sns_soon_enter_photoedit_ui", false);
    n localn = af.byo().Nl(this.bNH);
    this.jdG = ((ImageView)findViewById(i.f.gallery_bg));
    this.jdG.setLayerType(2, null);
    this.nTu = new SnsInfoFlip(this);
    this.nTu.setLayerType(2, null);
    this.nTu.setIsFromMainTimeline(this.nTx);
    this.nTu.setNeedScanImage(true);
    Object localObject2 = aj.Mn(this.bNH);
    this.nTu.setShowPageControl(true);
    this.nTu.setOreitaion(true);
    this.nTu.setTouchFinish(true);
    this.nTu.setInfoType(localn.field_type);
    this.nTu.setIsSoonEnterPhotoEditUI(this.nTz);
    this.nTu.a((List)localObject2, (String)localObject1, this.nTw, this.nTp, this);
    localObject1 = this.nTu;
    localObject2 = com.tencent.mm.storage.av.clT();
    ((com.tencent.mm.storage.av)localObject2).time = localn.field_createTime;
    ((SnsInfoFlip)localObject1).setFromScene((com.tencent.mm.storage.av)localObject2);
    addView(this.nTu);
    if ((localn != null) && (localn.xb(32))) {
      this.nTu.setIsAd(true);
    }
    this.nTv = ((Button)findViewById(i.f.game_more_button));
    localObject2 = localn.bAJ();
    if (localObject2 != null)
    {
      localObject1 = ((bsu)localObject2).nsB;
      ay localay = new ay();
      ag.a(this, localay, ((bsu)localObject2).nsB);
      if (!localay.ofl) {
        break label479;
      }
      this.nTv.setVisibility(0);
      this.nTv.setText(localay.ofm);
      this.nTv.setOnClickListener(new SnsBrowseUI.2(this, (com.tencent.mm.protocal.c.av)localObject1, (bsu)localObject2));
      label424:
      if (com.tencent.mm.plugin.sns.lucky.a.m.h(localn)) {
        break label491;
      }
      x.e("MicroMsg.SnsPopMediasUI", "error see photo !! " + localn.field_userName + " " + localn.field_snsId);
      finish();
    }
    label479:
    label491:
    while ((localn.field_type != 21) || (localn.field_userName.equals(q.GF())))
    {
      return;
      localObject1 = null;
      break;
      this.nTv.setVisibility(8);
      break label424;
    }
    this.nTA = new t(com.tencent.mm.compatible.util.e.bnC + "/Pictures/Screenshots/", new SnsBrowseUI.1(this));
    this.nTA.start();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    x.i("MicroMsg.SnsPopMediasUI", "onAcvityResult requestCode:" + paramInt1);
    if (paramInt2 != -1) {}
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    if (getIntent().getExtras() != null) {
      getIntent().getExtras().setClassLoader(getClass().getClassLoader());
    }
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().setFlags(1024, 1024);
    }
    initView();
    this.hDg = paramBundle;
  }
  
  public void onDestroy()
  {
    int j;
    SnsInfoFlip localSnsInfoFlip;
    if (this.nTu != null)
    {
      j = getIntent().getIntExtra("K_ad_scene", -1);
      localSnsInfoFlip = this.nTu;
      localObject1 = this.bNH;
      if (localSnsInfoFlip.nkG)
      {
        if (j >= 0) {
          break label178;
        }
        x.i("MicroMsg.SnsInfoFlip", "pass by scene " + j);
      }
    }
    int i;
    label178:
    n localn;
    do
    {
      localObject1 = com.tencent.mm.modelsns.b.p(getIntent());
      if (localObject1 != null)
      {
        this.nTu.getSelectCount();
        i = this.nTu.getNumOfFileExist();
        ((com.tencent.mm.modelsns.b)localObject1).ir(this.nTu.getCount()).ir(i);
        ((com.tencent.mm.modelsns.b)localObject1).update();
        ((com.tencent.mm.modelsns.b)localObject1).RD();
      }
      this.nTu.bDr();
      this.nTu.onDestroy();
      af.byl().H(this);
      if (this.nTx) {
        this.nTu.bDt();
      }
      if (this.nTA != null) {
        this.nTA.stop();
      }
      super.onDestroy();
      return;
      localn = af.byo().Nl((String)localObject1);
    } while (localn == null);
    long l1;
    long l2;
    if (localSnsInfoFlip.nXa >= 0)
    {
      if (!localSnsInfoFlip.nWC.containsKey(Integer.valueOf(localSnsInfoFlip.nXa))) {
        break label592;
      }
      l1 = ((Long)localSnsInfoFlip.nWC.get(Integer.valueOf(localSnsInfoFlip.nXa))).longValue();
      if (l1 > 0L)
      {
        if (!localSnsInfoFlip.nWD.containsKey(Integer.valueOf(localSnsInfoFlip.nXa))) {
          break label598;
        }
        l2 = ((Long)localSnsInfoFlip.nWD.get(Integer.valueOf(localSnsInfoFlip.nXa))).longValue();
        label294:
        l1 = bi.bI(l1);
        l2 += l1;
        localSnsInfoFlip.nWD.put(Integer.valueOf(localSnsInfoFlip.nXa), Long.valueOf(l2));
        x.i("MicroMsg.SnsInfoFlip", "lastSelectPosition " + localSnsInfoFlip.nXa + " curtime " + l2 + " passtime " + l1);
      }
    }
    Object localObject2 = localn.bBp();
    StringBuffer localStringBuffer = new StringBuffer();
    Object localObject1 = new StringBuffer();
    localStringBuffer.append("<desc>");
    Iterator localIterator = localSnsInfoFlip.nWB.keySet().iterator();
    label428:
    if (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      int k = ((Integer)localSnsInfoFlip.nWB.get(localInteger)).intValue();
      if (localSnsInfoFlip.nWD.containsKey(localInteger)) {}
      for (i = (int)(((Long)localSnsInfoFlip.nWD.get(localInteger)).longValue() * 1L);; i = 0)
      {
        localStringBuffer.append(String.format("<item><id>%d</id><duration>%d</duration><count>%d</count></item>", new Object[] { localInteger, Integer.valueOf(i), Integer.valueOf(k) }));
        ((StringBuffer)localObject1).append(String.format("%d|%d|%d", new Object[] { localInteger, Integer.valueOf(i), Integer.valueOf(k) }) + "&");
        break label428;
        label592:
        l1 = 0L;
        break;
        label598:
        l2 = 0L;
        break label294;
      }
    }
    localStringBuffer.append("</desc>");
    localObject1 = ((StringBuffer)localObject1).toString();
    if (((String)localObject1).endsWith("&")) {
      localObject1 = ((String)localObject1).substring(0, ((String)localObject1).length() - 1);
    }
    for (;;)
    {
      if ((localn == null) || (!localn.bzx())) {
        af.byi().h(12014, new Object[] { com.tencent.mm.plugin.sns.a.b.f.a(localn.field_snsId, new Object[] { com.tencent.mm.plugin.sns.data.i.eF(localn.field_snsId), localn.bBo(), Integer.valueOf(j), Long.valueOf(localSnsInfoFlip.nWS), Long.valueOf(System.currentTimeMillis()), localObject1, Integer.valueOf(localSnsInfoFlip.getCount()) }) });
      }
      if (((com.tencent.mm.plugin.sns.storage.e)localObject2).bAF().nzp != 1)
      {
        localObject2 = new com.tencent.mm.plugin.sns.a.b.c(localn.bBn(), 6, j, localStringBuffer.toString(), localn.bBr(), localn.bAK());
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Eh().dpP.a((l)localObject2, 0);
      }
      localObject2 = com.tencent.mm.modelsns.b.io(729);
      ((com.tencent.mm.modelsns.b)localObject2).nb(com.tencent.mm.plugin.sns.data.i.eF(localn.field_snsId)).nb(localn.bBo()).ir(j).nb(localSnsInfoFlip.nWS).nb(System.currentTimeMillis()).nb((String)localObject1).ir(localSnsInfoFlip.getCount());
      ((com.tencent.mm.modelsns.b)localObject2).RD();
      break;
    }
  }
  
  protected void onPause()
  {
    if (this.nTu != null) {
      this.nTu.onPause();
    }
    super.onPause();
    com.tencent.mm.plugin.webview.ui.tools.widget.m.Bk(2);
  }
  
  public void onResume()
  {
    super.onResume();
    if (this.nTu != null) {
      this.nTu.aKx();
    }
    com.tencent.mm.plugin.webview.ui.tools.widget.m.Bk(1);
  }
  
  public void onStart()
  {
    Bundle localBundle = this.hDg;
    if (!this.hDh)
    {
      this.hDh = true;
      if (Build.VERSION.SDK_INT >= 12)
      {
        this.hDj = getIntent().getIntExtra("img_gallery_top", 0);
        this.hDk = getIntent().getIntExtra("img_gallery_left", 0);
        this.hDl = getIntent().getIntExtra("img_gallery_width", 0);
        this.hDm = getIntent().getIntExtra("img_gallery_height", 0);
        this.hDi.u(this.hDk, this.hDj, this.hDl, this.hDm);
        if (localBundle == null) {
          this.nTu.getViewTreeObserver().addOnPreDrawListener(new SnsBrowseUI.3(this));
        }
      }
    }
    super.onStart();
    x.d("MicroMsg.SnsPopMediasUI", "onStart ");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsBrowseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */