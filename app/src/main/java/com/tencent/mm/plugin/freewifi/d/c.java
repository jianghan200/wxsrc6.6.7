package com.tencent.mm.plugin.freewifi.d;

import android.app.Activity;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.ah;

public abstract class c
  extends l
  implements k
{
  protected Activity activity;
  protected b diG;
  protected com.tencent.mm.ab.e diJ;
  protected com.tencent.mm.ab.e jkx;
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.jkx = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    m.BV("netscene " + getClass().getSimpleName() + '@' + Integer.toHexString(hashCode()) + " returns [" + paramInt2 + "," + paramInt3 + "]");
    if (this.jkx != null) {
      this.jkx.a(paramInt2, paramInt3, paramString, this);
    }
    if ((this.activity != null) && (this.activity.isFinishing())) {}
    while (this.diJ == null) {
      return;
    }
    ah.A(new c.1(this, paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte));
  }
  
  protected abstract void aOR();
  
  protected void b(int paramInt1, int paramInt2, int paramInt3, String paramString) {}
  
  public final void b(com.tencent.mm.ab.e parame)
  {
    this.diJ = parame;
    m.BV("netscene " + getClass().getSimpleName() + '@' + Integer.toHexString(hashCode()) + " is started.");
    au.DF().a(this, 0);
  }
  
  public final c s(Activity paramActivity)
  {
    this.activity = paramActivity;
    return this;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/freewifi/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */