package com.tencent.mm.plugin.account.model;

import android.accounts.Account;
import android.app.Service;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.SyncResult;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import com.jg.JgClassChecked;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.i;
import com.tencent.mm.plugin.account.friend.a.ab;
import com.tencent.mm.plugin.account.friend.a.al;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.SERVICESCHECK})
public class ContactsSyncService
  extends Service
  implements com.tencent.mm.ab.e
{
  private static Account evK;
  private a eNR = null;
  private Looper eNS;
  
  public ContactsSyncService()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactsSyncService", "ContactsSyncService construction");
  }
  
  private void Yj()
  {
    if (this.eNS != null) {
      this.eNS.quit();
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactsSyncService", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " type = " + paraml.getType());
    if (paraml.getType() == 133)
    {
      g.DF().b(133, this);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactsSyncService", "uploadcontact onSceneEnd: errType = " + paramInt1 + ", errCode = " + paramInt2);
      l1 = ((Long)g.Ei().DT().get(327728, Long.valueOf(0L))).longValue();
      l2 = System.currentTimeMillis();
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactsSyncService", "getMFriend : curTime=" + l2 + ", lastTime=" + l1);
      if ((paramInt2 != 0) && (l2 - l1 < 86400000L))
      {
        Yj();
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactsSyncService", "uploadmcontact list null, do not do getmfriend.");
      }
    }
    while (paraml.getType() != 32)
    {
      long l1;
      long l2;
      return;
      g.Ei().DT().set(327728, Long.valueOf(l2));
      g.DF().a(32, this);
      paramString = (al)paraml;
      paramString = new ab(paramString.eLj, paramString.eLk);
      g.DF().a(paramString, 0);
    }
    g.DF().b(32, this);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactsSyncService", "getmfriend onSceneEnd: errType = " + paramInt1 + ", errCode = " + paramInt2);
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      com.tencent.mm.sdk.f.e.b(new i(this, evK), "MMAccountManager_updateLocalContacts").start();
    }
    Yj();
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    paramIntent = null;
    if (com.tencent.mm.pluginsdk.permission.a.bj(this, "android.permission.READ_CONTACTS"))
    {
      if (this.eNR == null) {
        this.eNR = new a(getApplicationContext());
      }
      paramIntent = this.eNR.getSyncAdapterBinder();
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactsSyncService", "ContactsSyncService onBind ret[%s]", new Object[] { paramIntent });
      return paramIntent;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactsSyncService", "ContactsSyncService onBind no permission");
    }
  }
  
  public void onDestroy()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactsSyncService", "contacts sync service destroy");
    super.onDestroy();
  }
  
  private final class a
    extends AbstractThreadedSyncAdapter
  {
    private Context mContext;
    
    public a(Context paramContext)
    {
      super(true);
      this.mContext = paramContext;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactsSyncService", "ContactsSyncService SyncAdapterImpl construction");
    }
    
    public final void onPerformSync(Account paramAccount, Bundle paramBundle, String paramString, ContentProviderClient paramContentProviderClient, SyncResult paramSyncResult)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactsSyncService", "ContactsSyncService SyncAdapterImpl onPerformSync");
      if (!g.Eg().Dx())
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactsSyncService", "ContactsSyncService account not ready, ignore this sync");
        return;
      }
      try
      {
        Looper.prepare();
        ContactsSyncService.a(ContactsSyncService.this, Looper.myLooper());
        ContactsSyncService.a(ContactsSyncService.this, paramAccount);
        Looper.loop();
        return;
      }
      catch (Exception paramAccount)
      {
        ContactsSyncService.a(ContactsSyncService.this);
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactsSyncService", "ContactsSyncService.onPerformSync error: " + paramAccount.getMessage());
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/account/model/ContactsSyncService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */