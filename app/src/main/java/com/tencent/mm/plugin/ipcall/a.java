package com.tencent.mm.plugin.ipcall;

import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.storage.aa.a;

public final class a
  implements com.tencent.mm.ab.e
{
  private static a knO = null;
  private boolean dFt = false;
  private long knK = -1L;
  private long knL = -1L;
  private long knM = -1L;
  private long knN = -1L;
  
  public static a aWF()
  {
    if (knO == null) {
      knO = new a();
    }
    return knO;
  }
  
  private static void aWG()
  {
    long l = System.currentTimeMillis();
    au.HU();
    c.DT().a(aa.a.sQT, Long.valueOf(l));
  }
  
  public final void Vk()
  {
    if (!com.tencent.mm.plugin.ipcall.b.a.XF()) {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallAddressBookUsernameUpdater", "tryUpdate, can't sync addr book");
    }
    if (this.dFt)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallAddressBookUsernameUpdater", "tryUpdate, updating");
      return;
    }
    long l = System.currentTimeMillis();
    au.HU();
    if (Math.abs(l - ((Long)c.DT().get(aa.a.sQT, Long.valueOf(0L))).longValue()) >= 86400000L)
    {
      this.dFt = true;
      this.knK = -1L;
      this.knL = -1L;
      this.knM = -1L;
      this.knN = -1L;
      au.DF().a(32, this);
      com.tencent.mm.sdk.f.e.post(new a.1(this), "IPCallAddressBookUpdater_updateUsername");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallAddressBookUsernameUpdater", "tryUpdate, not reach time limit");
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallAddressBookUsernameUpdater", "onSceneEnd, errType: %d, errCode: %d, isUpdating: %b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(this.dFt) });
    if (!this.dFt) {
      return;
    }
    au.DF().b(32, this);
    this.knL = System.currentTimeMillis();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallAddressBookUsernameUpdater", "GetMFriend used %dms", new Object[] { Long.valueOf(this.knL - this.knK) });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallAddressBookUsernameUpdater", "GetMFriend failed");
      this.dFt = false;
      aWG();
      return;
    }
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        a.a(a.this);
      }
    }, "IPCallAddressBookUsernameUpdater_updateUsernameAfterGetMFriend");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */