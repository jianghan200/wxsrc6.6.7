package com.tencent.mm.plugin.wallet.pay.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ad;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wallet_core.ui.g;
import com.tencent.mm.ui.base.a;
import java.util.ArrayList;

@a(3)
public class WalletChangeLoanRepayBankcardUI
  extends WalletChangeBankcardUI
{
  protected final g bNB()
  {
    this.oZG = o.bOX().prv;
    bNA();
    return new g(this, this.oZG, this.pfw, this.mCZ);
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setBackBtn(new WalletChangeLoanRepayBankcardUI.1(this));
  }
  
  protected final void zg(int paramInt)
  {
    int i;
    Object localObject;
    if (this.oZG != null)
    {
      i = this.oZG.size();
      if ((this.oZG == null) || (paramInt >= i)) {
        break label117;
      }
      localObject = (Bankcard)this.oZG.get(paramInt);
      this.oZH = ((Bankcard)localObject);
      this.pfx.puN = ((Bankcard)localObject).field_bindSerial;
      this.mAE.setEnabled(true);
      this.pfx.notifyDataSetChanged();
      Intent localIntent = new Intent();
      localIntent.putExtra("bindSerial", ((Bankcard)localObject).field_bindSerial);
      localIntent.putExtra("ret", 0);
      setResult(-1, localIntent);
    }
    for (;;)
    {
      finish();
      return;
      i = 0;
      break;
      label117:
      if (i == paramInt)
      {
        localObject = new Intent();
        ((Intent)localObject).putExtra("ret", 64533);
        setResult(-1, (Intent)localObject);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet/pay/ui/WalletChangeLoanRepayBankcardUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */