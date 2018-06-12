package com.tencent.mm.plugin.label.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.mm.R.e;
import com.tencent.mm.R.i;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.widget.MMTextView;
import java.util.ArrayList;

public final class b
  extends BaseAdapter
{
  String eId;
  ArrayList<String> kBD = new ArrayList();
  SparseArray<SpannableString> kBE = new SparseArray();
  private Context mContext;
  
  public b(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  public final int getCount()
  {
    if (this.kBD == null) {
      return 0;
    }
    return this.kBD.size();
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    MMTextView localMMTextView;
    String str;
    int i;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = LayoutInflater.from(this.mContext).inflate(R.i.contact_label_list_item, paramViewGroup, false);
      paramViewGroup = new c(paramView);
      paramView.setTag(paramViewGroup);
      localMMTextView = paramViewGroup.kCe;
      str = bi.aG(jl(paramInt), "");
      i = (int)paramViewGroup.kCe.getTextSize();
      paramInt = str.hashCode();
      paramViewGroup = (SpannableString)this.kBE.get(paramInt);
      if (paramViewGroup == null) {
        break label110;
      }
    }
    for (;;)
    {
      localMMTextView.setText(paramViewGroup);
      return paramView;
      paramViewGroup = (c)paramView.getTag();
      break;
      label110:
      paramViewGroup = new SpannableString(j.a(this.mContext, str, i));
      i = str.indexOf(this.eId);
      if (i == -1)
      {
        x.w("MicroMsg.Label.ContactLabelSearchAdapter", "hight light %s error.", new Object[] { str });
      }
      else
      {
        int j = this.eId.length() + i;
        paramViewGroup.setSpan(new ForegroundColorSpan(this.mContext.getResources().getColor(R.e.wechat_green)), i, j, 33);
        paramViewGroup.setSpan(new StyleSpan(1), i, j, 33);
        this.kBE.put(paramInt, paramViewGroup);
      }
    }
  }
  
  public final String jl(int paramInt)
  {
    if ((this.kBD == null) || (paramInt >= getCount())) {
      return null;
    }
    return (String)this.kBD.get(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/label/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */