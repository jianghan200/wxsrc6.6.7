package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.jg.JgClassChecked;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.backup.bakoldlogic.c.f;
import com.tencent.mm.protocal.c.ach;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.SERVICESCHECK})
public class BakchatPcUsbService
  extends Service
  implements com.tencent.mm.ab.e
{
  private boolean gWY = false;
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof com.tencent.mm.plugin.backup.f.b))
    {
      if ((paraml.getType() == 1) && (paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = new Intent().setClassName(this, "com.tencent.mm.ui.LauncherUI");
        paramString.addFlags(335544320);
        paramString.putExtra("nofification_type", "back_to_pcmgr_notification");
        startActivity(paramString);
      }
      stopSelf();
    }
    while (!(paraml instanceof f)) {
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = ((f)paraml).atg();
      if (this.gWY)
      {
        x.i("MicroMsg.BakchatPcUsbService", "from wifi, reconnect");
        a.asN().asQ().asR();
      }
      if ((!this.gWY) && (paramString.hcE == 1))
      {
        x.e("MicroMsg.BakchatPcUsbService", "broast from usb but type is wifi, url may be fake!!!!");
        stopSelf();
        return;
      }
      a.asN().gRu = paramString.ID;
      a.asN().gRv = paramString.rfr;
      a.asN().gRw = paramString.rfs;
      a.asN().asO().bS(paramString.rfj, paramString.rfk);
      com.tencent.mm.plugin.backup.f.b.a(a.asN().asO());
      com.tencent.mm.plugin.backup.f.b.a(a.asN().asQ());
      com.tencent.mm.plugin.backup.f.b.mx(1);
      a.asN().asQ().c(paramString.hcE, paramString.rfi);
      return;
    }
    a.asN().asP().gZu = 2;
    a.asN().asP().IF();
    if ((paramInt1 == 4) && (paramInt2 == 63525))
    {
      x.i("MicroMsg.BakchatPcUsbService", "getConnect info: INVALID URL");
      if (!this.gWY) {}
    }
    for (;;)
    {
      a.asN().asO();
      e.asX();
      stopSelf();
      return;
      x.i("MicroMsg.BakchatPcUsbService", "getConnect info other error");
    }
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onCreate()
  {
    x.i("MicroMsg.BakchatPcUsbService", "onCreate()");
    super.onCreate();
    au.DF().a(595, this);
    com.tencent.mm.plugin.backup.f.b.a(1, this);
  }
  
  public void onDestroy()
  {
    au.DF().b(595, this);
    com.tencent.mm.plugin.backup.f.b.b(1, this);
    super.onDestroy();
    x.i("MicroMsg.BakchatPcUsbService", "onDestroy" + Thread.currentThread().getName());
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    paramInt1 = 1;
    x.i("MicroMsg.BakchatPcUsbService", "onStartCommand()");
    if (paramIntent == null)
    {
      x.w("MicroMsg.BakchatPcUsbService", "onStartCommand intent is null");
      return 2;
    }
    String str = paramIntent.getStringExtra("url");
    if (bi.oW(str))
    {
      x.e("MicroMsg.BakchatPcUsbService", "onStartCommand url is null");
      stopSelf();
      return 2;
    }
    this.gWY = paramIntent.getBooleanExtra("isFromWifi", false);
    x.i("MicroMsg.BakchatPcUsbService", "Broadcast url:%s, isFromWifi:%b", new Object[] { str, Boolean.valueOf(this.gWY) });
    a.asN().asP().IF();
    paramIntent = a.asN().asP();
    if (this.gWY) {
      paramInt1 = 2;
    }
    paramIntent.gZt = paramInt1;
    if (!au.HW())
    {
      x.e("MicroMsg.BakchatPcUsbService", "onStartCommand not in Login state");
      paramIntent = new Intent().setClassName(this, "com.tencent.mm.ui.LauncherUI");
      paramIntent.addFlags(335544320);
      paramIntent.putExtra("nofification_type", "back_to_pcmgr_notification");
      startActivity(paramIntent);
      return 2;
    }
    paramIntent = new f(str);
    au.DF().a(paramIntent, 0);
    return 2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/BakchatPcUsbService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */