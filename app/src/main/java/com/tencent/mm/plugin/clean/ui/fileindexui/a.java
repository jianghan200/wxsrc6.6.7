package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.HashSet;
import java.util.List;

public final class a
  extends BaseAdapter
{
  private List<c> dataList;
  HashSet<Integer> gUV;
  CleanChattingUI hRQ;
  
  public a(CleanChattingUI paramCleanChattingUI, List<c> paramList)
  {
    this.hRQ = paramCleanChattingUI;
    this.gUV = new HashSet();
    this.dataList = paramList;
  }
  
  public final void aBw()
  {
    this.gUV.clear();
    this.hRQ.a(this.gUV);
  }
  
  public final int getCount()
  {
    return this.dataList.size();
  }
  
  public final long getItemId(int paramInt)
  {
    return -1L;
  }
  
  public final View getView(final int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    c localc;
    if (paramView == null)
    {
      paramView = this.hRQ.getLayoutInflater().inflate(R.i.clean_chatting_item, paramViewGroup, false);
      paramViewGroup = new a();
      paramViewGroup.eCl = ((ImageView)paramView.findViewById(R.h.avatar_iv));
      paramViewGroup.eCm = ((TextView)paramView.findViewById(R.h.title_tv));
      paramViewGroup.eCn = ((TextView)paramView.findViewById(R.h.desc_tv));
      paramViewGroup.eCo = ((CheckBox)paramView.findViewById(R.h.select_cb));
      paramViewGroup.gUY = ((RelativeLayout)paramView.findViewById(R.h.select_cb_click_layout));
      paramView.setTag(paramViewGroup);
      paramViewGroup.gUY.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          if (a.a(a.this).contains(Integer.valueOf(paramInt))) {
            a.a(a.this).remove(Integer.valueOf(paramInt));
          }
          for (;;)
          {
            a.this.notifyDataSetChanged();
            a.b(a.this).a(a.a(a.this));
            return;
            a.a(a.this).add(Integer.valueOf(paramInt));
          }
        }
      });
      localc = om(paramInt);
      a.b.a(paramViewGroup.eCl, localc.username);
      paramViewGroup.eCm.setText(bi.bF(localc.size));
      if (!s.fq(localc.username)) {
        break label234;
      }
      paramViewGroup.eCn.setText(j.a(this.hRQ, r.getDisplayName(localc.username, localc.username), paramViewGroup.eCn.getTextSize()));
    }
    for (;;)
    {
      if (!this.gUV.contains(Integer.valueOf(paramInt))) {
        break label266;
      }
      paramViewGroup.eCo.setChecked(true);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label234:
      paramViewGroup.eCn.setText(j.a(this.hRQ, r.gT(localc.username), paramViewGroup.eCn.getTextSize()));
    }
    label266:
    paramViewGroup.eCo.setChecked(false);
    return paramView;
  }
  
  public final c om(int paramInt)
  {
    return (c)this.dataList.get(paramInt);
  }
  
  final class a
  {
    ImageView eCl;
    TextView eCm;
    TextView eCn;
    CheckBox eCo;
    RelativeLayout gUY;
    
    a() {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/clean/ui/fileindexui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */