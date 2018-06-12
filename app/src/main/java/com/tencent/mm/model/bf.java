package com.tencent.mm.model;

import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.storage.bd;
import java.util.Map;

public final class bf
{
  public static int dCI = 0;
  
  public static String Iq()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (dCI != 0)
    {
      localStringBuilder.append("<");
      localStringBuilder.append("bizflag");
      localStringBuilder.append(">");
      localStringBuilder.append(dCI);
      localStringBuilder.append("</");
      localStringBuilder.append("bizflag");
      localStringBuilder.append(">");
    }
    return localStringBuilder.toString();
  }
  
  public static String Ir()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(bi.oV(Iq()));
    if (localStringBuilder.length() > 0)
    {
      localStringBuilder.insert(0, "<msgsource>");
      localStringBuilder.append("</msgsource>");
      return localStringBuilder.toString();
    }
    return null;
  }
  
  public static String Is()
  {
    String str = (String)g.Ei().DT().get(70, null);
    if (!bi.oW(str)) {
      g.Ei().DT().set(70, "");
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MsgSourceHelper", "getMsg ccr[%s]", new Object[] { str });
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<msgsource>");
    localStringBuilder.append(bi.oV(str));
    if (dCI != 0)
    {
      localStringBuilder.append("<");
      localStringBuilder.append("bizflag");
      localStringBuilder.append(">");
      localStringBuilder.append(dCI);
      localStringBuilder.append("</");
      localStringBuilder.append("bizflag");
      localStringBuilder.append(">");
    }
    localStringBuilder.append("</msgsource>");
    return localStringBuilder.toString();
  }
  
  public static boolean bG(bd parambd)
  {
    if ((parambd != null) && (!bi.oW(parambd.cqb)))
    {
      parambd = bl.z(parambd.cqb, "msgsource");
      if ((parambd != null) && (bi.WU((String)parambd.get(".msgsource.sec_msg_node.fd")) == 1)) {
        return true;
      }
    }
    return false;
  }
  
  public static void iH(String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgSourceHelper", "parseMsgSource  has been Deprecated  by dk. at 20151218 [%s] %s ", new Object[] { paramString, "" });
  }
  
  public static int k(bd parambd)
  {
    if (parambd == null) {
      return 0;
    }
    parambd = bl.z(parambd.cqb, "msgsource");
    if (parambd != null)
    {
      parambd = (String)parambd.get(".msgsource.bizflag");
      if (bi.oW(parambd)) {}
    }
    for (int i = bi.getInt(parambd, 0);; i = 0) {
      return i;
    }
  }
  
  public static boolean l(bd parambd)
  {
    if ((parambd != null) && (!bi.oW(parambd.cqb)))
    {
      parambd = bl.z(parambd.cqb, "msgsource");
      if ((parambd != null) && (bi.WU((String)parambd.get(".msgsource.sec_msg_node.sfn")) == 1)) {
        return true;
      }
    }
    return false;
  }
  
  public static void m(bd parambd)
  {
    Object localObject;
    if ((parambd != null) && (!bi.oW(parambd.cqb)))
    {
      localObject = bl.z(parambd.cqb, "msgsource");
      if ((localObject == null) || (bi.WU((String)((Map)localObject).get(".msgsource.sec_msg_node.sfn")) != 1)) {}
    }
    try
    {
      localObject = parambd.cqb.substring(parambd.cqb.indexOf("<sec_msg_node"), parambd.cqb.indexOf("</sec_msg_node") + 12 + 2);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgSourceHelper", (String)localObject);
      if (!bi.oW((String)localObject))
      {
        String str = ((String)localObject).substring(((String)localObject).indexOf("<sfn"), ((String)localObject).indexOf("</sfn") + 3 + 2);
        parambd.dt(parambd.cqb.replace((CharSequence)localObject, ((String)localObject).replace(str, "<sfn>0<sfn/>")));
      }
      return;
    }
    catch (Exception parambd)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.MsgSourceHelper", parambd, "resetShareForbidden msg exception", new Object[0]);
    }
  }
  
  public static String n(bd parambd)
  {
    if ((parambd != null) && (!bi.oW(parambd.cqb)))
    {
      parambd = bl.z(parambd.cqb, "msgsource");
      if (parambd != null)
      {
        parambd = (String)parambd.get(".msgsource.sec_msg_node.show-h5");
        if (!bi.oW(parambd)) {
          return parambd;
        }
      }
    }
    return "";
  }
  
  public static void y(String paramString, boolean paramBoolean)
  {
    if ("bizflag".equals(paramString))
    {
      if (paramBoolean) {
        dCI |= 0x1;
      }
    }
    else {
      return;
    }
    dCI &= 0xFFFFFFFE;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/model/bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */