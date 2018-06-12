package com.tencent.mm.plugin.chatroom.d;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.anv;
import com.tencent.mm.protocal.c.ati;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class k
  extends l
  implements com.tencent.mm.network.k
{
  public bd bXQ;
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  public int hLg;
  
  public k(String paramString, List<String> paramList)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new anu();
    ((b.a)localObject).dIH = new anv();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/invitechatroommember";
    ((b.a)localObject).dIF = 610;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (anu)this.diG.dID.dIL;
    LinkedList localLinkedList = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      ati localati = new ati();
      localati.rvo = ab.oT(str);
      localLinkedList.add(localati);
    }
    ((anu)localObject).rbQ = localLinkedList;
    ((anu)localObject).hLg = localLinkedList.size();
    ((anu)localObject).rbR = ab.oT(paramString);
    ((anu)localObject).rQx = 0;
  }
  
  public k(String paramString1, List<String> paramList, String paramString2, bd parambd)
  {
    this.bXQ = parambd;
    parambd = new b.a();
    parambd.dIG = new anu();
    parambd.dIH = new anv();
    parambd.uri = "/cgi-bin/micromsg-bin/invitechatroommember";
    parambd.dIF = 610;
    parambd.dII = 0;
    parambd.dIJ = 0;
    this.diG = parambd.KT();
    parambd = (anu)this.diG.dID.dIL;
    LinkedList localLinkedList = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      ati localati = new ati();
      localati.rvo = ab.oT(str);
      localLinkedList.add(localati);
    }
    this.hLg = localLinkedList.size();
    parambd.rbQ = localLinkedList;
    parambd.hLg = localLinkedList.size();
    parambd.rbR = ab.oT(paramString1);
    parambd.rQx = 2;
    parambd.rQy = paramString2;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneInviteChatRoomMember", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 610;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/chatroom/d/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */