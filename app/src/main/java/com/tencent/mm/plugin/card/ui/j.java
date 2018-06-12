package com.tencent.mm.plugin.card.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMVerticalTextView;
import com.tencent.mm.ui.base.o;
import java.util.ArrayList;

public final class j
{
  public Bitmap eZA;
  public o eZB = null;
  public ImageView eZC;
  View eZD;
  View.OnClickListener eZF = new j.1(this);
  MMActivity fcq;
  boolean hCn = true;
  Bitmap hGf = null;
  TextView hGg;
  TextView hGh;
  View hGi;
  ImageView hGj;
  MMVerticalTextView hGk;
  MMVerticalTextView hGl;
  ArrayList<Bitmap> hGm = new ArrayList();
  String hGn = "";
  b htQ;
  public Bitmap hyO;
  float hyW = 0.0F;
  
  public j(MMActivity paramMMActivity)
  {
    this.fcq = paramMMActivity;
  }
  
  private void ah(float paramFloat)
  {
    WindowManager.LayoutParams localLayoutParams = this.fcq.getWindow().getAttributes();
    localLayoutParams.screenBrightness = paramFloat;
    this.fcq.getWindow().setAttributes(localLayoutParams);
  }
  
  public final void ayS()
  {
    if (this.hyW < 0.8F) {
      ah(0.8F);
    }
  }
  
  public final void ayT()
  {
    ah(this.hyW);
  }
  
  final void ayU()
  {
    if (this.hGm.size() > 2)
    {
      int i = this.hGm.size() - 1;
      while (i > 1)
      {
        l.x((Bitmap)this.hGm.remove(i));
        i -= 1;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/card/ui/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */