package com.tencent.mm.az;

import android.os.HandlerThread;
import com.tencent.mm.ab.d.c;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.g.a.kl;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.al;
import com.tencent.mm.model.ar;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.ba;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.bd.d;
import com.tencent.mm.storage.bo;
import com.tencent.mm.storage.bp;
import java.util.HashMap;
import java.util.List;

public class d
  implements ar
{
  public static int[] eln = new int['Ϩ'];
  public static int num = 0;
  private final int bzF = 0;
  private e elj = new e();
  private b elk = new b();
  private final long ell = 259200000L;
  private final int elm = 2;
  private com.tencent.mm.sdk.b.c elo = new d.1(this);
  
  public static com.tencent.mm.storage.au SE()
  {
    g.Eg().Ds();
    as localas = SF();
    com.tencent.mm.storage.au localau = (com.tencent.mm.storage.au)((i)g.l(i.class)).bcX();
    localau.a(localas, g.Em().lnJ.getLooper());
    return localau;
  }
  
  public static as SF()
  {
    g.Eg().Ds();
    return (as)((i)g.l(i.class)).bcW();
  }
  
  public static bb SG()
  {
    g.Eg().Ds();
    return (bb)((i)g.l(i.class)).bcV();
  }
  
  public static bp SH()
  {
    g.Eg().Ds();
    return (bp)((i)g.l(i.class)).bcU();
  }
  
  public static void a(by paramby, bd.d paramd)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SubCoreVerify", "saveToLbsVerifyStg, cmdAM, status = " + paramby.hcd + ", id = " + paramby.rcq);
    ba localba = new ba();
    localba.field_content = ab.a(paramby.rcl);
    localba.field_createtime = bi.VE();
    localba.field_imgpath = "";
    localba.field_sayhicontent = paramd.content;
    localba.field_sayhiuser = paramd.otZ;
    localba.field_scene = paramd.scene;
    if (paramby.hcd > 3) {}
    for (int i = paramby.hcd;; i = 3)
    {
      localba.field_status = i;
      localba.field_svrid = paramby.rcq;
      localba.field_talker = ab.a(paramby.rcj);
      localba.field_type = paramby.jQd;
      localba.field_isSend = 0;
      localba.field_sayhiencryptuser = paramd.tbT;
      localba.field_ticket = paramd.juZ;
      localba.field_flag = 1;
      ((bb)((i)g.l(i.class)).bcV()).a(localba);
      com.tencent.mm.aa.c.J(localba.field_sayhiencryptuser, 3);
      return;
    }
  }
  
  public static void b(by paramby, bd.d paramd)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SubCoreVerify", "saveToShakeVerifyStg, cmdAM, status = " + paramby.hcd + ", id = " + paramby.rcq);
    bo localbo = new bo();
    localbo.field_content = ab.a(paramby.rcl);
    localbo.field_createtime = bi.VE();
    localbo.field_imgpath = "";
    localbo.field_sayhicontent = paramd.content;
    localbo.field_sayhiuser = paramd.otZ;
    localbo.field_scene = paramd.scene;
    if (paramby.hcd > 3) {}
    for (int i = paramby.hcd;; i = 3)
    {
      localbo.field_status = i;
      localbo.field_svrid = paramby.rcq;
      localbo.field_talker = ab.a(paramby.rcj);
      localbo.field_type = paramby.jQd;
      localbo.field_isSend = 0;
      ((bp)((i)g.l(i.class)).bcU()).a(localbo);
      com.tencent.mm.aa.c.J(localbo.field_sayhiuser, 3);
      return;
    }
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void bn(boolean paramBoolean)
  {
    d.c.a(Integer.valueOf(37), this.elj);
    d.c.a(Integer.valueOf(65), this.elj);
    d.c.a(Integer.valueOf(40), this.elk);
    com.tencent.mm.sdk.b.a.sFg.b(this.elo);
    int i = SF().clP();
    long l = System.currentTimeMillis();
    com.tencent.mm.model.au.HU();
    l -= bi.a((Long)com.tencent.mm.model.c.DT().get(340225, null), 0L);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreVerify", "timeInterval = " + l);
    if ((l > 259200000L) && (i > 0))
    {
      Object localObject = SF().clQ();
      int j = ((List)localObject).size();
      String str = (String)((List)localObject).get(0);
      i = 1;
      while (i < j)
      {
        str = str + ", " + (String)((List)localObject).get(i);
        i += 1;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreVerify", "title = " + str);
      localObject = new kl();
      ((kl)localObject).bUL.userName = null;
      ((kl)localObject).bUL.bgn = str;
      ((kl)localObject).bUL.type = 0;
      com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
      com.tencent.mm.model.au.HU();
      com.tencent.mm.model.c.DT().set(340225, Long.valueOf(System.currentTimeMillis()));
    }
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    d.c.b(Integer.valueOf(37), this.elj);
    d.c.b(Integer.valueOf(65), this.elj);
    d.c.b(Integer.valueOf(40), this.elk);
    com.tencent.mm.sdk.b.a.sFg.c(this.elo);
    com.tencent.mm.model.au.getNotification().xR();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/az/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */