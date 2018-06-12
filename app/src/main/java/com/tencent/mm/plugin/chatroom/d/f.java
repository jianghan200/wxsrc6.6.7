package com.tencent.mm.plugin.chatroom.d;

import com.tencent.mm.aa.j;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.l.a;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.m;
import com.tencent.mm.protocal.c.ati;
import com.tencent.mm.protocal.c.atj;
import com.tencent.mm.protocal.c.qn;
import com.tencent.mm.protocal.c.qo;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class f
  extends l
  implements com.tencent.mm.network.k
{
  public int bTS = 0;
  public String bTT;
  public final List<String> bTU;
  public final List<String> bTW;
  public List<String> bTX;
  public List<String> bTY;
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  public final List<String> hKV;
  
  public f(String paramString, List<String> paramList)
  {
    x.d("MicroMsg.NetSceneCreateChatRoom", "topic : " + paramString + " size : " + paramList.size() + " username : " + (String)paramList.get(0));
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new qn();
    ((b.a)localObject).dIH = new qo();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/createchatroom";
    ((b.a)localObject).dIF = 119;
    ((b.a)localObject).dII = 37;
    ((b.a)localObject).dIJ = 1000000037;
    this.diG = ((b.a)localObject).KT();
    localObject = (qn)this.diG.dID.dIL;
    ((qn)localObject).ruR = com.tencent.mm.platformtools.ab.oT(paramString);
    paramString = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      ati localati = new ati();
      localati.rvo = com.tencent.mm.platformtools.ab.oT(str);
      paramString.add(localati);
    }
    ((qn)localObject).rbQ = paramString;
    ((qn)localObject).hLg = paramString.size();
    this.bTU = new LinkedList();
    this.hKV = new LinkedList();
    this.bTW = new LinkedList();
    this.bTX = new LinkedList();
    this.bTY = new LinkedList();
    this.bTT = "";
  }
  
  private static boolean a(qo paramqo)
  {
    if ((!com.tencent.mm.platformtools.ab.a(paramqo.rbR).toLowerCase().endsWith("@chatroom")) || (paramqo.hLg == 0))
    {
      x.e("MicroMsg.NetSceneCreateChatRoom", "CreateChatroom: room:[" + paramqo.rbR + "] listCnt:" + paramqo.hLg);
      return false;
    }
    com.tencent.mm.storage.ab localab = new com.tencent.mm.storage.ab();
    localab.dx(com.tencent.mm.platformtools.ab.a(paramqo.ruR));
    localab.dy(com.tencent.mm.platformtools.ab.a(paramqo.ruT));
    localab.dz(com.tencent.mm.platformtools.ab.a(paramqo.ruU));
    localab.setUsername(com.tencent.mm.platformtools.ab.a(paramqo.rbR));
    au.HU();
    ay localay = c.FR();
    if (!localay.Yi(localab.field_username)) {
      localay.T(localab);
    }
    Object localObject = new j();
    ((j)localObject).username = localab.field_username;
    ((j)localObject).dHR = paramqo.rqZ;
    ((j)localObject).dHQ = paramqo.rra;
    ((j)localObject).csA = 3;
    ((j)localObject).by(false);
    ((j)localObject).bWA = -1;
    com.tencent.mm.aa.q.KH().a((j)localObject);
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    if (i < paramqo.rbQ.size())
    {
      if (((atj)paramqo.rbQ.get(i)).rWG == 0)
      {
        localObject = localay.Yg(com.tencent.mm.platformtools.ab.a(((atj)paramqo.rbQ.get(i)).rvo));
        if ((int)((a)localObject).dhP == 0) {
          break label308;
        }
        ((com.tencent.mm.storage.ab)localObject).Ba();
        localay.a(((ai)localObject).field_username, (com.tencent.mm.storage.ab)localObject);
      }
      for (;;)
      {
        localArrayList.add(((ai)localObject).field_username);
        i += 1;
        break;
        label308:
        localObject = m.a((com.tencent.mm.storage.ab)localObject, (atj)paramqo.rbQ.get(i));
        localay.T((com.tencent.mm.storage.ab)localObject);
      }
    }
    if (!localArrayList.contains(com.tencent.mm.model.q.GF()))
    {
      localArrayList.add(com.tencent.mm.model.q.GF());
      x.d("MicroMsg.NetSceneCreateChatRoom", "respon has not self add one " + localArrayList.contains(com.tencent.mm.model.q.GF()));
    }
    return m.a(localab.field_username, localArrayList, com.tencent.mm.model.q.GF());
  }
  
  private void aC(List<atj> paramList)
  {
    int i = 0;
    if (i < paramList.size())
    {
      int j = ((atj)paramList.get(i)).rWG;
      if (j == 0) {
        this.bTY.add(com.tencent.mm.platformtools.ab.a(((atj)paramList.get(i)).rvo));
      }
      for (;;)
      {
        i += 1;
        break;
        if (j == 3)
        {
          x.d("MicroMsg.NetSceneCreateChatRoom", " blacklist : " + ((atj)paramList.get(i)).rvo);
          this.hKV.add(com.tencent.mm.platformtools.ab.a(((atj)paramList.get(i)).rvo));
        }
        else if (j == 1)
        {
          x.d("MicroMsg.NetSceneCreateChatRoom", " not user : " + ((atj)paramList.get(i)).rvo);
          this.bTW.add(com.tencent.mm.platformtools.ab.a(((atj)paramList.get(i)).rvo));
        }
        else if (j == 2)
        {
          x.d("MicroMsg.NetSceneCreateChatRoom", " invalid username : " + ((atj)paramList.get(i)).rvo);
          this.bTU.add(com.tencent.mm.platformtools.ab.a(((atj)paramList.get(i)).rvo));
        }
        else if (j == 4)
        {
          x.d("MicroMsg.NetSceneCreateChatRoom", " verify user : " + ((atj)paramList.get(i)).rvo);
          this.bTX.add(com.tencent.mm.platformtools.ab.a(((atj)paramList.get(i)).rvo));
        }
        else if ((j != 5) && (j != 6))
        {
          x.w("MicroMsg.NetSceneCreateChatRoom", "unknown member status : status = " + j);
        }
      }
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneCreateChatRoom", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramq = (qo)this.diG.dIE.dIL;
    this.bTT = com.tencent.mm.platformtools.ab.a(paramq.rbR);
    paramInt1 = this.diG.dIE.qWB;
    this.bTS = paramq.hLg;
    aC(paramq.rbQ);
    if ((!bi.oW(this.bTT)) && (paramInt1 == 0)) {
      a(paramq);
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 119;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/chatroom/d/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */