package com.tencent.mm.plugin.sns.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager.e;
import android.support.v4.view.u;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.c.f;
import com.tencent.mm.plugin.fav.a.v;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j.4;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j.5;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.z;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e;
import com.tencent.mm.plugin.sns.storage.b.e;
import com.tencent.mm.plugin.sns.storage.b.f;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.protocal.c.bqw;
import com.tencent.mm.protocal.c.bqx;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ak;
import com.tencent.mm.ui.aq;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.widget.snackbar.a.b;
import com.tencent.mm.ui.y;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class SnsAdNativeLandingPagesUI
  extends MMActivity
{
  public static boolean nSm = false;
  String bSZ;
  private long cYb = 0L;
  int egL;
  public String fxE;
  private boolean gUi = false;
  private long grJ = 0L;
  private int hDj = 0;
  private int hDk = 0;
  private int hDl = 0;
  private int hDm = 0;
  private int hmV;
  private int hmW;
  private ImageView hml;
  private com.tencent.mm.remoteservice.d iMQ = new com.tencent.mm.remoteservice.d(com.tencent.mm.sdk.platformtools.ad.getContext());
  String ixy;
  String ixz;
  protected a.b jKu = new SnsAdNativeLandingPagesUI.6(this);
  private ImageView jdG;
  private int nBk;
  int nBm;
  private int nEs = 1000;
  private int nEt = 700;
  private int nEu = 250;
  private View nHH;
  z nHm;
  public LinkedList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c> nRW = new LinkedList();
  private ImageView nRX;
  private ImageView nRY;
  private TextView nRZ;
  private View nSA;
  private LinkedList<View> nSB;
  private boolean nSC = true;
  private View nSD;
  n nSE;
  private volatile int nSF = 2;
  private BroadcastReceiver nSG = new SnsAdNativeLandingPagesUI.1(this);
  private BroadcastReceiver nSH = new SnsAdNativeLandingPagesUI.9(this);
  private b.a nSI = new SnsAdNativeLandingPagesUI.12(this);
  private ViewPager.e nSJ = new SnsAdNativeLandingPagesUI.13(this);
  private AdLandingPagesProxy.a nSK = new AdLandingPagesProxy.a()
  {
    public final void at(Object paramAnonymousObject)
    {
      SnsAdNativeLandingPagesUI.i(SnsAdNativeLandingPagesUI.this).removeCallbacksAndMessages(null);
      SnsAdNativeLandingPagesUI.i(SnsAdNativeLandingPagesUI.this).post(new SnsAdNativeLandingPagesUI.14.1(this, paramAnonymousObject));
    }
    
    public final void e(int paramAnonymousInt1, int paramAnonymousInt2, Object paramAnonymousObject) {}
  };
  private Map<Integer, Fragment> nSL = new HashMap();
  private boolean nSM = true;
  private boolean nSN = true;
  private BroadcastReceiver nSO = new BroadcastReceiver()
  {
    public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      if (paramAnonymousIntent.getAction().equals("android.intent.action.SCREEN_OFF")) {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SnsAdNativeLandingPagesUI", "android.intent.action.SCREEN_OFF");
      }
      while (!paramAnonymousIntent.getAction().equals("android.intent.action.SCREEN_ON")) {
        return;
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SnsAdNativeLandingPagesUI", "android.intent.action.SCREEN_ON");
      SnsAdNativeLandingPagesUI.b(SnsAdNativeLandingPagesUI.this);
    }
  };
  private j nSP = null;
  private p nSQ = null;
  Bundle nSa;
  b nSb;
  private boolean nSc = false;
  String nSd;
  String nSe;
  private String nSf;
  String nSg;
  String nSh;
  String nSi;
  private ImageView nSj;
  String nSk;
  String nSl;
  public Map<String, String> nSn = new HashMap();
  com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g nSo = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g();
  boolean nSp = false;
  private int nSq = 0;
  private boolean nSr = false;
  String nSs;
  String nSt;
  String nSu;
  String nSv;
  private AdlandingDummyViewPager nSw;
  int nSx;
  int nSy;
  private ag nSz = new ag();
  String ntU;
  private int nyY;
  public String nyk;
  String nyl;
  String nzH;
  int source;
  private long startTime;
  String uin;
  Map<String, String> values;
  
  private String NV(String paramString)
  {
    String str = bi.aG((String)this.values.get("." + this.nSe + ".adCanvasInfo.shareThumbUrl"), "");
    if (!bi.oW(str)) {
      paramString = str;
    }
    return paramString;
  }
  
  private void bCD()
  {
    Iterator localIterator = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.c)this.nSw.getAdapter()).nB.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b localb = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localIterator.next();
      if ((localb.nHl != null) && (localb.getUserVisibleHint())) {
        localb.nHl.bAo();
      }
    }
  }
  
  private void bCF()
  {
    if (this.nRW != null)
    {
      Iterator localIterator = this.nRW.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)localIterator.next()).nIi;
        if (localObject != null)
        {
          localObject = ((List)localObject).iterator();
          label48:
          com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.s locals;
          if (((Iterator)localObject).hasNext())
          {
            locals = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.s)((Iterator)localObject).next();
            if (this.nBk != 0) {
              break label124;
            }
          }
          label124:
          for (int i = this.source;; i = this.nBk)
          {
            locals.wL(i);
            locals.ii(nSm);
            locals.MV(this.ntU);
            locals.MW(this.uin);
            locals.wM(this.nBm);
            break label48;
            break;
          }
        }
      }
    }
  }
  
  private List<i> bCG()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.c)this.nSw.getAdapter()).nB.iterator();
    while (localIterator.hasNext()) {
      localArrayList.addAll(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localIterator.next()).bAu());
    }
    return localArrayList;
  }
  
  private List<i> bCH()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)this.nSL.get(Integer.valueOf(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)this.nRW.getFirst()).id))).bAu());
    return localArrayList;
  }
  
  private void bCI()
  {
    int i;
    if (!bCL()) {
      if (Build.VERSION.SDK_INT >= 21)
      {
        i = getResources().getColor(i.c.white);
        if ((this.nRW == null) || (this.nRW.size() <= 0) || (bi.oW(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)this.nRW.getFirst()).fpc))) {
          break label157;
        }
        i = Color.parseColor(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)this.nRW.getFirst()).fpc);
      }
    }
    label157:
    for (;;)
    {
      getWindow().addFlags(Integer.MIN_VALUE);
      getWindow().setStatusBarColor(i);
      int j = getWindow().getDecorView().getSystemUiVisibility();
      i = j;
      if (Build.VERSION.SDK_INT >= 16) {
        i = j & 0xF9F9;
      }
      j = i;
      if (Build.VERSION.SDK_INT >= 23) {
        j = i | 0x2000;
      }
      getWindow().getDecorView().setSystemUiVisibility(j);
      return;
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ad.I(this);
      return;
    }
  }
  
  private boolean bCJ()
  {
    return (this.nSx == 0) || ((this.nSx & 0x4) == 0) || ((this.nSx & 0x2) == 0) || ((bCN()) && (this.nBm == 2)) || ((this.nSx & 0x1) == 0);
  }
  
  private boolean bCK()
  {
    return (this.nSx & 0x8) == 0;
  }
  
  private boolean bCL()
  {
    return this.nSy == 0;
  }
  
  private boolean bCM()
  {
    return (!bi.oW(this.nSg)) && (!bi.oW(this.nSh));
  }
  
  private boolean bCN()
  {
    return (this.nSx & 0x10) == 0;
  }
  
  private void bCO()
  {
    Object localObject2 = bCH();
    Object localObject1 = new LinkedList();
    localObject2 = ((List)localObject2).iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((LinkedList)localObject1).add((View)((i)((Iterator)localObject2).next()).getView().getParent());
    }
    this.nSD = null;
    if (this.nSB != null) {
      this.nSB.clear();
    }
    if (!((LinkedList)localObject1).isEmpty())
    {
      this.nSD = ((View)((LinkedList)localObject1).removeFirst());
      if (this.nSB == null) {
        this.nSB = new LinkedList();
      }
      this.nSB.clear();
      int i = this.nSD.getHeight();
      localObject1 = ((LinkedList)localObject1).iterator();
      int j;
      do
      {
        if (!((Iterator)localObject1).hasNext()) {
          break;
        }
        localObject2 = (View)((Iterator)localObject1).next();
        j = i + ((View)localObject2).getHeight();
        this.nSB.add(localObject2);
        i = j;
      } while (j < this.hmW);
    }
  }
  
  private a bCP()
  {
    Object localObject = new com.tencent.mm.plugin.sns.storage.b(this.nSd);
    if (((com.tencent.mm.plugin.sns.storage.b)localObject).bzt())
    {
      int i = AdLandingPagesProxy.getInstance().getAdVoteIndex(((com.tencent.mm.plugin.sns.storage.b)localObject).nzy.nzF, this.ntU, this.uin);
      if ((i > 0) && (i <= ((com.tencent.mm.plugin.sns.storage.b)localObject).nzy.nzG.size()))
      {
        localObject = (b.f)((com.tencent.mm.plugin.sns.storage.b)localObject).nzy.nzG.get(i - 1);
        a locala = new a((byte)0);
        if (!bi.oW(((b.f)localObject).ixz))
        {
          locala.ixz = ((b.f)localObject).ixz;
          if (bi.oW(((b.f)localObject).nzH)) {
            break label153;
          }
          locala.nzH = ((b.f)localObject).nzH;
          label122:
          if (bi.oW(((b.f)localObject).nzI)) {
            break label164;
          }
        }
        label153:
        label164:
        for (locala.nzI = ((b.f)localObject).nzI;; locala.nzI = this.nSk)
        {
          return locala;
          locala.ixz = this.ixz;
          break;
          locala.nzH = this.nzH;
          break label122;
        }
      }
    }
    return null;
  }
  
  private String bCQ()
  {
    Object localObject = new bqw();
    ((bqw)localObject).soW = new bqx();
    ((bqw)localObject).soW.spa = this.nSo.ntU;
    ((bqw)localObject).soW.soZ = this.nSo.bSZ;
    ((bqw)localObject).soW.egL = this.egL;
    try
    {
      localObject = Base64.encodeToString(((bqw)localObject).toByteArray(), 2);
      return (String)localObject;
    }
    catch (Exception localException) {}
    return "";
  }
  
  private String bCR()
  {
    return this.nSd.replaceAll("(?s)<adCanvasInfoLeft[^>]*>.*?</adCanvasInfoLeft>", "").replaceAll("(?s)<adCanvasInfoRight[^>]*>.*?</adCanvasInfoRight>", "");
  }
  
  private boolean isFullScreen()
  {
    if (this.nRW != null)
    {
      Iterator localIterator1 = this.nRW.iterator();
      int i = 0;
      for (;;)
      {
        j = i;
        if (!localIterator1.hasNext()) {
          break label80;
        }
        Iterator localIterator2 = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)localIterator1.next()).nIi.iterator();
        if (localIterator2.hasNext())
        {
          if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.s)localIterator2.next()).type != 82) {
            break;
          }
          i = 1;
        }
      }
    }
    int j = 0;
    label80:
    return j == 0;
  }
  
  private void xP()
  {
    Object localObject3 = bCG();
    this.grJ += System.currentTimeMillis() - this.startTime;
    this.nSo.nIM = ((int)this.grJ);
    Object localObject1 = this.nSo;
    int j;
    if (this.nRW == null)
    {
      j = 0;
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)localObject1).nIL = j;
      localObject1 = this.nSo;
      localObject2 = new JSONArray();
      localObject3 = ((List)localObject3).iterator();
      while (((Iterator)localObject3).hasNext())
      {
        Object localObject4 = (i)((Iterator)localObject3).next();
        if (!((i)localObject4).bzT().nBj)
        {
          JSONObject localJSONObject = new JSONObject();
          if (!((i)localObject4).r((JSONArray)localObject2))
          {
            if (((i)localObject4).aa(localJSONObject)) {
              ((JSONArray)localObject2).put(localJSONObject);
            }
            if ((localObject4 instanceof o))
            {
              localObject4 = ((o)localObject4).bAe().iterator();
              while (((Iterator)localObject4).hasNext()) {
                ((JSONArray)localObject2).put((JSONObject)((Iterator)localObject4).next());
              }
            }
          }
        }
      }
    }
    Object localObject2 = this.nRW.iterator();
    for (int i = 0;; i = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)((Iterator)localObject2).next()).nIi.size() + i)
    {
      j = i;
      if (!((Iterator)localObject2).hasNext()) {
        break;
      }
    }
    ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)localObject1).nIN = ((JSONArray)localObject2).toString();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AdLandingPagesReportInfo", "componentsStatStr:%s", new Object[] { ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)localObject1).nIN });
    if (!bi.oW(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)localObject1).nIN)) {}
    try
    {
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)localObject1).nIN = URLEncoder.encode(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)localObject1).nIN, "UTF-8");
      localObject1 = this.nSo.bAC();
      if (this.nBm == 2)
      {
        AdLandingPagesProxy.getInstance().doCgiReportCanvasBrowseInfo(15041, (String)localObject1);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsAdNativeLandingPagesUI", "post cgi stat 15041 data: " + (String)localObject1);
        return;
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AdLandingPagesReportInfo", "not support encode " + localUnsupportedEncodingException.toString());
      }
      if (AdLandingPagesProxy.getInstance().isRecExpAd(this.nSo.bSZ))
      {
        com.tencent.mm.plugin.report.service.h.mEJ.k(14650, localUnsupportedEncodingException);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsAdNativeLandingPagesUI", "post kv stat 14650 data: " + localUnsupportedEncodingException);
        return;
      }
      com.tencent.mm.plugin.report.service.h.mEJ.k(13387, localUnsupportedEncodingException);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsAdNativeLandingPagesUI", "post kv stat 13387 data: " + localUnsupportedEncodingException);
    }
  }
  
  public final void a(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.s params, String paramString1, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2, final boolean paramBoolean3)
  {
    if ((this.nSP != null) && (!paramBoolean3))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.SnsAdNativeLandingPagesUI", "bottom sheet appear several times");
      this.nSP.bzW();
      if (this.nSQ != null)
      {
        this.nSQ.dismiss();
        this.nSQ = null;
      }
    }
    label119:
    label236:
    label242:
    label350:
    for (;;)
    {
      return;
      AdLandingPagesProxy.a local10 = new AdLandingPagesProxy.a()
      {
        public final void at(Object paramAnonymousObject) {}
        
        public final void e(int paramAnonymousInt1, int paramAnonymousInt2, Object paramAnonymousObject)
        {
          SnsAdNativeLandingPagesUI.this.io(false);
          if (paramBoolean3)
          {
            if (SnsAdNativeLandingPagesUI.W(SnsAdNativeLandingPagesUI.this) != null) {
              SnsAdNativeLandingPagesUI.W(SnsAdNativeLandingPagesUI.this).bzW();
            }
            if (SnsAdNativeLandingPagesUI.X(SnsAdNativeLandingPagesUI.this) != null)
            {
              SnsAdNativeLandingPagesUI.X(SnsAdNativeLandingPagesUI.this).dismiss();
              SnsAdNativeLandingPagesUI.Y(SnsAdNativeLandingPagesUI.this);
            }
          }
        }
      };
      int i;
      if (!paramBoolean3)
      {
        ActionBarActivity localActionBarActivity = this.mController.tml;
        LinearLayout localLinearLayout = new LinearLayout(this.mController.tml);
        y.gq(this.mController.tml);
        if (bi.oW(params.nBf)) {
          break label236;
        }
        i = Color.parseColor(params.nBf);
        params = am.a(localActionBarActivity, params, localLinearLayout, i);
        this.nSP = new j(this.mController.tml, params, paramString1, paramString2, paramString3, paramBoolean1, paramBoolean2);
        params = params.getView();
        this.nSP.nDD = new SnsAdNativeLandingPagesUI.11(this, params);
        params = this.nSP;
        if ((params.hyK != null) && (params.nDy != null)) {
          break label242;
        }
      }
      for (;;)
      {
        if (bi.oW(paramString1)) {
          break label350;
        }
        AdLandingPagesProxy.getInstance().doFavOfficialItemScene(paramString1, local10);
        if (!paramBoolean3) {
          break;
        }
        this.nSQ = com.tencent.mm.ui.base.h.a(this, getString(i.j.sns_loading), false, null);
        return;
        i = -1;
        break label119;
        params.nDy.getWindow().setFlags(8, 8);
        params.nDy.getWindow().addFlags(131200);
        if (params.nDD != null)
        {
          params.nDy.setOnDismissListener(new j.4(params));
          params.nDy.setOnCancelListener(new j.5(params));
        }
        params.nDy.setContentView(params.hyK);
        BottomSheetBehavior.h((View)params.hyK.getParent()).q(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ad.ee(params.mContext)[1]);
        params.nDy.show();
      }
    }
  }
  
  public final void ayH()
  {
    bCD();
    xP();
    this.nSp = true;
    if (!this.nSc)
    {
      finish();
      return;
    }
    try
    {
      ((i)bCH().get(0)).bzV();
      this.nSw.k(0, false);
      RecyclerView localRecyclerView = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)this.nSL.get(Integer.valueOf(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)this.nRW.getFirst()).id))).bAt();
      if (localRecyclerView != null) {
        ((LinearLayoutManager)localRecyclerView.getLayoutManager()).Q(0, 0);
      }
      bCD();
      if (this.nSD != null)
      {
        this.nSD.postDelayed(new SnsAdNativeLandingPagesUI.5(this), 10L);
        return;
      }
      finish();
      overridePendingTransition(0, 0);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  final void bCE()
  {
    if ((bi.oW(this.nSf)) && (!bi.oW(this.nyl))) {
      this.nSf = String.format("<ADInfo><adCanvasExt>%s</adCanvasExt></ADInfo>", new Object[] { this.nyl });
    }
    Map localMap;
    HashMap localHashMap;
    String str2;
    int i;
    if (!bi.oW(this.nSf))
    {
      localMap = f.z(this.nSf, "ADInfo");
      this.ntU = bi.aG((String)localMap.get("." + "ADInfo" + ".uxInfo"), "");
      this.nSo.ntU = this.ntU;
      this.nyk = bi.aG((String)localMap.get("." + "ADInfo" + ".session_data.aid"), "");
      this.fxE = bi.aG((String)localMap.get("." + "ADInfo" + ".session_data.trace_id"), "");
      localHashMap = new HashMap();
      str2 = "." + "ADInfo" + ".adCanvasExt.adCardItemList.cardItem";
      i = 0;
      if (i <= 0) {
        break label860;
      }
    }
    label704:
    label783:
    label860:
    for (String str1 = str2 + i;; str1 = str2)
    {
      if (localMap.containsKey(str1 + ".cardTpId"))
      {
        String str3 = bi.aG((String)localMap.get(str1 + ".cardTpId"), "");
        str1 = bi.aG((String)localMap.get(str1 + ".cardExt"), "");
        if ((!bi.oW(str3)) && (!bi.oW(str1))) {
          localHashMap.put(str3, str1);
        }
        i += 1;
        break;
      }
      this.nSn = localHashMap;
      str1 = e.o(this.nSd, localHashMap);
      if (!bi.oW(str1)) {
        this.nSd = str1;
      }
      if (!bi.oW(this.nyk))
      {
        if (this.nSd.contains("<originAid>")) {
          this.nSd = this.nSd.replaceFirst("<originAid>[\\s\\S]*</originAid>", "<originAid>" + this.nyk + "</originAid>");
        }
      }
      else if (!bi.oW(this.fxE)) {
        if (!this.nSd.contains("<originTraceId>")) {
          break label704;
        }
      }
      for (this.nSd = this.nSd.replaceFirst("<originTraceId>[\\s\\S]*</originTraceId>", "<originTraceId>" + this.fxE + "</originTraceId>");; this.nSd = this.nSd.replace("<" + this.nSe + ">", "<" + this.nSe + "><originTraceId>" + this.fxE + "</originTraceId>"))
      {
        if (!bi.oW(this.ntU))
        {
          if (!this.nSd.contains("<originUxInfo>")) {
            break label783;
          }
          this.nSd = this.nSd.replaceFirst("<originUxInfo>[\\s\\S]*</originUxInfo>", "<originUxInfo>" + this.ntU + "</originUxInfo>");
        }
        return;
        this.nSd = this.nSd.replace("<" + this.nSe + ">", "<" + this.nSe + "><originAid>" + this.nyk + "</originAid>");
        break;
      }
      this.nSd = this.nSd.replace("<" + this.nSe + ">", "<" + this.nSe + "><originUxInfo>" + this.ntU + "</originUxInfo>");
      return;
    }
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return i.g.sns_ad_native_landing_pages_ui;
  }
  
  @TargetApi(16)
  protected final void initView()
  {
    boolean bool = false;
    super.initView();
    this.nHH = findViewById(i.f.root);
    this.nSw = ((AdlandingDummyViewPager)findViewById(i.f.vertical_viewpager));
    this.nSA = findViewById(i.f.menu_container);
    Object localObject1 = this.nSw;
    Object localObject2 = this.nSJ;
    ((AdlandingDummyViewPager)localObject1).nHa.add(localObject2);
    if ((this.nBm == 2) && (!bCL()))
    {
      localObject1 = (FrameLayout.LayoutParams)this.nSw.getLayoutParams();
      ((FrameLayout.LayoutParams)localObject1).setMargins(0, 0, 0, aq.gs(this));
      this.nSw.setLayoutParams((ViewGroup.LayoutParams)localObject1);
    }
    if (ak.gw(this.mController.tml))
    {
      localObject1 = (FrameLayout.LayoutParams)this.nSA.getLayoutParams();
      i = ((FrameLayout.LayoutParams)localObject1).topMargin;
      int j = ak.gv(this.mController.tml);
      ((FrameLayout.LayoutParams)localObject1).setMargins(((FrameLayout.LayoutParams)localObject1).leftMargin, i + j, ((FrameLayout.LayoutParams)localObject1).rightMargin, ((FrameLayout.LayoutParams)localObject1).bottomMargin);
      this.nSA.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      localObject1 = (FrameLayout.LayoutParams)this.nSw.getLayoutParams();
      i = ((FrameLayout.LayoutParams)localObject1).topMargin;
      j = ak.gv(this.mController.tml);
      ((FrameLayout.LayoutParams)localObject1).setMargins(((FrameLayout.LayoutParams)localObject1).leftMargin, i + j, ((FrameLayout.LayoutParams)localObject1).rightMargin, ((FrameLayout.LayoutParams)localObject1).bottomMargin);
      this.nSw.setLayoutParams((ViewGroup.LayoutParams)localObject1);
    }
    this.jdG = ((ImageView)findViewById(i.f.gallery_bg));
    this.nRY = ((ImageView)findViewById(i.f.sns_ad_native_landing_pages_close_mask_img));
    this.hml = ((ImageView)findViewById(i.f.sns_ad_native_landing_pages_close_img));
    this.hml.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        if (SnsAdNativeLandingPagesUI.this.mController.tmG == 1) {
          SnsAdNativeLandingPagesUI.this.YC();
        }
        SnsAdNativeLandingPagesUI.this.ayH();
      }
    });
    this.nRX = ((ImageView)findViewById(i.f.sns_ad_native_landing_pages_more_img));
    int i = i.c.white;
    if (!bCL())
    {
      i = getResources().getColor(i.c.black);
      if ((this.nRW == null) || (this.nRW.size() <= 0) || (bi.oW(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)this.nRW.getFirst()).fpc))) {
        break label934;
      }
      i = Color.parseColor(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)this.nRW.getFirst()).fpc);
    }
    label905:
    label911:
    label924:
    label934:
    for (;;)
    {
      this.nRY.setBackgroundColor(i);
      i = i.c.black;
      localObject1 = this.hml.getDrawable();
      if (localObject1 != null)
      {
        android.support.v4.b.a.a.a((Drawable)localObject1, android.support.v4.content.a.g(this, i));
        this.hml.setImageDrawable((Drawable)localObject1);
      }
      localObject1 = this.nRX.getDrawable();
      if (localObject1 != null)
      {
        android.support.v4.b.a.a.a((Drawable)localObject1, android.support.v4.content.a.g(this, i));
        this.nRX.setImageDrawable((Drawable)localObject1);
      }
      this.nRZ = ((TextView)findViewById(i.f.sns_ad_native_landing_pages_right_bar_title));
      if ((bCM()) && (!bCN()) && (this.nBm == 2))
      {
        this.nRX.setVisibility(8);
        this.nRZ.setVisibility(0);
        this.nRZ.setText(this.nSg);
        this.nRZ.setOnClickListener(new SnsAdNativeLandingPagesUI.17(this));
      }
      for (;;)
      {
        this.nSj = ((ImageView)findViewById(i.f.sns_native_landing_first_screen_next_img));
        if ((this.nRW != null) && (this.nRW.size() != 0)) {
          break;
        }
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SnsAdNativeLandingPagesUI", "landingPages is null");
        return;
        if (bCJ()) {
          this.nRX.setOnClickListener(new SnsAdNativeLandingPagesUI.18(this));
        } else {
          this.nRX.setVisibility(8);
        }
      }
      bCF();
      localObject1 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.c)this.nSw.getAdapter();
      if (localObject1 == null)
      {
        localObject1 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.c(getSupportFragmentManager(), new ArrayList());
        this.nSw.setAdapter((u)localObject1);
      }
      for (;;)
      {
        i = 0;
        for (;;)
        {
          com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c localc;
          if (i < this.nRW.size())
          {
            localc = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c)this.nRW.get(i);
            if (!localc.nBi) {
              break label924;
            }
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsAdNativeLandingPagesUI", "loadFirstPage load %d", new Object[] { Integer.valueOf(i) });
            localObject2 = (Fragment)this.nSL.get(Integer.valueOf(localc.id));
            if (localObject2 != null) {
              break label911;
            }
            AdlandingDummyViewPager localAdlandingDummyViewPager = this.nSw;
            z localz = this.nHm;
            if (i == this.nRW.size() - 1) {
              bool = true;
            }
            if (i != 0) {
              break label905;
            }
            localObject2 = this.nSI;
            localObject2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b.a(localc, localAdlandingDummyViewPager, localz, bool, (b.a)localObject2, this.nSc, bCK());
            this.nSL.put(Integer.valueOf(localc.id), localObject2);
          }
          for (;;)
          {
            if (localObject2 != null) {
              ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.c)localObject1).a((Fragment)localObject2, i);
            }
            ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.c)localObject1).notifyDataSetChanged();
            this.nSw.setOffscreenPageLimit(this.nRW.size());
            this.nSb = new b(this.mController.tml);
            this.nHH.addOnLayoutChangeListener(new SnsAdNativeLandingPagesUI.2(this));
            return;
            localObject2 = null;
            break;
            ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localObject2).a(localc);
          }
          i += 1;
        }
      }
    }
  }
  
  public final void io(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.nBm == 1)) {
      AdLandingPagesProxy.getInstance().doDynamicUpdateScene(this.nSs, this.nSt, this.nSu, this.nSK);
    }
    if ((this.nBm == 2) && (!bi.oW(this.nSv))) {
      AdLandingPagesProxy.getInstance().doSearchDynamicUpdateScene(this.nSv, this.nSK);
    }
    this.nSr = true;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 1) {
      if (paramInt2 == -1) {
        com.tencent.mm.ui.base.h.bA(this.mController.tml, this.mController.tml.getString(i.j.app_shared));
      }
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
      int i;
      if (paramInt1 == 2)
      {
        if (paramIntent.getBooleanExtra("kfavorite", false))
        {
          i = AdLandingPagesProxy.getInstance().doFav(paramIntent, 42);
          ((v)com.tencent.mm.kernel.g.l(v.class)).a(i, this, this.jKu);
        }
      }
      else if (paramInt1 == com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x.nFJ) {
        try
        {
          Object localObject = paramIntent.getStringExtra("KComponentCid");
          Iterator localIterator = bCG().iterator();
          i locali;
          do
          {
            if (!localIterator.hasNext()) {
              break;
            }
            locali = (i)localIterator.next();
          } while (!locali.bzU().equals(localObject));
          localObject = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x)locali;
          i = paramIntent.getIntExtra("KStreamVideoPlayCount", 0);
          int j = paramIntent.getIntExtra("KStreamVideoPlayCompleteCount", 0);
          int k = paramIntent.getIntExtra("KStreamVideoTotalPlayTimeInMs", 0);
          ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x)localObject).njo = (i + ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x)localObject).njo);
          ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x)localObject).njp += j;
          ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x)localObject).njq += k;
        }
        catch (Exception localException) {}
      }
    }
  }
  
  public void onBackPressed()
  {
    ayH();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.startTime = System.currentTimeMillis();
    this.cYb = System.currentTimeMillis();
    this.nSo.cYb = this.cYb;
    new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b.a(this);
    bCI();
    Object localObject = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ad.ee(this);
    this.hmV = localObject[0];
    this.hmW = localObject[1];
    this.nSa = paramBundle;
    this.mController.hideTitleView();
    getWindow().addFlags(128);
    AdLandingPagesProxy.create(this.iMQ);
    this.iMQ.K(new SnsAdNativeLandingPagesUI.15(this));
    this.source = getIntent().getIntExtra("sns_landig_pages_from_source", 1);
    this.nBk = getIntent().getIntExtra("sns_landig_pages_origin_from_source", 0);
    this.nSd = getIntent().getStringExtra("sns_landing_pages_xml");
    paramBundle = getIntent().getStringExtra("sns_landing_pages_too_large_xml_path");
    if ((bi.oW(this.nSd)) && (!bi.oW(paramBundle))) {
      this.nSd = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ad.Nd(paramBundle);
    }
    if (bi.oW(this.nSd))
    {
      finish();
      return;
    }
    this.nSd = this.nSd.replaceAll("</*RecXml[\\s|\\S]*?>", "");
    this.nSo.ntX = getIntent().getStringExtra("sns_landing_pages_expid");
    this.nSe = getIntent().getStringExtra("sns_landing_pages_xml_prefix");
    this.bSZ = getIntent().getStringExtra("sns_landing_pages_share_sns_id");
    this.nSl = getIntent().getStringExtra("sns_landing_pages_rawSnsId");
    this.ntU = getIntent().getStringExtra("sns_landing_pages_ux_info");
    this.nyk = getIntent().getStringExtra("sns_landing_pages_aid");
    this.fxE = getIntent().getStringExtra("sns_landing_pages_traceid");
    paramBundle = getIntent().getStringExtra("sns_landing_pages_search_extra");
    localObject = this.nSo;
    if (!TextUtils.isEmpty(paramBundle))
    {
      if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)localObject).extra.length() > 0) {
        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)localObject).extra += "&";
      }
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)localObject).extra = (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)localObject).extra + "searchextra=" + URLEncoder.encode(paramBundle));
    }
    paramBundle = getIntent().getStringExtra("sns_landing_pages_extra");
    localObject = this.nSo;
    if (!TextUtils.isEmpty(paramBundle)) {
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)localObject).extra = (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)localObject).extra + "&extra1=" + URLEncoder.encode(paramBundle));
    }
    nSm = getIntent().getBooleanExtra("sns_landing_is_native_sight_ad", false);
    this.nyY = getIntent().getIntExtra("sns_landing_pages_rec_src", 0);
    this.nSq = getIntent().getIntExtra("sns_landing_pages_from_outer_index", 0);
    this.nSf = getIntent().getStringExtra("sns_landing_pages_ad_info");
    this.nSc = getIntent().getBooleanExtra("sns_landing_pages_need_enter_and_exit_animation", false);
    if (this.nSc) {
      this.nSo.nIF = 0;
    }
    for (this.nSo.cXB = 0;; this.nSo.cXB = 1)
    {
      this.nSo.nIG = this.source;
      this.nSo.nIH = 0;
      this.nSo.nII = 0;
      this.nSo.nIJ = 1;
      this.nSo.nIK = 0;
      this.nSo.nBk = this.nBk;
      if ((this.nSe == null) || ("".equals(this.nSd))) {
        this.nSe = "adxml";
      }
      if ((!bi.oW(this.nSd)) && (!bi.oW(this.nSe))) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SnsAdNativeLandingPagesUI", "landingPagesXml is " + this.nSd + ",landingPagesXmlPrex is " + this.nSe);
      return;
      this.nSo.nIF = 1;
    }
    this.values = f.z(this.nSd, this.nSe);
    this.nSo.nIP = bi.aG((String)this.values.get("." + this.nSe + ".adCanvasInfo.canvasId"), "");
  }
  
  protected void onDestroy()
  {
    getWindow().clearFlags(128);
    if (this.gUi)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsAdNativeLandingPagesUI", "the SnsAdNativeLadingPagesUI is destroy");
      if (!this.nSp)
      {
        bCD();
        xP();
      }
    }
    unregisterReceiver(this.nSO);
    super.onDestroy();
  }
  
  public final void onKeyboardStateChanged()
  {
    super.onKeyboardStateChanged();
    if (this.nSw != null) {
      this.nSw.postDelayed(new Runnable()
      {
        public final void run()
        {
          if (SnsAdNativeLandingPagesUI.this.mController.tmG != 1) {
            SnsAdNativeLandingPagesUI.b(SnsAdNativeLandingPagesUI.this);
          }
          for (;;)
          {
            new ArrayList();
            Iterator localIterator = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.c)SnsAdNativeLandingPagesUI.a(SnsAdNativeLandingPagesUI.this).getAdapter()).nB.iterator();
            while (localIterator.hasNext())
            {
              com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b localb = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b)localIterator.next();
              int i = SnsAdNativeLandingPagesUI.this.mController.tmG;
              localb.bAq();
            }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ad.J(SnsAdNativeLandingPagesUI.this);
          }
        }
      }, 500L);
    }
  }
  
  protected void onPause()
  {
    super.onPause();
    if (this.gUi) {
      this.grJ += System.currentTimeMillis() - this.startTime;
    }
    android.support.v4.content.d.O(this).unregisterReceiver(this.nSG);
    android.support.v4.content.d.O(this).unregisterReceiver(this.nSH);
    if (this.nSP != null) {
      this.nSP.bzW();
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsAdNativeLandingPagesUI", "onResume");
    bCI();
    android.support.v4.content.d.O(this).a(this.nSG, new IntentFilter("com.tencent.mm.adlanding.video_progressbar_change"));
    android.support.v4.content.d.O(this).a(this.nSH, new IntentFilter("com.tencent.mm.adlanding.set_uioption"));
    if (this.gUi) {
      this.startTime = System.currentTimeMillis();
    }
    registerReceiver(this.nSO, new IntentFilter("android.intent.action.SCREEN_ON"));
    if (this.nSr) {
      io(false);
    }
  }
  
  public void onSwipeBack()
  {
    this.nSo.cXB = 2;
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g localg = this.nSo;
    localg.nIK += 1;
    super.onSwipeBack();
  }
  
  public final void u(Context paramContext, String paramString1, String paramString2)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("sns_landig_pages_from_source", 14);
    int i;
    String str2;
    String str1;
    JSONObject localJSONObject;
    if (this.nBk == 0)
    {
      i = this.source;
      localIntent.putExtra("sns_landig_pages_origin_from_source", i);
      localIntent.putExtra("sns_landing_pages_canvasid", paramString1);
      localIntent.putExtra("sns_landing_pages_canvas_ext", paramString2);
      localIntent.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
      localIntent.putExtra("sns_landing_pages_no_store", 1);
      str2 = ((Activity)paramContext).getIntent().getStringExtra("sns_landing_pages_sessionId");
      paramString2 = ((Activity)paramContext).getIntent().getStringExtra("sns_landing_pages_ad_buffer");
      if (!bi.oW(str2))
      {
        str1 = String.valueOf(System.currentTimeMillis() / 1000L);
        localJSONObject = new JSONObject();
      }
    }
    for (;;)
    {
      try
      {
        localJSONObject.put("sessionId", str1);
        localJSONObject.put("cid", "");
        if (bi.oW(paramString2)) {
          continue;
        }
        paramString1 = paramString2;
        localJSONObject.put("adBuffer", paramString1);
        localJSONObject.put("preSessionId", str2);
      }
      catch (Exception paramString1)
      {
        continue;
      }
      localIntent.putExtra("sns_landing_pages_search_extra", localJSONObject.toString());
      localIntent.putExtra("sns_landing_pages_sessionId", str1);
      localIntent.putExtra("sns_landing_pages_ad_buffer", paramString2);
      com.tencent.mm.bg.d.b(paramContext, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", localIntent);
      return;
      i = this.nBk;
      break;
      paramString1 = "";
    }
  }
  
  private final class a
  {
    public String ixz = "";
    public String nzH = "";
    public String nzI = "";
    
    private a() {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */