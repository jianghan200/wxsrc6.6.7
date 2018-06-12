package com.tencent.mm.plugin.subapp.c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.al;
import com.tencent.mm.model.am.d;
import com.tencent.mm.model.am.f;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bs;
import com.tencent.mm.model.s;
import com.tencent.mm.platformtools.u;
import com.tencent.mm.platformtools.u.a;
import com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.e.f;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@SuppressLint({"UseSparseArrays"})
public class d
  implements am.f, ar
{
  private static HashMap<Integer, h.d> hsC;
  private static d org;
  private final Set<am.d> dba = new HashSet();
  private String dqp;
  private u.a hsE;
  private k orf;
  private j orh;
  private List<Long> ori = new ArrayList();
  private com.tencent.mm.sdk.b.c orj = new d.3(this);
  private com.tencent.mm.sdk.b.c ork = new d.4(this);
  private com.tencent.mm.sdk.b.c orl = new d.5(this);
  
  static
  {
    HashMap localHashMap = new HashMap();
    hsC = localHashMap;
    localHashMap.put(Integer.valueOf("VOICEREMIND_TABLE".hashCode()), new d.2());
  }
  
  public static d bGs()
  {
    au.HN();
    com.tencent.mm.plugin.subapp.a locala = (com.tencent.mm.plugin.subapp.a)bs.iK("plugin.subapp");
    if (locala == null) {}
    for (d locald = null;; locald = (d)locala.Oi(d.class.getName()))
    {
      org = locald;
      x.i("MicroMsg.SubCoreVoiceRemind", "summervoice SubCoreVoiceRemind getCore subCoreSubapp[%s], theCore[%s], stack[%s]", new Object[] { locala, org, bi.cjd() });
      if (org == null)
      {
        locald = new d();
        org = locald;
        com.tencent.mm.model.am.a.dBu = locald;
        locala.b(d.class.getName(), org);
      }
      return org;
    }
  }
  
  public static k bGt()
  {
    g.Eg().Ds();
    if (bGs().orf == null)
    {
      d locald = bGs();
      bGs();
      if (bGs().hsE == null)
      {
        Object localObject = new StringBuilder();
        au.HU();
        localObject = com.tencent.mm.model.c.Gp() + "CommonOneMicroMsg.db";
        bGs().hsE = u.a(d.class.hashCode(), (String)localObject, hsC, false);
      }
      locald.orf = new k(bGs().hsE);
    }
    return bGs().orf;
  }
  
  public static j bGu()
  {
    g.Eg().Ds();
    if (bGs().orh == null) {
      bGs().orh = new j();
    }
    return bGs().orh;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void HF()
  {
    bGu().run();
  }
  
  public final void a(am.d paramd)
  {
    x.d("MicroMsg.SubCoreVoiceRemind", "addVoiceRemind ");
    if (paramd != null) {
      this.dba.add(paramd);
    }
  }
  
  public final boolean aT(long paramLong)
  {
    boolean bool = this.ori.contains(Long.valueOf(paramLong));
    x.d("MicroMsg.SubCoreVoiceRemind", "silent " + bool + "  mid " + paramLong);
    return bool;
  }
  
  public final void b(am.d paramd)
  {
    x.d("MicroMsg.SubCoreVoiceRemind", "removeVoiceRemind ");
    if (paramd != null) {
      this.dba.remove(paramd);
    }
  }
  
  public final void bn(boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    au.HU();
    localStringBuilder.append(com.tencent.mm.model.c.Gp()).append("CommonOneMicroMsg.db");
    bGt();
    com.tencent.mm.sdk.b.a.sFg.b(this.orj);
    com.tencent.mm.sdk.b.a.sFg.b(this.ork);
    com.tencent.mm.sdk.b.a.sFg.b(this.orl);
    x.d("MicroMsg.SubCoreVoiceRemind", "summervoiceremind onAccountPostReset hash[%d]", new Object[] { Integer.valueOf(hashCode()) });
  }
  
  public final void bo(boolean paramBoolean)
  {
    au.HU();
    Object localObject = com.tencent.mm.model.c.Gq();
    if ((bi.oW((String)localObject)) || (bi.oW(this.dqp)) || (!((String)localObject).equals(this.dqp)))
    {
      x.d("MicroMsg.SubCoreVoiceRemind", "setVoiceRemindPath core on accPath : " + (String)localObject);
      this.dqp = ((String)localObject);
      localObject = new File((String)localObject);
      if (!((File)localObject).exists()) {
        ((File)localObject).mkdirs();
      }
      au.HU();
      localObject = new File(com.tencent.mm.model.c.Gn());
      if (!((File)localObject).exists()) {
        ((File)localObject).mkdirs();
      }
    }
  }
  
  public final void f(String paramString1, String paramString2, long paramLong)
  {
    Context localContext = ad.getContext();
    if (localContext == null)
    {
      x.d("MicroMsg.SubCoreVoiceRemind", "notifyVoiceRemind context null");
      return;
    }
    label88:
    label115:
    do
    {
      try
      {
        bool1 = com.tencent.mm.k.f.Ao();
        bool2 = com.tencent.mm.k.f.Am();
        x.d("MicroMsg.SubCoreVoiceRemind", "shake " + bool1 + "sound " + bool2);
        if (!s.hC(au.getNotification().xQ())) {
          break label115;
        }
        if (bool1) {
          bi.t(localContext, true);
        }
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          boolean bool1;
          boolean bool2;
          Object localObject;
          com.tencent.mm.compatible.b.j localj;
          x.printErrStackTrace("MicroMsg.SubCoreVoiceRemind", localException2, "", new Object[0]);
          continue;
          localUri = Uri.parse(localException2);
          continue;
          localj.setAudioStreamType(5);
          localj.setLooping(true);
          localj.prepare();
          localj.setLooping(false);
          localj.start();
        }
        paramString1 = this.dba.iterator();
      }
      if ((this.dba != null) && (this.dba.size() != 0)) {
        break label419;
      }
      RemindDialog.w(localContext, paramString1, paramString2);
      return;
      if (bool1) {
        bi.t(localContext, true);
      }
    } while (!bool2);
    localObject = com.tencent.mm.k.f.An();
    if (localObject == e.f.dgL)
    {
      localObject = RingtoneManager.getDefaultUri(2);
      localj = new com.tencent.mm.compatible.b.j();
    }
    for (;;)
    {
      int j;
      try
      {
        localj.setDataSource(localContext, (Uri)localObject);
        localj.setOnCompletionListener(new d.1(this));
        if (au.HV().getStreamVolume(5) == 0) {
          break label88;
        }
        if (!au.HV().yK()) {
          break label388;
        }
        int k = au.HV().getStreamVolume(8);
        i = au.HV().getStreamMaxVolume(8);
        j = au.HV().getStreamVolume(5);
        if (j <= i) {
          break label457;
        }
        au.HV().aP(8, i);
        localj.setAudioStreamType(8);
        localj.setLooping(true);
        localj.prepare();
        localj.setLooping(false);
        localj.start();
        au.HV().aP(8, k);
        x.d("MicroMsg.SubCoreVoiceRemind", "oldVolume is %d, toneVolume is %d", new Object[] { Integer.valueOf(k), Integer.valueOf(i) });
      }
      catch (Exception localException1)
      {
        x.printErrStackTrace("MicroMsg.SubCoreVoiceRemind", localException1, "", new Object[0]);
        try
        {
          localj.release();
        }
        catch (Throwable localThrowable)
        {
          x.printErrStackTrace("MicroMsg.SubCoreVoiceRemind", localThrowable, "relese error", new Object[0]);
        }
      }
      break label88;
      Uri localUri;
      label388:
      label419:
      while (paramString1.hasNext()) {
        ((am.d)paramString1.next()).n(paramString2, paramLong);
      }
      break;
      label457:
      int i = j;
    }
  }
  
  public final void gi(int paramInt) {}
  
  public final void ix(String paramString)
  {
    au.HU();
    com.tencent.mm.model.c.FW().Ys(paramString);
    this.ori.clear();
    au.HU();
    Cursor localCursor = com.tencent.mm.model.c.FT().GO(paramString);
    localCursor.moveToFirst();
    x.d("MicroMsg.SubCoreVoiceRemind", "resetSilentQuene");
    while (!localCursor.isAfterLast())
    {
      bd localbd = new bd();
      localbd.d(localCursor);
      long l = localbd.field_msgId;
      x.d("MicroMsg.SubCoreVoiceRemind", "resetSilentQuene: msgId = " + l + " status = " + localbd.field_status);
      localCursor.moveToNext();
      this.ori.add(Long.valueOf(l));
    }
    localCursor.close();
    au.HU();
    com.tencent.mm.model.c.FT().GM(paramString);
  }
  
  public final void onAccountRelease()
  {
    if (this.orh != null) {
      this.orh.bFj = 0;
    }
    if (org != null)
    {
      x.d("MicroMsg.SubCoreVoiceRemind", "SubCoreVoiceRemind close db");
      d locald = org;
      if (locald.hsE != null)
      {
        locald.hsE.iQ(locald.hashCode());
        locald.hsE = null;
      }
      locald.dqp = "";
    }
    com.tencent.mm.sdk.b.a.sFg.c(this.orj);
    com.tencent.mm.sdk.b.a.sFg.c(this.ork);
    com.tencent.mm.sdk.b.a.sFg.c(this.orl);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/subapp/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */