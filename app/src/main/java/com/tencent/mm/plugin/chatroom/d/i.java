package com.tencent.mm.plugin.chatroom.d;

import android.os.HandlerThread;
import android.util.Pair;
import com.tencent.mm.aa.j;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.bt.h;
import com.tencent.mm.hardcoder.HardCoderJNI;
import com.tencent.mm.i.a.a.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.af;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.protocal.c.acc;
import com.tencent.mm.protocal.c.acd;
import com.tencent.mm.protocal.c.mx;
import com.tencent.mm.protocal.c.my;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.u;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class i
  extends l
  implements com.tencent.mm.network.k
{
  private final String chatroomName;
  private int dYK;
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ = null;
  private int hLa = 0;
  
  public i(String paramString, int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new acc();
    ((b.a)localObject).dIH = new acd();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getchatroommemberdetail";
    ((b.a)localObject).dIF = 551;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    this.chatroomName = paramString;
    au.HU();
    int j = c.Ga().ii(paramString).ckK();
    ((acc)this.diG.dID.dIL).rGL = paramString;
    localObject = (acc)this.diG.dID.dIL;
    if (j < paramInt) {}
    for (int i = paramInt;; i = j)
    {
      ((acc)localObject).rgt = i;
      x.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom chatroomName:%s, oldVer:%d, localVer:%d, stack[%s]", new Object[] { paramString, Integer.valueOf(paramInt), Integer.valueOf(j), bi.cjd() });
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, final byte[] paramArrayOfByte)
  {
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      x.e("MicroMsg.NetSceneGetChatroomMemberDetail", "onGYNetEnd errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    x.i("MicroMsg.NetSceneGetChatroomMemberDetail", "onGYNetEnd errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = (acd)this.diG.dIE.dIL;
    au.HU();
    paramArrayOfByte = c.Ga().ii(this.chatroomName);
    long l1 = paramArrayOfByte.ckK();
    long l2 = 0xFFFFFFFF & paramq.hbC;
    int i = paramq.hbC;
    if (paramq.rGM == null) {}
    for (paramInt1 = 0;; paramInt1 = paramq.rGM.hLg)
    {
      x.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom svrVer:%d, modCnt:%d， localVer:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt1), Long.valueOf(l1) });
      if (l1 < l2) {
        break;
      }
      x.e("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom localVer[%d] serverVer[%d] is new and return", new Object[] { Long.valueOf(l1), Long.valueOf(l2) });
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramInt1 = paramq.hbC;
    if (paramArrayOfByte.b(paramArrayOfByte.sOi)) {
      paramArrayOfByte.ckJ();
    }
    paramArrayOfByte.sOi.bUd = paramInt1;
    try
    {
      paramArrayOfByte.field_roomdata = paramArrayOfByte.sOi.toByteArray();
      u.ckM();
      if (paramq.rGM == null)
      {
        paramq = null;
        if (paramq != null) {
          break label499;
        }
        paramInt1 = -1;
        x.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom memInfoList size[%d]", new Object[] { Integer.valueOf(paramInt1) });
        String str = com.tencent.mm.model.q.GF();
        if (paramArrayOfByte.b(paramArrayOfByte.sOi)) {
          paramArrayOfByte.ckJ();
        }
        localObject1 = paramq.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (my)((Iterator)localObject1).next();
          if (paramArrayOfByte.dNh.containsKey(((my)localObject2).hbL))
          {
            localObject3 = (com.tencent.mm.i.a.a.b)paramArrayOfByte.dNh.get(((my)localObject2).hbL);
            ((com.tencent.mm.i.a.a.b)localObject3).daA = ((my)localObject2).rqY;
            ((com.tencent.mm.i.a.a.b)localObject3).daB = ((my)localObject2).rrb;
            ((com.tencent.mm.i.a.a.b)localObject3).daC = ((my)localObject2).rrc;
          }
        }
      }
    }
    catch (Exception localException)
    {
      Object localObject3;
      for (;;)
      {
        x.e("MicroMsg.ChatRoomMember", "exception:%s", new Object[] { bi.i(localException) });
        continue;
        paramq = paramq.rGM.rqV;
        continue;
        label499:
        paramInt1 = paramq.size();
      }
      paramArrayOfByte.sOi.dav.clear();
      final Object localObject1 = paramArrayOfByte.dNh.keySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        paramArrayOfByte.sOi.dav.add(paramArrayOfByte.dNh.get(localObject2));
      }
      paramArrayOfByte.a(localException, paramArrayOfByte.sOi, false);
      au.HU();
      c.Ga().a(paramArrayOfByte);
      au.HU();
      paramArrayOfByte = c.FR();
      final com.tencent.mm.aa.k localk = com.tencent.mm.aa.q.KH();
      localObject1 = new LinkedList();
      final Object localObject2 = new LinkedList();
      if (paramq == null)
      {
        paramInt1 = -1;
        x.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom memInfoList size[%d]", new Object[] { Integer.valueOf(paramInt1) });
        if (paramInt1 <= HardCoderJNI.hcUpdateChatroomMemberCount) {
          break label874;
        }
        paramInt1 = 0;
        this.dYK = paramInt1;
        localObject3 = paramq.iterator();
      }
      for (;;)
      {
        label698:
        if (!((Iterator)localObject3).hasNext()) {
          break label1003;
        }
        my localmy = (my)((Iterator)localObject3).next();
        if ((!bi.oW(localmy.rra)) && (!bi.oW(localmy.hbL)))
        {
          paramq = localk.kc(localmy.hbL);
          if (paramq != null) {
            break label939;
          }
          paramq = new j();
          paramq.username = localmy.hbL;
          label778:
          paramq.dHR = localmy.rqZ;
          paramq.dHQ = localmy.rra;
          paramq.csA = 3;
          if (bi.oW(localmy.rqZ)) {
            break label956;
          }
        }
        label874:
        label939:
        label956:
        for (boolean bool = true;; bool = false)
        {
          paramq.by(bool);
          ((LinkedList)localObject2).add(paramq);
          paramq = paramArrayOfByte.Yg(localmy.hbL);
          if (paramq != null) {
            break label962;
          }
          x.e("MicroMsg.NetSceneGetChatroomMemberDetail", "NetSceneGetChatroomMemberDetail memberlist username is null");
          break label698;
          paramInt1 = paramq.size();
          break;
          bool = HardCoderJNI.hcUpdateChatroomEnable;
          i = HardCoderJNI.hcUpdateChatroomDelay;
          int j = HardCoderJNI.hcUpdateChatroomCPU;
          int k = HardCoderJNI.hcUpdateChatroomIO;
          if (HardCoderJNI.hcUpdateChatroomThr) {}
          for (paramInt1 = g.Em().cij();; paramInt1 = 0)
          {
            paramInt1 = HardCoderJNI.startPerformance(bool, i, j, k, paramInt1, HardCoderJNI.hcUpdateChatroomTimeout, 401, HardCoderJNI.hcUpdateChatroomAction, "MicroMsg.NetSceneGetChatroomMemberDetail");
            break;
          }
          paramq.Ky().equals(localmy.rra);
          break label778;
        }
        label962:
        if (paramq.Bz())
        {
          paramq.dx(localmy.hcS);
          ((LinkedList)localObject1).add(new Pair(localmy.hbL, paramq));
        }
      }
      label1003:
      x.d("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom update newImgFlagList size:%d, updateList size:%d", new Object[] { Integer.valueOf(((LinkedList)localObject2).size()), Integer.valueOf(((LinkedList)localObject1).size()) });
      if (!((LinkedList)localObject2).isEmpty())
      {
        this.hLa |= 0x1;
        new al(au.Em().lnJ.getLooper(), new al.a()
        {
          public final boolean vD()
          {
            if (localObject2.size() < 25) {}
            for (int i = localObject2.size();; i = 25)
            {
              x.d("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom update img list size:%d, loopCount:%d", new Object[] { Integer.valueOf(localObject2.size()), Integer.valueOf(i) });
              if (i != 0) {
                break;
              }
              i.a(i.this, 1);
              x.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom update img done loopCount is 0");
              return false;
            }
            if (localObject2.isEmpty())
            {
              i.a(i.this, 1);
              x.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom update img done newImgFlagList is empty");
              return false;
            }
            long l1 = System.currentTimeMillis();
            au.HU();
            long l2 = c.FO().dO(Thread.currentThread().getId());
            int j = 0;
            while (j < i)
            {
              j localj = (j)localObject2.poll();
              if (localj == null) {
                break;
              }
              localk.a(localj);
              j += 1;
            }
            au.HU();
            c.FO().gp(l2);
            x.d("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom update img loopCount:%d, take time:%d(ms)", new Object[] { Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - l1) });
            if (localObject2.isEmpty())
            {
              i.a(i.this, 1);
              x.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom update img done newImgFlagList is empty");
              return false;
            }
            return true;
          }
        }, true).J(100L, 100L);
      }
      if (!((LinkedList)localObject1).isEmpty())
      {
        this.hLa |= 0x2;
        new al(au.Em().lnJ.getLooper(), new al.a()
        {
          public final boolean vD()
          {
            if (localObject1.size() < 25) {}
            for (int i = localObject1.size();; i = 25)
            {
              x.d("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom update ctg list size:%d, loopCount:%d", new Object[] { Integer.valueOf(localObject1.size()), Integer.valueOf(i) });
              if (i != 0) {
                break;
              }
              i.a(i.this, 2);
              x.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom update ctg done loopCount is 0");
              return false;
            }
            long l1 = System.currentTimeMillis();
            au.HU();
            long l2 = c.FO().dO(Thread.currentThread().getId());
            int j = 0;
            while (j < i)
            {
              Pair localPair = (Pair)localObject1.poll();
              paramArrayOfByte.a((String)localPair.first, (ab)localPair.second);
              j += 1;
            }
            au.HU();
            c.FO().gp(l2);
            x.d("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom update ctg loopCount:%d, take time:%d(ms)", new Object[] { Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - l1) });
            if (localObject1.isEmpty())
            {
              i.a(i.this, 2);
              x.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom update ctg done updateList is empty");
              return false;
            }
            return true;
          }
        }, true).J(100L, 100L);
      }
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 551;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/chatroom/d/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */