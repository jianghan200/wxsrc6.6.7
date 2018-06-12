package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.d.a.c.i;
import com.tencent.mm.sdk.platformtools.x;
import java.security.Signature;

public enum s
{
  public String jgX = null;
  public boolean jgY = false;
  private Signature pqS = null;
  public i pqT = null;
  
  private s() {}
  
  public final void reset()
  {
    x.i("MicroMsg.WalletFingerprintVerifyManager", "hy: start reset");
    this.pqS = null;
    this.jgX = null;
    this.jgY = false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */