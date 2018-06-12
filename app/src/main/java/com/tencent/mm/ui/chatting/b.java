package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ak.a.a.c;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.ak.o;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.List;

final class b
  extends BaseAdapter
{
  private Context context;
  private c iAs;
  private List<ab> tGU;
  boolean tGV = false;
  
  public b(Context paramContext)
  {
    this.context = paramContext;
    this.tGU = new ArrayList();
    paramContext = new c.a();
    paramContext.dXN = R.g.my_device_default_icon;
    this.iAs = paramContext.Pt();
    aQ(null);
  }
  
  private ab EF(int paramInt)
  {
    return (ab)this.tGU.get(paramInt);
  }
  
  public final void aQ(List<ab> paramList)
  {
    this.tGU.clear();
    if ((paramList != null) && (paramList.size() != 0)) {
      this.tGU.addAll(paramList);
    }
    if (this.tGV)
    {
      paramList = this.tGU;
      localab = new ab();
      localab.jxE = R.g.send_data_system_open;
      localab.daA = this.context.getString(R.l.chatting_send_system_open);
      paramList.add(localab);
    }
    paramList = this.tGU;
    ab localab = new ab();
    localab.jxE = R.g.send_data_settings;
    localab.daA = this.context.getString(R.l.settings_title);
    paramList.add(localab);
    x.d("MicroMsg.AppInfoListAdapter", "updateData mDeviceInfoList.size() = %d.", new Object[] { Integer.valueOf(this.tGU.size()) });
  }
  
  public final int getCount()
  {
    return this.tGU.size();
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ab localab = EF(paramInt);
    Object localObject;
    if (paramView == null)
    {
      paramView = new aq();
      localObject = View.inflate(paramViewGroup.getContext(), R.i.send_data_to_device_item, null);
      paramView.iDt = ((View)localObject).findViewById(R.h.container);
      paramView.eMe = ((TextView)((View)localObject).findViewById(R.h.nameTV));
      paramView.gmn = ((ImageView)((View)localObject).findViewById(R.h.iconIV));
      paramView.tLN = ((TextView)((View)localObject).findViewById(R.h.sendStateTV));
      paramView.tNv = ((SendDataToDeviceProgressBar)((View)localObject).findViewById(R.h.sendProgress));
      paramView.tNv.setVisibility(4);
      ((View)localObject).setTag(paramView);
      paramViewGroup = paramView;
      paramView = (View)localObject;
      paramViewGroup.eMe.setText(localab.daA);
      x.v("MicroMsg.AppInfoListAdapter", "position(%s), name(%s).", new Object[] { Integer.valueOf(paramInt), localab.daA });
      if (localab.jxE == 0) {
        break label205;
      }
      paramViewGroup.gmn.setImageResource(localab.jxE);
    }
    for (;;)
    {
      paramViewGroup.iDt.setTag(Integer.valueOf(paramInt));
      return paramView;
      paramViewGroup = (aq)paramView.getTag();
      break;
      label205:
      localObject = g.b(localab.appId, 1, com.tencent.mm.bp.a.getDensity(this.context));
      if ((localObject != null) && (!((Bitmap)localObject).isRecycled())) {
        paramViewGroup.gmn.setImageBitmap((Bitmap)localObject);
      } else {
        o.Pj().a(localab.iconUrl, paramViewGroup.gmn, this.iAs);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/chatting/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */