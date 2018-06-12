package com.tencent.mm.plugin.wallet_core.model;

import android.text.TextUtils;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;

public final class ad
{
  public ArrayList<Bankcard> prv = new ArrayList();
  public String prw;
  
  public final Bankcard OZ(String paramString)
  {
    Bankcard localBankcard;
    if (this.prv.size() > 0)
    {
      Iterator localIterator = this.prv.iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localBankcard = (Bankcard)localIterator.next();
      } while (!localBankcard.field_bindSerial.equals(paramString));
    }
    for (paramString = localBankcard;; paramString = null)
    {
      if (paramString == null)
      {
        x.e("MicroMsg.WalletRepaymentBankcardMgr", "getBankcardBySerialNo return null");
        return paramString;
      }
      x.i("MicroMsg.WalletRepaymentBankcardMgr", "getBankcardBySerialNo succ");
      return paramString;
      x.e("MicroMsg.WalletRepaymentBankcardMgr", "repayment bankcard list size is 0");
      return null;
    }
  }
  
  public final boolean bPh()
  {
    return this.prv.size() > 0;
  }
  
  public final Bankcard bPi()
  {
    if (bPh())
    {
      if (!TextUtils.isEmpty(this.prw)) {
        return OZ(this.prw);
      }
      x.i("MicroMsg.WalletRepaymentBankcardMgr", "last_use_card_serialno is empty,return the first one");
      return (Bankcard)this.prv.get(0);
    }
    x.e("MicroMsg.WalletRepaymentBankcardMgr", "Repayment card list is null");
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */