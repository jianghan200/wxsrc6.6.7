package com.tencent.mm.plugin.exdevice.j;

import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.nio.ByteBuffer;
import junit.framework.Assert;

public final class a
{
  private final int iHH = 1024;
  private ByteBuffer iHI;
  private ByteBuffer iHJ;
  
  public a(int paramInt)
  {
    x.d("MicroMsg.exdevice.AutoBuffer", "******AutoBuffer****** capacity = " + paramInt);
    if (paramInt >= 0)
    {
      bool1 = true;
      Assert.assertTrue(bool1);
      this.iHJ = ByteBuffer.allocate(paramInt);
      this.iHI = this.iHJ.asReadOnlyBuffer();
      if (this.iHJ == null) {
        break label95;
      }
      bool1 = true;
      label72:
      Assert.assertTrue(bool1);
      if (this.iHI == null) {
        break label100;
      }
    }
    label95:
    label100:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      Assert.assertTrue(bool1);
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label72;
    }
  }
  
  public final void M(byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool2 = true;
    Assert.assertTrue(true);
    if (paramInt >= 0)
    {
      bool1 = true;
      Assert.assertTrue(bool1);
      if (paramArrayOfByte.length < 0) {
        break label98;
      }
      bool1 = true;
      label24:
      Assert.assertTrue(bool1);
      if (paramArrayOfByte.length < paramInt + 0) {
        break label103;
      }
      bool1 = true;
      label38:
      Assert.assertTrue(bool1);
      if (this.iHI.remaining() < paramInt) {
        break label108;
      }
    }
    label98:
    label103:
    label108:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      Assert.assertTrue(bool1);
      x.d("MicroMsg.exdevice.AutoBuffer", "readByte dstOffset = 0 byteCount = " + paramInt);
      this.iHI.get(paramArrayOfByte, 0, paramInt);
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label24;
      bool1 = false;
      break label38;
    }
  }
  
  public final void N(byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool2 = true;
    Assert.assertTrue(true);
    if (paramInt >= 0)
    {
      bool1 = true;
      Assert.assertTrue(bool1);
      if (paramArrayOfByte == null) {
        break label177;
      }
    }
    label177:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      Assert.assertTrue(bool1);
      x.d("MicroMsg.exdevice.AutoBuffer", "writeByte srcOffset = 0 byteCount = " + paramInt);
      if (paramInt <= this.iHJ.remaining()) {
        break label183;
      }
      x.d("MicroMsg.exdevice.AutoBuffer", "byteCount > mWriteStream.remaining() Recalloc");
      x.d("MicroMsg.exdevice.AutoBuffer", "getCapacity = " + this.iHJ.capacity());
      ByteBuffer localByteBuffer = ByteBuffer.allocate(this.iHJ.capacity() + paramInt + 1024);
      int i = this.iHI.position();
      localByteBuffer.put(this.iHJ.array());
      localByteBuffer.put(paramArrayOfByte, 0, paramInt);
      this.iHJ = localByteBuffer;
      this.iHI = localByteBuffer.asReadOnlyBuffer();
      this.iHI.position(i);
      return;
      bool1 = false;
      break;
    }
    label183:
    this.iHJ.put(paramArrayOfByte, 0, paramInt);
  }
  
  public final int getSize()
  {
    x.d("MicroMsg.exdevice.AutoBuffer", "size = " + this.iHJ.position());
    return this.iHJ.position();
  }
  
  public final short readShort()
  {
    if (getSize() <= 1) {
      throw new IOException("There is only one byte in array");
    }
    short s = this.iHI.getShort();
    x.d("MicroMsg.exdevice.AutoBuffer", "getShort = " + s);
    return s;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/exdevice/j/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */