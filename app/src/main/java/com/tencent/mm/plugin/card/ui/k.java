package com.tencent.mm.plugin.card.ui;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.ui.view.aa;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;

public final class k
  extends c
{
  private final String TAG = "MicroMsg.CardTicketAdapter";
  private int count = 0;
  private int hBp;
  private final String hGC = "PRIVATE_TICKET_TITLE";
  private final String hGD = "PRIVATE_INVOICE_TITLE";
  private ArrayList<CardInfo> hGE;
  private ArrayList<CardInfo> hGF;
  private ArrayList<CardInfo> hGG;
  private com.tencent.mm.plugin.card.base.c hzI;
  
  public k(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
    this.hBp = paramInt;
    this.hzI = new aa(paramContext, this);
    this.hGE = new ArrayList();
    this.hGF = new ArrayList();
    this.hGG = new ArrayList();
  }
  
  private void ayZ()
  {
    this.hGE.clear();
    this.hGF.clear();
    this.hGG.clear();
    int i = 0;
    CardInfo localCardInfo;
    if (i < this.count)
    {
      localCardInfo = (CardInfo)super.getItem(i);
      if (localCardInfo != null)
      {
        if (!localCardInfo.avX()) {
          break label67;
        }
        this.hGG.add(localCardInfo);
      }
      for (;;)
      {
        i += 1;
        break;
        label67:
        this.hGF.add(localCardInfo);
      }
    }
    if (!this.hGF.isEmpty())
    {
      localCardInfo = new CardInfo();
      localCardInfo.field_card_id = "PRIVATE_TICKET_TITLE";
      this.hGE.add(localCardInfo);
      this.hGE.addAll(this.hGF);
    }
    if (!this.hGG.isEmpty())
    {
      localCardInfo = new CardInfo();
      localCardInfo.field_card_id = "PRIVATE_INVOICE_TITLE";
      this.hGE.add(localCardInfo);
      this.hGE.addAll(this.hGG);
    }
    this.count = this.hGE.size();
  }
  
  private CardInfo nQ(int paramInt)
  {
    return (CardInfo)this.hGE.get(paramInt);
  }
  
  protected final void WS()
  {
    aYc();
    WT();
  }
  
  public final void WT()
  {
    x.v("MicroMsg.CardTicketAdapter", "resetCursor");
    Cursor localCursor = am.axi().nH(this.hBp);
    if (localCursor != null)
    {
      this.count = localCursor.getCount();
      x.v("MicroMsg.CardTicketAdapter", "card count:" + this.count);
    }
    setCursor(localCursor);
    ayZ();
    notifyDataSetChanged();
  }
  
  public final int getCount()
  {
    if (this.hGE.isEmpty()) {
      return super.getCount();
    }
    return this.hGE.size();
  }
  
  public final int getItemViewType(int paramInt)
  {
    CardInfo localCardInfo = nQ(paramInt);
    if ((localCardInfo.field_card_id.equals("PRIVATE_TICKET_TITLE")) || (localCardInfo.field_card_id.equals("PRIVATE_INVOICE_TITLE"))) {
      return 0;
    }
    if (localCardInfo.avX()) {
      return 2;
    }
    return 1;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramViewGroup = nQ(paramInt);
    return this.hzI.a(paramInt, paramView, paramViewGroup);
  }
  
  public final int getViewTypeCount()
  {
    return 3;
  }
  
  public final void release()
  {
    aYc();
    this.hzI.release();
    this.hzI = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/card/ui/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */