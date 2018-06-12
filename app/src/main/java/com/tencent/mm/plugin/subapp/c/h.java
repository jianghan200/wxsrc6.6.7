package com.tencent.mm.plugin.subapp.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import java.io.File;
import java.util.Map;
import junit.framework.Assert;

public final class h
{
  public static g Ok(String paramString)
  {
    Object localObject2 = d.bGt();
    Object localObject1 = null;
    String str = "SELECT filename, user, msgid, offset, filenowsize, totallen, status, createtime, lastmodifytime, clientid, voicelenght, msglocalid, human, voiceformat, nettimes, reserved1, reserved2" + " FROM VoiceRemindInfo WHERE filename= ?";
    localObject2 = ((k)localObject2).diF.b(str, new String[] { paramString }, 2);
    paramString = (String)localObject1;
    if (((Cursor)localObject2).moveToFirst())
    {
      paramString = new g();
      paramString.d((Cursor)localObject2);
    }
    ((Cursor)localObject2).close();
    return paramString;
  }
  
  public static c Ol(String paramString)
  {
    k localk = d.bGt();
    paramString = aY(paramString, false);
    if (localk.orF.get(paramString) == null) {
      localk.orF.put(paramString, new c(paramString));
    }
    return (c)localk.orF.get(paramString);
  }
  
  static boolean a(g paramg)
  {
    if (paramg == null) {}
    k localk;
    String str;
    label72:
    label77:
    do
    {
      do
      {
        return false;
      } while (paramg.bWA == -1);
      localk = d.bGt();
      str = paramg.field_filename;
      if (str.length() > 0)
      {
        bool = true;
        Assert.assertTrue(bool);
        if (paramg == null) {
          break label72;
        }
      }
      for (boolean bool = true;; bool = false)
      {
        Assert.assertTrue(bool);
        paramg = paramg.wH();
        if (paramg.size() > 0) {
          break label77;
        }
        x.e("MicroMsg.VoiceRemindStorage", "update failed, no values set");
        return false;
        bool = false;
        break;
      }
    } while (localk.diF.update("VoiceRemindInfo", paramg, "filename= ?", new String[] { str }) <= 0);
    localk.doNotify();
    return true;
  }
  
  public static String aY(String paramString, boolean paramBoolean)
  {
    au.HU();
    String str = com.tencent.mm.sdk.platformtools.h.b(com.tencent.mm.model.c.Ge(), "recbiz_", paramString, ".rec", 2);
    if (bi.oW(str)) {
      paramString = null;
    }
    do
    {
      do
      {
        return paramString;
        paramString = str;
      } while (paramBoolean);
      paramString = str;
    } while (!new File(str).exists());
    return str;
  }
  
  public static boolean nP(String paramString)
  {
    if (paramString == null) {
      return false;
    }
    g localg = Ok(paramString);
    if (localg == null)
    {
      x.e("MicroMsg.VoiceRemindLogic", "Set error failed file:" + paramString);
      return false;
    }
    localg.field_status = 98;
    localg.field_lastmodifytime = (System.currentTimeMillis() / 1000L);
    localg.bWA = 320;
    boolean bool = a(localg);
    x.d("MicroMsg.VoiceRemindLogic", "setError file:" + paramString + " msgid:" + localg.field_msglocalid + " old stat:" + localg.field_status);
    if ((localg.field_msglocalid == 0) || (bi.oW(localg.field_user)))
    {
      x.e("MicroMsg.VoiceRemindLogic", "setError failed msg id:" + localg.field_msglocalid + " user:" + localg.field_user);
      return bool;
    }
    au.HU();
    paramString = com.tencent.mm.model.c.FT().dW(localg.field_msglocalid);
    paramString.setMsgId(localg.field_msglocalid);
    paramString.setStatus(5);
    paramString.ep(localg.field_user);
    paramString.setContent(f.b(localg.field_human, -1L, true));
    au.HU();
    com.tencent.mm.model.c.FT().a(paramString.field_msgId, paramString);
    return bool;
  }
  
  static void ol(String paramString)
  {
    d.bGt().ol(aY(paramString, false));
  }
  
  public static boolean op(String paramString)
  {
    if (paramString == null) {}
    do
    {
      return false;
      g localg = Ok(paramString);
      if (localg == null)
      {
        x.d("MicroMsg.VoiceRemindLogic", "cancel null record : " + paramString);
        return true;
      }
      x.d("MicroMsg.VoiceRemindLogic", "cancel record : " + paramString + " LocalId:" + localg.field_msglocalid);
      if (localg.field_msglocalid != 0)
      {
        au.HU();
        com.tencent.mm.model.c.FT().dX(localg.field_msglocalid);
      }
    } while (paramString == null);
    d.bGt().jy(paramString);
    ol(paramString);
    return new File(aY(paramString, false)).delete();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/subapp/c/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */