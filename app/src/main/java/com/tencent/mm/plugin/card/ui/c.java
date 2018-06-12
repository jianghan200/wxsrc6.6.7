package com.tencent.mm.plugin.card.ui;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.r;

public class c
  extends r<CardInfo>
{
  private final String TAG = "MicroMsg.CardAdapter";
  private int count = 0;
  private int hBp;
  private com.tencent.mm.plugin.card.base.c hzI;
  
  public c(Context paramContext, int paramInt)
  {
    super(paramContext, new CardInfo());
    this.hBp = paramInt;
    lB(true);
    this.hzI = new l(paramContext, this);
  }
  
  protected void WS()
  {
    aYc();
    WT();
  }
  
  public void WT()
  {
    x.v("MicroMsg.CardAdapter", "resetCursor");
    Cursor localCursor = am.axi().nH(this.hBp);
    if (localCursor != null)
    {
      this.count = localCursor.getCount();
      x.v("MicroMsg.CardAdapter", "card count:" + this.count);
    }
    setCursor(localCursor);
    notifyDataSetChanged();
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramViewGroup = (CardInfo)getItem(paramInt);
    return this.hzI.a(paramInt, paramView, paramViewGroup);
  }
  
  public void release()
  {
    aYc();
    this.hzI.release();
    this.hzI = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/card/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */