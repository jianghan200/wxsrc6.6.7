package b.d;

import b.a.a;
import java.util.NoSuchElementException;

public final class b
  extends a
{
  private final int fHo;
  private final int vGM;
  private boolean vGN;
  private int vGO;
  
  public b(int paramInt1, int paramInt2, int paramInt3)
  {
    this.fHo = paramInt3;
    this.vGM = paramInt2;
    if (this.fHo > 0) {
      if (paramInt1 <= paramInt2)
      {
        this.vGN = bool;
        if (!this.vGN) {
          break label65;
        }
      }
    }
    for (;;)
    {
      this.vGO = paramInt1;
      return;
      bool = false;
      break;
      if (paramInt1 >= paramInt2) {
        break;
      }
      bool = false;
      break;
      label65:
      paramInt1 = this.vGM;
    }
  }
  
  public final boolean hasNext()
  {
    return this.vGN;
  }
  
  public final int nextInt()
  {
    int i = this.vGO;
    if (i == this.vGM)
    {
      if (!this.vGN) {
        throw ((Throwable)new NoSuchElementException());
      }
      this.vGN = false;
      return i;
    }
    this.vGO += this.fHo;
    return i;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/b/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */