package h.a.a;

import java.io.OutputStream;

public final class a
{
  public int vIa;
  public byte[] vKZ;
  public int vLa = 0;
  public int vLb;
  public OutputStream vLc;
  
  public final byte IG(int paramInt)
  {
    int i = this.vIa - paramInt - 1;
    paramInt = i;
    if (i < 0) {
      paramInt = i + this.vLa;
    }
    return this.vKZ[paramInt];
  }
  
  public final void cKG()
  {
    cKH();
    this.vLc = null;
  }
  
  public final void cKH()
  {
    int i = this.vIa - this.vLb;
    if (i == 0) {
      return;
    }
    this.vLc.write(this.vKZ, this.vLb, i);
    if (this.vIa >= this.vLa) {
      this.vIa = 0;
    }
    this.vLb = this.vIa;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/h/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */