package com.tencent.mm.plugin.sns.model;

import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.g.d;
import com.tencent.mm.plugin.sns.g.e;
import com.tencent.mm.plugin.sns.g.f;
import com.tencent.mm.protocal.c.boh;
import com.tencent.mm.protocal.c.boi;
import com.tencent.mm.protocal.c.bon;
import com.tencent.mm.protocal.c.boy;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public final class ad
{
  String cXR = "";
  private d npq;
  private List<Integer> npr = new Vector();
  private Map<String, Integer> nps = new HashMap();
  private List<Integer> npt = new Vector();
  private Map<Integer, Integer> npu = new HashMap();
  private String path;
  
  public ad(String paramString)
  {
    this.path = paramString;
    if (!bxR()) {
      this.npq = new d();
    }
    this.npr.clear();
    this.nps.clear();
  }
  
  public static boolean Mg(String paramString)
  {
    if (paramString == null) {}
    while (!paramString.startsWith("_AD_TAG_")) {
      return false;
    }
    return true;
  }
  
  public static bon a(boi paramboi)
  {
    boh localboh = paramboi.smo;
    paramboi = paramboi.smp;
    bon localbon = new bon();
    localbon.jSA = localboh.jSA;
    localbon.lOH = localboh.lOH;
    localbon.rTW = localboh.sme;
    localbon.rdq = localboh.rdq;
    localbon.hcE = localboh.hcE;
    localbon.rdS = localboh.seC;
    localbon.smh = localboh.smh;
    localbon.smk = localboh.smk;
    localbon.smm = localboh.smm;
    localbon.smB = paramboi.seC;
    localbon.smj = paramboi.smj;
    localbon.smg = paramboi.smg;
    return localbon;
  }
  
  private static void a(long paramLong, LinkedList<e> paramLinkedList, String paramString)
  {
    a(paramLong, paramLinkedList, paramString, false);
  }
  
  private static boolean a(long paramLong, LinkedList<e> paramLinkedList, String paramString, boolean paramBoolean)
  {
    Iterator localIterator = paramLinkedList.iterator();
    e locale2;
    do
    {
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        locale2 = (e)localIterator.next();
      } while (locale2.nnO.rlK != paramLong);
      locale1 = locale2;
      if (paramBoolean) {
        break;
      }
    } while (!locale2.nuY.equals(paramString));
    for (e locale1 = locale2;; locale1 = null)
    {
      if (locale1 != null)
      {
        paramLinkedList.remove(locale1);
        return true;
      }
      return false;
    }
  }
  
  private static boolean a(LinkedList<bon> paramLinkedList, String paramString, int paramInt)
  {
    if (bi.oW(paramString)) {
      return true;
    }
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      bon localbon = (bon)paramLinkedList.next();
      if ((paramString.equals(localbon.jSA)) && (paramInt == localbon.lOH)) {
        return true;
      }
    }
    return false;
  }
  
  private static boolean af(LinkedList<e> paramLinkedList)
  {
    while (!paramLinkedList.isEmpty())
    {
      e locale = (e)paramLinkedList.getFirst();
      if (bi.bG(locale.nuZ) > 21600L)
      {
        paramLinkedList.removeFirst();
      }
      else
      {
        if (Mg(locale.nuY))
        {
          g.Ek();
          g.Eh().dpP.a(new k(locale.nnO, locale.nuY, locale.nva), 0);
        }
        for (;;)
        {
          return true;
          g.Ek();
          g.Eh().dpP.a(new o(locale.nnO, locale.nuY), 0);
        }
      }
    }
    return false;
  }
  
  private boolean bxQ()
  {
    boolean bool = false;
    try
    {
      byte[] arrayOfByte = this.npq.toByteArray();
      int i = FileOp.b(this.path, arrayOfByte, arrayOfByte.length);
      if (i == 0) {
        bool = true;
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.SnsAsyncQueueMgr", localIOException, "listToFile failed: " + this.path, new Object[0]);
        FileOp.deleteFile(this.path);
      }
    }
    finally {}
    return bool;
  }
  
  /* Error */
  private boolean bxR()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 43	com/tencent/mm/plugin/sns/model/ad:path	Ljava/lang/String;
    //   6: iconst_0
    //   7: iconst_m1
    //   8: invokestatic 286	com/tencent/mm/modelsfs/FileOp:e	(Ljava/lang/String;II)[B
    //   11: astore_2
    //   12: aload_2
    //   13: ifnonnull +9 -> 22
    //   16: iconst_0
    //   17: istore_1
    //   18: aload_0
    //   19: monitorexit
    //   20: iload_1
    //   21: ireturn
    //   22: aload_0
    //   23: new 49	com/tencent/mm/plugin/sns/g/d
    //   26: dup
    //   27: invokespecial 50	com/tencent/mm/plugin/sns/g/d:<init>	()V
    //   30: aload_2
    //   31: invokevirtual 290	com/tencent/mm/plugin/sns/g/d:aG	([B)Lcom/tencent/mm/bk/a;
    //   34: checkcast 49	com/tencent/mm/plugin/sns/g/d
    //   37: putfield 52	com/tencent/mm/plugin/sns/model/ad:npq	Lcom/tencent/mm/plugin/sns/g/d;
    //   40: iconst_1
    //   41: istore_1
    //   42: goto -24 -> 18
    //   45: astore_2
    //   46: ldc_w 259
    //   49: aload_2
    //   50: ldc 25
    //   52: iconst_0
    //   53: anewarray 4	java/lang/Object
    //   56: invokestatic 279	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   59: aload_0
    //   60: getfield 43	com/tencent/mm/plugin/sns/model/ad:path	Ljava/lang/String;
    //   63: invokestatic 282	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   66: pop
    //   67: iconst_0
    //   68: istore_1
    //   69: goto -51 -> 18
    //   72: astore_2
    //   73: aload_0
    //   74: monitorexit
    //   75: aload_2
    //   76: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	this	ad
    //   17	52	1	bool	boolean
    //   11	20	2	arrayOfByte	byte[]
    //   45	5	2	localIOException	IOException
    //   72	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   22	40	45	java/io/IOException
    //   2	12	72	finally
    //   22	40	72	finally
    //   46	67	72	finally
  }
  
  private void e(long paramLong, int paramInt, String paramString)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      try
      {
        bxQ();
        return;
      }
      finally {}
      a(paramLong, this.npq.nuS, paramString);
      continue;
      a(paramLong, this.npq.nuT, paramString);
      continue;
      a(paramLong, this.npq.nuS, paramString);
      continue;
      a(paramLong, this.npq.nuT, paramString);
      continue;
      a(paramLong, this.npq.nuU, paramString);
      continue;
      a(paramLong, this.npq.nuV, paramString);
    }
  }
  
  /* Error */
  public final boolean Mh(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 37	com/tencent/mm/plugin/sns/model/ad:nps	Ljava/util/Map;
    //   8: aload_1
    //   9: invokeinterface 312 2 0
    //   14: istore_3
    //   15: iload_3
    //   16: ifeq +7 -> 23
    //   19: aload_0
    //   20: monitorexit
    //   21: iload_2
    //   22: ireturn
    //   23: aload_0
    //   24: getfield 37	com/tencent/mm/plugin/sns/model/ad:nps	Ljava/util/Map;
    //   27: aload_1
    //   28: iconst_0
    //   29: invokestatic 318	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   32: invokeinterface 322 3 0
    //   37: pop
    //   38: iconst_1
    //   39: istore_2
    //   40: goto -21 -> 19
    //   43: astore_1
    //   44: aload_0
    //   45: monitorexit
    //   46: aload_1
    //   47: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	48	0	this	ad
    //   0	48	1	paramString	String
    //   1	39	2	bool1	boolean
    //   14	2	3	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   4	15	43	finally
    //   23	38	43	finally
  }
  
  public final boolean Mi(String paramString)
  {
    try
    {
      this.nps.remove(paramString);
      return true;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final boolean a(String paramString, boi paramboi)
  {
    return a(paramString, paramboi, "");
  }
  
  public final boolean a(String paramString1, boi paramboi, String paramString2)
  {
    boolean bool2 = true;
    for (;;)
    {
      e locale;
      try
      {
        locale = new e();
        locale.nuY = paramString1;
        locale.nnO = paramboi;
        locale.nuZ = ((int)bi.VE());
        locale.nva = paramString2;
        bool1 = bool2;
        switch (paramboi.smo.hcE)
        {
        case 4: 
        case 6: 
          if (!bxQ()) {
            x.e("MicroMsg.SnsAsyncQueueMgr", "error listToFile");
          }
          return bool1;
        }
      }
      finally {}
      this.npq.nuS.add(locale);
      boolean bool1 = bool2;
      if (eV(paramboi.rlK))
      {
        bool1 = false;
        continue;
        this.npq.nuT.add(locale);
        bool1 = bool2;
        continue;
        this.npq.nuS.add(locale);
        bool1 = bool2;
        if (eV(paramboi.rlK))
        {
          bool1 = false;
          continue;
          this.npq.nuT.add(locale);
          bool1 = bool2;
          continue;
          this.npq.nuU.add(locale);
          bool1 = bool2;
          continue;
          this.npq.nuV.add(locale);
          bool1 = bool2;
          continue;
          bool1 = bool2;
        }
      }
    }
  }
  
  public final void bxP()
  {
    for (;;)
    {
      try
      {
        boolean bool = af(this.npq.nuS);
        if (bool) {
          return;
        }
        if ((af(this.npq.nuT)) || (af(this.npq.nuU)) || (af(this.npq.nuV))) {
          continue;
        }
        if (this.npq.nuW.isEmpty()) {
          break label157;
        }
        f localf1 = (f)this.npq.nuW.getFirst();
        if (bi.bG(localf1.nuZ) > 21600L)
        {
          this.npq.nuW.removeFirst();
          continue;
        }
        l = ((f)localObject).nvb;
      }
      finally {}
      g.Ek();
      g.Eh().dpP.a(new r(l, 1), 0);
      continue;
      label157:
      f localf2;
      while (!this.npq.nuX.isEmpty())
      {
        localf2 = (f)this.npq.nuX.getFirst();
        if (bi.bG(localf2.nuZ) <= 21600L) {
          break label215;
        }
        this.npq.nuX.removeFirst();
      }
      continue;
      label215:
      long l = localf2.nvb;
      g.Ek();
      g.Eh().dpP.a(new r(l, 5), 0);
    }
  }
  
  public final int bxS()
  {
    try
    {
      int i = this.nps.size();
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boy c(boy paramboy)
  {
    int i;
    long l;
    Iterator localIterator;
    Object localObject1;
    Object localObject2;
    try
    {
      if (bi.oW(this.cXR)) {
        this.cXR = q.GF();
      }
      if (this.npq.nuS.size() == 0)
      {
        i = this.npq.nuT.size();
        if (i == 0) {
          return paramboy;
        }
      }
      l = paramboy.rlK;
      localIterator = this.npq.nuS.iterator();
      while (localIterator.hasNext())
      {
        localObject1 = (e)localIterator.next();
        localObject2 = a(((e)localObject1).nnO);
        if ((((e)localObject1).nnO.rlK == l) && (!a(paramboy.smL, ((bon)localObject2).jSA, ((bon)localObject2).lOH)))
        {
          paramboy.smL.add(localObject2);
          paramboy.smJ += 1;
        }
      }
      localIterator = paramboy.smL.iterator();
    }
    finally {}
    label170:
    while (localIterator.hasNext())
    {
      localObject1 = (bon)localIterator.next();
      if (((bon)localObject1).rdS.equals(this.cXR))
      {
        i = 0;
        localObject2 = this.npq.nuX.iterator();
        label221:
        if (!((Iterator)localObject2).hasNext()) {
          break label377;
        }
        if (((f)((Iterator)localObject2).next()).nvb != l) {
          break label374;
        }
        paramboy.smL.remove(localObject1);
        paramboy.smJ -= 1;
        i = 1;
        break label374;
      }
    }
    for (;;)
    {
      localIterator = this.npq.nuT.iterator();
      while (localIterator.hasNext())
      {
        localObject1 = (e)localIterator.next();
        if (((e)localObject1).nnO.rlK == l)
        {
          localObject1 = a(((e)localObject1).nnO);
          if (!a(paramboy.smO, ((bon)localObject1).jSA, ((bon)localObject1).lOH))
          {
            paramboy.smO.add(localObject1);
            paramboy.smM += 1;
          }
        }
      }
      break;
      label374:
      break label221;
      label377:
      if (i == 0) {
        break label170;
      }
    }
  }
  
  public final void d(long paramLong, int paramInt, String paramString)
  {
    aj.byG();
    e(paramLong, paramInt, paramString);
  }
  
  public final boolean du(int paramInt1, int paramInt2)
  {
    try
    {
      this.npu.put(Integer.valueOf(paramInt1), Integer.valueOf(paramInt2));
      return true;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final boolean eR(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 52	com/tencent/mm/plugin/sns/model/ad:npq	Lcom/tencent/mm/plugin/sns/g/d;
    //   6: getfield 353	com/tencent/mm/plugin/sns/g/d:nuW	Ljava/util/LinkedList;
    //   9: invokevirtual 151	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   12: astore 6
    //   14: aload 6
    //   16: invokeinterface 156 1 0
    //   21: ifeq +31 -> 52
    //   24: aload 6
    //   26: invokeinterface 160 1 0
    //   31: checkcast 355	com/tencent/mm/plugin/sns/g/f
    //   34: getfield 359	com/tencent/mm/plugin/sns/g/f:nvb	J
    //   37: lstore_3
    //   38: lload_3
    //   39: lload_1
    //   40: lcmp
    //   41: ifne -27 -> 14
    //   44: iconst_0
    //   45: istore 5
    //   47: aload_0
    //   48: monitorexit
    //   49: iload 5
    //   51: ireturn
    //   52: iconst_1
    //   53: istore 5
    //   55: goto -8 -> 47
    //   58: astore 6
    //   60: aload_0
    //   61: monitorexit
    //   62: aload 6
    //   64: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	65	0	this	ad
    //   0	65	1	paramLong	long
    //   37	2	3	l	long
    //   45	9	5	bool	boolean
    //   12	13	6	localIterator	Iterator
    //   58	5	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	14	58	finally
    //   14	38	58	finally
  }
  
  public final void eS(long paramLong)
  {
    try
    {
      f localf = new f();
      localf.nvb = paramLong;
      localf.nuZ = ((int)bi.VE());
      this.npq.nuW.add(localf);
      bxQ();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  final void eT(long paramLong)
  {
    for (;;)
    {
      try
      {
        Iterator localIterator = this.npq.nuW.iterator();
        if (localIterator.hasNext())
        {
          f localf = (f)localIterator.next();
          if (localf.nvb != paramLong) {
            continue;
          }
          if (localf != null) {
            this.npq.nuW.remove(localf);
          }
          bxQ();
          return;
        }
      }
      finally {}
      Object localObject2 = null;
    }
  }
  
  /* Error */
  public final boolean eU(long paramLong)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_0
    //   3: monitorenter
    //   4: new 355	com/tencent/mm/plugin/sns/g/f
    //   7: dup
    //   8: invokespecial 413	com/tencent/mm/plugin/sns/g/f:<init>	()V
    //   11: astore 5
    //   13: aload 5
    //   15: lload_1
    //   16: putfield 359	com/tencent/mm/plugin/sns/g/f:nvb	J
    //   19: aload 5
    //   21: invokestatic 335	com/tencent/mm/sdk/platformtools/bi:VE	()J
    //   24: l2i
    //   25: putfield 356	com/tencent/mm/plugin/sns/g/f:nuZ	I
    //   28: aload_0
    //   29: getfield 52	com/tencent/mm/plugin/sns/model/ad:npq	Lcom/tencent/mm/plugin/sns/g/d;
    //   32: getfield 367	com/tencent/mm/plugin/sns/g/d:nuX	Ljava/util/LinkedList;
    //   35: aload 5
    //   37: invokevirtual 343	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   40: pop
    //   41: aload_0
    //   42: invokespecial 293	com/tencent/mm/plugin/sns/model/ad:bxQ	()Z
    //   45: pop
    //   46: lload_1
    //   47: aload_0
    //   48: getfield 52	com/tencent/mm/plugin/sns/model/ad:npq	Lcom/tencent/mm/plugin/sns/g/d;
    //   51: getfield 297	com/tencent/mm/plugin/sns/g/d:nuS	Ljava/util/LinkedList;
    //   54: ldc 25
    //   56: iconst_1
    //   57: invokestatic 143	com/tencent/mm/plugin/sns/model/ad:a	(JLjava/util/LinkedList;Ljava/lang/String;Z)Z
    //   60: istore 4
    //   62: iload 4
    //   64: ifne +7 -> 71
    //   67: aload_0
    //   68: monitorexit
    //   69: iload_3
    //   70: ireturn
    //   71: iconst_0
    //   72: istore_3
    //   73: goto -6 -> 67
    //   76: astore 5
    //   78: aload_0
    //   79: monitorexit
    //   80: aload 5
    //   82: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	83	0	this	ad
    //   0	83	1	paramLong	long
    //   1	72	3	bool1	boolean
    //   60	3	4	bool2	boolean
    //   11	25	5	localf	f
    //   76	5	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   4	62	76	finally
  }
  
  final boolean eV(long paramLong)
  {
    for (;;)
    {
      try
      {
        Iterator localIterator = this.npq.nuX.iterator();
        if (!localIterator.hasNext()) {
          break label87;
        }
        f localf = (f)localIterator.next();
        if (localf.nvb != paramLong) {
          continue;
        }
        if (localf != null)
        {
          this.npq.nuX.remove(localf);
          bool = true;
          bxQ();
          return bool;
        }
      }
      finally {}
      boolean bool = false;
      continue;
      label87:
      Object localObject2 = null;
    }
  }
  
  public final boolean isDownloading(String paramString)
  {
    try
    {
      boolean bool = this.nps.containsKey(paramString);
      return bool;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final boolean wq(int paramInt)
  {
    try
    {
      boolean bool = this.npr.contains(Integer.valueOf(paramInt));
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final boolean wr(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 32	com/tencent/mm/plugin/sns/model/ad:npr	Ljava/util/List;
    //   6: iload_1
    //   7: invokestatic 318	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   10: invokeinterface 421 2 0
    //   15: istore_2
    //   16: iload_2
    //   17: ifeq +9 -> 26
    //   20: iconst_0
    //   21: istore_2
    //   22: aload_0
    //   23: monitorexit
    //   24: iload_2
    //   25: ireturn
    //   26: aload_0
    //   27: getfield 32	com/tencent/mm/plugin/sns/model/ad:npr	Ljava/util/List;
    //   30: iload_1
    //   31: invokestatic 318	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   34: invokeinterface 423 2 0
    //   39: pop
    //   40: iconst_1
    //   41: istore_2
    //   42: goto -20 -> 22
    //   45: astore_3
    //   46: aload_0
    //   47: monitorexit
    //   48: aload_3
    //   49: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	50	0	this	ad
    //   0	50	1	paramInt	int
    //   15	27	2	bool	boolean
    //   45	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	16	45	finally
    //   26	40	45	finally
  }
  
  public final boolean ws(int paramInt)
  {
    try
    {
      this.npr.remove(Integer.valueOf(paramInt));
      return true;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final boolean wt(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 39	com/tencent/mm/plugin/sns/model/ad:npt	Ljava/util/List;
    //   6: iload_1
    //   7: invokestatic 318	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   10: invokeinterface 421 2 0
    //   15: istore_2
    //   16: iload_2
    //   17: ifeq +9 -> 26
    //   20: iconst_0
    //   21: istore_2
    //   22: aload_0
    //   23: monitorexit
    //   24: iload_2
    //   25: ireturn
    //   26: aload_0
    //   27: getfield 39	com/tencent/mm/plugin/sns/model/ad:npt	Ljava/util/List;
    //   30: iload_1
    //   31: invokestatic 318	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   34: invokeinterface 423 2 0
    //   39: pop
    //   40: iconst_1
    //   41: istore_2
    //   42: goto -20 -> 22
    //   45: astore_3
    //   46: aload_0
    //   47: monitorexit
    //   48: aload_3
    //   49: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	50	0	this	ad
    //   0	50	1	paramInt	int
    //   15	27	2	bool	boolean
    //   45	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	16	45	finally
    //   26	40	45	finally
  }
  
  public final boolean wu(int paramInt)
  {
    try
    {
      this.npt.remove(Integer.valueOf(paramInt));
      this.npu.remove(Integer.valueOf(paramInt));
      return true;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean wv(int paramInt)
  {
    try
    {
      this.npu.remove(Integer.valueOf(paramInt));
      return true;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final int ww(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 41	com/tencent/mm/plugin/sns/model/ad:npu	Ljava/util/Map;
    //   6: iload_1
    //   7: invokestatic 318	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   10: invokeinterface 312 2 0
    //   15: ifeq +27 -> 42
    //   18: aload_0
    //   19: getfield 41	com/tencent/mm/plugin/sns/model/ad:npu	Ljava/util/Map;
    //   22: iload_1
    //   23: invokestatic 318	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   26: invokeinterface 433 2 0
    //   31: checkcast 314	java/lang/Integer
    //   34: invokevirtual 436	java/lang/Integer:intValue	()I
    //   37: istore_1
    //   38: aload_0
    //   39: monitorexit
    //   40: iload_1
    //   41: ireturn
    //   42: iconst_m1
    //   43: istore_1
    //   44: goto -6 -> 38
    //   47: astore_2
    //   48: aload_0
    //   49: monitorexit
    //   50: aload_2
    //   51: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	52	0	this	ad
    //   0	52	1	paramInt	int
    //   47	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	38	47	finally
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/model/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */