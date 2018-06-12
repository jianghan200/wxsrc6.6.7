package com.tencent.matrix.resource.c;

import com.tencent.matrix.resource.c.a.c;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

public final class e
  extends d
{
  int brK = 0;
  final OutputStream brV;
  final ByteArrayOutputStream brW = new ByteArrayOutputStream();
  
  public e(OutputStream paramOutputStream)
  {
    super(null);
    this.brV = paramOutputStream;
  }
  
  private a b(int paramInt1, int paramInt2, long paramLong)
  {
    try
    {
      a locala = new a(paramInt1, paramInt2, paramLong);
      return locala;
    }
    catch (Throwable localThrowable)
    {
      throw new RuntimeException(localThrowable);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, long paramLong, byte[] paramArrayOfByte)
  {
    try
    {
      this.brV.write(paramInt1);
      com.tencent.matrix.resource.c.b.a.c(this.brV, paramInt2);
      com.tencent.matrix.resource.c.b.a.c(this.brV, (int)paramLong);
      this.brV.write(paramArrayOfByte, 0, (int)paramLong);
      return;
    }
    catch (Throwable paramArrayOfByte)
    {
      throw new RuntimeException(paramArrayOfByte);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, com.tencent.matrix.resource.c.a.b[] paramArrayOfb, int paramInt3, long paramLong)
  {
    try
    {
      this.brV.write(5);
      com.tencent.matrix.resource.c.b.a.c(this.brV, paramInt3);
      com.tencent.matrix.resource.c.b.a.c(this.brV, (int)paramLong);
      com.tencent.matrix.resource.c.b.a.c(this.brV, paramInt1);
      com.tencent.matrix.resource.c.b.a.c(this.brV, paramInt2);
      com.tencent.matrix.resource.c.b.a.c(this.brV, paramArrayOfb.length);
      paramInt2 = paramArrayOfb.length;
      paramInt1 = 0;
      while (paramInt1 < paramInt2)
      {
        com.tencent.matrix.resource.c.a.b localb = paramArrayOfb[paramInt1];
        this.brV.write(localb.bsd);
        paramInt1 += 1;
      }
      return;
    }
    catch (Throwable paramArrayOfb)
    {
      throw new RuntimeException(paramArrayOfb);
    }
  }
  
  public final void a(int paramInt1, com.tencent.matrix.resource.c.a.b paramb1, int paramInt2, com.tencent.matrix.resource.c.a.b paramb2, int paramInt3, long paramLong)
  {
    try
    {
      this.brV.write(2);
      com.tencent.matrix.resource.c.b.a.c(this.brV, paramInt3);
      com.tencent.matrix.resource.c.b.a.c(this.brV, (int)paramLong);
      com.tencent.matrix.resource.c.b.a.c(this.brV, paramInt1);
      this.brV.write(paramb1.bsd);
      com.tencent.matrix.resource.c.b.a.c(this.brV, paramInt2);
      this.brV.write(paramb2.bsd);
      return;
    }
    catch (Throwable paramb1)
    {
      throw new RuntimeException(paramb1);
    }
  }
  
  public final void a(com.tencent.matrix.resource.c.a.b paramb1, com.tencent.matrix.resource.c.a.b paramb2, com.tencent.matrix.resource.c.a.b paramb3, com.tencent.matrix.resource.c.a.b paramb4, int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    try
    {
      this.brV.write(4);
      com.tencent.matrix.resource.c.b.a.c(this.brV, paramInt3);
      com.tencent.matrix.resource.c.b.a.c(this.brV, (int)paramLong);
      this.brV.write(paramb1.bsd);
      this.brV.write(paramb2.bsd);
      this.brV.write(paramb3.bsd);
      this.brV.write(paramb4.bsd);
      com.tencent.matrix.resource.c.b.a.c(this.brV, paramInt1);
      com.tencent.matrix.resource.c.b.a.c(this.brV, paramInt2);
      return;
    }
    catch (Throwable paramb1)
    {
      throw new RuntimeException(paramb1);
    }
  }
  
  public final void a(com.tencent.matrix.resource.c.a.b paramb, String paramString, int paramInt, long paramLong)
  {
    try
    {
      this.brV.write(1);
      com.tencent.matrix.resource.c.b.a.c(this.brV, paramInt);
      com.tencent.matrix.resource.c.b.a.c(this.brV, (int)paramLong);
      this.brV.write(paramb.bsd);
      paramb = this.brV;
      paramInt = paramString.length();
      paramb.write(paramString.getBytes(Charset.forName("UTF-8")), 0, paramInt);
      return;
    }
    catch (Throwable paramb)
    {
      throw new RuntimeException(paramb);
    }
  }
  
  public final void a(String paramString, int paramInt, long paramLong)
  {
    try
    {
      this.brK = paramInt;
      OutputStream localOutputStream = this.brV;
      localOutputStream.write(paramString.getBytes(Charset.forName("UTF-8")));
      localOutputStream.write(0);
      com.tencent.matrix.resource.c.b.a.c(this.brV, paramInt);
      com.tencent.matrix.resource.c.b.a.a(this.brV, paramLong);
      return;
    }
    catch (Throwable paramString)
    {
      throw new RuntimeException(paramString);
    }
  }
  
  public final void tz()
  {
    try
    {
      this.brV.flush();
      return;
    }
    catch (Throwable localThrowable)
    {
      throw new RuntimeException(localThrowable);
    }
  }
  
  private final class a
    extends b
  {
    private final int brX;
    private final long brY;
    private final int mTag;
    
    a(int paramInt1, int paramInt2, long paramLong)
    {
      super();
      this.mTag = paramInt1;
      this.brX = paramInt2;
      this.brY = paramLong;
    }
    
    public final void a(int paramInt, com.tencent.matrix.resource.c.a.b paramb)
    {
      try
      {
        e.this.brW.write(254);
        com.tencent.matrix.resource.c.b.a.c(e.this.brW, paramInt);
        e.this.brW.write(paramb.bsd);
        return;
      }
      catch (Throwable paramb)
      {
        throw new RuntimeException(paramb);
      }
    }
    
    public final void a(int paramInt1, com.tencent.matrix.resource.c.a.b paramb, int paramInt2, int paramInt3, int paramInt4, byte[] paramArrayOfByte)
    {
      try
      {
        e.this.brW.write(paramInt1);
        e.this.brW.write(paramb.bsd);
        com.tencent.matrix.resource.c.b.a.c(e.this.brW, paramInt2);
        com.tencent.matrix.resource.c.b.a.c(e.this.brW, paramInt3);
        e.this.brW.write(paramInt4);
        paramInt1 = c.en(paramInt4).getSize(e.this.brK);
        e.this.brW.write(paramArrayOfByte, 0, paramInt1 * paramInt3);
        return;
      }
      catch (Throwable paramb)
      {
        throw new RuntimeException(paramb);
      }
    }
    
    public final void a(com.tencent.matrix.resource.c.a.b paramb, int paramInt)
    {
      try
      {
        e.this.brW.write(4);
        e.this.brW.write(paramb.bsd);
        com.tencent.matrix.resource.c.b.a.c(e.this.brW, paramInt);
        return;
      }
      catch (Throwable paramb)
      {
        throw new RuntimeException(paramb);
      }
    }
    
    public final void a(com.tencent.matrix.resource.c.a.b paramb, int paramInt1, int paramInt2)
    {
      try
      {
        e.this.brW.write(2);
        e.this.brW.write(paramb.bsd);
        com.tencent.matrix.resource.c.b.a.c(e.this.brW, paramInt1);
        com.tencent.matrix.resource.c.b.a.c(e.this.brW, paramInt2);
        return;
      }
      catch (Throwable paramb)
      {
        throw new RuntimeException(paramb);
      }
    }
    
    public final void a(com.tencent.matrix.resource.c.a.b paramb1, int paramInt1, int paramInt2, com.tencent.matrix.resource.c.a.b paramb2, byte[] paramArrayOfByte)
    {
      try
      {
        e.this.brW.write(34);
        e.this.brW.write(paramb1.bsd);
        com.tencent.matrix.resource.c.b.a.c(e.this.brW, paramInt1);
        com.tencent.matrix.resource.c.b.a.c(e.this.brW, paramInt2);
        e.this.brW.write(paramb2.bsd);
        paramInt1 = e.this.brK;
        e.this.brW.write(paramArrayOfByte, 0, paramInt1 * paramInt2);
        return;
      }
      catch (Throwable paramb1)
      {
        throw new RuntimeException(paramb1);
      }
    }
    
    public final void a(com.tencent.matrix.resource.c.a.b paramb1, int paramInt1, com.tencent.matrix.resource.c.a.b paramb2, com.tencent.matrix.resource.c.a.b paramb3, int paramInt2, com.tencent.matrix.resource.c.a.a[] paramArrayOfa1, com.tencent.matrix.resource.c.a.a[] paramArrayOfa2)
    {
      try
      {
        e.this.brW.write(32);
        e.this.brW.write(paramb1.bsd);
        com.tencent.matrix.resource.c.b.a.c(e.this.brW, paramInt1);
        e.this.brW.write(paramb2.bsd);
        e.this.brW.write(paramb3.bsd);
        com.tencent.matrix.resource.c.b.a.b(e.this.brW, e.this.brK << 2);
        com.tencent.matrix.resource.c.b.a.c(e.this.brW, paramInt2);
        com.tencent.matrix.resource.c.b.a.b(e.this.brW, 0);
        com.tencent.matrix.resource.c.b.a.b(e.this.brW, paramArrayOfa1.length);
        int i = paramArrayOfa1.length;
        paramInt1 = 0;
        if (paramInt1 >= i) {
          break label539;
        }
        paramb2 = paramArrayOfa1[paramInt1];
        com.tencent.matrix.resource.c.b.a.a(e.this.brW, paramb2.bsb);
        e.this.brW.write(paramb2.bsa);
        paramb1 = e.this.brW;
        paramb2 = paramb2.bsc;
        if (paramb2 == null) {
          throw new IllegalArgumentException("value is null.");
        }
      }
      catch (Throwable paramb1)
      {
        throw new RuntimeException(paramb1);
      }
      if ((paramb2 instanceof com.tencent.matrix.resource.c.a.b)) {
        com.tencent.matrix.resource.c.b.a.a(paramb1, (com.tencent.matrix.resource.c.a.b)paramb2);
      } else if (((paramb2 instanceof Boolean)) || (Boolean.TYPE.isAssignableFrom(paramb2.getClass()))) {
        if (!((Boolean)paramb2).booleanValue()) {
          break label613;
        }
      }
      label539:
      label606:
      label613:
      for (paramInt2 = 1;; paramInt2 = 0)
      {
        paramb1.write(paramInt2);
        break label606;
        if (((paramb2 instanceof Character)) || (Character.TYPE.isAssignableFrom(paramb2.getClass())))
        {
          com.tencent.matrix.resource.c.b.a.b(paramb1, ((Character)paramb2).charValue());
        }
        else if (((paramb2 instanceof Float)) || (Float.TYPE.isAssignableFrom(paramb2.getClass())))
        {
          com.tencent.matrix.resource.c.b.a.c(paramb1, Float.floatToRawIntBits(((Float)paramb2).floatValue()));
        }
        else if (((paramb2 instanceof Double)) || (Double.TYPE.isAssignableFrom(paramb2.getClass())))
        {
          com.tencent.matrix.resource.c.b.a.a(paramb1, Double.doubleToRawLongBits(((Double)paramb2).doubleValue()));
        }
        else if (((paramb2 instanceof Byte)) || (Byte.TYPE.isAssignableFrom(paramb2.getClass())))
        {
          paramb1.write(((Byte)paramb2).byteValue());
        }
        else if (((paramb2 instanceof Short)) || (Short.TYPE.isAssignableFrom(paramb2.getClass())))
        {
          com.tencent.matrix.resource.c.b.a.b(paramb1, ((Short)paramb2).shortValue());
        }
        else if (((paramb2 instanceof Integer)) || (Integer.TYPE.isAssignableFrom(paramb2.getClass())))
        {
          com.tencent.matrix.resource.c.b.a.c(paramb1, ((Integer)paramb2).intValue());
        }
        else if (((paramb2 instanceof Long)) || (Long.TYPE.isAssignableFrom(paramb2.getClass())))
        {
          com.tencent.matrix.resource.c.b.a.a(paramb1, ((Long)paramb2).longValue());
        }
        else
        {
          throw new IllegalArgumentException("bad value type: " + paramb2.getClass().getName());
          com.tencent.matrix.resource.c.b.a.b(e.this.brW, paramArrayOfa2.length);
          paramInt2 = paramArrayOfa2.length;
          paramInt1 = 0;
          while (paramInt1 < paramInt2)
          {
            paramb1 = paramArrayOfa2[paramInt1];
            com.tencent.matrix.resource.c.b.a.a(e.this.brW, paramb1.bsb);
            e.this.brW.write(paramb1.bsa);
            paramInt1 += 1;
          }
          return;
        }
        paramInt1 += 1;
        break;
      }
    }
    
    public final void a(com.tencent.matrix.resource.c.a.b paramb1, int paramInt, com.tencent.matrix.resource.c.a.b paramb2, byte[] paramArrayOfByte)
    {
      try
      {
        e.this.brW.write(33);
        e.this.brW.write(paramb1.bsd);
        com.tencent.matrix.resource.c.b.a.c(e.this.brW, paramInt);
        e.this.brW.write(paramb2.bsd);
        com.tencent.matrix.resource.c.b.a.c(e.this.brW, paramArrayOfByte.length);
        e.this.brW.write(paramArrayOfByte);
        return;
      }
      catch (Throwable paramb1)
      {
        throw new RuntimeException(paramb1);
      }
    }
    
    public final void b(int paramInt, com.tencent.matrix.resource.c.a.b paramb)
    {
      try
      {
        e.this.brW.write(paramInt);
        e.this.brW.write(paramb.bsd);
        if (paramInt == 1) {
          com.tencent.matrix.resource.c.b.a.b(e.this.brW, e.this.brK);
        }
        return;
      }
      catch (Throwable paramb)
      {
        throw new RuntimeException(paramb);
      }
    }
    
    public final void b(com.tencent.matrix.resource.c.a.b paramb, int paramInt)
    {
      try
      {
        e.this.brW.write(6);
        e.this.brW.write(paramb.bsd);
        com.tencent.matrix.resource.c.b.a.c(e.this.brW, paramInt);
        return;
      }
      catch (Throwable paramb)
      {
        throw new RuntimeException(paramb);
      }
    }
    
    public final void b(com.tencent.matrix.resource.c.a.b paramb, int paramInt1, int paramInt2)
    {
      try
      {
        e.this.brW.write(3);
        e.this.brW.write(paramb.bsd);
        com.tencent.matrix.resource.c.b.a.c(e.this.brW, paramInt1);
        com.tencent.matrix.resource.c.b.a.c(e.this.brW, paramInt2);
        return;
      }
      catch (Throwable paramb)
      {
        throw new RuntimeException(paramb);
      }
    }
    
    public final void c(com.tencent.matrix.resource.c.a.b paramb, int paramInt1, int paramInt2)
    {
      try
      {
        e.this.brW.write(8);
        e.this.brW.write(paramb.bsd);
        com.tencent.matrix.resource.c.b.a.c(e.this.brW, paramInt1);
        com.tencent.matrix.resource.c.b.a.c(e.this.brW, paramInt2);
        return;
      }
      catch (Throwable paramb)
      {
        throw new RuntimeException(paramb);
      }
    }
    
    public final void d(com.tencent.matrix.resource.c.a.b paramb, int paramInt1, int paramInt2)
    {
      try
      {
        e.this.brW.write(142);
        e.this.brW.write(paramb.bsd);
        com.tencent.matrix.resource.c.b.a.c(e.this.brW, paramInt1);
        com.tencent.matrix.resource.c.b.a.c(e.this.brW, paramInt2);
        return;
      }
      catch (Throwable paramb)
      {
        throw new RuntimeException(paramb);
      }
    }
    
    public final void tz()
    {
      try
      {
        e.this.brV.write(this.mTag);
        com.tencent.matrix.resource.c.b.a.c(e.this.brV, this.brX);
        com.tencent.matrix.resource.c.b.a.c(e.this.brV, e.this.brW.size());
        e.this.brV.write(e.this.brW.toByteArray());
        e.this.brW.reset();
        return;
      }
      catch (Throwable localThrowable)
      {
        throw new RuntimeException(localThrowable);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/resource/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */