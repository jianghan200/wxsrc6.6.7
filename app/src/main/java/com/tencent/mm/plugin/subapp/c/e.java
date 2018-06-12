package com.tencent.mm.plugin.subapp.c;

import com.tencent.mm.a.f;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;

public final class e
{
  private static final f<Integer, e> dzj = new f(100);
  public String bGP;
  public int dwo;
  public String dwp;
  public int orn;
  public int oro;
  public String orp;
  public int orq;
  public int orr;
  public int ors;
  public int ort;
  
  public static e Oj(String paramString)
  {
    if (bi.oW(paramString)) {
      paramString = null;
    }
    int i;
    Object localObject;
    e locale;
    do
    {
      return paramString;
      i = paramString.indexOf('<');
      localObject = paramString;
      if (i > 0) {
        localObject = paramString.substring(i);
      }
      i = ((String)localObject).hashCode();
      locale = (e)dzj.get(Integer.valueOf(i));
      paramString = locale;
    } while (locale != null);
    paramString = bl.z((String)localObject, "msg");
    if (paramString == null)
    {
      x.e("MicroMsg.VoiceRemindAppMsgExInfo", "parse msg failed");
      return null;
    }
    try
    {
      localObject = new e();
      ((e)localObject).dwo = bi.getInt((String)paramString.get(".msg.appmsg.appattach.totallen"), 0);
      ((e)localObject).bGP = ((String)paramString.get(".msg.appmsg.appattach.attachid"));
      ((e)localObject).dwp = ((String)paramString.get(".msg.appmsg.appattach.fileext"));
      ((e)localObject).orn = bi.getInt((String)paramString.get(".msg.appmsg.voicecmd.reminder.$remindtime"), 0);
      ((e)localObject).oro = bi.getInt((String)paramString.get(".msg.appmsg.voicecmd.reminder.$remindid"), 0);
      ((e)localObject).orp = ((String)paramString.get(".msg.appmsg.voicecmd.reminder.$remindattachid"));
      ((e)localObject).orq = bi.getInt((String)paramString.get(".msg.appmsg.voicecmd.reminder.$remindattachtotallen"), 0);
      ((e)localObject).orr = bi.getInt((String)paramString.get(".msg.appmsg.voicecmd.reminder.$remindformat"), 0);
      ((e)localObject).ors = bi.getInt((String)paramString.get(".msg.appmsg.voicecmd.reminder.$originformat"), 0);
      ((e)localObject).ort = bi.getInt((String)paramString.get(".msg.appmsg.voicecmd.reminder.$msgsvrid"), 0);
      dzj.m(Integer.valueOf(i), localObject);
      return (e)localObject;
    }
    catch (Exception paramString)
    {
      x.e("MicroMsg.VoiceRemindAppMsgExInfo", "parse amessage xml failed");
      x.printErrStackTrace("MicroMsg.VoiceRemindAppMsgExInfo", paramString, "", new Object[0]);
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/subapp/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */