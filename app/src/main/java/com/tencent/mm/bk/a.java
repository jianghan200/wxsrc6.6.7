package com.tencent.mm.bk;

import java.io.OutputStream;

public class a
{
  protected static final int OPCODE_COMPUTESIZE = 1;
  protected static final int OPCODE_PARSEFROM = 2;
  protected static final int OPCODE_POPULATEBUILDERWITHFIELD = 3;
  protected static final int OPCODE_WRITEFIELDS = 0;
  public static f.a.a.a.a.b unknownTagHandler = new f.a.a.a.a.a();
  
  public static int a(f.a.a.a.a parama)
  {
    int i = 0;
    f.a.a.b.a.a locala = parama.vHC;
    if ((locala.bfI == locala.bufferSize) && (!locala.nb(false))) {
      locala.bfJ = 0;
    }
    for (;;)
    {
      parama.vHD = i;
      return f.a.a.b.a.eg(parama.vHD);
      locala.bfJ = locala.rY();
      if (locala.bfJ == 0) {
        throw f.a.a.b.a.b.cJW();
      }
      i = locala.bfJ;
    }
  }
  
  public int a(int paramInt, Object... paramVarArgs)
  {
    throw new Error("Cannot use this method");
  }
  
  public void a(f.a.a.c.a parama)
  {
    a(0, new Object[] { parama });
  }
  
  public boolean a(f.a.a.a.a parama, a parama1, int paramInt)
  {
    return a(3, new Object[] { parama, parama1, Integer.valueOf(paramInt) }) == 0;
  }
  
  public a aG(byte[] paramArrayOfByte)
  {
    a(2, new Object[] { paramArrayOfByte });
    return this;
  }
  
  public int boi()
  {
    try
    {
      int i = a(1, new Object[0]);
      return i;
    }
    catch (Exception localException) {}
    return 0;
  }
  
  public a boj()
  {
    return this;
  }
  
  public byte[] toByteArray()
  {
    boj();
    byte[] arrayOfByte = new byte[boi()];
    f.a.a.c.a locala = new f.a.a.c.a(arrayOfByte);
    a(locala);
    if (locala.dHY != null)
    {
      locala.dHY.write(locala.vHI);
      locala.dHY.flush();
    }
    return arrayOfByte;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/bk/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */