package com.tencent.mm.sdk.platformtools;

public class ba<T>
{
  public Object[] tM;
  public int tN;
  
  public ba(int paramInt)
  {
    if (paramInt <= 0)
    {
      x.e("MicroMsg.SimpleObjectPool", "The max pool size must be > 0");
      return;
    }
    this.tM = new Object[paramInt];
  }
  
  public T bW()
  {
    if (this.tM == null) {}
    while (this.tN <= 0) {
      return null;
    }
    int i = this.tN - 1;
    Object localObject = this.tM[i];
    this.tM[i] = null;
    this.tN -= 1;
    return (T)localObject;
  }
  
  public boolean j(T paramT)
  {
    if (this.tM == null) {}
    label93:
    for (;;)
    {
      return false;
      if (this.tM != null)
      {
        i = 0;
        if (i < this.tN) {
          if (this.tM[i] != paramT) {}
        }
      }
      for (int i = 1;; i = 0)
      {
        if (i != 0) {
          break label93;
        }
        if ((this.tN >= this.tM.length) || (this.tN < 0)) {
          break label95;
        }
        this.tM[this.tN] = paramT;
        this.tN += 1;
        return true;
        i += 1;
        break;
      }
    }
    label95:
    x.e("MicroMsg.SimpleObjectPool", "error index %d %d", new Object[] { Integer.valueOf(this.tN), Integer.valueOf(this.tM.length) });
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/sdk/platformtools/ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */