package com.tencent.mm.plugin.luckymoney.ui;

import android.widget.TextView;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.LinkedList;
import java.util.List;

public final class a
{
  private List<b> kVu = new LinkedList();
  private boolean kVv = false;
  private boolean kVw = false;
  private TextView kVx;
  
  public final void a(b paramb)
  {
    if (paramb == null) {
      return;
    }
    this.kVu.add(paramb);
  }
  
  public final boolean bbv()
  {
    this.kVw = false;
    this.kVv = false;
    int i = 0;
    if (i < this.kVu.size())
    {
      Object localObject = (b)this.kVu.get(i);
      int j = ((b)localObject).baC();
      if (j != 0)
      {
        ((b)localObject).onError();
        localObject = ((b)localObject).rV(j);
        if ((this.kVx != null) && (!bi.oW((String)localObject)))
        {
          if (!this.kVv) {
            this.kVx.setText((CharSequence)localObject);
          }
          this.kVx.setVisibility(0);
          this.kVv = true;
        }
        this.kVw = true;
      }
      for (;;)
      {
        i += 1;
        break;
        ((b)localObject).restore();
      }
    }
    if ((!this.kVw) && (this.kVx != null))
    {
      this.kVx.setVisibility(8);
      this.kVv = false;
    }
    return this.kVw;
  }
  
  public final boolean bbw()
  {
    boolean bool2 = false;
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < this.kVu.size())
      {
        if (((b)this.kVu.get(i)).baC() != 0) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
  
  public final void clear()
  {
    this.kVu.clear();
    this.kVx = null;
  }
  
  public final void f(TextView paramTextView)
  {
    if (paramTextView != null) {
      this.kVx = paramTextView;
    }
  }
  
  public final void tn(String paramString)
  {
    if ((this.kVx != null) && (!bi.oW(paramString)))
    {
      this.kVx.setText(paramString);
      this.kVx.setVisibility(0);
      this.kVv = true;
    }
    while (this.kVx == null) {
      return;
    }
    this.kVx.setVisibility(8);
    this.kVv = false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */