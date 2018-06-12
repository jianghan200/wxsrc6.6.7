package com.tencent.mm.plugin.account;

import com.tencent.mm.ab.d.c;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.p;
import com.tencent.mm.plugin.account.friend.a.an;
import com.tencent.mm.plugin.account.friend.a.ap;
import com.tencent.mm.plugin.account.friend.a.d;
import com.tencent.mm.plugin.account.friend.a.f;
import com.tencent.mm.plugin.account.friend.a.h;
import com.tencent.mm.plugin.account.friend.a.k;
import com.tencent.mm.plugin.account.friend.a.o;
import com.tencent.mm.plugin.account.friend.a.q;
import com.tencent.mm.plugin.fts.a.m;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.protocal.c.arf;
import java.util.HashMap;
import java.util.LinkedList;

public class b
  implements ar
{
  private static HashMap<Integer, h.d> cVM;
  private k eEA;
  private an eEB;
  private ap eEC;
  private q eED;
  private o eEE;
  private d eEF = new d();
  private LinkedList<arf> eEG = null;
  private com.tencent.mm.plugin.account.friend.a.c eEH = new com.tencent.mm.plugin.account.friend.a.c();
  private com.tencent.mm.plugin.account.friend.a.e eEI = new com.tencent.mm.plugin.account.friend.a.e();
  private f eEJ = new f();
  private com.tencent.mm.sdk.b.c eEK = new b.1(this);
  private com.tencent.mm.sdk.b.c eEL = new b.5(this);
  private com.tencent.mm.sdk.b.c eEM = new b.6(this);
  private com.tencent.mm.sdk.b.c eEN = new b.3(this);
  private com.tencent.mm.plugin.account.friend.a.b eEy;
  private h eEz;
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("ADDR_UPLOAD_TABLE".hashCode()), new b.7());
    cVM.put(Integer.valueOf("FACE_BOOK_FIREND_TABLE".hashCode()), new b.8());
    cVM.put(Integer.valueOf("FRIEND_EXT_TABLE".hashCode()), new b.9());
    cVM.put(Integer.valueOf("QQ_GROUP_TABLE".hashCode()), new b.10());
    cVM.put(Integer.valueOf("QQ_LIST_TABLE".hashCode()), new b.11());
    cVM.put(Integer.valueOf("INVITEFRIENDOPEN_TABLE".hashCode()), new b.12());
    cVM.put(Integer.valueOf("GOOGLE_FRIEND_TABLE".hashCode()), new b.2());
  }
  
  private static b WD()
  {
    try
    {
      b localb = (b)p.v(b.class);
      return localb;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static void clearFriendData()
  {
    g.Eg().Ds();
    WD().eEG = null;
  }
  
  public static com.tencent.mm.plugin.account.friend.a.b getAddrUploadStg()
  {
    g.Eg().Ds();
    if (WD().eEy == null) {
      WD().eEy = new com.tencent.mm.plugin.account.friend.a.b(g.Ei().dqq);
    }
    return WD().eEy;
  }
  
  public static h getFacebookFrdStg()
  {
    g.Eg().Ds();
    if (WD().eEz == null) {
      WD().eEz = new h(g.Ei().dqq);
    }
    return WD().eEz;
  }
  
  public static k getFrdExtStg()
  {
    g.Eg().Ds();
    if (WD().eEA == null) {
      WD().eEA = new k(g.Ei().dqq);
    }
    return WD().eEA;
  }
  
  public static LinkedList<arf> getFriendData()
  {
    g.Eg().Ds();
    return WD().eEG;
  }
  
  public static o getGoogleFriendStorage()
  {
    g.Eg().Ds();
    if (WD().eEE == null) {
      WD().eEE = new o(g.Ei().dqq);
    }
    return WD().eEE;
  }
  
  public static q getInviteFriendOpenStg()
  {
    g.Eg().Ds();
    if (WD().eED == null) {
      WD().eED = new q(g.Ei().dqq);
    }
    return WD().eED;
  }
  
  public static an getQQGroupStg()
  {
    g.Eg().Ds();
    if (WD().eEB == null) {
      WD().eEB = new an(g.Ei().dqq);
    }
    return WD().eEB;
  }
  
  public static ap getQQListStg()
  {
    g.Eg().Ds();
    if (WD().eEC == null) {
      WD().eEC = new ap(g.Ei().dqq);
    }
    return WD().eEC;
  }
  
  public static void setFriendData(LinkedList<arf> paramLinkedList)
  {
    g.Eg().Ds();
    WD().eEG = paramLinkedList;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return cVM;
  }
  
  public final void bn(boolean paramBoolean)
  {
    d.c.a(Integer.valueOf(42), this.eEF);
    d.c.a(Integer.valueOf(66), this.eEF);
    com.tencent.mm.sdk.b.a.sFg.b(this.eEN);
    com.tencent.mm.sdk.b.a.sFg.b(this.eEM);
    com.tencent.mm.sdk.b.a.sFg.b(this.eEH);
    com.tencent.mm.sdk.b.a.sFg.b(this.eEI);
    com.tencent.mm.sdk.b.a.sFg.b(this.eEJ);
    com.tencent.mm.sdk.b.a.sFg.b(this.eEK);
    com.tencent.mm.sdk.b.a.sFg.b(this.eEL);
    ((n)g.n(n.class)).getFTSTaskDaemon().a(-86016, new b.4(this));
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.eEN);
    com.tencent.mm.sdk.b.a.sFg.c(this.eEM);
    com.tencent.mm.sdk.b.a.sFg.c(this.eEH);
    com.tencent.mm.sdk.b.a.sFg.c(this.eEI);
    com.tencent.mm.sdk.b.a.sFg.c(this.eEJ);
    com.tencent.mm.sdk.b.a.sFg.c(this.eEK);
    com.tencent.mm.sdk.b.a.sFg.c(this.eEL);
    d.c.b(Integer.valueOf(42), this.eEF);
    d.c.b(Integer.valueOf(66), this.eEF);
    this.eEG = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/account/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */