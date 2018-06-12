package com.tencent.mm.plugin.account.model;

import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.v;

public class h
  implements com.tencent.mm.ab.e, g.a
{
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if (paraml.getType() != 183) {
      return;
    }
    g.DF().b(183, this);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RefreshTokenListener", "update token success");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RefreshTokenListener", "update token fail");
  }
  
  public void m(Bundle paramBundle)
  {
    String str = paramBundle.getString("access_token");
    paramBundle = paramBundle.getString("expires");
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RefreshTokenListener", "onComplete : newToken = " + str + ", expires = " + paramBundle);
    if (paramBundle != null) {
      g.Ei().DT().set(65832, paramBundle);
    }
    g.Ei().DT().set(65830, str);
    g.Ei().DT().set(65831, Long.valueOf(System.currentTimeMillis()));
    g.DF().a(183, this);
    paramBundle = new v(2, str);
    g.DF().a(paramBundle, 0);
  }
  
  public void onError(int paramInt, String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RefreshTokenListener", "onError : errType = " + paramInt + ", errMsg = " + paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/account/model/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */