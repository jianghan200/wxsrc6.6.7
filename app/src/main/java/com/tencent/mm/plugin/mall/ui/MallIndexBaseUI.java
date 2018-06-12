package com.tencent.mm.plugin.mall.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.AbsListView.LayoutParams;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.nn;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.y.a;
import com.tencent.mm.plugin.wallet_core.model.aa;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.mm.plugin.wallet_core.model.mall.MallNews;
import com.tencent.mm.plugin.wallet_core.model.mall.c;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wallet_core.model.t;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.k;
import com.tencent.mm.pluginsdk.wallet.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ak;
import com.tencent.mm.ui.y;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public abstract class MallIndexBaseUI
  extends WalletBaseUI
  implements y.a, com.tencent.mm.plugin.wallet_core.model.j
{
  protected String fMk;
  private String kUp = null;
  private String kXX = null;
  private ArrayList<MallFunction> kXY = null;
  protected int kYc;
  private TextView kZg = null;
  protected ListView kZh = null;
  private b kZi = null;
  protected ImageView kZj = null;
  protected ImageView kZk;
  protected TextView kZl = null;
  protected TextView kZm;
  private int kZn = 0;
  private boolean kZo = true;
  private boolean kZp = false;
  
  private void bbT()
  {
    boolean bool = getIntent().getBooleanExtra("key_wallet_has_red", false);
    if (this.kZh.getChildCount() == 0) {}
    label404:
    for (;;)
    {
      return;
      int i = this.kZh.getFirstVisiblePosition();
      int j = this.kZh.getChildAt(0).getTop();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallIndexBaseUI", "initCheckNew %s fpos %s top %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i), Integer.valueOf(j) });
      if ((i == 0) && (j == 0) && (bool) && (!this.kZp) && (this.kXY != null))
      {
        this.kZp = true;
        int k = this.kZh.getHeaderViewsCount() + this.kZi.getCount();
        List localList = this.kZi.kYB;
        if (localList != null)
        {
          i = localList.size() - 1;
          for (;;)
          {
            if (i <= 0) {
              break label404;
            }
            Iterator localIterator = ((ArrayList)localList.get(i)).iterator();
            for (;;)
            {
              if (localIterator.hasNext())
              {
                b.c localc = (b.c)localIterator.next();
                if ((localc != null) && (localc.kZe != null) && (b.a(localc.kZe)))
                {
                  i = this.kZh.getFirstVisiblePosition();
                  j = this.kZh.getLastVisiblePosition();
                  com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallIndexBaseUI", "get listview show top %s bottom %s redPos: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
                  if ((k >= i) && (k <= j)) {
                    break;
                  }
                  int m = a.bbM();
                  j = a.bbL() + a.bbK() * (k + 1) + m;
                  i = j;
                  if (k > 2) {
                    i = j + m;
                  }
                  j = i;
                  if (k > 3) {
                    j = i + m;
                  }
                  m = a.bbK() / 3;
                  int n = this.kZh.getScrollY();
                  k = ak.gu(this).y;
                  i = k;
                  if (ak.gt(this)) {
                    i = k - ak.gs(this);
                  }
                  k = i;
                  if (getSupportActionBar() != null) {
                    k = i - getSupportActionBar().getHeight();
                  }
                  this.kZh.smoothScrollBy(j + m - n - k, 1000);
                  return;
                }
              }
            }
            k -= 1;
            i -= 1;
          }
        }
      }
    }
  }
  
  private void bbV()
  {
    setResult(0);
    finish();
  }
  
  private void bbY()
  {
    if (com.tencent.mm.model.q.GS())
    {
      com.tencent.mm.wallet_core.a.b(this.mController.tml, "PayURemittanceProcess", null);
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putInt("pay_channel", 1);
    com.tencent.mm.wallet_core.a.b(this.mController.tml, "RemittanceProcess", localBundle);
  }
  
  private MallFunction bx(List<MallFunction> paramList)
  {
    Object localObject;
    if ((paramList == null) || (paramList.size() == 0) || (TextUtils.isEmpty(this.kXX)))
    {
      localObject = null;
      return (MallFunction)localObject;
    }
    int i = 0;
    for (;;)
    {
      if (i >= paramList.size()) {
        break label81;
      }
      MallFunction localMallFunction = (MallFunction)paramList.get(i);
      if (localMallFunction != null)
      {
        localObject = localMallFunction;
        if (this.kXX.equals(localMallFunction.moy)) {
          break;
        }
      }
      i += 1;
    }
    label81:
    return null;
  }
  
  private MallFunction by(List<MallFunction> paramList)
  {
    Object localObject;
    if ((paramList == null) || (paramList.size() == 0) || (TextUtils.isEmpty(this.kUp)))
    {
      localObject = null;
      return (MallFunction)localObject;
    }
    int i = 0;
    for (;;)
    {
      if (i >= paramList.size()) {
        break label81;
      }
      MallFunction localMallFunction = (MallFunction)paramList.get(i);
      if (localMallFunction != null)
      {
        localObject = localMallFunction;
        if (this.kUp.equals(localMallFunction.ceR)) {
          break;
        }
      }
      i += 1;
    }
    label81:
    return null;
  }
  
  protected static void u(Activity paramActivity)
  {
    if (o.bOW().bPw().bPn())
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", "https://wx.tenpay.com/userroll/readtemplate?t=userroll/index_tmpl");
      com.tencent.mm.bg.d.b(paramActivity, "webview", ".ui.tools.WebViewUI", localIntent);
    }
    for (;;)
    {
      com.tencent.mm.wallet_core.ui.e.He(20);
      return;
      com.tencent.mm.wallet_core.a.b(paramActivity, "ShowOrdersInfoProcess", null);
    }
  }
  
  public void a(MallFunction paramMallFunction, int paramInt)
  {
    Object localObject2;
    int i;
    String str;
    if ((paramMallFunction != null) && (paramInt >= 0))
    {
      localObject2 = "";
      localObject1 = localObject2;
      if (paramMallFunction.prU != null)
      {
        localObject1 = localObject2;
        if (!bi.oW(paramMallFunction.prU.oqH)) {
          localObject1 = paramMallFunction.prU.oqH;
        }
      }
      if (this.kXY != null) {
        break label228;
      }
      i = 0;
      boolean bool = b.a(paramMallFunction);
      localObject2 = com.tencent.mm.plugin.report.service.h.mEJ;
      str = paramMallFunction.moy;
      if (!bool) {
        break label239;
      }
    }
    label228:
    label239:
    for (int j = 2;; j = 1)
    {
      ((com.tencent.mm.plugin.report.service.h)localObject2).h(10881, new Object[] { str, Integer.valueOf(i), Integer.valueOf(0), Integer.valueOf(paramInt), localObject1, Integer.valueOf(j) });
      if ((paramMallFunction == null) || (bi.oW(paramMallFunction.ceR)) || (!((com.tencent.mm.plugin.appbrand.n.e)g.l(com.tencent.mm.plugin.appbrand.n.e.class)).uo(paramMallFunction.ceR))) {
        break label245;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallIndexBaseUI", "handleFunction, intercept by AppBrandNativeLink, nativeUrl = %s", new Object[] { paramMallFunction.ceR });
      c.bPK().Pf(paramMallFunction.moy);
      com.tencent.mm.plugin.wallet_core.model.mall.d.bPO().Pf(paramMallFunction.moy);
      if (paramMallFunction.prU != null)
      {
        c.bPK();
        c.c(paramMallFunction);
      }
      return;
      i = this.kXY.size();
      break;
    }
    label245:
    if (paramMallFunction != null)
    {
      c.bPK().Pf(paramMallFunction.moy);
      com.tencent.mm.plugin.wallet_core.model.mall.d.bPO().Pf(paramMallFunction.moy);
      if (paramMallFunction.prU != null)
      {
        c.bPK();
        c.c(paramMallFunction);
      }
      if ("wxpay://bizmall/mobile_recharge".equals(paramMallFunction.ceR)) {
        paramInt = 0;
      }
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallIndexBaseUI", "functionType : " + paramInt);
      switch (paramInt)
      {
      default: 
        return;
      case 0: 
        localObject1 = new Intent();
        if (bbR()) {
          ((Intent)localObject1).putExtra("key_is_hide_progress", true);
        }
        ((Intent)localObject1).putExtra("key_func_info", paramMallFunction);
        com.tencent.mm.bg.d.b(this, "recharge", ".ui.PhoneRechargeUI", (Intent)localObject1);
        com.tencent.mm.wallet_core.c.q.fu(15, 0);
        return;
        if ("wxpay://bizmall/weixin_hongbao".equals(paramMallFunction.ceR))
        {
          paramInt = 4;
        }
        else if ("wxpay://bizmall/weixin_scan_qrcode".equals(paramMallFunction.ceR))
        {
          paramInt = 8;
        }
        else if ("wxpay://bizmall/weixin_transfer".equals(paramMallFunction.ceR))
        {
          paramInt = 5;
        }
        else if ("wxpay://bizmall/weixin_offline_pay".equals(paramMallFunction.ceR))
        {
          paramInt = 6;
        }
        else if ("wxpay://bizmall/old_mobile_recharge".equals(paramMallFunction.ceR))
        {
          paramInt = 7;
        }
        else if (!bi.oW(paramMallFunction.kck))
        {
          paramInt = 1;
        }
        else if ("wxpay://bizmall/f2f_hongbao".equals(paramMallFunction.ceR))
        {
          paramInt = 9;
        }
        else
        {
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MallIndexUIHelper", "doSelectFunction no jump");
          paramInt = 2;
          continue;
          paramInt = 3;
        }
        break;
      }
    }
    com.tencent.mm.plugin.report.service.h.mEJ.h(11701, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
    paramMallFunction = new Intent();
    paramMallFunction.putExtra("pay_channel", 1);
    com.tencent.mm.bg.d.b(this, "luckymoney", ".ui.LuckyMoneyIndexUI", paramMallFunction);
    com.tencent.mm.wallet_core.c.q.fu(13, 0);
    com.tencent.mm.plugin.report.service.h.mEJ.h(11850, new Object[] { Integer.valueOf(4), Integer.valueOf(0) });
    return;
    Object localObject1 = new Intent();
    if (bbR()) {
      ((Intent)localObject1).putExtra("key_is_hide_progress", true);
    }
    ((Intent)localObject1).putExtra("key_func_info", paramMallFunction);
    com.tencent.mm.bg.d.b(this, "recharge", ".ui.RechargeUI", (Intent)localObject1);
    return;
    g.Ek();
    this.kYc = ((Integer)g.Ei().DT().get(aa.a.sTs, Integer.valueOf(0))).intValue();
    localObject1 = new Intent();
    ((Intent)localObject1).putExtra("rawUrl", paramMallFunction.kck);
    ((Intent)localObject1).putExtra("geta8key_username", com.tencent.mm.model.q.GF());
    ((Intent)localObject1).putExtra("pay_channel", 1);
    ((Intent)localObject1).putExtra("KPublisherId", "pay_wallet");
    ((Intent)localObject1).putExtra("key_download_restrict", paramMallFunction.prW);
    ((Intent)localObject1).putExtra("key_wallet_region", this.kYc);
    ((Intent)localObject1).putExtra("key_function_id", paramMallFunction.moy);
    ((Intent)localObject1).putExtra("geta8key_scene", 46);
    com.tencent.mm.bg.d.b(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", (Intent)localObject1);
    return;
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MallIndexBaseUI", "doSelectFunction no jump");
    return;
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MallIndexBaseUI", "doSelectFunction do nothing");
    com.tencent.mm.ui.base.s.makeText(this, "fuction list error", 1).show();
    return;
    com.tencent.mm.plugin.report.service.h.mEJ.h(11458, new Object[] { Integer.valueOf(1) });
    if (com.tencent.mm.model.q.GS())
    {
      paramMallFunction = new LinkedList();
      localObject1 = new LinkedList();
      paramMallFunction.add(getString(a.i.remittance_title));
      ((List)localObject1).add(Integer.valueOf(0));
      paramMallFunction.add(getString(a.i.collect_title));
      ((List)localObject1).add(Integer.valueOf(1));
      com.tencent.mm.ui.base.h.a(this, getString(a.i.remittance_collect_title), paramMallFunction, (List)localObject1, null, true, new MallIndexBaseUI.4(this));
    }
    for (;;)
    {
      com.tencent.mm.wallet_core.c.q.fu(14, 0);
      com.tencent.mm.plugin.report.service.h.mEJ.h(11850, new Object[] { Integer.valueOf(3), Integer.valueOf(0) });
      return;
      g.Ek();
      if (!((Boolean)g.Ei().DT().get(aa.a.sPD, Boolean.valueOf(false))).booleanValue())
      {
        g.Ek();
        g.Ei().DT().a(aa.a.sPD, Boolean.valueOf(true));
        com.tencent.mm.ui.base.h.a(this, getString(a.i.wallet_index_ui_ftf_notice), "", new MallIndexBaseUI.5(this));
      }
      else
      {
        bbY();
      }
    }
    paramMallFunction = new Intent();
    paramMallFunction.putExtra("key_from_scene", 1);
    com.tencent.mm.bg.d.b(this.mController.tml, "offline", ".ui.WalletOfflineEntranceUI", paramMallFunction);
    com.tencent.mm.wallet_core.c.q.fu(9, 0);
    com.tencent.mm.plugin.report.service.h.mEJ.h(11850, new Object[] { Integer.valueOf(5), Integer.valueOf(0) });
    return;
    paramMallFunction = new Intent();
    paramMallFunction.putExtra("BaseScanUI_select_scan_mode", 1);
    com.tencent.mm.bg.d.b(this.mController.tml, "scanner", ".ui.BaseScanUI", paramMallFunction);
    return;
    com.tencent.mm.bg.d.A(this.mController.tml, "luckymoney", ".f2f.ui.LuckyMoneyF2FQRCodeUI");
  }
  
  public final void aL()
  {
    showOptionMenu(true);
    b localb = this.kZi;
    Object localObject = this.kXY;
    localb.kYB.clear();
    if (localObject != null)
    {
      int i = 0;
      ArrayList localArrayList;
      while (i < ((ArrayList)localObject).size())
      {
        localArrayList = new ArrayList();
        int j = 0;
        while ((j < 3) && (i + j < ((ArrayList)localObject).size()))
        {
          if (j > 0)
          {
            int k = i + j - 1;
            if ((k >= 0) && (((MallFunction)((ArrayList)localObject).get(k)).type != ((MallFunction)((ArrayList)localObject).get(i + j)).type)) {
              break;
            }
          }
          b.c localc = new b.c(localb);
          localc.kZf = (i + j);
          localc.kZe = ((MallFunction)((ArrayList)localObject).get(i + j));
          localArrayList.add(localc);
          j += 1;
        }
        if (localArrayList.size() > 0) {
          localb.kYB.add(localArrayList);
        }
        i += j;
      }
      localb.kYE = 0;
      localb.kYF = 0;
      localObject = localb.kYB.iterator();
      i = -1;
      if (((Iterator)localObject).hasNext())
      {
        localArrayList = (ArrayList)((Iterator)localObject).next();
        if (localArrayList.size() <= 0) {
          break label417;
        }
        if ((i == -1) || (i == ((b.c)localArrayList.get(0)).kZe.type))
        {
          localb.kYE += localArrayList.size();
          localb.kYF += 1;
          i = ((b.c)localArrayList.get(0)).kZe.type;
        }
      }
    }
    label417:
    for (;;)
    {
      break;
      localb.kYF -= 1;
      localb.kYb = com.tencent.mm.plugin.mall.a.d.bbJ().sq(localb.kYc).kYb;
      localb.kYG = localb.bbN();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FunctionListAdapter", "hasMoreNewAtFirstSectionBottom: %s", new Object[] { Boolean.valueOf(localb.kYG) });
      localb.notifyDataSetChanged();
      bbX();
      bbZ();
      if (this.kZg != null) {
        this.kZg.setVisibility(8);
      }
      bca();
      return;
    }
  }
  
  protected final boolean aWj()
  {
    if (!bbR()) {
      aL();
    }
    return true;
  }
  
  protected abstract void bbO();
  
  protected abstract void bbP();
  
  protected abstract void bbQ();
  
  public final boolean bbR()
  {
    return (!bi.oW(this.kXX)) || (!bi.oW(this.kUp));
  }
  
  protected abstract boolean bbS();
  
  public final boolean bbU()
  {
    return false;
  }
  
  protected abstract void bbW();
  
  protected abstract void bbX();
  
  protected abstract void bbZ();
  
  protected abstract void bca();
  
  protected final void bcb()
  {
    com.tencent.mm.bg.d.c(this, "wallet_core", ".ui.WalletSwitchWalletCurrencyUI", 1);
  }
  
  protected abstract void cs(View paramView);
  
  public boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MallIndexBaseUI", "onOtherSceneEnd");
    if ((paraml instanceof com.tencent.mm.plugin.wallet_core.c.b.a))
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MallIndexBaseUI", "hy: query bound scene end");
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (this.kZo)
        {
          this.kZo = false;
          if (o.bOS().bPU().bPp())
          {
            com.tencent.mm.wallet_core.a.b(this, "PayUOpenProcess", null);
            return true;
          }
        }
      }
      else
      {
        finish();
        return true;
      }
    }
    switch (paraml.getType())
    {
    default: 
      return false;
    }
    paramString = (com.tencent.mm.plugin.mall.a.a)paraml;
    if (paramString.kYc != this.kYc) {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallIndexBaseUI", "pass wallet local: %d cgi: %d", new Object[] { Integer.valueOf(this.kYc), Integer.valueOf(paramString.kYc) });
    }
    if (bbR())
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MallIndexBaseUI", "errorType:%d | errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if ((paramInt1 == 0) && (paramInt2 == 0) && (paramString.kXY != null) && (paramString.kXY.size() > 0))
      {
        if (getIntent().getIntExtra("key_scene", 0) == 1)
        {
          paramString = bx(paramString.kXY);
          if (paramString != null) {
            a(paramString, -1);
          }
        }
        for (;;)
        {
          setResult(-1);
          finish();
          return true;
          if (!bi.oW(this.kUp))
          {
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MallIndexBaseUI", "NativeUrl: %s", new Object[] { this.kUp });
            paramString = by(paramString.kXY);
            if (paramString != null)
            {
              a(paramString, -1);
            }
            else
            {
              bbV();
              return true;
            }
          }
          else if ((paramString.kXY != null) && (paramString.kXY.size() > 0))
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallIndexBaseUI", "functionScene.mFunctionList != null");
            a(bx(paramString.kXY), -1);
          }
          else if ((com.tencent.mm.plugin.mall.a.d.bbJ().sr(this.kYc) != null) && (com.tencent.mm.plugin.mall.a.d.bbJ().sr(this.kYc).size() > 0))
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallIndexBaseUI", "SubCoreMall.getCore().getFunctionList() != null");
            a(bx(com.tencent.mm.plugin.mall.a.d.bbJ().sr(this.kYc)), -1);
          }
          else
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MallIndexBaseUI", "SubCoreMall.getCore().getFunctionList() == null");
          }
        }
      }
      bbV();
      return true;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0) && (com.tencent.mm.plugin.mall.a.d.bbJ().sr(this.kYc) != null) && (paramString.kXY != null) && (paramString.kXY.size() > 0))
    {
      this.kXY = com.tencent.mm.plugin.mall.a.d.bbJ().sr(this.kYc);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallIndexBaseUI", "get from server now! " + this.kYc + " " + this.kXY.size());
      c.bPK().Q(this.kXY);
    }
    aL();
    bbT();
    return true;
  }
  
  public void finish()
  {
    super.finish();
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return a.g.mall_index_ui;
  }
  
  public final void initView()
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MallIndexBaseUI", "index initView");
    setBackBtn(new MallIndexBaseUI.1(this));
    a.f(this);
    this.kZh = ((ListView)findViewById(a.f.mall_index_function_list));
    View localView = y.gq(this).inflate(a.g.mall_index_stub_with_bankcard, null);
    this.kZh.addHeaderView(localView);
    AbsListView.LayoutParams localLayoutParams2 = (AbsListView.LayoutParams)localView.getLayoutParams();
    AbsListView.LayoutParams localLayoutParams1 = localLayoutParams2;
    if (localLayoutParams2 == null) {
      localLayoutParams1 = new AbsListView.LayoutParams(-1, -2);
    }
    localLayoutParams1.height = a.bbL();
    localView.setLayoutParams(localLayoutParams1);
    this.kZi = new b(this, this.kYc);
    this.kZh.setAdapter(this.kZi);
    this.kZi.kYC = new MallIndexBaseUI.2(this);
    cs(localView);
    this.kZm = ((TextView)findViewById(a.f.banner_tips));
    bbW();
    this.kZh.setOnScrollListener(new MallIndexBaseUI.3(this));
  }
  
  public final void m(String paramString, Bitmap paramBitmap) {}
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 1)
    {
      g.Ek();
      this.kYc = ((Integer)g.Ei().DT().get(aa.a.sTs, Integer.valueOf(0))).intValue();
      if (paramInt2 == -1)
      {
        if (!com.tencent.mm.model.q.GT()) {
          break label51;
        }
        finish();
      }
    }
    return;
    label51:
    finish();
    paramIntent = new nn();
    paramIntent.bYA.context = this.mController.tml;
    com.tencent.mm.sdk.b.a.sFg.m(paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallIndexBaseUI", "onCreate");
    super.onCreate(paramBundle);
    if (!g.Eg().Dx())
    {
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.MallIndexBaseUI", "MMCore is not ready");
      finish();
    }
    g.Ek();
    int i = ((Integer)g.Ei().DT().get(aa.a.sTs, Integer.valueOf(0))).intValue();
    this.kYc = getIntent().getIntExtra("key_wallet_region", i);
    this.fMk = getIntent().getStringExtra("key_uuid");
    if (!bi.oW(this.fMk)) {
      this.fMk = UUID.randomUUID().toString();
    }
    jr(495);
    o.bPd();
    aa.a(this);
    this.kXX = getIntent().getStringExtra("key_func_id");
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallIndexBaseUI", "mFuncId:" + this.kXX + " wallet_region: " + this.kYc + " walletType: " + com.tencent.mm.model.q.GM() + " default_region: " + i);
    this.kUp = getIntent().getStringExtra("key_native_url");
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallIndexBaseUI", "mNativeUrl:" + this.kUp);
    if (bbR()) {
      return;
    }
    if (getSupportActionBar() != null) {
      getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(a.c.mall_index_topbar_color));
    }
    if (com.tencent.mm.compatible.util.d.fR(21)) {
      getWindow().setStatusBarColor(getResources().getColor(a.c.wallet_mall_index_status_bar_color));
    }
    com.tencent.mm.ui.s.cqp();
    ux(0);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallIndexBaseUI", "index Oncreate");
    bbO();
    initView();
    c.bPN();
    bbP();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallIndexBaseUI", "hy: use default controller for MallIndexUI");
    bbQ();
    if (com.tencent.mm.model.q.GS()) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MallIndexBaseUI", "it is payu account ,not initFingerPrint");
    }
    for (;;)
    {
      com.tencent.mm.wallet_core.c.q.fu(1, 0);
      com.tencent.mm.plugin.report.service.h.mEJ.h(11850, new Object[] { Integer.valueOf(1), Integer.valueOf(0) });
      if (Build.VERSION.SDK_INT >= 16) {
        getWindow().getDecorView().setSystemUiVisibility(1280);
      }
      lF(this.mController.tml.getResources().getColor(a.c.transparent));
      return;
      paramBundle = (k)g.l(k.class);
      if (paramBundle != null)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallIndexBaseUI", "IFingerPrintMgr is not null, do showFingerPrintEntrance()");
        paramBundle.dh(this);
      }
      else
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MallIndexBaseUI", "IFingerPrintMgr is not null");
      }
    }
  }
  
  public void onDestroy()
  {
    js(495);
    o.bPd();
    aa.b(this);
    super.onDestroy();
  }
  
  public void onResume()
  {
    int i = 1;
    super.onResume();
    i.Cx(1);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallIndexBaseUI", "index onResume");
    if (!g.Eg().Dx())
    {
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.MallIndexBaseUI", "MMCore is not ready");
      finish();
    }
    if (bbR())
    {
      this.kXY = com.tencent.mm.plugin.mall.a.d.bbJ().sr(this.kYc);
      if ((this.kXY == null) || (this.kXY.size() <= 0))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallIndexBaseUI", "mFunctionList == null");
        try
        {
          if ((getIntent().getIntExtra("key_scene", 0) == 1) || (!bi.oW(this.kUp)))
          {
            a(new com.tencent.mm.plugin.mall.a.a(this.kYc, com.tencent.mm.plugin.wallet_core.model.mall.b.bPJ()), true, false);
            return;
          }
          localObject3 = getIntent().getStringExtra("key_url");
          Object localObject1 = localObject3;
          if (localObject3 == null) {
            localObject1 = "";
          }
          a(new com.tencent.mm.plugin.mall.a.a(this.kYc, com.tencent.mm.plugin.wallet_core.model.mall.b.bPJ(), getIntent().getStringExtra("key_app_id"), this.kXX, (String)localObject1), true, false);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.MallIndexBaseUI", localUnsupportedEncodingException, "", new Object[0]);
          bbV();
          return;
        }
      }
      Object localObject3 = bx(this.kXY);
      Object localObject2 = localObject3;
      if (localObject3 == null) {
        localObject2 = by(this.kXY);
      }
      a((MallFunction)localObject2, -1);
      finish();
      return;
    }
    bbS();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MallIndexBaseUI", "initFunctionList");
    if (com.tencent.mm.plugin.mall.a.d.bbJ().sr(this.kYc) == null)
    {
      a(new com.tencent.mm.plugin.mall.a.a(this.kYc, com.tencent.mm.plugin.wallet_core.model.mall.b.bPJ()), true, false);
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MallIndexBaseUI", "funcitonlist invalid");
      i = 0;
    }
    while (i != 0)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallIndexBaseUI", "has data");
      aL();
      return;
      a(new com.tencent.mm.plugin.mall.a.a(this.kYc, com.tencent.mm.plugin.wallet_core.model.mall.b.bPJ()), false, false);
      this.kXY = com.tencent.mm.plugin.mall.a.d.bbJ().sr(this.kYc);
    }
  }
  
  public void onStop()
  {
    super.onStop();
  }
  
  public final void ss(int paramInt)
  {
    if ((paramInt == 12) && (this.kZl != null)) {
      bbX();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/mall/ui/MallIndexBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */