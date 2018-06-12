package com.tencent.mm.plugin.backup.backuppcmodel;

import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.IBinder;
import com.jg.JgClassChecked;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.backup.a.d;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.BakOldUSBService;
import com.tencent.mm.plugin.backup.f.e;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.SERVICESCHECK})
public class BackupPcService
  extends Service
{
  private boolean fTW = false;
  private boolean gWY = false;
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onCreate()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupPcService", "onCreate.");
    super.onCreate();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupPcService", "onDestroy thread:" + Thread.currentThread().getName());
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupPcService", "onStartCommand.");
    if (paramIntent == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BackupPcService", "onStartCommand intent is null");
      return 2;
    }
    final String str = paramIntent.getStringExtra("url");
    if (bi.oW(str))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BackupPcService", "onStartCommand url is null");
      stopSelf();
      return 2;
    }
    if (str.contains("mm.gj.qq.com"))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupPcService", "onStartCommand url from gj stop and start BakOldUSBService");
      startService(new Intent(this, BakOldUSBService.class).putExtra("url", paramIntent.getStringExtra("url")).putExtra("isFromWifi", true));
      stopSelf();
      return 2;
    }
    this.gWY = paramIntent.getBooleanExtra("isFromWifi", false);
    this.fTW = paramIntent.getBooleanExtra("isMove", false);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupPcService", "onStartCommand Broadcast url:%s, isFromWifi:%b, isMove:%b", new Object[] { str, Boolean.valueOf(this.gWY), Boolean.valueOf(this.fTW) });
    if ((!this.fTW) && (!au.HW()))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BackupPcService", "onStartCommand onStartCommand not in Login state");
      paramIntent = new Intent().setClassName(this, "com.tencent.mm.ui.LauncherUI");
      paramIntent.addFlags(335544320);
      paramIntent.putExtra("nofification_type", "back_to_pcmgr_notification");
      startActivity(paramIntent);
      return 2;
    }
    ah.A(new Runnable()
    {
      public final void run()
      {
        Object localObject = b.arV().arW();
        String str = str;
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BackupPcProcessMgr", "~~~~~~~~~~~~  start by url:%s", new Object[] { str });
        d.mx(1);
        au.HU();
        ((c)localObject).gWC = ((Integer)com.tencent.mm.model.c.DT().get(aa.a.sUX, Integer.valueOf(0))).intValue();
        b.arV();
        SharedPreferences.Editor localEditor = b.aqU().edit();
        localEditor.putInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", 0);
        localEditor.putInt("BACKUP_PC_CHOOSE_SELECT_CONTENT_TYPE", 0);
        localEditor.putLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", 0L);
        localEditor.putLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", 0L);
        localEditor.commit();
        ((c)localObject).gWD = true;
        au.DF().a(595, ((c)localObject).gUj);
        localObject = new e(str);
        au.DF().a((l)localObject, 0);
      }
    });
    return 2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/backup/backuppcmodel/BackupPcService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */