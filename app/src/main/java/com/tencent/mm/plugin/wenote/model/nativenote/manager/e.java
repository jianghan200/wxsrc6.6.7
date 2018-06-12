package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.widget.EditText;
import java.io.Serializable;

public class e
  implements Serializable
{
  public int Tw;
  public int tK;
  
  public e(int paramInt1, int paramInt2)
  {
    this.Tw = paramInt1;
    this.tK = paramInt2;
    if (this.Tw > this.tK)
    {
      paramInt1 = this.tK;
      this.tK = this.Tw;
      this.Tw = paramInt1;
    }
  }
  
  public e(EditText paramEditText)
  {
    this(paramEditText.getSelectionStart(), paramEditText.getSelectionEnd());
  }
  
  public final e es(int paramInt1, int paramInt2)
  {
    this.Tw = Math.max(0, this.Tw - paramInt1);
    this.tK += paramInt2;
    return this;
  }
  
  public final boolean isEmpty()
  {
    return this.Tw == this.tK;
  }
  
  public String toString()
  {
    return "[" + this.Tw + ", " + this.tK + "]";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/nativenote/manager/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */