package com.tencent.mm.ui.contact;

import android.app.Activity;
import com.tencent.mm.R.l;
import com.tencent.mm.aa.j;
import com.tencent.mm.aa.k;
import com.tencent.mm.aa.q;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.ac.d;
import com.tencent.mm.ac.f;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.modelmulti.i;
import com.tencent.mm.openim.a.b.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import java.util.Iterator;
import java.util.List;

public final class y
{
  public static void a(Activity paramActivity, String paramString, List<String> paramList)
  {
    Iterator localIterator = paramList.iterator();
    if (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      String str = aaP((String)localObject);
      if (ab.XR((String)localObject)) {}
      for (int i = 66;; i = 42)
      {
        localObject = new i(paramString, str, i);
        au.DF().a((l)localObject, 0);
        break;
      }
    }
    com.tencent.mm.ui.widget.snackbar.b.h(paramActivity, paramActivity.getString(R.l.has_send));
    h.mEJ.h(11003, new Object[] { paramString, Integer.valueOf(3), Integer.valueOf(paramList.size()) });
    paramActivity.setResult(-1);
    ah.i(new y.1(paramActivity), 1800L);
  }
  
  public static String aaP(String paramString)
  {
    Object localObject = q.KH().kc(paramString);
    au.HU();
    ab localab = c.FR().Yg(paramString);
    String str1;
    String str2;
    if (ab.XR(paramString))
    {
      paramString = localab.field_openImAppid;
      str1 = ((com.tencent.mm.openim.a.b)g.l(com.tencent.mm.openim.a.b.class)).i(localab.field_openImAppid, "openim_desc_icon", b.a.euj);
      str2 = ((com.tencent.mm.openim.a.b)g.l(com.tencent.mm.openim.a.b.class)).aE(localab.field_openImAppid, localab.field_descWordingId);
      return String.format(" <msg bigheadimgurl=\"%s\" smallheadimgurl=\"%s\" username=\"%s\" nickname=\"%s\" sex=\"%d\"  openimappid=\"%s\" openimdesc=\"%s\" openimdescicon=\"%s\"/>", new Object[] { bi.WS(((j)localObject).Kx()), bi.WS(((j)localObject).Ky()), bi.WS(localab.field_username), bi.WS(localab.BK()), Integer.valueOf(localab.sex), paramString, bi.WS(str2), bi.WS(str1) });
    }
    int i = localab.csA;
    if (localObject != null) {
      i = ((j)localObject).csA;
    }
    String str3;
    String str4;
    String str5;
    String str6;
    String str7;
    int j;
    int k;
    int m;
    String str8;
    if (localab.ckW())
    {
      paramString = f.kH(localab.field_username);
      localObject = bi.WS(localab.field_username);
      str1 = bi.WS(localab.BK());
      str2 = bi.WS(localab.wM());
      str3 = bi.WS(localab.BK());
      str4 = bi.WS(localab.wP());
      str5 = bi.WS(localab.getProvince());
      str6 = bi.WS(localab.getCity());
      str7 = bi.WS(localab.signature);
      j = localab.csJ;
      k = localab.sex;
      m = localab.field_verifyFlag;
      str8 = bi.WS(localab.csP);
      if (paramString != null) {
        break label439;
      }
    }
    label439:
    for (paramString = "";; paramString = bi.WS(paramString.field_brandIconURL))
    {
      return String.format("<msg username=\"%s\" nickname=\"%s\" alias=\"%s\" fullpy=\"%s\" shortpy=\"%s\" imagestatus=\"%d\" scene=\"17\" province=\"%s\" city=\"%s\" sign=\"%s\" percard=\"%d\" sex=\"%d\" certflag=\"%d\" certinfo=\"%s\" certinfoext=\"\" brandIconUrl=\"%s\" brandHomeUrl=\"\" brandSubscriptConfigUrl=\"\" brandFlags=\"\" regionCode=\"%s\"/>", new Object[] { localObject, str1, str2, str3, str4, Integer.valueOf(i), str5, str6, str7, Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), str8, paramString, bi.WS(localab.csQ) });
      paramString = null;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/contact/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */