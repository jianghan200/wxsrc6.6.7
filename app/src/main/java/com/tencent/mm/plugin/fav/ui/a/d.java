package com.tencent.mm.plugin.fav.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.mm.plugin.fav.ui.m.b;
import com.tencent.mm.plugin.fav.ui.m.e;
import com.tencent.mm.plugin.fav.ui.m.f;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import java.util.List;

public abstract class d
  extends BaseAdapter
  implements View.OnClickListener
{
  private Context context;
  public String jbY;
  public List<String> jbZ = new LinkedList();
  public SparseArray<SpannableString> jca = new SparseArray();
  
  public d(Context paramContext)
  {
    this.context = paramContext;
  }
  
  private String jl(int paramInt)
  {
    return (String)this.jbZ.get(paramInt);
  }
  
  public abstract void Ax(String paramString);
  
  public int getCount()
  {
    return this.jbZ.size();
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramViewGroup = paramView;
    if (paramView == null)
    {
      paramViewGroup = View.inflate(this.context, m.f.fav_tag_search_item, null);
      paramViewGroup.setOnClickListener(this);
    }
    TextView localTextView = (TextView)paramViewGroup.findViewById(m.e.search_info);
    String str = bi.aG(jl(paramInt), "");
    int i = (int)localTextView.getTextSize();
    paramInt = str.hashCode();
    paramView = (SpannableString)this.jca.get(paramInt);
    if (paramView != null) {}
    for (;;)
    {
      localTextView.setText(paramView);
      return paramViewGroup;
      paramView = new SpannableString(j.a(this.context, str, i));
      i = str.indexOf(this.jbY);
      if (-1 == i)
      {
        x.w("MicroMsg.FavoriteTagSearchAdapter", "high light %s error", new Object[] { str });
      }
      else
      {
        int j = this.jbY.length() + i;
        paramView.setSpan(new ForegroundColorSpan(this.context.getResources().getColor(m.b.wechat_green)), i, j, 33);
        paramView.setSpan(new StyleSpan(1), i, j, 33);
        this.jca.put(paramInt, paramView);
      }
    }
  }
  
  public void onClick(View paramView)
  {
    paramView = ((TextView)paramView.findViewById(m.e.search_info)).getText().toString();
    x.d("MicroMsg.FavoriteTagSearchAdapter", "select search tag %s", new Object[] { paramView });
    Ax(paramView);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */