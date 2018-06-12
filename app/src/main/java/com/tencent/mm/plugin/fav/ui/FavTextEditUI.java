package com.tencent.mm.plugin.fav.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.ab.o;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.al;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.auj;
import com.tencent.mm.protocal.c.aum;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.tools.MMTextInputUI;
import java.util.LinkedList;

public class FavTextEditUI
  extends MMTextInputUI
{
  protected final int getLayoutId()
  {
    return m.f.fav_edit_input_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(m.i.favorite_edit_title);
  }
  
  protected final void w(CharSequence paramCharSequence)
  {
    if ((paramCharSequence == null) || (bi.oW(paramCharSequence.toString())))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavTextEditUI", "text is null");
      return;
    }
    int i = getIntent().getIntExtra("key_fav_item_id", -1);
    paramCharSequence = paramCharSequence.toString();
    if (i <= 0)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavTextEditUI", "modEditText favid:%d", new Object[] { Integer.valueOf(i) });
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    Object localObject1 = new auj();
    ((auj)localObject1).rXA = 4;
    ((auj)localObject1).rXB = 0;
    localLinkedList.add(localObject1);
    localObject1 = new LinkedList();
    Object localObject2 = new aum();
    ((aum)localObject2).jSt = "favitem.desc";
    ((aum)localObject2).mEl = bi.aG(paramCharSequence, "");
    ((LinkedList)localObject1).add(localObject2);
    localObject2 = new aum();
    ((aum)localObject2).jSt = "favitem.edittime";
    ((aum)localObject2).mEl = String.valueOf(bi.VE());
    ((LinkedList)localObject1).add(localObject2);
    localObject2 = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dz(i);
    if (localObject2 != null)
    {
      ((com.tencent.mm.plugin.fav.a.g)localObject2).field_edittime = bi.VE();
      ((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.fT(((com.tencent.mm.plugin.fav.a.g)localObject2).field_edittime);
      ((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.Vv(bi.aG(paramCharSequence, ""));
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().a((com.tencent.mm.plugin.fav.a.g)localObject2, new String[] { "localId" });
    }
    paramCharSequence = new al(i, localLinkedList, (LinkedList)localObject1);
    com.tencent.mm.kernel.g.DF().a(paramCharSequence, 0);
    h.mEJ.h(10874, new Object[] { Integer.valueOf(1) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/FavTextEditUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */