package com.tencent.tencentmap.mapsdk.a;

public class lr
  implements nj
{
  private lo a;
  
  public lr(lo paramlo)
  {
    this.a = paramlo;
  }
  
  public String a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.a == null) {}
    lo.a locala;
    String str;
    do
    {
      return null;
      locala = this.a.c();
      str = locala.d();
    } while (str == null);
    int j = paramInt2;
    int i = paramInt3;
    if (locala.a().equals("taiwanmap"))
    {
      j = (int)(Math.pow(2.0D, paramInt3) - 1.0D - paramInt2);
      i = paramInt3 - 1;
    }
    return str.replace("{x}", String.valueOf(paramInt1)).replace("{y}", String.valueOf(j)).replace("{z}", String.valueOf(i));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/lr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */