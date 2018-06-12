package com.tencent.mm.plugin.card.ui.view;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.card.a.c;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.plugin.card.a.g;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.sharecard.model.r;
import com.tencent.mm.plugin.card.ui.a.g;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.Iterator;

public final class x
  extends i
{
  MMActivity gKS;
  private boolean hId = false;
  private View hIe;
  private View hIf;
  private ImageView hIg;
  private TextView hIh;
  private TextView hIi;
  private ImageView hIj;
  View hIk;
  private LinearLayout hIl;
  private View.OnClickListener hIm = new x.1(this);
  
  public final void azI()
  {
    this.hIe.setVisibility(8);
  }
  
  public final void initView()
  {
    this.hIe = findViewById(a.d.share_users_info_header_layout);
    this.hIf = findViewById(a.d.share_users_top_layout);
    this.hIg = ((ImageView)findViewById(a.d.share_user_avatar));
    this.hIh = ((TextView)findViewById(a.d.share_user_name));
    this.hIi = ((TextView)findViewById(a.d.share_user_tips));
    this.hIj = ((ImageView)findViewById(a.d.share_user_select_arrowhead));
    this.hIe.setVisibility(8);
    this.hIk = findViewById(a.d.share_users_bottom_layout);
    this.hIl = ((LinearLayout)findViewById(a.d.share_users_container_layout));
    this.hIk.setVisibility(8);
    this.gKS = this.hHF.ayx();
  }
  
  public final void update()
  {
    Object localObject4 = this.hHF.ayu();
    Object localObject3 = com.tencent.mm.plugin.card.sharecard.a.b.xv(((com.tencent.mm.plugin.card.base.b)localObject4).awr());
    Object localObject1 = this.hHF.ayz();
    Object localObject2;
    Object localObject5;
    Object localObject6;
    label349:
    label437:
    label534:
    int i;
    if (((g)localObject1).azr())
    {
      this.hIe.setVisibility(0);
      if (com.tencent.mm.plugin.card.sharecard.a.b.xu(((com.tencent.mm.plugin.card.base.b)localObject4).awr()) > 1) {
        this.hIf.setOnClickListener(this.hHF.ayy());
      }
      for (;;)
      {
        localObject4 = this.hHF.ayu();
        if (!this.hHF.ayv()) {
          break;
        }
        this.hIg.setVisibility(8);
        this.hIh.setVisibility(8);
        this.hIi.setVisibility(0);
        this.hIj.setImageResource(a.c.card_select_arrow_up);
        this.hIi.setText(this.gKS.getString(a.g.card_share_card_select_tips));
        if (!this.hHF.ayv()) {
          break label879;
        }
        this.hIk.setVisibility(0);
        if ((this.hIl.getChildCount() != 0) || (localObject3 == null)) {
          break label749;
        }
        localObject1 = (LayoutInflater)this.gKS.getSystemService("layout_inflater");
        localObject2 = ((ArrayList)localObject3).iterator();
        for (;;)
        {
          if (!((Iterator)localObject2).hasNext()) {
            break label736;
          }
          localObject3 = (r)((Iterator)localObject2).next();
          localObject4 = ((LayoutInflater)localObject1).inflate(a.e.share_user_info_item, this.hIl, false);
          Object localObject7 = (ImageView)((View)localObject4).findViewById(a.d.user_avatar_img);
          localObject5 = (TextView)((View)localObject4).findViewById(a.d.user_name);
          localObject6 = (TextView)((View)localObject4).findViewById(a.d.share_count);
          if (!TextUtils.isEmpty(((r)localObject3).hyG))
          {
            com.tencent.mm.pluginsdk.ui.a.b.a((ImageView)localObject7, ((r)localObject3).hyG);
            localObject7 = l.xY(((r)localObject3).hyG);
            if (TextUtils.isEmpty((CharSequence)localObject7)) {
              break;
            }
            ((TextView)localObject5).setText(j.d(this.gKS, (CharSequence)localObject7, this.gKS.getResources().getDimensionPixelOffset(com.tencent.mm.plugin.card.a.b.SmallestTextSize)));
          }
          ((TextView)localObject6).setText("x " + ((r)localObject3).share_count);
          ((View)localObject4).setTag(localObject3);
          ((View)localObject4).setOnClickListener(this.hIm);
          localObject5 = (ImageView)((View)localObject4).findViewById(a.d.user_avatar_select);
          localObject6 = (ImageView)((View)localObject4).findViewById(a.d.user_avatar_mask);
          if (!((r)localObject3).hyI) {
            break label719;
          }
          ((ImageView)localObject5).setVisibility(0);
          ((ImageView)localObject6).setVisibility(0);
          this.hIl.addView((View)localObject4);
        }
        this.hIj.setVisibility(8);
        this.hIk.setVisibility(8);
        this.hIl.removeAllViews();
        this.hHF.ayw();
      }
      this.hIg.setVisibility(0);
      this.hIh.setVisibility(0);
      this.hIi.setVisibility(8);
      if (com.tencent.mm.plugin.card.sharecard.a.b.xu(((com.tencent.mm.plugin.card.base.b)localObject4).awr()) <= 1)
      {
        this.hIj.setVisibility(8);
        if ((localObject3 == null) || (((ArrayList)localObject3).size() <= 0)) {
          break label1063;
        }
        i = 0;
        label549:
        if (i >= ((ArrayList)localObject3).size()) {
          break label1063;
        }
        localObject1 = (r)((ArrayList)localObject3).get(i);
        if (!((r)localObject1).hyI) {
          break label701;
        }
      }
    }
    label701:
    label719:
    label736:
    label748:
    label749:
    label879:
    label1058:
    label1063:
    for (localObject1 = ((r)localObject1).hyG;; localObject1 = "")
    {
      localObject2 = localObject1;
      if (TextUtils.isEmpty((CharSequence)localObject1))
      {
        localObject2 = localObject1;
        if (!TextUtils.isEmpty(((com.tencent.mm.plugin.card.base.b)localObject4).aws())) {
          localObject2 = ((com.tencent.mm.plugin.card.base.b)localObject4).aws();
        }
      }
      if (TextUtils.isEmpty((CharSequence)localObject2)) {
        break;
      }
      com.tencent.mm.pluginsdk.ui.a.b.a(this.hIg, (String)localObject2);
      localObject1 = this.gKS.getString(a.g.card_share_card_users, new Object[] { l.xY((String)localObject2) });
      this.hIh.setText(j.d(this.gKS, (CharSequence)localObject1, this.gKS.getResources().getDimensionPixelOffset(com.tencent.mm.plugin.card.a.b.NormalTextSize)));
      break;
      this.hIj.setVisibility(0);
      this.hIj.setImageResource(a.c.card_select_arrow_down);
      break label534;
      i += 1;
      break label549;
      ((TextView)localObject5).setText("");
      break label349;
      ((ImageView)localObject5).setVisibility(8);
      ((ImageView)localObject6).setVisibility(8);
      break label437;
      this.hIl.invalidate();
      this.hId = true;
      return;
      i = 0;
      if (i < this.hIl.getChildCount())
      {
        localObject2 = this.hIl.getChildAt(i);
        if ((localObject3 == null) || (((ArrayList)localObject3).size() < this.hIl.getChildCount())) {
          break label1058;
        }
      }
      for (localObject1 = (r)((ArrayList)localObject3).get(i);; localObject1 = null)
      {
        localObject4 = (ImageView)((View)localObject2).findViewById(a.d.user_avatar_select);
        localObject2 = (ImageView)((View)localObject2).findViewById(a.d.user_avatar_mask);
        if ((localObject1 != null) && (((r)localObject1).hyI))
        {
          ((ImageView)localObject4).setVisibility(0);
          ((ImageView)localObject2).setVisibility(0);
        }
        for (;;)
        {
          i += 1;
          break;
          ((ImageView)localObject4).setVisibility(8);
          ((ImageView)localObject2).setVisibility(8);
        }
        this.hIl.invalidate();
        break;
        this.hIk.setVisibility(8);
        this.hIl.removeAllViews();
        break;
        if (((g)localObject1).azr()) {
          break label748;
        }
        this.hIe.setVisibility(0);
        this.hIg.setVisibility(0);
        this.hIh.setVisibility(0);
        this.hIi.setVisibility(8);
        this.hIj.setVisibility(8);
        localObject2 = "";
        localObject1 = localObject2;
        if (TextUtils.isEmpty(""))
        {
          localObject1 = localObject2;
          if (!TextUtils.isEmpty(((com.tencent.mm.plugin.card.base.b)localObject4).aws())) {
            localObject1 = ((com.tencent.mm.plugin.card.base.b)localObject4).aws();
          }
        }
        if (!TextUtils.isEmpty((CharSequence)localObject1))
        {
          com.tencent.mm.pluginsdk.ui.a.b.a(this.hIg, (String)localObject1);
          localObject1 = this.gKS.getString(a.g.card_share_card_users, new Object[] { l.xY((String)localObject1) });
          this.hIh.setText(j.d(this.gKS, (CharSequence)localObject1, this.gKS.getResources().getDimensionPixelOffset(com.tencent.mm.plugin.card.a.b.NormalTextSize)));
        }
        this.hId = true;
        return;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */