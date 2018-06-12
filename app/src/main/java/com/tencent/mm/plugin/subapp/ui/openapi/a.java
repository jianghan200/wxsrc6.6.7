package com.tencent.mm.plugin.subapp.ui.openapi;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.List;

public final class a
  extends BaseAdapter
  implements j.a
{
  private Context context;
  private List<f> mSx;
  boolean osC = false;
  private int osD = 0;
  
  public a(Context paramContext, int paramInt)
  {
    this.context = paramContext;
    this.osD = paramInt;
    init();
  }
  
  private int aFL()
  {
    return this.mSx.size();
  }
  
  private int aUZ()
  {
    return (4 - aFL() % 4) % 4;
  }
  
  private void init()
  {
    int i = 0;
    this.mSx = new ArrayList();
    Object localObject1 = ao.bmf();
    int j = this.osD;
    Object localObject2 = ((i)localObject1).rawQuery("select * from AppInfo where status = " + j + " and (appType is null or appType not like ',1,')", new String[0]);
    localObject1 = localObject2;
    if (localObject2 == null)
    {
      x.e("MicroMsg.AppInfoStorage", "getAppByStatusExcludeByType: curosr is null");
      localObject1 = null;
    }
    if (localObject1 != null)
    {
      j = ((Cursor)localObject1).getCount();
      while (i < j)
      {
        ((Cursor)localObject1).moveToPosition(i);
        localObject2 = new f();
        ((f)localObject2).d((Cursor)localObject1);
        if (g.r(this.context, ((f)localObject2).field_appId)) {
          this.mSx.add(localObject2);
        }
        i += 1;
      }
      ((Cursor)localObject1).close();
    }
  }
  
  public final void a(String paramString, l paraml)
  {
    init();
    super.notifyDataSetChanged();
  }
  
  public final int getCount()
  {
    return aFL() + aUZ();
  }
  
  public final Object getItem(int paramInt)
  {
    if (qY(paramInt)) {
      return null;
    }
    return this.mSx.get(paramInt);
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramViewGroup = new d();
      paramView = View.inflate(this.context, R.i.app_item, null);
      paramViewGroup.gxd = ((ImageView)paramView.findViewById(R.h.appitem_icon_iv));
      paramViewGroup.osY = ((TextView)paramView.findViewById(R.h.appitem_del_tv));
      paramViewGroup.eHU = ((TextView)paramView.findViewById(R.h.appitem_name_tv));
      paramViewGroup.osZ = paramView.findViewById(R.h.appitem_new_icon);
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      paramViewGroup.osZ.setVisibility(4);
      if (!qY(paramInt)) {
        break;
      }
      paramViewGroup.gxd.setVisibility(4);
      paramViewGroup.osY.setVisibility(4);
      paramViewGroup.eHU.setVisibility(4);
      return paramView;
      paramViewGroup = (d)paramView.getTag();
    }
    f localf = (f)getItem(paramInt);
    paramViewGroup.gxd.setVisibility(0);
    Bitmap localBitmap = g.b(localf.field_appId, 1, com.tencent.mm.bp.a.getDensity(this.context));
    if (localBitmap == null) {
      paramViewGroup.gxd.setBackgroundResource(R.g.app_panel_unknowed_icon);
    }
    for (;;)
    {
      paramViewGroup.eHU.setVisibility(0);
      paramViewGroup.eHU.setText(g.b(this.context, localf, null));
      if (!this.osC) {
        break;
      }
      paramViewGroup.osY.setVisibility(0);
      return paramView;
      paramViewGroup.gxd.setBackgroundDrawable(new BitmapDrawable(localBitmap));
    }
    paramViewGroup.osY.setVisibility(8);
    return paramView;
  }
  
  public final void iw(boolean paramBoolean)
  {
    this.osC = paramBoolean;
    notifyDataSetChanged();
  }
  
  public final boolean qY(int paramInt)
  {
    int i = this.mSx.size();
    return (paramInt >= i) && (paramInt < i + aUZ());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/subapp/ui/openapi/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */