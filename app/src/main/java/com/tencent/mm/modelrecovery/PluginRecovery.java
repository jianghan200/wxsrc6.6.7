package com.tencent.mm.modelrecovery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.mm.g.a.my;
import com.tencent.mm.g.a.my.a;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.recovery.RecoveryContext;
import com.tencent.recovery.RecoveryLogic;
import com.tencent.recovery.log.RecoveryLog;
import com.tencent.recovery.log.RecoveryLog.RecoveryLogImpl;
import com.tencent.recovery.option.CommonOptions.Builder;
import com.tencent.recovery.wx.WXConstantsRecovery;
import com.tencent.recovery.wx.service.WXRecoveryHandleService;
import com.tencent.recovery.wx.service.WXRecoveryUploadService;
import com.tencent.recovery.wx.util.WXUtil;
import java.io.File;

public class PluginRecovery
  extends f
  implements com.tencent.mm.kernel.api.bucket.c
{
  private com.tencent.mm.sdk.b.c<my> edh = new com.tencent.mm.sdk.b.c()
  {
    private static boolean a(my paramAnonymousmy)
    {
      switch (paramAnonymousmy.bYa.action)
      {
      default: 
        return false;
      case 2: 
        a.Qr();
        return false;
      case 1: 
        paramAnonymousmy = ad.getContext();
        localBuilder = new CommonOptions.Builder();
        localBuilder.vhz = WXRecoveryHandleService.class.getName();
        localBuilder.vhA = WXRecoveryUploadService.class.getName();
        localBuilder.clientVersion = com.tencent.mm.sdk.platformtools.d.CLIENT_VERSION;
        localBuilder.vhv = String.format("file:///sdcard/test-recovery.conf", new Object[0]);
        localBuilder.fMk = WXUtil.hp(paramAnonymousmy);
        RecoveryLogic.a(paramAnonymousmy, localBuilder.cEZ(), new RecoveryContext());
        return false;
      }
      paramAnonymousmy = ad.getContext();
      CommonOptions.Builder localBuilder = new CommonOptions.Builder();
      localBuilder.vhz = WXRecoveryHandleService.class.getName();
      localBuilder.vhA = WXRecoveryUploadService.class.getName();
      localBuilder.clientVersion = com.tencent.mm.sdk.platformtools.d.CLIENT_VERSION;
      localBuilder.vhv = "http://dldir1.qq.com/weixin/android/recovery-0x26032011.conf";
      localBuilder.fMk = WXUtil.hp(paramAnonymousmy);
      RecoveryLogic.a(paramAnonymousmy, localBuilder.cEZ(), new RecoveryContext());
      return false;
    }
  };
  private RecoveryLog.RecoveryLogImpl edi = new PluginRecovery.5(this);
  private BroadcastReceiver rj = new BroadcastReceiver()
  {
    public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      if (paramAnonymousIntent != null)
      {
        if (!"com.tecent.recovery.intent.action.LOG".equals(paramAnonymousIntent.getAction())) {
          break label24;
        }
        PluginRecovery.this.postLog();
      }
      label24:
      while (!"com.tecent.mm.intent.action.RECOVERY_STATUS_UPLOAD".equals(paramAnonymousIntent.getAction())) {
        return;
      }
      PluginRecovery.this.postReport();
    }
  };
  
  private void postLog()
  {
    e.post(new Runnable()
    {
      public final void run()
      {
        x.i("MicroMsg.Recovery.PluginRecovery", "postLog");
        a.Qr();
      }
    }, "RecoveryWriteLogThread");
  }
  
  private void postReport()
  {
    e.post(new Runnable()
    {
      public final void run()
      {
        x.i("MicroMsg.Recovery.PluginRecovery", "postReport");
        b.Qs();
      }
    }, "RecoveryReportStatusThread");
  }
  
  public void configure(g paramg)
  {
    RecoveryLog.a(this.edi);
    long l;
    if (paramg.gn(":sandbox"))
    {
      l = System.currentTimeMillis();
      paramg = new IntentFilter();
      paramg.addAction("com.tecent.recovery.intent.action.LOG");
      paramg.addAction("com.tecent.mm.intent.action.RECOVERY_STATUS_UPLOAD");
      ad.getContext().registerReceiver(this.rj, paramg);
      paramg = new File(WXConstantsRecovery.vhL);
      if (!paramg.exists()) {
        paramg.mkdir();
      }
      paramg = new File(paramg, "version.info");
      if (paramg.exists()) {
        paramg.delete();
      }
    }
    try
    {
      FileOp.l(paramg.getAbsolutePath(), Integer.toHexString(com.tencent.mm.protocal.d.qVN).getBytes());
      x.i("MicroMsg.Recovery.PluginRecovery", "add recovery intent filter and save client verison file %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      return;
    }
    catch (Exception paramg)
    {
      for (;;) {}
    }
  }
  
  public void execute(g paramg) {}
  
  public void onAccountInitialized(e.c paramc)
  {
    this.edh.cht();
  }
  
  public void onAccountRelease()
  {
    this.edh.dead();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/modelrecovery/PluginRecovery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */