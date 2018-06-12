package com.tencent.mm.plugin.wallet.bind.ui;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet_core.d.c;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.HashMap;
import java.util.Map;

@com.tencent.mm.ui.base.a(3)
public class WalletUnbindBankCardProxyUI
  extends WalletBaseUI
{
  private String pdI;
  private Bankcard pdJ;
  private Map<String, String> pdK;
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    return false;
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    Object localObject1 = null;
    super.onCreate(paramBundle);
    Intent localIntent = getIntent();
    setResult(0);
    if (localIntent != null)
    {
      this.pdI = localIntent.getStringExtra("packageExt");
      if (!bi.oW(this.pdI))
      {
        paramBundle = this.pdI;
        Object localObject2;
        if (!bi.oW(paramBundle))
        {
          String[] arrayOfString = paramBundle.split("&");
          localObject2 = new HashMap();
          if ((arrayOfString != null) && (arrayOfString.length > 0))
          {
            int j = arrayOfString.length;
            int i = 0;
            for (;;)
            {
              paramBundle = (Bundle)localObject2;
              if (i >= j) {
                break;
              }
              String str = arrayOfString[i];
              if (!bi.oW(str))
              {
                int k = str.indexOf("=");
                paramBundle = str.substring(0, k);
                str = str.substring(k + 1, str.length());
                if ((!bi.oW(paramBundle)) && (!bi.oW(str))) {
                  ((Map)localObject2).put(paramBundle, str);
                }
              }
              i += 1;
            }
          }
        }
        paramBundle = null;
        this.pdK = paramBundle;
        if ((this.pdK.containsKey("bank_type")) && (this.pdK.containsKey("bind_serial")))
        {
          paramBundle = o.bOU();
          localObject2 = (String)this.pdK.get("bind_serial");
          localObject2 = "select * from WalletBankcard where bindSerial = '" + (String)localObject2 + "'";
          localObject2 = paramBundle.diF.b((String)localObject2, null, 2);
          paramBundle = (Bundle)localObject1;
          if (((Cursor)localObject2).moveToNext())
          {
            paramBundle = new Bankcard();
            paramBundle.d((Cursor)localObject2);
          }
          ((Cursor)localObject2).close();
          this.pdJ = paramBundle;
          if (this.pdJ == null)
          {
            x.e("MicorMsg.WalletUnbindBankCardProxyUI", "can not found bankcard");
            setResult(0);
            finish();
            return;
          }
          localIntent.putExtra("key_is_show_detail", false);
          localIntent.putExtra("key_bankcard", this.pdJ);
          localIntent.putExtra("scene", 1);
          com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet.bind.a.class, localIntent.getExtras(), new WalletUnbindBankCardProxyUI.1(this));
          return;
        }
        x.e("MicorMsg.WalletUnbindBankCardProxyUI", "jsapi param:package error.package==" + this.pdI);
        setResult(1);
        finish();
        return;
      }
      x.e("MicorMsg.WalletUnbindBankCardProxyUI", "jsapi param error");
      setResult(1);
      finish();
      return;
    }
    x.e("MicorMsg.WalletUnbindBankCardProxyUI", "intent is null");
    finish();
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    finish();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet/bind/ui/WalletUnbindBankCardProxyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */