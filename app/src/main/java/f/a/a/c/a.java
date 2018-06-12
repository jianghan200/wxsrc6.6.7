package f.a.a.c;

import com.tencent.mm.bk.b;
import java.io.OutputStream;
import java.util.LinkedList;

public final class a
{
  public final OutputStream dHY;
  public final byte[] vHI;
  private final f.a.a.b.b.a vHJ;
  
  public a(byte[] paramArrayOfByte)
  {
    this.vHI = paramArrayOfByte;
    this.dHY = null;
    this.vHJ = new f.a.a.b.b.a(paramArrayOfByte, paramArrayOfByte.length);
  }
  
  public final void T(int paramInt, long paramLong)
  {
    f.a.a.b.b.a locala = this.vHJ;
    locala.aI(paramInt, 0);
    locala.ag(paramLong);
  }
  
  public final void av(int paramInt, boolean paramBoolean)
  {
    int i = 0;
    f.a.a.b.b.a locala = this.vHJ;
    locala.aI(paramInt, 0);
    paramInt = i;
    if (paramBoolean) {
      paramInt = 1;
    }
    locala.eb(paramInt);
  }
  
  public final void b(int paramInt, b paramb)
  {
    f.a.a.b.b.a locala = this.vHJ;
    if (paramb != null)
    {
      locala.aI(paramInt, 2);
      paramb = paramb.toByteArray();
      locala.ed(paramb.length);
      locala.p(paramb);
    }
  }
  
  public final void c(int paramInt, double paramDouble)
  {
    f.a.a.b.b.a locala = this.vHJ;
    locala.aI(paramInt, 1);
    long l = Double.doubleToLongBits(paramDouble);
    locala.eb((int)l & 0xFF);
    locala.eb((int)(l >> 8) & 0xFF);
    locala.eb((int)(l >> 16) & 0xFF);
    locala.eb((int)(l >> 24) & 0xFF);
    locala.eb((int)(l >> 32) & 0xFF);
    locala.eb((int)(l >> 40) & 0xFF);
    locala.eb((int)(l >> 48) & 0xFF);
    locala.eb((int)(l >> 56) & 0xFF);
  }
  
  public final void c(int paramInt, LinkedList<?> paramLinkedList)
  {
    int j = 0;
    f.a.a.b.b.a locala;
    int i;
    if ((paramLinkedList != null) && (paramLinkedList.size() > 0))
    {
      this.vHJ.aI(paramInt, 2);
      locala = this.vHJ;
      if ((paramLinkedList == null) || (paramLinkedList.size() <= 0)) {
        break label123;
      }
      paramInt = 0;
      i = 0;
      if (i < paramLinkedList.size()) {
        break label70;
      }
    }
    for (;;)
    {
      locala.ed(paramInt);
      paramInt = j;
      for (;;)
      {
        if (paramInt >= paramLinkedList.size())
        {
          return;
          label70:
          int k = f.a.a.b.b.a.ee(((Integer)paramLinkedList.get(i)).intValue());
          i += 1;
          paramInt = k + paramInt;
          break;
        }
        this.vHJ.ed(((Integer)paramLinkedList.get(paramInt)).intValue());
        paramInt += 1;
      }
      label123:
      paramInt = 0;
    }
  }
  
  public final void d(int paramInt1, int paramInt2, LinkedList<?> paramLinkedList)
  {
    if (paramLinkedList != null) {
      switch (paramInt2)
      {
      default: 
        throw new IllegalArgumentException("The data type was not found, the id used was " + paramInt2);
      case 6: 
        paramInt2 = 0;
        if (paramInt2 < paramLinkedList.size()) {
          break;
        }
      }
    }
    for (;;)
    {
      return;
      b(paramInt1, (b)paramLinkedList.get(paramInt2));
      paramInt2 += 1;
      break;
      paramInt2 = 0;
      while (paramInt2 < paramLinkedList.size())
      {
        c(paramInt1, ((Double)paramLinkedList.get(paramInt2)).doubleValue());
        paramInt2 += 1;
      }
      continue;
      paramInt2 = 0;
      while (paramInt2 < paramLinkedList.size())
      {
        l(paramInt1, ((Float)paramLinkedList.get(paramInt2)).floatValue());
        paramInt2 += 1;
      }
      continue;
      paramInt2 = 0;
      while (paramInt2 < paramLinkedList.size())
      {
        fT(paramInt1, ((Integer)paramLinkedList.get(paramInt2)).intValue());
        paramInt2 += 1;
      }
      continue;
      paramInt2 = 0;
      while (paramInt2 < paramLinkedList.size())
      {
        T(paramInt1, ((Long)paramLinkedList.get(paramInt2)).longValue());
        paramInt2 += 1;
      }
      continue;
      paramInt2 = 0;
      while (paramInt2 < paramLinkedList.size())
      {
        g(paramInt1, (String)paramLinkedList.get(paramInt2));
        paramInt2 += 1;
      }
      continue;
      paramInt2 = 0;
      while (paramInt2 < paramLinkedList.size())
      {
        av(paramInt1, ((Boolean)paramLinkedList.get(paramInt2)).booleanValue());
        paramInt2 += 1;
      }
      continue;
      paramInt2 = 0;
      while (paramInt2 < paramLinkedList.size())
      {
        com.tencent.mm.bk.a locala = (com.tencent.mm.bk.a)paramLinkedList.get(paramInt2);
        fV(paramInt1, locala.boi());
        locala.a(this);
        paramInt2 += 1;
      }
    }
  }
  
  public final void fT(int paramInt1, int paramInt2)
  {
    f.a.a.b.b.a locala = this.vHJ;
    locala.aI(paramInt1, 0);
    if (paramInt2 >= 0)
    {
      locala.ed(paramInt2);
      return;
    }
    locala.ag(paramInt2);
  }
  
  public final void fU(int paramInt1, int paramInt2)
  {
    fT(paramInt1, paramInt2);
  }
  
  public final void fV(int paramInt1, int paramInt2)
  {
    f.a.a.b.b.a locala = this.vHJ;
    locala.aI(paramInt1, 2);
    locala.ed(paramInt2);
  }
  
  public final void g(int paramInt, String paramString)
  {
    f.a.a.b.b.a locala = this.vHJ;
    if (paramString != null)
    {
      locala.aI(paramInt, 2);
      paramString = paramString.getBytes("UTF-8");
      locala.ed(paramString.length);
      locala.p(paramString);
    }
  }
  
  public final void l(int paramInt, float paramFloat)
  {
    f.a.a.b.b.a locala = this.vHJ;
    locala.aI(paramInt, 5);
    paramInt = Float.floatToIntBits(paramFloat);
    locala.eb(paramInt & 0xFF);
    locala.eb(paramInt >> 8 & 0xFF);
    locala.eb(paramInt >> 16 & 0xFF);
    locala.eb(paramInt >> 24 & 0xFF);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/f/a/a/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */