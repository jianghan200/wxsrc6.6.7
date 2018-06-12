package com.tencent.mm.plugin.luckymoney.a;

import android.text.TextUtils;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.g.a.tm;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.bv.a;
import com.tencent.mm.model.p;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.luckymoney.b.aj;
import com.tencent.mm.pluginsdk.model.app.ap;
import com.tencent.mm.pluginsdk.model.app.d;
import com.tencent.mm.pluginsdk.model.app.t;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import java.io.File;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

public class a
  implements ar
{
  private bv.a hTD = new bv.a()
  {
    public final void a(d.a paramAnonymousa)
    {
      Object localObject1 = bl.z(ab.a(paramAnonymousa.dIN.rcl), "sysmsg");
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreLuckyMoney", "helios::::mPayMsgListener");
      if (localObject1 == null) {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SubCoreLuckyMoney", "Resolve msg error");
      }
      Object localObject2;
      do
      {
        do
        {
          do
          {
            return;
          } while (!"14".equals((String)((Map)localObject1).get(".sysmsg.paymsg.PayMsgType")));
          paramAnonymousa = URLDecoder.decode((String)((Map)localObject1).get(".sysmsg.paymsg.appmsgcontent"));
          if (TextUtils.isEmpty(paramAnonymousa))
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SubCoreLuckyMoney", "msgxml illegal");
            return;
          }
          localObject2 = bl.z(paramAnonymousa, "msg");
          if (localObject2 == null)
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SubCoreLuckyMoney", "Resolve appmsgxml error");
            return;
          }
          localObject2 = (String)((Map)localObject2).get(".msg.appmsg.wcpayinfo.paymsgid");
          if (bi.oW((String)localObject2))
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SubCoreLuckyMoney", "paymsgid is null");
            return;
          }
          localObject1 = (String)((Map)localObject1).get(".sysmsg.paymsg.tousername");
          if ((bi.oW(paramAnonymousa)) || (bi.oW((String)localObject1)))
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SubCoreLuckyMoney", "onRecieveMsg get a illegal msg,which content or toUserName is null");
            return;
          }
        } while (!a.this.baw().Gb((String)localObject2));
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreLuckyMoney", "insert a local msg for luckymoney");
      } while (com.tencent.mm.plugin.luckymoney.b.o.C(paramAnonymousa, (String)localObject1, 1));
      a.this.baw().Gc((String)localObject2);
    }
  };
  private com.tencent.mm.plugin.luckymoney.b.e kKF;
  private com.tencent.mm.plugin.luckymoney.b.g kKG;
  private com.tencent.mm.plugin.luckymoney.b.c kKH = new com.tencent.mm.plugin.luckymoney.b.c();
  private aj kKI;
  private com.tencent.mm.sdk.b.c<tm> kKJ = new a.2(this);
  
  public a()
  {
    File localFile = new File(bav());
    if (!localFile.exists()) {
      localFile.mkdir();
    }
    localFile = new File(com.tencent.mm.compatible.util.e.dgu);
    if (!localFile.exists()) {
      localFile.mkdir();
    }
  }
  
  public static a bat()
  {
    return (a)p.v(a.class);
  }
  
  public static com.tencent.mm.plugin.luckymoney.b.e bau()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (bat().kKF == null) {
      bat().kKF = new com.tencent.mm.plugin.luckymoney.b.e();
    }
    return bat().kKF;
  }
  
  public static String bav()
  {
    if (com.tencent.mm.kernel.g.Eg().Dx()) {
      return com.tencent.mm.plugin.p.c.Gb() + "luckymoney";
    }
    return "";
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final com.tencent.mm.plugin.luckymoney.b.g baw()
  {
    try
    {
      if (this.kKG == null) {
        this.kKG = new com.tencent.mm.plugin.luckymoney.b.g();
      }
      com.tencent.mm.plugin.luckymoney.b.g localg = this.kKG;
      return localg;
    }
    finally {}
  }
  
  public final void bn(boolean paramBoolean)
  {
    ap localap = ap.ccb();
    if (com.tencent.mm.kernel.g.Eg().Dx())
    {
      com.tencent.mm.plugin.ac.a.bmi().a(4, localap);
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Eh().dpP.a(1060, localap);
    }
    ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().a("paymsg", this.hTD, true);
    boolean bool = false;
    com.tencent.mm.kernel.g.Ek();
    long l = com.tencent.mm.kernel.g.Ei().DT().Dj(352276);
    if (System.currentTimeMillis() - l >= 43200000L) {
      bool = true;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreLuckyMoney", "isTime=" + bool + ", isUpdate=" + paramBoolean);
    if ((paramBoolean) || (bool))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreLuckyMoney", "get service applist");
      ap.ccb().eT(ad.getContext());
    }
    com.tencent.mm.sdk.b.a.sFg.b(this.kKH);
    com.tencent.mm.sdk.b.a.sFg.b(this.kKJ);
    this.kKI = new aj();
    com.tencent.mm.plugin.luckymoney.b.b.init();
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    Object localObject1 = ap.ccb();
    if (com.tencent.mm.kernel.g.Eg().Dx())
    {
      com.tencent.mm.plugin.ac.a.bmi().b(4, (t)localObject1);
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Eh().dpP.b(1060, (com.tencent.mm.ab.e)localObject1);
      ((ap)localObject1).qAT = false;
      ((ap)localObject1).qAU = false;
    }
    ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().b("paymsg", this.hTD, true);
    try
    {
      this.kKG = null;
      com.tencent.mm.sdk.b.a.sFg.c(this.kKH);
      com.tencent.mm.sdk.b.a.sFg.c(this.kKJ);
      if (this.kKI != null)
      {
        localObject1 = this.kKI;
        com.tencent.mm.sdk.b.a.sFg.c(((aj)localObject1).kRJ);
        if (((aj)localObject1).kRG != null)
        {
          com.tencent.mm.kernel.g.Ek();
          com.tencent.mm.kernel.g.Eh().dpP.c(((aj)localObject1).kRG);
          ((aj)localObject1).kRG = null;
        }
        if (((aj)localObject1).kRH != null)
        {
          com.tencent.mm.kernel.g.Ek();
          com.tencent.mm.kernel.g.Eh().dpP.c(((aj)localObject1).kRH);
          ((aj)localObject1).kRH = null;
        }
      }
      com.tencent.mm.plugin.luckymoney.b.b.Wa();
      return;
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */