package com.tencent.mm.plugin.sns.model;

import android.os.Looper;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.sns.storage.a;
import com.tencent.mm.plugin.sns.storage.a.b.a;
import com.tencent.mm.plugin.sns.storage.i;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bny;
import com.tencent.mm.protocal.c.bob;
import com.tencent.mm.protocal.c.bog;
import com.tencent.mm.protocal.c.bon;
import com.tencent.mm.protocal.c.box;
import com.tencent.mm.protocal.c.boy;
import com.tencent.mm.protocal.c.bpb;
import com.tencent.mm.protocal.c.bpc;
import com.tencent.mm.protocal.c.bpd;
import com.tencent.mm.protocal.c.bpe;
import com.tencent.mm.protocal.c.bpf;
import com.tencent.mm.protocal.c.bpl;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.util.Iterator;
import java.util.LinkedList;

public final class r
  extends l
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ab.b diG;
  public com.tencent.mm.ab.e diJ;
  private ag handler = new ag(Looper.getMainLooper());
  public int nkZ = -1;
  private long nod = 0L;
  private bon noe;
  private Object nof;
  private int nog = 0;
  public int type = -1;
  
  public r(long paramLong, int paramInt)
  {
    this(paramLong, paramInt, null, null);
  }
  
  public r(long paramLong, int paramInt1, int paramInt2, String paramString)
  {
    this.noe = null;
    this.type = 9;
    this.nod = paramLong;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneSnsObjectOp", "snsId : " + paramLong + "  op : " + this.type);
    Object localObject1 = new b.a();
    ((b.a)localObject1).dIG = new bpe();
    ((b.a)localObject1).dIH = new bpf();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/mmsnsobjectop";
    ((b.a)localObject1).dIF = 218;
    ((b.a)localObject1).dII = 104;
    ((b.a)localObject1).dIJ = 1000000104;
    this.diG = ((b.a)localObject1).KT();
    localObject1 = (bpe)this.diG.dID.dIL;
    Object localObject2 = af.byo().fi(paramLong);
    if (localObject2 != null) {
      this.nkZ = ((n)localObject2).nJc;
    }
    localObject2 = y(paramLong, this.type);
    bpd localbpd = new bpd();
    localbpd.otY = paramInt1;
    localbpd.sne = paramInt2;
    localbpd.snf = ab.oT(paramString);
    try
    {
      paramString = localbpd.toByteArray();
      ((bpb)localObject2).sbD = new bhy().bq(paramString);
      paramString = new LinkedList();
      paramString.add(localObject2);
      ((bpe)localObject1).snh = paramString;
      ((bpe)localObject1).sng = paramString.size();
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", paramString, "", new Object[0]);
      }
    }
  }
  
  public r(long paramLong, int paramInt, bon parambon)
  {
    this(paramLong, paramInt, parambon, null);
  }
  
  private r(long paramLong, int paramInt, bon parambon, Object paramObject)
  {
    this.noe = parambon;
    this.type = paramInt;
    this.nod = paramLong;
    this.nof = paramObject;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneSnsObjectOp", "snsId : " + paramLong + "  op : " + paramInt);
    if (parambon != null) {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneSnsObjectOp", parambon.smh + " " + parambon.smk);
    }
    parambon = new b.a();
    parambon.dIG = new bpe();
    parambon.dIH = new bpf();
    parambon.uri = "/cgi-bin/micromsg-bin/mmsnsobjectop";
    parambon.dIF = 218;
    parambon.dII = 104;
    parambon.dIJ = 1000000104;
    this.diG = parambon.KT();
    parambon = (bpe)this.diG.dID.dIL;
    Object localObject = af.byo().fi(paramLong);
    if (localObject != null) {
      this.nkZ = ((n)localObject).nJc;
    }
    paramObject = a(paramLong, paramInt, this.noe, paramObject);
    localObject = new LinkedList();
    ((LinkedList)localObject).add(paramObject);
    parambon.snh = ((LinkedList)localObject);
    parambon.sng = ((LinkedList)localObject).size();
  }
  
  public r(long paramLong, int paramInt, Object paramObject)
  {
    this(paramLong, paramInt, null, paramObject);
  }
  
  private static bpb a(long paramLong, int paramInt, bon parambon, Object paramObject)
  {
    bpb localbpb = y(paramLong, paramInt);
    Object localObject2 = new StringBuilder("getSnsObjectOp ").append(paramInt).append(" ");
    Object localObject1;
    if (paramObject == null)
    {
      localObject1 = "";
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneSnsObjectOp", (String)localObject1);
      localObject2 = "";
      if ((paramInt != 8) && (paramInt != 10) && (paramInt != 7) && (paramInt != 8) && (paramInt != 6)) {
        break label1028;
      }
      localObject1 = af.byr().eZ(paramLong);
      if (localObject1 == null) {
        break label1022;
      }
      localObject1 = ((com.tencent.mm.plugin.sns.storage.e)localObject1).bAL();
      label106:
      if ((localObject1 == null) || (!((n)localObject1).xb(32))) {
        break label1019;
      }
      localObject2 = ((n)localObject1).bAH();
      if (localObject2 != null) {
        break label199;
      }
      localObject2 = "";
      label137:
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneSnsObjectOp", "aduxinfo " + (String)localObject2);
    }
    for (;;)
    {
      if (paramInt == 6)
      {
        if ((parambon == null) || ((parambon.smh == 0) && (parambon.smk == 0L)))
        {
          return localbpb;
          localObject1 = paramObject.toString();
          break;
          label199:
          localObject2 = ((a)localObject2).ntU;
          break label137;
        }
        paramObject = new bog();
        ((bog)paramObject).smd = parambon.smk;
        ((bog)paramObject).slT = ab.oT(bi.aG((String)localObject2, ""));
      }
      for (;;)
      {
        try
        {
          parambon = ((bog)paramObject).toByteArray();
          localbpb.sbD = new bhy().bq(parambon);
          return localbpb;
        }
        catch (Exception parambon)
        {
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", parambon, "", new Object[0]);
          continue;
        }
        if (paramInt != 7) {
          break;
        }
        parambon = new bny();
        parambon.slT = ab.oT(bi.aG((String)localObject2, ""));
        try
        {
          parambon = parambon.toByteArray();
          localbpb.sbD = new bhy().bq(parambon);
        }
        catch (Exception parambon)
        {
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", parambon, "", new Object[0]);
        }
      }
      if (paramInt == 8) {
        if ((paramObject != null) && ((paramObject instanceof a.b.a)))
        {
          paramInt = 1;
          label372:
          if (paramInt == 0) {
            break label1013;
          }
          parambon = (a.b.a)paramObject;
          localObject2 = bi.aG((String)localObject2, "");
        }
      }
      label510:
      label619:
      label1013:
      for (parambon = (String)localObject2 + new StringBuilder("&").append(parambon.nkJ).append("|").append(parambon.nyC).toString();; parambon = (bon)localObject2)
      {
        localObject2 = new bob();
        ((bob)localObject2).slT = ab.oT(bi.aG(parambon, ""));
        if (localObject1 != null)
        {
          ((bob)localObject2).rdq = ((n)localObject1).bBq();
          parambon = ((n)localObject1).bAK();
          localObject1 = af.byo().Nk(parambon);
          if (localObject1 != null)
          {
            parambon = com.tencent.mm.plugin.sns.a.b.f.a(((n)localObject1).bAJ());
            ((bob)localObject2).slV = ab.oT(bi.aG(parambon, ""));
          }
        }
        else
        {
          if ((paramInt == 0) || (((a.b.a)paramObject).nyB != a.b.a.nyx)) {
            break label619;
          }
          ((bob)localObject2).slW = a.b.a.nyx;
        }
        for (;;)
        {
          try
          {
            parambon = ((bob)localObject2).toByteArray();
            localbpb.sbD = new bhy().bq(parambon);
          }
          catch (Exception parambon)
          {
            com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", parambon, "", new Object[0]);
          }
          break;
          paramInt = 0;
          break label372;
          com.tencent.mm.sdk.platformtools.x.v("SnsAdExtUtil", "getSnsStatExtBySnsId snsInfo null, snsId %s", new Object[] { parambon });
          parambon = "";
          break label510;
          af.byr().delete(paramLong);
          af.byt().fd(paramLong);
          i.fc(paramLong);
          if (paramInt != 0) {
            ((bob)localObject2).slW = ((a.b.a)paramObject).nyB;
          }
        }
        if (paramInt == 4)
        {
          if ((parambon == null) || ((parambon.smh == 0) && (parambon.smk == 0L))) {
            return localbpb;
          }
          paramObject = new bpc();
          ((bpc)paramObject).smh = parambon.smh;
          try
          {
            parambon = ((bpc)paramObject).toByteArray();
            localbpb.sbD = new bhy().bq(parambon);
          }
          catch (Exception parambon)
          {
            com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", parambon, "", new Object[0]);
          }
          break;
        }
        if (paramInt == 10)
        {
          parambon = new bpl();
          if ((paramObject instanceof com.tencent.mm.bk.b))
          {
            paramObject = (com.tencent.mm.bk.b)paramObject;
            parambon.snz = ab.O(((com.tencent.mm.bk.b)paramObject).lR);
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneSnsObjectOp", "NetSceneSnsObjectOpticket " + ((com.tencent.mm.bk.b)paramObject).lR.length);
          }
          for (;;)
          {
            try
            {
              parambon = parambon.toByteArray();
              localbpb.sbD = new bhy().bq(parambon);
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneSnsObjectOp", "opFree " + parambon.length);
            }
            catch (Exception parambon)
            {
              com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneSnsObjectOp", "error ticket " + parambon.getMessage());
              com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", parambon, "", new Object[0]);
            }
            break;
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneSnsObjectOp", "error ticket");
          }
        }
        if (paramInt != 12) {
          break;
        }
        if ((paramObject instanceof box))
        {
          parambon = (box)paramObject;
          try
          {
            localbpb.sbD = ab.O(parambon.toByteArray());
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneSnsObjectOp", "snsMetionBlockOp, switch:%d " + parambon.smG);
          }
          catch (Exception parambon)
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneSnsObjectOp", "error snsMetionBlockOp " + parambon.getMessage());
          }
          break;
        }
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneSnsObjectOp", "error snsMetionBlockOp");
        break;
      }
      label1019:
      continue;
      label1022:
      localObject1 = null;
      break label106;
      label1028:
      localObject1 = null;
    }
  }
  
  private static bpb y(long paramLong, int paramInt)
  {
    bpb localbpb = new bpb();
    localbpb.sbD = new bhy();
    localbpb.rlK = paramLong;
    localbpb.jRb = paramInt;
    return localbpb;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneSnsObjectOp", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      if ((paramInt2 == 4) && (this.type == 1)) {
        switch (this.type)
        {
        }
      }
      for (;;)
      {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
        af.byn().eT(this.nod);
        continue;
        af.byn().eV(this.nod);
      }
    }
    switch (this.type)
    {
    case 10: 
    default: 
    case 1: 
    case 2: 
    case 3: 
    case 5: 
    case 4: 
      do
      {
        for (;;)
        {
          af.byn().bxP();
          this.diJ.a(paramInt2, paramInt3, paramString, this);
          return;
          af.byn().eT(this.nod);
          af.byo().delete(this.nod);
          continue;
          paramq = af.byo().fi(this.nod);
          if (paramq != null)
          {
            paramq.field_pravited = 1;
            paramq.bAY();
            af.byo().b(this.nod, paramq);
            continue;
            paramq = af.byo().fi(this.nod);
            if (paramq != null)
            {
              paramq.field_pravited = 0;
              paramq.field_localPrivate = 0;
              paramq.bBb();
              af.byo().b(this.nod, paramq);
              continue;
              af.byn().eV(this.nod);
            }
          }
        }
        paramArrayOfByte = af.byo().fi(this.nod);
      } while (paramArrayOfByte == null);
    }
    for (;;)
    {
      boy localboy;
      Iterator localIterator;
      try
      {
        localboy = (boy)new boy().aG(paramArrayOfByte.field_attrBuf);
        localIterator = localboy.smO.iterator();
        if (!localIterator.hasNext()) {
          break label1291;
        }
        paramq = (bon)localIterator.next();
        if ((this.noe == null) || (paramq.smh != this.noe.smh)) {
          continue;
        }
        if (paramq != null) {
          localboy.smO.remove(paramq);
        }
        paramArrayOfByte.aK(localboy.toByteArray());
        af.byo().z(paramArrayOfByte);
        af.byt().d(paramArrayOfByte.field_snsId, this.noe.smh, this.noe.hcE);
      }
      catch (Exception paramq)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", paramq, "", new Object[0]);
      }
      break;
      paramArrayOfByte = af.byr().eZ(this.nod);
      if (paramArrayOfByte == null) {
        break;
      }
      for (;;)
      {
        try
        {
          localboy = (boy)new boy().aG(paramArrayOfByte.field_attrBuf);
          localIterator = localboy.smO.iterator();
          if (!localIterator.hasNext()) {
            break label1285;
          }
          paramq = (bon)localIterator.next();
          if ((this.noe == null) || (paramq.smk != this.noe.smk)) {
            continue;
          }
          if (paramq != null) {
            localboy.smO.remove(paramq);
          }
          paramArrayOfByte.aK(localboy.toByteArray());
          af.byr().a(paramArrayOfByte);
          af.byt().d(paramArrayOfByte.field_snsId, this.noe.smk, this.noe.hcE);
        }
        catch (Exception paramq)
        {
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", paramq, "", new Object[0]);
        }
        break;
        af.byn().eV(this.nod);
        break;
        if ((this.nof != null) && ((this.nof instanceof a.b.a)) && (((a.b.a)this.nof).nyB == a.b.a.nyx)) {
          break;
        }
        af.byr().delete(this.nod);
        af.byt().fd(this.nod);
        i.fc(this.nod);
        break;
        paramq = af.byo().fi(this.nod);
        if (paramq == null) {
          break;
        }
        paramq.xc(2);
        af.byo().b(this.nod, paramq);
        break;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneSnsObjectOp", "scene end switch " + this.nog);
        label891:
        int i;
        int j;
        if (this.nog == 0)
        {
          g.Ek();
          g.Ei().DT().a(aa.a.sSw, Boolean.valueOf(true));
          g.Ek();
          paramInt1 = ((Integer)g.Ei().DT().get(aa.a.sSy, Integer.valueOf(0))).intValue();
          g.Ek();
          g.Ei().DT().a(aa.a.sSy, Integer.valueOf(paramInt1 + 1));
          g.Ek();
          i = ((Integer)g.Ei().DT().get(aa.a.sSz, Integer.valueOf(0))).intValue();
          if (this.nog != 0) {
            break label1106;
          }
          i += 1;
          j = i * 2 + 198;
          paramInt1 = j;
          if (j >= 216) {
            paramInt1 = 216;
          }
          if (paramInt1 >= 200) {
            com.tencent.mm.plugin.sns.lucky.a.b.kB(paramInt1);
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneSnsObjectOp", "opcount open " + paramInt1 + " " + i);
          paramInt1 = i;
        }
        for (;;)
        {
          g.Ek();
          g.Ei().DT().a(aa.a.sSz, Integer.valueOf(paramInt1));
          break;
          if (this.nog != 1) {
            break label891;
          }
          g.Ek();
          g.Ei().DT().a(aa.a.sSw, Boolean.valueOf(false));
          break label891;
          label1106:
          paramInt1 = i;
          if (this.nog == 1)
          {
            i += 1;
            j = i * 2 + 198 + 1;
            paramInt1 = j;
            if (j >= 217) {
              paramInt1 = 217;
            }
            if (paramInt1 >= 201) {
              com.tencent.mm.plugin.sns.lucky.a.b.kB(paramInt1);
            }
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneSnsObjectOp", "opcount close " + paramInt1 + " " + i);
            paramInt1 = i;
          }
        }
        if ((this.nof == null) || (!(this.nof instanceof box))) {
          break;
        }
        if (((box)this.nof).smG == 1) {}
        for (boolean bool = true;; bool = false)
        {
          af.byt().s(this.nod, bool);
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneSnsObjectOp", "remind  update [snsId:%d] ->isSilence: %b", new Object[] { Long.valueOf(this.nod), Boolean.valueOf(bool) });
          break;
        }
        label1285:
        paramq = null;
      }
      label1291:
      paramq = null;
    }
  }
  
  public final int getType()
  {
    return 218;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/sns/model/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */