package com.tencent.mm.plugin.card.ui.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.c.kx;
import com.tencent.mm.protocal.c.pr;
import com.tencent.mm.protocal.c.se;
import com.tencent.mm.ui.MMActivity;
import java.util.LinkedList;

public final class l
  extends i
{
  View hHH;
  LinearLayout hHI;
  boolean hHJ = false;
  
  public final void azI()
  {
    if (this.hHH != null) {
      this.hHH.setVisibility(8);
    }
  }
  
  public final void initView() {}
  
  public final void update()
  {
    if (this.hHH == null) {
      this.hHH = ((ViewStub)findViewById(a.d.card_detail_table_stub)).inflate();
    }
    Object localObject = this.hHF.ayu().awn().rnm;
    ((TextView)this.hHH.findViewById(a.d.detail_table_title)).setText(((se)localObject).title);
    LinkedList localLinkedList;
    LayoutInflater localLayoutInflater;
    if ((((se)localObject).rvC != null) && (((se)localObject).rvC.size() > 0))
    {
      this.hHI = ((LinearLayout)this.hHH.findViewById(a.d.detail_table_rows_view));
      this.hHI.removeAllViews();
      localLinkedList = ((se)localObject).rvC;
      localLayoutInflater = (LayoutInflater)this.hHF.ayx().getSystemService("layout_inflater");
      if ((((se)localObject).rvB >= localLinkedList.size()) || (this.hHJ))
      {
        this.hHH.findViewById(a.d.detail_table_expand_tv).setVisibility(8);
        i = 0;
        while (i < localLinkedList.size())
        {
          localObject = (TextView)localLayoutInflater.inflate(a.e.card_table_row_item, null, false);
          ((TextView)localObject).setText(((pr)localLinkedList.get(i)).title);
          this.hHI.addView((View)localObject);
          i += 1;
        }
        this.hHI.invalidate();
      }
    }
    else
    {
      return;
    }
    int i = 0;
    while (i < ((se)localObject).rvB)
    {
      TextView localTextView = (TextView)localLayoutInflater.inflate(a.e.card_table_row_item, null, false);
      localTextView.setText(((pr)localLinkedList.get(i)).title);
      this.hHI.addView(localTextView);
      i += 1;
    }
    this.hHI.invalidate();
    this.hHH.findViewById(a.d.detail_table_expand_tv).setVisibility(0);
    this.hHH.findViewById(a.d.detail_table_expand_tv).setOnClickListener(new l.1(this, (se)localObject, localLinkedList, localLayoutInflater));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */