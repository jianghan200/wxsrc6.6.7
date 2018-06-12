package com.tencent.mm.plugin.multitalk.ui;

import com.tencent.mm.model.af;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.contact.l;
import com.tencent.mm.ui.contact.o;
import java.util.ArrayList;
import java.util.List;

public final class a
  extends o
{
  private String chatroomName;
  private List<String> eCA;
  
  public a(l paraml, String paramString)
  {
    super(paraml, null, true, true);
    this.chatroomName = paramString;
    x.i("MicroMsg.multitalk.MultiTalkSelectInitAdapter", "resetData");
    au.HU();
    this.eCA = c.Ga().il(this.chatroomName);
    if (this.eCA == null) {
      this.eCA = new ArrayList();
    }
  }
  
  public final int getCount()
  {
    return this.eCA.size();
  }
  
  protected final com.tencent.mm.ui.contact.a.a iW(int paramInt)
  {
    Object localObject = (String)this.eCA.get(paramInt);
    au.HU();
    localObject = c.FR().Yg((String)localObject);
    com.tencent.mm.plugin.multitalk.ui.widget.a locala = new com.tencent.mm.plugin.multitalk.ui.widget.a(paramInt);
    locala.guS = ((ab)localObject);
    locala.ujX = bwq();
    return locala;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/multitalk/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */