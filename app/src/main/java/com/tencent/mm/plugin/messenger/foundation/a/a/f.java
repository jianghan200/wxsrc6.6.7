package com.tencent.mm.plugin.messenger.foundation.a.a;

import android.database.Cursor;
import android.os.Looper;
import com.tencent.mm.bt.h;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bd.a;
import com.tencent.mm.storage.bd.b;
import com.tencent.mm.storage.bd.c;
import com.tencent.mm.storage.bd.d;
import com.tencent.mm.storage.e;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public abstract interface f
  extends com.tencent.mm.sdk.e.f
{
  public abstract Cursor E(String paramString1, String paramString2, int paramInt);
  
  public abstract void E(ArrayList<Long> paramArrayList);
  
  public abstract void GA(String paramString);
  
  public abstract void GB(String paramString);
  
  public abstract Cursor GC(String paramString);
  
  public abstract bd GD(String paramString);
  
  public abstract bd GE(String paramString);
  
  public abstract bd GF(String paramString);
  
  public abstract bd GG(String paramString);
  
  public abstract List<bd> GH(String paramString);
  
  public abstract Cursor GI(String paramString);
  
  public abstract void GJ(String paramString);
  
  public abstract int GK(String paramString);
  
  public abstract boolean GL(String paramString);
  
  public abstract int GM(String paramString);
  
  public abstract Cursor GN(String paramString);
  
  public abstract Cursor GO(String paramString);
  
  public abstract bd.c GP(String paramString);
  
  public abstract bd.d GQ(String paramString);
  
  public abstract bd.a GR(String paramString);
  
  public abstract bd.b GS(String paramString);
  
  public abstract int GT(String paramString);
  
  public abstract boolean GU(String paramString);
  
  public abstract int GV(String paramString);
  
  public abstract int GW(String paramString);
  
  public abstract String GX(String paramString);
  
  public abstract long GY(String paramString);
  
  public abstract long GZ(String paramString);
  
  public abstract void Gz(String paramString);
  
  public abstract void H(String paramString, long paramLong);
  
  public abstract long Ha(String paramString);
  
  public abstract bd Hb(String paramString);
  
  public abstract int Hc(String paramString);
  
  public abstract List<bd> Hd(String paramString);
  
  public abstract long He(String paramString);
  
  public abstract Cursor Hf(String paramString);
  
  public abstract bd I(String paramString, long paramLong);
  
  public abstract bd J(String paramString, long paramLong);
  
  public abstract bd K(String paramString, long paramLong);
  
  public abstract List<bd> L(String paramString, long paramLong);
  
  public abstract List<bd> M(String paramString, long paramLong);
  
  public abstract bd N(String paramString, long paramLong);
  
  public abstract bd O(String paramString, long paramLong);
  
  public abstract boolean P(String paramString, long paramLong);
  
  public abstract long Q(String paramString, long paramLong);
  
  public abstract int R(String paramString, long paramLong);
  
  public abstract int S(bd parambd);
  
  public abstract int S(String paramString, long paramLong);
  
  public abstract int T(String paramString, long paramLong);
  
  public abstract long T(bd parambd);
  
  public abstract String U(String paramString, long paramLong);
  
  public abstract void U(bd parambd);
  
  public abstract int V(bd parambd);
  
  public abstract bd V(String paramString, long paramLong);
  
  public abstract bd W(String paramString, long paramLong);
  
  public abstract long X(String paramString, long paramLong);
  
  public abstract List<bd> X(String paramString, int paramInt1, int paramInt2);
  
  public abstract long Y(String paramString, long paramLong);
  
  public abstract Cursor Y(String paramString, int paramInt1, int paramInt2);
  
  public abstract Cursor a(String paramString, long paramLong1, long paramLong2, boolean paramBoolean);
  
  public abstract void a(long paramLong, bd parambd);
  
  public abstract void a(h paramh, String paramString);
  
  public abstract void a(a parama);
  
  public abstract void a(a parama, Looper paramLooper);
  
  public abstract void a(b paramb);
  
  public abstract void a(c paramc);
  
  public abstract void a(e parame);
  
  public abstract long b(bd parambd, boolean paramBoolean);
  
  public abstract Cursor b(String paramString, long paramLong1, long paramLong2, int paramInt);
  
  public abstract void b(long paramLong, bd parambd);
  
  public abstract void b(String paramString1, String paramString2, String[] paramArrayOfString);
  
  public abstract Cursor bA(String paramString, int paramInt);
  
  public abstract Cursor bB(String paramString, int paramInt);
  
  public abstract int bC(String paramString, int paramInt);
  
  public abstract Cursor bD(String paramString, int paramInt);
  
  public abstract Cursor bE(String paramString, int paramInt);
  
  public abstract int bF(String paramString, int paramInt);
  
  public abstract Cursor bG(String paramString, int paramInt);
  
  public abstract bd[] bH(String paramString, int paramInt);
  
  public abstract Cursor bI(String paramString, int paramInt);
  
  public abstract h bdc();
  
  public abstract void bdd();
  
  public abstract void bde();
  
  public abstract void bdf();
  
  public abstract ArrayList<bd> bdg();
  
  public abstract List<bd> bdh();
  
  public abstract Cursor bdi();
  
  public abstract Cursor bdj();
  
  public abstract String bdk();
  
  public abstract String bdl();
  
  public abstract List<bd> bdm();
  
  public abstract List<bd> by(String paramString, int paramInt);
  
  public abstract List<bd> bz(String paramString, int paramInt);
  
  public abstract int c(String paramString, long paramLong, int paramInt);
  
  public abstract Cursor d(String paramString, long paramLong, int paramInt);
  
  public abstract List<bd> d(String paramString, long paramLong, boolean paramBoolean);
  
  public abstract bd dG(String paramString1, String paramString2);
  
  public abstract Cursor dH(String paramString1, String paramString2);
  
  public abstract int dI(String paramString1, String paramString2);
  
  public abstract LinkedList<bd> dJ(String paramString1, String paramString2);
  
  public abstract bd dW(long paramLong);
  
  public abstract int dX(long paramLong);
  
  public abstract boolean dY(long paramLong);
  
  public abstract boolean dZ(long paramLong);
  
  public abstract void ea(long paramLong);
  
  public abstract Cursor f(String paramString, int paramInt, long paramLong);
  
  public abstract Cursor g(String paramString, int paramInt, long paramLong);
  
  public abstract Cursor h(String paramString, int paramInt, long paramLong);
  
  public abstract Cursor n(String paramString, long paramLong1, long paramLong2);
  
  public abstract int o(String paramString, long paramLong1, long paramLong2);
  
  public abstract int p(String paramString, long paramLong1, long paramLong2);
  
  public abstract Cursor q(String paramString, long paramLong1, long paramLong2);
  
  public abstract int r(String paramString, long paramLong1, long paramLong2);
  
  public abstract Cursor s(String paramString, long paramLong1, long paramLong2);
  
  public abstract bd sx(int paramInt);
  
  public static abstract interface a
  {
    public abstract void a(f paramf, f.c paramc);
  }
  
  public static final class b
  {
    public long dTS;
    public a[] lct;
    public int lcu;
    public String name;
    
    public b(int paramInt, String paramString, a[] paramArrayOfa)
    {
      if (paramString.length() > 0)
      {
        bool1 = true;
        Assert.assertTrue(bool1);
        this.name = paramString;
        if (paramArrayOfa.length != 2) {
          break label141;
        }
        bool1 = true;
        label36:
        Assert.assertTrue(bool1);
        if (paramArrayOfa[0].lcw < paramArrayOfa[0].lcv) {
          break label147;
        }
        bool1 = true;
        label60:
        Assert.assertTrue(bool1);
        if (paramArrayOfa[1].lcw < paramArrayOfa[1].lcv) {
          break label153;
        }
        bool1 = true;
        label84:
        Assert.assertTrue(bool1);
        if (paramArrayOfa[1].lcv < paramArrayOfa[0].lcw) {
          break label159;
        }
      }
      label141:
      label147:
      label153:
      label159:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        Assert.assertTrue(bool1);
        this.lct = paramArrayOfa;
        this.lcu = paramInt;
        this.dTS = paramArrayOfa[0].lcv;
        return;
        bool1 = false;
        break;
        bool1 = false;
        break label36;
        bool1 = false;
        break label60;
        bool1 = false;
        break label84;
      }
    }
    
    public static a[] a(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
    {
      a locala1 = new a((byte)0);
      locala1.lcv = paramLong1;
      locala1.lcw = paramLong2;
      a locala2 = new a((byte)0);
      locala2.lcv = paramLong3;
      locala2.lcw = paramLong4;
      return new a[] { locala1, locala2 };
    }
    
    /* Error */
    public final void bdn()
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield 45	com/tencent/mm/plugin/messenger/foundation/a/a/f$b:lct	[Lcom/tencent/mm/plugin/messenger/foundation/a/a/f$b$a;
      //   6: iconst_0
      //   7: aaload
      //   8: astore_1
      //   9: aload_0
      //   10: getfield 49	com/tencent/mm/plugin/messenger/foundation/a/a/f$b:dTS	J
      //   13: aload_1
      //   14: getfield 40	com/tencent/mm/plugin/messenger/foundation/a/a/f$b$a:lcw	J
      //   17: lcmp
      //   18: ifne +60 -> 78
      //   21: aload_0
      //   22: aload_0
      //   23: getfield 45	com/tencent/mm/plugin/messenger/foundation/a/a/f$b:lct	[Lcom/tencent/mm/plugin/messenger/foundation/a/a/f$b$a;
      //   26: iconst_1
      //   27: aaload
      //   28: getfield 43	com/tencent/mm/plugin/messenger/foundation/a/a/f$b$a:lcv	J
      //   31: putfield 49	com/tencent/mm/plugin/messenger/foundation/a/a/f$b:dTS	J
      //   34: getstatic 61	com/tencent/mm/plugin/report/f:mDy	Lcom/tencent/mm/plugin/report/f;
      //   37: ldc2_w 62
      //   40: ldc2_w 64
      //   43: lconst_1
      //   44: iconst_0
      //   45: invokevirtual 68	com/tencent/mm/plugin/report/f:a	(JJJZ)V
      //   48: invokestatic 74	com/tencent/mm/sdk/a/b:chr	()Z
      //   51: ifne +24 -> 75
      //   54: ldc 76
      //   56: ldc 78
      //   58: iconst_1
      //   59: anewarray 4	java/lang/Object
      //   62: dup
      //   63: iconst_0
      //   64: aload_0
      //   65: getfield 49	com/tencent/mm/plugin/messenger/foundation/a/a/f$b:dTS	J
      //   68: invokestatic 84	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   71: aastore
      //   72: invokestatic 90	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   75: aload_0
      //   76: monitorexit
      //   77: return
      //   78: aload_0
      //   79: aload_0
      //   80: getfield 49	com/tencent/mm/plugin/messenger/foundation/a/a/f$b:dTS	J
      //   83: lconst_1
      //   84: ladd
      //   85: putfield 49	com/tencent/mm/plugin/messenger/foundation/a/a/f$b:dTS	J
      //   88: goto -40 -> 48
      //   91: astore_1
      //   92: aload_0
      //   93: monitorexit
      //   94: aload_1
      //   95: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	96	0	this	b
      //   8	6	1	locala	a
      //   91	4	1	localObject	Object
      // Exception table:
      //   from	to	target	type
      //   2	48	91	finally
      //   48	75	91	finally
      //   78	88	91	finally
    }
    
    public final boolean eb(long paramLong)
    {
      a[] arrayOfa = this.lct;
      int k = arrayOfa.length;
      int i = 0;
      while (i < k)
      {
        a locala = arrayOfa[i];
        if ((paramLong >= locala.lcv) && (paramLong <= locala.lcw)) {}
        for (int j = 1; j != 0; j = 0) {
          return true;
        }
        i += 1;
      }
      return false;
    }
    
    private static final class a
    {
      public long lcv;
      public long lcw;
    }
  }
  
  public static final class c
  {
    public long hpD = -1L;
    public int lcA = 0;
    public int lcB = 0;
    public long lcC = 0L;
    public String lcx;
    public ArrayList<bd> lcy = new ArrayList();
    public int lcz;
    public String talker;
    
    public c(String paramString1, String paramString2, bd parambd)
    {
      this(paramString1, paramString2, parambd, 0);
    }
    
    public c(String paramString1, String paramString2, bd parambd, int paramInt)
    {
      this.talker = paramString1;
      this.lcx = paramString2;
      this.lcz = paramInt;
      if (parambd != null) {
        l = parambd.field_bizChatId;
      }
      this.hpD = l;
      if (parambd != null) {
        this.lcy.add(parambd);
      }
    }
    
    public c(String paramString1, String paramString2, bd parambd, int paramInt, byte paramByte)
    {
      this(paramString1, paramString2, parambd, 0);
      this.lcB = paramInt;
    }
    
    public static boolean W(bd parambd)
    {
      return (parambd != null) && (parambd.field_isSend == 0) && (parambd.field_status == 3);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/messenger/foundation/a/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */