package com.tencent.mm.plugin.normsg;

import android.os.Build.VERSION;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.model.bv;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.plugin.messenger.foundation.a.n;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.plugin.normsg.b.a.a;
import com.tencent.mm.plugin.normsg.b.a.c;
import com.tencent.mm.plugin.normsg.b.b.f;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

public class PluginNormsg
  extends f
  implements com.tencent.mm.kernel.api.c, n, a
{
  private static final String lFF = b.lFB.IO("\034:/-9+\n.\"0:41\r\"!");
  
  private void processUpdateCCEncryptKey(Map<String, String> paramMap)
  {
    String str1 = (String)paramMap.get(b.lFB.IO("k5>3,1$b\030>+)=/\016:6$. %\0316%s+-4"));
    if (bi.oW(str1))
    {
      x.e("MicroMsg.PluginNormsg", "uccek: cannot get required url.");
      return;
    }
    String str2 = Normsg.a.bjy();
    if (str2 != null) {}
    for (paramMap = new File(str2); paramMap == null; paramMap = null)
    {
      x.e("MicroMsg.PluginNormsg", "uccek: failure to get required path.");
      h.mEJ.e(876L, 0L, 1L);
      return;
    }
    if (!paramMap.exists())
    {
      localFile = paramMap.getParentFile();
      if ((!localFile.exists()) && (!localFile.mkdirs()))
      {
        x.e("MicroMsg.PluginNormsg", "uccek: failure to create required path.");
        h.mEJ.e(876L, 1L, 1L);
        return;
      }
    }
    File localFile = new File(str2 + "_@tmp");
    if (localFile.exists()) {
      localFile.delete();
    }
    for (;;)
    {
      i locali = new i();
      locali.ceW = false;
      locali.dPW = str1;
      locali.field_fileType = com.tencent.mm.modelcdntran.b.dOw;
      locali.field_fullpath = localFile.getAbsolutePath();
      locali.field_mediaId = str2;
      locali.allow_mobile_net_download = false;
      locali.dQa = true;
      locali.is_resume_task = false;
      locali.field_autostart = true;
      locali.dPX = ((int)TimeUnit.MINUTES.toSeconds(1L));
      locali.dPY = ((int)TimeUnit.MINUTES.toSeconds(10L));
      locali.dPV = new PluginNormsg.1(this, localFile, paramMap);
      com.tencent.mm.modelcdntran.g.ND().b(locali, -1);
      return;
      localFile.getParentFile().mkdirs();
    }
  }
  
  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    com.tencent.mm.plugin.normsg.a.b.a(b.lFB);
  }
  
  public void dependency()
  {
    dependsOn(com.tencent.mm.plugin.zero.a.d.class);
    dependsOn(com.tencent.mm.plugin.report.c.class);
    dependsOn(com.tencent.mm.plugin.comm.a.a.class);
    dependsOn(o.class);
  }
  
  public void execute(com.tencent.mm.kernel.b.g paramg) {}
  
  public void installed()
  {
    alias(a.class);
  }
  
  public void onAccountInitialized(e.c paramc)
  {
    paramc = com.tencent.mm.plugin.normsg.b.a.bjF();
    com.tencent.mm.kernel.b.g localg = com.tencent.mm.kernel.g.Ef().DM();
    if (!a.c.isEnabled()) {
      x.w("MircoMsg.AEDHLP", "[tomys] aedh is not enabled.");
    }
    for (;;)
    {
      ((o)com.tencent.mm.kernel.g.n(o.class)).getSysCmdMsgExtension().a(lFF, this);
      return;
      int j = a.c.bjL();
      int i = j;
      if (j <= 0) {
        i = 26;
      }
      if (Build.VERSION.SDK_INT > i) {
        x.w("MircoMsg.AEDHLP", "[tomys] unsupported system, aedh is not enabled.");
      } else if (com.tencent.mm.plugin.normsg.b.a.lFM.contains(com.tencent.mm.plugin.normsg.b.a.IQ(localg.dox))) {
        try
        {
          com.tencent.mm.plugin.normsg.b.b localb = com.tencent.mm.plugin.normsg.b.b.bjN();
          localb.initialize(localg.dsQ);
          localb.Ff();
          localb.lGs.add(paramc);
          x.i("MircoMsg.AEDHLP", "[tomys] aed installed.");
        }
        catch (b.f localf)
        {
          x.printErrStackTrace("MircoMsg.AEDHLP", localf, "[tomys] aed install failed.", new Object[0]);
          paramc.g(localf);
        }
      } else {
        x.w("MircoMsg.AEDHLP", "[tomys] not target process, skip installing aed.");
      }
    }
  }
  
  public void onAccountRelease()
  {
    ((o)com.tencent.mm.kernel.g.n(o.class)).getSysCmdMsgExtension().b(lFF, this);
  }
  
  public void onNewXmlReceived(String paramString, Map<String, String> paramMap, d.a parama)
  {
    x.i("MicroMsg.PluginNormsg", "xml cmd received, subType: %s", new Object[] { paramString });
    if (lFF.equals(paramString)) {
      processUpdateCCEncryptKey(paramMap);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/normsg/PluginNormsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */