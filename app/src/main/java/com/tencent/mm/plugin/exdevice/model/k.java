package com.tencent.mm.plugin.exdevice.model;

import com.tencent.mm.aa.j;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ac.d;
import com.tencent.mm.ac.z;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.l.a;
import com.tencent.mm.model.au;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.protocal.c.arc;
import com.tencent.mm.protocal.c.aue;
import com.tencent.mm.protocal.c.bqd;
import com.tencent.mm.protocal.c.ce;
import com.tencent.mm.protocal.c.gg;
import com.tencent.mm.protocal.c.gh;
import com.tencent.mm.protocal.c.gi;
import com.tencent.mm.protocal.c.gj;
import com.tencent.mm.protocal.c.gk;
import com.tencent.mm.protocal.c.qt;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import java.util.Iterator;
import java.util.LinkedList;

public final class k
  extends l
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ab.e doG = null;
  private b ivx = null;
  private String[] ivy;
  
  public k(String[] paramArrayOfString, String paramString)
  {
    this.ivy = paramArrayOfString;
    x.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "NetSceneBatchSearchHardDevice, %s, list = %d", new Object[] { paramString, Integer.valueOf(1) });
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new gi();
    ((b.a)localObject).dIH = new gj();
    ((b.a)localObject).dIF = 542;
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/batchsearchharddevice";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.ivx = ((b.a)localObject).KT();
    localObject = (gi)this.ivx.dID.dIL;
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    while (i <= 0)
    {
      String str = paramArrayOfString[0];
      if (str != null)
      {
        gh localgh = new gh();
        localgh.rgL = str;
        localLinkedList.add(localgh);
        x.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "NetSceneBatchSearchHardDevice, item = %s", new Object[] { str });
      }
      i += 1;
    }
    ((gi)localObject).rgM = localLinkedList;
    if (!bi.oW(paramString))
    {
      paramArrayOfString = new gg();
      paramArrayOfString.rgK = paramString;
      ((gi)localObject).rgN = paramArrayOfString;
    }
    ((gi)localObject).rgO = 3;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.doG = parame1;
    return a(parame, this.ivx, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "onGYNetEnd, netId = %d, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((this.ivy != null) && (this.ivy.length == 1)) {
      x.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "device mac is  = %s", new Object[] { this.ivy[0] });
    }
    if (paramq == null)
    {
      x.e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "null == rr");
      return;
    }
    if (this.ivx.dIF != paramq.getType())
    {
      x.e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "mReqResp.getType(%d) != rr.getType(%d)", new Object[] { Integer.valueOf(this.ivx.dIF), Integer.valueOf(paramq.getType()) });
      return;
    }
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = aGW().rgP.iterator();
      while (paramq.hasNext())
      {
        paramArrayOfByte = (gk)paramq.next();
        x.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "BatchSearchHardDeviceResp, ret = %d, bind ticket = %s, mac = %s, device name = %s", new Object[] { Integer.valueOf(paramArrayOfByte.rfn), paramArrayOfByte.rgQ, paramArrayOfByte.rgL, paramArrayOfByte.hbP });
        if (paramArrayOfByte.rgR == null)
        {
          x.e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "null == item.Contact");
        }
        else
        {
          paramArrayOfByte = paramArrayOfByte.rgR;
          if (paramArrayOfByte == null)
          {
            x.e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "unable to parse mod contact");
          }
          else
          {
            String str1 = com.tencent.mm.platformtools.ab.a(paramArrayOfByte.rvi);
            String str2 = bi.oV(paramArrayOfByte.rXj);
            if ((bi.oW(str1)) && (bi.oW(str2)))
            {
              x.e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "processModContact user is null user:%s enuser:%s", new Object[] { str1, str2 });
            }
            else
            {
              x.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "processModContact : %s", new Object[] { str1 });
              au.HU();
              com.tencent.mm.storage.ab localab1 = com.tencent.mm.model.c.FR().Yg(str1);
              if ((localab1 != null) && (str1.equals(localab1.field_encryptUsername)))
              {
                x.w("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "cat's replace user with stranger");
              }
              else
              {
                com.tencent.mm.storage.ab localab2 = new com.tencent.mm.storage.ab(str1);
                localab2.du(paramArrayOfByte.eJM);
                localab2.setType(paramArrayOfByte.ruj & paramArrayOfByte.ruk);
                label441:
                long l;
                if (!bi.oW(str2))
                {
                  localab2.dD(str2);
                  if (localab1 != null) {
                    break label1005;
                  }
                  l = 0L;
                  label449:
                  localab2.dhP = l;
                  localab2.dx(com.tencent.mm.platformtools.ab.a(paramArrayOfByte.rQz));
                  localab2.dy(com.tencent.mm.platformtools.ab.a(paramArrayOfByte.ruT));
                  localab2.dz(com.tencent.mm.platformtools.ab.a(paramArrayOfByte.ruU));
                  localab2.eJ(paramArrayOfByte.eJH);
                  localab2.eM(paramArrayOfByte.rup);
                  localab2.dw(com.tencent.mm.platformtools.ab.a(paramArrayOfByte.rXd));
                  localab2.eN(paramArrayOfByte.rut);
                  localab2.eO(paramArrayOfByte.eJL);
                  localab2.dS(RegionCodeDecoder.aq(paramArrayOfByte.eJQ, paramArrayOfByte.eJI, paramArrayOfByte.eJJ));
                  localab2.dM(paramArrayOfByte.eJK);
                  localab2.eF(paramArrayOfByte.rTe);
                  localab2.dR(paramArrayOfByte.rTf);
                  localab2.setSource(paramArrayOfByte.rdq);
                  localab2.eE(paramArrayOfByte.rTi);
                  localab2.dA(paramArrayOfByte.rTh);
                  if (s.hU(paramArrayOfByte.rTg)) {
                    localab2.dQ(paramArrayOfByte.rTg);
                  }
                  localab2.eQ((int)bi.VE());
                  localab2.dv(com.tencent.mm.platformtools.ab.a(paramArrayOfByte.rWH));
                  localab2.dB(com.tencent.mm.platformtools.ab.a(paramArrayOfByte.rWJ));
                  localab2.dC(com.tencent.mm.platformtools.ab.a(paramArrayOfByte.rWI));
                  localab2.dT(paramArrayOfByte.rej);
                  localab2.dU(paramArrayOfByte.rXt);
                  if ((localab1 != null) && (!bi.oV(localab1.csU).equals(bi.oV(paramArrayOfByte.rXt))))
                  {
                    com.tencent.mm.at.c.Qt();
                    com.tencent.mm.at.c.mA(str1);
                  }
                  au.HU();
                  com.tencent.mm.model.c.FR().Yl(str1);
                  if (!bi.oW(localab2.field_username)) {
                    break label1017;
                  }
                  x.e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "dkinit dealModContactExtInfo failed invalid contact");
                  label791:
                  localab2.eH(paramArrayOfByte.rXs);
                  if ((paramArrayOfByte.rXo != null) && (paramArrayOfByte.rXo.rcy != null))
                  {
                    localab2.dV(paramArrayOfByte.rXo.rcy.rhn);
                    localab2.dW(paramArrayOfByte.rXo.rcy.rho);
                    localab2.dX(paramArrayOfByte.rXo.rcy.rhp);
                  }
                  if (s.hO(str1)) {
                    localab2.Bk();
                  }
                  if (localab2.ckW()) {
                    localab2.Bn();
                  }
                  if (bi.oW(str2)) {
                    break label1352;
                  }
                  au.HU();
                  com.tencent.mm.model.c.FR().b(str2, localab2);
                }
                for (;;)
                {
                  if ((localab1 == null) || ((localab1.field_type & 0x800) == (localab2.field_type & 0x800))) {
                    break label1368;
                  }
                  if ((localab2.field_type & 0x800) == 0) {
                    break label1370;
                  }
                  au.HU();
                  com.tencent.mm.model.c.FW().Yv(localab2.field_username);
                  break;
                  if ((localab1 == null) || ((int)localab1.dhP <= 0)) {
                    break label441;
                  }
                  localab2.dD(localab1.field_encryptUsername);
                  break label441;
                  label1005:
                  l = (int)localab1.dhP;
                  break label449;
                  label1017:
                  Object localObject1 = localab2.field_username;
                  Object localObject2 = com.tencent.mm.aa.c.a((String)localObject1, paramArrayOfByte);
                  com.tencent.mm.aa.q.KH().a((j)localObject2);
                  localObject2 = paramArrayOfByte.rTk;
                  if ((!localab2.field_username.endsWith("@chatroom")) && (localObject2 != null))
                  {
                    x.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "SnsFlag modcontact " + ((bqd)localObject2).eJS + " " + paramArrayOfByte.rvi);
                    x.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "SnsBg modcontact " + ((bqd)localObject2).eJT);
                    x.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "SnsBgId modcontact " + ((bqd)localObject2).eJU);
                    x.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "SnsBgId modcontact " + ((bqd)localObject2).sod);
                    if (n.nky != null) {
                      n.nky.a(localab2.field_username, (bqd)localObject2);
                    }
                  }
                  localObject2 = com.tencent.mm.model.q.GF();
                  if ((localObject2 == null) || (((String)localObject2).equals(localObject1))) {
                    break label791;
                  }
                  localObject2 = z.MY().kA((String)localObject1);
                  ((d)localObject2).field_username = ((String)localObject1);
                  ((d)localObject2).field_brandList = paramArrayOfByte.eJR;
                  localObject1 = paramArrayOfByte.rTl;
                  if (localObject1 != null)
                  {
                    ((d)localObject2).field_brandFlag = ((qt)localObject1).eJV;
                    ((d)localObject2).field_brandInfo = ((qt)localObject1).eJX;
                    ((d)localObject2).field_brandIconURL = ((qt)localObject1).eJY;
                    ((d)localObject2).field_extInfo = ((qt)localObject1).eJW;
                    ((d)localObject2).field_attrSyncVersion = null;
                    ((d)localObject2).field_incrementUpdateTime = 0L;
                  }
                  if (!z.MY().e((d)localObject2)) {
                    z.MY().d((d)localObject2);
                  }
                  localab2.eR(((d)localObject2).field_type);
                  break label791;
                  label1352:
                  au.HU();
                  com.tencent.mm.model.c.FR().S(localab2);
                }
                label1368:
                continue;
                label1370:
                au.HU();
                com.tencent.mm.model.c.FW().Yw(localab2.field_username);
              }
            }
          }
        }
      }
    }
    this.doG.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final gj aGW()
  {
    if ((this.ivx != null) && (this.ivx.dIE.dIL != null)) {
      return (gj)this.ivx.dIE.dIL;
    }
    return null;
  }
  
  public final int getType()
  {
    return 542;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/exdevice/model/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */