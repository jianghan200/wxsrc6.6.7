package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;

public final class ae
{
  public int prx = 0;
  
  public ae()
  {
    g.Ek();
    this.prx = ((Integer)g.Ei().DT().get(196660, Integer.valueOf(0))).intValue();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletSwitchConfig", "WalletSwitchConfig2 " + this.prx);
  }
  
  public ae(int paramInt)
  {
    g.Ek();
    g.Ei().DT().set(196660, Integer.valueOf(paramInt));
    this.prx = paramInt;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletSwitchConfig", "WalletSwitchConfig1 " + paramInt);
  }
  
  public final boolean bPj()
  {
    if ((this.prx & 0x2) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletSwitchConfig", "isMicroPayOn, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.prx) });
      return bool;
    }
  }
  
  public final boolean bPk()
  {
    if ((this.prx & 0x80) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletSwitchConfig", "isSupportScanBankCard, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.prx) });
      return bool;
    }
  }
  
  public final boolean bPl()
  {
    if ((this.prx & 0x100) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletSwitchConfig", "isSupportTouchPay, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.prx) });
      return bool;
    }
  }
  
  public final boolean bPm()
  {
    if ((this.prx & 0x800) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletSwitchConfig", "isSupporSwitchWalletCurrency, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.prx) });
      return bool;
    }
  }
  
  public final boolean bPn()
  {
    if ((this.prx & 0x10000) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletSwitchConfig", "isShowH5TradeDetail, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.prx) });
      return bool;
    }
  }
  
  public final boolean bPo()
  {
    if ((this.prx & 0x200000) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletSwitchConfig", "isShowProtocol, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.prx) });
      return bool;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */