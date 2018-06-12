package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.tencent.mm.plugin.map.a.e;
import com.tencent.mm.plugin.map.a.f;
import com.tencent.mm.plugin.map.a.i;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.MMGridPaper;
import com.tencent.mm.ui.base.i;
import java.util.ArrayList;
import java.util.Iterator;

public final class b
{
  private i kEl = null;
  private MMGridPaper kEm = null;
  private a kEn = null;
  private ViewGroup kEo = null;
  private RelativeLayout kEp = null;
  private ArrayList<String> kEq = null;
  private int kEr = 0;
  private Context mContext = null;
  
  private b(Context paramContext)
  {
    this.mContext = paramContext;
    this.kEl = new i(this.mContext, a.i.trackDialog);
    this.kEo = ((ViewGroup)((LayoutInflater)this.mContext.getSystemService("layout_inflater")).inflate(a.f.avatars_dialog, null));
    this.kEm = ((MMGridPaper)this.kEo.findViewById(a.e.dialog_content));
    this.kEm.crw();
    this.kEm.setDialogMode(true);
    this.kEm.crv();
    this.kEm.setMaxRow(3);
    this.kEm.setMaxCol(3);
    this.kEm.setHeaderView(null);
    this.kEm.crw();
    this.kEm.setItemWidthInDp(70);
    this.kEm.setItemHeightInDp(70);
    this.kEl.setCanceledOnTouchOutside(true);
    this.kEl.setContentView(this.kEo);
    this.kEn = new a();
    this.kEm.setGridPaperAdapter(this.kEn);
  }
  
  public static void b(Context paramContext, ArrayList<String> paramArrayList)
  {
    x.d("MicroMsg.AvatarsDialog", "showDialog, username.size = %d", new Object[] { Integer.valueOf(paramArrayList.size()) });
    paramContext = new b(paramContext);
    paramContext.kEq = new ArrayList();
    paramArrayList = paramArrayList.iterator();
    String str;
    while (paramArrayList.hasNext())
    {
      str = (String)paramArrayList.next();
      paramContext.kEq.add(str);
    }
    int i;
    if (paramContext.kEq.size() < 3)
    {
      paramContext.kEm.setMaxCol(paramContext.kEq.size());
      paramArrayList = paramContext.kEm.getLayoutParams();
      paramContext.kEr = com.tencent.mm.bp.a.fromDPToPix(paramContext.mContext, 70);
      i = com.tencent.mm.bp.a.fromDPToPix(paramContext.mContext, 8);
      if (paramContext.kEq.size() <= 0) {
        break label433;
      }
      if (paramContext.kEq.size() >= 3) {
        break label366;
      }
      int j = paramContext.kEr;
      int k = paramContext.kEq.size();
      i = i * (paramContext.kEq.size() - 1) + j * k;
    }
    for (;;)
    {
      label187:
      str = BackwardSupportUtil.b.fp(paramContext.mContext);
      x.d("MicroMsg.AvatarsDialog", "calculateGridWidth, result = %d, mUsername.size = %d, avatarSize = %d, densityType = %s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramContext.kEq.size()), Integer.valueOf(paramContext.kEr), str });
      paramArrayList.width = i;
      paramContext.kEr = com.tencent.mm.bp.a.fromDPToPix(paramContext.mContext, 70);
      i = com.tencent.mm.bp.a.fromDPToPix(paramContext.mContext, 15);
      if (paramContext.kEq.size() > 0) {
        if (paramContext.kEq.size() <= 3)
        {
          i += paramContext.kEr;
          label298:
          x.d("MicroMsg.AvatarsDialog", "calculateGridHeight, result = %d", new Object[] { Integer.valueOf(i) });
        }
      }
      for (;;)
      {
        paramArrayList.height = i;
        paramContext.kEm.setLayoutParams(paramArrayList);
        paramContext.kEm.requestLayout();
        paramContext.kEn.B(paramContext.kEq);
        paramContext.kEl.show();
        return;
        paramContext.kEm.setMaxCol(3);
        break;
        label366:
        i = i * 2 + paramContext.kEr * 3;
        break label187;
        if (paramContext.kEq.size() <= 6)
        {
          i += paramContext.kEr * 2;
          break label298;
        }
        i = i * 2 + paramContext.kEr * 3 + com.tencent.mm.bp.a.fromDPToPix(paramContext.mContext, 10);
        break label298;
        i = 0;
      }
      label433:
      i = 0;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/location/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */