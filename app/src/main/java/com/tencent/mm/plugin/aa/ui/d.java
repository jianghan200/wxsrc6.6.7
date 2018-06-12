package com.tencent.mm.plugin.aa.ui;

import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.aa.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.l;
import com.tencent.mm.ui.contact.o;
import java.util.List;

public final class d
  extends o
{
  private String chatroomName;
  private List<String> eCA;
  
  public d(l paraml, String paramString)
  {
    super(paraml, null, true, true);
    this.chatroomName = paramString;
    x.i("MicroMsg.AASelectInitAdapter", "resetData");
    this.eCA = h.pb(this.chatroomName);
  }
  
  public final int getCount()
  {
    return this.eCA.size();
  }
  
  protected final a iW(int paramInt)
  {
    Object localObject = (String)this.eCA.get(paramInt);
    g.Ek();
    localObject = ((i)g.l(i.class)).FR().Yg((String)localObject);
    c localc = new c(paramInt);
    localc.bIY = this.chatroomName;
    localc.guS = ((ab)localObject);
    localc.ujX = true;
    return localc;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/aa/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */