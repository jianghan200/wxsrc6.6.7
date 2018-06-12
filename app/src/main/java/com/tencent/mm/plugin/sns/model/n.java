package com.tencent.mm.plugin.sns.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bol;
import com.tencent.mm.protocal.c.bom;
import com.tencent.mm.protocal.c.boy;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.qc;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public final class n
  extends l
  implements k
{
  private static Vector<String> nnU = new Vector();
  final int bJt;
  private String desc = "";
  private com.tencent.mm.ab.b diG;
  public com.tencent.mm.ab.e diJ;
  private boolean hxu = false;
  private ArrayList<com.tencent.mm.plugin.sns.storage.n> hyp = new ArrayList();
  private boolean nnR;
  private long nnS = 0L;
  private long nnT = 0L;
  public int nnV = 0;
  public int nnW = 0;
  
  public n(String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bol();
    ((b.a)localObject).dIH = new bom();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnsclassifytimeline";
    ((b.a)localObject).dIF = 601;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    this.nnS = 0L;
    if (0L == 0L) {}
    for (boolean bool = true;; bool = false)
    {
      this.nnR = bool;
      this.bJt = 2;
      localObject = (bol)this.diG.dID.dIL;
      ((bol)localObject).smu = "";
      ((bol)localObject).smv = 0L;
      ((bol)localObject).smw = paramString;
      ((bol)localObject).smx = 1;
      x.d("MicroMsg.NetSceneSnsClassifyTimeLine", "maxid %s classifyid %s classifyType %d", new Object[] { i.eF(0L), paramString, Integer.valueOf(0) });
      return;
    }
  }
  
  /* Error */
  public static boolean Mb(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 37	com/tencent/mm/plugin/sns/model/n:nnU	Ljava/util/Vector;
    //   6: aload_0
    //   7: invokevirtual 152	java/util/Vector:contains	(Ljava/lang/Object;)Z
    //   10: istore_1
    //   11: iload_1
    //   12: ifeq +10 -> 22
    //   15: iconst_0
    //   16: istore_1
    //   17: ldc 2
    //   19: monitorexit
    //   20: iload_1
    //   21: ireturn
    //   22: getstatic 37	com/tencent/mm/plugin/sns/model/n:nnU	Ljava/util/Vector;
    //   25: aload_0
    //   26: invokevirtual 155	java/util/Vector:add	(Ljava/lang/Object;)Z
    //   29: pop
    //   30: iconst_1
    //   31: istore_1
    //   32: goto -15 -> 17
    //   35: astore_0
    //   36: ldc 2
    //   38: monitorexit
    //   39: aload_0
    //   40: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	41	0	paramString	String
    //   10	22	1	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   3	11	35	finally
    //   22	30	35	finally
  }
  
  public static boolean Mc(String paramString)
  {
    try
    {
      nnU.remove(paramString);
      return true;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  private com.tencent.mm.plugin.sns.storage.n b(boy paramboy)
  {
    com.tencent.mm.plugin.sns.storage.n localn = new com.tencent.mm.plugin.sns.storage.n();
    Object localObject = new String(paramboy.smH.siK.toByteArray());
    x.d("MicroMsg.NetSceneSnsClassifyTimeLine", "from server %d ", new Object[] { Long.valueOf(paramboy.rlK) });
    if (!localn.Nj((String)localObject)) {
      return null;
    }
    paramboy.smH.bq(new byte[0]);
    localn.field_userName = paramboy.rdS;
    localn.hK(paramboy.lOH);
    localn.field_likeFlag = paramboy.smI;
    localn.fe(paramboy.rlK);
    localn.fg(paramboy.rlK);
    localn.wZ(this.bJt);
    try
    {
      localn.aK(paramboy.toByteArray());
      localObject = localn.bAJ();
      ((bsu)localObject).hbL = paramboy.rdS;
      localn.field_pravited = ((bsu)localObject).rVG;
      x.d("MicroMsg.NetSceneSnsClassifyTimeLine", "ext flag " + paramboy.rXx);
      localn.bBb();
      localn.c((bsu)localObject);
      localn.field_type = ((bsu)localObject).sqc.ruz;
      localn.field_subType = ((bsu)localObject).sqc.ruB;
      return localn;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.NetSceneSnsClassifyTimeLine", localException, "", new Object[0]);
      }
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneSnsClassifyTimeLine", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramArrayOfByte = (bom)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    if ((paramq.Id().qWB != 207) && (paramq.Id().qWB != 0) && (paramq.Id().qWB != 212))
    {
      Mc("@__classify_timeline");
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (paramq.Id().qWB == 212) {}
    for (boolean bool = true;; bool = false)
    {
      this.hxu = bool;
      this.nnV = paramArrayOfByte.smy;
      this.desc = paramArrayOfByte.rej;
      i.eG(this.nnS);
      x.d("MicroMsg.NetSceneSnsClassifyTimeLine", "resp objCount %d desc %s", new Object[] { Integer.valueOf(paramArrayOfByte.rXE), this.desc });
      paramq = paramArrayOfByte.rgH.iterator();
      while (paramq.hasNext())
      {
        paramArrayOfByte = b((boy)paramq.next());
        if (paramArrayOfByte != null) {
          this.hyp.add(paramArrayOfByte);
        }
      }
    }
    Mc("@__classify_timeline");
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 601;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/model/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */