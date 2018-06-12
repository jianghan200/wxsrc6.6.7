package com.tencent.mm.plugin.sns.model;

import android.database.Cursor;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.c.boy;
import com.tencent.mm.protocal.c.bqd;
import com.tencent.mm.protocal.c.bqe;
import com.tencent.mm.protocal.c.bqf;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import java.util.Vector;

public final class aa
  extends com.tencent.mm.ab.l
  implements k, d
{
  private static Vector<String> noW = new Vector();
  private final int bJt;
  private boolean bNu;
  private b diG;
  public com.tencent.mm.ab.e diJ;
  private boolean nnR;
  private long nnS = 0L;
  long nnT = 0L;
  public int nnV = 0;
  private long noK = 0L;
  private boolean noL = false;
  private boolean noM = false;
  private int noX = 0;
  private boolean noY = false;
  private boolean noZ = false;
  private String not = "";
  public long npa;
  String userName;
  
  public aa(String paramString, long paramLong, boolean paramBoolean, int paramInt)
  {
    this.userName = paramString;
    this.nnS = paramLong;
    this.bNu = paramBoolean;
    int i;
    label112:
    Object localObject;
    o localo;
    if (paramLong == 0L)
    {
      x.i("MicroMsg.NetSceneSnsUserPage", "fp userName " + paramString);
      if (!paramBoolean) {
        break label444;
      }
      i = 4;
      this.bJt = i;
      localObject = new b.a();
      ((b.a)localObject).dIG = new bqe();
      ((b.a)localObject).dIH = new bqf();
      ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnsuserpage";
      ((b.a)localObject).dIF = 212;
      ((b.a)localObject).dII = 99;
      ((b.a)localObject).dIJ = 1000000099;
      this.diG = ((b.a)localObject).KT();
      localObject = (bqe)this.diG.dID.dIL;
      ((bqe)localObject).rdS = paramString;
      ((bqe)localObject).smv = paramLong;
      if (paramLong == 0L) {
        bool = true;
      }
      this.nnR = bool;
      i = af.bye().Mo(paramString);
      localo = af.byo();
      if (!this.nnR) {
        break label451;
      }
    }
    for (;;)
    {
      this.nnT = localo.a(l, i, paramString, paramBoolean);
      ((bqe)localObject).snR = this.nnT;
      int j = c.a(this.nnT, paramLong, paramString);
      ((bqe)localObject).snS = j;
      ((bqe)localObject).rdq = paramInt;
      if (this.nnR)
      {
        this.not = af.bys().Np(paramString).field_md5;
        if (this.not == null) {
          this.not = "";
        }
        ((bqe)localObject).smu = this.not;
      }
      this.noK = paramLong;
      x.i("MicroMsg.NetSceneSnsUserPage", "nextCount: " + i + " maxId:" + i.eF(paramLong) + " minId:" + i.eF(this.nnT) + " lastReqTime:" + j + " snsSource " + paramInt);
      return;
      x.i("MicroMsg.NetSceneSnsUserPage", "np userName " + paramString);
      break;
      label444:
      i = 8;
      break label112;
      label451:
      l = paramLong;
    }
  }
  
  /* Error */
  public static boolean Me(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 43	com/tencent/mm/plugin/sns/model/aa:noW	Ljava/util/Vector;
    //   6: aload_0
    //   7: invokevirtual 234	java/util/Vector:contains	(Ljava/lang/Object;)Z
    //   10: istore_1
    //   11: iload_1
    //   12: ifeq +10 -> 22
    //   15: iconst_0
    //   16: istore_1
    //   17: ldc 2
    //   19: monitorexit
    //   20: iload_1
    //   21: ireturn
    //   22: getstatic 43	com/tencent/mm/plugin/sns/model/aa:noW	Ljava/util/Vector;
    //   25: aload_0
    //   26: invokevirtual 237	java/util/Vector:add	(Ljava/lang/Object;)Z
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
  
  public static boolean Mf(String paramString)
  {
    try
    {
      noW.remove(paramString);
      return true;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  private void a(bqf parambqf, String paramString)
  {
    aj.a(this.userName, this.bJt, parambqf.rgH, paramString);
    if (this.nnS == 0L) {}
    for (this.nnS = ((boy)parambqf.rgH.getFirst()).rlK;; this.nnS = c.eJ(this.nnS))
    {
      this.nnT = ((boy)parambqf.rgH.getLast()).rlK;
      x.i("MicroMsg.NetSceneSnsUserPage", "insertListAndUpdateFaultInfo userName %s maxId %s minId %s NewRequestTime %s", new Object[] { this.userName, Long.valueOf(this.nnS), Long.valueOf(this.nnT), Integer.valueOf(parambqf.snV) });
      c.d(this.userName, this.nnS, this.nnT, parambqf.snV);
      return;
    }
  }
  
  private void bxL()
  {
    Object localObject = af.byo();
    String str = this.userName;
    boolean bool = this.bNu;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select snsId from SnsInfo ").append(o.aU(str, bool)).append(" AND type in ( 1,2 , 3 , 4 , 18 , 5 , 12 , 9 , 14 , 15 , 13 , 21 , 25 , 26) and  (snsId != 0  )  limit 4");
    str = localStringBuilder.toString();
    localObject = ((o)localObject).diF.rawQuery(str, null);
    int i = ((Cursor)localObject).getCount();
    ((Cursor)localObject).close();
    if ((i <= 3) && (i > 0)) {
      this.noM = true;
    }
    while (i != 0) {
      return;
    }
    this.noL = true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneSnsUserPage", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    bqf localbqf = (bqf)((b)paramq).dIE.dIL;
    if ((paramq.Id().qWB != 207) && (paramq.Id().qWB != 203) && (paramq.Id().qWB != 0) && (paramq.Id().qWB != 2001) && (paramq.Id().qWB != 2004) && (paramq.Id().qWB != 2003))
    {
      Mf(this.userName);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    Object localObject;
    boolean bool;
    if (paramq.Id().qWB == 2003)
    {
      paramArrayOfByte = af.byo();
      str1 = this.userName;
      localObject = "DELETE FROM SnsInfo" + " where SnsInfo.userName=\"" + bi.oU(str1) + "\"";
      bool = paramArrayOfByte.diF.fV("SnsInfo", (String)localObject);
      x.d("MicroMsg.SnsInfoStorage", "del snsinfo " + str1 + " res " + bool);
    }
    this.nnV = localbqf.smy;
    x.i("MicroMsg.NetSceneSnsUserPage", "for same md5 count: " + localbqf.smy + " , objCount:  " + localbqf.rXE);
    this.npa = localbqf.sof;
    String str1 = i.eG(this.nnS);
    if (!this.nnR)
    {
      x.d("MicroMsg.NetSceneSnsUserPage", "np  " + localbqf.rgH.size());
      if (localbqf.rgH.isEmpty()) {
        if (paramq.Id().qWB == 203)
        {
          bool = true;
          this.noZ = bool;
          af.byo().b(this.userName, this.bNu, str1);
          this.noL = true;
          this.nnT = this.nnS;
        }
      }
      for (;;)
      {
        Mf(this.userName);
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
        bool = false;
        break;
        a(localbqf, str1);
      }
    }
    if (this.not.equals(localbqf.smu))
    {
      paramq = af.byo();
      if (this.nnR) {}
      for (long l = 0L;; l = this.noK)
      {
        this.nnT = paramq.a(l, this.nnV, this.userName, this.bNu);
        x.i("MicroMsg.NetSceneSnsUserPage", "md5 is nochange the new minid %s", new Object[] { Long.valueOf(this.nnT) });
        bxL();
        Mf(this.userName);
        paramq = af.bys().Np(this.userName);
        this.diJ.a(paramq.field_lastFirstPageRequestErrType, paramq.field_lastFirstPageRequestErrCode, paramString, this);
        return;
      }
    }
    x.i("MicroMsg.NetSceneSnsUserPage", "fp  " + localbqf.rgH.size());
    if ((!this.nnR) || (this.not.equals(localbqf.smu)))
    {
      af.bys().l(this.userName, localbqf.smu, paramInt2, paramInt3);
      if ((paramq.Id().qWB != 207) && (paramq.Id().qWB != 2001) && (paramq.Id().qWB != 2004)) {
        break label1321;
      }
      af.bys().eM(this.userName, "");
      if (!localbqf.rgH.isEmpty()) {
        break label1161;
      }
      paramq = af.byo();
      paramArrayOfByte = this.userName;
      bool = this.bNu;
      paramq.n(bool, o.aU(paramArrayOfByte, bool) + " AND  (snsId != 0  ) ");
      this.nnT = this.nnS;
    }
    for (;;)
    {
      bxL();
      Mf(this.userName);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      this.noX = localbqf.soe;
      paramArrayOfByte = af.bys().Np(this.userName);
      paramArrayOfByte.field_icount = this.noX;
      localObject = localbqf.rTk;
      if (localObject != null)
      {
        str2 = i.eF(((bqd)localObject).eJU);
        String str3 = af.getAccSnsPath();
        String str4 = this.userName + "bg_";
        String str5 = this.userName + "tbg_";
        if ((paramArrayOfByte.field_bgUrl == null) || (!paramArrayOfByte.field_bgId.equals(str2)))
        {
          paramArrayOfByte.field_older_bgId = paramArrayOfByte.field_bgId;
          if (FileOp.cn(an.s(str3, this.userName) + str4))
          {
            FileOp.deleteFile(an.s(str3, this.userName) + str5);
            FileOp.i(an.s(str3, this.userName), str4, str5);
          }
          this.noY = true;
          paramArrayOfByte.bAS();
          x.d("MicroMsg.NetSceneSnsUserPage", "get new  bgid " + ((bqd)localObject).eJT);
        }
        paramArrayOfByte.field_bgId = str2;
        paramArrayOfByte.field_bgUrl = ((bqd)localObject).eJT;
        paramArrayOfByte.field_snsBgId = ((bqd)localObject).eJU;
      }
      af.bys().a(paramArrayOfByte);
      break;
      label1161:
      localObject = af.byo();
      paramq = this.userName;
      bool = this.bNu;
      String str2 = i.eG(((boy)localbqf.rgH.getFirst()).rlK);
      paramArrayOfByte = o.aU(paramq, bool) + " AND  (snsId != 0  ) ";
      paramq = paramArrayOfByte;
      if (o.Nt(str2)) {
        paramq = paramArrayOfByte + " AND " + ((o)localObject).Nw(str2);
      }
      ((o)localObject).n(bool, paramq);
      af.byo().b(this.userName, this.bNu, i.eG(((boy)localbqf.rgH.getLast()).rlK));
      a(localbqf, str1);
    }
    label1321:
    if (localbqf.rgH.size() == 0)
    {
      x.d("MicroMsg.NetSceneSnsUserPage", "error: server give size zero");
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    a(localbqf, str1);
    Mf(this.userName);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final long bxA()
  {
    return this.npa;
  }
  
  public final boolean bxu()
  {
    return this.nnR;
  }
  
  public final boolean bxv()
  {
    return this.noL;
  }
  
  public final boolean bxw()
  {
    return this.noM;
  }
  
  public final boolean bxx()
  {
    return this.noZ;
  }
  
  public final long bxy()
  {
    return this.nnT;
  }
  
  public final boolean bxz()
  {
    return this.noY;
  }
  
  public final int getType()
  {
    return 212;
  }
  
  public final String getUserName()
  {
    return this.userName;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/model/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */