package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.plugin.game.d.ac;
import com.tencent.mm.plugin.game.d.am;
import com.tencent.mm.plugin.game.d.cw;
import com.tencent.mm.plugin.game.e.c;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.f.f;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Iterator;
import java.util.LinkedList;

public class GameFeedQipaiView
  extends LinearLayout
  implements View.OnClickListener
{
  private TextView gsY;
  private TextView jYp;
  private ImageView jYq;
  private LinearLayout jYr;
  private ac jYs;
  
  public GameFeedQipaiView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void onClick(View paramView)
  {
    if (this.jYs == null) {}
    int i;
    do
    {
      do
      {
        do
        {
          return;
          if (paramView.getId() != f.e.more_etc_tv) {
            break;
          }
        } while (bi.oW(this.jYs.jQA.jQZ));
        i = c.an(getContext(), this.jYs.jQA.jQZ);
        an.a(getContext(), 10, 1023, 999, i, null, GameIndexListView.getSourceScene(), an.Dx(this.jYs.jPA));
        return;
        i = ((Integer)paramView.getTag()).intValue();
      } while ((i < 0) || (i > this.jYs.jQA.jPz.size() - 1));
      paramView = (am)this.jYs.jQA.jPz.get(i);
    } while (bi.oW(paramView.jOU));
    int j = c.an(getContext(), paramView.jOU);
    an.a(getContext(), 10, 1023, i + 1, j, paramView.jQb, GameIndexListView.getSourceScene(), an.Dx(this.jYs.jPA));
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.gsY = ((TextView)findViewById(f.e.title));
    this.jYp = ((TextView)findViewById(f.e.more_etc_tv));
    this.jYq = ((ImageView)findViewById(f.e.more_arrow));
    this.jYr = ((LinearLayout)findViewById(f.e.game_item_container));
    this.jYp.setOnClickListener(this);
  }
  
  public void setData(com.tencent.mm.plugin.game.model.e parame)
  {
    if ((parame == null) || (parame.jLz == null) || (parame.jLz.jQA == null)) {
      setVisibility(8);
    }
    label342:
    label363:
    do
    {
      return;
      ac localac = parame.jLz;
      setVisibility(0);
      this.jYs = localac;
      if (!bi.oW(localac.jQA.bHD))
      {
        this.gsY.setText(localac.jQA.bHD);
        this.gsY.setVisibility(0);
        if (bi.oW(localac.jQA.jQG)) {
          break label342;
        }
        this.jYq.setVisibility(0);
        this.jYp.setVisibility(0);
        this.jYp.setText(localac.jQA.jQG);
      }
      for (;;)
      {
        this.jYr.removeAllViews();
        if (bi.cX(localac.jQA.jPz)) {
          break label363;
        }
        Iterator localIterator = localac.jQA.jPz.iterator();
        while (localIterator.hasNext())
        {
          am localam = (am)localIterator.next();
          Object localObject = LayoutInflater.from(getContext()).inflate(f.f.game_center_4_block_recom_item, this, false);
          ((View)localObject).setOnClickListener(this);
          ((View)localObject).setTag(Integer.valueOf(localac.jQA.jPz.indexOf(localam)));
          this.jYr.addView((View)localObject, new LinearLayout.LayoutParams(-1, -2, 1.0F));
          TextView localTextView1 = (TextView)((View)localObject).findViewById(f.e.recom_item_title);
          ImageView localImageView = (ImageView)((View)localObject).findViewById(f.e.recom_item_img);
          TextView localTextView2 = (TextView)((View)localObject).findViewById(f.e.recom_item_name);
          localObject = (TextView)((View)localObject).findViewById(f.e.recom_item_desc);
          localTextView1.setVisibility(8);
          com.tencent.mm.plugin.game.e.e.aVj().g(localImageView, localam.jQV);
          localTextView2.setText(localam.bHD);
          ((TextView)localObject).setText(localam.jOS);
        }
        this.gsY.setVisibility(8);
        break;
        this.jYp.setVisibility(8);
        this.jYq.setVisibility(8);
      }
    } while (parame.jLB);
    an.a(getContext(), 10, 1023, parame.position, parame.jLz.jQb, GameIndexListView.getSourceScene(), an.Dx(parame.jLz.jPA));
    parame.jLB = true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameFeedQipaiView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */