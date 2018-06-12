package h.a.c;

public final class a
{
  public short[] vLG;
  public int vLH;
  
  public a(int paramInt)
  {
    this.vLH = paramInt;
    this.vLG = new short[1 << paramInt];
  }
  
  public final int a(b paramb)
  {
    int i = this.vLH;
    int j = 1;
    while (i != 0)
    {
      j = paramb.e(this.vLG, j) + (j << 1);
      i -= 1;
    }
    return j - (1 << this.vLH);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/h/a/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */