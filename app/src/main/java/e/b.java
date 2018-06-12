package e;

import com.tencent.tencentmap.mapsdk.a.md;
import com.tencent.tencentmap.mapsdk.a.me;
import com.tencent.tencentmap.mapsdk.a.mf;

public final class b
  extends mf
{
  static byte[] a;
  public byte[] atn = null;
  
  static
  {
    byte[] arrayOfByte = (byte[])new byte[1];
    a = arrayOfByte;
    ((byte[])arrayOfByte)[0] = 0;
  }
  
  public final void readFrom(md parammd)
  {
    this.atn = ((byte[])parammd.a(a, 0, true));
  }
  
  public final void writeTo(me paramme)
  {
    paramme.a(this.atn, 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */