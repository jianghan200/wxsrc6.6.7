package com.tencent.mm.plugin.account.friend.a;

import android.text.TextUtils;
import com.tencent.mm.aa.c;
import com.tencent.mm.aa.j;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.platformtools.h;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.protocal.c.ald;
import com.tencent.mm.protocal.c.ale;
import com.tencent.mm.protocal.c.ard;
import com.tencent.mm.protocal.c.are;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.g.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public final class af
  extends l
  implements com.tencent.mm.network.k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  private String eIe;
  private HashMap<String, n> eIh = new HashMap();
  private ArrayList<n> eLc;
  private int eLd;
  private int eLe;
  private int eLf;
  private int eLg;
  
  public af(ArrayList<n> paramArrayList, int paramInt, HashMap<String, n> paramHashMap, String paramString)
  {
    b.a locala = new b.a();
    locala.dIG = new ard();
    locala.dIH = new are();
    locala.uri = "/cgi-bin/micromsg-bin/listgooglecontact";
    locala.dIF = 488;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    this.eLc = paramArrayList;
    this.eLd = paramInt;
    this.eLe = 0;
    this.eLg = 1;
    this.eIh = paramHashMap;
    this.eIe = paramString;
  }
  
  private void a(are paramare)
  {
    for (;;)
    {
      ArrayList localArrayList;
      LinkedList localLinkedList;
      int j;
      String str1;
      String str2;
      try
      {
        x.i("MicroMsg.GoogleContact.NetSceneListGoogleContact", "handleListGoogleContactCGIResponse Count:%d", new Object[] { Integer.valueOf(paramare.hbF) });
        if ((paramare.hbG == null) || (paramare.hbG.size() <= 0)) {
          break label576;
        }
        int k = paramare.hbG.size();
        localArrayList = new ArrayList();
        localLinkedList = new LinkedList();
        j = 0;
        if (j >= k) {
          break label542;
        }
        ald localald = (ald)paramare.hbG.get(j);
        if (TextUtils.isEmpty(localald.hbL)) {
          break label591;
        }
        localObject1 = ((i)com.tencent.mm.kernel.g.l(i.class)).FR().Yg(localald.hbL);
        if ((localObject1 == null) || (!com.tencent.mm.l.a.gd(((ai)localObject1).field_type))) {
          break label586;
        }
        i = 2;
        if ((this.eIh == null) || (!this.eIh.containsKey(localald.rhh))) {
          break label579;
        }
        localObject2 = (n)this.eIh.get(localald.rhh);
        ((n)localObject2).field_username = localald.hbL;
        ((n)localObject2).field_nickname = localald.hcS;
        ((n)localObject2).field_usernamepy = h.oJ(localald.hcS);
        ((n)localObject2).field_nicknameqp = h.oI(localald.hcS);
        ((n)localObject2).field_ret = localald.rfn;
        ((n)localObject2).field_small_url = localald.rNV;
        ((n)localObject2).field_big_url = localald.rNU;
        ((n)localObject2).field_status = i;
        ((n)localObject2).field_googlecgistatus = 2;
        if ((i == 2) || (i == 0))
        {
          ((n)localObject2).field_contecttype = ("weixin" + j);
          ((n)localObject2).field_googlenamepy = h.oJ(((n)localObject2).field_googlename);
          localArrayList.add(localObject2);
          localObject1 = ((n)localObject2).field_googleid;
          str1 = ((n)localObject2).field_googlephotourl;
          str2 = this.eIe;
          if ((TextUtils.isEmpty((CharSequence)localObject1)) || (TextUtils.isEmpty(str1)) || (TextUtils.isEmpty(str2)))
          {
            localObject1 = new g.a();
            ((com.tencent.mm.g.c.g)localObject1).field_userName = localald.hbL;
            ((com.tencent.mm.g.c.g)localObject1).field_scene = 58;
            ((com.tencent.mm.g.c.g)localObject1).field_ticket = localald.rEJ;
            localLinkedList.add(localObject1);
            break label579;
          }
        }
        else
        {
          ((n)localObject2).field_contecttype = "google";
          continue;
        }
        str3 = (String)localObject1 + "@google";
      }
      finally {}
      String str3;
      Object localObject2 = com.tencent.mm.aa.q.KH().kc(str3);
      Object localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = new j();
      }
      ((j)localObject1).username = str3;
      ((j)localObject1).csA = 3;
      ((j)localObject1).dHR = c.ac(str1, str2);
      ((j)localObject1).dHQ = c.ac(str1, str2);
      ((j)localObject1).by(true);
      ((j)localObject1).bWA = 31;
      com.tencent.mm.aa.q.KH().a((j)localObject1);
      continue;
      label542:
      ((o)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.account.a.a.a.class)).getGoogleFriendStorage()).h(localArrayList);
      com.tencent.mm.plugin.d.a.ZN().Gw().cZ(localLinkedList);
      label576:
      return;
      label579:
      j += 1;
      continue;
      label586:
      int i = 0;
      continue;
      label591:
      i = 1;
    }
  }
  
  protected final int Cc()
  {
    return 20;
  }
  
  public final are XQ()
  {
    return (are)this.diG.dIE.dIL;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.i("MicroMsg.GoogleContact.NetSceneListGoogleContact", "doScene");
    this.diJ = parame1;
    parame1 = (ard)this.diG.dID.dIL;
    if (this.eLc != null)
    {
      LinkedList localLinkedList = new LinkedList();
      this.eLf = this.eLc.size();
      int i = this.eLe;
      while ((i < this.eLf) && (i < this.eLe + 500))
      {
        ale localale = new ale();
        localale.rhh = ((n)this.eLc.get(i)).field_googlegmail;
        localLinkedList.add(localale);
        i += 1;
      }
      parame1.hbG = localLinkedList;
      parame1.hbF = localLinkedList.size();
      if (this.eLe + 500 <= this.eLf) {
        break label226;
      }
    }
    label226:
    for (this.eLg = 0;; this.eLg = 1)
    {
      parame1.rlm = this.eLg;
      parame1.rTy = this.eLd;
      x.i("MicroMsg.GoogleContact.NetSceneListGoogleContact", "doscene mTotalSize:%d, mStarIndex:%d, mContinueFlag:%d", new Object[] { Integer.valueOf(this.eLf), Integer.valueOf(this.eLe), Integer.valueOf(this.eLg) });
      return a(parame, this.diG, this);
    }
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.GoogleContact.NetSceneListGoogleContact", "NetId:%d, ErrType:%d, ErrCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    a(XQ());
    if (this.eLg == 1)
    {
      this.eLe += 500;
      if (a(this.dIX, this.diJ) < 0)
      {
        x.e("MicroMsg.GoogleContact.NetSceneListGoogleContact", "doScene again failed");
        this.diJ.a(3, -1, "", this);
      }
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 488;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/account/friend/a/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */