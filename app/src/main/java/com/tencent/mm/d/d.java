package com.tencent.mm.d;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.MotionEvent;

public final class d
  extends b
{
  private float VT;
  private float VU;
  private boolean bBR = false;
  private float bBS;
  private float bBT;
  private float bCo;
  private boolean bCp = true;
  private Path ks = new Path();
  public int pN = com.tencent.mm.view.footer.a.uUQ[2];
  
  public final void onDraw(Canvas paramCanvas)
  {
    paramCanvas.save();
    paramCanvas.clipRect(this.bBp);
    b(paramCanvas);
    if (!this.ks.isEmpty()) {
      new com.tencent.mm.t.b(this.ks, this.bCo / this.bBn.getInitScale() / this.bBn.getCurScale(), this.pN).draw(paramCanvas);
    }
    paramCanvas.restore();
  }
  
  public final boolean q(MotionEvent paramMotionEvent)
  {
    if (!vM()) {
      return false;
    }
    float[] arrayOfFloat = w(paramMotionEvent.getX(), paramMotionEvent.getY());
    switch (paramMotionEvent.getActionMasked())
    {
    }
    for (;;)
    {
      return this.bCp;
      if (this.bBp.contains((int)arrayOfFloat[0], (int)arrayOfFloat[1]))
      {
        float f = arrayOfFloat[0];
        this.bBS = f;
        this.VT = f;
        f = arrayOfFloat[1];
        this.bBT = f;
        this.VU = f;
      }
      for (this.bCp = true;; this.bCp = false)
      {
        this.bBR = false;
        break;
      }
      if ((this.bCp) && (this.bBR))
      {
        vG().add(new com.tencent.mm.t.b(new Path(this.ks), this.bCo / this.bBn.getInitScale() / this.bBn.getCurScale(), this.pN));
        aH(false);
      }
      vP();
      this.ks.reset();
      this.bBR = false;
      this.bCp = false;
      continue;
      if ((this.bCp) && (this.bBR))
      {
        this.bBS = this.VT;
        this.bBT = this.VU;
        this.VT = arrayOfFloat[0];
        this.VU = arrayOfFloat[1];
        this.ks.quadTo(this.bBS, this.bBT, (this.VT + this.bBS) / 2.0F, (this.VU + this.bBT) / 2.0F);
        vO();
      }
      else if ((this.bCp) && (!this.bBR))
      {
        this.ks.moveTo(arrayOfFloat[0], arrayOfFloat[1]);
        this.bBR = true;
      }
    }
  }
  
  public final a vE()
  {
    return a.bBh;
  }
  
  public final void vF()
  {
    aH(true);
  }
  
  public final void vH()
  {
    super.vH();
    this.bCo = this.bBn.getInitScale();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */