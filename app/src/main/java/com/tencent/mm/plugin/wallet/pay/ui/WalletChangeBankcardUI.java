package com.tencent.mm.plugin.wallet.pay.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.tc;
import com.tencent.mm.g.a.tl;
import com.tencent.mm.plugin.wallet.a.f;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wallet_core.ui.o;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.k;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.c.q;
import com.tencent.mm.wallet_core.c.u;
import com.tencent.mm.wallet_core.tenpay.model.j;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class WalletChangeBankcardUI
  extends WalletBaseUI
  implements a.a
{
  public static int pfu = 1;
  protected int bVY = 0;
  public String eWo;
  protected TextView hEy;
  protected Button mAE;
  private com.tencent.mm.sdk.b.c mBs = new WalletChangeBankcardUI.1(this);
  public Orders mCZ = null;
  public PayInfo mCn = null;
  public o oZD;
  public ArrayList<Bankcard> oZG;
  public Bankcard oZH = null;
  public Authen pdF = null;
  private a pfA;
  com.tencent.mm.plugin.wallet_core.ui.c pfB = null;
  protected ListView pfv;
  public int pfw;
  public com.tencent.mm.plugin.wallet_core.ui.g pfx = null;
  protected String pfy = null;
  public FavorPayInfo pfz;
  
  private void bNy()
  {
    Object localObject = com.tencent.mm.wallet_core.a.af(this);
    if (localObject != null) {
      ((com.tencent.mm.wallet_core.c)localObject).c(this, 1);
    }
    for (;;)
    {
      localObject = new tl();
      ((tl)localObject).ceY.result = -1;
      com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
      return;
      finish();
    }
  }
  
  private boolean bNz()
  {
    return (this.mCn != null) && (this.mCn.bVY != 11);
  }
  
  private ArrayList<Bankcard> jl(boolean paramBoolean)
  {
    if (this.bVY == 8)
    {
      p.bNp();
      return p.bNq().jt(paramBoolean);
    }
    p.bNp();
    return p.bNq().jl(paramBoolean);
  }
  
  public void OQ(String paramString)
  {
    this.pdF.pli = paramString;
    label156:
    boolean bool;
    if (this.oZH != null)
    {
      this.sy.putString("key_mobile", this.oZH.field_mobile);
      this.sy.putParcelable("key_bankcard", this.oZH);
      this.pdF.lMW = this.oZH.field_bindSerial;
      this.pdF.lMV = this.oZH.field_bankcardType;
      if (this.pfz == null) {
        break label272;
      }
      this.pdF.plu = this.pfz.pnP;
      if (this.mCZ.ppg != null) {
        this.pdF.plt = this.mCZ.ppg.pdY;
      }
      if ((this.mCZ != null) && (this.mCZ.pjA == 3))
      {
        if (!this.oZH.bOv()) {
          break label283;
        }
        this.pdF.bWA = 3;
        Bundle localBundle = this.sy;
        if (this.oZH.bOv()) {
          break label295;
        }
        bool = true;
        label173:
        localBundle.putBoolean("key_is_oversea", bool);
      }
    }
    this.sy.putString("key_pwd1", paramString);
    this.sy.putParcelable("key_authen", this.pdF);
    paramString = com.tencent.mm.plugin.wallet.pay.a.a.a(this.pdF, this.mCZ, false);
    if (paramString != null)
    {
      paramString.dox = "PayProcess";
      paramString.sy = this.sy;
      if ((this.mCn.bVY != 6) || (this.mCn.qUI != 100)) {
        break label300;
      }
    }
    label272:
    label283:
    label295:
    label300:
    for (paramString.fdx = 100;; paramString.fdx = this.mCn.bVY)
    {
      a(paramString, true, true);
      return;
      this.pdF.plu = null;
      break;
      this.pdF.bWA = 6;
      break label156;
      bool = false;
      break label173;
    }
  }
  
  public final void aL()
  {
    this.hEy = ((TextView)findViewById(a.f.input_tip));
    if ((this.pfz != null) && (!bi.oW(this.pfz.pnT)))
    {
      this.hEy.setVisibility(0);
      this.hEy.setText(this.pfz.pnT);
      return;
    }
    if (this.sy.getInt("key_main_bankcard_state", 0) != 0)
    {
      this.hEy.setVisibility(0);
      this.hEy.setText(this.pfy);
      return;
    }
    this.hEy.setVisibility(8);
  }
  
  protected final boolean aWj()
  {
    return true;
  }
  
  protected final void bNA()
  {
    if (this.oZG != null) {
      Collections.sort(this.oZG, new WalletChangeBankcardUI.2(this));
    }
  }
  
  public com.tencent.mm.plugin.wallet_core.ui.g bNB()
  {
    bNA();
    return new com.tencent.mm.plugin.wallet_core.ui.g(this, this.oZG, this.pfw, this.mCZ);
  }
  
  public void bNC()
  {
    x.d("MicroMsg.WalletChangeBankcardUI", "pay with old bankcard!");
    String str = this.sy.getString("key_pwd1");
    if (bi.oW(str))
    {
      ux(4);
      this.oZD = o.a(this, this.mCZ, this.pfz, this.oZH, this.mCn, new WalletChangeBankcardUI.5(this), new WalletChangeBankcardUI.6(this), new WalletChangeBankcardUI.7(this));
      this.pfB = this.oZD;
      return;
    }
    OQ(str);
  }
  
  protected final boolean bND()
  {
    return true;
  }
  
  public final void bNE()
  {
    cDH();
    com.tencent.mm.wallet_core.c localc = com.tencent.mm.wallet_core.a.af(this);
    if (localc != null)
    {
      localc.b(this, this.sy);
      return;
    }
    finish();
  }
  
  public final boolean bbR()
  {
    if (super.bbR()) {}
    do
    {
      return true;
      if ((this.mCn == null) || (!this.mCn.jNf)) {
        return false;
      }
    } while (this.mCn.jNf);
    p.bNp();
    return p.bNq().bPs();
  }
  
  public final void c(boolean paramBoolean, String paramString1, String paramString2)
  {
    x.i("MicroMsg.WalletChangeBankcardUI", "onGenFinish callback");
    if (paramBoolean)
    {
      x.i("MicroMsg.WalletChangeBankcardUI", "onGenFinish callback, result.isSuccess is true");
      this.mCn.bQb = paramString1;
      this.mCn.bQc = paramString2;
      OQ(this.eWo);
      return;
    }
    x.e("MicroMsg.WalletChangeBankcardUI", "onGenFinish callback, result.isSuccess is false");
    OQ(this.eWo);
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    boolean bool2 = false;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paraml instanceof com.tencent.mm.plugin.wallet.pay.a.c.e)) {
        return true;
      }
      if ((paraml instanceof com.tencent.mm.plugin.wallet.pay.a.a.b))
      {
        paramString = this.sy;
        paraml = (com.tencent.mm.plugin.wallet.pay.a.a.b)paraml;
        if (!bi.oW(this.eWo)) {
          paramString.putString("key_pwd1", this.eWo);
        }
        paramString.putString("kreq_token", paraml.token);
        paramString.putParcelable("key_authen", paraml.pfc);
        if (!paraml.pfa) {}
        for (bool1 = true;; bool1 = false)
        {
          paramString.putBoolean("key_need_verify_sms", bool1);
          paramString.putParcelable("key_pay_info", this.mCn);
          paramString.putInt("key_pay_flag", 3);
          Object localObject = paraml.lJN;
          if (localObject != null) {
            paramString.putParcelable("key_realname_guide_helper", (Parcelable)localObject);
          }
          localObject = new Bundle();
          ((Bundle)localObject).putString("pwd", this.eWo);
          ((k)com.tencent.mm.kernel.g.l(k.class)).a(paraml.bNu(), true, (Bundle)localObject);
          if (paraml.pgm)
          {
            paramString.putParcelable("key_orders", paraml.pfb);
            if ((this.mCn != null) && (this.mCn.bVY == 8))
            {
              paraml = new tc();
              paraml.ceC.ceD = this.pdF.lMW;
              com.tencent.mm.sdk.b.a.sFg.m(paraml);
            }
          }
          com.tencent.mm.wallet_core.a.j(this, paramString);
          return true;
        }
      }
    }
    else
    {
      paramString = new Bundle();
      paramString.putString("pwd", this.eWo);
      this.sy.putBoolean("key_need_verify_sms", false);
      paraml = (k)com.tencent.mm.kernel.g.l(k.class);
      if (this.pdF.mpb.pxN != 1) {
        break label398;
      }
    }
    label398:
    for (boolean bool1 = true;; bool1 = false)
    {
      paraml.a(bool1, true, paramString);
      switch (paramInt2)
      {
      default: 
        return false;
      }
    }
    this.mCn.qUM = paramInt2;
    bNC();
    return true;
    this.mCn.qUM = paramInt2;
    bool1 = bool2;
    if (paramInt2 == 100100) {
      bool1 = true;
    }
    if (this.pfA == null) {
      this.pfA = new a(this, this);
    }
    this.pfA.a(bool1, this.mCn.bPZ, this.mCn.bOd);
    x.i("MicroMsg.WalletChangeBankcardUI", "mRegenFingerPrintRsaKey.genRsaKey isGenRsa is " + bool1);
    return true;
  }
  
  protected int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_change_bankcard;
  }
  
  public final void initView()
  {
    this.mAE = ((Button)findViewById(a.f.pay_btn));
    this.mAE.setEnabled(false);
    this.mAE.setOnClickListener(new WalletChangeBankcardUI.3(this));
    if (bi.oW(this.sy.getString("key_pwd1"))) {
      this.mAE.setText(a.i.app_ok);
    }
    for (;;)
    {
      this.pfv = ((ListView)findViewById(a.f.settings_lv_address));
      this.pfx = bNB();
      this.pfv.setAdapter(this.pfx);
      this.pfv.setOnItemClickListener(new WalletChangeBankcardUI.4(this));
      aL();
      return;
      this.mAE.setText(a.i.wallet_pwd_dialog_pay_again);
    }
  }
  
  protected final void jm(boolean paramBoolean)
  {
    this.oZG = jl(bNz());
    if (this.pfz != null) {
      if (this.pfz.pnQ == 0) {
        break label40;
      }
    }
    label40:
    for (int i = 1; (i == 0) || (!paramBoolean); i = 0) {
      return;
    }
    String str = this.pfz.pnR;
    ArrayList localArrayList = new ArrayList();
    i = 0;
    if (i < this.oZG.size())
    {
      Bankcard localBankcard = (Bankcard)this.oZG.get(i);
      if (bi.oW(str)) {
        if (!localBankcard.field_bankcardType.equalsIgnoreCase("CFT")) {
          localArrayList.add(localBankcard);
        }
      }
      for (;;)
      {
        i += 1;
        break;
        if (localBankcard.field_bankcardType.equals(str)) {
          localArrayList.add(localBankcard);
        }
      }
    }
    this.oZG = localArrayList;
    bNA();
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    x.i("MicroMsg.WalletChangeBankcardUI", "onActivityResult %d %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == pfu) {
      bNy();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(a.i.wallet_select_use_bankcard_title);
    paramBundle = this.sy;
    paramBundle.putInt("key_err_code", 0);
    this.pfw = paramBundle.getInt("key_support_bankcard", 1);
    this.pdF = ((Authen)paramBundle.getParcelable("key_authen"));
    this.mCZ = ((Orders)paramBundle.getParcelable("key_orders"));
    this.mCn = ((PayInfo)paramBundle.getParcelable("key_pay_info"));
    this.pfz = ((FavorPayInfo)paramBundle.getParcelable("key_favor_pay_info"));
    int i;
    if (this.mCn == null)
    {
      i = 0;
      this.bVY = i;
      x.i("MicroMsg.WalletChangeBankcardUI", "pay_scene %d", new Object[] { Integer.valueOf(this.bVY) });
      if (!this.sy.getBoolean("key_is_filter_bank_type")) {
        break label301;
      }
      jm(true);
    }
    for (;;)
    {
      if ((this.mCZ != null) && (this.mCZ.ppf != null) && (this.mCZ.ppf.size() > 0)) {
        this.pfy = getString(a.i.wallet_change_bankcard_tips, new Object[] { com.tencent.mm.wallet_core.ui.e.e(this.mCZ.mBj, this.mCZ.lNV), ((Orders.Commodity)this.mCZ.ppf.get(0)).desc });
      }
      bNA();
      initView();
      q.fu(7, 0);
      com.tencent.mm.sdk.b.a.sFg.b(this.mBs);
      if ((this.sy.getBoolean("key_is_filter_bank_type")) && (this.pfx != null)) {
        this.pfx.puO = false;
      }
      return;
      i = this.mCn.bVY;
      break;
      label301:
      this.oZG = jl(bNz());
    }
  }
  
  public void onDestroy()
  {
    if (this.pfA != null)
    {
      this.pfA.bNx();
      this.pfA.release();
    }
    com.tencent.mm.sdk.b.a.sFg.c(this.mBs);
    this.pfB = null;
    super.onDestroy();
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (this.pfz != null) && (this.oZG.size() == 0))
    {
      Object localObject = this.pfz;
      int i;
      if ((localObject != null) && (((FavorPayInfo)localObject).pnQ != 0)) {
        i = 1;
      }
      while (i != 0)
      {
        x.i("MicroMsg.WalletChangeBankcardUI", "favor need bankcard bind but usr cancel");
        localObject = this.sy.getString("key_is_cur_bankcard_bind_serial");
        if (bi.oW((String)localObject))
        {
          x.e("MicroMsg.WalletChangeBankcardUI", "curBankcardBindSerial null & finish");
          return super.onKeyUp(paramInt, paramKeyEvent);
          i = 0;
        }
        else
        {
          ArrayList localArrayList = jl(true);
          if ((localArrayList != null) && (this.oZH == null))
          {
            i = 0;
            for (;;)
            {
              if (i < localArrayList.size())
              {
                if (((String)localObject).equals(((Bankcard)localArrayList.get(i)).field_bindSerial))
                {
                  x.i("MicroMsg.WalletChangeBankcardUI", "get cur bankcard, bind_serial:" + (String)localObject);
                  this.oZH = ((Bankcard)localArrayList.get(i));
                }
              }
              else
              {
                if (this.oZH != null) {
                  break;
                }
                x.e("MicroMsg.WalletChangeBankcardUI", "mDefaultBankcard still null & finish");
                return super.onKeyUp(paramInt, paramKeyEvent);
              }
              i += 1;
            }
          }
          bNC();
          return true;
        }
      }
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public void onPause()
  {
    super.onPause();
    if (this.pfB != null) {
      this.pfB.bPX();
    }
  }
  
  public void onResume()
  {
    this.sy.putInt("key_err_code", 0);
    super.onResume();
    if (this.pfB != null) {
      this.pfB.bPW();
    }
  }
  
  public final void rj(int paramInt)
  {
    if (paramInt == 0)
    {
      bNE();
      return;
    }
    if (paramInt == 1)
    {
      this.sy.putString("key_pwd1", "");
      bNC();
      return;
    }
    x.w("MicroMsg.WalletChangeBankcardUI", "hy: clean ui data not handled");
  }
  
  protected void zg(int paramInt)
  {
    int k = 0;
    int j = 0;
    int i;
    if (this.oZG != null)
    {
      i = this.oZG.size();
      if ((this.oZG == null) || (paramInt >= i)) {
        break label147;
      }
      localBankcard = (Bankcard)this.oZG.get(paramInt);
      this.oZH = localBankcard;
      if (this.mCn != null) {
        break label124;
      }
      paramInt = j;
      if (this.mCn != null) {
        break label135;
      }
      localObject = "";
      u.d(paramInt, (String)localObject, 13, this.oZH.field_bindSerial);
      this.pfx.puN = localBankcard.field_bindSerial;
      this.mAE.setEnabled(true);
      this.pfx.notifyDataSetChanged();
      bNC();
    }
    label124:
    label135:
    label147:
    while (i != paramInt) {
      for (;;)
      {
        Bankcard localBankcard;
        return;
        i = 0;
        break;
        paramInt = this.mCn.bVY;
        continue;
        localObject = this.mCn.bOd;
      }
    }
    Object localObject = com.tencent.mm.plugin.wallet_core.model.g.bOA();
    if (((com.tencent.mm.plugin.wallet_core.model.g)localObject).aKp())
    {
      h.b(this, ((com.tencent.mm.plugin.wallet_core.model.g)localObject).lMX, getString(a.i.app_tip), true);
      return;
    }
    if (this.mCn == null)
    {
      paramInt = k;
      if (this.mCn != null) {
        break label250;
      }
    }
    label250:
    for (localObject = "";; localObject = this.mCn.bOd)
    {
      u.d(paramInt, (String)localObject, 14, "");
      this.sy.putInt("key_err_code", 64533);
      com.tencent.mm.wallet_core.a.j(this, this.sy);
      return;
      paramInt = this.mCn.bVY;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet/pay/ui/WalletChangeBankcardUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */