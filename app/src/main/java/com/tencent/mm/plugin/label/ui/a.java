package com.tencent.mm.plugin.label.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ac.m;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.c;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.AddressView;
import com.tencent.mm.ui.contact.f;
import java.util.List;
import java.util.Map;

public final class a
  extends com.tencent.mm.ui.r<f>
{
  public static final ColorStateList kBs = com.tencent.mm.bp.a.ac(ad.getContext(), R.e.mm_list_textcolor_one);
  public static final ColorStateList kBt = com.tencent.mm.bp.a.ac(ad.getContext(), R.e.hint_text_color);
  List<String> kBu;
  
  public a(Context paramContext)
  {
    super(paramContext, new f());
  }
  
  private static f a(f paramf, Cursor paramCursor)
  {
    f localf = paramf;
    if (paramf == null) {
      localf = new f();
    }
    au.HU();
    paramf = c.FR().Yb(ab.o(paramCursor));
    if (paramf == null)
    {
      localf.guS.d(paramCursor);
      au.HU();
      c.FR().Q(localf.guS);
      return localf;
    }
    localf.guS = paramf;
    return localf;
  }
  
  protected final void WS()
  {
    WT();
  }
  
  /* Error */
  public final void WT()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 98	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   5: invokestatic 101	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   8: if_acmpne +53 -> 61
    //   11: iconst_1
    //   12: istore_1
    //   13: aload_0
    //   14: getfield 103	com/tencent/mm/plugin/label/ui/a:kBu	Ljava/util/List;
    //   17: ifnull +49 -> 66
    //   20: aload_0
    //   21: getfield 103	com/tencent/mm/plugin/label/ui/a:kBu	Ljava/util/List;
    //   24: invokeinterface 109 1 0
    //   29: ifle +37 -> 66
    //   32: invokestatic 58	com/tencent/mm/model/au:HU	()Lcom/tencent/mm/model/c;
    //   35: pop
    //   36: invokestatic 64	com/tencent/mm/model/c:FR	()Lcom/tencent/mm/storage/ay;
    //   39: aload_0
    //   40: getfield 103	com/tencent/mm/plugin/label/ui/a:kBu	Ljava/util/List;
    //   43: invokeinterface 113 2 0
    //   48: astore_2
    //   49: iload_1
    //   50: ifeq +23 -> 73
    //   53: aload_0
    //   54: aload_2
    //   55: invokevirtual 116	com/tencent/mm/plugin/label/ui/a:l	(Landroid/database/Cursor;)V
    //   58: aload_0
    //   59: monitorexit
    //   60: return
    //   61: iconst_0
    //   62: istore_1
    //   63: goto -50 -> 13
    //   66: invokestatic 122	com/tencent/mm/bt/d:cnR	()Landroid/database/Cursor;
    //   69: astore_2
    //   70: goto -21 -> 49
    //   73: new 124	com/tencent/mm/plugin/label/ui/a$1
    //   76: dup
    //   77: aload_0
    //   78: aload_2
    //   79: invokespecial 127	com/tencent/mm/plugin/label/ui/a$1:<init>	(Lcom/tencent/mm/plugin/label/ui/a;Landroid/database/Cursor;)V
    //   82: invokestatic 133	com/tencent/mm/sdk/platformtools/ah:A	(Ljava/lang/Runnable;)V
    //   85: goto -27 -> 58
    //   88: astore_2
    //   89: aload_0
    //   90: monitorexit
    //   91: aload_2
    //   92: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	93	0	this	a
    //   12	51	1	i	int
    //   48	31	2	localCursor	Cursor
    //   88	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	11	88	finally
    //   13	49	88	finally
    //   53	58	88	finally
    //   66	70	88	finally
    //   73	85	88	finally
  }
  
  public final int getCount()
  {
    return super.getCount();
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    localObject = null;
    ab localab = rN(paramInt).guS;
    View localView;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      localView = View.inflate(this.context, R.i.contact_label_member_list_item, null);
      paramViewGroup = new a(localView);
      localView.setTag(paramViewGroup);
      a.b.a(paramViewGroup.kBx, localab.field_username);
      if (localab.field_verifyFlag == 0) {
        break label307;
      }
      paramView = am.a.dBt.gY(localab.field_verifyFlag);
      if (paramView == null) {
        break label296;
      }
      paramView = m.kU(paramView);
      paramViewGroup.kBx.setMaskBitmap(paramView);
      label104:
      if (localab.field_deleteFlag != 1) {
        break label318;
      }
      paramViewGroup.kBx.setNickNameTextColor(kBt);
      label123:
      paramViewGroup.kBx.updateTextColors();
      paramView = localab.sNQ;
      if (paramView != null) {
        break label331;
      }
    }
    try
    {
      Context localContext = this.context;
      paramView = localab.field_username;
      String str = com.tencent.mm.model.r.gT(localab.field_username);
      paramView = str;
      if ("".length() > 0)
      {
        paramView = str;
        if (!"".equals(str))
        {
          paramView = new StringBuilder(32);
          paramView.append(str);
          paramView.append("(");
          paramView.append("");
          paramView.append(")");
          paramView = paramView.toString();
        }
      }
      paramView = j.a(localContext, paramView, paramViewGroup.kBx.getNickNameSize());
    }
    catch (Exception paramView)
    {
      for (;;)
      {
        label296:
        label307:
        label318:
        label331:
        paramView = (View)localObject;
      }
    }
    localObject = paramView;
    if (paramView == null) {
      localObject = "";
    }
    paramViewGroup.kBx.setName((CharSequence)localObject);
    localab.sNQ = ((CharSequence)localObject);
    for (;;)
    {
      paramViewGroup.kBx.updatePositionFlag();
      return localView;
      paramViewGroup = (a)paramView.getTag();
      localView = paramView;
      break;
      paramViewGroup.kBx.setMaskBitmap(null);
      break label104;
      paramViewGroup.kBx.setMaskBitmap(null);
      break label104;
      paramViewGroup.kBx.setNickNameTextColor(kBs);
      break label123;
      paramViewGroup.kBx.setName(paramView);
    }
  }
  
  public final void l(Cursor paramCursor)
  {
    aYc();
    setCursor(paramCursor);
    notifyDataSetChanged();
  }
  
  public final f rN(int paramInt)
  {
    Object localObject;
    if (qY(paramInt)) {
      localObject = (f)aVa();
    }
    f localf;
    do
    {
      do
      {
        return (f)localObject;
        if (this.tlF == null) {
          break;
        }
        localf = (f)this.tlF.get(Integer.valueOf(paramInt));
        localObject = localf;
      } while (localf != null);
      if ((paramInt < 0) || (!getCursor().moveToPosition(paramInt))) {
        return null;
      }
      localf = a(null, getCursor());
      if (this.tlF == null) {
        lB(true);
      }
      localObject = localf;
    } while (this.tlF == null);
    this.tlF.put(Integer.valueOf(paramInt), localf);
    return localf;
  }
  
  protected static final class a
  {
    public AddressView kBx;
    
    public a(View paramView)
    {
      this.kBx = ((AddressView)paramView.findViewById(R.h.myview));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/label/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */