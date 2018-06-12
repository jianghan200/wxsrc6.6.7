package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.plugin.sight.decode.a.a;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.ui.widget.MMPinProgressBtn;

public final class ak
{
  public String bKW;
  public ImageView nEI;
  public TextView nEJ;
  public bsu nRA;
  public View nRB;
  public View nRC;
  public MMPinProgressBtn nRD;
  public TextView nRE;
  public boolean nRF = false;
  public int nRG = 0;
  public a neL;
  public boolean nkG = false;
  public int position;
  
  public final void a(bsu parambsu, int paramInt, String paramString, boolean paramBoolean)
  {
    this.nRA = parambsu;
    this.position = paramInt;
    this.bKW = paramString;
    this.nkG = paramBoolean;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */