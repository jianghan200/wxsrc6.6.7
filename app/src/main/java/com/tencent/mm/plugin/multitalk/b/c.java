package com.tencent.mm.plugin.multitalk.b;

import android.database.Cursor;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class c
  extends i<b>
{
  public static final String[] diD = { i.a(b.dhO, "MultiTalkMember"), "CREATE INDEX IF NOT EXISTS idx_MultiTalkMember  on MultiTalkMember  (  wxGroupId )" };
  
  public c(e parame)
  {
    super(parame, b.dhO, "MultiTalkMember", null);
  }
  
  public final LinkedList<b> HP(String paramString)
  {
    paramString = rawQuery("select memberUuid, wxGroupId, userName, inviteUserName, memberId, status,createTime  from MultiTalkMember  where wxGroupId = '" + paramString + "'", new String[0]);
    LinkedList localLinkedList = new LinkedList();
    for (;;)
    {
      if (paramString != null) {}
      try
      {
        if (paramString.moveToNext())
        {
          b localb = new b();
          localb.field_memberUuid = paramString.getInt(0);
          localb.field_wxGroupId = paramString.getString(1);
          localb.field_userName = paramString.getString(2);
          localb.field_inviteUserName = paramString.getString(3);
          localb.field_memberId = paramString.getLong(4);
          localb.field_status = paramString.getInt(5);
          localb.field_createTime = paramString.getLong(6);
          x.i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "getMultiTalkMemberList get value for memberUuid = %s, wxGroupId = %s, userName = %s, inviteUserName = %s, memberId = %d, status = %d,createTime = %d", new Object[] { Long.valueOf(localb.field_memberUuid), localb.field_wxGroupId, localb.field_userName, localb.field_inviteUserName, Long.valueOf(localb.field_memberId), Integer.valueOf(localb.field_status), Long.valueOf(localb.field_createTime) });
          localLinkedList.add(localb);
          continue;
        }
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", localException.toString());
        return localLinkedList;
        return localLinkedList;
      }
      finally
      {
        if (paramString != null) {
          paramString.close();
        }
      }
    }
  }
  
  public final boolean a(b paramb)
  {
    long l = paramb.field_memberUuid;
    Cursor localCursor = rawQuery("select * from MultiTalkMember where memberUuid = '" + l + "' and wxGroupId = '" + paramb.field_wxGroupId + "'", new String[0]);
    try
    {
      if (localCursor.getCount() == 0)
      {
        bool = b(paramb);
        x.i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "insert ret " + bool + " for memberUuid = " + l);
        return bool;
      }
      boolean bool = c(paramb, new String[0]);
      x.i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "update ret " + bool + " for memberUuid = " + l);
      return bool;
    }
    catch (Exception paramb)
    {
      x.e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", paramb.toString());
      return false;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public final boolean ca(String paramString1, String paramString2)
  {
    x.i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "delete where wxGroupId = " + paramString1 + ",member = " + paramString2);
    try
    {
      super.fV("MultiTalkMember", "delete from MultiTalkMember where wxGroupId = \"" + paramString1 + "\" and userName = \"" + paramString2 + "\"");
      return true;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "delete fail for wxGroupId = " + paramString1 + ",member = " + paramString2);
    }
    return false;
  }
  
  public final b dO(String paramString1, String paramString2)
  {
    paramString1 = rawQuery("select memberUuid, wxGroupId, userName, inviteUserName, memberId, status,createTime  from MultiTalkMember  where wxGroupId = '" + paramString1 + "' and userName ='" + paramString2 + "'", new String[0]);
    if (paramString1 != null) {}
    try
    {
      if (paramString1.moveToNext())
      {
        paramString2 = new b();
        paramString2.field_memberUuid = paramString1.getInt(0);
        paramString2.field_wxGroupId = paramString1.getString(1);
        paramString2.field_userName = paramString1.getString(2);
        paramString2.field_inviteUserName = paramString1.getString(3);
        paramString2.field_memberId = paramString1.getLong(4);
        paramString2.field_status = paramString1.getInt(5);
        paramString2.field_createTime = paramString1.getLong(6);
        x.i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "getMultiTalkMember get value for memberUuid = %s, wxGroupId = %s, userName = %s, inviteUserName = %s, memberId = %d, status = %d,createTime = %d", new Object[] { Long.valueOf(paramString2.field_memberUuid), paramString2.field_wxGroupId, paramString2.field_userName, paramString2.field_inviteUserName, Long.valueOf(paramString2.field_memberId), Integer.valueOf(paramString2.field_status), Long.valueOf(paramString2.field_createTime) });
        return paramString2;
      }
    }
    catch (Exception paramString2)
    {
      for (;;)
      {
        x.e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", paramString2.toString());
        if (paramString1 != null) {
          paramString1.close();
        }
      }
    }
    finally
    {
      if (paramString1 == null) {
        break label271;
      }
      paramString1.close();
    }
    return null;
  }
  
  public final boolean jy(String paramString)
  {
    x.i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "delete where wxGroupId = " + paramString);
    try
    {
      super.fV("MultiTalkMember", "delete from MultiTalkMember where wxGroupId = \"" + paramString + "\"");
      return true;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "delete fail for wxGroupId = " + paramString);
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/multitalk/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */