package com.tencent.mm.plugin.scanner.a;

import android.content.Context;
import com.tencent.mm.plugin.scanner.util.n;
import com.tencent.mm.plugin.scanner.util.n.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.y.g.a;
import java.util.Map;

public final class i
{
  public static String a(Context paramContext, n.a parama)
  {
    g.a locala = new g.a();
    locala.appId = vx(parama.field_functionType);
    locala.title = parama.field_title;
    locala.description = parama.field_source;
    locala.type = 10;
    locala.url = parama.field_shareurl;
    locala.action = "";
    locala.appName = n.K(paramContext, parama.field_type);
    locala.thumburl = parama.field_thumburl;
    locala.dwR = parama.field_type;
    locala.dwS = n.c(parama);
    return g.a.a(locala, null, null);
  }
  
  public static n.a bY(String paramString, int paramInt)
  {
    if (bi.oW(paramString)) {}
    Object localObject1;
    label45:
    label134:
    label911:
    label938:
    label940:
    label949:
    label958:
    do
    {
      int i;
      do
      {
        do
        {
          return null;
          i = n.KP(paramString);
          if (i != 3) {
            break;
          }
        } while (paramString == null);
        n.a locala;
        if (paramString.startsWith("<productInfo"))
        {
          localObject2 = bl.z(paramString, "productInfo");
          i = 1;
          localObject1 = ".productInfo";
          if (localObject2 == null) {
            break label938;
          }
          locala = new n.a();
          if (bi.oW((String)((Map)localObject2).get((String)localObject1 + ".product.$type"))) {
            break label940;
          }
          locala.field_type = Integer.valueOf((String)((Map)localObject2).get((String)localObject1 + ".product.$type")).intValue();
          locala.field_productid = bi.oV((String)((Map)localObject2).get((String)localObject1 + ".product.id"));
          locala.field_subtitle = bi.oV((String)((Map)localObject2).get((String)localObject1 + ".product.subtitle"));
          locala.field_shareurl = bi.oV((String)((Map)localObject2).get((String)localObject1 + ".product.shareurl"));
          locala.field_playurl = bi.oV((String)((Map)localObject2).get((String)localObject1 + ".product.playurl"));
          locala.field_xmlType = 3;
          locala.field_title = bi.oV((String)((Map)localObject2).get((String)localObject1 + ".product.title"));
          locala.field_thumburl = bi.oV((String)((Map)localObject2).get((String)localObject1 + ".product.thumburl"));
          locala.field_source = bi.oV((String)((Map)localObject2).get((String)localObject1 + ".product.source"));
          locala.field_feedbackurl = bi.oV((String)((Map)localObject2).get((String)localObject1 + ".product.feedbackurl"));
          locala.field_extinfo = bi.oV((String)((Map)localObject2).get((String)localObject1 + ".product.extinfo"));
          locala.field_introtitle = bi.oV((String)((Map)localObject2).get((String)localObject1 + ".product.introtitle"));
          locala.field_introlink = bi.oV((String)((Map)localObject2).get((String)localObject1 + ".product.introlink"));
          locala.field_getaction = bi.getInt((String)((Map)localObject2).get((String)localObject1 + ".product.getaction"), 0);
          locala.field_certification = bi.oV((String)((Map)localObject2).get((String)localObject1 + ".product.certification"));
          locala.field_headerbackgroundurl = bi.oV((String)((Map)localObject2).get((String)localObject1 + ".product.headerbackgroundurl"));
          locala.field_headermask = bi.oV((String)((Map)localObject2).get((String)localObject1 + ".product.headermask"));
          locala.field_detailurl = bi.oV((String)((Map)localObject2).get((String)localObject1 + ".product.detailurl"));
          locala.field_certificationurl = bi.oV((String)((Map)localObject2).get((String)localObject1 + ".product.certificationurl"));
          locala.field_exposeurl = bi.oV((String)((Map)localObject2).get((String)localObject1 + ".product.exposeurl"));
          locala.mNX = a.m((Map)localObject2, (String)localObject1 + ".product");
          locala.o((Map)localObject2, (String)localObject1 + ".product");
          localObject1 = (String)((Map)localObject2).get((String)localObject1 + ".functionType");
          if (bi.oW((String)localObject1)) {
            break label949;
          }
          locala.field_functionType = Integer.valueOf((String)localObject1).intValue();
          if (i == 0) {
            break label958;
          }
        }
        for (locala.field_xml = paramString;; locala.field_xml = ((StringBuilder)localObject1).toString())
        {
          return locala;
          localObject2 = bl.z(paramString, "product");
          localObject1 = "";
          i = 0;
          break label45;
          break;
          locala.field_type = 0;
          break label134;
          locala.field_functionType = paramInt;
          break label911;
          localObject1 = new StringBuilder(256);
          ((StringBuilder)localObject1).append("<productInfo>");
          ((StringBuilder)localObject1).append(paramString);
          ((StringBuilder)localObject1).append("<functionType>" + locala.field_functionType + "</functionType>");
          ((StringBuilder)localObject1).append("</productInfo>");
        }
      } while ((i != 4) || (paramString == null));
      localObject1 = bl.z(paramString, "search");
    } while (localObject1 == null);
    Object localObject2 = new n.a();
    ((n.a)localObject2).field_xmlType = 4;
    ((n.a)localObject2).field_xml = paramString;
    ((n.a)localObject2).mNX = a.m((Map)localObject1, ".search");
    return (n.a)localObject2;
  }
  
  public static String vx(int paramInt)
  {
    if (paramInt == 4) {
      return "wxfbc915ff7c30e335";
    }
    if (paramInt == 3) {
      return "wx482a4001c37e2b74";
    }
    return "wxfbc915ff7c30e335";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/scanner/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */