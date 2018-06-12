package com.tencent.mm.plugin.chatroom.d;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.ati;
import com.tencent.mm.protocal.c.atj;
import com.tencent.mm.protocal.c.bn;
import com.tencent.mm.protocal.c.bo;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d
  extends l
  implements k
{
  public int bSU = 0;
  public final List<String> bTR;
  public final List<String> bTU;
  public final List<String> bTW;
  public final List<String> bTX;
  public String chatroomName = null;
  private final b diG;
  private com.tencent.mm.ab.e diJ = null;
  public final List<String> hKU;
  public final List<String> hKV;
  public final List<String> hKW;
  
  public d(String paramString1, List<String> paramList, String paramString2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bn();
    ((b.a)localObject).dIH = new bo();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/addchatroommember";
    ((b.a)localObject).dIF = 120;
    ((b.a)localObject).dII = 36;
    ((b.a)localObject).dIJ = 1000000036;
    this.diG = ((b.a)localObject).KT();
    localObject = (bn)this.diG.dID.dIL;
    ((bn)localObject).rbR = ab.oT(paramString1);
    this.chatroomName = paramString1;
    paramString1 = new LinkedList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      ati localati = new ati();
      localati.rvo = ab.oT(str);
      paramString1.add(localati);
    }
    ((bn)localObject).rbQ = paramString1;
    ((bn)localObject).hLg = paramString1.size();
    this.hKU = new ArrayList();
    this.bTU = new LinkedList();
    this.hKV = new LinkedList();
    this.bTW = new LinkedList();
    this.bTX = new LinkedList();
    this.hKW = new ArrayList();
    this.bTR = paramList;
    ((bn)localObject).rbT = paramString2;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    paramq = (bn)this.diG.dID.dIL;
    paramArrayOfByte = (bo)this.diG.dIE.dIL;
    this.bSU = paramArrayOfByte.hLg;
    LinkedList localLinkedList = paramArrayOfByte.rbQ;
    paramInt1 = 0;
    if (paramInt1 < localLinkedList.size())
    {
      int i = ((atj)localLinkedList.get(paramInt1)).rWG;
      if (i == 0) {
        this.hKU.add(ab.a(((atj)localLinkedList.get(paramInt1)).rvo));
      }
      for (;;)
      {
        paramInt1 += 1;
        break;
        if (i == 3)
        {
          x.d("MicroMsg.NetSceneAddChatRoomMember", " blacklist : " + ((atj)localLinkedList.get(paramInt1)).rvo);
          this.hKV.add(ab.a(((atj)localLinkedList.get(paramInt1)).rvo));
        }
        else if (i == 1)
        {
          x.d("MicroMsg.NetSceneAddChatRoomMember", " not user : " + ((atj)localLinkedList.get(paramInt1)).rvo);
          this.bTW.add(ab.a(((atj)localLinkedList.get(paramInt1)).rvo));
        }
        else if (i == 2)
        {
          x.d("MicroMsg.NetSceneAddChatRoomMember", " invalid username : " + ((atj)localLinkedList.get(paramInt1)).rvo);
          this.bTU.add(ab.a(((atj)localLinkedList.get(paramInt1)).rvo));
        }
        else if (i == 4)
        {
          x.d("MicroMsg.NetSceneAddChatRoomMember", " verify user : " + ((atj)localLinkedList.get(paramInt1)).rvo);
          this.bTX.add(ab.a(((atj)localLinkedList.get(paramInt1)).rvo));
        }
        else if (i != 5)
        {
          if (i == 6) {
            this.hKW.add(ab.a(((atj)localLinkedList.get(paramInt1)).rvo));
          } else {
            x.w("MicroMsg.NetSceneAddChatRoomMember", "unknown member status : status = " + i);
          }
        }
      }
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      m.a(ab.a(paramq.rbR), paramArrayOfByte);
    }
  }
  
  public final int getType()
  {
    return 120;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/chatroom/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */