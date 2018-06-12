package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Intent;
import com.tencent.mm.api.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.c.axr;
import com.tencent.mm.protocal.c.bja;
import com.tencent.mm.protocal.c.bjp;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.e.a;

public final class c
{
  public static void a(Intent paramIntent, bja parambja, int paramInt)
  {
    ((h)g.l(h.class)).a(paramIntent, parambja, paramInt);
  }
  
  public static void a(Intent paramIntent, bjp parambjp, int paramInt)
  {
    paramIntent.putExtra("Contact_User", parambjp.hbL);
    paramIntent.putExtra("Contact_Nick", parambjp.hcS);
    paramIntent.putExtra("Contact_PyInitial", parambjp.ruh);
    paramIntent.putExtra("Contact_QuanPin", parambjp.rui);
    paramIntent.putExtra("Contact_Sex", parambjp.eJH);
    paramIntent.putExtra("Contact_Scene", paramInt);
    paramIntent.putExtra("Contact_KHideExpose", true);
    paramIntent.putExtra(e.a.ths, parambjp.rEJ);
    paramIntent.putExtra("key_add_contact_openim_appid", parambjp.jQb);
    paramIntent.putExtra("key_add_contact_match_type", parambjp.sjj);
    paramIntent.putExtra("key_add_contact_custom_detail_visible", parambjp.sjA.saT);
    paramIntent.putExtra("key_add_contact_custom_detail", parambjp.sjA.jQf);
    paramIntent.putExtra("key_add_contact_desc_wording_id", parambjp.sjC);
    paramIntent.putExtra("key_add_contact_desc_icon", parambjp.sjB);
    x.i("MicroMsg.BuildContactInfoIntent", "[tomys] anti, content: %s", new Object[] { parambjp.rEJ });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/tools/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */