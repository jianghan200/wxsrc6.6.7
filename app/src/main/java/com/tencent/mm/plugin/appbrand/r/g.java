package com.tencent.mm.plugin.appbrand.r;

public final class g
{
  private long gBH;
  private long gBI;
  private a gBJ;
  
  public g() {}
  
  public g(long paramLong, a parama)
  {
    this.gBH = paramLong;
    this.gBJ = parama;
  }
  
  public final boolean k(Object... paramVarArgs)
  {
    boolean bool1 = false;
    int i;
    if (System.currentTimeMillis() - this.gBI < this.gBH)
    {
      i = 1;
      if (i == 0) {
        break label31;
      }
    }
    label31:
    boolean bool2;
    do
    {
      do
      {
        return bool1;
        i = 0;
        break;
      } while (this.gBJ == null);
      bool2 = this.gBJ.i(paramVarArgs);
      bool1 = bool2;
    } while (!bool2);
    this.gBI = System.currentTimeMillis();
    return bool2;
  }
  
  public static abstract interface a
  {
    public abstract boolean i(Object... paramVarArgs);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/r/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */