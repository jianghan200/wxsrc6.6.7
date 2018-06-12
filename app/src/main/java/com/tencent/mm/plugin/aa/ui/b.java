package com.tencent.mm.plugin.aa.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.protocal.c.k;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.y;
import java.util.ArrayList;
import java.util.List;

public final class b
  extends BaseAdapter
{
  private Context context;
  List<k> dataList = new ArrayList();
  int mode;
  
  public b(Context paramContext, int paramInt)
  {
    this.context = paramContext;
    this.mode = paramInt;
  }
  
  public final void Wf()
  {
    this.dataList.clear();
  }
  
  public final int getCount()
  {
    return this.dataList.size();
  }
  
  public final Object getItem(int paramInt)
  {
    return this.dataList.get(paramInt);
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView = paramView;
    if (paramView == null)
    {
      localView = y.gq(this.context).inflate(a.g.aa_query_list_item, paramViewGroup, false);
      localView.setTag(new a(localView));
    }
    a locala = (a)localView.getTag();
    k localk = (k)getItem(paramInt);
    locala.eBM.setImageResource(a.h.aa_record_default_icon);
    a.b.g(locala.eBM, localk.qYd, a.h.aa_record_default_icon);
    locala.eBO.setText(j.a(this.context, localk.title, locala.eBO.getTextSize()));
    paramViewGroup = ((com.tencent.mm.plugin.messenger.a.b)g.l(com.tencent.mm.plugin.messenger.a.b.class)).gT(localk.qYd);
    if (!bi.oW(paramViewGroup))
    {
      paramView = paramViewGroup;
      if (!paramViewGroup.endsWith("@chatroom")) {}
    }
    else
    {
      paramView = this.context.getString(a.i.aa_chatting_roominfo_noname);
    }
    locala.eBN.setText(j.a(this.context, paramView, locala.eBN.getTextSize()));
    if (this.mode == 2) {
      locala.eBP.setText(localk.qYp);
    }
    for (;;)
    {
      locala.eBQ.setText(String.format("%s%s", new Object[] { Float.valueOf((float)localk.cfh / 100.0F), this.context.getString(a.i.aa_yuan) }));
      locala.eBR.setVisibility(0);
      if (this.mode != 2) {
        break;
      }
      switch (localk.state)
      {
      default: 
        locala.eBR.setVisibility(4);
        return localView;
        locala.eBP.setText(localk.qYm);
      }
    }
    locala.eBR.setText(a.i.aa_list_record_status_unpaied);
    locala.eBR.setTextColor(this.context.getResources().getColor(a.c.aa_query_list_hint_color));
    return localView;
    locala.eBR.setText(a.i.aa_list_record_status_paied);
    locala.eBR.setTextColor(this.context.getResources().getColor(a.c.aa_query_list_hint_color));
    return localView;
    switch (localk.state)
    {
    default: 
      locala.eBR.setVisibility(4);
      return localView;
    case 1: 
      locala.eBR.setText(a.i.aa_list_record_status_part);
      locala.eBR.setTextColor(this.context.getResources().getColor(a.c.aa_query_list_hint_color));
      return localView;
    case 2: 
      locala.eBR.setText(a.i.aa_list_record_status_finish);
      locala.eBR.setTextColor(this.context.getResources().getColor(a.c.aa_query_list_hint_color));
      return localView;
    case 3: 
      locala.eBR.setText(a.i.aa_list_record_status_close);
      locala.eBR.setTextColor(this.context.getResources().getColor(a.c.red));
      return localView;
    }
    locala.eBR.setText(a.i.aa_list_record_status_expire);
    locala.eBR.setTextColor(this.context.getResources().getColor(a.c.red));
    return localView;
  }
  
  private final class a
  {
    public ImageView eBM;
    public TextView eBN;
    public TextView eBO;
    public TextView eBP;
    public TextView eBQ;
    public TextView eBR;
    
    public a(View paramView)
    {
      this.eBM = ((ImageView)paramView.findViewById(a.f.aa_query_list_item_avatar));
      this.eBN = ((TextView)paramView.findViewById(a.f.aa_query_list_item_chatroom));
      this.eBO = ((TextView)paramView.findViewById(a.f.aa_query_list_item_title));
      this.eBP = ((TextView)paramView.findViewById(a.f.aa_query_list_item_date));
      this.eBQ = ((TextView)paramView.findViewById(a.f.aa_query_list_item_amount));
      this.eBR = ((TextView)paramView.findViewById(a.f.aa_query_list_item_status));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/aa/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */