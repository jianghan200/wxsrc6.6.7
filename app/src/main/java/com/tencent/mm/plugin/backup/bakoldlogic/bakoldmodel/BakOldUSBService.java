package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.jg.JgClassChecked;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.c;
import com.tencent.mm.plugin.backup.bakoldlogic.c.f;
import com.tencent.mm.protocal.c.ach;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.SERVICESCHECK})
public class BakOldUSBService
  extends Service
  implements com.tencent.mm.ab.e
{
  private boolean gWY = false;
  private int gZb = -1;
  
  private boolean asL()
  {
    return (this.gZb == 0) || (this.gZb == 1);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    String str;
    if (paraml == null)
    {
      str = "";
      x.i("MicroMsg.BakOldUSBService", "summerbak onSceneEnd [%d, %d, %s] [%s] backupScene[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, str, Integer.valueOf(this.gZb) });
      if (!(paraml instanceof com.tencent.mm.plugin.backup.f.b)) {
        break label188;
      }
      x.d("MicroMsg.BakOldUSBService", "summerback BackupBaseScene type[%d], backupScene[%d]", new Object[] { Integer.valueOf(paraml.getType()), Integer.valueOf(this.gZb) });
      if ((paraml.getType() == 1) && (paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = new Intent().setClassName(this, "com.tencent.mm.ui.LauncherUI");
        paramString.addFlags(335544320);
        paramString.putExtra("nofification_type", "back_to_pcmgr_notification");
        if (asL()) {
          break label182;
        }
        bool = true;
        paramString.putExtra("newPCBackup", bool);
        startActivity(paramString);
      }
      stopSelf();
    }
    label182:
    label188:
    while (!(paraml instanceof f)) {
      for (;;)
      {
        return;
        str = paraml.getClass().getSimpleName();
        break;
        boolean bool = false;
      }
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = ((f)paraml).atg();
      a.asN().gRu = paramString.ID;
      a.asN().gRv = paramString.rfr;
      a.asN().gRw = paramString.rfs;
      this.gZb = paramString.otY;
      x.d("MicroMsg.BakOldUSBService", "summerbak getconnetinfo type: %d, scene: %d isFromWifi:%b", new Object[] { Integer.valueOf(paramString.hcE), Integer.valueOf(paramString.otY), Boolean.valueOf(this.gWY) });
      if ((!this.gWY) && (paramString.hcE == 1))
      {
        x.e("MicroMsg.BakOldUSBService", "broast from usb but type is wifi, url may be fake!!!!");
        stopSelf();
        return;
      }
      if (asL())
      {
        a.asN().asO().bS(paramString.rfj, paramString.rfk);
        com.tencent.mm.plugin.backup.f.b.a(a.asN().asO());
        com.tencent.mm.plugin.backup.f.b.a(a.asN().asQ());
        com.tencent.mm.plugin.backup.f.b.mx(1);
        a.asN().asQ().c(paramString.hcE, paramString.rfi);
        return;
      }
      x.d("MicroMsg.BakOldUSBService", "summerbak onSceneEnd need todo for new scene:% ", new Object[] { Integer.valueOf(this.gZb) });
      return;
    }
    a.asN().asP().gZu = 2;
    a.asN().asP().IF();
    if ((paramInt1 == 4) && (paramInt2 == 63525)) {
      x.i("MicroMsg.BakOldUSBService", "getConnect info: INVALID URL");
    }
    for (;;)
    {
      a.asN().asO();
      com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e.asX();
      stopSelf();
      return;
      x.i("MicroMsg.BakOldUSBService", "getConnect info other error");
    }
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    x.i("MicroMsg.BakOldUSBService", "onBind()");
    return null;
  }
  
  public void onCreate()
  {
    x.i("MicroMsg.BakOldUSBService", "onCreate()");
    super.onCreate();
    au.DF().a(595, this);
    com.tencent.mm.plugin.backup.f.b.a(1, this);
  }
  
  public void onDestroy()
  {
    au.DF().b(595, this);
    com.tencent.mm.plugin.backup.f.b.b(1, this);
    super.onDestroy();
    x.i("MicroMsg.BakOldUSBService", "onDestroy thread:" + Thread.currentThread().getName());
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    paramInt1 = 1;
    x.i("MicroMsg.BakOldUSBService", "onStartCommand() scene：%d", new Object[] { Integer.valueOf(this.gZb) });
    if (paramIntent == null)
    {
      x.w("MicroMsg.BakOldUSBService", "onStartCommand intent is null");
      return 2;
    }
    String str = paramIntent.getStringExtra("url");
    if (bi.oW(str))
    {
      x.e("MicroMsg.BakOldUSBService", "onStartCommand url is null");
      stopSelf();
      return 2;
    }
    this.gWY = paramIntent.getBooleanExtra("isFromWifi", false);
    x.i("MicroMsg.BakOldUSBService", "Broadcast url:%s, isFromWifi:%b", new Object[] { str, Boolean.valueOf(this.gWY) });
    a.asN().asP().IF();
    paramIntent = a.asN().asP();
    if (this.gWY) {
      paramInt1 = 2;
    }
    paramIntent.gZt = paramInt1;
    if (!au.HW())
    {
      x.e("MicroMsg.BakOldUSBService", "onStartCommand not in Login state");
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
  
  public boolean stopService(Intent paramIntent)
  {
    x.i("MicroMsg.BakOldUSBService", "stopService.");
    return super.stopService(paramIntent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/bakoldmodel/BakOldUSBService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */