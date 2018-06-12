package com.tencent.mm.plugin.exdevice.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Toast;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.ow;
import com.tencent.mm.g.a.qt;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.exdevice.f.a.j;
import com.tencent.mm.plugin.exdevice.f.a.j.a;
import com.tencent.mm.plugin.exdevice.model.ac;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.messenger.a.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.base.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public class ExdeviceRankInfoUI
  extends MMActivity
  implements j.a, com.tencent.mm.plugin.exdevice.f.b.e, com.tencent.mm.plugin.exdevice.f.b.f, d
{
  private static int iEp = 128;
  private boolean En;
  private String gaG;
  private String gtX;
  private p iBL = null;
  private ImageView iDX;
  private Map<String, String> iEI = new HashMap();
  private View iEd;
  private String iEf;
  private String iEg;
  private boolean iFA;
  private String iFB;
  private boolean iFC;
  private j iFD;
  private com.tencent.mm.plugin.exdevice.a.b<j> iFE = new ExdeviceRankInfoUI.12(this);
  private int iFF;
  private ListView iFj;
  private b iFk;
  private View iFl;
  private ExdeviceRankListHeaderView iFm;
  private ExdeviceRankChampionInfoView iFn;
  private View iFo;
  private String iFp;
  private String iFq;
  private String iFr;
  private String iFs;
  private com.tencent.mm.plugin.exdevice.f.b.a.a iFt;
  private String iFu;
  private int iFv;
  private List<e> iFw;
  private ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.c> iFx;
  private ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.d> iFy;
  private boolean iFz;
  private boolean ixI;
  public boolean ixU;
  public String ixV;
  
  private void aHY()
  {
    if ((this.iFt != null) && (this.gtX != null) && (this.gtX.equals(this.iFt.field_username)) && (bi.oW(this.iFt.field_championUrl)))
    {
      if (this.iEd != null) {
        this.iEd.setVisibility(0);
      }
      if (this.iFm != null) {
        this.iFm.setOnViewClickListener(new ExdeviceRankInfoUI.21(this));
      }
    }
    do
    {
      return;
      if (this.iEd != null) {
        this.iEd.setVisibility(8);
      }
    } while ((this.iFt == null) || (bi.aG(this.iFt.field_username, "").equals(this.gtX)) || (bi.oW(this.iFt.field_championUrl)));
    this.iFm.setOnViewClickListener(new ExdeviceRankInfoUI.22(this));
  }
  
  private void aIe()
  {
    x.i("MicroMsg.Sport.ExdeviceRankInfoUI", "updateRankInfoUIFromServer");
    this.iFD = new j(this.iFs, this.iFr, this.iFu, this.iFz, this.iFE);
    this.iFD.ixX = this;
    au.DF().a(this.iFD, 0);
  }
  
  private void aIf()
  {
    x.i("MicroMsg.Sport.ExdeviceRankInfoUI", "try2LocateToUser, locate2User(%s), username(%s).", new Object[] { this.iFB, this.gtX });
    String str;
    int i;
    if (!bi.oW(this.iFB))
    {
      str = this.iFB;
      x.i("MicroMsg.Sport.ExdeviceRankInfoUI", "locateToUser, locate2User(%s), username(%s).", new Object[] { str, this.gtX });
      if (!bi.oW(str)) {
        break label83;
      }
      i = -1;
    }
    for (;;)
    {
      if (i < 0) {
        x.d("MicroMsg.Sport.ExdeviceRankInfoUI", "locate to username is null or nil.");
      }
      return;
      label83:
      if ((this.iFw == null) || (this.iFw.size() == 0))
      {
        i = -2;
      }
      else
      {
        i = 0;
        for (;;)
        {
          if (i >= this.iFw.size()) {
            break label288;
          }
          Object localObject = ((e)this.iFw.get(i)).iHF;
          int j = ((e)this.iFw.get(i)).iHG;
          if ((localObject != null) && (str.equalsIgnoreCase(((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject).field_username)) && (!str.equalsIgnoreCase(this.gtX)) && ((j & 0x2) != 2))
          {
            localObject = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject);
            j = ((DisplayMetrics)localObject).heightPixels;
            x.i("MicroMsg.Sport.ExdeviceRankInfoUI", "locateToUser pos(%d).(h : %d)", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
            this.iFj.setSelectionFromTop(i, j / 4);
            this.iFk.iEJ = str;
            this.iFk.notifyDataSetInvalidated();
            aIi();
            break;
          }
          i += 1;
        }
        label288:
        this.iFk.iEJ = null;
        i = -3;
      }
    }
  }
  
  private void aIg()
  {
    String str = aIh();
    if (!bi.oW(str)) {
      this.iFu = str;
    }
  }
  
  private String aIh()
  {
    if (this.iFw != null)
    {
      Iterator localIterator = this.iFw.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.exdevice.f.b.a.d locald = ((e)localIterator.next()).iHF;
        if ((locald != null) && (locald.field_ranknum == 1)) {
          return locald.field_username;
        }
      }
    }
    return null;
  }
  
  private void aIi()
  {
    View localView = this.iFj.getChildAt(0);
    int[] arrayOfInt = new int[2];
    int i;
    if (localView != null)
    {
      if (this.iFj.getFirstVisiblePosition() != 0) {
        break label133;
      }
      localView.getLocationOnScreen(arrayOfInt);
      if ((bi.oW(this.iFB)) && (iEp == 128)) {
        iEp = arrayOfInt[1];
      }
      i = arrayOfInt[1];
      if (i <= 0) {
        break label133;
      }
      if (i < iEp) {
        break label122;
      }
    }
    label122:
    for (float f = 1.0F;; f = i / iEp)
    {
      x.d("MicroMsg.Sport.ExdeviceRankInfoUI", "ap-alpha: %s", new Object[] { Float.valueOf(f) });
      this.iFn.setAlpha(f);
      this.iFn.setVisibility(0);
      this.iEd.setAlpha(f);
      return;
    }
    label133:
    this.iFn.setAlpha(0.0F);
    this.iEd.setAlpha(0.0F);
    this.iFn.setVisibility(8);
  }
  
  private void aIj()
  {
    if (this.iFt != null)
    {
      if ((this.gaG != this.iFt.field_championUrl) && ((this.gaG == null) || (!this.gaG.equals(this.iFt.field_championUrl))))
      {
        com.tencent.mm.plugin.exdevice.f.a.e.a(this, this.iDX, this.iFt.field_championUrl, R.e.darkgrey);
        this.gaG = this.iFt.field_championUrl;
      }
      return;
    }
    this.iDX.setImageResource(R.e.darkgrey);
    this.gaG = null;
  }
  
  private void aIl()
  {
    if (bi.oW(this.ixV))
    {
      localObject = ad.aHi().Ah(this.gtX);
      if (localObject != null) {
        this.ixV = ((com.tencent.mm.plugin.exdevice.f.b.a.a)localObject).field_championUrl;
      }
    }
    com.tencent.mm.plugin.exdevice.f.b.a.d locald = b.f(this.gtX, this.iFy);
    Object localObject = "--";
    String str = "0";
    if (locald != null)
    {
      localObject = String.valueOf(locald.field_ranknum);
      str = String.valueOf(locald.field_score);
    }
    new ac().a(this, (String)localObject, str, this.ixV, new ExdeviceRankInfoUI.11(this));
  }
  
  private void eA(boolean paramBoolean)
  {
    if (paramBoolean) {
      aIg();
    }
    if (!bi.oW(this.iFr))
    {
      this.iFn.Av(this.iFu);
      this.iFn.setVisibility(0);
      return;
    }
    this.iFn.setVisibility(8);
  }
  
  private void ez(boolean paramBoolean)
  {
    if ((this.iFA) && (!paramBoolean)) {
      return;
    }
    ad.aHm();
    this.iFy = com.tencent.mm.plugin.exdevice.f.b.c.Ad(this.iFs);
    this.iFx = ad.aHg().aHs();
    this.iFw = this.iFk.b(this.iFx, this.iFy, this.ixU);
    runOnUiThread(new ExdeviceRankInfoUI.1(this));
  }
  
  public final void Ae(String paramString)
  {
    x.d("MicroMsg.Sport.ExdeviceRankInfoUI", "hy: rank changed to %s", new Object[] { paramString });
    this.iFs = paramString;
  }
  
  public final void Ax(String paramString)
  {
    com.tencent.mm.plugin.sport.b.d.kB(6);
    Intent localIntent = new Intent(this, ExdeviceProfileUI.class);
    localIntent.putExtra("username", paramString);
    localIntent.putExtra("usernickname", (String)this.iEI.get(paramString));
    localIntent.putExtra("app_username", this.iFr);
    localIntent.putExtra("rank_id", this.iFs);
    startActivityForResult(localIntent, 4);
  }
  
  public final boolean Ay(String paramString)
  {
    if ((!bi.oW(this.iFs)) && (!"#".equals(this.iFs)))
    {
      if (q.GF().equals(paramString))
      {
        x.d("MicroMsg.Sport.ExdeviceRankInfoUI", "hy: is self. see who likes me");
        paramString = new Intent(this, ExdeviceLikeUI.class);
        paramString.putExtra("app_username", this.iFr);
        paramString.putExtra("rank_id", this.iFs);
        paramString.putExtra("key_is_like_read_only", true);
        startActivity(paramString);
        return true;
      }
      return false;
    }
    x.d("MicroMsg.Sport.ExdeviceRankInfoUI", "hy: rank id is not valid.abort the event");
    Toast.makeText(this, getString(R.l.exdevice_rank_id_not_ready), 0).show();
    return true;
  }
  
  public final void a(j paramj)
  {
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        if ((ExdeviceRankInfoUI.e(ExdeviceRankInfoUI.this) != null) && (ExdeviceRankInfoUI.e(ExdeviceRankInfoUI.this).isShowing()))
        {
          ExdeviceRankInfoUI.e(ExdeviceRankInfoUI.this).dismiss();
          ExdeviceRankInfoUI.f(ExdeviceRankInfoUI.this);
          x.d("MicroMsg.Sport.ExdeviceRankInfoUI", "dismiss tips dialog.");
        }
      }
    });
    this.iEf = paramj.ixy;
    this.iEg = paramj.ixz;
    this.ixV = paramj.ixV;
    this.ixU = paramj.ixU;
    this.ixI = paramj.ixI;
    this.iFy = paramj.ixN;
    this.iFx = paramj.ixO;
    this.iFw = this.iFk.b(this.iFx, this.iFy, this.ixU);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        ExdeviceRankInfoUI.b(ExdeviceRankInfoUI.this).iEH = ExdeviceRankInfoUI.a(ExdeviceRankInfoUI.this);
        ExdeviceRankInfoUI.b(ExdeviceRankInfoUI.this).notifyDataSetChanged();
        ExdeviceRankInfoUI.c(ExdeviceRankInfoUI.this);
      }
    });
  }
  
  public final void aIk()
  {
    com.tencent.mm.plugin.sport.b.d.kB(31);
    aIl();
  }
  
  public final void b(String paramString, com.tencent.mm.plugin.exdevice.f.b.d paramd)
  {
    boolean bool;
    if ((paramd != null) && (!bi.oW(paramString)))
    {
      bool = true;
      Assert.assertTrue(bool);
      if (!"HardDeviceRankInfo".equals(paramString)) {
        break label144;
      }
      if ((this.iFs != null) && (this.iFs.equals(paramd.ixK)))
      {
        x.i("MicroMsg.Sport.ExdeviceRankInfoUI", "onRankChange, rankId(%s).", new Object[] { this.iFs });
        ez(true);
        if ((bi.oW(this.iFu)) || (!this.iFu.equals(aIh())))
        {
          aIg();
          this.iFt = ad.aHi().Ah(this.iFu);
          runOnUiThread(new ExdeviceRankInfoUI.8(this));
        }
        runOnUiThread(new ExdeviceRankInfoUI.9(this));
      }
    }
    label144:
    while ((!"HardDeviceChampionInfo".equals(paramString)) || (bi.oW(this.iFu)) || (!this.iFu.equals(paramd.username)))
    {
      return;
      bool = false;
      break;
    }
    this.iFt = ad.aHi().Ah(this.iFu);
    runOnUiThread(new ExdeviceRankInfoUI.10(this));
  }
  
  public final void bk(String paramString, int paramInt)
  {
    ad.aHm();
    String str1 = this.iFs;
    String str2 = this.iFr;
    com.tencent.mm.plugin.exdevice.f.b.b.d locald = ad.aHf();
    boolean bool;
    com.tencent.mm.plugin.exdevice.f.b.a.d locald1;
    if ((!bi.oW(str1)) && (!bi.oW(paramString)) && ((paramInt == 1) || (paramInt == 0) || (paramInt == 2)))
    {
      bool = true;
      Assert.assertTrue(bool);
      locald1 = locald.a(new com.tencent.mm.plugin.exdevice.f.b.d(str1, null, paramString));
      if (locald1 != null) {
        break label113;
      }
      x.w("MicroMsg.ExdeviceRankInfoStg", "hy: info is null. abort");
    }
    for (;;)
    {
      com.tencent.mm.plugin.exdevice.f.b.c.c(str1, str2, paramString, paramInt);
      this.iFF += 1;
      return;
      bool = false;
      break;
      label113:
      locald1.field_selfLikeState = paramInt;
      switch (locald1.field_selfLikeState)
      {
      default: 
        x.w("MicroMsg.ExdeviceRankInfoStg", "hy: still loading...abort");
      }
    }
    for (locald1.field_likecount += 1;; locald1.field_likecount -= 1)
    {
      locald.a(locald1, true);
      break;
    }
  }
  
  protected final int getLayoutId()
  {
    return R.i.exdevice_rank_info;
  }
  
  protected final void initView()
  {
    this.iFl = findViewById(R.h.not_support_msg_type);
    Object localObject1 = new ExdeviceRankListHeaderView(this);
    Object localObject2 = new Rect();
    getWindow().getDecorView().getWindowVisibleDisplayFrame((Rect)localObject2);
    int j = ((Rect)localObject2).top;
    int i = j;
    if (j == 0) {
      i = com.tencent.mm.plugin.exdevice.j.b.B(this, getResources().getDimensionPixelSize(R.f.ExdeviceDefaultStatusBarHeight));
    }
    localObject2 = getResources().getDisplayMetrics();
    if (((DisplayMetrics)localObject2).widthPixels > ((DisplayMetrics)localObject2).heightPixels)
    {
      j = getResources().getDimensionPixelSize(R.f.DefaultActionbarHeightLand);
      localObject2 = getWindowManager().getDefaultDisplay();
      j = ((Display)localObject2).getHeight() / 2 - i - j;
      if (((Display)localObject2).getHeight() > 0)
      {
        i = j;
        if (j > 0) {}
      }
      else
      {
        i = getResources().getDimensionPixelSize(R.f.ExdeviceChangeCoverClickAreaHeight);
      }
      ((ExdeviceRankListHeaderView)localObject1).setMinimumHeight(i);
      ((ExdeviceRankListHeaderView)localObject1).setMinimumWidth(((Display)localObject2).getWidth());
      ((ExdeviceRankListHeaderView)localObject1).setTag(Integer.valueOf(i));
      this.iFm = ((ExdeviceRankListHeaderView)localObject1);
      localObject1 = (MMPullDownView)findViewById(R.h.pulldown_view);
      this.iFj = ((ListView)findViewById(R.h.exdevice_rank_info_lv));
      this.iFn = ((ExdeviceRankChampionInfoView)findViewById(R.h.championInfoV));
      this.iEd = findViewById(R.h.setCoverV);
      this.iEd.setOnClickListener(new ExdeviceRankInfoUI.23(this));
      this.iFm.setIsShowTip(false);
      aHY();
      ((MMPullDownView)localObject1).setIsBottomShowAll(false);
      ((MMPullDownView)localObject1).setTopViewVisible(false);
      ((MMPullDownView)localObject1).setBottomViewVisible(false);
      ((MMPullDownView)localObject1).setIsBottomShowAll(false);
      ((MMPullDownView)localObject1).setIsTopShowAll(false);
      ((MMPullDownView)localObject1).setCanOverScrool(true);
      ((MMPullDownView)localObject1).setOnInterceptTouchEventListener(new ExdeviceRankInfoUI.24(this));
      ((MMPullDownView)localObject1).setAtBottomCallBack(new ExdeviceRankInfoUI.2(this));
      ((MMPullDownView)localObject1).setOnScrollChangedListener(new ExdeviceRankInfoUI.3(this));
      ((MMPullDownView)localObject1).setAtTopCallBack(new ExdeviceRankInfoUI.4(this));
      this.iFj.setOnScrollListener(new ExdeviceRankInfoUI.5(this));
      this.iFj.addHeaderView(this.iFm, null, false);
      localObject2 = getLayoutInflater().inflate(R.i.exdevice_rank_footer_view, null);
      this.iFo = ((View)localObject2).findViewById(R.h.invite_friend_footer);
      ((View)localObject2).findViewById(R.h.invite_friend_btn).setOnClickListener(new ExdeviceRankInfoUI.6(this));
      this.iFo.setVisibility(8);
      this.iFj.addFooterView((View)localObject2);
      if (this.iFx == null) {
        break label741;
      }
    }
    label626:
    label741:
    for (i = this.iFx.size();; i = 0)
    {
      if (this.iFy != null) {}
      for (j = this.iFy.size();; j = 0)
      {
        if (i + j == 0)
        {
          this.iFw = new ArrayList();
          this.iFk.iEH = this.iFw;
          getString(R.l.app_tip);
          this.iBL = h.a(this, getString(R.l.loading_tips), true, new ExdeviceRankInfoUI.7(this));
        }
        this.iFj.setAdapter(this.iFk);
        this.iFk.iEK = this;
        if (this.iFv == 1)
        {
          this.iFj.setVisibility(0);
          this.iFl.setVisibility(8);
        }
        for (i = 1;; i = 0)
        {
          if (i != 0) {
            break label626;
          }
          x.d("MicroMsg.Sport.ExdeviceRankInfoUI", "hy: cannot handle this device type");
          finish();
          return;
          j = getResources().getDimensionPixelSize(R.f.DefaultActionbarHeightPort);
          break;
          this.iFj.setVisibility(8);
          this.iFl.setVisibility(0);
        }
        this.iDX = ((ImageView)findViewById(R.h.exdevice_bg_iv));
        ((MMPullDownView)localObject1).setCanOverScrool(false);
        int k = com.tencent.mm.bp.a.fk(this);
        j = ((Integer)this.iFm.getTag()).intValue();
        i = j;
        if (this.ixU)
        {
          i = getResources().getDimensionPixelSize(R.f.ExdeviceProfileAvatarSize);
          int m = getResources().getDimensionPixelSize(R.f.ExdeviceProfileAvatarRoundStrokeWidth);
          i = j + (i / 2 + m);
        }
        localObject1 = new RelativeLayout.LayoutParams(k, i);
        this.iDX.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        aIj();
        eA(false);
        return;
      }
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (com.tencent.mm.plugin.exdevice.f.a.e.a(this, paramInt1, paramInt2, paramIntent, this.iFr)) {}
    do
    {
      do
      {
        do
        {
          return;
        } while (paramInt2 != -1);
        switch (paramInt1)
        {
        default: 
          return;
        case 1: 
          if (paramIntent == null)
          {
            x.e("MicroMsg.Sport.ExdeviceRankInfoUI", "onActivityResult, data is null.(reqestCode : %d)", new Object[] { Integer.valueOf(paramInt1) });
            return;
          }
          if (paramIntent == null) {}
          for (localObject = null; (localObject == null) || (((String)localObject).length() == 0); localObject = paramIntent.getStringExtra("Select_Conv_User"))
          {
            x.e("MicroMsg.Sport.ExdeviceRankInfoUI", "select conversation failed, toUser is null.");
            return;
          }
          paramIntent = paramIntent.getStringExtra("custom_send_text");
          ac.a(this, (String)localObject, ac.dc(this), paramIntent, this.iEg);
          h.bA(this.mController.tml, getResources().getString(R.l.app_shared));
          x.d("MicroMsg.Sport.ExdeviceRankInfoUI", "Select conversation return.");
          return;
        case 2: 
          h.bA(this.mController.tml, getResources().getString(R.l.app_shared));
          x.d("MicroMsg.Sport.ExdeviceRankInfoUI", "Share to timeline return.");
          return;
        }
      } while (paramIntent == null);
      Object localObject = bi.F(paramIntent.getStringExtra("received_card_name").split(","));
      paramIntent = paramIntent.getStringExtra("custom_send_text");
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        g.bcT().l("gh_43f2581f6fd6", str, com.tencent.mm.model.s.fq(str));
        if (!bi.oW(paramIntent))
        {
          ow localow = new ow();
          localow.bZQ.bZR = str;
          localow.bZQ.content = paramIntent;
          localow.bZQ.type = com.tencent.mm.model.s.hQ(str);
          localow.bZQ.flags = 0;
          com.tencent.mm.sdk.b.a.sFg.m(localow);
        }
      }
    } while ((paramIntent == null) || (!paramIntent.getBooleanExtra("KeyNeedUpdateRank", false)));
    aIe();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.En = false;
    this.gtX = q.GF();
    paramBundle = getIntent();
    this.iFp = paramBundle.getStringExtra("key_rank_info");
    this.iFq = paramBundle.getStringExtra("key_rank_semi");
    this.iFr = paramBundle.getStringExtra("app_username");
    this.iFs = paramBundle.getStringExtra("rank_id");
    this.iFz = paramBundle.getBooleanExtra("key_is_latest", false);
    this.iFu = paramBundle.getStringExtra("key_champioin_username");
    this.iFv = paramBundle.getIntExtra("device_type", 0);
    this.iFB = paramBundle.getStringExtra("locate_to_username");
    this.iFA = paramBundle.getBooleanExtra("key_only_show_latest_rank", false);
    Object localObject;
    if ((bi.oW(this.iFs)) || ("#".equals(this.iFs)))
    {
      if (!this.iFA)
      {
        paramBundle = ad.aHf();
        localObject = String.format("select * from %s order by %s desc limit 1", new Object[] { "HardDeviceRankInfo", "rankID" });
        localObject = paramBundle.diF.b((String)localObject, null, 2);
        if (localObject != null) {
          break label641;
        }
        x.e("MicroMsg.ExdeviceRankInfoStg", "Get no rank in DB");
        paramBundle = null;
        if (paramBundle != null)
        {
          this.iFs = paramBundle.field_rankID;
          this.iFr = paramBundle.field_appusername;
        }
      }
      this.iFu = null;
      this.iFz = true;
    }
    else
    {
      ad.aHm();
      this.iFy = com.tencent.mm.plugin.exdevice.f.b.c.Ad(this.iFs);
      if (!this.iFA)
      {
        if ((this.iFy != null) && (this.iFy.size() > 0)) {
          break label686;
        }
        this.iFx = new ArrayList();
        this.iFy = com.tencent.mm.plugin.exdevice.f.a.a.a(this.iFs, this.iFr, this.iFp, this.iFq, this.iEI, this.iFx);
        ad.aHm();
        com.tencent.mm.plugin.exdevice.f.b.c.d(this.iFs, this.iFy);
      }
    }
    for (;;)
    {
      this.iFx = ad.aHg().aHs();
      this.iFk = new b(this, this.iFr);
      this.iFk.iEI = this.iEI;
      this.iFw = this.iFk.b(this.iFx, this.iFy, this.ixU);
      this.iFk.iEH = this.iFw;
      if (bi.oW(this.iFu)) {
        aIg();
      }
      this.iFt = ad.aHi().Ah(this.iFu);
      if ((this.iFt == null) && (!bi.oW(this.iFu)))
      {
        this.iFt = new com.tencent.mm.plugin.exdevice.f.b.a.a();
        this.iFt.field_username = this.iFu;
        this.iFt.field_championMotto = getIntent().getStringExtra("key_champion_info");
        this.iFt.field_championUrl = getIntent().getStringExtra("key_champion_coverimg");
        ad.aHm();
        paramBundle = this.iFt;
        ad.aHi().a(paramBundle);
      }
      initView();
      if ((this.iFy != null) && (this.iFy.size() > 0))
      {
        paramBundle = ((com.tencent.mm.plugin.exdevice.f.b.a.d)this.iFy.get(0)).field_username;
        this.iFn.Av(paramBundle);
      }
      ad.aHn().a(this);
      ad.aHm().iye = this;
      aIe();
      setBackBtn(new ExdeviceRankInfoUI.18(this));
      setMMTitle(R.l.exdevice_wechat_sport_rank_title);
      showOptionMenu(true);
      aIf();
      paramBundle = new qt();
      paramBundle.cbp.action = 2;
      com.tencent.mm.sdk.b.a.sFg.a(paramBundle, Looper.getMainLooper());
      return;
      label641:
      if (!((Cursor)localObject).moveToFirst())
      {
        x.d("MicroMsg.ExdeviceRankInfoStg", "hy: no record");
        paramBundle = null;
      }
      for (;;)
      {
        ((Cursor)localObject).close();
        break;
        paramBundle = new com.tencent.mm.plugin.exdevice.f.b.a.d();
        paramBundle.d((Cursor)localObject);
      }
      label686:
      com.tencent.mm.plugin.exdevice.f.a.a.a(this.iFp, this.iFq, this.iEI);
    }
  }
  
  protected void onDestroy()
  {
    this.En = true;
    if (this.iFk != null) {
      b.finish();
    }
    super.onDestroy();
    if (this.iFD != null) {
      this.iFD.ixX = null;
    }
    ad.aHn().b(this);
    ad.aHm().iye = null;
    ad.aHm().iyf = null;
    if (this.iFF > 0)
    {
      int i = this.iFF;
      x.v("MicroMsg.Sport.SportReportLogic", "reportLikeCount count=%d", new Object[] { Integer.valueOf(i) });
      com.tencent.mm.plugin.report.f.mDy.h(13168, new Object[] { Integer.valueOf(0), Integer.valueOf(i) });
    }
  }
  
  protected void onPause()
  {
    super.onPause();
  }
  
  protected void onRestart()
  {
    super.onRestart();
    ez(true);
  }
  
  protected void onResume()
  {
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */