package f.a.a.a;

import java.util.LinkedList;

public final class a
{
  private final f.a.a.a.a.b unknownTagHandler;
  public final f.a.a.b.a.a vHC;
  public int vHD = 0;
  
  public a(byte[] paramArrayOfByte, f.a.a.a.a.b paramb)
  {
    this.vHC = new f.a.a.b.a.a(paramArrayOfByte, paramArrayOfByte.length);
    this.unknownTagHandler = paramb;
  }
  
  public final LinkedList<byte[]> IC(int paramInt)
  {
    return this.vHC.IC(paramInt);
  }
  
  public final int cJN()
  {
    return this.vHC.rY();
  }
  
  public final LinkedList<Integer> cJO()
  {
    f.a.a.b.a.a locala = this.vHC;
    LinkedList localLinkedList = new LinkedList();
    for (;;)
    {
      if (locala.bfI >= locala.bufferSize) {
        return localLinkedList;
      }
      localLinkedList.add(Integer.valueOf(locala.rY()));
    }
  }
  
  public final String cJP()
  {
    return this.vHC.readString();
  }
  
  public final boolean cJQ()
  {
    return this.vHC.rY() != 0;
  }
  
  public final com.tencent.mm.bk.b cJR()
  {
    f.a.a.b.a.a locala = this.vHC;
    int i = locala.rY();
    if ((i < locala.bufferSize - locala.bfI) && (i > 0))
    {
      com.tencent.mm.bk.b localb = com.tencent.mm.bk.b.t(locala.buffer, locala.bfI, i);
      locala.bfI = (i + locala.bfI);
      return localb;
    }
    return com.tencent.mm.bk.b.bi(locala.dY(i));
  }
  
  public final void cJS()
  {
    int i = f.a.a.b.a.ef(this.vHD);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("FieldNumber: ").append(f.a.a.b.a.eg(this.vHD)).append(" - ");
    switch (i)
    {
    case 3: 
    case 4: 
    default: 
      return;
    case 5: 
      localStringBuffer.append("float value: ").append(Float.toString(this.vHC.readFloat()));
      return;
    case 1: 
      localStringBuffer.append("double value: ").append(Double.toString(this.vHC.readDouble()));
      return;
    case 2: 
      localStringBuffer.append("Length delimited (String or ByteString) value: ").append(this.vHC.readString());
      return;
    }
    localStringBuffer.append("varint (long, int or boolean) value: ").append(this.vHC.rZ());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/f/a/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */