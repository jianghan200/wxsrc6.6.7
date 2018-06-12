package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.d;
import android.view.ViewGroup;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i;
import com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI;
import com.tencent.mm.sdk.platformtools.x;

public abstract class a
  extends i
{
  public boolean nzP;
  protected boolean nzQ = SnsAdNativeLandingPagesUI.nSm;
  public boolean nzR;
  private BroadcastReceiver rj = new BroadcastReceiver()
  {
    public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      if (("com.tencent.mm.adlanding.close_exposure_voice".equals(paramAnonymousIntent.getAction())) && (!a.this.bzT().nAW.equals(paramAnonymousIntent.getStringExtra("para_id"))))
      {
        paramAnonymousContext = a.this;
        if (paramAnonymousContext.nzR) {
          paramAnonymousContext.bzy();
        }
      }
    }
  };
  
  public a(Context paramContext, s params, ViewGroup paramViewGroup)
  {
    super(paramContext, params, paramViewGroup);
    d.O(this.context).a(this.rj, new IntentFilter("com.tencent.mm.adlanding.close_exposure_voice"));
    x.v("AbsVideoPlayComp", "register receiver " + this.rj);
  }
  
  public void W(int paramInt1, int paramInt2, int paramInt3)
  {
    super.W(paramInt1, paramInt2, paramInt3);
  }
  
  public void bzA()
  {
    super.bzA();
    this.nzR = true;
  }
  
  public void bzB()
  {
    super.bzB();
    this.nzR = false;
  }
  
  public void bzC()
  {
    this.nzP = true;
  }
  
  public final void bzD()
  {
    Intent localIntent = new Intent("com.tencent.mm.adlanding.close_exposure_voice");
    localIntent.putExtra("para_id", bzT().nAW);
    d.O(this.context).a(localIntent);
  }
  
  protected final void bzE()
  {
    super.bzE();
    if (!this.nzQ)
    {
      bzy();
      return;
    }
    bzC();
  }
  
  public void bzy()
  {
    this.nzP = false;
  }
  
  public void bzz()
  {
    super.bzz();
    d.O(this.context).unregisterReceiver(this.rj);
    this.nzR = true;
    x.v("AbsVideoPlayComp", "unregister receiver " + this.rj);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */