package com.tencent.mm.ui.tools.a;

import android.text.InputFilter;
import android.widget.EditText;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.tools.g;
import com.tencent.mm.ui.tools.g.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class c
  extends a
{
  private String gEw;
  public int gHz;
  public boolean uCR = true;
  public WeakReference<EditText> uCS;
  private int uCT;
  private int uCU;
  private ArrayList<InputFilter> uCV;
  public a uCW;
  
  public c(WeakReference<EditText> paramWeakReference)
  {
    this.uCS = paramWeakReference;
    this.gHz = g.a.uzZ;
    this.uCR = false;
  }
  
  public static c d(EditText paramEditText)
  {
    return new c(new WeakReference(paramEditText));
  }
  
  public final c Gi(int paramInt)
  {
    this.uCU = 0;
    this.uCT = paramInt;
    return this;
  }
  
  public final void a(a parama)
  {
    this.uCW = parama;
    cfb();
  }
  
  protected final int afr()
  {
    if (bi.oW(this.gEw))
    {
      if (this.uCS == null) {
        return 1;
      }
      this.gEw = ((EditText)this.uCS.get()).getText().toString().trim();
    }
    int j = g.du(this.gEw, this.gHz);
    if (j < 0) {}
    for (int i = 1; i != 0; i = 0)
    {
      x.w("MicroMsg.InputTextBoundaryCheck", "you are crazy =.=!that is 2 GB character!");
      return 2;
    }
    if (j < this.uCU) {
      return 1;
    }
    if (j > this.uCT) {
      return 2;
    }
    return 0;
  }
  
  public g bY(int paramInt1, int paramInt2)
  {
    return new g(paramInt1, paramInt2);
  }
  
  protected final void cfb()
  {
    Object localObject;
    if (!this.uCR)
    {
      if (this.uCS == null)
      {
        x.w("MicroMsg.InputTextBoundaryCheck", "edit text view is null");
        return;
      }
      if (!bi.cX(this.uCV)) {
        break label119;
      }
      localObject = bY(this.uCT, this.gHz);
      ((EditText)this.uCS.get()).setFilters(new InputFilter[] { localObject });
    }
    while (this.uCW != null) {
      switch (afr())
      {
      default: 
        return;
      case 0: 
        this.uCW.pO(this.gEw);
        return;
        label119:
        this.uCV.add(bY(this.uCT, this.gHz));
        localObject = (InputFilter[])this.uCV.toArray(new InputFilter[this.uCV.size()]);
        ((EditText)this.uCS.get()).setFilters((InputFilter[])localObject);
      }
    }
    this.uCW.YX();
    return;
    this.uCW.YY();
  }
  
  public final c fj(int paramInt1, int paramInt2)
  {
    this.uCU = paramInt1;
    this.uCT = paramInt2;
    return this;
  }
  
  public static abstract interface a
  {
    public abstract void YX();
    
    public abstract void YY();
    
    public abstract void pO(String paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/tools/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */