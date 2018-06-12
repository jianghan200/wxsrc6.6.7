package com.tencent.mm.plugin.account.friend.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.any;
import com.tencent.mm.protocal.c.anz;
import com.tencent.mm.protocal.c.aoa;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.LinkedList;

public final class ae
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  private LinkedList<any> eLa;
  public String eLb;
  
  public ae(ArrayList<String> paramArrayList)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new anz();
    ((b.a)localObject).dIH = new aoa();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/invitegooglecontact";
    ((b.a)localObject).dIF = 489;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    this.eLa = new LinkedList();
    if (paramArrayList.size() > 0)
    {
      int i = 0;
      while (i < paramArrayList.size())
      {
        localObject = new any();
        ((any)localObject).rhh = ((String)paramArrayList.get(i));
        this.eLa.add(localObject);
        i += 1;
      }
    }
  }
  
  public final aoa XP()
  {
    return (aoa)this.diG.dIE.dIL;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.i("MicroMsg.GoogleContact.NetSceneInviteGoogleContact", "doScene");
    this.diJ = parame1;
    parame1 = (anz)this.diG.dID.dIL;
    parame1.hbF = this.eLa.size();
    parame1.hbG = this.eLa;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.GoogleContact.NetSceneInviteGoogleContact", "NetId:%d, ErrType:%d, ErrCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 489;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/account/friend/a/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */