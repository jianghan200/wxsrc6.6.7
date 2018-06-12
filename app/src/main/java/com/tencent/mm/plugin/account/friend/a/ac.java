package com.tencent.mm.plugin.account.friend.a;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.a.o;
import com.tencent.mm.aa.c;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.protocal.c.agu;
import com.tencent.mm.protocal.c.agv;
import com.tencent.mm.protocal.c.bcv;
import com.tencent.mm.protocal.c.bcw;
import com.tencent.mm.protocal.c.bcx;
import com.tencent.mm.protocal.c.bcy;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ac
  extends l
  implements com.tencent.mm.network.k
{
  public final b diG;
  private com.tencent.mm.ab.e diJ = null;
  
  public ac(int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new agu();
    ((b.a)localObject).dIH = new agv();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getqqgroup";
    ((b.a)localObject).dIF = 143;
    ((b.a)localObject).dII = 38;
    ((b.a)localObject).dIJ = 1000000038;
    this.diG = ((b.a)localObject).KT();
    localObject = (agu)this.diG.dID.dIL;
    ((agu)localObject).jRb = 1;
    ((agu)localObject).rKb = paramInt;
  }
  
  private static void a(bcy parambcy)
  {
    Object localObject1 = ((an)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.account.a.a.a.class)).getQQGroupStg()).dCZ.b("select qqgroup.grouopid,qqgroup.membernum,qqgroup.weixinnum,qqgroup.insert_time,qqgroup.lastupdate_time,qqgroup.needupdate,qqgroup.updatekey,qqgroup.groupname from qqgroup ", null, 0);
    HashMap localHashMap;
    int i;
    if (localObject1 == null)
    {
      localHashMap = null;
      i = 0;
      label37:
      if (i >= parambcy.hbF) {
        break label689;
      }
      localObject2 = (bcx)parambcy.sfe.get(i);
      x.d("MicroMsg.NetSceneGetQQGroup", "id:" + ((bcx)localObject2).rKb + " name:" + ((bcx)localObject2).rDt + " mem:" + ((bcx)localObject2).rxJ + " wei:" + ((bcx)localObject2).sfd + " md5:" + ((bcx)localObject2).rwt);
      if (((bcx)localObject2).rKb >= 0) {
        break label281;
      }
      localObject1 = null;
      label146:
      if (localObject1 != null) {
        break label343;
      }
      x.e("MicroMsg.NetSceneGetQQGroup", "Error Resp Group Info index:" + i);
    }
    label281:
    label343:
    while (((am)localObject1).eLp == 0)
    {
      i += 1;
      break label37;
      if (((Cursor)localObject1).getCount() <= 0)
      {
        ((Cursor)localObject1).close();
        localHashMap = null;
        break;
      }
      localHashMap = new HashMap();
      i = 0;
      while (i < ((Cursor)localObject1).getCount())
      {
        ((Cursor)localObject1).moveToPosition(i);
        localObject2 = new am();
        ((am)localObject2).d((Cursor)localObject1);
        localHashMap.put(Integer.valueOf(((am)localObject2).eLo), localObject2);
        i += 1;
      }
      ((Cursor)localObject1).close();
      break;
      localObject1 = new am();
      ((am)localObject1).eLo = ((bcx)localObject2).rKb;
      ((am)localObject1).eLv = ((bcx)localObject2).rDt;
      ((am)localObject1).eLp = ((bcx)localObject2).rxJ;
      ((am)localObject1).eLq = ((bcx)localObject2).sfd;
      ((am)localObject1).eLu = ((bcx)localObject2).rwt;
      break label146;
    }
    if (localHashMap != null) {}
    for (Object localObject2 = (am)localHashMap.get(Integer.valueOf(((am)localObject1).eLo));; localObject2 = null)
    {
      if (localObject2 == null)
      {
        ((am)localObject1).eLr = ((int)bi.VE());
        ((am)localObject1).eLs = ((int)bi.VE());
        ((am)localObject1).eLt = 1;
        localObject2 = (an)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.account.a.a.a.class)).getQQGroupStg();
        if (localObject1 != null)
        {
          x.d("MicroMsg.QQGroupStorage", "insert: name:" + ((am)localObject1).XU());
          ((am)localObject1).bWA = -1;
          ContentValues localContentValues = ((am)localObject1).XS();
          if ((int)((an)localObject2).dCZ.insert("qqgroup", "grouopid", localContentValues) >= 0) {
            ((an)localObject2).doNotify();
          }
        }
        for (bool = true;; bool = false)
        {
          x.d("MicroMsg.NetSceneGetQQGroup", "Insert name:" + ((am)localObject1).XU() + " ret:" + bool);
          break;
        }
      }
      ((am)localObject2).eLt = -1;
      x.d("MicroMsg.NetSceneGetQQGroup", ((am)localObject1).XT() + " " + ((am)localObject2).XT() + " " + ((am)localObject1).eLo);
      if (((am)localObject2).XT().equals(((am)localObject1).XT())) {
        break;
      }
      ((am)localObject1).eLs = ((int)bi.VE());
      ((am)localObject1).eLt = 1;
      ((am)localObject1).bWA = -1;
      boolean bool = ((an)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.account.a.a.a.class)).getQQGroupStg()).a((am)localObject1);
      x.d("MicroMsg.NetSceneGetQQGroup", "Update name:" + ((am)localObject1).XU() + " ret:" + bool);
      break;
      label689:
      if (localHashMap != null)
      {
        parambcy = localHashMap.keySet().iterator();
        while (parambcy.hasNext())
        {
          localObject1 = (am)localHashMap.get(parambcy.next());
          if (((am)localObject1).eLt == 0)
          {
            localObject2 = (an)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.account.a.a.a.class)).getQQGroupStg();
            i = ((am)localObject1).eLo;
            x.d("MicroMsg.QQGroupStorage", "delete: id:" + i);
            if (((an)localObject2).dCZ.delete("qqgroup", "grouopid= ?", new String[] { String.valueOf(i) }) > 0)
            {
              ((an)localObject2).doNotify();
              bool = true;
              label819:
              x.d("MicroMsg.NetSceneGetQQGroup", "delete name:" + ((am)localObject1).XU() + " ret:" + bool);
              localObject2 = (ap)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.account.a.a.a.class)).getQQListStg();
              i = ((am)localObject1).eLo;
              x.d("MicroMsg.QQListStorage", "delete: GroupID:" + i);
              if (((ap)localObject2).dCZ.delete("qqlist", "groupid= ?", new String[] { String.valueOf(i) }) <= 0) {
                break label976;
              }
            }
            label976:
            for (bool = true;; bool = false)
            {
              x.d("MicroMsg.NetSceneGetQQGroup", "delete QQList name:" + ((am)localObject1).XU() + " ret:" + bool);
              break;
              bool = false;
              break label819;
            }
          }
        }
      }
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = (agu)this.diG.dID.dIL;
    if ((parame1.jRb == 1) && (((an)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.account.a.a.a.class)).getQQGroupStg()).jf(parame1.rKb) == null))
    {
      x.e("MicroMsg.NetSceneGetQQGroup", "Err group not exist");
      return -1;
    }
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      x.e("MicroMsg.NetSceneGetQQGroup", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    x.d("MicroMsg.NetSceneGetQQGroup", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (agu)this.diG.dID.dIL;
    Object localObject2 = (agv)this.diG.dIE.dIL;
    if (paramArrayOfByte.jRb == 0) {
      a(((agv)localObject2).rKc);
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      Object localObject1 = new ArrayList();
      ArrayList localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = new ArrayList();
      int j = 0;
      while (j < ((agv)localObject2).rKd.hbF)
      {
        localObject3 = (bcv)((agv)localObject2).rKd.sfc.get(j);
        paramInt1 = paramArrayOfByte.rKb;
        x.v("MicroMsg.NetSceneGetQQGroup", "friend");
        paramq = new ao();
        paramq.eLw = new o(((bcv)localObject3).seY).longValue();
        c.d(paramq.eLw, 3);
        paramq.eLy = paramInt1;
        paramq.eLx = ((bcv)localObject3).sfa;
        label534:
        label676:
        int i;
        if (((bcv)localObject3).sfa != 0)
        {
          if ((((bcv)localObject3).hbL == null) || (((bcv)localObject3).hbL.equals("")))
          {
            paramq = null;
            ((List)localObject1).add(paramq);
            paramq = new j();
            paramq.sex = ((bcv)localObject3).eJH;
            paramq.csJ = ((bcv)localObject3).eJL;
            paramq.csK = ((bcv)localObject3).eJI;
            paramq.csL = ((bcv)localObject3).eJJ;
            paramq.signature = ((bcv)localObject3).eJK;
            paramq.username = ((bcv)localObject3).hbL;
            localArrayList1.add(paramq);
            paramq = new com.tencent.mm.aa.j();
            paramq.csA = 3;
            paramq.by(true);
            paramq.username = ((bcv)localObject3).hbL;
            paramq.dHR = ((bcv)localObject3).rqZ;
            paramq.dHQ = ((bcv)localObject3).rra;
            localArrayList2.add(paramq);
            j += 1;
            continue;
          }
          ab localab = ((i)com.tencent.mm.kernel.g.l(i.class)).FR().Yg(((bcv)localObject3).hbL);
          if ((localab != null) && (localab.field_username.equals(((bcv)localObject3).hbL)) && (com.tencent.mm.l.a.gd(localab.field_type))) {
            paramq.eLx = 2;
          }
        }
        else
        {
          paramq.username = ((bcv)localObject3).hbL;
          paramq.nickname = ((bcv)localObject3).hcS;
          paramq.eLE = ((bcv)localObject3).sfb;
          paramq.eLF = com.tencent.mm.platformtools.h.oJ(((bcv)localObject3).sfb);
          paramq.eLG = com.tencent.mm.platformtools.h.oI(((bcv)localObject3).sfb);
          paramq.eLz = com.tencent.mm.platformtools.h.oJ(((bcv)localObject3).hcS);
          paramq.eLA = com.tencent.mm.platformtools.h.oI(((bcv)localObject3).hcS);
          paramq.eLB = ((bcv)localObject3).seZ;
          paramq.eLC = com.tencent.mm.platformtools.h.oJ(((bcv)localObject3).seZ);
          paramq.eLD = com.tencent.mm.platformtools.h.oI(((bcv)localObject3).seZ);
          paramInt1 = 32;
          if (bi.oW(paramq.Ya())) {
            break label773;
          }
          paramInt1 = paramq.Ya().charAt(0);
          if ((paramInt1 < 97) || (paramInt1 > 122)) {
            break label845;
          }
          i = (char)(paramInt1 - 32);
        }
        for (;;)
        {
          paramq.dHN = i;
          com.tencent.mm.plugin.d.a.ZN().Gw().fX(((bcv)localObject3).hbL, ((bcv)localObject3).rEJ);
          x.v("MicroMsg.NetSceneGetQQGroup", "QQ Friend nickname: " + paramq.XW() + "  remark: " + paramq.XZ());
          break;
          paramq.eLx = 1;
          break label534;
          label773:
          if (!bi.oW(paramq.Yb()))
          {
            paramInt1 = paramq.Yb().charAt(0);
            break label676;
          }
          if (!bi.oW(paramq.XX()))
          {
            paramInt1 = paramq.XX().charAt(0);
            break label676;
          }
          if (bi.oW(paramq.XY())) {
            break label676;
          }
          paramInt1 = paramq.XY().charAt(0);
          break label676;
          label845:
          if (paramInt1 >= 65)
          {
            i = paramInt1;
            if (paramInt1 <= 90) {}
          }
          else
          {
            i = 123;
          }
        }
      }
      paramq = new HashMap();
      localObject2 = (ap)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.account.a.a.a.class)).getQQListStg();
      paramInt1 = paramArrayOfByte.rKb;
      x.d("MicroMsg.QQListStorage", "getByGroupID: GroupID:" + paramInt1);
      Object localObject3 = "select qqlist.qq,qqlist.wexinstatus,qqlist.groupid,qqlist.username,qqlist.nickname,qqlist.pyinitial,qqlist.quanpin,qqlist.qqnickname,qqlist.qqpyinitial,qqlist.qqquanpin,qqlist.qqremark,qqlist.qqremarkpyinitial,qqlist.qqremarkquanpin,qqlist.reserved1,qqlist.reserved2,qqlist.reserved3,qqlist.reserved4 from qqlist  where qqlist.groupid = \"" + paramInt1 + "\"";
      localObject2 = ((ap)localObject2).dCZ.b((String)localObject3, null, 0);
      while (((Cursor)localObject2).moveToNext())
      {
        localObject3 = new ao();
        ((ao)localObject3).d((Cursor)localObject2);
        paramq.put(Long.valueOf(((ao)localObject3).eLw), localObject3);
      }
      ((Cursor)localObject2).close();
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (ao)((Iterator)localObject1).next();
        if (paramq.containsKey(Long.valueOf(((ao)localObject2).eLw)))
        {
          localObject3 = (ao)paramq.get(Long.valueOf(((ao)localObject2).eLw));
          if (!bi.t(Long.valueOf(((ao)localObject3).eLw), Long.valueOf(((ao)localObject2).eLw))) {
            paramInt1 = 0;
          }
          for (;;)
          {
            if (paramInt1 != 0) {
              break label1514;
            }
            ((ap)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.account.a.a.a.class)).getQQListStg()).a(((ao)localObject2).eLw, (ao)localObject2);
            paramq.remove(Long.valueOf(((ao)localObject2).eLw));
            break;
            if (!bi.t(Integer.valueOf(((ao)localObject3).eLx), Integer.valueOf(((ao)localObject2).eLx))) {
              paramInt1 = 0;
            } else if (!bi.t(Integer.valueOf(((ao)localObject3).eLy), Integer.valueOf(((ao)localObject2).eLy))) {
              paramInt1 = 0;
            } else if (!bi.t(((ao)localObject3).username, ((ao)localObject2).username)) {
              paramInt1 = 0;
            } else if (!bi.t(((ao)localObject3).nickname, ((ao)localObject2).nickname)) {
              paramInt1 = 0;
            } else if (!bi.t(((ao)localObject3).eLz, ((ao)localObject2).eLz)) {
              paramInt1 = 0;
            } else if (!bi.t(((ao)localObject3).eLA, ((ao)localObject2).eLA)) {
              paramInt1 = 0;
            } else if (!bi.t(((ao)localObject3).eLB, ((ao)localObject2).eLB)) {
              paramInt1 = 0;
            } else if (!bi.t(((ao)localObject3).eLC, ((ao)localObject2).eLC)) {
              paramInt1 = 0;
            } else if (!bi.t(((ao)localObject3).eLD, ((ao)localObject2).eLD)) {
              paramInt1 = 0;
            } else if (!bi.t(((ao)localObject3).eLE, ((ao)localObject2).eLE)) {
              paramInt1 = 0;
            } else if (!bi.t(((ao)localObject3).eLF, ((ao)localObject2).eLF)) {
              paramInt1 = 0;
            } else if (!bi.t(((ao)localObject3).eLG, ((ao)localObject2).eLG)) {
              paramInt1 = 0;
            } else if (!bi.t(((ao)localObject3).dHL, ((ao)localObject2).dHL)) {
              paramInt1 = 0;
            } else if (!bi.t(((ao)localObject3).dHM, ((ao)localObject2).dHM)) {
              paramInt1 = 0;
            } else if (!bi.t(Integer.valueOf(((ao)localObject3).dHN), Integer.valueOf(((ao)localObject2).dHN))) {
              paramInt1 = 0;
            } else if (!bi.t(Integer.valueOf(((ao)localObject3).dHO), Integer.valueOf(((ao)localObject2).dHO))) {
              paramInt1 = 0;
            } else {
              paramInt1 = 1;
            }
          }
        }
        else
        {
          label1514:
          ((ap)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.account.a.a.a.class)).getQQListStg()).a((ao)localObject2);
        }
      }
      paramq = paramq.keySet().iterator();
      while (paramq.hasNext())
      {
        long l = ((Long)paramq.next()).longValue();
        localObject1 = (ap)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.account.a.a.a.class)).getQQListStg();
        x.d("MicroMsg.QQListStorage", "delete: QQ:" + l);
        if (((ap)localObject1).dCZ.delete("qqlist", "qq= ?", new String[] { String.valueOf(l) }) > 0) {
          ((ap)localObject1).b(5, (m)localObject1, String.valueOf(l));
        }
      }
      ((k)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.account.a.a.a.class)).getFrdExtStg()).L(localArrayList1);
      com.tencent.mm.aa.q.KH().L(localArrayList2);
      paramq = new am();
      paramq.eLo = paramArrayOfByte.rKb;
      paramq.eLt = 0;
      paramq.eLs = ((int)bi.VE());
      paramq.bWA = 48;
      ((an)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.account.a.a.a.class)).getQQGroupStg()).a(paramq);
    }
  }
  
  public final int getType()
  {
    return 143;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/account/friend/a/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */