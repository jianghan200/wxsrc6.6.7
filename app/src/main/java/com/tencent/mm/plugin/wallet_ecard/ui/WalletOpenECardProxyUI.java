package com.tencent.mm.plugin.wallet_ecard.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@com.tencent.mm.ui.base.a(3)
public class WalletOpenECardProxyUI
  extends WalletECardBaseUI
{
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    return false;
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    x.i("MicroMsg.WalletOpenECardProxyUI", "activity result, request:%s, result: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 1)
    {
      if (paramInt2 == -1)
      {
        setResult(0);
        paramIntent = cDK();
        if (paramIntent != null)
        {
          Bundle localBundle = new Bundle();
          localBundle.putInt("key_process_result_code", 0);
          paramIntent.l(this, localBundle);
          return;
        }
        finish();
        return;
      }
      finish();
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ux(4);
    paramBundle = cDK();
    int i;
    if (paramBundle != null)
    {
      i = this.sy.getInt(com.tencent.mm.plugin.wallet_ecard.a.a.pBy, 0);
      bool = this.sy.getBoolean(com.tencent.mm.plugin.wallet_ecard.a.a.pBQ, false);
      x.i("MicroMsg.WalletOpenECardProxyUI", "onCreate, openScene: %s, isReuseExistCard: %s", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool) });
      if (bool) {
        cDL().m(new Object[] { Integer.valueOf(2), Integer.valueOf(i), Boolean.valueOf(true) });
      }
    }
    else
    {
      return;
    }
    String str = this.sy.getString(com.tencent.mm.plugin.wallet_ecard.a.a.pBz);
    boolean bool = this.sy.getBoolean(com.tencent.mm.plugin.wallet_ecard.a.a.pBB, false);
    x.i("MicroMsg.WalletOpenECardProxyUI", "onCreate, openScene: %s, token==null:%s, isTokenInvalid: %s", new Object[] { Integer.valueOf(i), Boolean.valueOf(bi.oW(str)), Boolean.valueOf(bool) });
    if (!bi.oW(str))
    {
      cDL().m(new Object[] { Integer.valueOf(1), Integer.valueOf(i), str });
      return;
    }
    paramBundle.a(this.mController.tml, 0, this.sy);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    int i = paramIntent.getIntExtra("key_process_result_code", -1);
    boolean bool = paramIntent.getBooleanExtra("key_process_is_end", false);
    x.i("MicroMsg.WalletOpenECardProxyUI", "new intent, resultCode: %d, isEnd: %s", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool) });
    if (i == -1)
    {
      setResult(-1);
      paramIntent = cDK();
      if (!bool) {
        break label78;
      }
      finish();
    }
    label78:
    while (paramIntent == null)
    {
      return;
      setResult(0);
      break;
    }
    paramIntent.ag(this.mController.tml);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_ecard/ui/WalletOpenECardProxyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */