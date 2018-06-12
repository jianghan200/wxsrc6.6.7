package com.tencent.mm.booter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import com.jg.JgClassChecked;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.model.au;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.aa;
import com.tencent.mm.storage.w;
import com.tencent.mm.ui.base.s;
import java.io.File;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
public class MountReceiver
  extends BroadcastReceiver
{
  private String action = "";
  private ag cWS = new MountReceiver.1(this, Looper.getMainLooper());
  private Context context = null;
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramContext == null) || (paramIntent == null) || (ai.oW(paramIntent.getAction()))) {}
    String str1;
    boolean bool;
    do
    {
      return;
      this.context = paramContext;
      this.action = paramIntent.getAction();
      str1 = Environment.getExternalStorageDirectory().getAbsolutePath();
      x.i("MicroMsg.MountReceiver", "dkmount action:%s hasuin:%b SDCARD_ROOT[%s] primaryExtStg[%s]", new Object[] { this.action, Boolean.valueOf(au.HX()), e.bnC, str1 });
      bool = this.action.equals("android.intent.action.MEDIA_MOUNTED");
    } while ((!bool) && (!this.action.equals("android.intent.action.MEDIA_EJECT")) && (!this.action.equals("android.intent.action.MEDIA_SHARED")));
    if (!e.bnC.equalsIgnoreCase("/dev/null")) {}
    int j;
    for (int i = 1;; i = 0)
    {
      j = i;
      if (i != 0) {}
      try
      {
        localObject = new StatFs(e.bnC);
        x.i("MicroMsg.MountReceiver", "CheckSD path[%s] blocksize:%d blockcount:%d availcount:%d", new Object[] { e.bnC, Integer.valueOf(((StatFs)localObject).getBlockSize()), Integer.valueOf(((StatFs)localObject).getBlockCount()), Integer.valueOf(((StatFs)localObject).getAvailableBlocks()) });
        j = i;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Object localObject;
          x.e("MicroMsg.MountReceiver", "CheckSD failed :%s", new Object[] { localException.getMessage() });
          j = 0;
          continue;
          l = 12L;
          continue;
          paramIntent = new w(aa.duN + "SdcardInfo.cfg");
          String str2 = (String)paramIntent.get(1, "");
          i = ((Integer)paramIntent.get(2, Integer.valueOf(0))).intValue();
          j = Build.VERSION.SDK_INT;
          String str3 = e.bnC;
          paramIntent.set(1, str1);
          paramIntent.set(2, Integer.valueOf(j));
          e.ff(str1);
          x.w("MicroMsg.MountReceiver", "summermount init sdcard root old [%d, %s] to new [%d, %s], [%s] to [%s]", new Object[] { Integer.valueOf(i), str2, Integer.valueOf(j), str1, str3, e.bnC });
        }
        paramIntent = h.mEJ;
        if (!bool) {
          break label591;
        }
        for (long l = 13L;; l = 14L)
        {
          paramIntent.a(340L, l, 1L, false);
          break;
        }
        s.gH(paramContext);
        au.Em().H(new MountReceiver.3(this));
      }
      paramIntent = paramIntent.getData();
      if (paramIntent == null) {
        break label563;
      }
      paramIntent = paramIntent.getPath();
      if (!e.bnC.equalsIgnoreCase(paramIntent))
      {
        if ((!bool) || (j != 0)) {
          break;
        }
        localObject = h.mEJ;
        if (!e.bnC.equalsIgnoreCase("/dev/null")) {
          break label415;
        }
        l = 9L;
        ((h)localObject).a(340L, l, 1L, false);
        if ((ai.oW(str1)) || (!str1.equalsIgnoreCase(paramIntent))) {
          break;
        }
        if (new File(aa.duN + "SdcardInfo.cfg").exists()) {
          break label423;
        }
        x.w("MicroMsg.MountReceiver", "summermount init sdcard root old [%s] to new [%s], ver[%d]", new Object[] { e.bnC, str1, Integer.valueOf(Build.VERSION.SDK_INT) });
        e.bnC = str1;
        e.ff(str1);
      }
      if (!bool) {
        break label599;
      }
      au.Em().H(new MountReceiver.2(this));
      return;
    }
    label415:
    label423:
    label563:
    label591:
    label599:
    return;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/booter/MountReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */