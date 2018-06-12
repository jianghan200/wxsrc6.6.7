package com.tencent.mm.wallet_core.ui;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.c.o;
import com.tencent.mm.wallet_core.e.a.b;
import com.tencent.mm.wallet_core.tenpay.model.m;
import com.tenpay.android.wechat.MyKeyboardWindow;
import com.tenpay.android.wechat.TenpaySecureEditText;

public abstract class WalletBaseUI
  extends MMActivity
  implements com.tencent.mm.wallet_core.d.f
{
  public static final int eCE = com.tencent.mm.bp.a.fromDPToPix(ad.getContext(), 270);
  private static com.tencent.mm.wallet_core.c.i uYQ = null;
  private Dialog jhd;
  public View kMk;
  public a kTx;
  public MyKeyboardWindow mKeyboard;
  public Bundle sy = new Bundle();
  private MenuItem.OnMenuItemClickListener tQp;
  private c uYN = null;
  public com.tencent.mm.wallet_core.d.i uYO = null;
  private com.tencent.mm.wallet_core.d.g uYP = null;
  private MenuItem.OnMenuItemClickListener uYR;
  public boolean uYS = false;
  
  public static void cDI() {}
  
  public final void Hb(int paramInt)
  {
    this.mKeyboard.setXMode(paramInt);
  }
  
  public void Wq()
  {
    if ((this.kMk != null) && (this.kMk.isShown()))
    {
      this.kMk.setVisibility(8);
      if (this.kTx != null) {
        this.kTx.fI(false);
      }
    }
  }
  
  public boolean Wt()
  {
    return true;
  }
  
  public final boolean Xf()
  {
    if (this.tQp != null)
    {
      this.tQp.onMenuItemClick(null);
      return true;
    }
    if (this.uYR != null)
    {
      this.uYR.onMenuItemClick(null);
      return true;
    }
    return super.Xf();
  }
  
  public void a(View paramView, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramView, paramInt, paramBoolean1, true, paramBoolean2);
  }
  
  @TargetApi(14)
  public final void a(View paramView, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    a(paramView, null, paramInt, paramBoolean1, paramBoolean2, paramBoolean3);
  }
  
  public final void a(View paramView1, View paramView2, int paramInt)
  {
    if (paramView1 != null)
    {
      int[] arrayOfInt = new int[2];
      paramView2.getLocationInWindow(arrayOfInt);
      int i = arrayOfInt[1] + paramView2.getHeight();
      int j = com.tencent.mm.bp.a.fl(this);
      paramInt = j - i - com.tencent.mm.bp.a.fromDPToPix(this, paramInt);
      x.d("MicroMsg.WalletBaseUI", "scrollToFormEditPosAfterShowTenPay, editText locationY: %s, height: %s, diff: %s, hardcodeKeyboardHeight: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramInt), Integer.valueOf(eCE) });
      if ((paramInt > 0) && (paramInt < eCE))
      {
        paramInt = eCE - paramInt;
        x.d("MicroMsg.WalletBaseUI", "scrollToFormEditPosAfterShowTenPay, scrollDistance: %s", new Object[] { Integer.valueOf(paramInt) });
        paramView1.post(new WalletBaseUI.2(this, paramView1, paramInt));
      }
    }
  }
  
  public final void a(View paramView, EditText paramEditText, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.mKeyboard = ((MyKeyboardWindow)findViewById(a.f.tenpay_num_keyboard));
    this.kMk = findViewById(a.f.tenpay_keyboard_layout);
    View localView = findViewById(a.f.tenpay_push_down);
    if (paramEditText == null) {
      paramEditText = (EditText)paramView.findViewById(a.f.wallet_content);
    }
    for (;;)
    {
      if ((this.mKeyboard == null) || (paramEditText == null) || (this.kMk == null)) {
        return;
      }
      View.OnFocusChangeListener localOnFocusChangeListener = null;
      if (paramBoolean3) {
        localOnFocusChangeListener = paramEditText.getOnFocusChangeListener();
      }
      e.setNoSystemInputOnEditText(paramEditText);
      paramEditText.setOnFocusChangeListener(new WalletBaseUI.6(this, paramBoolean1, paramBoolean2, paramView, paramEditText, paramInt, localOnFocusChangeListener));
      paramEditText.setOnClickListener(new WalletBaseUI.7(this, paramBoolean1, paramInt, paramEditText));
      localView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          WalletBaseUI.this.Wq();
        }
      });
      return;
    }
  }
  
  public final void a(l paraml, boolean paramBoolean1, boolean paramBoolean2)
  {
    c localc = cDK();
    if (localc != null) {
      this.uYO.sy = localc.jfZ;
    }
    int i = 1;
    if (!paramBoolean2) {
      i = 2;
    }
    this.uYO.a(paraml, paramBoolean1, i);
  }
  
  public final void a(String paramString, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, int paramInt)
  {
    this.uYR = paramOnMenuItemClickListener;
    super.a(0, paramString, paramOnMenuItemClickListener, paramInt);
  }
  
  public final void aBy()
  {
    if ((this.jhd == null) || ((this.jhd != null) && (!this.jhd.isShowing())))
    {
      if (this.jhd != null) {
        this.jhd.dismiss();
      }
      this.jhd = g.a(this, false, new WalletBaseUI.10(this));
    }
  }
  
  public boolean aWj()
  {
    return false;
  }
  
  public final void addTextOptionMenu(int paramInt, String paramString, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.uYR = paramOnMenuItemClickListener;
    super.addTextOptionMenu(paramInt, paramString, paramOnMenuItemClickListener);
  }
  
  public void b(int paramInt1, int paramInt2, String paramString, l paraml, boolean paramBoolean)
  {
    x.d("MicroMsg.WalletBaseUI", "errType = " + paramInt1 + ", errCode = " + paramInt2 + ", errMsg = " + paramString);
    TenpaySecureEditText.setSalt(o.cDa());
    if ((paraml instanceof com.tencent.mm.wallet_core.c.i))
    {
      com.tencent.mm.wallet_core.c.i locali = (com.tencent.mm.wallet_core.c.i)paraml;
      uYQ = locali;
      if (this.sy != null)
      {
        if (locali.pmS > 0) {
          this.sy.putInt("key_is_gen_cert", locali.pmS);
        }
        if (locali.pmU > 0) {
          this.sy.putInt("key_is_hint_crt", locali.pmU);
        }
        if (locali.pmW > 0) {
          this.sy.putInt("key_is_ignore_cert", locali.pmW);
        }
        if (!bi.oW(locali.pmT)) {
          this.sy.putString("key_crt_token", locali.pmT);
        }
        if (!bi.oW(locali.pmV)) {
          this.sy.putString("key_crt_wording", locali.pmV);
        }
      }
    }
    k(paramInt1, paramInt2, paramString, paraml);
    f.a(this, paramInt1, paramInt2, paramString, paraml, paramBoolean);
  }
  
  public void bMZ()
  {
    cDK().a(this, 0, this.sy);
  }
  
  public boolean bND()
  {
    return false;
  }
  
  public final String bNs()
  {
    if (this.sy == null) {
      return "";
    }
    PayInfo localPayInfo = (PayInfo)this.sy.getParcelable("key_pay_info");
    if (localPayInfo != null) {
      return localPayInfo.bOd;
    }
    return "";
  }
  
  public void baT()
  {
    x.d("MicroMsg.WalletBaseUI", "cancelforceScene");
    this.uYO.baT();
    finish();
  }
  
  public boolean bbR()
  {
    if (getLayoutId() <= 0) {}
    while (this.uYO.baU()) {
      return true;
    }
    return false;
  }
  
  public boolean bbU()
  {
    return true;
  }
  
  public final void bfe()
  {
    if (this.jhd != null) {
      this.jhd.dismiss();
    }
  }
  
  public final void cDH()
  {
    PayInfo localPayInfo2 = (PayInfo)this.sy.getParcelable("key_pay_info");
    PayInfo localPayInfo1 = localPayInfo2;
    if (localPayInfo2 == null) {
      localPayInfo1 = (PayInfo)getIntent().getParcelableExtra("key_pay_info");
    }
    if ((localPayInfo1 != null) && (!bi.oW(localPayInfo1.fMk)))
    {
      this.uYO.a(new com.tencent.mm.wallet_core.c.e(localPayInfo1.fMk, localPayInfo1.bOd), true, 1);
      localPayInfo1.fMk = null;
    }
  }
  
  public final void cDJ()
  {
    if ((this.kMk != null) && (!this.kMk.isShown()))
    {
      this.kMk.setVisibility(0);
      if (this.kTx != null) {
        this.kTx.fI(true);
      }
    }
  }
  
  public final c cDK()
  {
    if (this.uYN == null) {
      this.uYN = com.tencent.mm.wallet_core.a.af(this);
    }
    return this.uYN;
  }
  
  public final com.tencent.mm.wallet_core.d.g cDL()
  {
    if (this.uYP == null)
    {
      c localc = cDK();
      if (localc != null) {
        this.uYP = localc.a(this, this.uYO);
      }
      if (this.uYP == null) {
        this.uYP = new WalletBaseUI.9(this, this, this.uYO);
      }
    }
    return this.uYP;
  }
  
  public final CharSequence cDM()
  {
    if (this.uYP == null) {
      return null;
    }
    return this.uYP.ui(0);
  }
  
  public final void d(View paramView, int paramInt, boolean paramBoolean)
  {
    a(paramView, paramInt, paramBoolean, true);
  }
  
  public abstract boolean d(int paramInt1, int paramInt2, String paramString, l paraml);
  
  public final void jr(int paramInt)
  {
    this.uYO.jr(paramInt);
  }
  
  public final void js(int paramInt)
  {
    this.uYO.js(paramInt);
  }
  
  public boolean k(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    return true;
  }
  
  public final boolean mM(boolean paramBoolean)
  {
    if ((uYQ != null) && ((uYQ.bkT()) || (paramBoolean)))
    {
      this.uYO.a(uYQ, true);
      return true;
    }
    return false;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    cDL().onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (!com.tencent.mm.kernel.g.Eg().Dx())
    {
      x.e("MicroMsg.WalletBaseUI", "hy: account not ready. finish now");
      h.a(this, getString(a.i.wallet_account_not_ready), "", false, new WalletBaseUI.1(this));
    }
    this.uYO = new com.tencent.mm.wallet_core.d.i(this, this);
    this.uYO.jr(385);
    this.uYO.jr(1518);
    x.d("MicroMsg.WalletBaseUI", "current process:" + getIntent().getIntExtra("process_id", 0));
    paramBundle = com.tencent.mm.wallet_core.a.af(this);
    if (paramBundle != null) {
      this.uYO.dox = paramBundle.aNK();
    }
    x.d("MicroMsg.WalletBaseUI", "proc " + paramBundle);
    this.sy = com.tencent.mm.wallet_core.a.ae(this);
    if (this.sy == null) {
      this.sy = new Bundle();
    }
    this.uYO.sy = this.sy;
    if ((bbU()) && (!com.tencent.mm.wallet_core.a.ad(this))) {
      x.e("MicroMsg.WalletBaseUI", "Activity extends WalletBaseUI but not in process!!!");
    }
    if ((getLayoutId() > 0) && (!bi.oW(""))) {
      setMMSubTitle("");
    }
    setBackBtn(new WalletBaseUI.3(this));
    this.uYP = cDL();
    if ((this.uYP != null) && (this.uYP.r(new Object[0])))
    {
      ux(4);
      return;
    }
    if (getLayoutId() <= 0)
    {
      ux(4);
      return;
    }
    if (bbR())
    {
      ux(4);
      return;
    }
    ux(0);
  }
  
  public Dialog onCreateDialog(int paramInt)
  {
    x.i("MicroMsg.WalletBaseUI", "onCreateDialog id = " + paramInt);
    switch (paramInt)
    {
    default: 
      return super.onCreateDialog(paramInt);
    }
    c localc = com.tencent.mm.wallet_core.a.af(this);
    if (localc != null) {}
    for (int i = localc.a(this, 1);; i = -1)
    {
      if (i != -1) {
        return h.a(this, true, getString(i), "", getString(a.i.app_yes), getString(a.i.app_no), new WalletBaseUI.4(this), new WalletBaseUI.5(this));
      }
      if (localc != null) {
        localc.b(this, this.sy);
      }
      for (;;)
      {
        return super.onCreateDialog(paramInt);
        finish();
      }
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.uYO.js(385);
    this.uYO.js(1518);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      if ((this.kMk != null) && (this.kMk.isShown()))
      {
        Wq();
        return true;
      }
      if (bND())
      {
        YC();
        showDialog(1000);
        return true;
      }
      if ((this.tQp != null) && (Wt()))
      {
        this.tQp.onMenuItemClick(null);
        return true;
      }
      if (this.uYR != null)
      {
        this.uYR.onMenuItemClick(null);
        return true;
      }
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    int i;
    if ((paramIntent.getBooleanExtra("key_process_is_end", false)) && (!paramIntent.getBooleanExtra("key_process_is_stay", true)))
    {
      setIntent(paramIntent);
      paramIntent = getIntent().getExtras();
      if ((paramIntent == null) || (!paramIntent.containsKey("key_process_result_code"))) {
        break label90;
      }
      i = paramIntent.getInt("key_process_result_code", 0);
      if (i != -1) {
        break label95;
      }
      x.i("MicroMsg.WalletBaseUI", "process end ok!");
      setResult(-1, getIntent());
    }
    for (;;)
    {
      finish();
      return;
      label90:
      i = 0;
      break;
      label95:
      x.i("MicroMsg.WalletBaseUI", "process end with user cancel or err! resultCode : " + i);
      setResult(0, getIntent());
    }
  }
  
  public void onPause()
  {
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    if (o.cCZ()) {
      if (q.GS()) {
        break label34;
      }
    }
    label34:
    for (Object localObject = new m();; localObject = new b())
    {
      this.uYO.a((l)localObject, false);
      return;
    }
  }
  
  public void rj(int paramInt) {}
  
  public final void setBackBtn(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.tQp = paramOnMenuItemClickListener;
    super.setBackBtn(paramOnMenuItemClickListener);
  }
  
  public void ux(int paramInt)
  {
    super.ux(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/wallet_core/ui/WalletBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */