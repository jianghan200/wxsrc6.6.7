package com.tencent.mm.plugin.report;

import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.matrix.mrs.core.MatrixReport;
import com.tencent.matrix.mrs.core.MatrixReport.Builder;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.kernel.c.e;
import com.tencent.mm.model.p;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.plugin.report.service.j;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mrs.util.MatrixReportBroadcast;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PluginReport
  extends com.tencent.mm.kernel.b.f
  implements com.tencent.mm.kernel.api.bucket.b, com.tencent.mm.kernel.api.c, c
{
  private p mDx;
  
  public List<String> collectStoragePaths()
  {
    LinkedList localLinkedList = new LinkedList();
    Collections.addAll(localLinkedList, new String[] { "logcat/" });
    return localLinkedList;
  }
  
  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    if (ad.cic())
    {
      x.i("Matrix.PluginReport", "load matrixmrs so");
      k.b("matrixmrs", PluginReport.class.getClassLoader());
    }
    this.mDx = new p(j.class);
    com.tencent.mm.kernel.g.a(p.class, new e(this.mDx));
    Object localObject1 = f.mDy;
    Object localObject2 = com.tencent.mm.plugin.report.service.h.mEJ;
    x.i("MicroMsg.ReportService", "instance set %s", new Object[] { localObject2 });
    ((f)localObject1).mDz = ((d)localObject2);
    MatrixReport.setMrsCallback(new com.tencent.mrs.a.a());
    paramg = paramg.dsQ;
    com.tencent.matrix.a.a(new com.tencent.mrs.a.1());
    if ((com.tencent.mm.sdk.platformtools.d.sFx) && (!com.tencent.mm.protocal.d.qVO)) {}
    for (boolean bool = true;; bool = false)
    {
      localObject1 = new com.tencent.matrix.a.a(paramg);
      localObject2 = new com.tencent.matrix.trace.a.a.a();
      ((com.tencent.matrix.trace.a.a.a)localObject2).bth = false;
      ((com.tencent.matrix.trace.a.a.a)localObject2).btg = bool;
      ((com.tencent.matrix.a.a)localObject1).a(new com.tencent.matrix.trace.a(new com.tencent.matrix.trace.a.a(((com.tencent.matrix.trace.a.a.a)localObject2).btg, ((com.tencent.matrix.trace.a.a.a)localObject2).bth, ((com.tencent.matrix.trace.a.a.a)localObject2).btj, ((com.tencent.matrix.trace.a.a.a)localObject2).btk, ((com.tencent.matrix.trace.a.a.a)localObject2).btm, ((com.tencent.matrix.trace.a.a.a)localObject2).bto, ((com.tencent.matrix.trace.a.a.a)localObject2).btl, ((com.tencent.matrix.trace.a.a.a)localObject2).bti, ((com.tencent.matrix.trace.a.a.a)localObject2).btp, (byte)0)));
      localObject2 = new com.tencent.matrix.resource.b.a.a();
      ((com.tencent.matrix.resource.b.a.a)localObject2).brx = com.tencent.mm.sdk.a.b.chn();
      ((com.tencent.matrix.a.a)localObject1).a(new com.tencent.matrix.resource.c(new com.tencent.matrix.resource.b.a(((com.tencent.matrix.resource.b.a.a)localObject2).brv, ((com.tencent.matrix.resource.b.a.a)localObject2).brw, ((com.tencent.matrix.resource.b.a.a)localObject2).brx, (byte)0)));
      ((com.tencent.matrix.a.a)localObject1).a(new com.tencent.matrix.a.a(new com.tencent.matrix.a.a.a.a().em(1).em(4).em(8).th()));
      com.tencent.matrix.resource.c.a(paramg);
      ((com.tencent.matrix.a.a)localObject1).a(new com.tencent.matrix.iocanary.a());
      ((com.tencent.matrix.a.a)localObject1).a(new com.tencent.sqlitelint.h(new com.tencent.sqlitelint.a.a(com.tencent.sqlitelint.e.c.vnq)));
      com.tencent.mrs.a.uZP = new com.tencent.mrs.b.a(paramg);
      ((com.tencent.matrix.a.a)localObject1).boU = com.tencent.mrs.a.uZP;
      if (((com.tencent.matrix.a.a)localObject1).boU == null) {
        ((com.tencent.matrix.a.a)localObject1).boU = new com.tencent.matrix.b.a(((com.tencent.matrix.a.a)localObject1).application);
      }
      com.tencent.matrix.a.a(new com.tencent.matrix.a(((com.tencent.matrix.a.a)localObject1).application, ((com.tencent.matrix.a.a)localObject1).boU, ((com.tencent.matrix.a.a)localObject1).boT, (byte)0));
      ((com.tencent.matrix.trace.a)com.tencent.matrix.a.tg().g(com.tencent.matrix.trace.a.class)).start();
      if (bool) {
        ((com.tencent.matrix.resource.c)com.tencent.matrix.a.tg().g(com.tencent.matrix.resource.c.class)).start();
      }
      return;
    }
  }
  
  public void dependency()
  {
    dependsOn(o.class);
  }
  
  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    if (!com.tencent.matrix.a.isInstalled())
    {
      com.tencent.matrix.d.b.e("Matrix.Manager", "init matrix report, matrix is not installed, just return", new Object[0]);
      return;
    }
    com.tencent.matrix.d.b.i("Matrix.Manager", "try to init matrix report", new Object[0]);
    MatrixReport.init(new MatrixReport.Builder(ad.getContext()).clientVersion(com.tencent.mm.protocal.d.qVN).isDebug(false).revision(com.tencent.mm.sdk.platformtools.d.REV).processName(ad.getProcessName()).isReportProcess(ad.cic()).build());
  }
  
  public void installed()
  {
    alias(c.class);
  }
  
  public void onAccountInitialized(com.tencent.mm.kernel.e.c paramc)
  {
    if (!MatrixReport.isInstalled())
    {
      com.tencent.matrix.d.b.e("Matrix.Manager", "setUin, matrix report is not installed, just return", new Object[0]);
      return;
    }
    com.tencent.matrix.d.b.i("Matrix.Manager", "matrix report set the uin", new Object[0]);
    paramc = MatrixReport.with();
    com.tencent.mm.kernel.g.Eg();
    paramc.setUin(com.tencent.mm.kernel.a.Df());
    paramc = com.tencent.mrs.a.uZP;
    Looper.getMainLooper();
    Looper.myQueue().addIdleHandler(new com.tencent.mrs.b.a.1(paramc));
    MatrixReportBroadcast.cEa();
  }
  
  public void onAccountRelease() {}
  
  public String toString()
  {
    return "plugin-report";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/report/PluginReport.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */