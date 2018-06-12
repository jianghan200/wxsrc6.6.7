package com.tencent.mm.plugin.walletlock.gesture.a;

import android.app.Activity;
import android.content.Intent;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.a.ta;
import com.tencent.mm.g.a.ta.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.walletlock.a.b.a;
import com.tencent.mm.plugin.walletlock.a.b.b;
import com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  extends com.tencent.mm.plugin.walletlock.b.a
{
  public final void K(Activity paramActivity)
  {
    if (!com.tencent.mm.kernel.g.Ee().k(com.tencent.mm.plugin.walletlock.a.a.class))
    {
      x.d("MicroMsg.GestureImpl", "Plugin gesture is not installed.");
      return;
    }
    if (!b.bRE())
    {
      x.d("MicroMsg.GestureImpl", "try to enter modify gesture password process while gesture password has been switched off.");
      return;
    }
    Intent localIntent = new Intent(paramActivity, GestureGuardLogicUI.class);
    localIntent.addFlags(131072);
    localIntent.putExtra("action", "action.verify_pattern");
    localIntent.putExtra("next_action", "next_action.modify_pattern");
    localIntent.setPackage(ad.getPackageName());
    paramActivity.startActivity(localIntent);
  }
  
  public final void a(Activity paramActivity, b.b paramb)
  {
    if (!com.tencent.mm.kernel.g.Ee().k(com.tencent.mm.plugin.walletlock.a.a.class))
    {
      x.d("MicroMsg.GestureImpl", "Plugin gesture is not installed.");
      return;
    }
    if ((paramb != null) && (!paramb.L(paramActivity)))
    {
      x.d("MicroMsg.GestureImpl", "protectMeOnCreate: still in filter range, do not activate protection.");
      return;
    }
    paramb = new ta();
    paramb.cex.cez = 0;
    paramb.cex.activity = paramActivity;
    com.tencent.mm.sdk.b.a.sFg.m(paramb);
    switch (((Integer)paramb.cey.data).intValue())
    {
    default: 
      return;
    }
    paramActivity.finish();
    paramb = new Intent(paramActivity, GestureGuardLogicUI.class);
    paramb.addFlags(131072);
    paramb.putExtra("action", "action.verify_pattern");
    paramb.putExtra("next_action", "next_action.goto_protected_page");
    paramb.putExtra("page_intent", paramActivity.getIntent());
    paramb.putExtra("scene", M(paramActivity));
    paramb.setPackage(ad.getPackageName());
    paramActivity.startActivity(paramb);
    h.mEJ.h(12097, new Object[] { Integer.valueOf(8), Integer.valueOf(0), Long.valueOf(System.currentTimeMillis()) });
  }
  
  public final void a(Activity paramActivity, b.b paramb, b.a parama)
  {
    if (!com.tencent.mm.kernel.g.Ee().k(com.tencent.mm.plugin.walletlock.a.a.class))
    {
      x.d("MicroMsg.GestureImpl", "Plugin gesture is not installed.");
      return;
    }
    parama = new ta();
    parama.cex.cez = 1;
    parama.cex.activity = paramActivity;
    com.tencent.mm.sdk.b.a.sFg.m(parama);
    switch (((Integer)parama.cey.data).intValue())
    {
    default: 
      return;
    }
    if ((paramb == null) || (paramb.L(paramActivity)))
    {
      paramb = new Intent(paramActivity, GestureGuardLogicUI.class);
      paramb.addFlags(131072);
      paramb.putExtra("action", "action.verify_pattern");
      paramb.putExtra("next_action", "next_action.goto_protected_page");
      paramb.putExtra("page_intent", paramActivity.getIntent());
      paramb.putExtra("scene", M(paramActivity));
      paramb.setPackage(ad.getPackageName());
      paramActivity.startActivity(paramb);
      return;
    }
    x.d("MicroMsg.GestureImpl", "protectMeOnResume: still in filter range, do not activate protection.");
  }
  
  public final void b(Activity paramActivity, int paramInt1, int paramInt2)
  {
    if (paramInt1 != 1) {
      return;
    }
    if (!com.tencent.mm.kernel.g.Ee().k(com.tencent.mm.plugin.walletlock.a.a.class))
    {
      x.d("MicroMsg.GestureImpl", "Plugin gesture is not installed.");
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("action", "action.verify_paypwd");
    localIntent.putExtra("next_action", "next_action.switch_on_pattern");
    localIntent.putExtra("key_wallet_lock_type", 1);
    d.b(paramActivity, "wallet", ".pwd.ui.WalletLockCheckPwdUI", localIntent, paramInt2);
  }
  
  public final boolean bRp()
  {
    return b.bRE();
  }
  
  public final boolean bRq()
  {
    return b.bRF();
  }
  
  public final void h(Activity paramActivity, int paramInt)
  {
    if (paramInt != 1) {
      return;
    }
    if (!com.tencent.mm.kernel.g.Ee().k(com.tencent.mm.plugin.walletlock.a.a.class))
    {
      x.d("MicroMsg.GestureImpl", "Plugin gesture is not installed.");
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("action", "action.verify_paypwd");
    localIntent.putExtra("next_action", "next_action.switch_on_pattern");
    localIntent.putExtra("key_wallet_lock_type", 1);
    d.b(paramActivity, "wallet", ".pwd.ui.WalletLockCheckPwdUI", localIntent);
  }
  
  public final void i(Activity paramActivity, int paramInt)
  {
    if (!com.tencent.mm.kernel.g.Ee().k(com.tencent.mm.plugin.walletlock.a.a.class))
    {
      x.d("MicroMsg.GestureImpl", "Plugin gesture is not installed.");
      return;
    }
    if (!b.bRE())
    {
      x.d("MicroMsg.GestureImpl", "try to enter close gesture password process while gesture password has been switched off.");
      return;
    }
    Intent localIntent = new Intent(paramActivity, GestureGuardLogicUI.class);
    localIntent.addFlags(131072);
    localIntent.putExtra("action", "action.verify_pattern");
    localIntent.putExtra("next_action", "next_action.switch_off_pattern");
    localIntent.setPackage(ad.getPackageName());
    paramActivity.startActivity(localIntent);
  }
  
  public final void init()
  {
    x.e("MicroMsg.GestureImpl", "alvinluo gestureimpl init");
    com.tencent.mm.plugin.walletlock.b.g localg = com.tencent.mm.plugin.walletlock.b.g.pIt;
    com.tencent.mm.plugin.walletlock.b.g.jI(true);
    com.tencent.mm.plugin.walletlock.b.g.pIt.zB(1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/walletlock/gesture/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */