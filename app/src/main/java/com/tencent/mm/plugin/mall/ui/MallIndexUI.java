package com.tencent.mm.plugin.mall.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.g.a.lf;
import com.tencent.mm.g.a.sy;
import com.tencent.mm.g.a.sz;
import com.tencent.mm.g.a.sz.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.d.j;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ECardInfo;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wallet_core.model.i;
import com.tencent.mm.plugin.wallet_core.model.k;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.walletlock.a.b;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.widget.a.d;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.WalletTextView;

public class MallIndexUI
  extends MallIndexBaseUI
{
  private String cev;
  private boolean fWB = false;
  sz.b kZP;
  private String kZQ;
  private ECardInfo kZR;
  private boolean kZS = true;
  private RelativeLayout kZT;
  private View kZU;
  private boolean kZV;
  private boolean kZW;
  com.tencent.mm.plugin.wallet_core.ui.q kZX = new com.tencent.mm.plugin.wallet_core.ui.q();
  private com.tencent.mm.sdk.b.c<lf> kZY = new MallIndexUI.1(this);
  private boolean kZZ = false;
  private d laa;
  
  protected final void bbO()
  {
    setMMTitle(a.i.mall_index_ui_title);
  }
  
  protected final void bbP() {}
  
  protected final void bbQ()
  {
    o.bOS().bPU();
    if (((o.bOS().bPU().bPq()) || (o.bOS().bPU().bPp())) && (com.tencent.mm.model.q.GS()))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicorMsg.MallIndexUI", "hy: user not open wallet or status unknown. try query");
      a(new com.tencent.mm.plugin.wallet_core.c.b.a("", false), true, false);
    }
  }
  
  protected final boolean bbS()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicorMsg.MallIndexUI", "init BankcardList");
    final sz localsz = new sz();
    localsz.cdR.scene = 1;
    localsz.cdR.cdT = true;
    localsz.cdR.cdU = true;
    localsz.cdS.cdN = new Runnable()
    {
      boolean dJP = false;
      
      public final void run()
      {
        com.tencent.mm.sdk.platformtools.x.d("MicorMsg.MallIndexUI", "mUserInfo needBind : " + MallIndexUI.h(MallIndexUI.this).cdW + " hasNewTips : " + MallIndexUI.h(MallIndexUI.this).cdX + " swipeOn : " + MallIndexUI.h(MallIndexUI.this).cdY);
        if ((MallIndexUI.i(MallIndexUI.this)) || (MallIndexUI.this.mController.tml.isFinishing()))
        {
          com.tencent.mm.sdk.platformtools.x.e("MicorMsg.MallIndexUI", "error for callback ac finish");
          return;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicorMsg.MallIndexUI", "after get userInfo, isFromCgiEnd: %s, hasCallback: %s", new Object[] { Boolean.valueOf(localsz.cdS.cew), Boolean.valueOf(this.dJP) });
        MallIndexUI.a(MallIndexUI.this, localsz.cdS);
        MallIndexUI localMallIndexUI;
        boolean bool2;
        Object localObject;
        if (MallIndexUI.h(MallIndexUI.this).errCode == 0)
        {
          MallIndexUI.this.bca();
          MallIndexUI.this.bbX();
          localMallIndexUI = MallIndexUI.this;
          com.tencent.mm.sdk.platformtools.x.i("MicorMsg.MallIndexUI", "showGetNewWalletTip call");
          if ((localMallIndexUI.kZP == null) || ((!localMallIndexUI.kZP.cdV) && (!localMallIndexUI.kZP.ceb))) {
            break label576;
          }
          bool2 = o.bOW().bPw().bPm();
          g.Ek();
          localObject = g.Ei().DT().get(aa.a.sSo, Boolean.valueOf(false));
          if (localObject == null) {
            break label607;
          }
        }
        label436:
        label576:
        label592:
        label607:
        for (boolean bool1 = ((Boolean)localObject).booleanValue();; bool1 = false)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicorMsg.MallIndexUI", "showGetNewWalletTip hadShow=" + bool1 + ";isswc=" + bool2);
          if ((!bool1) && (bool2))
          {
            g.Ek();
            g.Ei().DT().a(aa.a.sSo, Boolean.valueOf(true));
            com.tencent.mm.ui.base.h.a(localMallIndexUI, localMallIndexUI.getString(a.i.mall_multi_wallet_tip), null, true, null);
          }
          MallIndexUI.b(MallIndexUI.this, MallIndexUI.h(MallIndexUI.this));
          MallIndexUI.this.bbZ();
          com.tencent.mm.sdk.platformtools.x.i("MicorMsg.MallIndexUI", "after get userInfo, isShowLqb: %s, isOpenLqb: %s, lqbOpenUrl: %s", new Object[] { Integer.valueOf(MallIndexUI.h(MallIndexUI.this).cet), Boolean.valueOf(MallIndexUI.h(MallIndexUI.this).ceu), MallIndexUI.h(MallIndexUI.this).cev });
          localMallIndexUI = MallIndexUI.this;
          if (MallIndexUI.h(MallIndexUI.this).cet == 1)
          {
            bool1 = true;
            MallIndexUI.a(localMallIndexUI, bool1);
            MallIndexUI.b(MallIndexUI.this, MallIndexUI.h(MallIndexUI.this).ceu);
            MallIndexUI.a(MallIndexUI.this, MallIndexUI.h(MallIndexUI.this).cev);
            if (MallIndexUI.j(MallIndexUI.this) != null)
            {
              if (!MallIndexUI.k(MallIndexUI.this)) {
                break label592;
              }
              MallIndexUI.j(MallIndexUI.this).setVisibility(0);
            }
          }
          for (;;)
          {
            localMallIndexUI = MallIndexUI.this;
            localObject = new ae();
            localMallIndexUI.kZX.a(new MallIndexUI.3(localMallIndexUI), ((ae)localObject).bPo());
            if ((localsz.cdS.cew) && (this.dJP)) {
              MallIndexUI.this.aL();
            }
            this.dJP = true;
            return;
            com.tencent.mm.sdk.platformtools.x.e("MicorMsg.MallIndexUI", "user is not reg or simplereg，should not show this dialog");
            break;
            bool1 = false;
            break label436;
            MallIndexUI.j(MallIndexUI.this).setVisibility(8);
          }
        }
      }
    };
    com.tencent.mm.sdk.b.a.sFg.a(localsz, Looper.myLooper());
    return false;
  }
  
  protected final void bbW()
  {
    sy localsy = new sy();
    localsy.cdO.buF = "1";
    localsy.bJX = new MallIndexUI.11(this, localsy);
    com.tencent.mm.sdk.b.a.sFg.m(localsy);
  }
  
  protected final void bbX()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicorMsg.MallIndexUI", "updateBalanceNum");
    Object localObject = new ae();
    if ((((ae)localObject).prx & 0x4000) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletSwitchConfig", "isHideBalanceNum, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(((ae)localObject).prx) });
      if (!bool) {
        break;
      }
      g.Ek();
      localObject = (String)g.Ei().DT().get(aa.a.sTl, getString(a.i.realname_balance_title));
      this.kZl.setTextColor(getResources().getColor(a.c.mall_index_balance_num_text_color_realname));
      this.kZl.setText((CharSequence)localObject);
      this.kZl.setVisibility(0);
      return;
    }
    if ((((ae)localObject).prx & 0x400000) > 0)
    {
      bool = true;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletSwitchConfig", "isShowBalanceAmount, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(((ae)localObject).prx) });
      if (!bool) {
        break label266;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicorMsg.MallIndexUI", "show balance amount");
      this.kZl.setTextColor(getResources().getColor(a.c.mall_index_balance_num_text_color));
      localObject = o.bOW().paw;
      if ((localObject == null) || (((Bankcard)localObject).plV < 0.0D)) {
        break label249;
      }
      this.kZl.setText(com.tencent.mm.wallet_core.ui.e.B(((Bankcard)localObject).plV));
    }
    for (;;)
    {
      this.kZl.setVisibility(0);
      return;
      bool = false;
      break;
      label249:
      this.kZl.setText(getString(a.i.wallet_index_ui_default_balance));
    }
    label266:
    this.kZl.setVisibility(8);
  }
  
  protected final void bbZ()
  {
    this.mController.removeAllOptionMenu();
    if ((this.kZP != null) && (this.kZP.cer))
    {
      g.Ek();
      boolean bool = ((Boolean)g.Ei().DT().get(aa.a.sZo, Boolean.valueOf(false))).booleanValue();
      com.tencent.mm.sdk.platformtools.x.i("MicorMsg.MallIndexUI", "addIconOptionMenuByMode, hasRedDot: %s", new Object[] { Boolean.valueOf(bool) });
      com.tencent.mm.plugin.report.service.h localh;
      if (bool)
      {
        i = a.e.mall_indexui_new_menu_icon_with_reddot;
        addIconOptionMenu(0, i, new MallIndexUI.4(this, bool));
        localh = com.tencent.mm.plugin.report.service.h.mEJ;
        if (!bool) {
          break label155;
        }
      }
      label155:
      for (int i = 1;; i = 0)
      {
        localh.h(14872, new Object[] { Integer.valueOf(0), Integer.valueOf(i), "", "", Integer.valueOf(1) });
        return;
        i = a.e.mall_indexui_new_menu_icon;
        break;
      }
    }
    addIconOptionMenu(0, a.h.actionbar_icon_dark_more, new MallIndexUI.5(this));
  }
  
  protected final void bca()
  {
    if (this.kZk == null) {
      return;
    }
    if ((!com.tencent.mm.s.c.Cp().b(aa.a.sYd, aa.a.sYe)) && (!this.kZP.cdX))
    {
      k localk = o.bOW().prD;
      if (localk == null) {
        break label114;
      }
      i = localk.field_red_dot_index;
      g.Ek();
      if ((((Integer)g.Ei().DT().get(aa.a.sRJ, Integer.valueOf(-1))).intValue() >= i) || (i <= 0)) {
        break label106;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicorMsg.MallIndexUI", "bankcard need red point");
    }
    label106:
    label114:
    for (int i = 1; i != 0; i = 0)
    {
      this.kZk.setVisibility(0);
      return;
      com.tencent.mm.sdk.platformtools.x.i("MicorMsg.MallIndexUI", "bankcard do not need red point");
    }
    this.kZk.setVisibility(8);
  }
  
  protected final void cs(View paramView)
  {
    Object localObject = (RelativeLayout)paramView.findViewById(a.f.bankcard_area);
    RelativeLayout localRelativeLayout1 = (RelativeLayout)paramView.findViewById(a.f.balance_area);
    RelativeLayout localRelativeLayout2 = (RelativeLayout)paramView.findViewById(a.f.offline_area);
    this.kZT = ((RelativeLayout)paramView.findViewById(a.f.lqt_area));
    this.kZl = ((TextView)paramView.findViewById(a.f.balance_num));
    if ((this.kZl instanceof WalletTextView)) {
      ((WalletTextView)this.kZl).setTypeface(7);
    }
    ((RelativeLayout)localObject).setOnClickListener(new MallIndexUI.7(this));
    localRelativeLayout1.setOnClickListener(new MallIndexUI.8(this, paramView));
    localRelativeLayout2.setOnClickListener(new MallIndexUI.9(this));
    this.kZT.setOnClickListener(new MallIndexUI.10(this));
    if (this.kZV)
    {
      this.kZT.setVisibility(0);
      this.kZj = ((ImageView)findViewById(a.f.bankcard_pic));
      this.kZk = ((ImageView)paramView.findViewById(a.f.add_bankcard_new_notify_img));
      localObject = paramView.findViewById(a.f.balance_red_dot);
      g.Ek();
      if (((Integer)g.Ei().DT().get(aa.a.sXN, Integer.valueOf(-1))).intValue() != 1) {
        break label289;
      }
      ((View)localObject).setVisibility(0);
      label223:
      this.kZU = paramView.findViewById(a.f.lqt_red_dot);
      g.Ek();
      if (((Integer)g.Ei().DT().get(aa.a.sXP, Integer.valueOf(-1))).intValue() != 1) {
        break label298;
      }
      this.kZU.setVisibility(0);
    }
    for (;;)
    {
      bca();
      return;
      this.kZT.setVisibility(8);
      break;
      label289:
      ((View)localObject).setVisibility(8);
      break label223;
      label298:
      this.kZU.setVisibility(8);
    }
  }
  
  public void finish()
  {
    this.fWB = true;
    super.finish();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 3)
    {
      if (paramInt2 == -1) {
        this.kZX.bcc();
      }
    }
    else {
      return;
    }
    this.kZX.cancel();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    getWindow().requestFeature(9);
    ((b)g.l(b.class)).a(this, null);
    i.zk(2);
    this.kZP = new sz.b();
    this.kZP.cdV = false;
    this.kZP.cdW = true;
    this.kZP.cdX = false;
    this.kZY.cht();
    this.kZX.pzb = new MallIndexUI.6(this);
    super.onCreate(paramBundle);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.kZY.dead();
  }
  
  public void onPause()
  {
    super.onPause();
    this.kZX.onPause();
  }
  
  public void onResume()
  {
    com.tencent.mm.sdk.platformtools.x.v("MicorMsg.MallIndexUI", "alvinluo MallIndexUI onResume");
    this.kZX.onResume();
    b localb = (b)g.l(b.class);
    localb.a(this, localb.bRo(), null);
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/mall/ui/MallIndexUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */