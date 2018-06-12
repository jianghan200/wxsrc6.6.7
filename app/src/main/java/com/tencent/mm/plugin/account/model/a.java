package com.tencent.mm.plugin.account.model;

import android.os.Message;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.ab;
import com.tencent.mm.plugin.account.friend.a.al;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class a
  implements e
{
  com.tencent.mm.plugin.account.a.a.b dRz = new a.3(this);
  Set<String> eNM = Collections.synchronizedSet(new HashSet());
  c eNN = new a.1(this);
  ag eNO = new ag()
  {
    public final void handleMessage(Message paramAnonymousMessage)
    {
      switch (paramAnonymousMessage.what)
      {
      default: 
        return;
      }
      a.this.egv = true;
      boolean bool = com.tencent.mm.platformtools.b.syncAddrBook(a.this.dRz);
      if (!bool) {
        a.this.egv = false;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactsAutoSyncLogic ", "sync result %b", new Object[] { Boolean.valueOf(bool) });
    }
  };
  boolean egv = false;
  
  public a()
  {
    com.tencent.mm.sdk.b.a.sFg.b(this.eNN);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if (paraml.getType() == 133)
    {
      g.DF().b(133, this);
      if ((paramInt1 == 0) && (paramInt2 == 0)) {
        break label127;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactsAutoSyncLogic ", "MMFunc_UploadMContact onSceneEnd: errType = " + paramInt1 + ", errCode = " + paramInt2);
      this.egv = false;
    }
    for (;;)
    {
      if (paraml.getType() == 32)
      {
        this.egv = false;
        g.DF().b(32, this);
        if ((paramInt1 == 0) && (paramInt2 == 0)) {
          break;
        }
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactsAutoSyncLogic ", "rtGETMFRIEND onSceneEnd: errType = " + paramInt1 + ", errCode = " + paramInt2);
      }
      return;
      label127:
      g.DF().a(32, this);
      paramString = (al)paraml;
      paramString = new ab(paramString.eLj, paramString.eLk);
      g.DF().a(paramString, 0);
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactsAutoSyncLogic ", "update All Contact");
    com.tencent.mm.platformtools.x.cb(ad.getContext());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/account/model/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */