package com.tencent.mm.plugin.card.ui.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.tencent.mm.plugin.card.a.c;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.ui.a.g;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.c.kx;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.protocal.c.pr;
import com.tencent.mm.ui.y;
import java.util.Iterator;
import java.util.LinkedList;

public final class w
  extends i
{
  private View hIb;
  private View hIc;
  
  public final void azI()
  {
    if (this.hIb != null) {
      this.hIb.setVisibility(8);
    }
    if (this.hIc != null) {
      this.hIc.setVisibility(8);
    }
  }
  
  public final void initView() {}
  
  public final void update()
  {
    b localb = this.hHF.ayu();
    g localg = this.hHF.ayz();
    Object localObject1;
    Object localObject2;
    Object localObject3;
    int i;
    if ((localb.awn().rnd != null) && (localb.awn().rnd.size() > 1))
    {
      if (this.hIb == null) {
        this.hIb = ((ViewStub)findViewById(a.d.card_secondary_field_stub)).inflate();
      }
      if (this.hIc != null) {
        this.hIc.setVisibility(8);
      }
      localObject1 = this.hHF.ayx();
      localObject2 = this.hIb;
      localObject3 = this.hHF.ayy();
      LinkedList localLinkedList = localb.awn().rnd;
      int j = l.xV(localb.awm().dxh);
      ((ViewGroup)localObject2).removeAllViews();
      Iterator localIterator = localLinkedList.iterator();
      label360:
      while (localIterator.hasNext())
      {
        Object localObject4 = (pr)localIterator.next();
        View localView = y.gq((Context)localObject1).inflate(a.e.card_secondary_field_layout_item, (ViewGroup)localObject2, false);
        localView.setId(a.d.card_secondary_field_view);
        localView.setTag(Integer.valueOf(localLinkedList.indexOf(localObject4)));
        localView.setOnClickListener((View.OnClickListener)localObject3);
        if (TextUtils.isEmpty(((pr)localObject4).url)) {
          localView.setEnabled(false);
        }
        ((TextView)localView.findViewById(a.d.secondary_field_title)).setText(((pr)localObject4).title);
        TextView localTextView = (TextView)localView.findViewById(a.d.secondary_field_subtitle);
        localTextView.setText(((pr)localObject4).huX);
        localTextView.setTextColor(j);
        ((ViewGroup)localObject2).addView(localView);
        if (localLinkedList.indexOf(localObject4) + 1 != localLinkedList.size()) {}
        for (i = 1;; i = 0)
        {
          if (i == 0) {
            break label360;
          }
          localObject4 = y.gq((Context)localObject1).inflate(a.e.card_secondary_field_layout_item_seperator, (ViewGroup)localObject2, false);
          ((ViewGroup)localObject2).addView((View)localObject4);
          break;
        }
      }
      if ((localb.avT()) && (localb.awn().rnk != null) && (!TextUtils.isEmpty(localb.awn().rnk.title))) {
        this.hIb.setBackgroundResource(a.c.mm_trans);
      }
      if ((!localb.avT()) && (localg.azv())) {
        this.hIb.setBackgroundResource(a.c.mm_trans);
      }
    }
    do
    {
      do
      {
        return;
        if ((localb.awn().rnd == null) || (localb.awn().rnd.size() != 1)) {
          break;
        }
        if (this.hIc == null) {
          this.hIc = ((ViewStub)findViewById(a.d.card_secondary_field_single_stub)).inflate();
        }
        if (this.hIb != null) {
          this.hIb.setVisibility(8);
        }
        localObject1 = this.hIc;
        localObject2 = this.hHF.ayy();
        localObject3 = localb.awn().rnd;
        if (((LinkedList)localObject3).size() == 1)
        {
          ((View)localObject1).findViewById(a.d.card_secondary_field_view_1).setVisibility(0);
          localObject3 = (pr)((LinkedList)localObject3).get(0);
          ((TextView)((View)localObject1).findViewById(a.d.secondary_field_title_1)).setText(((pr)localObject3).title);
          ((TextView)((View)localObject1).findViewById(a.d.secondary_field_subtitle_1)).setText(((pr)localObject3).huX);
          i = l.xV(localb.awm().dxh);
          ((TextView)((View)localObject1).findViewById(a.d.secondary_field_subtitle_1)).setTextColor(i);
          ((View)localObject1).findViewById(a.d.card_secondary_field_view_1).setOnClickListener((View.OnClickListener)localObject2);
          if (TextUtils.isEmpty(((pr)localObject3).url)) {
            ((View)localObject1).findViewById(a.d.card_secondary_field_view_1).setEnabled(false);
          }
        }
        if ((localb.avT()) && (localb.awn().rnk != null) && (!TextUtils.isEmpty(localb.awn().rnk.title))) {
          this.hIc.setBackgroundResource(a.c.mm_trans);
        }
      } while ((localb.avT()) || (!localg.azv()));
      this.hIc.setBackgroundResource(a.c.mm_trans);
      return;
      if (this.hIb != null) {
        this.hIb.setVisibility(8);
      }
    } while (this.hIc == null);
    this.hIc.setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */