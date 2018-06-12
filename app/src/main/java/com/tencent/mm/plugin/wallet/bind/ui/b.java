package com.tencent.mm.plugin.wallet.bind.ui;

import android.text.TextUtils;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.storage.x;

public final class b
{
  public static boolean a(Bankcard paramBankcard)
  {
    if (paramBankcard == null) {
      return false;
    }
    g.Ek();
    Object localObject1 = (String)g.Ei().DT().get(196659, null);
    if (TextUtils.isEmpty((CharSequence)localObject1)) {
      return true;
    }
    localObject1 = ((String)localObject1).split("&");
    if ((localObject1 == null) || (localObject1.length == 0)) {
      return true;
    }
    int i = 0;
    for (;;)
    {
      if (i >= localObject1.length) {
        break label87;
      }
      Object localObject2 = localObject1[i];
      if ((localObject2 != null) && (((String)localObject2).equals(paramBankcard.field_bankcardType))) {
        break;
      }
      i += 1;
    }
    label87:
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet/bind/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */